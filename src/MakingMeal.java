//from given string find how many times we can create word 'codechef'
import java.util.*;
public class MakingMeal {
	static int ccount,ocount,dcount,ecount,hcount,fcount;
	static int result[];
	static int k=0;
	public static void find_occ(String str[],int N)
	{
		int ccount=0,ocount=0,dcount=0,ecount=0,hcount=0,fcount=0;
		int [] allCount = new int[6];
		for(int i=0;i<N;i++)
		{
			char[] strToCharArray = str[i].toCharArray();
			for(int j=0;j<strToCharArray.length;j++)
			{
				if(strToCharArray[j] == 'c')
				{
					ccount++;
					allCount[0]=ccount;
				}
				else if(strToCharArray[j] == 'o')
				{
					ocount++;
					allCount[1]=ocount;
				}
				else if(strToCharArray[j] == 'd')
				{
					dcount++;
					allCount[2]=dcount;
				}
				else if(strToCharArray[j] == 'e')
				{
					ecount++;
					allCount[3]=ecount;
				}
				else if(strToCharArray[j] == 'h')
				{
					hcount++;
					allCount[4]=hcount;
				}
				else if(strToCharArray[j] == 'f')
				{
					fcount++;
					allCount[5]=fcount;
				}
				
			}//end of inner for
			
		}//end of outer for
		make_meal(allCount,N);
	}
	public static void make_meal(int allCount[],int N)
	{	 int word=0;

		//System.out.println("\n************************************************\n");
	   
		/*
		for( i=0;i<6;i++)
		{
			System.out.print(allCount[i]+"\t");
		}
		*/
		while((allCount[0]!=0) && (allCount[1]!=0) && (allCount[2]!=0) && (allCount[3]!=0) && (allCount[4]!=0) && (allCount[5]!=0) )
		{
			ccount = allCount[0];
			ecount = allCount[3];
			if(ecount >= 2 && ccount >= 2)
			{
				word++;
			}
			allCount[0]=allCount[0] - 2;
			allCount[1]=allCount[1] - 1;
			allCount[2]=allCount[2] - 1;
			allCount[3]=allCount[3] - 2;
			allCount[4]=allCount[4] - 1;
			allCount[5]=allCount[5] - 1;
			
		}
		result[k] = word;
		k++;
		/*
		System.out.println("\n************************************************\n");

		System.out.println();
		*/

	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int T,N=100;
		T = sc.nextInt();
		String str[];
		result = new int[T];
		for(int i=0;i<T;i++)
		{
			N = sc.nextInt();
			str= new String[N];
			for(int j=0;j<N;j++)
			{
				str[j] = sc.next();
			}
			find_occ(str,N);
			

		}
		for(int i=0;i<T;i++)
		{
		System.out.println(result[i]);
		}

	}

}
