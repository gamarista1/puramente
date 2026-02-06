package com.google.android.gms.common.internal;

import Ea.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.Button;
import q1.C2429a;
import wa.C5261a;
import wa.b;
import wa.c;

public final class B extends Button {
    public B(Context context, AttributeSet attributeSet) {
        super(context, (AttributeSet) null, 16842824);
    }

    private static final int b(int i10, int i11, int i12, int i13) {
        if (i10 == 0) {
            return i11;
        }
        if (i10 == 1) {
            return i12;
        }
        if (i10 == 2) {
            return i13;
        }
        throw new IllegalStateException("Unknown color scheme: " + i10);
    }

    public final void a(Resources resources, int i10, int i11) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i12 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i12);
        setMinWidth(i12);
        int i13 = b.f62052b;
        int i14 = b.f62053c;
        int b10 = b(i11, i13, i14, i14);
        int i15 = b.f62054d;
        int i16 = b.f62055e;
        int b11 = b(i11, i15, i16, i16);
        if (i10 == 0 || i10 == 1) {
            b10 = b11;
        } else if (i10 != 2) {
            throw new IllegalStateException("Unknown button size: " + i10);
        }
        Drawable l10 = C2429a.l(resources.getDrawable(b10));
        C2429a.i(l10, resources.getColorStateList(C5261a.f62050c));
        C2429a.j(l10, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(l10);
        int i17 = C5261a.f62048a;
        int i18 = C5261a.f62049b;
        setTextColor((ColorStateList) C4536s.l(resources.getColorStateList(b(i11, i17, i18, i18))));
        if (i10 == 0) {
            setText(resources.getString(c.f62071p));
        } else if (i10 == 1) {
            setText(resources.getString(c.f62072q));
        } else if (i10 == 2) {
            setText((CharSequence) null);
        } else {
            throw new IllegalStateException("Unknown button size: " + i10);
        }
        setTransformationMethod((TransformationMethod) null);
        if (i.c(getContext())) {
            setGravity(19);
        }
    }
}
