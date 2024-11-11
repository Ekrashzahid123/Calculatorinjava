///*2.	Write a Java program that takes a number as input and prints its multiplication table up to 10.*/

import java.util.Scanner;

public class table {
    public static int Table1() {

        Scanner input = new Scanner(System.in);
        System.err.println("Enter the number you want to get table");
        int no1 = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(no1 + " x " + i + " = " + (no1 * i));
        }

        return no1;
    }

    public static void main(String[] args) {
        int receive;
        receive = Table1();
        System.err.println("The Table1 is as" + receive);
    }
}
