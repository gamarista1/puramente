package N4;

import N4.j;
import N4.k;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    static final j.f f32711a = new a();

    /* renamed from: b  reason: collision with root package name */
    static final k.a f32712b = new C0537b();

    class a implements j.f {
        a() {
        }

        /* renamed from: b */
        public byte[] a(j jVar) {
            if (jVar.K()) {
                return null;
            }
            return b.a(jVar);
        }
    }

    /* renamed from: N4.b$b  reason: collision with other inner class name */
    class C0537b implements k.a {
        C0537b() {
        }

        /* renamed from: b */
        public void a(k kVar, byte[] bArr) {
            b.b(bArr, kVar);
        }
    }

    public static byte[] a(j jVar) {
        return jVar.B();
    }

    public static void b(byte[] bArr, k kVar) {
        if (bArr == null) {
            kVar.n();
        } else if (bArr.length == 0) {
            kVar.i("\"\"");
        } else {
            kVar.k(bArr);
        }
    }
}
