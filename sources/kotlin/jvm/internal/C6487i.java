package kotlin.jvm.internal;

import Ff.d;
import com.adjust.sdk.Constants;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import lf.C6502A;
import lf.C6527k;
import mf.C6565s;
import mf.O;
import xf.C6781a;
import xf.C6782b;
import yf.C6787a;
import yf.C6788b;
import yf.C6789c;
import yf.C6790d;
import yf.C6791e;
import yf.C6792f;
import yf.C6793g;
import yf.C6794h;
import yf.C6795i;
import yf.C6796j;
import yf.C6797k;
import yf.C6798l;
import yf.C6799m;
import yf.C6800n;
import yf.C6801o;
import yf.p;
import yf.q;
import yf.r;
import yf.s;
import yf.t;
import yf.u;
import yf.v;
import yf.w;

/* renamed from: kotlin.jvm.internal.i  reason: case insensitive filesystem */
public final class C6487i implements d, C6486h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f71780b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final Map f71781c;

    /* renamed from: d  reason: collision with root package name */
    private static final HashMap f71782d;

    /* renamed from: e  reason: collision with root package name */
    private static final HashMap f71783e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap f71784f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final Map f71785g;

    /* renamed from: a  reason: collision with root package name */
    private final Class f71786a;

    /* renamed from: kotlin.jvm.internal.i$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Class cls) {
            String str;
            C6496s.h(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) C6487i.f71784f.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                if (str2 == null) {
                    return "kotlin.Array";
                }
                return str2;
            }
            String str3 = (String) C6487i.f71784f.get(cls.getName());
            if (str3 == null) {
                return cls.getCanonicalName();
            }
            return str3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x003b, code lost:
            if (r2 == null) goto L_0x0041;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String b(java.lang.Class r7) {
            /*
                r6 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.C6496s.h(r7, r0)
                boolean r0 = r7.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto L_0x000e
                goto L_0x00b3
            L_0x000e:
                boolean r0 = r7.isLocalClass()
                if (r0 == 0) goto L_0x006a
                java.lang.String r0 = r7.getSimpleName()
                java.lang.reflect.Method r2 = r7.getEnclosingMethod()
                r3 = 2
                r4 = 36
                if (r2 == 0) goto L_0x0041
                kotlin.jvm.internal.C6496s.e(r0)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r2 = r2.getName()
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                java.lang.String r2 = Sg.p.S0(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L_0x003e
                goto L_0x0041
            L_0x003e:
                r1 = r2
                goto L_0x00b3
            L_0x0041:
                java.lang.reflect.Constructor r7 = r7.getEnclosingConstructor()
                if (r7 == 0) goto L_0x0062
                kotlin.jvm.internal.C6496s.e(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = r7.getName()
                r2.append(r7)
                r2.append(r4)
                java.lang.String r7 = r2.toString()
                java.lang.String r1 = Sg.p.S0(r0, r7, r1, r3, r1)
                goto L_0x00b3
            L_0x0062:
                kotlin.jvm.internal.C6496s.e(r0)
                java.lang.String r1 = Sg.p.R0(r0, r4, r1, r3, r1)
                goto L_0x00b3
            L_0x006a:
                boolean r0 = r7.isArray()
                if (r0 == 0) goto L_0x009e
                java.lang.Class r7 = r7.getComponentType()
                boolean r0 = r7.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L_0x009b
                java.util.Map r0 = kotlin.jvm.internal.C6487i.f71785g
                java.lang.String r7 = r7.getName()
                java.lang.Object r7 = r0.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L_0x009b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                r0.append(r2)
                java.lang.String r1 = r0.toString()
            L_0x009b:
                if (r1 != 0) goto L_0x00b3
                goto L_0x003e
            L_0x009e:
                java.util.Map r0 = kotlin.jvm.internal.C6487i.f71785g
                java.lang.String r1 = r7.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto L_0x00b3
                java.lang.String r1 = r7.getSimpleName()
            L_0x00b3:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C6487i.a.b(java.lang.Class):java.lang.String");
        }

        public final boolean c(Object obj, Class cls) {
            C6496s.h(cls, "jClass");
            Map k10 = C6487i.f71781c;
            C6496s.f(k10, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) k10.get(cls);
            if (num != null) {
                return V.m(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = C6781a.c(C6781a.e(cls));
            }
            return cls.isInstance(obj);
        }

        private a() {
        }
    }

    static {
        Iterable q10 = C6565s.q(C6787a.class, C6798l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, C6788b.class, C6789c.class, C6790d.class, C6791e.class, C6792f.class, C6793g.class, C6794h.class, C6795i.class, C6796j.class, C6797k.class, C6799m.class, C6800n.class, C6801o.class);
        ArrayList arrayList = new ArrayList(C6565s.y(q10, 10));
        int i10 = 0;
        for (Object next : q10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C6565s.x();
            }
            arrayList.add(C6502A.a((Class) next, Integer.valueOf(i10)));
            i10 = i11;
        }
        f71781c = O.w(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put(AttributeType.BOOLEAN, "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put(AttributeType.FLOAT, "kotlin.Float");
        hashMap.put(Constants.LONG, "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f71782d = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f71783e = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C6496s.g(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            C6496s.e(str);
            sb2.append(Sg.p.V0(str, '.', (String) null, 2, (Object) null));
            sb2.append("CompanionObject");
            String sb3 = sb2.toString();
            Pair a10 = C6502A.a(sb3, str + ".Companion");
            hashMap3.put(a10.c(), a10.d());
        }
        for (Map.Entry entry : f71781c.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            String name = ((Class) entry.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f71784f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(O.e(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), Sg.p.V0((String) entry2.getValue(), '.', (String) null, 2, (Object) null));
        }
        f71785g = linkedHashMap;
    }

    public C6487i(Class cls) {
        C6496s.h(cls, "jClass");
        this.f71786a = cls;
    }

    private final Void r() {
        throw new C6782b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6487i) || !C6496s.c(C6781a.c(this), C6781a.c((d) obj))) {
            return false;
        }
        return true;
    }

    public Class f() {
        return this.f71786a;
    }

    public List getAnnotations() {
        r();
        throw new C6527k();
    }

    public int hashCode() {
        return C6781a.c(this).hashCode();
    }

    public Collection j() {
        r();
        throw new C6527k();
    }

    public List l() {
        r();
        throw new C6527k();
    }

    public boolean t() {
        r();
        throw new C6527k();
    }

    public String toString() {
        return f().toString() + " (Kotlin reflection is not available)";
    }

    public boolean u(Object obj) {
        return f71780b.c(obj, f());
    }

    public String v() {
        return f71780b.a(f());
    }

    public String w() {
        return f71780b.b(f());
    }
}
