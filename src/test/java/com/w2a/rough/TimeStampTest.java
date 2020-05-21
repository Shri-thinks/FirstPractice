package com.w2a.rough;

import java.util.Date;

public class TimeStampTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date=new Date();
		
		String screenShotName = date.toString().replace(":", "_").replace(" ", "_")+".jpg";
		System.out.println(screenShotName);
		
		//System.out.println(date);
	}

}
