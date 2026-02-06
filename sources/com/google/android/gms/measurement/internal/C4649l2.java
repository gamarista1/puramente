package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C4536s;

/* renamed from: com.google.android.gms.measurement.internal.l2  reason: case insensitive filesystem */
public final class C4649l2 {

    /* renamed from: a  reason: collision with root package name */
    private final String f55225a;

    /* renamed from: b  reason: collision with root package name */
    private final long f55226b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f55227c;

    /* renamed from: d  reason: collision with root package name */
    private long f55228d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C4614g2 f55229e;

    public C4649l2(C4614g2 g2Var, String str, long j10) {
        this.f55229e = g2Var;
        C4536s.f(str);
        this.f55225a = str;
        this.f55226b = j10;
    }

    public final long a() {
        if (!this.f55227c) {
            this.f55227c = true;
            this.f55228d = this.f55229e.E().getLong(this.f55225a, this.f55226b);
        }
        return this.f55228d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor edit = this.f55229e.E().edit();
        edit.putLong(this.f55225a, j10);
        edit.apply();
        this.f55228d = j10;
    }
}
