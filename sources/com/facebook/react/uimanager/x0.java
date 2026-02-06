package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.uimanager.D0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class x0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Map f41835a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final Map f41836b = new HashMap();

    private static class a implements d {

        /* renamed from: a  reason: collision with root package name */
        private final Map f41837a;

        public void a(Map map) {
            for (D0.m mVar : this.f41837a.values()) {
                map.put(mVar.a(), mVar.b());
            }
        }

        public void c(U u10, String str, Object obj) {
            D0.m mVar = (D0.m) this.f41837a.get(str);
            if (mVar != null) {
                mVar.d(u10, obj);
            }
        }

        private a(Class cls) {
            this.f41837a = D0.h(cls);
        }
    }

    private static class b implements e {

        /* renamed from: a  reason: collision with root package name */
        private final Map f41838a;

        public void a(Map map) {
            for (D0.m mVar : this.f41838a.values()) {
                map.put(mVar.a(), mVar.b());
            }
        }

        public void b(ViewManager viewManager, View view, String str, Object obj) {
            D0.m mVar = (D0.m) this.f41838a.get(str);
            if (mVar != null) {
                mVar.e(viewManager, view, obj);
            }
        }

        private b(Class cls) {
            this.f41838a = D0.i(cls);
        }
    }

    public interface c {
        void a(Map map);
    }

    public interface d extends c {
        void c(U u10, String str, Object obj);
    }

    public interface e extends c {
        void b(ViewManager viewManager, View view, String str, Object obj);
    }

    public static void a() {
        D0.b();
        f41835a.clear();
        f41836b.clear();
    }

    private static Object b(Class cls) {
        String name = cls.getName();
        try {
            return Class.forName(name + "$$PropsSetter").newInstance();
        } catch (ClassNotFoundException unused) {
            U5.a.I("ViewManagerPropertyUpdater", "Could not find generated setter for " + cls);
            return null;
        } catch (IllegalAccessException | InstantiationException e10) {
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e10);
        }
    }

    private static e c(Class cls) {
        Map map = f41835a;
        e eVar = (e) map.get(cls);
        if (eVar == null) {
            eVar = (e) b(cls);
            if (eVar == null) {
                eVar = new b(cls);
            }
            map.put(cls, eVar);
        }
        return eVar;
    }

    private static d d(Class cls) {
        Map map = f41836b;
        d dVar = (d) map.get(cls);
        if (dVar == null) {
            dVar = (d) b(cls);
            if (dVar == null) {
                dVar = new a(cls);
            }
            map.put(cls, dVar);
        }
        return dVar;
    }

    public static Map e(Class cls, Class cls2) {
        HashMap hashMap = new HashMap();
        c(cls).a(hashMap);
        d(cls2).a(hashMap);
        return hashMap;
    }

    public static void f(U u10, W w10) {
        d d10 = d(u10.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = w10.f41560a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry next = entryIterator.next();
            d10.c(u10, (String) next.getKey(), next.getValue());
        }
    }

    public static void g(ViewManager viewManager, View view, W w10) {
        e c10 = c(viewManager.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = w10.f41560a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry next = entryIterator.next();
            c10.b(viewManager, view, (String) next.getKey(), next.getValue());
        }
    }

    public static void h(w0 w0Var, View view, W w10) {
        Iterator<Map.Entry<String, Object>> entryIterator = w10.f41560a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry next = entryIterator.next();
            w0Var.a(view, (String) next.getKey(), next.getValue());
        }
    }
}
