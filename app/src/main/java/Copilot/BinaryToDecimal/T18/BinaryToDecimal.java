package Copilot.BinaryToDecimal.T18;

public class BinaryToDecimal {
  private String binary;

  public BinaryToDecimal(String binary) {
    this.binary = binary;
  }

  public int convertToDecimal() {
    int decimal = 0;
    int pow = 0;
    for (int i = binary.length() - 1; i >= 0; i--) {
      decimal += (binary.charAt(i) - '0') * Math.pow(2, pow);
      pow++;
    }
    return decimal;
  }
}

