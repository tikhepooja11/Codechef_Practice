import java.util.*;
import java.io.*;
import java.lang.Math; 


public class SquareRootOfNumber
{
public static void main(String args[])throws IOException
{
	try{
		Scanner sc = new Scanner(System.in);
		int T,result[],ans;
		T = sc.nextInt();
		result = new int[T];
		double N;
		for(int i=0;i<T;i++)
		{
			N = sc.nextDouble();
			ans = (int)Math.sqrt(N);
			result[i] = ans;
		}
		System.out.println();
		for(int i=0;i<T;i++)
		{
			System.out.println(result[i]);
		}
	}catch(Exception e){}
	
}
}