package Copilot.BinaryToDecimal.T40;

public class BinaryToDecimal {
  private String binary;
  private int decimal;

  public BinaryToDecimal(String binary) {
    this.binary = binary;
    this.decimal = 0;
  }

  public int convertToDecimal() {
    int power = 0;
    for (int i = this.binary.length() - 1; i >= 0; i--) {
      if (this.binary.charAt(i) == '1') {
        this.decimal += Math.pow(2, power);
      }
      power++;
    }
    return this.decimal;
  }
}
