import java.util.*;
import java.io.*;

public class SecondLargetNumber{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T,arr[],result[];

		try
		{
			T =sc.nextInt();
			result=new int[T];
			arr=new int[3];
			for(int i=0;i<T;i++)
			{
				for(int j=0;j<3;j++)
				{
					arr[j]=sc.nextInt();
				}
				Arrays.sort(arr);
				
				result[i] = arr[1];
			}
			for (int j = 0; j < T; j++)
			{
				System.out.println(result[j]);
			}
		}catch(Exception e) {}
		
		
		
	}
}

/*
Three numbers A, B and C are the inputs. Write a program to find second largest among three numbers.

Input
The first line contains an integer T, total number of testcases. Then follow T lines, each line contains three integers A, B and C.

Output
Display the second largest among A, B and C.

Constraints
1 ≤ T ≤ 1000
1 ≤ A,B,C ≤ 1000000
Example
Input
3 
120 11 400
10213 312 10
10 3 450

Output

120
312
10
*/