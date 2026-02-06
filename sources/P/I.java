package P;

import D0.C1124o;
import J.C1212h;
import J.H;
import Q0.Q;
import Y.C1500m;
import Y.C1506p;
import Y.C1510r0;
import Y.o1;
import androidx.compose.ui.platform.C1638i0;
import androidx.compose.ui.platform.C1644k0;
import c1.d;
import c1.k;
import c1.r;
import c1.s;
import k0.h;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import q0.C2421g;
import x.C2847K;
import x.C2858W;
import y.C2922g;
import y.C2924i;
import y.C2925j;
import yf.C6787a;
import yf.C6798l;
import yf.q;

public abstract class I {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ G f4814a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2924i f4815b;

        /* renamed from: P.I$a$a  reason: collision with other inner class name */
        public static final class C0119a extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2924i f4816a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ G f4817b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0119a(C2924i iVar, G g10) {
                super(0);
                this.f4816a = iVar;
                this.f4817b = g10;
            }

            public final void invoke() {
                this.f4817b.s();
                C2925j.a(this.f4816a);
            }
        }

        public static final class b extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2924i f4818a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ G f4819b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(C2924i iVar, G g10) {
                super(0);
                this.f4818a = iVar;
                this.f4819b = g10;
            }

            public final void invoke() {
                this.f4819b.o(false);
                C2925j.a(this.f4818a);
            }
        }

        public static final class c extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2924i f4820a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ G f4821b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(C2924i iVar, G g10) {
                super(0);
                this.f4820a = iVar;
                this.f4821b = g10;
            }

            public final void invoke() {
                this.f4821b.T();
                C2925j.a(this.f4820a);
            }
        }

        public static final class d extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2924i f4822a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ G f4823b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(C2924i iVar, G g10) {
                super(0);
                this.f4822a = iVar;
                this.f4823b = g10;
            }

            public final void invoke() {
                this.f4823b.U();
                C2925j.a(this.f4822a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(G g10, C2924i iVar) {
            super(1);
            this.f4814a = g10;
            this.f4815b = iVar;
        }

        public final void a(C2922g gVar) {
            boolean z10;
            boolean z11;
            boolean z12;
            C1638i0 y10;
            this.f4814a.P();
            boolean h10 = Q.h(this.f4814a.O().g());
            C2924i iVar = this.f4815b;
            H h11 = H.Cut;
            if (h10 || !this.f4814a.D()) {
                z10 = false;
            } else {
                z10 = true;
            }
            C2922g.d(gVar, new C1212h(h11), (i) null, z10, (q) null, new C0119a(iVar, this.f4814a), 10, (Object) null);
            C2924i iVar2 = this.f4815b;
            C2922g gVar2 = gVar;
            C2922g.d(gVar2, new C1212h(H.Copy), (i) null, !h10, (q) null, new b(iVar2, this.f4814a), 10, (Object) null);
            C2924i iVar3 = this.f4815b;
            H h12 = H.Paste;
            if (!this.f4814a.D() || (y10 = this.f4814a.y()) == null || !y10.c()) {
                z11 = false;
            } else {
                z11 = true;
            }
            C2922g.d(gVar, new C1212h(h12), (i) null, z11, (q) null, new c(iVar3, this.f4814a), 10, (Object) null);
            C2924i iVar4 = this.f4815b;
            H h13 = H.SelectAll;
            if (Q.j(this.f4814a.O().g()) != this.f4814a.O().h().length()) {
                z12 = true;
            } else {
                z12 = false;
            }
            C2922g.d(gVar, new C1212h(h13), (i) null, z12, (q) null, new d(iVar4, this.f4814a), 10, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2922g) obj);
            return C6514M.f71813a;
        }
    }

    static final class b extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ G f4824a;

        static final class a extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ G f4825a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C1510r0 f4826b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(G g10, C1510r0 r0Var) {
                super(0);
                this.f4825a = g10;
                this.f4826b = r0Var;
            }

            public final long a() {
                return H.b(this.f4825a, b.e(this.f4826b));
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                return C2421g.d(a());
            }
        }

        /* renamed from: P.I$b$b  reason: collision with other inner class name */
        static final class C0120b extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f4827a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C1510r0 f4828b;

            /* renamed from: P.I$b$b$a */
            static final class a extends C6498u implements C6798l {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C6787a f4829a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                a(C6787a aVar) {
                    super(1);
                    this.f4829a = aVar;
                }

                public final long a(d dVar) {
                    return ((C2421g) this.f4829a.invoke()).v();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return C2421g.d(a((d) obj));
                }
            }

            /* renamed from: P.I$b$b$b  reason: collision with other inner class name */
            static final class C0121b extends C6498u implements C6798l {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f4830a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C1510r0 f4831b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0121b(d dVar, C1510r0 r0Var) {
                    super(1);
                    this.f4830a = dVar;
                    this.f4831b = r0Var;
                }

                public final void a(long j10) {
                    C1510r0 r0Var = this.f4831b;
                    d dVar = this.f4830a;
                    b.h(r0Var, s.a(dVar.E0(k.h(j10)), dVar.E0(k.g(j10))));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((k) obj).k());
                    return C6514M.f71813a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0120b(d dVar, C1510r0 r0Var) {
                super(1);
                this.f4827a = dVar;
                this.f4828b = r0Var;
            }

            /* renamed from: a */
            public final i invoke(C6787a aVar) {
                return C2847K.f(i.f23074a, new a(aVar), (C6798l) null, new C0121b(this.f4827a, this.f4828b), 0.0f, true, 0, 0.0f, 0.0f, false, C2858W.f27893a.a(), 490, (Object) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(G g10) {
            super(3);
            this.f4824a = g10;
        }

        /* access modifiers changed from: private */
        public static final long e(C1510r0 r0Var) {
            return ((r) r0Var.getValue()).j();
        }

        /* access modifiers changed from: private */
        public static final void h(C1510r0 r0Var, long j10) {
            r0Var.setValue(r.b(j10));
        }

        public final i c(i iVar, C1500m mVar, int i10) {
            mVar.T(1980580247);
            if (C1506p.H()) {
                C1506p.Q(1980580247, i10, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:48)");
            }
            d dVar = (d) mVar.m(C1644k0.e());
            Object A10 = mVar.A();
            C1500m.a aVar = C1500m.f10026a;
            if (A10 == aVar.a()) {
                A10 = u1.d(r.b(r.f19235b.a()), (o1) null, 2, (Object) null);
                mVar.r(A10);
            }
            C1510r0 r0Var = (C1510r0) A10;
            boolean C10 = mVar.C(this.f4824a);
            G g10 = this.f4824a;
            Object A11 = mVar.A();
            if (C10 || A11 == aVar.a()) {
                A11 = new a(g10, r0Var);
                mVar.r(A11);
            }
            C6787a aVar2 = (C6787a) A11;
            boolean S10 = mVar.S(dVar);
            Object A12 = mVar.A();
            if (S10 || A12 == aVar.a()) {
                A12 = new C0120b(dVar, r0Var);
                mVar.r(A12);
            }
            i d10 = z.d(iVar, aVar2, (C6798l) A12);
            if (C1506p.H()) {
                C1506p.P();
            }
            mVar.M();
            return d10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return c((i) obj, (C1500m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final C6798l a(G g10, C2924i iVar) {
        return new a(g10, iVar);
    }

    public static final boolean b(C1124o oVar) {
        return false;
    }

    public static final i c(i iVar, G g10) {
        if (!C2847K.d(0, 1, (Object) null)) {
            return iVar;
        }
        return h.c(iVar, (C6798l) null, new b(g10), 1, (Object) null);
    }
}
