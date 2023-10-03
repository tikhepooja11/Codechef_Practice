import java.util.Arrays;
import java.util.Scanner;
public class ChefAndSequence {

	public static void main(String[] args) {
		int T,sq_length,sq[],fsq_length,fsq[],actual=0;
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		boolean fsq_bool[];
		String result[] = new String[T];
		for(int i=0;i<T;i++)
		{
			sq_length = sc.nextInt();
			sq = new int[sq_length];
			for(int j=0;j<sq.length;j++)
			{
				sq[j] =sc.nextInt();
			}
			fsq_length = sc.nextInt();
			fsq = new int[fsq_length];
			fsq_bool = new boolean[fsq_length];
			for(int j=0;j<fsq.length;j++)
			{
				fsq[j] =sc.nextInt();
			}
			
			//logic
			int k=0,flag=0,flag1=0;
			for(int j=0;j<sq.length;j++)
				{
					
						if(fsq[k] == sq[j])
						{
							flag=1;
						}
						if(flag==1)
						{
							fsq_bool[k]=true;
							k++;
							actual = fsq_length;
							fsq_length--;
						}
						if(fsq_length!=0)
						{
							continue;
						}
						else
						{
							for(int p=0;p<actual;p++)
							{
								if(fsq_bool[p] == true)
								{
									flag1=1;
								}
							}
							if(flag1==1)
							{
								result[i]="Yes";
							}
							else
							{
								result[i]="No";
							}
							break;
						}
				}
			
			
				
				
			
		}
		for(int i=0;i<T;i++)
		{
			System.out.println(result[i]);
		}
		

	}

}
