package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import za.C5298a;
import za.c;

/* renamed from: com.google.android.gms.common.internal.u  reason: case insensitive filesystem */
public class C4538u extends C5298a {
    public static final Parcelable.Creator<C4538u> CREATOR = new j0();

    /* renamed from: a  reason: collision with root package name */
    private final int f54230a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f54231b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f54232c;

    /* renamed from: d  reason: collision with root package name */
    private final int f54233d;

    /* renamed from: e  reason: collision with root package name */
    private final int f54234e;

    public C4538u(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f54230a = i10;
        this.f54231b = z10;
        this.f54232c = z11;
        this.f54233d = i11;
        this.f54234e = i12;
    }

    public int o0() {
        return this.f54233d;
    }

    public int p0() {
        return this.f54234e;
    }

    public boolean q0() {
        return this.f54231b;
    }

    public boolean r0() {
        return this.f54232c;
    }

    public int s0() {
        return this.f54230a;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, s0());
        c.g(parcel, 2, q0());
        c.g(parcel, 3, r0());
        c.t(parcel, 4, o0());
        c.t(parcel, 5, p0());
        c.b(parcel, a10);
    }
}
