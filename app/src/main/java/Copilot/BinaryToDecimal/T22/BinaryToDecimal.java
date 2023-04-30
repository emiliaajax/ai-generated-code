package Copilot.BinaryToDecimal.T22;

public class BinaryToDecimal {
    public int convertToDecimal(String binary) {
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            int digit = Character.getNumericValue(binary.charAt(i));
            decimal += (digit * Math.pow(2, binary.length() - i - 1));
        }
        return decimal;
    }
}
