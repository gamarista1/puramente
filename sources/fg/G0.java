package Fg;

import Gg.n;
import Hg.k;
import Hg.l;
import Lf.i;
import Lf.o;
import Of.m0;
import Pf.h;
import Pf.p;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.ArrayList;
import java.util.List;
import sg.C6721e;
import yf.C6798l;

public class G0 {

    /* renamed from: b  reason: collision with root package name */
    public static final G0 f62929b = g(E0.f62924b);

    /* renamed from: a  reason: collision with root package name */
    private final E0 f62930a;

    static class a implements C6798l {
        a() {
        }

        private static /* synthetic */ void a(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"}));
        }

        /* renamed from: b */
        public Boolean invoke(ng.c cVar) {
            if (cVar == null) {
                a(0);
            }
            return Boolean.valueOf(!cVar.equals(o.a.f63985Q));
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f62931a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                Fg.G0$d[] r0 = Fg.G0.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f62931a = r0
                Fg.G0$d r1 = Fg.G0.d.OUT_IN_IN_POSITION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f62931a     // Catch:{ NoSuchFieldError -> 0x001d }
                Fg.G0$d r1 = Fg.G0.d.IN_IN_OUT_POSITION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f62931a     // Catch:{ NoSuchFieldError -> 0x0028 }
                Fg.G0$d r1 = Fg.G0.d.NO_CONFLICT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Fg.G0.b.<clinit>():void");
        }
    }

    private static final class c extends Exception {
        public c(String str) {
            super(str);
        }
    }

    private enum d {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    protected G0(E0 e02) {
        if (e02 == null) {
            a(7);
        }
        this.f62930a = e02;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (!(i10 == 1 || i10 == 2 || i10 == 8 || i10 == 34 || i10 == 37)) {
            switch (i10) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i10) {
                        case 19:
                        case InboxPagingSource.PAGE_SIZE /*20*/:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i10) {
                                case 29:
                                case 30:
                                case 31:
                                case com.amazon.c.a.a.c.f37660h:
                                    break;
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                            }
                    }
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i10 == 1 || i10 == 2 || i10 == 8 || i10 == 34 || i10 == 37)) {
            switch (i10) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i10) {
                        case 19:
                        case InboxPagingSource.PAGE_SIZE /*20*/:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i10) {
                                case 29:
                                case 30:
                                case 31:
                                case com.amazon.c.a.a.c.f37660h:
                                    break;
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            i11 = 3;
                                            break;
                                    }
                            }
                    }
            }
        }
        i11 = 2;
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case com.amazon.c.a.a.c.f37660h:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 9:
            case StdKeyDeserializer.TYPE_URL:
                objArr[0] = "type";
                break;
            case 10:
            case StdKeyDeserializer.TYPE_CLASS:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case CharsToNameCanonicalizer.HASH_MULT:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
            default:
                objArr[0] = "substitution";
                break;
        }
        if (i10 == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i10 == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i10 == 8) {
            objArr[1] = "getSubstitution";
        } else if (i10 != 34) {
            if (i10 != 37) {
                switch (i10) {
                    case 11:
                    case 12:
                    case 13:
                        objArr[1] = "safeSubstitute";
                        break;
                    default:
                        switch (i10) {
                            case 19:
                            case InboxPagingSource.PAGE_SIZE /*20*/:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                                objArr[1] = "unsafeSubstitute";
                                break;
                            default:
                                switch (i10) {
                                    case 29:
                                    case 30:
                                    case 31:
                                    case com.amazon.c.a.a.c.f37660h:
                                        objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                        break;
                                    default:
                                        switch (i10) {
                                            case 40:
                                            case 41:
                                            case 42:
                                                break;
                                            default:
                                                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                                break;
                                        }
                                }
                        }
                }
            }
            objArr[1] = "combine";
        } else {
            objArr[1] = "filterOutUnsafeVariance";
        }
        switch (i10) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case com.amazon.c.a.a.c.f37660h:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case CharsToNameCanonicalizer.HASH_MULT:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i10 == 1 || i10 == 2 || i10 == 8 || i10 == 34 || i10 == 37)) {
            switch (i10) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i10) {
                        case 19:
                        case InboxPagingSource.PAGE_SIZE /*20*/:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i10) {
                                case 29:
                                case 30:
                                case 31:
                                case com.amazon.c.a.a.c.f37660h:
                                    break;
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            th2 = new IllegalArgumentException(format);
                                            break;
                                    }
                            }
                    }
            }
        }
        th2 = new IllegalStateException(format);
        throw th2;
    }

    private static void b(int i10, B0 b02, E0 e02) {
        if (i10 > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + o(b02) + "; substitution: " + o(e02));
        }
    }

    public static N0 c(N0 n02, B0 b02) {
        if (n02 == null) {
            a(35);
        }
        if (b02 == null) {
            a(36);
        }
        if (!b02.a()) {
            return d(n02, b02.b());
        }
        N0 n03 = N0.OUT_VARIANCE;
        if (n03 == null) {
            a(37);
        }
        return n03;
    }

    public static N0 d(N0 n02, N0 n03) {
        if (n02 == null) {
            a(38);
        }
        if (n03 == null) {
            a(39);
        }
        N0 n04 = N0.INVARIANT;
        if (n02 == n04) {
            if (n03 == null) {
                a(40);
            }
            return n03;
        } else if (n03 == n04) {
            if (n02 == null) {
                a(41);
            }
            return n02;
        } else if (n02 == n03) {
            if (n03 == null) {
                a(42);
            }
            return n03;
        } else {
            throw new AssertionError("Variance conflict: type parameter variance '" + n02 + "' and projection kind '" + n03 + "' cannot be combined");
        }
    }

    private static d e(N0 n02, N0 n03) {
        N0 n04 = N0.IN_VARIANCE;
        if (n02 == n04 && n03 == N0.OUT_VARIANCE) {
            return d.OUT_IN_IN_POSITION;
        }
        if (n02 == N0.OUT_VARIANCE && n03 == n04) {
            return d.IN_IN_OUT_POSITION;
        }
        return d.NO_CONFLICT;
    }

    public static G0 f(S s10) {
        if (s10 == null) {
            a(6);
        }
        return g(w0.i(s10.N0(), s10.L0()));
    }

    public static G0 g(E0 e02) {
        if (e02 == null) {
            a(0);
        }
        return new G0(e02);
    }

    public static G0 h(E0 e02, E0 e03) {
        if (e02 == null) {
            a(3);
        }
        if (e03 == null) {
            a(4);
        }
        return g(D.i(e02, e03));
    }

    private static h i(h hVar) {
        if (hVar == null) {
            a(33);
        }
        if (!hVar.n0(o.a.f63985Q)) {
            return hVar;
        }
        return new p(hVar, new a());
    }

    private static B0 l(S s10, B0 b02, m0 m0Var, B0 b03) {
        if (s10 == null) {
            a(26);
        }
        if (b02 == null) {
            a(27);
        }
        if (b03 == null) {
            a(28);
        }
        if (!s10.getAnnotations().n0(o.a.f63985Q)) {
            if (b02 == null) {
                a(29);
            }
            return b02;
        }
        v0 N02 = b02.getType().N0();
        if (!(N02 instanceof n)) {
            return b02;
        }
        B0 a10 = ((n) N02).a();
        N0 b10 = a10.b();
        d e10 = e(b03.b(), b10);
        d dVar = d.OUT_IN_IN_POSITION;
        if (e10 == dVar) {
            return new D0(a10.getType());
        }
        if (m0Var != null && e(m0Var.n(), b10) == dVar) {
            return new D0(a10.getType());
        }
        return b02;
    }

    private static String o(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th2) {
            if (!Pg.d.a(th2)) {
                return "[Exception while computing toString(): " + th2 + "]";
            }
            throw th2;
        }
    }

    private B0 r(B0 b02, int i10) {
        S s10;
        S type = b02.getType();
        N0 b10 = b02.b();
        if (type.N0().o() instanceof m0) {
            return b02;
        }
        C5366d0 b11 = C5374h0.b(type);
        if (b11 != null) {
            s10 = m().p(b11, N0.INVARIANT);
        } else {
            s10 = null;
        }
        S b12 = F0.b(type, s(type.N0().getParameters(), type.L0(), i10), this.f62930a.d(type.getAnnotations()));
        if ((b12 instanceof C5366d0) && (s10 instanceof C5366d0)) {
            b12 = C5374h0.j((C5366d0) b12, (C5366d0) s10);
        }
        return new D0(b10, b12);
    }

    private List s(List list, List list2, int i10) {
        N0 n02;
        ArrayList arrayList = new ArrayList(list.size());
        boolean z10 = false;
        for (int i11 = 0; i11 < list.size(); i11++) {
            m0 m0Var = (m0) list.get(i11);
            B0 b02 = (B0) list2.get(i11);
            B0 u10 = u(b02, m0Var, i10 + 1);
            int i12 = b.f62931a[e(m0Var.n(), u10.b()).ordinal()];
            if (i12 == 1 || i12 == 2) {
                u10 = J0.s(m0Var);
            } else if (i12 == 3 && m0Var.n() != (n02 = N0.INVARIANT) && !u10.a()) {
                u10 = new D0(n02, u10.getType());
            }
            if (u10 != b02) {
                z10 = true;
            }
            arrayList.add(u10);
        }
        if (!z10) {
            return list2;
        }
        return arrayList;
    }

    private B0 u(B0 b02, m0 m0Var, int i10) {
        B0 b03;
        S s10;
        if (b02 == null) {
            a(18);
        }
        b(i10, b02, this.f62930a);
        if (b02.a()) {
            return b02;
        }
        S type = b02.getType();
        if (type instanceof K0) {
            K0 k02 = (K0) type;
            M0 H02 = k02.H0();
            S i02 = k02.i0();
            B0 u10 = u(new D0(b02.b(), H02), m0Var, i10 + 1);
            if (u10.a()) {
                return u10;
            }
            return new D0(u10.b(), L0.d(u10.getType().Q0(), p(i02, b02.b())));
        }
        if (!E.a(type) && !(type.Q0() instanceof C5364c0)) {
            B0 e10 = this.f62930a.e(type);
            if (e10 != null) {
                b03 = l(type, e10, m0Var, b02);
            } else {
                b03 = null;
            }
            N0 b10 = b02.b();
            if (b03 == null && L.b(type) && !t0.b(type)) {
                I a10 = L.a(type);
                int i11 = i10 + 1;
                B0 u11 = u(new D0(b10, a10.V0()), m0Var, i11);
                B0 u12 = u(new D0(b10, a10.W0()), m0Var, i11);
                N0 b11 = u11.b();
                if (u11.getType() == a10.V0() && u12.getType() == a10.W0()) {
                    return b02;
                }
                return new D0(b11, V.e(F0.a(u11.getType()), F0.a(u12.getType())));
            } else if (!i.n0(type) && !W.a(type)) {
                if (b03 != null) {
                    d e11 = e(b10, b03.b());
                    if (!C6721e.f(type)) {
                        int i12 = b.f62931a[e11.ordinal()];
                        if (i12 == 1) {
                            throw new c("Out-projection in in-position");
                        } else if (i12 == 2) {
                            return new D0(N0.OUT_VARIANCE, type.N0().m().I());
                        }
                    }
                    C5395w a11 = t0.a(type);
                    if (b03.a()) {
                        return b03;
                    }
                    if (a11 != null) {
                        s10 = a11.m0(b03.getType());
                    } else {
                        s10 = J0.q(b03.getType(), type.O0());
                    }
                    if (!type.getAnnotations().isEmpty()) {
                        s10 = Kg.d.C(s10, new Pf.o(s10.getAnnotations(), i(this.f62930a.d(type.getAnnotations()))));
                    }
                    if (e11 == d.NO_CONFLICT) {
                        b10 = d(b10, b03.b());
                    }
                    return new D0(b10, s10);
                }
                b02 = r(b02, i10);
                if (b02 == null) {
                    a(25);
                }
            }
        }
        return b02;
    }

    public E0 j() {
        E0 e02 = this.f62930a;
        if (e02 == null) {
            a(8);
        }
        return e02;
    }

    public boolean k() {
        return this.f62930a.f();
    }

    public G0 m() {
        E0 e02 = this.f62930a;
        if (!(e02 instanceof M) || !e02.b()) {
            return this;
        }
        return new G0(new M(((M) this.f62930a).j(), ((M) this.f62930a).i(), false));
    }

    public S n(S s10, N0 n02) {
        if (s10 == null) {
            a(9);
        }
        if (n02 == null) {
            a(10);
        }
        if (k()) {
            if (s10 == null) {
                a(11);
            }
            return s10;
        }
        try {
            S type = u(new D0(n02, s10), (m0) null, 0).getType();
            if (type == null) {
                a(12);
            }
            return type;
        } catch (c e10) {
            Hg.i d10 = l.d(k.UNABLE_TO_SUBSTITUTE_TYPE, e10.getMessage());
            if (d10 == null) {
                a(13);
            }
            return d10;
        }
    }

    public S p(S s10, N0 n02) {
        if (s10 == null) {
            a(14);
        }
        if (n02 == null) {
            a(15);
        }
        B0 q10 = q(new D0(n02, j().g(s10, n02)));
        if (q10 == null) {
            return null;
        }
        return q10.getType();
    }

    public B0 q(B0 b02) {
        if (b02 == null) {
            a(16);
        }
        B0 t10 = t(b02);
        if (this.f62930a.a() || this.f62930a.b()) {
            return Lg.c.d(t10, this.f62930a.b());
        }
        return t10;
    }

    public B0 t(B0 b02) {
        if (b02 == null) {
            a(17);
        }
        if (k()) {
            return b02;
        }
        try {
            return u(b02, (m0) null, 0);
        } catch (c unused) {
            return null;
        }
    }
}
