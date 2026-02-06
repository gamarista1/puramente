package com.google.android.gms.measurement.internal;

import Ea.q;
import Pa.C4378a;
import Pa.g;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ya.C5290g;

public final class I2 extends g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final q5 f54718a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f54719b;

    /* renamed from: c  reason: collision with root package name */
    private String f54720c;

    public I2(q5 q5Var) {
        this(q5Var, (String) null);
    }

    private final void b(Runnable runnable) {
        C4536s.l(runnable);
        if (this.f54718a.zzl().E()) {
            runnable.run();
        } else {
            this.f54718a.zzl().B(runnable);
        }
    }

    private final void r1(String str, boolean z10) {
        boolean z11;
        if (!TextUtils.isEmpty(str)) {
            if (z10) {
                try {
                    if (this.f54719b == null) {
                        if (!"com.google.android.gms".equals(this.f54720c) && !q.a(this.f54718a.zza(), Binder.getCallingUid())) {
                            if (!C5290g.a(this.f54718a.zza()).c(Binder.getCallingUid())) {
                                z11 = false;
                                this.f54719b = Boolean.valueOf(z11);
                            }
                        }
                        z11 = true;
                        this.f54719b = Boolean.valueOf(z11);
                    }
                    if (this.f54719b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e10) {
                    this.f54718a.zzj().B().b("Measurement Service called with invalid calling package. appId", V1.q(str));
                    throw e10;
                }
            }
            if (this.f54720c == null && d.k(this.f54718a.zza(), Binder.getCallingUid(), str)) {
                this.f54720c = str;
            }
            if (!str.equals(this.f54720c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f54718a.zzj().B().a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    private final void t1(E5 e52, boolean z10) {
        C4536s.l(e52);
        C4536s.f(e52.f54557a);
        r1(e52.f54557a, false);
        this.f54718a.o0().f0(e52.f54558b, e52.f54573q);
    }

    private final void u1(Runnable runnable) {
        C4536s.l(runnable);
        if (this.f54718a.zzl().E()) {
            runnable.run();
        } else {
            this.f54718a.zzl().y(runnable);
        }
    }

    private final void w1(D d10, E5 e52) {
        this.f54718a.p0();
        this.f54718a.q(d10, e52);
    }

    public final void A0(E5 e52) {
        C4536s.f(e52.f54557a);
        C4536s.l(e52.f54578v);
        b(new K2(this, e52));
    }

    public final String F0(E5 e52) {
        t1(e52, false);
        return this.f54718a.O(e52);
    }

    public final void J0(C4604f fVar, E5 e52) {
        C4536s.l(fVar);
        C4536s.l(fVar.f55062c);
        t1(e52, false);
        C4604f fVar2 = new C4604f(fVar);
        fVar2.f55060a = e52.f54557a;
        u1(new N2(this, fVar2, e52));
    }

    public final void O0(E5 e52) {
        t1(e52, false);
        u1(new L2(this, e52));
    }

    public final void P0(C4604f fVar) {
        C4536s.l(fVar);
        C4536s.l(fVar.f55062c);
        C4536s.f(fVar.f55060a);
        r1(fVar.f55060a, true);
        u1(new Q2(this, new C4604f(fVar)));
    }

    public final byte[] T(D d10, String str) {
        C4536s.f(str);
        C4536s.l(d10);
        r1(str, true);
        this.f54718a.zzj().A().b("Log and bundle. event", this.f54718a.e0().c(d10.f54497a));
        long b10 = this.f54718a.zzb().b() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f54718a.zzl().w(new C4580b3(this, d10, str)).get();
            if (bArr == null) {
                this.f54718a.zzj().B().b("Log and bundle returned null. appId", V1.q(str));
                bArr = new byte[0];
            }
            this.f54718a.zzj().A().d("Log and bundle processed. event, size, time_ms", this.f54718a.e0().c(d10.f54497a), Integer.valueOf(bArr.length), Long.valueOf((this.f54718a.zzb().b() / 1000000) - b10));
            return bArr;
        } catch (InterruptedException e10) {
            e = e10;
            this.f54718a.zzj().B().d("Failed to log and bundle. appId, event, error", V1.q(str), this.f54718a.e0().c(d10.f54497a), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            this.f54718a.zzj().B().d("Failed to log and bundle. appId, event, error", V1.q(str), this.f54718a.e0().c(d10.f54497a), e);
            return null;
        }
    }

    public final C4378a W(E5 e52) {
        t1(e52, false);
        C4536s.f(e52.f54557a);
        try {
            return (C4378a) this.f54718a.zzl().w(new W2(this, e52)).get(10000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            this.f54718a.zzj().B().c("Failed to get consent. appId", V1.q(e52.f54557a), e10);
            return new C4378a((Bundle) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(String str, Bundle bundle) {
        this.f54718a.c0().d0(str, bundle);
    }

    public final void c0(D d10, E5 e52) {
        C4536s.l(d10);
        t1(e52, false);
        u1(new Z2(this, d10, e52));
    }

    public final List c1(String str, String str2, boolean z10, E5 e52) {
        t1(e52, false);
        String str3 = e52.f54557a;
        C4536s.l(str3);
        try {
            List<C5> list = (List) this.f54718a.zzl().r(new P2(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C5 c52 : list) {
                if (!z10) {
                    if (!B5.E0(c52.f54494c)) {
                    }
                }
                arrayList.add(new A5(c52));
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f54718a.zzj().B().c("Failed to query user properties. appId", V1.q(e52.f54557a), e);
            return Collections.emptyList();
        } catch (ExecutionException e11) {
            e = e11;
            this.f54718a.zzj().B().c("Failed to query user properties. appId", V1.q(e52.f54557a), e);
            return Collections.emptyList();
        }
    }

    public final List d(String str, String str2, E5 e52) {
        t1(e52, false);
        String str3 = e52.f54557a;
        C4536s.l(str3);
        try {
            return (List) this.f54718a.zzl().r(new R2(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f54718a.zzj().B().b("Failed to get conditional user properties", e10);
            return Collections.emptyList();
        }
    }

    public final void e(D d10, String str, String str2) {
        C4536s.l(d10);
        C4536s.f(str);
        r1(str, true);
        u1(new Y2(this, d10, str));
    }

    public final List f0(E5 e52, Bundle bundle) {
        t1(e52, false);
        C4536s.l(e52.f54557a);
        try {
            return (List) this.f54718a.zzl().r(new C4594d3(this, e52, bundle)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f54718a.zzj().B().c("Failed to get trigger URIs. appId", V1.q(e52.f54557a), e10);
            return Collections.emptyList();
        }
    }

    public final void f1(E5 e52) {
        t1(e52, false);
        u1(new M2(this, e52));
    }

    public final List h(String str, String str2, String str3, boolean z10) {
        r1(str, true);
        try {
            List<C5> list = (List) this.f54718a.zzl().r(new S2(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C5 c52 : list) {
                if (!z10) {
                    if (!B5.E0(c52.f54494c)) {
                    }
                }
                arrayList.add(new A5(c52));
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f54718a.zzj().B().c("Failed to get user properties as. appId", V1.q(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e11) {
            e = e11;
            this.f54718a.zzj().B().c("Failed to get user properties as. appId", V1.q(str), e);
            return Collections.emptyList();
        }
    }

    public final List i0(E5 e52, boolean z10) {
        t1(e52, false);
        String str = e52.f54557a;
        C4536s.l(str);
        try {
            List<C5> list = (List) this.f54718a.zzl().r(new C4587c3(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C5 c52 : list) {
                if (!z10) {
                    if (!B5.E0(c52.f54494c)) {
                    }
                }
                arrayList.add(new A5(c52));
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f54718a.zzj().B().c("Failed to get user properties. appId", V1.q(e52.f54557a), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            this.f54718a.zzj().B().c("Failed to get user properties. appId", V1.q(e52.f54557a), e);
            return null;
        }
    }

    public final void o1(E5 e52) {
        C4536s.f(e52.f54557a);
        C4536s.l(e52.f54578v);
        b(new H2(this, e52));
    }

    public final void q0(E5 e52) {
        C4536s.f(e52.f54557a);
        r1(e52.f54557a, false);
        u1(new T2(this, e52));
    }

    /* access modifiers changed from: package-private */
    public final D s1(D d10, E5 e52) {
        C c10;
        if (!(!"_cmp".equals(d10.f54497a) || (c10 = d10.f54498b) == null || c10.o0() == 0)) {
            String u02 = d10.f54498b.u0("_cis");
            if ("referrer broadcast".equals(u02) || "referrer API".equals(u02)) {
                this.f54718a.zzj().E().b("Event has been filtered ", d10.toString());
                return new D("_cmpx", d10.f54498b, d10.f54499c, d10.f54500d);
            }
        }
        return d10;
    }

    public final void t0(A5 a52, E5 e52) {
        C4536s.l(a52);
        t1(e52, false);
        u1(new C4573a3(this, a52, e52));
    }

    /* access modifiers changed from: package-private */
    public final void v1(D d10, E5 e52) {
        zzb zzb;
        boolean z10;
        if (!this.f54718a.i0().S(e52.f54557a)) {
            w1(d10, e52);
            return;
        }
        this.f54718a.zzj().F().b("EES config found for", e52.f54557a);
        C4681q2 i02 = this.f54718a.i0();
        String str = e52.f54557a;
        if (TextUtils.isEmpty(str)) {
            zzb = null;
        } else {
            zzb = (zzb) i02.f55278j.get(str);
        }
        if (zzb == null) {
            this.f54718a.zzj().F().b("EES not loaded for", e52.f54557a);
            w1(d10, e52);
            return;
        }
        try {
            Map L10 = this.f54718a.n0().L(d10.f54498b.r0(), true);
            String a10 = Pa.q.a(d10.f54497a);
            if (a10 == null) {
                a10 = d10.f54497a;
            }
            z10 = zzb.zza(new zzad(a10, d10.f54500d, L10));
        } catch (zzc unused) {
            this.f54718a.zzj().B().c("EES error. appId, eventName", e52.f54558b, d10.f54497a);
            z10 = false;
        }
        if (!z10) {
            this.f54718a.zzj().F().b("EES was not applied to event", d10.f54497a);
            w1(d10, e52);
            return;
        }
        if (zzb.zzd()) {
            this.f54718a.zzj().F().b("EES edited event", d10.f54497a);
            w1(this.f54718a.n0().C(zzb.zza().zzb()), e52);
        } else {
            w1(d10, e52);
        }
        if (zzb.zzc()) {
            for (zzad next : zzb.zza().zzc()) {
                this.f54718a.zzj().F().b("EES logging created event", next.zzb());
                w1(this.f54718a.n0().C(next), e52);
            }
        }
    }

    public final void w(long j10, String str, String str2, String str3) {
        u1(new O2(this, str2, str3, str, j10));
    }

    public final List x(String str, String str2, String str3) {
        r1(str, true);
        try {
            return (List) this.f54718a.zzl().r(new U2(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f54718a.zzj().B().b("Failed to get conditional user properties as", e10);
            return Collections.emptyList();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void x1(E5 e52) {
        this.f54718a.p0();
        this.f54718a.b0(e52);
    }

    public final void y0(E5 e52) {
        C4536s.f(e52.f54557a);
        C4536s.l(e52.f54578v);
        b(new X2(this, e52));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void y1(E5 e52) {
        this.f54718a.p0();
        this.f54718a.d0(e52);
    }

    public final void z0(Bundle bundle, E5 e52) {
        t1(e52, false);
        String str = e52.f54557a;
        C4536s.l(str);
        u1(new J2(this, str, bundle));
    }

    private I2(q5 q5Var, String str) {
        C4536s.l(q5Var);
        this.f54718a = q5Var;
        this.f54720c = null;
    }
}
