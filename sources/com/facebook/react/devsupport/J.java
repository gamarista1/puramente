package com.facebook.react.devsupport;

import com.facebook.soloader.SoLoader;

public final class J {

    /* renamed from: a  reason: collision with root package name */
    public static final J f40715a = new J();

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f40716b;

    private J() {
    }

    public static final synchronized void a() {
        synchronized (J.class) {
            if (!f40716b) {
                SoLoader.t("react_devsupportjni");
                f40716b = true;
            }
        }
    }
}
