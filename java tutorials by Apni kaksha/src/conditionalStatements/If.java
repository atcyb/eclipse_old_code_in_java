package conditionalStatements;
import java.util.Scanner;
public class If
{

	public static void main(String[] args)
	{
       // If Conditional statement
		
		/*  if (condition){
		 *  block of code to be executed if the condition is true
		 *  }
		 */
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if (a>=2) {
			System.out.println(a+" is greater than 2");
		}
		sc.close();
		
		
		
	}

}
