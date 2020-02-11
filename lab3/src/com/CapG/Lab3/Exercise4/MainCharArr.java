package com.CapG.Lab3.Exercise4;
import java.util.*;
public class MainCharArr {
	public static void main(String[] args) {
		CharArray ca =new CharArray();
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		char[] arr =new char[size];
		for(int insert=0;insert<size;insert++)
		{
			arr[insert]=sc.next().charAt(0);
		}
		ca.charArr(arr);
	}

}
