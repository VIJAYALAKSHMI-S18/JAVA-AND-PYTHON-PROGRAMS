import java.util.*;
public class Kadane
{
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int i;
	   int arr[]=new int[n];
	   for(i=0;i<n;i++)
	   arr[i]=sc.nextInt();
		int curr=arr[0],maxi=arr[0];
		for(i=1;i<n;i++){
	curr=Math.max(arr[i],curr+arr[i]);
	maxi=Math.max(maxi,curr);
		}

    System.out.println(maxi);    
    }
}
