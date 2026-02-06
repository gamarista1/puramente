package N0;

import O0.h;
import O0.n;
import O0.q;
import Ug.C5600w0;
import Ug.K;
import Ug.K0;
import Ug.L;
import Ug.M;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import c1.p;
import java.util.function.Consumer;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.C6527k;
import lf.w;
import q0.C2421g;
import q0.C2422h;
import qf.C6658d;
import r0.Z1;
import rf.C6680b;
import yf.C6798l;

public final class d implements ScrollCaptureCallback {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final n f4337a;

    /* renamed from: b  reason: collision with root package name */
    private final p f4338b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final a f4339c;

    /* renamed from: d  reason: collision with root package name */
    private final K f4340d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final h f4341e;

    /* renamed from: f  reason: collision with root package name */
    private int f4342f;

    public interface a {
        void a();

        void b();
    }

    static final class b extends l implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        int f4343a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f4344b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Runnable f4345c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, Runnable runnable, C6658d dVar2) {
            super(2, dVar2);
            this.f4344b = dVar;
            this.f4345c = runnable;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new b(this.f4344b, this.f4345c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f4343a;
            if (i10 == 0) {
                w.b(obj);
                h c10 = this.f4344b.f4341e;
                this.f4343a = 1;
                if (c10.g(0.0f, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f4344b.f4339c.b();
            this.f4345c.run();
            return C6514M.f71813a;
        }
    }

    static final class c extends l implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        int f4346a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f4347b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ScrollCaptureSession f4348c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Rect f4349d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Consumer f4350e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, C6658d dVar2) {
            super(2, dVar2);
            this.f4347b = dVar;
            this.f4348c = scrollCaptureSession;
            this.f4349d = rect;
            this.f4350e = consumer;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new c(this.f4347b, this.f4348c, this.f4349d, this.f4350e, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f4346a;
            if (i10 == 0) {
                w.b(obj);
                d dVar = this.f4347b;
                ScrollCaptureSession scrollCaptureSession = this.f4348c;
                p d10 = Z1.d(this.f4349d);
                this.f4346a = 1;
                obj = dVar.e(scrollCaptureSession, d10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f4350e.accept(Z1.a((p) obj));
            return C6514M.f71813a;
        }
    }

    /* renamed from: N0.d$d  reason: collision with other inner class name */
    static final class C0109d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f4351a;

        /* renamed from: b  reason: collision with root package name */
        Object f4352b;

        /* renamed from: c  reason: collision with root package name */
        Object f4353c;

        /* renamed from: d  reason: collision with root package name */
        int f4354d;

        /* renamed from: e  reason: collision with root package name */
        int f4355e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f4356f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f4357g;

        /* renamed from: h  reason: collision with root package name */
        int f4358h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0109d(d dVar, C6658d dVar2) {
            super(dVar2);
            this.f4357g = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f4356f = obj;
            this.f4358h |= Integer.MIN_VALUE;
            return this.f4357g.e((ScrollCaptureSession) null, (p) null, this);
        }
    }

    static final class f extends l implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        boolean f4360a;

        /* renamed from: b  reason: collision with root package name */
        int f4361b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ float f4362c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f4363d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar, C6658d dVar2) {
            super(2, dVar2);
            this.f4363d = dVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            f fVar = new f(this.f4363d, dVar);
            fVar.f4362c = ((Number) obj).floatValue();
            return fVar;
        }

        public final Object i(float f10, C6658d dVar) {
            return ((f) create(Float.valueOf(f10), dVar)).invokeSuspend(C6514M.f71813a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Number) obj).floatValue(), (C6658d) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z10;
            Object f10 = C6680b.f();
            int i10 = this.f4361b;
            if (i10 == 0) {
                w.b(obj);
                float f11 = this.f4362c;
                yf.p c10 = n.c(this.f4363d.f4337a);
                if (c10 != null) {
                    boolean b10 = ((h) this.f4363d.f4337a.w().r(q.f4613a.I())).b();
                    if (b10) {
                        f11 = -f11;
                    }
                    C2421g d10 = C2421g.d(C2422h.a(0.0f, f11));
                    this.f4360a = b10;
                    this.f4361b = 1;
                    obj = c10.invoke(d10, this);
                    if (obj == f10) {
                        return f10;
                    }
                    z10 = b10;
                } else {
                    G0.a.c("Required value was null.");
                    throw new C6527k();
                }
            } else if (i10 == 1) {
                z10 = this.f4360a;
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            float n10 = C2421g.n(((C2421g) obj).v());
            if (z10) {
                n10 = -n10;
            }
            return kotlin.coroutines.jvm.internal.b.b(n10);
        }
    }

    public d(n nVar, p pVar, K k10, a aVar) {
        this.f4337a = nVar;
        this.f4338b = pVar;
        this.f4339c = aVar;
        this.f4340d = L.h(k10, g.f4366a);
        this.f4341e = new h(pVar.f(), new f(this, (C6658d) null));
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0096 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(android.view.ScrollCaptureSession r9, c1.p r10, qf.C6658d r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof N0.d.C0109d
            if (r0 == 0) goto L_0x0013
            r0 = r11
            N0.d$d r0 = (N0.d.C0109d) r0
            int r1 = r0.f4358h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f4358h = r1
            goto L_0x0018
        L_0x0013:
            N0.d$d r0 = new N0.d$d
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f4356f
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f4358h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0061
            if (r2 == r4) goto L_0x0047
            if (r2 != r3) goto L_0x003f
            int r9 = r0.f4355e
            int r10 = r0.f4354d
            java.lang.Object r1 = r0.f4353c
            c1.p r1 = (c1.p) r1
            java.lang.Object r2 = r0.f4352b
            android.view.ScrollCaptureSession r2 = N0.a.a(r2)
            java.lang.Object r0 = r0.f4351a
            N0.d r0 = (N0.d) r0
            lf.w.b(r11)
            r11 = r2
            goto L_0x009c
        L_0x003f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0047:
            int r9 = r0.f4355e
            int r10 = r0.f4354d
            java.lang.Object r2 = r0.f4353c
            c1.p r2 = (c1.p) r2
            java.lang.Object r4 = r0.f4352b
            android.view.ScrollCaptureSession r4 = N0.a.a(r4)
            java.lang.Object r5 = r0.f4351a
            N0.d r5 = (N0.d) r5
            lf.w.b(r11)
            r11 = r10
            r10 = r2
            r2 = r9
            r9 = r4
            goto L_0x0082
        L_0x0061:
            lf.w.b(r11)
            int r11 = r10.i()
            int r2 = r10.d()
            N0.h r5 = r8.f4341e
            r0.f4351a = r8
            r0.f4352b = r9
            r0.f4353c = r10
            r0.f4354d = r11
            r0.f4355e = r2
            r0.f4358h = r4
            java.lang.Object r4 = r5.f(r11, r2, r0)
            if (r4 != r1) goto L_0x0081
            return r1
        L_0x0081:
            r5 = r8
        L_0x0082:
            N0.d$e r4 = N0.d.e.f4359a
            r0.f4351a = r5
            r0.f4352b = r9
            r0.f4353c = r10
            r0.f4354d = r11
            r0.f4355e = r2
            r0.f4358h = r3
            java.lang.Object r0 = Y.C1495j0.c(r4, r0)
            if (r0 != r1) goto L_0x0097
            return r1
        L_0x0097:
            r1 = r10
            r10 = r11
            r0 = r5
            r11 = r9
            r9 = r2
        L_0x009c:
            N0.h r2 = r0.f4341e
            int r10 = r2.c(r10)
            N0.h r2 = r0.f4341e
            int r9 = r2.c(r9)
            r6 = 5
            r7 = 0
            r2 = 0
            r4 = 0
            r3 = r10
            r5 = r9
            c1.p r1 = c1.p.c(r1, r2, r3, r4, r5, r6, r7)
            if (r10 != r9) goto L_0x00bb
            c1.p$a r9 = c1.p.f19229e
            c1.p r9 = r9.a()
            return r9
        L_0x00bb:
            O0.n r9 = r0.f4337a
            J0.c0 r9 = r9.e()
            if (r9 == 0) goto L_0x0109
            android.view.Surface r10 = r11.getSurface()
            android.graphics.Canvas r10 = r10.lockHardwareCanvas()
            android.graphics.BlendMode r2 = android.graphics.BlendMode.CLEAR     // Catch:{ all -> 0x0100 }
            r3 = 0
            r10.drawColor(r3, r2)     // Catch:{ all -> 0x0100 }
            r0.p0 r2 = r0.C2448H.b(r10)     // Catch:{ all -> 0x0100 }
            int r4 = r1.g()     // Catch:{ all -> 0x0100 }
            float r4 = (float) r4     // Catch:{ all -> 0x0100 }
            float r4 = -r4
            int r5 = r1.i()     // Catch:{ all -> 0x0100 }
            float r5 = (float) r5     // Catch:{ all -> 0x0100 }
            float r5 = -r5
            r2.d(r4, r5)     // Catch:{ all -> 0x0100 }
            r4 = 0
            r9.m2(r2, r4)     // Catch:{ all -> 0x0100 }
            android.view.Surface r9 = r11.getSurface()
            r9.unlockCanvasAndPost(r10)
            N0.h r9 = r0.f4341e
            float r9 = r9.b()
            int r9 = Af.a.d(r9)
            c1.p r9 = r1.m(r3, r9)
            return r9
        L_0x0100:
            r9 = move-exception
            android.view.Surface r11 = r11.getSurface()
            r11.unlockCanvasAndPost(r10)
            throw r9
        L_0x0109:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Could not find coordinator for semantics node."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.d.e(android.view.ScrollCaptureSession, c1.p, qf.d):java.lang.Object");
    }

    public void onScrollCaptureEnd(Runnable runnable) {
        C5600w0 unused = C5576k.d(this.f4340d, K0.f65319b, (M) null, new b(this, runnable, (C6658d) null), 2, (Object) null);
    }

    public void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        C5600w0 unused = f.c(this.f4340d, cancellationSignal, new c(this, scrollCaptureSession, rect, consumer, (C6658d) null));
    }

    public void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(Z1.a(this.f4338b));
    }

    public void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f4341e.d();
        this.f4342f = 0;
        this.f4339c.a();
        runnable.run();
    }

    static final class e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final e f4359a = new e();

        e() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return C6514M.f71813a;
        }

        public final void a(long j10) {
        }
    }
}
