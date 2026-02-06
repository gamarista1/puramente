package C7;

import Sg.m;
import Sg.p;
import android.net.Uri;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.common.Constants;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import mf.C6565s;
import org.json.JSONException;
import org.json.JSONObject;

public final class c extends RuntimeException {

    /* renamed from: b  reason: collision with root package name */
    public static final a f30085b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final String f30086c = "\n\nTry the following to fix the issue:\n\\u2022 Ensure that Metro is running\n\\u2022 Ensure that your device/emulator is connected to your machine and has USB debugging enabled - run 'adb devices' to see a list of connected devices\n\\u2022 Ensure Airplane Mode is disabled\n\\u2022 If you're on a physical device connected to the same machine, run 'adb reverse tcp:<PORT> tcp:<PORT> to forward requests from your device\n\\u2022 If your device is on the same Wi-Fi network, set 'Debug server host & port for device' in 'Dev settings' to your machine's IP address and the port of the local dev server - e.g. 10.0.1.1:<PORT>\n\n";

    /* renamed from: a  reason: collision with root package name */
    private final String f30087a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String d(String str) {
            List list;
            List g10 = new m("/").g(str, 0);
            if (!g10.isEmpty()) {
                ListIterator listIterator = g10.listIterator(g10.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            list = C6565s.V0(g10, listIterator.nextIndex() + 1);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            list = C6565s.n();
            return (String) C6559l.O0((String[]) list.toArray(new String[0]));
        }

        public final c a(String str, String str2, String str3, Throwable th2) {
            C6496s.h(str, "url");
            C6496s.h(str2, "reason");
            C6496s.h(str3, "extra");
            String D10 = p.D(c.f30086c, "<PORT>", String.valueOf(Uri.parse(str).getPort()), false, 4, (Object) null);
            return new c(str2 + D10 + str3, th2);
        }

        public final c b(String str, String str2, Throwable th2) {
            C6496s.h(str, "url");
            C6496s.h(str2, "reason");
            return a(str, str2, "", th2);
        }

        public final c c(String str, String str2) {
            if (!(str2 == null || str2.length() == 0)) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    String string = jSONObject.getString("filename");
                    String string2 = jSONObject.getString(MetricTracker.Object.MESSAGE);
                    C6496s.g(string2, "getString(...)");
                    C6496s.e(string);
                    return new c(string2, d(string), jSONObject.getInt("lineNumber"), jSONObject.getInt("column"), (DefaultConstructorMarker) null);
                } catch (JSONException e10) {
                    U5.a.J("ReactNative", "Could not parse DebugServerException from: " + str2, e10);
                }
            }
            return null;
        }

        private a() {
        }
    }

    public /* synthetic */ c(String str, String str2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i10, i11);
    }

    public static final c b(String str, String str2, String str3, Throwable th2) {
        return f30085b.a(str, str2, str3, th2);
    }

    public static final c c(String str, String str2, Throwable th2) {
        return f30085b.b(str, str2, th2);
    }

    public static final c d(String str, String str2) {
        return f30085b.c(str, str2);
    }

    private c(String str, String str2, int i10, int i11) {
        super(str + "\n  at " + str2 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + i10 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + i11);
        this.f30087a = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(String str) {
        super(str);
        C6496s.h(str, b.f37480c);
        this.f30087a = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(String str, Throwable th2) {
        super(str, th2);
        C6496s.h(str, "detailMessage");
        this.f30087a = str;
    }
}
