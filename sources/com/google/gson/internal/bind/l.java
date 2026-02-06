package com.google.gson.internal.bind;

import Pc.C;
import Pc.E;
import Pc.F;
import Pc.H;
import Pc.t;
import com.google.gson.i;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.u;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class l implements u {

    /* renamed from: a  reason: collision with root package name */
    private final t f58247a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.gson.c f58248b;

    /* renamed from: c  reason: collision with root package name */
    private final Pc.u f58249c;

    /* renamed from: d  reason: collision with root package name */
    private final e f58250d;

    /* renamed from: e  reason: collision with root package name */
    private final List f58251e;

    class a extends com.google.gson.t {
        a() {
        }

        public Object read(Sc.a aVar) {
            aVar.D1();
            return null;
        }

        public String toString() {
            return "AnonymousOrNonStaticLocalClassAdapter";
        }

        public void write(Sc.c cVar, Object obj) {
            cVar.T();
        }
    }

    class b extends d {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f58253d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Method f58254e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ com.google.gson.t f58255f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ com.google.gson.t f58256g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f58257h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f58258i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str, Field field, boolean z10, Method method, com.google.gson.t tVar, com.google.gson.t tVar2, boolean z11, boolean z12) {
            super(str, field);
            this.f58253d = z10;
            this.f58254e = method;
            this.f58255f = tVar;
            this.f58256g = tVar2;
            this.f58257h = z11;
            this.f58258i = z12;
        }

        /* access modifiers changed from: package-private */
        public void a(Sc.a aVar, int i10, Object[] objArr) {
            Object read = this.f58256g.read(aVar);
            if (read != null || !this.f58257h) {
                objArr[i10] = read;
                return;
            }
            throw new com.google.gson.l("null is not allowed as value for record component '" + this.f58263c + "' of primitive type; at path " + aVar.m());
        }

        /* access modifiers changed from: package-private */
        public void b(Sc.a aVar, Object obj) {
            Object read = this.f58256g.read(aVar);
            if (read != null || !this.f58257h) {
                if (this.f58253d) {
                    l.b(obj, this.f58262b);
                } else if (this.f58258i) {
                    String g10 = Rc.a.g(this.f58262b, false);
                    throw new i("Cannot set value of 'static final' " + g10);
                }
                this.f58262b.set(obj, read);
            }
        }

        /* access modifiers changed from: package-private */
        public void c(Sc.c cVar, Object obj) {
            Object obj2;
            if (this.f58253d) {
                Method method = this.f58254e;
                if (method == null) {
                    l.b(obj, this.f58262b);
                } else {
                    l.b(obj, method);
                }
            }
            Method method2 = this.f58254e;
            if (method2 != null) {
                try {
                    obj2 = method2.invoke(obj, (Object[]) null);
                } catch (InvocationTargetException e10) {
                    String g10 = Rc.a.g(this.f58254e, false);
                    throw new i("Accessor " + g10 + " threw exception", e10.getCause());
                }
            } else {
                obj2 = this.f58262b.get(obj);
            }
            if (obj2 != obj) {
                cVar.M(this.f58261a);
                this.f58255f.write(cVar, obj2);
            }
        }
    }

    public static abstract class c extends com.google.gson.t {

        /* renamed from: a  reason: collision with root package name */
        private final f f58260a;

        c(f fVar) {
            this.f58260a = fVar;
        }

        /* access modifiers changed from: package-private */
        public abstract Object a();

        /* access modifiers changed from: package-private */
        public abstract Object b(Object obj);

        /* access modifiers changed from: package-private */
        public abstract void c(Object obj, Sc.a aVar, d dVar);

        public Object read(Sc.a aVar) {
            if (aVar.I0() == Sc.b.NULL) {
                aVar.t0();
                return null;
            }
            Object a10 = a();
            Map map = this.f58260a.f58266a;
            try {
                aVar.f();
                while (aVar.M()) {
                    d dVar = (d) map.get(aVar.j0());
                    if (dVar == null) {
                        aVar.D1();
                    } else {
                        c(a10, aVar, dVar);
                    }
                }
                aVar.v();
                return b(a10);
            } catch (IllegalStateException e10) {
                throw new n((Throwable) e10);
            } catch (IllegalAccessException e11) {
                throw Rc.a.e(e11);
            }
        }

        public void write(Sc.c cVar, Object obj) {
            if (obj == null) {
                cVar.T();
                return;
            }
            cVar.o();
            try {
                for (d c10 : this.f58260a.f58267b) {
                    c10.c(cVar, obj);
                }
                cVar.v();
            } catch (IllegalAccessException e10) {
                throw Rc.a.e(e10);
            }
        }
    }

    static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        final String f58261a;

        /* renamed from: b  reason: collision with root package name */
        final Field f58262b;

        /* renamed from: c  reason: collision with root package name */
        final String f58263c;

        protected d(String str, Field field) {
            this.f58261a = str;
            this.f58262b = field;
            this.f58263c = field.getName();
        }

        /* access modifiers changed from: package-private */
        public abstract void a(Sc.a aVar, int i10, Object[] objArr);

        /* access modifiers changed from: package-private */
        public abstract void b(Sc.a aVar, Object obj);

        /* access modifiers changed from: package-private */
        public abstract void c(Sc.c cVar, Object obj);
    }

    private static final class e extends c {

        /* renamed from: b  reason: collision with root package name */
        private final C f58264b;

        e(C c10, f fVar) {
            super(fVar);
            this.f58264b = c10;
        }

        /* access modifiers changed from: package-private */
        public Object a() {
            return this.f58264b.a();
        }

        /* access modifiers changed from: package-private */
        public Object b(Object obj) {
            return obj;
        }

        /* access modifiers changed from: package-private */
        public void c(Object obj, Sc.a aVar, d dVar) {
            dVar.b(aVar, obj);
        }
    }

    private static class f {

        /* renamed from: c  reason: collision with root package name */
        public static final f f58265c = new f(Collections.emptyMap(), Collections.emptyList());

        /* renamed from: a  reason: collision with root package name */
        public final Map f58266a;

        /* renamed from: b  reason: collision with root package name */
        public final List f58267b;

        public f(Map map, List list) {
            this.f58266a = map;
            this.f58267b = list;
        }
    }

    private static final class g extends c {

        /* renamed from: e  reason: collision with root package name */
        static final Map f58268e = f();

        /* renamed from: b  reason: collision with root package name */
        private final Constructor f58269b;

        /* renamed from: c  reason: collision with root package name */
        private final Object[] f58270c;

        /* renamed from: d  reason: collision with root package name */
        private final Map f58271d = new HashMap();

        g(Class cls, f fVar, boolean z10) {
            super(fVar);
            Constructor i10 = Rc.a.i(cls);
            this.f58269b = i10;
            if (z10) {
                l.b((Object) null, i10);
            } else {
                Rc.a.o(i10);
            }
            String[] k10 = Rc.a.k(cls);
            for (int i11 = 0; i11 < k10.length; i11++) {
                this.f58271d.put(k10[i11], Integer.valueOf(i11));
            }
            Class[] parameterTypes = this.f58269b.getParameterTypes();
            this.f58270c = new Object[parameterTypes.length];
            for (int i12 = 0; i12 < parameterTypes.length; i12++) {
                this.f58270c[i12] = f58268e.get(parameterTypes[i12]);
            }
        }

        private static Map f() {
            HashMap hashMap = new HashMap();
            hashMap.put(Byte.TYPE, (byte) 0);
            hashMap.put(Short.TYPE, (short) 0);
            hashMap.put(Integer.TYPE, 0);
            hashMap.put(Long.TYPE, 0L);
            hashMap.put(Float.TYPE, Float.valueOf(0.0f));
            hashMap.put(Double.TYPE, Double.valueOf(0.0d));
            hashMap.put(Character.TYPE, 0);
            hashMap.put(Boolean.TYPE, Boolean.FALSE);
            return hashMap;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Object[] a() {
            return (Object[]) this.f58270c.clone();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Object b(Object[] objArr) {
            try {
                return this.f58269b.newInstance(objArr);
            } catch (IllegalAccessException e10) {
                throw Rc.a.e(e10);
            } catch (IllegalArgumentException | InstantiationException e11) {
                throw new RuntimeException("Failed to invoke constructor '" + Rc.a.c(this.f58269b) + "' with args " + Arrays.toString(objArr), e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Failed to invoke constructor '" + Rc.a.c(this.f58269b) + "' with args " + Arrays.toString(objArr), e12.getCause());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void c(Object[] objArr, Sc.a aVar, d dVar) {
            Integer num = (Integer) this.f58271d.get(dVar.f58263c);
            if (num != null) {
                dVar.a(aVar, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + Rc.a.c(this.f58269b) + "' for field with name '" + dVar.f58263c + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public l(t tVar, com.google.gson.c cVar, Pc.u uVar, e eVar, List list) {
        this.f58247a = tVar;
        this.f58248b = cVar;
        this.f58249c = uVar;
        this.f58250d = eVar;
        this.f58251e = list;
    }

    /* access modifiers changed from: private */
    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!F.a(accessibleObject, obj)) {
            String g10 = Rc.a.g(accessibleObject, true);
            throw new i(g10 + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
        }
    }

    private d c(com.google.gson.e eVar, Field field, Method method, String str, com.google.gson.reflect.a aVar, boolean z10, boolean z11) {
        boolean z12;
        com.google.gson.t tVar;
        com.google.gson.t tVar2;
        com.google.gson.t tVar3;
        com.google.gson.e eVar2 = eVar;
        boolean a10 = E.a(aVar.getRawType());
        int modifiers = field.getModifiers();
        boolean z13 = false;
        if (!Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) {
            z12 = false;
        } else {
            z12 = true;
        }
        Oc.b bVar = (Oc.b) field.getAnnotation(Oc.b.class);
        if (bVar != null) {
            tVar = this.f58250d.c(this.f58247a, eVar, aVar, bVar, false);
        } else {
            tVar = null;
        }
        if (tVar != null) {
            z13 = true;
        }
        com.google.gson.reflect.a aVar2 = aVar;
        if (tVar == null) {
            tVar = eVar.o(aVar2);
        }
        com.google.gson.t tVar4 = tVar;
        if (z10) {
            if (z13) {
                tVar3 = tVar4;
            } else {
                tVar3 = new n(eVar, tVar4, aVar.getType());
            }
            tVar2 = tVar3;
        } else {
            tVar2 = tVar4;
        }
        return new b(str, field, z11, method, tVar2, tVar4, a10, z12);
    }

    private static IllegalArgumentException d(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + Rc.a.f(field) + " and " + Rc.a.f(field2) + "\nSee " + H.a("duplicate-fields"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x013c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.gson.internal.bind.l.f e(com.google.gson.e r24, com.google.gson.reflect.a r25, java.lang.Class r26, boolean r27, boolean r28) {
        /*
            r23 = this;
            r8 = r23
            r9 = r26
            boolean r0 = r26.isInterface()
            if (r0 == 0) goto L_0x000d
            com.google.gson.internal.bind.l$f r0 = com.google.gson.internal.bind.l.f.f58265c
            return r0
        L_0x000d:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            r12 = r25
            r0 = r27
            r13 = r9
        L_0x001c:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r13 == r1) goto L_0x015d
            java.lang.reflect.Field[] r14 = r13.getDeclaredFields()
            r15 = 1
            r7 = 0
            if (r13 == r9) goto L_0x003c
            int r1 = r14.length
            if (r1 <= 0) goto L_0x003c
            java.util.List r0 = r8.f58251e
            com.google.gson.p r0 = Pc.F.b(r0, r13)
            com.google.gson.p r1 = com.google.gson.p.BLOCK_ALL
            if (r0 == r1) goto L_0x003f
            com.google.gson.p r1 = com.google.gson.p.BLOCK_INACCESSIBLE
            if (r0 != r1) goto L_0x003b
            r0 = r15
            goto L_0x003c
        L_0x003b:
            r0 = r7
        L_0x003c:
            r16 = r0
            goto L_0x0063
        L_0x003f:
            com.google.gson.i r0 = new com.google.gson.i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ReflectionAccessFilter does not permit using reflection for "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = " (supertype of "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = "). Register a TypeAdapter for this type or adjust the access filter."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0063:
            int r6 = r14.length
            r5 = r7
        L_0x0065:
            if (r5 >= r6) goto L_0x0145
            r4 = r14[r5]
            boolean r17 = r8.g(r4, r15)
            boolean r0 = r8.g(r4, r7)
            if (r17 != 0) goto L_0x007d
            if (r0 != 0) goto L_0x007d
            r21 = r5
            r19 = r6
            r22 = r7
            goto L_0x013c
        L_0x007d:
            r1 = 0
            if (r28 == 0) goto L_0x00c6
            int r2 = r4.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
            if (r2 == 0) goto L_0x008e
            r3 = r1
            r18 = r7
            goto L_0x00c9
        L_0x008e:
            java.lang.reflect.Method r1 = Rc.a.h(r13, r4)
            if (r16 != 0) goto L_0x0097
            Rc.a.o(r1)
        L_0x0097:
            java.lang.Class<Oc.c> r2 = Oc.c.class
            java.lang.annotation.Annotation r3 = r1.getAnnotation(r2)
            if (r3 == 0) goto L_0x00c6
            java.lang.annotation.Annotation r2 = r4.getAnnotation(r2)
            if (r2 == 0) goto L_0x00a6
            goto L_0x00c6
        L_0x00a6:
            java.lang.String r0 = Rc.a.g(r1, r7)
            com.google.gson.i r1 = new com.google.gson.i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "@SerializedName on "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " is not supported"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x00c6:
            r18 = r0
            r3 = r1
        L_0x00c9:
            if (r16 != 0) goto L_0x00d0
            if (r3 != 0) goto L_0x00d0
            Rc.a.o(r4)
        L_0x00d0:
            java.lang.reflect.Type r0 = r12.getType()
            java.lang.reflect.Type r1 = r4.getGenericType()
            java.lang.reflect.Type r0 = Pc.w.p(r0, r13, r1)
            java.util.List r2 = r8.f(r4)
            java.lang.Object r1 = r2.get(r7)
            java.lang.String r1 = (java.lang.String) r1
            com.google.gson.reflect.a r19 = com.google.gson.reflect.a.get((java.lang.reflect.Type) r0)
            r0 = r23
            r25 = r1
            r1 = r24
            r20 = r2
            r2 = r4
            r15 = r4
            r4 = r25
            r21 = r5
            r5 = r19
            r19 = r6
            r6 = r17
            r22 = r7
            r7 = r16
            com.google.gson.internal.bind.l$d r0 = r0.c(r1, r2, r3, r4, r5, r6, r7)
            if (r18 == 0) goto L_0x0128
            java.util.Iterator r1 = r20.iterator()
        L_0x010c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0128
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r10.put(r2, r0)
            com.google.gson.internal.bind.l$d r3 = (com.google.gson.internal.bind.l.d) r3
            if (r3 != 0) goto L_0x0121
            goto L_0x010c
        L_0x0121:
            java.lang.reflect.Field r0 = r3.f58262b
            java.lang.IllegalArgumentException r0 = d(r9, r2, r0, r15)
            throw r0
        L_0x0128:
            if (r17 == 0) goto L_0x013c
            r1 = r25
            java.lang.Object r0 = r11.put(r1, r0)
            com.google.gson.internal.bind.l$d r0 = (com.google.gson.internal.bind.l.d) r0
            if (r0 != 0) goto L_0x0135
            goto L_0x013c
        L_0x0135:
            java.lang.reflect.Field r0 = r0.f58262b
            java.lang.IllegalArgumentException r0 = d(r9, r1, r0, r15)
            throw r0
        L_0x013c:
            int r5 = r21 + 1
            r6 = r19
            r7 = r22
            r15 = 1
            goto L_0x0065
        L_0x0145:
            java.lang.reflect.Type r0 = r12.getType()
            java.lang.reflect.Type r1 = r13.getGenericSuperclass()
            java.lang.reflect.Type r0 = Pc.w.p(r0, r13, r1)
            com.google.gson.reflect.a r12 = com.google.gson.reflect.a.get((java.lang.reflect.Type) r0)
            java.lang.Class r13 = r12.getRawType()
            r0 = r16
            goto L_0x001c
        L_0x015d:
            com.google.gson.internal.bind.l$f r0 = new com.google.gson.internal.bind.l$f
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Collection r2 = r11.values()
            r1.<init>(r2)
            r0.<init>(r10, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.l.e(com.google.gson.e, com.google.gson.reflect.a, java.lang.Class, boolean, boolean):com.google.gson.internal.bind.l$f");
    }

    private List f(Field field) {
        Oc.c cVar = (Oc.c) field.getAnnotation(Oc.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f58248b.a(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        Collections.addAll(arrayList, alternate);
        return arrayList;
    }

    private boolean g(Field field, boolean z10) {
        return !this.f58249c.d(field, z10);
    }

    public com.google.gson.t create(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
        boolean z10;
        Class rawType = aVar.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (Rc.a.l(rawType)) {
            return new a();
        }
        p b10 = F.b(this.f58251e, rawType);
        if (b10 != p.BLOCK_ALL) {
            if (b10 == p.BLOCK_INACCESSIBLE) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (Rc.a.m(rawType)) {
                return new g(rawType, e(eVar, aVar, rawType, z10, true), z10);
            }
            return new e(this.f58247a.u(aVar, true), e(eVar, aVar, rawType, z10, false));
        }
        throw new i("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
