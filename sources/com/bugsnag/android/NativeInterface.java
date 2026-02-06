package com.bugsnag.android;

import K4.k;
import K4.q;
import android.annotation.SuppressLint;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

public class NativeInterface {
    private static Charset UTF8Charset = Charset.defaultCharset();
    @SuppressLint({"StaticFieldLeak"})
    private static A client;

    class a implements C3242h1 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Severity f38557a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f38558b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f38559c;

        a(Severity severity, String str, String str2) {
            this.f38557a = severity;
            this.f38558b = str;
            this.f38559c = str2;
        }

        public boolean a(C3262o0 o0Var) {
            o0Var.z(this.f38557a);
            List<C3250k0> h10 = o0Var.h();
            C3250k0 k0Var = (C3250k0) o0Var.h().get(0);
            if (h10.isEmpty()) {
                return true;
            }
            k0Var.g(this.f38558b);
            k0Var.h(this.f38559c);
            for (C3250k0 i10 : h10) {
                i10.i(ErrorType.C);
            }
            return true;
        }
    }

    public static void addMetadata(String str, String str2, Object obj) {
        getClient().b(str, str2, obj);
    }

    public static void clearMetadata(String str, String str2) {
        if (str2 == null) {
            getClient().i(str);
        } else {
            getClient().j(str, str2);
        }
    }

    public static C3262o0 createEmptyEvent() {
        A client2 = getClient();
        return new C3262o0(new C3269r0((Throwable) null, client2.m(), q1.h("handledException"), client2.v().h().e()), client2.t());
    }

    public static C3262o0 createEvent(Throwable th2, A a10, q1 q1Var) {
        return new C3262o0(th2, a10.m(), q1Var, a10.v().h(), a10.r().g(), a10.f38381q);
    }

    private static void deepMerge(Map<String, Object> map, Map<String, Object> map2) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            Object obj = map2.get(str);
            if ((value instanceof Map) && (obj instanceof Map)) {
                deepMerge((Map) value, (Map) obj);
            } else if (!(value instanceof Collection) || !(obj instanceof Collection)) {
                map2.put(str, value);
            } else {
                ((Collection) obj).addAll((Collection) value);
            }
        }
    }

    public static void deliverReport(byte[] bArr, byte[] bArr2, byte[] bArr3, String str, boolean z10) {
        String str2;
        if (bArr3 != null) {
            q qVar = q.f32402a;
            Map d10 = qVar.d(new ByteArrayInputStream(bArr2));
            deepMerge(qVar.d(new ByteArrayInputStream(bArr3)), d10);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            qVar.f(d10, byteArrayOutputStream);
            bArr2 = byteArrayOutputStream.toByteArray();
        }
        String str3 = new String(bArr2, UTF8Charset);
        if (bArr == null) {
            str2 = null;
        } else {
            str2 = new String(bArr, UTF8Charset);
        }
        A client2 = getClient();
        k m10 = client2.m();
        if (str2 == null || str2.length() == 0 || !m10.M()) {
            C3283y0 q10 = client2.q();
            String D10 = q10.D(str3, str);
            if (z10) {
                D10 = D10.replace(".json", "startupcrash.json");
            }
            q10.d(str3, D10);
        }
    }

    public static Map<String, Object> getApp() {
        HashMap hashMap = new HashMap();
        C3249k k10 = getClient().k();
        C3258n e10 = k10.e();
        hashMap.put(DiagnosticsEntry.VERSION_KEY, e10.g());
        hashMap.put("releaseStage", e10.e());
        hashMap.put("id", e10.d());
        hashMap.put("type", e10.f());
        hashMap.put("buildUUID", e10.b());
        hashMap.put("duration", e10.j());
        hashMap.put("durationInForeground", e10.k());
        hashMap.put("versionCode", e10.h());
        hashMap.put("inForeground", e10.l());
        hashMap.put("isLaunching", e10.m());
        hashMap.put("binaryArch", e10.a());
        hashMap.putAll(k10.f());
        return hashMap;
    }

    public static String getAppVersion() {
        return getClient().m().d();
    }

    public static List<Breadcrumb> getBreadcrumbs() {
        return getClient().l();
    }

    private static A getClient() {
        A a10 = client;
        if (a10 != null) {
            return a10;
        }
        return C3270s.a();
    }

    public static String getContext() {
        return getClient().n();
    }

    public static String[] getCpuAbi() {
        return getClient().p().k();
    }

    public static C3254l1 getCurrentSession() {
        return getClient().f38379o.i();
    }

    public static Map<String, Object> getDevice() {
        C3223b0 p10 = getClient().p();
        HashMap hashMap = new HashMap(p10.l());
        C3244i0 j10 = p10.j(new Date().getTime());
        hashMap.put("freeDisk", j10.m());
        hashMap.put("freeMemory", j10.n());
        hashMap.put("orientation", j10.o());
        hashMap.put(com.amazon.a.a.h.a.f37179b, j10.p());
        hashMap.put("cpuAbi", j10.a());
        hashMap.put("jailbroken", j10.c());
        hashMap.put("id", j10.b());
        hashMap.put("locale", j10.d());
        hashMap.put("manufacturer", j10.e());
        hashMap.put("model", j10.f());
        hashMap.put("osName", j10.g());
        hashMap.put("osVersion", j10.h());
        hashMap.put("runtimeVersions", j10.i());
        hashMap.put("totalMemory", j10.j());
        return hashMap;
    }

    public static Collection<String> getEnabledReleaseStages() {
        return getClient().m().m();
    }

    public static String getEndpoint() {
        return getClient().m().n().a();
    }

    public static N0 getLastRunInfo() {
        return getClient().s();
    }

    public static S0 getLogger() {
        return getClient().m().r();
    }

    public static Map<String, Object> getMetadata() {
        return getClient().u();
    }

    public static File getNativeReportPath() {
        return getNativeReportPath(getPersistenceDirectory());
    }

    private static File getPersistenceDirectory() {
        return (File) getClient().m().z().getValue();
    }

    public static String getReleaseStage() {
        return getClient().m().C();
    }

    public static String getSessionEndpoint() {
        return getClient().m().n().b();
    }

    public static Map<String, String> getUser() {
        HashMap hashMap = new HashMap();
        L1 z10 = getClient().z();
        hashMap.put("id", z10.b());
        hashMap.put("name", z10.c());
        hashMap.put("email", z10.a());
        return hashMap;
    }

    public static boolean isDiscardErrorClass(String str) {
        Collection<Pattern> j10 = getClient().m().j();
        if (j10.isEmpty()) {
            return false;
        }
        for (Pattern matcher : j10) {
            if (matcher.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    public static void leaveBreadcrumb(String str, BreadcrumbType breadcrumbType) {
        if (str != null) {
            getClient().B(str, new HashMap(), breadcrumbType);
        }
    }

    public static void markLaunchCompleted() {
        getClient().E();
    }

    public static void notify(byte[] bArr, byte[] bArr2, Severity severity, StackTraceElement[] stackTraceElementArr) {
        if (bArr != null && bArr2 != null && stackTraceElementArr != null) {
            notify(new String(bArr, UTF8Charset), new String(bArr2, UTF8Charset), severity, stackTraceElementArr);
        }
    }

    public static void pauseSession() {
        getClient().I();
    }

    public static void registerSession(long j10, String str, int i10, int i11) {
        Date date;
        A client2 = getClient();
        L1 z10 = client2.z();
        if (j10 > 0) {
            date = new Date(j10);
        } else {
            date = null;
        }
        client2.y().n(date, str, z10, i10, i11);
    }

    public static boolean resumeSession() {
        return getClient().P();
    }

    public static void setAutoDetectAnrs(boolean z10) {
        getClient().Q(z10);
    }

    public static void setAutoNotify(boolean z10) {
        getClient().R(z10);
    }

    public static void setBinaryArch(String str) {
        getClient().S(str);
    }

    public static void setClient(A a10) {
        client = a10;
    }

    public static void setContext(String str) {
        getClient().U(str);
    }

    public static void setUser(String str, String str2, String str3) {
        getClient().V(str, str2, str3);
    }

    public static void startSession() {
        getClient().Z();
    }

    public static void addMetadata(String str, Map<String, ?> map) {
        getClient().c(str, map);
    }

    private static File getNativeReportPath(File file) {
        return new File(file, "bugsnag/native");
    }

    public static void leaveBreadcrumb(byte[] bArr, BreadcrumbType breadcrumbType) {
        if (bArr != null) {
            getClient().B(new String(bArr, UTF8Charset), new HashMap(), breadcrumbType);
        }
    }

    public static void setUser(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        String str;
        String str2 = null;
        String str3 = bArr == null ? null : new String(bArr, UTF8Charset);
        if (bArr2 == null) {
            str = null;
        } else {
            str = new String(bArr2, UTF8Charset);
        }
        if (bArr3 != null) {
            str2 = new String(bArr3, UTF8Charset);
        }
        setUser(str3, str, str2);
    }

    public static void leaveBreadcrumb(String str, String str2, Map<String, Object> map) {
        getClient().B(str, map, BreadcrumbType.valueOf(str2.toUpperCase(Locale.US)));
    }

    public static void notify(String str, String str2, Severity severity, StackTraceElement[] stackTraceElementArr) {
        if (!getClient().m().N(str)) {
            RuntimeException runtimeException = new RuntimeException();
            runtimeException.setStackTrace(stackTraceElementArr);
            getClient().F(runtimeException, new a(severity, str, str2));
        }
    }

    public static void notify(byte[] bArr, byte[] bArr2, Severity severity, NativeStackframe[] nativeStackframeArr) {
        if (bArr != null && bArr2 != null && nativeStackframeArr != null) {
            notify(new String(bArr, UTF8Charset), new String(bArr2, UTF8Charset), severity, nativeStackframeArr);
        }
    }

    public static void notify(String str, String str2, Severity severity, NativeStackframe[] nativeStackframeArr) {
        A client2 = getClient();
        if (!client2.m().N(str)) {
            C3262o0 createEmptyEvent = createEmptyEvent();
            createEmptyEvent.z(severity);
            ArrayList arrayList = new ArrayList(nativeStackframeArr.length);
            for (NativeStackframe s1Var : nativeStackframeArr) {
                arrayList.add(new s1(s1Var));
            }
            createEmptyEvent.h().add(new C3250k0(new C3256m0(str, str2, new u1(arrayList), ErrorType.C), client2.t()));
            getClient().K(createEmptyEvent, (C3242h1) null);
        }
    }

    public static void deliverReport(File file) {
        C3283y0 y0Var = getClient().f38378n;
        if (file.renameTo(new File(y0Var.h(), file.getName()))) {
            y0Var.v();
        } else {
            file.delete();
        }
    }
}
