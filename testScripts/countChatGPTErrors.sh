#!/bin/bash

#Supported algorithms
bfs="BreadthFirstSearch"
mergesort="MergeSort"
quicksort="QuickSort"
knapsack="Knapsack"
bin2dec="BinaryToDecimal"
binarysearch="BinarySearch"

#AI tools
chatgpt="ChatGPT"
copilot="Copilot"

results=()
aiResults=()

for ai in $chatgpt; do
  algorithmResults=()
  for algorithm in $bfs $mergesort $quicksort $knapsack $bin2dec $binarysearch; do
    tests=$(find app/src/test/java/$ai/$algorithm/* -maxdepth 0 -type d -not -path '*/\.*' | wc -l)
    compiledTests=$(find app/bin/test/$ai/$algorithm/* -maxdepth 0 -type d -not -path '*/\.*' | wc -l)
    
    testErrors=($((tests - compiledTests)))

    algorithmResults+=("\"$algorithm\": $testErrors")
  done
  algorithmResults=$(IFS=,; echo "${algorithmResults[*]}")
  aiResults+=("{\"$ai\": {$algorithmResults}}")
done

results=$(IFS=,; echo "$aiResults")

echo $aiResults > chatGPTErrors.json
