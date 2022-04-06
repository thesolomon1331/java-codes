package myprojects;
import java.util.Scanner;
public class Circle
{
	public static void main(String[] args)
	{
		try (Scanner s = new Scanner(System.in)) {
			double radius = s.nextDouble();
			double area = 0;
			double perimeter = 0;
			if(radius < 0)
			{
				System.out.println("Please enter postive number");
			}
			else
			{
				area=Math.PI*radius*radius;
				perimeter=2*Math.PI*radius;	
			}
			System.out.println("Area of circle is = "+area);
			System.out.print("Perimetere of the circle is = "+perimeter);
		}

	}

}
