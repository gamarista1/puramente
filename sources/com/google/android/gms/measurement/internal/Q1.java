package com.google.android.gms.measurement.internal;

import Ea.e;
import android.content.Context;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.measurement.internal.C4622h3;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

public final class Q1 extends C4578b1 {

    /* renamed from: c  reason: collision with root package name */
    private String f54820c;

    /* renamed from: d  reason: collision with root package name */
    private String f54821d;

    /* renamed from: e  reason: collision with root package name */
    private int f54822e;

    /* renamed from: f  reason: collision with root package name */
    private String f54823f;

    /* renamed from: g  reason: collision with root package name */
    private long f54824g;

    /* renamed from: h  reason: collision with root package name */
    private long f54825h;

    /* renamed from: i  reason: collision with root package name */
    private List f54826i;

    /* renamed from: j  reason: collision with root package name */
    private String f54827j;

    /* renamed from: k  reason: collision with root package name */
    private int f54828k;

    /* renamed from: l  reason: collision with root package name */
    private String f54829l;

    /* renamed from: m  reason: collision with root package name */
    private String f54830m;

    /* renamed from: n  reason: collision with root package name */
    private String f54831n;

    /* renamed from: o  reason: collision with root package name */
    private long f54832o = 0;

    /* renamed from: p  reason: collision with root package name */
    private String f54833p = null;

    Q1(E2 e22, long j10) {
        super(e22);
        this.f54825h = j10;
    }

    private final String E() {
        if (!zzps.zza() || !a().o(F.f54662n0)) {
            try {
                Class<?> loadClass = zza().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (loadClass == null) {
                    return null;
                }
                try {
                    Object invoke = loadClass.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{zza()});
                    if (invoke == null) {
                        return null;
                    }
                    try {
                        return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", (Class[]) null).invoke(invoke, (Object[]) null);
                    } catch (Exception unused) {
                        zzj().H().a("Failed to retrieve Firebase Instance Id");
                        return null;
                    }
                } catch (Exception unused2) {
                    zzj().I().a("Failed to obtain Firebase Analytics instance");
                    return null;
                }
            } catch (ClassNotFoundException unused3) {
                return null;
            }
        } else {
            zzj().F().a("Disabled IID for tests.");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final String A() {
        q();
        C4536s.l(this.f54820c);
        return this.f54820c;
    }

    /* access modifiers changed from: package-private */
    public final String B() {
        i();
        q();
        C4536s.l(this.f54829l);
        return this.f54829l;
    }

    /* access modifiers changed from: package-private */
    public final List C() {
        return this.f54826i;
    }

    /* access modifiers changed from: package-private */
    public final void D() {
        String str;
        String str2;
        i();
        if (!e().H().m(C4622h3.a.ANALYTICS_STORAGE)) {
            zzj().A().a("Analytics Storage consent is not granted");
            str = null;
        } else {
            byte[] bArr = new byte[16];
            f().R0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
        }
        X1 A10 = zzj().A();
        if (str == null) {
            str2 = "null";
        } else {
            str2 = "not null";
        }
        A10.a(String.format("Resetting session stitching token to %s", new Object[]{str2}));
        this.f54831n = str;
        this.f54832o = zzb().currentTimeMillis();
    }

    /* access modifiers changed from: package-private */
    public final boolean F(String str) {
        boolean z10;
        String str2 = this.f54833p;
        if (str2 == null || str2.equals(str)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f54833p = str;
        return z10;
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
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0186 A[Catch:{ IllegalStateException -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0187 A[Catch:{ IllegalStateException -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0190 A[Catch:{ IllegalStateException -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ac A[Catch:{ IllegalStateException -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0229  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t() {
        /*
            r11 = this;
            android.content.Context r0 = r11.zza()
            java.lang.String r0 = r0.getPackageName()
            android.content.Context r1 = r11.zza()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r2 = 0
            java.lang.String r3 = ""
            java.lang.String r4 = "unknown"
            java.lang.String r5 = "Unknown"
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L_0x002d
            com.google.android.gms.measurement.internal.V1 r7 = r11.zzj()
            com.google.android.gms.measurement.internal.X1 r7 = r7.B()
            java.lang.String r8 = "PackageManager is null, app identity information might be inaccurate. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.V1.q(r0)
            r7.b(r8, r9)
            goto L_0x008c
        L_0x002d:
            java.lang.String r4 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0032 }
            goto L_0x0043
        L_0x0032:
            com.google.android.gms.measurement.internal.V1 r7 = r11.zzj()
            com.google.android.gms.measurement.internal.X1 r7 = r7.B()
            java.lang.String r8 = "Error retrieving app installer package name. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.V1.q(r0)
            r7.b(r8, r9)
        L_0x0043:
            if (r4 != 0) goto L_0x0048
            java.lang.String r4 = "manual_install"
            goto L_0x0051
        L_0x0048:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x0051
            r4 = r3
        L_0x0051:
            android.content.Context r7 = r11.zza()     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0079 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r2)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r7 == 0) goto L_0x008c
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0079 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r9 != 0) goto L_0x0070
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0079 }
            goto L_0x0071
        L_0x0070:
            r8 = r5
        L_0x0071:
            java.lang.String r5 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0076 }
            int r6 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0076 }
            goto L_0x008c
        L_0x0076:
            r7 = r5
            r5 = r8
            goto L_0x007a
        L_0x0079:
            r7 = r5
        L_0x007a:
            com.google.android.gms.measurement.internal.V1 r8 = r11.zzj()
            com.google.android.gms.measurement.internal.X1 r8 = r8.B()
            java.lang.String r9 = "Error retrieving package info. appId, appName"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.V1.q(r0)
            r8.c(r9, r10, r5)
            r5 = r7
        L_0x008c:
            r11.f54820c = r0
            r11.f54823f = r4
            r11.f54821d = r5
            r11.f54822e = r6
            r4 = 0
            r11.f54824g = r4
            com.google.android.gms.measurement.internal.E2 r4 = r11.f55074a
            java.lang.String r4 = r4.H()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r5 = 1
            if (r4 != 0) goto L_0x00b5
            com.google.android.gms.measurement.internal.E2 r4 = r11.f55074a
            java.lang.String r4 = r4.I()
            java.lang.String r6 = "am"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x00b5
            r4 = r5
            goto L_0x00b6
        L_0x00b5:
            r4 = r2
        L_0x00b6:
            com.google.android.gms.measurement.internal.E2 r6 = r11.f55074a
            int r6 = r6.s()
            switch(r6) {
                case 0: goto L_0x014c;
                case 1: goto L_0x013e;
                case 2: goto L_0x0130;
                case 3: goto L_0x0122;
                case 4: goto L_0x0114;
                case 5: goto L_0x0106;
                case 6: goto L_0x00f8;
                case 7: goto L_0x00ea;
                case 8: goto L_0x00db;
                default: goto L_0x00bf;
            }
        L_0x00bf:
            com.google.android.gms.measurement.internal.V1 r7 = r11.zzj()
            com.google.android.gms.measurement.internal.X1 r7 = r7.E()
            java.lang.String r8 = "App measurement disabled"
            r7.a(r8)
            com.google.android.gms.measurement.internal.V1 r7 = r11.zzj()
            com.google.android.gms.measurement.internal.X1 r7 = r7.D()
            java.lang.String r8 = "Invalid scion state in identity"
            r7.a(r8)
            goto L_0x0159
        L_0x00db:
            com.google.android.gms.measurement.internal.V1 r7 = r11.zzj()
            com.google.android.gms.measurement.internal.X1 r7 = r7.E()
            java.lang.String r8 = "App measurement disabled due to denied storage consent"
            r7.a(r8)
            goto L_0x0159
        L_0x00ea:
            com.google.android.gms.measurement.internal.V1 r7 = r11.zzj()
            com.google.android.gms.measurement.internal.X1 r7 = r7.E()
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            r7.a(r8)
            goto L_0x0159
        L_0x00f8:
            com.google.android.gms.measurement.internal.V1 r7 = r11.zzj()
            com.google.android.gms.measurement.internal.X1 r7 = r7.H()
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            r7.a(r8)
            goto L_0x0159
        L_0x0106:
            com.google.android.gms.measurement.internal.V1 r7 = r11.zzj()
            com.google.android.gms.measurement.internal.X1 r7 = r7.F()
            java.lang.String r8 = "App measurement disabled via the init parameters"
            r7.a(r8)
            goto L_0x0159
        L_0x0114:
            com.google.android.gms.measurement.internal.V1 r7 = r11.zzj()
            com.google.android.gms.measurement.internal.X1 r7 = r7.E()
            java.lang.String r8 = "App measurement disabled via the manifest"
            r7.a(r8)
            goto L_0x0159
        L_0x0122:
            com.google.android.gms.measurement.internal.V1 r7 = r11.zzj()
            com.google.android.gms.measurement.internal.X1 r7 = r7.E()
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            r7.a(r8)
            goto L_0x0159
        L_0x0130:
            com.google.android.gms.measurement.internal.V1 r7 = r11.zzj()
            com.google.android.gms.measurement.internal.X1 r7 = r7.F()
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            r7.a(r8)
            goto L_0x0159
        L_0x013e:
            com.google.android.gms.measurement.internal.V1 r7 = r11.zzj()
            com.google.android.gms.measurement.internal.X1 r7 = r7.E()
            java.lang.String r8 = "App measurement deactivated via the manifest"
            r7.a(r8)
            goto L_0x0159
        L_0x014c:
            com.google.android.gms.measurement.internal.V1 r7 = r11.zzj()
            com.google.android.gms.measurement.internal.X1 r7 = r7.F()
            java.lang.String r8 = "App measurement collection enabled"
            r7.a(r8)
        L_0x0159:
            if (r6 != 0) goto L_0x015c
            goto L_0x015d
        L_0x015c:
            r5 = r2
        L_0x015d:
            r11.f54829l = r3
            r11.f54830m = r3
            if (r4 == 0) goto L_0x016b
            com.google.android.gms.measurement.internal.E2 r4 = r11.f55074a
            java.lang.String r4 = r4.H()
            r11.f54830m = r4
        L_0x016b:
            android.content.Context r4 = r11.zza()     // Catch:{ IllegalStateException -> 0x01a8 }
            com.google.android.gms.measurement.internal.E2 r6 = r11.f55074a     // Catch:{ IllegalStateException -> 0x01a8 }
            java.lang.String r6 = r6.K()     // Catch:{ IllegalStateException -> 0x01a8 }
            java.lang.String r7 = "google_app_id"
            Pa.m r8 = new Pa.m     // Catch:{ IllegalStateException -> 0x01a8 }
            r8.<init>(r4, r6)     // Catch:{ IllegalStateException -> 0x01a8 }
            java.lang.String r4 = r8.b(r7)     // Catch:{ IllegalStateException -> 0x01a8 }
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch:{ IllegalStateException -> 0x01a8 }
            if (r6 == 0) goto L_0x0187
            goto L_0x0188
        L_0x0187:
            r3 = r4
        L_0x0188:
            r11.f54829l = r3     // Catch:{ IllegalStateException -> 0x01a8 }
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch:{ IllegalStateException -> 0x01a8 }
            if (r3 != 0) goto L_0x01aa
            Pa.m r3 = new Pa.m     // Catch:{ IllegalStateException -> 0x01a8 }
            android.content.Context r4 = r11.zza()     // Catch:{ IllegalStateException -> 0x01a8 }
            com.google.android.gms.measurement.internal.E2 r6 = r11.f55074a     // Catch:{ IllegalStateException -> 0x01a8 }
            java.lang.String r6 = r6.K()     // Catch:{ IllegalStateException -> 0x01a8 }
            r3.<init>(r4, r6)     // Catch:{ IllegalStateException -> 0x01a8 }
            java.lang.String r4 = "admob_app_id"
            java.lang.String r3 = r3.b(r4)     // Catch:{ IllegalStateException -> 0x01a8 }
            r11.f54830m = r3     // Catch:{ IllegalStateException -> 0x01a8 }
            goto L_0x01aa
        L_0x01a8:
            r3 = move-exception
            goto L_0x01c9
        L_0x01aa:
            if (r5 == 0) goto L_0x01da
            com.google.android.gms.measurement.internal.V1 r3 = r11.zzj()     // Catch:{ IllegalStateException -> 0x01a8 }
            com.google.android.gms.measurement.internal.X1 r3 = r3.F()     // Catch:{ IllegalStateException -> 0x01a8 }
            java.lang.String r4 = "App measurement enabled for app package, google app id"
            java.lang.String r5 = r11.f54820c     // Catch:{ IllegalStateException -> 0x01a8 }
            java.lang.String r6 = r11.f54829l     // Catch:{ IllegalStateException -> 0x01a8 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x01a8 }
            if (r6 == 0) goto L_0x01c3
            java.lang.String r6 = r11.f54830m     // Catch:{ IllegalStateException -> 0x01a8 }
            goto L_0x01c5
        L_0x01c3:
            java.lang.String r6 = r11.f54829l     // Catch:{ IllegalStateException -> 0x01a8 }
        L_0x01c5:
            r3.c(r4, r5, r6)     // Catch:{ IllegalStateException -> 0x01a8 }
            goto L_0x01da
        L_0x01c9:
            com.google.android.gms.measurement.internal.V1 r4 = r11.zzj()
            com.google.android.gms.measurement.internal.X1 r4 = r4.B()
            java.lang.String r5 = "Fetching Google App Id failed with exception. appId"
            java.lang.Object r0 = com.google.android.gms.measurement.internal.V1.q(r0)
            r4.c(r5, r0, r3)
        L_0x01da:
            r0 = 0
            r11.f54826i = r0
            com.google.android.gms.measurement.internal.h r0 = r11.a()
            java.lang.String r3 = "analytics.safelisted_events"
            java.util.List r0 = r0.D(r3)
            if (r0 == 0) goto L_0x021a
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x01fd
            com.google.android.gms.measurement.internal.V1 r0 = r11.zzj()
            com.google.android.gms.measurement.internal.X1 r0 = r0.H()
            java.lang.String r3 = "Safelisted event list is empty. Ignoring"
            r0.a(r3)
            goto L_0x021c
        L_0x01fd:
            java.util.Iterator r3 = r0.iterator()
        L_0x0201:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x021a
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.gms.measurement.internal.B5 r5 = r11.f()
            java.lang.String r6 = "safelisted event"
            boolean r4 = r5.r0(r6, r4)
            if (r4 != 0) goto L_0x0201
            goto L_0x021c
        L_0x021a:
            r11.f54826i = r0
        L_0x021c:
            if (r1 == 0) goto L_0x0229
            android.content.Context r0 = r11.zza()
            boolean r0 = Ga.C4290b.a(r0)
            r11.f54828k = r0
            return
        L_0x0229:
            r11.f54828k = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Q1.t():void");
    }

    /* access modifiers changed from: protected */
    public final boolean v() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.E5 w(java.lang.String r49) {
        /*
            r48 = this;
            r0 = r48
            r48.i()
            com.google.android.gms.measurement.internal.E5 r42 = new com.google.android.gms.measurement.internal.E5
            java.lang.String r2 = r48.A()
            java.lang.String r3 = r48.B()
            r48.q()
            java.lang.String r4 = r0.f54821d
            int r1 = r48.y()
            long r5 = (long) r1
            r48.q()
            java.lang.String r1 = r0.f54823f
            com.google.android.gms.common.internal.C4536s.l(r1)
            java.lang.String r7 = r0.f54823f
            r48.q()
            r48.i()
            long r8 = r0.f54824g
            r10 = 0
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            com.google.android.gms.measurement.internal.E2 r1 = r0.f55074a
            com.google.android.gms.measurement.internal.B5 r1 = r1.G()
            android.content.Context r8 = r48.zza()
            android.content.Context r9 = r48.zza()
            java.lang.String r9 = r9.getPackageName()
            long r8 = r1.u(r8, r9)
            r0.f54824g = r8
        L_0x0049:
            long r12 = r0.f54824g
            com.google.android.gms.measurement.internal.E2 r1 = r0.f55074a
            boolean r14 = r1.k()
            com.google.android.gms.measurement.internal.g2 r1 = r48.e()
            boolean r1 = r1.f55106t
            r8 = 1
            r15 = r1 ^ 1
            r48.i()
            com.google.android.gms.measurement.internal.E2 r1 = r0.f55074a
            boolean r1 = r1.k()
            if (r1 != 0) goto L_0x0068
            r18 = 0
            goto L_0x006e
        L_0x0068:
            java.lang.String r1 = r48.E()
            r18 = r1
        L_0x006e:
            com.google.android.gms.measurement.internal.E2 r1 = r0.f55074a
            com.google.android.gms.measurement.internal.g2 r9 = r1.A()
            com.google.android.gms.measurement.internal.l2 r9 = r9.f55093g
            long r8 = r9.a()
            int r19 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r19 != 0) goto L_0x0083
            long r8 = r1.f54513H
        L_0x0080:
            r21 = r8
            goto L_0x008a
        L_0x0083:
            long r10 = r1.f54513H
            long r8 = java.lang.Math.min(r10, r8)
            goto L_0x0080
        L_0x008a:
            int r23 = r48.x()
            com.google.android.gms.measurement.internal.h r1 = r48.a()
            boolean r24 = r1.N()
            com.google.android.gms.measurement.internal.g2 r1 = r48.e()
            r1.i()
            android.content.SharedPreferences r1 = r1.E()
            java.lang.String r8 = "deferred_analytics_collection"
            r9 = 0
            boolean r25 = r1.getBoolean(r8, r9)
            java.lang.String r26 = r48.z()
            com.google.android.gms.measurement.internal.h r1 = r48.a()
            java.lang.String r8 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r1 = r1.y(r8)
            if (r1 != 0) goto L_0x00bb
            r27 = 0
            goto L_0x00c7
        L_0x00bb:
            boolean r1 = r1.booleanValue()
            r10 = 1
            r1 = r1 ^ r10
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r27 = r1
        L_0x00c7:
            long r10 = r0.f54825h
            java.util.List r1 = r0.f54826i
            com.google.android.gms.measurement.internal.g2 r28 = r48.e()
            com.google.android.gms.measurement.internal.h3 r28 = r28.H()
            java.lang.String r29 = r28.z()
            java.lang.String r9 = r0.f54827j
            if (r9 != 0) goto L_0x00e5
            com.google.android.gms.measurement.internal.B5 r9 = r48.f()
            java.lang.String r9 = r9.P0()
            r0.f54827j = r9
        L_0x00e5:
            java.lang.String r9 = r0.f54827j
            boolean r30 = com.google.android.gms.internal.measurement.zznk.zza()
            if (r30 == 0) goto L_0x0118
            r30 = r1
            com.google.android.gms.measurement.internal.h r1 = r48.a()
            r31 = r9
            com.google.android.gms.measurement.internal.M1 r9 = com.google.android.gms.measurement.internal.F.f54626V0
            boolean r1 = r1.o(r9)
            if (r1 == 0) goto L_0x011c
            com.google.android.gms.measurement.internal.g2 r1 = r48.e()
            com.google.android.gms.measurement.internal.h3 r1 = r1.H()
            com.google.android.gms.measurement.internal.h3$a r9 = com.google.android.gms.measurement.internal.C4622h3.a.ANALYTICS_STORAGE
            boolean r1 = r1.m(r9)
            if (r1 != 0) goto L_0x011c
            r32 = r10
            r34 = r14
            r35 = r15
            r19 = 0
            r36 = 0
            goto L_0x015a
        L_0x0118:
            r30 = r1
            r31 = r9
        L_0x011c:
            r48.i()
            r32 = r10
            long r9 = r0.f54832o
            r19 = 0
            int r1 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r1 == 0) goto L_0x014b
            Ea.e r1 = r48.zzb()
            long r9 = r1.currentTimeMillis()
            r34 = r14
            r35 = r15
            long r14 = r0.f54832o
            long r9 = r9 - r14
            java.lang.String r1 = r0.f54831n
            if (r1 == 0) goto L_0x014f
            r14 = 86400000(0x5265c00, double:4.2687272E-316)
            int r1 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x014f
            java.lang.String r1 = r0.f54833p
            if (r1 != 0) goto L_0x014f
            r48.D()
            goto L_0x014f
        L_0x014b:
            r34 = r14
            r35 = r15
        L_0x014f:
            java.lang.String r1 = r0.f54831n
            if (r1 != 0) goto L_0x0156
            r48.D()
        L_0x0156:
            java.lang.String r1 = r0.f54831n
            r36 = r1
        L_0x015a:
            com.google.android.gms.measurement.internal.h r1 = r48.a()
            java.lang.String r9 = "google_analytics_sgtm_upload_enabled"
            java.lang.Boolean r1 = r1.y(r9)
            if (r1 != 0) goto L_0x0169
            r37 = 0
            goto L_0x016f
        L_0x0169:
            boolean r1 = r1.booleanValue()
            r37 = r1
        L_0x016f:
            com.google.android.gms.measurement.internal.B5 r1 = r48.f()
            java.lang.String r9 = r48.A()
            long r38 = r1.u0(r9)
            com.google.android.gms.measurement.internal.g2 r1 = r48.e()
            com.google.android.gms.measurement.internal.h3 r1 = r1.H()
            int r40 = r1.b()
            com.google.android.gms.measurement.internal.g2 r1 = r48.e()
            com.google.android.gms.measurement.internal.u r1 = r1.G()
            java.lang.String r41 = r1.j()
            boolean r1 = com.google.android.gms.internal.measurement.zzpg.zza()
            if (r1 == 0) goto L_0x01af
            com.google.android.gms.measurement.internal.h r1 = r48.a()
            com.google.android.gms.measurement.internal.M1 r9 = com.google.android.gms.measurement.internal.F.f54586B0
            boolean r1 = r1.o(r9)
            if (r1 == 0) goto L_0x01af
            r48.f()
            int r1 = com.google.android.gms.measurement.internal.B5.t0()
            r43 = r1
            goto L_0x01b1
        L_0x01af:
            r43 = 0
        L_0x01b1:
            boolean r1 = com.google.android.gms.internal.measurement.zzpg.zza()
            if (r1 == 0) goto L_0x01ce
            com.google.android.gms.measurement.internal.h r1 = r48.a()
            com.google.android.gms.measurement.internal.M1 r9 = com.google.android.gms.measurement.internal.F.f54586B0
            boolean r1 = r1.o(r9)
            if (r1 == 0) goto L_0x01ce
            com.google.android.gms.measurement.internal.B5 r1 = r48.f()
            long r9 = r1.F0()
            r44 = r9
            goto L_0x01d0
        L_0x01ce:
            r44 = r19
        L_0x01d0:
            com.google.android.gms.measurement.internal.h r1 = r48.a()
            java.lang.String r46 = r1.M()
            boolean r1 = com.google.android.gms.internal.measurement.zzne.zza()
            if (r1 == 0) goto L_0x01ff
            com.google.android.gms.measurement.internal.h r1 = r48.a()
            com.google.android.gms.measurement.internal.M1 r9 = com.google.android.gms.measurement.internal.F.f54618R0
            boolean r1 = r1.o(r9)
            if (r1 == 0) goto L_0x01ff
            com.google.android.gms.measurement.internal.h r1 = r48.a()
            r9 = 1
            Pa.o r1 = r1.v(r8, r9)
            com.google.android.gms.measurement.internal.h2 r8 = new com.google.android.gms.measurement.internal.h2
            r8.<init>(r1)
            java.lang.String r1 = r8.c()
        L_0x01fc:
            r47 = r1
            goto L_0x0202
        L_0x01ff:
            java.lang.String r1 = ""
            goto L_0x01fc
        L_0x0202:
            r8 = 97001(0x17ae9, double:4.7925E-319)
            r16 = 0
            r28 = 0
            r1 = r42
            r10 = r12
            r12 = r49
            r13 = r34
            r14 = r35
            r15 = r18
            r18 = r21
            r20 = r23
            r21 = r24
            r22 = r25
            r23 = r26
            r24 = r27
            r25 = r32
            r27 = r30
            r30 = r31
            r31 = r36
            r32 = r37
            r33 = r38
            r35 = r40
            r36 = r41
            r37 = r43
            r38 = r44
            r40 = r46
            r41 = r47
            r1.<init>((java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4, (long) r5, (java.lang.String) r7, (long) r8, (long) r10, (java.lang.String) r12, (boolean) r13, (boolean) r14, (java.lang.String) r15, (long) r16, (long) r18, (int) r20, (boolean) r21, (boolean) r22, (java.lang.String) r23, (java.lang.Boolean) r24, (long) r25, (java.util.List) r27, (java.lang.String) r28, (java.lang.String) r29, (java.lang.String) r30, (java.lang.String) r31, (boolean) r32, (long) r33, (int) r35, (java.lang.String) r36, (int) r37, (long) r38, (java.lang.String) r40, (java.lang.String) r41)
            return r42
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Q1.w(java.lang.String):com.google.android.gms.measurement.internal.E5");
    }

    /* access modifiers changed from: package-private */
    public final int x() {
        q();
        return this.f54828k;
    }

    /* access modifiers changed from: package-private */
    public final int y() {
        q();
        return this.f54822e;
    }

    /* access modifiers changed from: package-private */
    public final String z() {
        q();
        return this.f54830m;
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
