package mf;

import Rg.j;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import qf.C6658d;
import yf.p;

public abstract class c0 {

    static final class a extends k implements p {

        /* renamed from: b  reason: collision with root package name */
        Object f72060b;

        /* renamed from: c  reason: collision with root package name */
        Object f72061c;

        /* renamed from: d  reason: collision with root package name */
        int f72062d;

        /* renamed from: e  reason: collision with root package name */
        int f72063e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f72064f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f72065g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f72066h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Iterator f72067i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f72068j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f72069k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i10, int i11, Iterator it, boolean z10, boolean z11, C6658d dVar) {
            super(2, dVar);
            this.f72065g = i10;
            this.f72066h = i11;
            this.f72067i = it;
            this.f72068j = z10;
            this.f72069k = z11;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f72065g, this.f72066h, this.f72067i, this.f72068j, this.f72069k, dVar);
            aVar.f72064f = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(j jVar, C6658d dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00e6  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x0124  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x012e  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0120 A[SYNTHETIC] */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r10.f72063e
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r1 == 0) goto L_0x0057
                if (r1 == r6) goto L_0x0044
                if (r1 == r5) goto L_0x003f
                if (r1 == r4) goto L_0x002e
                if (r1 == r3) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                goto L_0x003f
            L_0x0019:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0021:
                java.lang.Object r1 = r10.f72060b
                mf.X r1 = (mf.X) r1
                java.lang.Object r4 = r10.f72064f
                Rg.j r4 = (Rg.j) r4
                lf.w.b(r11)
                goto L_0x0148
            L_0x002e:
                java.lang.Object r1 = r10.f72061c
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r5 = r10.f72060b
                mf.X r5 = (mf.X) r5
                java.lang.Object r6 = r10.f72064f
                Rg.j r6 = (Rg.j) r6
                lf.w.b(r11)
                goto L_0x011a
            L_0x003f:
                lf.w.b(r11)
                goto L_0x0163
            L_0x0044:
                int r1 = r10.f72062d
                java.lang.Object r2 = r10.f72061c
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r3 = r10.f72060b
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                java.lang.Object r4 = r10.f72064f
                Rg.j r4 = (Rg.j) r4
                lf.w.b(r11)
            L_0x0055:
                r11 = r1
                goto L_0x00a5
            L_0x0057:
                lf.w.b(r11)
                java.lang.Object r11 = r10.f72064f
                Rg.j r11 = (Rg.j) r11
                int r1 = r10.f72065g
                r8 = 1024(0x400, float:1.435E-42)
                int r1 = Ef.m.h(r1, r8)
                int r8 = r10.f72066h
                int r9 = r10.f72065g
                int r8 = r8 - r9
                if (r8 < 0) goto L_0x00d8
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r1)
                java.util.Iterator r1 = r10.f72067i
                r3 = 0
                r4 = r11
                r11 = r3
                r3 = r2
                r2 = r1
                r1 = r8
            L_0x007a:
                boolean r8 = r2.hasNext()
                if (r8 == 0) goto L_0x00b7
                java.lang.Object r8 = r2.next()
                if (r11 <= 0) goto L_0x0089
                int r11 = r11 + -1
                goto L_0x007a
            L_0x0089:
                r3.add(r8)
                int r8 = r3.size()
                int r9 = r10.f72065g
                if (r8 != r9) goto L_0x007a
                r10.f72064f = r4
                r10.f72060b = r3
                r10.f72061c = r2
                r10.f72062d = r1
                r10.f72063e = r6
                java.lang.Object r11 = r4.b(r3, r10)
                if (r11 != r0) goto L_0x0055
                return r0
            L_0x00a5:
                boolean r1 = r10.f72068j
                if (r1 == 0) goto L_0x00ad
                r3.clear()
                goto L_0x00b5
            L_0x00ad:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r10.f72065g
                r1.<init>(r3)
                r3 = r1
            L_0x00b5:
                r1 = r11
                goto L_0x007a
            L_0x00b7:
                boolean r11 = r3.isEmpty()
                if (r11 != 0) goto L_0x0163
                boolean r11 = r10.f72069k
                if (r11 != 0) goto L_0x00c9
                int r11 = r3.size()
                int r1 = r10.f72065g
                if (r11 != r1) goto L_0x0163
            L_0x00c9:
                r10.f72064f = r7
                r10.f72060b = r7
                r10.f72061c = r7
                r10.f72063e = r5
                java.lang.Object r11 = r4.b(r3, r10)
                if (r11 != r0) goto L_0x0163
                return r0
            L_0x00d8:
                mf.X r5 = new mf.X
                r5.<init>(r1)
                java.util.Iterator r1 = r10.f72067i
                r6 = r11
            L_0x00e0:
                boolean r11 = r1.hasNext()
                if (r11 == 0) goto L_0x0120
                java.lang.Object r11 = r1.next()
                r5.n(r11)
                boolean r11 = r5.t()
                if (r11 == 0) goto L_0x00e0
                int r11 = r5.size()
                int r8 = r10.f72065g
                if (r11 >= r8) goto L_0x0100
                mf.X r5 = r5.r(r8)
                goto L_0x00e0
            L_0x0100:
                boolean r11 = r10.f72068j
                if (r11 == 0) goto L_0x0106
                r11 = r5
                goto L_0x010b
            L_0x0106:
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>(r5)
            L_0x010b:
                r10.f72064f = r6
                r10.f72060b = r5
                r10.f72061c = r1
                r10.f72063e = r4
                java.lang.Object r11 = r6.b(r11, r10)
                if (r11 != r0) goto L_0x011a
                return r0
            L_0x011a:
                int r11 = r10.f72066h
                r5.v(r11)
                goto L_0x00e0
            L_0x0120:
                boolean r11 = r10.f72069k
                if (r11 == 0) goto L_0x0163
                r1 = r5
                r4 = r6
            L_0x0126:
                int r11 = r1.size()
                int r5 = r10.f72066h
                if (r11 <= r5) goto L_0x014e
                boolean r11 = r10.f72068j
                if (r11 == 0) goto L_0x0134
                r11 = r1
                goto L_0x0139
            L_0x0134:
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>(r1)
            L_0x0139:
                r10.f72064f = r4
                r10.f72060b = r1
                r10.f72061c = r7
                r10.f72063e = r3
                java.lang.Object r11 = r4.b(r11, r10)
                if (r11 != r0) goto L_0x0148
                return r0
            L_0x0148:
                int r11 = r10.f72066h
                r1.v(r11)
                goto L_0x0126
            L_0x014e:
                boolean r11 = r1.isEmpty()
                if (r11 != 0) goto L_0x0163
                r10.f72064f = r7
                r10.f72060b = r7
                r10.f72061c = r7
                r10.f72063e = r2
                java.lang.Object r11 = r4.b(r1, r10)
                if (r11 != r0) goto L_0x0163
                return r0
            L_0x0163:
                lf.M r11 = lf.C6514M.f71813a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: mf.c0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(int i10, int i11) {
        String str;
        if (i10 <= 0 || i11 <= 0) {
            if (i10 != i11) {
                str = "Both size " + i10 + " and step " + i11 + " must be greater than zero.";
            } else {
                str = "size " + i10 + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public static final Iterator b(Iterator it, int i10, int i11, boolean z10, boolean z11) {
        C6496s.h(it, "iterator");
        if (!it.hasNext()) {
            return C6544D.f72028a;
        }
        return Rg.k.a(new a(i10, i11, it, z11, z10, (C6658d) null));
    }
}
