package Copilot.BinaryToDecimal.T42;

public class BinaryToDecimal {
  public static void main(String[] args) {
    System.out.println(convertToDecimal("101"));
  }

  private static int convertToDecimal(String binary) {
    return Integer.parseInt(binary, 2);
  }
}
