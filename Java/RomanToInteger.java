// (Q.1.B) Enter a Roman Number as input and convert it to an integer. (ex IX = 9) 
package  interviewPractice;
import java.util.Scanner;

public class RomanToInteger {
	
	public static int romanCharToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0; 
        }
    }
	
    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentValue = romanCharToInt(currentChar);

            if (i < s.length() - 1) {
                char nextChar = s.charAt(i + 1);
                int nextValue = romanCharToInt(nextChar);

                if (currentValue < nextValue) {
                    result += nextValue - currentValue;
                    i++;
                } else {
                    result += currentValue;
                }
            } else {
                result += currentValue;
            }
        }

        return result;
    }


    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter Roman Number::");
        String romanNumeral1=sc.next();
        String romanNumeral=romanNumeral1.toUpperCase();
        
        int integerEquivalent = romanToInt(romanNumeral);
        System.out.println("The integer equivalent of " + romanNumeral + " is: " + integerEquivalent);
    }
}
