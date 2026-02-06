package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.C4499k;
import com.google.android.gms.common.internal.C4536s;

/* renamed from: com.google.android.gms.common.api.internal.l  reason: case insensitive filesystem */
public abstract class C4500l {
    public static C4499k a(Object obj, Looper looper, String str) {
        C4536s.m(obj, "Listener must not be null");
        C4536s.m(looper, "Looper must not be null");
        C4536s.m(str, "Listener type must not be null");
        return new C4499k(looper, obj, str);
    }

    public static C4499k.a b(Object obj, String str) {
        C4536s.m(obj, "Listener must not be null");
        C4536s.m(str, "Listener type must not be null");
        C4536s.g(str, "Listener type must not be empty");
        return new C4499k.a(obj, str);
    }
}
