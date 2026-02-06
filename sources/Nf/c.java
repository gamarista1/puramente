package Nf;

import Lf.d;
import Lf.l;
import Lf.o;
import Mf.f;
import Sg.p;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.b;
import ng.e;
import ng.h;
import ng.i;
import wg.C6769e;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f64255a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f64256b;

    /* renamed from: c  reason: collision with root package name */
    private static final String f64257c;

    /* renamed from: d  reason: collision with root package name */
    private static final String f64258d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f64259e;

    /* renamed from: f  reason: collision with root package name */
    private static final b f64260f;

    /* renamed from: g  reason: collision with root package name */
    private static final ng.c f64261g;

    /* renamed from: h  reason: collision with root package name */
    private static final b f64262h;

    /* renamed from: i  reason: collision with root package name */
    private static final b f64263i;

    /* renamed from: j  reason: collision with root package name */
    private static final b f64264j;

    /* renamed from: k  reason: collision with root package name */
    private static final HashMap f64265k = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    private static final HashMap f64266l = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    private static final HashMap f64267m = new HashMap();

    /* renamed from: n  reason: collision with root package name */
    private static final HashMap f64268n = new HashMap();

    /* renamed from: o  reason: collision with root package name */
    private static final HashMap f64269o = new HashMap();

    /* renamed from: p  reason: collision with root package name */
    private static final HashMap f64270p = new HashMap();

    /* renamed from: q  reason: collision with root package name */
    private static final List f64271q;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final b f64272a;

        /* renamed from: b  reason: collision with root package name */
        private final b f64273b;

        /* renamed from: c  reason: collision with root package name */
        private final b f64274c;

        public a(b bVar, b bVar2, b bVar3) {
            C6496s.h(bVar, "javaClass");
            C6496s.h(bVar2, "kotlinReadOnly");
            C6496s.h(bVar3, "kotlinMutable");
            this.f64272a = bVar;
            this.f64273b = bVar2;
            this.f64274c = bVar3;
        }

        public final b a() {
            return this.f64272a;
        }

        public final b b() {
            return this.f64273b;
        }

        public final b c() {
            return this.f64274c;
        }

        public final b d() {
            return this.f64272a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (C6496s.c(this.f64272a, aVar.f64272a) && C6496s.c(this.f64273b, aVar.f64273b) && C6496s.c(this.f64274c, aVar.f64274c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f64272a.hashCode() * 31) + this.f64273b.hashCode()) * 31) + this.f64274c.hashCode();
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f64272a + ", kotlinReadOnly=" + this.f64273b + ", kotlinMutable=" + this.f64274c + ')';
        }
    }

    static {
        c cVar = new c();
        f64255a = cVar;
        StringBuilder sb2 = new StringBuilder();
        f.a aVar = f.a.f64123e;
        sb2.append(aVar.b());
        sb2.append('.');
        sb2.append(aVar.a());
        f64256b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        f.b bVar = f.b.f64124e;
        sb3.append(bVar.b());
        sb3.append('.');
        sb3.append(bVar.a());
        f64257c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        f.d dVar = f.d.f64126e;
        sb4.append(dVar.b());
        sb4.append('.');
        sb4.append(dVar.a());
        f64258d = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        f.c cVar2 = f.c.f64125e;
        sb5.append(cVar2.b());
        sb5.append('.');
        sb5.append(cVar2.a());
        f64259e = sb5.toString();
        b.a aVar2 = b.f72283d;
        b c10 = aVar2.c(new ng.c("kotlin.jvm.functions.FunctionN"));
        f64260f = c10;
        f64261g = c10.a();
        i iVar = i.f72359a;
        f64262h = iVar.k();
        f64263i = iVar.j();
        f64264j = cVar.g(Class.class);
        b c11 = aVar2.c(o.a.f63991W);
        a aVar3 = new a(cVar.g(Iterable.class), c11, new b(c11.f(), e.g(o.a.f64004e0, c11.f()), false));
        b c12 = aVar2.c(o.a.f63990V);
        a aVar4 = new a(cVar.g(Iterator.class), c12, new b(c12.f(), e.g(o.a.f64002d0, c12.f()), false));
        b c13 = aVar2.c(o.a.f63992X);
        a aVar5 = new a(cVar.g(Collection.class), c13, new b(c13.f(), e.g(o.a.f64006f0, c13.f()), false));
        b c14 = aVar2.c(o.a.f63993Y);
        a aVar6 = new a(cVar.g(List.class), c14, new b(c14.f(), e.g(o.a.f64008g0, c14.f()), false));
        b c15 = aVar2.c(o.a.f63996a0);
        a aVar7 = new a(cVar.g(Set.class), c15, new b(c15.f(), e.g(o.a.f64012i0, c15.f()), false));
        b c16 = aVar2.c(o.a.f63994Z);
        a aVar8 = new a(cVar.g(ListIterator.class), c16, new b(c16.f(), e.g(o.a.f64010h0, c16.f()), false));
        ng.c cVar3 = o.a.f63998b0;
        b c17 = aVar2.c(cVar3);
        a aVar9 = new a(cVar.g(Map.class), c17, new b(c17.f(), e.g(o.a.f64014j0, c17.f()), false));
        b c18 = aVar2.c(cVar3);
        ng.f g10 = o.a.f64000c0.g();
        C6496s.g(g10, "shortName(...)");
        b d10 = c18.d(g10);
        List<a> q10 = C6565s.q(aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, new a(cVar.g(Map.Entry.class), d10, new b(d10.f(), e.g(o.a.f64016k0, d10.f()), false)));
        f64271q = q10;
        cVar.f(Object.class, o.a.f63997b);
        cVar.f(String.class, o.a.f64009h);
        cVar.f(CharSequence.class, o.a.f64007g);
        cVar.e(Throwable.class, o.a.f64035u);
        cVar.f(Cloneable.class, o.a.f64001d);
        cVar.f(Number.class, o.a.f64029r);
        cVar.e(Comparable.class, o.a.f64037v);
        cVar.f(Enum.class, o.a.f64031s);
        cVar.e(Annotation.class, o.a.f63966G);
        for (a d11 : q10) {
            f64255a.d(d11);
        }
        for (C6769e eVar : C6769e.values()) {
            c cVar4 = f64255a;
            b.a aVar10 = b.f72283d;
            ng.c j10 = eVar.j();
            C6496s.g(j10, "getWrapperFqName(...)");
            b c19 = aVar10.c(j10);
            l i10 = eVar.i();
            C6496s.g(i10, "getPrimitiveType(...)");
            cVar4.a(c19, aVar10.c(o.c(i10)));
        }
        for (b bVar2 : d.f63868a.a()) {
            f64255a.a(b.f72283d.c(new ng.c("kotlin.jvm.internal." + bVar2.h().b() + "CompanionObject")), bVar2.d(h.f72306d));
        }
        for (int i11 = 0; i11 < 23; i11++) {
            c cVar5 = f64255a;
            cVar5.a(b.f72283d.c(new ng.c("kotlin.jvm.functions.Function" + i11)), o.a(i11));
            cVar5.c(new ng.c(f64257c + i11), f64262h);
        }
        for (int i12 = 0; i12 < 22; i12++) {
            f.c cVar6 = f.c.f64125e;
            f64255a.c(new ng.c((cVar6.b() + '.' + cVar6.a()) + i12), f64262h);
        }
        c cVar7 = f64255a;
        ng.c l10 = o.a.f63999c.l();
        C6496s.g(l10, "toSafe(...)");
        cVar7.c(l10, cVar7.g(Void.class));
    }

    private c() {
    }

    private final void a(b bVar, b bVar2) {
        b(bVar, bVar2);
        c(bVar2.a(), bVar);
    }

    private final void b(b bVar, b bVar2) {
        f64265k.put(bVar.a().j(), bVar2);
    }

    private final void c(ng.c cVar, b bVar) {
        f64266l.put(cVar.j(), bVar);
    }

    private final void d(a aVar) {
        b a10 = aVar.a();
        b b10 = aVar.b();
        b c10 = aVar.c();
        a(a10, b10);
        c(c10.a(), a10);
        f64269o.put(c10, b10);
        f64270p.put(b10, c10);
        ng.c a11 = b10.a();
        ng.c a12 = c10.a();
        f64267m.put(c10.a().j(), a11);
        f64268n.put(a11.j(), a12);
    }

    private final void e(Class cls, ng.c cVar) {
        a(g(cls), b.f72283d.c(cVar));
    }

    private final void f(Class cls, ng.d dVar) {
        ng.c l10 = dVar.l();
        C6496s.g(l10, "toSafe(...)");
        e(cls, l10);
    }

    private final b g(Class cls) {
        if (!cls.isPrimitive()) {
            boolean isArray = cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            return b.f72283d.c(new ng.c(cls.getCanonicalName()));
        }
        b g10 = g(declaringClass);
        ng.f i10 = ng.f.i(cls.getSimpleName());
        C6496s.g(i10, "identifier(...)");
        return g10.d(i10);
    }

    private final boolean j(ng.d dVar, String str) {
        Integer m10;
        String b10 = dVar.b();
        C6496s.g(b10, "asString(...)");
        if (!p.J(b10, str, false, 2, (Object) null)) {
            return false;
        }
        String substring = b10.substring(str.length());
        C6496s.g(substring, "substring(...)");
        if (p.M0(substring, '0', false, 2, (Object) null) || (m10 = p.m(substring)) == null || m10.intValue() < 23) {
            return false;
        }
        return true;
    }

    public final ng.c h() {
        return f64261g;
    }

    public final List i() {
        return f64271q;
    }

    public final boolean k(ng.d dVar) {
        return f64267m.containsKey(dVar);
    }

    public final boolean l(ng.d dVar) {
        return f64268n.containsKey(dVar);
    }

    public final b m(ng.c cVar) {
        C6496s.h(cVar, "fqName");
        return (b) f64265k.get(cVar.j());
    }

    public final b n(ng.d dVar) {
        C6496s.h(dVar, "kotlinFqName");
        if (j(dVar, f64256b)) {
            return f64260f;
        }
        if (j(dVar, f64258d)) {
            return f64260f;
        }
        if (j(dVar, f64257c)) {
            return f64262h;
        }
        if (j(dVar, f64259e)) {
            return f64262h;
        }
        return (b) f64266l.get(dVar);
    }

    public final ng.c o(ng.d dVar) {
        return (ng.c) f64267m.get(dVar);
    }

    public final ng.c p(ng.d dVar) {
        return (ng.c) f64268n.get(dVar);
    }
}
