package com.google.android.gms.internal.play_billing;

public final class zzln extends zzhk implements zzin {
    /* access modifiers changed from: private */
    public static final zzln zzb;
    private int zzd;
    private zzho zze = zzhk.zzs();
    private int zzf;
    private String zzg = "";

    static {
        zzln zzln = new zzln();
        zzb = zzln;
        zzhk.zzx(zzln.class, zzln);
    }

    private zzln() {
    }

    /* access modifiers changed from: protected */
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzln();
        } else {
            if (i11 == 4) {
                return new zzll((zzlm) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
