package com.google.android.gms.internal.play_billing;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzgr extends zzgc {
    private static final Logger zzb = Logger.getLogger(zzgr.class.getName());
    /* access modifiers changed from: private */
    public static final boolean zzc = zzjq.zzx();
    zzgs zza;

    private zzgr() {
        throw null;
    }

    public static int zzA(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    @Deprecated
    static int zzw(int i10, zzim zzim, zzix zzix) {
        int zzz = zzz(i10 << 3);
        return zzz + zzz + ((zzfv) zzim).zze(zzix);
    }

    static int zzx(zzim zzim, zzix zzix) {
        int zze = ((zzfv) zzim).zze(zzix);
        return zzz(zze) + zze;
    }

    public static int zzy(String str) {
        int i10;
        try {
            i10 = zzjt.zzc(str);
        } catch (zzjs unused) {
            i10 = str.getBytes(zzhp.zza).length;
        }
        return zzz(i10) + i10;
    }

    public static int zzz(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public final void zzB() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzC(String str, zzjs zzjs) {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzjs);
        byte[] bytes = str.getBytes(zzhp.zza);
        try {
            int length = bytes.length;
            zzt(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgp(e10);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b10);

    public abstract void zzd(int i10, boolean z10);

    public abstract void zze(int i10, zzgk zzgk);

    public abstract void zzf(int i10, int i11);

    public abstract void zzg(int i10);

    public abstract void zzh(int i10, long j10);

    public abstract void zzi(long j10);

    public abstract void zzj(int i10, int i11);

    public abstract void zzk(int i10);

    public abstract void zzl(byte[] bArr, int i10, int i11);

    /* access modifiers changed from: package-private */
    public abstract void zzm(int i10, zzim zzim, zzix zzix);

    public abstract void zzn(int i10, zzim zzim);

    public abstract void zzo(int i10, zzgk zzgk);

    public abstract void zzp(int i10, String str);

    public abstract void zzr(int i10, int i11);

    public abstract void zzs(int i10, int i11);

    public abstract void zzt(int i10);

    public abstract void zzu(int i10, long j10);

    public abstract void zzv(long j10);

    /* synthetic */ zzgr(zzgq zzgq) {
    }
}
