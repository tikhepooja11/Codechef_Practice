import java.util.Arrays;

import java.util.Scanner;
public class SmallestPair {

	public static void main(String[] args) {
		int T,N,min;
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		int result[] = new int[T];
		for(int i=0;i<T;i++)
		{
			N = sc.nextInt();
			int ans[] = new int[N];
			int arr[] = new int[N];
			min = 0;
			for(int j=0;j<N;j++)
			{
				arr[j] = sc.nextInt();
			}
			for(int j=0;j<N-1;j++)
			{
				int k=j+1;
				ans[j] = arr[j]+arr[k];
			}

			
			Arrays.sort(ans);
			result[i] = ans[1];			
		}
		
		for(int i=0;i<T;i++)
		{
			System.out.println(result[i]);
		}
		
	}

}


