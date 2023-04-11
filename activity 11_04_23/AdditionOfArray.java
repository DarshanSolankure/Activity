package arrays;

import java.util.Scanner;

public class AdditionOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of arry:");
		int size = sc.nextInt();
		int arr1[]=new int [size];
		int arr2[]=new int [size];
		int sum[]=new int[size];
		System.out.println("Enter"+size+"elements of array1:");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the elements of array2:");;
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i] = sc.nextInt();
			sum[i]=arr1[i]+arr2[i];
		}
		System.out.println("Sum of twp array is:");
		for(int i=0;i<sum.length;i++)
		{
			System.out.println(" "+arr1[i]+"+"+arr2[i]+" = "+sum[i]);
		}
	}

}
