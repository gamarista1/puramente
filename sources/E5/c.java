package E5;

import G5.f;
import com.facebook.I;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import o7.C3905v;
import org.json.JSONObject;
import t7.C4049a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f30642a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f30643b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f30644c;

    private c() {
    }

    public static final void a() {
        Class<c> cls = c.class;
        if (!C4049a.d(cls)) {
            try {
                f30643b = true;
                f30644c = C3905v.d("FBSDKFeatureIntegritySample", I.m(), false);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final String b(String str) {
        String str2;
        if (C4049a.d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            String[] q10 = f.q(f.a.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
            if (q10 == null || (str2 = q10[0]) == null) {
                return "none";
            }
            return str2;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public static final void c(Map map) {
        Class<c> cls = c.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(map, "parameters");
                if (f30643b && !map.isEmpty()) {
                    try {
                        List<String> e12 = C6565s.e1(map.keySet());
                        JSONObject jSONObject = new JSONObject();
                        for (String str : e12) {
                            Object obj = map.get(str);
                            if (obj != null) {
                                String str2 = (String) obj;
                                c cVar = f30642a;
                                if (!cVar.d(str)) {
                                    if (cVar.d(str2)) {
                                    }
                                }
                                map.remove(str);
                                if (!f30644c) {
                                    str2 = "";
                                }
                                jSONObject.put(str, str2);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        if (jSONObject.length() != 0) {
                            String jSONObject2 = jSONObject.toString();
                            C6496s.g(jSONObject2, "restrictiveParamJson.toString()");
                            map.put("_onDeviceParams", jSONObject2);
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final boolean d(String str) {
        if (C4049a.d(this)) {
            return false;
        }
        try {
            return !C6496s.c("none", b(str));
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }
}
