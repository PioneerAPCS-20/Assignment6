
import java.util.Scanner;

public class InClass
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
    
        System.out.print("Enter a temperature in degrees F: ");
        double degF = in.nextDouble();
        double degC = convertToCelsius(degF);
        System.out.println(degF + " F = " + degC + " C.");
    }

    public static double convertToCelsius(double deg) 
    {
        double cel = 5.0 / 9.0 * (deg - 32);

        return cel;
    }
}

