package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import za.C5298a;
import za.c;

/* renamed from: com.google.android.gms.common.internal.p  reason: case insensitive filesystem */
public class C4534p extends C5298a {
    public static final Parcelable.Creator<C4534p> CREATOR = new N();

    /* renamed from: a  reason: collision with root package name */
    private final int f54210a;

    /* renamed from: b  reason: collision with root package name */
    private final int f54211b;

    /* renamed from: c  reason: collision with root package name */
    private final int f54212c;

    /* renamed from: d  reason: collision with root package name */
    private final long f54213d;

    /* renamed from: e  reason: collision with root package name */
    private final long f54214e;

    /* renamed from: f  reason: collision with root package name */
    private final String f54215f;

    /* renamed from: g  reason: collision with root package name */
    private final String f54216g;

    /* renamed from: h  reason: collision with root package name */
    private final int f54217h;

    /* renamed from: i  reason: collision with root package name */
    private final int f54218i;

    public C4534p(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f54210a = i10;
        this.f54211b = i11;
        this.f54212c = i12;
        this.f54213d = j10;
        this.f54214e = j11;
        this.f54215f = str;
        this.f54216g = str2;
        this.f54217h = i13;
        this.f54218i = i14;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f54210a;
        int a10 = c.a(parcel);
        c.t(parcel, 1, i11);
        c.t(parcel, 2, this.f54211b);
        c.t(parcel, 3, this.f54212c);
        c.w(parcel, 4, this.f54213d);
        c.w(parcel, 5, this.f54214e);
        c.D(parcel, 6, this.f54215f, false);
        c.D(parcel, 7, this.f54216g, false);
        c.t(parcel, 8, this.f54217h);
        c.t(parcel, 9, this.f54218i);
        c.b(parcel, a10);
    }
}
