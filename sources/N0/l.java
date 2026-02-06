package N0;

import N0.d;
import Y.C1510r0;
import Y.o1;
import a0.C1538b;
import kotlin.jvm.internal.C6479a;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

public final class l implements d.a {

    /* renamed from: a  reason: collision with root package name */
    private final C1510r0 f4374a = u1.d(Boolean.FALSE, (o1) null, 2, (Object) null);

    /* synthetic */ class a extends C6479a implements C6798l {
        a(Object obj) {
            super(1, obj, C1538b.class, "add", "add(Ljava/lang/Object;)Z", 8);
        }

        public final void a(m mVar) {
            ((C1538b) this.receiver).b(mVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((m) obj);
            return C6514M.f71813a;
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f4375a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final Comparable invoke(m mVar) {
            return Integer.valueOf(mVar.b());
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final c f4376a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final Comparable invoke(m mVar) {
            return Integer.valueOf(mVar.d().f());
        }
    }

    private final void e(boolean z10) {
        this.f4374a.setValue(Boolean.valueOf(z10));
    }

    public void a() {
        e(true);
    }

    public void b() {
        e(false);
    }

    public final boolean c() {
        return ((Boolean) this.f4374a.getValue()).booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: N0.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(android.view.View r6, O0.p r7, qf.g r8, java.util.function.Consumer<android.view.ScrollCaptureTarget> r9) {
        /*
            r5 = this;
            a0.b r0 = new a0.b
            r1 = 16
            N0.m[] r1 = new N0.m[r1]
            r2 = 0
            r0.<init>(r1, r2)
            O0.n r7 = r7.a()
            N0.l$a r1 = new N0.l$a
            r1.<init>(r0)
            r3 = 2
            r4 = 0
            N0.n.e(r7, r2, r1, r3, r4)
            yf.l[] r7 = new yf.C6798l[r3]
            N0.l$b r1 = N0.l.b.f4375a
            r7[r2] = r1
            N0.l$c r1 = N0.l.c.f4376a
            r2 = 1
            r7[r2] = r1
            java.util.Comparator r7 = pf.C6632a.b(r7)
            r0.D(r7)
            boolean r7 = r0.s()
            if (r7 == 0) goto L_0x0031
            goto L_0x003c
        L_0x0031:
            int r7 = r0.q()
            int r7 = r7 - r2
            java.lang.Object[] r0 = r0.p()
            r4 = r0[r7]
        L_0x003c:
            N0.m r4 = (N0.m) r4
            if (r4 != 0) goto L_0x0041
            return
        L_0x0041:
            Ug.K r7 = Ug.L.a(r8)
            N0.d r8 = new N0.d
            O0.n r0 = r4.c()
            c1.p r1 = r4.d()
            r8.<init>(r0, r1, r7, r5)
            H0.s r7 = r4.a()
            q0.i r7 = H0.C1198t.b(r7)
            c1.p r0 = r4.d()
            long r0 = r0.j()
            c1.p r7 = c1.q.b(r7)
            android.graphics.Rect r7 = r0.Z1.a(r7)
            android.graphics.Point r2 = new android.graphics.Point
            int r3 = c1.n.j(r0)
            int r0 = c1.n.k(r0)
            r2.<init>(r3, r0)
            android.view.ScrollCaptureCallback r8 = N0.j.a(r8)
            android.view.ScrollCaptureTarget r6 = N0.i.a(r6, r7, r2, r8)
            c1.p r7 = r4.d()
            android.graphics.Rect r7 = r0.Z1.a(r7)
            r6.setScrollBounds(r7)
            r9.accept(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.l.d(android.view.View, O0.p, qf.g, java.util.function.Consumer):void");
    }
}
