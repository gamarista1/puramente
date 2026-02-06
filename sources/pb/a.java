package Pb;

import Gb.c;
import Gb.e;
import Gb.h;
import Ob.l;
import com.amazon.a.a.o.b;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentMap f52155a = new ConcurrentHashMap();

    /* renamed from: Pb.a$a  reason: collision with other inner class name */
    private static class C0798a {

        /* renamed from: a  reason: collision with root package name */
        private final Class f52156a;

        /* renamed from: b  reason: collision with root package name */
        private final Constructor f52157b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f52158c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f52159d;

        /* renamed from: e  reason: collision with root package name */
        private final Map f52160e = new HashMap();

        /* renamed from: f  reason: collision with root package name */
        private final Map f52161f = new HashMap();

        /* renamed from: g  reason: collision with root package name */
        private final Map f52162g = new HashMap();

        /* renamed from: h  reason: collision with root package name */
        private final Map f52163h = new HashMap();

        /* JADX WARNING: Removed duplicated region for block: B:24:0x00ad  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0165  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0798a(java.lang.Class r12) {
            /*
                r11 = this;
                r11.<init>()
                r11.f52156a = r12
                java.lang.Class<Gb.i> r0 = Gb.i.class
                boolean r0 = r12.isAnnotationPresent(r0)
                r11.f52158c = r0
                java.lang.Class<Gb.f> r0 = Gb.f.class
                boolean r0 = r12.isAnnotationPresent(r0)
                r1 = 1
                r0 = r0 ^ r1
                r11.f52159d = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r11.f52160e = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r11.f52162g = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r11.f52161f = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r11.f52163h = r0
                r0 = 0
                java.lang.reflect.Constructor r2 = r12.getDeclaredConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x003c }
                r2.setAccessible(r1)     // Catch:{ NoSuchMethodException -> 0x003c }
                r0 = r2
            L_0x003c:
                r11.f52157b = r0
                java.lang.reflect.Method[] r0 = r12.getMethods()
                int r2 = r0.length
                r3 = 0
                r4 = r3
            L_0x0045:
                if (r4 >= r2) goto L_0x0085
                r5 = r0[r4]
                boolean r6 = i(r5)
                if (r6 == 0) goto L_0x0082
                java.lang.String r6 = e(r5)
                r11.a(r6)
                r5.setAccessible(r1)
                java.util.Map r7 = r11.f52161f
                boolean r7 = r7.containsKey(r6)
                if (r7 != 0) goto L_0x0067
                java.util.Map r7 = r11.f52161f
                r7.put(r6, r5)
                goto L_0x0082
            L_0x0067:
                Gb.c r12 = new Gb.c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Found conflicting getters for name: "
                r0.append(r1)
                java.lang.String r1 = r5.getName()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r12.<init>(r0)
                throw r12
            L_0x0082:
                int r4 = r4 + 1
                goto L_0x0045
            L_0x0085:
                java.lang.reflect.Field[] r0 = r12.getFields()
                int r2 = r0.length
                r4 = r3
            L_0x008b:
                if (r4 >= r2) goto L_0x009f
                r5 = r0[r4]
                boolean r6 = h(r5)
                if (r6 == 0) goto L_0x009c
                java.lang.String r5 = d(r5)
                r11.a(r5)
            L_0x009c:
                int r4 = r4 + 1
                goto L_0x008b
            L_0x009f:
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r2 = r12
            L_0x00a5:
                java.lang.reflect.Method[] r4 = r2.getDeclaredMethods()
                int r5 = r4.length
                r6 = r3
            L_0x00ab:
                if (r6 >= r5) goto L_0x015d
                r7 = r4[r6]
                boolean r8 = j(r7)
                if (r8 == 0) goto L_0x0159
                java.lang.String r8 = e(r7)
                java.util.Map r9 = r11.f52160e
                java.util.Locale r10 = java.util.Locale.US
                java.lang.String r10 = r8.toLowerCase(r10)
                java.lang.Object r9 = r9.get(r10)
                java.lang.String r9 = (java.lang.String) r9
                if (r9 == 0) goto L_0x0159
                boolean r9 = r9.equals(r8)
                if (r9 == 0) goto L_0x013e
                boolean r9 = r7.isBridge()
                if (r9 == 0) goto L_0x00da
                r0.put(r8, r7)
                goto L_0x0159
            L_0x00da:
                java.util.Map r9 = r11.f52162g
                java.lang.Object r9 = r9.get(r8)
                java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
                java.lang.Object r10 = r0.get(r8)
                java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
                if (r9 != 0) goto L_0x00f3
                r7.setAccessible(r1)
                java.util.Map r9 = r11.f52162g
                r9.put(r8, r7)
                goto L_0x0159
            L_0x00f3:
                boolean r8 = c(r7, r9)
                if (r8 != 0) goto L_0x0159
                if (r10 == 0) goto L_0x0102
                boolean r8 = c(r7, r10)
                if (r8 == 0) goto L_0x0102
                goto L_0x0159
            L_0x0102:
                Gb.c r12 = new Gb.c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Found a conflicting setters with name: "
                r0.append(r1)
                java.lang.String r1 = r7.getName()
                r0.append(r1)
                java.lang.String r1 = " (conflicts with "
                r0.append(r1)
                java.lang.String r1 = r9.getName()
                r0.append(r1)
                java.lang.String r1 = " defined on "
                r0.append(r1)
                java.lang.Class r1 = r9.getDeclaringClass()
                java.lang.String r1 = r1.getName()
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r12.<init>(r0)
                throw r12
            L_0x013e:
                Gb.c r12 = new Gb.c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Found setter with invalid case-sensitive name: "
                r0.append(r1)
                java.lang.String r1 = r7.getName()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r12.<init>(r0)
                throw r12
            L_0x0159:
                int r6 = r6 + 1
                goto L_0x00ab
            L_0x015d:
                java.lang.reflect.Field[] r4 = r2.getDeclaredFields()
                int r5 = r4.length
                r6 = r3
            L_0x0163:
                if (r6 >= r5) goto L_0x018c
                r7 = r4[r6]
                java.lang.String r8 = d(r7)
                java.util.Map r9 = r11.f52160e
                java.util.Locale r10 = java.util.Locale.US
                java.lang.String r10 = r8.toLowerCase(r10)
                boolean r9 = r9.containsKey(r10)
                if (r9 == 0) goto L_0x0189
                java.util.Map r9 = r11.f52163h
                boolean r9 = r9.containsKey(r8)
                if (r9 != 0) goto L_0x0189
                r7.setAccessible(r1)
                java.util.Map r9 = r11.f52163h
                r9.put(r8, r7)
            L_0x0189:
                int r6 = r6 + 1
                goto L_0x0163
            L_0x018c:
                java.lang.Class r2 = r2.getSuperclass()
                if (r2 == 0) goto L_0x019a
                java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
                boolean r4 = r2.equals(r4)
                if (r4 == 0) goto L_0x00a5
            L_0x019a:
                java.util.Map r0 = r11.f52160e
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x01a3
                return
            L_0x01a3:
                Gb.c r0 = new Gb.c
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "No properties to serialize found on class "
                r1.append(r2)
                java.lang.String r12 = r12.getName()
                r1.append(r12)
                java.lang.String r12 = r1.toString()
                r0.<init>(r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Pb.a.C0798a.<init>(java.lang.Class):void");
        }

        private void a(String str) {
            Map map = this.f52160e;
            Locale locale = Locale.US;
            String str2 = (String) map.put(str.toLowerCase(locale), str);
            if (str2 != null && !str.equals(str2)) {
                throw new c("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(locale));
            }
        }

        private static String b(AccessibleObject accessibleObject) {
            Class cls = h.class;
            if (accessibleObject.isAnnotationPresent(cls)) {
                return ((h) accessibleObject.getAnnotation(cls)).value();
            }
            return null;
        }

        private static boolean c(Method method, Method method2) {
            boolean z10;
            boolean z11;
            l.g(method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()), "Expected override from a base class");
            Class<?> returnType = method.getReturnType();
            Class cls = Void.TYPE;
            l.g(returnType.equals(cls), "Expected void return type");
            l.g(method2.getReturnType().equals(cls), "Expected void return type");
            Class[] parameterTypes = method.getParameterTypes();
            Class[] parameterTypes2 = method2.getParameterTypes();
            if (parameterTypes.length == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            l.g(z10, "Expected exactly one parameter");
            if (parameterTypes2.length == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            l.g(z11, "Expected exactly one parameter");
            if (!method.getName().equals(method2.getName()) || !parameterTypes[0].equals(parameterTypes2[0])) {
                return false;
            }
            return true;
        }

        private static String d(Field field) {
            String b10 = b(field);
            if (b10 != null) {
                return b10;
            }
            return field.getName();
        }

        private static String e(Method method) {
            String b10 = b(method);
            if (b10 != null) {
                return b10;
            }
            return g(method.getName());
        }

        private static String g(String str) {
            String[] strArr = {b.au, "set", "is"};
            String str2 = null;
            int i10 = 0;
            for (int i11 = 0; i11 < 3; i11++) {
                String str3 = strArr[i11];
                if (str.startsWith(str3)) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                char[] charArray = str.substring(str2.length()).toCharArray();
                while (i10 < charArray.length && Character.isUpperCase(charArray[i10])) {
                    charArray[i10] = Character.toLowerCase(charArray[i10]);
                    i10++;
                }
                return new String(charArray);
            }
            throw new IllegalArgumentException("Unknown Bean prefix for method: " + str);
        }

        private static boolean h(Field field) {
            if (!field.getDeclaringClass().equals(Object.class) && Modifier.isPublic(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers()) && !field.isAnnotationPresent(e.class)) {
                return true;
            }
            return false;
        }

        private static boolean i(Method method) {
            if ((method.getName().startsWith(b.au) || method.getName().startsWith("is")) && !method.getDeclaringClass().equals(Object.class) && Modifier.isPublic(method.getModifiers()) && !Modifier.isStatic(method.getModifiers()) && !method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 0 && !method.isBridge() && !method.isAnnotationPresent(e.class)) {
                return true;
            }
            return false;
        }

        private static boolean j(Method method) {
            if (method.getName().startsWith("set") && !method.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method.getModifiers()) && method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 1 && !method.isAnnotationPresent(e.class)) {
                return true;
            }
            return false;
        }

        public Map f(Object obj) {
            Object obj2;
            if (this.f52156a.isAssignableFrom(obj.getClass())) {
                HashMap hashMap = new HashMap();
                for (String str : this.f52160e.values()) {
                    if (this.f52161f.containsKey(str)) {
                        try {
                            obj2 = ((Method) this.f52161f.get(str)).invoke(obj, (Object[]) null);
                        } catch (IllegalAccessException e10) {
                            throw new RuntimeException(e10);
                        } catch (InvocationTargetException e11) {
                            throw new RuntimeException(e11);
                        }
                    } else {
                        Field field = (Field) this.f52163h.get(str);
                        if (field != null) {
                            try {
                                obj2 = field.get(obj);
                            } catch (IllegalAccessException e12) {
                                throw new RuntimeException(e12);
                            }
                        } else {
                            throw new IllegalStateException("Bean property without field or getter:" + str);
                        }
                    }
                    hashMap.put(str, a.e(obj2));
                }
                return hashMap;
            }
            throw new IllegalArgumentException("Can't serialize object of class " + obj.getClass() + " with BeanMapper for class " + this.f52156a);
        }
    }

    public static Object b(Object obj) {
        return e(obj);
    }

    public static Map c(Map map) {
        Object e10 = e(map);
        l.f(e10 instanceof Map);
        return (Map) e10;
    }

    private static C0798a d(Class cls) {
        ConcurrentMap concurrentMap = f52155a;
        C0798a aVar = (C0798a) concurrentMap.get(cls);
        if (aVar != null) {
            return aVar;
        }
        C0798a aVar2 = new C0798a(cls);
        concurrentMap.put(cls, aVar2);
        return aVar2;
    }

    /* access modifiers changed from: private */
    public static Object e(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            if ((obj instanceof Float) || (obj instanceof Double)) {
                Number number = (Number) obj;
                double doubleValue = number.doubleValue();
                if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d || Math.floor(doubleValue) != doubleValue) {
                    return Double.valueOf(doubleValue);
                }
                return Long.valueOf(number.longValue());
            } else if ((obj instanceof Long) || (obj instanceof Integer)) {
                return obj;
            } else {
                throw new c(String.format("Numbers of type %s are not supported, please use an int, long, float or double", new Object[]{obj.getClass().getSimpleName()}));
            }
        } else if ((obj instanceof String) || (obj instanceof Boolean)) {
            return obj;
        } else {
            if (obj instanceof Character) {
                throw new c("Characters are not supported, please use Strings");
            } else if (obj instanceof Map) {
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    if (key instanceof String) {
                        hashMap.put((String) key, e(entry.getValue()));
                    } else {
                        throw new c("Maps with non-string keys are not supported");
                    }
                }
                return hashMap;
            } else if (obj instanceof Collection) {
                if (obj instanceof List) {
                    List<Object> list = (List) obj;
                    ArrayList arrayList = new ArrayList(list.size());
                    for (Object e10 : list) {
                        arrayList.add(e(e10));
                    }
                    return arrayList;
                }
                throw new c("Serializing Collections is not supported, please use Lists instead");
            } else if (obj.getClass().isArray()) {
                throw new c("Serializing Arrays is not supported, please use Lists instead");
            } else if (obj instanceof Enum) {
                return ((Enum) obj).name();
            } else {
                return d(obj.getClass()).f(obj);
            }
        }
    }
}
