package ChatGPT.BinaryToDecimal.T26;

public class BinaryToDecimal {
  public int convertToDecimal(String binary) {
      int decimal = 0;
      int base = 1;
      int binaryLength = binary.length();
      for (int i = binaryLength - 1; i >= 0; i--) {
          if (binary.charAt(i) == '1') {
              decimal += base;
          }
          base *= 2;
      }
      return decimal;
  }
}
