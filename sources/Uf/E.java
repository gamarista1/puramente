package Uf;

import eg.x;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class E implements x {

    /* renamed from: a  reason: collision with root package name */
    public static final a f65217a = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final E a(Type type) {
            E mVar;
            C6496s.h(type, "type");
            boolean z10 = type instanceof Class;
            if (z10) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new C(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z10 && ((Class) type).isArray())) {
                mVar = new m(type);
            } else if (type instanceof WildcardType) {
                mVar = new H((WildcardType) type);
            } else {
                mVar = new s(type);
            }
            return mVar;
        }

        private a() {
        }
    }

    /* access modifiers changed from: protected */
    public abstract Type R();

    public boolean equals(Object obj) {
        if (!(obj instanceof E) || !C6496s.c(R(), ((E) obj).R())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return R().hashCode();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: ng.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: ng.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: eg.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: ng.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: ng.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: ng.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public eg.C5824a i(ng.c r5) {
        /*
            r4 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.C6496s.h(r5, r0)
            java.util.Collection r0 = r4.getAnnotations()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x000f:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x002e
            java.lang.Object r1 = r0.next()
            r3 = r1
            eg.a r3 = (eg.C5824a) r3
            ng.b r3 = r3.d()
            if (r3 == 0) goto L_0x0027
            ng.c r2 = r3.a()
        L_0x0027:
            boolean r2 = kotlin.jvm.internal.C6496s.c(r2, r5)
            if (r2 == 0) goto L_0x000f
            r2 = r1
        L_0x002e:
            eg.a r2 = (eg.C5824a) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Uf.E.i(ng.c):eg.a");
    }

    public String toString() {
        return getClass().getName() + ": " + R();
    }
}
