package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4536s;

/* renamed from: com.google.android.gms.measurement.internal.y  reason: case insensitive filesystem */
final class C4725y {

    /* renamed from: a  reason: collision with root package name */
    final String f55403a;

    /* renamed from: b  reason: collision with root package name */
    final String f55404b;

    /* renamed from: c  reason: collision with root package name */
    final long f55405c;

    /* renamed from: d  reason: collision with root package name */
    final long f55406d;

    /* renamed from: e  reason: collision with root package name */
    final long f55407e;

    /* renamed from: f  reason: collision with root package name */
    final long f55408f;

    /* renamed from: g  reason: collision with root package name */
    final long f55409g;

    /* renamed from: h  reason: collision with root package name */
    final Long f55410h;

    /* renamed from: i  reason: collision with root package name */
    final Long f55411i;

    /* renamed from: j  reason: collision with root package name */
    final Long f55412j;

    /* renamed from: k  reason: collision with root package name */
    final Boolean f55413k;

    C4725y(String str, String str2, long j10, long j11, long j12, long j13, Long l10, Long l11, Long l12, Boolean bool) {
        this(str, str2, 0, 0, 0, j12, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    public final C4725y a(long j10) {
        return new C4725y(this.f55403a, this.f55404b, this.f55405c, this.f55406d, this.f55407e, j10, this.f55409g, this.f55410h, this.f55411i, this.f55412j, this.f55413k);
    }

    /* access modifiers changed from: package-private */
    public final C4725y b(long j10, long j11) {
        return new C4725y(this.f55403a, this.f55404b, this.f55405c, this.f55406d, this.f55407e, this.f55408f, j10, Long.valueOf(j11), this.f55411i, this.f55412j, this.f55413k);
    }

    /* access modifiers changed from: package-private */
    public final C4725y c(Long l10, Long l11, Boolean bool) {
        Boolean bool2;
        if (bool == null || bool.booleanValue()) {
            bool2 = bool;
        } else {
            bool2 = null;
        }
        return new C4725y(this.f55403a, this.f55404b, this.f55405c, this.f55406d, this.f55407e, this.f55408f, this.f55409g, this.f55410h, l10, l11, bool2);
    }

    C4725y(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        long j15 = j10;
        long j16 = j11;
        long j17 = j12;
        long j18 = j14;
        C4536s.f(str);
        C4536s.f(str2);
        boolean z10 = false;
        C4536s.a(j15 >= 0);
        C4536s.a(j16 >= 0);
        C4536s.a(j17 >= 0);
        C4536s.a(j18 >= 0 ? true : z10);
        this.f55403a = str;
        this.f55404b = str2;
        this.f55405c = j15;
        this.f55406d = j16;
        this.f55407e = j17;
        this.f55408f = j13;
        this.f55409g = j18;
        this.f55410h = l10;
        this.f55411i = l11;
        this.f55412j = l12;
        this.f55413k = bool;
    }
}
