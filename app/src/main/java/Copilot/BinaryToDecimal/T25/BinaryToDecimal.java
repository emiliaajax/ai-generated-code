package Copilot.BinaryToDecimal.T25;

public class BinaryToDecimal {
    public int convertToDecimal(String binary) {
        int decimal = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            decimal += (binary.charAt(i) == '1') ? Math.pow(2, binary.length() - 1 - i) : 0;
        }
        return decimal;
    }
}
