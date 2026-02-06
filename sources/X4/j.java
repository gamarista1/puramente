package X4;

import T4.f;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import o5.h;
import o5.k;
import o5.l;
import p5.C3931a;
import p5.C3933c;
import x1.e;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private final h f35023a = new h(1000);

    /* renamed from: b  reason: collision with root package name */
    private final e f35024b = C3931a.d(10, new a());

    class a implements C3931a.d {
        a() {
        }

        /* renamed from: a */
        public b create() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    private static final class b implements C3931a.f {

        /* renamed from: a  reason: collision with root package name */
        final MessageDigest f35026a;

        /* renamed from: b  reason: collision with root package name */
        private final C3933c f35027b = C3933c.a();

        b(MessageDigest messageDigest) {
            this.f35026a = messageDigest;
        }

        public C3933c b() {
            return this.f35027b;
        }
    }

    private String a(f fVar) {
        b bVar = (b) k.d(this.f35024b.b());
        try {
            fVar.b(bVar.f35026a);
            return l.x(bVar.f35026a.digest());
        } finally {
            this.f35024b.a(bVar);
        }
    }

    public String b(f fVar) {
        String str;
        synchronized (this.f35023a) {
            str = (String) this.f35023a.g(fVar);
        }
        if (str == null) {
            str = a(fVar);
        }
        synchronized (this.f35023a) {
            this.f35023a.k(fVar, str);
        }
        return str;
    }
}
