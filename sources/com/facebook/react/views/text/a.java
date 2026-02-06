package com.facebook.react.views.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import kotlin.jvm.internal.C6496s;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f42096a = new a();

    private a() {
    }

    private final ColorStateList a(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        C6496s.g(obtainStyledAttributes, "obtainStyledAttributes(...)");
        return obtainStyledAttributes.getColorStateList(0);
    }

    public static final ColorStateList b(Context context) {
        C6496s.h(context, "context");
        return f42096a.a(context, 16842904);
    }

    public static final int c(Context context) {
        C6496s.h(context, "context");
        ColorStateList a10 = f42096a.a(context, 16842905);
        if (a10 != null) {
            return a10.getDefaultColor();
        }
        return 0;
    }

    public static final ColorStateList d(Context context) {
        C6496s.h(context, "context");
        return f42096a.a(context, 16842906);
    }
}
