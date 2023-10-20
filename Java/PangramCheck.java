// (Q.1.C) Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet from a-z) 
package  interviewPractice;
import java.util.Scanner;

public class PangramCheck 
{
	    public static boolean isPangram(String input) 
	    {
	       
	        boolean[] alphabet = new boolean[26];
	        
	        for (int i = 0; i < input.length(); i++) 
	        {
	            char c = input.charAt(i);
	            if ('a' <= c && c <= 'z') 
	            {
	                alphabet[c - 'a'] = true;
	            }
	        }

	        for (boolean letterPresent : alphabet) 
	        {
	            if (!letterPresent) {
	                return false; 
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) 
	    {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the String");
	        String input = sc.nextLine();
	        input = input.toLowerCase();
	        boolean isPangram = isPangram(input);

	        if (isPangram) {
	            System.out.println("String is a pangram.");
	        } else {
	            System.out.println("String is not a pangram.");
	        }
	    }
	}


