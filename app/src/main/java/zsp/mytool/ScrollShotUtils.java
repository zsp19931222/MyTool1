package zsp.mytool;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import android.widget.ScrollView;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2016/10/11.
 * 滚动截屏工具类
 */

public class ScrollShotUtils {
    /**
     * 截取scrollview的屏幕
     **/
    public static String getBitmapByView(ScrollView scrollView) {
        String mkdirPath = FileManagerUtils.mkdirFile("share_images");
        int h = 0;
        Bitmap bitmap = null;
        // 获取scrollView实际高度
        for (int i = 0; i < scrollView.getChildCount(); i++) {
            h += scrollView.getChildAt(i).getHeight();
//            scrollView.getChildAt(i).setBackgroundResource(R.drawable.ic_launcher);
        }
        Log.d("high", "实际高度:" + h);
        Log.d("high", " 高度:" + scrollView.getHeight());
        // 创建对应大小的bitmap
        bitmap = Bitmap.createBitmap(scrollView.getWidth(), h,
                Bitmap.Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap);
        scrollView.draw(canvas);
        // 测试输出
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(mkdirPath + "/screen_test.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            if (null != out) {
                bitmap.compress(Bitmap.CompressFormat.PNG, 50, out);
                out.flush();
                out.close();
            }
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return mkdirPath;
    }

    public static String getBitmapByActivity(Activity activity) {
        String mkdirPath = FileManagerUtils.mkdirFile("share_images");
        int h = 0;
        Bitmap bitmap = null;
        int width = activity.getWindow().getDecorView().getRootView().getWidth();
        int height = activity.getWindow().getDecorView().getRootView().getHeight();
        //生成相同大小的图片

        bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);

        View view = activity.getWindow().getDecorView().getRootView();
        //设置缓存
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        //从缓存中获取当前屏幕的图片
        bitmap = view.getDrawingCache();


        // 测试输出
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(mkdirPath + "/screen_test.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            if (null != out) {
                bitmap.compress(Bitmap.CompressFormat.PNG, 50, out);
                out.flush();
                out.close();
            }
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        return mkdirPath;
    }

    public static String getBitmapByView2(View view) {
        String mkdirPath = FileManagerUtils.mkdirFile("share_images");
        Bitmap bitmapF = null;

        // 创建对应大小的bitmap
        bitmapF = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Bitmap bitmap = compressImage(bitmapF).copy(Bitmap.Config.ARGB_8888, true);
        final Canvas canvas = new Canvas(bitmap);

        view.draw(canvas);
        // 测试输出
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(mkdirPath + "/screen_test.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            if (null != out) {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, out);
                out.flush();
                out.close();
            }
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return mkdirPath + "/screen_test.png";
    }

    private static Bitmap compressImage(Bitmap image) {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        image.compress(Bitmap.CompressFormat.JPEG, 100, baos);//质量压缩方法，这里100表示不压缩，把压缩后的数据存放到baos中
        int options = 90;
        while (baos.toByteArray().length / 1024 > 30 && options > 0) {    //循环判断如果压缩后图片是否大于100kb,大于继续压缩
            baos.reset();//重置baos即清空baos
            image.compress(Bitmap.CompressFormat.JPEG, options, baos);//这里压缩options%，把压缩后的数据存放到baos中
            options -= 5;//每次都减少5
        }
        ByteArrayInputStream isBm = new ByteArrayInputStream(baos.toByteArray());//把压缩后的数据baos存放到ByteArrayInputStream中
        Bitmap bitmap = BitmapFactory.decodeStream(isBm, null, null);//把ByteArrayInputStream数据生成图片
        return bitmap;
    }

}
