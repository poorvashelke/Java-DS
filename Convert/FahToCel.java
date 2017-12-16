import java.util.Scanner;

public class FahToCel {
	//Convert Fehrenheit to celsius
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double celsius, fahrenheit;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit:");
        fahrenheit = s.nextDouble();
        celsius = (0.555) * (fahrenheit-32);
        System.out.println("Temperature in Celsius:"+celsius);        
  

	}

}
      
