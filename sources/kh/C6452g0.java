package kh;

import Ff.d;
import gh.C5978b;
import gh.C5980d;
import gh.C5981e;
import gh.C5985i;
import gh.C5986j;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import xf.C6781a;

/* renamed from: kh.g0  reason: case insensitive filesystem */
public abstract class C6452g0 {
    private static final Object a(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get((Object) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final C5978b b(d dVar) {
        C6496s.h(dVar, "<this>");
        return c(dVar, new C5978b[0]);
    }

    public static final C5978b c(d dVar, C5978b... bVarArr) {
        C6496s.h(dVar, "<this>");
        C6496s.h(bVarArr, "args");
        return d(C6781a.b(dVar), (C5978b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }

    public static final C5978b d(Class cls, C5978b... bVarArr) {
        C5978b i10;
        C6496s.h(cls, "<this>");
        C6496s.h(bVarArr, "args");
        if (cls.isEnum() && l(cls)) {
            return e(cls);
        }
        if (cls.isInterface() && (i10 = i(cls)) != null) {
            return i10;
        }
        C5978b k10 = k(cls, (C5978b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        if (k10 != null) {
            return k10;
        }
        C5978b h10 = h(cls);
        if (h10 != null) {
            return h10;
        }
        C5978b f10 = f(cls, (C5978b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        if (f10 != null) {
            return f10;
        }
        if (m(cls)) {
            return new C5981e(C6781a.e(cls));
        }
        return null;
    }

    private static final C5978b e(Class cls) {
        Object[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        C6496s.g(canonicalName, "getCanonicalName(...)");
        C6496s.f(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new C6477y(canonicalName, (Enum[]) enumConstants);
    }

    private static final C5978b f(Class cls, C5978b... bVarArr) {
        Object obj;
        Field field;
        C5978b j10;
        Object g10 = g(cls);
        if (g10 != null && (j10 = j(g10, (C5978b[]) Arrays.copyOf(bVarArr, bVarArr.length))) != null) {
            return j10;
        }
        try {
            Class[] declaredClasses = cls.getDeclaredClasses();
            C6496s.g(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i10 = 0;
            Class cls2 = null;
            boolean z10 = false;
            while (true) {
                if (i10 < length) {
                    Class cls3 = declaredClasses[i10];
                    if (C6496s.c(cls3.getSimpleName(), "$serializer")) {
                        if (z10) {
                            break;
                        }
                        z10 = true;
                        cls2 = cls3;
                    }
                    i10++;
                } else if (!z10) {
                }
            }
            cls2 = null;
            if (cls2 == null || (field = cls2.getField("INSTANCE")) == null) {
                obj = null;
            } else {
                obj = field.get((Object) null);
            }
            if (obj instanceof C5978b) {
                return (C5978b) obj;
            }
            return null;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static final Object g(Class cls) {
        Class cls2;
        Class[] declaredClasses = cls.getDeclaredClasses();
        C6496s.g(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i10];
            if (cls2.getAnnotation(X.class) != null) {
                break;
            }
            i10++;
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        C6496s.g(simpleName, "getSimpleName(...)");
        return a(cls, simpleName);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (r5 == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009d, code lost:
        if (r4 == false) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final gh.C5978b h(java.lang.Class r11) {
        /*
            java.lang.String r0 = r11.getCanonicalName()
            r1 = 0
            if (r0 == 0) goto L_0x00ae
            java.lang.String r2 = "java."
            r3 = 0
            r4 = 2
            boolean r2 = Sg.p.J(r0, r2, r3, r4, r1)
            if (r2 != 0) goto L_0x00ae
            java.lang.String r2 = "kotlin."
            boolean r0 = Sg.p.J(r0, r2, r3, r4, r1)
            if (r0 == 0) goto L_0x001b
            goto L_0x00ae
        L_0x001b:
            java.lang.reflect.Field[] r0 = r11.getDeclaredFields()
            java.lang.String r2 = "getDeclaredFields(...)"
            kotlin.jvm.internal.C6496s.g(r0, r2)
            int r2 = r0.length
            r6 = r1
            r4 = r3
            r5 = r4
        L_0x0028:
            r7 = 1
            if (r4 >= r2) goto L_0x0056
            r8 = r0[r4]
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "INSTANCE"
            boolean r9 = kotlin.jvm.internal.C6496s.c(r9, r10)
            if (r9 == 0) goto L_0x0053
            java.lang.Class r9 = r8.getType()
            boolean r9 = kotlin.jvm.internal.C6496s.c(r9, r11)
            if (r9 == 0) goto L_0x0053
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 == 0) goto L_0x0053
            if (r5 == 0) goto L_0x0051
        L_0x004f:
            r6 = r1
            goto L_0x0059
        L_0x0051:
            r5 = r7
            r6 = r8
        L_0x0053:
            int r4 = r4 + 1
            goto L_0x0028
        L_0x0056:
            if (r5 != 0) goto L_0x0059
            goto L_0x004f
        L_0x0059:
            if (r6 != 0) goto L_0x005c
            return r1
        L_0x005c:
            java.lang.Object r0 = r6.get(r1)
            java.lang.reflect.Method[] r11 = r11.getMethods()
            java.lang.String r2 = "getMethods(...)"
            kotlin.jvm.internal.C6496s.g(r11, r2)
            int r2 = r11.length
            r5 = r1
            r4 = r3
        L_0x006c:
            if (r3 >= r2) goto L_0x009d
            r6 = r11[r3]
            java.lang.String r8 = r6.getName()
            java.lang.String r9 = "serializer"
            boolean r8 = kotlin.jvm.internal.C6496s.c(r8, r9)
            if (r8 == 0) goto L_0x009a
            java.lang.Class[] r8 = r6.getParameterTypes()
            java.lang.String r9 = "getParameterTypes(...)"
            kotlin.jvm.internal.C6496s.g(r8, r9)
            int r8 = r8.length
            if (r8 != 0) goto L_0x009a
            java.lang.Class r8 = r6.getReturnType()
            java.lang.Class<gh.b> r9 = gh.C5978b.class
            boolean r8 = kotlin.jvm.internal.C6496s.c(r8, r9)
            if (r8 == 0) goto L_0x009a
            if (r4 == 0) goto L_0x0098
        L_0x0096:
            r5 = r1
            goto L_0x00a0
        L_0x0098:
            r5 = r6
            r4 = r7
        L_0x009a:
            int r3 = r3 + 1
            goto L_0x006c
        L_0x009d:
            if (r4 != 0) goto L_0x00a0
            goto L_0x0096
        L_0x00a0:
            if (r5 != 0) goto L_0x00a3
            return r1
        L_0x00a3:
            java.lang.Object r11 = r5.invoke(r0, r1)
            boolean r0 = r11 instanceof gh.C5978b
            if (r0 == 0) goto L_0x00ae
            r1 = r11
            gh.b r1 = (gh.C5978b) r1
        L_0x00ae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kh.C6452g0.h(java.lang.Class):gh.b");
    }

    private static final C5978b i(Class cls) {
        C5985i iVar = (C5985i) cls.getAnnotation(C5985i.class);
        if (iVar == null || C6496s.c(O.b(iVar.with()), O.b(C5981e.class))) {
            return new C5981e(C6781a.e(cls));
        }
        return null;
    }

    private static final C5978b j(Object obj, C5978b... bVarArr) {
        Class[] clsArr;
        try {
            if (bVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = bVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i10 = 0; i10 < length; i10++) {
                    clsArr2[i10] = C5978b.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(bVarArr, bVarArr.length));
            if (invoke instanceof C5978b) {
                return (C5978b) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause != null) {
                String message = cause.getMessage();
                if (message == null) {
                    message = e10.getMessage();
                }
                throw new InvocationTargetException(cause, message);
            }
            throw e10;
        }
    }

    private static final C5978b k(Class cls, C5978b... bVarArr) {
        Object a10 = a(cls, "Companion");
        if (a10 == null) {
            return null;
        }
        return j(a10, (C5978b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }

    private static final boolean l(Class cls) {
        if (cls.getAnnotation(C5985i.class) == null && cls.getAnnotation(C5980d.class) == null) {
            return true;
        }
        return false;
    }

    private static final boolean m(Class cls) {
        if (cls.getAnnotation(C5980d.class) != null) {
            return true;
        }
        C5985i iVar = (C5985i) cls.getAnnotation(C5985i.class);
        if (iVar == null || !C6496s.c(O.b(iVar.with()), O.b(C5981e.class))) {
            return false;
        }
        return true;
    }

    public static final Void n(Class cls) {
        C6496s.h(cls, "<this>");
        throw new C5986j(C6454h0.c(C6781a.e(cls)));
    }

    public static final Object[] o(ArrayList arrayList, d dVar) {
        C6496s.h(arrayList, "<this>");
        C6496s.h(dVar, "eClass");
        Object newInstance = Array.newInstance(C6781a.b(dVar), arrayList.size());
        C6496s.f(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) newInstance);
        C6496s.g(array, "toArray(...)");
        return array;
    }
}
