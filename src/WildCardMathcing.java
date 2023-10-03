import java.util.*;
import java.lang.*;
import java.io.*;

public class WildCardMathcing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();
		String str1,str2;
		String result[] = new String[T];
		

		for(int i=0;i<T;i++)
		{
			str1 = sc.next();
			str2 = sc.next();

			char charArray1[] = str1.toCharArray();
			char charArray2[] = str2.toCharArray();
			boolean flag[] = new boolean[charArray1.length];
			for(int j=0;j<charArray1.length;j++)
			{
				if( charArray1[j] == charArray2[j] ) 
				{
						flag[j]=true;
				}
				else if( charArray1[j] != charArray2[j] ) 
				{
					if(((charArray1[j] == '?')||(charArray2[j] == '?')) || ((charArray1[j] == '?')&&(charArray2[j] == '?')))
					{
						flag[j]=true;
					}
					else
					{
						flag[j]=false;					
					}
				}
				int flag1=0;
				for(int k=0;k<charArray1.length;k++)
				{
					if(flag[k]==true)
					{
						flag1=1;
					}
					else
					{
						flag1=0;
						break;
					}
				}
				if(flag1==1)
				{
					result[i]="Yes";
				}else
				{
					result[i]="No";
				}
			}
			
		}
		for(int i=0;i<T;i++)
		{
			System.out.println(result[i]);
		}

	}

}
