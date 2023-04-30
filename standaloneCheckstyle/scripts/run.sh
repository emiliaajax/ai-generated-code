#!/bin/bash

# Remove old checkstyle report
rm ./../standaloneCheckstyle/reports/CheckstyleReport.xml

# Go to java project's root directory
cd ./../app/src/main/java

# Go to Copilot's root directory
cd Copilot

# Loop through each folder in Copilot and do an "ls" command
for folder in */; do
  echo "Contents of folder $folder:"
  cd "$folder"
  # ls
  
  # Loop through each folder inside the current folder and do an "ls" command
  for subfolder in */; do
    echo "  Contents of subfolder $subfolder:"
    cd "$subfolder"
    # ls
    javac *.java > /dev/null 2>&1 # Should only be one file in each subfolder 
    if [[ $(find . -name "*.class") ]]; then
      echo "    Found at least one .class file in $subfolder"
      rm *.class

      # Run Checkstyle on the .java file in the subfolder
      # Checkstyle will be appended to existing CheckstyleReport.xml file. ChatGPT and Copilot are separated into their own reports in standaloneCheckstyle/reports
      java -jar ../../../../../../../standaloneCheckstyle/lib/checkstyle-10.9.2-all.jar -c ../../../../../../../standaloneCheckstyle/config/checkstyle.xml -f xml "./*.java" >> ../../../../../../../standaloneCheckstyle/reports/CheckstyleReport.xml

    else
      echo "    No .class files found in $subfolder"
    fi
    cd ..
  done
  cd ..
done

cd ..
cd ChatGPT

# Loop through each folder in ChatGPT and do an "ls" command
for folder in */; do
  echo "Contents of folder $folder:"
  cd "$folder"
  # ls
  
  # Loop through each folder inside the current folder and do an "ls" command
  for subfolder in */; do
    echo "  Contents of subfolder $subfolder:"
    cd "$subfolder"
    # ls
    javac *.java > /dev/null 2>&1 # Should only be one file in each subfolder 
    if [[ $(find . -name "*.class") ]]; then
      echo "    Found at least one .class file in $subfolder"
      rm *.class

      # Run Checkstyle on the .java file in the subfolder
      # Checkstyle will be appended to existing CheckstyleReport.xml file. ChatGPT and Copilot are separated into their own reports in standaloneCheckstyle/reports
      java -jar ../../../../../../../standaloneCheckstyle/lib/checkstyle-10.9.2-all.jar -c ../../../../../../../standaloneCheckstyle/config/checkstyle.xml -f xml "./*.java" >> ../../../../../../../standaloneCheckstyle/reports/CheckstyleReport.xml

    else
      echo "    No .class files found in $subfolder"
    fi
    cd ..
  done
  cd ..
done

# Go to the FixCheckstyleReport directory
cd ../../../../../standaloneCheckstyle/scripts/FixCheckstyleReport

# Remove old fixed checkstyle report
rm ../../reports/FixedCheckstyleReport.xml

# Run Node.js script to fix the Checkstyle report
npm install
npm start

# Remove old checkstyle report
rm ../../reports/CheckstyleReport.xml

# Rename fixed checkstyle report to checkstyle report
mv ../../reports/FixedCheckstyleReport.xml ../../reports/CheckstyleReport.xml