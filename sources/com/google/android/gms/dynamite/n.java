package com.google.android.gms.dynamite;

import Ha.C4294a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class n extends zza implements IInterface {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final C4294a a(C4294a aVar, String str, int i10, C4294a aVar2) {
        Parcel zza = zza();
        zzc.zze(zza, aVar);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zze(zza, aVar2);
        Parcel zzB = zzB(2, zza);
        C4294a a10 = C4294a.C0774a.a(zzB.readStrongBinder());
        zzB.recycle();
        return a10;
    }

    public final C4294a b(C4294a aVar, String str, int i10, C4294a aVar2) {
        Parcel zza = zza();
        zzc.zze(zza, aVar);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zze(zza, aVar2);
        Parcel zzB = zzB(3, zza);
        C4294a a10 = C4294a.C0774a.a(zzB.readStrongBinder());
        zzB.recycle();
        return a10;
    }
}
