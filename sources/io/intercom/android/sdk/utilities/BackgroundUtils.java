package io.intercom.android.sdk.utilities;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;

public class BackgroundUtils {
    public static void setBackground(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void setButtonColor(TextView textView, int i10) {
        int buttonTextColorVariant = ColorUtils.buttonTextColorVariant(i10);
        int buttonBackgroundColorVariant = ColorUtils.buttonBackgroundColorVariant(i10);
        textView.setTextColor(buttonTextColorVariant);
        textView.getBackground().setColorFilter(buttonBackgroundColorVariant, PorterDuff.Mode.SRC_ATOP);
    }
}
