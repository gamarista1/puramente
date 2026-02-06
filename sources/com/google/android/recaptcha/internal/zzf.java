package com.google.android.recaptcha.internal;

import Ug.C5566f;
import Ug.K;
import Ug.M;
import Ug.S;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.N;
import lf.C6514M;
import lf.v;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.p;

final class zzf extends l implements p {
    int zza;
    final /* synthetic */ zzg zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzoe zzd;
    private /* synthetic */ Object zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzf(zzg zzg, long j10, zzoe zzoe, C6658d dVar) {
        super(2, dVar);
        this.zzb = zzg;
        this.zzc = j10;
        this.zzd = zzoe;
    }

    public final C6658d create(Object obj, C6658d dVar) {
        zzf zzf = new zzf(this.zzb, this.zzc, this.zzd, dVar);
        zzf.zze = obj;
        return zzf;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzf) create((K) obj, (C6658d) obj2)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        N n10;
        Object obj3;
        Object f10 = C6680b.f();
        if (this.zza != 0) {
            n10 = (N) this.zze;
            w.b(obj);
            obj2 = obj;
        } else {
            w.b(obj);
            K k10 = (K) this.zze;
            ArrayList arrayList = new ArrayList();
            for (zza zze2 : this.zzb.zzc()) {
                arrayList.add(C5576k.b(k10, (g) null, (M) null, new zze(zze2, this.zzc, this.zzd, (C6658d) null), 3, (Object) null));
            }
            N n11 = new N();
            S[] sArr = (S[]) arrayList.toArray(new S[0]);
            this.zze = n11;
            this.zza = 1;
            obj2 = C5566f.a((S[]) Arrays.copyOf(sArr, sArr.length), this);
            if (obj2 == f10) {
                return f10;
            }
            n10 = n11;
        }
        for (v j10 : (List) obj2) {
            Throwable e10 = v.e(j10.j());
            if (e10 != null) {
                zzp zzp = null;
                if (n10.f71759a != null) {
                    zzp = new zzp(zzn.zzc, zzl.zzal, (String) null);
                } else if (e10 instanceof zzp) {
                    zzp = (zzp) e10;
                }
                n10.f71759a = zzp;
            }
        }
        zzp zzp2 = (zzp) n10.f71759a;
        if (zzp2 != null) {
            v.a aVar = v.f71841b;
            obj3 = w.a(zzp2);
        } else {
            v.a aVar2 = v.f71841b;
            obj3 = C6514M.f71813a;
        }
        return v.a(v.b(obj3));
    }
}
