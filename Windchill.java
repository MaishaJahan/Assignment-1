import java.util.Scanner;

public class Windchill {

	public static void main(String[] args) {
		final double NUM1 = 35.74;
		final double NUM2 = 0.6215;
		final double NUM3 = 35.75, NUM4 = 0.4275;
		double tempInFar, windInMPH, windChill;
		String name = "Maisha Jahan";
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the temperature in fahrenheit:");
		tempInFar = input.nextDouble();
		if (tempInFar < -40 || tempInFar > 40)
			System.out.println("Temperature is not in range");
		System.out.println("Enter the wind:");
		windInMPH = input.nextDouble();
		if (windInMPH < 5 || windInMPH > 60)
			System.out.println("Wind is not in range");
		windChill = NUM1 + (NUM2)*tempInFar - (NUM3)*(Math.pow(windInMPH, 0.16)) + (NUM4)*tempInFar*(Math.pow(windInMPH, 0.16));
		System.out.println("The wind chill is: " + windChill);
		System.out.println("Programmer: " + name);

	}

}