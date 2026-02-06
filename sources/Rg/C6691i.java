package rg;

import Fg.J0;
import Fg.S;
import Fg.W;
import Fg.v0;
import Gg.e;
import Hg.l;
import Lf.i;
import Lf.s;
import Of.C5483a;
import Of.C5484b;
import Of.C5487e;
import Of.C5488f;
import Of.C5490h;
import Of.C5495m;
import Of.C5498p;
import Of.C5499q;
import Of.C5501t;
import Of.C5502u;
import Of.E;
import Of.H;
import Of.N;
import Of.V;
import Of.b0;
import Of.c0;
import Of.i0;
import Of.u0;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.swmansion.reanimated.BuildConfig;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.survey.SurveyViewModel;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import ng.c;
import ng.d;
import ng.h;
import vg.C6755e;

/* renamed from: rg.i  reason: case insensitive filesystem */
public abstract class C6691i {

    /* renamed from: a  reason: collision with root package name */
    public static final c f73020a = new c("kotlin.jvm.JvmName");

    public static boolean A(C5495m mVar) {
        return D(mVar, C5488f.ENUM_CLASS);
    }

    public static boolean B(C5495m mVar) {
        if (mVar == null) {
            a(36);
        }
        return D(mVar, C5488f.ENUM_ENTRY);
    }

    public static boolean C(C5495m mVar) {
        return D(mVar, C5488f.INTERFACE);
    }

    private static boolean D(C5495m mVar, C5488f fVar) {
        if (fVar == null) {
            a(37);
        }
        if (!(mVar instanceof C5487e) || ((C5487e) mVar).h() != fVar) {
            return false;
        }
        return true;
    }

    public static boolean E(C5495m mVar) {
        if (mVar == null) {
            a(1);
        }
        while (mVar != null) {
            if (u(mVar) || y(mVar)) {
                return true;
            }
            mVar = mVar.b();
        }
        return false;
    }

    private static boolean F(S s10, C5495m mVar) {
        if (s10 == null) {
            a(30);
        }
        if (mVar == null) {
            a(31);
        }
        C5490h o10 = s10.N0().o();
        if (o10 == null) {
            return false;
        }
        C5495m a10 = o10.a();
        if (!(a10 instanceof C5490h) || !(mVar instanceof C5490h) || !((C5490h) mVar).l().equals(((C5490h) a10).l())) {
            return false;
        }
        return true;
    }

    public static boolean G(C5495m mVar) {
        if ((D(mVar, C5488f.CLASS) || D(mVar, C5488f.INTERFACE)) && ((C5487e) mVar).r() == E.SEALED) {
            return true;
        }
        return false;
    }

    public static boolean H(C5487e eVar, C5487e eVar2) {
        if (eVar == null) {
            a(28);
        }
        if (eVar2 == null) {
            a(29);
        }
        return I(eVar.p(), eVar2.a());
    }

    public static boolean I(S s10, C5495m mVar) {
        if (s10 == null) {
            a(32);
        }
        if (mVar == null) {
            a(33);
        }
        if (F(s10, mVar)) {
            return true;
        }
        for (S I10 : s10.N0().l()) {
            if (I(I10, mVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(C5495m mVar) {
        if (mVar == null || !(mVar.b() instanceof N)) {
            return false;
        }
        return true;
    }

    public static boolean K(u0 u0Var, S s10) {
        if (u0Var == null) {
            a(66);
        }
        if (s10 == null) {
            a(67);
        }
        if (u0Var.O() || W.a(s10)) {
            return false;
        }
        if (J0.b(s10)) {
            return true;
        }
        i m10 = C6755e.m(u0Var);
        if (!i.s0(s10)) {
            e eVar = e.f63178a;
            if (!eVar.b(m10.W(), s10) && !eVar.b(m10.K().p(), s10) && !eVar.b(m10.i(), s10) && !s.d(s10)) {
                return false;
            }
        }
        return true;
    }

    public static C5484b L(C5484b bVar) {
        if (bVar == null) {
            a(59);
        }
        while (bVar.h() == C5484b.a.FAKE_OVERRIDE) {
            Collection e10 = bVar.e();
            if (!e10.isEmpty()) {
                bVar = (C5484b) e10.iterator().next();
            } else {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + bVar);
            }
        }
        return bVar;
    }

    public static C5499q M(C5499q qVar) {
        if (qVar == null) {
            a(64);
        }
        if (qVar instanceof C5484b) {
            return L((C5484b) qVar);
        }
        if (qVar == null) {
            a(65);
        }
        return qVar;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        Throwable th2;
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 64:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case InboxPagingSource.PAGE_SIZE:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case CharsToNameCanonicalizer.HASH_MULT:
                objArr[0] = "superClass";
                break;
            case 30:
            case com.amazon.c.a.a.c.f37660h:
            case 45:
            case 67:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case Carousel.ENTITY_TYPE:
            case 48:
            case 54:
            case 68:
            case 69:
            case 70:
            case BuildConfig.REACT_NATIVE_MINOR_VERSION:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case SurveyViewModel.ENTITY_TYPE:
            case 87:
            case 90:
            case 92:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case StdKeyDeserializer.TYPE_URL:
                objArr[2] = "isOverride";
                break;
            case StdKeyDeserializer.TYPE_CLASS:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case InboxPagingSource.PAGE_SIZE:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case com.amazon.c.a.a.c.f37660h:
            case CharsToNameCanonicalizer.HASH_MULT:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case Carousel.ENTITY_TYPE:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case BuildConfig.REACT_NATIVE_MINOR_VERSION:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case SurveyViewModel.ENTITY_TYPE:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case 90:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 92:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                th2 = new IllegalStateException(format);
                break;
            default:
                th2 = new IllegalArgumentException(format);
                break;
        }
        throw th2;
    }

    public static boolean b(C5495m mVar, C5495m mVar2) {
        if (mVar == null) {
            a(16);
        }
        if (mVar2 == null) {
            a(17);
        }
        return g(mVar).equals(g(mVar2));
    }

    private static void c(C5483a aVar, Set set) {
        if (aVar == null) {
            a(73);
        }
        if (set == null) {
            a(74);
        }
        if (!set.contains(aVar)) {
            for (C5483a a10 : aVar.a().e()) {
                C5483a a11 = a10.a();
                c(a11, set);
                set.add(a11);
            }
        }
    }

    public static Set d(C5483a aVar) {
        if (aVar == null) {
            a(71);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c(aVar.a(), linkedHashSet);
        return linkedHashSet;
    }

    public static C5487e e(S s10) {
        if (s10 == null) {
            a(45);
        }
        return f(s10.N0());
    }

    public static C5487e f(v0 v0Var) {
        if (v0Var == null) {
            a(46);
        }
        C5487e eVar = (C5487e) v0Var.o();
        if (eVar == null) {
            a(47);
        }
        return eVar;
    }

    public static H g(C5495m mVar) {
        if (mVar == null) {
            a(21);
        }
        H i10 = i(mVar);
        if (i10 == null) {
            a(22);
        }
        return i10;
    }

    public static H h(S s10) {
        if (s10 == null) {
            a(20);
        }
        C5490h o10 = s10.N0().o();
        if (o10 == null) {
            return null;
        }
        return i(o10);
    }

    public static H i(C5495m mVar) {
        if (mVar == null) {
            a(23);
        }
        while (mVar != null) {
            if (mVar instanceof H) {
                return (H) mVar;
            }
            if (mVar instanceof V) {
                return ((V) mVar).B0();
            }
            mVar = mVar.b();
        }
        return null;
    }

    public static i0 j(C5495m mVar) {
        if (mVar == null) {
            a(82);
        }
        if (mVar instanceof b0) {
            mVar = ((b0) mVar).X();
        }
        if (mVar instanceof C5498p) {
            i0 b10 = ((C5498p) mVar).i().b();
            if (b10 == null) {
                a(83);
            }
            return b10;
        }
        i0 i0Var = i0.f64498a;
        if (i0Var == null) {
            a(84);
        }
        return i0Var;
    }

    public static C5502u k(C5487e eVar, boolean z10) {
        if (eVar == null) {
            a(48);
        }
        C5488f h10 = eVar.h();
        if (h10 == C5488f.ENUM_CLASS || h10.b()) {
            C5502u uVar = C5501t.f64505a;
            if (uVar == null) {
                a(49);
            }
            return uVar;
        } else if (G(eVar)) {
            if (z10) {
                C5502u uVar2 = C5501t.f64507c;
                if (uVar2 == null) {
                    a(50);
                }
                return uVar2;
            }
            C5502u uVar3 = C5501t.f64505a;
            if (uVar3 == null) {
                a(51);
            }
            return uVar3;
        } else if (u(eVar)) {
            C5502u uVar4 = C5501t.f64516l;
            if (uVar4 == null) {
                a(52);
            }
            return uVar4;
        } else {
            C5502u uVar5 = C5501t.f64509e;
            if (uVar5 == null) {
                a(53);
            }
            return uVar5;
        }
    }

    public static c0 l(C5495m mVar) {
        if (mVar == null) {
            a(0);
        }
        if (mVar instanceof C5487e) {
            return ((C5487e) mVar).J0();
        }
        return null;
    }

    public static d m(C5495m mVar) {
        if (mVar == null) {
            a(2);
        }
        c o10 = o(mVar);
        if (o10 != null) {
            return o10.j();
        }
        return p(mVar);
    }

    public static c n(C5495m mVar) {
        if (mVar == null) {
            a(3);
        }
        c o10 = o(mVar);
        if (o10 == null) {
            o10 = p(mVar).l();
        }
        if (o10 == null) {
            a(4);
        }
        return o10;
    }

    private static c o(C5495m mVar) {
        if (mVar == null) {
            a(5);
        }
        if ((mVar instanceof H) || l.m(mVar)) {
            return c.f72287c;
        }
        if (mVar instanceof V) {
            return ((V) mVar).f();
        }
        if (mVar instanceof N) {
            return ((N) mVar).f();
        }
        return null;
    }

    private static d p(C5495m mVar) {
        if (mVar == null) {
            a(6);
        }
        d c10 = m(mVar.b()).c(mVar.getName());
        if (c10 == null) {
            a(7);
        }
        return c10;
    }

    public static C5495m q(C5495m mVar, Class cls) {
        if (cls == null) {
            a(18);
        }
        return r(mVar, cls, true);
    }

    public static C5495m r(C5495m mVar, Class cls, boolean z10) {
        if (cls == null) {
            a(19);
        }
        if (mVar == null) {
            return null;
        }
        if (z10) {
            mVar = mVar.b();
        }
        while (mVar != null) {
            if (cls.isInstance(mVar)) {
                return mVar;
            }
            mVar = mVar.b();
        }
        return null;
    }

    public static C5487e s(C5487e eVar) {
        if (eVar == null) {
            a(44);
        }
        for (S e10 : eVar.l().l()) {
            C5487e e11 = e(e10);
            if (e11.h() != C5488f.INTERFACE) {
                return e11;
            }
        }
        return null;
    }

    public static boolean t(C5495m mVar) {
        return D(mVar, C5488f.ANNOTATION_CLASS);
    }

    public static boolean u(C5495m mVar) {
        if (mVar == null) {
            a(34);
        }
        if (!v(mVar) || !mVar.getName().equals(h.f72304b)) {
            return false;
        }
        return true;
    }

    public static boolean v(C5495m mVar) {
        return D(mVar, C5488f.CLASS);
    }

    public static boolean w(C5495m mVar) {
        if (v(mVar) || A(mVar)) {
            return true;
        }
        return false;
    }

    public static boolean x(C5495m mVar) {
        if (!D(mVar, C5488f.OBJECT) || !((C5487e) mVar).b0()) {
            return false;
        }
        return true;
    }

    public static boolean y(C5495m mVar) {
        if (!(mVar instanceof C5499q) || ((C5499q) mVar).getVisibility() != C5501t.f64510f) {
            return false;
        }
        return true;
    }

    public static boolean z(C5487e eVar, C5487e eVar2) {
        if (eVar == null) {
            a(26);
        }
        if (eVar2 == null) {
            a(27);
        }
        for (S F10 : eVar.l().l()) {
            if (F(F10, eVar2.a())) {
                return true;
            }
        }
        return false;
    }
}
