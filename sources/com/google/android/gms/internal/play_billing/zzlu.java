package com.google.android.gms.internal.play_billing;

public final class zzlu extends zzhk implements zzin {
    /* access modifiers changed from: private */
    public static final zzlu zzb;
    private int zzd;
    private int zze;

    static {
        zzlu zzlu = new zzlu();
        zzb = zzlu;
        zzhk.zzx(zzlu.class, zzlu);
    }

    private zzlu() {
    }

    public static zzlu zzB() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzls.zza});
        } else if (i11 == 3) {
            return new zzlu();
        } else {
            if (i11 == 4) {
                return new zzlr((zzlt) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
