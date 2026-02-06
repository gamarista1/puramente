package com.google.android.recaptcha.internal;

public final class zzot extends zzit implements zzkf {
    /* access modifiers changed from: private */
    public static final zzot zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";

    static {
        zzot zzot = new zzot();
        zzb = zzot;
        zzit.zzD(zzot.class, zzot);
    }

    private zzot() {
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzit.zzA(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzot();
        } else {
            if (i11 == 4) {
                return new zzos((zzor) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
