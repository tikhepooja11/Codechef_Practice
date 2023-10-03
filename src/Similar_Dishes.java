import java.util.*;
import java.io.*;
import java.lang.Math; 
public class Similar_Dishes
{
	
	public static void main(String[] args)throws IOException
	{
		try {
		int T;
		Scanner sc = new Scanner(System.in);
		String[] splittedString1 = null;
		String[] splittedString2 = null;

		T = sc.nextInt();
		String[] str = new String[50];
		for(int i=0;i<=(T*2);i++)
		{
			str[i]=sc.nextLine();
		}
		

		int i=1;
		while(i<=(T*2))
		{
			int j=i+1;
			splittedString1=str[i].split(" ");
			//System.out.println(Arrays.toString(splittedString1));
			splittedString2=str[j].split(" ");
			//System.out.println(Arrays.toString(splittedString2));
			//System.out.println("****"+splittedString1[0]+"**********"+splittedString2[0]);
			
			int count=0,flag=0;
			for(int m=0;m<splittedString1.length;m++)
			{
				for(int n=0;n<splittedString2.length;n++)
				{
					if(splittedString1[m].equals(splittedString2[n]))
					{
						count++;
						break;
					}
					
				}
				if(count>=2)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				System.out.println("similar");
			}
			else
			{
				System.out.println("dissimilar");
			}
			
			i=i+2;
			
		}
		}catch(Exception e) {}
	}

}
