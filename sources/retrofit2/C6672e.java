package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: retrofit2.e  reason: case insensitive filesystem */
public interface C6672e {

    /* renamed from: retrofit2.e$a */
    public static abstract class a {
        protected static Type getParameterUpperBound(int i10, ParameterizedType parameterizedType) {
            return K.g(i10, parameterizedType);
        }

        protected static Class<?> getRawType(Type type) {
            return K.h(type);
        }

        public abstract C6672e get(Type type, Annotation[] annotationArr, G g10);
    }

    Object adapt(C6671d dVar);

    Type responseType();
}
