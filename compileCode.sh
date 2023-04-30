#!/bin/bash

# Set the path to the JUnit JAR file
# Download the jar files from here: https://github.com/junit-team/junit4/wiki/Download-and-Install
junit_path="/Users/emilia/java/junit-4.13.2.jar"
hamcrest_path="/Users/emilia/java/hamcrest-core-1.3.jar"

# Find all Java files in the project directory and its subdirectories
java_files=$(find app/src/main/java/ChatGPT app/src/main/java/Copilot -name "*.java")
test_files=$(find app/src/test/java/ChatGPT app/src/test/java/Copilot -name "*Test.java")

# Create the bin directory if it doesn't exist
mkdir -p app/bin/main
mkdir -p app/bin/test

for file in $java_files; do
  # Get the name of the file without the extension
  filename=$(basename "$file" .java)

  # Compile the file and move the class file to the bin directory if successful
  if javac -cp .:"$junit_path":"$hamcrest_path" -d app/bin/main "$file"; then
    echo "Compiled $file"
  else
    echo "Failed to compile $file"
  fi
done

for file in $test_files; do
  # Get the name of the file without the extension
  filename=$(basename "$file" .java)

  # Compile the file and move the class file to the bin directory if successful
  if javac -cp .:"$junit_path":"$hamcrest_path":app/bin/main -d app/bin/test "$file"; then
    echo "Compiled $file"
  else
    echo "Failed to compile $file"
  fi
done
