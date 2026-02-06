package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import za.C5298a;
import za.c;

public final class X extends C5298a {
    public static final Parcelable.Creator<X> CREATOR = new Y();

    /* renamed from: a  reason: collision with root package name */
    final int f54137a;

    /* renamed from: b  reason: collision with root package name */
    private final int f54138b;

    /* renamed from: c  reason: collision with root package name */
    private final int f54139c;

    /* renamed from: d  reason: collision with root package name */
    private final Scope[] f54140d;

    X(int i10, int i11, int i12, Scope[] scopeArr) {
        this.f54137a = i10;
        this.f54138b = i11;
        this.f54139c = i12;
        this.f54140d = scopeArr;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f54137a;
        int a10 = c.a(parcel);
        c.t(parcel, 1, i11);
        c.t(parcel, 2, this.f54138b);
        c.t(parcel, 3, this.f54139c);
        c.G(parcel, 4, this.f54140d, i10, false);
        c.b(parcel, a10);
    }
}
