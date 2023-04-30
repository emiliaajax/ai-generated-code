package Copilot.BinaryToDecimal.T36;

public class BinaryToDecimal {
    public int convertToDecimal(String binary) {
        int decimal = 0;
        int binaryLength = binary.length();
        for (int i = 0; i < binaryLength; i++) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, binaryLength - i - 1);
            }
        }
        return decimal;
    }
}
