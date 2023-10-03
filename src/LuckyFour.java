import java.util.Scanner;

//find number of occurrence of digit 4 from a number
public class LuckyFour {

	static int T,N , digit ,count=0,result[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Testcases:");
		T = sc.nextInt();
		result = new int[T];
		for(int i=0;i<T;i++)
		{
			count=0;
			System.out.println("Enter Number:");
			N =sc.nextInt();
			String num = Integer.toString(N);
			char[] stringToCharArray = num.toCharArray();
			
			for(int j=0;j<stringToCharArray.length;j++)
			{
				 digit = Character.getNumericValue(stringToCharArray[j]);
				 if(digit == 4)
				 {
					 count++;
				 }
			}
			result[i]=count;
			
			
		}
		for(int i=0;i<T;i++)
		{
			System.out.println(result[i]);
		}

	}

}
