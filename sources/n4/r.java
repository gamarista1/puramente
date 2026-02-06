package N4;

import N4.j;
import N4.k;

public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public static final j.f f32918a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final k.a f32919b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final k.a f32920c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final j.f f32921d = new d();

    /* renamed from: e  reason: collision with root package name */
    public static final j.f f32922e = new e();

    class a implements j.f {
        a() {
        }

        /* renamed from: b */
        public String a(j jVar) {
            if (jVar.K()) {
                return null;
            }
            return jVar.G();
        }
    }

    class b implements k.a {
        b() {
        }

        /* renamed from: b */
        public void a(k kVar, String str) {
            r.b(str, kVar);
        }
    }

    class c implements k.a {
        c() {
        }

        /* renamed from: b */
        public void a(k kVar, CharSequence charSequence) {
            if (charSequence == null) {
                kVar.n();
            } else {
                kVar.p(charSequence);
            }
        }
    }

    class d implements j.f {
        d() {
        }

        /* renamed from: b */
        public StringBuilder a(j jVar) {
            if (jVar.K()) {
                return null;
            }
            return jVar.c(new StringBuilder());
        }
    }

    class e implements j.f {
        e() {
        }

        /* renamed from: b */
        public StringBuffer a(j jVar) {
            if (jVar.K()) {
                return null;
            }
            return jVar.b(new StringBuffer());
        }
    }

    public static void a(String str, k kVar) {
        kVar.q(str);
    }

    public static void b(String str, k kVar) {
        if (str == null) {
            kVar.n();
        } else {
            kVar.q(str);
        }
    }

    public static void c(String str, k kVar) {
        kVar.q(str);
    }
}
