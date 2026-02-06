package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C4536s;

/* renamed from: com.google.android.gms.measurement.internal.m2  reason: case insensitive filesystem */
public final class C4656m2 {

    /* renamed from: a  reason: collision with root package name */
    private final String f55236a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f55237b;

    /* renamed from: c  reason: collision with root package name */
    private String f55238c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C4614g2 f55239d;

    public C4656m2(C4614g2 g2Var, String str, String str2) {
        this.f55239d = g2Var;
        C4536s.f(str);
        this.f55236a = str;
    }

    public final String a() {
        if (!this.f55237b) {
            this.f55237b = true;
            this.f55238c = this.f55239d.E().getString(this.f55236a, (String) null);
        }
        return this.f55238c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f55239d.E().edit();
        edit.putString(this.f55236a, str);
        edit.apply();
        this.f55238c = str;
    }
}
