package com.google.android.recaptcha.internal;

public final class zzox extends zzit implements zzkf {
    /* access modifiers changed from: private */
    public static final zzox zzb;
    private int zzd;

    static {
        zzox zzox = new zzox();
        zzb = zzox;
        zzit.zzD(zzox.class, zzox);
    }

    private zzox() {
    }

    public static zzox zzg(byte[] bArr) {
        return (zzox) zzit.zzu(zzb, bArr);
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzit.zzA(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zzd"});
        } else if (i11 == 3) {
            return new zzox();
        } else {
            if (i11 == 4) {
                return new zzow((zzor) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzpb zzi() {
        zzpb zzb2 = zzpb.zzb(this.zzd);
        if (zzb2 == null) {
            return zzpb.UNRECOGNIZED;
        }
        return zzb2;
    }
}
