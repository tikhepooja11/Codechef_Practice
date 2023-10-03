import java.io.*;
import java.util.*;
//sort the integers from file and write again sorted integers into the file

public class FileSort
{
	public static void main(String rags[])throws FileNotFoundException, IOException
	{
		File f = new File("input.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		String st;
		int n,i=0;
		int a[] = new int[5];
		while((st = br.readLine()) != null)
		{
			n = Integer.parseInt(st);
			a[i] = n;
			i++;
		}
		
		
			Arrays.sort(a);
		
		FileWriter fw =  new FileWriter("output.txt");
		
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
			st = Integer.toString(a[j]);
			fw.write(st+"\n");
	
		}
		fw.close();
	}

}