import { readFile, writeFile } from 'fs/promises';

async function combineXmlFile(inputFile, outputFile) {
  const xmlContent = await readFile(inputFile, 'utf-8');
  const xmlList = xmlContent.split(/<\?xml.*?\?>\s*/); // split on <?xml...?>
  const fileTags = xmlList.filter(Boolean).map((xml) => xml.match(/<file.*<\/file>/s)[0]);

  // combine file tags into a single string with newlines
  const combinedFiles = fileTags.join('\n');

  const combinedXml = `<?xml version="1.0" encoding="UTF-8"?>
<checkstyle version="10.9.2">
${combinedFiles}
</checkstyle>`;

  await writeFile(outputFile, combinedXml);
}

const inputFile = '../../reports/CheckstyleReport.xml';
const outputFile = '../../reports/FixedCheckstyleReport.xml';

combineXmlFile(inputFile, outputFile)
  .then(() => console.log('Combined XML files written successfully'))
  .catch((error) => console.error(error));