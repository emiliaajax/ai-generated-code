package Copilot.BinaryToDecimal.T9;

public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println(BinaryToDecimal.convertToDecimal("11001001"));
    }

    public static int convertToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += (int) Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }
}

