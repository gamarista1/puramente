package x;

import Ug.C5600w0;
import Ug.K;
import Ug.L;
import dh.C5817a;
import dh.c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import qf.C6658d;
import w.C2780Y;
import yf.p;

/* renamed from: x.N  reason: case insensitive filesystem */
public final class C2850N {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f27873a = new AtomicReference((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C5817a f27874b = c.b(false, 1, (Object) null);

    /* renamed from: x.N$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C2848L f27875a;

        /* renamed from: b  reason: collision with root package name */
        private final C5600w0 f27876b;

        public a(C2848L l10, C5600w0 w0Var) {
            this.f27875a = l10;
            this.f27876b = w0Var;
        }

        public final boolean a(a aVar) {
            if (this.f27875a.compareTo(aVar.f27875a) >= 0) {
                return true;
            }
            return false;
        }

        public final void b() {
            this.f27876b.n(new C2849M());
        }
    }

    /* renamed from: x.N$b */
    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f27877a;

        /* renamed from: b  reason: collision with root package name */
        Object f27878b;

        /* renamed from: c  reason: collision with root package name */
        Object f27879c;

        /* renamed from: d  reason: collision with root package name */
        Object f27880d;

        /* renamed from: e  reason: collision with root package name */
        int f27881e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f27882f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C2848L f27883g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C2850N f27884h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p f27885i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Object f27886j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C2848L l10, C2850N n10, p pVar, Object obj, C6658d dVar) {
            super(2, dVar);
            this.f27883g = l10;
            this.f27884h = n10;
            this.f27885i = pVar;
            this.f27886j = obj;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            b bVar = new b(this.f27883g, this.f27884h, this.f27885i, this.f27886j, dVar);
            bVar.f27882f = obj;
            return bVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x00b1=Splitter:B:27:0x00b1, B:20:0x009e=Splitter:B:20:0x009e} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r9.f27881e
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x0042
                if (r1 == r3) goto L_0x002b
                if (r1 != r2) goto L_0x0023
                java.lang.Object r0 = r9.f27878b
                x.N r0 = (x.C2850N) r0
                java.lang.Object r1 = r9.f27877a
                dh.a r1 = (dh.C5817a) r1
                java.lang.Object r2 = r9.f27882f
                x.N$a r2 = (x.C2850N.a) r2
                lf.w.b(r10)     // Catch:{ all -> 0x0020 }
                goto L_0x009e
            L_0x0020:
                r10 = move-exception
                goto L_0x00b1
            L_0x0023:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x002b:
                java.lang.Object r1 = r9.f27880d
                x.N r1 = (x.C2850N) r1
                java.lang.Object r3 = r9.f27879c
                java.lang.Object r5 = r9.f27878b
                yf.p r5 = (yf.p) r5
                java.lang.Object r6 = r9.f27877a
                dh.a r6 = (dh.C5817a) r6
                java.lang.Object r7 = r9.f27882f
                x.N$a r7 = (x.C2850N.a) r7
                lf.w.b(r10)
                r10 = r6
                goto L_0x0087
            L_0x0042:
                lf.w.b(r10)
                java.lang.Object r10 = r9.f27882f
                Ug.K r10 = (Ug.K) r10
                x.N$a r1 = new x.N$a
                x.L r5 = r9.f27883g
                qf.g r10 = r10.getCoroutineContext()
                Ug.w0$b r6 = Ug.C5600w0.f65416O
                qf.g$b r10 = r10.b(r6)
                kotlin.jvm.internal.C6496s.e(r10)
                Ug.w0 r10 = (Ug.C5600w0) r10
                r1.<init>(r5, r10)
                x.N r10 = r9.f27884h
                r10.e(r1)
                x.N r10 = r9.f27884h
                dh.a r10 = r10.f27874b
                yf.p r5 = r9.f27885i
                java.lang.Object r6 = r9.f27886j
                x.N r7 = r9.f27884h
                r9.f27882f = r1
                r9.f27877a = r10
                r9.f27878b = r5
                r9.f27879c = r6
                r9.f27880d = r7
                r9.f27881e = r3
                java.lang.Object r3 = r10.a(r4, r9)
                if (r3 != r0) goto L_0x0083
                return r0
            L_0x0083:
                r3 = r6
                r8 = r7
                r7 = r1
                r1 = r8
            L_0x0087:
                r9.f27882f = r7     // Catch:{ all -> 0x00ab }
                r9.f27877a = r10     // Catch:{ all -> 0x00ab }
                r9.f27878b = r1     // Catch:{ all -> 0x00ab }
                r9.f27879c = r4     // Catch:{ all -> 0x00ab }
                r9.f27880d = r4     // Catch:{ all -> 0x00ab }
                r9.f27881e = r2     // Catch:{ all -> 0x00ab }
                java.lang.Object r2 = r5.invoke(r3, r9)     // Catch:{ all -> 0x00ab }
                if (r2 != r0) goto L_0x009a
                return r0
            L_0x009a:
                r0 = r1
                r1 = r10
                r10 = r2
                r2 = r7
            L_0x009e:
                java.util.concurrent.atomic.AtomicReference r0 = r0.f27873a     // Catch:{ all -> 0x00a9 }
                w.C2780Y.a(r0, r2, r4)     // Catch:{ all -> 0x00a9 }
                r1.e(r4)
                return r10
            L_0x00a9:
                r10 = move-exception
                goto L_0x00b9
            L_0x00ab:
                r0 = move-exception
                r2 = r7
                r8 = r1
                r1 = r10
                r10 = r0
                r0 = r8
            L_0x00b1:
                java.util.concurrent.atomic.AtomicReference r0 = r0.f27873a     // Catch:{ all -> 0x00a9 }
                w.C2780Y.a(r0, r2, r4)     // Catch:{ all -> 0x00a9 }
                throw r10     // Catch:{ all -> 0x00a9 }
            L_0x00b9:
                r1.e(r4)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: x.C2850N.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: private */
    public final void e(a aVar) {
        a aVar2;
        do {
            aVar2 = (a) this.f27873a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!C2780Y.a(this.f27873a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    public final Object d(Object obj, C2848L l10, p pVar, C6658d dVar) {
        return L.e(new b(l10, this, pVar, obj, (C6658d) null), dVar);
    }
}
