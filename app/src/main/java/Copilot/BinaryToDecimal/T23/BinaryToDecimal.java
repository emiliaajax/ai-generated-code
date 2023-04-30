package Copilot.BinaryToDecimal.T23;

public class BinaryToDecimal {
    private String binary;

    public BinaryToDecimal(String binary) {
        this.binary = binary;
    }

    public int convertToDecimal() {
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            char c = binary.charAt(i);
            if (c == '1') {
                decimal += Math.pow(2, binary.length() - 1 - i);
            }
        }
        return decimal;
    }  
}
