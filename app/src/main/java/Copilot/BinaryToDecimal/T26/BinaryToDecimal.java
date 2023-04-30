package Copilot.BinaryToDecimal.T26;

public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println(convertToDecimal("1010"));
    }

    public static int convertToDecimal(String binary) {
        int result = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                result += Math.pow(2, binary.length() - i - 1);
            }
        }
        return result;
    }
}
