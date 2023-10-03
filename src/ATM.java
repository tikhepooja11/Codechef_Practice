import java.io.*;
import java.util.*;

class ATM{
	
	
	public static void main(String args[]){
		double total,balance=0;
		Scanner sc=new Scanner(System.in);
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		balance=y;
		
		if((x%5==0)||(x%5==5))
		{
			total=x+0.50;
			if(total<balance)
			{
				balance=y-total;
				System.out.printf("%.2f", balance);
			}
			else
			{
				System.out.printf("%.2f", balance);
			}
		}
		else 
		{
			balance=y;
			System.out.printf("%.2f", balance);
		}
		


}


}