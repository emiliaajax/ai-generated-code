package Copilot.BinaryToDecimal.T12;

public class BinaryToDecimal {
  public int convertToDecimal(String binary) {
    int decimal = 0;
    for (int i = 0; i < binary.length(); i++) {
      char c = binary.charAt(i);
      if (c == '1') {
        decimal += Math.pow(2, binary.length() - i - 1);
      }
    }
    return decimal;
  }
}
