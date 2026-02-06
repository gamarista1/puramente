package a8;

import Gh.C5407h;
import a8.e;
import android.net.Uri;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.branch.rnbranch.RNBranchModule;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Map;
import org.json.JSONObject;

public final class b implements e.c {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final String f36154c = "b";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public e f36155a;

    /* renamed from: b  reason: collision with root package name */
    private Map f36156b;

    private class a implements h {

        /* renamed from: a  reason: collision with root package name */
        private Object f36157a;

        public a(Object obj) {
            this.f36157a = obj;
        }

        public void a(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(DiagnosticsEntry.VERSION_KEY, 2);
                jSONObject.put("id", this.f36157a);
                jSONObject.put("result", obj);
                b.this.f36155a.h(jSONObject.toString());
            } catch (Exception e10) {
                U5.a.n(b.f36154c, "Responding failed", e10);
            }
        }

        public void b(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(DiagnosticsEntry.VERSION_KEY, 2);
                jSONObject.put("id", this.f36157a);
                jSONObject.put(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR, obj);
                b.this.f36155a.h(jSONObject.toString());
            } catch (Exception e10) {
                U5.a.n(b.f36154c, "Responding with error failed", e10);
            }
        }
    }

    public b(String str, d dVar, Map map, e.b bVar) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("ws").encodedAuthority(dVar.b()).appendPath(MetricTracker.Object.MESSAGE).appendQueryParameter("device", com.facebook.react.modules.systeminfo.a.d()).appendQueryParameter("app", dVar.c()).appendQueryParameter("clientid", str);
        this.f36155a = new e(builder.build().toString(), this, bVar);
        this.f36156b = map;
    }

    private void d(Object obj, String str) {
        if (obj != null) {
            new a(obj).b(str);
        }
        String str2 = f36154c;
        U5.a.m(str2, "Handling the message failed with reason: " + str);
    }

    public void a(C5407h hVar) {
        U5.a.I(f36154c, "Websocket received message with payload of unexpected type binary");
    }

    public void e() {
        this.f36155a.c();
    }

    public void f() {
        this.f36155a.e();
    }

    public void onMessage(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt(DiagnosticsEntry.VERSION_KEY);
            String optString = jSONObject.optString("method");
            Object opt = jSONObject.opt("id");
            Object opt2 = jSONObject.opt(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS);
            if (optInt != 2) {
                String str2 = f36154c;
                U5.a.m(str2, "Message with incompatible or missing version of protocol received: " + optInt);
            } else if (optString == null) {
                d(opt, "No method provided");
            } else {
                f fVar = (f) this.f36156b.get(optString);
                if (fVar == null) {
                    d(opt, "No request handler for method: " + optString);
                } else if (opt == null) {
                    fVar.a(opt2);
                } else {
                    fVar.b(opt2, new a(opt));
                }
            }
        } catch (Exception e10) {
            U5.a.n(f36154c, "Handling the message failed", e10);
        }
    }
}
