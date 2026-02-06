package gd;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C6496s;
import retrofit2.C6675h;
import retrofit2.G;
import rh.y;

/* renamed from: gd.b  reason: case insensitive filesystem */
public final class C5003b extends C6675h.a {

    /* renamed from: a  reason: collision with root package name */
    private final y f60626a;

    /* renamed from: b  reason: collision with root package name */
    private final C5006e f60627b;

    public C5003b(y yVar, C5006e eVar) {
        C6496s.h(yVar, "contentType");
        C6496s.h(eVar, "serializer");
        this.f60626a = yVar;
        this.f60627b = eVar;
    }

    public C6675h c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, G g10) {
        C6496s.h(type, "type");
        C6496s.h(annotationArr, "parameterAnnotations");
        C6496s.h(annotationArr2, "methodAnnotations");
        C6496s.h(g10, "retrofit");
        return new C5005d(this.f60626a, this.f60627b.c(type), this.f60627b);
    }

    public C6675h d(Type type, Annotation[] annotationArr, G g10) {
        C6496s.h(type, "type");
        C6496s.h(annotationArr, "annotations");
        C6496s.h(g10, "retrofit");
        return new C5002a(this.f60627b.c(type), this.f60627b);
    }
}
