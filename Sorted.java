package arrays;

import java.util.Scanner;

public class Sorted {
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
		boolean isSorted=isSorted(arr);
		if(isSorted) {
			System.out.println("Array is sorted");
		}
		else {
			System.out.println("Array is not sorted");
		}
	}
	
	public static boolean isSorted(int[] arr) {
		boolean isSorted=true;
		
		int i=0;
		while(i<arr.length-1) {
			if(arr[i]>arr[i+1]) {
				isSorted=false;
				break;
			}
			i++;
		}
		return isSorted;
		
		
	}

}
