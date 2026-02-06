package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.C4536s;

/* renamed from: com.google.android.gms.measurement.internal.k2  reason: case insensitive filesystem */
public final class C4642k2 {

    /* renamed from: a  reason: collision with root package name */
    private final String f55181a;

    /* renamed from: b  reason: collision with root package name */
    private final String f55182b;

    /* renamed from: c  reason: collision with root package name */
    private final String f55183c;

    /* renamed from: d  reason: collision with root package name */
    private final long f55184d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C4614g2 f55185e;

    private final long c() {
        return this.f55185e.E().getLong(this.f55181a, 0);
    }

    private final void d() {
        this.f55185e.i();
        long currentTimeMillis = this.f55185e.zzb().currentTimeMillis();
        SharedPreferences.Editor edit = this.f55185e.E().edit();
        edit.remove(this.f55182b);
        edit.remove(this.f55183c);
        edit.putLong(this.f55181a, currentTimeMillis);
        edit.apply();
    }

    public final Pair a() {
        long j10;
        this.f55185e.i();
        this.f55185e.i();
        long c10 = c();
        if (c10 == 0) {
            d();
            j10 = 0;
        } else {
            j10 = Math.abs(c10 - this.f55185e.zzb().currentTimeMillis());
        }
        long j11 = this.f55184d;
        if (j10 < j11) {
            return null;
        }
        if (j10 > (j11 << 1)) {
            d();
            return null;
        }
        String string = this.f55185e.E().getString(this.f55183c, (String) null);
        long j12 = this.f55185e.E().getLong(this.f55182b, 0);
        d();
        if (string == null || j12 <= 0) {
            return C4614g2.f55087B;
        }
        return new Pair(string, Long.valueOf(j12));
    }

    public final void b(String str, long j10) {
        boolean z10;
        this.f55185e.i();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j11 = this.f55185e.E().getLong(this.f55182b, 0);
        if (j11 <= 0) {
            SharedPreferences.Editor edit = this.f55185e.E().edit();
            edit.putString(this.f55183c, str);
            edit.putLong(this.f55182b, 1);
            edit.apply();
            return;
        }
        long j12 = j11 + 1;
        if ((this.f55185e.f().R0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j12) {
            z10 = true;
        } else {
            z10 = false;
        }
        SharedPreferences.Editor edit2 = this.f55185e.E().edit();
        if (z10) {
            edit2.putString(this.f55183c, str);
        }
        edit2.putLong(this.f55182b, j12);
        edit2.apply();
    }

    private C4642k2(C4614g2 g2Var, String str, long j10) {
        this.f55185e = g2Var;
        C4536s.f(str);
        C4536s.a(j10 > 0);
        this.f55181a = str + ":start";
        this.f55182b = str + ":count";
        this.f55183c = str + ":value";
        this.f55184d = j10;
    }
}
