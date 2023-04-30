package Copilot.BinaryToDecimal.T37;

public class BinaryToDecimal {
    public int convertToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            char c = binary.charAt(i);
            if (c == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }
}