package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.measurement.internal.C4622h3;

/* renamed from: com.google.android.gms.measurement.internal.g2  reason: case insensitive filesystem */
final class C4614g2 extends C4601e3 {

    /* renamed from: B  reason: collision with root package name */
    static final Pair f55087B = new Pair("", 0L);

    /* renamed from: A  reason: collision with root package name */
    public final C4628i2 f55088A = new C4628i2(this, "default_event_parameters", (Bundle) null);

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f55089c;

    /* renamed from: d  reason: collision with root package name */
    private Object f55090d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private SharedPreferences f55091e;

    /* renamed from: f  reason: collision with root package name */
    public C4642k2 f55092f;

    /* renamed from: g  reason: collision with root package name */
    public final C4649l2 f55093g = new C4649l2(this, "first_open_time", 0);

    /* renamed from: h  reason: collision with root package name */
    public final C4649l2 f55094h = new C4649l2(this, "app_install_time", 0);

    /* renamed from: i  reason: collision with root package name */
    public final C4656m2 f55095i = new C4656m2(this, "app_instance_id", (String) null);

    /* renamed from: j  reason: collision with root package name */
    private String f55096j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f55097k;

    /* renamed from: l  reason: collision with root package name */
    private long f55098l;

    /* renamed from: m  reason: collision with root package name */
    public final C4649l2 f55099m = new C4649l2(this, "session_timeout", 1800000);

    /* renamed from: n  reason: collision with root package name */
    public final C4635j2 f55100n = new C4635j2(this, "start_new_session", true);

    /* renamed from: o  reason: collision with root package name */
    public final C4656m2 f55101o = new C4656m2(this, "non_personalized_ads", (String) null);

    /* renamed from: p  reason: collision with root package name */
    public final C4628i2 f55102p = new C4628i2(this, "last_received_uri_timestamps_by_source", (Bundle) null);

    /* renamed from: q  reason: collision with root package name */
    public final C4635j2 f55103q = new C4635j2(this, "allow_remote_dynamite", false);

    /* renamed from: r  reason: collision with root package name */
    public final C4649l2 f55104r = new C4649l2(this, "last_pause_time", 0);

    /* renamed from: s  reason: collision with root package name */
    public final C4649l2 f55105s = new C4649l2(this, "session_id", 0);

    /* renamed from: t  reason: collision with root package name */
    public boolean f55106t;

    /* renamed from: u  reason: collision with root package name */
    public C4635j2 f55107u = new C4635j2(this, "app_backgrounded", false);

    /* renamed from: v  reason: collision with root package name */
    public C4635j2 f55108v = new C4635j2(this, "deep_link_retrieval_complete", false);

    /* renamed from: w  reason: collision with root package name */
    public C4649l2 f55109w = new C4649l2(this, "deep_link_retrieval_attempts", 0);

    /* renamed from: x  reason: collision with root package name */
    public final C4656m2 f55110x = new C4656m2(this, "firebase_feature_rollouts", (String) null);

    /* renamed from: y  reason: collision with root package name */
    public final C4656m2 f55111y = new C4656m2(this, "deferred_attribution_cache", (String) null);

    /* renamed from: z  reason: collision with root package name */
    public final C4649l2 f55112z = new C4649l2(this, "deferred_attribution_cache_timestamp", 0);

    C4614g2(E2 e22) {
        super(e22);
    }

    /* access modifiers changed from: package-private */
    public final void A(String str) {
        i();
        SharedPreferences.Editor edit = E().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final void B(boolean z10) {
        i();
        zzj().F().b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor edit = E().edit();
        edit.putBoolean("deferred_analytics_collection", z10);
        edit.apply();
    }

    /* access modifiers changed from: protected */
    public final SharedPreferences C() {
        i();
        k();
        if (this.f55091e == null) {
            synchronized (this.f55090d) {
                try {
                    if (this.f55091e == null) {
                        String str = zza().getPackageName() + "_preferences";
                        zzj().F().b("Default prefs file", str);
                        this.f55091e = zza().getSharedPreferences(str, 0);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f55091e;
    }

    /* access modifiers changed from: package-private */
    public final void D(String str) {
        i();
        SharedPreferences.Editor edit = E().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: protected */
    public final SharedPreferences E() {
        i();
        k();
        C4536s.l(this.f55089c);
        return this.f55089c;
    }

    /* access modifiers changed from: package-private */
    public final SparseArray F() {
        Bundle a10 = this.f55102p.a();
        if (a10 == null) {
            return new SparseArray();
        }
        int[] intArray = a10.getIntArray("uriSources");
        long[] longArray = a10.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            zzj().B().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    /* access modifiers changed from: package-private */
    public final C4701u G() {
        i();
        return C4701u.d(E().getString("dma_consent_settings", (String) null));
    }

    /* access modifiers changed from: package-private */
    public final C4622h3 H() {
        i();
        return C4622h3.i(E().getString("consent_settings", "G1"), E().getInt("consent_source", 100));
    }

    /* access modifiers changed from: package-private */
    public final Boolean I() {
        i();
        if (!E().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(E().getBoolean("use_service", false));
    }

    /* access modifiers changed from: package-private */
    public final Boolean J() {
        i();
        if (E().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(E().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final Boolean K() {
        i();
        if (E().contains("measurement_enabled")) {
            return Boolean.valueOf(E().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final String L() {
        i();
        String string = E().getString("previous_os_version", (String) null);
        c().k();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = E().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* access modifiers changed from: package-private */
    public final String M() {
        i();
        return E().getString("admob_app_id", (String) null);
    }

    /* access modifiers changed from: package-private */
    public final String N() {
        i();
        return E().getString("gmp_app_id", (String) null);
    }

    /* access modifiers changed from: package-private */
    public final void O() {
        i();
        Boolean K10 = K();
        SharedPreferences.Editor edit = E().edit();
        edit.clear();
        edit.apply();
        if (K10 != null) {
            r(K10);
        }
    }

    /* access modifiers changed from: protected */
    public final void j() {
        SharedPreferences sharedPreferences = zza().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f55089c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f55106t = z10;
        if (!z10) {
            SharedPreferences.Editor edit = this.f55089c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f55092f = new C4642k2(this, "health_monitor", Math.max(0, ((Long) F.f54641d.a((Object) null)).longValue()));
    }

    /* access modifiers changed from: protected */
    public final boolean o() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Pair p(String str) {
        i();
        if (!H().m(C4622h3.a.AD_STORAGE)) {
            return new Pair("", Boolean.FALSE);
        }
        long a10 = zzb().a();
        if (this.f55096j != null && a10 < this.f55098l) {
            return new Pair(this.f55096j, Boolean.valueOf(this.f55097k));
        }
        this.f55098l = a10 + a().w(str);
        AdvertisingIdClient.a(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zza());
            this.f55096j = "";
            String id2 = advertisingIdInfo.getId();
            if (id2 != null) {
                this.f55096j = id2;
            }
            this.f55097k = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e10) {
            zzj().A().b("Unable to get advertising id", e10);
            this.f55096j = "";
        }
        AdvertisingIdClient.a(false);
        return new Pair(this.f55096j, Boolean.valueOf(this.f55097k));
    }

    /* access modifiers changed from: package-private */
    public final void q(SparseArray sparseArray) {
        if (sparseArray == null) {
            this.f55102p.b((Bundle) null);
            return;
        }
        int[] iArr = new int[sparseArray.size()];
        long[] jArr = new long[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            iArr[i10] = sparseArray.keyAt(i10);
            jArr[i10] = ((Long) sparseArray.valueAt(i10)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        this.f55102p.b(bundle);
    }

    /* access modifiers changed from: package-private */
    public final void r(Boolean bool) {
        i();
        SharedPreferences.Editor edit = E().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final void s(boolean z10) {
        i();
        SharedPreferences.Editor edit = E().edit();
        edit.putBoolean("use_service", z10);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final boolean t(int i10) {
        return C4622h3.l(i10, E().getInt("consent_source", 100));
    }

    /* access modifiers changed from: package-private */
    public final boolean u(long j10) {
        if (j10 - this.f55099m.a() > this.f55104r.a()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean v(C4701u uVar) {
        i();
        if (!C4622h3.l(uVar.a(), G().a())) {
            return false;
        }
        SharedPreferences.Editor edit = E().edit();
        edit.putString("dma_consent_settings", uVar.j());
        edit.apply();
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean w(C4622h3 h3Var) {
        i();
        int b10 = h3Var.b();
        if (!t(b10)) {
            return false;
        }
        SharedPreferences.Editor edit = E().edit();
        edit.putString("consent_settings", h3Var.z());
        edit.putInt("consent_source", b10);
        edit.apply();
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean x(C4610f5 f5Var) {
        i();
        String string = E().getString("stored_tcf_param", "");
        String g10 = f5Var.g();
        if (g10.equals(string)) {
            return false;
        }
        SharedPreferences.Editor edit = E().edit();
        edit.putString("stored_tcf_param", g10);
        edit.apply();
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean y() {
        SharedPreferences sharedPreferences = this.f55089c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: package-private */
    public final void z(Boolean bool) {
        i();
        SharedPreferences.Editor edit = E().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled_from_api");
        }
        edit.apply();
    }
}
