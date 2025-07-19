package arrays;

import java.util.Scanner;

public class DeleteFromArray {
	


public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter sixe of array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	
	for(int i=0;i<n;i++) {
		System.out.println("Enter element ");
		arr[i]=sc.nextInt();
		
	}
	System.out.println("Enter number you want to delete");
	int a=sc.nextInt();
	int[] newArr=deleteNumber(arr,a);
	System.out.println("Here is your new Array");
	for(int j=0;j<newArr.length;j++) {
		System.out.print(arr[j]);
	}
	
	
}
public static int[] deleteNumber(int[] arr,int a) {
	int occ=Occurances.occrances(arr, a);
	if(occ==0) {
		return arr;
	}
	int newSize=arr.length -occ;
	int[] newArr=new int[newSize];
	
	return newArr;
	
}
}
