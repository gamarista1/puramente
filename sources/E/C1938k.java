package e;

import Ug.K;
import Y.A1;
import Y.B;
import Y.C1500m;
import Y.L;
import Y.M;
import Y.P;
import Y.Y0;
import Y.p1;
import androidx.activity.H;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.C1798v;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.h;
import rf.C6680b;
import yf.C6798l;
import yf.p;

/* renamed from: e.k  reason: case insensitive filesystem */
public abstract class C1938k {

    /* renamed from: e.k$a */
    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f19512a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1937j f19513b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f19514c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C1937j jVar, boolean z10, C6658d dVar) {
            super(2, dVar);
            this.f19513b = jVar;
            this.f19514c = z10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f19513b, this.f19514c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f19512a == 0) {
                w.b(obj);
                this.f19513b.m(this.f19514c);
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: e.k$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ H f19515a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1798v f19516b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1937j f19517c;

        /* renamed from: e.k$b$a */
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1937j f19518a;

            public a(C1937j jVar) {
                this.f19518a = jVar;
            }

            public void dispose() {
                this.f19518a.h();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(H h10, C1798v vVar, C1937j jVar) {
            super(1);
            this.f19515a = h10;
            this.f19516b = vVar;
            this.f19517c = jVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            this.f19515a.i(this.f19516b, this.f19517c);
            return new a(this.f19517c);
        }
    }

    /* renamed from: e.k$c */
    static final class c extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f19519a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f19520b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f19521c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f19522d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z10, p pVar, int i10, int i11) {
            super(2);
            this.f19519a = z10;
            this.f19520b = pVar;
            this.f19521c = i10;
            this.f19522d = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C1938k.a(this.f19519a, this.f19520b, mVar, this.f19521c | 1, this.f19522d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public static final void a(boolean z10, p pVar, C1500m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        C1500m h10 = mVar.h(-642000585);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (h10.b(z10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (h10.S(pVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 19) != 18 || !h10.i()) {
            if (i15 != 0) {
                z10 = true;
            }
            A1 o10 = p1.o(pVar, h10, (i12 >> 3) & 14);
            h10.z(-723524056);
            h10.z(-3687241);
            Object A10 = h10.A();
            C1500m.a aVar = C1500m.f10026a;
            if (A10 == aVar.a()) {
                B b10 = new B(P.j(h.f72645a, h10));
                h10.r(b10);
                A10 = b10;
            }
            h10.R();
            K a10 = ((B) A10).a();
            h10.R();
            h10.z(-1071578902);
            Object A11 = h10.A();
            if (A11 == aVar.a()) {
                A11 = new C1937j(z10, a10, b(o10));
                h10.r(A11);
            }
            C1937j jVar = (C1937j) A11;
            h10.R();
            p b11 = b(o10);
            h10.z(-1071578713);
            boolean S10 = h10.S(b11) | h10.S(a10);
            Object A12 = h10.A();
            if (S10 || A12 == aVar.a()) {
                jVar.l(b(o10));
                jVar.n(a10);
                h10.r(C6514M.f71813a);
            }
            h10.R();
            Boolean valueOf = Boolean.valueOf(z10);
            h10.z(-1071578541);
            boolean S11 = h10.S(jVar) | h10.b(z10);
            Object A13 = h10.A();
            if (S11 || A13 == aVar.a()) {
                A13 = new a(jVar, z10, (C6658d) null);
                h10.r(A13);
            }
            h10.R();
            P.g(valueOf, (p) A13, h10, i12 & 14);
            androidx.activity.K a11 = C1934g.f19493a.a(h10, 6);
            if (a11 != null) {
                H onBackPressedDispatcher = a11.getOnBackPressedDispatcher();
                C1798v vVar = (C1798v) h10.m(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                h10.z(-1071578150);
                boolean S12 = h10.S(onBackPressedDispatcher) | h10.S(vVar) | h10.S(jVar);
                Object A14 = h10.A();
                if (S12 || A14 == aVar.a()) {
                    A14 = new b(onBackPressedDispatcher, vVar, jVar);
                    h10.r(A14);
                }
                h10.R();
                P.b(vVar, onBackPressedDispatcher, (C6798l) A14, h10, 0);
            } else {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new c(z10, pVar, i10, i11));
        }
    }

    private static final p b(A1 a12) {
        return (p) a12.getValue();
    }
}
