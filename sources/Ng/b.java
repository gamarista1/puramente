package ng;

import Sg.p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f72283d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final c f72284a;

    /* renamed from: b  reason: collision with root package name */
    private final c f72285b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f72286c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ b b(a aVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(str, z10);
        }

        public final b a(String str, boolean z10) {
            String str2;
            String str3;
            C6496s.h(str, "string");
            int a02 = p.a0(str, '`', 0, false, 6, (Object) null);
            if (a02 == -1) {
                a02 = str.length();
            }
            int h02 = p.h0(str, "/", a02, false, 4, (Object) null);
            if (h02 == -1) {
                str2 = p.D(str, "`", "", false, 4, (Object) null);
                str3 = "";
            } else {
                String substring = str.substring(0, h02);
                C6496s.g(substring, "substring(...)");
                String C10 = p.C(substring, '/', '.', false, 4, (Object) null);
                String substring2 = str.substring(h02 + 1);
                C6496s.g(substring2, "substring(...)");
                str2 = p.D(substring2, "`", "", false, 4, (Object) null);
                str3 = C10;
            }
            return new b(new c(str3), new c(str2), z10);
        }

        public final b c(c cVar) {
            C6496s.h(cVar, "topLevelFqName");
            c e10 = cVar.e();
            C6496s.g(e10, "parent(...)");
            f g10 = cVar.g();
            C6496s.g(g10, "shortName(...)");
            return new b(e10, g10);
        }

        private a() {
        }
    }

    public b(c cVar, c cVar2, boolean z10) {
        C6496s.h(cVar, "packageFqName");
        C6496s.h(cVar2, "relativeClassName");
        this.f72284a = cVar;
        this.f72285b = cVar2;
        this.f72286c = z10;
        cVar2.d();
    }

    private static final String c(c cVar) {
        String b10 = cVar.b();
        C6496s.g(b10, "asString(...)");
        if (!p.N(b10, '/', false, 2, (Object) null)) {
            return b10;
        }
        return '`' + b10 + '`';
    }

    public static final b k(c cVar) {
        return f72283d.c(cVar);
    }

    public final c a() {
        if (this.f72284a.d()) {
            return this.f72285b;
        }
        return new c(this.f72284a.b() + '.' + this.f72285b.b());
    }

    public final String b() {
        if (this.f72284a.d()) {
            return c(this.f72285b);
        }
        StringBuilder sb2 = new StringBuilder();
        String b10 = this.f72284a.b();
        C6496s.g(b10, "asString(...)");
        sb2.append(p.C(b10, '.', '/', false, 4, (Object) null));
        sb2.append("/");
        sb2.append(c(this.f72285b));
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    public final b d(f fVar) {
        C6496s.h(fVar, "name");
        c cVar = this.f72284a;
        c c10 = this.f72285b.c(fVar);
        C6496s.g(c10, "child(...)");
        return new b(cVar, c10, this.f72286c);
    }

    public final b e() {
        c e10 = this.f72285b.e();
        C6496s.g(e10, "parent(...)");
        if (!e10.d()) {
            return new b(this.f72284a, e10, this.f72286c);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (C6496s.c(this.f72284a, bVar.f72284a) && C6496s.c(this.f72285b, bVar.f72285b) && this.f72286c == bVar.f72286c) {
            return true;
        }
        return false;
    }

    public final c f() {
        return this.f72284a;
    }

    public final c g() {
        return this.f72285b;
    }

    public final f h() {
        f g10 = this.f72285b.g();
        C6496s.g(g10, "shortName(...)");
        return g10;
    }

    public int hashCode() {
        return (((this.f72284a.hashCode() * 31) + this.f72285b.hashCode()) * 31) + Boolean.hashCode(this.f72286c);
    }

    public final boolean i() {
        return this.f72286c;
    }

    public final boolean j() {
        return !this.f72285b.e().d();
    }

    public String toString() {
        if (!this.f72284a.d()) {
            return b();
        }
        return '/' + b();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(ng.c r2, ng.f r3) {
        /*
            r1 = this;
            java.lang.String r0 = "packageFqName"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "topLevelName"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            ng.c r3 = ng.c.k(r3)
            java.lang.String r0 = "topLevel(...)"
            kotlin.jvm.internal.C6496s.g(r3, r0)
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ng.b.<init>(ng.c, ng.f):void");
    }
}
