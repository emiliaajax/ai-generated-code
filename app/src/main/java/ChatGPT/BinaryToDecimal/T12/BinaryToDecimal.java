package ChatGPT.BinaryToDecimal.T12;

public class BinaryToDecimal {

  public int convertToDecimal(String binary) {
      int decimal = 0;
      int power = 0;
      for (int i = binary.length() - 1; i >= 0; i--) {
          int bit = binary.charAt(i) - '0';
          decimal += bit * Math.pow(2, power);
          power++;
      }
      return decimal;
  }

}
