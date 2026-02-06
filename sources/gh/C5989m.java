package gh;

import Ff.d;
import hh.C5998a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kh.C6452g0;
import kh.q0;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import lf.C6527k;
import lf.z;
import mf.C6559l;
import mf.C6565s;
import nh.C6624e;
import xf.C6781a;

/* renamed from: gh.m  reason: case insensitive filesystem */
abstract /* synthetic */ class C5989m {
    private static final C5978b a(C6624e eVar, GenericArrayType genericArrayType, boolean z10) {
        C5978b bVar;
        d dVar;
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
            C6496s.g(upperBounds, "getUpperBounds(...)");
            genericComponentType = (Type) C6559l.b0(upperBounds);
        }
        C6496s.e(genericComponentType);
        if (z10) {
            bVar = C5988l.b(eVar, genericComponentType);
        } else {
            bVar = C5988l.d(eVar, genericComponentType);
            if (bVar == null) {
                return null;
            }
        }
        if (genericComponentType instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) genericComponentType).getRawType();
            C6496s.f(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            dVar = C6781a.e((Class) rawType);
        } else if (genericComponentType instanceof d) {
            dVar = (d) genericComponentType;
        } else {
            throw new IllegalStateException("unsupported type in GenericArray: " + O.b(genericComponentType.getClass()));
        }
        C6496s.f(dVar, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        C5978b a10 = C5998a.a(dVar, bVar);
        C6496s.f(a10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return a10;
    }

    private static final Class b(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C6496s.g(rawType, "getRawType(...)");
            return b(rawType);
        } else if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            C6496s.g(upperBounds, "getUpperBounds(...)");
            Object b02 = C6559l.b0(upperBounds);
            C6496s.g(b02, "first(...)");
            return b((Type) b02);
        } else if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            C6496s.g(genericComponentType, "getGenericComponentType(...)");
            return b(genericComponentType);
        } else {
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + O.b(type.getClass()));
        }
    }

    private static final C5978b c(C6624e eVar, Class cls, List list) {
        C5978b[] bVarArr = (C5978b[]) list.toArray(new C5978b[0]);
        C5978b d10 = C6452g0.d(cls, (C5978b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        if (d10 != null) {
            return d10;
        }
        d e10 = C6781a.e(cls);
        C5978b b10 = q0.b(e10);
        if (b10 == null) {
            return eVar.b(e10, list);
        }
        return b10;
    }

    public static final C5978b d(C6624e eVar, Type type) {
        C6496s.h(eVar, "<this>");
        C6496s.h(type, "type");
        C5978b e10 = e(eVar, type, true);
        if (e10 != null) {
            return e10;
        }
        C6452g0.n(b(type));
        throw new C6527k();
    }

    private static final C5978b e(C6624e eVar, Type type, boolean z10) {
        ArrayList<C5978b> arrayList;
        if (type instanceof GenericArrayType) {
            return a(eVar, (GenericArrayType) type, z10);
        }
        if (type instanceof Class) {
            return h(eVar, (Class) type, z10);
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            C6496s.f(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            Class cls = (Class) rawType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            C6496s.e(actualTypeArguments);
            if (z10) {
                arrayList = new ArrayList<>(actualTypeArguments.length);
                for (Type type2 : actualTypeArguments) {
                    C6496s.e(type2);
                    arrayList.add(C5988l.b(eVar, type2));
                }
            } else {
                arrayList = new ArrayList<>(actualTypeArguments.length);
                for (Type type3 : actualTypeArguments) {
                    C6496s.e(type3);
                    C5978b d10 = C5988l.d(eVar, type3);
                    if (d10 == null) {
                        return null;
                    }
                    arrayList.add(d10);
                }
            }
            if (Set.class.isAssignableFrom(cls)) {
                C5978b n10 = C5998a.n((C5978b) arrayList.get(0));
                C6496s.f(n10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return n10;
            } else if (List.class.isAssignableFrom(cls) || Collection.class.isAssignableFrom(cls)) {
                C5978b h10 = C5998a.h((C5978b) arrayList.get(0));
                C6496s.f(h10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return h10;
            } else if (Map.class.isAssignableFrom(cls)) {
                C5978b k10 = C5998a.k((C5978b) arrayList.get(0), (C5978b) arrayList.get(1));
                C6496s.f(k10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return k10;
            } else if (Map.Entry.class.isAssignableFrom(cls)) {
                C5978b j10 = C5998a.j((C5978b) arrayList.get(0), (C5978b) arrayList.get(1));
                C6496s.f(j10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return j10;
            } else if (Pair.class.isAssignableFrom(cls)) {
                C5978b m10 = C5998a.m((C5978b) arrayList.get(0), (C5978b) arrayList.get(1));
                C6496s.f(m10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return m10;
            } else if (z.class.isAssignableFrom(cls)) {
                C5978b p10 = C5998a.p((C5978b) arrayList.get(0), (C5978b) arrayList.get(1), (C5978b) arrayList.get(2));
                C6496s.f(p10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return p10;
            } else {
                ArrayList arrayList2 = new ArrayList(C6565s.y(arrayList, 10));
                for (C5978b bVar : arrayList) {
                    C6496s.f(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
                    arrayList2.add(bVar);
                }
                return c(eVar, cls, arrayList2);
            }
        } else if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            C6496s.g(upperBounds, "getUpperBounds(...)");
            Object b02 = C6559l.b0(upperBounds);
            C6496s.g(b02, "first(...)");
            return f(eVar, (Type) b02, false, 2, (Object) null);
        } else {
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + O.b(type.getClass()));
        }
    }

    static /* synthetic */ C5978b f(C6624e eVar, Type type, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return e(eVar, type, z10);
    }

    public static final C5978b g(C6624e eVar, Type type) {
        C6496s.h(eVar, "<this>");
        C6496s.h(type, "type");
        return e(eVar, type, false);
    }

    private static final C5978b h(C6624e eVar, Class cls, boolean z10) {
        C5978b bVar;
        if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
            C6496s.f(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            return c(eVar, cls, C6565s.n());
        }
        Class<?> componentType = cls.getComponentType();
        C6496s.g(componentType, "getComponentType(...)");
        if (z10) {
            bVar = C5988l.b(eVar, componentType);
        } else {
            bVar = C5988l.d(eVar, componentType);
            if (bVar == null) {
                return null;
            }
        }
        d e10 = C6781a.e(componentType);
        C6496s.f(e10, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        C5978b a10 = C5998a.a(e10, bVar);
        C6496s.f(a10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return a10;
    }
}
