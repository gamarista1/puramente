package Wg;

import Ug.C5582n;
import Ug.F;
import Ug.K;
import Ug.M;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.v;
import qf.C6658d;
import qf.g;
import qf.h;
import yf.C6787a;
import yf.C6798l;

public abstract class p {

    static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f66040a;

        /* renamed from: b  reason: collision with root package name */
        Object f66041b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f66042c;

        /* renamed from: d  reason: collision with root package name */
        int f66043d;

        a(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f66042c = obj;
            this.f66043d |= Integer.MIN_VALUE;
            return p.a((r) null, (C6787a) null, this);
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5582n f66044a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C5582n nVar) {
            super(1);
            this.f66044a = nVar;
        }

        public final void a(Throwable th2) {
            C5582n nVar = this.f66044a;
            v.a aVar = v.f71841b;
            nVar.resumeWith(v.b(C6514M.f71813a));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C6514M.f71813a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: yf.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(Wg.r r4, yf.C6787a r5, qf.C6658d r6) {
        /*
            boolean r0 = r6 instanceof Wg.p.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            Wg.p$a r0 = (Wg.p.a) r0
            int r1 = r0.f66043d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f66043d = r1
            goto L_0x0018
        L_0x0013:
            Wg.p$a r0 = new Wg.p$a
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f66042c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f66043d
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r4 = r0.f66041b
            r5 = r4
            yf.a r5 = (yf.C6787a) r5
            java.lang.Object r4 = r0.f66040a
            Wg.r r4 = (Wg.r) r4
            lf.w.b(r6)     // Catch:{ all -> 0x0032 }
            goto L_0x0075
        L_0x0032:
            r4 = move-exception
            goto L_0x007b
        L_0x0034:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003c:
            lf.w.b(r6)
            qf.g r6 = r0.getContext()
            Ug.w0$b r2 = Ug.C5600w0.f65416O
            qf.g$b r6 = r6.b(r2)
            if (r6 != r4) goto L_0x007f
            r0.f66040a = r4     // Catch:{ all -> 0x0032 }
            r0.f66041b = r5     // Catch:{ all -> 0x0032 }
            r0.f66043d = r3     // Catch:{ all -> 0x0032 }
            Ug.o r6 = new Ug.o     // Catch:{ all -> 0x0032 }
            qf.d r2 = rf.C6680b.c(r0)     // Catch:{ all -> 0x0032 }
            r6.<init>(r2, r3)     // Catch:{ all -> 0x0032 }
            r6.E()     // Catch:{ all -> 0x0032 }
            Wg.p$b r2 = new Wg.p$b     // Catch:{ all -> 0x0032 }
            r2.<init>(r6)     // Catch:{ all -> 0x0032 }
            r4.e(r2)     // Catch:{ all -> 0x0032 }
            java.lang.Object r4 = r6.v()     // Catch:{ all -> 0x0032 }
            java.lang.Object r6 = rf.C6680b.f()     // Catch:{ all -> 0x0032 }
            if (r4 != r6) goto L_0x0072
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch:{ all -> 0x0032 }
        L_0x0072:
            if (r4 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r5.invoke()
            lf.M r4 = lf.C6514M.f71813a
            return r4
        L_0x007b:
            r5.invoke()
            throw r4
        L_0x007f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Wg.p.a(Wg.r, yf.a, qf.d):java.lang.Object");
    }

    public static final t b(K k10, g gVar, int i10, a aVar, M m10, C6798l lVar, yf.p pVar) {
        q qVar = new q(F.d(k10, gVar), g.b(i10, aVar, (C6798l) null, 4, (Object) null));
        if (lVar != null) {
            qVar.P0(lVar);
        }
        qVar.f1(m10, qVar, pVar);
        return qVar;
    }

    public static final t c(K k10, g gVar, int i10, yf.p pVar) {
        return b(k10, gVar, i10, a.SUSPEND, M.DEFAULT, (C6798l) null, pVar);
    }

    public static /* synthetic */ t d(K k10, g gVar, int i10, a aVar, M m10, C6798l lVar, yf.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = h.f72645a;
        }
        g gVar2 = gVar;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            aVar = a.SUSPEND;
        }
        a aVar2 = aVar;
        if ((i11 & 8) != 0) {
            m10 = M.DEFAULT;
        }
        M m11 = m10;
        if ((i11 & 16) != 0) {
            lVar = null;
        }
        return b(k10, gVar2, i12, aVar2, m11, lVar, pVar);
    }

    public static /* synthetic */ t e(K k10, g gVar, int i10, yf.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = h.f72645a;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return c(k10, gVar, i10, pVar);
    }
}
