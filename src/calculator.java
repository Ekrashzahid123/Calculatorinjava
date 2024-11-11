
import java.util.Scanner;

//1.	 Write a Java program to print the sum (addition),
// multiply, subtract, divide and remainder of two numbers.
public class calculator {
    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static float div(int a, int b) {
        if (b == 0) {
            System.err.println("No is not divided by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.err.println("Enter the number1");
        int number1 = input.nextInt();
        System.err.println("Enter the number2");
        int number2 = input.nextInt();
        System.out.println("The Sum of two number is as:" + add(number1, number2));
        System.out.println("The MUL of two number is as:" + mul(number1, number2));
        System.out.println("The Div of two number is as:" + div(number1, number2));
        System.out.println("The Sub of two number is as:" + sub(number1, number2));
    }
}
// hello
