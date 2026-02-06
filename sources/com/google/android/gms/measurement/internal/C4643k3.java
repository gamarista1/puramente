package com.google.android.gms.measurement.internal;

import Ea.e;
import Ea.f;
import Ea.p;
import Pa.C4378a;
import Pa.m;
import Pa.n;
import Pa.o;
import Pa.q;
import Pa.r;
import Pa.s;
import Pa.t;
import Pa.v;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.collection.C1587a;
import com.amazon.a.a.o.b;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdg;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.measurement.zznk;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.measurement.internal.C4622h3;
import com.google.common.util.concurrent.d;
import com.google.common.util.concurrent.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import q3.C2432a;

/* renamed from: com.google.android.gms.measurement.internal.k3  reason: case insensitive filesystem */
public final class C4643k3 extends C4578b1 {

    /* renamed from: c  reason: collision with root package name */
    private X3 f55186c;

    /* renamed from: d  reason: collision with root package name */
    private r f55187d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f55188e = new CopyOnWriteArraySet();

    /* renamed from: f  reason: collision with root package name */
    private boolean f55189f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicReference f55190g = new AtomicReference();

    /* renamed from: h  reason: collision with root package name */
    private final Object f55191h = new Object();
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public boolean f55192i = false;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public int f55193j = 1;

    /* renamed from: k  reason: collision with root package name */
    private C4689s f55194k;

    /* renamed from: l  reason: collision with root package name */
    private PriorityQueue f55195l;

    /* renamed from: m  reason: collision with root package name */
    private C4622h3 f55196m = C4622h3.f55119c;

    /* renamed from: n  reason: collision with root package name */
    private final AtomicLong f55197n = new AtomicLong(0);

    /* renamed from: o  reason: collision with root package name */
    private long f55198o = -1;

    /* renamed from: p  reason: collision with root package name */
    final G5 f55199p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f55200q = true;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public C4689s f55201r;

    /* renamed from: s  reason: collision with root package name */
    private SharedPreferences.OnSharedPreferenceChangeListener f55202s;

    /* renamed from: t  reason: collision with root package name */
    private C4689s f55203t;

    /* renamed from: u  reason: collision with root package name */
    private final D5 f55204u = new P3(this);

    protected C4643k3(E2 e22) {
        super(e22);
        this.f55199p = new G5(e22);
    }

    /* access modifiers changed from: private */
    public final void C0() {
        long j10;
        i();
        String a10 = e().f55101o.a();
        if (a10 != null) {
            if ("unset".equals(a10)) {
                e0("app", "_npa", (Object) null, zzb().currentTimeMillis());
            } else {
                if (b.f37475af.equals(a10)) {
                    j10 = 1;
                } else {
                    j10 = 0;
                }
                e0("app", "_npa", Long.valueOf(j10), zzb().currentTimeMillis());
            }
        }
        if (!this.f55074a.k() || !this.f55200q) {
            zzj().A().a("Updating Scion state (FE)");
            o().Z();
            return;
        }
        zzj().A().a("Recording app launch after enabling measurement for the first time (FE)");
        v0();
        p().f54912e.a();
        zzl().y(new B3(this));
    }

    static /* synthetic */ void I0(C4643k3 k3Var, int i10) {
        if (k3Var.f55194k == null) {
            k3Var.f55194k = new C4735z3(k3Var, k3Var.f55074a);
        }
        k3Var.f55194k.b((long) (i10 * 1000));
    }

    private final void J(Bundle bundle, int i10, long j10) {
        String str;
        q();
        String k10 = C4622h3.k(bundle);
        if (k10 != null) {
            zzj().H().b("Ignoring invalid consent setting", k10);
            zzj().H().a("Valid consent values are 'granted', 'denied'");
        }
        boolean E10 = zzl().E();
        C4622h3 g10 = C4622h3.g(bundle, i10);
        if (g10.C()) {
            O(g10, j10, E10);
        }
        C4701u c10 = C4701u.c(bundle, i10);
        if (c10.k()) {
            M(c10, E10);
        }
        Boolean e10 = C4701u.e(bundle);
        if (e10 != null) {
            if (i10 == -30) {
                str = "tcf";
            } else {
                str = "app";
            }
            f0(str, "allow_personalized_ads", e10.toString(), false);
        }
    }

    static /* synthetic */ void J0(C4643k3 k3Var, Bundle bundle) {
        Bundle bundle2 = bundle;
        k3Var.i();
        k3Var.q();
        C4536s.l(bundle);
        String string = bundle2.getString("name");
        String string2 = bundle2.getString("origin");
        C4536s.f(string);
        C4536s.f(string2);
        C4536s.l(bundle2.get("value"));
        if (!k3Var.f55074a.k()) {
            k3Var.zzj().F().a("Conditional property not set since app measurement is disabled");
            return;
        }
        A5 a52 = new A5(string, bundle2.getLong("triggered_timestamp"), bundle2.get("value"), string2);
        try {
            D C10 = k3Var.f().C(bundle2.getString("app_id"), bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), string2, 0, true, true);
            D C11 = k3Var.f().C(bundle2.getString("app_id"), bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), string2, 0, true, true);
            D C12 = k3Var.f().C(bundle2.getString("app_id"), bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), string2, 0, true, true);
            k3Var.o().E(new C4604f(bundle2.getString("app_id"), string2, a52, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), C11, bundle2.getLong("trigger_timeout"), C10, bundle2.getLong("time_to_live"), C12));
        } catch (IllegalArgumentException unused) {
        }
    }

    private final void L0(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        zzl().y(new C3(this, str, str2, j10, B5.y(bundle), z10, z11, z12, str3));
    }

    static /* synthetic */ void Q(C4643k3 k3Var, Bundle bundle) {
        Bundle bundle2 = bundle;
        k3Var.i();
        k3Var.q();
        C4536s.l(bundle);
        String f10 = C4536s.f(bundle2.getString("name"));
        if (!k3Var.f55074a.k()) {
            k3Var.zzj().F().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        A5 a52 = new A5(f10, 0, (Object) null, "");
        try {
            D C10 = k3Var.f().C(bundle2.getString("app_id"), bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), "", bundle2.getLong("creation_timestamp"), true, true);
            String string = bundle2.getString("app_id");
            long j10 = bundle2.getLong("creation_timestamp");
            boolean z10 = bundle2.getBoolean(AppStateModule.APP_STATE_ACTIVE);
            C4604f fVar = r4;
            C4604f fVar2 = new C4604f(string, "", a52, j10, z10, bundle2.getString("trigger_event_name"), (D) null, bundle2.getLong("trigger_timeout"), (D) null, bundle2.getLong("time_to_live"), C10);
            k3Var.o().E(fVar);
        } catch (IllegalArgumentException unused) {
        }
    }

    static /* synthetic */ void R(C4643k3 k3Var, C4622h3 h3Var, long j10, boolean z10, boolean z11) {
        k3Var.i();
        k3Var.q();
        C4622h3 H10 = k3Var.e().H();
        if (j10 <= k3Var.f55198o && C4622h3.l(H10.b(), h3Var.b())) {
            k3Var.zzj().E().b("Dropped out-of-date consent setting, proposed settings", h3Var);
        } else if (k3Var.e().w(h3Var)) {
            k3Var.zzj().F().b("Setting storage consent(FE)", h3Var);
            k3Var.f55198o = j10;
            if (k3Var.o().d0()) {
                k3Var.o().i0(z10);
            } else {
                k3Var.o().P(z10);
            }
            if (z11) {
                k3Var.o().L(new AtomicReference());
            }
        } else {
            k3Var.zzj().E().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(h3Var.b()));
        }
    }

    static /* synthetic */ void S(C4643k3 k3Var, C4622h3 h3Var, C4622h3 h3Var2) {
        if (!zznk.zza() || !k3Var.a().o(F.f54626V0)) {
            C4622h3.a aVar = C4622h3.a.ANALYTICS_STORAGE;
            C4622h3.a aVar2 = C4622h3.a.AD_STORAGE;
            boolean n10 = h3Var.n(h3Var2, aVar, aVar2);
            boolean s10 = h3Var.s(h3Var2, aVar, aVar2);
            if (n10 || s10) {
                k3Var.k().D();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void W(Boolean bool, boolean z10) {
        i();
        q();
        zzj().A().b("Setting app measurement enabled (FE)", bool);
        e().r(bool);
        if (z10) {
            e().z(bool);
        }
        if (this.f55074a.l() || (bool != null && !bool.booleanValue())) {
            C0();
        }
    }

    private final void a0(String str, String str2, long j10, Object obj) {
        zzl().y(new E3(this, str, str2, obj, j10));
    }

    public static int y(String str) {
        C4536s.f(str);
        return 25;
    }

    public final ArrayList A(String str, String str2) {
        if (zzl().E()) {
            zzj().B().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        } else if (C4583c.a()) {
            zzj().B().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.f55074a.zzl().q(atomicReference, 5000, "get conditional user properties", new J3(this, atomicReference, (String) null, str, str2));
            List list = (List) atomicReference.get();
            if (list != null) {
                return B5.o0(list);
            }
            zzj().B().b("Timed out waiting for get conditional user properties", (Object) null);
            return new ArrayList();
        }
    }

    /* access modifiers changed from: package-private */
    public final void A0() {
        C4624h5 h5Var;
        C2432a N02;
        i();
        if (!u0().isEmpty() && !this.f55192i && (h5Var = (C4624h5) u0().poll()) != null && (N02 = f().N0()) != null) {
            this.f55192i = true;
            zzj().F().b("Registering trigger URI", h5Var.f55133a);
            g c10 = N02.c(Uri.parse(h5Var.f55133a));
            if (c10 == null) {
                this.f55192i = false;
                u0().add(h5Var);
                return;
            }
            if (!a().o(F.f54596G0)) {
                SparseArray F10 = e().F();
                F10.put(h5Var.f55135c, Long.valueOf(h5Var.f55134b));
                e().q(F10);
            }
            d.a(c10, new C4717w3(this, h5Var), new C4723x3(this));
        }
    }

    public final Map B(String str, String str2, boolean z10) {
        if (zzl().E()) {
            zzj().B().a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (C4583c.a()) {
            zzj().B().a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.f55074a.zzl().q(atomicReference, 5000, "get user properties", new M3(this, atomicReference, (String) null, str, str2, z10));
            List<A5> list = (List) atomicReference.get();
            if (list == null) {
                zzj().B().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
                return Collections.emptyMap();
            }
            C1587a aVar = new C1587a(list.size());
            for (A5 a52 : list) {
                Object o02 = a52.o0();
                if (o02 != null) {
                    aVar.put(a52.f54441b, o02);
                }
            }
            return aVar;
        }
    }

    public final void B0() {
        i();
        zzj().A().a("Register tcfPrefChangeListener.");
        if (this.f55202s == null) {
            this.f55203t = new D3(this, this.f55074a);
            this.f55202s = new C4699t3(this);
        }
        e().C().registerOnSharedPreferenceChangeListener(this.f55202s);
    }

    public final void C(long j10) {
        S0((String) null);
        zzl().y(new I3(this, j10));
    }

    /* access modifiers changed from: package-private */
    public final void D(long j10, boolean z10) {
        i();
        q();
        zzj().A().a("Resetting analytics data (FE)");
        V4 p10 = p();
        p10.i();
        p10.f54913f.b();
        k().D();
        boolean k10 = this.f55074a.k();
        C4614g2 e10 = e();
        e10.f55093g.b(j10);
        if (!TextUtils.isEmpty(e10.e().f55110x.a())) {
            e10.f55110x.b((String) null);
        }
        e10.f55104r.b(0);
        e10.f55105s.b(0);
        if (!e10.a().P()) {
            e10.B(!k10);
        }
        e10.f55111y.b((String) null);
        e10.f55112z.b(0);
        e10.f55088A.b((Bundle) null);
        if (z10) {
            o().X();
        }
        p().f54912e.a();
        this.f55200q = !k10;
    }

    public final void E(r rVar) {
        r rVar2;
        boolean z10;
        i();
        q();
        if (!(rVar == null || rVar == (rVar2 = this.f55187d))) {
            if (rVar2 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            C4536s.p(z10, "EventInterceptor already set.");
        }
        this.f55187d = rVar;
    }

    /* access modifiers changed from: package-private */
    public final void E0(long j10) {
        D(j10, true);
    }

    public final void F(t tVar) {
        q();
        C4536s.l(tVar);
        if (!this.f55188e.add(tVar)) {
            zzj().G().a("OnEventListener already registered");
        }
    }

    public final void F0(t tVar) {
        q();
        C4536s.l(tVar);
        if (!this.f55188e.remove(tVar)) {
            zzj().G().a("OnEventListener had not been registered");
        }
    }

    public final void G(Intent intent) {
        if (zzpn.zza() && a().o(F.f54676u0)) {
            Uri data = intent.getData();
            if (data == null) {
                zzj().E().a("Activity intent has no data. Preview Mode was not enabled.");
                return;
            }
            String queryParameter = data.getQueryParameter("sgtm_debug_enable");
            if (queryParameter == null || !queryParameter.equals("1")) {
                zzj().E().a("Preview Mode was not enabled.");
                a().F((String) null);
                return;
            }
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (!TextUtils.isEmpty(queryParameter2)) {
                zzj().E().b("Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
                a().F(queryParameter2);
            }
        }
    }

    public final void G0(Bundle bundle) {
        H0(bundle, zzb().currentTimeMillis());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void H(SharedPreferences sharedPreferences, String str) {
        if ("IABTCF_TCString".equals(str)) {
            zzj().F().a("IABTCF_TCString change picked up in listener.");
            ((C4689s) C4536s.l(this.f55203t)).b(500);
        }
    }

    public final void H0(Bundle bundle, long j10) {
        C4536s.l(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            zzj().G().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        C4536s.l(bundle2);
        Class<String> cls = String.class;
        n.a(bundle2, "app_id", cls, (Object) null);
        n.a(bundle2, "origin", cls, (Object) null);
        n.a(bundle2, "name", cls, (Object) null);
        n.a(bundle2, "value", Object.class, (Object) null);
        n.a(bundle2, "trigger_event_name", cls, (Object) null);
        Class<Long> cls2 = Long.class;
        n.a(bundle2, "trigger_timeout", cls2, 0L);
        n.a(bundle2, "timed_out_event_name", cls, (Object) null);
        Class<Bundle> cls3 = Bundle.class;
        n.a(bundle2, "timed_out_event_params", cls3, (Object) null);
        n.a(bundle2, "triggered_event_name", cls, (Object) null);
        n.a(bundle2, "triggered_event_params", cls3, (Object) null);
        n.a(bundle2, "time_to_live", cls2, 0L);
        n.a(bundle2, "expired_event_name", cls, (Object) null);
        n.a(bundle2, "expired_event_params", cls3, (Object) null);
        C4536s.f(bundle2.getString("name"));
        C4536s.f(bundle2.getString("origin"));
        C4536s.l(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (f().m0(string) != 0) {
            zzj().B().b("Invalid conditional user property name", d().g(string));
        } else if (f().r(string, obj) != 0) {
            zzj().B().c("Invalid conditional user property value", d().g(string), obj);
        } else {
            Object v02 = f().v0(string, obj);
            if (v02 == null) {
                zzj().B().c("Unable to normalize conditional user property value", d().g(string), obj);
                return;
            }
            n.b(bundle2, v02);
            long j11 = bundle2.getLong("trigger_timeout");
            if (TextUtils.isEmpty(bundle2.getString("trigger_event_name")) || (j11 <= 15552000000L && j11 >= 1)) {
                long j12 = bundle2.getLong("time_to_live");
                if (j12 > 15552000000L || j12 < 1) {
                    zzj().B().c("Invalid conditional user property time to live", d().g(string), Long.valueOf(j12));
                } else {
                    zzl().y(new H3(this, bundle2));
                }
            } else {
                zzj().B().c("Invalid conditional user property timeout", d().g(string), Long.valueOf(j11));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void I(Bundle bundle) {
        if (bundle == null) {
            e().f55088A.b(new Bundle());
            return;
        }
        Bundle a10 = e().f55088A.a();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                f();
                if (B5.c0(obj)) {
                    f();
                    B5.T(this.f55204u, 27, (String) null, (String) null, 0);
                }
                zzj().H().c("Invalid default event parameter type. Name, value", next, obj);
            } else if (B5.E0(next)) {
                zzj().H().b("Invalid default event parameter name. Name", next);
            } else if (obj == null) {
                a10.remove(next);
            } else if (f().g0("param", next, a().m((String) null, false), obj)) {
                f().J(a10, next, obj);
            }
        }
        f();
        if (B5.b0(a10, a().C())) {
            f();
            B5.T(this.f55204u, 26, (String) null, (String) null, 0);
            zzj().H().a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        e().f55088A.b(a10);
        o().z(a10);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void K(Bundle bundle, long j10) {
        if (TextUtils.isEmpty(k().B())) {
            J(bundle, 0, j10);
        } else {
            zzj().H().a("Using developer consent only; google app id found");
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void K0(String str) {
        if (k().F(str)) {
            k().D();
        }
    }

    public final void L(zzdg zzdg) {
        zzl().y(new L3(this, zzdg));
    }

    /* access modifiers changed from: package-private */
    public final void M(C4701u uVar, boolean z10) {
        S3 s32 = new S3(this, uVar);
        if (z10) {
            i();
            s32.run();
            return;
        }
        zzl().y(s32);
    }

    public final void M0(String str, String str2, Bundle bundle) {
        d0(str, str2, bundle, true, true, zzb().currentTimeMillis());
    }

    /* access modifiers changed from: package-private */
    public final void N(C4622h3 h3Var) {
        boolean z10;
        i();
        if ((!h3Var.B() || !h3Var.A()) && !o().c0()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 != this.f55074a.l()) {
            this.f55074a.r(z10);
            Boolean J10 = e().J();
            if (!z10 || J10 == null || J10.booleanValue()) {
                W(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void N0(boolean z10) {
        if (zza().getApplicationContext() instanceof Application) {
            Application application = (Application) zza().getApplicationContext();
            if (this.f55186c == null) {
                this.f55186c = new X3(this);
            }
            if (z10) {
                application.unregisterActivityLifecycleCallbacks(this.f55186c);
                application.registerActivityLifecycleCallbacks(this.f55186c);
                zzj().F().a("Registered activity lifecycle callback");
            }
        }
    }

    public final void O(C4622h3 h3Var, long j10, boolean z10) {
        C4622h3 h3Var2;
        boolean z11;
        boolean z12;
        boolean z13;
        o oVar;
        C4622h3 h3Var3 = h3Var;
        q();
        int b10 = h3Var.b();
        if (!zzne.zza() || !a().o(F.f54618R0)) {
            if (b10 != -10 && h3Var.w() == null && h3Var.x() == null) {
                zzj().H().a("Discarding empty consent settings");
                return;
            }
        } else if (b10 != -10 && h3Var.t() == (oVar = o.UNINITIALIZED) && h3Var.v() == oVar) {
            zzj().H().a("Ignoring empty consent settings");
            return;
        }
        synchronized (this.f55191h) {
            try {
                h3Var2 = this.f55196m;
                z11 = false;
                if (C4622h3.l(b10, h3Var2.b())) {
                    z13 = h3Var.u(this.f55196m);
                    if (h3Var.B() && !this.f55196m.B()) {
                        z11 = true;
                    }
                    h3Var3 = h3Var.p(this.f55196m);
                    this.f55196m = h3Var3;
                    z12 = z11;
                    z11 = true;
                } else {
                    z13 = false;
                    z12 = false;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (!z11) {
            zzj().E().b("Ignoring lower-priority consent settings, proposed settings", h3Var3);
            return;
        }
        long andIncrement = this.f55197n.getAndIncrement();
        if (z13) {
            S0((String) null);
            V3 v32 = new V3(this, h3Var3, j10, andIncrement, z12, h3Var2);
            if (z10) {
                i();
                v32.run();
                return;
            }
            zzl().B(v32);
            return;
        }
        U3 u32 = new U3(this, h3Var3, andIncrement, z12, h3Var2);
        if (z10) {
            i();
            u32.run();
        } else if (b10 == 30 || b10 == -10) {
            zzl().B(u32);
        } else {
            zzl().y(u32);
        }
    }

    public final void O0(long j10) {
        zzl().y(new A3(this, j10));
    }

    public final void P0(Bundle bundle) {
        Bundle bundle2;
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        zzl().y(new C4693s3(this, bundle2));
    }

    public final void Q0(Bundle bundle, long j10) {
        zzl().B(new C4687r3(this, bundle, j10));
    }

    /* access modifiers changed from: package-private */
    public final void S0(String str) {
        this.f55190g.set(str);
    }

    /* access modifiers changed from: package-private */
    public final void T0(String str, String str2, Bundle bundle) {
        i();
        Y(str, str2, zzb().currentTimeMillis(), bundle);
    }

    public final void U0(boolean z10) {
        q();
        zzl().y(new C4729y3(this, z10));
    }

    public final void V(Boolean bool) {
        q();
        zzl().y(new T3(this, bool));
    }

    public final void V0(Bundle bundle, long j10) {
        J(bundle, -20, j10);
    }

    public final void X(String str, long j10) {
        if (str == null || !TextUtils.isEmpty(str)) {
            zzl().y(new C4711v3(this, str));
            g0((String) null, "_id", str, true, j10);
            return;
        }
        this.f55074a.zzj().G().a("User ID must be non-empty or null");
    }

    /* access modifiers changed from: package-private */
    public final void Y(String str, String str2, long j10, Bundle bundle) {
        boolean z10;
        i();
        if (this.f55187d == null || B5.E0(str2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        Z(str, str2, j10, bundle, true, z10, true, (String) null);
    }

    /* access modifiers changed from: protected */
    public final void Z(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        boolean z13;
        ArrayList arrayList;
        String str4;
        long j11;
        int i10;
        Object obj;
        Class<?> cls;
        String str5 = str;
        String str6 = str2;
        long j12 = j10;
        Bundle bundle2 = bundle;
        C4536s.f(str);
        C4536s.l(bundle);
        i();
        q();
        if (!this.f55074a.k()) {
            zzj().A().a("Event not sent since app measurement is disabled");
            return;
        }
        List C10 = k().C();
        if (C10 == null || C10.contains(str6)) {
            if (!this.f55189f) {
                this.f55189f = true;
                try {
                    if (!this.f55074a.o()) {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, zza().getClassLoader());
                    } else {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                    }
                    try {
                        cls.getDeclaredMethod("initialize", new Class[]{Context.class}).invoke((Object) null, new Object[]{zza()});
                    } catch (Exception e10) {
                        zzj().G().b("Failed to invoke Tag Manager's initialize() method", e10);
                    }
                } catch (ClassNotFoundException unused) {
                    zzj().E().a("Tag Manager is not found and thus will not be used");
                }
            }
            if ("_cmp".equals(str6) && bundle2.containsKey("gclid")) {
                e0("auto", "_lgclid", bundle2.getString("gclid"), zzb().currentTimeMillis());
            }
            if (z10 && B5.I0(str2)) {
                f().I(bundle2, e().f55088A.a());
            }
            int i11 = 0;
            if (!z12 && !"_iap".equals(str6)) {
                B5 G10 = this.f55074a.G();
                int i12 = 2;
                if (G10.x0("event", str6)) {
                    if (!G10.k0("event", q.f52148a, q.f52149b, str6)) {
                        i12 = 13;
                    } else if (G10.e0("event", 40, str6)) {
                        i12 = 0;
                    }
                }
                if (i12 != 0) {
                    zzj().C().b("Invalid public event name. Event will not be logged (FE)", d().c(str6));
                    this.f55074a.G();
                    String E10 = B5.E(str6, 40, true);
                    if (str6 != null) {
                        i11 = str2.length();
                    }
                    this.f55074a.G();
                    B5.T(this.f55204u, i12, "_ev", E10, i11);
                    return;
                }
            }
            C4595d4 x10 = n().x(false);
            if (x10 != null && !bundle2.containsKey("_sc")) {
                x10.f55046d = true;
            }
            B5.S(x10, bundle2, z10 && !z12);
            boolean equals = "am".equals(str5);
            boolean E02 = B5.E0(str2);
            if (z10 && this.f55187d != null && !E02 && !equals) {
                zzj().A().c("Passing event to registered event handler (FE)", d().c(str6), d().a(bundle2));
                C4536s.l(this.f55187d);
                this.f55187d.a(str, str2, bundle, j10);
            } else if (this.f55074a.n()) {
                int q10 = f().q(str6);
                if (q10 != 0) {
                    zzj().C().b("Invalid event name. Event will not be logged (FE)", d().c(str6));
                    f();
                    String E11 = B5.E(str6, 40, true);
                    if (str6 != null) {
                        i11 = str2.length();
                    }
                    this.f55074a.G();
                    B5.U(this.f55204u, str3, q10, "_ev", E11, i11);
                    return;
                }
                String str7 = "_o";
                Bundle A10 = f().A(str3, str2, bundle, f.b("_o", "_sn", "_sc", "_si"), z12);
                C4536s.l(A10);
                if (n().x(false) != null && "_ae".equals(str6)) {
                    C4575a5 a5Var = p().f54913f;
                    long a10 = a5Var.f55010d.zzb().a();
                    long j13 = a10 - a5Var.f55008b;
                    a5Var.f55008b = a10;
                    if (j13 > 0) {
                        f().H(A10, j13);
                    }
                }
                if (!"auto".equals(str5) && "_ssr".equals(str6)) {
                    B5 f10 = f();
                    String string = A10.getString("_ffr");
                    if (p.b(string)) {
                        string = null;
                    } else if (string != null) {
                        string = string.trim();
                    }
                    if (Objects.equals(string, f10.e().f55110x.a())) {
                        f10.zzj().A().a("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    f10.e().f55110x.b(string);
                } else if ("_ae".equals(str6)) {
                    String a11 = f().e().f55110x.a();
                    if (!TextUtils.isEmpty(a11)) {
                        A10.putString("_ffr", a11);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(A10);
                if (a().o(F.f54598H0)) {
                    z13 = p().A();
                } else {
                    z13 = e().f55107u.b();
                }
                if (e().f55104r.a() <= 0 || !e().u(j12) || !z13) {
                    str4 = "_ae";
                    arrayList = arrayList2;
                    j11 = 0;
                } else {
                    zzj().F().a("Current session is expired, remove the session number, ID, and engagement time");
                    arrayList = arrayList2;
                    j11 = 0;
                    str4 = "_ae";
                    e0("auto", "_sid", (Object) null, zzb().currentTimeMillis());
                    e0("auto", "_sno", (Object) null, zzb().currentTimeMillis());
                    e0("auto", "_se", (Object) null, zzb().currentTimeMillis());
                    e().f55105s.b(0);
                }
                if (A10.getLong("extend_session", j11) == 1) {
                    zzj().F().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    i10 = 1;
                    this.f55074a.F().f54912e.b(j12, true);
                } else {
                    i10 = 1;
                }
                ArrayList arrayList3 = new ArrayList(A10.keySet());
                Collections.sort(arrayList3);
                int size = arrayList3.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj2 = arrayList3.get(i13);
                    i13 += i10;
                    String str8 = (String) obj2;
                    if (str8 != null) {
                        f();
                        Bundle[] s02 = B5.s0(A10.get(str8));
                        if (s02 != null) {
                            A10.putParcelableArray(str8, s02);
                        }
                    }
                    i10 = 1;
                }
                int i14 = 0;
                while (i14 < arrayList.size()) {
                    ArrayList arrayList4 = arrayList;
                    Bundle bundle3 = (Bundle) arrayList4.get(i14);
                    String str9 = i14 != 0 ? "_ep" : str6;
                    bundle3.putString(str7, str5);
                    if (z11) {
                        obj = null;
                        bundle3 = f().z(bundle3, (String) null);
                    } else {
                        obj = null;
                    }
                    Bundle bundle4 = bundle3;
                    D d10 = r1;
                    String str10 = str7;
                    Object obj3 = obj;
                    Bundle bundle5 = bundle4;
                    D d11 = new D(str9, new C(bundle4), str, j10);
                    o().F(d10, str3);
                    if (!equals) {
                        for (t a12 : this.f55188e) {
                            a12.a(str, str2, new Bundle(bundle5), j10);
                            String str11 = str3;
                        }
                    }
                    i14++;
                    arrayList = arrayList4;
                    str7 = str10;
                }
                if (n().x(false) != null && str4.equals(str6)) {
                    p().z(true, true, zzb().a());
                }
            }
        } else {
            zzj().A().c("Dropping non-safelisted event. event name, origin", str6, str5);
        }
    }

    public final /* bridge */ /* synthetic */ C4618h a() {
        return super.a();
    }

    public final void b0(String str, String str2, Bundle bundle) {
        long currentTimeMillis = zzb().currentTimeMillis();
        C4536s.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        zzl().y(new K3(this, bundle2));
    }

    public final /* bridge */ /* synthetic */ C4713w c() {
        return super.c();
    }

    public final void c0(String str, String str2, Bundle bundle, String str3) {
        h();
        L0(str, str2, zzb().currentTimeMillis(), bundle, false, true, true, str3);
    }

    public final /* bridge */ /* synthetic */ R1 d() {
        return super.d();
    }

    public final void d0(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        String str3;
        Bundle bundle2;
        boolean z12;
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        String str4 = str2;
        if (Objects.equals(str2, "screen_view")) {
            n().D(bundle2, j10);
            return;
        }
        long j11 = j10;
        if (!z11 || this.f55187d == null || B5.E0(str2)) {
            z12 = true;
        } else {
            z12 = false;
        }
        L0(str3, str2, j10, bundle2, z11, z12, z10, (String) null);
    }

    public final /* bridge */ /* synthetic */ C4614g2 e() {
        return super.e();
    }

    /* access modifiers changed from: package-private */
    public final void e0(String str, String str2, Object obj, long j10) {
        long j11;
        C4536s.f(str);
        C4536s.f(str2);
        i();
        q();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    String lowerCase = str3.toLowerCase(Locale.ENGLISH);
                    String str4 = b.f37476ag;
                    if (str4.equals(lowerCase)) {
                        j11 = 1;
                    } else {
                        j11 = 0;
                    }
                    Long valueOf = Long.valueOf(j11);
                    C4656m2 m2Var = e().f55101o;
                    if (valueOf.longValue() == 1) {
                        str4 = b.f37475af;
                    }
                    m2Var.b(str4);
                    obj = valueOf;
                    str2 = "_npa";
                    zzj().F().c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
                }
            }
            if (obj == null) {
                e().f55101o.b("unset");
                str2 = "_npa";
            }
            zzj().F().c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
        }
        String str5 = str2;
        Object obj2 = obj;
        if (!this.f55074a.k()) {
            zzj().F().a("User property not set since app measurement is disabled");
        } else if (this.f55074a.n()) {
            o().J(new A5(str5, j10, obj2, str));
        }
    }

    public final /* bridge */ /* synthetic */ B5 f() {
        return super.f();
    }

    public final void f0(String str, String str2, Object obj, boolean z10) {
        g0(str, str2, obj, z10, zzb().currentTimeMillis());
    }

    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    public final void g0(String str, String str2, Object obj, boolean z10, long j10) {
        int i10;
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i11 = 0;
        if (z10) {
            i10 = f().m0(str2);
        } else {
            B5 f10 = f();
            if (f10.x0("user property", str2)) {
                if (!f10.j0("user property", s.f52152a, str2)) {
                    i10 = 15;
                } else if (f10.e0("user property", 24, str2)) {
                    i10 = 0;
                }
            }
            i10 = 6;
        }
        if (i10 != 0) {
            f();
            String E10 = B5.E(str2, 24, true);
            if (str2 != null) {
                i11 = str2.length();
            }
            this.f55074a.G();
            B5.T(this.f55204u, i10, "_ev", E10, i11);
        } else if (obj != null) {
            int r10 = f().r(str2, obj);
            if (r10 != 0) {
                f();
                String E11 = B5.E(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i11 = String.valueOf(obj).length();
                }
                this.f55074a.G();
                B5.T(this.f55204u, r10, "_ev", E11, i11);
                return;
            }
            Object v02 = f().v0(str2, obj);
            if (v02 != null) {
                a0(str3, str2, j10, v02);
            }
        } else {
            a0(str3, str2, j10, (Object) null);
        }
    }

    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h0(List list) {
        i();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray F10 = e().F();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C4624h5 h5Var = (C4624h5) it.next();
                if (!F10.contains(h5Var.f55135c) || ((Long) F10.get(h5Var.f55135c)).longValue() < h5Var.f55134b) {
                    u0().add(h5Var);
                }
            }
            A0();
        }
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i0(AtomicReference atomicReference) {
        Bundle a10 = e().f55102p.a();
        C4644k4 o10 = o();
        if (a10 == null) {
            a10 = new Bundle();
        }
        o10.M(atomicReference, a10);
    }

    public final /* bridge */ /* synthetic */ C4731z j() {
        return super.j();
    }

    public final Application.ActivityLifecycleCallbacks j0() {
        return this.f55186c;
    }

    public final /* bridge */ /* synthetic */ Q1 k() {
        return super.k();
    }

    public final C4378a k0() {
        i();
        return o().Q();
    }

    public final /* bridge */ /* synthetic */ P1 l() {
        return super.l();
    }

    public final Boolean l0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) zzl().q(atomicReference, 15000, "boolean test flag value", new C4705u3(this, atomicReference));
    }

    public final /* bridge */ /* synthetic */ C4643k3 m() {
        return super.m();
    }

    public final Double m0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) zzl().q(atomicReference, 15000, "double test flag value", new Q3(this, atomicReference));
    }

    public final /* bridge */ /* synthetic */ C4609f4 n() {
        return super.n();
    }

    public final Integer n0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) zzl().q(atomicReference, 15000, "int test flag value", new R3(this, atomicReference));
    }

    public final /* bridge */ /* synthetic */ C4644k4 o() {
        return super.o();
    }

    public final Long o0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) zzl().q(atomicReference, 15000, "long test flag value", new N3(this, atomicReference));
    }

    public final /* bridge */ /* synthetic */ V4 p() {
        return super.p();
    }

    public final String p0() {
        return (String) this.f55190g.get();
    }

    public final String q0() {
        C4595d4 K10 = this.f55074a.D().K();
        if (K10 != null) {
            return K10.f55044b;
        }
        return null;
    }

    public final String r0() {
        C4595d4 K10 = this.f55074a.D().K();
        if (K10 != null) {
            return K10.f55043a;
        }
        return null;
    }

    public final String s0() {
        if (this.f55074a.H() != null) {
            return this.f55074a.H();
        }
        try {
            return new m(zza(), this.f55074a.K()).b("google_app_id");
        } catch (IllegalStateException e10) {
            this.f55074a.zzj().B().b("getGoogleAppId failed with exception", e10);
            return null;
        }
    }

    public final String t0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) zzl().q(atomicReference, 15000, "String test flag value", new G3(this, atomicReference));
    }

    /* access modifiers changed from: package-private */
    public final PriorityQueue u0() {
        if (this.f55195l == null) {
            this.f55195l = new PriorityQueue(Comparator.comparing(new C4664n3(), new C4657m3()));
        }
        return this.f55195l;
    }

    /* access modifiers changed from: protected */
    public final boolean v() {
        return false;
    }

    public final void v0() {
        i();
        q();
        if (this.f55074a.n()) {
            Boolean y10 = a().y("google_analytics_deferred_deep_link_enabled");
            if (y10 != null && y10.booleanValue()) {
                zzj().A().a("Deferred Deep Link feature enabled.");
                zzl().y(new v(this));
            }
            o().S();
            this.f55200q = false;
            String L10 = e().L();
            if (!TextUtils.isEmpty(L10)) {
                c().k();
                if (!L10.equals(Build.VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", L10);
                    T0("auto", "_ou", bundle);
                }
            }
        }
    }

    public final void w0() {
        if ((zza().getApplicationContext() instanceof Application) && this.f55186c != null) {
            ((Application) zza().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f55186c);
        }
    }

    /* access modifiers changed from: package-private */
    public final void x0() {
        if (zzpg.zza() && a().o(F.f54586B0)) {
            if (zzl().E()) {
                zzj().B().a("Cannot get trigger URIs from analytics worker thread");
            } else if (C4583c.a()) {
                zzj().B().a("Cannot get trigger URIs from main thread");
            } else {
                q();
                zzj().F().a("Getting trigger URIs (FE)");
                AtomicReference atomicReference = new AtomicReference();
                zzl().q(atomicReference, 5000, "get trigger URIs", new C4682q3(this, atomicReference));
                List list = (List) atomicReference.get();
                if (list == null) {
                    zzj().B().a("Timed out waiting for get trigger URIs");
                } else {
                    zzl().y(new C4670o3(this, list));
                }
            }
        }
    }

    public final void y0() {
        i();
        if (e().f55108v.b()) {
            zzj().A().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a10 = e().f55109w.a();
        e().f55109w.b(1 + a10);
        if (a10 >= 5) {
            zzj().G().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            e().f55108v.a(true);
            return;
        }
        if (this.f55201r == null) {
            this.f55201r = new F3(this, this.f55074a);
        }
        this.f55201r.b(0);
    }

    public final void z0() {
        i();
        zzj().A().a("Handle tcf update.");
        C4610f5 c10 = C4610f5.c(e().C());
        zzj().F().b("Tcf preferences read", c10);
        if (e().x(c10)) {
            Bundle b10 = c10.b();
            zzj().F().b("Consent generated from Tcf", b10);
            if (b10 != Bundle.EMPTY) {
                J(b10, -30, zzb().currentTimeMillis());
            }
            Bundle bundle = new Bundle();
            bundle.putString("_tcfd", c10.e());
            T0("auto", "_tcf", bundle);
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
