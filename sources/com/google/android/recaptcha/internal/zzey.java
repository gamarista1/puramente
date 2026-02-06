package com.google.android.recaptcha.internal;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.p;

final class zzey extends l implements p {
    final /* synthetic */ zzez zza;
    final /* synthetic */ zzoe zzb;
    final /* synthetic */ zzbb zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzey(zzez zzez, zzoe zzoe, zzbb zzbb, C6658d dVar) {
        super(2, dVar);
        this.zza = zzez;
        this.zzb = zzoe;
        this.zzc = zzbb;
    }

    public final C6658d create(Object obj, C6658d dVar) {
        return new zzey(this.zza, this.zzb, this.zzc, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzey) create((K) obj, (C6658d) obj2)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        C6680b.f();
        w.b(obj);
        try {
            zzez zzez = this.zza;
            C5600w0 unused = C5576k.d(this.zza.zzq.zzb(), (g) null, (M) null, new zzex(this.zza, zzez.zzf().zzb(this.zzb, zzez.zzp), (C6658d) null), 3, (Object) null);
        } catch (zzp e10) {
            zzez zzez2 = this.zza;
            zzez2.zzi.zzb(this.zzc, e10, (String) null);
            this.zza.zzk().f(e10);
        }
        return C6514M.f71813a;
    }
}
