package Copilot.BinaryToDecimal.T38;

public class BinaryToDecimal {
    // Implement the convertToDecimal method
    public int convertToDecimal(String binary) {
        // Convert the binary string to a char array
        char[] binaryArray = binary.toCharArray();
        // Loop through the binary array
        int decimal = 0;
        for (int i = binaryArray.length - 1; i >= 0; i--) {
            // Check if the char is a 1
            if (binaryArray[i] == '1') {
                // Add the decimal value to the total
                decimal += Math.pow(2, binaryArray.length - i - 1);
            }
        }
        // Return the decimal
        return decimal;
    }
}
