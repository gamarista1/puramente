package com.google.android.gms.internal.p001authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import ra.C5185c;

/* renamed from: com.google.android.gms.internal.auth-api.zbk  reason: invalid package */
public abstract class zbk extends zbb implements zbl {
    public zbk() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zbc.zbb(parcel);
        zbb((Status) zbc.zba(parcel, Status.CREATOR), (C5185c) zbc.zba(parcel, C5185c.CREATOR));
        return true;
    }
}
