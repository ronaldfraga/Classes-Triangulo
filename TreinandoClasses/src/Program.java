import java.util.Scanner;
import endites.Triangle;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner ( System.in);
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		System.out.println("Enter the measures of Triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of Triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n ", areaX);
		System.out.printf("Triangle Y area: %.4f%n ", areaY);
		
		
		
		sc.close();
	}

}
