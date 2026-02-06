package X5;

import T5.k;
import android.graphics.Bitmap;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class a implements Cloneable, Closeable {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static Class f35028e = a.class;

    /* renamed from: f  reason: collision with root package name */
    private static int f35029f;

    /* renamed from: g  reason: collision with root package name */
    private static final h f35030g = new C0567a();

    /* renamed from: h  reason: collision with root package name */
    private static final c f35031h = new b();

    /* renamed from: a  reason: collision with root package name */
    protected boolean f35032a = false;

    /* renamed from: b  reason: collision with root package name */
    protected final i f35033b;

    /* renamed from: c  reason: collision with root package name */
    protected final c f35034c;

    /* renamed from: d  reason: collision with root package name */
    protected final Throwable f35035d;

    /* renamed from: X5.a$a  reason: collision with other inner class name */
    class C0567a implements h {
        C0567a() {
        }

        /* renamed from: b */
        public void a(Closeable closeable) {
            try {
                T5.b.a(closeable, true);
            } catch (IOException unused) {
            }
        }
    }

    class b implements c {
        b() {
        }

        public boolean a() {
            return false;
        }

        public void b(i iVar, Throwable th2) {
            String str;
            Object f10 = iVar.f();
            Class a10 = a.f35028e;
            Integer valueOf = Integer.valueOf(System.identityHashCode(this));
            Integer valueOf2 = Integer.valueOf(System.identityHashCode(iVar));
            if (f10 == null) {
                str = null;
            } else {
                str = f10.getClass().getName();
            }
            U5.a.G(a10, "Finalized without closing: %x %x (type = %s)", valueOf, valueOf2, str);
        }
    }

    public interface c {
        boolean a();

        void b(i iVar, Throwable th2);
    }

    protected a(i iVar, c cVar, Throwable th2) {
        this.f35033b = (i) k.g(iVar);
        iVar.b();
        this.f35034c = cVar;
        this.f35035d = th2;
    }

    public static void E(a aVar) {
        if (aVar != null) {
            aVar.close();
        }
    }

    public static void F(Iterable iterable) {
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                E((a) it.next());
            }
        }
    }

    public static boolean T(a aVar) {
        if (aVar == null || !aVar.Q()) {
            return false;
        }
        return true;
    }

    public static a U(Closeable closeable) {
        return g0(closeable, f35030g);
    }

    public static a V(Closeable closeable, c cVar) {
        Throwable th2 = null;
        if (closeable == null) {
            return null;
        }
        h hVar = f35030g;
        if (cVar.a()) {
            th2 = new Throwable();
        }
        return o0(closeable, hVar, cVar, th2);
    }

    public static a g0(Object obj, h hVar) {
        return j0(obj, hVar, f35031h);
    }

    public static a j0(Object obj, h hVar, c cVar) {
        Throwable th2 = null;
        if (obj == null) {
            return null;
        }
        if (cVar.a()) {
            th2 = new Throwable();
        }
        return o0(obj, hVar, cVar, th2);
    }

    public static a o0(Object obj, h hVar, c cVar, Throwable th2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Bitmap) || (obj instanceof d)) {
            int i10 = f35029f;
            if (i10 == 1) {
                return new c(obj, hVar, cVar, th2);
            }
            if (i10 == 2) {
                return new g(obj, hVar, cVar, th2);
            }
            if (i10 == 3) {
                return new e(obj);
            }
        }
        return new b(obj, hVar, cVar, th2);
    }

    public static a t(a aVar) {
        if (aVar != null) {
            return aVar.q();
        }
        return null;
    }

    public static List y(Collection collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(t((a) it.next()));
        }
        return arrayList;
    }

    public synchronized Object I() {
        k.i(!this.f35032a);
        return k.g(this.f35033b.f());
    }

    public int M() {
        if (Q()) {
            return System.identityHashCode(this.f35033b.f());
        }
        return 0;
    }

    public synchronized boolean Q() {
        return !this.f35032a;
    }

    public void close() {
        synchronized (this) {
            try {
                if (!this.f35032a) {
                    this.f35032a = true;
                    this.f35033b.d();
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    public abstract a o();

    public synchronized a q() {
        if (!Q()) {
            return null;
        }
        return o();
    }

    protected a(Object obj, h hVar, c cVar, Throwable th2, boolean z10) {
        this.f35033b = new i(obj, hVar, z10);
        this.f35034c = cVar;
        this.f35035d = th2;
    }
}
