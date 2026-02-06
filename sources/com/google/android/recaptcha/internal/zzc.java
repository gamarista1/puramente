package com.google.android.recaptcha.internal;

import Ug.C5566f;
import Ug.K;
import Ug.M;
import Ug.S;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.v;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.p;

final class zzc extends l implements p {
    int zza;
    final /* synthetic */ zzg zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzc(zzg zzg, String str, long j10, C6658d dVar) {
        super(2, dVar);
        this.zzb = zzg;
        this.zzc = str;
        this.zzd = j10;
    }

    public final C6658d create(Object obj, C6658d dVar) {
        zzc zzc2 = new zzc(this.zzb, this.zzc, this.zzd, dVar);
        zzc2.zze = obj;
        return zzc2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzc) create((K) obj, (C6658d) obj2)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object f10 = C6680b.f();
        int i10 = this.zza;
        w.b(obj);
        if (i10 != 0) {
            obj2 = obj;
        } else {
            K k10 = (K) this.zze;
            ArrayList arrayList = new ArrayList();
            for (zza zzb2 : this.zzb.zzc()) {
                arrayList.add(C5576k.b(k10, (g) null, (M) null, new zzb(zzb2, this.zzc, this.zzd, (C6658d) null), 3, (Object) null));
            }
            S[] sArr = (S[]) arrayList.toArray(new S[0]);
            this.zza = 1;
            obj2 = C5566f.a((S[]) Arrays.copyOf(sArr, sArr.length), this);
            if (obj2 == f10) {
                return f10;
            }
        }
        String str = this.zzc;
        zzof zzf = zzog.zzf();
        zzf.zzd(str);
        for (v j10 : (List) obj2) {
            Object j11 = j10.j();
            if (v.h(j11)) {
                zzf.zzg((zzog) j11);
            }
        }
        return (zzog) zzf.zzj();
    }
}
