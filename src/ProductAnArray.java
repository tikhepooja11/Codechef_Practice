import java.io.*;
import java.util.*;

 class ResultClass
{
	 int result[];
	 ResultClass()
	 {
		 this.result=result;
	 }
	
}
public class ProductAnArray
{
	public static void main(String args[])
	{
		int T,n,arr[],recent_index,mul=1;
		ResultClass obj[] = new ResultClass[2] ;

		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int i=0;i<T;i++)
		{
			n = sc.nextInt();
			arr = new int[n];
			for(int j=0;j<n;j++)
			{
				arr[j]=sc.nextInt();
			}
			for(int j=0;j<n;j++)
			{
				recent_index = j;
				mul=1;
				for(int k=0;k<n;k++)
				{
					if(recent_index==k)
					{
						//continue;
					}
					else
					{
						mul=mul*arr[k];
					}
				}
				obj[i].result[j]=mul;	

				
			}
		}
		for(int i=0;i<T;i++)
		{
			for(int j=0;j<T;j++)
			{
				System.out.print(obj[i].result[j]+" " );
			}
			System.out.println();

		}
		
	}
}