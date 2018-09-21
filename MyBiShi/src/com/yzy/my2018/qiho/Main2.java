package com.yzy.my2018.qiho;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		int hex = 0;
		int l = 0;
		int r = 0;
		int[] result =new int[n];
		
		for (int i = 0; i < n; i++) {
			String[] temp = sc.nextLine().split(" ");
			hex = Integer.valueOf(temp[0]);
			l = Integer.valueOf(temp[1]);
			r = Integer.valueOf(temp[2]);
			result[i]= getResult(hex, l, r);
		}
		printArray(result);
	}

	public static int getResult(int hex, int l, int r) {
		Stack<Integer> s = new Stack<>();
		int max = 0;
		int count = 0;
		int result = 0;
		int p = 0;
		String t;
		for (int i = l; i <= r; i++) {
			p = i;
			do {
				s.push(p % hex);
				p = p / hex;
			} while (p != 0);
			for (Integer a : s) {
				if (a == hex - 1)
					count++;
			}
			if (count > max) {
				max = count;
				result = i;
			}
			s.clear();
			count = 0;
		}
		return result;
	}

	// ´òÓ¡Êý×é
	public static void printArray(int[] arr) {
		if (arr == null) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
}
