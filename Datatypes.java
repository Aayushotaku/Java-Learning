import java.util.Arrays;// Package

public class Datatypes {
        public static void main(String[] args) {
        // Variables: Variables are like containers where values can be stored.
        // Datatypes: The type of data that variables can hold.
        // Java is a statically typed language, which means every variable must have a specific datatype before use.
        
        // Types of data types:
        // 1. Primitive data types: It specifies the type and kind of value it can hold.
        // The different types of primitive datatypes are:

        // 1. Byte: (Size is 1 byte; range is -128 to 127)
        byte byteExample = 110;
        System.out.println("Byte Example: " + byteExample);

        // 2. Short: (Size is 2 bytes; range is -32768 to 32767)
        short shortExample = 32767;
        System.out.println("Short Example: " + shortExample);

        // 3. Int: (Size is 4 bytes; range is -2^31 to 2^31-1)
        int intExample = 89392455;
        System.out.println("Int Example: " + intExample);

        // 4. Long: (Size is 8 bytes)
        long longExample = 123456789L;
        System.out.println("Long Example: " + longExample);

        // 5. Float: (Stores values for decimal points. Sufficient for storing 6 to 7 decimals)
        float floatExample = 12.9898f;
        System.out.println("Float Example: " + floatExample);

        // 6. Double: (Stores values for decimal points. Sufficient for storing up to 15 to 16 decimals)
        double doubleExample = 15.333456d;
        System.out.println("Double Example: " + doubleExample);

        // 7. Boolean: (Stores boolean values, either true or false)
        boolean booleanExample = true;
        System.out.println("Boolean Example: " + booleanExample);

        // 8. Char: (Stores a single character or ASCII value)
        char charExample = 'a';
        System.out.println("Char Example: " + charExample);


        //Non-Primitive data type: This datatypes refers to objects or array
        // 1. String:-Sequences of characters
        String collegeName = "Nepathya college";
        System.out.println(collegeName);
        //2.Array: Collection of elements with same data types
        int[] arrayOfNumbers= {1,3,4,5};
        System.out.println(Arrays.toString(arrayOfNumbers));
     //class: Instance of an object
     //4. Enom: Constant values in object eg: Male,Female
    }
}