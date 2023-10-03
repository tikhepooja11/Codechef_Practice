import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b;
		int result;
		char c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.next().charAt(0);	
			switch(c)
			{
				case '+': result=(int)(a+b);
							System.out.println (result);
							break;
				case '-': result=(int)(a-b);
							System.out.println (result);
							break;
				case '*': System.out.println (a*b);
							break;
				case '/': System.out.println (a/b);
							break;
					
			}
		}

}
