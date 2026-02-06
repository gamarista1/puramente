package I1;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import Wg.d;
import Wg.g;
import Wg.h;
import Wg.n;
import com.google.android.gms.common.api.a;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import qf.C6658d;
import yf.C6798l;
import yf.p;

public final class l {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final K f2703a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final p f2704b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final d f2705c = g.b(a.e.API_PRIORITY_OTHER, (Wg.a) null, (C6798l) null, 6, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final AtomicInteger f2706d = new AtomicInteger(0);

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f2707a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f2708b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f2709c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C6798l lVar, l lVar2, p pVar) {
            super(1);
            this.f2707a = lVar;
            this.f2708b = lVar2;
            this.f2709c = pVar;
        }

        public final void a(Throwable th2) {
            C6514M m10;
            this.f2707a.invoke(th2);
            this.f2708b.f2705c.j(th2);
            do {
                Object f10 = h.f(this.f2708b.f2705c.i());
                if (f10 == null) {
                    m10 = null;
                    continue;
                } else {
                    this.f2709c.invoke(f10, th2);
                    m10 = C6514M.f71813a;
                    continue;
                }
            } while (m10 != null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C6514M.f71813a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f2710a;

        /* renamed from: b  reason: collision with root package name */
        int f2711b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l f2712c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(l lVar, C6658d dVar) {
            super(2, dVar);
            this.f2712c = lVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new b(this.f2712c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0055 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0061 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x006e  */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r5.f2711b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                lf.w.b(r6)
                goto L_0x0062
            L_0x0012:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x001a:
                java.lang.Object r1 = r5.f2710a
                yf.p r1 = (yf.p) r1
                lf.w.b(r6)
                goto L_0x0056
            L_0x0022:
                lf.w.b(r6)
                I1.l r6 = r5.f2712c
                java.util.concurrent.atomic.AtomicInteger r6 = r6.f2706d
                int r6 = r6.get()
                if (r6 <= 0) goto L_0x0033
                r6 = r3
                goto L_0x0034
            L_0x0033:
                r6 = 0
            L_0x0034:
                if (r6 == 0) goto L_0x0071
            L_0x0036:
                I1.l r6 = r5.f2712c
                Ug.K r6 = r6.f2703a
                Ug.L.f(r6)
                I1.l r6 = r5.f2712c
                yf.p r1 = r6.f2704b
                I1.l r6 = r5.f2712c
                Wg.d r6 = r6.f2705c
                r5.f2710a = r1
                r5.f2711b = r3
                java.lang.Object r6 = r6.l(r5)
                if (r6 != r0) goto L_0x0056
                return r0
            L_0x0056:
                r4 = 0
                r5.f2710a = r4
                r5.f2711b = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L_0x0062
                return r0
            L_0x0062:
                I1.l r6 = r5.f2712c
                java.util.concurrent.atomic.AtomicInteger r6 = r6.f2706d
                int r6 = r6.decrementAndGet()
                if (r6 != 0) goto L_0x0036
                lf.M r6 = lf.C6514M.f71813a
                return r6
            L_0x0071:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: I1.l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public l(K k10, C6798l lVar, p pVar, p pVar2) {
        C6496s.h(k10, "scope");
        C6496s.h(lVar, "onComplete");
        C6496s.h(pVar, "onUndeliveredElement");
        C6496s.h(pVar2, "consumeMessage");
        this.f2703a = k10;
        this.f2704b = pVar2;
        C5600w0 w0Var = (C5600w0) k10.getCoroutineContext().b(C5600w0.f65416O);
        if (w0Var != null) {
            w0Var.P0(new a(lVar, this, pVar));
        }
    }

    public final void e(Object obj) {
        Object c10 = this.f2705c.c(obj);
        if (c10 instanceof h.a) {
            Throwable e10 = h.e(c10);
            if (e10 == null) {
                e10 = new n("Channel was closed normally");
            }
            throw e10;
        } else if (!h.i(c10)) {
            throw new IllegalStateException("Check failed.");
        } else if (this.f2706d.getAndIncrement() == 0) {
            C5600w0 unused = C5576k.d(this.f2703a, (qf.g) null, (M) null, new b(this, (C6658d) null), 3, (Object) null);
        }
    }
}
