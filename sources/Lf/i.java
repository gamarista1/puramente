package Lf;

import Eg.g;
import Eg.n;
import Fg.B0;
import Fg.C5366d0;
import Fg.D0;
import Fg.J0;
import Fg.N0;
import Fg.S;
import Fg.s0;
import Fg.v0;
import Lf.o;
import Of.C5487e;
import Of.C5490h;
import Of.C5495m;
import Of.C5500s;
import Of.C5506y;
import Of.H;
import Of.N;
import Of.V;
import Of.Z;
import Of.a0;
import Of.b0;
import Pf.h;
import Qf.a;
import Qf.c;
import Rf.F;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.swmansion.reanimated.BuildConfig;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.survey.SurveyViewModel;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ng.f;
import og.C6628a;
import rg.C6691i;
import vg.C6755e;
import yf.C6787a;
import yf.C6798l;
import yg.C6812k;

public abstract class i {

    /* renamed from: g  reason: collision with root package name */
    public static final f f63873g = f.m("<built-ins module>");
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public F f63874a;

    /* renamed from: b  reason: collision with root package name */
    private Eg.i f63875b;

    /* renamed from: c  reason: collision with root package name */
    private final Eg.i f63876c;

    /* renamed from: d  reason: collision with root package name */
    private final Eg.i f63877d;

    /* renamed from: e  reason: collision with root package name */
    private final g f63878e;

    /* renamed from: f  reason: collision with root package name */
    private final n f63879f;

    class a implements C6787a {
        a() {
        }

        /* renamed from: a */
        public Collection invoke() {
            return Arrays.asList(new V[]{i.this.r().l0(o.f63920A), i.this.r().l0(o.f63922C), i.this.r().l0(o.f63923D), i.this.r().l0(o.f63921B)});
        }
    }

    class b implements C6787a {
        b() {
        }

        /* renamed from: a */
        public e invoke() {
            EnumMap enumMap = new EnumMap(l.class);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (l lVar : l.values()) {
                C5366d0 b10 = i.this.q(lVar.l().b());
                C5366d0 b11 = i.this.q(lVar.i().b());
                enumMap.put(lVar, b11);
                hashMap.put(b10, b11);
                hashMap2.put(b11, b10);
            }
            return new e(enumMap, hashMap, hashMap2, (a) null);
        }
    }

    class c implements C6798l {
        c() {
        }

        /* renamed from: a */
        public C5487e invoke(f fVar) {
            C5490h e10 = i.this.s().e(fVar, Wf.d.FROM_BUILTINS);
            if (e10 == null) {
                throw new AssertionError("Built-in class " + o.f63920A.c(fVar) + " is not found");
            } else if (e10 instanceof C5487e) {
                return (C5487e) e10;
            } else {
                throw new AssertionError("Must be a class descriptor " + fVar + ", but was " + e10);
            }
        }
    }

    class d implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ F f63883a;

        d(F f10) {
            this.f63883a = f10;
        }

        /* renamed from: a */
        public Void invoke() {
            if (i.this.f63874a == null) {
                F unused = i.this.f63874a = this.f63883a;
                return null;
            }
            throw new AssertionError("Built-ins module is already set: " + i.this.f63874a + " (attempting to reset to " + this.f63883a + ")");
        }
    }

    private static class e {

        /* renamed from: a  reason: collision with root package name */
        public final Map f63885a;

        /* renamed from: b  reason: collision with root package name */
        public final Map f63886b;

        /* renamed from: c  reason: collision with root package name */
        public final Map f63887c;

        /* synthetic */ e(Map map, Map map2, Map map3, a aVar) {
            this(map, map2, map3);
        }

        private static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i10 != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private e(Map map, Map map2, Map map3) {
            if (map == null) {
                a(0);
            }
            if (map2 == null) {
                a(1);
            }
            if (map3 == null) {
                a(2);
            }
            this.f63885a = map;
            this.f63886b = map2;
            this.f63887c = map3;
        }
    }

    protected i(n nVar) {
        if (nVar == null) {
            a(0);
        }
        this.f63879f = nVar;
        this.f63877d = nVar.g(new a());
        this.f63876c = nVar.g(new b());
        this.f63878e = nVar.h(new c());
    }

    private static S A(S s10, H h10) {
        ng.b n10;
        ng.b a10;
        C5487e b10;
        if (s10 == null) {
            a(72);
        }
        if (h10 == null) {
            a(73);
        }
        C5490h o10 = s10.N0().o();
        if (o10 == null) {
            return null;
        }
        s sVar = s.f64065a;
        if (!sVar.b(o10.getName()) || (n10 = C6755e.n(o10)) == null || (a10 = sVar.a(n10)) == null || (b10 = C5506y.b(h10, a10)) == null) {
            return null;
        }
        return b10.p();
    }

    public static boolean A0(S s10) {
        if (s10 == null) {
            a(130);
        }
        return i0(s10, o.a.f63971I0.j());
    }

    public static boolean B0(C5495m mVar) {
        if (mVar == null) {
            a(10);
        }
        while (mVar != null) {
            if (mVar instanceof N) {
                return ((N) mVar).f().i(o.f63953z);
            }
            mVar = mVar.b();
        }
        return false;
    }

    public static boolean C0(S s10) {
        if (s10 == null) {
            a(143);
        }
        return m0(s10, o.a.f64005f);
    }

    public static boolean D0(S s10) {
        if (s10 == null) {
            a(133);
        }
        if (x0(s10) || A0(s10) || y0(s10) || z0(s10)) {
            return true;
        }
        return false;
    }

    public static l N(S s10) {
        if (s10 == null) {
            a(93);
        }
        C5490h o10 = s10.N0().o();
        if (o10 == null) {
            return null;
        }
        return P(o10);
    }

    public static l P(C5495m mVar) {
        if (mVar == null) {
            a(78);
        }
        if (o.a.f63979M0.contains(mVar.getName())) {
            return (l) o.a.f63983O0.get(C6691i.m(mVar));
        }
        return null;
    }

    private C5487e Q(l lVar) {
        if (lVar == null) {
            a(16);
        }
        return p(lVar.l().b());
    }

    public static l S(C5495m mVar) {
        if (mVar == null) {
            a(77);
        }
        if (o.a.f63977L0.contains(mVar.getName())) {
            return (l) o.a.f63981N0.get(C6691i.m(mVar));
        }
        return null;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        Throwable th2;
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case StdKeyDeserializer.TYPE_CLASS:
            case 18:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case com.amazon.c.a.a.c.f37660h:
            case CharsToNameCanonicalizer.HASH_MULT:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case Carousel.ENTITY_TYPE /*44*/:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case SurveyViewModel.ENTITY_TYPE /*85*/:
            case 87:
            case 88:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case StdKeyDeserializer.TYPE_CLASS:
            case 18:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case com.amazon.c.a.a.c.f37660h:
            case CharsToNameCanonicalizer.HASH_MULT:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case Carousel.ENTITY_TYPE /*44*/:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case SurveyViewModel.ENTITY_TYPE /*85*/:
            case 87:
            case 88:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 73:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case StdKeyDeserializer.TYPE_CLASS:
            case 18:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case com.amazon.c.a.a.c.f37660h:
            case CharsToNameCanonicalizer.HASH_MULT:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case Carousel.ENTITY_TYPE /*44*/:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case SurveyViewModel.ENTITY_TYPE /*85*/:
            case 87:
            case 88:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case BuildConfig.REACT_NATIVE_MINOR_VERSION:
            case 78:
            case 90:
            case 97:
            case 104:
            case 108:
            case 109:
            case 144:
            case 147:
            case 148:
            case 150:
            case 158:
            case 159:
            case 160:
            case 161:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 99:
            case 101:
            case 103:
            case 105:
            case 107:
            case 136:
                objArr[0] = "fqName";
                break;
            case StdKeyDeserializer.TYPE_URL:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 54:
            case 89:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 98:
            case 100:
            case 106:
            case 110:
            case 111:
            case 112:
            case 114:
            case 115:
            case 116:
            case ModuleDescriptor.MODULE_VERSION:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 145:
            case 146:
            case 149:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 163:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
                objArr[0] = "arrayType";
                break;
            case 72:
                objArr[0] = "notNullArrayType";
                break;
            case 74:
                objArr[0] = "primitiveType";
                break;
            case 76:
                objArr[0] = "kotlinType";
                break;
            case 79:
            case 83:
                objArr[0] = "projectionType";
                break;
            case 80:
            case 84:
            case 86:
                objArr[0] = "argument";
                break;
            case 81:
                objArr[0] = "annotations";
                break;
            case 102:
                objArr[0] = "typeConstructor";
                break;
            case 113:
                objArr[0] = "classDescriptor";
                break;
            case 162:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case StdKeyDeserializer.TYPE_CLASS:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case InboxPagingSource.PAGE_SIZE /*20*/:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKType";
                break;
            case 23:
                objArr[1] = "getKCallable";
                break;
            case 24:
                objArr[1] = "getKProperty";
                break;
            case 25:
                objArr[1] = "getKProperty0";
                break;
            case 26:
                objArr[1] = "getKProperty1";
                break;
            case 27:
                objArr[1] = "getKProperty2";
                break;
            case 28:
                objArr[1] = "getKMutableProperty0";
                break;
            case 29:
                objArr[1] = "getKMutableProperty1";
                break;
            case 30:
                objArr[1] = "getKMutableProperty2";
                break;
            case 31:
                objArr[1] = "getIterator";
                break;
            case com.amazon.c.a.a.c.f37660h:
                objArr[1] = "getIterable";
                break;
            case CharsToNameCanonicalizer.HASH_MULT:
                objArr[1] = "getMutableIterable";
                break;
            case 34:
                objArr[1] = "getMutableIterator";
                break;
            case 35:
                objArr[1] = "getCollection";
                break;
            case 36:
                objArr[1] = "getMutableCollection";
                break;
            case 37:
                objArr[1] = "getList";
                break;
            case 38:
                objArr[1] = "getMutableList";
                break;
            case 39:
                objArr[1] = "getSet";
                break;
            case 40:
                objArr[1] = "getMutableSet";
                break;
            case 41:
                objArr[1] = "getMap";
                break;
            case 42:
                objArr[1] = "getMutableMap";
                break;
            case 43:
                objArr[1] = "getMapEntry";
                break;
            case Carousel.ENTITY_TYPE /*44*/:
                objArr[1] = "getMutableMapEntry";
                break;
            case 45:
                objArr[1] = "getListIterator";
                break;
            case 46:
                objArr[1] = "getMutableListIterator";
                break;
            case 48:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 49:
                objArr[1] = "getNothingType";
                break;
            case 50:
                objArr[1] = "getNullableNothingType";
                break;
            case 51:
                objArr[1] = "getAnyType";
                break;
            case 52:
                objArr[1] = "getNullableAnyType";
                break;
            case 53:
                objArr[1] = "getDefaultBound";
                break;
            case 55:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 56:
                objArr[1] = "getNumberType";
                break;
            case 57:
                objArr[1] = "getByteType";
                break;
            case 58:
                objArr[1] = "getShortType";
                break;
            case 59:
                objArr[1] = "getIntType";
                break;
            case 60:
                objArr[1] = "getLongType";
                break;
            case 61:
                objArr[1] = "getFloatType";
                break;
            case 62:
                objArr[1] = "getDoubleType";
                break;
            case 63:
                objArr[1] = "getCharType";
                break;
            case 64:
                objArr[1] = "getBooleanType";
                break;
            case 65:
                objArr[1] = "getUnitType";
                break;
            case 66:
                objArr[1] = "getStringType";
                break;
            case 67:
                objArr[1] = "getIterableType";
                break;
            case 69:
            case 70:
            case 71:
                objArr[1] = "getArrayElementType";
                break;
            case 75:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 82:
            case SurveyViewModel.ENTITY_TYPE /*85*/:
                objArr[1] = "getArrayType";
                break;
            case 87:
                objArr[1] = "getEnumType";
                break;
            case 88:
                objArr[1] = "getAnnotationType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case StdKeyDeserializer.TYPE_CLASS:
            case 18:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case com.amazon.c.a.a.c.f37660h:
            case CharsToNameCanonicalizer.HASH_MULT:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case Carousel.ENTITY_TYPE /*44*/:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case SurveyViewModel.ENTITY_TYPE /*85*/:
            case 87:
            case 88:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case StdKeyDeserializer.TYPE_URL:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 72:
            case 73:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 74:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 76:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case BuildConfig.REACT_NATIVE_MINOR_VERSION:
            case 94:
                objArr[2] = "getPrimitiveType";
                break;
            case 78:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
                objArr[2] = "getArrayType";
                break;
            case 86:
                objArr[2] = "getEnumType";
                break;
            case 89:
                objArr[2] = "isArray";
                break;
            case 90:
            case 91:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 92:
                objArr[2] = "isPrimitiveArray";
                break;
            case 93:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 95:
                objArr[2] = "isPrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 97:
                objArr[2] = "isPrimitiveClass";
                break;
            case 98:
            case 99:
            case 100:
            case 101:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 102:
            case 103:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 104:
            case 105:
                objArr[2] = "classFqNameEquals";
                break;
            case 106:
            case 107:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 108:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 109:
            case 110:
                objArr[2] = "isAny";
                break;
            case 111:
            case 113:
                objArr[2] = "isBoolean";
                break;
            case 112:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 114:
                objArr[2] = "isNumber";
                break;
            case 115:
                objArr[2] = "isChar";
                break;
            case 116:
                objArr[2] = "isCharOrNullableChar";
                break;
            case ModuleDescriptor.MODULE_VERSION:
                objArr[2] = "isInt";
                break;
            case 118:
                objArr[2] = "isByte";
                break;
            case 119:
                objArr[2] = "isLong";
                break;
            case 120:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 121:
                objArr[2] = "isShort";
                break;
            case 122:
                objArr[2] = "isFloat";
                break;
            case 123:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 124:
                objArr[2] = "isDouble";
                break;
            case 125:
                objArr[2] = "isUByte";
                break;
            case 126:
                objArr[2] = "isUShort";
                break;
            case 127:
                objArr[2] = "isUInt";
                break;
            case 128:
                objArr[2] = "isULong";
                break;
            case 129:
                objArr[2] = "isUByteArray";
                break;
            case 130:
                objArr[2] = "isUShortArray";
                break;
            case 131:
                objArr[2] = "isUIntArray";
                break;
            case 132:
                objArr[2] = "isULongArray";
                break;
            case 133:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 134:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 135:
            case 136:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 137:
                objArr[2] = "isNothing";
                break;
            case 138:
                objArr[2] = "isNullableNothing";
                break;
            case 139:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 140:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 141:
                objArr[2] = "isNullableAny";
                break;
            case 142:
                objArr[2] = "isDefaultBound";
                break;
            case 143:
                objArr[2] = "isUnit";
                break;
            case 144:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 145:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 146:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 147:
                objArr[2] = "isMemberOfAny";
                break;
            case 148:
            case 149:
                objArr[2] = "isEnum";
                break;
            case 150:
            case 151:
                objArr[2] = "isComparable";
                break;
            case 152:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 153:
                objArr[2] = "isListOrNullableList";
                break;
            case 154:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 155:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 156:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 157:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 158:
                objArr[2] = "isThrowable";
                break;
            case 159:
                objArr[2] = "isKClass";
                break;
            case 160:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 161:
                objArr[2] = "isCloneable";
                break;
            case 162:
                objArr[2] = "isDeprecated";
                break;
            case 163:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case StdKeyDeserializer.TYPE_CLASS:
            case 18:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case com.amazon.c.a.a.c.f37660h:
            case CharsToNameCanonicalizer.HASH_MULT:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case Carousel.ENTITY_TYPE /*44*/:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case SurveyViewModel.ENTITY_TYPE /*85*/:
            case 87:
            case 88:
                th2 = new IllegalStateException(format);
                break;
            default:
                th2 = new IllegalArgumentException(format);
                break;
        }
        throw th2;
    }

    public static boolean a0(C5487e eVar) {
        if (eVar == null) {
            a(109);
        }
        return e(eVar, o.a.f63997b);
    }

    public static boolean b0(S s10) {
        if (s10 == null) {
            a(140);
        }
        return h0(s10, o.a.f63997b);
    }

    public static boolean c0(S s10) {
        if (s10 == null) {
            a(89);
        }
        return h0(s10, o.a.f64011i);
    }

    public static boolean d0(S s10) {
        if (s10 == null) {
            a(91);
        }
        if (c0(s10) || q0(s10)) {
            return true;
        }
        return false;
    }

    private static boolean e(C5490h hVar, ng.d dVar) {
        if (hVar == null) {
            a(104);
        }
        if (dVar == null) {
            a(105);
        }
        if (!hVar.getName().equals(dVar.i()) || !dVar.equals(C6691i.m(hVar))) {
            return false;
        }
        return true;
    }

    public static boolean e0(C5487e eVar) {
        if (eVar == null) {
            a(90);
        }
        if (e(eVar, o.a.f64011i) || P(eVar) != null) {
            return true;
        }
        return false;
    }

    public static boolean f0(S s10) {
        if (s10 == null) {
            a(111);
        }
        return i0(s10, o.a.f64013j);
    }

    public static boolean g0(C5495m mVar) {
        if (mVar == null) {
            a(9);
        }
        if (C6691i.r(mVar, c.class, false) != null) {
            return true;
        }
        return false;
    }

    private static boolean h0(S s10, ng.d dVar) {
        if (s10 == null) {
            a(98);
        }
        if (dVar == null) {
            a(99);
        }
        return w0(s10.N0(), dVar);
    }

    private static boolean i0(S s10, ng.d dVar) {
        if (s10 == null) {
            a(135);
        }
        if (dVar == null) {
            a(136);
        }
        if (!h0(s10, dVar) || s10.O0()) {
            return false;
        }
        return true;
    }

    public static boolean j0(S s10) {
        if (s10 == null) {
            a(142);
        }
        return p0(s10);
    }

    public static boolean k0(C5495m mVar) {
        if (mVar == null) {
            a(162);
        }
        if (mVar.a().getAnnotations().n0(o.a.f64043y)) {
            return true;
        }
        if (!(mVar instanceof Z)) {
            return false;
        }
        Z z10 = (Z) mVar;
        boolean O10 = z10.O();
        a0 d10 = z10.d();
        b0 g10 = z10.g();
        if (d10 != null && k0(d10)) {
            if (!O10) {
                return true;
            }
            if (g10 != null && k0(g10)) {
                return true;
            }
        }
        return false;
    }

    public static boolean l0(C5487e eVar) {
        if (eVar == null) {
            a(159);
        }
        return e(eVar, o.a.f64018l0);
    }

    private static boolean m0(S s10, ng.d dVar) {
        if (s10 == null) {
            a(106);
        }
        if (dVar == null) {
            a(107);
        }
        if (s10.O0() || !h0(s10, dVar)) {
            return false;
        }
        return true;
    }

    public static boolean n0(S s10) {
        if (s10 == null) {
            a(137);
        }
        if (!o0(s10) || J0.l(s10)) {
            return false;
        }
        return true;
    }

    public static boolean o0(S s10) {
        if (s10 == null) {
            a(139);
        }
        return h0(s10, o.a.f63999c);
    }

    private C5487e p(String str) {
        if (str == null) {
            a(14);
        }
        C5487e eVar = (C5487e) this.f63878e.invoke(f.i(str));
        if (eVar == null) {
            a(15);
        }
        return eVar;
    }

    public static boolean p0(S s10) {
        if (s10 == null) {
            a(141);
        }
        if (!b0(s10) || !s10.O0()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public C5366d0 q(String str) {
        if (str == null) {
            a(47);
        }
        C5366d0 p10 = p(str).p();
        if (p10 == null) {
            a(48);
        }
        return p10;
    }

    public static boolean q0(S s10) {
        if (s10 == null) {
            a(92);
        }
        C5490h o10 = s10.N0().o();
        if (o10 == null || P(o10) == null) {
            return false;
        }
        return true;
    }

    public static boolean r0(C5487e eVar) {
        if (eVar == null) {
            a(97);
        }
        if (S(eVar) != null) {
            return true;
        }
        return false;
    }

    public static boolean s0(S s10) {
        if (s10 == null) {
            a(95);
        }
        if (s10.O0() || !t0(s10)) {
            return false;
        }
        return true;
    }

    public static boolean t0(S s10) {
        if (s10 == null) {
            a(96);
        }
        C5490h o10 = s10.N0().o();
        if (!(o10 instanceof C5487e) || !r0((C5487e) o10)) {
            return false;
        }
        return true;
    }

    public static boolean u0(C5487e eVar) {
        if (eVar == null) {
            a(108);
        }
        if (e(eVar, o.a.f63997b) || e(eVar, o.a.f63999c)) {
            return true;
        }
        return false;
    }

    public static boolean v0(S s10) {
        if (s10 == null || !m0(s10, o.a.f64009h)) {
            return false;
        }
        return true;
    }

    public static boolean w0(v0 v0Var, ng.d dVar) {
        if (v0Var == null) {
            a(102);
        }
        if (dVar == null) {
            a(103);
        }
        C5490h o10 = v0Var.o();
        if (!(o10 instanceof C5487e) || !e(o10, dVar)) {
            return false;
        }
        return true;
    }

    public static boolean x0(S s10) {
        if (s10 == null) {
            a(129);
        }
        return i0(s10, o.a.f63969H0.j());
    }

    public static boolean y0(S s10) {
        if (s10 == null) {
            a(131);
        }
        return i0(s10, o.a.f63973J0.j());
    }

    public static boolean z0(S s10) {
        if (s10 == null) {
            a(132);
        }
        return i0(s10, o.a.f63975K0.j());
    }

    public C5366d0 B() {
        C5366d0 R10 = R(l.FLOAT);
        if (R10 == null) {
            a(61);
        }
        return R10;
    }

    public C5487e C(int i10) {
        return p(o.b(i10));
    }

    public C5366d0 D() {
        C5366d0 R10 = R(l.INT);
        if (R10 == null) {
            a(59);
        }
        return R10;
    }

    public C5487e E() {
        C5487e o10 = o(o.a.f64018l0.l());
        if (o10 == null) {
            a(21);
        }
        return o10;
    }

    public void E0(F f10) {
        if (f10 == null) {
            a(1);
        }
        this.f63879f.f(new d(f10));
    }

    public C5366d0 F() {
        C5366d0 R10 = R(l.LONG);
        if (R10 == null) {
            a(60);
        }
        return R10;
    }

    public C5487e G() {
        return p("Nothing");
    }

    public C5366d0 H() {
        C5366d0 p10 = G().p();
        if (p10 == null) {
            a(49);
        }
        return p10;
    }

    public C5366d0 I() {
        C5366d0 U02 = i().U0(true);
        if (U02 == null) {
            a(52);
        }
        return U02;
    }

    public C5366d0 J() {
        C5366d0 U02 = H().U0(true);
        if (U02 == null) {
            a(50);
        }
        return U02;
    }

    public C5487e K() {
        return p("Number");
    }

    public C5366d0 L() {
        C5366d0 p10 = K().p();
        if (p10 == null) {
            a(56);
        }
        return p10;
    }

    /* access modifiers changed from: protected */
    public Qf.c M() {
        c.b bVar = c.b.f64721a;
        if (bVar == null) {
            a(4);
        }
        return bVar;
    }

    public C5366d0 O(l lVar) {
        if (lVar == null) {
            a(74);
        }
        C5366d0 d0Var = (C5366d0) ((e) this.f63876c.invoke()).f63885a.get(lVar);
        if (d0Var == null) {
            a(75);
        }
        return d0Var;
    }

    public C5366d0 R(l lVar) {
        if (lVar == null) {
            a(54);
        }
        C5366d0 p10 = Q(lVar).p();
        if (p10 == null) {
            a(55);
        }
        return p10;
    }

    public C5366d0 T() {
        C5366d0 R10 = R(l.SHORT);
        if (R10 == null) {
            a(58);
        }
        return R10;
    }

    /* access modifiers changed from: protected */
    public n U() {
        n nVar = this.f63879f;
        if (nVar == null) {
            a(6);
        }
        return nVar;
    }

    public C5487e V() {
        return p("String");
    }

    public C5366d0 W() {
        C5366d0 p10 = V().p();
        if (p10 == null) {
            a(66);
        }
        return p10;
    }

    public C5487e X(int i10) {
        C5487e o10 = o(o.f63946s.c(f.i(o.d(i10))));
        if (o10 == null) {
            a(18);
        }
        return o10;
    }

    public C5487e Y() {
        return p("Unit");
    }

    public C5366d0 Z() {
        C5366d0 p10 = Y().p();
        if (p10 == null) {
            a(65);
        }
        return p10;
    }

    /* access modifiers changed from: protected */
    public void f(boolean z10) {
        F f10 = new F(f63873g, this.f63879f, this, (C6628a) null);
        this.f63874a = f10;
        f10.O0(b.f63865a.c().a(this.f63879f, this.f63874a, v(), M(), g(), z10));
        F f11 = this.f63874a;
        f11.W0(f11);
    }

    /* access modifiers changed from: protected */
    public Qf.a g() {
        a.C0950a aVar = a.C0950a.f64719a;
        if (aVar == null) {
            a(3);
        }
        return aVar;
    }

    public C5487e h() {
        return p("Any");
    }

    public C5366d0 i() {
        C5366d0 p10 = h().p();
        if (p10 == null) {
            a(51);
        }
        return p10;
    }

    public C5487e j() {
        return p("Array");
    }

    public S k(S s10) {
        S A10;
        if (s10 == null) {
            a(68);
        }
        if (!c0(s10)) {
            S n10 = J0.n(s10);
            S s11 = (S) ((e) this.f63876c.invoke()).f63887c.get(n10);
            if (s11 != null) {
                return s11;
            }
            H h10 = C6691i.h(n10);
            if (h10 != null && (A10 = A(n10, h10)) != null) {
                return A10;
            }
            throw new IllegalStateException("not array: " + s10);
        } else if (s10.L0().size() == 1) {
            S type = ((B0) s10.L0().get(0)).getType();
            if (type == null) {
                a(69);
            }
            return type;
        } else {
            throw new IllegalStateException();
        }
    }

    public C5366d0 l(N0 n02, S s10) {
        if (n02 == null) {
            a(83);
        }
        if (s10 == null) {
            a(84);
        }
        C5366d0 m10 = m(n02, s10, h.f64602L.b());
        if (m10 == null) {
            a(85);
        }
        return m10;
    }

    public C5366d0 m(N0 n02, S s10, h hVar) {
        if (n02 == null) {
            a(79);
        }
        if (s10 == null) {
            a(80);
        }
        if (hVar == null) {
            a(81);
        }
        C5366d0 h10 = Fg.V.h(s0.b(hVar), j(), Collections.singletonList(new D0(n02, s10)));
        if (h10 == null) {
            a(82);
        }
        return h10;
    }

    public C5366d0 n() {
        C5366d0 R10 = R(l.BOOLEAN);
        if (R10 == null) {
            a(64);
        }
        return R10;
    }

    public C5487e o(ng.c cVar) {
        if (cVar == null) {
            a(12);
        }
        C5487e d10 = C5500s.d(r(), cVar, Wf.d.FROM_BUILTINS);
        if (d10 == null) {
            a(13);
        }
        return d10;
    }

    public F r() {
        if (this.f63874a == null) {
            this.f63874a = (F) this.f63875b.invoke();
        }
        F f10 = this.f63874a;
        if (f10 == null) {
            a(7);
        }
        return f10;
    }

    public C6812k s() {
        C6812k o10 = r().l0(o.f63920A).o();
        if (o10 == null) {
            a(11);
        }
        return o10;
    }

    public C5366d0 t() {
        C5366d0 R10 = R(l.BYTE);
        if (R10 == null) {
            a(57);
        }
        return R10;
    }

    public C5366d0 u() {
        C5366d0 R10 = R(l.CHAR);
        if (R10 == null) {
            a(63);
        }
        return R10;
    }

    /* access modifiers changed from: protected */
    public Iterable v() {
        List singletonList = Collections.singletonList(new Mf.a(this.f63879f, r()));
        if (singletonList == null) {
            a(5);
        }
        return singletonList;
    }

    public C5487e w() {
        C5487e o10 = o(o.a.f63992X);
        if (o10 == null) {
            a(35);
        }
        return o10;
    }

    public C5487e x() {
        return p("Comparable");
    }

    public C5366d0 y() {
        C5366d0 I10 = I();
        if (I10 == null) {
            a(53);
        }
        return I10;
    }

    public C5366d0 z() {
        C5366d0 R10 = R(l.DOUBLE);
        if (R10 == null) {
            a(62);
        }
        return R10;
    }
}
