package com.google.android.gms.internal.p001authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.C4496h;
import ra.C5184b;
import ra.C5187e;
import ra.C5188f;

/* renamed from: com.google.android.gms.internal.auth-api.zbv  reason: invalid package */
public final class zbv extends zba implements IInterface {
    zbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zbl zbl, C5184b bVar) {
        Parcel zba = zba();
        zbc.zbd(zba, zbl);
        zbc.zbc(zba, bVar);
        zbb(1, zba);
    }

    public final void zbd(zbo zbo, C5187e eVar, String str) {
        Parcel zba = zba();
        zbc.zbd(zba, zbo);
        zbc.zbc(zba, eVar);
        zba.writeString(str);
        zbb(4, zba);
    }

    public final void zbe(zbq zbq, C5188f fVar) {
        Parcel zba = zba();
        zbc.zbd(zba, zbq);
        zbc.zbc(zba, fVar);
        zbb(3, zba);
    }

    public final void zbf(C4496h hVar, String str) {
        Parcel zba = zba();
        zbc.zbd(zba, hVar);
        zba.writeString(str);
        zbb(2, zba);
    }
}
