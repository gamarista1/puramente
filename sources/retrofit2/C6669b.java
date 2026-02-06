package retrofit2;

import gi.w;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import lf.C6514M;
import retrofit2.C6675h;
import rh.D;
import rh.F;

/* renamed from: retrofit2.b  reason: case insensitive filesystem */
final class C6669b extends C6675h.a {

    /* renamed from: retrofit2.b$a */
    static final class a implements C6675h {

        /* renamed from: a  reason: collision with root package name */
        static final a f72877a = new a();

        a() {
        }

        /* renamed from: a */
        public F convert(F f10) {
            try {
                return K.a(f10);
            } finally {
                f10.close();
            }
        }
    }

    /* renamed from: retrofit2.b$d */
    static final class d implements C6675h {

        /* renamed from: a  reason: collision with root package name */
        static final d f72880a = new d();

        d() {
        }

        /* renamed from: a */
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: retrofit2.b$e */
    static final class e implements C6675h {

        /* renamed from: a  reason: collision with root package name */
        static final e f72881a = new e();

        e() {
        }

        /* renamed from: a */
        public C6514M convert(F f10) {
            f10.close();
            return C6514M.f71813a;
        }
    }

    /* renamed from: retrofit2.b$f */
    static final class f implements C6675h {

        /* renamed from: a  reason: collision with root package name */
        static final f f72882a = new f();

        f() {
        }

        /* renamed from: a */
        public Void convert(F f10) {
            f10.close();
            return null;
        }
    }

    C6669b() {
    }

    public C6675h c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, G g10) {
        if (D.class.isAssignableFrom(K.h(type))) {
            return C1056b.f72878a;
        }
        return null;
    }

    public C6675h d(Type type, Annotation[] annotationArr, G g10) {
        if (type == F.class) {
            if (K.l(annotationArr, w.class)) {
                return c.f72879a;
            }
            return a.f72877a;
        } else if (type == Void.class) {
            return f.f72882a;
        } else {
            if (K.m(type)) {
                return e.f72881a;
            }
            return null;
        }
    }

    /* renamed from: retrofit2.b$b  reason: collision with other inner class name */
    static final class C1056b implements C6675h {

        /* renamed from: a  reason: collision with root package name */
        static final C1056b f72878a = new C1056b();

        C1056b() {
        }

        /* renamed from: a */
        public D convert(D d10) {
            return d10;
        }
    }

    /* renamed from: retrofit2.b$c */
    static final class c implements C6675h {

        /* renamed from: a  reason: collision with root package name */
        static final c f72879a = new c();

        c() {
        }

        /* renamed from: a */
        public F convert(F f10) {
            return f10;
        }
    }
}
