package hangama;

import java.util.Scanner;
import java.util.ArrayList;

public class MainFile {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		HangamaGame objHang = new HangamaGame();
		
		
		
		for(;;) {
			System.out.print("Guess a letter that is in the sentence the computer chose: ");
			String strLetter = kb.nextLine();
			objHang.addGuessedLetter(strLetter.charAt(0));
			
			objHang.printSentence();
			
			if(objHang.won() )
			{
				System.out.println("You won! Good job");
				break;
			}
			else if(objHang.guessesLeft() == 0){
				System.out.println("You lost! Try again");
				break;
			}
			
			System.out.print("\n"+objHang.guessesLeft() + " more guesses left\n");
			
			System.out.print("\nVowels Guessed : " +objHang.GetVowels());
			System.out.print("\nConsonants Guessed: " + objHang.GetConsonants() + "\n");
		}
		for(;;) {
		if(objHang.guessesLeft() == 5) {
			System.out.print("O");
		}
		else if(objHang.guessesLeft() == 4) {
			System.out.print("O");
    		System.out.print("|");
		}
		else if(objHang.guessesLeft() == 3) {
			System.out.print("O");
    		System.out.print("|");
    		System.out.print("/");
		}
		else if(objHang.guessesLeft() == 2) {
			System.out.print("O");
    		System.out.print("|");
    		System.out.print("/\\");
		}
		else if(objHang.guessesLeft() == 1) {
			System.out.print(" O");
    		System.out.print("/|");
    		System.out.print(" /\\");
		}
		else if(objHang.guessesLeft() == 0) {
			System.out.print(" O");
    		System.out.print("/|\\");
    		System.out.print(" /\\");
		}kb.close();
		}
		
		
	}

}