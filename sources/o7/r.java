package o7;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

public final class r extends b0 {

    /* renamed from: q  reason: collision with root package name */
    public static final a f47287q = new a((DefaultConstructorMarker) null);

    /* renamed from: r  reason: collision with root package name */
    private static final String f47288r = r.class.getName();

    /* renamed from: p  reason: collision with root package name */
    private boolean f47289p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r a(Context context, String str, String str2) {
            C6496s.h(context, "context");
            C6496s.h(str, "url");
            C6496s.h(str2, "expectedRedirectUrl");
            b0.s(context);
            return new r(context, str, str2, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ r(Context context, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2);
    }

    /* access modifiers changed from: private */
    public static final void F(r rVar) {
        C6496s.h(rVar, "this$0");
        super.cancel();
    }

    public void cancel() {
        WebView r10 = r();
        if (!u() || t() || r10 == null || !r10.isShown()) {
            super.cancel();
        } else if (!this.f47289p) {
            this.f47289p = true;
            r10.loadUrl("javascript:" + "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            new Handler(Looper.getMainLooper()).postDelayed(new C3901q(this), 1500);
        }
    }

    public Bundle w(String str) {
        Bundle q02 = W.q0(Uri.parse(str).getQuery());
        String string = q02.getString("bridge_args");
        q02.remove("bridge_args");
        if (!W.e0(string)) {
            try {
                q02.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", C3888d.a(new JSONObject(string)));
            } catch (JSONException e10) {
                W.m0(f47288r, "Unable to parse bridge_args JSON", e10);
            }
        }
        String string2 = q02.getString("method_results");
        q02.remove("method_results");
        if (!W.e0(string2)) {
            try {
                q02.putBundle("com.facebook.platform.protocol.RESULT_ARGS", C3888d.a(new JSONObject(string2)));
            } catch (JSONException e11) {
                W.m0(f47288r, "Unable to parse bridge_args JSON", e11);
            }
        }
        q02.remove(DiagnosticsEntry.VERSION_KEY);
        q02.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", M.x());
        return q02;
    }

    private r(Context context, String str, String str2) {
        super(context, str);
        A(str2);
    }
}
