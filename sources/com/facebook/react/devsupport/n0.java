package com.facebook.react.devsupport;

import android.os.Build;

public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public static final n0 f40872a = new n0();

    /* renamed from: b  reason: collision with root package name */
    public static final int f40873b;

    static {
        int i10;
        if (Build.VERSION.SDK_INT < 26) {
            i10 = 2006;
        } else {
            i10 = 2038;
        }
        f40873b = i10;
    }

    private n0() {
    }
}
