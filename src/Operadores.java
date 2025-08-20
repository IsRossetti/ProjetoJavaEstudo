public class Operadores {
    public static void main(String[] args){

        //arithmetic operators
        int a = 10;
        int b = 3;

        System.out.println(a + b);
        //addition

        System.out.println(a - b);
        //subtraction

        System.out.println(a * b);
        //multiplication

        System.out.println(a / b);
        //integer division

        System.out.println(a % b);
        //modulus (remainder)

        //relational operators
        System.out.println(a == b);
        //equal to

        System.out.println(a != b);
        //not equal to

        System.out.println(a > b);
        //greater than

        System.out.println(a < b);
        //less than

        System.out.println(a >= b);
        //greater or equal

        System.out.println(a <= b);
        //less or equal

        //logical ops
        boolean x = true;

        //assignment ops
        int number = 5;
        number += 3;
        //same as number = number + 3

        System.out.println("number += 3 -> " + number);

        number *= 2; // number = number * 2
        System.out.println("number *= 2 -> " + number);

        //Unary operators
        int c = 5;

        System.out.println("c = " + c);
        System.out.println("c++ = " + (c++));
        //post-increment (prints then adds)

        System.out.println("Now c = " + c);

        System.out.println("++c = " + (++c));
        // pre-increment (adds then prints)

        System.out.println("c-- = " + (c--));
        // post-decrement

        System.out.println("Now c = " + c);

        System.out.println("--c = " + (--c));
        // pre-decrement

        //ternary operator
        String result = (a > b) ? "a is greater" : "b is greater or equal";
        System.out.println("Result: " + result);

    }
}
