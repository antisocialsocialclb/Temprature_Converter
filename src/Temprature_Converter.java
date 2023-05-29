import java.util.*;

public class Temprature_Converter{
    static Scanner sc = new Scanner(System.in); // Scanner Class

    // Celcius to Fahrenheit
    static double Celcius_to_Fahrenheit(double Celcius){
        double Fahrenheit = (Celcius * 9/5) + 32;
        return Fahrenheit;
    }
    // Celcius to Kelvin
    static double Celcius_to_Kelvin(double Celcius){
        double Kelvin = Celcius + 273.15;
        return Kelvin;
    }

    // Fahrenheit to Celcius
    static double Fahrenheit_to_Celcius(double Fahrenheit){
        double Celcius = (Fahrenheit - 32) * 5/9;
        return Celcius;
    }
    // Fahrenheit to Kelvin
    static double Fahrenheit_to_Kelvin(double Fahrenheit){
        double Kelvin = (Fahrenheit - 32) * 5/9 + 273.15;
        return Kelvin;
    }

    // Kelvin to Celcius
    static double Kelvin_to_Celcius(double Kelvin){
        double Celcius = Kelvin - 273.15;
        return Celcius;
    }
    // Kelvin to Fahrenheit
    static double Kelvin_to_Fahrenheit(double Kelvin){
        double Fahrenheit = (Kelvin - 273.15) * 9/5 + 32;
        return Fahrenheit;
    }

    // Read the value of temperature given by the user
    static double Input_Temperature(String Temperature){
        System.out.println("Enter the "+Temperature+" value:");
        double val = sc.nextDouble();
        return val;
    }

    // Print converted value of temperature
    static void Output_Temperature(double Value, String Temperature){
        System.out.println("The "+Temperature+" value is: "+Value);
    }

    // Driver Method
    public static void main(String args[]){
    }
}