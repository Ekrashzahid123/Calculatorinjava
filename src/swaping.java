import java.util.Scanner;

public class swaping {
    public static void Swap(int number1, int number2) {
        System.out.println("Before Swaping number1: "+ number1);
        System.out.println("Before Swaping number2:" + number2);

        int temp;
        temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("After Swaping number1: "+ number1);
        System.out.println("After Swaping number2:" + number2);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.err.println("Enter the number1");
        int number1 = input.nextInt();
        System.err.println("Enter the number2");
        int number2 = input.nextInt();
        Swap(number1, number2);

    }

}
