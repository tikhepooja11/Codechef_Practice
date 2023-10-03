/*
 * Consider a currency system in which there are notes of seven denominations, namely, Rs. 1, Rs. 2, Rs. 5, Rs. 10, Rs. 50, Rs. 100.
If the sum of Rs. N is input, write a program to computer smallest number of notes that will combine to give Rs. N.

Input
The first line contains an integer T, total number of testcases. Then follow T lines, each line contains an integer N.

Output
Display the smallest number of notes that will combine to give N.

Constraints
1 ≤ T ≤ 1000
1 ≤ N ≤ 1000000
Example
Input
3 
1200
500
242

Output
12
5
7
 */

import java.util.*;
public class SmallestCurrency {

	
	static int T,N,rem1,rem2,rem3,rem4,rem5,nh,nf,nten,nfive,ntwo,none;
	
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		T = sc.nextInt();
		int result[] = new int[T];
		for(int i=0;i<T;i++)
		{
			N = sc.nextInt();
			rem1=N%100;
			nh=N/100;
			rem2=rem1%50;
			nf=rem1/50;
			rem3=rem2%10;
			nten=rem2/10;
			rem4=rem3%5;
			nfive=rem3/5;
			rem5=rem4%2;
			ntwo=rem4/2;
			none=rem5;
			result[i] = (nh+nf+nten+nfive+ntwo+none);
			/*
			System.out.println("\n number of notes of 50 = "+ nf);
			System.out.println("\n number of notes of 10 = "+nten);
			System.out.println("\n number of notes of 5 = "+ nfive);
			System.out.println("\n number of notes of 2 = "+ ntwo);
			System.out.println("\n number of notes of 1 = "+ none);*/
		}
		for(int i=0;i<T;i++)
		{
			System.out.println(result[i]);
		}
		
		
	
		
	}

}
