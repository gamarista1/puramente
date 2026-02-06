package q7;

import com.amazon.device.simplesignin.a.a.a;
import com.facebook.C3286a;
import com.facebook.I;
import com.facebook.M;
import com.facebook.Q;
import com.facebook.S;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.U;
import o7.C3902s;
import o7.W;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q7.c;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f47754a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f47755b;

    private b() {
    }

    public static final void b() {
        f47755b = true;
        if (I.p()) {
            f47754a.e();
        }
    }

    public static final void c(Throwable th2) {
        if (f47755b && !d() && th2 != null) {
            HashSet hashSet = new HashSet();
            StackTraceElement[] stackTrace = th2.getStackTrace();
            C6496s.g(stackTrace, "e.stackTrace");
            for (StackTraceElement className : stackTrace) {
                String className2 = className.getClassName();
                C6496s.g(className2, "it.className");
                C3902s.b d10 = C3902s.d(className2);
                if (d10 != C3902s.b.Unknown) {
                    C3902s.c(d10);
                    hashSet.add(d10.toString());
                }
            }
            if (I.p() && !hashSet.isEmpty()) {
                c.a.c(new JSONArray(hashSet)).g();
            }
        }
    }

    public static final boolean d() {
        return false;
    }

    /* access modifiers changed from: private */
    public static final void f(c cVar, S s10) {
        JSONObject d10;
        C6496s.h(cVar, "$instrumentData");
        C6496s.h(s10, "response");
        try {
            if (s10.b() == null && (d10 = s10.d()) != null && d10.getBoolean(a.f38020s)) {
                cVar.a();
            }
        } catch (JSONException unused) {
        }
    }

    public final void e() {
        if (!W.b0()) {
            File[] n10 = k.n();
            ArrayList arrayList = new ArrayList();
            for (File d10 : n10) {
                c d11 = c.a.d(d10);
                if (d11.f()) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("crash_shield", d11.toString());
                        M.c cVar = M.f39311n;
                        U u10 = U.f71764a;
                        String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{I.m()}, 1));
                        C6496s.g(format, "format(format, *args)");
                        arrayList.add(cVar.A((C3286a) null, format, jSONObject, new C3958a(d11)));
                    } catch (JSONException unused) {
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                new Q((Collection) arrayList).m();
            }
        }
    }
}
