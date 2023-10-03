/*Search for Nth Occurrence(completed)

Given an array, number to search (say e1), and occurrence (say n),
 print the index of the nth occurrence of e1 in the array. If e1 does not occur n times, then print the index as -1.
step 1: take size of array;
step 2 :take array;
step 3 :take element to be search for occurence
step 4 : find its no of occurences
step 5 : check if (the index of last occurence != the no of occurences) then print -1*******/

import java.util.*;

 class NthOccurrence {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0,index=0;
		int n = sc.nextInt();
		int[] array = new int[n]; // combining both statements in one
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
			
		}
		System.out.println("Enter the elemenet to be search");
		int searchElement=sc.nextInt();
		System.out.println("Enter the occurence of that element "+searchElement);
		int actualCount=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(array[i]==searchElement)
			{
				count=count+1;
				index=i;
				if(count==actualCount)
				{
					if(index!=searchElement)
					{
						index=-1;
					}
					else
					{
						index=searchElement;
					}
				}
				
			}
		}
		System.out.println(index);

	}
	

}
