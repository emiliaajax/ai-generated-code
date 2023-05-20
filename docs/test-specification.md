# Test specification

## What is tested and how?
The testing is done on the scripts used to run the unit tests and code quality checks to ensure correct outcome. The testing is done with manual test cases.

## Test matrix

| Test | Status |
|------|-----|
| TC1.1 | 1/:white_check_mark: |
| TC1.2 | 1/:white_check_mark: |
| TC2.1 | 1/:white_check_mark: |
| TC2.2 | 1/:white_check_mark: |
| COVERAGE & SUCCESS | 4/:white_check_mark: |

## Test cases

#### **TC1.1 Compile the generated code**

###### **Input**
- Go to the root of the project in the terminal.
- Remove the ChatGPT and Copilot folders if present in ./app/bin/main/ and ./app/bin/test/
- Run ./compileCode.sh in the terminal

###### **Output**
- Observe that ChatGPT and Copilot folders are created in ./app/bin/main/ and ./app/bin/test
- Observe that ChatGPT and Copilot folders in both ./app/bin/main/ and ./app/bin/test have created 6 subfolders: BinarySearch, BinaryToDecimal, BreadthFirstSearch, Knapsack, MergeSort and Quicksort.

#### **TC1.2 Control the compiled code**

###### **Input**
- Go to ./app/bin/test/ChatGPT/Knapsack and observe that folder T30 is missing
- Go to ./app/src/test/ChatGPT/Knapsack/T30/
- Run the unit tests in the test file KnapsackTest.java

###### **Output**
- Observe that the build fails.

#### **TC2.1 Run the unit tests on the compiled code**

###### **Input**
- Delete testResults.json in the root of the project.
- Go to ./mergeTestResults/results/
- Delete chatGPTErrors.json, chatGPTResults.json, copilotErrors.json and copilotResults.json if present
- Go back to root of project.
- Run ./runTests in the terminal.

###### **Output**
- When the testing is done, observe that testResults.json has been created in the root of the project.
- When the testing is done, observe that chatGPTErrors.json, chatGPTResults.json, copilotErrors.json and copilotResults.json has been created in the folder ./mergeTestResults/results/ 

#### **TC2.1 Control the output from the unit tests for ChatGPT**

###### **Input**
- Open testResults.json
- Count the number of 1s in BreadthFirstSearch for ChatGPT
- Go to ./app/src/test/ChatGPT/BreadthFirstSearch
- Run all the unit tests for the test class located in the Tx folders (if message about build error occurs, press continue)
- Count the number of failed algorithms
- Compare the number from the testResults file and the number from the manual execution of the tests

###### **Output**
- The number from the testResults file and the number from the manual execution of the tests should be the same.

#### **TC2.2 Control the output from the tests for Copilot**

###### **Input**
- Open testResults.json
- Count the number of 1s in BinarySearch for Copilot
- Go to ./app/src/test/Copilot/BinarySearch
- Run all the unit tests for the test class located in the Tx folders (if message about build error occurs, press continue)
- Count the number of failed algorithms
- Compare the number from the testResults file and the number from the manual execution of the tests

###### **Output**
- The number from the testResults file and the number from the manual execution of the tests should be the same.


