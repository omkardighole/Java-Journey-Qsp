package Wrapper;

public class Wrapper_Static_Final_Variables {

    public static void main(String[] args) {

        // 🔹 byte: 8-bit signed integer
        System.out.println("🔹 byte");
        System.out.println("  Min: " + Byte.MIN_VALUE);     // -128
        System.out.println("  Max: " + Byte.MAX_VALUE + "\n"); // 127

        // 🔹 short: 16-bit signed integer
        System.out.println("🔹 short");
        System.out.println("  Min: " + Short.MIN_VALUE);    // -32,768
        System.out.println("  Max: " + Short.MAX_VALUE + "\n"); // 32,767

        // 🔹 int: 32-bit signed integer
        System.out.println("🔹 int");
        System.out.println("  Min: " + Integer.MIN_VALUE);  // -2,147,483,648
        System.out.println("  Max: " + Integer.MAX_VALUE + "\n"); // 2,147,483,647

        // 🔹 long: 64-bit signed integer
        System.out.println("🔹 long");
        System.out.println("  Min: " + Long.MIN_VALUE);     // -9,223,372,036,854,775,808
        System.out.println("  Max: " + Long.MAX_VALUE + "\n"); // 9,223,372,036,854,775,807

        // 🔹 float: 32-bit IEEE 754 floating-point
        System.out.println("🔹 float");
        System.out.println("  Min: " + Float.MIN_VALUE);     // ≈ 1.4E-45 (smallest POSITIVE non-zero)
        System.out.println("  Max: " + Float.MAX_VALUE);     // ≈ 3.4028235E38
        System.out.println("  Min Normal: " + Float.MIN_NORMAL + "\n"); // ≈ 1.17549435E-38

        // 🔹 double: 64-bit IEEE 754 floating-point
        System.out.println("🔹 double");
        System.out.println("  Min: " + Double.MIN_VALUE);    // ≈ 4.9E-324 (smallest POSITIVE non-zero)
        System.out.println("  Max: " + Double.MAX_VALUE);    // ≈ 1.7976931348623157E308
        System.out.println("  Min Normal: " + Double.MIN_NORMAL + "\n"); // ≈ 2.2250738585072014E-308

        // 🔹 char: 16-bit unsigned Unicode character
        System.out.println("🔹 char");
        System.out.println("  Min: " + (int) Character.MIN_VALUE); // 0 (Unicode: \u0000)
        System.out.println("  Max: " + (int) Character.MAX_VALUE + "\n"); // 65535 (Unicode: \uFFFF)

        // 🔹 boolean: Only two possible values
        System.out.println("🔹 boolean");
        System.out.println("  Values: " + Boolean.FALSE + ", " + Boolean.TRUE); // false, true
    }
}
