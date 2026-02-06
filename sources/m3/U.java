package m3;

import Ug.C5582n;
import Ug.K;
import Wg.u;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.v;
import qf.C6658d;
import qf.g;
import yf.C6787a;
import yf.C6798l;

public final class U implements T, K, u {

    /* renamed from: a  reason: collision with root package name */
    private final u f23883a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ K f23884b;

    static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f23885a;

        /* renamed from: b  reason: collision with root package name */
        Object f23886b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f23887c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ U f23888d;

        /* renamed from: e  reason: collision with root package name */
        int f23889e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(U u10, C6658d dVar) {
            super(dVar);
            this.f23888d = u10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f23887c = obj;
            this.f23889e |= Integer.MIN_VALUE;
            return this.f23888d.g0((C6787a) null, this);
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5582n f23890a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C5582n nVar) {
            super(1);
            this.f23890a = nVar;
        }

        public final void a(Throwable th2) {
            C5582n nVar = this.f23890a;
            v.a aVar = v.f71841b;
            nVar.resumeWith(v.b(C6514M.f71813a));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C6514M.f71813a;
        }
    }

    public U(K k10, u uVar) {
        C6496s.h(k10, "scope");
        C6496s.h(uVar, "channel");
        this.f23883a = uVar;
        this.f23884b = k10;
    }

    public Object c(Object obj) {
        return this.f23883a.c(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object g0(yf.C6787a r6, qf.C6658d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof m3.U.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            m3.U$a r0 = (m3.U.a) r0
            int r1 = r0.f23889e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f23889e = r1
            goto L_0x0018
        L_0x0013:
            m3.U$a r0 = new m3.U$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f23887c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f23889e
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r6 = r0.f23886b
            Ug.w0 r6 = (Ug.C5600w0) r6
            java.lang.Object r6 = r0.f23885a
            yf.a r6 = (yf.C6787a) r6
            lf.w.b(r7)     // Catch:{ all -> 0x0031 }
            goto L_0x0076
        L_0x0031:
            r7 = move-exception
            goto L_0x0084
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            lf.w.b(r7)
            qf.g r7 = r5.getCoroutineContext()     // Catch:{ all -> 0x0031 }
            Ug.w0$b r2 = Ug.C5600w0.f65416O     // Catch:{ all -> 0x0031 }
            qf.g$b r7 = r7.b(r2)     // Catch:{ all -> 0x0031 }
            if (r7 == 0) goto L_0x007c
            Ug.w0 r7 = (Ug.C5600w0) r7     // Catch:{ all -> 0x0031 }
            r0.f23885a = r6     // Catch:{ all -> 0x0031 }
            r0.f23886b = r7     // Catch:{ all -> 0x0031 }
            r0.f23889e = r3     // Catch:{ all -> 0x0031 }
            Ug.o r2 = new Ug.o     // Catch:{ all -> 0x0031 }
            qf.d r4 = rf.C6680b.c(r0)     // Catch:{ all -> 0x0031 }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x0031 }
            r2.E()     // Catch:{ all -> 0x0031 }
            m3.U$b r3 = new m3.U$b     // Catch:{ all -> 0x0031 }
            r3.<init>(r2)     // Catch:{ all -> 0x0031 }
            r7.P0(r3)     // Catch:{ all -> 0x0031 }
            java.lang.Object r7 = r2.v()     // Catch:{ all -> 0x0031 }
            java.lang.Object r2 = rf.C6680b.f()     // Catch:{ all -> 0x0031 }
            if (r7 != r2) goto L_0x0073
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch:{ all -> 0x0031 }
        L_0x0073:
            if (r7 != r1) goto L_0x0076
            return r1
        L_0x0076:
            r6.invoke()
            lf.M r6 = lf.C6514M.f71813a
            return r6
        L_0x007c:
            java.lang.String r7 = "Internal error, context should have a job."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0031 }
            r0.<init>(r7)     // Catch:{ all -> 0x0031 }
            throw r0     // Catch:{ all -> 0x0031 }
        L_0x0084:
            r6.invoke()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.U.g0(yf.a, qf.d):java.lang.Object");
    }

    public g getCoroutineContext() {
        return this.f23884b.getCoroutineContext();
    }

    public boolean j(Throwable th2) {
        return this.f23883a.j(th2);
    }

    public Object k(Object obj, C6658d dVar) {
        return this.f23883a.k(obj, dVar);
    }
}
