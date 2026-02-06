package r7;

import Ef.m;
import com.amazon.device.simplesignin.a.a.a;
import com.facebook.I;
import com.facebook.S;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mf.L;
import o7.W;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q7.c;
import q7.k;
import t7.C4049a;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f47991a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f47992b = new AtomicBoolean(false);

    private e() {
    }

    public static final synchronized void c() {
        synchronized (e.class) {
            if (!C4049a.d(e.class)) {
                try {
                    if (!f47992b.getAndSet(true)) {
                        if (I.p()) {
                            d();
                        }
                        b.d();
                    }
                } catch (Throwable th2) {
                    C4049a.b(th2, e.class);
                }
            }
        }
    }

    public static final void d() {
        Class<e> cls = e.class;
        if (!C4049a.d(cls)) {
            try {
                if (!W.b0()) {
                    File[] l10 = k.l();
                    ArrayList arrayList = new ArrayList(l10.length);
                    for (File d10 : l10) {
                        arrayList.add(c.a.d(d10));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object next : arrayList) {
                        if (((c) next).f()) {
                            arrayList2.add(next);
                        }
                    }
                    List U02 = C6565s.U0(arrayList2, new c());
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = m.u(0, Math.min(U02.size(), 5)).iterator();
                    while (it.hasNext()) {
                        jSONArray.put(U02.get(((L) it).a()));
                    }
                    k.s("anr_reports", jSONArray, new d(U02));
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final int e(c cVar, c cVar2) {
        Class<e> cls = e.class;
        if (C4049a.d(cls)) {
            return 0;
        }
        try {
            C6496s.g(cVar2, "o2");
            return cVar.b(cVar2);
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return 0;
        }
    }

    /* access modifiers changed from: private */
    public static final void f(List list, S s10) {
        JSONObject d10;
        Class<e> cls = e.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(list, "$validReports");
                C6496s.h(s10, "response");
                try {
                    if (s10.b() == null && (d10 = s10.d()) != null && d10.getBoolean(a.f38020s)) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((c) it.next()).a();
                        }
                    }
                } catch (JSONException unused) {
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }
}
