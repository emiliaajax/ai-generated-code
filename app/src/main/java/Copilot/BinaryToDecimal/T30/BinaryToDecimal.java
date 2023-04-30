package Copilot.BinaryToDecimal.T30;

public class BinaryToDecimal {
    // Implement the convertToDecimal method.
    // The method should return an int with the decimal.
    public int convertToDecimal(String binary) {
        // Implement your code here.
        int result = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                result += Math.pow(2, power);
            }
            power++;
        }
        return result;
    }
}
