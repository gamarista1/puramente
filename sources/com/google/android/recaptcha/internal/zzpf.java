package com.google.android.recaptcha.internal;

import java.util.List;

public final class zzpf extends zzit implements zzkf {
    /* access modifiers changed from: private */
    public static final zzpf zzb;
    private zzjb zzd = zzit.zzx();

    static {
        zzpf zzpf = new zzpf();
        zzb = zzpf;
        zzit.zzD(zzpf.class, zzpf);
    }

    private zzpf() {
    }

    public static zzpf zzg(byte[] bArr) {
        return (zzpf) zzit.zzu(zzb, bArr);
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzit.zzA(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzpr.class});
        } else if (i11 == 3) {
            return new zzpf();
        } else {
            if (i11 == 4) {
                return new zzpe((zzor) null);
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
