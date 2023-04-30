package Copilot.BinaryToDecimal.T16;

public class BinaryToDecimal {
    public int convertToDecimal(String binary) {
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            int digit = binary.charAt(i) - '0';
            int power = binary.length() - i - 1;
            decimal += digit * Math.pow(2, power);
        }
        return decimal;
    }
}

