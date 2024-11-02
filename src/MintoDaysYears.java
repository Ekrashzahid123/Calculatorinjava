import java.util.Scanner;

public class MintoDaysYears {
    public static void Conversion() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Minutes");
        
        float minutes = input.nextFloat();
        float minInDays = 60 * 24;
        float minInYear = 60 * 24 * 365;
        
        float years = minutes / minInYear;
        float remainingMinutes = minutes % minInYear;
        float days = remainingMinutes / minInDays;
        
        System.out.println(minutes + " minutes is approximately " + (int)years + " years and " + (int)days + " days.");
    }

    public static void main(String[] args) {
        Conversion();
    }
}
