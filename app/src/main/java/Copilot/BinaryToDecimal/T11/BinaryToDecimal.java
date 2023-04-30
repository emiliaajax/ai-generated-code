package Copilot.BinaryToDecimal.T11;

public class BinaryToDecimal {
    private String binary;
    private int decimal;

    public BinaryToDecimal(String binary) {
        this.binary = binary;
    }

    public int convertToDecimal() {
        // Implement the convertToDecimal method.
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, binary.length() - i - 1);
            }
        }
        return decimal;
    }
}

