package T4;

import java.security.MessageDigest;
import o5.k;

public final class h {

    /* renamed from: e  reason: collision with root package name */
    private static final b f34160e = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Object f34161a;

    /* renamed from: b  reason: collision with root package name */
    private final b f34162b;

    /* renamed from: c  reason: collision with root package name */
    private final String f34163c;

    /* renamed from: d  reason: collision with root package name */
    private volatile byte[] f34164d;

    public interface b {
        void a(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    private h(String str, Object obj, b bVar) {
        this.f34163c = k.b(str);
        this.f34161a = obj;
        this.f34162b = (b) k.d(bVar);
    }

    public static h a(String str, Object obj, b bVar) {
        return new h(str, obj, bVar);
    }

    private static b b() {
        return f34160e;
    }

    private byte[] d() {
        if (this.f34164d == null) {
            this.f34164d = this.f34163c.getBytes(f.f34158a);
        }
        return this.f34164d;
    }

    public static h e(String str) {
        return new h(str, (Object) null, b());
    }

    public static h f(String str, Object obj) {
        return new h(str, obj, b());
    }

    public Object c() {
        return this.f34161a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f34163c.equals(((h) obj).f34163c);
        }
        return false;
    }

    public void g(Object obj, MessageDigest messageDigest) {
        this.f34162b.a(d(), obj, messageDigest);
    }

    public int hashCode() {
        return this.f34163c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f34163c + '\'' + '}';
    }

    class a implements b {
        a() {
        }

        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }
}
