package zsp.mytool;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/3/16 0016.
 */

public class ToastUtils {
    public static void Toast(Context activity, String message){
        Toast.makeText(activity,message,Toast.LENGTH_SHORT).show();
    }
}
