package androidx.compose.ui.platform;

import Ug.C5584o;
import Ug.K;
import Ug.L;
import W0.T;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import k0.p;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.C6527k;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.C6787a;
import yf.C6798l;

public final class Q implements O0, K {

    /* renamed from: a  reason: collision with root package name */
    private final View f13635a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final T f13636b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final K f13637c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference f13638d = p.a();

    static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f13639a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Q f13640b;

        /* renamed from: c  reason: collision with root package name */
        int f13641c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Q q10, C6658d dVar) {
            super(dVar);
            this.f13640b = q10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f13639a = obj;
            this.f13641c |= Integer.MIN_VALUE;
            return this.f13640b.b((L0) null, this);
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L0 f13642a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Q f13643b;

        static final class a extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Q f13644a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Q q10) {
                super(0);
                this.f13644a = q10;
            }

            public final void invoke() {
                L.d(this.f13644a.f13637c, (CancellationException) null, 1, (Object) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(L0 l02, Q q10) {
            super(1);
            this.f13642a = l02;
            this.f13643b = q10;
        }

        /* renamed from: a */
        public final C1672x0 invoke(K k10) {
            return new C1672x0(this.f13642a, new a(this.f13643b));
        }
    }

    static final class c extends l implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        Object f13645a;

        /* renamed from: b  reason: collision with root package name */
        int f13646b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f13647c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Q f13648d;

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1672x0 f13649a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Q f13650b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C1672x0 x0Var, Q q10) {
                super(1);
                this.f13649a = x0Var;
                this.f13650b = q10;
            }

            public final void a(Throwable th2) {
                this.f13649a.d();
                this.f13650b.f13636b.f();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Q q10, C6658d dVar) {
            super(2, dVar);
            this.f13648d = q10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            c cVar = new c(this.f13648d, dVar);
            cVar.f13647c = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(C1672x0 x0Var, C6658d dVar) {
            return ((c) create(x0Var, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f13646b;
            if (i10 == 0) {
                w.b(obj);
                C1672x0 x0Var = (C1672x0) this.f13647c;
                Q q10 = this.f13648d;
                this.f13647c = x0Var;
                this.f13645a = q10;
                this.f13646b = 1;
                C5584o oVar = new C5584o(C6680b.c(this), 1);
                oVar.E();
                q10.f13636b.e();
                oVar.s(new a(x0Var, q10));
                Object v10 = oVar.v();
                if (v10 == C6680b.f()) {
                    h.c(this);
                }
                if (v10 == f10) {
                    return f10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                Q q11 = (Q) this.f13645a;
                C1672x0 x0Var2 = (C1672x0) this.f13647c;
                w.b(obj);
            }
            throw new C6527k();
        }
    }

    public Q(View view, T t10, K k10) {
        this.f13635a = view;
        this.f13636b = t10;
        this.f13637c = k10;
    }

    public View a() {
        return this.f13635a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(androidx.compose.ui.platform.L0 r6, qf.C6658d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.platform.Q.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.ui.platform.Q$a r0 = (androidx.compose.ui.platform.Q.a) r0
            int r1 = r0.f13641c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13641c = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.platform.Q$a r0 = new androidx.compose.ui.platform.Q$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f13639a
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f13641c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002d:
            lf.w.b(r7)
            goto L_0x004a
        L_0x0031:
            lf.w.b(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.f13638d
            androidx.compose.ui.platform.Q$b r2 = new androidx.compose.ui.platform.Q$b
            r2.<init>(r6, r5)
            androidx.compose.ui.platform.Q$c r6 = new androidx.compose.ui.platform.Q$c
            r4 = 0
            r6.<init>(r5, r4)
            r0.f13641c = r3
            java.lang.Object r6 = k0.p.d(r7, r2, r6, r0)
            if (r6 != r1) goto L_0x004a
            return r1
        L_0x004a:
            lf.k r6 = new lf.k
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.Q.b(androidx.compose.ui.platform.L0, qf.d):java.lang.Object");
    }

    public final InputConnection e(EditorInfo editorInfo) {
        C1672x0 x0Var = (C1672x0) p.c(this.f13638d);
        if (x0Var != null) {
            return x0Var.c(editorInfo);
        }
        return null;
    }

    public final boolean f() {
        C1672x0 x0Var = (C1672x0) p.c(this.f13638d);
        if (x0Var == null || !x0Var.e()) {
            return false;
        }
        return true;
    }

    public g getCoroutineContext() {
        return this.f13637c.getCoroutineContext();
    }
}
