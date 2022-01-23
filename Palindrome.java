import java.util.*;

public class Palindrome 
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word to see if it is a palindrome: ");
		String palindrome = input.next();
		makeComparison(comparison(addToStack(palindrome), palindrome), palindrome);
		input.close();
	}//end main
	
	/**
	 * 
	 * @param String string whose characters will be added to the character stack
	 * @return Stack<Character> - stack of characters of given string in reverse order
	 */
	public static Stack<Character> addToStack(String string)
	{
		Stack<Character> characters = new Stack<Character>();
		for(int i=0; i < string.length(); i++)
		{
			characters.push(string.charAt(i));
		}
		return characters;
	}//end addToStack
	
	/**
	 * 
	 * @param Stack<Character> aStack to be used to pop characters off to inverse the given word
	 * @param String a to be used for the length
	 * @return String comparison - the string to be compared to the given word
	 */
	public static String comparison(Stack<Character> aStack, String a)
	{
		String comparison = "";
		for(int i=0; i < a.length(); i++)	
		{
			comparison+= aStack.pop();
		}
		return comparison;
	}//end comparison
	
	/**
	 * 
	 * @param String a - the inverse of the given word
	 * @param String b - the original word to be tested
	 * @return boolean - returns true if the word is a palindrome; false if it is not a palindrome
	 */
	public static boolean makeComparison(String a, String b)
	{
		boolean match = false;
		if(a.toLowerCase().equals(b.toLowerCase()))
		{
			match = true;
			System.out.println("This word is a palindrome!");
			System.out.print(a + " = " + b);
		}
		else if(!a.toLowerCase().equals(b.toLowerCase()))
		{
			match = false;
			System.out.println("This word is not a palindrome.");
			System.out.print(a + " =/= " + b);
		}
		return match;
	}//end makeComparison
}//end class
