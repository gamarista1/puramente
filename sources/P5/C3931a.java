package p5;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: p5.a  reason: case insensitive filesystem */
public abstract class C3931a {

    /* renamed from: a  reason: collision with root package name */
    private static final g f47569a = new C0714a();

    /* renamed from: p5.a$b */
    class b implements d {
        b() {
        }

        /* renamed from: a */
        public List create() {
            return new ArrayList();
        }
    }

    /* renamed from: p5.a$c */
    class c implements g {
        c() {
        }

        /* renamed from: b */
        public void a(List list) {
            list.clear();
        }
    }

    /* renamed from: p5.a$d */
    public interface d {
        Object create();
    }

    /* renamed from: p5.a$e */
    private static final class e implements x1.e {

        /* renamed from: a  reason: collision with root package name */
        private final d f47570a;

        /* renamed from: b  reason: collision with root package name */
        private final g f47571b;

        /* renamed from: c  reason: collision with root package name */
        private final x1.e f47572c;

        e(x1.e eVar, d dVar, g gVar) {
            this.f47572c = eVar;
            this.f47570a = dVar;
            this.f47571b = gVar;
        }

        public boolean a(Object obj) {
            if (obj instanceof f) {
                ((f) obj).b().b(true);
            }
            this.f47571b.a(obj);
            return this.f47572c.a(obj);
        }

        public Object b() {
            Object b10 = this.f47572c.b();
            if (b10 == null) {
                b10 = this.f47570a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + b10.getClass());
                }
            }
            if (b10 instanceof f) {
                ((f) b10).b().b(false);
            }
            return b10;
        }
    }

    /* renamed from: p5.a$f */
    public interface f {
        C3933c b();
    }

    /* renamed from: p5.a$g */
    public interface g {
        void a(Object obj);
    }

    private static x1.e a(x1.e eVar, d dVar) {
        return b(eVar, dVar, c());
    }

    private static x1.e b(x1.e eVar, d dVar, g gVar) {
        return new e(eVar, dVar, gVar);
    }

    private static g c() {
        return f47569a;
    }

    public static x1.e d(int i10, d dVar) {
        return a(new x1.f(i10), dVar);
    }

    public static x1.e e() {
        return f(20);
    }

    public static x1.e f(int i10) {
        return b(new x1.f(i10), new b(), new c());
    }

    /* renamed from: p5.a$a  reason: collision with other inner class name */
    class C0714a implements g {
        C0714a() {
        }

        public void a(Object obj) {
        }
    }
}
