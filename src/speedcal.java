import java.util.Scanner;

public class speedcal {
    
    public static void speed()
    {
        Scanner input=new Scanner(System.in);
        System.err.println("Enter the Distance in Meters");
        float meter=input.nextFloat();

        System.out.println("Enter the Hours");
        int hour=(int) input.nextFloat();
        System.out.println("Enter the Minutes");
        int minutes=(int) input.nextFloat();
        System.out.println("Enter the second");
        int second=(int) input.nextFloat();
        double totalsec=hour*3600+minutes*60+second*60;
        double meterpersec=minutes/totalsec;
        double speedKilometersPerHour = (meter / 1000) / (totalsec / 3600);
        double speedMilesPerHour = (meter/ 1609) / (totalsec / 3600);

        System.out.printf("Speed in meters per second: %.2f m/s%n", meterpersec);
        System.out.printf("Speed in kilometers per hour: %.2f km/h%n", speedKilometersPerHour);
        System.out.printf("Speed in miles per hour: %.2f mph%n", speedMilesPerHour);


        
    }
    public static void main(String[] args) {
        speed();
        
    }
}
