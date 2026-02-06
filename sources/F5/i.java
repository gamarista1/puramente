package F5;

import android.content.Context;
import com.facebook.V;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.O;
import o7.C3886b;
import o7.J;
import o7.W;
import org.json.JSONObject;
import t5.C4039p;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f30764a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final Map f30765b = O.k(C6502A.a(a.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), C6502A.a(a.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    public enum a {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    private i() {
    }

    public static final JSONObject a(a aVar, C3886b bVar, String str, boolean z10, Context context) {
        C6496s.h(aVar, "activityType");
        C6496s.h(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f30765b.get(aVar));
        String e10 = C4039p.f48255b.e();
        if (e10 != null) {
            jSONObject.put("app_user_id", e10);
        }
        W.G0(jSONObject, bVar, str, z10, context);
        try {
            W.H0(jSONObject, context);
        } catch (Exception e11) {
            J.f47112e.c(V.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e11.toString());
        }
        JSONObject D10 = W.D();
        if (D10 != null) {
            Iterator<String> keys = D10.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, D10.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
