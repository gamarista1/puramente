package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.p;

final class zzcx extends C6498u implements p {
    final /* synthetic */ zzcj zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcx(zzcj zzcj, String str, int i10) {
        super(2);
        this.zza = zzcj;
        this.zzb = str;
        this.zzc = i10;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        this.zza.zzi().zzb(this.zzb, (String) obj2);
        int i10 = this.zzc;
        if (i10 != -1) {
            this.zza.zzc().zzf(i10, objArr);
        }
        return C6514M.f71813a;
    }
}
