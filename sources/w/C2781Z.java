package w;

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
import yf.C6798l;
import yf.p;

/* renamed from: w.Z  reason: case insensitive filesystem */
public final class C2781Z {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f27254a = new AtomicReference((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C5817a f27255b = c.b(false, 1, (Object) null);

    /* renamed from: w.Z$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C2778W f27256a;

        /* renamed from: b  reason: collision with root package name */
        private final C5600w0 f27257b;

        public a(C2778W w10, C5600w0 w0Var) {
            this.f27256a = w10;
            this.f27257b = w0Var;
        }

        public final boolean a(a aVar) {
            if (this.f27256a.compareTo(aVar.f27256a) >= 0) {
                return true;
            }
            return false;
        }

        public final void b() {
            this.f27257b.n(new C2779X());
        }
    }

    /* renamed from: w.Z$b */
    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f27258a;

        /* renamed from: b  reason: collision with root package name */
        Object f27259b;

        /* renamed from: c  reason: collision with root package name */
        Object f27260c;

        /* renamed from: d  reason: collision with root package name */
        int f27261d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f27262e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C2778W f27263f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C2781Z f27264g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C6798l f27265h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C2778W w10, C2781Z z10, C6798l lVar, C6658d dVar) {
            super(2, dVar);
            this.f27263f = w10;
            this.f27264g = z10;
            this.f27265h = lVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            b bVar = new b(this.f27263f, this.f27264g, this.f27265h, dVar);
            bVar.f27262e = obj;
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
                int r1 = r8.f27261d
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x0040
                if (r1 == r3) goto L_0x002b
                if (r1 != r2) goto L_0x0023
                java.lang.Object r0 = r8.f27259b
                w.Z r0 = (w.C2781Z) r0
                java.lang.Object r1 = r8.f27258a
                dh.a r1 = (dh.C5817a) r1
                java.lang.Object r2 = r8.f27262e
                w.Z$a r2 = (w.C2781Z.a) r2
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
                java.lang.Object r1 = r8.f27260c
                w.Z r1 = (w.C2781Z) r1
                java.lang.Object r3 = r8.f27259b
                yf.l r3 = (yf.C6798l) r3
                java.lang.Object r5 = r8.f27258a
                dh.a r5 = (dh.C5817a) r5
                java.lang.Object r6 = r8.f27262e
                w.Z$a r6 = (w.C2781Z.a) r6
                lf.w.b(r9)
                r9 = r5
                goto L_0x0081
            L_0x0040:
                lf.w.b(r9)
                java.lang.Object r9 = r8.f27262e
                Ug.K r9 = (Ug.K) r9
                w.Z$a r1 = new w.Z$a
                w.W r5 = r8.f27263f
                qf.g r9 = r9.getCoroutineContext()
                Ug.w0$b r6 = Ug.C5600w0.f65416O
                qf.g$b r9 = r9.b(r6)
                kotlin.jvm.internal.C6496s.e(r9)
                Ug.w0 r9 = (Ug.C5600w0) r9
                r1.<init>(r5, r9)
                w.Z r9 = r8.f27264g
                r9.f(r1)
                w.Z r9 = r8.f27264g
                dh.a r9 = r9.f27255b
                yf.l r5 = r8.f27265h
                w.Z r6 = r8.f27264g
                r8.f27262e = r1
                r8.f27258a = r9
                r8.f27259b = r5
                r8.f27260c = r6
                r8.f27261d = r3
                java.lang.Object r3 = r9.a(r4, r8)
                if (r3 != r0) goto L_0x007d
                return r0
            L_0x007d:
                r3 = r5
                r7 = r6
                r6 = r1
                r1 = r7
            L_0x0081:
                r8.f27262e = r6     // Catch:{ all -> 0x00a3 }
                r8.f27258a = r9     // Catch:{ all -> 0x00a3 }
                r8.f27259b = r1     // Catch:{ all -> 0x00a3 }
                r8.f27260c = r4     // Catch:{ all -> 0x00a3 }
                r8.f27261d = r2     // Catch:{ all -> 0x00a3 }
                java.lang.Object r2 = r3.invoke(r8)     // Catch:{ all -> 0x00a3 }
                if (r2 != r0) goto L_0x0092
                return r0
            L_0x0092:
                r0 = r1
                r1 = r9
                r9 = r2
                r2 = r6
            L_0x0096:
                java.util.concurrent.atomic.AtomicReference r0 = r0.f27254a     // Catch:{ all -> 0x00a1 }
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
                java.util.concurrent.atomic.AtomicReference r0 = r0.f27254a     // Catch:{ all -> 0x00a1 }
                w.C2780Y.a(r0, r2, r4)     // Catch:{ all -> 0x00a1 }
                throw r9     // Catch:{ all -> 0x00a1 }
            L_0x00b1:
                r1.e(r4)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: w.C2781Z.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static /* synthetic */ Object e(C2781Z z10, C2778W w10, C6798l lVar, C6658d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            w10 = C2778W.Default;
        }
        return z10.d(w10, lVar, dVar);
    }

    /* access modifiers changed from: private */
    public final void f(a aVar) {
        a aVar2;
        do {
            aVar2 = (a) this.f27254a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!C2780Y.a(this.f27254a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    public final Object d(C2778W w10, C6798l lVar, C6658d dVar) {
        return L.e(new b(w10, this, lVar, (C6658d) null), dVar);
    }
}
