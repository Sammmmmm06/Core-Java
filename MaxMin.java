package arrays;

import java.util.Scanner;

public class MaxMin {
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
		int max=max(arr);
		System.out.println("The maximum element of array is "+max);
		int min=min(arr);
		System.out.println("The minimum element of array is "+min);
}
	public static int max(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
		
		
	}
	public static int min(int[] arr) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
		
		
	}
}
