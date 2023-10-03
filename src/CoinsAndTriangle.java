import java.util.*;
import java.lang.*;
import java.io.*;
public class CoinsAndTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();
		int N,k;
		for(int i=1;i<=T;i++)
		{
			N = sc.nextInt();
			for(int j=1;j<=N;j++)
			{
				for(k=1;k<=j;k++)
				{
					if(k!=N)
					{
						System.out.print("*\t");
					}
					else
					{
						break;
					}
				}
				System.out.println();
				if(j!=k)
				{
					
				}
			}
			
		}
	}

}
