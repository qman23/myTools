package cn.com.lee.util.date;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.apache.commons.lang3.time.DateUtils;

import cn.com.lee.util.string.StringUtil;

public class DateUtilUsage {
	public static void main(String[] args) {
		System.out.println(StringUtil.center("DateUtil tesing", 50, "="));
		Date current = new Date();
		System.out.println(DateUtil.formateDate(current, "yyyy-MM-dd"));
		System.out.println(DateUtil.formateDate(current, "yyyy-MM-dd hh:mm:ss"));
		System.out.println(DateUtil.formateDate(current, "yyyy/MM/dd hh:mm"));
		
		try {
			System.out.println(DateUtil.parseDate("2017-01-01","yyyy-MM-dd"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println( "Round HOUR: " + DateUtil.round(current,Calendar.HOUR));
		System.out.println( "Round Min: " + DateUtil.round(current,Calendar.MINUTE));
		
		System.out.println( "Truncate HOUR: " +DateUtil.truncate(current, Calendar.HOUR));
		
		System.out.println(StringUtil.repeat("=", 50));
	}
}
