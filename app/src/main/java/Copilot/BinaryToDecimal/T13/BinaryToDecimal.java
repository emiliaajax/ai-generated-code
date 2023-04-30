package Copilot.BinaryToDecimal.T13;

public class BinaryToDecimal {
  public int convertToDecimal(String binary) {
    int result = 0;
    int len = binary.length();
    for (int i = 0; i < len; i++) {
      if (binary.charAt(i) == '1') {
        result += Math.pow(2, len - i - 1);
      }
    }
    return result;
  }
}

