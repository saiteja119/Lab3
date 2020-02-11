package com.CapG.Lab3.Exercise2;
import java.util.*;
public class Final {
	public static void main(String[] args) {
		StringSort ss =new StringSort();
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		String str[] =new String[size];
		for(int loop=0;loop<size;loop++)
		{
			str[loop]= sc.next();
		}
		Arrays.sort(str);
		ss.stringUpper(str,size);
		for(String loop: str)
		{
			System.out.println(loop);
		}
	}
}