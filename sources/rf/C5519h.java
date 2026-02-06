package Rf;

import Eg.i;
import Eg.n;
import Fg.C5366d0;
import Fg.C5389p;
import Fg.N0;
import Fg.S;
import Fg.V;
import Fg.r0;
import Fg.v0;
import Hg.k;
import Hg.l;
import Of.C5490h;
import Of.C5495m;
import Of.C5497o;
import Of.h0;
import Of.k0;
import Of.m0;
import Pf.h;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import ng.f;
import rg.C6689g;
import vg.C6755e;
import yf.C6787a;
import yg.C6810i;
import yg.C6812k;
import yg.C6825x;

/* renamed from: Rf.h  reason: case insensitive filesystem */
public abstract class C5519h extends C5525n implements m0 {

    /* renamed from: e  reason: collision with root package name */
    private final N0 f64846e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f64847f;

    /* renamed from: g  reason: collision with root package name */
    private final int f64848g;

    /* renamed from: h  reason: collision with root package name */
    private final i f64849h;

    /* renamed from: i  reason: collision with root package name */
    private final i f64850i;

    /* renamed from: j  reason: collision with root package name */
    private final n f64851j;

    /* renamed from: Rf.h$a */
    class a implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f64852a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k0 f64853b;

        a(n nVar, k0 k0Var) {
            this.f64852a = nVar;
            this.f64853b = k0Var;
        }

        /* renamed from: a */
        public v0 invoke() {
            return new c(C5519h.this, this.f64852a, this.f64853b);
        }
    }

    /* renamed from: Rf.h$b */
    class b implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f64855a;

        /* renamed from: Rf.h$b$a */
        class a implements C6787a {
            a() {
            }

            /* renamed from: a */
            public C6812k invoke() {
                return C6825x.m("Scope for type parameter " + b.this.f64855a.b(), C5519h.this.getUpperBounds());
            }
        }

        b(f fVar) {
            this.f64855a = fVar;
        }

        /* renamed from: a */
        public C5366d0 invoke() {
            return V.m(r0.f63046b.j(), C5519h.this.l(), Collections.emptyList(), false, new C6810i(new a()));
        }
    }

    /* renamed from: Rf.h$c */
    private class c extends C5389p {

        /* renamed from: d  reason: collision with root package name */
        private final k0 f64858d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5519h f64859e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5519h hVar, n nVar, k0 k0Var) {
            super(nVar);
            if (nVar == null) {
                H(0);
            }
            this.f64859e = hVar;
            this.f64858d = k0Var;
        }

        private static /* synthetic */ void H(int i10) {
            String str;
            int i11;
            Throwable th2;
            if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) {
                str = "@NotNull method %s.%s must not return null";
            } else {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            }
            if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) {
                i11 = 2;
            } else {
                i11 = 3;
            }
            Object[] objArr = new Object[i11];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i10 == 2) {
                objArr[1] = "getParameters";
            } else if (i10 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i10 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i10 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i10 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) {
                th2 = new IllegalStateException(format);
            } else {
                th2 = new IllegalArgumentException(format);
            }
            throw th2;
        }

        /* access modifiers changed from: protected */
        public boolean d(C5490h hVar) {
            if (hVar == null) {
                H(9);
            }
            if (!(hVar instanceof m0) || !C6689g.f73019a.m(this.f64859e, (m0) hVar, true)) {
                return false;
            }
            return true;
        }

        public List getParameters() {
            List emptyList = Collections.emptyList();
            if (emptyList == null) {
                H(2);
            }
            return emptyList;
        }

        public Lf.i m() {
            Lf.i m10 = C6755e.m(this.f64859e);
            if (m10 == null) {
                H(4);
            }
            return m10;
        }

        public C5490h o() {
            C5519h hVar = this.f64859e;
            if (hVar == null) {
                H(3);
            }
            return hVar;
        }

        public boolean p() {
            return true;
        }

        /* access modifiers changed from: protected */
        public Collection r() {
            List L02 = this.f64859e.L0();
            if (L02 == null) {
                H(1);
            }
            return L02;
        }

        /* access modifiers changed from: protected */
        public S s() {
            return l.d(k.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        public String toString() {
            return this.f64859e.getName().toString();
        }

        /* access modifiers changed from: protected */
        public k0 v() {
            k0 k0Var = this.f64858d;
            if (k0Var == null) {
                H(5);
            }
            return k0Var;
        }

        /* access modifiers changed from: protected */
        public List x(List list) {
            if (list == null) {
                H(7);
            }
            List H02 = this.f64859e.H0(list);
            if (H02 == null) {
                H(8);
            }
            return H02;
        }

        /* access modifiers changed from: protected */
        public void z(S s10) {
            if (s10 == null) {
                H(6);
            }
            this.f64859e.K0(s10);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C5519h(n nVar, C5495m mVar, h hVar, f fVar, N0 n02, boolean z10, int i10, h0 h0Var, k0 k0Var) {
        super(mVar, hVar, fVar, h0Var);
        if (nVar == null) {
            i0(0);
        }
        if (mVar == null) {
            i0(1);
        }
        if (hVar == null) {
            i0(2);
        }
        if (fVar == null) {
            i0(3);
        }
        if (n02 == null) {
            i0(4);
        }
        if (h0Var == null) {
            i0(5);
        }
        if (k0Var == null) {
            i0(6);
        }
        this.f64846e = n02;
        this.f64847f = z10;
        this.f64848g = i10;
        this.f64849h = nVar.g(new a(nVar, k0Var));
        this.f64850i = nVar.g(new b(fVar));
        this.f64851j = nVar;
    }

    private static /* synthetic */ void i0(int i10) {
        String str;
        int i11;
        Throwable th2;
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case StdKeyDeserializer.TYPE_URL:
                objArr[1] = "getStorageManager";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
                th2 = new IllegalStateException(format);
                break;
            default:
                th2 = new IllegalArgumentException(format);
                break;
        }
        throw th2;
    }

    /* access modifiers changed from: protected */
    public List H0(List list) {
        if (list == null) {
            i0(12);
        }
        if (list == null) {
            i0(13);
        }
        return list;
    }

    /* access modifiers changed from: protected */
    public abstract void K0(S s10);

    /* access modifiers changed from: protected */
    public abstract List L0();

    public n N() {
        n nVar = this.f64851j;
        if (nVar == null) {
            i0(14);
        }
        return nVar;
    }

    public boolean R() {
        return false;
    }

    public Object U(C5497o oVar, Object obj) {
        return oVar.k(this, obj);
    }

    public int getIndex() {
        return this.f64848g;
    }

    public List getUpperBounds() {
        List w10 = ((c) l()).l();
        if (w10 == null) {
            i0(8);
        }
        return w10;
    }

    public final v0 l() {
        v0 v0Var = (v0) this.f64849h.invoke();
        if (v0Var == null) {
            i0(9);
        }
        return v0Var;
    }

    public N0 n() {
        N0 n02 = this.f64846e;
        if (n02 == null) {
            i0(7);
        }
        return n02;
    }

    public C5366d0 p() {
        C5366d0 d0Var = (C5366d0) this.f64850i.invoke();
        if (d0Var == null) {
            i0(10);
        }
        return d0Var;
    }

    public boolean x() {
        return this.f64847f;
    }

    public m0 a() {
        m0 m0Var = (m0) super.a();
        if (m0Var == null) {
            i0(11);
        }
        return m0Var;
    }
}
