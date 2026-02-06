package com.google.android.gms.internal.play_billing;

public final class zzkd extends zzhk implements zzin {
    /* access modifiers changed from: private */
    public static final zzkd zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        zzkd zzkd = new zzkd();
        zzb = zzkd;
        zzhk.zzx(zzkd.class, zzkd);
    }

    private zzkd() {
    }

    static /* synthetic */ void zzC(zzkd zzkd, zzlb zzlb) {
        zzlb.getClass();
        zzkd.zzf = zzlb;
        zzkd.zze = 2;
    }

    static /* synthetic */ void zzD(zzkd zzkd, zzlx zzlx) {
        zzlx.getClass();
        zzkd.zzf = zzlx;
        zzkd.zze = 3;
    }

    static /* synthetic */ void zzE(zzkd zzkd, int i10) {
        zzkd.zzg = i10 - 1;
        zzkd.zzd |= 1;
    }

    public static zzkb zzc() {
        return (zzkb) zzb.zzm();
    }

    /* access modifiers changed from: protected */
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzka.zza, zzlb.class, zzlx.class, zzlh.class});
        } else if (i11 == 3) {
            return new zzkd();
        } else {
            if (i11 == 4) {
                return new zzkb((zzkc) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
