package javaTutorials;
import java.util.Scanner;
public class DDLJ {

	public static void main(String[] args) {
		Scanner parentsQuestion= new Scanner(System.in);   
		System.out.print("Parents : In which college you wanna go ? ");  
		String ourAns= parentsQuestion.nextLine();                
		 if (ourAns.equals("IIT") || ourAns.equals("NSIT")|| ourAns.equals("NIT")) {
			 System.out.println("Parents : Awww...mera raja beta ");
			  }
		 else {
			 System.out.println("Parents : Naak katayega ye Ladka");
		 }
		parentsQuestion.close();
	}

}
