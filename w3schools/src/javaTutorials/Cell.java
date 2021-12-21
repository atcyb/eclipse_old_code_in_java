package javaTutorials;
import java.util.Scanner;

public class Cell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		if(n%2!=0 || n%2<=0 && n>=6 && n<=20){
            System.out.println("Weird");
        }else if(n%2<=0 && n>=2 && n<=5 || n%2<=0 && n>20){
            System.out.println("Not Weird");
        }
        else if(n>100){System.out.println("NOT VALID");}
        else{System.out.println("");}

		
	}

}
