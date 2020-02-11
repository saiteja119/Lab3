package com.CapG.Lab3.Exercise4;
public class CharArray {
	void charArr(char arr[])
	{
		for(int loop=0;loop<arr.length;loop++)
		{
			char temp =arr[loop];
			int count =0;
			{
			for(int iloop=0;iloop<arr.length;iloop++)
				if(arr[loop] == arr[iloop])
				{
					count++;
				}
			}
			System.out.println(temp+"is repeting for"+count);
		}
	}
}
