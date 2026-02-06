package Fe;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Fe.h  reason: case insensitive filesystem */
public final class C3019h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f31096a = new a((DefaultConstructorMarker) null);

    /* renamed from: Fe.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final boolean b() {
        E e10;
        C3016e X10 = C3016e.X();
        if (X10 == null || (e10 = X10.f31056c) == null) {
            return false;
        }
        return e10.w();
    }

    private final boolean d() {
        E e10;
        C3016e X10 = C3016e.X();
        if (X10 == null || (e10 = X10.f31056c) == null) {
            return false;
        }
        return e10.q("bnc_defer_init_for_plugin_runtime");
    }

    public final String a() {
        String str;
        E e10;
        C3016e X10 = C3016e.X();
        if (X10 == null || (e10 = X10.f31056c) == null) {
            str = null;
        } else {
            str = e10.s();
        }
        if (str == null) {
            return "unknown";
        }
        return str;
    }

    public final boolean c() {
        return C6496s.c(a(), "branchKey");
    }

    public final boolean e() {
        E e10;
        C3016e X10 = C3016e.X();
        if (X10 == null || (e10 = X10.f31056c) == null) {
            return false;
        }
        return e10.q("bnc_instant_deep_linking_enabled");
    }

    public final boolean f() {
        return C3031u.j();
    }

    public final JSONObject g() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("expectDelayedSessionInitialization", b());
            jSONObject.put("testMode", f());
            jSONObject.put("instantDeepLinkingEnabled", e());
            jSONObject.put("deferInitForPluginRuntime", d());
            jSONObject.put("branch_key_source", a());
            jSONObject.put("branch_key_fallback_used", c());
            return jSONObject;
        } catch (NullPointerException e10) {
            C3023l.m("Error serializing configuration - null reference: " + e10.getMessage());
            return new JSONObject();
        } catch (JSONException e11) {
            C3023l.m("Error serializing configuration - JSON error: " + e11.getMessage());
            return new JSONObject();
        } catch (Exception e12) {
            C3023l.m("Error serializing configuration - unexpected error: " + e12.getMessage());
            return new JSONObject();
        }
    }

    public final void h(boolean z10) {
        E e10;
        C3016e X10 = C3016e.X();
        if (X10 != null && (e10 = X10.f31056c) != null) {
            e10.A0("bnc_defer_init_for_plugin_runtime", Boolean.valueOf(z10));
        }
    }

    public final void i(boolean z10) {
        C3016e X10 = C3016e.X();
        if (X10 != null) {
            X10.f31056c.E0(z10);
        }
    }
}
