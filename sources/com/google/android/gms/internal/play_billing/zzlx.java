package com.google.android.gms.internal.play_billing;

public final class zzlx extends zzhk implements zzin {
    /* access modifiers changed from: private */
    public static final zzlx zzb;
    private int zzd;
    private int zze;
    private boolean zzf;

    static {
        zzlx zzlx = new zzlx();
        zzb = zzlx;
        zzhk.zzx(zzlx.class, zzlx);
    }

    private zzlx() {
    }

    static /* synthetic */ void zzC(zzlx zzlx, boolean z10) {
        zzlx.zzd |= 2;
        zzlx.zzf = true;
    }

    public static zzlv zzc() {
        return (zzlv) zzb.zzm();
    }

    /* access modifiers changed from: protected */
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzlx();
        } else {
            if (i11 == 4) {
                return new zzlv((zzlw) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
