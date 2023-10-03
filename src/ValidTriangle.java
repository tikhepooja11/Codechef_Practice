import java.util.*;
public class ValidTriangle 
{

	public static void main(String[] args)
	{
		int T,a,b,c,result;
		Scanner sc = new  Scanner(System.in);
		T = sc.nextInt();
		String final_result[] =new String[T];
		for(int i=0;i<T;i++)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			result = a+b+c;
			if(result == 180 )
			{
				final_result[i] = "YES";
			}
			else
			{
				final_result[i] = "NO";
			}
		}
		for(int i=0;i<T;i++)
		{
			System.out.println(final_result[i]);
		}
		
		
	}
}
/*
 Write a program to check whether a triangle is valid or not, when the three angles of the triangle are the inputs. A triangle is valid if the sum of all the three angles is equal to 180 degrees.

Input
The first line contains an integer T, total number of testcases. Then follow T lines, each line contains three angles A, B and C of triangle separated by space.

Output
Display 'YES' or 'NO' if the triangle is Valid or not respectively.

Constraints
1 ≤ T ≤ 1000
1 ≤ A,B,C ≤ 180
Example
Input

3 
40 40 100
45 45 90
180 1 1
Output

YES
YES
NO
 */
