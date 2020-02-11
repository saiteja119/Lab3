package com.CapG.Lab3.exercise3;

import java.util.Arrays;
import java.util.Scanner;
public class ReverseSort{
	 int reverse(int num)
	{
		int rev=0;
		while(num!=0)
		{
		int temp =num%10;
		rev=rev*10+temp;
		num = num/10;
		}
		return rev;
	}
}