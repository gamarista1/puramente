package V;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import W.s;
import Y.C1500m;
import Y.C1506p;
import Y.C1510r0;
import Y.M0;
import Y.Y0;
import Y.o1;
import Y.r;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.compose.ui.platform.C1613a;
import androidx.compose.ui.window.j;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import w.C2782a;
import w.C2797i;
import yf.C6787a;
import yf.C6798l;
import yf.p;

/* renamed from: V.g0  reason: case insensitive filesystem */
final class C1382g0 extends C1613a implements j {

    /* renamed from: a  reason: collision with root package name */
    private final Window f7465a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f7466b;

    /* renamed from: c  reason: collision with root package name */
    private final C6787a f7467c;

    /* renamed from: d  reason: collision with root package name */
    private final C2782a f7468d;

    /* renamed from: e  reason: collision with root package name */
    private final K f7469e;

    /* renamed from: f  reason: collision with root package name */
    private final C1510r0 f7470f = u1.d(C1412w.f8072a.a(), (o1) null, 2, (Object) null);

    /* renamed from: g  reason: collision with root package name */
    private Object f7471g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7472h;

    /* renamed from: V.g0$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f7473a = new a();

        private a() {
        }

        public static final OnBackInvokedCallback b(C6787a aVar) {
            return new C1380f0(aVar);
        }

        /* access modifiers changed from: private */
        public static final void c(C6787a aVar) {
            aVar.invoke();
        }

        public static final void d(View view, Object obj) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if ((obj instanceof OnBackInvokedCallback) && (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, (OnBackInvokedCallback) obj);
            }
        }

        public static final void e(View view, Object obj) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if ((obj instanceof OnBackInvokedCallback) && (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
            }
        }
    }

    /* renamed from: V.g0$b */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f7474a = new b();

        /* renamed from: V.g0$b$a */
        public static final class a implements OnBackAnimationCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ K f7475a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C2782a f7476b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C6787a f7477c;

            /* renamed from: V.g0$b$a$a  reason: collision with other inner class name */
            static final class C0166a extends l implements p {

                /* renamed from: a  reason: collision with root package name */
                int f7478a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C2782a f7479b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0166a(C2782a aVar, C6658d dVar) {
                    super(2, dVar);
                    this.f7479b = aVar;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new C0166a(this.f7479b, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((C0166a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C6680b.f();
                    int i10 = this.f7478a;
                    if (i10 == 0) {
                        w.b(obj);
                        C2782a aVar = this.f7479b;
                        Float b10 = kotlin.coroutines.jvm.internal.b.b(0.0f);
                        this.f7478a = 1;
                        if (C2782a.f(aVar, b10, (C2797i) null, (Object) null, (C6798l) null, this, 14, (Object) null) == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        w.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return C6514M.f71813a;
                }
            }

            /* renamed from: V.g0$b$a$b  reason: collision with other inner class name */
            static final class C0167b extends l implements p {

                /* renamed from: a  reason: collision with root package name */
                int f7480a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C2782a f7481b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ BackEvent f7482c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0167b(C2782a aVar, BackEvent backEvent, C6658d dVar) {
                    super(2, dVar);
                    this.f7481b = aVar;
                    this.f7482c = backEvent;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new C0167b(this.f7481b, this.f7482c, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((C0167b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C6680b.f();
                    int i10 = this.f7480a;
                    if (i10 == 0) {
                        w.b(obj);
                        C2782a aVar = this.f7481b;
                        Float b10 = kotlin.coroutines.jvm.internal.b.b(s.f8391a.a(this.f7482c.getProgress()));
                        this.f7480a = 1;
                        if (aVar.t(b10, this) == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        w.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return C6514M.f71813a;
                }
            }

            /* renamed from: V.g0$b$a$c */
            static final class c extends l implements p {

                /* renamed from: a  reason: collision with root package name */
                int f7483a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C2782a f7484b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ BackEvent f7485c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                c(C2782a aVar, BackEvent backEvent, C6658d dVar) {
                    super(2, dVar);
                    this.f7484b = aVar;
                    this.f7485c = backEvent;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new c(this.f7484b, this.f7485c, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C6680b.f();
                    int i10 = this.f7483a;
                    if (i10 == 0) {
                        w.b(obj);
                        C2782a aVar = this.f7484b;
                        Float b10 = kotlin.coroutines.jvm.internal.b.b(s.f8391a.a(this.f7485c.getProgress()));
                        this.f7483a = 1;
                        if (aVar.t(b10, this) == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        w.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return C6514M.f71813a;
                }
            }

            a(K k10, C2782a aVar, C6787a aVar2) {
                this.f7475a = k10;
                this.f7476b = aVar;
                this.f7477c = aVar2;
            }

            public void onBackCancelled() {
                C5600w0 unused = C5576k.d(this.f7475a, (g) null, (M) null, new C0166a(this.f7476b, (C6658d) null), 3, (Object) null);
            }

            public void onBackInvoked() {
                this.f7477c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                C5600w0 unused = C5576k.d(this.f7475a, (g) null, (M) null, new C0167b(this.f7476b, backEvent, (C6658d) null), 3, (Object) null);
            }

            public void onBackStarted(BackEvent backEvent) {
                C5600w0 unused = C5576k.d(this.f7475a, (g) null, (M) null, new c(this.f7476b, backEvent, (C6658d) null), 3, (Object) null);
            }
        }

        private b() {
        }

        public static final OnBackAnimationCallback a(C6787a aVar, C2782a aVar2, K k10) {
            return new a(k10, aVar2, aVar);
        }
    }

    /* renamed from: V.g0$c */
    static final class c extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1382g0 f7486a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f7487b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C1382g0 g0Var, int i10) {
            super(2);
            this.f7486a = g0Var;
            this.f7487b = i10;
        }

        public final void a(C1500m mVar, int i10) {
            this.f7486a.Content(mVar, M0.a(this.f7487b | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public C1382g0(Context context, Window window, boolean z10, C6787a aVar, C2782a aVar2, K k10) {
        super(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        this.f7465a = window;
        this.f7466b = z10;
        this.f7467c = aVar;
        this.f7468d = aVar2;
        this.f7469e = k10;
    }

    private final void g() {
        int i10;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f7466b && (i10 = Build.VERSION.SDK_INT) >= 33) {
            if (this.f7471g == null) {
                if (i10 >= 34) {
                    onBackInvokedCallback = androidx.appcompat.app.l.a(b.a(this.f7467c, this.f7468d, this.f7469e));
                } else {
                    onBackInvokedCallback = a.b(this.f7467c);
                }
                this.f7471g = onBackInvokedCallback;
            }
            a.d(this, this.f7471g);
        }
    }

    private final p getContent() {
        return (p) this.f7470f.getValue();
    }

    private final void h() {
        if (Build.VERSION.SDK_INT >= 33) {
            a.e(this, this.f7471g);
        }
        this.f7471g = null;
    }

    private final void setContent(p pVar) {
        this.f7470f.setValue(pVar);
    }

    public void Content(C1500m mVar, int i10) {
        int i11;
        int i12;
        C1500m h10 = mVar.h(576708319);
        if ((i10 & 6) == 0) {
            if (h10.C(this)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(576708319, i11, -1, "androidx.compose.material3.ModalBottomSheetDialogLayout.Content (ModalBottomSheet.android.kt:352)");
            }
            getContent().invoke(h10, 0);
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new c(this, i10));
        }
    }

    public Window a() {
        return this.f7465a;
    }

    /* access modifiers changed from: protected */
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f7472h;
    }

    public final void i(r rVar, p pVar) {
        setParentCompositionContext(rVar);
        setContent(pVar);
        this.f7472h = true;
        createComposition();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }
}
