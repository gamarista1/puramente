package com.google.android.gms.measurement.internal;

import Ea.e;
import Ea.o;
import Ga.C4293e;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.a.a.o.b;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.internal.measurement.zzou;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.measurement.internal.h  reason: case insensitive filesystem */
public final class C4618h extends C4608f3 {

    /* renamed from: b  reason: collision with root package name */
    private Boolean f55114b;

    /* renamed from: c  reason: collision with root package name */
    private String f55115c;

    /* renamed from: d  reason: collision with root package name */
    private C4632j f55116d = new C4611g();

    /* renamed from: e  reason: collision with root package name */
    private Boolean f55117e;

    C4618h(E2 e22) {
        super(e22);
    }

    public static long E() {
        return ((Long) F.f54643e.a((Object) null)).longValue();
    }

    public static long J() {
        return ((Long) F.f54591E.a((Object) null)).longValue();
    }

    private final Bundle S() {
        try {
            if (zza().getPackageManager() == null) {
                zzj().B().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c10 = C4293e.a(zza()).c(zza().getPackageName(), 128);
            if (c10 != null) {
                return c10.metaData;
            }
            zzj().B().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            zzj().B().b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    private final String b(String str, String str2) {
        Class<String> cls = String.class;
        try {
            String str3 = (String) Class.forName(b.at).getMethod(b.au, new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, str2});
            C4536s.l(str3);
            return str3;
        } catch (ClassNotFoundException e10) {
            zzj().B().b("Could not find SystemProperties class", e10);
            return str2;
        } catch (NoSuchMethodException e11) {
            zzj().B().b("Could not find SystemProperties.get() method", e11);
            return str2;
        } catch (IllegalAccessException e12) {
            zzj().B().b("Could not access SystemProperties.get()", e12);
            return str2;
        } catch (InvocationTargetException e13) {
            zzj().B().b("SystemProperties.get() threw an exception", e13);
            return str2;
        }
    }

    /* access modifiers changed from: package-private */
    public final String A(String str) {
        return x(str, F.f54607M);
    }

    public final boolean B(String str, M1 m12) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) m12.a((Object) null)).booleanValue();
        }
        String b10 = this.f55116d.b(str, m12.b());
        if (TextUtils.isEmpty(b10)) {
            return ((Boolean) m12.a((Object) null)).booleanValue();
        }
        return ((Boolean) m12.a(Boolean.valueOf("1".equals(b10)))).booleanValue();
    }

    public final int C() {
        if (f().X(201500000, true)) {
            return 100;
        }
        return 25;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b A[SYNTHETIC, Splitter:B:9:0x002b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List D(java.lang.String r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.C4536s.f(r4)
            android.os.Bundle r0 = r3.S()
            r1 = 0
            if (r0 != 0) goto L_0x0019
            com.google.android.gms.measurement.internal.V1 r4 = r3.zzj()
            com.google.android.gms.measurement.internal.X1 r4 = r4.B()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L_0x0017:
            r4 = r1
            goto L_0x0028
        L_0x0019:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0020
            goto L_0x0017
        L_0x0020:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0028:
            if (r4 != 0) goto L_0x002b
            return r1
        L_0x002b:
            android.content.Context r0 = r3.zza()     // Catch:{ NotFoundException -> 0x0043 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0043 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0043 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0043 }
            if (r4 != 0) goto L_0x003e
            return r1
        L_0x003e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            com.google.android.gms.measurement.internal.V1 r0 = r3.zzj()
            com.google.android.gms.measurement.internal.X1 r0 = r0.B()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4618h.D(java.lang.String):java.util.List");
    }

    public final void F(String str) {
        this.f55115c = str;
    }

    /* access modifiers changed from: package-private */
    public final boolean G(String str) {
        return B(str, F.f54605L);
    }

    public final boolean H(String str) {
        return "1".equals(this.f55116d.b(str, "gaia_collection_enabled"));
    }

    public final boolean I(String str) {
        return "1".equals(this.f55116d.b(str, "measurement.event_sampling_enabled"));
    }

    public final String K() {
        return b("debug.firebase.analytics.app", "");
    }

    public final String L() {
        return b("debug.deferred.deeplink", "");
    }

    public final String M() {
        return this.f55115c;
    }

    public final boolean N() {
        Boolean y10 = y("google_analytics_adid_collection_enabled");
        if (y10 == null || y10.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean O() {
        Boolean y10 = y("google_analytics_automatic_screen_reporting_enabled");
        if (y10 == null || y10.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean P() {
        Boolean y10 = y("firebase_analytics_collection_deactivated");
        if (y10 == null || !y10.booleanValue()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean Q() {
        if (this.f55114b == null) {
            Boolean y10 = y("app_measurement_lite");
            this.f55114b = y10;
            if (y10 == null) {
                this.f55114b = Boolean.FALSE;
            }
        }
        if (this.f55114b.booleanValue() || !this.f55074a.o()) {
            return true;
        }
        return false;
    }

    public final boolean R() {
        boolean z10;
        if (this.f55117e == null) {
            synchronized (this) {
                try {
                    if (this.f55117e == null) {
                        ApplicationInfo applicationInfo = zza().getApplicationInfo();
                        String a10 = o.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            if (str == null || !str.equals(a10)) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            this.f55117e = Boolean.valueOf(z10);
                        }
                        if (this.f55117e == null) {
                            this.f55117e = Boolean.TRUE;
                            zzj().B().a("My process not in the list of running processes");
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f55117e.booleanValue();
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

    public final double j(String str, M1 m12) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) m12.a((Object) null)).doubleValue();
        }
        String b10 = this.f55116d.b(str, m12.b());
        if (TextUtils.isEmpty(b10)) {
            return ((Double) m12.a((Object) null)).doubleValue();
        }
        try {
            return ((Double) m12.a(Double.valueOf(Double.parseDouble(b10)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) m12.a((Object) null)).doubleValue();
        }
    }

    /* access modifiers changed from: package-private */
    public final int k(String str) {
        return l(str, F.f54599I, 500, 2000);
    }

    public final int l(String str, M1 m12, int i10, int i11) {
        return Math.max(Math.min(q(str, m12), i11), i10);
    }

    /* access modifiers changed from: package-private */
    public final int m(String str, boolean z10) {
        if (!zzop.zza() || !a().B((String) null, F.f54612O0)) {
            return 100;
        }
        if (z10) {
            return l(str, F.f54619S, 100, 500);
        }
        return 500;
    }

    /* access modifiers changed from: package-private */
    public final void n(C4632j jVar) {
        this.f55116d = jVar;
    }

    public final boolean o(M1 m12) {
        return B((String) null, m12);
    }

    public final int p(String str) {
        return l(str, F.f54601J, 25, 100);
    }

    public final int q(String str, M1 m12) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) m12.a((Object) null)).intValue();
        }
        String b10 = this.f55116d.b(str, m12.b());
        if (TextUtils.isEmpty(b10)) {
            return ((Integer) m12.a((Object) null)).intValue();
        }
        try {
            return ((Integer) m12.a(Integer.valueOf(Integer.parseInt(b10)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) m12.a((Object) null)).intValue();
        }
    }

    /* access modifiers changed from: package-private */
    public final int r(String str, boolean z10) {
        return Math.max(m(str, z10), 256);
    }

    /* access modifiers changed from: package-private */
    public final int s() {
        if (!zzou.zza() || !a().B((String) null, F.f54684y0) || !f().X(231100000, true)) {
            return 0;
        }
        return 35;
    }

    public final int t(String str) {
        return q(str, F.f54665p);
    }

    public final long u(String str, M1 m12) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) m12.a((Object) null)).longValue();
        }
        String b10 = this.f55116d.b(str, m12.b());
        if (TextUtils.isEmpty(b10)) {
            return ((Long) m12.a((Object) null)).longValue();
        }
        try {
            return ((Long) m12.a(Long.valueOf(Long.parseLong(b10)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) m12.a((Object) null)).longValue();
        }
    }

    public final Pa.o v(String str, boolean z10) {
        Object obj;
        C4536s.f(str);
        Bundle S10 = S();
        if (S10 == null) {
            zzj().B().a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = S10.get(str);
        }
        if (obj == null) {
            return Pa.o.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return Pa.o.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return Pa.o.DENIED;
        }
        if (z10 && "eu_consent_policy".equals(obj)) {
            return Pa.o.POLICY;
        }
        zzj().G().b("Invalid manifest metadata for", str);
        return Pa.o.UNINITIALIZED;
    }

    /* access modifiers changed from: package-private */
    public final long w(String str) {
        return u(str, F.f54637b);
    }

    public final String x(String str, M1 m12) {
        if (TextUtils.isEmpty(str)) {
            return (String) m12.a((Object) null);
        }
        return (String) m12.a(this.f55116d.b(str, m12.b()));
    }

    /* access modifiers changed from: package-private */
    public final Boolean y(String str) {
        C4536s.f(str);
        Bundle S10 = S();
        if (S10 == null) {
            zzj().B().a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!S10.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(S10.getBoolean(str));
        }
    }

    public final boolean z(String str, M1 m12) {
        return B(str, m12);
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
