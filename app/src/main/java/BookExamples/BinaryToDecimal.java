package BookExamples;

// Source: https://github.com/TrainingByPackt/Data-Structures-and-Algorithms-in-Java/blob/master/src/main/java/com/packt/datastructuresandalg/lesson1/binarytodecimal/BinaryToDecimal.java
public class BinaryToDecimal {
  public int convertToDecimal(String binary) {
    int conversion = 1;
    int result = 0;
    for (int i = 1; i <= binary.length(); i++) {
      if (binary.charAt(binary.length() - i) == '1')
        result += conversion;
      conversion *= 2;
    }
    return result;
  }
}
