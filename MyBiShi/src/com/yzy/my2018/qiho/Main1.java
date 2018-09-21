package com.yzy.my2018.qiho;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n = Integer.valueOf(sc.nextLine());
		String[] temp=sc.nextLine().split(" ");
		int max=0;
		int pos=0;
		int sum=0;
		int count=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=Integer.valueOf(temp[i]);
		if(n<3) 
		{
			System.out.println(0);
			return;
		}	
		else
			for(int i=2;i<n;i++)
			{
				
				for(int j=0;j<=i;j++)
				{
					if(max<arr[j])
					{
						max=arr[j];
						pos=j;
					}
				}
				for(int m=0;m<i;m++)
				{
					if(m!=pos)
					{
						sum+=arr[m];
					}
				}
				if(max<sum)
				{
					count=i+1;
					break;
				}
				
			}
		System.out.println(count);
	}
	//public  static boolean check(arr) 
}
