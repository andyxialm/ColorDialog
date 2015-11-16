package cn.refactor.lib.colordialog.util;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;

/**
 * 作者 : andy
 * 日期 : 15/11/8 20:42
 * 邮箱 : andyxialm@gmail.com
 * 描述 : 换算工具类
 */
public class DisplayUtil {

    /**
     * 根据分辨率从 dp 的单位 转成为 px(像素)
     */
    public static int dp2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * 根据分辨率从 px(像素) 的单位 转成为 dp
     */
    public static int px2dp(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    /**
     * 获得屏幕尺寸
     * @param context
     * @return
     */
    public static Point getScreenSize(Context context) {
        Point point = new Point();
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        wm.getDefaultDisplay().getSize(point);
        return point;
    }
}