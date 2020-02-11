package com.CapG.Lab3.Exercise1;

import java.util.Arrays;
import java.util.Scanner;

public class Final {
	public static void main(String[] args) {
		MinNElement me = new MinNElement();
		Scanner sc=new Scanner(System.in);
		System.out.println("size");
		int size =sc.nextInt();
		int arr[] = new int[size];
		System.out.println("elements");
		for(int insert=0;insert<size;insert++)
		{
			arr[insert]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(" Which Min Element");
		int min=sc.nextInt();
		System.out.println(" Which Max Element");
		int max =sc.nextInt();
		me.minElement(min,arr);
		me.maxElement(max,size,arr);
	}
}
