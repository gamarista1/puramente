package Xg;

import kotlin.coroutines.jvm.internal.d;
import qf.C6658d;

/* renamed from: Xg.a  reason: case insensitive filesystem */
public abstract class C5689a implements C5694f {

    /* renamed from: Xg.a$a  reason: collision with other inner class name */
    static final class C0966a extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f66489a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f66490b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5689a f66491c;

        /* renamed from: d  reason: collision with root package name */
        int f66492d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0966a(C5689a aVar, C6658d dVar) {
            super(dVar);
            this.f66491c = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f66490b = obj;
            this.f66492d |= Integer.MIN_VALUE;
            return this.f66491c.collect((C5695g) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object collect(Xg.C5695g r6, qf.C6658d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Xg.C5689a.C0966a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Xg.a$a r0 = (Xg.C5689a.C0966a) r0
            int r1 = r0.f66492d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f66492d = r1
            goto L_0x0018
        L_0x0013:
            Xg.a$a r0 = new Xg.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f66490b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f66492d
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r6 = r0.f66489a
            Yg.u r6 = (Yg.u) r6
            lf.w.b(r7)     // Catch:{ all -> 0x002d }
            goto L_0x004f
        L_0x002d:
            r7 = move-exception
            goto L_0x0059
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            lf.w.b(r7)
            Yg.u r7 = new Yg.u
            qf.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f66489a = r7     // Catch:{ all -> 0x0055 }
            r0.f66492d = r3     // Catch:{ all -> 0x0055 }
            java.lang.Object r6 = r5.f(r7, r0)     // Catch:{ all -> 0x0055 }
            if (r6 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r6 = r7
        L_0x004f:
            r6.releaseIntercepted()
            lf.M r6 = lf.C6514M.f71813a
            return r6
        L_0x0055:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0059:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Xg.C5689a.collect(Xg.g, qf.d):java.lang.Object");
    }

    public abstract Object f(C5695g gVar, C6658d dVar);
}
