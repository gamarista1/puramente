package com.google.android.recaptcha.internal;

import java.util.List;

final class zzjq extends zzjs {
    /* synthetic */ zzjq(zzjp zzjp) {
        super((zzjr) null);
    }

    /* access modifiers changed from: package-private */
    public final List zza(Object obj, long j10) {
        int i10;
        zzjb zzjb = (zzjb) zzlv.zzf(obj, j10);
        if (zzjb.zzc()) {
            return zzjb;
        }
        int size = zzjb.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        zzjb zzd = zzjb.zzd(i10);
        zzlv.zzs(obj, j10, zzd);
        return zzd;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, long j10) {
        ((zzjb) zzlv.zzf(obj, j10)).zzb();
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Object obj, Object obj2, long j10) {
        zzjb zzjb = (zzjb) zzlv.zzf(obj, j10);
        zzjb zzjb2 = (zzjb) zzlv.zzf(obj2, j10);
        int size = zzjb.size();
        int size2 = zzjb2.size();
        if (size > 0 && size2 > 0) {
            if (!zzjb.zzc()) {
                zzjb = zzjb.zzd(size2 + size);
            }
            zzjb.addAll(zzjb2);
        }
        if (size > 0) {
            zzjb2 = zzjb;
        }
        zzlv.zzs(obj, j10, zzjb2);
    }

    private zzjq() {
        super((zzjr) null);
    }
}
