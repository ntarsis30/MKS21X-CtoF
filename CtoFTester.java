//they should take in double parameters, be double typed, and return doubles

public class CtoFTester{
    public static void main (String[] args){
        double n = 15.0;
        System.out.println(celsiusToFahrenheit(n));
        System.out.println(fahrenheitToCelsius(n));
        
    }
    public static double celsiusToFahrenheit(double cels){
        return (9.0/5)*cels + 32;
    }
    public static double fahrenheitToCelsius(double fahren){
        return (9.0/5)*(fahren - 32);
    }


}