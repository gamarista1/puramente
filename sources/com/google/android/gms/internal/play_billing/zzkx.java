package com.google.android.gms.internal.play_billing;

public final class zzkx extends zzhk implements zzin {
    /* access modifiers changed from: private */
    public static final zzkx zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzkx zzkx = new zzkx();
        zzb = zzkx;
        zzhk.zzx(zzkx.class, zzkx);
    }

    private zzkx() {
    }

    /* access modifiers changed from: protected */
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzkx();
        } else {
            if (i11 == 4) {
                return new zzkv((zzkw) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
