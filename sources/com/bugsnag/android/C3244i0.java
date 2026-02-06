package com.bugsnag.android;

import com.amazon.a.a.h.a;
import java.util.Date;
import java.util.Map;

/* renamed from: com.bugsnag.android.i0  reason: case insensitive filesystem */
public final class C3244i0 extends W {

    /* renamed from: k  reason: collision with root package name */
    private Long f38725k;

    /* renamed from: l  reason: collision with root package name */
    private Long f38726l;

    /* renamed from: m  reason: collision with root package name */
    private String f38727m;

    /* renamed from: n  reason: collision with root package name */
    private Date f38728n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3244i0(X x10, Boolean bool, String str, String str2, Long l10, Map map, Long l11, Long l12, String str3, Date date) {
        super(x10, x10.c(), bool, str, str2, l10, map);
        this.f38725k = l11;
        this.f38726l = l12;
        this.f38727m = str3;
        this.f38728n = date;
    }

    public void l(K0 k02) {
        super.l(k02);
        k02.y("freeDisk").h0(this.f38725k);
        k02.y("freeMemory").h0(this.f38726l);
        k02.y("orientation").j0(this.f38727m);
        if (this.f38728n != null) {
            k02.y(a.f37179b).E0(this.f38728n);
        }
    }

    public final Long m() {
        return this.f38725k;
    }

    public final Long n() {
        return this.f38726l;
    }

    public final String o() {
        return this.f38727m;
    }

    public final Date p() {
        return this.f38728n;
    }
}
