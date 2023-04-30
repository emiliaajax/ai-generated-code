package Copilot.BinaryToDecimal.T14;

public class BinaryToDecimal {
    public int convertToDecimal(String binary) {
        int decimal = 0;
        int n = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, n);
            }
            n++;
        }
        return decimal;
    }
}

