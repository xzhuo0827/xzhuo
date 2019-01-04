package com.sboot.mybatis.entity;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public final class UTCTimeUtil {

	private static DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

	public static Date getUTCTime() throws ParseException {
		LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("UTC"));
		String format = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		return sdf.parse(format);
	}

	/**
	 * 将UTC时间转换为东八区时间
	 * 
	 * @param
	 * @return
	 */
	public static Date getLocalTime() throws ParseException {
		LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
		String format = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		return sdf.parse(format);
	}

	/**
	 * 得到UTC时间，类型为字符串，格式为"yyyy-MM-dd HH:mm"<br />
	 * 如果获取失败，返回null
	 * 
	 * @return
	 */
	public static String getUTCTimeStr() {
		LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("UTC"));
		String format = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		return format;
	}

	/**
	 * 将UTC时间转换为东八区时间
	 * 
	 * @param
	 * @return
	 */
	public static String getLocalTimeStr() {
		LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
		String format = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		return format;
	}

	public static void main(String[] args) throws ParseException {

		System.out.println(getUTCTime().toString());
		System.out.println(getUTCTimeStr());
		System.out.println(getLocalTime().toString());
		System.out.println(getLocalTimeStr());
	}

}
