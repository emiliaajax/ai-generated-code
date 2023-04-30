package ChatGPT.BinaryToDecimal.T6;

public class BinaryToDecimal {
  public int convertToDecimal(String binary) {
      int decimal = 0;
      int base = 1;
      int len = binary.length();
      for (int i = len - 1; i >= 0; i--) {
          if (binary.charAt(i) == '1')
              decimal += base;
          base *= 2;
      }
      return decimal;
  }
}

