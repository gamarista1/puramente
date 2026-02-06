package com.google.android.gms.internal.p002firebaseauthapi;

import Db.A0;
import Db.C4254b0;
import Db.C4258f;
import Db.C4260h;
import Db.C4265m;
import Db.C4272u;
import Db.C4273v;
import Db.K;
import Db.k0;
import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.A;
import com.google.firebase.auth.C;
import com.google.firebase.auth.C4780c0;
import com.google.firebase.auth.C4781d;
import com.google.firebase.auth.C4783e;
import com.google.firebase.auth.C4789h;
import com.google.firebase.auth.C4791i;
import com.google.firebase.auth.C4793j;
import com.google.firebase.auth.O;
import com.google.firebase.auth.Q;
import com.google.firebase.auth.S;
import com.google.firebase.auth.U;
import com.google.firebase.auth.W;
import com.google.firebase.auth.X;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import ub.C5230g;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaak  reason: invalid package */
public final class zzaak extends zzadj {
    public zzaak(C5230g gVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzaci(gVar, scheduledExecutorService);
        this.zzb = executor;
    }

    public final Task<Void> zza(C5230g gVar, String str, String str2) {
        return zza((zzaaj) new zzaaj(str, str2).zza(gVar));
    }

    public final Task<C4781d> zzb(C5230g gVar, String str, String str2) {
        return zza((zzaam) new zzaam(str, str2).zza(gVar));
    }

    public final Task<W> zzc(C5230g gVar, String str, String str2) {
        return zza((zzaaq) new zzaaq(str, str2).zza(gVar));
    }

    public final Task<Void> zzd(C5230g gVar, A a10, String str, C4254b0 b0Var) {
        return zza((zzaca) new zzaca(str).zza(gVar).zza(a10).zza(b0Var).zza((C4272u) b0Var));
    }

    public final Task<Void> zza(C5230g gVar, String str, String str2, String str3) {
        return zza((zzaal) new zzaal(str, str2, str3).zza(gVar));
    }

    public final Task<Void> zzb(C5230g gVar, A a10, C4789h hVar, String str, C4254b0 b0Var) {
        return zza((zzaba) new zzaba(hVar, str).zza(gVar).zza(a10).zza(b0Var).zza((C4272u) b0Var));
    }

    public final Task<C4791i> zzc(C5230g gVar, A a10, C4789h hVar, String str, C4254b0 b0Var) {
        return zza((zzaaz) new zzaaz(hVar, str).zza(gVar).zza(a10).zza(b0Var).zza((C4272u) b0Var));
    }

    public final Task<C4791i> zza(C5230g gVar, String str, String str2, String str3, String str4, k0 k0Var) {
        return zza((zzaao) new zzaao(str, str2, str3, str4).zza(gVar).zza(k0Var));
    }

    public final Task<String> zzd(C5230g gVar, String str, String str2) {
        return zza((zzace) new zzace(str, str2).zza(gVar));
    }

    public final Task<C4791i> zzb(C5230g gVar, A a10, C4793j jVar, String str, C4254b0 b0Var) {
        return zza((zzabb) new zzabb(jVar, str).zza(gVar).zza(a10).zza(b0Var).zza((C4272u) b0Var));
    }

    public final Task<Void> zzc(C5230g gVar, A a10, String str, C4254b0 b0Var) {
        return zza((zzabx) new zzabx(str).zza(gVar).zza(a10).zza(b0Var).zza((C4272u) b0Var));
    }

    public final Task<Void> zza(A a10, C4273v vVar) {
        return zza((zzaan) new zzaan().zza(a10).zza(vVar).zza((C4272u) vVar));
    }

    public final Task<Void> zza(C5230g gVar, S s10, A a10, String str, k0 k0Var) {
        zzads.zza();
        zzaap zzaap = new zzaap(s10, a10.zze(), str, (String) null);
        zzaap.zza(gVar).zza(k0Var);
        return zza(zzaap);
    }

    public final Task<C4791i> zzb(C5230g gVar, A a10, String str, String str2, String str3, String str4, C4254b0 b0Var) {
        return zza((zzabd) new zzabd(str, str2, str3, str4).zza(gVar).zza(a10).zza(b0Var).zza((C4272u) b0Var));
    }

    public final Task<Void> zza(C5230g gVar, X x10, A a10, String str, String str2, k0 k0Var) {
        zzaap zzaap = new zzaap(x10, a10.zze(), str, str2);
        zzaap.zza(gVar).zza(k0Var);
        return zza(zzaap);
    }

    public final Task<C4791i> zzb(C5230g gVar, A a10, O o10, String str, C4254b0 b0Var) {
        zzads.zza();
        return zza((zzabf) new zzabf(o10, str).zza(gVar).zza(a10).zza(b0Var).zza((C4272u) b0Var));
    }

    public final Task<C4791i> zza(C5230g gVar, A a10, S s10, String str, k0 k0Var) {
        zzads.zza();
        zzaas zzaas = new zzaas(s10, str, (String) null);
        zzaas.zza(gVar).zza(k0Var);
        if (a10 != null) {
            zzaas.zza(a10);
        }
        return zza(zzaas);
    }

    public final Task<Void> zzb(C5230g gVar, String str, C4783e eVar, String str2, String str3) {
        eVar.w0(6);
        return zza((zzabj) new zzabj(str, eVar, str2, str3, "sendSignInLinkToEmail").zza(gVar));
    }

    public final Task<C4791i> zza(C5230g gVar, A a10, X x10, String str, String str2, k0 k0Var) {
        zzaas zzaas = new zzaas(x10, str, str2);
        zzaas.zza(gVar).zza(k0Var);
        if (a10 != null) {
            zzaas.zza(a10);
        }
        return zza(zzaas);
    }

    public final Task<C4791i> zzb(C5230g gVar, String str, String str2, String str3, String str4, k0 k0Var) {
        return zza((zzabq) new zzabq(str, str2, str3, str4).zza(gVar).zza(k0Var));
    }

    public final Task<C> zza(C5230g gVar, A a10, String str, C4254b0 b0Var) {
        return zza((zzaar) new zzaar(str).zza(gVar).zza(a10).zza(b0Var).zza((C4272u) b0Var));
    }

    public final Task<C4791i> zzb(C5230g gVar, A a10, String str, C4254b0 b0Var) {
        C4536s.l(gVar);
        C4536s.f(str);
        C4536s.l(a10);
        C4536s.l(b0Var);
        List zzg = a10.zzg();
        if ((zzg != null && !zzg.contains(str)) || a10.u0()) {
            return Tasks.forException(zzach.zza(new Status(17016, str)));
        }
        str.hashCode();
        if (!str.equals("password")) {
            return zza((zzaby) new zzaby(str).zza(gVar).zza(a10).zza(b0Var).zza((C4272u) b0Var));
        }
        return zza((zzabv) new zzabv().zza(gVar).zza(a10).zza(b0Var).zza((C4272u) b0Var));
    }

    public final Task<zzafi> zza() {
        return zza(new zzaau());
    }

    public final Task<zzafn> zza(String str, String str2) {
        return zza(new zzaat(str, str2));
    }

    public final Task<C4791i> zza(C5230g gVar, A a10, C4789h hVar, String str, C4254b0 b0Var) {
        C4536s.l(gVar);
        C4536s.l(hVar);
        C4536s.l(a10);
        C4536s.l(b0Var);
        List zzg = a10.zzg();
        if (zzg != null && zzg.contains(hVar.o0())) {
            return Tasks.forException(zzach.zza(new Status(17015)));
        }
        if (hVar instanceof C4793j) {
            C4793j jVar = (C4793j) hVar;
            if (!jVar.u0()) {
                return zza((zzaaw) new zzaaw(jVar, str).zza(gVar).zza(a10).zza(b0Var).zza((C4272u) b0Var));
            }
            return zza((zzaax) new zzaax(jVar).zza(gVar).zza(a10).zza(b0Var).zza((C4272u) b0Var));
        } else if (hVar instanceof O) {
            zzads.zza();
            return zza((zzaay) new zzaay((O) hVar).zza(gVar).zza(a10).zza(b0Var).zza((C4272u) b0Var));
        } else {
            C4536s.l(gVar);
            C4536s.l(hVar);
            C4536s.l(a10);
            C4536s.l(b0Var);
            return zza((zzaav) new zzaav(hVar).zza(gVar).zza(a10).zza(b0Var).zza((C4272u) b0Var));
        }
    }

    public final Task<Void> zza(C5230g gVar, A a10, C4793j jVar, String str, C4254b0 b0Var) {
        return zza((zzabc) new zzabc(jVar, str).zza(gVar).zza(a10).zza(b0Var).zza((C4272u) b0Var));
    }

    public final Task<Void> zza(C5230g gVar, A a10, String str, String str2, String str3, String str4, C4254b0 b0Var) {
        return zza((zzabe) new zzabe(str, str2, str3, str4).zza(gVar).zza(a10).zza(b0Var).zza((C4272u) b0Var));
    }

    public final Task<Void> zza(C5230g gVar, A a10, O o10, String str, C4254b0 b0Var) {
        zzads.zza();
        return zza((zzabg) new zzabg(o10, str).zza(gVar).zza(a10).zza(b0Var).zza((C4272u) b0Var));
    }

    public final Task<Void> zza(C5230g gVar, A a10, C4254b0 b0Var) {
        return zza((zzabi) new zzabi().zza(gVar).zza(a10).zza(b0Var).zza((C4272u) b0Var));
    }

    public final Task<Void> zza(String str, String str2, String str3, String str4) {
        return zza(new zzabh(str, str2, str3, str4));
    }

    public final Task<Void> zza(C5230g gVar, C4783e eVar, String str) {
        return zza((zzabk) new zzabk(str, eVar).zza(gVar));
    }

    public final Task<Void> zza(C5230g gVar, String str, C4783e eVar, String str2, String str3) {
        eVar.w0(1);
        return zza((zzabj) new zzabj(str, eVar, str2, str3, "sendPasswordResetEmail").zza(gVar));
    }

    public final Task<Void> zza(String str) {
        return zza(new zzabm(str));
    }

    public final Task<C4791i> zza(C5230g gVar, k0 k0Var, String str) {
        return zza((zzabl) new zzabl(str).zza(gVar).zza(k0Var));
    }

    public final Task<C4791i> zza(C5230g gVar, C4789h hVar, String str, k0 k0Var) {
        return zza((zzabo) new zzabo(hVar, str).zza(gVar).zza(k0Var));
    }

    public final Task<C4791i> zza(C5230g gVar, String str, String str2, k0 k0Var) {
        return zza((zzabn) new zzabn(str, str2).zza(gVar).zza(k0Var));
    }

    public final Task<C4791i> zza(C5230g gVar, C4793j jVar, String str, k0 k0Var) {
        return zza((zzabp) new zzabp(jVar, str).zza(gVar).zza(k0Var));
    }

    public final Task<C4791i> zza(C5230g gVar, O o10, String str, k0 k0Var) {
        zzads.zza();
        return zza((zzabs) new zzabs(o10, str).zza(gVar).zza(k0Var));
    }

    public final Task<Void> zza(C4265m mVar, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, boolean z12, Q.b bVar, Executor executor, Activity activity) {
        zzabr zzabr = new zzabr(mVar, str, str2, j10, z10, z11, str3, str4, z12);
        String str5 = str;
        zzabr.zza(bVar, activity, executor, str);
        return zza(zzabr);
    }

    public final Task<zzagi> zza(C4265m mVar, String str) {
        return zza(new zzabu(mVar, str));
    }

    public final Task<Void> zza(C4265m mVar, U u10, String str, long j10, boolean z10, boolean z11, String str2, String str3, boolean z12, Q.b bVar, Executor executor, Activity activity) {
        zzabt zzabt = new zzabt(u10, C4536s.f(mVar.zzc()), str, j10, z10, z11, str2, str3, z12);
        Activity activity2 = activity;
        zzabt.zza(bVar, activity2, executor, u10.a());
        return zza(zzabt);
    }

    public final Task<Void> zza(C5230g gVar, A a10, String str, String str2, C4254b0 b0Var) {
        return zza((zzabw) new zzabw(a10.zze(), str, str2).zza(gVar).zza(a10).zza(b0Var).zza((C4272u) b0Var));
    }

    public final Task<Void> zza(C5230g gVar, A a10, O o10, C4254b0 b0Var) {
        zzads.zza();
        return zza((zzabz) new zzabz(o10).zza(gVar).zza(a10).zza(b0Var).zza((C4272u) b0Var));
    }

    public final Task<Void> zza(C5230g gVar, A a10, C4780c0 c0Var, C4254b0 b0Var) {
        return zza((zzacc) new zzacc(c0Var).zza(gVar).zza(a10).zza(b0Var).zza((C4272u) b0Var));
    }

    public final Task<Void> zza(String str, String str2, C4783e eVar) {
        eVar.w0(7);
        return zza(new zzacb(str, str2, eVar));
    }

    static C4258f zza(C5230g gVar, zzaff zzaff) {
        C4536s.l(gVar);
        C4536s.l(zzaff);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new A0(zzaff, "firebase"));
        List<zzafv> zzl = zzaff.zzl();
        if (zzl != null && !zzl.isEmpty()) {
            for (int i10 = 0; i10 < zzl.size(); i10++) {
                arrayList.add(new A0(zzl.get(i10)));
            }
        }
        C4258f fVar = new C4258f(gVar, arrayList);
        fVar.S0(new C4260h(zzaff.zzb(), zzaff.zza()));
        fVar.U0(zzaff.zzn());
        fVar.T0(zzaff.zze());
        fVar.P0(K.b(zzaff.zzk()));
        fVar.N0(zzaff.zzd());
        return fVar;
    }

    public final void zza(C5230g gVar, zzagd zzagd, Q.b bVar, Activity activity, Executor executor) {
        zza((zzacd) new zzacd(zzagd).zza(gVar).zza(bVar, activity, executor, zzagd.zzd()));
    }
}
