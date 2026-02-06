package com.google.android.gms.internal.play_billing;

public final class zzki extends zzhk implements zzin {
    /* access modifiers changed from: private */
    public static final zzki zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private int zzg;
    private String zzh = "";

    static {
        zzki zzki = new zzki();
        zzb = zzki;
        zzhk.zzx(zzki.class, zzki);
    }

    private zzki() {
    }

    static /* synthetic */ void zzC(zzki zzki, String str) {
        zzki.zzd |= 8;
        zzki.zzh = str;
    }

    static /* synthetic */ void zzD(zzki zzki, String str) {
        str.getClass();
        zzki.zzd |= 2;
        zzki.zzf = str;
    }

    static /* synthetic */ void zzE(zzki zzki, int i10) {
        zzki.zzd |= 1;
        zzki.zze = i10;
    }

    static /* synthetic */ void zzF(zzki zzki, int i10) {
        zzki.zzg = i10 - 1;
        zzki.zzd |= 4;
    }

    public static zzke zzc() {
        return (zzke) zzb.zzm();
    }

    /* access modifiers changed from: protected */
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", zzkf.zza, "zzh"});
        } else if (i11 == 3) {
            return new zzki();
        } else {
            if (i11 == 4) {
                return new zzke((zzkh) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
