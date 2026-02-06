package com.google.android.gms.internal.play_billing;

public final class zzkr extends zzhk implements zzin {
    /* access modifiers changed from: private */
    public static final zzkr zzb;
    private int zzd;
    private String zze = "";
    private int zzf;
    private zzhn zzg = zzhk.zzr();
    private zzho zzh = zzhk.zzs();
    private zzki zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        zzkr zzkr = new zzkr();
        zzb = zzkr;
        zzhk.zzx(zzkr.class, zzkr);
    }

    private zzkr() {
    }

    /* access modifiers changed from: protected */
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", zzkp.zza, "zzg", zzkm.zza, "zzh", zzln.class, "zzi", "zzj", "zzk"});
        } else if (i11 == 3) {
            return new zzkr();
        } else {
            if (i11 == 4) {
                return new zzko((zzkq) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
