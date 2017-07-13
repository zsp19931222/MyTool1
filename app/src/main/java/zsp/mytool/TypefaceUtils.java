package zsp.mytool;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/6/15 0015.
 * <p>
 * 字体设置工具类
 */

public class TypefaceUtils {
    public static void setTypeface(TextView textView, Context context) {
        Typeface typeFace = Typeface.createFromAsset(context.getAssets(), "denseregular.ttf");
        textView.setTypeface(typeFace);
    }
}
