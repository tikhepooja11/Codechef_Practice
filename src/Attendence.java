import java.util.*;
public class Attendence {
	static int T,N;
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		T = sc.nextInt();
		int flag=0;
		String str[][],copy[][];
		for(int i=0;i<T;i++)
		{
			N =sc.nextInt();
			str = new String[N][2];
			copy = new String[N][2];

			for(int j=0;j<N;j++)
			{
				for(int p=0;p<2;p++)
				{
					str[j][p] = sc.next();
					
				}
			}
			int k,p;
			for(int j=0;j<N;j++)
			{
				if(j==0)
				{
					p=1;
				}
				else
				{
					p=0;
				}
				//System.out.println(p);
				for( k=p;k<N;k++)
				{
					if(j==k)
					{
						continue;
					}
					else
					{
						if(str[j][0].equals(str[k][0]))
						{
							flag=1;
							break;
						}
						else
						{
							flag=0;
						}
					}
				
				}
				if(flag==1)
				{
					System.out.println(str[j][0]+" "+str[j][1]);
				}
				if(flag==0)
				{
					System.out.println(str[j][0]);
				}
				
			}
			
	
		}
	}

}
