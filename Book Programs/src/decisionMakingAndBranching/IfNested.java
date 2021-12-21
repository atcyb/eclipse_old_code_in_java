package decisionMakingAndBranching;

import java.util.Scanner;

public class IfNested {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a % 2 == 0) {
			if (b % 2 == 0) {
				System.out.println("Both a and b are even numbers. ");
			} else {
				System.out.println("a is an even but b is an odd number.");
			}

		}
		else if(a%2!=0) {
			if (b % 2 == 0) {
				System.out.println("a is an odd number but b is an even number. ");
			} else {
				System.out.println("Both a and b are odd numbers.");
			}
			
		}

		sc.close();

	}

}
