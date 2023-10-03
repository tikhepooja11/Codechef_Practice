import java.io.*;
import java.util.*;
import java.lang.*;
// Status - Remaining
public class CuttingRecipes {

	public static void main(String[] args) {
		
		int T,N,arr[],flag=0;
		Scanner sc = new Scanner(System.in);
		T =sc.nextInt();
		for(int i=0;i<T;i++)
		{
			N = sc.nextInt();
			arr = new int[N];
			for(int j=0;j<N;j++)
			{
				arr[j] = sc.nextInt();	
			}
			for(int j=0;j<N;j++)
			{
				for(int m=1;m<N;m++)
				{
					if( (arr[j]%arr[m]==0))
					{
						System.out.print(arr[j]/arr[m]+" ");
					}
					else if((arr[m]%arr[j]==0)) 
					{
						System.out.print(arr[m]/arr[j]+" ");
					}
				}
				System.out.println();
			}
		}
		

	}

}
