package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

public abstract class c {

    static class a {
        static ColorStateList a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        static void b(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        static void c(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    static class b {
        static Drawable a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    public static Drawable a(CompoundButton compoundButton) {
        return b.a(compoundButton);
    }

    public static ColorStateList b(CompoundButton compoundButton) {
        return a.a(compoundButton);
    }

    public static void c(CompoundButton compoundButton, ColorStateList colorStateList) {
        a.b(compoundButton, colorStateList);
    }

    public static void d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        a.c(compoundButton, mode);
    }
}
