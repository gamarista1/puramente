package com.google.android.gms.measurement.internal;

import Pa.o;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.h2  reason: case insensitive filesystem */
final class C4621h2 {

    /* renamed from: a  reason: collision with root package name */
    private final o f55118a;

    C4621h2(o oVar) {
        this.f55118a = oVar;
    }

    static C4621h2 b(String str) {
        o oVar;
        if (TextUtils.isEmpty(str) || str.length() > 1) {
            oVar = o.UNINITIALIZED;
        } else {
            oVar = C4622h3.c(str.charAt(0));
        }
        return new C4621h2(oVar);
    }

    /* access modifiers changed from: package-private */
    public final o a() {
        return this.f55118a;
    }

    /* access modifiers changed from: package-private */
    public final String c() {
        return String.valueOf(C4622h3.a(this.f55118a));
    }
}
