package Uf;

import Uf.E;
import eg.C5822C;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;
import mf.C6565s;

public final class H extends E implements C5822C {

    /* renamed from: b  reason: collision with root package name */
    private final WildcardType f65223b;

    /* renamed from: c  reason: collision with root package name */
    private final Collection f65224c = C6565s.n();

    /* renamed from: d  reason: collision with root package name */
    private final boolean f65225d;

    public H(WildcardType wildcardType) {
        C6496s.h(wildcardType, "reflectType");
        this.f65223b = wildcardType;
    }

    public boolean E() {
        return this.f65225d;
    }

    public boolean N() {
        Type[] upperBounds = R().getUpperBounds();
        C6496s.g(upperBounds, "getUpperBounds(...)");
        return !C6496s.c(C6559l.c0(upperBounds), Object.class);
    }

    /* renamed from: S */
    public E x() {
        Type[] upperBounds = R().getUpperBounds();
        Type[] lowerBounds = R().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + R());
        } else if (lowerBounds.length == 1) {
            E.a aVar = E.f65217a;
            C6496s.e(lowerBounds);
            Object Z02 = C6559l.Z0(lowerBounds);
            C6496s.g(Z02, "single(...)");
            return aVar.a((Type) Z02);
        } else {
            if (upperBounds.length == 1) {
                C6496s.e(upperBounds);
                Type type = (Type) C6559l.Z0(upperBounds);
                if (!C6496s.c(type, Object.class)) {
                    E.a aVar2 = E.f65217a;
                    C6496s.e(type);
                    return aVar2.a(type);
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public WildcardType R() {
        return this.f65223b;
    }

    public Collection getAnnotations() {
        return this.f65224c;
    }
}
