package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import za.b;
import za.c;

public class X implements Parcelable.Creator {
    static void c(W w10, Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 2, w10.f57439a, false);
        c.b(parcel, a10);
    }

    /* renamed from: a */
    public W createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            if (b.v(C10) != 2) {
                b.K(parcel, C10);
            } else {
                bundle = b.f(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new W(bundle);
    }

    /* renamed from: b */
    public W[] newArray(int i10) {
        return new W[i10];
    }
}
