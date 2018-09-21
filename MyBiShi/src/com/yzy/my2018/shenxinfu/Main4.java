package com.yzy.my2018.shenxinfu;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cur = "";
		String s = "sangfor";
		int j = 0;
		int count = 0;
		while (sc.hasNext()) {
			cur = sc.nextLine();
			for (int i = 0; i < cur.length(); i++) {
				if (j <= s.length() - 1) {
					if (cur.charAt(i) == s.charAt(j)) {
						j++;
						count++;

					}
				}

			}
			System.out.println(count / s.length());
			j = 0;
			count = 0;
		}
	}
}
