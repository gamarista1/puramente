package com.google.android.gms.internal.play_billing;

public final class zzku extends zzhk implements zzin {
    /* access modifiers changed from: private */
    public static final zzku zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg;
    private long zzh;

    static {
        zzku zzku = new zzku();
        zzb = zzku;
        zzhk.zzx(zzku.class, zzku);
    }

    private zzku() {
    }

    static /* synthetic */ void zzC(zzku zzku, int i10) {
        zzku.zzd |= 4;
        zzku.zzg = i10;
    }

    static /* synthetic */ void zzD(zzku zzku, long j10) {
        zzku.zzd |= 8;
        zzku.zzh = j10;
    }

    static /* synthetic */ void zzE(zzku zzku, String str) {
        str.getClass();
        zzku.zzd |= 2;
        zzku.zzf = str;
    }

    static /* synthetic */ void zzF(zzku zzku, String str) {
        str.getClass();
        zzku.zzd |= 1;
        zzku.zze = str;
    }

    public static zzks zzc() {
        return (zzks) zzb.zzm();
    }

    /* access modifiers changed from: protected */
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzku();
        } else {
            if (i11 == 4) {
                return new zzks((zzkt) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
