package Copilot.BinaryToDecimal.T19;

public class BinaryToDecimal {
    public int convertToDecimal(String binary) {
        int decimal = 0;
        int binaryLength = binary.length() - 1;
        for (int i = 0; i < binary.length(); i++) {
            int charAt = Integer.parseInt(String.valueOf(binary.charAt(i)));
            decimal += Math.pow(2, binaryLength) * charAt;
            binaryLength--;
        }
        return decimal;
    }
}

