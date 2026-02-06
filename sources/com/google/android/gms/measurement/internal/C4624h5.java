package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import za.C5298a;
import za.c;

/* renamed from: com.google.android.gms.measurement.internal.h5  reason: case insensitive filesystem */
public final class C4624h5 extends C5298a {
    public static final Parcelable.Creator<C4624h5> CREATOR = new C4617g5();

    /* renamed from: a  reason: collision with root package name */
    public final String f55133a;

    /* renamed from: b  reason: collision with root package name */
    public final long f55134b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55135c;

    C4624h5(String str, long j10, int i10) {
        this.f55133a = str;
        this.f55134b = j10;
        this.f55135c = i10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.f55133a, false);
        c.w(parcel, 2, this.f55134b);
        c.t(parcel, 3, this.f55135c);
        c.b(parcel, a10);
    }
}
