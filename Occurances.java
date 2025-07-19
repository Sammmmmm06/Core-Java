package arrays;

import java.util.Scanner;

public class Occurances {
	public static void main(String[] args) {
		System.out.println("Welcome to Occurance Calculator");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of your array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		int i=0;
		while(i<n) {
			System.out.println("Enter element "+ i+" of array");
			arr[i]=sc.nextInt();
			i++;
		}
		System.out.println("Enter Element whose occurances you want to find");
		int a=sc.nextInt();
		System.out.println("Your array is");
		int j=0;
		while(j<n) {
			System.out.print(arr[j]+" ");
			j++;
		}
		System.out.println("Number of Ocuurances of "+a +" in the array = "+occrances(arr,a));
		
		
	}
	public static int occrances( int arr[],int a) {
		int count=0;
		int i=0;
		while(i<arr.length) {
			if(arr[i]==a) {
				count++;
			}
			i++;
		}
		return count;
	}
	

}
