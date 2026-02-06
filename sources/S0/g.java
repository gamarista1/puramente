package S0;

import android.os.Build;
import android.text.TextPaint;

public abstract class g {
    public static final f a(CharSequence charSequence, TextPaint textPaint) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new d(charSequence, textPaint);
        }
        return new e(charSequence);
    }
}
