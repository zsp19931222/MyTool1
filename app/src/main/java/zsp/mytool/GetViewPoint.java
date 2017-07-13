package zsp.mytool;

import android.app.Activity;
import android.view.View;

/**
 * Created by Administrator on 2017/3/3 0003.
 *
 * 获取控件x,y值
 */

public class GetViewPoint {
    public static int GetX(final View view) {
        int x = (view.getRight() - view.getLeft()) / 2 + view.getLeft();
        return x;
    }
    public static int GetY(final View view) {
        int y = (view.getBottom() - view.getTop()) / 2 + view.getTop();
        return y;
    }
}
