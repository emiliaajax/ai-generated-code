package Copilot.BinaryToDecimal.T47;

public class BinaryToDecimal {
  // Implement the public convertToDecimal(String binary) method. The method
  // should return an int with the decimal.
  public int convertToDecimal(String binary) {
    int decimal = 0;
    int power = 0;
    for (int i = binary.length() - 1; i >= 0; i--) {
      int bit = Character.getNumericValue(binary.charAt(i));
      decimal += bit * Math.pow(2, power);
      power++;
    }
    return decimal;
  }
}
