package L1;

import java.util.Map;
import kotlin.jvm.internal.C6496s;
import mf.O;

public abstract class d {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f4134a;

        public a(String str) {
            C6496s.h(str, "name");
            this.f4134a = str;
        }

        public final String a() {
            return this.f4134a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return C6496s.c(this.f4134a, ((a) obj).f4134a);
            }
            return false;
        }

        public int hashCode() {
            return this.f4134a.hashCode();
        }

        public String toString() {
            return this.f4134a;
        }
    }

    public static final class b {
    }

    public abstract Map a();

    public abstract Object b(a aVar);

    public final a c() {
        return new a(O.B(a()), false);
    }

    public final d d() {
        return new a(O.B(a()), true);
    }
}
