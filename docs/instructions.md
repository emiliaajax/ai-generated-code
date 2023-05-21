# Controlled Experiment Instructions

This guide will describe how to generate ChatGPT and Copilot code. It will also describe how to use the scripts that extracts the data needed for the Controlled experiment. The generated data can be used in Matlab or AI-Theraphy Statistics to analyze the results. Data for number of lines, JUnit test results and Checkstyle results will be generated using this guide.

## Prerequisites
1. Install Matlab https://se.mathworks.com/downloads/
2. Install NodeJS (NodeJS 18 LTS version is recommended). https://nodejs.org/en/download/
3. Download JUnit and hamcrest-core jar files. https://github.com/junit-team/junit4/wiki/Download-and-Install
4. Add the path to the JUnit and hamcrest-core jar files on line 5 and 6 in compileCode.sh located in the testScripts folder in the root of the project.
5. Add the path to the JUnit and hamcrest-core jar files on line 16 and 17 in runChatGPTTests.sh located in the testScripts folder in the root of the project.
6. Add the path to the JUnit and hamcrest-core jar files on line 16 and 17 in runCopilotTests.sh located in the testScripts folder in the root of the project.

## Running project preparation scripts

### Generate folders and java files
1. Remove all old Tx folders in main for each algorithm.
2. Remove all old Tx folders except T1 in test for each algorithm.
3. Open ChatGPTFolders.sh and change variable "from" to "2" on line 13 and variable "to" to the number of Tx folders that is needed. 50 folders is recommended
4. Repeat step 3 in CopilotFolders.sh.
5. Open a new terminal window.
6. In the root of the project type "./chatGPTFolders.sh".
7. When the script has finished type "./copilotFolders.sh".
8. Tx folders and java files have now been generated for each algorithm in app/src/main/java/ChatGPT and app/src/main/java/Copilot.

## Generating code

### ChatGPT
1. Go to https://chat.openai.com
2. Log in or sign up to open ChatGPT.
3. If not in a new chat press "New chat" in the top left corner.
4. Add one of the algorithm instructions to the "Send a message" field and press enter. (See chapter "Algorithm instructions" for the provided instructions at the end of this document).
5. Copy the generated code from the chat and paste it in one of the recently generated Tx folders in app/src/main/java/ChatGPT/"algorithm name"/Tx.
6. Repeat steps 3-5 for each generated algorithm.

### Copilot
1. If necessary go to https://copilot.github.com and sign up for GitHub copilot.
2. Go to the extensions tab in VS Code and install the GitHub Copilot extension.
3. Follow the instructions in the bottom right corner of VS Code to sign in to GitHub Copilot.
4. Open command pallet (Ctrl+Shift+P) and type "Java: Create Java Project".
5. Follow the instructions to create a new Java project.
6. Remove App.js in the src folder.
7. Create a new java file in the src folder and name it the same as the algorithm you want to generate code for.
8. Add one of the algorithm instructions to the java file above the class as code comments. (See chapter "Algorithm instructions" for the provided instructions at the end of this document).
9. Press Ctrl+Enter to open the suggestion window.
10. Copy and paste each suggestion into a separate Tx folder in app/src/main/java/Copilot/"algorithm name"/Tx.
11. Close the suggestion window.
12. Repeat steps 9-11 to generate more suggestions.

## Running report scripts

### Counting lines of code
1. Open a new terminal window.
2. Go into the lineCounter folder in the root of the project by typing "cd lineCounter".
3. Type "npm install" to install the dependencies.
4. Type "npm start" to run the script.
5. The data will be written to a file called "AlgorithmsLineCount.json" in the lineCounter folder.

### Running Checkstyle
1. Open a new terminal window.
2. In the root of the project type "./runChecks.sh".
3. Wait until the script has finished (it can take a few minutes).
4. A file called "checkstyleReport.xml" has been updated with the reports data in the reports folder (/standaloneCheckstyle/reports/checkstyleReport.xml).
5. Open the following repository in Matlab: https://github.com/emiliaajax/ai-tools-analysis
6. Add or write over the "checkstyleReport.xml" file in /data/checkstyle.
6. Open the file "convertCheckstyleXMLToJson.m" in the /checkstyle folder.
7. Press the green run button.
8. A JSON checkstyle report has been created in /data/checkstyle. This JSON report is used for the analysis in Matlab.

### Running JUnit tests
1. Open a new terminal window.
2. In the root of the project type "./compileCode.sh".
3. Wait until the script has finished (it can take a few minutes).
2. In the root of the project type "./runTests.sh".
3. Wait until the script has finished (it can take a few minutes).
4. A file called "testResults.json" has been created in the root of the project.

## Algorithm instructions
### Binary Search Algorithm Instructions
// Implement a non-static class named BinarySearch.
<br>// Implement the public binarySearch(int, int[]) method. The method should return a boolean. 

### Breadth First Search (BFS) Algorithm Instructions
// Implement a non-static breadth search first class named Graph(int vertices). 
<br>// Implement the public bfs(int sourceVertex) method. The method should return an integer array of parent nodes for each vertex in the graph. The array of parent node values are all initialized to -1 in the bfs(int sourceVertex) method. 
<br>// Implement the public addEdge(int, int). The method should add an edge between two vertices.

### Merge Sort Algorithm Instructions
// Implement a non-static merge sort algorithm class named MergeSort with a public void mergeSort(int[]) method.

### Quicksort Algorithm Instructions
// Implement a non-static quick sort algorithm class named QuickSort with a public void sort(int[]) method.

### Knapsack Algorithm Instructions
// Implement a non-static 0-1 knapsack class named Knapsack.
<br>// Implement the public int bottomUp(int capacity, int[] weights, int[] values) method. The method should return an int with the maximum value.

### Binary To Decimal Instructions
// Implement a non-static BinaryToDecimal class.
<br>// Implement the public convertToDecimal(String binary) method. The method should return an int with the decimal.
