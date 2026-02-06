package m3;

import Ef.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import m3.C2224x;
import m3.r;
import mf.C6558k;
import mf.C6565s;
import mf.L;

/* renamed from: m3.j  reason: case insensitive filesystem */
public final class C2211j {

    /* renamed from: a  reason: collision with root package name */
    private int f24029a;

    /* renamed from: b  reason: collision with root package name */
    private int f24030b;

    /* renamed from: c  reason: collision with root package name */
    private final C6558k f24031c = new C6558k();

    /* renamed from: d  reason: collision with root package name */
    private final C2223w f24032d = new C2223w();

    /* renamed from: e  reason: collision with root package name */
    private C2219s f24033e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f24034f;

    /* renamed from: m3.j$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24035a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                m3.t[] r0 = m3.C2220t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                m3.t r1 = m3.C2220t.PREPEND     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                m3.t r1 = m3.C2220t.APPEND     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                m3.t r1 = m3.C2220t.REFRESH     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f24035a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m3.C2211j.a.<clinit>():void");
        }
    }

    private final void c(C2224x.b bVar) {
        this.f24032d.b(bVar.k());
        this.f24033e = bVar.g();
        int i10 = a.f24035a[bVar.f().ordinal()];
        if (i10 == 1) {
            this.f24029a = bVar.j();
            Iterator it = m.p(bVar.h().size() - 1, 0).iterator();
            while (it.hasNext()) {
                this.f24031c.addFirst(bVar.h().get(((L) it).a()));
            }
        } else if (i10 == 2) {
            this.f24030b = bVar.i();
            this.f24031c.addAll(bVar.h());
        } else if (i10 == 3) {
            this.f24031c.clear();
            this.f24030b = bVar.i();
            this.f24029a = bVar.j();
            this.f24031c.addAll(bVar.h());
        }
    }

    private final void d(C2224x.c cVar) {
        this.f24032d.b(cVar.d());
        this.f24033e = cVar.c();
    }

    private final void e(C2224x.a aVar) {
        this.f24032d.c(aVar.c(), r.c.f24097b.b());
        int i10 = a.f24035a[aVar.c().ordinal()];
        int i11 = 0;
        if (i10 == 1) {
            this.f24029a = aVar.g();
            int f10 = aVar.f();
            while (i11 < f10) {
                this.f24031c.removeFirst();
                i11++;
            }
        } else if (i10 == 2) {
            this.f24030b = aVar.g();
            int f11 = aVar.f();
            while (i11 < f11) {
                this.f24031c.removeLast();
                i11++;
            }
        } else {
            throw new IllegalArgumentException("Page drop type must be prepend or append");
        }
    }

    private final void f(C2224x.d dVar) {
        if (dVar.e() != null) {
            this.f24032d.b(dVar.e());
        }
        if (dVar.d() != null) {
            this.f24033e = dVar.d();
        }
        this.f24031c.clear();
        this.f24030b = 0;
        this.f24029a = 0;
        this.f24031c.add(new W(0, dVar.c()));
    }

    public final void a(C2224x xVar) {
        C6496s.h(xVar, "event");
        this.f24034f = true;
        if (xVar instanceof C2224x.b) {
            c((C2224x.b) xVar);
        } else if (xVar instanceof C2224x.a) {
            e((C2224x.a) xVar);
        } else if (xVar instanceof C2224x.c) {
            d((C2224x.c) xVar);
        } else if (xVar instanceof C2224x.d) {
            f((C2224x.d) xVar);
        }
    }

    public final List b() {
        if (!this.f24034f) {
            return C6565s.n();
        }
        ArrayList arrayList = new ArrayList();
        C2219s d10 = this.f24032d.d();
        if (!this.f24031c.isEmpty()) {
            arrayList.add(C2224x.b.f24139g.c(C6565s.e1(this.f24031c), this.f24029a, this.f24030b, d10, this.f24033e));
        } else {
            arrayList.add(new C2224x.c(d10, this.f24033e));
        }
        return arrayList;
    }
}
