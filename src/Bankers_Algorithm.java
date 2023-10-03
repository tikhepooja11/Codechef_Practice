import java.util.*;
public class Bankers_Algorithm {
	int alloc[][],max[][],avail[],need[][],req[],work[],m,n,p;
	boolean fin[];
	Scanner sc = new Scanner(System.in);
	public Bankers_Algorithm()
	{
		System.out.print("Enter no of processes:");
		n=sc.nextInt();
		System.out.println("Enter no of resources:");
		m = sc.nextInt();
		alloc = new int[n][m];
		max = new int[n][m];
		avail = new int[m];
		need = new int[n][m];
		req = new int[m];
		work = new int[m];
		System.out.println("Enter allocation matrix:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				alloc[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter maximum matrix:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				max[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter available matrix:");
		for(int i=0;i<n;i++)
		{
			avail[i]=sc.nextInt();
		}
		

	}
	public void bank()
	{
		need = new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				need[i][j] = max[i][j] - alloc[i][j];
			}
		}
		work = avail;
		if(safety())
		{
			System.out.println("process is in safe state");
		}
		else
		{
			System.out.println("process is not in safe state");
		}
		System.out.println("enter process to be requested");
		p = sc.nextInt();
		System.out.println("Enter request matrix");
		for(int i=0;i<p;i++)
		{
			req[i]=sc.nextInt();
		}
		if(lessthan(req,need,p ) && lessthan(req,avail))
		{
			for(int i=0;i<m;i++)
			{
				avail[i]-=req[i];
				need[p][i]-=req[i];
				alloc[p][i]+=req[i];
			}
			work=avail;
			if(safety())
			{
				System.out.println("Process is safe");
			}
			else 
			{
			System.out.println("Process is not safe");
			for(int i=0;i<m;i++)
			{
				avail[i]+=req[i];
				need[p][i]+=req[i];
				alloc[p][i]-=req[i];
			}
			}
		}
		
		
	}
	public boolean safety()
	{
		int flag=0,index=0,i;
		while(true)
		{
			flag=0;
			for(i=0;i<n;i++)
			{
				if(!fin[i] && !lessthan(work,need,i))
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				fin[i]=true;
				for(int j=0;j<work.length;j++)
				{
					work[j] = work[j] + alloc[i][j];
				}
			}
			else break;
		}
		int flag1=0;
		for(int j=0;j<n;j++)
		{
			if(fin[j]==false)
			{
				flag1=1;
				break;
			}
		}
		if(flag1==1)
			return false;
		return true;
	}
	public boolean lessthan(int a[],int x[][],int b)
	{
		for(int i=0;i<a.length;i++)
		{
			if(x[b][i] <= a[i])
			{
				return false;
			}
		}
		return true;
	}
	public boolean lessthan(int a[],int x[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(x[i] <= a[i])
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Bankers_Algorithm b = new Bankers_Algorithm();
		b.bank();

	}

}
