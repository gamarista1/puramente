package com.google.android.gms.internal.p001authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import ra.C5183a;

/* renamed from: com.google.android.gms.internal.auth-api.zbh  reason: invalid package */
public abstract class zbh extends zbb implements zbi {
    public zbh() {
        super("com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zbc.zbb(parcel);
        zbb((Status) zbc.zba(parcel, Status.CREATOR), (C5183a) zbc.zba(parcel, C5183a.CREATOR));
        return true;
    }
}
