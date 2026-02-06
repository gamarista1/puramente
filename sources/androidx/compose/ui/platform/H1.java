package androidx.compose.ui.platform;

import Ug.C5585o0;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import Vg.f;
import Y.O0;
import Y.r;
import android.view.View;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

public final class H1 {

    /* renamed from: a  reason: collision with root package name */
    public static final H1 f13529a = new H1();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReference f13530b = new AtomicReference(G1.f13525a.c());

    /* renamed from: c  reason: collision with root package name */
    public static final int f13531c = 8;

    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5600w0 f13532a;

        a(C5600w0 w0Var) {
            this.f13532a = w0Var;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            C5600w0.a.a(this.f13532a, (CancellationException) null, 1, (Object) null);
        }
    }

    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f13533a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ O0 f13534b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f13535c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(O0 o02, View view, C6658d dVar) {
            super(2, dVar);
            this.f13534b = o02;
            this.f13535c = view;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new b(this.f13534b, this.f13535c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f13533a;
            if (i10 == 0) {
                w.b(obj);
                O0 o02 = this.f13534b;
                this.f13533a = 1;
                if (o02.k0(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    w.b(obj);
                } catch (Throwable th2) {
                    if (I1.f(this.f13535c) == this.f13534b) {
                        I1.i(this.f13535c, (r) null);
                    }
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (I1.f(this.f13535c) == this.f13534b) {
                I1.i(this.f13535c, (r) null);
            }
            return C6514M.f71813a;
        }
    }

    private H1() {
    }

    public final O0 a(View view) {
        O0 a10 = ((G1) f13530b.get()).a(view);
        I1.i(view, a10);
        view.addOnAttachStateChangeListener(new a(C5576k.d(C5585o0.f65402a, f.b(view.getHandler(), "windowRecomposer cleanup").F1(), (M) null, new b(a10, view, (C6658d) null), 2, (Object) null)));
        return a10;
    }
}
