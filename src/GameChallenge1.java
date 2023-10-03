import java.util.*;
public class GameChallenge1
{
	static int T,N,p[],v[],win_count=0,lose_count=0 ,k=0;
	static String result[];
	Scanner sc = new Scanner(System.in);
	public GameChallenge1()
	{
		
		int tempT = sc.nextInt();
		if((1<=tempT) && (tempT<=10))
			T=tempT;
		result = new String[T];
		

		for(int t=0;t<T;t++)
		{
			
			int tempN =sc.nextInt();
			if((tempN>=1)&&(tempN<=1000))
				N=tempN;
			v=new int[N];
			p=new int[N];
			

			
			for(int j=0;j<N;j++)
			{
				
				int strength=sc.nextInt();
				if(strength>=1)
					v[j] = strength;
					
			}
			

			for(int j=0;j<N;j++)
			{
				int energy=sc.nextInt();
				if(energy<=100000)
					p[j] = energy;
					
			}
			check(t);
		}
		
		
	}
	public void check(int t)
	{
		//sorted villinas array
		
			for(int i=0;i<N;i++)
			{
				for(int j=i+1;j<N;j++)
				{
					if(v[i] > v[j] )
					{
						int temp1 = v[i];
						v[i]=v[j];
						v[j] = temp1;
						
					}
				}
			}
			//sorted players array
			for(int i=0;i<N;i++)
			{
				for(int j=i+1;j<N;j++)
				{
					if(p[i] > p[j] )
					{
						int temp1 = p[i];
						p[i]=p[j];
						p[j] = temp1;
						
					}
				}
			}
			
			
			//check between two arrays
			for(int i=0;i<N;i++)
			{
				
					if(p[i] > v[i])
					{
						win_count++;
					}
					else
					{
						lose_count++;
					}
				
			}
			
			if(win_count > lose_count)
			{
				result[t]="WIN";
			}
			else
			{
				result[t]="LOSE";
			}
			
			
		
		
	}
	public static void main(String args[])
	{
		GameChallenge1 g = new GameChallenge1();
		
		for(int i=0;i<T;i++)
		{
			System.out.println(result[i]);
		
		}
		
		
	}
}
