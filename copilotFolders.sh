#!/bin/bash

#Supported algorithms
bfs="BreadthFirstSearch"
mergesort="MergeSort"
quicksort="QuickSort"
knapsack="Knapsack"
bin2dec="BinaryToDecimal"
binarysearch="BinarySearch"

# VARIABLES TO BE MODIFIED
algorithm="ALGORITHM"
from=21
to=50

# AI tool. OBS! DO NOT CHANGE!
ai="Copilot"

# Check if algorithm is supported
case $algorithm in
  $bfs|$mergesort|$quicksort|$knapsack|$bin2dec|$binarysearch)
    echo "The algorithm $algorithm is supported."
    ;;
  *)
    echo "The algorithm $algorithm is not supported. Exiting."
    exit 1
    ;;
esac

# Go to algorithm folder in main
cd app/src/main/java/$ai/$algorithm/

# Create folders and class file
for i in $(seq $from $to)
do
  if [ ! -d "T$i" ]; then
    mkdir "T$i"
    echo "Created directory T$i"
    cd T$i
    if [ "$algorithm" = "BreadthFirstSearch" ]; then
      cat <<EOF > Graph.java
package $ai.$algorithm.T$i;

public class Graph {

}
EOF
    else
      cat <<EOF > $algorithm.java
package $ai.$algorithm.T$i;

public class $algorithm {

}
EOF
    fi
    cd ..
  else
    echo "Directory T$i already exists"
  fi
done

# Go in to algorithm folder in test
cd ../../../../test/java/$ai/$algorithm/

# Create folders, copy test file from T1 and change package to the correct one
for i in $(seq $from $to)
do
  if [ ! -d "T$i" ]; then
    mkdir "T$i"
    echo "Created directory T$i"
    cp -R T1/* T$i/
    echo "Copied file in T1 to directory T$i"
    sed -i "" "s/package $ai.$algorithm.T1;/package $ai.$algorithm.T$i;/" "T$i"/*.java
  else
    echo "Directory T$i already exists"
  fi
done
