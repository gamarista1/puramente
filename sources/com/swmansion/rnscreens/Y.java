package com.swmansion.rnscreens;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import i.C2042f;
import kotlin.jvm.internal.C6496s;

public final class Y {

    /* renamed from: a  reason: collision with root package name */
    private SearchView f59772a;

    /* renamed from: b  reason: collision with root package name */
    private Integer f59773b;

    /* renamed from: c  reason: collision with root package name */
    private Drawable f59774c;

    public Y(SearchView searchView) {
        C6496s.h(searchView, "searchView");
        this.f59772a = searchView;
    }

    private final ImageView a() {
        return (ImageView) this.f59772a.findViewById(C2042f.f21393z);
    }

    private final EditText b() {
        View findViewById = this.f59772a.findViewById(C2042f.f21355E);
        if (findViewById instanceof EditText) {
            return (EditText) findViewById;
        }
        return null;
    }

    private final ImageView c() {
        return (ImageView) this.f59772a.findViewById(C2042f.f21392y);
    }

    private final View d() {
        return this.f59772a.findViewById(C2042f.f21354D);
    }

    public final void e(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            c().setColorFilter(intValue);
            a().setColorFilter(intValue);
        }
    }

    public final void f(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            EditText b10 = b();
            if (b10 != null) {
                b10.setHintTextColor(intValue);
            }
        }
    }

    public final void g(String str, boolean z10) {
        C6496s.h(str, "placeholder");
        if (z10) {
            this.f59772a.setQueryHint(str);
            return;
        }
        EditText b10 = b();
        if (b10 != null) {
            b10.setHint(str);
        }
    }

    public final void h(Integer num) {
        EditText b10;
        Integer num2;
        ColorStateList textColors;
        Integer num3 = this.f59773b;
        if (num != null) {
            if (num3 == null) {
                EditText b11 = b();
                if (b11 == null || (textColors = b11.getTextColors()) == null) {
                    num2 = null;
                } else {
                    num2 = Integer.valueOf(textColors.getDefaultColor());
                }
                this.f59773b = num2;
            }
            EditText b12 = b();
            if (b12 != null) {
                b12.setTextColor(num.intValue());
            }
        } else if (num3 != null && (b10 = b()) != null) {
            b10.setTextColor(num3.intValue());
        }
    }

    public final void i(Integer num) {
        Drawable drawable = this.f59774c;
        if (num != null) {
            if (drawable == null) {
                this.f59774c = d().getBackground();
            }
            d().setBackgroundColor(num.intValue());
        } else if (drawable != null) {
            d().setBackground(drawable);
        }
    }
}
