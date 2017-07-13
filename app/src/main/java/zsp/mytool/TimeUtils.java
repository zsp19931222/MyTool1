package zsp.mytool;

import android.util.Log;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeUtils {
    public static String DealTime1(long redpacket_time) {
        Date date = new Date(redpacket_time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String time = sdf.format(date);
        return time;
    }

    public static String settng(long redpacket_time) {
        Date date = new Date(redpacket_time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        String time = sdf.format(date);
        return time;
    }

    public static String DealTime2(long redpacket_time) {
        Date date = new Date(redpacket_time);
        SimpleDateFormat sdf = new SimpleDateFormat(
                "HH-mm-ss");
        String time = sdf.format(date);
        return time;
    }

    public static String Time(long redpacket_time) {
        Date date = new Date(redpacket_time);
        SimpleDateFormat sdf = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss:SSS");
        String time = sdf.format(date);
        return time;
    }

    public static String Year(long redpacket_time) {
        Date date = new Date(redpacket_time);
        SimpleDateFormat sdf = new SimpleDateFormat(
                "yyyy");
        String time = sdf.format(date);
        return time;
    }

    public static String Month(long redpacket_time) {
        Date date = new Date(redpacket_time);
        SimpleDateFormat sdf = new SimpleDateFormat(
                "MM");
        String time = sdf.format(date);
        return time;
    }

    public static String Hour(long redpacket_time) {
        Date date = new Date(redpacket_time);
        SimpleDateFormat sdf = new SimpleDateFormat(
                "HH");
        String time = sdf.format(date);
        return time;
    }

    public static String Second(long redpacket_time) {
        Date date = new Date(redpacket_time);
        SimpleDateFormat sdf = new SimpleDateFormat(
                "ss");
        String time = sdf.format(date);
        return time;
    }

    public static String Day(long redpacket_time) {
        Date date = new Date(redpacket_time);
        SimpleDateFormat sdf = new SimpleDateFormat(
                "dd");
        String time = sdf.format(date);
        return time;
    }

    public static String Minute(long redpacket_time) {
        Date date = new Date(redpacket_time);
        SimpleDateFormat sdf;
        if (redpacket_time <= 600000) {
            sdf = new SimpleDateFormat(
                    "m");
        } else {
            sdf = new SimpleDateFormat(
                    "mm");
        }
        String time = sdf.format(date);
        return time;
    }

    /**
     * 精确到秒
     **/
    public static String Time1(long redpacket_time) {
        Date date = new Date(redpacket_time);
        SimpleDateFormat sdf = new SimpleDateFormat(
                "mm:ss");
        String time = sdf.format(date);
        return time;
    }

    public static String SR(long redpacket_time) {
        Date date = new Date(redpacket_time);
        SimpleDateFormat sdf = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(date);
        return time;
    }


    /**
     * 精确到秒
     **/
    public static String Time7(long redpacket_time) {
        Date date = new Date(redpacket_time);
        SimpleDateFormat sdf = new SimpleDateFormat(
                "MM-dd");
        String time = sdf.format(date);
        return time;
    }

    /**
     * 不要年月日
     **/
    public static String Time3(long redpacket_time) {
        String b = null;
        Date date = new Date(redpacket_time);
        SimpleDateFormat sdf = new SimpleDateFormat(
                "mm:ss:SS");
        String time = sdf.format(date);
        if (time.length() > 8) {
            b = time.substring(0, 8);
        }
        return b;
    }

    /**
     * 精确到天
     **/
    public static String Time2(long redpacket_time) {
        Date date = new Date(redpacket_time);
        SimpleDateFormat sdf = new SimpleDateFormat(
                "yyyy-MM-dd");
        String time = sdf.format(date);
        return time;
    }

    /**
     * 精确到天
     **/
    public static String Time4(long redpacket_time) {
        Date date = new Date(redpacket_time);
        SimpleDateFormat sdf = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss:SSS");
        String time = sdf.format(date);
        return time;
    }

    /**
     * 精确到天
     **/
    public static String Time6(long redpacket_time) {
        Date date = new Date(redpacket_time);
        SimpleDateFormat sdf = new SimpleDateFormat(
                "hh:mm");
        String time = sdf.format(date);
        return time;
    }
    public static String Time8(long redpacket_time) {
        Date date = new Date(redpacket_time);
        SimpleDateFormat sdf = new SimpleDateFormat(
                "HH:mm");
        String time = sdf.format(date);
        return time;
    }

    /**
     * 精确到天
     **/
    public static String Time5(long redpacket_time) {
        Date date = new Date(redpacket_time);
        SimpleDateFormat sdf = new SimpleDateFormat(
                "MM-dd HH:mm");
        String time = sdf.format(date);
        return time;
    }

    public static String getTimeDataForYearsToNumber(long currentTime) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        String time = dateFormat.format(currentTime);
        return time;
    }

    /**
     * 获取时间差
     */
    public static String isTime_Difference(long diff) {
        long days = diff / (1000 * 60 * 60 * 24);
        long hours = (diff - days * (1000 * 60 * 60 * 24)) / (1000 * 60 * 60);
        long minutes = (diff - days * (1000 * 60 * 60 * 24) - hours
                * (1000 * 60 * 60))
                / (1000 * 60);
        if (days != 0) {
            return TimeUtils.DealTime1(diff);
        } else if (days == 0 && hours != 0) {
            return hours + "小时前";
        } else if (days == 0 && hours == 0 && minutes > 10) {
            return minutes + "分钟前";
        } else {
            return "刚刚";
        }
    }

    /**
     * 获取当前网络时间
     */
    public static int isGetNetTime() {
        URL url = null;//取得资源对象
        Date date = null;//取得资源对象
        try {
            url = new URL("https://www.baidu.com/");
            URLConnection uc = url.openConnection();//生成连接对象
            uc.connect(); //发出连接
            long ld = uc.getDate(); //取得网站日期时间
            date = new Date(ld); //转换为标准时间对象

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return date.getYear();
    }

    /**
     * 日期格式字符串转换成时间戳
     *
     * @param format 如：yyyy-MM-dd
     * @return
     */
    public static String date2TimeStamp(String date_str, String format) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            return String.valueOf(sdf.parse(date_str).getTime() / 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 获取两个日期之间的间隔天数
     *
     * @return
     */
    public static long getGapCount(String startTime, String endTime) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date end = df.parse(endTime);
        java.util.Date start = df.parse(startTime);
        long l = end.getTime() - start.getTime();
        long day = l / (24 * 60 * 60 * 1000);
        return day;
    }

    /**
     * 获取结束时间
     *
     * @return
     */
    public static long getEndTime(String startTime, long day) {
        long endtart = 0;
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date start = df.parse(startTime);
            endtart = day * (24 * 60 * 60 * 1000) + start.getTime();
        } catch (ParseException e) {
        }
        return endtart;
    }
}
