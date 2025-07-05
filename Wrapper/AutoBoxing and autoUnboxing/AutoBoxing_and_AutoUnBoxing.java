package Wrapper;
public class AutoBoxing_and_AutoUnBoxing{

    public static void main(String[] args) {
        
        // byte
        Byte byteObj = 10;            // Autoboxing
        byte bytePrim = byteObj;      // Auto-unboxing

        // short
        Short shortObj = 20;
        short shortPrim = shortObj;

        // int
        Integer intObj = 30;
        int intPrim = intObj;

        // long
        Long longObj = 40L;
        long longPrim = longObj;

        // float
        Float floatObj = 50.5f;
        float floatPrim = floatObj;

        // double
        Double doubleObj = 60.6;
        double doublePrim = doubleObj;

        // char
        Character charObj = 'A';
        char charPrim = charObj;

        // boolean
        Boolean boolObj = true;
        boolean boolPrim = boolObj;

        // Print all
        System.out.println("byte: " + bytePrim);
        System.out.println("short: " + shortPrim);
        System.out.println("int: " + intPrim);
        System.out.println("long: " + longPrim);
        System.out.println("float: " + floatPrim);
        System.out.println("double: " + doublePrim);
        System.out.println("char: " + charPrim);
        System.out.println("boolean: " + boolPrim);
    }
}
