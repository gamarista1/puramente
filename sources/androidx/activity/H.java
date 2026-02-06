package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1795s;
import androidx.lifecycle.C1798v;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.C6558k;
import x1.C2896a;
import yf.C6787a;
import yf.C6798l;

public final class H {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f10748a;

    /* renamed from: b  reason: collision with root package name */
    private final C2896a f10749b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C6558k f10750c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public G f10751d;

    /* renamed from: e  reason: collision with root package name */
    private OnBackInvokedCallback f10752e;

    /* renamed from: f  reason: collision with root package name */
    private OnBackInvokedDispatcher f10753f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f10754g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f10755h;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ H f10756a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(H h10) {
            super(1);
            this.f10756a = h10;
        }

        public final void a(C1546b bVar) {
            C6496s.h(bVar, "backEvent");
            this.f10756a.n(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1546b) obj);
            return C6514M.f71813a;
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ H f10757a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(H h10) {
            super(1);
            this.f10757a = h10;
        }

        public final void a(C1546b bVar) {
            C6496s.h(bVar, "backEvent");
            this.f10757a.m(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1546b) obj);
            return C6514M.f71813a;
        }
    }

    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ H f10758a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(H h10) {
            super(0);
            this.f10758a = h10;
        }

        public final void invoke() {
            this.f10758a.l();
        }
    }

    static final class d extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ H f10759a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(H h10) {
            super(0);
            this.f10759a = h10;
        }

        public final void invoke() {
            this.f10759a.k();
        }
    }

    static final class e extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ H f10760a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(H h10) {
            super(0);
            this.f10760a = h10;
        }

        public final void invoke() {
            this.f10760a.l();
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f10761a = new f();

        private f() {
        }

        /* access modifiers changed from: private */
        public static final void c(C6787a aVar) {
            C6496s.h(aVar, "$onBackInvoked");
            aVar.invoke();
        }

        public final OnBackInvokedCallback b(C6787a aVar) {
            C6496s.h(aVar, "onBackInvoked");
            return new I(aVar);
        }

        public final void d(Object obj, int i10, Object obj2) {
            C6496s.h(obj, "dispatcher");
            C6496s.h(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) obj2);
        }

        public final void e(Object obj, Object obj2) {
            C6496s.h(obj, "dispatcher");
            C6496s.h(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public static final g f10762a = new g();

        public static final class a implements OnBackAnimationCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C6798l f10763a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C6798l f10764b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C6787a f10765c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C6787a f10766d;

            a(C6798l lVar, C6798l lVar2, C6787a aVar, C6787a aVar2) {
                this.f10763a = lVar;
                this.f10764b = lVar2;
                this.f10765c = aVar;
                this.f10766d = aVar2;
            }

            public void onBackCancelled() {
                this.f10766d.invoke();
            }

            public void onBackInvoked() {
                this.f10765c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                C6496s.h(backEvent, "backEvent");
                this.f10764b.invoke(new C1546b(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                C6496s.h(backEvent, "backEvent");
                this.f10763a.invoke(new C1546b(backEvent));
            }
        }

        private g() {
        }

        public final OnBackInvokedCallback a(C6798l lVar, C6798l lVar2, C6787a aVar, C6787a aVar2) {
            C6496s.h(lVar, "onBackStarted");
            C6496s.h(lVar2, "onBackProgressed");
            C6496s.h(aVar, "onBackInvoked");
            C6496s.h(aVar2, "onBackCancelled");
            return new a(lVar, lVar2, aVar, aVar2);
        }
    }

    private final class h implements C1795s, C1547c {

        /* renamed from: a  reason: collision with root package name */
        private final C1790m f10767a;

        /* renamed from: b  reason: collision with root package name */
        private final G f10768b;

        /* renamed from: c  reason: collision with root package name */
        private C1547c f10769c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ H f10770d;

        public h(H h10, C1790m mVar, G g10) {
            C6496s.h(mVar, "lifecycle");
            C6496s.h(g10, "onBackPressedCallback");
            this.f10770d = h10;
            this.f10767a = mVar;
            this.f10768b = g10;
            mVar.a(this);
        }

        public void cancel() {
            this.f10767a.d(this);
            this.f10768b.i(this);
            C1547c cVar = this.f10769c;
            if (cVar != null) {
                cVar.cancel();
            }
            this.f10769c = null;
        }

        public void f(C1798v vVar, C1790m.a aVar) {
            C6496s.h(vVar, "source");
            C6496s.h(aVar, "event");
            if (aVar == C1790m.a.ON_START) {
                this.f10769c = this.f10770d.j(this.f10768b);
            } else if (aVar == C1790m.a.ON_STOP) {
                C1547c cVar = this.f10769c;
                if (cVar != null) {
                    cVar.cancel();
                }
            } else if (aVar == C1790m.a.ON_DESTROY) {
                cancel();
            }
        }
    }

    private final class i implements C1547c {

        /* renamed from: a  reason: collision with root package name */
        private final G f10771a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ H f10772b;

        public i(H h10, G g10) {
            C6496s.h(g10, "onBackPressedCallback");
            this.f10772b = h10;
            this.f10771a = g10;
        }

        public void cancel() {
            this.f10772b.f10750c.remove(this.f10771a);
            if (C6496s.c(this.f10772b.f10751d, this.f10771a)) {
                this.f10771a.c();
                this.f10772b.f10751d = null;
            }
            this.f10771a.i(this);
            C6787a b10 = this.f10771a.b();
            if (b10 != null) {
                b10.invoke();
            }
            this.f10771a.k((C6787a) null);
        }
    }

    /* synthetic */ class j extends C6494p implements C6787a {
        j(Object obj) {
            super(0, obj, H.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public final void invoke() {
            ((H) this.receiver).q();
        }
    }

    /* synthetic */ class k extends C6494p implements C6787a {
        k(Object obj) {
            super(0, obj, H.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public final void invoke() {
            ((H) this.receiver).q();
        }
    }

    public H(Runnable runnable, C2896a aVar) {
        OnBackInvokedCallback onBackInvokedCallback;
        this.f10748a = runnable;
        this.f10749b = aVar;
        this.f10750c = new C6558k();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            if (i10 >= 34) {
                onBackInvokedCallback = g.f10762a.a(new a(this), new b(this), new c(this), new d(this));
            } else {
                onBackInvokedCallback = f.f10761a.b(new e(this));
            }
            this.f10752e = onBackInvokedCallback;
        }
    }

    /* access modifiers changed from: private */
    public final void k() {
        Object obj;
        G g10 = this.f10751d;
        if (g10 == null) {
            C6558k kVar = this.f10750c;
            ListIterator listIterator = kVar.listIterator(kVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((G) obj).g()) {
                    break;
                }
            }
            g10 = (G) obj;
        }
        this.f10751d = null;
        if (g10 != null) {
            g10.c();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.activity.G} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: androidx.activity.G} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: androidx.activity.G} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: androidx.activity.G} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(androidx.activity.C1546b r4) {
        /*
            r3 = this;
            androidx.activity.G r0 = r3.f10751d
            if (r0 != 0) goto L_0x0026
            mf.k r0 = r3.f10750c
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        L_0x000e:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L_0x0022
            java.lang.Object r1 = r0.previous()
            r2 = r1
            androidx.activity.G r2 = (androidx.activity.G) r2
            boolean r2 = r2.g()
            if (r2 == 0) goto L_0x000e
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            r0 = r1
            androidx.activity.G r0 = (androidx.activity.G) r0
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            r0.e(r4)
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.H.m(androidx.activity.b):void");
    }

    /* access modifiers changed from: private */
    public final void n(C1546b bVar) {
        Object obj;
        C6558k kVar = this.f10750c;
        ListIterator listIterator = kVar.listIterator(kVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((G) obj).g()) {
                break;
            }
        }
        G g10 = (G) obj;
        if (this.f10751d != null) {
            k();
        }
        this.f10751d = g10;
        if (g10 != null) {
            g10.f(bVar);
        }
    }

    private final void p(boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f10753f;
        OnBackInvokedCallback onBackInvokedCallback = this.f10752e;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            if (z10 && !this.f10754g) {
                f.f10761a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f10754g = true;
            } else if (!z10 && this.f10754g) {
                f.f10761a.e(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f10754g = false;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void q() {
        boolean z10 = this.f10755h;
        C6558k kVar = this.f10750c;
        boolean z11 = false;
        if (kVar == null || !kVar.isEmpty()) {
            Iterator it = kVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((G) it.next()).g()) {
                        z11 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.f10755h = z11;
        if (z11 != z10) {
            C2896a aVar = this.f10749b;
            if (aVar != null) {
                aVar.accept(Boolean.valueOf(z11));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                p(z11);
            }
        }
    }

    public final void h(G g10) {
        C6496s.h(g10, "onBackPressedCallback");
        j(g10);
    }

    public final void i(C1798v vVar, G g10) {
        C6496s.h(vVar, "owner");
        C6496s.h(g10, "onBackPressedCallback");
        C1790m lifecycle = vVar.getLifecycle();
        if (lifecycle.b() != C1790m.b.DESTROYED) {
            g10.a(new h(this, lifecycle, g10));
            q();
            g10.k(new j(this));
        }
    }

    public final C1547c j(G g10) {
        C6496s.h(g10, "onBackPressedCallback");
        this.f10750c.add(g10);
        i iVar = new i(this, g10);
        g10.a(iVar);
        q();
        g10.k(new k(this));
        return iVar;
    }

    public final void l() {
        Object obj;
        G g10 = this.f10751d;
        if (g10 == null) {
            C6558k kVar = this.f10750c;
            ListIterator listIterator = kVar.listIterator(kVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((G) obj).g()) {
                    break;
                }
            }
            g10 = (G) obj;
        }
        this.f10751d = null;
        if (g10 != null) {
            g10.d();
            return;
        }
        Runnable runnable = this.f10748a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void o(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        C6496s.h(onBackInvokedDispatcher, "invoker");
        this.f10753f = onBackInvokedDispatcher;
        p(this.f10755h);
    }

    public H(Runnable runnable) {
        this(runnable, (C2896a) null);
    }
}
