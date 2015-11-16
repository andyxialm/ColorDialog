package cn.refactor.lib.colordialog;

import android.content.Context;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;

/**
 * 作者 : andy
 * 日期 : 15/11/16 12:23
 * 邮箱 : andyxialm@gmail.com
 * 描述 : 默认动画效果
 */
public class AnimationLoader {
    public static AnimationSet getInAnimation(Context context) {
        AnimationSet in = new AnimationSet(context, null);

        AlphaAnimation alpha = new AlphaAnimation(0.0f, 1.0f);
        alpha.setDuration(90);

        ScaleAnimation scale1 = new ScaleAnimation(0.8f, 1.05f, 0.8f, 1.05f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        scale1.setDuration(135);

        ScaleAnimation scale2 = new ScaleAnimation(1.05f, 0.95f, 1.05f, 0.95f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        scale2.setDuration(105);
        scale2.setStartOffset(135);

        ScaleAnimation scale3 = new ScaleAnimation(0.95f, 1f, 0.95f, 1.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        scale3.setDuration(60);
        scale3.setStartOffset(240);

        in.addAnimation(alpha);
        in.addAnimation(scale1);
        in.addAnimation(scale2);
        in.addAnimation(scale3);

        return in;
    }

    public static AnimationSet getOutAnimation(Context context) {
        AnimationSet out = new AnimationSet(context, null);
        AlphaAnimation alpha = new AlphaAnimation(1.0f, 0.0f);
        alpha.setDuration(150);
        ScaleAnimation scale = new ScaleAnimation(1.0f, 0.6f, 1.0f, 0.6f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        scale.setDuration(150);
        out.addAnimation(alpha);
        out.addAnimation(scale);
        return out;
    }

}
