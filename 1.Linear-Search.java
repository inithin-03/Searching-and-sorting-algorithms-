package search;
import java.util.*;
public class LinearSearch {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int i;
	System.out.println("enter value n:");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter array element:");
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
		}
	System.out.println("enter key element:");
	int key=sc.nextInt();
	for(i=0;i<n;i++) {
		if(a[i]==key)
		{
			System.out.println("key element found at location:"+(i+1));
			break;
		}
	}
	if(i==n)
	{
		System.out.println("element not found");
	}
	sc.close();
	
}
}
