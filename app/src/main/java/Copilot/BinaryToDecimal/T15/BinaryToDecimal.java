package Copilot.BinaryToDecimal.T15;

public class BinaryToDecimal {
    public int convertToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();
        int power = 0;
        for (int i = length - 1; i >= 0; i--) {
            decimal += (binary.charAt(i) - '0') * Math.pow(2, power);
            power++;
        }
        return decimal;
    }
}

