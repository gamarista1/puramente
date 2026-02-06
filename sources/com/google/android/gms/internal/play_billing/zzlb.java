package com.google.android.gms.internal.play_billing;

public final class zzlb extends zzhk implements zzin {
    /* access modifiers changed from: private */
    public static final zzlb zzb;
    private int zzd;
    private int zze;

    static {
        zzlb zzlb = new zzlb();
        zzb = zzlb;
        zzhk.zzx(zzlb.class, zzlb);
    }

    private zzlb() {
    }

    static /* synthetic */ void zzC(zzlb zzlb, int i10) {
        zzlb.zze = i10 - 1;
        zzlb.zzd |= 1;
    }

    public static zzky zzc() {
        return (zzky) zzb.zzm();
    }

    /* access modifiers changed from: protected */
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzkz.zza});
        } else if (i11 == 3) {
            return new zzlb();
        } else {
            if (i11 == 4) {
                return new zzky((zzla) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
