package Copilot.BinaryToDecimal.T33;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "1000";
        int decimal = convertToDecimal(binary);
        System.out.println("The decimal is: " + decimal);
    }

    public static int convertToDecimal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return decimal;
    }
}
