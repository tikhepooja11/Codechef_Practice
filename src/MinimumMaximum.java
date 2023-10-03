import java.util.*;
public class MinimumMaximum {

	public static void main(String[] args) {
		int T,N,min,cost=0;
		try {
			Scanner sc = new Scanner(System.in);
			T = sc.nextInt();
			int result[] = new int[T];
			for(int i=0;i<T;i++)
			{
				N = sc.nextInt();
				int arr[] = new int[N];
				for(int j=0;j<N;j++)
				{
					arr[j] = sc.nextInt();
				}
				cost=0;
				min=arr[0];
				for(int j=1;j<N;j++)
				{
					
					if(arr[j] > min)
					{
						min = min;
					}else
					{
						min = arr[j];
					}
					cost=cost+min;
				}
				result[i]=cost;
			}
			for(int i=0;i<T;i++)
			{
				System.out.println(result[i]);
			}
		}catch(Exception e) {}
		
		
	}

}
