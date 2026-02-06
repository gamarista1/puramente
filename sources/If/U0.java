package If;

import Ff.e;
import Ff.l;
import Ff.r;
import Fg.B0;
import Fg.J0;
import Fg.S;
import Hf.b;
import If.a1;
import Of.C5487e;
import Of.C5490h;
import Of.l0;
import Of.m0;
import Uf.C5553f;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6497t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import lf.C6531o;
import lf.C6534r;
import lf.C6535s;
import lf.t;
import mf.C6559l;
import mf.C6565s;
import xf.C6781a;
import yf.C6787a;

public final class U0 implements C6497t {

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ l[] f63603e;

    /* renamed from: a  reason: collision with root package name */
    private final S f63604a;

    /* renamed from: b  reason: collision with root package name */
    private final a1.a f63605b;

    /* renamed from: c  reason: collision with root package name */
    private final a1.a f63606c;

    /* renamed from: d  reason: collision with root package name */
    private final a1.a f63607d;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f63608a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Fg.N0[] r0 = Fg.N0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Fg.N0 r1 = Fg.N0.INVARIANT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Fg.N0 r1 = Fg.N0.IN_VARIANCE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Fg.N0 r1 = Fg.N0.OUT_VARIANCE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f63608a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: If.U0.a.<clinit>():void");
        }
    }

    static {
        Class<U0> cls = U0.class;
        f63603e = new l[]{O.i(new F(O.b(cls), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), O.i(new F(O.b(cls), "arguments", "getArguments()Ljava/util/List;"))};
    }

    public U0(S s10, C6787a aVar) {
        C6496s.h(s10, "type");
        this.f63604a = s10;
        a1.a aVar2 = null;
        a1.a aVar3 = aVar instanceof a1.a ? (a1.a) aVar : null;
        if (aVar3 != null) {
            aVar2 = aVar3;
        } else if (aVar != null) {
            aVar2 = a1.c(aVar);
        }
        this.f63605b = aVar2;
        this.f63606c = a1.c(new Q0(this));
        this.f63607d = a1.c(new R0(this, aVar));
    }

    /* access modifiers changed from: private */
    public static final List q(U0 u02, C6787a aVar) {
        r rVar;
        T0 t02;
        List L02 = u02.f63604a.L0();
        if (L02.isEmpty()) {
            return C6565s.n();
        }
        Lazy a10 = C6531o.a(C6534r.PUBLICATION, new S0(u02));
        Iterable iterable = L02;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        int i10 = 0;
        for (Object next : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C6565s.x();
            }
            B0 b02 = (B0) next;
            if (b02.a()) {
                rVar = r.f62882c.c();
            } else {
                S type = b02.getType();
                C6496s.g(type, "getType(...)");
                if (aVar == null) {
                    t02 = null;
                } else {
                    t02 = new T0(u02, i10, a10);
                }
                U0 u03 = new U0(type, t02);
                int i12 = a.f63608a[b02.b().ordinal()];
                if (i12 == 1) {
                    rVar = r.f62882c.d(u03);
                } else if (i12 == 2) {
                    rVar = r.f62882c.a(u03);
                } else if (i12 == 3) {
                    rVar = r.f62882c.b(u03);
                } else {
                    throw new C6535s();
                }
            }
            arrayList.add(rVar);
            i10 = i11;
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final List r(U0 u02) {
        Type a10 = u02.a();
        C6496s.e(a10);
        return C5553f.h(a10);
    }

    private static final List s(Lazy lazy) {
        return (List) lazy.getValue();
    }

    /* access modifiers changed from: private */
    public static final Type x(U0 u02, int i10, Lazy lazy) {
        Type type;
        Type type2;
        Type a10 = u02.a();
        if (a10 instanceof Class) {
            Class cls = (Class) a10;
            if (cls.isArray()) {
                type2 = cls.getComponentType();
            } else {
                type2 = Object.class;
            }
            C6496s.e(type2);
            return type2;
        } else if (a10 instanceof GenericArrayType) {
            if (i10 == 0) {
                Type genericComponentType = ((GenericArrayType) a10).getGenericComponentType();
                C6496s.e(genericComponentType);
                return genericComponentType;
            }
            throw new Y0("Array type has been queried for a non-0th argument: " + u02);
        } else if (a10 instanceof ParameterizedType) {
            Type type3 = (Type) s(lazy).get(i10);
            if (!(type3 instanceof WildcardType)) {
                return type3;
            }
            WildcardType wildcardType = (WildcardType) type3;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            C6496s.g(lowerBounds, "getLowerBounds(...)");
            Type type4 = (Type) C6559l.c0(lowerBounds);
            if (type4 == null) {
                Type[] upperBounds = wildcardType.getUpperBounds();
                C6496s.g(upperBounds, "getUpperBounds(...)");
                type = (Type) C6559l.b0(upperBounds);
            } else {
                type = type4;
            }
            C6496s.e(type);
            return type;
        } else {
            throw new Y0("Non-generic type has been queried for arguments: " + u02);
        }
    }

    /* access modifiers changed from: private */
    public static final e y(U0 u02) {
        return u02.z(u02.f63604a);
    }

    private final e z(S s10) {
        S type;
        C5490h o10 = s10.N0().o();
        if (o10 instanceof C5487e) {
            Class q10 = j1.q((C5487e) o10);
            if (q10 == null) {
                return null;
            }
            if (q10.isArray()) {
                B0 b02 = (B0) C6565s.R0(s10.L0());
                if (b02 == null || (type = b02.getType()) == null) {
                    return new X(q10);
                }
                e z10 = z(type);
                if (z10 != null) {
                    return new X(j1.f(C6781a.b(b.a(z10))));
                }
                throw new Y0("Cannot determine classifier for array element type: " + this);
            } else if (J0.l(s10)) {
                return new X(q10);
            } else {
                Class i10 = C5553f.i(q10);
                if (i10 != null) {
                    q10 = i10;
                }
                return new X(q10);
            }
        } else if (o10 instanceof m0) {
            return new W0((X0) null, (m0) o10);
        } else {
            if (!(o10 instanceof l0)) {
                return null;
            }
            throw new t("An operation is not implemented: " + "Type alias classifiers are not yet supported");
        }
    }

    public final S A() {
        return this.f63604a;
    }

    public Type a() {
        a1.a aVar = this.f63605b;
        if (aVar != null) {
            return (Type) aVar.invoke();
        }
        return null;
    }

    public e b() {
        return (e) this.f63606c.b(this, f63603e[0]);
    }

    public List c() {
        Object b10 = this.f63607d.b(this, f63603e[1]);
        C6496s.g(b10, "getValue(...)");
        return (List) b10;
    }

    public boolean e() {
        return this.f63604a.O0();
    }

    public boolean equals(Object obj) {
        if (obj instanceof U0) {
            U0 u02 = (U0) obj;
            if (!C6496s.c(this.f63604a, u02.f63604a) || !C6496s.c(b(), u02.b()) || !C6496s.c(c(), u02.c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public List getAnnotations() {
        return j1.e(this.f63604a);
    }

    public int hashCode() {
        int i10;
        int hashCode = this.f63604a.hashCode() * 31;
        e b10 = b();
        if (b10 != null) {
            i10 = b10.hashCode();
        } else {
            i10 = 0;
        }
        return ((hashCode + i10) * 31) + c().hashCode();
    }

    public String toString() {
        return e1.f63668a.l(this.f63604a);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U0(S s10, C6787a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(s10, (i10 & 2) != 0 ? null : aVar);
    }
}
