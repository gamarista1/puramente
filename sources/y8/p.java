package Y8;

import W8.c;
import W8.g;
import W8.h;
import W8.i;
import java.util.Set;

final class p implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Set f35766a;

    /* renamed from: b  reason: collision with root package name */
    private final o f35767b;

    /* renamed from: c  reason: collision with root package name */
    private final s f35768c;

    p(Set set, o oVar, s sVar) {
        this.f35766a = set;
        this.f35767b = oVar;
        this.f35768c = sVar;
    }

    public h a(String str, Class cls, c cVar, g gVar) {
        if (this.f35766a.contains(cVar)) {
            return new r(this.f35767b, str, cVar, gVar, this.f35768c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{cVar, this.f35766a}));
    }
}
