package Copilot.BinaryToDecimal.T5;

public class BinaryToDecimal {
  public int convertToDecimal(String binary) {
    int decimal = 0;
    int power = 0;
    for (int i = binary.length() - 1; i >= 0; i--) {
      decimal += Integer.parseInt(binary.substring(i, i + 1)) * Math.pow(2, power);
      power++;
    }
    return decimal;
  }
}

