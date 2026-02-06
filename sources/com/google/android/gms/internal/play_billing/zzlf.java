package com.google.android.gms.internal.play_billing;

public final class zzlf extends zzhk implements zzin {
    /* access modifiers changed from: private */
    public static final zzlf zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        zzlf zzlf = new zzlf();
        zzb = zzlf;
        zzhk.zzx(zzlf.class, zzlf);
    }

    private zzlf() {
    }

    /* access modifiers changed from: protected */
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", zzle.zza, "zzf"});
        } else if (i11 == 3) {
            return new zzlf();
        } else {
            if (i11 == 4) {
                return new zzld((zzlg) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
