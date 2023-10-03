import java.util.*;
import java.io.*;

public class SplitNumber {

	
	static int T,N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Testcases:");
		T = sc.nextInt();
		for(int i=0;i<T;i++)
		{
			System.out.println("Enter Number:");
			N =sc.nextInt();
			String num = Integer.toString(N);							// converting integer into string
			
			String splitted[] = num.split("\t ");						//converting string into string array
			System.out.print(splitted);
			
			String first_dig = Character.toString(splitted[0].charAt(0));   // character charAt(0) is converted into string
			int first_digit = Integer.parseInt(first_dig);					//  string is converted into number
			int last_digit = (N%10);
			System.out.println("sum of first and last digit of a number : "+(first_digit+last_digit) );
			
		}

	}

}
