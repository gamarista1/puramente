package com.facebook.react.views.switchview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import androidx.appcompat.widget.b0;
import kotlin.jvm.internal.C6496s;

public final class a extends b0 {

    /* renamed from: q0  reason: collision with root package name */
    private boolean f42091q0 = true;

    /* renamed from: r0  reason: collision with root package name */
    private Integer f42092r0;

    /* renamed from: s0  reason: collision with root package name */
    private Integer f42093s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        C6496s.h(context, "context");
    }

    private final ColorStateList r(int i10) {
        return new ColorStateList(new int[][]{new int[]{16842919}}, new int[]{i10});
    }

    public final void s(Drawable drawable, Integer num) {
        C6496s.h(drawable, "drawable");
        if (num == null) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.MULTIPLY));
        }
    }

    public void setBackgroundColor(int i10) {
        setBackground(new RippleDrawable(r(i10), new ColorDrawable(i10), (Drawable) null));
    }

    public void setChecked(boolean z10) {
        if (!this.f42091q0 || isChecked() == z10) {
            super.setChecked(isChecked());
            return;
        }
        this.f42091q0 = false;
        super.setChecked(z10);
        setTrackColor(z10);
    }

    public final void setOn(boolean z10) {
        if (isChecked() != z10) {
            super.setChecked(z10);
            setTrackColor(z10);
        }
        this.f42091q0 = true;
    }

    public final void setThumbColor(Integer num) {
        Drawable thumbDrawable = super.getThumbDrawable();
        C6496s.g(thumbDrawable, "getThumbDrawable(...)");
        s(thumbDrawable, num);
        if (num != null && (super.getBackground() instanceof RippleDrawable)) {
            ColorStateList r10 = r(num.intValue());
            Drawable background = super.getBackground();
            C6496s.f(background, "null cannot be cast to non-null type android.graphics.drawable.RippleDrawable");
            ((RippleDrawable) background).setColor(r10);
        }
    }

    public final void setTrackColor(Integer num) {
        Drawable trackDrawable = super.getTrackDrawable();
        C6496s.g(trackDrawable, "getTrackDrawable(...)");
        s(trackDrawable, num);
    }

    public final void setTrackColorForFalse(Integer num) {
        if (!C6496s.c(num, this.f42092r0)) {
            this.f42092r0 = num;
            if (!isChecked()) {
                setTrackColor(this.f42092r0);
            }
        }
    }

    public final void setTrackColorForTrue(Integer num) {
        if (!C6496s.c(num, this.f42093s0)) {
            this.f42093s0 = num;
            if (isChecked()) {
                setTrackColor(this.f42093s0);
            }
        }
    }

    private final void setTrackColor(boolean z10) {
        Integer num = this.f42093s0;
        if (num != null || this.f42092r0 != null) {
            if (!z10) {
                num = this.f42092r0;
            }
            setTrackColor(num);
        }
    }
}
