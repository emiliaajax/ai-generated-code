package ChatGPT.BinaryToDecimal.T24;

public class BinaryToDecimal {

  public int convertToDecimal(String binary) {
      int decimal = 0;
      int power = 0;
      for (int i = binary.length() - 1; i >= 0; i--) {
          int digit = Character.getNumericValue(binary.charAt(i));
          decimal += digit * Math.pow(2, power);
          power++;
      }
      return decimal;
  }
}
