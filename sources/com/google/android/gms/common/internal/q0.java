package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ya.C5286c;
import za.C5298a;
import za.c;

public final class q0 extends C5298a {
    public static final Parcelable.Creator<q0> CREATOR = new r0();

    /* renamed from: a  reason: collision with root package name */
    Bundle f54222a;

    /* renamed from: b  reason: collision with root package name */
    C5286c[] f54223b;

    /* renamed from: c  reason: collision with root package name */
    int f54224c;

    /* renamed from: d  reason: collision with root package name */
    C4524f f54225d;

    q0(Bundle bundle, C5286c[] cVarArr, int i10, C4524f fVar) {
        this.f54222a = bundle;
        this.f54223b = cVarArr;
        this.f54224c = i10;
        this.f54225d = fVar;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 1, this.f54222a, false);
        c.G(parcel, 2, this.f54223b, i10, false);
        c.t(parcel, 3, this.f54224c);
        c.B(parcel, 4, this.f54225d, i10, false);
        c.b(parcel, a10);
    }
}
