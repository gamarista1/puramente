package fi;

import com.google.gson.e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.C6675h;
import retrofit2.G;

public final class a extends C6675h.a {

    /* renamed from: a  reason: collision with root package name */
    private final e f67698a;

    private a(e eVar) {
        this.f67698a = eVar;
    }

    public static a f(e eVar) {
        if (eVar != null) {
            return new a(eVar);
        }
        throw new NullPointerException("gson == null");
    }

    public C6675h c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, G g10) {
        return new b(this.f67698a, this.f67698a.o(com.google.gson.reflect.a.get(type)));
    }

    public C6675h d(Type type, Annotation[] annotationArr, G g10) {
        return new c(this.f67698a, this.f67698a.o(com.google.gson.reflect.a.get(type)));
    }
}
