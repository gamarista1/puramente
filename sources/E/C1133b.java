package E;

import H0.C1197s;
import H0.O;
import kotlin.coroutines.jvm.internal.d;
import lf.C6514M;
import lf.v;
import qf.C6658d;

/* renamed from: E.b  reason: case insensitive filesystem */
public final class C1133b implements O {

    /* renamed from: b  reason: collision with root package name */
    private boolean f1602b;

    /* renamed from: c  reason: collision with root package name */
    private C6658d f1603c;

    /* renamed from: E.b$a */
    static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f1604a;

        /* renamed from: b  reason: collision with root package name */
        Object f1605b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f1606c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C1133b f1607d;

        /* renamed from: e  reason: collision with root package name */
        int f1608e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C1133b bVar, C6658d dVar) {
            super(dVar);
            this.f1607d = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f1606c = obj;
            this.f1608e |= Integer.MIN_VALUE;
            return this.f1607d.a(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(qf.C6658d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof E.C1133b.a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            E.b$a r0 = (E.C1133b.a) r0
            int r1 = r0.f1608e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f1608e = r1
            goto L_0x0018
        L_0x0013:
            E.b$a r0 = new E.b$a
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f1606c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f1608e
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.f1605b
            qf.d r1 = (qf.C6658d) r1
            java.lang.Object r0 = r0.f1604a
            E.b r0 = (E.C1133b) r0
            lf.w.b(r5)
            goto L_0x0064
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0039:
            lf.w.b(r5)
            boolean r5 = r4.f1602b
            if (r5 != 0) goto L_0x0071
            qf.d r5 = r4.f1603c
            r0.f1604a = r4
            r0.f1605b = r5
            r0.f1608e = r3
            qf.i r2 = new qf.i
            qf.d r3 = rf.C6680b.c(r0)
            r2.<init>(r3)
            r4.f1603c = r2
            java.lang.Object r2 = r2.b()
            java.lang.Object r3 = rf.C6680b.f()
            if (r2 != r3) goto L_0x0060
            kotlin.coroutines.jvm.internal.h.c(r0)
        L_0x0060:
            if (r2 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r1 = r5
        L_0x0064:
            if (r1 == 0) goto L_0x0071
            lf.v$a r5 = lf.v.f71841b
            lf.M r5 = lf.C6514M.f71813a
            java.lang.Object r5 = lf.v.b(r5)
            r1.resumeWith(r5)
        L_0x0071:
            lf.M r5 = lf.C6514M.f71813a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: E.C1133b.a(qf.d):java.lang.Object");
    }

    public void p(C1197s sVar) {
        if (!this.f1602b) {
            this.f1602b = true;
            C6658d dVar = this.f1603c;
            if (dVar != null) {
                v.a aVar = v.f71841b;
                dVar.resumeWith(v.b(C6514M.f71813a));
            }
            this.f1603c = null;
        }
    }
}
