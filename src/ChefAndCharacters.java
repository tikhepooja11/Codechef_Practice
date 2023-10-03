import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class ChefAndCharacters
{
	public static void main (String[] args) throws IOException
	{
	    Scanner sc = new Scanner(System.in);
		int T,index,flag=0,flag1=0,result[],count=0;
		try {
		   T = sc.nextInt();
		   result = new int[T];
		   String str[] = new String[T];
		   for(int i=0;i<T;i++)
		   {
			   str[i] = sc.nextLine();
			   count=0;
			   char charArray[] = str[i].toCharArray();
			   for(int j=0;j<charArray.length;j++)
			   {
				   if(charArray[j] == 'c'|| charArray[j] == 'h' ||charArray[j] == 'f' || charArray[j] == 'e')
				   {
					   
					   int k=j+1;
					   int p=k+3;
					   for(k=j+1;k<p;k++)
					   {
						   char c= charArray[j] ;
						   
						   if(charArray[k] == 'c'|| charArray[k] == 'h' ||charArray[k] == 'f' || charArray[k] == 'e')
						   {
							   flag=1;
						   }
						   else
						   {
							   flag=0;
							   break;
						   }
					   }
					   if(flag==1)
					   {
						   index=j;
						   System.out.println("\nindex:"+index);
						   count=count+1;
					   }
					   flag1=1;
				   }
				   else
				   {
					   flag1=0;
				   }
				   
			   }
			   result[i] = count;
		   }
		   for(int i=0;i<T;i++)
		   {
			   if(flag1==1)
			   {
				   System.out.println("lovely "+result[i]);
			   }
			   else
			   {
				   System.out.println("normal");
			   }
		   }
		} catch(Exception e) {
		} 
	}
}
