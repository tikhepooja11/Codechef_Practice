//to find sum of digits of a number
import java.util.*;
public class SumOfDigits {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T,num,digit,sum=0,result[];
		String numToString,splitted[];
		T = sc.nextInt();
		result = new int[T];
		for(int i=0;i<T;i++)
		{
			sum = 0;
			num = sc.nextInt();
			numToString = Integer.toString(num);
			
			char[] charArray = numToString.toCharArray();
			for(int j=0;j<charArray.length;j++)
			{
				digit = Character.getNumericValue(charArray[j]);
				sum=sum+digit;
			}
			result[i]=sum;
		}
		for(int i=0;i<T;i++)
		{
			System.out.println(result[i]);
		}

	}

}
