package com.CapG.Lab3.exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ReverseSort rs =new ReverseSort();
		Scanner sc=new Scanner(System.in);
		System.out.println("Size");
		int size=sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Elements");
		for(int insert=0;insert<size;insert++)
		{
			arr[insert]=sc.nextInt();
		}
		for(int insert=0;insert<size;insert++)
		{
			arr[insert]=rs.reverse(arr[insert]);
		}
		Arrays.sort(arr);
		for(int temp:arr)
		{
			System.out.println(temp);
		}
		sc.close();
	}
}
