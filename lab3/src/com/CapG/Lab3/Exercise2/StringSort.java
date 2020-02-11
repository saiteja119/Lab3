package com.CapG.Lab3.Exercise2;
public class StringSort {
	void stringUpper(String str[],int size)
	{
		for(int loop=0;loop<size;loop++)
		{
		String strr = str[loop];
		String str1;
		String str2;
		if(strr.length()%2 == 0 )
		{
			int mid =strr.length()/2;
			int last =strr.length();
			str1 = strr.substring(0,mid).toUpperCase();
			str2 = strr.substring(mid,last).toLowerCase();
		}
		else
		{
			int mid = (strr.length()/2)+1;
			int last = strr.length();
			str1=strr.substring(0,mid).toUpperCase();
			str2 =strr.substring(mid,last).toLowerCase();
		}
		str[loop]=str1+str2;
	}
	}
}