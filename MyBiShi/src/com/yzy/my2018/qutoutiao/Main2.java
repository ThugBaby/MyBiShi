package com.yzy.my2018.qutoutiao;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		int j=0;
		int count=0;
		for(int i=0;i<n;i++)
		{
			j=i;
			while(j>0)
			{
				if(j%10==2)
				   count++;
				j=j/10;
			}
		}
		System.out.println(count);
		
		
	}
}
