package com.google.android.gms.common.internal;

import Ha.C4294a;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;

public final class D0 extends zza implements C4517b0 {
    D0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final int zzc() {
        Parcel zzB = zzB(2, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final C4294a zzd() {
        Parcel zzB = zzB(1, zza());
        C4294a a10 = C4294a.C0774a.a(zzB.readStrongBinder());
        zzB.recycle();
        return a10;
    }
}
