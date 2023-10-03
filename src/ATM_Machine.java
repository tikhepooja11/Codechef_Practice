import java.util.*;

import java.io.*;
import java.lang.Math; 

public class ATM_Machine
{
public static void main(String args[])throws IOException
{
	try{
		Scanner sc = new Scanner(System.in);
		int T,N,K,A[];
		char result[];
		String str[];
		T = sc.nextInt();
		str=new String[T];
		for(int t=0;t<T;t++)
		{
			N = sc.nextInt();
			K = sc.nextInt();
			A = new int[N];
			result = new char[N];
			for(int i=0;i<N;i++)
			{
				A[i]=sc.nextInt();
			}
			int count=0;
			for(int i=0;i<N;i++)
			{
				count=count+A[i];
				if(count <= K)
				{
					result[i]='1';
				}else
				{
					result[i]='0';
					count=count-A[i];
					continue;
				}
			
			}
			str[t]=String.valueOf(result);
		}
		for(int i=0;i<T;i++)
			{
				System.out.println(str[i]);
			}
		
	
	}catch(Exception e){}
	
}
}