package W;

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
import x.C2848L;
import yf.C6787a;
import yf.C6798l;
import yf.p;

public final class n {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f8370a = new AtomicReference((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C5817a f8371b = c.b(false, 1, (Object) null);

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C2848L f8372a;

        /* renamed from: b  reason: collision with root package name */
        private final C5600w0 f8373b;

        public a(C2848L l10, C5600w0 w0Var) {
            this.f8372a = l10;
            this.f8373b = w0Var;
        }

        public final boolean a(a aVar) {
            if (this.f8372a.compareTo(aVar.f8372a) >= 0) {
                return true;
            }
            return false;
        }

        public final void b() {
            C5600w0.a.a(this.f8373b, (CancellationException) null, 1, (Object) null);
        }
    }

    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f8374a;

        /* renamed from: b  reason: collision with root package name */
        Object f8375b;

        /* renamed from: c  reason: collision with root package name */
        Object f8376c;

        /* renamed from: d  reason: collision with root package name */
        int f8377d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f8378e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C2848L f8379f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ n f8380g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C6798l f8381h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C2848L l10, n nVar, C6798l lVar, C6658d dVar) {
            super(2, dVar);
            this.f8379f = l10;
            this.f8380g = nVar;
            this.f8381h = lVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            b bVar = new b(this.f8379f, this.f8380g, this.f8381h, dVar);
            bVar.f8378e = obj;
            return bVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x0096=Splitter:B:20:0x0096, B:27:0x00a9=Splitter:B:27:0x00a9} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r8.f8377d
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x0040
                if (r1 == r3) goto L_0x002b
                if (r1 != r2) goto L_0x0023
                java.lang.Object r0 = r8.f8375b
                W.n r0 = (W.n) r0
                java.lang.Object r1 = r8.f8374a
                dh.a r1 = (dh.C5817a) r1
                java.lang.Object r2 = r8.f8378e
                W.n$a r2 = (W.n.a) r2
                lf.w.b(r9)     // Catch:{ all -> 0x0020 }
                goto L_0x0096
            L_0x0020:
                r9 = move-exception
                goto L_0x00a9
            L_0x0023:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x002b:
                java.lang.Object r1 = r8.f8376c
                W.n r1 = (W.n) r1
                java.lang.Object r3 = r8.f8375b
                yf.l r3 = (yf.C6798l) r3
                java.lang.Object r5 = r8.f8374a
                dh.a r5 = (dh.C5817a) r5
                java.lang.Object r6 = r8.f8378e
                W.n$a r6 = (W.n.a) r6
                lf.w.b(r9)
                r9 = r5
                goto L_0x0081
            L_0x0040:
                lf.w.b(r9)
                java.lang.Object r9 = r8.f8378e
                Ug.K r9 = (Ug.K) r9
                W.n$a r1 = new W.n$a
                x.L r5 = r8.f8379f
                qf.g r9 = r9.getCoroutineContext()
                Ug.w0$b r6 = Ug.C5600w0.f65416O
                qf.g$b r9 = r9.b(r6)
                kotlin.jvm.internal.C6496s.e(r9)
                Ug.w0 r9 = (Ug.C5600w0) r9
                r1.<init>(r5, r9)
                W.n r9 = r8.f8380g
                r9.f(r1)
                W.n r9 = r8.f8380g
                dh.a r9 = r9.f8371b
                yf.l r5 = r8.f8381h
                W.n r6 = r8.f8380g
                r8.f8378e = r1
                r8.f8374a = r9
                r8.f8375b = r5
                r8.f8376c = r6
                r8.f8377d = r3
                java.lang.Object r3 = r9.a(r4, r8)
                if (r3 != r0) goto L_0x007d
                return r0
            L_0x007d:
                r3 = r5
                r7 = r6
                r6 = r1
                r1 = r7
            L_0x0081:
                r8.f8378e = r6     // Catch:{ all -> 0x00a3 }
                r8.f8374a = r9     // Catch:{ all -> 0x00a3 }
                r8.f8375b = r1     // Catch:{ all -> 0x00a3 }
                r8.f8376c = r4     // Catch:{ all -> 0x00a3 }
                r8.f8377d = r2     // Catch:{ all -> 0x00a3 }
                java.lang.Object r2 = r3.invoke(r8)     // Catch:{ all -> 0x00a3 }
                if (r2 != r0) goto L_0x0092
                return r0
            L_0x0092:
                r0 = r1
                r1 = r9
                r9 = r2
                r2 = r6
            L_0x0096:
                java.util.concurrent.atomic.AtomicReference r0 = r0.f8370a     // Catch:{ all -> 0x00a1 }
                w.C2780Y.a(r0, r2, r4)     // Catch:{ all -> 0x00a1 }
                r1.e(r4)
                return r9
            L_0x00a1:
                r9 = move-exception
                goto L_0x00b1
            L_0x00a3:
                r0 = move-exception
                r2 = r6
                r7 = r1
                r1 = r9
                r9 = r0
                r0 = r7
            L_0x00a9:
                java.util.concurrent.atomic.AtomicReference r0 = r0.f8370a     // Catch:{ all -> 0x00a1 }
                w.C2780Y.a(r0, r2, r4)     // Catch:{ all -> 0x00a1 }
                throw r9     // Catch:{ all -> 0x00a1 }
            L_0x00b1:
                r1.e(r4)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: W.n.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: private */
    public final void f(a aVar) {
        a aVar2;
        do {
            aVar2 = (a) this.f8370a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!C2780Y.a(this.f8370a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    public final Object d(C2848L l10, C6798l lVar, C6658d dVar) {
        return L.e(new b(l10, this, lVar, (C6658d) null), dVar);
    }

    public final boolean e(C6787a aVar) {
        boolean b10 = C5817a.C0988a.b(this.f8371b, (Object) null, 1, (Object) null);
        if (b10) {
            try {
                aVar.invoke();
            } finally {
                C5817a.C0988a.c(this.f8371b, (Object) null, 1, (Object) null);
            }
        }
        return b10;
    }
}
