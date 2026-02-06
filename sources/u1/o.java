package u1;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    private static long f26550a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f26551b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f26552c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f26553d;

    /* renamed from: e  reason: collision with root package name */
    private static Method f26554e;

    static {
        Class<String> cls = String.class;
        Class<Trace> cls2 = Trace.class;
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f26550a = cls2.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls3 = Long.TYPE;
                f26551b = cls2.getMethod("isTagEnabled", new Class[]{cls3});
                Class cls4 = Integer.TYPE;
                f26552c = cls2.getMethod("asyncTraceBegin", new Class[]{cls3, cls, cls4});
                f26553d = cls2.getMethod("asyncTraceEnd", new Class[]{cls3, cls, cls4});
                f26554e = cls2.getMethod("traceCounter", new Class[]{cls3, cls, cls4});
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
