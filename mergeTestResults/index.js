import { readFile, writeFile } from 'fs/promises';

async function readMyFile() {
  try {
    const chatGPTErrors = JSON.parse(await readFile('results/chatGPTErrors.json'))
    const copilotErrors = JSON.parse(await readFile('results/copilotErrors.json'))
    const chatGPTResults = JSON.parse(await readFile('results/chatGPTResults.json'))
    const copilotResults = JSON.parse(await readFile('results/copilotResults.json'))

    const totalResults = {
      ChatGPT: chatGPTResults.results.ChatGPT,
      Copilot: copilotResults.results.Copilot
    }

    const chatGPTErrorsWithArrays = convertToArrayRepresentation(chatGPTErrors.ChatGPT)

    const copilotErrorsWithArrays = convertToArrayRepresentation(copilotErrors.Copilot)

    const totalChatGPT = merge(totalResults.ChatGPT, chatGPTErrorsWithArrays)

    const totalCopilot = merge(totalResults.Copilot, copilotErrorsWithArrays)
    
    const total = {
      ChatGPT: totalChatGPT,
      Copilot: totalCopilot
    }

    const json = JSON.stringify(total)

    await writeFile('testResults.json', json, (err) => {
      if (err) {
        console.error('Error writing JSON to file:', err)
      } else {
        console.log('JSON written to file successfully')
      }
    })

  } catch (err) {
    console.error(err);
  }
}

function merge(results, errors) {
  const total = {}
  for (const firstKey of Object.keys(results)) {
    for (const secondKey of Object.keys(errors)) {
      if (firstKey === secondKey) {
        const key = firstKey

        total[key] = results[key].concat(errors[key]).flat()
      }
    }
  }
  return total
}

function convertToArrayRepresentation(errors) {
  const chatGPTErrorsObject = {}

  for (const key of Object.keys(errors)) {
    const algorithmErrors = errors[key]
    const chatGPTErrorsArray = []
    for (let i = 0; i < algorithmErrors ; i++) {
      chatGPTErrorsArray.push(1)
    }
    chatGPTErrorsObject[key] = chatGPTErrorsArray
  }

  return chatGPTErrorsObject
}

readMyFile()
