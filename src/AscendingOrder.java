import java.util.*;
public class AscendingOrder {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T,temp1,numArray[];
		T = sc.nextInt();
		numArray = new int[T];
		for(int i=0;i<T;i++)
		{
			numArray[i] =sc.nextInt(); 
		}
		
		for(int i=0;i<T;i++)
		{
			for(int j=i+1;j<T;j++)
			{
				if(numArray[i] > numArray[j] )
				{
					temp1 = numArray[i];
					numArray[i]=numArray[j];
					numArray[j] = temp1;
					
				}
			}
		}
		for(int i=0;i<T;i++)
		{
			System.out.println(numArray[i]);
		}

	}

}
