package s7;

import Ef.m;
import android.util.Log;
import com.facebook.I;
import com.facebook.S;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import mf.L;
import o7.W;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q7.b;
import q7.c;
import q7.k;

public final class c implements Thread.UncaughtExceptionHandler {

    /* renamed from: b  reason: collision with root package name */
    public static final a f48083b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final String f48084c = c.class.getCanonicalName();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static c f48085d;

    /* renamed from: a  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f48086a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void d() {
            if (!W.b0()) {
                File[] p10 = k.p();
                ArrayList arrayList = new ArrayList(p10.length);
                for (File d10 : p10) {
                    arrayList.add(c.a.d(d10));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object next : arrayList) {
                    if (((q7.c) next).f()) {
                        arrayList2.add(next);
                    }
                }
                List U02 = C6565s.U0(arrayList2, new C3991a());
                JSONArray jSONArray = new JSONArray();
                Iterator it = m.u(0, Math.min(U02.size(), 5)).iterator();
                while (it.hasNext()) {
                    jSONArray.put(U02.get(((L) it).a()));
                }
                k.s("crash_reports", jSONArray, new b(U02));
            }
        }

        /* access modifiers changed from: private */
        public static final int e(q7.c cVar, q7.c cVar2) {
            C6496s.g(cVar2, "o2");
            return cVar.b(cVar2);
        }

        /* access modifiers changed from: private */
        public static final void f(List list, S s10) {
            JSONObject d10;
            C6496s.h(list, "$validReports");
            C6496s.h(s10, "response");
            try {
                if (s10.b() == null && (d10 = s10.d()) != null && d10.getBoolean(com.amazon.device.simplesignin.a.a.a.f38020s)) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((q7.c) it.next()).a();
                    }
                }
            } catch (JSONException unused) {
            }
        }

        public final synchronized void c() {
            try {
                if (I.p()) {
                    d();
                }
                if (c.f48085d != null) {
                    Log.w(c.f48084c, "Already enabled!");
                    return;
                }
                c.f48085d = new c(Thread.getDefaultUncaughtExceptionHandler(), (DefaultConstructorMarker) null);
                Thread.setDefaultUncaughtExceptionHandler(c.f48085d);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }

        private a() {
        }
    }

    public /* synthetic */ c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, DefaultConstructorMarker defaultConstructorMarker) {
        this(uncaughtExceptionHandler);
    }

    public void uncaughtException(Thread thread, Throwable th2) {
        C6496s.h(thread, "t");
        C6496s.h(th2, "e");
        if (k.j(th2)) {
            b.c(th2);
            c.a.b(th2, c.C0718c.CrashReport).g();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f48086a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }

    private c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f48086a = uncaughtExceptionHandler;
    }
}
