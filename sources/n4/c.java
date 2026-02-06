package N4;

import N4.j;
import N4.k;
import java.util.Arrays;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean[] f32713a = new boolean[0];

    /* renamed from: b  reason: collision with root package name */
    public static final j.f f32714b = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final j.f f32715c = new b();

    /* renamed from: d  reason: collision with root package name */
    public static final k.a f32716d = new C0538c();

    /* renamed from: e  reason: collision with root package name */
    public static final j.f f32717e = new d();

    /* renamed from: f  reason: collision with root package name */
    public static final k.a f32718f = new e();

    class a implements j.f {
        a() {
        }

        /* renamed from: b */
        public Boolean a(j jVar) {
            return Boolean.valueOf(c.a(jVar));
        }
    }

    class b implements j.f {
        b() {
        }

        /* renamed from: b */
        public Boolean a(j jVar) {
            if (jVar.K()) {
                return null;
            }
            return Boolean.valueOf(c.a(jVar));
        }
    }

    /* renamed from: N4.c$c  reason: collision with other inner class name */
    class C0538c implements k.a {
        C0538c() {
        }

        /* renamed from: b */
        public void a(k kVar, Boolean bool) {
            c.d(bool, kVar);
        }
    }

    class d implements j.f {
        d() {
        }

        /* renamed from: b */
        public boolean[] a(j jVar) {
            if (jVar.K()) {
                return null;
            }
            if (jVar.l() == 91) {
                jVar.h();
                return c.b(jVar);
            }
            throw jVar.n("Expecting '[' for boolean array start");
        }
    }

    class e implements k.a {
        e() {
        }

        /* renamed from: b */
        public void a(k kVar, boolean[] zArr) {
            c.c(zArr, kVar);
        }
    }

    public static boolean a(j jVar) {
        if (jVar.L()) {
            return true;
        }
        if (jVar.J()) {
            return false;
        }
        throw jVar.p("Found invalid boolean value", 0);
    }

    public static boolean[] b(j jVar) {
        if (jVar.l() == 93) {
            return f32713a;
        }
        boolean[] zArr = new boolean[4];
        zArr[0] = a(jVar);
        int i10 = 1;
        while (jVar.h() == 44) {
            jVar.h();
            if (i10 == zArr.length) {
                zArr = Arrays.copyOf(zArr, zArr.length << 1);
            }
            zArr[i10] = a(jVar);
            i10++;
        }
        jVar.d();
        return Arrays.copyOf(zArr, i10);
    }

    public static void c(boolean[] zArr, k kVar) {
        String str;
        String str2;
        if (zArr == null) {
            kVar.n();
        } else if (zArr.length == 0) {
            kVar.i("[]");
        } else {
            kVar.l((byte) 91);
            if (zArr[0]) {
                str = com.amazon.a.a.o.b.f37475af;
            } else {
                str = com.amazon.a.a.o.b.f37476ag;
            }
            kVar.i(str);
            for (int i10 = 1; i10 < zArr.length; i10++) {
                if (zArr[i10]) {
                    str2 = ",true";
                } else {
                    str2 = ",false";
                }
                kVar.i(str2);
            }
            kVar.l((byte) 93);
        }
    }

    public static void d(Boolean bool, k kVar) {
        if (bool == null) {
            kVar.n();
        } else if (bool.booleanValue()) {
            kVar.i(com.amazon.a.a.o.b.f37475af);
        } else {
            kVar.i(com.amazon.a.a.o.b.f37476ag);
        }
    }
}
