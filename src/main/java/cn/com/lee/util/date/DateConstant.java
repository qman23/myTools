package cn.com.lee.util.date;

import java.util.Calendar;

public enum DateConstant {
	YEAR(Calendar.YEAR),MONTH(Calendar.MONTH),DAY(Calendar.DAY_OF_MONTH);
	
	private int unit;
	private DateConstant(int unit){
		this.unit = unit;
	}
	
	public int getUnit(){
		return this.unit;
	}
}
