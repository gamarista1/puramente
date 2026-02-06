package com.google.android.gms.internal.p001authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import ra.i;

/* renamed from: com.google.android.gms.internal.auth-api.zbm  reason: invalid package */
public final class zbm extends zba implements IInterface {
    zbm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void zbc(zbs zbs, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        Parcel zba = zba();
        zbc.zbd(zba, zbs);
        zbc.zbc(zba, saveAccountLinkingTokenRequest);
        zbb(1, zba);
    }

    public final void zbd(zbu zbu, i iVar) {
        Parcel zba = zba();
        zbc.zbd(zba, zbu);
        zbc.zbc(zba, iVar);
        zbb(2, zba);
    }
}
