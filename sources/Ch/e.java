package Ch;

import Sg.p;
import android.util.Log;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.C6496s;
import mf.O;
import rh.C6703A;
import vh.C6760e;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f62641a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final CopyOnWriteArraySet f62642b = new CopyOnWriteArraySet();

    /* renamed from: c  reason: collision with root package name */
    private static final Map f62643c;

    static {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<C6703A> cls = C6703A.class;
        Package packageR = cls.getPackage();
        if (packageR != null) {
            str = packageR.getName();
        } else {
            str = null;
        }
        if (str != null) {
            linkedHashMap.put(str, "OkHttp");
        }
        String name = cls.getName();
        C6496s.g(name, "OkHttpClient::class.java.name");
        linkedHashMap.put(name, "okhttp.OkHttpClient");
        String name2 = zh.e.class.getName();
        C6496s.g(name2, "Http2::class.java.name");
        linkedHashMap.put(name2, "okhttp.Http2");
        String name3 = C6760e.class.getName();
        C6496s.g(name3, "TaskRunner::class.java.name");
        linkedHashMap.put(name3, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f62643c = O.y(linkedHashMap);
    }

    private e() {
    }

    private final void c(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (f62642b.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else if (Log.isLoggable(str2, 4)) {
                level = Level.INFO;
            } else {
                level = Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(f.f62644a);
        }
    }

    private final String d(String str) {
        String str2 = (String) f62643c.get(str);
        if (str2 == null) {
            return p.m1(str, 23);
        }
        return str2;
    }

    public final void a(String str, int i10, String str2, Throwable th2) {
        int min;
        C6496s.h(str, "loggerName");
        C6496s.h(str2, MetricTracker.Object.MESSAGE);
        String d10 = d(str);
        if (Log.isLoggable(d10, i10)) {
            if (th2 != null) {
                str2 = str2 + 10 + Log.getStackTraceString(th2);
            }
            int length = str2.length();
            int i11 = 0;
            while (i11 < length) {
                int a02 = p.a0(str2, 10, i11, false, 4, (Object) null);
                if (a02 == -1) {
                    a02 = length;
                }
                while (true) {
                    min = Math.min(a02, i11 + 4000);
                    String substring = str2.substring(i11, min);
                    C6496s.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, d10, substring);
                    if (min >= a02) {
                        break;
                    }
                    i11 = min;
                }
                i11 = min + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry entry : f62643c.entrySet()) {
            c((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
