package Copilot.BinaryToDecimal.T6;

public class BinaryToDecimal {
    public int convertToDecimal(String binary) {
        int decimal = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, binary.length() - 1 - i);
            }
        }
        return decimal;
    }
}

