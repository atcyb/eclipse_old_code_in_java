package hangama;

import java.util.ArrayList;
import java.util.Random;

public class HangamaGame {
	private static int MAX_GUESSES = 6; 
	public  int wrongGuesses = 0;
	private ArrayList<String> sentences = null;
	private  String sentence = " ";
	private ArrayList<Character> vowels = null;
	private ArrayList<Character> consonants = null;
	
	public HangamaGame() {
		sentences = new ArrayList();
		vowels = new ArrayList();
		consonants = new ArrayList();
		
		sentences.add("I went to school yesterday.".toUpperCase());
		sentences.add("Tenth graders are called Sophmores.".toUpperCase());
		sentences.add("AP Computer Science is fun.".toUpperCase());
		sentences.add("Wrappers and Array Lists.".toUpperCase());
		sentences.add("Our previous topic was Strings.".toUpperCase());
		sentences.add("This is Period four Computer Science.".toUpperCase());
		sentences.add("This lab is called Hangman.".toUpperCase());
		sentences.add("Random Seating Chart.".toUpperCase());
		sentences.add("Rythym is hard to guess".toUpperCase());
		sentences.add("The bell buzzed.".toUpperCase());
		
		Random rdmSent = new Random();
		
		int intSentence = rdmSent.nextInt(10);
		
		sentence = sentences.get(intSentence);
	}
	
	public boolean won() {
		int intLength = sentence.length();
		for(int intCurrChar = 0; intCurrChar < intLength; intCurrChar++) {
			char chrCurrent = sentence.charAt(intCurrChar);
			
			if(chrCurrent == ' ')
			{
				
			}
			else if(isPunctuation(chrCurrent))
			{
				
			}
			else if(isVowel(chrCurrent))
			{
				if(!vowels.contains(chrCurrent))
					return false;
			}
			else
			{
				if(!consonants.contains(chrCurrent))
					return false;
			}
		}
		
		return true;
		
	}
	public void printSentence() {
		int intLength = sentence.length();
		String strOutput = "";
		
		for(int intCurrChar = 0; intCurrChar < intLength; intCurrChar++) {
			
			char chrCurrent = sentence.charAt(intCurrChar);
			if(chrCurrent == ' ')
				strOutput += chrCurrent;
			else if(isPunctuation(chrCurrent))
				strOutput += chrCurrent;
			else if(isVowel(chrCurrent))
			{
				if(vowels.contains(chrCurrent))
					strOutput += chrCurrent;
				else
					strOutput += "-";
			}
			else
			{
				if(consonants.contains(chrCurrent))
					strOutput += chrCurrent;
				else
					strOutput += "-";
			}
			
		}
		
		System.out.print(strOutput);
		
	}
	public int guessesLeft() {
		return MAX_GUESSES - wrongGuesses;
		
	}
	public boolean addGuessedLetter(char chrInput) {
		if(chrInput == ' ' || isPunctuation(chrInput))
		return false;
		
		chrInput = ("" + chrInput).toUpperCase().charAt(0);
		
		if(isVowel(chrInput))
		{
			if(vowels.contains(chrInput))
				return false;
			
			vowels.add(chrInput);
			
			if(sentence.indexOf(chrInput) < 0)
				wrongGuesses++;
			
			return true;
		}
		else
		{
			if(consonants.contains(chrInput))
				return false;
			
			consonants.add(chrInput);
			
			if(sentence.indexOf(chrInput) < 0)
				wrongGuesses++;
			
			return true;
		}
		
		
		
		
		
	}
	public void printGuessed() {
		
	}
	
	public boolean isInSentence(char c) {
		return false;
	}
	
    private boolean isVowel(char letter) {
    	
    	char chrCurrent = ("" + letter).toUpperCase().charAt(0);
    			
		if (chrCurrent == 'A' || chrCurrent == 'E' || chrCurrent == 'I' || chrCurrent == 'O' || chrCurrent == 'U')
			return true;
		else
			return false;
    }
    public boolean isPunctuation(char letter) {
    
    	if(letter == '!' || letter == ',' || letter == ';' || letter == ':' || letter == '.' || letter == '?')
    		return true;
    	else
    		return false;
	}
    
    public String GetVowels()
    {
    	String strOutput = "";
    	
    	for(int intVowel = 0; intVowel < vowels.size(); intVowel++)
    	{
    		strOutput += vowels.get(intVowel) + " ";
    	}
    	
    	return strOutput;
    }
    public String GetConsonants()
    {
    	String strOutput = "";
    	
    	for(int intConsonant = 0; intConsonant < consonants.size(); intConsonant++)
    	{
    		strOutput += consonants.get(intConsonant) + " ";
    	}
    	return strOutput;
    }
    
}
