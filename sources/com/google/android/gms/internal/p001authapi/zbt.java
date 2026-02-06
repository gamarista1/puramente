package com.google.android.gms.internal.p001authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import ra.j;

/* renamed from: com.google.android.gms.internal.auth-api.zbt  reason: invalid package */
public abstract class zbt extends zbb implements zbu {
    public zbt() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zbc.zbb(parcel);
        zbb((Status) zbc.zba(parcel, Status.CREATOR), (j) zbc.zba(parcel, j.CREATOR));
        return true;
    }
}
