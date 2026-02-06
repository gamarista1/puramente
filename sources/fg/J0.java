package Fg;

import Gg.g;
import Hg.i;
import Hg.k;
import Hg.l;
import Of.C5487e;
import Of.C5490h;
import Of.m0;
import com.amazon.c.a.a.c;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.carousel.Carousel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mf.C6565s;
import yf.C6798l;
import yg.C6812k;

public abstract class J0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C5366d0 f62945a = l.d(k.DONT_CARE, new String[0]);

    /* renamed from: b  reason: collision with root package name */
    public static final C5366d0 f62946b = l.d(k.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* renamed from: c  reason: collision with root package name */
    public static final C5366d0 f62947c = new a("NO_EXPECTED_TYPE");

    /* renamed from: d  reason: collision with root package name */
    public static final C5366d0 f62948d = new a("UNIT_EXPECTED_TYPE");

    public static class a extends A {

        /* renamed from: b  reason: collision with root package name */
        private final String f62949b;

        public a(String str) {
            this.f62949b = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0044  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static /* synthetic */ void Z0(int r9) {
            /*
                r0 = 4
                r1 = 1
                if (r9 == r1) goto L_0x0009
                if (r9 == r0) goto L_0x0009
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto L_0x000b
            L_0x0009:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            L_0x000b:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L_0x0013
                if (r9 == r0) goto L_0x0013
                r5 = r3
                goto L_0x0014
            L_0x0013:
                r5 = r4
            L_0x0014:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
                r7 = 0
                if (r9 == r1) goto L_0x0030
                if (r9 == r4) goto L_0x002b
                if (r9 == r3) goto L_0x0026
                if (r9 == r0) goto L_0x0030
                java.lang.String r8 = "newAttributes"
                r5[r7] = r8
                goto L_0x0032
            L_0x0026:
                java.lang.String r8 = "kotlinTypeRefiner"
                r5[r7] = r8
                goto L_0x0032
            L_0x002b:
                java.lang.String r8 = "delegate"
                r5[r7] = r8
                goto L_0x0032
            L_0x0030:
                r5[r7] = r6
            L_0x0032:
                java.lang.String r7 = "refine"
                if (r9 == r1) goto L_0x003e
                if (r9 == r0) goto L_0x003b
                r5[r1] = r6
                goto L_0x0042
            L_0x003b:
                r5[r1] = r7
                goto L_0x0042
            L_0x003e:
                java.lang.String r6 = "toString"
                r5[r1] = r6
            L_0x0042:
                if (r9 == r1) goto L_0x0056
                if (r9 == r4) goto L_0x0052
                if (r9 == r3) goto L_0x004f
                if (r9 == r0) goto L_0x0056
                java.lang.String r3 = "replaceAttributes"
                r5[r4] = r3
                goto L_0x0056
            L_0x004f:
                r5[r4] = r7
                goto L_0x0056
            L_0x0052:
                java.lang.String r3 = "replaceDelegate"
                r5[r4] = r3
            L_0x0056:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L_0x0064
                if (r9 == r0) goto L_0x0064
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L_0x0069
            L_0x0064:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L_0x0069:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: Fg.J0.a.Z0(int):void");
        }

        /* renamed from: U0 */
        public C5366d0 R0(boolean z10) {
            throw new IllegalStateException(this.f62949b);
        }

        /* renamed from: V0 */
        public C5366d0 T0(r0 r0Var) {
            if (r0Var == null) {
                Z0(0);
            }
            throw new IllegalStateException(this.f62949b);
        }

        /* access modifiers changed from: protected */
        public C5366d0 W0() {
            throw new IllegalStateException(this.f62949b);
        }

        public A Y0(C5366d0 d0Var) {
            if (d0Var == null) {
                Z0(2);
            }
            throw new IllegalStateException(this.f62949b);
        }

        /* renamed from: a1 */
        public a X0(g gVar) {
            if (gVar == null) {
                Z0(3);
            }
            return this;
        }

        public String toString() {
            String str = this.f62949b;
            if (str == null) {
                Z0(1);
            }
            return str;
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        Throwable th2;
        int i12 = i10;
        if (!(i12 == 4 || i12 == 9 || i12 == 11 || i12 == 15 || i12 == 17 || i12 == 19 || i12 == 26 || i12 == 35 || i12 == 48 || i12 == 53 || i12 == 6 || i12 == 7)) {
            switch (i12) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i12 == 4 || i12 == 9 || i12 == 11 || i12 == 15 || i12 == 17 || i12 == 19 || i12 == 26 || i12 == 35 || i12 == 48 || i12 == 53 || i12 == 6 || i12 == 7)) {
            switch (i12) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    i11 = 3;
                    break;
            }
        }
        i11 = 2;
        Object[] objArr = new Object[i11];
        switch (i12) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case StdKeyDeserializer.TYPE_CLASS:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case StdKeyDeserializer.TYPE_URL:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case InboxPagingSource.PAGE_SIZE /*20*/:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case CharsToNameCanonicalizer.HASH_MULT:
                objArr[0] = "clazz";
                break;
            case c.f37660h:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case Carousel.ENTITY_TYPE /*44*/:
                objArr[0] = "isSpecialType";
                break;
            case 45:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 47:
            case 51:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 49:
            case 50:
                objArr[0] = "supertypes";
                break;
            case 52:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
            default:
                objArr[0] = "type";
                break;
        }
        if (i12 != 4) {
            if (i12 != 9) {
                if (i12 == 11 || i12 == 15) {
                    objArr[1] = "makeUnsubstitutedType";
                } else if (i12 == 17) {
                    objArr[1] = "getDefaultTypeProjections";
                } else if (i12 == 19) {
                    objArr[1] = "getImmediateSupertypes";
                } else if (i12 == 26) {
                    objArr[1] = "getAllSupertypes";
                } else if (i12 == 35) {
                    objArr[1] = "substituteProjectionsForParameters";
                } else if (i12 != 48) {
                    if (i12 != 53) {
                        if (!(i12 == 6 || i12 == 7)) {
                            switch (i12) {
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                    break;
                                default:
                                    objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                                    break;
                            }
                        }
                    }
                    objArr[1] = "getPrimitiveNumberType";
                } else {
                    objArr[1] = "getDefaultPrimitiveNumberType";
                }
            }
            objArr[1] = "makeNullableIfNeeded";
        } else {
            objArr[1] = "makeNullableAsSpecified";
        }
        switch (i12) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case StdKeyDeserializer.TYPE_CLASS:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case c.f37660h:
                objArr[2] = "substituteParameters";
                break;
            case CharsToNameCanonicalizer.HASH_MULT:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case Carousel.ENTITY_TYPE /*44*/:
                objArr[2] = "contains";
                break;
            case 45:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 47:
            case 49:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 50:
                objArr[2] = "findByFqName";
                break;
            case 51:
            case 52:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i12 == 4 || i12 == 9 || i12 == 11 || i12 == 15 || i12 == 17 || i12 == 19 || i12 == 26 || i12 == 35 || i12 == 48 || i12 == 53 || i12 == 6 || i12 == 7)) {
            switch (i12) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    th2 = new IllegalArgumentException(format);
                    break;
            }
        }
        th2 = new IllegalStateException(format);
        throw th2;
    }

    public static boolean b(S s10) {
        if (s10 == null) {
            a(28);
        }
        if (s10.O0()) {
            return true;
        }
        if (!L.b(s10) || !b(L.a(s10).W0())) {
            return false;
        }
        return true;
    }

    public static boolean c(S s10, C6798l lVar) {
        if (lVar == null) {
            a(43);
        }
        return d(s10, lVar, (Pg.l) null);
    }

    private static boolean d(S s10, C6798l lVar, Pg.l lVar2) {
        I i10;
        if (lVar == null) {
            a(44);
        }
        if (s10 == null) {
            return false;
        }
        M0 Q02 = s10.Q0();
        if (w(s10)) {
            return ((Boolean) lVar.invoke(Q02)).booleanValue();
        }
        if (lVar2 != null && lVar2.contains(s10)) {
            return false;
        }
        if (((Boolean) lVar.invoke(Q02)).booleanValue()) {
            return true;
        }
        if (lVar2 == null) {
            lVar2 = Pg.l.b();
        }
        lVar2.add(s10);
        if (Q02 instanceof I) {
            i10 = (I) Q02;
        } else {
            i10 = null;
        }
        if (i10 != null && (d(i10.V0(), lVar, lVar2) || d(i10.W0(), lVar, lVar2))) {
            return true;
        }
        if ((Q02 instanceof C5397y) && d(((C5397y) Q02).Z0(), lVar, lVar2)) {
            return true;
        }
        v0 N02 = s10.N0();
        if (N02 instanceof Q) {
            for (S d10 : ((Q) N02).l()) {
                if (d(d10, lVar, lVar2)) {
                    return true;
                }
            }
            return false;
        }
        for (B0 b02 : s10.L0()) {
            if (!b02.a() && d(b02.getType(), lVar, lVar2)) {
                return true;
            }
        }
        return false;
    }

    public static S e(S s10, S s11, G0 g02) {
        if (s10 == null) {
            a(20);
        }
        if (s11 == null) {
            a(21);
        }
        if (g02 == null) {
            a(22);
        }
        S p10 = g02.p(s11, N0.INVARIANT);
        if (p10 != null) {
            return q(p10, s10.O0());
        }
        return null;
    }

    public static C5487e f(S s10) {
        if (s10 == null) {
            a(30);
        }
        C5490h o10 = s10.N0().o();
        if (o10 instanceof C5487e) {
            return (C5487e) o10;
        }
        return null;
    }

    public static List g(List list) {
        if (list == null) {
            a(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new D0(((m0) it.next()).p()));
        }
        List e12 = C6565s.e1(arrayList);
        if (e12 == null) {
            a(17);
        }
        return e12;
    }

    public static List h(S s10) {
        if (s10 == null) {
            a(18);
        }
        G0 f10 = G0.f(s10);
        Collection<S> l10 = s10.N0().l();
        ArrayList arrayList = new ArrayList(l10.size());
        for (S e10 : l10) {
            S e11 = e(s10, e10, f10);
            if (e11 != null) {
                arrayList.add(e11);
            }
        }
        return arrayList;
    }

    public static m0 i(S s10) {
        if (s10 == null) {
            a(63);
        }
        if (s10.N0().o() instanceof m0) {
            return (m0) s10.N0().o();
        }
        return null;
    }

    public static boolean j(S s10) {
        if (s10 == null) {
            a(29);
        }
        if (s10.N0().o() instanceof C5487e) {
            return false;
        }
        for (S l10 : h(s10)) {
            if (l(l10)) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(S s10) {
        if (s10 == null || s10.N0() != f62945a.N0()) {
            return false;
        }
        return true;
    }

    public static boolean l(S s10) {
        if (s10 == null) {
            a(27);
        }
        if (s10.O0()) {
            return true;
        }
        if (L.b(s10) && l(L.a(s10).W0())) {
            return true;
        }
        if (C5374h0.c(s10)) {
            return false;
        }
        if (m(s10)) {
            return j(s10);
        }
        v0 N02 = s10.N0();
        if (N02 instanceof Q) {
            for (S l10 : N02.l()) {
                if (l(l10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m(S s10) {
        if (s10 == null) {
            a(60);
        }
        if (i(s10) != null) {
            return true;
        }
        s10.N0();
        return false;
    }

    public static S n(S s10) {
        if (s10 == null) {
            a(2);
        }
        return p(s10, false);
    }

    public static S o(S s10) {
        if (s10 == null) {
            a(1);
        }
        return p(s10, true);
    }

    public static S p(S s10, boolean z10) {
        if (s10 == null) {
            a(3);
        }
        M0 R02 = s10.Q0().R0(z10);
        if (R02 == null) {
            a(4);
        }
        return R02;
    }

    public static S q(S s10, boolean z10) {
        if (s10 == null) {
            a(8);
        }
        if (z10) {
            return o(s10);
        }
        if (s10 == null) {
            a(9);
        }
        return s10;
    }

    public static C5366d0 r(C5366d0 d0Var, boolean z10) {
        if (d0Var == null) {
            a(5);
        }
        if (z10) {
            C5366d0 U02 = d0Var.U0(true);
            if (U02 == null) {
                a(6);
            }
            return U02;
        }
        if (d0Var == null) {
            a(7);
        }
        return d0Var;
    }

    public static B0 s(m0 m0Var) {
        if (m0Var == null) {
            a(45);
        }
        return new C5380k0(m0Var);
    }

    public static B0 t(m0 m0Var, G g10) {
        if (m0Var == null) {
            a(46);
        }
        if (g10.b() == I0.SUPERTYPE) {
            return new D0(C5382l0.b(m0Var));
        }
        return new C5380k0(m0Var);
    }

    public static C5366d0 u(v0 v0Var, C6812k kVar, C6798l lVar) {
        if (v0Var == null) {
            a(12);
        }
        if (kVar == null) {
            a(13);
        }
        if (lVar == null) {
            a(14);
        }
        C5366d0 n10 = V.n(r0.f63046b.j(), v0Var, g(v0Var.getParameters()), false, kVar, lVar);
        if (n10 == null) {
            a(15);
        }
        return n10;
    }

    public static C5366d0 v(C5490h hVar, C6812k kVar, C6798l lVar) {
        if (!l.m(hVar)) {
            return u(hVar.l(), kVar, lVar);
        }
        i d10 = l.d(k.UNABLE_TO_SUBSTITUTE_TYPE, hVar.toString());
        if (d10 == null) {
            a(11);
        }
        return d10;
    }

    public static boolean w(S s10) {
        if (s10 == null) {
            a(0);
        }
        if (s10 == f62947c || s10 == f62948d) {
            return true;
        }
        return false;
    }
}
