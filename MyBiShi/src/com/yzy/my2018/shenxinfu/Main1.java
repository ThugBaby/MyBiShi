package com.yzy.my2018.shenxinfu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine();
		int count = 1;
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < temp.length(); i++) {
			if (i + 1 != temp.length()) {

				if (temp.charAt(i) == temp.charAt(i + 1)) {
					count++;
				} else {
					if (!list.contains(count + "" + temp.charAt(i)))
						list.add(count + "" + temp.charAt(i));
					count = 1;
				}
			} else {
				if (temp.charAt(i) != temp.charAt(i - 1)) {
					if (!list.contains(1 + "" + temp.charAt(i)))
						list.add(1 + "" + temp.charAt(i));
				}
			}
		}
		for (String v : list) {
			System.out.print(v + " ");
		}
	}
}
