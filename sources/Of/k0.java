package Of;

import Fg.v0;
import java.util.Collection;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

public interface k0 {

    public static final class a implements k0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f64500a = new a();

        private a() {
        }

        public Collection a(v0 v0Var, Collection collection, C6798l lVar, C6798l lVar2) {
            C6496s.h(v0Var, "currentTypeConstructor");
            C6496s.h(collection, "superTypes");
            C6496s.h(lVar, "neighbors");
            C6496s.h(lVar2, "reportLoop");
            return collection;
        }
    }

    Collection a(v0 v0Var, Collection collection, C6798l lVar, C6798l lVar2);
}
