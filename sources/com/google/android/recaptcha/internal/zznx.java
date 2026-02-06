package com.google.android.recaptcha.internal;

import java.util.List;

public final class zznx extends zzit implements zzkf {
    /* access modifiers changed from: private */
    public static final zznx zzb;
    private zzjb zzd = zzit.zzx();

    static {
        zznx zznx = new zznx();
        zzb = zznx;
        zzit.zzD(zznx.class, zznx);
    }

    private zznx() {
    }

    public static zznx zzg() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzit.zzA(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"zzd"});
        } else if (i11 == 3) {
            return new zznx();
        } else {
            if (i11 == 4) {
                return new zznw((zznv) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final List zzi() {
        return this.zzd;
    }
}
