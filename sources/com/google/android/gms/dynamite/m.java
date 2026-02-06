package com.google.android.gms.dynamite;

import Ha.C4294a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class m extends zza implements IInterface {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int r1() {
        Parcel zzB = zzB(6, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final int s1(C4294a aVar, String str, boolean z10) {
        Parcel zza = zza();
        zzc.zze(zza, aVar);
        zza.writeString(str);
        zza.writeInt(z10 ? 1 : 0);
        Parcel zzB = zzB(3, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final int t1(C4294a aVar, String str, boolean z10) {
        Parcel zza = zza();
        zzc.zze(zza, aVar);
        zza.writeString(str);
        zza.writeInt(z10 ? 1 : 0);
        Parcel zzB = zzB(5, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final C4294a u1(C4294a aVar, String str, int i10) {
        Parcel zza = zza();
        zzc.zze(zza, aVar);
        zza.writeString(str);
        zza.writeInt(i10);
        Parcel zzB = zzB(2, zza);
        C4294a a10 = C4294a.C0774a.a(zzB.readStrongBinder());
        zzB.recycle();
        return a10;
    }

    public final C4294a v1(C4294a aVar, String str, int i10, C4294a aVar2) {
        Parcel zza = zza();
        zzc.zze(zza, aVar);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zze(zza, aVar2);
        Parcel zzB = zzB(8, zza);
        C4294a a10 = C4294a.C0774a.a(zzB.readStrongBinder());
        zzB.recycle();
        return a10;
    }

    public final C4294a w1(C4294a aVar, String str, int i10) {
        Parcel zza = zza();
        zzc.zze(zza, aVar);
        zza.writeString(str);
        zza.writeInt(i10);
        Parcel zzB = zzB(4, zza);
        C4294a a10 = C4294a.C0774a.a(zzB.readStrongBinder());
        zzB.recycle();
        return a10;
    }

    public final C4294a x1(C4294a aVar, String str, boolean z10, long j10) {
        Parcel zza = zza();
        zzc.zze(zza, aVar);
        zza.writeString(str);
        zza.writeInt(z10 ? 1 : 0);
        zza.writeLong(j10);
        Parcel zzB = zzB(7, zza);
        C4294a a10 = C4294a.C0774a.a(zzB.readStrongBinder());
        zzB.recycle();
        return a10;
    }
}
