package q7;

import Sg.p;
import android.os.Build;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.File;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.W;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: h  reason: collision with root package name */
    public static final b f47756h = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private String f47757a;

    /* renamed from: b  reason: collision with root package name */
    private C0718c f47758b;

    /* renamed from: c  reason: collision with root package name */
    private JSONArray f47759c;

    /* renamed from: d  reason: collision with root package name */
    private String f47760d;

    /* renamed from: e  reason: collision with root package name */
    private String f47761e;

    /* renamed from: f  reason: collision with root package name */
    private String f47762f;

    /* renamed from: g  reason: collision with root package name */
    private Long f47763g;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f47764a = new a();

        private a() {
        }

        public static final c a(String str, String str2) {
            return new c(str, str2, (DefaultConstructorMarker) null);
        }

        public static final c b(Throwable th2, C0718c cVar) {
            C6496s.h(cVar, "t");
            return new c(th2, cVar, (DefaultConstructorMarker) null);
        }

        public static final c c(JSONArray jSONArray) {
            C6496s.h(jSONArray, "features");
            return new c(jSONArray, (DefaultConstructorMarker) null);
        }

        public static final c d(File file) {
            C6496s.h(file, "file");
            return new c(file, (DefaultConstructorMarker) null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final C0718c b(String str) {
            if (p.J(str, "crash_log_", false, 2, (Object) null)) {
                return C0718c.CrashReport;
            }
            if (p.J(str, "shield_log_", false, 2, (Object) null)) {
                return C0718c.CrashShield;
            }
            if (p.J(str, "thread_check_log_", false, 2, (Object) null)) {
                return C0718c.ThreadCheck;
            }
            if (p.J(str, "analysis_log_", false, 2, (Object) null)) {
                return C0718c.Analysis;
            }
            if (p.J(str, "anr_log_", false, 2, (Object) null)) {
                return C0718c.AnrReport;
            }
            return C0718c.Unknown;
        }

        private b() {
        }
    }

    /* renamed from: q7.c$c  reason: collision with other inner class name */
    public enum C0718c {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* renamed from: q7.c$c$a */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f47772a = null;

            /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    q7.c$c[] r0 = q7.c.C0718c.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    q7.c$c r1 = q7.c.C0718c.Analysis     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    q7.c$c r1 = q7.c.C0718c.AnrReport     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    q7.c$c r1 = q7.c.C0718c.CrashReport     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    q7.c$c r1 = q7.c.C0718c.CrashShield     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    q7.c$c r1 = q7.c.C0718c.ThreadCheck     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    f47772a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: q7.c.C0718c.a.<clinit>():void");
            }
        }

        public final String b() {
            int i10 = a.f47772a[ordinal()];
            if (i10 == 1) {
                return "analysis_log_";
            }
            if (i10 == 2) {
                return "anr_log_";
            }
            if (i10 == 3) {
                return "crash_log_";
            }
            if (i10 == 4) {
                return "shield_log_";
            }
            if (i10 != 5) {
                return "Unknown";
            }
            return "thread_check_log_";
        }

        public String toString() {
            int i10 = a.f47772a[ordinal()];
            if (i10 == 1) {
                return "Analysis";
            }
            if (i10 == 2) {
                return "AnrReport";
            }
            if (i10 == 3) {
                return "CrashReport";
            }
            if (i10 == 4) {
                return "CrashShield";
            }
            if (i10 != 5) {
                return "Unknown";
            }
            return "ThreadCheck";
        }
    }

    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f47773a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                q7.c$c[] r0 = q7.c.C0718c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                q7.c$c r1 = q7.c.C0718c.Analysis     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                q7.c$c r1 = q7.c.C0718c.AnrReport     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                q7.c$c r1 = q7.c.C0718c.CrashReport     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                q7.c$c r1 = q7.c.C0718c.CrashShield     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                q7.c$c r1 = q7.c.C0718c.ThreadCheck     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f47773a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.c.d.<clinit>():void");
        }
    }

    public /* synthetic */ c(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }

    private final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.f47759c;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            Long l10 = this.f47763g;
            if (l10 != null) {
                jSONObject.put(DiagnosticsEntry.TIMESTAMP_KEY, l10);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.f47760d;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l10 = this.f47763g;
            if (l10 != null) {
                jSONObject.put(DiagnosticsEntry.TIMESTAMP_KEY, l10);
            }
            String str2 = this.f47761e;
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            String str3 = this.f47762f;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            C0718c cVar = this.f47758b;
            if (cVar != null) {
                jSONObject.put("type", cVar);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject e() {
        int i10;
        C0718c cVar = this.f47758b;
        if (cVar == null) {
            i10 = -1;
        } else {
            i10 = d.f47773a[cVar.ordinal()];
        }
        if (i10 == 1) {
            return c();
        }
        if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
            return d();
        }
        return null;
    }

    public final void a() {
        k.d(this.f47757a);
    }

    public final int b(c cVar) {
        C6496s.h(cVar, "data");
        Long l10 = this.f47763g;
        if (l10 == null) {
            return -1;
        }
        long longValue = l10.longValue();
        Long l11 = cVar.f47763g;
        if (l11 != null) {
            return C6496s.j(l11.longValue(), longValue);
        }
        return 1;
    }

    public final boolean f() {
        int i10;
        C0718c cVar = this.f47758b;
        if (cVar == null) {
            i10 = -1;
        } else {
            i10 = d.f47773a[cVar.ordinal()];
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (!(i10 == 3 || i10 == 4 || i10 == 5) || this.f47762f == null || this.f47763g == null) {
                    return false;
                }
            } else if (this.f47762f == null || this.f47761e == null || this.f47763g == null) {
                return false;
            }
        } else if (this.f47759c == null || this.f47763g == null) {
            return false;
        }
        return true;
    }

    public final void g() {
        if (f()) {
            k.t(this.f47757a, toString());
        }
    }

    public String toString() {
        JSONObject e10 = e();
        if (e10 == null) {
            String jSONObject = new JSONObject().toString();
            C6496s.g(jSONObject, "JSONObject().toString()");
            return jSONObject;
        }
        String jSONObject2 = e10.toString();
        C6496s.g(jSONObject2, "params.toString()");
        return jSONObject2;
    }

    public /* synthetic */ c(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public /* synthetic */ c(Throwable th2, C0718c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, cVar);
    }

    public /* synthetic */ c(JSONArray jSONArray, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONArray);
    }

    private c(JSONArray jSONArray) {
        this.f47758b = C0718c.Analysis;
        this.f47763g = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.f47759c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("analysis_log_");
        stringBuffer.append(String.valueOf(this.f47763g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        C6496s.g(stringBuffer2, "StringBuffer()\n         …)\n            .toString()");
        this.f47757a = stringBuffer2;
    }

    private c(Throwable th2, C0718c cVar) {
        this.f47758b = cVar;
        this.f47760d = W.w();
        this.f47761e = k.e(th2);
        this.f47762f = k.h(th2);
        this.f47763g = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(cVar.b());
        stringBuffer.append(String.valueOf(this.f47763g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        C6496s.g(stringBuffer2, "StringBuffer().append(t.…ppend(\".json\").toString()");
        this.f47757a = stringBuffer2;
    }

    private c(String str, String str2) {
        this.f47758b = C0718c.AnrReport;
        this.f47760d = W.w();
        this.f47761e = str;
        this.f47762f = str2;
        this.f47763g = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("anr_log_");
        stringBuffer.append(String.valueOf(this.f47763g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        C6496s.g(stringBuffer2, "StringBuffer()\n         …)\n            .toString()");
        this.f47757a = stringBuffer2;
    }

    private c(File file) {
        String name = file.getName();
        C6496s.g(name, "file.name");
        this.f47757a = name;
        this.f47758b = f47756h.b(name);
        JSONObject r10 = k.r(this.f47757a, true);
        if (r10 != null) {
            this.f47763g = Long.valueOf(r10.optLong(DiagnosticsEntry.TIMESTAMP_KEY, 0));
            this.f47760d = r10.optString("app_version", (String) null);
            this.f47761e = r10.optString("reason", (String) null);
            this.f47762f = r10.optString("callstack", (String) null);
            this.f47759c = r10.optJSONArray("feature_names");
        }
    }
}
