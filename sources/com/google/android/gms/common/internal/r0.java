package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ya.C5286c;
import za.b;

public final class r0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        Bundle bundle = null;
        C4524f fVar = null;
        int i10 = 0;
        C5286c[] cVarArr = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                bundle = b.f(parcel, C10);
            } else if (v10 == 2) {
                cVarArr = (C5286c[]) b.s(parcel, C10, C5286c.CREATOR);
            } else if (v10 == 3) {
                i10 = b.E(parcel, C10);
            } else if (v10 != 4) {
                b.K(parcel, C10);
            } else {
                fVar = (C4524f) b.o(parcel, C10, C4524f.CREATOR);
            }
        }
        b.u(parcel, L10);
        return new q0(bundle, cVarArr, i10, fVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new q0[i10];
    }
}
