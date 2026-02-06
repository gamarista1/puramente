package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4536s;
import za.C5298a;
import za.c;

/* renamed from: com.google.android.gms.measurement.internal.f  reason: case insensitive filesystem */
public final class C4604f extends C5298a {
    public static final Parcelable.Creator<C4604f> CREATOR = new C4597e();

    /* renamed from: a  reason: collision with root package name */
    public String f55060a;

    /* renamed from: b  reason: collision with root package name */
    public String f55061b;

    /* renamed from: c  reason: collision with root package name */
    public A5 f55062c;

    /* renamed from: d  reason: collision with root package name */
    public long f55063d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f55064e;

    /* renamed from: f  reason: collision with root package name */
    public String f55065f;

    /* renamed from: g  reason: collision with root package name */
    public D f55066g;

    /* renamed from: h  reason: collision with root package name */
    public long f55067h;

    /* renamed from: i  reason: collision with root package name */
    public D f55068i;

    /* renamed from: j  reason: collision with root package name */
    public long f55069j;

    /* renamed from: k  reason: collision with root package name */
    public D f55070k;

    C4604f(C4604f fVar) {
        C4536s.l(fVar);
        this.f55060a = fVar.f55060a;
        this.f55061b = fVar.f55061b;
        this.f55062c = fVar.f55062c;
        this.f55063d = fVar.f55063d;
        this.f55064e = fVar.f55064e;
        this.f55065f = fVar.f55065f;
        this.f55066g = fVar.f55066g;
        this.f55067h = fVar.f55067h;
        this.f55068i = fVar.f55068i;
        this.f55069j = fVar.f55069j;
        this.f55070k = fVar.f55070k;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 2, this.f55060a, false);
        c.D(parcel, 3, this.f55061b, false);
        c.B(parcel, 4, this.f55062c, i10, false);
        c.w(parcel, 5, this.f55063d);
        c.g(parcel, 6, this.f55064e);
        c.D(parcel, 7, this.f55065f, false);
        c.B(parcel, 8, this.f55066g, i10, false);
        c.w(parcel, 9, this.f55067h);
        c.B(parcel, 10, this.f55068i, i10, false);
        c.w(parcel, 11, this.f55069j);
        c.B(parcel, 12, this.f55070k, i10, false);
        c.b(parcel, a10);
    }

    C4604f(String str, String str2, A5 a52, long j10, boolean z10, String str3, D d10, long j11, D d11, long j12, D d12) {
        this.f55060a = str;
        this.f55061b = str2;
        this.f55062c = a52;
        this.f55063d = j10;
        this.f55064e = z10;
        this.f55065f = str3;
        this.f55066g = d10;
        this.f55067h = j11;
        this.f55068i = d11;
        this.f55069j = j12;
        this.f55070k = d12;
    }
}
