import java.util.Scanner;

public class Main {
    // Exchange rates
    private static final double INR_TO_USD_RATE = 0.014;   
    private static final double INR_TO_EUR_RATE = 0.012;  
    private static final double INR_TO_HKD_RATE = 0.11;    

    public static double convertINRtoUSD(double amount) {
        return amount * INR_TO_USD_RATE;
    }

    public static double convertINRtoEUR(double amount) {
        return amount * INR_TO_EUR_RATE;
    }

    public static double convertINRtoHKD(double amount) {
        return amount * INR_TO_HKD_RATE;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount in INR: ");
        double inrAmount = scanner.nextDouble();

        double usdAmount = convertINRtoUSD(inrAmount);
        double eurAmount = convertINRtoEUR(inrAmount);
        double hkdAmount = convertINRtoHKD(inrAmount);

        System.out.println(inrAmount + " INR is equal to:");
        System.out.println(usdAmount + " USD");
        System.out.println(eurAmount + " EUR");
        System.out.println(hkdAmount + " HKD");

        scanner.close();
    }
}


// This is a currency converter program which has the ability to convert currencies of multiple countries.
