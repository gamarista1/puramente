package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import retrofit2.C6675h;
import rh.F;

public final class w extends C6675h.a {

    static final class a implements C6675h {

        /* renamed from: a  reason: collision with root package name */
        private final C6675h f72948a;

        a(C6675h hVar) {
            this.f72948a = hVar;
        }

        /* renamed from: a */
        public Optional convert(F f10) {
            return Optional.ofNullable(this.f72948a.convert(f10));
        }
    }

    w() {
    }

    public C6675h d(Type type, Annotation[] annotationArr, G g10) {
        if (C6675h.a.b(type) != Optional.class) {
            return null;
        }
        return new a(g10.h(C6675h.a.a(0, (ParameterizedType) type), annotationArr));
    }
}
