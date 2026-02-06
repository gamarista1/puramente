package If;

import Ff.c;
import Ff.k;
import Ff.p;
import Ff.t;
import Fg.F0;
import Fg.S;
import Hf.b;
import If.a1;
import Jf.h;
import Jf.o;
import Of.C5484b;
import Of.C5502u;
import Of.E;
import Of.W;
import Of.c0;
import Of.m0;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import lf.C6531o;
import lf.C6534r;
import mf.C6559l;
import mf.C6565s;
import pf.C6632a;
import qf.C6658d;
import xf.C6781a;

public abstract class A implements c, X0 {

    /* renamed from: a  reason: collision with root package name */
    private final a1.a f63532a;

    /* renamed from: b  reason: collision with root package name */
    private final a1.a f63533b;

    /* renamed from: c  reason: collision with root package name */
    private final a1.a f63534c;

    /* renamed from: d  reason: collision with root package name */
    private final a1.a f63535d;

    /* renamed from: e  reason: collision with root package name */
    private final a1.a f63536e;

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f63537f = C6531o.a(C6534r.PUBLICATION, new C5466v(this));

    public static final class a implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C6632a.d(((k) obj).getName(), ((k) obj2).getName());
        }
    }

    public A() {
        a1.a c10 = a1.c(new C5457q(this));
        C6496s.g(c10, "lazySoft(...)");
        this.f63532a = c10;
        a1.a c11 = a1.c(new r(this));
        C6496s.g(c11, "lazySoft(...)");
        this.f63533b = c11;
        a1.a c12 = a1.c(new C5460s(this));
        C6496s.g(c12, "lazySoft(...)");
        this.f63534c = c12;
        a1.a c13 = a1.c(new C5462t(this));
        C6496s.g(c13, "lazySoft(...)");
        this.f63535d = c13;
        a1.a c14 = a1.c(new C5464u(this));
        C6496s.g(c14, "lazySoft(...)");
        this.f63536e = c14;
    }

    /* access modifiers changed from: private */
    public static final U0 A(A a10) {
        S returnType = a10.V().getReturnType();
        C6496s.e(returnType);
        return new U0(returnType, new C5474z(a10));
    }

    /* access modifiers changed from: private */
    public static final Type B(A a10) {
        Type Q10 = a10.Q();
        if (Q10 == null) {
            return a10.S().getReturnType();
        }
        return Q10;
    }

    /* access modifiers changed from: private */
    public static final List C(A a10) {
        List typeParameters = a10.V().getTypeParameters();
        C6496s.g(typeParameters, "getTypeParameters(...)");
        Iterable<m0> iterable = typeParameters;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (m0 m0Var : iterable) {
            C6496s.e(m0Var);
            arrayList.add(new W0(a10, m0Var));
        }
        return arrayList;
    }

    private final Object N(Map map) {
        Object obj;
        Iterable<k> parameters = getParameters();
        ArrayList arrayList = new ArrayList(C6565s.y(parameters, 10));
        for (k kVar : parameters) {
            if (map.containsKey(kVar)) {
                obj = map.get(kVar);
                if (obj == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + kVar + ')');
                }
            } else if (kVar.o()) {
                obj = null;
            } else if (kVar.m()) {
                obj = P(kVar.getType());
            } else {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + kVar);
            }
            arrayList.add(obj);
        }
        h U10 = U();
        if (U10 != null) {
            try {
                return U10.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e10) {
                throw new Gf.a(e10);
            }
        } else {
            throw new Y0("This callable does not support a default call: " + V());
        }
    }

    private final Object P(p pVar) {
        Class b10 = C6781a.b(b.b(pVar));
        if (b10.isArray()) {
            Object newInstance = Array.newInstance(b10.getComponentType(), 0);
            C6496s.g(newInstance, "run(...)");
            return newInstance;
        }
        throw new Y0("Cannot instantiate the default empty array of type " + b10.getSimpleName() + ", because it is not an array type");
    }

    private final Type Q() {
        ParameterizedType parameterizedType;
        Type type;
        WildcardType wildcardType;
        Type[] lowerBounds;
        if (!isSuspend()) {
            return null;
        }
        Object B02 = C6565s.B0(S().a());
        if (B02 instanceof ParameterizedType) {
            parameterizedType = (ParameterizedType) B02;
        } else {
            parameterizedType = null;
        }
        if (parameterizedType != null) {
            type = parameterizedType.getRawType();
        } else {
            type = null;
        }
        if (!C6496s.c(type, C6658d.class)) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        C6496s.g(actualTypeArguments, "getActualTypeArguments(...)");
        Object Z02 = C6559l.Z0(actualTypeArguments);
        if (Z02 instanceof WildcardType) {
            wildcardType = (WildcardType) Z02;
        } else {
            wildcardType = null;
        }
        if (wildcardType == null || (lowerBounds = wildcardType.getLowerBounds()) == null) {
            return null;
        }
        return (Type) C6559l.b0(lowerBounds);
    }

    private final Object[] R() {
        return (Object[]) ((Object[]) this.f63536e.invoke()).clone();
    }

    private final int W(k kVar) {
        if (!((Boolean) this.f63537f.getValue()).booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        } else if (!j1.k(kVar.getType())) {
            return 1;
        } else {
            p type = kVar.getType();
            C6496s.f(type, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            List n10 = o.n(F0.a(((U0) type).A()));
            C6496s.e(n10);
            return n10.size();
        }
    }

    /* access modifiers changed from: private */
    public static final boolean Z(A a10) {
        Iterable<k> parameters = a10.getParameters();
        if ((parameters instanceof Collection) && ((Collection) parameters).isEmpty()) {
            return false;
        }
        for (k type : parameters) {
            if (j1.k(type.getType())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final Object[] q(A a10) {
        int i10;
        int i11;
        List<k> parameters = a10.getParameters();
        int size = parameters.size() + (a10.isSuspend() ? 1 : 0);
        if (((Boolean) a10.f63537f.getValue()).booleanValue()) {
            i10 = 0;
            for (k kVar : parameters) {
                if (kVar.h() == k.a.VALUE) {
                    i11 = a10.W(kVar);
                } else {
                    i11 = 0;
                }
                i10 += i11;
            }
        } else {
            Iterable<k> iterable = parameters;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                i10 = 0;
                for (k h10 : iterable) {
                    if (h10.h() == k.a.VALUE && (i10 = i10 + 1) < 0) {
                        C6565s.w();
                    }
                }
            } else {
                i10 = 0;
            }
        }
        int i12 = (i10 + 31) / 32;
        Object[] objArr = new Object[(size + i12 + 1)];
        for (k kVar2 : parameters) {
            if (kVar2.o() && !j1.l(kVar2.getType())) {
                objArr[kVar2.getIndex()] = j1.g(Hf.c.f(kVar2.getType()));
            } else if (kVar2.m()) {
                objArr[kVar2.getIndex()] = a10.P(kVar2.getType());
            }
        }
        for (int i13 = 0; i13 < i12; i13++) {
            objArr[size + i13] = 0;
        }
        return objArr;
    }

    /* access modifiers changed from: private */
    public static final List r(A a10) {
        return j1.e(a10.V());
    }

    /* access modifiers changed from: private */
    public static final ArrayList s(A a10) {
        int i10;
        C5484b V10 = a10.V();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        if (!a10.Y()) {
            c0 i12 = j1.i(V10);
            if (i12 != null) {
                arrayList.add(new C5473y0(a10, 0, k.a.INSTANCE, new C5468w(i12)));
                i10 = 1;
            } else {
                i10 = 0;
            }
            c0 P10 = V10.P();
            if (P10 != null) {
                arrayList.add(new C5473y0(a10, i10, k.a.EXTENSION_RECEIVER, new C5470x(P10)));
                i10++;
            }
        } else {
            i10 = 0;
        }
        int size = V10.k().size();
        while (i11 < size) {
            arrayList.add(new C5473y0(a10, i10, k.a.VALUE, new C5472y(V10, i11)));
            i11++;
            i10++;
        }
        if (a10.X() && (V10 instanceof Zf.a) && arrayList.size() > 1) {
            C6565s.C(arrayList, new a());
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final W z(C5484b bVar, int i10) {
        Object obj = bVar.k().get(i10);
        C6496s.g(obj, "get(...)");
        return (W) obj;
    }

    public final Object O(Map map, C6658d dVar) {
        int i10;
        C6496s.h(map, "args");
        List<k> parameters = getParameters();
        boolean z10 = false;
        if (parameters.isEmpty()) {
            try {
                return S().call(isSuspend() ? new C6658d[]{dVar} : new C6658d[0]);
            } catch (IllegalAccessException e10) {
                throw new Gf.a(e10);
            }
        } else {
            int size = parameters.size() + (isSuspend() ? 1 : 0);
            Object[] R10 = R();
            if (isSuspend()) {
                R10[parameters.size()] = dVar;
            }
            boolean booleanValue = ((Boolean) this.f63537f.getValue()).booleanValue();
            int i11 = 0;
            for (k kVar : parameters) {
                if (booleanValue) {
                    i10 = W(kVar);
                } else {
                    i10 = 1;
                }
                if (map.containsKey(kVar)) {
                    R10[kVar.getIndex()] = map.get(kVar);
                } else if (kVar.o()) {
                    if (booleanValue) {
                        int i12 = i11 + i10;
                        for (int i13 = i11; i13 < i12; i13++) {
                            int i14 = (i13 / 32) + size;
                            Object obj = R10[i14];
                            C6496s.f(obj, "null cannot be cast to non-null type kotlin.Int");
                            R10[i14] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i13 % 32)));
                        }
                    } else {
                        int i15 = (i11 / 32) + size;
                        Object obj2 = R10[i15];
                        C6496s.f(obj2, "null cannot be cast to non-null type kotlin.Int");
                        R10[i15] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i11 % 32)));
                    }
                    z10 = true;
                } else if (!kVar.m()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + kVar);
                }
                if (kVar.h() == k.a.VALUE) {
                    i11 += i10;
                }
            }
            if (!z10) {
                try {
                    h S10 = S();
                    Object[] copyOf = Arrays.copyOf(R10, size);
                    C6496s.g(copyOf, "copyOf(...)");
                    return S10.call(copyOf);
                } catch (IllegalAccessException e11) {
                    throw new Gf.a(e11);
                }
            } else {
                h U10 = U();
                if (U10 != null) {
                    try {
                        return U10.call(R10);
                    } catch (IllegalAccessException e12) {
                        throw new Gf.a(e12);
                    }
                } else {
                    throw new Y0("This callable does not support a default call: " + V());
                }
            }
        }
    }

    public abstract h S();

    public abstract C5432d0 T();

    public abstract h U();

    public abstract C5484b V();

    /* access modifiers changed from: protected */
    public final boolean X() {
        if (!C6496s.c(getName(), "<init>") || !T().f().isAnnotation()) {
            return false;
        }
        return true;
    }

    public abstract boolean Y();

    public Object call(Object... objArr) {
        C6496s.h(objArr, "args");
        try {
            return S().call(objArr);
        } catch (IllegalAccessException e10) {
            throw new Gf.a(e10);
        }
    }

    public Object callBy(Map map) {
        C6496s.h(map, "args");
        if (X()) {
            return N(map);
        }
        return O(map, (C6658d) null);
    }

    public List getAnnotations() {
        Object invoke = this.f63532a.invoke();
        C6496s.g(invoke, "invoke(...)");
        return (List) invoke;
    }

    public List getParameters() {
        Object invoke = this.f63533b.invoke();
        C6496s.g(invoke, "invoke(...)");
        return (List) invoke;
    }

    public p getReturnType() {
        Object invoke = this.f63534c.invoke();
        C6496s.g(invoke, "invoke(...)");
        return (p) invoke;
    }

    public List getTypeParameters() {
        Object invoke = this.f63535d.invoke();
        C6496s.g(invoke, "invoke(...)");
        return (List) invoke;
    }

    public t getVisibility() {
        C5502u visibility = V().getVisibility();
        C6496s.g(visibility, "getVisibility(...)");
        return j1.r(visibility);
    }

    public boolean isAbstract() {
        if (V().r() == E.ABSTRACT) {
            return true;
        }
        return false;
    }

    public boolean isFinal() {
        if (V().r() == E.FINAL) {
            return true;
        }
        return false;
    }

    public boolean isOpen() {
        if (V().r() == E.OPEN) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final W x(c0 c0Var) {
        return c0Var;
    }

    /* access modifiers changed from: private */
    public static final W y(c0 c0Var) {
        return c0Var;
    }
}
