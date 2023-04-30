package ChatGPT.BinaryToDecimal.T1;

public class BinaryToDecimal {
  public int convertToDecimal(String binary) {
      int decimal = 0;
      for (int i = binary.length() - 1, j = 0; i >= 0; i--, j++) {
          int bit = Character.getNumericValue(binary.charAt(i));
          decimal += bit * Math.pow(2, j);
      }
      return decimal;
  }
}

