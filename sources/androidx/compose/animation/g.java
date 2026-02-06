package androidx.compose.animation;

import Y.A1;
import Y.C1500m;
import Y.C1506p;
import Y.C1510r0;
import Y.o1;
import java.util.Map;
import k0.c;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6535s;
import r0.n2;
import v.C2724g;
import v.C2727j;
import v.C2729l;
import v.C2732o;
import v.C2736s;
import v.C2739v;
import v.C2743z;
import w.C2763G;
import w.C2795g0;
import w.C2798j;
import w.C2802n;
import w.G0;
import w.n0;
import w.o0;
import w.r0;
import w.t0;
import yf.C6787a;
import yf.C6798l;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private static final r0 f12308a = t0.a(C1612a.f12313a, b.f12314a);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final C2795g0 f12309b = C2798j.h(0.0f, 400.0f, (Object) null, 5, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final C2795g0 f12310c = C2798j.h(0.0f, 400.0f, c1.n.b(G0.c(c1.n.f19226b)), 1, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final C2795g0 f12311d = C2798j.h(0.0f, 400.0f, c1.r.b(G0.d(c1.r.f19235b)), 1, (Object) null);

    static final class A extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f12312a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        A(C6798l lVar) {
            super(1);
            this.f12312a = lVar;
        }

        public final long a(long j10) {
            return c1.o.a(0, ((Number) this.f12312a.invoke(Integer.valueOf(c1.r.f(j10)))).intValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return c1.n.b(a(((c1.r) obj).j()));
        }
    }

    /* renamed from: androidx.compose.animation.g$a  reason: case insensitive filesystem */
    static final class C1612a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final C1612a f12313a = new C1612a();

        C1612a() {
            super(1);
        }

        public final C2802n a(long j10) {
            return new C2802n(androidx.compose.ui.graphics.f.f(j10), androidx.compose.ui.graphics.f.g(j10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((androidx.compose.ui.graphics.f) obj).j());
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f12314a = new b();

        b() {
            super(1);
        }

        public final long a(C2802n nVar) {
            return n2.a(nVar.f(), nVar.g());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return androidx.compose.ui.graphics.f.b(a((C2802n) obj));
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f12315a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f12316b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(i iVar, k kVar) {
            super(1);
            this.f12315a = iVar;
            this.f12316b = kVar;
        }

        /* renamed from: a */
        public final C2763G invoke(n0.b bVar) {
            C2763G b10;
            C2763G b11;
            C2727j jVar = C2727j.PreEnter;
            C2727j jVar2 = C2727j.Visible;
            if (bVar.g(jVar, jVar2)) {
                C2729l c10 = this.f12315a.b().c();
                if (c10 == null || (b11 = c10.b()) == null) {
                    return g.f12309b;
                }
                return b11;
            } else if (!bVar.g(jVar2, C2727j.PostExit)) {
                return g.f12309b;
            } else {
                C2729l c11 = this.f12316b.b().c();
                if (c11 == null || (b10 = c11.b()) == null) {
                    return g.f12309b;
                }
                return b10;
            }
        }
    }

    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f12317a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f12318b;

        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f12319a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    v.j[] r0 = v.C2727j.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    v.j r1 = v.C2727j.Visible     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    v.j r1 = v.C2727j.PreEnter     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    v.j r1 = v.C2727j.PostExit     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f12319a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.g.d.a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(i iVar, k kVar) {
            super(1);
            this.f12317a = iVar;
            this.f12318b = kVar;
        }

        /* renamed from: a */
        public final Float invoke(C2727j jVar) {
            int i10 = a.f12319a[jVar.ordinal()];
            float f10 = 1.0f;
            if (i10 != 1) {
                if (i10 == 2) {
                    C2729l c10 = this.f12317a.b().c();
                    if (c10 != null) {
                        f10 = c10.a();
                    }
                } else if (i10 == 3) {
                    C2729l c11 = this.f12318b.b().c();
                    if (c11 != null) {
                        f10 = c11.a();
                    }
                } else {
                    throw new C6535s();
                }
            }
            return Float.valueOf(f10);
        }
    }

    static final class e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A1 f12320a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ A1 f12321b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1 f12322c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(A1 a12, A1 a13, A1 a14) {
            super(1);
            this.f12320a = a12;
            this.f12321b = a13;
            this.f12322c = a14;
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            float f10;
            float f11;
            long j10;
            A1 a12 = this.f12320a;
            float f12 = 1.0f;
            if (a12 != null) {
                f10 = ((Number) a12.getValue()).floatValue();
            } else {
                f10 = 1.0f;
            }
            cVar.c(f10);
            A1 a13 = this.f12321b;
            if (a13 != null) {
                f11 = ((Number) a13.getValue()).floatValue();
            } else {
                f11 = 1.0f;
            }
            cVar.h(f11);
            A1 a14 = this.f12321b;
            if (a14 != null) {
                f12 = ((Number) a14.getValue()).floatValue();
            }
            cVar.m(f12);
            A1 a15 = this.f12322c;
            if (a15 != null) {
                j10 = ((androidx.compose.ui.graphics.f) a15.getValue()).j();
            } else {
                j10 = androidx.compose.ui.graphics.f.f13431b.a();
            }
            cVar.F0(j10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.graphics.c) obj);
            return C6514M.f71813a;
        }
    }

    static final class f extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f12323a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f12324b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(i iVar, k kVar) {
            super(1);
            this.f12323a = iVar;
            this.f12324b = kVar;
        }

        /* renamed from: a */
        public final C2763G invoke(n0.b bVar) {
            C2763G a10;
            C2763G a11;
            C2727j jVar = C2727j.PreEnter;
            C2727j jVar2 = C2727j.Visible;
            if (bVar.g(jVar, jVar2)) {
                C2736s e10 = this.f12323a.b().e();
                if (e10 == null || (a11 = e10.a()) == null) {
                    return g.f12309b;
                }
                return a11;
            } else if (!bVar.g(jVar2, C2727j.PostExit)) {
                return g.f12309b;
            } else {
                C2736s e11 = this.f12324b.b().e();
                if (e11 == null || (a10 = e11.a()) == null) {
                    return g.f12309b;
                }
                return a10;
            }
        }
    }

    /* renamed from: androidx.compose.animation.g$g  reason: collision with other inner class name */
    static final class C0227g extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f12325a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f12326b;

        /* renamed from: androidx.compose.animation.g$g$a */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f12327a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    v.j[] r0 = v.C2727j.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    v.j r1 = v.C2727j.Visible     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    v.j r1 = v.C2727j.PreEnter     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    v.j r1 = v.C2727j.PostExit     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f12327a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.g.C0227g.a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0227g(i iVar, k kVar) {
            super(1);
            this.f12325a = iVar;
            this.f12326b = kVar;
        }

        /* renamed from: a */
        public final Float invoke(C2727j jVar) {
            int i10 = a.f12327a[jVar.ordinal()];
            float f10 = 1.0f;
            if (i10 != 1) {
                if (i10 == 2) {
                    C2736s e10 = this.f12325a.b().e();
                    if (e10 != null) {
                        f10 = e10.b();
                    }
                } else if (i10 == 3) {
                    C2736s e11 = this.f12326b.b().e();
                    if (e11 != null) {
                        f10 = e11.b();
                    }
                } else {
                    throw new C6535s();
                }
            }
            return Float.valueOf(f10);
        }
    }

    static final class h extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final h f12328a = new h();

        h() {
            super(1);
        }

        /* renamed from: a */
        public final C2763G invoke(n0.b bVar) {
            return C2798j.h(0.0f, 0.0f, (Object) null, 7, (Object) null);
        }
    }

    static final class i extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.f f12329a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f12330b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f12331c;

        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f12332a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    v.j[] r0 = v.C2727j.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    v.j r1 = v.C2727j.Visible     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    v.j r1 = v.C2727j.PreEnter     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    v.j r1 = v.C2727j.PostExit     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f12332a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.g.i.a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(androidx.compose.ui.graphics.f fVar, i iVar, k kVar) {
            super(1);
            this.f12329a = fVar;
            this.f12330b = iVar;
            this.f12331c = kVar;
        }

        public final long a(C2727j jVar) {
            androidx.compose.ui.graphics.f fVar;
            int i10 = a.f12332a[jVar.ordinal()];
            if (i10 != 1) {
                fVar = null;
                if (i10 == 2) {
                    C2736s e10 = this.f12330b.b().e();
                    if (!(e10 == null && (e10 = this.f12331c.b().e()) == null)) {
                        fVar = androidx.compose.ui.graphics.f.b(e10.c());
                    }
                } else if (i10 == 3) {
                    C2736s e11 = this.f12331c.b().e();
                    if (!(e11 == null && (e11 = this.f12330b.b().e()) == null)) {
                        fVar = androidx.compose.ui.graphics.f.b(e11.c());
                    }
                } else {
                    throw new C6535s();
                }
            } else {
                fVar = this.f12329a;
            }
            if (fVar != null) {
                return fVar.j();
            }
            return androidx.compose.ui.graphics.f.f13431b.a();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return androidx.compose.ui.graphics.f.b(a((C2727j) obj));
        }
    }

    static final class j extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final j f12333a = new j();

        j() {
            super(0);
        }

        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    static final class k extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f12334a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6787a f12335b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(boolean z10, C6787a aVar) {
            super(1);
            this.f12334a = z10;
            this.f12335b = aVar;
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            boolean z10;
            if (this.f12334a || !((Boolean) this.f12335b.invoke()).booleanValue()) {
                z10 = false;
            } else {
                z10 = true;
            }
            cVar.y(z10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.graphics.c) obj);
            return C6514M.f71813a;
        }
    }

    static final class l extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final l f12336a = new l();

        l() {
            super(1);
        }

        public final Integer a(int i10) {
            return 0;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class m extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f12337a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(C6798l lVar) {
            super(1);
            this.f12337a = lVar;
        }

        public final long a(long j10) {
            return c1.s.a(((Number) this.f12337a.invoke(Integer.valueOf(c1.r.g(j10)))).intValue(), c1.r.f(j10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return c1.r.b(a(((c1.r) obj).j()));
        }
    }

    static final class n extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final n f12338a = new n();

        n() {
            super(1);
        }

        public final long a(long j10) {
            return c1.s.a(0, 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return c1.r.b(a(((c1.r) obj).j()));
        }
    }

    static final class o extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final o f12339a = new o();

        o() {
            super(1);
        }

        public final Integer a(int i10) {
            return 0;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class p extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f12340a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(C6798l lVar) {
            super(1);
            this.f12340a = lVar;
        }

        public final long a(long j10) {
            return c1.s.a(c1.r.g(j10), ((Number) this.f12340a.invoke(Integer.valueOf(c1.r.f(j10)))).intValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return c1.r.b(a(((c1.r) obj).j()));
        }
    }

    static final class q extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final q f12341a = new q();

        q() {
            super(1);
        }

        public final Integer a(int i10) {
            return 0;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class r extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f12342a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(C6798l lVar) {
            super(1);
            this.f12342a = lVar;
        }

        public final long a(long j10) {
            return c1.s.a(((Number) this.f12342a.invoke(Integer.valueOf(c1.r.g(j10)))).intValue(), c1.r.f(j10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return c1.r.b(a(((c1.r) obj).j()));
        }
    }

    static final class s extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final s f12343a = new s();

        s() {
            super(1);
        }

        public final long a(long j10) {
            return c1.s.a(0, 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return c1.r.b(a(((c1.r) obj).j()));
        }
    }

    static final class t extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final t f12344a = new t();

        t() {
            super(1);
        }

        public final Integer a(int i10) {
            return 0;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class u extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f12345a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(C6798l lVar) {
            super(1);
            this.f12345a = lVar;
        }

        public final long a(long j10) {
            return c1.s.a(c1.r.g(j10), ((Number) this.f12345a.invoke(Integer.valueOf(c1.r.f(j10)))).intValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return c1.r.b(a(((c1.r) obj).j()));
        }
    }

    static final class v extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f12346a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(C6798l lVar) {
            super(1);
            this.f12346a = lVar;
        }

        public final long a(long j10) {
            return c1.o.a(((Number) this.f12346a.invoke(Integer.valueOf(c1.r.g(j10)))).intValue(), 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return c1.n.b(a(((c1.r) obj).j()));
        }
    }

    static final class w extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final w f12347a = new w();

        w() {
            super(1);
        }

        public final Integer a(int i10) {
            return Integer.valueOf((-i10) / 2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class x extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f12348a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(C6798l lVar) {
            super(1);
            this.f12348a = lVar;
        }

        public final long a(long j10) {
            return c1.o.a(0, ((Number) this.f12348a.invoke(Integer.valueOf(c1.r.f(j10)))).intValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return c1.n.b(a(((c1.r) obj).j()));
        }
    }

    static final class y extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f12349a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(C6798l lVar) {
            super(1);
            this.f12349a = lVar;
        }

        public final long a(long j10) {
            return c1.o.a(((Number) this.f12349a.invoke(Integer.valueOf(c1.r.g(j10)))).intValue(), 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return c1.n.b(a(((c1.r) obj).j()));
        }
    }

    static final class z extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final z f12350a = new z();

        z() {
            super(1);
        }

        public final Integer a(int i10) {
            return Integer.valueOf((-i10) / 2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final i A(C2763G g10, C6798l lVar) {
        return z(g10, new v(lVar));
    }

    public static final i B(C2763G g10, C6798l lVar) {
        return z(g10, new x(lVar));
    }

    public static /* synthetic */ i C(C2763G g10, C6798l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            g10 = C2798j.h(0.0f, 400.0f, c1.n.b(G0.c(c1.n.f19226b)), 1, (Object) null);
        }
        if ((i10 & 2) != 0) {
            lVar = w.f12347a;
        }
        return B(g10, lVar);
    }

    public static final k D(C2763G g10, C6798l lVar) {
        return new l(new C2743z((C2729l) null, new C2739v(lVar, g10), (C2724g) null, (C2736s) null, false, (Map) null, 61, (DefaultConstructorMarker) null));
    }

    public static final k E(C2763G g10, C6798l lVar) {
        return D(g10, new y(lVar));
    }

    public static final k F(C2763G g10, C6798l lVar) {
        return D(g10, new A(lVar));
    }

    public static /* synthetic */ k G(C2763G g10, C6798l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            g10 = C2798j.h(0.0f, 400.0f, c1.n.b(G0.c(c1.n.f19226b)), 1, (Object) null);
        }
        if ((i10 & 2) != 0) {
            lVar = z.f12350a;
        }
        return F(g10, lVar);
    }

    private static final k0.c H(c.b bVar) {
        c.a aVar = k0.c.f23044a;
        if (C6496s.c(bVar, aVar.k())) {
            return aVar.h();
        }
        if (C6496s.c(bVar, aVar.j())) {
            return aVar.f();
        }
        return aVar.e();
    }

    private static final k0.c I(c.C0368c cVar) {
        c.a aVar = k0.c.f23044a;
        if (C6496s.c(cVar, aVar.l())) {
            return aVar.m();
        }
        if (C6496s.c(cVar, aVar.a())) {
            return aVar.b();
        }
        return aVar.e();
    }

    public static final i J(n0 n0Var, i iVar, C1500m mVar, int i10) {
        boolean z10;
        if (C1506p.H()) {
            C1506p.Q(21614502, i10, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:910)");
        }
        if ((((i10 & 14) ^ 6) <= 4 || !mVar.S(n0Var)) && (i10 & 6) != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        Object A10 = mVar.A();
        if (z10 || A10 == C1500m.f10026a.a()) {
            A10 = u1.d(iVar, (o1) null, 2, (Object) null);
            mVar.r(A10);
        }
        C1510r0 r0Var = (C1510r0) A10;
        if (n0Var.i() == n0Var.p() && n0Var.i() == C2727j.Visible) {
            if (n0Var.u()) {
                L(r0Var, iVar);
            } else {
                L(r0Var, i.f12381a.a());
            }
        } else if (n0Var.p() == C2727j.Visible) {
            L(r0Var, K(r0Var).c(iVar));
        }
        i K10 = K(r0Var);
        if (C1506p.H()) {
            C1506p.P();
        }
        return K10;
    }

    private static final i K(C1510r0 r0Var) {
        return (i) r0Var.getValue();
    }

    private static final void L(C1510r0 r0Var, i iVar) {
        r0Var.setValue(iVar);
    }

    public static final k M(n0 n0Var, k kVar, C1500m mVar, int i10) {
        boolean z10;
        if (C1506p.H()) {
            C1506p.Q(-1363864804, i10, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:930)");
        }
        if ((((i10 & 14) ^ 6) <= 4 || !mVar.S(n0Var)) && (i10 & 6) != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        Object A10 = mVar.A();
        if (z10 || A10 == C1500m.f10026a.a()) {
            A10 = u1.d(kVar, (o1) null, 2, (Object) null);
            mVar.r(A10);
        }
        C1510r0 r0Var = (C1510r0) A10;
        if (n0Var.i() == n0Var.p() && n0Var.i() == C2727j.Visible) {
            if (n0Var.u()) {
                O(r0Var, kVar);
            } else {
                O(r0Var, k.f12384a.a());
            }
        } else if (n0Var.p() != C2727j.Visible) {
            O(r0Var, N(r0Var).c(kVar));
        }
        k N10 = N(r0Var);
        if (C1506p.H()) {
            C1506p.P();
        }
        return N10;
    }

    private static final k N(C1510r0 r0Var) {
        return (k) r0Var.getValue();
    }

    private static final void O(C1510r0 r0Var, k kVar) {
        r0Var.setValue(kVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: v.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: v.k} */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0119, code lost:
        if (r7.S(r21) == false) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0134, code lost:
        if (r7.S(r22) == false) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0153, code lost:
        if (r7.S(r20) == false) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0170, code lost:
        if (r4 == Y.C1500m.f10026a.a()) goto L_0x0172;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x018b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final v.C2732o e(w.n0 r20, androidx.compose.animation.i r21, androidx.compose.animation.k r22, java.lang.String r23, Y.C1500m r24, int r25) {
        /*
            r0 = r23
            r7 = r24
            r8 = r25
            boolean r1 = Y.C1506p.H()
            if (r1 == 0) goto L_0x0015
            r1 = -1
            java.lang.String r2 = "androidx.compose.animation.createGraphicsLayerBlock (EnterExitTransition.kt:958)"
            r3 = 642253525(0x264802d5, float:6.9392777E-16)
            Y.C1506p.Q(r3, r8, r1, r2)
        L_0x0015:
            v.z r1 = r21.b()
            v.l r1 = r1.c()
            r9 = 1
            r10 = 0
            if (r1 != 0) goto L_0x002e
            v.z r1 = r22.b()
            v.l r1 = r1.c()
            if (r1 == 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r1 = r10
            goto L_0x002f
        L_0x002e:
            r1 = r9
        L_0x002f:
            v.z r2 = r21.b()
            v.s r2 = r2.e()
            if (r2 != 0) goto L_0x0046
            v.z r2 = r22.b()
            v.s r2 = r2.e()
            if (r2 == 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r11 = r10
            goto L_0x0047
        L_0x0046:
            r11 = r9
        L_0x0047:
            r12 = 0
            if (r1 == 0) goto L_0x008b
            r1 = -675389204(0xffffffffd7be60ec, float:-4.18646971E14)
            r7.T(r1)
            kotlin.jvm.internal.l r1 = kotlin.jvm.internal.C6490l.f71789a
            w.r0 r2 = w.t0.f(r1)
            java.lang.Object r1 = r24.A()
            Y.m$a r3 = Y.C1500m.f10026a
            java.lang.Object r3 = r3.a()
            if (r1 != r3) goto L_0x0076
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r3 = " alpha"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r7.r(r1)
        L_0x0076:
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            r1 = r8 & 14
            r5 = r1 | 384(0x180, float:5.38E-43)
            r6 = 0
            r1 = r20
            r4 = r24
            w.n0$a r1 = w.o0.c(r1, r2, r3, r4, r5, r6)
            r24.M()
            r14 = r1
            goto L_0x0095
        L_0x008b:
            r1 = -675252433(0xffffffffd7c0772f, float:-4.23236244E14)
            r7.T(r1)
            r24.M()
            r14 = r12
        L_0x0095:
            if (r11 == 0) goto L_0x00d7
            r1 = -675193780(0xffffffffd7c15c4c, float:-4.25204312E14)
            r7.T(r1)
            kotlin.jvm.internal.l r1 = kotlin.jvm.internal.C6490l.f71789a
            w.r0 r1 = w.t0.f(r1)
            java.lang.Object r2 = r24.A()
            Y.m$a r3 = Y.C1500m.f10026a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x00c3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " scale"
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r7.r(r2)
        L_0x00c3:
            java.lang.String r2 = (java.lang.String) r2
            r0 = r8 & 14
            r4 = r0 | 384(0x180, float:5.38E-43)
            r5 = 0
            r0 = r20
            r3 = r24
            w.n0$a r0 = w.o0.c(r0, r1, r2, r3, r4, r5)
            r24.M()
            r15 = r0
            goto L_0x00e1
        L_0x00d7:
            r0 = -675057009(0xffffffffd7c3728f, float:-4.29793586E14)
            r7.T(r0)
            r24.M()
            r15 = r12
        L_0x00e1:
            if (r11 == 0) goto L_0x00fe
            r0 = -674987940(0xffffffffd7c4805c, float:-4.32111157E14)
            r7.T(r0)
            w.r0 r1 = f12308a
            r0 = r8 & 14
            r4 = r0 | 384(0x180, float:5.38E-43)
            r5 = 0
            java.lang.String r2 = "TransformOriginInterruptionHandling"
            r0 = r20
            r3 = r24
            w.n0$a r12 = w.o0.c(r0, r1, r2, r3, r4, r5)
            r24.M()
            goto L_0x0107
        L_0x00fe:
            r0 = -674835793(0xffffffffd7c6d2af, float:-4.37216363E14)
            r7.T(r0)
            r24.M()
        L_0x0107:
            boolean r0 = r7.C(r14)
            r1 = r8 & 112(0x70, float:1.57E-43)
            r1 = r1 ^ 48
            r2 = 32
            if (r1 <= r2) goto L_0x011c
            r1 = r21
            boolean r3 = r7.S(r1)
            if (r3 != 0) goto L_0x0122
            goto L_0x011e
        L_0x011c:
            r1 = r21
        L_0x011e:
            r3 = r8 & 48
            if (r3 != r2) goto L_0x0124
        L_0x0122:
            r2 = r9
            goto L_0x0125
        L_0x0124:
            r2 = r10
        L_0x0125:
            r0 = r0 | r2
            r2 = r8 & 896(0x380, float:1.256E-42)
            r2 = r2 ^ 384(0x180, float:5.38E-43)
            r3 = 256(0x100, float:3.59E-43)
            if (r2 <= r3) goto L_0x0137
            r2 = r22
            boolean r4 = r7.S(r2)
            if (r4 != 0) goto L_0x013d
            goto L_0x0139
        L_0x0137:
            r2 = r22
        L_0x0139:
            r4 = r8 & 384(0x180, float:5.38E-43)
            if (r4 != r3) goto L_0x013f
        L_0x013d:
            r3 = r9
            goto L_0x0140
        L_0x013f:
            r3 = r10
        L_0x0140:
            r0 = r0 | r3
            boolean r3 = r7.C(r15)
            r0 = r0 | r3
            r3 = r8 & 14
            r3 = r3 ^ 6
            r4 = 4
            if (r3 <= r4) goto L_0x0156
            r3 = r20
            boolean r5 = r7.S(r3)
            if (r5 != 0) goto L_0x015e
            goto L_0x0158
        L_0x0156:
            r3 = r20
        L_0x0158:
            r5 = r8 & 6
            if (r5 != r4) goto L_0x015d
            goto L_0x015e
        L_0x015d:
            r9 = r10
        L_0x015e:
            r0 = r0 | r9
            boolean r4 = r7.C(r12)
            r0 = r0 | r4
            java.lang.Object r4 = r24.A()
            if (r0 != 0) goto L_0x0172
            Y.m$a r0 = Y.C1500m.f10026a
            java.lang.Object r0 = r0.a()
            if (r4 != r0) goto L_0x0183
        L_0x0172:
            v.k r4 = new v.k
            r13 = r4
            r16 = r20
            r17 = r21
            r18 = r22
            r19 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r7.r(r4)
        L_0x0183:
            v.o r4 = (v.C2732o) r4
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x018e
            Y.C1506p.P()
        L_0x018e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.g.e(w.n0, androidx.compose.animation.i, androidx.compose.animation.k, java.lang.String, Y.m, int):v.o");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final yf.C6798l f(w.n0.a r3, w.n0.a r4, w.n0 r5, androidx.compose.animation.i r6, androidx.compose.animation.k r7, w.n0.a r8) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0012
            androidx.compose.animation.g$c r1 = new androidx.compose.animation.g$c
            r1.<init>(r6, r7)
            androidx.compose.animation.g$d r2 = new androidx.compose.animation.g$d
            r2.<init>(r6, r7)
            Y.A1 r3 = r3.a(r1, r2)
            goto L_0x0013
        L_0x0012:
            r3 = r0
        L_0x0013:
            if (r4 == 0) goto L_0x0024
            androidx.compose.animation.g$f r1 = new androidx.compose.animation.g$f
            r1.<init>(r6, r7)
            androidx.compose.animation.g$g r2 = new androidx.compose.animation.g$g
            r2.<init>(r6, r7)
            Y.A1 r4 = r4.a(r1, r2)
            goto L_0x0025
        L_0x0024:
            r4 = r0
        L_0x0025:
            java.lang.Object r5 = r5.i()
            v.j r1 = v.C2727j.PreEnter
            if (r5 != r1) goto L_0x004d
            v.z r5 = r6.b()
            v.s r5 = r5.e()
            if (r5 == 0) goto L_0x0040
        L_0x0037:
            long r1 = r5.c()
            androidx.compose.ui.graphics.f r5 = androidx.compose.ui.graphics.f.b(r1)
            goto L_0x006b
        L_0x0040:
            v.z r5 = r7.b()
            v.s r5 = r5.e()
            if (r5 == 0) goto L_0x004b
            goto L_0x0037
        L_0x004b:
            r5 = r0
            goto L_0x006b
        L_0x004d:
            v.z r5 = r7.b()
            v.s r5 = r5.e()
            if (r5 == 0) goto L_0x0060
        L_0x0057:
            long r1 = r5.c()
            androidx.compose.ui.graphics.f r5 = androidx.compose.ui.graphics.f.b(r1)
            goto L_0x006b
        L_0x0060:
            v.z r5 = r6.b()
            v.s r5 = r5.e()
            if (r5 == 0) goto L_0x004b
            goto L_0x0057
        L_0x006b:
            if (r8 == 0) goto L_0x0078
            androidx.compose.animation.g$h r0 = androidx.compose.animation.g.h.f12328a
            androidx.compose.animation.g$i r1 = new androidx.compose.animation.g$i
            r1.<init>(r5, r6, r7)
            Y.A1 r0 = r8.a(r0, r1)
        L_0x0078:
            androidx.compose.animation.g$e r5 = new androidx.compose.animation.g$e
            r5.<init>(r3, r4, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.g.f(w.n0$a, w.n0$a, w.n0, androidx.compose.animation.i, androidx.compose.animation.k, w.n0$a):yf.l");
    }

    public static final k0.i g(n0 n0Var, i iVar, k kVar, C6787a aVar, String str, C1500m mVar, int i10, int i11) {
        j jVar;
        boolean z10;
        boolean z11;
        n0.a aVar2;
        n0.a aVar3;
        boolean z12;
        C2724g a10;
        n0 n0Var2 = n0Var;
        String str2 = str;
        C1500m mVar2 = mVar;
        int i12 = i10;
        if ((i11 & 4) != 0) {
            jVar = j.f12333a;
        } else {
            jVar = aVar;
        }
        if (C1506p.H()) {
            C1506p.Q(28261782, i12, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:869)");
        }
        int i13 = i12 & 14;
        i J10 = J(n0Var2, iVar, mVar2, i12 & 126);
        int i14 = i12 >> 3;
        k M10 = M(n0Var2, kVar, mVar2, (i14 & 112) | i13);
        boolean z13 = true;
        if (J10.b().f() == null && M10.b().f() == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (J10.b().a() == null && M10.b().a() == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        n0.a aVar4 = null;
        if (z10) {
            mVar2.T(-821375963);
            r0 d10 = t0.d(c1.n.f19226b);
            Object A10 = mVar.A();
            if (A10 == C1500m.f10026a.a()) {
                A10 = str2 + " slide";
                mVar2.r(A10);
            }
            n0.a c10 = o0.c(n0Var, d10, (String) A10, mVar, i13 | 384, 0);
            mVar.M();
            aVar2 = c10;
        } else {
            mVar2.T(-821278096);
            mVar.M();
            aVar2 = null;
        }
        if (z11) {
            mVar2.T(-821202177);
            r0 e10 = t0.e(c1.r.f19235b);
            Object A11 = mVar.A();
            if (A11 == C1500m.f10026a.a()) {
                A11 = str2 + " shrink/expand";
                mVar2.r(A11);
            }
            n0.a c11 = o0.c(n0Var, e10, (String) A11, mVar, i13 | 384, 0);
            mVar.M();
            aVar3 = c11;
        } else {
            mVar2.T(-821099041);
            mVar.M();
            aVar3 = null;
        }
        if (z11) {
            mVar2.T(-821034002);
            r0 d11 = t0.d(c1.n.f19226b);
            Object A12 = mVar.A();
            if (A12 == C1500m.f10026a.a()) {
                A12 = str2 + " InterruptionHandlingOffset";
                mVar2.r(A12);
            }
            n0.a c12 = o0.c(n0Var, d11, (String) A12, mVar, i13 | 384, 0);
            mVar.M();
            aVar4 = c12;
        } else {
            mVar2.T(-820883777);
            mVar.M();
        }
        C2724g a11 = J10.b().a();
        if ((a11 == null || a11.c()) && (((a10 = M10.b().a()) == null || a10.c()) && z11)) {
            z12 = false;
        } else {
            z12 = true;
        }
        boolean z14 = z12;
        C2732o e11 = e(n0Var, J10, M10, str, mVar, i13 | (i14 & 7168));
        i.a aVar5 = k0.i.f23074a;
        boolean b10 = mVar2.b(z14);
        if ((((i12 & 7168) ^ 3072) <= 2048 || !mVar2.S(jVar)) && (i12 & 3072) != 2048) {
            z13 = false;
        }
        boolean z15 = b10 | z13;
        Object A13 = mVar.A();
        if (z15 || A13 == C1500m.f10026a.a()) {
            A13 = new k(z14, jVar);
            mVar2.r(A13);
        }
        k0.i h10 = androidx.compose.ui.graphics.b.a(aVar5, (C6798l) A13).h(new EnterExitTransitionElement(n0Var, aVar3, aVar4, aVar2, J10, M10, jVar, e11));
        if (C1506p.H()) {
            C1506p.P();
        }
        return h10;
    }

    public static final i h(C2763G g10, c.b bVar, boolean z10, C6798l lVar) {
        return j(g10, H(bVar), z10, new m(lVar));
    }

    public static /* synthetic */ i i(C2763G g10, c.b bVar, boolean z10, C6798l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            g10 = C2798j.h(0.0f, 400.0f, c1.r.b(G0.d(c1.r.f19235b)), 1, (Object) null);
        }
        if ((i10 & 2) != 0) {
            bVar = k0.c.f23044a.j();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = l.f12336a;
        }
        return h(g10, bVar, z10, lVar);
    }

    public static final i j(C2763G g10, k0.c cVar, boolean z10, C6798l lVar) {
        return new j(new C2743z((C2729l) null, (C2739v) null, new C2724g(cVar, lVar, g10, z10), (C2736s) null, false, (Map) null, 59, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ i k(C2763G g10, k0.c cVar, boolean z10, C6798l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            g10 = C2798j.h(0.0f, 400.0f, c1.r.b(G0.d(c1.r.f19235b)), 1, (Object) null);
        }
        if ((i10 & 2) != 0) {
            cVar = k0.c.f23044a.c();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = n.f12338a;
        }
        return j(g10, cVar, z10, lVar);
    }

    public static final i l(C2763G g10, c.C0368c cVar, boolean z10, C6798l lVar) {
        return j(g10, I(cVar), z10, new p(lVar));
    }

    public static /* synthetic */ i m(C2763G g10, c.C0368c cVar, boolean z10, C6798l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            g10 = C2798j.h(0.0f, 400.0f, c1.r.b(G0.d(c1.r.f19235b)), 1, (Object) null);
        }
        if ((i10 & 2) != 0) {
            cVar = k0.c.f23044a.a();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = o.f12339a;
        }
        return l(g10, cVar, z10, lVar);
    }

    public static final i n(C2763G g10, float f10) {
        return new j(new C2743z(new C2729l(f10, g10), (C2739v) null, (C2724g) null, (C2736s) null, false, (Map) null, 62, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ i o(C2763G g10, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            g10 = C2798j.h(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return n(g10, f10);
    }

    public static final k p(C2763G g10, float f10) {
        return new l(new C2743z(new C2729l(f10, g10), (C2739v) null, (C2724g) null, (C2736s) null, false, (Map) null, 62, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ k q(C2763G g10, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            g10 = C2798j.h(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return p(g10, f10);
    }

    public static final i r(C2763G g10, float f10, long j10) {
        return new j(new C2743z((C2729l) null, (C2739v) null, (C2724g) null, new C2736s(f10, j10, g10, (DefaultConstructorMarker) null), false, (Map) null, 55, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ i s(C2763G g10, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            g10 = C2798j.h(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = androidx.compose.ui.graphics.f.f13431b.a();
        }
        return r(g10, f10, j10);
    }

    public static final k t(C2763G g10, c.b bVar, boolean z10, C6798l lVar) {
        return v(g10, H(bVar), z10, new r(lVar));
    }

    public static /* synthetic */ k u(C2763G g10, c.b bVar, boolean z10, C6798l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            g10 = C2798j.h(0.0f, 400.0f, c1.r.b(G0.d(c1.r.f19235b)), 1, (Object) null);
        }
        if ((i10 & 2) != 0) {
            bVar = k0.c.f23044a.j();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = q.f12341a;
        }
        return t(g10, bVar, z10, lVar);
    }

    public static final k v(C2763G g10, k0.c cVar, boolean z10, C6798l lVar) {
        return new l(new C2743z((C2729l) null, (C2739v) null, new C2724g(cVar, lVar, g10, z10), (C2736s) null, false, (Map) null, 59, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ k w(C2763G g10, k0.c cVar, boolean z10, C6798l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            g10 = C2798j.h(0.0f, 400.0f, c1.r.b(G0.d(c1.r.f19235b)), 1, (Object) null);
        }
        if ((i10 & 2) != 0) {
            cVar = k0.c.f23044a.c();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = s.f12343a;
        }
        return v(g10, cVar, z10, lVar);
    }

    public static final k x(C2763G g10, c.C0368c cVar, boolean z10, C6798l lVar) {
        return v(g10, I(cVar), z10, new u(lVar));
    }

    public static /* synthetic */ k y(C2763G g10, c.C0368c cVar, boolean z10, C6798l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            g10 = C2798j.h(0.0f, 400.0f, c1.r.b(G0.d(c1.r.f19235b)), 1, (Object) null);
        }
        if ((i10 & 2) != 0) {
            cVar = k0.c.f23044a.a();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = t.f12344a;
        }
        return x(g10, cVar, z10, lVar);
    }

    public static final i z(C2763G g10, C6798l lVar) {
        return new j(new C2743z((C2729l) null, new C2739v(lVar, g10), (C2724g) null, (C2736s) null, false, (Map) null, 61, (DefaultConstructorMarker) null));
    }
}
