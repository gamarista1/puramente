package rg;

import Fg.D0;
import Fg.N0;
import Fg.S;
import Fg.V;
import Fg.r0;
import Lf.o;
import Of.C5483a;
import Of.C5484b;
import Of.C5487e;
import Of.C5494l;
import Of.C5501t;
import Of.C5502u;
import Of.C5507z;
import Of.E;
import Of.H;
import Of.Z;
import Of.a0;
import Of.b0;
import Of.c0;
import Of.g0;
import Of.h0;
import Of.t0;
import Pf.h;
import Rf.C5520i;
import Rf.K;
import Rf.L;
import Rf.M;
import Rf.N;
import Rf.O;
import com.amazon.c.a.a.c;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.Collections;
import ng.f;
import ng.g;
import vg.C6755e;
import zg.C6835b;
import zg.C6836c;
import zg.C6837d;
import zg.C6840g;

/* renamed from: rg.h  reason: case insensitive filesystem */
public abstract class C6690h {

    /* renamed from: rg.h$a */
    private static class a extends C5520i {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C5487e eVar, h0 h0Var, boolean z10) {
            super(eVar, (C5494l) null, h.f64602L.b(), true, C5484b.a.DECLARATION, h0Var);
            if (eVar == null) {
                i0(0);
            }
            if (h0Var == null) {
                i0(1);
            }
            q1(Collections.emptyList(), C6691i.k(eVar, z10));
        }

        private static /* synthetic */ void i0(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (i10 == 12 || i10 == 23 || i10 == 25) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i10 == 12 || i10 == 23 || i10 == 25) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 4:
            case 8:
            case StdKeyDeserializer.TYPE_URL:
            case 16:
            case 18:
            case 31:
            case CharsToNameCanonicalizer.HASH_MULT:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case InboxPagingSource.PAGE_SIZE:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case c.f37660h:
            case 34:
                objArr[0] = "owner";
                break;
            default:
                objArr[0] = "propertyDescriptor";
                break;
        }
        if (i10 == 12) {
            objArr[1] = "createSetter";
        } else if (i10 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i10 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case StdKeyDeserializer.TYPE_URL:
                objArr[2] = "createDefaultGetter";
                break;
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case InboxPagingSource.PAGE_SIZE:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case c.f37660h:
            case CharsToNameCanonicalizer.HASH_MULT:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 12 || i10 == 23 || i10 == 25) {
            th2 = new IllegalStateException(format);
        } else {
            th2 = new IllegalArgumentException(format);
        }
        throw th2;
    }

    public static c0 b(C5483a aVar, S s10, f fVar, h hVar, int i10) {
        if (aVar == null) {
            a(32);
        }
        if (hVar == null) {
            a(33);
        }
        if (s10 == null) {
            return null;
        }
        return new N(aVar, new C6836c(aVar, s10, fVar, (C6840g) null), hVar, g.a(i10));
    }

    public static c0 c(C5487e eVar, S s10, f fVar, h hVar, int i10) {
        if (eVar == null) {
            a(34);
        }
        if (hVar == null) {
            a(35);
        }
        if (s10 == null) {
            return null;
        }
        return new N(eVar, new C6835b(eVar, s10, fVar, (C6840g) null), hVar, g.a(i10));
    }

    public static L d(Z z10, h hVar) {
        if (z10 == null) {
            a(13);
        }
        if (hVar == null) {
            a(14);
        }
        return j(z10, hVar, true, false, false);
    }

    public static M e(Z z10, h hVar, h hVar2) {
        if (z10 == null) {
            a(0);
        }
        if (hVar == null) {
            a(1);
        }
        if (hVar2 == null) {
            a(2);
        }
        return n(z10, hVar, hVar2, true, false, false, z10.i());
    }

    public static Z f(C5487e eVar) {
        if (eVar == null) {
            a(26);
        }
        H g10 = C6691i.g(eVar);
        C5487e a10 = v.a(g10).a(g10);
        if (a10 == null) {
            return null;
        }
        h.a aVar = h.f64602L;
        h b10 = aVar.b();
        E e10 = E.FINAL;
        C5502u uVar = C5501t.f64509e;
        f fVar = o.f63932e;
        C5484b.a aVar2 = C5484b.a.SYNTHESIZED;
        K O02 = K.O0(eVar, b10, e10, uVar, false, fVar, aVar2, eVar.i(), false, false, false, false, false, false);
        L l10 = new L(O02, aVar.b(), e10, uVar, false, false, false, aVar2, (a0) null, eVar.i());
        O02.U0(l10, (b0) null);
        O02.b1(V.i(r0.f63046b.j(), a10.l(), Collections.singletonList(new D0(eVar.p())), false), Collections.emptyList(), (c0) null, (c0) null, Collections.emptyList());
        l10.P0(O02.getReturnType());
        return O02;
    }

    public static g0 g(C5487e eVar) {
        C5487e eVar2 = eVar;
        if (eVar2 == null) {
            a(24);
        }
        h.a aVar = h.f64602L;
        O l12 = O.l1(eVar2, aVar.b(), o.f63933f, C5484b.a.SYNTHESIZED, eVar.i());
        O o10 = l12;
        O n12 = o10.R0((c0) null, (c0) null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new Rf.V(l12, (t0) null, 0, aVar.b(), f.i("value"), C6755e.m(eVar).W(), false, false, false, (S) null, eVar.i())), eVar.p(), E.FINAL, C5501t.f64509e);
        if (n12 == null) {
            a(25);
        }
        return n12;
    }

    public static g0 h(C5487e eVar) {
        if (eVar == null) {
            a(22);
        }
        O n12 = O.l1(eVar, h.f64602L.b(), o.f63931d, C5484b.a.SYNTHESIZED, eVar.i()).R0((c0) null, (c0) null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), C6755e.m(eVar).l(N0.INVARIANT, eVar.p()), E.FINAL, C5501t.f64509e);
        if (n12 == null) {
            a(23);
        }
        return n12;
    }

    public static c0 i(C5483a aVar, S s10, h hVar) {
        if (aVar == null) {
            a(30);
        }
        if (hVar == null) {
            a(31);
        }
        if (s10 == null) {
            return null;
        }
        return new N(aVar, new C6837d(aVar, s10, (C6840g) null), hVar);
    }

    public static L j(Z z10, h hVar, boolean z11, boolean z12, boolean z13) {
        if (z10 == null) {
            a(15);
        }
        if (hVar == null) {
            a(16);
        }
        return k(z10, hVar, z11, z12, z13, z10.i());
    }

    public static L k(Z z10, h hVar, boolean z11, boolean z12, boolean z13, h0 h0Var) {
        if (z10 == null) {
            a(17);
        }
        if (hVar == null) {
            a(18);
        }
        if (h0Var == null) {
            a(19);
        }
        return new L(z10, hVar, z10.r(), z10.getVisibility(), z11, z12, z13, C5484b.a.DECLARATION, (a0) null, h0Var);
    }

    public static C5520i l(C5487e eVar, h0 h0Var) {
        if (eVar == null) {
            a(20);
        }
        if (h0Var == null) {
            a(21);
        }
        return new a(eVar, h0Var, false);
    }

    public static M m(Z z10, h hVar, h hVar2, boolean z11, boolean z12, boolean z13, C5502u uVar, h0 h0Var) {
        h hVar3 = hVar2;
        if (z10 == null) {
            a(7);
        }
        if (hVar == null) {
            a(8);
        }
        if (hVar3 == null) {
            a(9);
        }
        if (uVar == null) {
            a(10);
        }
        if (h0Var == null) {
            a(11);
        }
        M m10 = new M(z10, hVar, z10.r(), uVar, z11, z12, z13, C5484b.a.DECLARATION, (b0) null, h0Var);
        m10.Q0(M.O0(m10, z10.getType(), hVar2));
        return m10;
    }

    public static M n(Z z10, h hVar, h hVar2, boolean z11, boolean z12, boolean z13, h0 h0Var) {
        if (z10 == null) {
            a(3);
        }
        if (hVar == null) {
            a(4);
        }
        if (hVar2 == null) {
            a(5);
        }
        if (h0Var == null) {
            a(6);
        }
        return m(z10, hVar, hVar2, z11, z12, z13, z10.getVisibility(), h0Var);
    }

    private static boolean o(C5507z zVar) {
        if (zVar == null) {
            a(29);
        }
        if (zVar.h() != C5484b.a.SYNTHESIZED || !C6691i.A(zVar.b())) {
            return false;
        }
        return true;
    }

    public static boolean p(C5507z zVar) {
        if (zVar == null) {
            a(28);
        }
        if (!zVar.getName().equals(o.f63933f) || !o(zVar)) {
            return false;
        }
        return true;
    }

    public static boolean q(C5507z zVar) {
        if (zVar == null) {
            a(27);
        }
        if (!zVar.getName().equals(o.f63931d) || !o(zVar)) {
            return false;
        }
        return true;
    }
}
