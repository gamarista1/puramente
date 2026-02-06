package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C4536s;

/* renamed from: com.google.android.gms.measurement.internal.j2  reason: case insensitive filesystem */
public final class C4635j2 {

    /* renamed from: a  reason: collision with root package name */
    private final String f55149a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f55150b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f55151c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f55152d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C4614g2 f55153e;

    public C4635j2(C4614g2 g2Var, String str, boolean z10) {
        this.f55153e = g2Var;
        C4536s.f(str);
        this.f55149a = str;
        this.f55150b = z10;
    }

    public final void a(boolean z10) {
        SharedPreferences.Editor edit = this.f55153e.E().edit();
        edit.putBoolean(this.f55149a, z10);
        edit.apply();
        this.f55152d = z10;
    }

    public final boolean b() {
        if (!this.f55151c) {
            this.f55151c = true;
            this.f55152d = this.f55153e.E().getBoolean(this.f55149a, this.f55150b);
        }
        return this.f55152d;
    }
}
