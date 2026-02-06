package Mf;

import Mf.f;
import Sg.p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import ng.c;

public final class g {

    /* renamed from: c  reason: collision with root package name */
    public static final a f64127c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final g f64128d = new g(C6565s.q(f.a.f64123e, f.d.f64126e, f.b.f64124e, f.c.f64125e));

    /* renamed from: a  reason: collision with root package name */
    private final List f64129a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f64130b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            return g.f64128d;
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final f f64131a;

        /* renamed from: b  reason: collision with root package name */
        private final int f64132b;

        public b(f fVar, int i10) {
            C6496s.h(fVar, "kind");
            this.f64131a = fVar;
            this.f64132b = i10;
        }

        public final f a() {
            return this.f64131a;
        }

        public final int b() {
            return this.f64132b;
        }

        public final f c() {
            return this.f64131a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (C6496s.c(this.f64131a, bVar.f64131a) && this.f64132b == bVar.f64132b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f64131a.hashCode() * 31) + Integer.hashCode(this.f64132b);
        }

        public String toString() {
            return "KindWithArity(kind=" + this.f64131a + ", arity=" + this.f64132b + ')';
        }
    }

    public g(List list) {
        C6496s.h(list, "kinds");
        this.f64129a = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : list) {
            c b10 = ((f) next).b();
            Object obj = linkedHashMap.get(b10);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(b10, obj);
            }
            ((List) obj).add(next);
        }
        this.f64130b = linkedHashMap;
    }

    private final Integer d(String str) {
        if (str.length() == 0) {
            return null;
        }
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int charAt = str.charAt(i11) - '0';
            if (charAt < 0 || charAt >= 10) {
                return null;
            }
            i10 = (i10 * 10) + charAt;
        }
        return Integer.valueOf(i10);
    }

    public final f b(c cVar, String str) {
        C6496s.h(cVar, "packageFqName");
        C6496s.h(str, "className");
        b c10 = c(cVar, str);
        if (c10 != null) {
            return c10.c();
        }
        return null;
    }

    public final b c(c cVar, String str) {
        C6496s.h(cVar, "packageFqName");
        C6496s.h(str, "className");
        List<f> list = (List) this.f64130b.get(cVar);
        if (list == null) {
            return null;
        }
        for (f fVar : list) {
            if (p.J(str, fVar.a(), false, 2, (Object) null)) {
                String substring = str.substring(fVar.a().length());
                C6496s.g(substring, "substring(...)");
                Integer d10 = d(substring);
                if (d10 != null) {
                    return new b(fVar, d10.intValue());
                }
            }
        }
        return null;
    }
}
