package com.google.android.gms.internal.play_billing;

public final class zzfq extends zzhk implements zzin {
    /* access modifiers changed from: private */
    public static final zzfq zzb;
    private int zzd;
    private String zze = "";

    static {
        zzfq zzfq = new zzfq();
        zzb = zzfq;
        zzhk.zzx(zzfq.class, zzfq);
    }

    private zzfq() {
    }

    public static zzfp zza() {
        return (zzfp) zzb.zzm();
    }

    static /* synthetic */ void zzc(zzfq zzfq, String str) {
        zzfq.zzd |= 1;
        zzfq.zze = str;
    }

    /* access modifiers changed from: protected */
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzfq();
        } else {
            if (i11 == 4) {
                return new zzfp((zzfr) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
