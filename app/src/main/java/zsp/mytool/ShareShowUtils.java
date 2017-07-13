package zsp.mytool;

import android.content.Context;

import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;

/**
 * Created by Administrator on 2017/3/29 0029.
 */

public class ShareShowUtils {
    public static void showShareImage(Context context) {
        ShareSDK.initSDK(context);
        OnekeyShare oks = new OnekeyShare();
        //关闭sso授权
        oks.disableSSOWhenAuthorize();
        // imagePath是图片的本地路径，Linked-In以外的平台都支持此参数
        oks.setImageUrl("http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg");
        // 启动分享GUI
        oks.show(context);
    }
}
