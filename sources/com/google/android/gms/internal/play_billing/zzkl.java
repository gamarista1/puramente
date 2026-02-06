package com.google.android.gms.internal.play_billing;

public final class zzkl extends zzhk implements zzin {
    /* access modifiers changed from: private */
    public static final zzkl zzb;

    static {
        zzkl zzkl = new zzkl();
        zzb = zzkl;
        zzhk.zzx(zzkl.class, zzkl);
    }

    private zzkl() {
    }

    public static zzkl zzB() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0000", (Object[]) null);
        }
        if (i11 == 3) {
            return new zzkl();
        }
        if (i11 == 4) {
            return new zzkj((zzkk) null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
