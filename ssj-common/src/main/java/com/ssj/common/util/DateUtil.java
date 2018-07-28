package com.ssj.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.util.StringUtils;


/*
 * 日期工具类
 */
public class DateUtil extends DateUtils{

	private static String[] parsePatterns = {
		"yyyyMMddHHmmss", "yyyy-MM-dd HH:mm:ss", "yyyy/MM/dd HH:mm:ss", "yyyy.MM.dd HH:mm:ss",
		"yyyyMMddHHmm", "yyyy-MM-dd HH:mm", "yyyy/MM/dd HH:mm", "yyyy.MM.dd HH:mm",
		"yyyyMMddHH", "yyyy-MM-dd HH", "yyyy/MM/dd HH", "yyyy.MM.dd HH",
		"yyyyMMdd", "yyyy-MM-dd",  "yyyy/MM/dd", "yyyy.MM.dd"
		};
	
	public static Date autoParseDate(String str) {
		if (StringUtils.isEmpty(str)) 
			return null;
		try {
			return parseDate(str.toString(),null, parsePatterns);
		} catch (ParseException e) {
		}
		return null;
	}
	
	public static String convertStr(Date date,String pattern) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		try {
			return dateFormat.format(date);
		} catch (Exception e) {
		}
		return null;
	} 
	
	
	public static Date convertDate(String date,String pattern) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		try {
			return dateFormat.parse(date);
		} catch (ParseException e) {
		}
		return null ;
	}
	/**
	 * 获取n天前日期
	 * @param date
	 * @param n
	 */
	public static Date getBeforeNDate(Date date,int n) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, -n);
		return calendar.getTime();
	}
	
	
	public static Date getCurrentMonthFirstDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, 0);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		return calendar.getTime();
	}
	
	public static Date getCurrentMonthLastDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, 1);
		calendar.set(Calendar.DAY_OF_MONTH, 0);
		return calendar.getTime();
	}
	
	public static int dateCompare(String s1,String s2,String pattern){  
	    try {  
	        Date d1 = convertDate(s1,pattern);  
	        Date d2 = convertDate(s2,pattern);  
	        return (int)((d1.getTime() - d2.getTime())/(24*3600*1000));  
	    } catch (Exception e) {  
	    }  
	    return 0;  
	} 
}
