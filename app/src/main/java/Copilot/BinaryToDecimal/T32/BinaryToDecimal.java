package Copilot.BinaryToDecimal.T32;

public class BinaryToDecimal {
    public int convertToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();
        for (int i = 0; i < length; i++) {
            decimal += Integer.parseInt(String.valueOf(binary.charAt(i))) * Math.pow(2, length - i - 1);
        }
        return decimal;
    }
}
