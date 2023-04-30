#!/bin/bash

# Remove old results
rm mergeTestResults/results/chatGPTErrors.json
rm mergeTestResults/results/copilotErrors.json
rm mergeTestResults/results/chatGPTResults.json
rm mergeTestResults/results/copilotResults.json
rm testResults.json

# Run test scripts and move to results folder for merging
./testScripts/runChatGPTTests.sh
mv chatGPTResults.json mergeTestResults/results/

./testScripts/runCopilotTests.sh
mv copilotResults.json mergeTestResults/results/

./testScripts/countChatGPTErrors.sh
mv chatGPTErrors.json mergeTestResults/results/

./testScripts/countCopilotErrors.sh
mv copilotErrors.json mergeTestResults/results/

# Merge results to one JSON file
cd mergeTestResults

npm start

# Move results to root
mv testResults.json ..
