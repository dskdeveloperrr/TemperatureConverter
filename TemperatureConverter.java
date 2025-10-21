import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Convert to (C/F/K): ");
        char unit = sc.next().toUpperCase().charAt(0);
        switch(unit) {
            case 'C': 
                System.out.println("Temperature in Celsius: " + ((temp-32)*5/9)); 
                break;
            case 'F': 
                System.out.println("Temperature in Fahrenheit: " + (temp*9/5 + 32)); 
                break;
            case 'K': 
                System.out.println("Temperature in Kelvin: " + ((temp-32)*5/9 + 273.15)); 
                break;
            default: 
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
}
