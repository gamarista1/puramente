package com.facebook.imagepipeline.nativecode;

import w8.C4145a;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f39774a;

    public static synchronized void a() {
        synchronized (d.class) {
            if (!f39774a) {
                C4145a.d("native-imagetranscoder");
                f39774a = true;
            }
        }
    }
}
