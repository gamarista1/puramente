package Fe;

import Fe.I;
import Fe.U;
import android.app.UiModeManager;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import org.json.JSONException;
import org.json.JSONObject;
import qf.C6658d;
import qf.g;
import qf.h;

class C {

    /* renamed from: a  reason: collision with root package name */
    private final U f30825a = new c();

    /* renamed from: b  reason: collision with root package name */
    private final Context f30826b;

    class a implements C6658d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f30827a;

        a(JSONObject jSONObject) {
            this.f30827a = jSONObject;
        }

        public g getContext() {
            return h.f72645a;
        }

        public void resumeWith(Object obj) {
            if (obj != null) {
                C3016e.f31053z = (String) obj;
                C3023l.l("onUserAgentStringFetchFinished getUserAgentSync resumeWith releasing lock");
                try {
                    this.f30827a.put(y.UserAgent.b(), C3016e.f31053z);
                } catch (JSONException e10) {
                    C3023l.m("Caught JSONException " + e10.getMessage());
                }
            }
            C3016e.X().f31062i.y(I.b.USER_AGENT_STRING_LOCK);
            C3016e.X().f31062i.v("onUserAgentStringFetchFinished");
        }
    }

    class b implements C6658d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f30829a;

        b(JSONObject jSONObject) {
            this.f30829a = jSONObject;
        }

        public g getContext() {
            return h.f72645a;
        }

        public void resumeWith(Object obj) {
            if (obj != null) {
                C3016e.f31053z = (String) obj;
                C3023l.l("onUserAgentStringFetchFinished getUserAgentAsync resumeWith releasing lock");
                try {
                    this.f30829a.put(y.UserAgent.b(), C3016e.f31053z);
                } catch (JSONException e10) {
                    C3023l.m("Caught JSONException " + e10.getMessage());
                }
            }
            C3016e.X().f31062i.y(I.b.USER_AGENT_STRING_LOCK);
            C3016e.X().f31062i.v("getUserAgentAsync resumeWith");
        }
    }

    private class c extends U {
        public c() {
        }
    }

    C(Context context) {
        this.f30826b = context;
    }

    static C d() {
        C3016e X10 = C3016e.X();
        if (X10 == null) {
            return null;
        }
        return X10.T();
    }

    public static boolean g(String str) {
        if (TextUtils.isEmpty(str) || str.equals("bnc_no_value")) {
            return true;
        }
        return false;
    }

    private void j(JSONObject jSONObject) {
        C3023l.l("setPostUserAgent " + Thread.currentThread().getName());
        try {
            if (!TextUtils.isEmpty(C3016e.f31053z)) {
                C3023l.l("userAgent was cached: " + C3016e.f31053z);
                jSONObject.put(y.UserAgent.b(), C3016e.f31053z);
                C3016e.X().f31062i.y(I.b.USER_AGENT_STRING_LOCK);
                C3016e.X().f31062i.v("setPostUserAgent");
            } else if (C3016e.f31052y) {
                C3023l.l("Start invoking getUserAgentSync from thread " + Thread.currentThread().getName());
                Ae.b.c(this.f30826b, new a(jSONObject));
            } else {
                Ae.b.b(this.f30826b, new b(jSONObject));
            }
        } catch (Exception e10) {
            C3023l.m("Caught exception trying to set userAgent " + e10.getMessage());
            C3016e.X().f31062i.y(I.b.USER_AGENT_STRING_LOCK);
            C3016e.X().f31062i.v("getUserAgentAsync");
        }
    }

    public String a() {
        return U.h(this.f30826b);
    }

    public long b() {
        return U.m(this.f30826b);
    }

    public U.g c() {
        f();
        return U.A(this.f30826b, C3016e.l0());
    }

    public long e() {
        return U.q(this.f30826b);
    }

    /* access modifiers changed from: package-private */
    public U f() {
        return this.f30825a;
    }

    public boolean h() {
        return U.G(this.f30826b);
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        UiModeManager uiModeManager = (UiModeManager) this.f30826b.getSystemService("uimode");
        if (uiModeManager == null) {
            C3023l.l("uiModeManager is null, mark this as a non-TV device by default.");
            return false;
        } else if (uiModeManager.getCurrentModeType() == 4) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void k(I i10, JSONObject jSONObject) {
        try {
            U.g c10 = c();
            if (!g(c10.a())) {
                jSONObject.put(y.HardwareID.b(), c10.a());
                jSONObject.put(y.IsHardwareIDReal.b(), c10.b());
            }
            String g10 = U.g(this.f30826b);
            if (!g(g10)) {
                jSONObject.put(y.AnonID.b(), g10);
            }
            String w10 = U.w();
            if (!g(w10)) {
                jSONObject.put(y.Brand.b(), w10);
            }
            String x10 = U.x();
            if (!g(x10)) {
                jSONObject.put(y.Model.b(), x10);
            }
            DisplayMetrics y10 = U.y(this.f30826b);
            jSONObject.put(y.ScreenDpi.b(), y10.densityDpi);
            jSONObject.put(y.ScreenHeight.b(), y10.heightPixels);
            jSONObject.put(y.ScreenWidth.b(), y10.widthPixels);
            jSONObject.put(y.WiFi.b(), U.B(this.f30826b));
            jSONObject.put(y.UIMode.b(), U.z(this.f30826b));
            String t10 = U.t(this.f30826b);
            if (!g(t10)) {
                jSONObject.put(y.OS.b(), t10);
            }
            jSONObject.put(y.APILevel.b(), U.f());
            if (C3016e.b0() != null) {
                jSONObject.put(y.PluginName.b(), C3016e.b0());
                jSONObject.put(y.PluginVersion.b(), C3016e.c0());
            }
            String n10 = U.n();
            if (!TextUtils.isEmpty(n10)) {
                jSONObject.put(y.Country.b(), n10);
            }
            String o10 = U.o();
            if (!TextUtils.isEmpty(o10)) {
                jSONObject.put(y.Language.b(), o10);
            }
            String r10 = U.r();
            if (!TextUtils.isEmpty(r10)) {
                jSONObject.put(y.LocalIP.b(), r10);
            }
            if (i10.t()) {
                jSONObject.put(y.CPUType.b(), U.i());
                jSONObject.put(y.DeviceBuildId.b(), U.l());
                jSONObject.put(y.Locale.b(), U.s());
                jSONObject.put(y.ConnectionType.b(), U.k(this.f30826b));
                jSONObject.put(y.DeviceCarrier.b(), U.j(this.f30826b));
                jSONObject.put(y.OSVersionAndroid.b(), U.u());
            }
        } catch (JSONException e10) {
            C3023l.m("Caught JSONException" + e10.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public void l(I i10, E e10, JSONObject jSONObject) {
        try {
            U.g c10 = c();
            if (!g(c10.a())) {
                jSONObject.put(y.AndroidID.b(), c10.a());
            }
            String g10 = U.g(this.f30826b);
            if (!g(g10)) {
                jSONObject.put(y.AnonID.b(), g10);
            }
            String w10 = U.w();
            if (!g(w10)) {
                jSONObject.put(y.Brand.b(), w10);
            }
            String x10 = U.x();
            if (!g(x10)) {
                jSONObject.put(y.Model.b(), x10);
            }
            DisplayMetrics y10 = U.y(this.f30826b);
            jSONObject.put(y.ScreenDpi.b(), y10.densityDpi);
            jSONObject.put(y.ScreenHeight.b(), y10.heightPixels);
            jSONObject.put(y.ScreenWidth.b(), y10.widthPixels);
            jSONObject.put(y.UIMode.b(), U.z(this.f30826b));
            String t10 = U.t(this.f30826b);
            if (!g(t10)) {
                jSONObject.put(y.OS.b(), t10);
            }
            jSONObject.put(y.APILevel.b(), U.f());
            if (C3016e.b0() != null) {
                jSONObject.put(y.PluginName.b(), C3016e.b0());
                jSONObject.put(y.PluginVersion.b(), C3016e.c0());
            }
            String n10 = U.n();
            if (!TextUtils.isEmpty(n10)) {
                jSONObject.put(y.Country.b(), n10);
            }
            String o10 = U.o();
            if (!TextUtils.isEmpty(o10)) {
                jSONObject.put(y.Language.b(), o10);
            }
            String r10 = U.r();
            if (!TextUtils.isEmpty(r10)) {
                jSONObject.put(y.LocalIP.b(), r10);
            }
            if (e10 != null) {
                if (!g(e10.Q())) {
                    jSONObject.put(y.RandomizedDeviceToken.b(), e10.Q());
                }
                String B10 = e10.B();
                if (!g(B10)) {
                    jSONObject.put(y.DeveloperIdentity.b(), B10);
                }
                String o11 = e10.o();
                if (!"bnc_no_value".equals(o11)) {
                    jSONObject.put(y.App_Store.b(), o11);
                }
            }
            jSONObject.put(y.AppVersion.b(), a());
            jSONObject.put(y.SDK.b(), "android");
            jSONObject.put(y.SdkVersion.b(), C3016e.e0());
            j(jSONObject);
            if (i10 instanceof K) {
                jSONObject.put(y.LATDAttributionWindow.b(), ((K) i10).Q());
            }
            if (i10.t()) {
                jSONObject.put(y.CPUType.b(), U.i());
                jSONObject.put(y.DeviceBuildId.b(), U.l());
                jSONObject.put(y.Locale.b(), U.s());
                jSONObject.put(y.ConnectionType.b(), U.k(this.f30826b));
                jSONObject.put(y.DeviceCarrier.b(), U.j(this.f30826b));
                jSONObject.put(y.OSVersionAndroid.b(), U.u());
            }
        } catch (JSONException e11) {
            C3023l.m("Caught JSONException" + e11.getMessage());
        }
    }
}
