package expo.modules.kotlin.views;

import Ff.d;
import Ff.p;
import ae.C4464a;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import fe.C4992b;
import ie.C5035e;
import ie.C5038h;
import ie.m;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mf.O;
import xf.C6781a;
import yf.C6798l;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final d f60477a;

    /* renamed from: b  reason: collision with root package name */
    private final p f60478b;

    /* renamed from: c  reason: collision with root package name */
    private Map f60479c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private C6798l f60480d;

    /* renamed from: e  reason: collision with root package name */
    private C6798l f60481e;

    /* renamed from: f  reason: collision with root package name */
    private b f60482f;

    /* renamed from: g  reason: collision with root package name */
    private Map f60483g = new LinkedHashMap();

    /* renamed from: h  reason: collision with root package name */
    private Map f60484h = new LinkedHashMap();

    public l(d dVar, p pVar) {
        C6496s.h(dVar, "viewClass");
        C6496s.h(pVar, "viewType");
        this.f60477a = dVar;
        this.f60478b = pVar;
    }

    private final yf.p d() {
        return new k(this);
    }

    /* access modifiers changed from: private */
    public static final View e(l lVar, Context context, C4464a aVar) {
        Constructor constructor;
        Class<Context> cls = Context.class;
        C6496s.h(context, "context");
        C6496s.h(aVar, "appContext");
        Constructor constructor2 = null;
        try {
            constructor = C6781a.b(lVar.f60477a).getConstructor(new Class[]{cls, C4464a.class});
        } catch (NoSuchMethodException unused) {
            constructor = null;
        }
        if (constructor != null) {
            try {
                return (View) constructor.newInstance(new Object[]{context, aVar});
            } catch (Throwable th2) {
                return lVar.g(context, aVar, th2);
            }
        } else {
            try {
                constructor2 = C6781a.b(lVar.f60477a).getConstructor(new Class[]{cls});
            } catch (NoSuchMethodException unused2) {
            }
            if (constructor2 != null) {
                try {
                    return (View) constructor2.newInstance(new Object[]{context});
                } catch (Throwable th3) {
                    return lVar.g(context, aVar, th3);
                }
            } else {
                throw new IllegalStateException("Didn't find a correct constructor for " + lVar.f60477a);
            }
        }
    }

    private final View g(Context context, C4464a aVar, Throwable th2) {
        CodedException codedException;
        d dVar = this.f60477a;
        Log.e("ExpoModulesCore", "Couldn't create view of type " + dVar, th2);
        C4992b m10 = aVar.m();
        if (m10 != null) {
            if (th2 instanceof CodedException) {
                codedException = (CodedException) th2;
            } else {
                codedException = new UnexpectedException(th2);
            }
            m10.k(codedException);
        }
        if (ViewGroup.class.isAssignableFrom(C6781a.b(this.f60477a))) {
            return new d(context);
        }
        return new e(context);
    }

    public final void b(String... strArr) {
        C6496s.h(strArr, "callbacks");
        this.f60482f = new b(strArr);
    }

    public final n c() {
        Map map = this.f60483g;
        Map map2 = this.f60484h;
        LinkedHashMap linkedHashMap = new LinkedHashMap(O.e(map2.size()));
        for (Map.Entry entry : map2.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((C5035e) entry.getValue()).a());
        }
        Map p10 = O.p(map, linkedHashMap);
        for (Map.Entry value : p10.entrySet()) {
            C5038h hVar = (C5038h) value.getValue();
            hVar.m(m.MAIN);
            hVar.k(this.f60478b);
            hVar.j(true);
        }
        return new n(d(), C6781a.b(this.f60477a), this.f60479c, this.f60480d, this.f60482f, (m) null, this.f60481e, C6565s.e1(p10.values()));
    }

    public final Map f() {
        return this.f60479c;
    }

    public final void h(C6798l lVar) {
        this.f60480d = lVar;
    }
}
