package e;

import Y.A1;
import Y.C1500m;
import Y.L;
import Y.M;
import Y.P;
import Y.Y0;
import Y.p1;
import androidx.activity.G;
import androidx.activity.H;
import androidx.activity.K;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.C1798v;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;

/* renamed from: e.d  reason: case insensitive filesystem */
public abstract class C1931d {

    /* renamed from: e.d$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0340d f19478a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f19479b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C0340d dVar, boolean z10) {
            super(0);
            this.f19478a = dVar;
            this.f19479b = z10;
        }

        public final void invoke() {
            this.f19478a.j(this.f19479b);
        }
    }

    /* renamed from: e.d$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ H f19480a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1798v f19481b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C0340d f19482c;

        /* renamed from: e.d$b$a */
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0340d f19483a;

            public a(C0340d dVar) {
                this.f19483a = dVar;
            }

            public void dispose() {
                this.f19483a.h();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(H h10, C1798v vVar, C0340d dVar) {
            super(1);
            this.f19480a = h10;
            this.f19481b = vVar;
            this.f19482c = dVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            this.f19480a.i(this.f19481b, this.f19482c);
            return new a(this.f19482c);
        }
    }

    /* renamed from: e.d$c */
    static final class c extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f19484a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6787a f19485b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f19486c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f19487d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z10, C6787a aVar, int i10, int i11) {
            super(2);
            this.f19484a = z10;
            this.f19485b = aVar;
            this.f19486c = i10;
            this.f19487d = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C1931d.a(this.f19484a, this.f19485b, mVar, this.f19486c | 1, this.f19487d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: e.d$d  reason: collision with other inner class name */
    public static final class C0340d extends G {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ A1 f19488d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0340d(boolean z10, A1 a12) {
            super(z10);
            this.f19488d = a12;
        }

        public void d() {
            C1931d.b(this.f19488d).invoke();
        }
    }

    public static final void a(boolean z10, C6787a aVar, C1500m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        C1500m h10 = mVar.h(-361453782);
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
            if (h10.S(aVar)) {
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
            A1 o10 = p1.o(aVar, h10, (i12 >> 3) & 14);
            h10.z(-971159753);
            Object A10 = h10.A();
            C1500m.a aVar2 = C1500m.f10026a;
            if (A10 == aVar2.a()) {
                A10 = new C0340d(z10, o10);
                h10.r(A10);
            }
            C0340d dVar = (C0340d) A10;
            h10.R();
            h10.z(-971159481);
            boolean S10 = h10.S(dVar) | h10.b(z10);
            Object A11 = h10.A();
            if (S10 || A11 == aVar2.a()) {
                A11 = new a(dVar, z10);
                h10.r(A11);
            }
            h10.R();
            P.h((C6787a) A11, h10, 0);
            K a10 = C1934g.f19493a.a(h10, 6);
            if (a10 != null) {
                H onBackPressedDispatcher = a10.getOnBackPressedDispatcher();
                C1798v vVar = (C1798v) h10.m(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                h10.z(-971159120);
                boolean S11 = h10.S(onBackPressedDispatcher) | h10.S(vVar) | h10.S(dVar);
                Object A12 = h10.A();
                if (S11 || A12 == aVar2.a()) {
                    A12 = new b(onBackPressedDispatcher, vVar, dVar);
                    h10.r(A12);
                }
                h10.R();
                P.b(vVar, onBackPressedDispatcher, (C6798l) A12, h10, 0);
            } else {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new c(z10, aVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6787a b(A1 a12) {
        return (C6787a) a12.getValue();
    }
}
