package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import za.C5298a;
import za.c;

/* renamed from: com.google.android.gms.location.n  reason: case insensitive filesystem */
public final class C4557n extends C5298a {
    public static final Parcelable.Creator<C4557n> CREATOR = new M();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f54409a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f54410b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f54411c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f54412d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f54413e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f54414f;

    public C4557n(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f54409a = z10;
        this.f54410b = z11;
        this.f54411c = z12;
        this.f54412d = z13;
        this.f54413e = z14;
        this.f54414f = z15;
    }

    public boolean o0() {
        return this.f54414f;
    }

    public boolean p0() {
        return this.f54411c;
    }

    public boolean q0() {
        return this.f54412d;
    }

    public boolean r0() {
        return this.f54409a;
    }

    public boolean s0() {
        return this.f54413e;
    }

    public boolean t0() {
        return this.f54410b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.g(parcel, 1, r0());
        c.g(parcel, 2, t0());
        c.g(parcel, 3, p0());
        c.g(parcel, 4, q0());
        c.g(parcel, 5, s0());
        c.g(parcel, 6, o0());
        c.b(parcel, a10);
    }
}
