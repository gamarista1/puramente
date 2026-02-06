package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

final class P3 implements D5 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C4643k3 f54816a;

    P3(C4643k3 k3Var) {
        this.f54816a = k3Var;
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f54816a.c0("auto", str2, bundle, str);
        } else {
            this.f54816a.M0("auto", str2, bundle);
        }
    }
}
