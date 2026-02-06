package V;

import W.C1431f;
import c1.d;
import c1.h;
import h0.C2026j;
import h0.C2027k;
import h0.C2028l;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import qf.C6658d;
import rf.C6680b;
import yf.C6787a;
import yf.C6798l;
import yf.p;

public final class E0 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f6519d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f6520a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f6521b;

    /* renamed from: c  reason: collision with root package name */
    private C1431f f6522c;

    public static final class a {

        /* renamed from: V.E0$a$a  reason: collision with other inner class name */
        static final class C0152a extends C6498u implements p {

            /* renamed from: a  reason: collision with root package name */
            public static final C0152a f6523a = new C0152a();

            C0152a() {
                super(2);
            }

            /* renamed from: a */
            public final F0 invoke(C2028l lVar, E0 e02) {
                return e02.e();
            }
        }

        static final class b extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ boolean f6524a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f6525b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C6798l f6526c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ boolean f6527d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(boolean z10, d dVar, C6798l lVar, boolean z11) {
                super(1);
                this.f6524a = z10;
                this.f6525b = dVar;
                this.f6526c = lVar;
                this.f6527d = z11;
            }

            /* renamed from: a */
            public final E0 invoke(F0 f02) {
                return new E0(this.f6524a, this.f6525b, f02, this.f6526c, this.f6527d);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2026j a(boolean z10, C6798l lVar, d dVar, boolean z11) {
            return C2027k.a(C0152a.f6523a, new b(z10, dVar, lVar, z11));
        }

        private a() {
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f6528a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(1);
            this.f6528a = dVar;
        }

        public final Float a(float f10) {
            return Float.valueOf(this.f6528a.t1(h.j((float) 56)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f6529a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar) {
            super(0);
            this.f6529a = dVar;
        }

        /* renamed from: a */
        public final Float invoke() {
            return Float.valueOf(this.f6529a.t1(h.j((float) 125)));
        }
    }

    public E0(boolean z10, d dVar, F0 f02, C6798l lVar, boolean z11) {
        this.f6520a = z10;
        this.f6521b = z11;
        if (z10 && f02 == F0.PartiallyExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        } else if (!z11 || f02 != F0.Hidden) {
            F0 f03 = f02;
            this.f6522c = new C1431f(f03, new b(dVar), new c(dVar), D0.f6479b, lVar);
        } else {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.");
        }
    }

    public static /* synthetic */ Object b(E0 e02, F0 f02, float f10, C6658d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = e02.f6522c.v();
        }
        return e02.a(f02, f10, dVar);
    }

    public final Object a(F0 f02, float f10, C6658d dVar) {
        Object d10 = androidx.compose.material3.internal.b.d(this.f6522c, f02, f10, dVar);
        if (d10 == C6680b.f()) {
            return d10;
        }
        return C6514M.f71813a;
    }

    public final Object c(C6658d dVar) {
        Object e10 = androidx.compose.material3.internal.b.e(this.f6522c, F0.Expanded, 0.0f, dVar, 2, (Object) null);
        if (e10 == C6680b.f()) {
            return e10;
        }
        return C6514M.f71813a;
    }

    public final C1431f d() {
        return this.f6522c;
    }

    public final F0 e() {
        return (F0) this.f6522c.s();
    }

    public final boolean f() {
        return this.f6522c.o().c(F0.Expanded);
    }

    public final boolean g() {
        return this.f6522c.o().c(F0.PartiallyExpanded);
    }

    public final boolean h() {
        return this.f6520a;
    }

    public final F0 i() {
        return (F0) this.f6522c.x();
    }

    public final Object j(C6658d dVar) {
        if (!this.f6521b) {
            Object b10 = b(this, F0.Hidden, 0.0f, dVar, 2, (Object) null);
            if (b10 == C6680b.f()) {
                return b10;
            }
            return C6514M.f71813a;
        }
        throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
    }

    public final boolean k() {
        if (this.f6522c.s() != F0.Hidden) {
            return true;
        }
        return false;
    }

    public final Object l(C6658d dVar) {
        if (!this.f6520a) {
            Object b10 = b(this, F0.PartiallyExpanded, 0.0f, dVar, 2, (Object) null);
            if (b10 == C6680b.f()) {
                return b10;
            }
            return C6514M.f71813a;
        }
        throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
    }

    public final float m() {
        return this.f6522c.A();
    }

    public final Object n(float f10, C6658d dVar) {
        Object G10 = this.f6522c.G(f10, dVar);
        if (G10 == C6680b.f()) {
            return G10;
        }
        return C6514M.f71813a;
    }

    public final Object o(C6658d dVar) {
        F0 f02;
        if (g()) {
            f02 = F0.PartiallyExpanded;
        } else {
            f02 = F0.Expanded;
        }
        Object b10 = b(this, f02, 0.0f, dVar, 2, (Object) null);
        if (b10 == C6680b.f()) {
            return b10;
        }
        return C6514M.f71813a;
    }
}
