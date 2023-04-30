package Copilot.BinaryToDecimal.T27;

public class BinaryToDecimal {
    // Add a private instance variable here
    private String binary;

    // Add a public constructor here
    public BinaryToDecimal(String binary) {
        this.binary = binary;
    }

    // Add a public convertToDecimal method here
    public int convertToDecimal(String binary) {
        int dec = 0;
        int binaryLength = binary.length();
        for (int i = 0; i < binaryLength; i++) {
            if (binary.charAt(i) == '1') {
                dec += Math.pow(2, binaryLength - i - 1);
            }
        }
        return dec;
    }
}
