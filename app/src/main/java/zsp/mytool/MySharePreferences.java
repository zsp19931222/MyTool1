package zsp.mytool;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import service.BlueToothService;

public class MySharePreferences {
    /**
     * 存用户基本信息
     */
    public static void PutUserID(String user_id, Activity activity) {
        SharedPreferences preferences = activity.getSharedPreferences("user_id", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("user_id", user_id);
        editor.commit();
    }

    public static String GetUser_ID(Context activity) {
        SharedPreferences preferences = activity.getSharedPreferences("user_id", Activity.MODE_PRIVATE);
        String user_id1 = preferences.getString("user_id", "");
        return user_id1;
    }

    public static void PutPhone(String phone, Activity activity) {
        SharedPreferences preferences = activity.getSharedPreferences("phone", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("phone", phone);
        editor.commit();
    }

    /**
     * 电话
     */
    public static String GetPhone(Activity activity) {
        SharedPreferences preferences = activity.getSharedPreferences("phone", Activity.MODE_PRIVATE);
        String user_id1 = preferences.getString("phone", "");
        return user_id1;
    }

    /**
     * 昵称
     */
    public static void PutNickname(String nickname, Activity activity) {
        SharedPreferences preferences = activity.getSharedPreferences("nickname", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("nickname", nickname);
        editor.commit();
    }

    public static String GetNickname(Activity activity) {
        SharedPreferences preferences = activity.getSharedPreferences("nickname", Activity.MODE_PRIVATE);
        String state = preferences.getString("nickname", "");
        return state;
    }

    /**
     * 出生年月
     */
    public static void PutBirthdate(Context context, String birthdate) {
        SharedPreferences preferences = context.getSharedPreferences("birthdate", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("birthdate", birthdate);
        editor.commit();
    }

    public static String GetBirthdate(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("birthdate", Activity.MODE_PRIVATE);
        String hongbao = preferences.getString("birthdate", "");
        return hongbao;
    }

    /**
     * 头像
     */
    public static void PutAvatar(Context context, String avatar) {
        SharedPreferences preferences = context.getSharedPreferences("avatar", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("avatar", avatar);
        editor.commit();
    }

    public static String GetAvatar(Activity activity) {
        SharedPreferences preferences = activity.getSharedPreferences("avatar", Activity.MODE_PRIVATE);
        String hongbao = preferences.getString("avatar", "");
        return hongbao;
    }

    /**
     * 怀孕日期
     */
    public static void PutPregnancy(String pregnancy, Activity activity) {
        SharedPreferences preferences = activity.getSharedPreferences("pregnancy", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("pregnancy", pregnancy);
        editor.commit();
    }

    public static String GetPregnancy(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("pregnancy", Activity.MODE_PRIVATE);
        String hongbao = preferences.getString("pregnancy", "");
        return hongbao;
    }


    /**
     * 预产期
     */
    public static void PutDuedate(String duedate, Activity activity) {
        SharedPreferences preferences = activity.getSharedPreferences("duedate", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("duedate", duedate);
        editor.commit();
    }

    public static String GetDuedate(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("duedate", Activity.MODE_PRIVATE);
        String hongbao = preferences.getString("duedate", "");
        return hongbao;
    }

    /**
     * 身高
     */
    public static void PutHeight(String height, Activity activity) {
        SharedPreferences preferences = activity.getSharedPreferences("height", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("height", height);
        editor.commit();
    }

    public static String GetHeight(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("height", Activity.MODE_PRIVATE);
        String hongbao = preferences.getString("height", "");
        return hongbao;
    }

    /**
     * 初始体重
     */
    public static void PutWeight(String weight, Activity activity) {
        SharedPreferences preferences = activity.getSharedPreferences("weight", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("weight", weight);
        editor.commit();
    }

    public static String GetWeight(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("weight", Activity.MODE_PRIVATE);
        String hongbao = preferences.getString("weight", "");
        return hongbao;
    }

    /**
     * 最新体重
     */
    public static void PutNewWeight(String weight, Activity activity) {
        SharedPreferences preferences = activity.getSharedPreferences("newweight", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("newweight", weight);
        editor.commit();
    }

    public static String GetNewWeight(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("newweight", Activity.MODE_PRIVATE);
        String hongbao = preferences.getString("newweight", "");
        return hongbao;
    }

    /**
     * 最新体重
     */
    public static void PutNewHR(String weight, Activity activity) {
        SharedPreferences preferences = activity.getSharedPreferences("newhr", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("newhr", weight);
        editor.commit();
    }

    public static String GetNewHR(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("newhr", Activity.MODE_PRIVATE);
        String newhr = preferences.getString("newhr", "");
        return newhr;
    }

    /**
     * 助产值
     */
    public static void PutBirthvalue(String birthvalue, Activity activity) {
        SharedPreferences preferences = activity.getSharedPreferences("birthvalue", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("birthvalue", birthvalue);
        editor.commit();
    }

    public static String GetBirthvalue(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("birthvalue", Activity.MODE_PRIVATE);
        String hongbao = preferences.getString("birthvalue", "");
        return hongbao;
    }

    /**
     * 勋章
     */
    public static void PutMedalnum(String medalnum, Activity activity) {
        SharedPreferences preferences = activity.getSharedPreferences("medalnum", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("medalnum", medalnum);
        editor.commit();
    }

    public static String GetMedalnum(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("medalnum", Activity.MODE_PRIVATE);
        String medalnum = preferences.getString("medalnum", "");
        return medalnum;
    }

    /**
     * BMI
     */
    public static void PutBMI(String bmi, Activity activity) {
        SharedPreferences preferences = activity.getSharedPreferences("bmi", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("bmi", bmi);
        editor.commit();
    }

    public static String GetBMI(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("bmi", Activity.MODE_PRIVATE);
        String medalnum = preferences.getString("bmi", "");
        return medalnum;
    }


    /**
     * 获取平均步频
     */
    public static String GetFrequency(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("frequency", Activity.MODE_PRIVATE);
        String hongbao = preferences.getString("frequency", "");
        return hongbao;
    }

    /**
     * 存平均步频
     */
    public static void PutFrequency(String state, Activity activity) {
        SharedPreferences preferences = activity.getSharedPreferences("frequency", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("frequency", state);
        editor.commit();
    }

    /**
     * 获取是否开启背景音乐
     */
    public static String GetMusic(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("music", Activity.MODE_PRIVATE);
        String hongbao = preferences.getString("music", "");
        return hongbao;
    }

    public static void PutMusic(String state, Activity activity) {
        SharedPreferences preferences = activity.getSharedPreferences("music", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("music", state);
        editor.commit();
    }

    /**
     * 获取是否开启语音提示
     */
    public static String GetVoice(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("voice", Activity.MODE_PRIVATE);
        String hongbao = preferences.getString("voice", "");
        return hongbao;
    }

    public static void PutVoice(String state, Activity activity) {
        SharedPreferences preferences = activity.getSharedPreferences("voice", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("voice", state);
        editor.commit();
    }

    /**
     * 获取是否开启背景音乐
     */
    public static String GetMusic1(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("music1", Activity.MODE_PRIVATE);
        String hongbao = preferences.getString("music1", "");
        return hongbao;
    }

    public static void PutMusic1(String state, Activity activity) {
        SharedPreferences preferences = activity.getSharedPreferences("music1", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("music1", state);
        editor.commit();
    }

    /**
     * 获取是否开启语音提示
     */
    public static String GetVoice1(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("voice1", Activity.MODE_PRIVATE);
        String hongbao = preferences.getString("voice1", "");
        return hongbao;
    }

    public static void PutVoice1(String state, Activity activity) {
        SharedPreferences preferences = activity.getSharedPreferences("voice1", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("voice1", state);
        editor.commit();
    }

    /**
     * 获取是否开启自动暂停
     */
    public static String GetStop(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("stop", Activity.MODE_PRIVATE);
        String hongbao = preferences.getString("stop", "");
        return hongbao;
    }

    public static void PutStop(String state, Activity activity) {
        SharedPreferences preferences = activity.getSharedPreferences("stop", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("stop", state);
        editor.commit();
    }

    /**
     * 获取是否开启自动暂停
     */
    public static String GetStop1(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("stop1", Activity.MODE_PRIVATE);
        String hongbao = preferences.getString("stop1", "");
        return hongbao;
    }

    public static void PutStop1(String state, Activity activity) {
        SharedPreferences preferences = activity.getSharedPreferences("stop1", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("stop1", state);
        editor.commit();
    }

    /**
     * 获取是否开启自动锁屏
     */
    public static String GetLock(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("lock", Activity.MODE_PRIVATE);
        String hongbao = preferences.getString("lock", "");
        return hongbao;
    }

    public static void PutLock(String state, Activity activity) {
        SharedPreferences preferences = activity.getSharedPreferences("lock", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("lock", state);
        editor.commit();
    }

    /**
     * 获取是否开启自动锁屏
     */
    public static String GetLock1(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("lock1", Activity.MODE_PRIVATE);
        String hongbao = preferences.getString("lock1", "");
        return hongbao;
    }

    public static void PutLock1(String state, Activity activity) {
        SharedPreferences preferences = activity.getSharedPreferences("lock1", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("lock1", state);
        editor.commit();
    }

    /**
     * 选中的背景音乐
     */
    public static String GetBGM(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("bgm", Activity.MODE_PRIVATE);
        String bgm = preferences.getString("bgm", "");
        return bgm;
    }

    public static void PutBGM(String state, Activity activity) {
        SharedPreferences preferences = activity.getSharedPreferences("bgm", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("bgm", state);
        editor.commit();
    }

    /**
     * 记录连接成功鞋垫
     */
    public static String GetInsole(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("insole", Activity.MODE_PRIVATE);
        String insole = preferences.getString("insole", "");
        return insole;
    }

    public static void PutInsole(String insole, Context context) {
        SharedPreferences preferences = context.getSharedPreferences("insole", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("insole", insole);
        editor.commit();
    }

    /**
     * 是否第一次打开APP
     */
    public static boolean First(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("first", Activity.MODE_PRIVATE);
        Boolean user_first = preferences.getBoolean("first", true);
        if (user_first) {//第一次
            preferences.edit().putBoolean("first", false).commit();
        } else {
        }
        return user_first;
    }

    /**
     * 是否展示心率提示
     */
    public static void PutShowHint(Context context, String s) {
        SharedPreferences preferences = context.getSharedPreferences("showHint", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("showHint", s);
        editor.commit();
    }

    public static String GetShowHint(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("showHint", Activity.MODE_PRIVATE);
        String showHint = preferences.getString("showHint", "");
        return showHint;
    }

    /**
     * 存当天日期
     */
    public static void Putday(Context context, String s) {
        SharedPreferences preferences = context.getSharedPreferences("Day", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("Day", s);
        editor.commit();
    }

    public static String Getday(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("Day", Activity.MODE_PRIVATE);
        String Day = preferences.getString("Day", "");
        return Day;
    }

    /**
     * 存温度
     */
    public static void PutTemperature(Context context, String s) {
        SharedPreferences preferences = context.getSharedPreferences("temperature", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("temperature", s);
        editor.commit();
    }

    public static String GetTemperature(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("temperature", Activity.MODE_PRIVATE);
        String temperature = preferences.getString("temperature", "");
        return temperature;
    }

    /**
     * 存空气质量
     */
    public static void PutAir(Context context, String s) {
        SharedPreferences preferences = context.getSharedPreferences("air", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("air", s);
        editor.commit();
    }

    public static String GetAir(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("air", Activity.MODE_PRIVATE);
        String air = preferences.getString("air", "");
        return air;
    }

    /**
     * 存天气
     */
    public static void PutWeather(Context context, String s) {
        SharedPreferences preferences = context.getSharedPreferences("Weather", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString("Weather", s);
        editor.commit();
    }

    public static String GetWeather(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("Weather", Activity.MODE_PRIVATE);
        String air = preferences.getString("Weather", "");
        return air;
    }

    public static void PutXScaleWidth(Context context, int s) {
        SharedPreferences preferences = context.getSharedPreferences("XScaleWidth", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putInt("XScaleWidth", s);
        editor.commit();
    }

    public static Integer GetXScaleWidth(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("XScaleWidth", Activity.MODE_PRIVATE);
        int air = preferences.getInt("XScaleWidth", 0);
        return air;
    }

    public static void PutServeTime(Context context, long ServeTime) {
        SharedPreferences preferences = context.getSharedPreferences("ServeTime", Activity.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putLong("ServeTime", ServeTime);
        editor.commit();
    }

    public static Long GetServeTime(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("ServeTime", Activity.MODE_PRIVATE);
        long ServeTime = preferences.getLong("ServeTime", 0);
        return ServeTime;
    }


}
