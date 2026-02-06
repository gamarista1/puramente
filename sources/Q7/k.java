package q7;

import Sg.C5541d;
import Sg.m;
import Sg.p;
import com.facebook.C3286a;
import com.facebook.I;
import com.facebook.M;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.U;
import o7.W;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f47775a = new k();

    private k() {
    }

    public static final boolean d(String str) {
        File f10 = f();
        if (f10 == null || str == null) {
            return false;
        }
        return new File(f10, str).delete();
    }

    public static final String e(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        if (th2.getCause() == null) {
            return th2.toString();
        }
        return String.valueOf(th2.getCause());
    }

    public static final File f() {
        File file = new File(I.l().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static final String g(Thread thread) {
        C6496s.h(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        C6496s.g(stackTrace, "stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    public static final String h(Throwable th2) {
        Throwable th3 = null;
        if (th2 == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th2 != null && th2 != th3) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            C6496s.g(stackTrace, "t.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                jSONArray.put(stackTraceElement.toString());
            }
            th3 = th2;
            th2 = th2.getCause();
        }
        return jSONArray.toString();
    }

    public static final boolean i(StackTraceElement stackTraceElement) {
        C6496s.h(stackTraceElement, "element");
        String className = stackTraceElement.getClassName();
        C6496s.g(className, "element.className");
        if (!p.J(className, "com.facebook", false, 2, (Object) null)) {
            String className2 = stackTraceElement.getClassName();
            C6496s.g(className2, "element.className");
            if (p.J(className2, "com.meta", false, 2, (Object) null)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean j(Throwable th2) {
        if (th2 == null) {
            return false;
        }
        Throwable th3 = null;
        while (th2 != null && th2 != th3) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            C6496s.g(stackTrace, "t.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                C6496s.g(stackTraceElement, "element");
                if (i(stackTraceElement)) {
                    return true;
                }
            }
            th3 = th2;
            th2 = th2.getCause();
        }
        return false;
    }

    public static final boolean k(Thread thread) {
        StackTraceElement[] stackTrace;
        if (!(thread == null || (stackTrace = thread.getStackTrace()) == null)) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                C6496s.g(stackTraceElement, "element");
                if (i(stackTraceElement)) {
                    String className = stackTraceElement.getClassName();
                    C6496s.g(className, "element.className");
                    if (!p.J(className, "com.facebook.appevents.codeless", false, 2, (Object) null)) {
                        String className2 = stackTraceElement.getClassName();
                        C6496s.g(className2, "element.className");
                        if (!p.J(className2, "com.facebook.appevents.suggestedevents", false, 2, (Object) null)) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    C6496s.g(methodName, "element.methodName");
                    if (!p.J(methodName, "onClick", false, 2, (Object) null)) {
                        String methodName2 = stackTraceElement.getMethodName();
                        C6496s.g(methodName2, "element.methodName");
                        if (!p.J(methodName2, "onItemClick", false, 2, (Object) null)) {
                            String methodName3 = stackTraceElement.getMethodName();
                            C6496s.g(methodName3, "element.methodName");
                            if (!p.J(methodName3, "onTouch", false, 2, (Object) null)) {
                                return true;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
    }

    public static final File[] l() {
        File f10 = f();
        if (f10 == null) {
            return new File[0];
        }
        File[] listFiles = f10.listFiles(new i());
        if (listFiles == null) {
            return new File[0];
        }
        return listFiles;
    }

    /* access modifiers changed from: private */
    public static final boolean m(File file, String str) {
        C6496s.g(str, "name");
        U u10 = U.f71764a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1));
        C6496s.g(format, "format(format, *args)");
        return new m(format).d(str);
    }

    public static final File[] n() {
        File f10 = f();
        if (f10 == null) {
            return new File[0];
        }
        File[] listFiles = f10.listFiles(new j());
        if (listFiles == null) {
            return new File[0];
        }
        return listFiles;
    }

    /* access modifiers changed from: private */
    public static final boolean o(File file, String str) {
        C6496s.g(str, "name");
        U u10 = U.f71764a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1));
        C6496s.g(format, "format(format, *args)");
        return new m(format).d(str);
    }

    public static final File[] p() {
        File f10 = f();
        if (f10 == null) {
            return new File[0];
        }
        File[] listFiles = f10.listFiles(new h());
        if (listFiles == null) {
            return new File[0];
        }
        return listFiles;
    }

    /* access modifiers changed from: private */
    public static final boolean q(File file, String str) {
        C6496s.g(str, "name");
        U u10 = U.f71764a;
        String format = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3));
        C6496s.g(format, "format(format, *args)");
        return new m(format).d(str);
    }

    public static final JSONObject r(String str, boolean z10) {
        File f10 = f();
        if (!(f10 == null || str == null)) {
            try {
                return new JSONObject(W.w0(new FileInputStream(new File(f10, str))));
            } catch (Exception unused) {
                if (z10) {
                    d(str);
                }
            }
        }
        return null;
    }

    public static final void s(String str, JSONArray jSONArray, M.b bVar) {
        C6496s.h(jSONArray, "reports");
        if (jSONArray.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str, jSONArray.toString());
                JSONObject D10 = W.D();
                if (D10 != null) {
                    Iterator<String> keys = D10.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, D10.get(next));
                    }
                }
                M.c cVar = M.f39311n;
                U u10 = U.f71764a;
                String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{I.m()}, 1));
                C6496s.g(format, "format(format, *args)");
                cVar.A((C3286a) null, format, jSONObject, bVar).l();
            } catch (JSONException unused) {
            }
        }
    }

    public static final void t(String str, String str2) {
        File f10 = f();
        if (f10 != null && str != null && str2 != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(f10, str));
                byte[] bytes = str2.getBytes(C5541d.f65029b);
                C6496s.g(bytes, "this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        }
    }
}
