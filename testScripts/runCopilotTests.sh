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

# Set the path to the JUnit JAR file
junit_path="/Users/emilia/java/junit-4.13.2.jar"
hamcrest_path="/Users/emilia/java/hamcrest-core-1.3.jar"

results=()

for ai in $copilot $chatgpt; do
  aiResults=()
  for algorithm in $bfs $mergesort $quicksort $knapsack $bin2dec $binarysearch; do
    # Find all compiled classes in the app/bin/main and app/bin/test directories
    main_classes=$(find app/bin/main/$ai/$algorithm -name "*.class")
    test_classes=$(find app/bin/test/$ai/$algorithm -name "*Test.class")

    # Initialize the result JSON string
    result_json='{"ChatGPT": {}, "Copilot": {}}'
    algorithmResults=()

    for test_class in $test_classes; do
      # Check if the corresponding source class file exists
      source_class=$(echo $test_class | sed 's/test/main/g; s/Test\.class/.class/g; s/app\/bin\/test/app\/bin\/main/g')

      if [[ -f "$source_class" && -f "$test_class" ]]; then
        # Convert the file paths to fully qualified class names
        test_class_name=$(echo $test_class | sed 's/app\/bin\/test\///g; s/\.class//g; s/\//./g')

        # Run the test if both main and test classes exist
        java -cp .:"$junit_path":"$hamcrest_path":app/bin/main:app/bin/test org.junit.runner.JUnitCore $test_class_name

        # Check if the test passed and add the result to the corresponding associative array
        if [[ $? -eq 0 ]]; then
          algorithmResults+=(0)
        else
          algorithmResults+=(1)
        fi
      fi
    done
    algorithmResults=$(IFS=,; echo "${algorithmResults[*]}")
    aiResults+=("\"$algorithm\": [$algorithmResults]")
  done
  aiResults=$(IFS=,; echo "${aiResults[*]}")
  results+=("{\"$ai\": {$aiResults}}")
done

results=$(IFS=,; echo "$results")
echo "{\"results\": $results}" > copilotResults.json
