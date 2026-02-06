package Eb;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: Eb.c  reason: case insensitive filesystem */
public final class C4282c {

    /* renamed from: a  reason: collision with root package name */
    private final String f50693a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f50694b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f50695c;

    /* renamed from: d  reason: collision with root package name */
    private final int f50696d;

    /* renamed from: e  reason: collision with root package name */
    private final int f50697e;

    /* renamed from: f  reason: collision with root package name */
    private final g f50698f;

    /* renamed from: g  reason: collision with root package name */
    private final Set f50699g;

    public static b c(E e10) {
        return new b(e10, new E[0]);
    }

    public static b d(E e10, E... eArr) {
        return new b(e10, eArr);
    }

    public static b e(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static b f(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    public static C4282c l(Object obj, Class cls) {
        return m(cls).f(new C4280a(obj)).d();
    }

    public static b m(Class cls) {
        return e(cls).g();
    }

    public static C4282c s(Object obj, Class cls, Class... clsArr) {
        return f(cls, clsArr).f(new C4281b(obj)).d();
    }

    public Set g() {
        return this.f50695c;
    }

    public g h() {
        return this.f50698f;
    }

    public String i() {
        return this.f50693a;
    }

    public Set j() {
        return this.f50694b;
    }

    public Set k() {
        return this.f50699g;
    }

    public boolean n() {
        if (this.f50696d == 1) {
            return true;
        }
        return false;
    }

    public boolean o() {
        if (this.f50696d == 2) {
            return true;
        }
        return false;
    }

    public boolean p() {
        if (this.f50697e == 0) {
            return true;
        }
        return false;
    }

    public C4282c t(g gVar) {
        return new C4282c(this.f50693a, this.f50694b, this.f50695c, this.f50696d, this.f50697e, gVar, this.f50699g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f50694b.toArray()) + ">{" + this.f50696d + ", type=" + this.f50697e + ", deps=" + Arrays.toString(this.f50695c.toArray()) + "}";
    }

    /* renamed from: Eb.c$b */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private String f50700a;

        /* renamed from: b  reason: collision with root package name */
        private final Set f50701b;

        /* renamed from: c  reason: collision with root package name */
        private final Set f50702c;

        /* renamed from: d  reason: collision with root package name */
        private int f50703d;

        /* renamed from: e  reason: collision with root package name */
        private int f50704e;

        /* renamed from: f  reason: collision with root package name */
        private g f50705f;

        /* renamed from: g  reason: collision with root package name */
        private final Set f50706g;

        /* access modifiers changed from: private */
        public b g() {
            this.f50704e = 1;
            return this;
        }

        private b i(int i10) {
            boolean z10;
            if (this.f50703d == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            D.d(z10, "Instantiation type has already been set.");
            this.f50703d = i10;
            return this;
        }

        private void j(E e10) {
            D.a(!this.f50701b.contains(e10), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b b(q qVar) {
            D.c(qVar, "Null dependency");
            j(qVar.c());
            this.f50702c.add(qVar);
            return this;
        }

        public b c() {
            return i(1);
        }

        public C4282c d() {
            boolean z10;
            if (this.f50705f != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            D.d(z10, "Missing required property: factory.");
            return new C4282c(this.f50700a, new HashSet(this.f50701b), new HashSet(this.f50702c), this.f50703d, this.f50704e, this.f50705f, this.f50706g);
        }

        public b e() {
            return i(2);
        }

        public b f(g gVar) {
            this.f50705f = (g) D.c(gVar, "Null factory");
            return this;
        }

        public b h(String str) {
            this.f50700a = str;
            return this;
        }

        private b(Class cls, Class... clsArr) {
            this.f50700a = null;
            HashSet hashSet = new HashSet();
            this.f50701b = hashSet;
            this.f50702c = new HashSet();
            this.f50703d = 0;
            this.f50704e = 0;
            this.f50706g = new HashSet();
            D.c(cls, "Null interface");
            hashSet.add(E.b(cls));
            for (Class cls2 : clsArr) {
                D.c(cls2, "Null interface");
                this.f50701b.add(E.b(cls2));
            }
        }

        private b(E e10, E... eArr) {
            this.f50700a = null;
            HashSet hashSet = new HashSet();
            this.f50701b = hashSet;
            this.f50702c = new HashSet();
            this.f50703d = 0;
            this.f50704e = 0;
            this.f50706g = new HashSet();
            D.c(e10, "Null interface");
            hashSet.add(e10);
            for (E c10 : eArr) {
                D.c(c10, "Null interface");
            }
            Collections.addAll(this.f50701b, eArr);
        }
    }

    private C4282c(String str, Set set, Set set2, int i10, int i11, g gVar, Set set3) {
        this.f50693a = str;
        this.f50694b = Collections.unmodifiableSet(set);
        this.f50695c = Collections.unmodifiableSet(set2);
        this.f50696d = i10;
        this.f50697e = i11;
        this.f50698f = gVar;
        this.f50699g = Collections.unmodifiableSet(set3);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object q(Object obj, C4283d dVar) {
        return obj;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object r(Object obj, C4283d dVar) {
        return obj;
    }
}
