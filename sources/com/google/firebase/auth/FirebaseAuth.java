package com.google.firebase.auth;

import Db.B0;
import Db.C4251a;
import Db.C4252a0;
import Db.C4253b;
import Db.C4254b0;
import Db.C4255c;
import Db.C4258f;
import Db.C4265m;
import Db.C4272u;
import Db.C4273v;
import Db.I;
import Db.L;
import Db.W;
import Db.X;
import Db.d0;
import Db.k0;
import Db.y0;
import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p002firebaseauthapi.zzaak;
import com.google.android.gms.internal.p002firebaseauthapi.zzach;
import com.google.android.gms.internal.p002firebaseauthapi.zzaco;
import com.google.android.gms.internal.p002firebaseauthapi.zzacy;
import com.google.android.gms.internal.p002firebaseauthapi.zzads;
import com.google.android.gms.internal.p002firebaseauthapi.zzaec;
import com.google.android.gms.internal.p002firebaseauthapi.zzafm;
import com.google.android.gms.internal.p002firebaseauthapi.zzagd;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.Q;
import ic.C5027b;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import nc.C5116b;
import ub.C5230g;
import ub.m;

public class FirebaseAuth implements C4253b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C5230g f56877a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final List f56878b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final List f56879c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final List f56880d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final zzaak f56881e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public A f56882f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final B0 f56883g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f56884h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public String f56885i;

    /* renamed from: j  reason: collision with root package name */
    private final Object f56886j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public String f56887k;

    /* renamed from: l  reason: collision with root package name */
    private W f56888l;

    /* renamed from: m  reason: collision with root package name */
    private final RecaptchaAction f56889m;

    /* renamed from: n  reason: collision with root package name */
    private final RecaptchaAction f56890n;

    /* renamed from: o  reason: collision with root package name */
    private final RecaptchaAction f56891o;

    /* renamed from: p  reason: collision with root package name */
    private final X f56892p;

    /* renamed from: q  reason: collision with root package name */
    private final d0 f56893q;

    /* renamed from: r  reason: collision with root package name */
    private final C4255c f56894r;

    /* renamed from: s  reason: collision with root package name */
    private final C5027b f56895s;

    /* renamed from: t  reason: collision with root package name */
    private final C5027b f56896t;

    /* renamed from: u  reason: collision with root package name */
    private C4252a0 f56897u;

    /* renamed from: v  reason: collision with root package name */
    private final Executor f56898v;

    /* renamed from: w  reason: collision with root package name */
    private final Executor f56899w;

    /* renamed from: x  reason: collision with root package name */
    private final Executor f56900x;

    /* renamed from: y  reason: collision with root package name */
    private String f56901y;

    public interface a {
        void a(FirebaseAuth firebaseAuth);
    }

    public interface b {
        void a(FirebaseAuth firebaseAuth);
    }

    class c implements k0 {
        c() {
        }

        public final void a(zzafm zzafm, A a10) {
            C4536s.l(zzafm);
            C4536s.l(a10);
            a10.L0(zzafm);
            FirebaseAuth.this.f0(a10, zzafm, true);
        }
    }

    class d implements C4272u, k0 {
        d() {
        }

        public final void a(zzafm zzafm, A a10) {
            C4536s.l(zzafm);
            C4536s.l(a10);
            a10.L0(zzafm);
            FirebaseAuth.this.g0(a10, zzafm, true, true);
        }

        public final void zza(Status status) {
            if (status.p0() == 17011 || status.p0() == 17021 || status.p0() == 17005 || status.p0() == 17091) {
                FirebaseAuth.this.E();
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FirebaseAuth(ub.C5230g r13, ic.C5027b r14, ic.C5027b r15, java.util.concurrent.Executor r16, java.util.concurrent.Executor r17, java.util.concurrent.Executor r18, java.util.concurrent.ScheduledExecutorService r19, java.util.concurrent.Executor r20) {
        /*
            r12 = this;
            com.google.android.gms.internal.firebase-auth-api.zzaak r2 = new com.google.android.gms.internal.firebase-auth-api.zzaak
            r1 = r13
            r9 = r17
            r0 = r19
            r2.<init>(r13, r9, r0)
            Db.X r3 = new Db.X
            android.content.Context r0 = r13.m()
            java.lang.String r4 = r13.s()
            r3.<init>(r0, r4)
            Db.d0 r4 = Db.d0.g()
            Db.c r5 = Db.C4255c.a()
            r0 = r12
            r6 = r14
            r7 = r15
            r8 = r16
            r10 = r18
            r11 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.<init>(ub.g, ic.b, ic.b, java.util.concurrent.Executor, java.util.concurrent.Executor, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService, java.util.concurrent.Executor):void");
    }

    private final synchronized C4252a0 I0() {
        return J0(this);
    }

    private static C4252a0 J0(FirebaseAuth firebaseAuth) {
        if (firebaseAuth.f56897u == null) {
            firebaseAuth.f56897u = new C4252a0((C5230g) C4536s.l(firebaseAuth.f56877a));
        }
        return firebaseAuth.f56897u;
    }

    private final Task M(C4793j jVar, A a10, boolean z10) {
        return new C4786f0(this, z10, a10, jVar).c(this, this.f56887k, this.f56889m, "EMAIL_PASSWORD_PROVIDER");
    }

    private final Task O(A a10, C4254b0 b0Var) {
        C4536s.l(a10);
        return this.f56881e.zza(this.f56877a, a10, b0Var);
    }

    private final Task X(String str, String str2, String str3, A a10, boolean z10) {
        return new C4784e0(this, str, z10, a10, str2, str3).c(this, str3, this.f56890n, "EMAIL_PASSWORD_PROVIDER");
    }

    /* access modifiers changed from: private */
    public final Q.b a0(String str, Q.b bVar) {
        if (!this.f56883g.g() || str == null || !str.equals(this.f56883g.d())) {
            return bVar;
        }
        return new K0(this, bVar);
    }

    private static void d0(FirebaseAuth firebaseAuth, A a10) {
        if (a10 != null) {
            String a11 = a10.a();
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + a11 + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.f56900x.execute(new T0(firebaseAuth));
    }

    private static void e0(FirebaseAuth firebaseAuth, A a10, zzafm zzafm, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        C4536s.l(a10);
        C4536s.l(zzafm);
        boolean z14 = false;
        boolean z15 = true;
        if (firebaseAuth.f56882f == null || !a10.a().equals(firebaseAuth.f56882f.a())) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12 || !z11) {
            A a11 = firebaseAuth.f56882f;
            if (a11 == null) {
                z14 = true;
            } else {
                boolean equals = a11.O0().zzc().equals(zzafm.zzc());
                if (!z12 || !equals) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z12) {
                    z14 = true;
                }
                z15 = z13;
            }
            C4536s.l(a10);
            if (firebaseAuth.f56882f == null || !a10.a().equals(firebaseAuth.q())) {
                firebaseAuth.f56882f = a10;
            } else {
                firebaseAuth.f56882f.J0(a10.s0());
                if (!a10.u0()) {
                    firebaseAuth.f56882f.M0();
                }
                List b10 = a10.r0().b();
                List Q02 = a10.Q0();
                firebaseAuth.f56882f.P0(b10);
                firebaseAuth.f56882f.N0(Q02);
            }
            if (z10) {
                firebaseAuth.f56892p.f(firebaseAuth.f56882f);
            }
            if (z15) {
                A a12 = firebaseAuth.f56882f;
                if (a12 != null) {
                    a12.L0(zzafm);
                }
                p0(firebaseAuth, firebaseAuth.f56882f);
            }
            if (z14) {
                d0(firebaseAuth, firebaseAuth.f56882f);
            }
            if (z10) {
                firebaseAuth.f56892p.d(a10, zzafm);
            }
            A a13 = firebaseAuth.f56882f;
            if (a13 != null) {
                J0(firebaseAuth).e(a13.O0());
            }
        }
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) C5230g.o().k(FirebaseAuth.class);
    }

    public static void h0(P p10) {
        String str;
        String str2;
        if (p10.n()) {
            FirebaseAuth d10 = p10.d();
            if (((C4265m) C4536s.l(p10.e())).r0()) {
                str2 = C4536s.f(p10.j());
                str = str2;
            } else {
                U u10 = (U) C4536s.l(p10.h());
                String f10 = C4536s.f(u10.a());
                str2 = u10.d();
                str = f10;
            }
            if (p10.f() == null || !zzads.zza(str, p10.g(), p10.b(), p10.k())) {
                d10.f56894r.b(d10, str2, p10.b(), d10.H0(), p10.l()).addOnCompleteListener(new H0(d10, p10, str));
                return;
            }
            return;
        }
        FirebaseAuth d11 = p10.d();
        String f11 = C4536s.f(p10.j());
        if (p10.f() != null || !zzads.zza(f11, p10.g(), p10.b(), p10.k())) {
            d11.f56894r.b(d11, f11, p10.b(), d11.H0(), p10.l()).addOnCompleteListener(new I0(d11, p10, f11));
        }
    }

    public static void j0(m mVar, P p10, String str) {
        Log.e("FirebaseAuth", "Invoking verification failure callback for phone number/uid - " + str);
        p10.k().execute(new G0(zzads.zza(str, p10.g(), (zzacz) null), mVar));
    }

    private static void p0(FirebaseAuth firebaseAuth, A a10) {
        String str;
        if (a10 != null) {
            String a11 = a10.a();
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + a11 + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        if (a10 != null) {
            str = a10.zzd();
        } else {
            str = null;
        }
        firebaseAuth.f56900x.execute(new R0(firebaseAuth, new C5116b(str)));
    }

    private final boolean q0(String str) {
        C4785f c10 = C4785f.c(str);
        if (c10 == null || TextUtils.equals(this.f56887k, c10.d())) {
            return false;
        }
        return true;
    }

    public Task A(C4789h hVar) {
        C4536s.l(hVar);
        C4789h q02 = hVar.q0();
        if (q02 instanceof C4793j) {
            C4793j jVar = (C4793j) q02;
            if (!jVar.u0()) {
                return X(jVar.zzc(), (String) C4536s.l(jVar.zzd()), this.f56887k, (A) null, false);
            } else if (q0(C4536s.f(jVar.zze()))) {
                return Tasks.forException(zzach.zza(new Status(17072)));
            } else {
                return M(jVar, (A) null, false);
            }
        } else if (!(q02 instanceof O)) {
            return this.f56881e.zza(this.f56877a, q02, this.f56887k, (k0) new c());
        } else {
            return this.f56881e.zza(this.f56877a, (O) q02, this.f56887k, (k0) new c());
        }
    }

    public Task B(String str) {
        C4536s.f(str);
        return this.f56881e.zza(this.f56877a, str, this.f56887k, (k0) new c());
    }

    public final Executor B0() {
        return this.f56899w;
    }

    public Task C(String str, String str2) {
        C4536s.f(str);
        C4536s.f(str2);
        return X(str, str2, this.f56887k, (A) null, false);
    }

    public Task D(String str, String str2) {
        return A(C4795k.b(str, str2));
    }

    public final Executor D0() {
        return this.f56900x;
    }

    public void E() {
        F0();
        C4252a0 a0Var = this.f56897u;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public Task F(Activity activity, C4801n nVar) {
        C4536s.l(nVar);
        C4536s.l(activity);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (!this.f56893q.d(activity, taskCompletionSource, this)) {
            return Tasks.forException(zzach.zza(new Status(17057)));
        }
        L.e(activity.getApplicationContext(), this);
        nVar.c(activity);
        return taskCompletionSource.getTask();
    }

    public final void F0() {
        C4536s.l(this.f56892p);
        A a10 = this.f56882f;
        if (a10 != null) {
            X x10 = this.f56892p;
            C4536s.l(a10);
            x10.e(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{a10.a()}));
            this.f56882f = null;
        }
        this.f56892p.e("com.google.firebase.auth.FIREBASE_USER");
        p0(this, (A) null);
        d0(this, (A) null);
    }

    public void G() {
        synchronized (this.f56884h) {
            this.f56885i = zzacy.zza();
        }
    }

    public void H(String str, int i10) {
        boolean z10;
        C4536s.f(str);
        if (i10 < 0 || i10 > 65535) {
            z10 = false;
        } else {
            z10 = true;
        }
        C4536s.b(z10, "Port number must be in the range 0-65535");
        zzaec.zza(this.f56877a, str, i10);
    }

    /* access modifiers changed from: package-private */
    public final boolean H0() {
        return zzaco.zza(j().m());
    }

    public Task I(String str) {
        C4536s.f(str);
        return this.f56881e.zzd(this.f56877a, str, this.f56887k);
    }

    public final Task J() {
        return this.f56881e.zza();
    }

    public final Task K(Activity activity, C4801n nVar, A a10) {
        C4536s.l(activity);
        C4536s.l(nVar);
        C4536s.l(a10);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (!this.f56893q.e(activity, taskCompletionSource, this, a10)) {
            return Tasks.forException(zzach.zza(new Status(17057)));
        }
        L.f(activity.getApplicationContext(), this, a10);
        nVar.a(activity);
        return taskCompletionSource.getTask();
    }

    public final Task L(C4783e eVar, String str) {
        C4536s.f(str);
        if (this.f56885i != null) {
            if (eVar == null) {
                eVar = C4783e.y0();
            }
            eVar.x0(this.f56885i);
        }
        return this.f56881e.zza(this.f56877a, eVar, str);
    }

    public final Task N(A a10) {
        C4536s.l(a10);
        return this.f56881e.zza(a10, (C4273v) new P0(this, a10));
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [Db.b0, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task P(A a10, C4789h hVar) {
        C4536s.l(hVar);
        C4536s.l(a10);
        if (hVar instanceof C4793j) {
            return new M0(this, a10, (C4793j) hVar.q0()).c(this, a10.t0(), this.f56891o, "EMAIL_PASSWORD_PROVIDER");
        }
        return this.f56881e.zza(this.f56877a, a10, hVar.q0(), (String) null, (C4254b0) new d());
    }

    public final Task Q(A a10, I i10, String str) {
        C4536s.l(a10);
        C4536s.l(i10);
        if (!(i10 instanceof S)) {
            return Tasks.forException(zzach.zza(new Status(17499)));
        }
        return this.f56881e.zza(this.f56877a, (S) i10, a10, str, (k0) new c());
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [Db.b0, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task R(A a10, O o10) {
        C4536s.l(a10);
        C4536s.l(o10);
        return this.f56881e.zza(this.f56877a, a10, (O) o10.q0(), (C4254b0) new d());
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [Db.b0, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task S(A a10, C4780c0 c0Var) {
        C4536s.l(a10);
        C4536s.l(c0Var);
        return this.f56881e.zza(this.f56877a, a10, c0Var, (C4254b0) new d());
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.firebase.auth.S0, Db.b0] */
    public final Task T(A a10, boolean z10) {
        if (a10 == null) {
            return Tasks.forException(zzach.zza(new Status(17495)));
        }
        zzafm O02 = a10.O0();
        if (!O02.zzg() || z10) {
            return this.f56881e.zza(this.f56877a, a10, O02.zzd(), (C4254b0) new S0(this));
        }
        return Tasks.forResult(I.a(O02.zzc()));
    }

    public final Task U(I i10, C4265m mVar, A a10) {
        C4536s.l(i10);
        C4536s.l(mVar);
        if (i10 instanceof S) {
            return this.f56881e.zza(this.f56877a, a10, (S) i10, C4536s.f(mVar.zzc()), (k0) new c());
        }
        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
    }

    public final Task V(String str) {
        return this.f56881e.zza(this.f56887k, str);
    }

    public final Task W(String str, String str2, C4783e eVar) {
        C4536s.f(str);
        C4536s.f(str2);
        if (eVar == null) {
            eVar = C4783e.y0();
        }
        String str3 = this.f56885i;
        if (str3 != null) {
            eVar.x0(str3);
        }
        return this.f56881e.zza(str, str2, eVar);
    }

    /* access modifiers changed from: package-private */
    public final Q.b Z(P p10, Q.b bVar) {
        if (p10.l()) {
            return bVar;
        }
        return new J0(this, p10, bVar);
    }

    public void a(C4251a aVar) {
        C4536s.l(aVar);
        this.f56879c.add(aVar);
        I0().c(this.f56879c.size());
    }

    public Task b(boolean z10) {
        return T(this.f56882f, z10);
    }

    public void c(a aVar) {
        this.f56880d.add(aVar);
        this.f56900x.execute(new Q0(this, aVar));
    }

    public final synchronized void c0(W w10) {
        this.f56888l = w10;
    }

    public void d(b bVar) {
        this.f56878b.add(bVar);
        this.f56900x.execute(new F0(this, bVar));
    }

    public Task e(String str) {
        C4536s.f(str);
        return this.f56881e.zza(this.f56877a, str, this.f56887k);
    }

    public Task f(String str) {
        C4536s.f(str);
        return this.f56881e.zzb(this.f56877a, str, this.f56887k);
    }

    public final void f0(A a10, zzafm zzafm, boolean z10) {
        g0(a10, zzafm, true, false);
    }

    public Task g(String str, String str2) {
        C4536s.f(str);
        C4536s.f(str2);
        return this.f56881e.zza(this.f56877a, str, str2, this.f56887k);
    }

    /* access modifiers changed from: package-private */
    public final void g0(A a10, zzafm zzafm, boolean z10, boolean z11) {
        e0(this, a10, zzafm, true, z11);
    }

    public Task h(String str, String str2) {
        C4536s.f(str);
        C4536s.f(str2);
        return new L0(this, str, str2).c(this, this.f56887k, this.f56891o, "EMAIL_PASSWORD_PROVIDER");
    }

    public Task i(String str) {
        C4536s.f(str);
        return this.f56881e.zzc(this.f56877a, str, this.f56887k);
    }

    public final void i0(P p10, String str, String str2) {
        boolean z10;
        Q.b bVar;
        long longValue = p10.i().longValue();
        if (longValue < 0 || longValue > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
        String f10 = C4536s.f(p10.j());
        if (p10.f() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzagd zzagd = new zzagd(f10, longValue, z10, this.f56885i, this.f56887k, str, str2, H0());
        Q.b a02 = a0(f10, p10.g());
        if (TextUtils.isEmpty(str)) {
            bVar = Z(p10, a02);
        } else {
            bVar = a02;
        }
        this.f56881e.zza(this.f56877a, zzagd, bVar, p10.b(), p10.k());
    }

    public C5230g j() {
        return this.f56877a;
    }

    public A k() {
        return this.f56882f;
    }

    public final synchronized W k0() {
        return this.f56888l;
    }

    public String l() {
        return this.f56901y;
    }

    public final Task l0(Activity activity, C4801n nVar, A a10) {
        C4536s.l(activity);
        C4536s.l(nVar);
        C4536s.l(a10);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (!this.f56893q.e(activity, taskCompletionSource, this, a10)) {
            return Tasks.forException(zzach.zza(new Status(17057)));
        }
        L.f(activity.getApplicationContext(), this, a10);
        nVar.b(activity);
        return taskCompletionSource.getTask();
    }

    public C4816w m() {
        return this.f56883g;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [Db.b0, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task m0(A a10) {
        return O(a10, new d());
    }

    public String n() {
        String str;
        synchronized (this.f56884h) {
            str = this.f56885i;
        }
        return str;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [Db.b0, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task n0(A a10, String str) {
        C4536s.f(str);
        C4536s.l(a10);
        return this.f56881e.zzb(this.f56877a, a10, str, new d());
    }

    public Task o() {
        return this.f56893q.a();
    }

    public String p() {
        String str;
        synchronized (this.f56886j) {
            str = this.f56887k;
        }
        return str;
    }

    public String q() {
        A a10 = this.f56882f;
        if (a10 == null) {
            return null;
        }
        return a10.a();
    }

    public void r(a aVar) {
        this.f56880d.remove(aVar);
    }

    public void s(b bVar) {
        this.f56878b.remove(bVar);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [Db.b0, com.google.firebase.auth.FirebaseAuth$d] */
    /* JADX WARNING: type inference failed for: r9v0, types: [Db.b0, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task s0(A a10, C4789h hVar) {
        C4536s.l(a10);
        C4536s.l(hVar);
        C4789h q02 = hVar.q0();
        if (q02 instanceof C4793j) {
            C4793j jVar = (C4793j) q02;
            if ("password".equals(jVar.p0())) {
                return X(jVar.zzc(), C4536s.f(jVar.zzd()), a10.t0(), a10, true);
            } else if (q0(C4536s.f(jVar.zze()))) {
                return Tasks.forException(zzach.zza(new Status(17072)));
            } else {
                return M(jVar, a10, true);
            }
        } else if (q02 instanceof O) {
            return this.f56881e.zzb(this.f56877a, a10, (O) q02, this.f56887k, (C4254b0) new d());
        } else {
            return this.f56881e.zzc(this.f56877a, a10, q02, a10.t0(), new d());
        }
    }

    public Task t(String str) {
        C4536s.f(str);
        return u(str, (C4783e) null);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [Db.b0, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task t0(A a10, String str) {
        C4536s.l(a10);
        C4536s.f(str);
        return this.f56881e.zzc(this.f56877a, a10, str, new d());
    }

    public Task u(String str, C4783e eVar) {
        C4536s.f(str);
        if (eVar == null) {
            eVar = C4783e.y0();
        }
        String str2 = this.f56885i;
        if (str2 != null) {
            eVar.x0(str2);
        }
        eVar.w0(1);
        return new O0(this, str, eVar).c(this, this.f56887k, this.f56889m, "EMAIL_PASSWORD_PROVIDER");
    }

    public final C5027b u0() {
        return this.f56895s;
    }

    public Task v(String str, C4783e eVar) {
        C4536s.f(str);
        C4536s.l(eVar);
        if (eVar.o0()) {
            String str2 = this.f56885i;
            if (str2 != null) {
                eVar.x0(str2);
            }
            return new N0(this, str, eVar).c(this, this.f56887k, this.f56889m, "EMAIL_PASSWORD_PROVIDER");
        }
        throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
    }

    public void w(String str) {
        String str2;
        C4536s.f(str);
        if (str.startsWith("chrome-extension://")) {
            this.f56901y = str;
            return;
        }
        if (str.contains("://")) {
            str2 = str;
        } else {
            str2 = "http://" + str;
        }
        try {
            this.f56901y = (String) C4536s.l(new URI(str2).getHost());
        } catch (URISyntaxException e10) {
            if (Log.isLoggable("FirebaseAuth", 4)) {
                Log.i("FirebaseAuth", "Error parsing URL: '" + str + "', " + e10.getMessage());
            }
            this.f56901y = str;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [Db.b0, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task w0(A a10, String str) {
        C4536s.l(a10);
        C4536s.f(str);
        return this.f56881e.zzd(this.f56877a, a10, str, new d());
    }

    public void x(String str) {
        C4536s.f(str);
        synchronized (this.f56884h) {
            this.f56885i = str;
        }
    }

    public final C5027b x0() {
        return this.f56896t;
    }

    public void y(String str) {
        C4536s.f(str);
        synchronized (this.f56886j) {
            this.f56887k = str;
        }
    }

    public Task z() {
        A a10 = this.f56882f;
        if (a10 == null || !a10.u0()) {
            return this.f56881e.zza(this.f56877a, (k0) new c(), this.f56887k);
        }
        C4258f fVar = (C4258f) this.f56882f;
        fVar.U0(false);
        return Tasks.forResult(new y0(fVar));
    }

    public final Executor z0() {
        return this.f56898v;
    }

    @Keep
    public static FirebaseAuth getInstance(C5230g gVar) {
        return (FirebaseAuth) gVar.k(FirebaseAuth.class);
    }

    private FirebaseAuth(C5230g gVar, zzaak zzaak, X x10, d0 d0Var, C4255c cVar, C5027b bVar, C5027b bVar2, Executor executor, Executor executor2, Executor executor3, Executor executor4) {
        zzafm b10;
        this.f56878b = new CopyOnWriteArrayList();
        this.f56879c = new CopyOnWriteArrayList();
        this.f56880d = new CopyOnWriteArrayList();
        this.f56884h = new Object();
        this.f56886j = new Object();
        this.f56889m = RecaptchaAction.custom("getOobCode");
        this.f56890n = RecaptchaAction.custom("signInWithPassword");
        this.f56891o = RecaptchaAction.custom("signUpPassword");
        this.f56877a = (C5230g) C4536s.l(gVar);
        this.f56881e = (zzaak) C4536s.l(zzaak);
        X x11 = (X) C4536s.l(x10);
        this.f56892p = x11;
        this.f56883g = new B0();
        d0 d0Var2 = (d0) C4536s.l(d0Var);
        this.f56893q = d0Var2;
        this.f56894r = (C4255c) C4536s.l(cVar);
        this.f56895s = bVar;
        this.f56896t = bVar2;
        this.f56898v = executor2;
        this.f56899w = executor3;
        this.f56900x = executor4;
        A c10 = x11.c();
        this.f56882f = c10;
        if (!(c10 == null || (b10 = x11.b(c10)) == null)) {
            e0(this, this.f56882f, b10, false, false);
        }
        d0Var2.c(this);
    }
}
