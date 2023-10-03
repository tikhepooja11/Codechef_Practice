/*import java.util.*;
import java.lang.Math; 
public class LeadGame {

	int p1[],p2[],N,lead[],player_index,max,p1_total[],p2_total[];
	Scanner sc = new Scanner(System.in);
	LeadGame()
	{
		System.out.println("Enter No. of Rounds:");
		N = sc.nextInt();
		p1 = new int[N];
		p2 = new int[N];
		p1_total = new int[N];
		p2_total = new int[N];
		lead = new int[N];

		System.out.println("Player1 Scores");
		for(int i=0;i<N;i++)
		{
			p1[i] = sc.nextInt();
		}
		System.out.println("Player2 Scores");
		for(int i=0;i<N;i++)
		{
			p2[i] = sc.nextInt();
		}
		
		//finding total of both arrays
		int sum=0;
		for(int i=0;i<N;i++)
		{
			p1_total[i] = sum + p1[i];
		}
		sum=0;
		for(int i=0;i<N;i++)
		{
			p2_total[i] = sum + p2[i];
		}
		findLead();
	}
	public void findLead()
	{
		for(int i=0;i<N;i++)
		{
			lead[i] = Math.abs(p1_total[i] - p2_total[i]);
		}
		
		for(int i=0;i<N;i++)
		{
			max = lead[0];
			if(lead[i] > max)
			{
				max = lead[i];
				player_index=i;
			}
			
		}
		System.out.println((player_index+1)+"\t"+max);
	}
	public static void main(String[] args) {
		LeadGame l = new LeadGame();
		

	}

}
*/

  import java.io.*;
  import java.lang.Math;
import java.util.*;

public class LeadGame
{
	static int p[][],N,lead[],max_index,max,playerNumber,p_total[],p_array[][];
	
	//LeadGame l = new LeadGame();
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		p_array = new int[N][2];
		p_total = new int[N];
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<2;j++)
			{
				p_array[i][j] = sc.nextInt();
			}
		}
		/*
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(p_array[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("\n\n");
		*/
		for(int i=1;i<N;i++)
		{
			for(int j=0;j<2;j++)
			{
				p_array[i][j] =p_array[i-1][j]+ p_array[i][j];
			}
		}
		/*
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(p_array[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
*/
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<2;j++)
			{
				p_total[i] = Math.abs(p_array[i][j] - p_array[i][j+1]);
				break;
			}
		}
		
		//finding max of p_total[]
		for(int i=1;i<N;i++)
		{
			max = p_total[0];
			if(p_total[i] > max)
			{
				max = p_total[i];
				max_index = i;
			}
		}
		
		//finding player with maximum average value by using max_index
		if(p_array[max_index][0] > p_array[max_index][1])
		{
			playerNumber = 1;
		}
		else
		{
			playerNumber=2;
		}
		System.out.println(playerNumber + " "+ max);
		
		
		
	}
}
