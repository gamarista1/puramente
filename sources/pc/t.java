package Pc;

import Rc.a;
import android.support.v4.media.session.c;
import com.google.gson.i;
import com.google.gson.p;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final Map f52212a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f52213b;

    /* renamed from: c  reason: collision with root package name */
    private final List f52214c;

    public t(Map map, boolean z10, List list) {
        this.f52212a = map;
        this.f52213b = z10;
        this.f52214c = list;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Collection A() {
        return new LinkedHashSet();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Collection B() {
        return new TreeSet();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Collection C() {
        return new ArrayDeque();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object D(String str) {
        throw new i(str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object E(String str) {
        throw new i(str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object F(Constructor constructor) {
        try {
            return constructor.newInstance((Object[]) null);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + a.c(constructor) + "' with no args", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + a.c(constructor) + "' with no args", e11.getCause());
        } catch (IllegalAccessException e12) {
            throw a.e(e12);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Map G() {
        return new A();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Map H() {
        return new LinkedHashMap();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Map I() {
        return new TreeMap();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Map J() {
        return new ConcurrentHashMap();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Map K() {
        return new ConcurrentSkipListMap();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object L(Type type) {
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new i("Invalid EnumSet type: " + type.toString());
        }
        throw new i("Invalid EnumSet type: " + type.toString());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object M(Type type) {
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new i("Invalid EnumMap type: " + type.toString());
        }
        throw new i("Invalid EnumMap type: " + type.toString());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object N(Class cls) {
        try {
            return I.f52196a.d(cls);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object O(String str) {
        throw new i(str);
    }

    private static C P(Class cls) {
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new m();
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new n();
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new o();
        }
        if (cls.isAssignableFrom(ArrayDeque.class)) {
            return new p();
        }
        return null;
    }

    private static C Q(Class cls, p pVar) {
        String p10;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor((Class[]) null);
            p pVar2 = p.ALLOW;
            if (pVar != pVar2 && (!F.a(declaredConstructor, (Object) null) || (pVar == p.BLOCK_ALL && !Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return new C4389h("Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
            } else if (pVar != pVar2 || (p10 = a.p(declaredConstructor)) == null) {
                return new j(declaredConstructor);
            } else {
                return new C4390i(p10);
            }
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static C R(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return P(cls);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return S(type, cls);
        }
        return null;
    }

    private static C S(Type type, Class cls) {
        if (cls.isAssignableFrom(A.class) && v(type)) {
            return new C4384c();
        }
        if (cls.isAssignableFrom(LinkedHashMap.class)) {
            return new C4385d();
        }
        if (cls.isAssignableFrom(TreeMap.class)) {
            return new C4386e();
        }
        if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
            return new C4387f();
        }
        if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
            return new C4388g();
        }
        return null;
    }

    private static C T(Type type, Class cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new s(type);
        }
        if (cls == EnumMap.class) {
            return new C4383b(type);
        }
        return null;
    }

    private C U(Class cls) {
        if (this.f52213b) {
            return new q(cls);
        }
        String str = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            str = str + " Or adjust your R8 configuration to keep the no-args constructor of the class.";
        }
        return new r(str);
    }

    static String t(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        } else if (!Modifier.isAbstract(modifiers)) {
            return null;
        } else {
            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + H.a("r8-abstract-class");
        }
    }

    private static boolean v(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return true;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        if (actualTypeArguments.length == 0) {
            return false;
        }
        if (w.k(actualTypeArguments[0]) == String.class) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object w(String str) {
        throw new i(str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object x(String str) {
        throw new i(str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object y(String str) {
        throw new i(str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Collection z() {
        return new ArrayList();
    }

    public String toString() {
        return this.f52212a.toString();
    }

    public C u(com.google.gson.reflect.a aVar, boolean z10) {
        Type type = aVar.getType();
        Class rawType = aVar.getRawType();
        c.a(this.f52212a.get(type));
        c.a(this.f52212a.get(rawType));
        C T10 = T(type, rawType);
        if (T10 != null) {
            return T10;
        }
        p b10 = F.b(this.f52214c, rawType);
        C Q10 = Q(rawType, b10);
        if (Q10 != null) {
            return Q10;
        }
        C R10 = R(type, rawType);
        if (R10 != null) {
            return R10;
        }
        String t10 = t(rawType);
        if (t10 != null) {
            return new C4382a(t10);
        }
        if (!z10) {
            return new k("Unable to create instance of " + rawType + "; Register an InstanceCreator or a TypeAdapter for this type.");
        } else if (b10 == p.ALLOW) {
            return U(rawType);
        } else {
            return new l("Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
        }
    }
}
