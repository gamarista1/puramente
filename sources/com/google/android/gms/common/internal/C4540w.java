package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import za.C5298a;
import za.c;

/* renamed from: com.google.android.gms.common.internal.w  reason: case insensitive filesystem */
public class C4540w extends C5298a {
    public static final Parcelable.Creator<C4540w> CREATOR = new C();

    /* renamed from: a  reason: collision with root package name */
    private final int f54243a;

    /* renamed from: b  reason: collision with root package name */
    private List f54244b;

    public C4540w(int i10, List list) {
        this.f54243a = i10;
        this.f54244b = list;
    }

    public final int o0() {
        return this.f54243a;
    }

    public final List p0() {
        return this.f54244b;
    }

    public final void q0(C4534p pVar) {
        if (this.f54244b == null) {
            this.f54244b = new ArrayList();
        }
        this.f54244b.add(pVar);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f54243a);
        c.H(parcel, 2, this.f54244b, false);
        c.b(parcel, a10);
    }
}
