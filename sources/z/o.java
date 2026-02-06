package z;

import D0.A;
import D0.C1111b;
import D0.J;
import java.util.List;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.k;
import lf.C6514M;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.p;

public abstract class o {

    static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f29021a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f29022b;

        /* renamed from: c  reason: collision with root package name */
        int f29023c;

        a(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f29022b = obj;
            this.f29023c |= Integer.MIN_VALUE;
            return o.b((C1111b) null, this);
        }
    }

    static final class b extends k implements p {

        /* renamed from: b  reason: collision with root package name */
        int f29024b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f29025c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g f29026d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p f29027e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar, p pVar, C6658d dVar) {
            super(2, dVar);
            this.f29026d = gVar;
            this.f29027e = pVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            b bVar = new b(this.f29026d, this.f29027e, dVar);
            bVar.f29025c = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(C1111b bVar, C6658d dVar) {
            return ((b) create(bVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0043 A[SYNTHETIC, Splitter:B:19:0x0043] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005b A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r7.f29024b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0034
                if (r1 == r4) goto L_0x002c
                if (r1 == r3) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                java.lang.Object r1 = r7.f29025c
                D0.b r1 = (D0.C1111b) r1
                lf.w.b(r8)
                goto L_0x0028
            L_0x0019:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0021:
                java.lang.Object r1 = r7.f29025c
                D0.b r1 = (D0.C1111b) r1
                lf.w.b(r8)     // Catch:{ CancellationException -> 0x002a }
            L_0x0028:
                r8 = r1
                goto L_0x003b
            L_0x002a:
                r8 = move-exception
                goto L_0x0060
            L_0x002c:
                java.lang.Object r1 = r7.f29025c
                D0.b r1 = (D0.C1111b) r1
                lf.w.b(r8)     // Catch:{ CancellationException -> 0x002a }
                goto L_0x0051
            L_0x0034:
                lf.w.b(r8)
                java.lang.Object r8 = r7.f29025c
                D0.b r8 = (D0.C1111b) r8
            L_0x003b:
                qf.g r1 = r7.f29026d
                boolean r1 = Ug.A0.q(r1)
                if (r1 == 0) goto L_0x0074
                yf.p r1 = r7.f29027e     // Catch:{ CancellationException -> 0x005c }
                r7.f29025c = r8     // Catch:{ CancellationException -> 0x005c }
                r7.f29024b = r4     // Catch:{ CancellationException -> 0x005c }
                java.lang.Object r1 = r1.invoke(r8, r7)     // Catch:{ CancellationException -> 0x005c }
                if (r1 != r0) goto L_0x0050
                return r0
            L_0x0050:
                r1 = r8
            L_0x0051:
                r7.f29025c = r1     // Catch:{ CancellationException -> 0x002a }
                r7.f29024b = r3     // Catch:{ CancellationException -> 0x002a }
                java.lang.Object r8 = z.o.b(r1, r7)     // Catch:{ CancellationException -> 0x002a }
                if (r8 != r0) goto L_0x0028
                return r0
            L_0x005c:
                r1 = move-exception
                r6 = r1
                r1 = r8
                r8 = r6
            L_0x0060:
                qf.g r5 = r7.f29026d
                boolean r5 = Ug.A0.q(r5)
                if (r5 == 0) goto L_0x0073
                r7.f29025c = r1
                r7.f29024b = r2
                java.lang.Object r8 = z.o.b(r1, r7)
                if (r8 != r0) goto L_0x0028
                return r0
            L_0x0073:
                throw r8
            L_0x0074:
                lf.M r8 = lf.C6514M.f71813a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: z.o.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final boolean a(C1111b bVar) {
        List c10 = bVar.V0().c();
        int size = c10.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            } else if (((A) c10.get(i10)).i()) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        return !z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (a(r6) == false) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068 A[EDGE_INSN: B:25:0x0068->B:22:0x0068 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(D0.C1111b r6, qf.C6658d r7) {
        /*
            boolean r0 = r7 instanceof z.o.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            z.o$a r0 = (z.o.a) r0
            int r1 = r0.f29023c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f29023c = r1
            goto L_0x0018
        L_0x0013:
            z.o$a r0 = new z.o$a
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f29022b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f29023c
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r6 = r0.f29021a
            D0.b r6 = (D0.C1111b) r6
            lf.w.b(r7)
            goto L_0x004b
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0035:
            lf.w.b(r7)
            boolean r7 = a(r6)
            if (r7 != 0) goto L_0x0068
        L_0x003e:
            D0.q r7 = D0.C1126q.Final
            r0.f29021a = r6
            r0.f29023c = r3
            java.lang.Object r7 = r6.Z0(r7, r0)
            if (r7 != r1) goto L_0x004b
            return r1
        L_0x004b:
            D0.o r7 = (D0.C1124o) r7
            java.util.List r7 = r7.c()
            int r2 = r7.size()
            r4 = 0
        L_0x0056:
            if (r4 >= r2) goto L_0x0068
            java.lang.Object r5 = r7.get(r4)
            D0.A r5 = (D0.A) r5
            boolean r5 = r5.i()
            if (r5 == 0) goto L_0x0065
            goto L_0x003e
        L_0x0065:
            int r4 = r4 + 1
            goto L_0x0056
        L_0x0068:
            lf.M r6 = lf.C6514M.f71813a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z.o.b(D0.b, qf.d):java.lang.Object");
    }

    public static final Object c(J j10, p pVar, C6658d dVar) {
        Object z02 = j10.z0(new b(dVar.getContext(), pVar, (C6658d) null), dVar);
        if (z02 == C6680b.f()) {
            return z02;
        }
        return C6514M.f71813a;
    }
}
