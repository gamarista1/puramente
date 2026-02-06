package com.google.android.gms.measurement.internal;

import Ea.e;
import Ea.h;
import Ga.C4293e;
import Pa.C4378a;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdo;
import com.google.android.gms.internal.measurement.zzgz;
import com.google.android.gms.internal.measurement.zzoj;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

public class E2 implements C4615g3 {

    /* renamed from: I  reason: collision with root package name */
    private static volatile E2 f54505I;

    /* renamed from: A  reason: collision with root package name */
    private volatile Boolean f54506A;

    /* renamed from: B  reason: collision with root package name */
    private Boolean f54507B;

    /* renamed from: C  reason: collision with root package name */
    private Boolean f54508C;

    /* renamed from: D  reason: collision with root package name */
    private volatile boolean f54509D;

    /* renamed from: E  reason: collision with root package name */
    private int f54510E;

    /* renamed from: F  reason: collision with root package name */
    private int f54511F;

    /* renamed from: G  reason: collision with root package name */
    private AtomicInteger f54512G = new AtomicInteger(0);

    /* renamed from: H  reason: collision with root package name */
    final long f54513H;

    /* renamed from: a  reason: collision with root package name */
    private final Context f54514a;

    /* renamed from: b  reason: collision with root package name */
    private final String f54515b;

    /* renamed from: c  reason: collision with root package name */
    private final String f54516c;

    /* renamed from: d  reason: collision with root package name */
    private final String f54517d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f54518e;

    /* renamed from: f  reason: collision with root package name */
    private final C4583c f54519f;

    /* renamed from: g  reason: collision with root package name */
    private final C4618h f54520g;

    /* renamed from: h  reason: collision with root package name */
    private final C4614g2 f54521h;

    /* renamed from: i  reason: collision with root package name */
    private final V1 f54522i;

    /* renamed from: j  reason: collision with root package name */
    private final C4734z2 f54523j;

    /* renamed from: k  reason: collision with root package name */
    private final V4 f54524k;

    /* renamed from: l  reason: collision with root package name */
    private final B5 f54525l;

    /* renamed from: m  reason: collision with root package name */
    private final R1 f54526m;

    /* renamed from: n  reason: collision with root package name */
    private final e f54527n;

    /* renamed from: o  reason: collision with root package name */
    private final C4609f4 f54528o;

    /* renamed from: p  reason: collision with root package name */
    private final C4643k3 f54529p;

    /* renamed from: q  reason: collision with root package name */
    private final C4731z f54530q;

    /* renamed from: r  reason: collision with root package name */
    private final Y3 f54531r;

    /* renamed from: s  reason: collision with root package name */
    private final String f54532s;

    /* renamed from: t  reason: collision with root package name */
    private P1 f54533t;

    /* renamed from: u  reason: collision with root package name */
    private C4644k4 f54534u;

    /* renamed from: v  reason: collision with root package name */
    private C4713w f54535v;

    /* renamed from: w  reason: collision with root package name */
    private Q1 f54536w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f54537x = false;

    /* renamed from: y  reason: collision with root package name */
    private Boolean f54538y;

    /* renamed from: z  reason: collision with root package name */
    private long f54539z;

    private E2(C4636j3 j3Var) {
        long j10;
        Bundle bundle;
        boolean z10 = false;
        C4536s.l(j3Var);
        C4583c cVar = new C4583c(j3Var.f55154a);
        this.f54519f = cVar;
        N1.f54789a = cVar;
        Context context = j3Var.f55154a;
        this.f54514a = context;
        this.f54515b = j3Var.f55155b;
        this.f54516c = j3Var.f55156c;
        this.f54517d = j3Var.f55157d;
        this.f54518e = j3Var.f55161h;
        this.f54506A = j3Var.f55158e;
        this.f54532s = j3Var.f55163j;
        this.f54509D = true;
        zzdo zzdo = j3Var.f55160g;
        if (!(zzdo == null || (bundle = zzdo.zzg) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f54507B = (Boolean) obj;
            }
            Object obj2 = zzdo.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f54508C = (Boolean) obj2;
            }
        }
        zzgz.zzb(context);
        e c10 = h.c();
        this.f54527n = c10;
        Long l10 = j3Var.f55162i;
        if (l10 != null) {
            j10 = l10.longValue();
        } else {
            j10 = c10.currentTimeMillis();
        }
        this.f54513H = j10;
        this.f54520g = new C4618h(this);
        C4614g2 g2Var = new C4614g2(this);
        g2Var.l();
        this.f54521h = g2Var;
        V1 v12 = new V1(this);
        v12.l();
        this.f54522i = v12;
        B5 b52 = new B5(this);
        b52.l();
        this.f54525l = b52;
        this.f54526m = new R1(new C4650l3(j3Var, this));
        this.f54530q = new C4731z(this);
        C4609f4 f4Var = new C4609f4(this);
        f4Var.r();
        this.f54528o = f4Var;
        C4643k3 k3Var = new C4643k3(this);
        k3Var.r();
        this.f54529p = k3Var;
        V4 v42 = new V4(this);
        v42.r();
        this.f54524k = v42;
        Y3 y32 = new Y3(this);
        y32.l();
        this.f54531r = y32;
        C4734z2 z2Var = new C4734z2(this);
        z2Var.l();
        this.f54523j = z2Var;
        zzdo zzdo2 = j3Var.f55160g;
        if (!(zzdo2 == null || zzdo2.zzb == 0)) {
            z10 = true;
        }
        boolean z11 = !z10;
        if (context.getApplicationContext() instanceof Application) {
            C().N0(z11);
        } else {
            zzj().G().a("Application context is not an Application");
        }
        z2Var.y(new F2(this, j3Var));
    }

    public static E2 a(Context context, zzdo zzdo, Long l10) {
        Bundle bundle;
        if (zzdo != null && (zzdo.zze == null || zzdo.zzf == null)) {
            zzdo = new zzdo(zzdo.zza, zzdo.zzb, zzdo.zzc, zzdo.zzd, (String) null, (String) null, zzdo.zzg, (String) null);
        }
        C4536s.l(context);
        C4536s.l(context.getApplicationContext());
        if (f54505I == null) {
            synchronized (E2.class) {
                try {
                    if (f54505I == null) {
                        f54505I = new E2(new C4636j3(context, zzdo, l10));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (!(zzdo == null || (bundle = zzdo.zzg) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            C4536s.l(f54505I);
            f54505I.h(zzdo.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        C4536s.l(f54505I);
        return f54505I;
    }

    private static void c(C4578b1 b1Var) {
        if (b1Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!b1Var.u()) {
            String valueOf = String.valueOf(b1Var.getClass());
            throw new IllegalStateException("Component not initialized: " + valueOf);
        }
    }

    static /* synthetic */ void d(E2 e22, C4636j3 j3Var) {
        e22.zzl().i();
        C4713w wVar = new C4713w(e22);
        wVar.l();
        e22.f54535v = wVar;
        Q1 q12 = new Q1(e22, j3Var.f55159f);
        q12.r();
        e22.f54536w = q12;
        P1 p12 = new P1(e22);
        p12.r();
        e22.f54533t = p12;
        C4644k4 k4Var = new C4644k4(e22);
        k4Var.r();
        e22.f54534u = k4Var;
        e22.f54525l.m();
        e22.f54521h.m();
        e22.f54536w.s();
        e22.zzj().E().b("App measurement initialized, version", 97001L);
        e22.zzj().E().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String A10 = q12.A();
        if (TextUtils.isEmpty(e22.f54515b)) {
            if (e22.G().z0(A10, e22.f54520g.M())) {
                e22.zzj().E().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                X1 E10 = e22.zzj().E();
                E10.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + A10);
            }
        }
        e22.zzj().A().a("Debug-level message logging enabled");
        if (e22.f54510E != e22.f54512G.get()) {
            e22.zzj().B().c("Not all components initialized", Integer.valueOf(e22.f54510E), Integer.valueOf(e22.f54512G.get()));
        }
        e22.f54537x = true;
    }

    private static void e(C4601e3 e3Var) {
        if (e3Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!e3Var.n()) {
            String valueOf = String.valueOf(e3Var.getClass());
            throw new IllegalStateException("Component not initialized: " + valueOf);
        }
    }

    private static void f(C4608f3 f3Var) {
        if (f3Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private final Y3 q() {
        e(this.f54531r);
        return this.f54531r;
    }

    public final C4614g2 A() {
        f(this.f54521h);
        return this.f54521h;
    }

    /* access modifiers changed from: package-private */
    public final C4734z2 B() {
        return this.f54523j;
    }

    public final C4643k3 C() {
        c(this.f54529p);
        return this.f54529p;
    }

    public final C4609f4 D() {
        c(this.f54528o);
        return this.f54528o;
    }

    public final C4644k4 E() {
        c(this.f54534u);
        return this.f54534u;
    }

    public final V4 F() {
        c(this.f54524k);
        return this.f54524k;
    }

    public final B5 G() {
        f(this.f54525l);
        return this.f54525l;
    }

    public final String H() {
        return this.f54515b;
    }

    public final String I() {
        return this.f54516c;
    }

    public final String J() {
        return this.f54517d;
    }

    public final String K() {
        return this.f54532s;
    }

    /* access modifiers changed from: package-private */
    public final void L() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: package-private */
    public final void M() {
        this.f54512G.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ec, code lost:
        if (r1.C() != false) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0161, code lost:
        if (r1.C() != false) goto L_0x0165;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x020d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x024c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(com.google.android.gms.internal.measurement.zzdo r13) {
        /*
            r12 = this;
            com.google.android.gms.measurement.internal.z2 r0 = r12.zzl()
            r0.i()
            boolean r0 = com.google.android.gms.internal.measurement.zzpg.zza()
            if (r0 == 0) goto L_0x004e
            com.google.android.gms.measurement.internal.h r0 = r12.f54520g
            com.google.android.gms.measurement.internal.M1 r1 = com.google.android.gms.measurement.internal.F.f54586B0
            boolean r0 = r0.o(r1)
            if (r0 == 0) goto L_0x004e
            com.google.android.gms.measurement.internal.B5 r0 = r12.G()
            boolean r0 = r0.S0()
            if (r0 == 0) goto L_0x004e
            com.google.android.gms.measurement.internal.B5 r0 = r12.G()
            r0.i()
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>()
            java.lang.String r2 = "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"
            r1.addAction(r2)
            Pa.B r2 = new Pa.B
            com.google.android.gms.measurement.internal.E2 r3 = r0.f55074a
            r2.<init>(r3)
            android.content.Context r3 = r0.zza()
            r4 = 2
            androidx.core.content.c.registerReceiver(r3, r2, r1, r4)
            com.google.android.gms.measurement.internal.V1 r0 = r0.zzj()
            com.google.android.gms.measurement.internal.X1 r0 = r0.A()
            java.lang.String r1 = "Registered app receiver"
            r0.a(r1)
        L_0x004e:
            com.google.android.gms.measurement.internal.g2 r0 = r12.A()
            com.google.android.gms.measurement.internal.h3 r0 = r0.H()
            int r1 = r0.b()
            boolean r2 = com.google.android.gms.internal.measurement.zzne.zza()
            r3 = 40
            r4 = 10
            java.lang.String r5 = "google_analytics_default_allow_analytics_storage"
            java.lang.String r6 = "google_analytics_default_allow_ad_storage"
            r7 = 0
            r8 = 0
            r9 = -10
            r10 = 30
            if (r2 == 0) goto L_0x00f0
            com.google.android.gms.measurement.internal.h r2 = r12.f54520g
            com.google.android.gms.measurement.internal.M1 r11 = com.google.android.gms.measurement.internal.F.f54618R0
            boolean r2 = r2.o(r11)
            if (r2 == 0) goto L_0x00f0
            com.google.android.gms.measurement.internal.h r2 = r12.f54520g
            Pa.o r2 = r2.v(r6, r7)
            com.google.android.gms.measurement.internal.h r6 = r12.f54520g
            Pa.o r5 = r6.v(r5, r7)
            Pa.o r6 = Pa.o.UNINITIALIZED
            if (r2 != r6) goto L_0x008a
            if (r5 == r6) goto L_0x009a
        L_0x008a:
            com.google.android.gms.measurement.internal.g2 r6 = r12.A()
            boolean r6 = r6.t(r9)
            if (r6 == 0) goto L_0x009a
            com.google.android.gms.measurement.internal.h3 r1 = com.google.android.gms.measurement.internal.C4622h3.f(r2, r5, r9)
            goto L_0x0165
        L_0x009a:
            com.google.android.gms.measurement.internal.Q1 r2 = r12.w()
            java.lang.String r2 = r2.B()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00c4
            if (r1 == 0) goto L_0x00b4
            if (r1 == r10) goto L_0x00b4
            if (r1 == r4) goto L_0x00b4
            if (r1 == r10) goto L_0x00b4
            if (r1 == r10) goto L_0x00b4
            if (r1 != r3) goto L_0x00c4
        L_0x00b4:
            com.google.android.gms.measurement.internal.k3 r1 = r12.C()
            com.google.android.gms.measurement.internal.h3 r2 = new com.google.android.gms.measurement.internal.h3
            r2.<init>(r8, r8, r9)
            long r3 = r12.f54513H
            r1.O(r2, r3, r7)
            goto L_0x0164
        L_0x00c4:
            com.google.android.gms.measurement.internal.Q1 r1 = r12.w()
            java.lang.String r1 = r1.B()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0164
            if (r13 == 0) goto L_0x0164
            android.os.Bundle r1 = r13.zzg
            if (r1 == 0) goto L_0x0164
            com.google.android.gms.measurement.internal.g2 r1 = r12.A()
            boolean r1 = r1.t(r10)
            if (r1 == 0) goto L_0x0164
            android.os.Bundle r1 = r13.zzg
            com.google.android.gms.measurement.internal.h3 r1 = com.google.android.gms.measurement.internal.C4622h3.g(r1, r10)
            boolean r2 = r1.C()
            if (r2 == 0) goto L_0x0164
            goto L_0x0165
        L_0x00f0:
            com.google.android.gms.measurement.internal.h r2 = r12.f54520g
            java.lang.Boolean r2 = r2.y(r6)
            com.google.android.gms.measurement.internal.h r6 = r12.f54520g
            java.lang.Boolean r5 = r6.y(r5)
            if (r2 != 0) goto L_0x0100
            if (r5 == 0) goto L_0x0110
        L_0x0100:
            com.google.android.gms.measurement.internal.g2 r6 = r12.A()
            boolean r6 = r6.t(r9)
            if (r6 == 0) goto L_0x0110
            com.google.android.gms.measurement.internal.h3 r1 = new com.google.android.gms.measurement.internal.h3
            r1.<init>(r2, r5, r9)
            goto L_0x0165
        L_0x0110:
            com.google.android.gms.measurement.internal.Q1 r2 = r12.w()
            java.lang.String r2 = r2.B()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0139
            if (r1 == 0) goto L_0x012a
            if (r1 == r10) goto L_0x012a
            if (r1 == r4) goto L_0x012a
            if (r1 == r10) goto L_0x012a
            if (r1 == r10) goto L_0x012a
            if (r1 != r3) goto L_0x0139
        L_0x012a:
            com.google.android.gms.measurement.internal.k3 r1 = r12.C()
            com.google.android.gms.measurement.internal.h3 r2 = new com.google.android.gms.measurement.internal.h3
            r2.<init>(r8, r8, r9)
            long r3 = r12.f54513H
            r1.O(r2, r3, r7)
            goto L_0x0164
        L_0x0139:
            com.google.android.gms.measurement.internal.Q1 r1 = r12.w()
            java.lang.String r1 = r1.B()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0164
            if (r13 == 0) goto L_0x0164
            android.os.Bundle r1 = r13.zzg
            if (r1 == 0) goto L_0x0164
            com.google.android.gms.measurement.internal.g2 r1 = r12.A()
            boolean r1 = r1.t(r10)
            if (r1 == 0) goto L_0x0164
            android.os.Bundle r1 = r13.zzg
            com.google.android.gms.measurement.internal.h3 r1 = com.google.android.gms.measurement.internal.C4622h3.g(r1, r10)
            boolean r2 = r1.C()
            if (r2 == 0) goto L_0x0164
            goto L_0x0165
        L_0x0164:
            r1 = r8
        L_0x0165:
            if (r1 == 0) goto L_0x0179
            com.google.android.gms.measurement.internal.k3 r0 = r12.C()
            long r2 = r12.f54513H
            com.google.android.gms.measurement.internal.h r4 = r12.f54520g
            com.google.android.gms.measurement.internal.M1 r5 = com.google.android.gms.measurement.internal.F.f54624U0
            boolean r4 = r4.o(r5)
            r0.O(r1, r2, r4)
            r0 = r1
        L_0x0179:
            com.google.android.gms.measurement.internal.k3 r1 = r12.C()
            r1.N(r0)
            com.google.android.gms.measurement.internal.g2 r0 = r12.A()
            com.google.android.gms.measurement.internal.u r0 = r0.G()
            int r0 = r0.a()
            boolean r1 = com.google.android.gms.internal.measurement.zzne.zza()
            java.lang.String r2 = "google_analytics_default_allow_ad_user_data"
            r3 = 1
            if (r1 == 0) goto L_0x01db
            com.google.android.gms.measurement.internal.h r1 = r12.f54520g
            com.google.android.gms.measurement.internal.M1 r4 = com.google.android.gms.measurement.internal.F.f54618R0
            boolean r1 = r1.o(r4)
            if (r1 == 0) goto L_0x01db
            com.google.android.gms.measurement.internal.h r1 = r12.f54520g
            java.lang.String r4 = "google_analytics_default_allow_ad_personalization_signals"
            Pa.o r1 = r1.v(r4, r3)
            Pa.o r4 = Pa.o.UNINITIALIZED
            if (r1 == r4) goto L_0x01b8
            com.google.android.gms.measurement.internal.V1 r5 = r12.zzj()
            com.google.android.gms.measurement.internal.X1 r5 = r5.F()
            java.lang.String r6 = "Default ad personalization consent from Manifest"
            r5.b(r6, r1)
        L_0x01b8:
            com.google.android.gms.measurement.internal.h r1 = r12.f54520g
            Pa.o r1 = r1.v(r2, r3)
            if (r1 == r4) goto L_0x01ff
            boolean r2 = com.google.android.gms.measurement.internal.C4622h3.l(r9, r0)
            if (r2 == 0) goto L_0x01ff
            com.google.android.gms.measurement.internal.k3 r13 = r12.C()
            com.google.android.gms.measurement.internal.u r0 = com.google.android.gms.measurement.internal.C4701u.b(r1, r9)
            com.google.android.gms.measurement.internal.h r1 = r12.f54520g
            com.google.android.gms.measurement.internal.M1 r2 = com.google.android.gms.measurement.internal.F.f54624U0
            boolean r1 = r1.o(r2)
            r13.M(r0, r1)
            goto L_0x0292
        L_0x01db:
            com.google.android.gms.measurement.internal.h r1 = r12.f54520g
            java.lang.Boolean r1 = r1.y(r2)
            if (r1 == 0) goto L_0x01ff
            boolean r2 = com.google.android.gms.measurement.internal.C4622h3.l(r9, r0)
            if (r2 == 0) goto L_0x01ff
            com.google.android.gms.measurement.internal.k3 r13 = r12.C()
            com.google.android.gms.measurement.internal.u r0 = new com.google.android.gms.measurement.internal.u
            r0.<init>(r1, r9)
            com.google.android.gms.measurement.internal.h r1 = r12.f54520g
            com.google.android.gms.measurement.internal.M1 r2 = com.google.android.gms.measurement.internal.F.f54624U0
            boolean r1 = r1.o(r2)
            r13.M(r0, r1)
            goto L_0x0292
        L_0x01ff:
            com.google.android.gms.measurement.internal.Q1 r1 = r12.w()
            java.lang.String r1 = r1.B()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0226
            if (r0 == 0) goto L_0x0211
            if (r0 != r10) goto L_0x0226
        L_0x0211:
            com.google.android.gms.measurement.internal.k3 r13 = r12.C()
            com.google.android.gms.measurement.internal.u r0 = new com.google.android.gms.measurement.internal.u
            r0.<init>(r8, r9)
            com.google.android.gms.measurement.internal.h r1 = r12.f54520g
            com.google.android.gms.measurement.internal.M1 r2 = com.google.android.gms.measurement.internal.F.f54624U0
            boolean r1 = r1.o(r2)
            r13.M(r0, r1)
            goto L_0x0292
        L_0x0226:
            com.google.android.gms.measurement.internal.Q1 r1 = r12.w()
            java.lang.String r1 = r1.B()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x025b
            if (r13 == 0) goto L_0x025b
            android.os.Bundle r1 = r13.zzg
            if (r1 == 0) goto L_0x025b
            boolean r0 = com.google.android.gms.measurement.internal.C4622h3.l(r10, r0)
            if (r0 == 0) goto L_0x025b
            android.os.Bundle r0 = r13.zzg
            com.google.android.gms.measurement.internal.u r0 = com.google.android.gms.measurement.internal.C4701u.c(r0, r10)
            boolean r1 = r0.k()
            if (r1 == 0) goto L_0x025b
            com.google.android.gms.measurement.internal.k3 r1 = r12.C()
            com.google.android.gms.measurement.internal.h r2 = r12.f54520g
            com.google.android.gms.measurement.internal.M1 r4 = com.google.android.gms.measurement.internal.F.f54624U0
            boolean r2 = r2.o(r4)
            r1.M(r0, r2)
        L_0x025b:
            com.google.android.gms.measurement.internal.Q1 r0 = r12.w()
            java.lang.String r0 = r0.B()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0292
            if (r13 == 0) goto L_0x0292
            android.os.Bundle r0 = r13.zzg
            if (r0 == 0) goto L_0x0292
            com.google.android.gms.measurement.internal.g2 r0 = r12.A()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f55101o
            java.lang.String r0 = r0.a()
            if (r0 != 0) goto L_0x0292
            android.os.Bundle r0 = r13.zzg
            java.lang.Boolean r0 = com.google.android.gms.measurement.internal.C4701u.e(r0)
            if (r0 == 0) goto L_0x0292
            com.google.android.gms.measurement.internal.k3 r1 = r12.C()
            java.lang.String r13 = r13.zze
            java.lang.String r2 = "allow_personalized_ads"
            java.lang.String r0 = r0.toString()
            r1.f0(r13, r2, r0, r7)
        L_0x0292:
            com.google.android.gms.measurement.internal.h r13 = r12.f54520g
            java.lang.String r0 = "google_analytics_tcf_data_enabled"
            java.lang.Boolean r13 = r13.y(r0)
            if (r13 != 0) goto L_0x029e
            r13 = r3
            goto L_0x02a2
        L_0x029e:
            boolean r13 = r13.booleanValue()
        L_0x02a2:
            if (r13 == 0) goto L_0x02bf
            com.google.android.gms.measurement.internal.V1 r13 = r12.zzj()
            com.google.android.gms.measurement.internal.X1 r13 = r13.A()
            java.lang.String r0 = "TCF client enabled."
            r13.a(r0)
            com.google.android.gms.measurement.internal.k3 r13 = r12.C()
            r13.B0()
            com.google.android.gms.measurement.internal.k3 r13 = r12.C()
            r13.z0()
        L_0x02bf:
            com.google.android.gms.measurement.internal.g2 r13 = r12.A()
            com.google.android.gms.measurement.internal.l2 r13 = r13.f55093g
            long r0 = r13.a()
            r4 = 0
            int r13 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r13 != 0) goto L_0x02ed
            com.google.android.gms.measurement.internal.V1 r13 = r12.zzj()
            com.google.android.gms.measurement.internal.X1 r13 = r13.F()
            long r0 = r12.f54513H
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "Persisting first open"
            r13.b(r1, r0)
            com.google.android.gms.measurement.internal.g2 r13 = r12.A()
            com.google.android.gms.measurement.internal.l2 r13 = r13.f55093g
            long r0 = r12.f54513H
            r13.b(r0)
        L_0x02ed:
            com.google.android.gms.measurement.internal.k3 r13 = r12.C()
            com.google.android.gms.measurement.internal.G5 r13 = r13.f55199p
            r13.c()
            boolean r13 = r12.n()
            if (r13 != 0) goto L_0x0381
            boolean r13 = r12.k()
            if (r13 == 0) goto L_0x04e1
            com.google.android.gms.measurement.internal.B5 r13 = r12.G()
            java.lang.String r0 = "android.permission.INTERNET"
            boolean r13 = r13.A0(r0)
            if (r13 != 0) goto L_0x031b
            com.google.android.gms.measurement.internal.V1 r13 = r12.zzj()
            com.google.android.gms.measurement.internal.X1 r13 = r13.B()
            java.lang.String r0 = "App is missing INTERNET permission"
            r13.a(r0)
        L_0x031b:
            com.google.android.gms.measurement.internal.B5 r13 = r12.G()
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r13 = r13.A0(r0)
            if (r13 != 0) goto L_0x0334
            com.google.android.gms.measurement.internal.V1 r13 = r12.zzj()
            com.google.android.gms.measurement.internal.X1 r13 = r13.B()
            java.lang.String r0 = "App is missing ACCESS_NETWORK_STATE permission"
            r13.a(r0)
        L_0x0334:
            android.content.Context r13 = r12.f54514a
            Ga.d r13 = Ga.C4293e.a(r13)
            boolean r13 = r13.f()
            if (r13 != 0) goto L_0x0372
            com.google.android.gms.measurement.internal.h r13 = r12.f54520g
            boolean r13 = r13.Q()
            if (r13 != 0) goto L_0x0372
            android.content.Context r13 = r12.f54514a
            boolean r13 = com.google.android.gms.measurement.internal.B5.Y(r13)
            if (r13 != 0) goto L_0x035d
            com.google.android.gms.measurement.internal.V1 r13 = r12.zzj()
            com.google.android.gms.measurement.internal.X1 r13 = r13.B()
            java.lang.String r0 = "AppMeasurementReceiver not registered/enabled"
            r13.a(r0)
        L_0x035d:
            android.content.Context r13 = r12.f54514a
            boolean r13 = com.google.android.gms.measurement.internal.B5.Z(r13, r7)
            if (r13 != 0) goto L_0x0372
            com.google.android.gms.measurement.internal.V1 r13 = r12.zzj()
            com.google.android.gms.measurement.internal.X1 r13 = r13.B()
            java.lang.String r0 = "AppMeasurementService not registered/enabled"
            r13.a(r0)
        L_0x0372:
            com.google.android.gms.measurement.internal.V1 r13 = r12.zzj()
            com.google.android.gms.measurement.internal.X1 r13 = r13.B()
            java.lang.String r0 = "Uploading is not possible. App measurement disabled"
            r13.a(r0)
            goto L_0x04e1
        L_0x0381:
            com.google.android.gms.measurement.internal.Q1 r13 = r12.w()
            java.lang.String r13 = r13.B()
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L_0x039d
            com.google.android.gms.measurement.internal.Q1 r13 = r12.w()
            java.lang.String r13 = r13.z()
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L_0x041d
        L_0x039d:
            r12.G()
            com.google.android.gms.measurement.internal.Q1 r13 = r12.w()
            java.lang.String r13 = r13.B()
            com.google.android.gms.measurement.internal.g2 r0 = r12.A()
            java.lang.String r0 = r0.N()
            com.google.android.gms.measurement.internal.Q1 r1 = r12.w()
            java.lang.String r1 = r1.z()
            com.google.android.gms.measurement.internal.g2 r2 = r12.A()
            java.lang.String r2 = r2.M()
            boolean r13 = com.google.android.gms.measurement.internal.B5.h0(r13, r0, r1, r2)
            if (r13 == 0) goto L_0x03ff
            com.google.android.gms.measurement.internal.V1 r13 = r12.zzj()
            com.google.android.gms.measurement.internal.X1 r13 = r13.E()
            java.lang.String r0 = "Rechecking which service to use due to a GMP App Id change"
            r13.a(r0)
            com.google.android.gms.measurement.internal.g2 r13 = r12.A()
            r13.O()
            com.google.android.gms.measurement.internal.P1 r13 = r12.x()
            r13.C()
            com.google.android.gms.measurement.internal.k4 r13 = r12.f54534u
            r13.U()
            com.google.android.gms.measurement.internal.k4 r13 = r12.f54534u
            r13.T()
            com.google.android.gms.measurement.internal.g2 r13 = r12.A()
            com.google.android.gms.measurement.internal.l2 r13 = r13.f55093g
            long r0 = r12.f54513H
            r13.b(r0)
            com.google.android.gms.measurement.internal.g2 r13 = r12.A()
            com.google.android.gms.measurement.internal.m2 r13 = r13.f55095i
            r13.b(r8)
        L_0x03ff:
            com.google.android.gms.measurement.internal.g2 r13 = r12.A()
            com.google.android.gms.measurement.internal.Q1 r0 = r12.w()
            java.lang.String r0 = r0.B()
            r13.D(r0)
            com.google.android.gms.measurement.internal.g2 r13 = r12.A()
            com.google.android.gms.measurement.internal.Q1 r0 = r12.w()
            java.lang.String r0 = r0.z()
            r13.A(r0)
        L_0x041d:
            com.google.android.gms.measurement.internal.g2 r13 = r12.A()
            com.google.android.gms.measurement.internal.h3 r13 = r13.H()
            com.google.android.gms.measurement.internal.h3$a r0 = com.google.android.gms.measurement.internal.C4622h3.a.ANALYTICS_STORAGE
            boolean r13 = r13.m(r0)
            if (r13 != 0) goto L_0x0436
            com.google.android.gms.measurement.internal.g2 r13 = r12.A()
            com.google.android.gms.measurement.internal.m2 r13 = r13.f55095i
            r13.b(r8)
        L_0x0436:
            com.google.android.gms.measurement.internal.k3 r13 = r12.C()
            com.google.android.gms.measurement.internal.g2 r0 = r12.A()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f55095i
            java.lang.String r0 = r0.a()
            r13.S0(r0)
            com.google.android.gms.measurement.internal.B5 r13 = r12.G()
            boolean r13 = r13.T0()
            if (r13 != 0) goto L_0x0477
            com.google.android.gms.measurement.internal.g2 r13 = r12.A()
            com.google.android.gms.measurement.internal.m2 r13 = r13.f55110x
            java.lang.String r13 = r13.a()
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L_0x0477
            com.google.android.gms.measurement.internal.V1 r13 = r12.zzj()
            com.google.android.gms.measurement.internal.X1 r13 = r13.G()
            java.lang.String r0 = "Remote config removed with active feature rollouts"
            r13.a(r0)
            com.google.android.gms.measurement.internal.g2 r13 = r12.A()
            com.google.android.gms.measurement.internal.m2 r13 = r13.f55110x
            r13.b(r8)
        L_0x0477:
            com.google.android.gms.measurement.internal.Q1 r13 = r12.w()
            java.lang.String r13 = r13.B()
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L_0x0493
            com.google.android.gms.measurement.internal.Q1 r13 = r12.w()
            java.lang.String r13 = r13.z()
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L_0x04e1
        L_0x0493:
            boolean r13 = r12.k()
            com.google.android.gms.measurement.internal.g2 r0 = r12.A()
            boolean r0 = r0.y()
            if (r0 != 0) goto L_0x04b2
            com.google.android.gms.measurement.internal.h r0 = r12.f54520g
            boolean r0 = r0.P()
            if (r0 != 0) goto L_0x04b2
            com.google.android.gms.measurement.internal.g2 r0 = r12.A()
            r1 = r13 ^ 1
            r0.B(r1)
        L_0x04b2:
            if (r13 == 0) goto L_0x04bb
            com.google.android.gms.measurement.internal.k3 r13 = r12.C()
            r13.v0()
        L_0x04bb:
            com.google.android.gms.measurement.internal.V4 r13 = r12.F()
            com.google.android.gms.measurement.internal.c5 r13 = r13.f54912e
            r13.a()
            com.google.android.gms.measurement.internal.k4 r13 = r12.E()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r13.L(r0)
            com.google.android.gms.measurement.internal.k4 r13 = r12.E()
            com.google.android.gms.measurement.internal.g2 r0 = r12.A()
            com.google.android.gms.measurement.internal.i2 r0 = r0.f55088A
            android.os.Bundle r0 = r0.a()
            r13.z(r0)
        L_0x04e1:
            boolean r13 = com.google.android.gms.internal.measurement.zzpg.zza()
            if (r13 == 0) goto L_0x050f
            com.google.android.gms.measurement.internal.h r13 = r12.f54520g
            com.google.android.gms.measurement.internal.M1 r0 = com.google.android.gms.measurement.internal.F.f54586B0
            boolean r13 = r13.o(r0)
            if (r13 == 0) goto L_0x050f
            com.google.android.gms.measurement.internal.B5 r13 = r12.G()
            boolean r13 = r13.S0()
            if (r13 == 0) goto L_0x050f
            java.lang.Thread r13 = new java.lang.Thread
            com.google.android.gms.measurement.internal.k3 r0 = r12.C()
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.measurement.internal.D2 r1 = new com.google.android.gms.measurement.internal.D2
            r1.<init>(r0)
            r13.<init>(r1)
            r13.start()
        L_0x050f:
            com.google.android.gms.measurement.internal.g2 r13 = r12.A()
            com.google.android.gms.measurement.internal.j2 r13 = r13.f55103q
            r13.a(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.E2.b(com.google.android.gms.internal.measurement.zzdo):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        if ((i10 == 200 || i10 == 204 || i10 == 304) && th2 == null) {
            A().f55108v.a(true);
            if (bArr == null || bArr.length == 0) {
                zzj().A().a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString(Constants.DEEPLINK, "");
                if (TextUtils.isEmpty(optString)) {
                    zzj().A().a("Deferred Deep Link is empty.");
                    return;
                }
                String optString2 = jSONObject.optString("gclid", "");
                String optString3 = jSONObject.optString("gbraid", "");
                String optString4 = jSONObject.optString("gad_source", "");
                double optDouble = jSONObject.optDouble(DiagnosticsEntry.TIMESTAMP_KEY, 0.0d);
                Bundle bundle = new Bundle();
                if (!zzoj.zza() || !this.f54520g.o(F.f54608M0)) {
                    if (!G().H0(optString)) {
                        zzj().G().c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                        return;
                    }
                } else if (!G().H0(optString)) {
                    zzj().G().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                    return;
                } else {
                    if (!TextUtils.isEmpty(optString3)) {
                        bundle.putString("gbraid", optString3);
                    }
                    if (!TextUtils.isEmpty(optString4)) {
                        bundle.putString("gad_source", optString4);
                    }
                }
                if (zzoj.zza()) {
                    this.f54520g.o(F.f54608M0);
                }
                bundle.putString("gclid", optString2);
                bundle.putString("_cis", "ddp");
                this.f54529p.T0("auto", "_cmp", bundle);
                B5 G10 = G();
                if (!TextUtils.isEmpty(optString) && G10.d0(optString, optDouble)) {
                    G10.zza().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                }
            } catch (JSONException e10) {
                zzj().B().b("Failed to parse the Deferred Deep Link response. exception", e10);
            }
        } else {
            zzj().G().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void h(boolean z10) {
        this.f54506A = Boolean.valueOf(z10);
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        this.f54510E++;
    }

    public final boolean j() {
        if (this.f54506A == null || !this.f54506A.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean k() {
        if (s() == 0) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        zzl().i();
        return this.f54509D;
    }

    public final boolean m() {
        return TextUtils.isEmpty(this.f54515b);
    }

    /* access modifiers changed from: protected */
    public final boolean n() {
        boolean z10;
        if (this.f54537x) {
            zzl().i();
            Boolean bool = this.f54538y;
            if (bool == null || this.f54539z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.f54527n.a() - this.f54539z) > 1000)) {
                this.f54539z = this.f54527n.a();
                boolean z11 = true;
                if (!G().A0("android.permission.INTERNET") || !G().A0("android.permission.ACCESS_NETWORK_STATE") || (!C4293e.a(this.f54514a).f() && !this.f54520g.Q() && (!B5.Y(this.f54514a) || !B5.Z(this.f54514a, false)))) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                Boolean valueOf = Boolean.valueOf(z10);
                this.f54538y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!G().f0(w().B(), w().z()) && TextUtils.isEmpty(w().z())) {
                        z11 = false;
                    }
                    this.f54538y = Boolean.valueOf(z11);
                }
            }
            return this.f54538y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    public final boolean o() {
        return this.f54518e;
    }

    public final boolean p() {
        Bundle bundle;
        int i10;
        String str;
        zzl().i();
        e(q());
        String A10 = w().A();
        Pair p10 = A().p(A10);
        boolean z10 = false;
        if (!this.f54520g.N() || ((Boolean) p10.second).booleanValue() || TextUtils.isEmpty((CharSequence) p10.first)) {
            zzj().A().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        } else if (!q().r()) {
            zzj().G().a("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        } else {
            StringBuilder sb2 = new StringBuilder();
            C4644k4 E10 = E();
            E10.i();
            E10.q();
            if (!E10.e0() || E10.f().D0() >= 234200) {
                C4378a k02 = C().k0();
                if (k02 != null) {
                    bundle = k02.f52132a;
                } else {
                    bundle = null;
                }
                int i11 = 1;
                if (bundle == null) {
                    int i12 = this.f54511F;
                    this.f54511F = i12 + 1;
                    if (i12 < 10) {
                        z10 = true;
                    }
                    X1 A11 = zzj().A();
                    if (z10) {
                        str = "Retrying.";
                    } else {
                        str = "Skipping.";
                    }
                    A11.b("Failed to retrieve DMA consent from the service, " + str + " retryCount", Integer.valueOf(this.f54511F));
                    return z10;
                }
                C4622h3 g10 = C4622h3.g(bundle, 100);
                sb2.append("&gcs=");
                sb2.append(g10.y());
                C4701u c10 = C4701u.c(bundle, 100);
                sb2.append("&dma=");
                if (c10.h() == Boolean.FALSE) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                sb2.append(i10);
                if (!TextUtils.isEmpty(c10.i())) {
                    sb2.append("&dma_cps=");
                    sb2.append(c10.i());
                }
                if (C4701u.e(bundle) == Boolean.TRUE) {
                    i11 = 0;
                }
                sb2.append("&npa=");
                sb2.append(i11);
                zzj().F().b("Consent query parameters to Bow", sb2);
            }
            B5 G10 = G();
            w();
            URL F10 = G10.F(97001, A10, (String) p10.first, A().f55109w.a() - 1, sb2.toString());
            if (F10 != null) {
                Y3 q10 = q();
                G2 g22 = new G2(this);
                q10.i();
                q10.k();
                C4536s.l(F10);
                C4536s.l(g22);
                q10.zzl().u(new Z3(q10, A10, F10, (byte[]) null, (Map) null, g22));
            }
            return false;
        }
    }

    public final void r(boolean z10) {
        zzl().i();
        this.f54509D = z10;
    }

    public final int s() {
        zzl().i();
        if (this.f54520g.P()) {
            return 1;
        }
        Boolean bool = this.f54508C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!l()) {
            return 8;
        }
        Boolean K10 = A().K();
        if (K10 == null) {
            Boolean y10 = this.f54520g.y("firebase_analytics_collection_enabled");
            if (y10 == null) {
                Boolean bool2 = this.f54507B;
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        return 0;
                    }
                    return 5;
                } else if (this.f54506A == null || this.f54506A.booleanValue()) {
                    return 0;
                } else {
                    return 7;
                }
            } else if (y10.booleanValue()) {
                return 0;
            } else {
                return 4;
            }
        } else if (K10.booleanValue()) {
            return 0;
        } else {
            return 3;
        }
    }

    public final C4731z t() {
        C4731z zVar = this.f54530q;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final C4618h u() {
        return this.f54520g;
    }

    public final C4713w v() {
        e(this.f54535v);
        return this.f54535v;
    }

    public final Q1 w() {
        c(this.f54536w);
        return this.f54536w;
    }

    public final P1 x() {
        c(this.f54533t);
        return this.f54533t;
    }

    public final R1 y() {
        return this.f54526m;
    }

    public final V1 z() {
        V1 v12 = this.f54522i;
        if (v12 == null || !v12.n()) {
            return null;
        }
        return this.f54522i;
    }

    public final Context zza() {
        return this.f54514a;
    }

    public final e zzb() {
        return this.f54527n;
    }

    public final C4583c zzd() {
        return this.f54519f;
    }

    public final V1 zzj() {
        e(this.f54522i);
        return this.f54522i;
    }

    public final C4734z2 zzl() {
        e(this.f54523j);
        return this.f54523j;
    }
}
