package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: retrofit2.h  reason: case insensitive filesystem */
public interface C6675h {

    /* renamed from: retrofit2.h$a */
    public static abstract class a {
        protected static Type a(int i10, ParameterizedType parameterizedType) {
            return K.g(i10, parameterizedType);
        }

        protected static Class b(Type type) {
            return K.h(type);
        }

        public C6675h c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, G g10) {
            return null;
        }

        public abstract C6675h d(Type type, Annotation[] annotationArr, G g10);

        public C6675h e(Type type, Annotation[] annotationArr, G g10) {
            return null;
        }
    }

    Object convert(Object obj);
}
