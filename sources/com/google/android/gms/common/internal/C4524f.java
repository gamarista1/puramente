package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import za.C5298a;
import za.c;

/* renamed from: com.google.android.gms.common.internal.f  reason: case insensitive filesystem */
public class C4524f extends C5298a {
    public static final Parcelable.Creator<C4524f> CREATOR = new s0();

    /* renamed from: a  reason: collision with root package name */
    private final C4538u f54164a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f54165b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f54166c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f54167d;

    /* renamed from: e  reason: collision with root package name */
    private final int f54168e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f54169f;

    public C4524f(C4538u uVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f54164a = uVar;
        this.f54165b = z10;
        this.f54166c = z11;
        this.f54167d = iArr;
        this.f54168e = i10;
        this.f54169f = iArr2;
    }

    public int o0() {
        return this.f54168e;
    }

    public int[] p0() {
        return this.f54167d;
    }

    public int[] q0() {
        return this.f54169f;
    }

    public boolean r0() {
        return this.f54165b;
    }

    public boolean s0() {
        return this.f54166c;
    }

    public final C4538u t0() {
        return this.f54164a;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 1, this.f54164a, i10, false);
        c.g(parcel, 2, r0());
        c.g(parcel, 3, s0());
        c.u(parcel, 4, p0(), false);
        c.t(parcel, 5, o0());
        c.u(parcel, 6, q0(), false);
        c.b(parcel, a10);
    }
}
