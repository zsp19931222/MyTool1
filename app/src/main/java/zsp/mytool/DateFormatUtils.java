package zsp.mytool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 封装的日期计算工具类
 */
public class DateFormatUtils {

    /*
    获取时间差
     */
    public static String getTimesToNow(String startTime, String endTime) {
        String str = null;
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date now = df.parse(endTime);
            Date date = df.parse(startTime);
            long l = now.getTime() - date.getTime();
            long day = l / (24 * 60 * 60 * 1000);
            long hour = (l / (60 * 60 * 1000) - day * 24);
            long min = ((l / (60 * 1000)) - day * 24 * 60 - hour * 60);
            long s = (l / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
            str=hour*60*60+min*60+s+"";
        } catch (Exception e) {

        }
        return str;
    }
}
