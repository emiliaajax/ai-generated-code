package Copilot.BinaryToDecimal.T49;

public class BinaryToDecimal {
  public int convertToDecimal(String binary) {
    char[] binaryChars = binary.toCharArray();
    int decimal = 0;
    int power = 0;
    for (int i = binaryChars.length - 1; i >= 0; i--) {
      decimal += Character.getNumericValue(binaryChars[i]) * Math.pow(2, power);
      power++;
    }
    return decimal;
  }
}
