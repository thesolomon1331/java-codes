/*Java program to find the largest of 3 numbers
*/
package myprojects;
import java.util.*;
public class LargestNum
{
	private static final int NULL = 0;

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int x = s.nextInt();
		int y= s.nextInt();
		int z= s.nextInt();
		int result=NULL;
		if(x>y && x>z)
		{
			result=x;
		}
		else if (y>=z)
		{
			result = y;
		}
		else
		{
			result= z;
		}
		System.out.print(result);
	}
}
