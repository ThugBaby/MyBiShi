package com.yzy.my2018.shenxinfu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");
		Date nowday=sdf.parse("2018 8 1");
		
		Date myday=sdf.parse(line);
		
		long mine = myday.getTime();
		long day = (nowday.getTime()-mine) / 1000 / 60 / 60 / 24;
		System.out.println(day);
	}

}
