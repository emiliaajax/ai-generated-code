const fs = require('fs');
const util = require('util');
const path = require('path');

const readdir = util.promisify(fs.readdir);

function countLines(filename) {
  const content = fs.readFileSync(filename, 'utf-8');
  const lines = content.split('\n');
  let count = 0;
  let inMultilineComment = false;

  for (const line of lines) {
    const trimmed = line.trim();
    if (!trimmed) {
      continue; // Skip empty lines
    }

    if (inMultilineComment) {
      // Check if we've reached the end of the comment
      if (trimmed.endsWith('*/')) {
        inMultilineComment = false;
      }
      continue; // Skip comment lines
    }

    if (trimmed.startsWith('//')) {
      continue; // Skip single-line comments
    }

    if (trimmed.startsWith('/*')) {
      inMultilineComment = true; // Start of multi-line comment
      continue; // Skip comment lines
    }

    count++;
  }

  return count;
}

async function countLinesInDirectory(directoryPath) {
  const results = {};

  const algorithms = await readdir(directoryPath);
  for (let i = 0; i < algorithms.length; i++) {
    const algorithmPath = path.join(directoryPath, algorithms[i]);
    const algorithmVersions = await readdir(algorithmPath);

    results[algorithms[i]] = [];

    for (let j = 0; j < algorithmVersions.length; j++) {
      const versionPath = path.join(algorithmPath, algorithmVersions[j]);
      const javaFiles = await readdir(versionPath);

      const javaFilePath = path.join(versionPath, javaFiles[0]);
      const javaFileLines = countLines(javaFilePath);

      results[algorithms[i]].push(javaFileLines);
    }
  }

  return results;
}

async function run() {
  try {
    const chatGPTPath = path.join(__dirname, '../../app/src/main/java/ChatGPT');
    const chatGPTResults = await countLinesInDirectory(chatGPTPath);

    const copilotPath = path.join(__dirname, '../../app/src/main/java/Copilot');
    const copilotResults = await countLinesInDirectory(copilotPath);

    const results = {
      chatGPT: chatGPTResults,
      copilot: copilotResults,
    };

    const json = JSON.stringify(results, null, 2);
    fs.writeFileSync('AlgorithmsLineCount.json', json, 'utf8');

    console.log('Line count done!');
  } catch (error) {
    console.log(error);
  }
}
run();