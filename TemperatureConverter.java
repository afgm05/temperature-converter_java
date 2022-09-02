import java.util.Scanner;

public class TemperatureConverter {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        int option;

        while (run) {
            System.out.println("TEMPERATURE CONVERTER MAIN MENU");
            System.out.println("[1] Conversion from Celsius to Fahrenheit");
            System.out.println("[2] Conversion from Fahrenheit to Celsius");
            System.out.println("[3] Exit");
            System.out.print("Choose an option --> ");

            option = scan.nextInt();
            System.out.println();

            switch (option) {
                case 1:
                    System.out.print("Enter a temperature in Celsius to be converted to Fahrenheit: ");
                    float tempC = scan.nextFloat();
                    float convertedTempF = 9 * tempC / 5 + 32;
                    System.out.printf("%n%.1f\u00B0C is equivalent to %.1f\u00B0F %n%n", tempC, convertedTempF);
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                    break;
                case 2:
                    System.out.print("Enter a temperature in Fahrenheit to be converted to Celsius: ");
                    float tempF = scan.nextFloat();
                    float convertedTempC = (tempF - 32) * 5 / 9;
                    System.out.printf("%n%.1f\u00B0F is equivalent to %.1f\u00B0C %n%n", tempF, convertedTempC);
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                    break;
                case 3:
                    run = false;
                    break;
                default:
                    System.out.println("Error! Invalid input. \n");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
            }
        }
    }    
}
