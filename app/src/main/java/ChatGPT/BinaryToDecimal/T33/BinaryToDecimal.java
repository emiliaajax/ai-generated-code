package ChatGPT.BinaryToDecimal.T33;

public class BinaryToDecimal {

  public int convertToDecimal(String binary) {
      int decimal = 0;
      for (int i = 0; i < binary.length(); i++) {
          char c = binary.charAt(i);
          if (c != '0' && c != '1') {
              throw new IllegalArgumentException("Invalid binary string");
          }
          int bit = c - '0';
          decimal = decimal * 2 + bit;
      }
      return decimal;
  }
}
