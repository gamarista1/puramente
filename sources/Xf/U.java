package Xf;

import Ef.m;
import gg.C5946F;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import mf.C6565s;
import mf.O;
import mf.Y;
import ng.f;
import sf.C6714a;
import wg.C6769e;

public abstract class U {

    /* renamed from: a  reason: collision with root package name */
    public static final a f66327a = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private static final List f66328b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final List f66329c;

    /* renamed from: d  reason: collision with root package name */
    private static final List f66330d;

    /* renamed from: e  reason: collision with root package name */
    private static final Map f66331e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final Map f66332f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final Set f66333g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final Set f66334h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final a.C0963a f66335i;

    /* renamed from: j  reason: collision with root package name */
    private static final Map f66336j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final Map f66337k;

    /* renamed from: l  reason: collision with root package name */
    private static final Set f66338l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final Set f66339m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final Map f66340n;

    public static final class a {

        /* renamed from: Xf.U$a$a  reason: collision with other inner class name */
        public static final class C0963a {

            /* renamed from: a  reason: collision with root package name */
            private final String f66341a;

            /* renamed from: b  reason: collision with root package name */
            private final f f66342b;

            /* renamed from: c  reason: collision with root package name */
            private final String f66343c;

            /* renamed from: d  reason: collision with root package name */
            private final String f66344d;

            /* renamed from: e  reason: collision with root package name */
            private final String f66345e;

            public C0963a(String str, f fVar, String str2, String str3) {
                C6496s.h(str, "classInternalName");
                C6496s.h(fVar, "name");
                C6496s.h(str2, "parameters");
                C6496s.h(str3, "returnType");
                this.f66341a = str;
                this.f66342b = fVar;
                this.f66343c = str2;
                this.f66344d = str3;
                C5946F f10 = C5946F.f67716a;
                this.f66345e = f10.l(str, fVar + '(' + str2 + ')' + str3);
            }

            public static /* synthetic */ C0963a b(C0963a aVar, String str, f fVar, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = aVar.f66341a;
                }
                if ((i10 & 2) != 0) {
                    fVar = aVar.f66342b;
                }
                if ((i10 & 4) != 0) {
                    str2 = aVar.f66343c;
                }
                if ((i10 & 8) != 0) {
                    str3 = aVar.f66344d;
                }
                return aVar.a(str, fVar, str2, str3);
            }

            public final C0963a a(String str, f fVar, String str2, String str3) {
                C6496s.h(str, "classInternalName");
                C6496s.h(fVar, "name");
                C6496s.h(str2, "parameters");
                C6496s.h(str3, "returnType");
                return new C0963a(str, fVar, str2, str3);
            }

            public final f c() {
                return this.f66342b;
            }

            public final String d() {
                return this.f66345e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0963a)) {
                    return false;
                }
                C0963a aVar = (C0963a) obj;
                if (C6496s.c(this.f66341a, aVar.f66341a) && C6496s.c(this.f66342b, aVar.f66342b) && C6496s.c(this.f66343c, aVar.f66343c) && C6496s.c(this.f66344d, aVar.f66344d)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (((((this.f66341a.hashCode() * 31) + this.f66342b.hashCode()) * 31) + this.f66343c.hashCode()) * 31) + this.f66344d.hashCode();
            }

            public String toString() {
                return "NameAndSignature(classInternalName=" + this.f66341a + ", name=" + this.f66342b + ", parameters=" + this.f66343c + ", returnType=" + this.f66344d + ')';
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final C0963a m(String str, String str2, String str3, String str4) {
            f i10 = f.i(str2);
            C6496s.g(i10, "identifier(...)");
            return new C0963a(str, i10, str3, str4);
        }

        public final f b(f fVar) {
            C6496s.h(fVar, "name");
            return (f) f().get(fVar);
        }

        public final List c() {
            return U.f66329c;
        }

        public final Set d() {
            return U.f66333g;
        }

        public final Set e() {
            return U.f66334h;
        }

        public final Map f() {
            return U.f66340n;
        }

        public final Set g() {
            return U.f66339m;
        }

        public final C0963a h() {
            return U.f66335i;
        }

        public final Map i() {
            return U.f66332f;
        }

        public final Map j() {
            return U.f66337k;
        }

        public final boolean k(f fVar) {
            C6496s.h(fVar, "<this>");
            return g().contains(fVar);
        }

        public final b l(String str) {
            C6496s.h(str, "builtinSignature");
            if (c().contains(str)) {
                return b.ONE_COLLECTION_PARAMETER;
            }
            if (((c) O.j(i(), str)) == c.NULL) {
                return b.OBJECT_PARAMETER_GENERIC;
            }
            return b.OBJECT_PARAMETER_NON_GENERIC;
        }

        private a() {
        }
    }

    public enum b {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC((String) null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);
        

        /* renamed from: a  reason: collision with root package name */
        private final String f66351a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f66352b;

        static {
            b[] a10;
            f66350g = C6714a.a(a10);
        }

        private b(String str, boolean z10) {
            this.f66351a = str;
            this.f66352b = z10;
        }
    }

    public enum c {
        NULL((String) null),
        INDEX(-1),
        FALSE(Boolean.FALSE);
        

        /* renamed from: a  reason: collision with root package name */
        private final Object f66359a;

        static final class a extends c {
            a(String str, int i10) {
                super(str, i10, (Object) null, (DefaultConstructorMarker) null);
            }
        }

        static {
            c[] a10;
            f66358g = C6714a.a(a10);
        }

        private c(Object obj) {
            this.f66359a = obj;
        }
    }

    static {
        Iterable<String> j10 = Y.j("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(C6565s.y(j10, 10));
        for (String a10 : j10) {
            a aVar = f66327a;
            String e10 = C6769e.BOOLEAN.e();
            C6496s.g(e10, "getDesc(...)");
            arrayList.add(aVar.m("java/util/Collection", a10, "Ljava/util/Collection;", e10));
        }
        f66328b = arrayList;
        Iterable<a.C0963a> iterable = arrayList;
        ArrayList arrayList2 = new ArrayList(C6565s.y(iterable, 10));
        for (a.C0963a d10 : iterable) {
            arrayList2.add(d10.d());
        }
        f66329c = arrayList2;
        Iterable<a.C0963a> iterable2 = f66328b;
        ArrayList arrayList3 = new ArrayList(C6565s.y(iterable2, 10));
        for (a.C0963a c10 : iterable2) {
            arrayList3.add(c10.c().b());
        }
        f66330d = arrayList3;
        C5946F f10 = C5946F.f67716a;
        a aVar2 = f66327a;
        String i10 = f10.i("Collection");
        C6769e eVar = C6769e.BOOLEAN;
        String e11 = eVar.e();
        C6496s.g(e11, "getDesc(...)");
        a.C0963a a11 = aVar2.m(i10, "contains", "Ljava/lang/Object;", e11);
        c cVar = c.FALSE;
        Pair a12 = C6502A.a(a11, cVar);
        String i11 = f10.i("Collection");
        String e12 = eVar.e();
        C6496s.g(e12, "getDesc(...)");
        Pair a13 = C6502A.a(aVar2.m(i11, "remove", "Ljava/lang/Object;", e12), cVar);
        String i12 = f10.i("Map");
        String e13 = eVar.e();
        C6496s.g(e13, "getDesc(...)");
        Pair a14 = C6502A.a(aVar2.m(i12, "containsKey", "Ljava/lang/Object;", e13), cVar);
        String i13 = f10.i("Map");
        String e14 = eVar.e();
        C6496s.g(e14, "getDesc(...)");
        Pair a15 = C6502A.a(aVar2.m(i13, "containsValue", "Ljava/lang/Object;", e14), cVar);
        String i14 = f10.i("Map");
        String e15 = eVar.e();
        C6496s.g(e15, "getDesc(...)");
        Pair a16 = C6502A.a(aVar2.m(i14, "remove", "Ljava/lang/Object;Ljava/lang/Object;", e15), cVar);
        Pair a17 = C6502A.a(aVar2.m(f10.i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), c.f66356e);
        a.C0963a a18 = aVar2.m(f10.i("Map"), com.amazon.a.a.o.b.au, "Ljava/lang/Object;", "Ljava/lang/Object;");
        c cVar2 = c.NULL;
        Pair a19 = C6502A.a(a18, cVar2);
        Pair a20 = C6502A.a(aVar2.m(f10.i("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), cVar2);
        String i15 = f10.i("List");
        C6769e eVar2 = C6769e.INT;
        String e16 = eVar2.e();
        C6496s.g(e16, "getDesc(...)");
        String str = com.amazon.a.a.o.b.au;
        a.C0963a a21 = aVar2.m(i15, "indexOf", "Ljava/lang/Object;", e16);
        c cVar3 = c.INDEX;
        Pair a22 = C6502A.a(a21, cVar3);
        String i16 = f10.i("List");
        String e17 = eVar2.e();
        C6496s.g(e17, "getDesc(...)");
        Map l10 = O.l(a12, a13, a14, a15, a16, a17, a19, a20, a22, C6502A.a(aVar2.m(i16, "lastIndexOf", "Ljava/lang/Object;", e17), cVar3));
        f66331e = l10;
        LinkedHashMap linkedHashMap = new LinkedHashMap(O.e(l10.size()));
        for (Map.Entry entry : l10.entrySet()) {
            linkedHashMap.put(((a.C0963a) entry.getKey()).d(), entry.getValue());
        }
        f66332f = linkedHashMap;
        Iterable<a.C0963a> n10 = Y.n(f66331e.keySet(), f66328b);
        ArrayList arrayList4 = new ArrayList(C6565s.y(n10, 10));
        for (a.C0963a c11 : n10) {
            arrayList4.add(c11.c());
        }
        f66333g = C6565s.j1(arrayList4);
        ArrayList arrayList5 = new ArrayList(C6565s.y(n10, 10));
        for (a.C0963a d11 : n10) {
            arrayList5.add(d11.d());
        }
        f66334h = C6565s.j1(arrayList5);
        a aVar3 = f66327a;
        C6769e eVar3 = C6769e.INT;
        String e18 = eVar3.e();
        C6496s.g(e18, "getDesc(...)");
        a.C0963a a23 = aVar3.m("java/util/List", "removeAt", e18, "Ljava/lang/Object;");
        f66335i = a23;
        C5946F f11 = C5946F.f67716a;
        String h10 = f11.h("Number");
        String e19 = C6769e.BYTE.e();
        C6496s.g(e19, "getDesc(...)");
        Pair a24 = C6502A.a(aVar3.m(h10, "toByte", "", e19), f.i("byteValue"));
        String h11 = f11.h("Number");
        String e20 = C6769e.SHORT.e();
        C6496s.g(e20, "getDesc(...)");
        Pair a25 = C6502A.a(aVar3.m(h11, "toShort", "", e20), f.i("shortValue"));
        String h12 = f11.h("Number");
        String e21 = eVar3.e();
        C6496s.g(e21, "getDesc(...)");
        Pair a26 = C6502A.a(aVar3.m(h12, "toInt", "", e21), f.i("intValue"));
        String h13 = f11.h("Number");
        String e22 = C6769e.LONG.e();
        C6496s.g(e22, "getDesc(...)");
        Pair a27 = C6502A.a(aVar3.m(h13, "toLong", "", e22), f.i("longValue"));
        String h14 = f11.h("Number");
        String e23 = C6769e.FLOAT.e();
        C6496s.g(e23, "getDesc(...)");
        Pair a28 = C6502A.a(aVar3.m(h14, "toFloat", "", e23), f.i("floatValue"));
        String h15 = f11.h("Number");
        String e24 = C6769e.DOUBLE.e();
        C6496s.g(e24, "getDesc(...)");
        Pair a29 = C6502A.a(aVar3.m(h15, "toDouble", "", e24), f.i("doubleValue"));
        Pair a30 = C6502A.a(a23, f.i("remove"));
        String h16 = f11.h("CharSequence");
        String e25 = eVar3.e();
        C6496s.g(e25, "getDesc(...)");
        String e26 = C6769e.CHAR.e();
        C6496s.g(e26, "getDesc(...)");
        Map l11 = O.l(a24, a25, a26, a27, a28, a29, a30, C6502A.a(aVar3.m(h16, str, e25, e26), f.i("charAt")));
        f66336j = l11;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(O.e(l11.size()));
        for (Map.Entry entry2 : l11.entrySet()) {
            linkedHashMap2.put(((a.C0963a) entry2.getKey()).d(), entry2.getValue());
        }
        f66337k = linkedHashMap2;
        Map map = f66336j;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            linkedHashSet.add(a.C0963a.b((a.C0963a) entry3.getKey(), (String) null, (f) entry3.getValue(), (String) null, (String) null, 13, (Object) null).d());
        }
        f66338l = linkedHashSet;
        HashSet hashSet = new HashSet();
        for (a.C0963a c12 : f66336j.keySet()) {
            hashSet.add(c12.c());
        }
        f66339m = hashSet;
        Iterable<Map.Entry> entrySet = f66336j.entrySet();
        ArrayList<Pair> arrayList6 = new ArrayList<>(C6565s.y(entrySet, 10));
        for (Map.Entry entry4 : entrySet) {
            arrayList6.add(new Pair(((a.C0963a) entry4.getKey()).c(), entry4.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(m.d(O.e(C6565s.y(arrayList6, 10)), 16));
        for (Pair pair : arrayList6) {
            linkedHashMap3.put((f) pair.d(), (f) pair.c());
        }
        f66340n = linkedHashMap3;
    }
}
