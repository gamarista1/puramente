package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.c;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import p1.C2387c;

public class ColorUtils {
    private static final double ACCESSIBILITY_CONTRAST_RATIO = 4.5d;
    private static final float BRIGHTNESS_CUTOFF = 0.7f;
    private static final char COLOR_PREFIX = '#';
    private static final String SHORT_COLOR_REGEX = String.format("%s([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])", new Object[]{Character.valueOf(COLOR_PREFIX)});
    private static final int SHORT_COLOR_WITH_PREFIX_LENGTH = 4;

    public static int buttonBackgroundColorVariant(int i10) {
        float[] fArr = new float[3];
        C2387c.h(i10, fArr);
        float f10 = fArr[2];
        float f11 = 0.95f - f10;
        float f12 = f10 - 0.85f;
        double d10 = (double) f10;
        if (d10 > 0.9d) {
            return darkenColor(i10, f12);
        }
        if (d10 < 0.35d) {
            return lightenColor(i10, f11);
        }
        return lightenColor(i10, f11);
    }

    public static int buttonTextColorVariant(int i10) {
        float[] fArr = new float[3];
        C2387c.h(i10, fArr);
        float f10 = fArr[2];
        float f11 = f10 - 0.3f;
        double d10 = (double) f10;
        if (d10 > 0.9d) {
            return darkenColor(i10, f11);
        }
        if (d10 < 0.35d) {
            return i10;
        }
        return darkenColor(i10, f11);
    }

    private static int darkColorRes() {
        return R.color.intercom_accessibility_black;
    }

    public static int darkenColor(int i10) {
        float[] fArr = new float[3];
        Color.colorToHSV(i10, fArr);
        fArr[2] = fArr[2] * 0.79f;
        return Color.HSVToColor(fArr);
    }

    public static int desaturateColor(int i10, float f10) {
        float[] fArr = new float[3];
        C2387c.h(i10, fArr);
        float f11 = fArr[1] - f10;
        fArr[1] = f11;
        fArr[1] = Math.max(0.0f, Math.min(f11, 1.0f));
        return C2387c.a(fArr);
    }

    public static boolean isColorLight(String str) {
        return C2387c.g(Color.parseColor(str)) > 0.699999988079071d;
    }

    public static boolean isComparedColorsLowerThanAccessibilityContrastRatio(int i10, int i11) {
        if (C2387c.f(i10, i11) < ACCESSIBILITY_CONTRAST_RATIO) {
            return true;
        }
        return false;
    }

    public static int lightenColor(int i10) {
        return Color.argb(Color.alpha(i10), (Color.red(i10) + 255) / 2, (Color.green(i10) + 255) / 2, (Color.blue(i10) + 255) / 2);
    }

    public static ColorFilter newGreyscaleFilter() {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        return new ColorMatrixColorFilter(colorMatrix);
    }

    public static int parseColor(String str) {
        if (str.length() == 4 && str.charAt(0) == '#') {
            str = str.replaceAll(SHORT_COLOR_REGEX, String.format("%s$1$1$2$2$3$3", new Object[]{Character.valueOf(COLOR_PREFIX)}));
        }
        return Color.parseColor(str);
    }

    public static int primaryOrBlackAccessibility(Context context, AppConfig appConfig) {
        if (isColorLight(appConfig.getPrimaryColor())) {
            return c.getColor(context, R.color.intercom_accessibility_black);
        }
        return appConfig.getPrimaryColor();
    }

    private static int primaryOrBlackColor(Context context, AppConfig appConfig) {
        if (appConfig.isPrimaryColorRenderDarkText()) {
            return c.getColor(context, R.color.intercom_black);
        }
        return appConfig.getPrimaryColor();
    }

    public static int primaryOrDarkColor(Context context, AppConfig appConfig) {
        if (appConfig.isPrimaryColorRenderDarkText()) {
            return c.getColor(context, darkColorRes());
        }
        return appConfig.getPrimaryColor();
    }

    public static void setImageColorWhiteOrBlack(ImageView imageView, boolean z10) {
        imageView.setColorFilter(whiteOrBlackColor(imageView.getContext(), z10));
    }

    public static void setTextColorPrimaryOrBlack(TextView textView, AppConfig appConfig) {
        int primaryOrBlackColor = primaryOrBlackColor(textView.getContext(), appConfig);
        textView.setTextColor(primaryOrBlackColor);
        textView.setLinkTextColor(primaryOrBlackColor);
    }

    public static void setTextColorPrimaryOrDark(TextView textView, AppConfig appConfig) {
        int primaryOrDarkColor = primaryOrDarkColor(textView.getContext(), appConfig);
        textView.setTextColor(primaryOrDarkColor);
        textView.setLinkTextColor(primaryOrDarkColor);
    }

    public static void setTextColorWhiteOrBlack(TextView textView, boolean z10) {
        int whiteOrBlackColor = whiteOrBlackColor(textView.getContext(), z10);
        textView.setTextColor(whiteOrBlackColor);
        textView.setLinkTextColor(whiteOrBlackColor);
    }

    public static void setTextColorWhiteOrDark(TextView textView, boolean z10) {
        int whiteOrDarkColor = whiteOrDarkColor(textView.getContext(), z10);
        textView.setTextColor(whiteOrDarkColor);
        textView.setLinkTextColor(whiteOrDarkColor);
    }

    public static int whiteOrBlackAccessibility(Context context, AppConfig appConfig) {
        if (isColorLight(appConfig.getPrimaryColor())) {
            return c.getColor(context, R.color.intercom_accessibility_black);
        }
        return c.getColor(context, R.color.intercom_white);
    }

    public static int whiteOrBlackColor(Context context, boolean z10) {
        int i10;
        if (z10) {
            i10 = R.color.intercom_accessibility_black;
        } else {
            i10 = R.color.intercom_white;
        }
        return c.getColor(context, i10);
    }

    public static int whiteOrDarkColor(Context context, boolean z10) {
        if (z10) {
            return c.getColor(context, darkColorRes());
        }
        return c.getColor(context, R.color.intercom_white);
    }

    public static boolean isColorLight(int i10) {
        return 1.05d / (C2387c.g(i10) + 0.05d) < ACCESSIBILITY_CONTRAST_RATIO;
    }

    public static int darkenColor(int i10, float f10) {
        float[] fArr = new float[3];
        C2387c.h(i10, fArr);
        float f11 = fArr[2] - f10;
        fArr[2] = f11;
        fArr[2] = Math.max(0.0f, Math.min(f11, 1.0f));
        return C2387c.a(fArr);
    }

    public static int lightenColor(int i10, float f10) {
        float[] fArr = new float[3];
        C2387c.h(i10, fArr);
        float f11 = fArr[2] + f10;
        fArr[2] = f11;
        fArr[2] = Math.max(0.0f, Math.min(f11, 1.0f));
        return C2387c.a(fArr);
    }
}
