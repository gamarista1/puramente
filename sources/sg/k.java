package Sg;

import Ef.i;
import java.util.List;
import kotlin.jvm.internal.C6496s;

public interface k {

    public static final class a {
        public static b a(k kVar) {
            return new b(kVar);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final k f65079a;

        public b(k kVar) {
            C6496s.h(kVar, "match");
            this.f65079a = kVar;
        }

        public final k a() {
            return this.f65079a;
        }
    }

    b a();

    List b();

    i c();

    k next();
}
