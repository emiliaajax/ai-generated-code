package Copilot.BinaryToDecimal.T10;

public class BinaryToDecimal {
    // Implement the convertToDecimal method here.
    // The method should return an int with the decimal.
    public int convertToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }
}

