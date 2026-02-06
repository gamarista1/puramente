package bg;

import eg.C5837n;
import eg.w;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mf.Y;
import ng.f;

/* renamed from: bg.c  reason: case insensitive filesystem */
public interface C5762c {

    /* renamed from: bg.c$a */
    public static final class a implements C5762c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f67201a = new a();

        private a() {
        }

        public Set a() {
            return Y.e();
        }

        public Set b() {
            return Y.e();
        }

        public Set c() {
            return Y.e();
        }

        public C5837n d(f fVar) {
            C6496s.h(fVar, "name");
            return null;
        }

        public w f(f fVar) {
            C6496s.h(fVar, "name");
            return null;
        }

        /* renamed from: g */
        public List e(f fVar) {
            C6496s.h(fVar, "name");
            return C6565s.n();
        }
    }

    Set a();

    Set b();

    Set c();

    C5837n d(f fVar);

    Collection e(f fVar);

    w f(f fVar);
}
