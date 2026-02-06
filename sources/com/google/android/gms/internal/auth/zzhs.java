package com.google.android.gms.internal.auth;

import java.util.List;

public final class zzhs extends zzev implements zzfy {
    /* access modifiers changed from: private */
    public static final zzhs zzb;
    private zzez zzd = zzev.zzf();

    static {
        zzhs zzhs = new zzhs();
        zzb = zzhs;
        zzev.zzk(zzhs.class, zzhs);
    }

    private zzhs() {
    }

    public static zzhs zzp(byte[] bArr) {
        return (zzhs) zzev.zzd(zzb, bArr);
    }

    /* access modifiers changed from: protected */
    public final Object zzn(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzev.zzh(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
        } else if (i11 == 3) {
            return new zzhs();
        } else {
            if (i11 == 4) {
                return new zzhr((zzhq) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final List zzq() {
        return this.zzd;
    }
}
