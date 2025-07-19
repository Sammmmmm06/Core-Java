package arrays;

import java.util.Scanner;

public class Sum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter sixe of array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	
	for(int i=0;i<n;i++) {
		System.out.println("Enter element ");
		arr[i]=sc.nextInt();
	}
	int sum=0;
	
	for(int i=0;i<n;i++) {
		sum+=arr[i];
	}
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
	float  average=(float)sum/n;
	System.out.println("The sum of elements of array is "+ sum);
	System.out.println("The average of elements of array is "+ average);
	sc.close();
}
}
