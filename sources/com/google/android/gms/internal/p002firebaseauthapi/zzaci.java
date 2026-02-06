package com.google.android.gms.internal.p002firebaseauthapi;

import Ba.C4246a;
import android.content.Context;
import com.google.android.gms.common.internal.C4536s;
import com.google.firebase.auth.C4780c0;
import com.google.firebase.auth.I;
import com.google.firebase.auth.O;
import com.google.firebase.auth.S;
import java.util.concurrent.ScheduledExecutorService;
import ub.C5230g;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaci  reason: invalid package */
public final class zzaci {
    private static final C4246a zza = new C4246a("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzyl zzb;
    private final zzadx zzc;

    zzaci(C5230g gVar, ScheduledExecutorService scheduledExecutorService) {
        C4536s.l(gVar);
        Context m10 = gVar.m();
        C4536s.l(m10);
        this.zzb = new zzyl(new zzacw(gVar, zzact.zza()));
        this.zzc = new zzadx(m10, scheduledExecutorService);
    }

    public final void zza(String str, String str2, zzacg zzacg) {
        C4536s.f(str);
        C4536s.l(zzacg);
        this.zzb.zza(str, str2, new zzacf(zzacg, zza));
    }

    public final void zzb(String str, String str2, zzacg zzacg) {
        C4536s.f(str);
        C4536s.f(str2);
        C4536s.l(zzacg);
        this.zzb.zzb(str, str2, new zzacf(zzacg, zza));
    }

    public final void zzc(String str, String str2, zzacg zzacg) {
        C4536s.f(str);
        C4536s.f(str2);
        C4536s.l(zzacg);
        this.zzb.zzc(str, str2, new zzacf(zzacg, zza));
    }

    public final void zzd(String str, String str2, zzacg zzacg) {
        C4536s.f(str);
        C4536s.l(zzacg);
        this.zzb.zzd(str, str2, new zzacf(zzacg, zza));
    }

    public final void zze(String str, String str2, zzacg zzacg) {
        C4536s.f(str);
        this.zzb.zze(str, str2, new zzacf(zzacg, zza));
    }

    public final void zzf(String str, String str2, zzacg zzacg) {
        C4536s.f(str);
        C4536s.f(str2);
        C4536s.l(zzacg);
        this.zzb.zzf(str, str2, new zzacf(zzacg, zza));
    }

    public final void zze(String str, zzacg zzacg) {
        C4536s.f(str);
        C4536s.l(zzacg);
        this.zzb.zzf(str, new zzacf(zzacg, zza));
    }

    public final void zza(zzxx zzxx, zzacg zzacg) {
        C4536s.l(zzxx);
        C4536s.f(zzxx.zza());
        C4536s.f(zzxx.zzb());
        C4536s.l(zzacg);
        this.zzb.zza(zzxx.zza(), zzxx.zzb(), zzxx.zzc(), new zzacf(zzacg, zza));
    }

    public final void zzd(String str, zzacg zzacg) {
        C4536s.l(zzacg);
        this.zzb.zze(str, new zzacf(zzacg, zza));
    }

    public final void zzb(String str, zzacg zzacg) {
        C4536s.f(str);
        C4536s.l(zzacg);
        this.zzb.zzb(str, new zzacf(zzacg, zza));
    }

    public final void zzc(String str, zzacg zzacg) {
        C4536s.f(str);
        C4536s.l(zzacg);
        this.zzb.zzc(str, new zzacf(zzacg, zza));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzacg zzacg) {
        C4536s.f(str);
        C4536s.f(str2);
        C4536s.l(zzacg);
        C4536s.l(zzacg);
        this.zzb.zzb(str, str2, str3, str4, new zzacf(zzacg, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, zzacg zzacg) {
        C4536s.f(str);
        C4536s.f(str2);
        C4536s.l(zzacg);
        this.zzb.zza(str, str2, str3, str4, new zzacf(zzacg, zza));
    }

    public final void zza(String str, zzacg zzacg) {
        C4536s.f(str);
        C4536s.l(zzacg);
        this.zzb.zza(str, new zzacf(zzacg, zza));
    }

    public final void zza(I i10, String str, String str2, String str3, zzacg zzacg) {
        C4536s.l(i10);
        C4536s.g(str, "cachedTokenState should not be empty.");
        C4536s.l(zzacg);
        if (i10 instanceof S) {
            O a10 = ((S) i10).a();
            this.zzb.zza((zzaeq) zzaeu.zza(str, (String) C4536s.l(a10.zzc()), (String) C4536s.l(a10.r0()), str2, str3), str, new zzacf(zzacg, zza));
            return;
        }
        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
    }

    public final void zza(String str, I i10, String str2, zzacg zzacg) {
        C4536s.f(str);
        C4536s.l(i10);
        C4536s.l(zzacg);
        if (i10 instanceof S) {
            O a10 = ((S) i10).a();
            this.zzb.zza((zzaes) zzaex.zza(str, (String) C4536s.l(a10.zzc()), (String) C4536s.l(a10.r0()), str2), new zzacf(zzacg, zza));
            return;
        }
        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
    }

    public final void zza(zzya zzya, zzacg zzacg) {
        C4536s.l(zzya);
        this.zzb.zza(zzafj.zzb(), new zzacf(zzacg, zza));
    }

    public final void zza(zzxz zzxz, zzacg zzacg) {
        C4536s.l(zzxz);
        this.zzb.zza(zzafk.zza(zzxz.zzb(), zzxz.zza()), new zzacf(zzacg, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzacg zzacg) {
        C4536s.f(str);
        C4536s.f(str2);
        C4536s.f(str3);
        C4536s.l(zzacg);
        this.zzb.zza(str, str2, str3, str4, str5, new zzacf(zzacg, zza));
    }

    public final void zza(String str, zzags zzags, zzacg zzacg) {
        C4536s.f(str);
        C4536s.l(zzags);
        C4536s.l(zzacg);
        this.zzb.zza(str, zzags, new zzacf(zzacg, zza));
    }

    public final void zza(zzyc zzyc, zzacg zzacg) {
        C4536s.l(zzacg);
        C4536s.l(zzyc);
        this.zzb.zza(C4536s.f(zzyc.zzb()), zzadr.zza((O) C4536s.l(zzyc.zza())), new zzacf(zzacg, zza));
    }

    public final void zza(zzafy zzafy, zzacg zzacg) {
        C4536s.l(zzafy);
        this.zzb.zza(zzafy, new zzacf(zzacg, zza));
    }

    public final void zza(zzyb zzyb, zzacg zzacg) {
        C4536s.l(zzyb);
        C4536s.f(zzyb.zzb());
        C4536s.l(zzacg);
        this.zzb.zza(zzyb.zzb(), zzyb.zza(), new zzacf(zzacg, zza));
    }

    public final void zza(zzye zzye, zzacg zzacg) {
        C4536s.l(zzye);
        C4536s.f(zzye.zzc());
        C4536s.l(zzacg);
        this.zzb.zza(zzye.zzc(), zzye.zza(), zzye.zzd(), zzye.zzb(), new zzacf(zzacg, zza));
    }

    public final void zza(zzyd zzyd, zzacg zzacg) {
        C4536s.l(zzacg);
        C4536s.l(zzyd);
        zzagd zzagd = (zzagd) C4536s.l(zzyd.zza());
        String zzd = zzagd.zzd();
        zzacf zzacf = new zzacf(zzacg, zza);
        if (this.zzc.zzd(zzd)) {
            if (zzagd.zze()) {
                this.zzc.zzc(zzd);
            } else {
                this.zzc.zzb(zzacf, zzd);
                return;
            }
        }
        long zzb2 = zzagd.zzb();
        boolean zzf = zzagd.zzf();
        if (zza(zzb2, zzf)) {
            zzagd.zza(new zzaeh(this.zzc.zzb()));
        }
        this.zzc.zza(zzd, zzacf, zzb2, zzf);
        this.zzb.zza(zzagd, this.zzc.zza(zzacf, zzd));
    }

    public final void zza(zzyg zzyg, zzacg zzacg) {
        C4536s.l(zzyg);
        C4536s.l(zzacg);
        this.zzb.zzd(zzyg.zza(), new zzacf(zzacg, zza));
    }

    public final void zza(zzags zzags, zzacg zzacg) {
        C4536s.l(zzags);
        C4536s.l(zzacg);
        this.zzb.zza(zzags, new zzacf(zzacg, zza));
    }

    public final void zza(zzagx zzagx, zzacg zzacg) {
        C4536s.l(zzagx);
        C4536s.l(zzacg);
        this.zzb.zza(zzagx, new zzacf(zzacg, zza));
    }

    public final void zza(zzyf zzyf, zzacg zzacg) {
        C4536s.l(zzyf);
        C4536s.l(zzyf.zza());
        C4536s.l(zzacg);
        this.zzb.zza(zzyf.zza(), zzyf.zzb(), new zzacf(zzacg, zza));
    }

    public final void zza(zzyi zzyi, zzacg zzacg) {
        C4536s.l(zzacg);
        C4536s.l(zzyi);
        this.zzb.zza(zzadr.zza((O) C4536s.l(zzyi.zza())), new zzacf(zzacg, zza));
    }

    public final void zza(String str, String str2, String str3, long j10, boolean z10, boolean z11, String str4, String str5, boolean z12, zzacg zzacg) {
        String str6 = str2;
        String str7 = str;
        C4536s.g(str, "idToken should not be empty.");
        C4536s.l(zzacg);
        zzacf zzacf = new zzacf(zzacg, zza);
        if (this.zzc.zzd(str2)) {
            if (z10) {
                this.zzc.zzc(str2);
            } else {
                this.zzc.zzb(zzacf, str2);
                return;
            }
        }
        zzagn zza2 = zzagn.zza(str, str2, str3, str4, str5, (String) null);
        long j11 = j10;
        if (zza(j10, z12)) {
            zza2.zza(new zzaeh(this.zzc.zzb()));
        }
        this.zzc.zza(str2, zzacf, j10, z12);
        this.zzb.zza((zzagj) zza2, this.zzc.zza(zzacf, str2));
    }

    public final void zza(zzyh zzyh, zzacg zzacg) {
        C4536s.l(zzyh);
        C4536s.l(zzacg);
        String d10 = zzyh.zzb().d();
        zzacf zzacf = new zzacf(zzacg, zza);
        if (this.zzc.zzd(d10)) {
            if (zzyh.zzg()) {
                this.zzc.zzc(d10);
            } else {
                this.zzc.zzb(zzacf, d10);
                return;
            }
        }
        long zza2 = zzyh.zza();
        boolean zzh = zzyh.zzh();
        zzagl zza3 = zzagl.zza(zzyh.zzd(), zzyh.zzb().a(), zzyh.zzb().d(), zzyh.zzc(), zzyh.zzf(), zzyh.zze());
        if (zza(zza2, zzh)) {
            zza3.zza(new zzaeh(this.zzc.zzb()));
        }
        this.zzc.zza(d10, zzacf, zza2, zzh);
        this.zzb.zza(zza3, this.zzc.zza(zzacf, d10));
    }

    public final void zza(zzagp zzagp, zzacg zzacg) {
        this.zzb.zza((zzagj) zzagp, new zzacf((zzacg) C4536s.l(zzacg), zza));
    }

    public final void zza(String str, String str2, String str3, zzacg zzacg) {
        C4536s.g(str, "cachedTokenState should not be empty.");
        C4536s.g(str2, "uid should not be empty.");
        C4536s.l(zzacg);
        this.zzb.zzb(str, str2, str3, new zzacf(zzacg, zza));
    }

    public final void zza(String str, C4780c0 c0Var, zzacg zzacg) {
        C4536s.f(str);
        C4536s.l(c0Var);
        C4536s.l(zzacg);
        this.zzb.zza(str, c0Var, new zzacf(zzacg, zza));
    }

    public final void zza(zzyk zzyk, zzacg zzacg) {
        C4536s.l(zzyk);
        this.zzb.zza(zzafh.zza(zzyk.zza(), zzyk.zzb(), zzyk.zzc()), new zzacf(zzacg, zza));
    }

    private static boolean zza(long j10, boolean z10) {
        if (j10 > 0 && z10) {
            return true;
        }
        zza.h("App hash will not be appended to the request.", new Object[0]);
        return false;
    }
}
