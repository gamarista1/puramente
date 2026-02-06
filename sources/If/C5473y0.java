package If;

import Ef.i;
import Ff.k;
import Ff.l;
import Ff.p;
import Fg.S;
import If.a1;
import Jf.h;
import Jf.n;
import Of.C5484b;
import Of.C5487e;
import Of.C5495m;
import Of.W;
import Of.c0;
import Of.t0;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import mf.C6559l;
import mf.C6565s;
import ng.f;
import vg.C6755e;
import xf.C6782b;
import yf.C6787a;
import yf.C6798l;

/* renamed from: If.y0  reason: case insensitive filesystem */
public final class C5473y0 implements k {

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ l[] f63761f;

    /* renamed from: a  reason: collision with root package name */
    private final A f63762a;

    /* renamed from: b  reason: collision with root package name */
    private final int f63763b;

    /* renamed from: c  reason: collision with root package name */
    private final k.a f63764c;

    /* renamed from: d  reason: collision with root package name */
    private final a1.a f63765d;

    /* renamed from: e  reason: collision with root package name */
    private final a1.a f63766e = a1.c(new C5469w0(this));

    /* renamed from: If.y0$a */
    private static final class a implements Type {

        /* renamed from: a  reason: collision with root package name */
        private final Type[] f63767a;

        /* renamed from: b  reason: collision with root package name */
        private final int f63768b;

        public a(Type[] typeArr) {
            C6496s.h(typeArr, "types");
            this.f63767a = typeArr;
            this.f63768b = Arrays.hashCode(typeArr);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a) || !Arrays.equals(this.f63767a, ((a) obj).f63767a)) {
                return false;
            }
            return true;
        }

        public String getTypeName() {
            return C6559l.M0(this.f63767a, ", ", "[", "]", 0, (CharSequence) null, (C6798l) null, 56, (Object) null);
        }

        public int hashCode() {
            return this.f63768b;
        }

        public String toString() {
            return getTypeName();
        }
    }

    static {
        Class<C5473y0> cls = C5473y0.class;
        f63761f = new l[]{O.i(new F(O.b(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), O.i(new F(O.b(cls), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public C5473y0(A a10, int i10, k.a aVar, C6787a aVar2) {
        C6496s.h(a10, "callable");
        C6496s.h(aVar, "kind");
        C6496s.h(aVar2, "computeDescriptor");
        this.f63762a = a10;
        this.f63763b = i10;
        this.f63764c = aVar;
        this.f63765d = a1.c(aVar2);
    }

    /* access modifiers changed from: private */
    public static final Type f(C5473y0 y0Var) {
        List list;
        W s10 = y0Var.s();
        if (!(s10 instanceof c0) || !C6496s.c(j1.i(y0Var.f63762a.V()), s10) || y0Var.f63762a.V().h() != C5484b.a.FAKE_OVERRIDE) {
            h S10 = y0Var.f63762a.S();
            if (S10 instanceof n) {
                if (y0Var.f63762a.Y()) {
                    n nVar = (n) S10;
                    i e10 = nVar.e(y0Var.getIndex() + 1);
                    int n10 = nVar.e(0).n() + 1;
                    list = C6565s.S0(nVar.a(), new i(e10.k() - n10, e10.n() - n10));
                } else {
                    n nVar2 = (n) S10;
                    list = C6565s.S0(nVar2.a(), nVar2.e(y0Var.getIndex()));
                }
                Type[] typeArr = (Type[]) list.toArray(new Type[0]);
                return y0Var.q((Type[]) Arrays.copyOf(typeArr, typeArr.length));
            } else if (!(S10 instanceof n.b)) {
                return (Type) S10.a().get(y0Var.getIndex());
            } else {
                Class[] clsArr = (Class[]) ((Collection) ((n.b) S10).c().get(y0Var.getIndex())).toArray(new Class[0]);
                return y0Var.q((Type[]) Arrays.copyOf(clsArr, clsArr.length));
            }
        } else {
            C5495m b10 = y0Var.f63762a.V().b();
            C6496s.f(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class q10 = j1.q((C5487e) b10);
            if (q10 != null) {
                return q10;
            }
            throw new Y0("Cannot determine receiver Java type of inherited declaration: " + s10);
        }
    }

    /* access modifiers changed from: private */
    public static final List n(C5473y0 y0Var) {
        return j1.e(y0Var.s());
    }

    private final Type q(Type... typeArr) {
        int length = typeArr.length;
        if (length == 0) {
            throw new C6782b("Expected at least 1 type for compound type");
        } else if (length != 1) {
            return new a(typeArr);
        } else {
            return (Type) C6559l.Z0(typeArr);
        }
    }

    private final W s() {
        Object b10 = this.f63765d.b(this, f63761f[0]);
        C6496s.g(b10, "getValue(...)");
        return (W) b10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5473y0) {
            C5473y0 y0Var = (C5473y0) obj;
            if (!C6496s.c(this.f63762a, y0Var.f63762a) || getIndex() != y0Var.getIndex()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public List getAnnotations() {
        Object b10 = this.f63766e.b(this, f63761f[1]);
        C6496s.g(b10, "getValue(...)");
        return (List) b10;
    }

    public int getIndex() {
        return this.f63763b;
    }

    public String getName() {
        t0 t0Var;
        W s10 = s();
        if (s10 instanceof t0) {
            t0Var = (t0) s10;
        } else {
            t0Var = null;
        }
        if (t0Var == null || t0Var.b().h0()) {
            return null;
        }
        f name = t0Var.getName();
        C6496s.g(name, "getName(...)");
        if (name.j()) {
            return null;
        }
        return name.b();
    }

    public p getType() {
        S type = s().getType();
        C6496s.g(type, "getType(...)");
        return new U0(type, new C5471x0(this));
    }

    public k.a h() {
        return this.f63764c;
    }

    public int hashCode() {
        return (this.f63762a.hashCode() * 31) + Integer.hashCode(getIndex());
    }

    public boolean m() {
        W s10 = s();
        if (!(s10 instanceof t0) || ((t0) s10).v0() == null) {
            return false;
        }
        return true;
    }

    public boolean o() {
        t0 t0Var;
        W s10 = s();
        if (s10 instanceof t0) {
            t0Var = (t0) s10;
        } else {
            t0Var = null;
        }
        if (t0Var != null) {
            return C6755e.f(t0Var);
        }
        return false;
    }

    public final A r() {
        return this.f63762a;
    }

    public String toString() {
        return e1.f63668a.j(this);
    }
}
