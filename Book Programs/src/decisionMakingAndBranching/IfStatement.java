package decisionMakingAndBranching;
import java.util.Scanner;
public class IfStatement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
         //int a=2;
         if(a%2==0) {
        	 System.out.println("this number is an even number !");
         }
         else if(a%2!=0) {
        	 System.out.println("This number is an odd number !");
         }
         sc.close();
	}

}
