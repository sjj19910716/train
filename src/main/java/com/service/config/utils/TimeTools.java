package com.service.config.utils;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 日期处理工具类
 */
public class TimeTools {

    public static final long DAY = 24 * 60 * 60 * 1000;

    public static final long HOUR = 60 * 60 * 1000;

    public static final long MINUTE = 60 * 1000;

    private static final DateFormat DATE_FROMAT = new SimpleDateFormat("yyyy-MM-dd");

    private static final DateFormat DATETIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static final DateFormat DATETIME_FORMAT1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    private static final DateFormat DATETIME_FORMAT2 = new SimpleDateFormat("MM/dd/yyyy HH:mm");

    private static final DateFormat TIME_FORMAT = new SimpleDateFormat("HH:mm:ss");

    private static final DateFormat SIMPLE_DATETIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    private static final DateFormat DATE_FORMAT_LONG = new SimpleDateFormat("yyyyMMddHHmmss");

    /**
     * 日期对象格式化为string
     *
     * @param date
     * @return
     */
    public static String formatDate(Date date) {
        try {
            return DATE_FROMAT.format(date);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 201711111100000
     *
     * @param date
     * @return
     */
    public static String formatLongDate(Date date) {
        try {
            return DATE_FORMAT_LONG.format(date);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 日期对象格式化为string
     *
     * @param date
     * @param format
     * @return
     */
    public static String formatDate(Date date, String format) {
        try {
            DateFormat df = new SimpleDateFormat(format);
            return df.format(date);
        } catch (Exception e) {
            return null;
        }

    }

    /**
     * 带时间的日期对象格式化为string
     *
     * @param datetime
     * @return
     */
    public static String formatDatetime(Date datetime) {
        try {
            return DATETIME_FORMAT.format(datetime);
        } catch (Exception e) {
            return null;
        }

    }

    /**
     * 带时间的日期对象格式化为string
     *
     * @param datetime
     * @return
     */
    public static String formatSimpleDatetime(Date datetime) {
        try {
            return SIMPLE_DATETIME_FORMAT.format(datetime);
        } catch (Exception e) {
            return null;
        }

    }

    /**
     * 带时间的日期对象格式化为string
     *
     * @param datetime
     * @param format
     * @return
     */
    public static String formatDatetime(Date datetime, String format) {
        try {
            DateFormat df = new SimpleDateFormat(format);
            return df.format(datetime);
        } catch (Exception e) {
            return null;
        }

    }

    /**
     * string日期转换为日期对象
     *
     * @param date
     * @return
     */
    public static Date parseDate(String date) {
        if (date == null) return null;

        try {
            return DATE_FROMAT.parse(date.trim());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * string日期转换为日期对象
     *
     * @param date
     * @param format
     * @return
     */
    public static Date parseDate(String date, String format) {
        try {
            DateFormat df = new SimpleDateFormat(format);
            return df.parse(date.trim());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 带时间的string日期转换为日期对象
     *
     * @param datetime
     * @return
     */
    public static Date parseSimpleDatetime(String datetime) {
        if (datetime == null) return null;

        try {
            return SIMPLE_DATETIME_FORMAT.parse(datetime.trim());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 带时间的string日期转换为日期对象
     *
     * @param datetime
     * @return
     */
    public static Date parseDatetime(String datetime) {
        try {
            return DATETIME_FORMAT.parse(datetime.trim());
        } catch (Exception e) {
            return null;
        }
    }

    public static Date parseDatetime1(String datetime) {
        try {
            return DATETIME_FORMAT1.parse(datetime.trim());
        } catch (Exception e) {
            return null;
        }
    }

    public static Date parseDatetime2(String datetime) {
        try {
            return DATETIME_FORMAT2.parse(datetime.trim());
        } catch (Exception e) {
            return null;
        }
    }


    /**
     * 带时间的string日期转换为日期对象
     *
     * @param datetime
     * @param format
     * @return
     */
    public static Date parseDatetime(String datetime, String format) {
        try {
            DateFormat df = new SimpleDateFormat(format);
            return df.parse(datetime.trim());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 解析时间
     *
     * @param datetime
     * @return
     */
    public static Date parseTime(String datetime) {
        try {
            String dateStr = formatDate(new Date(), "yyyy-MM-dd");

            return parseDatetime(dateStr.trim() + " " + datetime.trim());
        } catch (Exception e) {
            return null;
        }
    }


    /**
     * 获取当期日期
     *
     * @return
     */
    public static Date getCurrentDate() {
        return new Date();
    }

    /**
     * 获取当期日期
     *
     * @return
     */
    public static Date getDate() {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
    }

    /**
     * 获取时间，格式如yyyyMMddHHmmss
     *
     * @return
     */
    public static String getCurrentDatetime() {
        String d = TimeTools.formatDatetime(new Date());
        String ymd = d.substring(0, 10);
        String hms = d.substring(11, d.length());
        ymd = ymd.replace("-", "");
        hms = hms.replace(":", "");
        return ymd + hms;
    }

    /**
     * 获取当前日期增加几天后的日期
     *
     * @param date
     * @param amount
     * @return
     */
    public static Date addDays(Date date, int amount) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DAY_OF_MONTH, amount);
        return c.getTime();
    }

    /**
     * 获取当前日期减去几天后的日期
     *
     * @param date
     * @param amount
     * @return
     */
    public static Date subDays(Date date, int amount) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DAY_OF_MONTH, 0 - amount);
        return c.getTime();
    }

    /**
     * 获取当前时间增加几小时后的时间
     *
     * @param date
     * @param amount
     * @return
     */
    public static Date addHours(Date date, int amount) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.HOUR_OF_DAY, amount);
        return c.getTime();
    }

    /**
     * 获取当前时间减去几小时后的时间
     *
     * @param date
     * @param amount
     * @return
     */
    public static Date subHours(Date date, int amount) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        amount = 0 - amount;
        c.add(Calendar.HOUR_OF_DAY, amount);
        return c.getTime();
    }

    /**
     * 分钟加
     *
     * @param date
     * @param amount
     * @return
     */
    public static Date addMinute(Date date, int amount) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.MINUTE, amount);
        return c.getTime();
    }

    /**
     * 分钟减
     *
     * @param date
     * @param amount
     * @return
     */
    public static Date subMinute(Date date, int amount) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        amount = 0 - amount;
        c.add(Calendar.MINUTE, amount);
        return c.getTime();
    }

    /**
     * 月份加
     *
     * @param date
     * @param amount
     * @return
     */
    public static Date addMonth(Date date, int amount) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.MONTH, amount);
        return c.getTime();
    }

    /**
     * 月份减
     *
     * @param date
     * @param amount
     * @return
     */
    public static Date subMonth(Date date, int amount) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        amount = 0 - amount;
        c.add(Calendar.MONTH, amount);
        return c.getTime();
    }

    /**
     * 两个日期之间相差的天数
     *
     * @param begin
     * @param end
     * @return
     */
    public static long days(Date begin, Date end) {
        long between = end.getTime() - begin.getTime();// 得到两者的毫秒数
        return between / DAY;
    }

    /**
     * 两个日期之间相差的天数
     *
     * @param begin
     * @param end
     * @return
     */
    public static int daysBetween(Date begin, Date end) {
        Date b = TimeTools.parseDate(TimeTools.formatDate(begin));
        Date e = TimeTools.parseDate(TimeTools.formatDate(end));
        long between = e.getTime() - b.getTime();// 得到两者的毫秒数
        if (between < 0) {
            between = 0 - between;
        }
        long days = between / DAY;
        return (int) days;
    }

    /**
     * 两个日期之间相差的天数
     *
     * @param begin
     * @param end
     * @return
     */
    public static int daysBetween(String begin, String end) {
        Date b = TimeTools.parseDate(begin);
        Date e = TimeTools.parseDate(end);
        long between = e.getTime() - b.getTime();// 得到两者的毫秒数
        if (between < 0) {
            between = 0 - between;
        }
        long days = between / DAY;
        return (int) days;
    }

    public static String daysBetweenNew(Date begin) {
        if (begin == null) {
            return null;
        }
        String beginStr = formatDatetime(begin);
        Date date = new Date();
        String endStr = formatDatetime(date);
        int i = daysBetween(beginStr, endStr);
        if (i != 0) {
            return i + "天前";
        }
        Date b = TimeTools.parseDatetime(beginStr);
        Date e = TimeTools.parseDatetime(endStr);
        long between = e.getTime() - b.getTime();// 得到两者的毫秒数
        if (between < 0) {
            between = 0 - between;
        }
        return between / HOUR + "小时前";
    }


    public static String getDaysAndHoursElse(Date end) {
        if (end == null) {
            return null;
        }
        String endStr = formatDatetime(end);
        Date begin = new Date();
        String beginStr = formatDatetime(begin);
        Date b = TimeTools.parseDatetime(beginStr);
        Date e = TimeTools.parseDatetime(endStr);
        long between = e.getTime() - b.getTime();// 得到两者的毫秒数
        if (between < 0) {
            between = 0 - between;
        }
        return "剩余" + between / HOUR + "小时" + (between % HOUR) / MINUTE + "分";
    }


    /**
     * 当时时间是否在开始时间和结束时间中间
     *
     * @param start
     * @param end
     * @return
     */
    public static boolean curTimeBetween(Date start, Date end) {
        Date curDate = getCurrentDate();
        if (after(curDate, start) && after(end, curDate)) {
            return true;
        }

        return false;
    }

    /**
     * 获取日期段之间的日期
     *
     * @param begin
     * @param end
     * @return
     */
    public static List<Date> betweenDays(String begin, String end) {
        int days = daysBetween(begin, end);
        Date b = TimeTools.parseDate(begin);
        List<Date> list = new ArrayList<Date>();
        list.add(b);
        Date temp = b;
        for (int i = 0; i < days; i++) {
            temp = addDays(temp, 1);
            list.add(temp);
        }
        return list;
    }

    /**
     * 获取日期段之间的日期
     *
     * @param begin
     * @param end
     * @return
     */
    public static List<Date> betweenDays(Date begin, Date end) {
        int days = daysBetween(begin, end);
        List<Date> list = new ArrayList<Date>();
        list.add(begin);
        Date temp = begin;
        for (int i = 0; i < days; i++) {
            temp = addDays(temp, 1);
            list.add(temp);
        }
        return list;
    }

    /**
     * 两个日期之间相差的秒数
     *
     * @param begin
     * @param end
     * @return
     */
    public static long seconds(Date begin, Date end) {
        long between = end.getTime() - begin.getTime();// 得到两者的毫秒数
        return between / 1000;
    }

    /**
     * 判断日期date是否在begin,end日期范围之内
     *
     * @param
     * @param begin
     * @param end
     * @return
     */
    public static boolean dateRange(Date date, Date begin, Date end) {
        if (date == null || begin == null || end == null) {
            return false;
        }
        return date.getTime() >= begin.getTime() && date.getTime() <= end.getTime();
    }

    /**
     * 判断当前时间是否在begin,end日期范围之内
     *
     * @param
     * @param begin
     * @param end
     * @return
     */
    public static boolean dateRange(Date begin, Date end) {
        return dateRange(TimeTools.getCurrentDate(), begin, end);
    }

    /**
     * 获取当前日期的最小和最大日期
     *
     * @param date
     * @return
     */
    public static Date[] getMinAndMaxDate(Date date) {

        Calendar c = Calendar.getInstance();
        c.setTime(date);

        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        Date begin = c.getTime();

        c.set(Calendar.HOUR_OF_DAY, 23);
        c.set(Calendar.MINUTE, 59);
        c.set(Calendar.SECOND, 59);
        Date end = c.getTime();

        return new Date[]{begin, end};

    }

    /**
     * 获取一个月的第一天
     *
     * @param date
     * @return
     */
    public static Date getMonthMin(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.DATE, 1);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        return c.getTime();
    }

    /**
     * 获取一个月的第一天 和 最后一天
     *
     * @param date
     * @return
     */
    public static Date[] getMonthMinAndMaxDate(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.DATE, 1);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        Date begin = c.getTime();
        c.add(Calendar.MONTH, 1);
        c.add(Calendar.DAY_OF_YEAR, -1);
        c.set(Calendar.HOUR_OF_DAY, 23);
        c.set(Calendar.MINUTE, 59);
        c.set(Calendar.SECOND, 59);
        Date end = c.getTime();
        return new Date[]{begin, end};
    }

    public static int getWeek(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.DAY_OF_WEEK) - 1;
    }

    public static int getWeekOfMonth(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.WEEK_OF_MONTH);
    }

    public static String getWeekDesc(Date date) {
        int week = getWeek(date);
        switch (week) {
            case 0:
                return "星期日";
            case 1:
                return "星期一";
            case 2:
                return "星期二";
            case 3:
                return "星期三";
            case 4:
                return "星期四";
            case 5:
                return "星期五";
            case 6:
                return "星期六";

        }
        return null;
    }

    /**
     * 获取当前日期的最小日期
     *
     * @param date
     * @return
     */
    public static Date getMinDate(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        return c.getTime();
    }

    /**
     * 获取当前日期的最大日期
     *
     * @param date
     * @return
     */
    public static Date getMaxDate(Date date) {
        if (date == null) {
            return null;
        }
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY, 23);
        c.set(Calendar.MINUTE, 59);
        c.set(Calendar.SECOND, 59);
        return c.getTime();
    }

    /**
     * 获取日期中的小时
     *
     * @param date
     * @return
     */
    public static int getHour(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.HOUR_OF_DAY);
    }

    /**
     * 判断d1是否大于或等于d2
     *
     * @param d1
     * @param d2
     * @return
     */
    public static boolean equalsOrAfter(Date d1, Date d2) {
        if (d1 != null && d2 != null) {
            return d1.after(d2) || d1.equals(d2);
        }
        if (d1 != null && d2 == null) {
            return true;
        }
        return false;
    }

    /**
     * 判断d1是否大于d2
     *
     * @param d1
     * @param d2
     * @return
     */
    public static boolean after(Date d1, Date d2) {
        if (d1 != null && d2 != null) {
            return d1.after(d2);
        }
        if (d1 != null && d2 == null) {
            return true;
        }
        return false;
    }

    /**
     * 计算d1 和 d2的时间差
     *
     * @param d1
     * @param d2
     * @return
     */
    public static long[] getDistanceTimes(Date d1, Date d2) {
        long day = 0;
        long hour = 0;
        long min = 0;
        long sec = 0;
        long diff = 0;
        if (d1.getTime() > d2.getTime()) {
            diff = d1.getTime() - d2.getTime();
        } else {
            diff = d2.getTime() - d1.getTime();
        }
        day = diff / (24 * 60 * 60 * 1000);
        hour = (diff / (60 * 60 * 1000) - day * 24);
        min = ((diff / (60 * 1000)) - day * 24 * 60 - hour * 60);
        sec = (diff / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
        return new long[]{day, hour, min, sec};
    }

    /**
     * 获取日期中的日
     *
     * @param date
     * @return
     */
    public static int getDay(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * 设置日期的小时
     *
     * @param date
     * @param hour
     * @return
     */
    public static Date setHour(Date date, int hour) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY, hour);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
    }

    /**
     * 设置日期的小时和分钟
     *
     * @param date
     * @param hour
     * @param min
     * @return
     */
    public static Date setTime(Date date, int hour, int min) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY, hour);
        c.set(Calendar.MINUTE, min);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
    }

    /**
     * 获取本周是这一年中的第几周
     *
     * @param date
     * @return
     */
    public static int getWeekOfYear(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.WEEK_OF_YEAR);
    }

    /**
     * 获取月份
     *
     * @param date
     * @return
     */
    public static int getMonth(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.MONTH) + 1;
    }

    /**
     * 获取年份
     *
     * @param date
     * @return
     */
    public static int getYear(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.YEAR);
    }

    /**
     * 获取某天的开始时间
     *
     * @param date 日期
     * @return 某天的开始时间
     */
    public static Date getBeginTimeOfDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 获取某天的结束时间
     *
     * @param date 日期
     * @return 某天的结束时间
     */
    public static Date getEndTimeOfDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        return calendar.getTime();
    }


    //  java.util.Date --> java.time.LocalDateTime
    public  static LocalDateTime UDateToLocalDateTime( Date date) {
        Instant instant = date.toInstant();
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
        return localDateTime;
    }

    //  java.time.LocalDateTime --> java.util.Date
    public  static Date LocalDateTimeToUdate( LocalDateTime localDateTime) {
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zone).toInstant();
        Date date = Date.from(instant);
        return  date;
    }

    public static int dateTime2Unixtime(Date date) {
        Long time = (date.getTime() / 1000);
        int i = time.intValue();
        return i;
    }
    // 获得两个时间在秒数数上是否相等
    public static boolean equalTime(Date d1,Date d2) {
        BigDecimal time1 =  new BigDecimal(d1.getTime() / 1000);
        //System.out.println(time1);
        BigDecimal time2= new BigDecimal(d2.getTime() / 1000);
        //System.out.println(time2);
       if(time1.compareTo(time2)>=0){
           return true;
       }
        return false;
    }
}
