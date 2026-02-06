package com.google.android.gms.common.internal;

import Ha.C4294a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

public final class M extends zaa implements IInterface {
    M(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final C4294a a(C4294a aVar, X x10) {
        Parcel zaa = zaa();
        zac.zad(zaa, aVar);
        zac.zac(zaa, x10);
        Parcel zab = zab(2, zaa);
        C4294a a10 = C4294a.C0774a.a(zab.readStrongBinder());
        zab.recycle();
        return a10;
    }
}
