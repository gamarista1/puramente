package com.google.android.gms.internal.p002firebaseauthapi;

import Db.C4267o;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4536s;
import com.google.firebase.auth.C0;
import com.google.firebase.auth.C4780c0;
import com.google.firebase.auth.C4783e;
import com.google.firebase.auth.C4793j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyl  reason: invalid package */
public final class zzyl {
    /* access modifiers changed from: private */
    public final zzadk zza;

    public zzyl(zzadk zzadk) {
        this.zza = (zzadk) C4536s.l(zzadk);
    }

    public final void zzb(String str, String str2, zzacf zzacf) {
        C4536s.f(str);
        C4536s.f(str2);
        C4536s.l(zzacf);
        zza(str, (zzadm<zzafm>) new zzaad(this, str2, zzacf));
    }

    public final void zzc(String str, String str2, zzacf zzacf) {
        C4536s.f(str);
        C4536s.f(str2);
        C4536s.l(zzacf);
        zza(str, (zzadm<zzafm>) new zzaag(this, str2, zzacf));
    }

    public final void zzd(String str, String str2, zzacf zzacf) {
        C4536s.f(str);
        C4536s.l(zzacf);
        this.zza.zza(new zzafw(str, (String) null, str2), (zzadm<zzafz>) new zzyy(this, zzacf));
    }

    public final void zze(String str, String str2, zzacf zzacf) {
        C4536s.f(str);
        C4536s.l(zzacf);
        this.zza.zza(new zzaen(str, str2), (zzadm<zzaem>) new zzyw(this, zzacf));
    }

    public final void zzf(String str, zzacf zzacf) {
        C4536s.f(str);
        C4536s.l(zzacf);
        zza(str, (zzadm<zzafm>) new zzzh(this, zzacf));
    }

    static /* synthetic */ void zza(zzyl zzyl, zzagu zzagu, zzacf zzacf, zzadn zzadn) {
        Status status;
        if (zzagu.zzo()) {
            C0 zzb = zzagu.zzb();
            String zzc = zzagu.zzc();
            String zzj = zzagu.zzj();
            if (zzagu.zzm()) {
                status = new Status(17012);
            } else {
                status = C4267o.a(zzagu.zzd());
            }
            zzacf.zza(new zzyj(status, zzb, zzc, zzj));
            return;
        }
        zzyl.zza(new zzafm(zzagu.zzi(), zzagu.zze(), Long.valueOf(zzagu.zza()), "Bearer"), zzagu.zzh(), zzagu.zzg(), Boolean.valueOf(zzagu.zzn()), zzagu.zzb(), zzacf, zzadn);
    }

    public final void zzf(String str, String str2, zzacf zzacf) {
        C4536s.f(str);
        C4536s.f(str2);
        C4536s.l(zzacf);
        zza(str2, (zzadm<zzafm>) new zzzk(this, str, zzacf));
    }

    public final void zzb(String str, zzacf zzacf) {
        C4536s.f(str);
        C4536s.l(zzacf);
        this.zza.zza(new zzafa(str), (zzadm<zzafm>) new zzyo(this, zzacf));
    }

    public final void zzc(String str, zzacf zzacf) {
        C4536s.f(str);
        C4536s.l(zzacf);
        zza(str, (zzadm<zzafm>) new zzzw(this, zzacf));
    }

    public final void zzd(String str, zzacf zzacf) {
        C4536s.l(zzacf);
        this.zza.zza(str, (zzadm<Void>) new zzaaa(this, zzacf));
    }

    public final void zze(String str, zzacf zzacf) {
        C4536s.l(zzacf);
        this.zza.zza(new zzagh(str), (zzadm<zzagg>) new zzaac(this, zzacf));
    }

    private final void zzb(zzafh zzafh, zzacf zzacf) {
        C4536s.l(zzafh);
        C4536s.l(zzacf);
        this.zza.zza(zzafh, (zzadm<zzafg>) new zzzz(this, zzacf));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzacf zzacf) {
        C4536s.f(str);
        C4536s.f(str2);
        C4536s.l(zzacf);
        this.zza.zza(new zzagz(str, str2, str3, str4), (zzadm<zzagy>) new zzyq(this, zzacf));
    }

    public final void zzb(String str, String str2, String str3, zzacf zzacf) {
        C4536s.f(str);
        C4536s.f(str2);
        C4536s.l(zzacf);
        zza(str, (zzadm<zzafm>) new zzzm(this, str2, str3, zzacf));
    }

    static /* synthetic */ void zza(zzyl zzyl, zzacf zzacf, zzagh zzagh, zzadn zzadn) {
        C4536s.l(zzacf);
        C4536s.l(zzagh);
        C4536s.l(zzadn);
        zzyl.zza.zza(zzagh, (zzadm<zzagg>) new zzze(zzyl, zzacf, zzadn));
    }

    static /* synthetic */ void zza(zzyl zzyl, zzacf zzacf, zzafm zzafm, zzagf zzagf, zzadn zzadn) {
        C4536s.l(zzacf);
        C4536s.l(zzafm);
        C4536s.l(zzagf);
        C4536s.l(zzadn);
        zzyl.zza.zza(new zzafd(zzafm.zzc()), (zzadm<zzafc>) new zzyr(zzyl, zzadn, zzacf, zzafm, zzagf));
    }

    static /* synthetic */ void zza(zzyl zzyl, zzacf zzacf, zzafm zzafm, zzaff zzaff, zzagf zzagf, zzadn zzadn) {
        C4536s.l(zzacf);
        C4536s.l(zzafm);
        C4536s.l(zzaff);
        C4536s.l(zzagf);
        C4536s.l(zzadn);
        zzyl.zza.zza(zzagf, (zzadm<zzage>) new zzyu(zzyl, zzagf, zzaff, zzacf, zzafm, zzadn));
    }

    public final void zza(String str, String str2, zzacf zzacf) {
        C4536s.f(str);
        C4536s.l(zzacf);
        zzagf zzagf = new zzagf();
        zzagf.zze(str);
        zzagf.zzh(str2);
        this.zza.zza(zzagf, (zzadm<zzage>) new zzaaf(this, zzacf));
    }

    public final void zza(String str, String str2, String str3, zzacf zzacf) {
        C4536s.f(str);
        C4536s.f(str2);
        C4536s.l(zzacf);
        this.zza.zza(new zzafw(str, str2, str3), (zzadm<zzafz>) new zzza(this, zzacf));
    }

    public final void zza(String str, String str2, String str3, String str4, zzacf zzacf) {
        C4536s.f(str);
        C4536s.f(str2);
        C4536s.l(zzacf);
        this.zza.zza(new zzagh(str, str2, (String) null, str3, str4, (String) null), (zzadm<zzagg>) new zzyn(this, zzacf));
    }

    public final void zza(String str, zzacf zzacf) {
        C4536s.f(str);
        C4536s.l(zzacf);
        zza(str, (zzadm<zzafm>) new zzzy(this, zzacf));
    }

    private final void zza(String str, zzadm<zzafm> zzadm) {
        C4536s.l(zzadm);
        C4536s.f(str);
        zzafm zzb = zzafm.zzb(str);
        if (zzb.zzg()) {
            zzadm.zza(zzb);
            return;
        }
        this.zza.zza(new zzafa(zzb.zzd()), (zzadm<zzafm>) new zzaai(this, zzadm));
    }

    public final void zza(zzaeq zzaeq, String str, zzacf zzacf) {
        C4536s.l(zzaeq);
        C4536s.l(zzacf);
        zza(str, (zzadm<zzafm>) new zzzq(this, zzaeq, zzacf));
    }

    public final void zza(zzaes zzaes, zzacf zzacf) {
        C4536s.l(zzaes);
        C4536s.l(zzacf);
        this.zza.zza(zzaes, (zzadm<zzaev>) new zzzs(this, zzacf));
    }

    /* access modifiers changed from: private */
    public final void zza(zzaeo zzaeo, zzacf zzacf) {
        C4536s.l(zzaeo);
        C4536s.l(zzacf);
        this.zza.zza(zzaeo, (zzadm<zzaer>) new zzys(this, zzacf));
    }

    /* access modifiers changed from: private */
    public final void zza(zzafm zzafm, String str, String str2, Boolean bool, C0 c02, zzacf zzacf, zzadn zzadn) {
        C4536s.l(zzafm);
        C4536s.l(zzadn);
        C4536s.l(zzacf);
        this.zza.zza(new zzafd(zzafm.zzc()), (zzadm<zzafc>) new zzyt(this, zzadn, str2, str, bool, c02, zzacf, zzafm));
    }

    public final void zza(zzafj zzafj, zzacf zzacf) {
        C4536s.l(zzafj);
        C4536s.l(zzacf);
        this.zza.zza(zzafj, (zzadm<zzafi>) new zzzt(this, zzacf));
    }

    public final void zza(zzafk zzafk, zzacf zzacf) {
        C4536s.l(zzafk);
        C4536s.l(zzacf);
        this.zza.zza(zzafk, (zzadm<zzafn>) new zzzu(this, zzacf));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzacf zzacf) {
        C4536s.f(str);
        C4536s.f(str2);
        C4536s.f(str3);
        C4536s.l(zzacf);
        zza(str3, (zzadm<zzafm>) new zzzb(this, str, str2, str4, str5, zzacf));
    }

    public final void zza(String str, zzags zzags, zzacf zzacf) {
        C4536s.f(str);
        C4536s.l(zzags);
        C4536s.l(zzacf);
        zza(str, (zzadm<zzafm>) new zzzf(this, zzags, zzacf));
    }

    public final void zza(String str, zzahb zzahb, zzacf zzacf) {
        C4536s.f(str);
        C4536s.l(zzahb);
        C4536s.l(zzacf);
        zza(str, (zzadm<zzafm>) new zzzd(this, zzahb, zzacf));
    }

    public final void zza(zzafy zzafy, zzacf zzacf) {
        this.zza.zza(zzafy, (zzadm<zzaga>) new zzaab(this, zzacf));
    }

    public final void zza(String str, C4783e eVar, zzacf zzacf) {
        C4536s.f(str);
        C4536s.l(zzacf);
        zzafh zzafh = new zzafh(4);
        zzafh.zzd(str);
        if (eVar != null) {
            zzafh.zza(eVar);
        }
        zzb(zzafh, zzacf);
    }

    public final void zza(String str, C4783e eVar, String str2, String str3, zzacf zzacf) {
        C4536s.f(str);
        C4536s.l(zzacf);
        zzafh zzafh = new zzafh(eVar.v0());
        zzafh.zzb(str);
        zzafh.zza(eVar);
        zzafh.zzc(str2);
        zzafh.zza(str3);
        this.zza.zza(zzafh, (zzadm<zzafg>) new zzyv(this, zzacf));
    }

    public final void zza(zzagd zzagd, zzacf zzacf) {
        C4536s.f(zzagd.zzd());
        C4536s.l(zzacf);
        this.zza.zza(zzagd, (zzadm<zzagc>) new zzyz(this, zzacf));
    }

    public final void zza(zzags zzags, zzacf zzacf) {
        C4536s.l(zzags);
        C4536s.l(zzacf);
        zzags.zzb(true);
        this.zza.zza(zzags, (zzadm<zzagu>) new zzzo(this, zzacf));
    }

    public final void zza(zzagx zzagx, zzacf zzacf) {
        C4536s.l(zzagx);
        C4536s.l(zzacf);
        this.zza.zza(zzagx, (zzadm<zzagw>) new zzyx(this, zzacf));
    }

    public final void zza(C4793j jVar, String str, zzacf zzacf) {
        C4536s.l(jVar);
        C4536s.l(zzacf);
        if (jVar.zzg()) {
            zza(jVar.t0(), (zzadm<zzafm>) new zzyp(this, jVar, str, zzacf));
        } else {
            zza(new zzaeo(jVar, (String) null, str), zzacf);
        }
    }

    public final void zza(zzahb zzahb, zzacf zzacf) {
        C4536s.l(zzahb);
        C4536s.l(zzacf);
        this.zza.zza(zzahb, (zzadm<zzaha>) new zzzc(this, zzacf));
    }

    public final void zza(zzagj zzagj, zzacf zzacf) {
        C4536s.l(zzagj);
        C4536s.l(zzacf);
        this.zza.zza(zzagj, (zzadm<zzagi>) new zzzn(this, zzagj, zzacf));
    }

    public final void zza(zzagl zzagl, zzacf zzacf) {
        C4536s.l(zzagl);
        C4536s.l(zzacf);
        this.zza.zza(zzagl, (zzadm<zzagk>) new zzzr(this, zzacf));
    }

    public final void zza(String str, C4780c0 c0Var, zzacf zzacf) {
        C4536s.f(str);
        C4536s.l(c0Var);
        C4536s.l(zzacf);
        zza(str, (zzadm<zzafm>) new zzaae(this, c0Var, zzacf));
    }

    public final void zza(zzafh zzafh, zzacf zzacf) {
        zzb(zzafh, zzacf);
    }
}
