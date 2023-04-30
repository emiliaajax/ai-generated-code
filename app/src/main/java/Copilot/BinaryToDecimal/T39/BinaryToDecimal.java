package Copilot.BinaryToDecimal.T39;

public class BinaryToDecimal {
    public int convertToDecimal(String binary) {
        int decimal = 0;
        int binaryLength = binary.length();
        for (int i = 0; i < binaryLength; i++) {
            char currentChar = binary.charAt(i);
            if (currentChar == '1') {
                decimal += Math.pow(2, binaryLength - i - 1);
            } else if (currentChar != '0') {
                throw new IllegalArgumentException("The input string is not a binary number");
            }
        }
        return decimal;
    }
}
