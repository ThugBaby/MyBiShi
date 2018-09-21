package com.yzy.my2018.qutoutiao;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] temp = sc.nextLine().toCharArray();
		int l = 0;
		int r = temp.length - 1;
		while (l <= r) {
			swap(temp, l, r);
			l++;
			r--;
		}
		printArray(temp);
	}

	public static void swap(char[] arr, int x, int y) {
		char temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	// ´òÓ¡Êý×é
	public static void printArray(char[] arr) {
		if (arr == null) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] );
		}
		System.out.println();
	}
}
