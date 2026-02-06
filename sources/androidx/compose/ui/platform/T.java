package androidx.compose.ui.platform;

import Ug.C5572i;
import Ug.G;
import Ug.K;
import Ug.Z;
import Y.C1490h0;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6531o;
import lf.w;
import mf.C6558k;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import u1.h;
import yf.C6787a;
import yf.p;

public final class T extends G {

    /* renamed from: m  reason: collision with root package name */
    public static final c f13656m = new c((DefaultConstructorMarker) null);

    /* renamed from: n  reason: collision with root package name */
    public static final int f13657n = 8;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final Lazy f13658o = C6531o.b(a.f13670a);
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static final ThreadLocal f13659p = new b();

    /* renamed from: c  reason: collision with root package name */
    private final Choreographer f13660c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Handler f13661d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Object f13662e;

    /* renamed from: f  reason: collision with root package name */
    private final C6558k f13663f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public List f13664g;

    /* renamed from: h  reason: collision with root package name */
    private List f13665h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f13666i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public boolean f13667j;

    /* renamed from: k  reason: collision with root package name */
    private final d f13668k;

    /* renamed from: l  reason: collision with root package name */
    private final C1490h0 f13669l;

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f13670a = new a();

        /* renamed from: androidx.compose.ui.platform.T$a$a  reason: collision with other inner class name */
        static final class C0260a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f13671a;

            C0260a(C6658d dVar) {
                super(2, dVar);
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new C0260a(dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((C0260a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                C6680b.f();
                if (this.f13671a == 0) {
                    w.b(obj);
                    return Choreographer.getInstance();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        a() {
            super(0);
        }

        /* renamed from: a */
        public final g invoke() {
            Choreographer choreographer;
            if (U.b()) {
                choreographer = Choreographer.getInstance();
            } else {
                choreographer = (Choreographer) C5572i.e(Z.c(), new C0260a((C6658d) null));
            }
            T t10 = new T(choreographer, h.a(Looper.getMainLooper()), (DefaultConstructorMarker) null);
            return t10.n1(t10.M1());
        }
    }

    public static final class b extends ThreadLocal {
        b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public g initialValue() {
            Choreographer instance = Choreographer.getInstance();
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                T t10 = new T(instance, h.a(myLooper), (DefaultConstructorMarker) null);
                return t10.n1(t10.M1());
            }
            throw new IllegalStateException("no Looper on this thread");
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            if (U.b()) {
                return b();
            }
            g gVar = (g) T.f13659p.get();
            if (gVar != null) {
                return gVar;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread");
        }

        public final g b() {
            return (g) T.f13658o.getValue();
        }

        private c() {
        }
    }

    public static final class d implements Choreographer.FrameCallback, Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ T f13672a;

        d(T t10) {
            this.f13672a = t10;
        }

        public void doFrame(long j10) {
            this.f13672a.f13661d.removeCallbacks(this);
            this.f13672a.P1();
            this.f13672a.O1(j10);
        }

        public void run() {
            this.f13672a.P1();
            Object F12 = this.f13672a.f13662e;
            T t10 = this.f13672a;
            synchronized (F12) {
                try {
                    if (t10.f13664g.isEmpty()) {
                        t10.L1().removeFrameCallback(this);
                        t10.f13667j = false;
                    }
                    C6514M m10 = C6514M.f71813a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public /* synthetic */ T(Choreographer choreographer, Handler handler, DefaultConstructorMarker defaultConstructorMarker) {
        this(choreographer, handler);
    }

    private final Runnable N1() {
        Runnable runnable;
        synchronized (this.f13662e) {
            runnable = (Runnable) this.f13663f.E();
        }
        return runnable;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        r0 = r2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r1 >= r0) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        ((android.view.Choreographer.FrameCallback) r2.get(r1)).doFrame(r5);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        r2.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void O1(long r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f13662e
            monitor-enter(r0)
            boolean r1 = r4.f13667j     // Catch:{ all -> 0x002b }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            r1 = 0
            r4.f13667j = r1     // Catch:{ all -> 0x002b }
            java.util.List r2 = r4.f13664g     // Catch:{ all -> 0x002b }
            java.util.List r3 = r4.f13665h     // Catch:{ all -> 0x002b }
            r4.f13664g = r3     // Catch:{ all -> 0x002b }
            r4.f13665h = r2     // Catch:{ all -> 0x002b }
            monitor-exit(r0)
            int r0 = r2.size()
        L_0x0019:
            if (r1 >= r0) goto L_0x0027
            java.lang.Object r3 = r2.get(r1)
            android.view.Choreographer$FrameCallback r3 = (android.view.Choreographer.FrameCallback) r3
            r3.doFrame(r5)
            int r1 = r1 + 1
            goto L_0x0019
        L_0x0027:
            r2.clear()
            return
        L_0x002b:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.T.O1(long):void");
    }

    /* access modifiers changed from: private */
    public final void P1() {
        boolean z10;
        do {
            Runnable N12 = N1();
            while (N12 != null) {
                N12.run();
                N12 = N1();
            }
            synchronized (this.f13662e) {
                if (this.f13663f.isEmpty()) {
                    z10 = false;
                    this.f13666i = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    public final Choreographer L1() {
        return this.f13660c;
    }

    public final C1490h0 M1() {
        return this.f13669l;
    }

    public final void Q1(Choreographer.FrameCallback frameCallback) {
        synchronized (this.f13662e) {
            try {
                this.f13664g.add(frameCallback);
                if (!this.f13667j) {
                    this.f13667j = true;
                    this.f13660c.postFrameCallback(this.f13668k);
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void R1(Choreographer.FrameCallback frameCallback) {
        synchronized (this.f13662e) {
            this.f13664g.remove(frameCallback);
        }
    }

    public void z1(g gVar, Runnable runnable) {
        synchronized (this.f13662e) {
            try {
                this.f13663f.addLast(runnable);
                if (!this.f13666i) {
                    this.f13666i = true;
                    this.f13661d.post(this.f13668k);
                    if (!this.f13667j) {
                        this.f13667j = true;
                        this.f13660c.postFrameCallback(this.f13668k);
                    }
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private T(Choreographer choreographer, Handler handler) {
        this.f13660c = choreographer;
        this.f13661d = handler;
        this.f13662e = new Object();
        this.f13663f = new C6558k();
        this.f13664g = new ArrayList();
        this.f13665h = new ArrayList();
        this.f13668k = new d(this);
        this.f13669l = new V(choreographer, this);
    }
}
