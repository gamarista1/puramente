package j4;

import Ug.C5585o0;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import Ug.S;
import Ug.Z;
import android.view.View;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

/* renamed from: j4.w  reason: case insensitive filesystem */
public final class C3636w implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f44792a;

    /* renamed from: b  reason: collision with root package name */
    private C3634u f44793b;

    /* renamed from: c  reason: collision with root package name */
    private C5600w0 f44794c;

    /* renamed from: d  reason: collision with root package name */
    private C3635v f44795d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f44796e;

    /* renamed from: j4.w$a */
    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f44797a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C3636w f44798b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C3636w wVar, C6658d dVar) {
            super(2, dVar);
            this.f44798b = wVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f44798b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f44797a == 0) {
                w.b(obj);
                this.f44798b.c((C3635v) null);
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C3636w(View view) {
        this.f44792a = view;
    }

    public final synchronized void a() {
        try {
            C5600w0 w0Var = this.f44794c;
            if (w0Var != null) {
                C5600w0.a.a(w0Var, (CancellationException) null, 1, (Object) null);
            }
            this.f44794c = C5576k.d(C5585o0.f65402a, Z.c().D1(), (M) null, new a(this, (C6658d) null), 2, (Object) null);
            this.f44793b = null;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final synchronized C3634u b(S s10) {
        C3634u uVar = this.f44793b;
        if (uVar == null || !o4.l.r() || !this.f44796e) {
            C5600w0 w0Var = this.f44794c;
            if (w0Var != null) {
                C5600w0.a.a(w0Var, (CancellationException) null, 1, (Object) null);
            }
            this.f44794c = null;
            C3634u uVar2 = new C3634u(this.f44792a, s10);
            this.f44793b = uVar2;
            return uVar2;
        }
        this.f44796e = false;
        uVar.a(s10);
        return uVar;
    }

    public final void c(C3635v vVar) {
        C3635v vVar2 = this.f44795d;
        if (vVar2 != null) {
            vVar2.a();
        }
        this.f44795d = vVar;
    }

    public void onViewAttachedToWindow(View view) {
        C3635v vVar = this.f44795d;
        if (vVar != null) {
            this.f44796e = true;
            vVar.b();
        }
    }

    public void onViewDetachedFromWindow(View view) {
        C3635v vVar = this.f44795d;
        if (vVar != null) {
            vVar.a();
        }
    }
}
