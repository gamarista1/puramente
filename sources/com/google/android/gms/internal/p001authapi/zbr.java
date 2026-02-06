package com.google.android.gms.internal.p001authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import ra.h;

/* renamed from: com.google.android.gms.internal.auth-api.zbr  reason: invalid package */
public abstract class zbr extends zbb implements zbs {
    public zbr() {
        super("com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zbc.zbb(parcel);
        zbb((Status) zbc.zba(parcel, Status.CREATOR), (h) zbc.zba(parcel, h.CREATOR));
        return true;
    }
}
