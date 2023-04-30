package Copilot.BinaryToDecimal.T41;

public class BinaryToDecimal {
    public int convertToDecimal(String binary) {
        int decimal = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int currentDigit = Integer.parseInt(binary.substring(i, i + 1));
            decimal += currentDigit * Math.pow(2, binary.length() - 1 - i);
        }
        return decimal;
    }
}
