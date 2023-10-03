import java.util.*;
import java.io.*;
import java.lang.Math; 
public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		try
		{
			int T,num,turns = 0,result[];
			Scanner sc = new Scanner(System.in);
			T = sc.nextInt();
			result=new int[T];
			for(int i=0;i<T;i++)
			{
				num=sc.nextInt();
				if(num%10 == 0)
				{
					turns=0;
					result[i]=turns;
				}
				else
				{
					while(num%10 !=0)
					{
						num=num*2;
						if(num%10 == 0)
						{
							turns++;
							result[i]=turns;
							break;
						}
					}
					if(num%10 == 0)
					{
						result[i]=turns;
					}else
					{
						result[i]=-1;
					}
				}
				
			}
			for(int i=0;i<T;i++)
			{
				System.out.println(result[i]);
			}
		}catch(Exception e){}

	}

}
/**Chef Two and Chef Ten are playing a game with a number X. In one turn, they can multiply X by 2. The goal of the game is to make X divisible by 10.

Help the Chefs find the smallest number of turns necessary to win the game (it may be possible to win in zero turns) or determine that it is impossible.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer denoting the initial value of X.
Output
For each test case, print a single line containing one integer — the minimum required number of turns or −1 if there is no way to win the game.

Constraints
1≤T≤1000
0≤X≤109
Subtasks
Subtask #1 (100 points): original constraints

Example Input
3
10
25
1
Example Output
0
1
-1*/////
