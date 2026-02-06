package com.google.android.gms.measurement.internal;

import Ea.e;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C4536s;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.measurement.internal.f4  reason: case insensitive filesystem */
public final class C4609f4 extends C4578b1 {

    /* renamed from: c  reason: collision with root package name */
    private volatile C4595d4 f55075c;

    /* renamed from: d  reason: collision with root package name */
    private volatile C4595d4 f55076d;

    /* renamed from: e  reason: collision with root package name */
    protected C4595d4 f55077e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f55078f = new ConcurrentHashMap();

    /* renamed from: g  reason: collision with root package name */
    private Activity f55079g;

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f55080h;

    /* renamed from: i  reason: collision with root package name */
    private volatile C4595d4 f55081i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public C4595d4 f55082j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f55083k;

    /* renamed from: l  reason: collision with root package name */
    private final Object f55084l = new Object();

    public C4609f4(E2 e22) {
        super(e22);
    }

    private final void B(Activity activity, C4595d4 d4Var, boolean z10) {
        C4595d4 d4Var2;
        C4595d4 d4Var3;
        String str;
        C4595d4 d4Var4 = d4Var;
        if (this.f55075c == null) {
            d4Var2 = this.f55076d;
        } else {
            d4Var2 = this.f55075c;
        }
        C4595d4 d4Var5 = d4Var2;
        if (d4Var4.f55044b == null) {
            if (activity != null) {
                str = y(activity.getClass(), "Activity");
            } else {
                str = null;
            }
            d4Var3 = new C4595d4(d4Var4.f55043a, str, d4Var4.f55045c, d4Var4.f55047e, d4Var4.f55048f);
        } else {
            d4Var3 = d4Var4;
        }
        this.f55076d = this.f55075c;
        this.f55075c = d4Var3;
        zzl().y(new C4623h4(this, d4Var3, d4Var5, zzb().a(), z10));
    }

    /* access modifiers changed from: private */
    public final void E(C4595d4 d4Var, C4595d4 d4Var2, long j10, boolean z10, Bundle bundle) {
        boolean z11;
        Bundle bundle2;
        String str;
        long j11;
        C4595d4 d4Var3 = d4Var;
        C4595d4 d4Var4 = d4Var2;
        long j12 = j10;
        Bundle bundle3 = bundle;
        i();
        boolean z12 = false;
        if (d4Var4 == null || d4Var4.f55045c != d4Var3.f55045c || !Objects.equals(d4Var4.f55044b, d4Var3.f55044b) || !Objects.equals(d4Var4.f55043a, d4Var3.f55043a)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && this.f55077e != null) {
            z12 = true;
        }
        if (z11) {
            if (bundle3 == null) {
                bundle2 = new Bundle();
            }
            Bundle bundle4 = bundle2;
            B5.S(d4Var3, bundle4, true);
            if (d4Var4 != null) {
                String str2 = d4Var4.f55043a;
                if (str2 != null) {
                    bundle4.putString("_pn", str2);
                }
                String str3 = d4Var4.f55044b;
                if (str3 != null) {
                    bundle4.putString("_pc", str3);
                }
                bundle4.putLong("_pi", d4Var4.f55045c);
            }
            if (z12) {
                long a10 = p().f54913f.a(j12);
                if (a10 > 0) {
                    f().H(bundle4, a10);
                }
            }
            if (!a().O()) {
                bundle4.putLong("_mst", 1);
            }
            if (d4Var3.f55047e) {
                str = "app";
            } else {
                str = "auto";
            }
            String str4 = str;
            long currentTimeMillis = zzb().currentTimeMillis();
            if (d4Var3.f55047e) {
                long j13 = d4Var3.f55048f;
                if (j13 != 0) {
                    j11 = j13;
                    m().Y(str4, "_vs", j11, bundle4);
                }
            }
            j11 = currentTimeMillis;
            m().Y(str4, "_vs", j11, bundle4);
        }
        if (z12) {
            F(this.f55077e, true, j12);
        }
        this.f55077e = d4Var3;
        if (d4Var3.f55047e) {
            this.f55082j = d4Var3;
        }
        o().G(d4Var3);
    }

    /* access modifiers changed from: private */
    public final void F(C4595d4 d4Var, boolean z10, long j10) {
        boolean z11;
        j().q(zzb().a());
        if (d4Var == null || !d4Var.f55046d) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (p().z(z11, z10, j10) && d4Var != null) {
            d4Var.f55046d = false;
        }
    }

    static /* synthetic */ void G(C4609f4 f4Var, Bundle bundle, C4595d4 d4Var, C4595d4 d4Var2, long j10) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        f4Var.E(d4Var, d4Var2, j10, true, f4Var.f().A((String) null, "screen_view", bundle, (List) null, false));
    }

    private final C4595d4 O(Activity activity) {
        C4536s.l(activity);
        C4595d4 d4Var = (C4595d4) this.f55078f.get(activity);
        if (d4Var == null) {
            C4595d4 d4Var2 = new C4595d4((String) null, y(activity.getClass(), "Activity"), f().M0());
            this.f55078f.put(activity, d4Var2);
            d4Var = d4Var2;
        }
        if (this.f55081i != null) {
            return this.f55081i;
        }
        return d4Var;
    }

    private final String y(Class cls, String str) {
        String str2;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return str;
        }
        String[] split = canonicalName.split("\\.");
        if (split.length > 0) {
            str2 = split[split.length - 1];
        } else {
            str2 = "";
        }
        if (str2.length() > a().m((String) null, false)) {
            return str2.substring(0, a().m((String) null, false));
        }
        return str2;
    }

    public final void A(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (a().O() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f55078f.put(activity, new C4595d4(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    public final void C(Activity activity, String str, String str2) {
        String str3;
        if (!a().O()) {
            zzj().H().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C4595d4 d4Var = this.f55075c;
        if (d4Var == null) {
            zzj().H().a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f55078f.get(activity) == null) {
            zzj().H().a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = y(activity.getClass(), "Activity");
            }
            boolean equals = Objects.equals(d4Var.f55044b, str2);
            boolean equals2 = Objects.equals(d4Var.f55043a, str);
            if (equals && equals2) {
                zzj().H().a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > a().m((String) null, false))) {
                zzj().H().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= a().m((String) null, false))) {
                X1 F10 = zzj().F();
                if (str == null) {
                    str3 = "null";
                } else {
                    str3 = str;
                }
                F10.c("Setting current screen to name, class", str3, str2);
                C4595d4 d4Var2 = new C4595d4(str, str2, f().M0());
                this.f55078f.put(activity, d4Var2);
                B(activity, d4Var2, true);
            } else {
                zzj().H().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c9, code lost:
        r1 = zzj().F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d3, code lost:
        if (r10 != null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d5, code lost:
        r3 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d8, code lost:
        r3 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d9, code lost:
        if (r11 != null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00db, code lost:
        r4 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00de, code lost:
        r4 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00df, code lost:
        r1.c("Logging screen view with name, class", r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e4, code lost:
        if (r8.f55075c != null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e6, code lost:
        r1 = r8.f55076d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e8, code lost:
        r5 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ea, code lost:
        r1 = r8.f55075c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ed, code lost:
        r9 = new com.google.android.gms.measurement.internal.C4595d4(r10, r11, f().M0(), true, r19);
        r8.f55075c = r9;
        r8.f55076d = r5;
        r8.f55081i = r9;
        zzl().y(new com.google.android.gms.measurement.internal.C4602e4(r17, r18, r9, r5, zzb().a()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D(android.os.Bundle r18, long r19) {
        /*
            r17 = this;
            r8 = r17
            r0 = r18
            java.lang.Object r1 = r8.f55084l
            monitor-enter(r1)
            boolean r2 = r8.f55083k     // Catch:{ all -> 0x001a }
            if (r2 != 0) goto L_0x001d
            com.google.android.gms.measurement.internal.V1 r0 = r17.zzj()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.X1 r0 = r0.H()     // Catch:{ all -> 0x001a }
            java.lang.String r2 = "Cannot log screen view event when the app is in the background."
            r0.a(r2)     // Catch:{ all -> 0x001a }
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            return
        L_0x001a:
            r0 = move-exception
            goto L_0x011e
        L_0x001d:
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x008a
            java.lang.String r4 = "screen_name"
            java.lang.String r4 = r0.getString(r4)     // Catch:{ all -> 0x001a }
            if (r4 == 0) goto L_0x0054
            int r5 = r4.length()     // Catch:{ all -> 0x001a }
            if (r5 <= 0) goto L_0x003d
            int r5 = r4.length()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.h r6 = r17.a()     // Catch:{ all -> 0x001a }
            int r6 = r6.m(r3, r2)     // Catch:{ all -> 0x001a }
            if (r5 <= r6) goto L_0x0054
        L_0x003d:
            com.google.android.gms.measurement.internal.V1 r0 = r17.zzj()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.X1 r0 = r0.H()     // Catch:{ all -> 0x001a }
            java.lang.String r2 = "Invalid screen name length for screen view. Length"
            int r3 = r4.length()     // Catch:{ all -> 0x001a }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x001a }
            r0.b(r2, r3)     // Catch:{ all -> 0x001a }
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            return
        L_0x0054:
            java.lang.String r5 = "screen_class"
            java.lang.String r5 = r0.getString(r5)     // Catch:{ all -> 0x001a }
            if (r5 == 0) goto L_0x0087
            int r6 = r5.length()     // Catch:{ all -> 0x001a }
            if (r6 <= 0) goto L_0x0070
            int r6 = r5.length()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.h r7 = r17.a()     // Catch:{ all -> 0x001a }
            int r3 = r7.m(r3, r2)     // Catch:{ all -> 0x001a }
            if (r6 <= r3) goto L_0x0087
        L_0x0070:
            com.google.android.gms.measurement.internal.V1 r0 = r17.zzj()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.X1 r0 = r0.H()     // Catch:{ all -> 0x001a }
            java.lang.String r2 = "Invalid screen class length for screen view. Length"
            int r3 = r5.length()     // Catch:{ all -> 0x001a }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x001a }
            r0.b(r2, r3)     // Catch:{ all -> 0x001a }
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            return
        L_0x0087:
            r10 = r4
            r3 = r5
            goto L_0x008b
        L_0x008a:
            r10 = r3
        L_0x008b:
            if (r3 != 0) goto L_0x009e
            android.app.Activity r3 = r8.f55079g     // Catch:{ all -> 0x001a }
            if (r3 == 0) goto L_0x009c
            java.lang.Class r3 = r3.getClass()     // Catch:{ all -> 0x001a }
            java.lang.String r4 = "Activity"
            java.lang.String r3 = r8.y(r3, r4)     // Catch:{ all -> 0x001a }
            goto L_0x009e
        L_0x009c:
            java.lang.String r3 = "Activity"
        L_0x009e:
            r11 = r3
            com.google.android.gms.measurement.internal.d4 r3 = r8.f55075c     // Catch:{ all -> 0x001a }
            boolean r4 = r8.f55080h     // Catch:{ all -> 0x001a }
            if (r4 == 0) goto L_0x00c8
            if (r3 == 0) goto L_0x00c8
            r8.f55080h = r2     // Catch:{ all -> 0x001a }
            java.lang.String r2 = r3.f55044b     // Catch:{ all -> 0x001a }
            boolean r2 = java.util.Objects.equals(r2, r11)     // Catch:{ all -> 0x001a }
            java.lang.String r3 = r3.f55043a     // Catch:{ all -> 0x001a }
            boolean r3 = java.util.Objects.equals(r3, r10)     // Catch:{ all -> 0x001a }
            if (r2 == 0) goto L_0x00c8
            if (r3 == 0) goto L_0x00c8
            com.google.android.gms.measurement.internal.V1 r0 = r17.zzj()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.X1 r0 = r0.H()     // Catch:{ all -> 0x001a }
            java.lang.String r2 = "Ignoring call to log screen view event with duplicate parameters."
            r0.a(r2)     // Catch:{ all -> 0x001a }
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            return
        L_0x00c8:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.V1 r1 = r17.zzj()
            com.google.android.gms.measurement.internal.X1 r1 = r1.F()
            java.lang.String r2 = "Logging screen view with name, class"
            if (r10 != 0) goto L_0x00d8
            java.lang.String r3 = "null"
            goto L_0x00d9
        L_0x00d8:
            r3 = r10
        L_0x00d9:
            if (r11 != 0) goto L_0x00de
            java.lang.String r4 = "null"
            goto L_0x00df
        L_0x00de:
            r4 = r11
        L_0x00df:
            r1.c(r2, r3, r4)
            com.google.android.gms.measurement.internal.d4 r1 = r8.f55075c
            if (r1 != 0) goto L_0x00ea
            com.google.android.gms.measurement.internal.d4 r1 = r8.f55076d
        L_0x00e8:
            r5 = r1
            goto L_0x00ed
        L_0x00ea:
            com.google.android.gms.measurement.internal.d4 r1 = r8.f55075c
            goto L_0x00e8
        L_0x00ed:
            com.google.android.gms.measurement.internal.d4 r4 = new com.google.android.gms.measurement.internal.d4
            com.google.android.gms.measurement.internal.B5 r1 = r17.f()
            long r12 = r1.M0()
            r14 = 1
            r9 = r4
            r15 = r19
            r9.<init>(r10, r11, r12, r14, r15)
            r8.f55075c = r4
            r8.f55076d = r5
            r8.f55081i = r4
            Ea.e r1 = r17.zzb()
            long r6 = r1.a()
            com.google.android.gms.measurement.internal.z2 r9 = r17.zzl()
            com.google.android.gms.measurement.internal.e4 r10 = new com.google.android.gms.measurement.internal.e4
            r1 = r10
            r2 = r17
            r3 = r18
            r1.<init>(r2, r3, r4, r5, r6)
            r9.y(r10)
            return
        L_0x011e:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4609f4.D(android.os.Bundle, long):void");
    }

    public final C4595d4 K() {
        return this.f55075c;
    }

    public final void L(Activity activity) {
        synchronized (this.f55084l) {
            this.f55083k = false;
            this.f55080h = true;
        }
        long a10 = zzb().a();
        if (!a().O()) {
            this.f55075c = null;
            zzl().y(new C4637j4(this, a10));
            return;
        }
        C4595d4 O10 = O(activity);
        this.f55076d = this.f55075c;
        this.f55075c = null;
        zzl().y(new C4630i4(this, O10, a10));
    }

    public final void M(Activity activity, Bundle bundle) {
        C4595d4 d4Var;
        if (a().O() && bundle != null && (d4Var = (C4595d4) this.f55078f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", d4Var.f55045c);
            bundle2.putString("name", d4Var.f55043a);
            bundle2.putString("referrer_name", d4Var.f55044b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final void N(Activity activity) {
        synchronized (this.f55084l) {
            this.f55083k = true;
            if (activity != this.f55079g) {
                synchronized (this.f55084l) {
                    this.f55079g = activity;
                    this.f55080h = false;
                }
                if (a().O()) {
                    this.f55081i = null;
                    zzl().y(new C4651l4(this));
                }
            }
        }
        if (!a().O()) {
            this.f55075c = this.f55081i;
            zzl().y(new C4616g4(this));
            return;
        }
        B(activity, O(activity), false);
        C4731z j10 = j();
        j10.zzl().y(new Z(j10, j10.zzb().a()));
    }

    public final /* bridge */ /* synthetic */ C4618h a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ C4713w c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ R1 d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C4614g2 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ B5 f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final /* bridge */ /* synthetic */ C4731z j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ Q1 k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ P1 l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ C4643k3 m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ C4609f4 n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ C4644k4 o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ V4 p() {
        return super.p();
    }

    /* access modifiers changed from: protected */
    public final boolean v() {
        return false;
    }

    public final C4595d4 x(boolean z10) {
        q();
        i();
        if (!z10) {
            return this.f55077e;
        }
        C4595d4 d4Var = this.f55077e;
        if (d4Var != null) {
            return d4Var;
        }
        return this.f55082j;
    }

    public final void z(Activity activity) {
        synchronized (this.f55084l) {
            try {
                if (activity == this.f55079g) {
                    this.f55079g = null;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (a().O()) {
            this.f55078f.remove(activity);
        }
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ C4583c zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ V1 zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ C4734z2 zzl() {
        return super.zzl();
    }
}
