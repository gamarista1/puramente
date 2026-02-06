package P;

import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6798l;

final class E implements x {

    /* renamed from: f  reason: collision with root package name */
    public static final a f4764f = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f4765a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4766b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4767c;

    /* renamed from: d  reason: collision with root package name */
    private final C1295k f4768d;

    /* renamed from: e  reason: collision with root package name */
    private final C1294j f4769e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public E(boolean z10, int i10, int i11, C1295k kVar, C1294j jVar) {
        this.f4765a = z10;
        this.f4766b = i10;
        this.f4767c = i11;
        this.f4768d = kVar;
        this.f4769e = jVar;
    }

    public boolean a() {
        return this.f4765a;
    }

    public C1294j b() {
        return this.f4769e;
    }

    public C1294j c() {
        return this.f4769e;
    }

    public int d() {
        return this.f4767c;
    }

    public C1289e e() {
        if (k() < d()) {
            return C1289e.NOT_CROSSED;
        }
        if (k() > d()) {
            return C1289e.CROSSED;
        }
        return this.f4769e.d();
    }

    public boolean f(x xVar) {
        if (!(h() == null || xVar == null || !(xVar instanceof E))) {
            E e10 = (E) xVar;
            if (k() == e10.k() && d() == e10.d() && a() == e10.a() && !this.f4769e.m(e10.f4769e)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public int getSize() {
        return 1;
    }

    public C1295k h() {
        return this.f4768d;
    }

    public C1294j i() {
        return this.f4769e;
    }

    public C1294j j() {
        return this.f4769e;
    }

    public int k() {
        return this.f4766b;
    }

    public String toString() {
        return "SingleSelectionLayout(isStartHandle=" + a() + ", crossed=" + e() + ", info=\n\t" + this.f4769e + ')';
    }

    public void g(C6798l lVar) {
    }
}
