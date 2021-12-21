package ctq;
import java.util.*;

public class EnhanceForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		String
		states[]= {"TamilNadu","AndhraPradesh","UttarPradesh","Rajasthan"};
		for(int i=0 ; i<states.length; i++)
		{
			System.out.println("Standard for-loop : state name : "+ states[i]);
		}
		for(String i:states)
		{
			System.out.println("Enhanced for-loop : state name : "+ i);
		}
		System.out.println();
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Calcutta");
		cities.add("Chennai");
		for(int i=0 ; i<cities.size();i++)
			{
				System.out.println("Standard for-loop : city name : "+ cities.get(i));
			}
			for(String i: cities)
			{
				System.out.println("Enhanced for-loop : city name : "+ i);
			}
			System.out.println();
			System.out.println("In Collections");
			System.out.println();
			printcollection(cities);
	}
	public static<AnyType> void printcollection(Collection<AnyType> C)
	{
		for(AnyType val : C)
			System.out.println(val);
	}
	
			}


