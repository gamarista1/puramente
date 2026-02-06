package androidx.compose.ui.platform;

import Ug.C5600w0;
import Ug.K;
import Ug.L;
import Ug.M;
import Wg.d;
import Wg.g;
import i0.C2057k;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import qf.C6658d;
import yf.C6798l;
import yf.p;

/* renamed from: androidx.compose.ui.platform.t0  reason: case insensitive filesystem */
public final class C1664t0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C1664t0 f13944a = new C1664t0();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f13945b = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicBoolean f13946c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    public static final int f13947d = 8;

    /* renamed from: androidx.compose.ui.platform.t0$a */
    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f13948a;

        /* renamed from: b  reason: collision with root package name */
        Object f13949b;

        /* renamed from: c  reason: collision with root package name */
        int f13950c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f13951d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, C6658d dVar2) {
            super(2, dVar2);
            this.f13951d = dVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f13951d, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
            Wg.k.a(r3, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
            throw r0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0040 A[Catch:{ all -> 0x005e }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r5.f13950c
                r2 = 1
                if (r1 == 0) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                java.lang.Object r1 = r5.f13949b
                Wg.f r1 = (Wg.f) r1
                java.lang.Object r3 = r5.f13948a
                Wg.t r3 = (Wg.t) r3
                lf.w.b(r6)     // Catch:{ all -> 0x0017 }
                goto L_0x0038
            L_0x0017:
                r6 = move-exception
                goto L_0x005d
            L_0x0019:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x0021:
                lf.w.b(r6)
                Wg.d r3 = r5.f13951d
                Wg.f r6 = r3.iterator()     // Catch:{ all -> 0x0017 }
                r1 = r6
            L_0x002b:
                r5.f13948a = r3     // Catch:{ all -> 0x0017 }
                r5.f13949b = r1     // Catch:{ all -> 0x0017 }
                r5.f13950c = r2     // Catch:{ all -> 0x0017 }
                java.lang.Object r6 = r1.a(r5)     // Catch:{ all -> 0x0017 }
                if (r6 != r0) goto L_0x0038
                return r0
            L_0x0038:
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0017 }
                boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0017 }
                if (r6 == 0) goto L_0x0054
                java.lang.Object r6 = r1.next()     // Catch:{ all -> 0x0017 }
                lf.M r6 = (lf.C6514M) r6     // Catch:{ all -> 0x0017 }
                java.util.concurrent.atomic.AtomicBoolean r6 = androidx.compose.ui.platform.C1664t0.f13946c     // Catch:{ all -> 0x0017 }
                r4 = 0
                r6.set(r4)     // Catch:{ all -> 0x0017 }
                i0.k$a r6 = i0.C2057k.f21728e     // Catch:{ all -> 0x0017 }
                r6.n()     // Catch:{ all -> 0x0017 }
                goto L_0x002b
            L_0x0054:
                lf.M r6 = lf.C6514M.f71813a     // Catch:{ all -> 0x0017 }
                r6 = 0
                Wg.k.a(r3, r6)
                lf.M r6 = lf.C6514M.f71813a
                return r6
            L_0x005d:
                throw r6     // Catch:{ all -> 0x005e }
            L_0x005e:
                r0 = move-exception
                Wg.k.a(r3, r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C1664t0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: androidx.compose.ui.platform.t0$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f13952a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(1);
            this.f13952a = dVar;
        }

        public final void a(Object obj) {
            if (C1664t0.f13946c.compareAndSet(false, true)) {
                this.f13952a.c(C6514M.f71813a);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return C6514M.f71813a;
        }
    }

    private C1664t0() {
    }

    public final void b() {
        if (f13945b.compareAndSet(false, true)) {
            d b10 = g.b(1, (Wg.a) null, (C6798l) null, 6, (Object) null);
            C5600w0 unused = C5576k.d(L.a(T.f13656m.b()), (qf.g) null, (M) null, new a(b10, (C6658d) null), 3, (Object) null);
            C2057k.f21728e.k(new b(b10));
        }
    }
}
