package H5;

import H5.e;
import android.os.Bundle;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import o7.C3884A;
import o7.C3906w;
import org.json.JSONArray;
import t5.C4028e;
import t7.C4049a;
import y5.C4187a;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f31694a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final String f31695b = e.class.getSimpleName();

    private d() {
    }

    public static final Bundle a(e.a aVar, String str, List list) {
        Class<d> cls = d.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(aVar, "eventType");
            C6496s.h(str, "applicationId");
            C6496s.h(list, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString("event", aVar.toString());
            bundle.putString("app_id", str);
            if (e.a.CUSTOM_APP_EVENTS == aVar) {
                JSONArray b10 = f31694a.b(list, str);
                if (b10.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", b10.toString());
            }
            return bundle;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    private final JSONArray b(List list, String str) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            List<C4028e> h12 = C6565s.h1(list);
            C4187a.d(h12);
            boolean c10 = c(str);
            for (C4028e eVar : h12) {
                if (eVar.h()) {
                    if (eVar.h() && c10) {
                    }
                }
                jSONArray.put(eVar.e());
            }
            return jSONArray;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    private final boolean c(String str) {
        if (C4049a.d(this)) {
            return false;
        }
        try {
            C3906w u10 = C3884A.u(str, false);
            if (u10 != null) {
                return u10.A();
            }
            return false;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }
}
