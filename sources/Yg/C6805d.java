package yg;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import yf.C6798l;

/* renamed from: yg.d  reason: case insensitive filesystem */
public final class C6805d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f73908c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static int f73909d = 1;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f73910e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f73911f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int f73912g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final int f73913h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final int f73914i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final int f73915j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final int f73916k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final int f73917l;

    /* renamed from: m  reason: collision with root package name */
    private static final int f73918m;

    /* renamed from: n  reason: collision with root package name */
    private static final int f73919n;

    /* renamed from: o  reason: collision with root package name */
    public static final C6805d f73920o;

    /* renamed from: p  reason: collision with root package name */
    public static final C6805d f73921p;

    /* renamed from: q  reason: collision with root package name */
    public static final C6805d f73922q;

    /* renamed from: r  reason: collision with root package name */
    public static final C6805d f73923r;

    /* renamed from: s  reason: collision with root package name */
    public static final C6805d f73924s;

    /* renamed from: t  reason: collision with root package name */
    public static final C6805d f73925t;

    /* renamed from: u  reason: collision with root package name */
    public static final C6805d f73926u;

    /* renamed from: v  reason: collision with root package name */
    public static final C6805d f73927v;

    /* renamed from: w  reason: collision with root package name */
    public static final C6805d f73928w;

    /* renamed from: x  reason: collision with root package name */
    public static final C6805d f73929x;

    /* renamed from: y  reason: collision with root package name */
    private static final List f73930y;

    /* renamed from: z  reason: collision with root package name */
    private static final List f73931z;

    /* renamed from: a  reason: collision with root package name */
    private final List f73932a;

    /* renamed from: b  reason: collision with root package name */
    private final int f73933b;

    /* renamed from: yg.d$a */
    public static final class a {

        /* renamed from: yg.d$a$a  reason: collision with other inner class name */
        private static final class C1077a {

            /* renamed from: a  reason: collision with root package name */
            private final int f73934a;

            /* renamed from: b  reason: collision with root package name */
            private final String f73935b;

            public C1077a(int i10, String str) {
                C6496s.h(str, "name");
                this.f73934a = i10;
                this.f73935b = str;
            }

            public final int a() {
                return this.f73934a;
            }

            public final String b() {
                return this.f73935b;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final int j() {
            int f10 = C6805d.f73909d;
            C6805d.f73909d = C6805d.f73909d << 1;
            return f10;
        }

        public final int b() {
            return C6805d.f73916k;
        }

        public final int c() {
            return C6805d.f73917l;
        }

        public final int d() {
            return C6805d.f73914i;
        }

        public final int e() {
            return C6805d.f73910e;
        }

        public final int f() {
            return C6805d.f73913h;
        }

        public final int g() {
            return C6805d.f73911f;
        }

        public final int h() {
            return C6805d.f73912g;
        }

        public final int i() {
            return C6805d.f73915j;
        }

        private a() {
        }
    }

    static {
        a.C1077a aVar;
        C6805d dVar;
        a.C1077a aVar2;
        a aVar3 = new a((DefaultConstructorMarker) null);
        f73908c = aVar3;
        int a10 = aVar3.j();
        f73910e = a10;
        int a11 = aVar3.j();
        f73911f = a11;
        int a12 = aVar3.j();
        f73912g = a12;
        int a13 = aVar3.j();
        f73913h = a13;
        int a14 = aVar3.j();
        f73914i = a14;
        int a15 = aVar3.j();
        f73915j = a15;
        int a16 = aVar3.j() - 1;
        f73916k = a16;
        int i10 = a10 | a11 | a12;
        f73917l = i10;
        int i11 = a11 | a14 | a15;
        f73918m = i11;
        int i12 = a14 | a15;
        f73919n = i12;
        f73920o = new C6805d(a16, (List) null, 2, (DefaultConstructorMarker) null);
        f73921p = new C6805d(i12, (List) null, 2, (DefaultConstructorMarker) null);
        f73922q = new C6805d(a10, (List) null, 2, (DefaultConstructorMarker) null);
        f73923r = new C6805d(a11, (List) null, 2, (DefaultConstructorMarker) null);
        f73924s = new C6805d(a12, (List) null, 2, (DefaultConstructorMarker) null);
        f73925t = new C6805d(i10, (List) null, 2, (DefaultConstructorMarker) null);
        f73926u = new C6805d(a13, (List) null, 2, (DefaultConstructorMarker) null);
        f73927v = new C6805d(a14, (List) null, 2, (DefaultConstructorMarker) null);
        f73928w = new C6805d(a15, (List) null, 2, (DefaultConstructorMarker) null);
        f73929x = new C6805d(i11, (List) null, 2, (DefaultConstructorMarker) null);
        Class<C6805d> cls = C6805d.class;
        Field[] fields = cls.getFields();
        C6496s.g(fields, "getFields(...)");
        ArrayList<Field> arrayList = new ArrayList<>();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get((Object) null);
            if (obj instanceof C6805d) {
                dVar = (C6805d) obj;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                int i13 = dVar.f73933b;
                String name = field2.getName();
                C6496s.g(name, "getName(...)");
                aVar2 = new a.C1077a(i13, name);
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                arrayList2.add(aVar2);
            }
        }
        f73930y = arrayList2;
        Field[] fields2 = cls.getFields();
        C6496s.g(fields2, "getFields(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList<>();
        for (Object next : arrayList3) {
            if (C6496s.c(((Field) next).getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj2 = field4.get((Object) null);
            C6496s.f(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj2).intValue();
            if (intValue == ((-intValue) & intValue)) {
                String name2 = field4.getName();
                C6496s.g(name2, "getName(...)");
                aVar = new a.C1077a(intValue, name2);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                arrayList5.add(aVar);
            }
        }
        f73931z = arrayList5;
    }

    public C6805d(int i10, List list) {
        C6496s.h(list, "excludes");
        this.f73932a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i10 &= ~((C6804c) it.next()).a();
        }
        this.f73933b = i10;
    }

    public final boolean a(int i10) {
        if ((i10 & this.f73933b) != 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C6496s.c(C6805d.class, cls)) {
            return false;
        }
        C6496s.f(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        C6805d dVar = (C6805d) obj;
        if (C6496s.c(this.f73932a, dVar.f73932a) && this.f73933b == dVar.f73933b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f73932a.hashCode() * 31) + this.f73933b;
    }

    public final List l() {
        return this.f73932a;
    }

    public final int m() {
        return this.f73933b;
    }

    public final C6805d n(int i10) {
        int i11 = i10 & this.f73933b;
        if (i11 == 0) {
            return null;
        }
        return new C6805d(i11, this.f73932a);
    }

    public String toString() {
        Object obj;
        String str;
        String str2;
        Iterator it = f73930y.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((a.C1077a) obj).a() == this.f73933b) {
                break;
            }
        }
        a.C1077a aVar = (a.C1077a) obj;
        if (aVar != null) {
            str = aVar.b();
        } else {
            str = null;
        }
        if (str == null) {
            ArrayList arrayList = new ArrayList();
            for (a.C1077a aVar2 : f73931z) {
                if (a(aVar2.a())) {
                    str2 = aVar2.b();
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            str = C6565s.x0(arrayList, " | ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null);
        }
        return "DescriptorKindFilter(" + str + ", " + this.f73932a + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6805d(int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? C6565s.n() : list);
    }
}
