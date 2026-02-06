package Z;

import Y.C1476c1;
import Y.C1477d;
import Y.C1483f;
import Y.C1485f1;
import Y.C1496k;
import Y.C1499l0;
import Y.C1501m0;
import Y.C1506p;
import Y.C1508q;
import Y.C1514t0;
import Y.L0;
import Y.S0;
import Y.T0;
import Y.U0;
import com.amazon.device.iap.internal.c.b;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import lf.C6514M;
import lf.C6527k;
import yf.C6787a;
import yf.C6798l;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private final int f10335a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10336b;

    public static final class A extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final A f10337c = new A();

        private A() {
            super(0, 0, 3, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            f1Var.W0();
        }
    }

    public static final class B extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final B f10338c = new B();

        private B() {
            super(1, 0, 2, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            int b10 = eVar.b(q.a(0));
            int e02 = f1Var.e0();
            int c02 = f1Var.c0();
            int d12 = f1Var.d1(c02);
            int c12 = f1Var.c1(c02);
            for (int max = Math.max(d12, c12 - b10); max < c12; max++) {
                Object obj = f1Var.f9981c[f1Var.R(max)];
                if (obj instanceof U0) {
                    s02.b(((U0) obj).b(), e02 - max, -1, -1);
                } else if (obj instanceof L0) {
                    ((L0) obj).x();
                }
            }
            f1Var.k1(b10);
        }

        public String e(int i10) {
            if (q.b(i10, q.a(0))) {
                return "count";
            }
            return d.super.e(i10);
        }
    }

    public static final class C extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final C f10339c = new C();

        private C() {
            super(1, 2, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            int i10;
            int i11;
            Object a10 = eVar.a(t.a(0));
            C1477d dVar = (C1477d) eVar.a(t.a(1));
            int b10 = eVar.b(q.a(0));
            if (a10 instanceof U0) {
                s02.d(((U0) a10).b());
            }
            int F10 = f1Var.F(dVar);
            Object R02 = f1Var.R0(F10, b10, a10);
            if (R02 instanceof U0) {
                int e02 = f1Var.e0() - f1Var.a1(F10, b10);
                U0 u02 = (U0) R02;
                C1477d a11 = u02.a();
                if (a11 == null || !a11.b()) {
                    i11 = -1;
                    i10 = -1;
                } else {
                    i11 = f1Var.F(a11);
                    i10 = f1Var.e0() - f1Var.b1(i11);
                }
                s02.b(u02.b(), e02, i11, i10);
            } else if (R02 instanceof L0) {
                ((L0) R02).x();
            }
        }

        public String e(int i10) {
            if (q.b(i10, q.a(0))) {
                return "groupSlotIndex";
            }
            return d.super.e(i10);
        }

        public String f(int i10) {
            if (t.b(i10, t.a(0))) {
                return "value";
            }
            if (t.b(i10, t.a(1))) {
                return "anchor";
            }
            return d.super.f(i10);
        }
    }

    public static final class D extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final D f10340c = new D();

        private D() {
            super(0, 1, 1, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            f1Var.o1(eVar.a(t.a(0)));
        }

        public String f(int i10) {
            if (t.b(i10, t.a(0))) {
                return "data";
            }
            return d.super.f(i10);
        }
    }

    public static final class E extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final E f10341c = new E();

        private E() {
            super(0, 2, 1, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            ((yf.p) eVar.a(t.a(1))).invoke(fVar.b(), eVar.a(t.a(0)));
        }

        public String f(int i10) {
            if (t.b(i10, t.a(0))) {
                return "value";
            }
            if (t.b(i10, t.a(1))) {
                return "block";
            }
            return d.super.f(i10);
        }
    }

    public static final class F extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final F f10342c = new F();

        private F() {
            super(1, 1, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            Object a10 = eVar.a(t.a(0));
            int b10 = eVar.b(q.a(0));
            if (a10 instanceof U0) {
                s02.d(((U0) a10).b());
            }
            Object S02 = f1Var.S0(b10, a10);
            if (S02 instanceof U0) {
                s02.b(((U0) S02).b(), f1Var.e0() - f1Var.a1(f1Var.a0(), b10), -1, -1);
            } else if (S02 instanceof L0) {
                ((L0) S02).x();
            }
        }

        public String e(int i10) {
            if (q.b(i10, q.a(0))) {
                return "groupSlotIndex";
            }
            return d.super.e(i10);
        }

        public String f(int i10) {
            if (t.b(i10, t.a(0))) {
                return "value";
            }
            return d.super.f(i10);
        }
    }

    public static final class G extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final G f10343c = new G();

        private G() {
            super(1, 0, 2, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            int b10 = eVar.b(q.a(0));
            for (int i10 = 0; i10 < b10; i10++) {
                fVar.i();
            }
        }

        public String e(int i10) {
            if (q.b(i10, q.a(0))) {
                return "count";
            }
            return d.super.e(i10);
        }
    }

    public static final class H extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final H f10344c = new H();

        private H() {
            super(0, 0, 3, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            Object b10 = fVar.b();
            C6496s.f(b10, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
            ((C1496k) b10).l();
        }
    }

    /* renamed from: Z.d$a  reason: case insensitive filesystem */
    public static final class C1527a extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final C1527a f10345c = new C1527a();

        private C1527a() {
            super(1, 0, 2, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            f1Var.D(eVar.b(q.a(0)));
        }

        public String e(int i10) {
            if (q.b(i10, q.a(0))) {
                return "distance";
            }
            return d.super.e(i10);
        }
    }

    /* renamed from: Z.d$b  reason: case insensitive filesystem */
    public static final class C1528b extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final C1528b f10346c = new C1528b();

        private C1528b() {
            super(0, 2, 1, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            C1477d dVar = (C1477d) eVar.a(t.a(0));
            Object a10 = eVar.a(t.a(1));
            if (a10 instanceof U0) {
                s02.d(((U0) a10).b());
            }
            f1Var.G(dVar, a10);
        }

        public String f(int i10) {
            if (t.b(i10, t.a(0))) {
                return "anchor";
            }
            if (t.b(i10, t.a(1))) {
                return "value";
            }
            return d.super.f(i10);
        }
    }

    /* renamed from: Z.d$c  reason: case insensitive filesystem */
    public static final class C1529c extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final C1529c f10347c = new C1529c();

        private C1529c() {
            super(0, 2, 1, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            int i10;
            g0.d dVar = (g0.d) eVar.a(t.a(1));
            if (dVar != null) {
                i10 = dVar.a();
            } else {
                i10 = 0;
            }
            a aVar = (a) eVar.a(t.a(0));
            if (i10 > 0) {
                fVar = new C1514t0(fVar, i10);
            }
            aVar.b(fVar, f1Var, s02);
        }

        public String f(int i10) {
            if (t.b(i10, t.a(0))) {
                return "changes";
            }
            if (t.b(i10, t.a(1))) {
                return "effectiveNodeIndex";
            }
            return d.super.f(i10);
        }
    }

    /* renamed from: Z.d$d  reason: collision with other inner class name */
    public static final class C0191d extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final C0191d f10348c = new C0191d();

        private C0191d() {
            super(0, 2, 1, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            int a10 = ((g0.d) eVar.a(t.a(0))).a();
            List list = (List) eVar.a(t.a(1));
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                C6496s.f(fVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i11 = a10 + i10;
                fVar.f(i11, obj);
                fVar.d(i11, obj);
            }
        }

        public String f(int i10) {
            if (t.b(i10, t.a(0))) {
                return "effectiveNodeIndex";
            }
            if (t.b(i10, t.a(1))) {
                return "nodes";
            }
            return d.super.f(i10);
        }
    }

    /* renamed from: Z.d$e  reason: case insensitive filesystem */
    public static final class C1530e extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final C1530e f10349c = new C1530e();

        private C1530e() {
            super(0, 4, 1, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            C1501m0 m0Var = (C1501m0) eVar.a(t.a(3));
            Y.r rVar = (Y.r) eVar.a(t.a(1));
            C1499l0 l0Var = (C1499l0) eVar.a(t.a(0));
            rVar.l((C1501m0) eVar.a(t.a(2)));
            C1506p.s("Could not resolve state for movable content");
            throw new C6527k();
        }

        public String f(int i10) {
            if (t.b(i10, t.a(0))) {
                return "resolvedState";
            }
            if (t.b(i10, t.a(1))) {
                return "resolvedCompositionContext";
            }
            if (t.b(i10, t.a(2))) {
                return TicketDetailDestinationKt.LAUNCHED_FROM;
            }
            if (t.b(i10, t.a(3))) {
                return "to";
            }
            return d.super.f(i10);
        }
    }

    /* renamed from: Z.d$f  reason: case insensitive filesystem */
    public static final class C1531f extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final C1531f f10350c = new C1531f();

        private C1531f() {
            super(0, 0, 3, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            C1506p.t(f1Var, s02);
        }
    }

    /* renamed from: Z.d$g  reason: case insensitive filesystem */
    public static final class C1532g extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final C1532g f10351c = new C1532g();

        private C1532g() {
            super(0, 2, 1, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            C6496s.f(fVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            ((g0.d) eVar.a(t.a(0))).b(f.d(f1Var, (C1477d) eVar.a(t.a(1)), fVar));
        }

        public String f(int i10) {
            if (t.b(i10, t.a(0))) {
                return "effectiveNodeIndexOut";
            }
            if (t.b(i10, t.a(1))) {
                return "anchor";
            }
            return d.super.f(i10);
        }
    }

    /* renamed from: Z.d$h  reason: case insensitive filesystem */
    public static final class C1533h extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final C1533h f10352c = new C1533h();

        private C1533h() {
            super(0, 1, 1, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            C6496s.f(fVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object g10 : (Object[]) eVar.a(t.a(0))) {
                fVar.g(g10);
            }
        }

        public String f(int i10) {
            if (t.b(i10, t.a(0))) {
                return "nodes";
            }
            return d.super.f(i10);
        }
    }

    public static final class i extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final i f10353c = new i();

        private i() {
            super(0, 2, 1, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            ((C6798l) eVar.a(t.a(0))).invoke((C1508q) eVar.a(t.a(1)));
        }

        public String f(int i10) {
            if (t.b(i10, t.a(0))) {
                return "anchor";
            }
            if (t.b(i10, t.a(1))) {
                return "composition";
            }
            return d.super.f(i10);
        }
    }

    public static final class j extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final j f10354c = new j();

        private j() {
            super(0, 0, 3, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            f1Var.T();
        }
    }

    public static final class k extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final k f10355c = new k();

        private k() {
            super(0, 0, 3, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            C6496s.f(fVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            f.e(f1Var, fVar, 0);
            f1Var.T();
        }
    }

    public static final class l extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final l f10356c = new l();

        private l() {
            super(0, 1, 1, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            f1Var.W((C1477d) eVar.a(t.a(0)));
        }

        public String f(int i10) {
            if (t.b(i10, t.a(0))) {
                return "anchor";
            }
            return d.super.f(i10);
        }
    }

    public static final class m extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final m f10357c = new m();

        private m() {
            super(0, 0, 3, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            f1Var.V(0);
        }
    }

    public static final class n extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final n f10358c = new n();

        private n() {
            super(1, 2, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            Object invoke = ((C6787a) eVar.a(t.a(0))).invoke();
            int b10 = eVar.b(q.a(0));
            C6496s.f(fVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            f1Var.s1((C1477d) eVar.a(t.a(1)), invoke);
            fVar.d(b10, invoke);
            fVar.g(invoke);
        }

        public String e(int i10) {
            if (q.b(i10, q.a(0))) {
                return "insertIndex";
            }
            return d.super.e(i10);
        }

        public String f(int i10) {
            if (t.b(i10, t.a(0))) {
                return "factory";
            }
            if (t.b(i10, t.a(1))) {
                return "groupAnchor";
            }
            return d.super.f(i10);
        }
    }

    public static final class o extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final o f10359c = new o();

        private o() {
            super(0, 2, 1, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            C1476c1 c1Var = (C1476c1) eVar.a(t.a(1));
            f1Var.I();
            f1Var.v0(c1Var, ((C1477d) eVar.a(t.a(0))).d(c1Var), false);
            f1Var.U();
        }

        public String f(int i10) {
            if (t.b(i10, t.a(0))) {
                return "anchor";
            }
            if (t.b(i10, t.a(1))) {
                return TicketDetailDestinationKt.LAUNCHED_FROM;
            }
            return d.super.f(i10);
        }
    }

    public static final class p extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final p f10360c = new p();

        private p() {
            super(0, 3, 1, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: finally extract failed */
        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            C1476c1 c1Var = (C1476c1) eVar.a(t.a(1));
            C1477d dVar = (C1477d) eVar.a(t.a(0));
            c cVar = (c) eVar.a(t.a(2));
            C1485f1 Q10 = c1Var.Q();
            try {
                cVar.d(fVar, Q10, s02);
                C6514M m10 = C6514M.f71813a;
                Q10.L(true);
                f1Var.I();
                f1Var.v0(c1Var, dVar.d(c1Var), false);
                f1Var.U();
            } catch (Throwable th2) {
                Q10.L(false);
                throw th2;
            }
        }

        public String f(int i10) {
            if (t.b(i10, t.a(0))) {
                return "anchor";
            }
            if (t.b(i10, t.a(1))) {
                return TicketDetailDestinationKt.LAUNCHED_FROM;
            }
            if (t.b(i10, t.a(2))) {
                return "fixups";
            }
            return d.super.f(i10);
        }
    }

    public static final class r extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final r f10361c = new r();

        private r() {
            super(1, 0, 2, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            f1Var.w0(eVar.b(q.a(0)));
        }

        public String e(int i10) {
            if (q.b(i10, q.a(0))) {
                return b.as;
            }
            return d.super.e(i10);
        }
    }

    public static final class s extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final s f10362c = new s();

        private s() {
            super(3, 0, 2, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            fVar.c(eVar.b(q.a(0)), eVar.b(q.a(1)), eVar.b(q.a(2)));
        }

        public String e(int i10) {
            if (q.b(i10, q.a(0))) {
                return TicketDetailDestinationKt.LAUNCHED_FROM;
            }
            if (q.b(i10, q.a(1))) {
                return "to";
            }
            if (q.b(i10, q.a(2))) {
                return "count";
            }
            return d.super.e(i10);
        }
    }

    public static final class u extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final u f10363c = new u();

        private u() {
            super(1, 1, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            int b10 = eVar.b(q.a(0));
            fVar.i();
            C6496s.f(fVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            fVar.f(b10, f1Var.B0((C1477d) eVar.a(t.a(0))));
        }

        public String e(int i10) {
            if (q.b(i10, q.a(0))) {
                return "insertIndex";
            }
            return d.super.e(i10);
        }

        public String f(int i10) {
            if (t.b(i10, t.a(0))) {
                return "groupAnchor";
            }
            return d.super.f(i10);
        }
    }

    public static final class v extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final v f10364c = new v();

        private v() {
            super(0, 1, 1, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            s02.d((T0) eVar.a(t.a(0)));
        }

        public String f(int i10) {
            if (t.b(i10, t.a(0))) {
                return "value";
            }
            return d.super.f(i10);
        }
    }

    public static final class w extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final w f10365c = new w();

        private w() {
            super(0, 0, 3, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            C1506p.K(f1Var, s02);
        }
    }

    public static final class x extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final x f10366c = new x();

        private x() {
            super(2, 0, 2, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            fVar.a(eVar.b(q.a(0)), eVar.b(q.a(1)));
        }

        public String e(int i10) {
            if (q.b(i10, q.a(0))) {
                return "removeIndex";
            }
            if (q.b(i10, q.a(1))) {
                return "count";
            }
            return d.super.e(i10);
        }
    }

    public static final class y extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final y f10367c = new y();

        private y() {
            super(0, 0, 3, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            f1Var.O0();
        }
    }

    public static final class z extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final z f10368c = new z();

        private z() {
            super(0, 1, 1, (DefaultConstructorMarker) null);
        }

        public void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02) {
            s02.c((C6787a) eVar.a(t.a(0)));
        }

        public String f(int i10) {
            if (t.b(i10, t.a(0))) {
                return "effect";
            }
            return d.super.f(i10);
        }
    }

    public /* synthetic */ d(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11);
    }

    public abstract void a(e eVar, C1483f fVar, C1485f1 f1Var, S0 s02);

    public final int b() {
        return this.f10335a;
    }

    public final String c() {
        String w10 = O.b(getClass()).w();
        if (w10 == null) {
            return "";
        }
        return w10;
    }

    public final int d() {
        return this.f10336b;
    }

    public String e(int i10) {
        return "IntParameter(" + i10 + ')';
    }

    public String f(int i10) {
        return "ObjectParameter(" + i10 + ')';
    }

    public String toString() {
        return c();
    }

    private d(int i10, int i11) {
        this.f10335a = i10;
        this.f10336b = i11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, (DefaultConstructorMarker) null);
    }

    public static final class q {
        public static final boolean b(int i10, int i11) {
            if (i10 == i11) {
                return true;
            }
            return false;
        }

        public static int a(int i10) {
            return i10;
        }
    }

    public static final class t {
        public static final boolean b(int i10, int i11) {
            if (i10 == i11) {
                return true;
            }
            return false;
        }

        public static int a(int i10) {
            return i10;
        }
    }
}
