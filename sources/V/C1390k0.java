package V;

import H0.F;
import J0.C1241g;
import O0.m;
import O0.v;
import Ug.K;
import Y.A1;
import Y.B;
import Y.C1494j;
import Y.C1500m;
import Y.C1506p;
import Y.C1523y;
import Y.F1;
import Y.L;
import Y.M;
import Y.M0;
import Y.P;
import Y.Y0;
import Y.p1;
import Y.r;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C1644k0;
import c1.t;
import h0.C2018b;
import h0.C2026j;
import java.util.UUID;
import k0.h;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.C6535s;
import w.C2782a;
import x.C2874m;
import yf.C6787a;
import yf.C6798l;
import yf.p;

/* renamed from: V.k0  reason: case insensitive filesystem */
public abstract class C1390k0 {

    /* renamed from: V.k0$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1384h0 f7695a;

        /* renamed from: V.k0$a$a  reason: collision with other inner class name */
        public static final class C0170a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1384h0 f7696a;

            public C0170a(C1384h0 h0Var) {
                this.f7696a = h0Var;
            }

            public void dispose() {
                this.f7696a.dismiss();
                this.f7696a.g();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C1384h0 h0Var) {
            super(1);
            this.f7695a = h0Var;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            this.f7695a.show();
            return new C0170a(this.f7695a);
        }
    }

    /* renamed from: V.k0$b */
    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1384h0 f7697a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6787a f7698b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1388j0 f7699c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ t f7700d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C1384h0 h0Var, C6787a aVar, C1388j0 j0Var, t tVar) {
            super(0);
            this.f7697a = h0Var;
            this.f7698b = aVar;
            this.f7699c = j0Var;
            this.f7700d = tVar;
        }

        public final void invoke() {
            this.f7697a.k(this.f7698b, this.f7699c, this.f7700d);
        }
    }

    /* renamed from: V.k0$c */
    static final class c extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6787a f7701a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1388j0 f7702b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2782a f7703c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f7704d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f7705e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C6787a aVar, C1388j0 j0Var, C2782a aVar2, p pVar, int i10) {
            super(2);
            this.f7701a = aVar;
            this.f7702b = j0Var;
            this.f7703c = aVar2;
            this.f7704d = pVar;
            this.f7705e = i10;
        }

        public final void a(C1500m mVar, int i10) {
            C1390k0.a(this.f7701a, this.f7702b, this.f7703c, this.f7704d, mVar, M0.a(this.f7705e | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.k0$d */
    static final class d extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A1 f7706a;

        /* renamed from: V.k0$d$a */
        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final a f7707a = new a();

            a() {
                super(1);
            }

            public final void a(v vVar) {
                O0.t.j(vVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((v) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(A1 a12) {
            super(2);
            this.f7706a = a12;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-1560960657, i10, -1, "androidx.compose.material3.ModalBottomSheetDialog.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:296)");
                }
                i d10 = m.d(i.f23074a, false, a.f7707a, 1, (Object) null);
                A1 a12 = this.f7706a;
                F h10 = androidx.compose.foundation.layout.d.h(k0.c.f23044a.o(), false);
                int a10 = C1494j.a(mVar, 0);
                C1523y p10 = mVar.p();
                i e10 = h.e(mVar, d10);
                C1241g.a aVar = C1241g.f3853J;
                C6787a a11 = aVar.a();
                if (mVar.j() == null) {
                    C1494j.c();
                }
                mVar.F();
                if (mVar.f()) {
                    mVar.U(a11);
                } else {
                    mVar.q();
                }
                C1500m a13 = F1.a(mVar);
                F1.b(a13, h10, aVar.c());
                F1.b(a13, p10, aVar.e());
                p b10 = aVar.b();
                if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a10))) {
                    a13.r(Integer.valueOf(a10));
                    a13.V(Integer.valueOf(a10), b10);
                }
                F1.b(a13, e10, aVar.d());
                androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f12848a;
                C1390k0.b(a12).invoke(mVar, 0);
                mVar.u();
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.k0$e */
    static final class e extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f7708a = new e();

        e() {
            super(0);
        }

        /* renamed from: a */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* renamed from: V.k0$f */
    public /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7709a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.ui.window.t[] r0 = androidx.compose.ui.window.t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.window.t r1 = androidx.compose.ui.window.t.SecureOff     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.window.t r1 = androidx.compose.ui.window.t.SecureOn     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.window.t r1 = androidx.compose.ui.window.t.Inherit     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f7709a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: V.C1390k0.f.<clinit>():void");
        }
    }

    public static final void a(C6787a aVar, C1388j0 j0Var, C2782a aVar2, p pVar, C1500m mVar, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        boolean z13;
        int i13;
        int i14;
        int i15;
        C6787a aVar3 = aVar;
        C1388j0 j0Var2 = j0Var;
        C2782a aVar4 = aVar2;
        p pVar2 = pVar;
        int i16 = i10;
        C1500m h10 = mVar.h(1254951810);
        if ((i16 & 6) == 0) {
            if (h10.C(aVar3)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i16;
        } else {
            i11 = i16;
        }
        if ((i16 & 48) == 0) {
            if (h10.S(j0Var2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i16 & 384) == 0) {
            if ((i16 & 512) == 0) {
                z13 = h10.S(aVar4);
            } else {
                z13 = h10.C(aVar4);
            }
            if (z13) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i16 & 3072) == 0) {
            if (h10.C(pVar2)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i11 |= i12;
        }
        int i17 = i11;
        if ((i17 & 1171) != 1170 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(1254951810, i17, -1, "androidx.compose.material3.ModalBottomSheetDialog (ModalBottomSheet.android.kt:272)");
            }
            View view = (View) h10.m(AndroidCompositionLocals_androidKt.k());
            r d10 = C1494j.d(h10, 0);
            A1 o10 = p1.o(pVar2, h10, (i17 >> 9) & 14);
            r rVar = d10;
            t tVar = (t) h10.m(C1644k0.k());
            c1.d dVar = (c1.d) h10.m(C1644k0.e());
            int i18 = i17;
            UUID uuid = (UUID) C2018b.e(new Object[0], (C2026j) null, (String) null, e.f7708a, h10, 3072, 6);
            Object A10 = h10.A();
            C1500m.a aVar5 = C1500m.f10026a;
            if (A10 == aVar5.a()) {
                B b10 = new B(P.j(qf.h.f72645a, h10));
                h10.r(b10);
                A10 = b10;
            }
            K a10 = ((B) A10).a();
            boolean a11 = C2874m.a(h10, 0);
            boolean S10 = h10.S(view) | h10.S(dVar);
            Object A11 = h10.A();
            if (S10 || A11 == aVar5.a()) {
                C1384h0 h0Var = r0;
                z10 = true;
                C1384h0 h0Var2 = new C1384h0(aVar, j0Var, view, tVar, dVar, uuid, aVar2, a10, a11);
                h0Var.h(rVar, g0.c.c(-1560960657, true, new d(o10)));
                h10.r(h0Var);
                A11 = h0Var;
            } else {
                z10 = true;
            }
            C1384h0 h0Var3 = (C1384h0) A11;
            boolean C10 = h10.C(h0Var3);
            Object A12 = h10.A();
            if (C10 || A12 == aVar5.a()) {
                A12 = new a(h0Var3);
                h10.r(A12);
            }
            P.c(h0Var3, (C6798l) A12, h10, 0);
            boolean C11 = h10.C(h0Var3);
            if ((i18 & 14) == 4) {
                z11 = z10;
            } else {
                z11 = false;
            }
            boolean z14 = C11 | z11;
            if ((i18 & 112) == 32) {
                z12 = z10;
            } else {
                z12 = false;
            }
            t tVar2 = tVar;
            boolean S11 = z14 | z12 | h10.S(tVar2);
            Object A13 = h10.A();
            if (S11 || A13 == aVar5.a()) {
                A13 = new b(h0Var3, aVar3, j0Var2, tVar2);
                h10.r(A13);
            }
            P.h((C6787a) A13, h10, 0);
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new c(aVar, j0Var, aVar2, pVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final p b(A1 a12) {
        return (p) a12.getValue();
    }

    public static final boolean e(View view) {
        WindowManager.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null || (layoutParams.flags & 8192) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final boolean f(androidx.compose.ui.window.t tVar, boolean z10) {
        int i10 = f.f7709a[tVar.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 == 3) {
            return z10;
        }
        throw new C6535s();
    }
}
