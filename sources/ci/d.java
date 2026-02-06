package ci;

import ei.b;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.helpers.g;
import org.slf4j.helpers.i;
import org.slf4j.helpers.k;
import org.slf4j.helpers.l;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    static volatile int f67402a;

    /* renamed from: b  reason: collision with root package name */
    static final k f67403b = new k();

    /* renamed from: c  reason: collision with root package name */
    static final g f67404c = new g();

    /* renamed from: d  reason: collision with root package name */
    static boolean f67405d = l.f("slf4j.detectLoggerNameMismatch");

    /* renamed from: e  reason: collision with root package name */
    static volatile b f67406e;

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f67407f = {"1.8", "1.7"};

    /* renamed from: g  reason: collision with root package name */
    private static String f67408g = "org/slf4j/impl/StaticLoggerBinder.class";

    private static final void a() {
        try {
            List g10 = g();
            t(g10);
            if (g10 == null || g10.isEmpty()) {
                f67402a = 4;
                l.c("No SLF4J providers were found.");
                l.c("Defaulting to no-operation (NOP) logger implementation");
                l.c("See http://www.slf4j.org/codes.html#noProviders for further details.");
                s(f());
                return;
            }
            f67406e = (b) g10.get(0);
            f67406e.initialize();
            f67402a = 3;
            r(g10);
            h();
            p();
            f67403b.c().b();
        } catch (Exception e10) {
            e(e10);
            throw new IllegalStateException("Unexpected initialization failure", e10);
        }
    }

    private static void b(di.d dVar, int i10) {
        if (dVar.a().i()) {
            c(i10);
        } else if (!dVar.a().j()) {
            d();
        }
    }

    private static void c(int i10) {
        l.c("A number (" + i10 + ") of logging calls during the initialization phase have been intercepted and are");
        l.c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        l.c("See also http://www.slf4j.org/codes.html#replay");
    }

    private static void d() {
        l.c("The following set of substitute loggers may have been accessed");
        l.c("during the initialization phase. Logging calls during this");
        l.c("phase were not honored. However, subsequent logging calls to these");
        l.c("loggers will work as normally expected.");
        l.c("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    static void e(Throwable th2) {
        f67402a = 2;
        l.d("Failed to instantiate SLF4J LoggerFactory", th2);
    }

    static Set f() {
        Enumeration<URL> enumeration;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = d.class.getClassLoader();
            if (classLoader == null) {
                enumeration = ClassLoader.getSystemResources(f67408g);
            } else {
                enumeration = classLoader.getResources(f67408g);
            }
            while (enumeration.hasMoreElements()) {
                linkedHashSet.add(enumeration.nextElement());
            }
        } catch (IOException e10) {
            l.d("Error getting resources from path", e10);
        }
        return linkedHashSet;
    }

    private static List g() {
        ServiceLoader<S> load = ServiceLoader.load(b.class);
        ArrayList arrayList = new ArrayList();
        Iterator<S> it = load.iterator();
        while (it.hasNext()) {
            arrayList.add((b) it.next());
        }
        return arrayList;
    }

    private static void h() {
        k kVar = f67403b;
        synchronized (kVar) {
            try {
                kVar.c().e();
                for (i iVar : kVar.c().d()) {
                    iVar.m(k(iVar.getName()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static a i() {
        return l().b();
    }

    public static c j(Class cls) {
        Class a10;
        c k10 = k(cls.getName());
        if (f67405d && (a10 = l.a()) != null && n(cls, a10)) {
            l.c(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", new Object[]{k10.getName(), a10.getName()}));
            l.c("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return k10;
    }

    public static c k(String str) {
        return i().a(str);
    }

    static b l() {
        if (f67402a == 0) {
            synchronized (d.class) {
                try {
                    if (f67402a == 0) {
                        f67402a = 1;
                        o();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        int i10 = f67402a;
        if (i10 == 1) {
            return f67403b;
        }
        if (i10 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        } else if (i10 == 3) {
            return f67406e;
        } else {
            if (i10 == 4) {
                return f67404c;
            }
            throw new IllegalStateException("Unreachable code");
        }
    }

    private static boolean m(List list) {
        if (list.size() > 1) {
            return true;
        }
        return false;
    }

    private static boolean n(Class cls, Class cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    private static final void o() {
        a();
        if (f67402a == 3) {
            u();
        }
    }

    private static void p() {
        LinkedBlockingQueue c10 = f67403b.c().c();
        int size = c10.size();
        ArrayList<di.d> arrayList = new ArrayList<>(128);
        int i10 = 0;
        while (c10.drainTo(arrayList, 128) != 0) {
            for (di.d dVar : arrayList) {
                q(dVar);
                int i11 = i10 + 1;
                if (i10 == 0) {
                    b(dVar, size);
                }
                i10 = i11;
            }
            arrayList.clear();
        }
    }

    private static void q(di.d dVar) {
        if (dVar != null) {
            i a10 = dVar.a();
            String name = a10.getName();
            if (a10.k()) {
                throw new IllegalStateException("Delegate logger cannot be null at this state.");
            } else if (!a10.j()) {
                if (a10.i()) {
                    a10.l(dVar);
                } else {
                    l.c(name);
                }
            }
        }
    }

    private static void r(List list) {
        if (!list.isEmpty() && m(list)) {
            l.c("Actual provider is of type [" + list.get(0) + "]");
        }
    }

    private static void s(Set set) {
        if (!set.isEmpty()) {
            l.c("Class path contains SLF4J bindings targeting slf4j-api versions prior to 1.8.");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                l.c("Ignoring binding found at [" + ((URL) it.next()) + "]");
            }
            l.c("See http://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
        }
    }

    private static void t(List list) {
        if (m(list)) {
            l.c("Class path contains multiple SLF4J providers.");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                l.c("Found provider [" + ((b) it.next()) + "]");
            }
            l.c("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    private static final void u() {
        try {
            String a10 = f67406e.a();
            boolean z10 = false;
            for (String startsWith : f67407f) {
                if (a10.startsWith(startsWith)) {
                    z10 = true;
                }
            }
            if (!z10) {
                l.c("The requested version " + a10 + " by your slf4j binding is not compatible with " + Arrays.asList(f67407f).toString());
                l.c("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            }
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th2) {
            l.d("Unexpected problem occured during version sanity check", th2);
        }
    }
}
