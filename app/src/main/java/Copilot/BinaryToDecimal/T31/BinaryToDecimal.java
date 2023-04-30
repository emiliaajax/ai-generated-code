package Copilot.BinaryToDecimal.T31;

public class BinaryToDecimal {
    public int convertToDecimal(String binary) {
        int decimal = 0;
        int binaryLength = binary.length();
        for (int i = 0; i < binaryLength; i++) {
            decimal += Character.getNumericValue(binary.charAt(i)) * Math.pow(2, binaryLength - i - 1);
        }
        return decimal;
    }
}
