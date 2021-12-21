package conditionalStatements;

import java.util.Scanner;

public class ElseAndElseIf
{

	public static void main(String[] args)
	{
		//else and else if conditional statement
		
			Scanner sc = new Scanner(System.in);
		    int a = sc.nextInt();
				
			if (a>2) {
				System.out.println(a+" is greater than 2.");
			    }
			/*  else if (condition){
			 *  block of code to be executed if the condition is true
			 *  }
			 */
			else if(a<2) {
				System.out.println(a+" is less than 2");
				   }
			/*  else {
			 *  block of code to be executed if the condition is true
			 *  }
			 */
			else {
				System.out.println(a+" is not greater than 2.");
				 }		  
			sc.close();
	}

}
