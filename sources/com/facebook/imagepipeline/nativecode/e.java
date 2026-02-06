package com.facebook.imagepipeline.nativecode;

import w8.C4145a;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f39775a;

    public static synchronized void a() {
        synchronized (e.class) {
            if (!f39775a) {
                C4145a.d("static-webp");
                f39775a = true;
            }
        }
    }
}
