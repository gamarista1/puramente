package androidx.compose.ui.platform;

import J0.m0;
import Y.C1521x;
import Y.I0;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C6498u;
import qf.C6658d;
import yf.C6787a;
import yf.p;

public abstract class N0 {

    /* renamed from: a  reason: collision with root package name */
    private static final I0 f13614a = C1521x.f(a.f13615a);

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f13615a = new a();

        a() {
            super(0);
        }

        public final C1635h0 a() {
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return null;
        }
    }

    static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f13616a;

        /* renamed from: b  reason: collision with root package name */
        int f13617b;

        b(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f13616a = obj;
            this.f13617b |= Integer.MIN_VALUE;
            return N0.b((M0) null, (p) null, this);
        }
    }

    static final class c extends d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f13618a;

        /* renamed from: b  reason: collision with root package name */
        int f13619b;

        c(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f13618a = obj;
            this.f13619b |= Integer.MIN_VALUE;
            return N0.c((m0) null, (C1635h0) null, (p) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(androidx.compose.ui.platform.M0 r4, yf.p r5, qf.C6658d r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.ui.platform.N0.b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.ui.platform.N0$b r0 = (androidx.compose.ui.platform.N0.b) r0
            int r1 = r0.f13617b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13617b = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.platform.N0$b r0 = new androidx.compose.ui.platform.N0$b
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f13616a
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f13617b
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002d:
            lf.w.b(r6)
            goto L_0x005d
        L_0x0031:
            lf.w.b(r6)
            k0.i$c r6 = r4.v0()
            boolean r6 = r6.S1()
            if (r6 == 0) goto L_0x0063
            J0.m0 r6 = J0.C1245k.n(r4)
            J0.G r4 = J0.C1245k.m(r4)
            Y.y r4 = r4.J()
            Y.I0 r2 = f13614a
            java.lang.Object r4 = r4.a(r2)
            android.support.v4.media.session.c.a(r4)
            r0.f13617b = r3
            r4 = 0
            java.lang.Object r4 = c(r6, r4, r5, r0)
            if (r4 != r1) goto L_0x005d
            return r1
        L_0x005d:
            lf.k r4 = new lf.k
            r4.<init>()
            throw r4
        L_0x0063:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "establishTextInputSession called from an unattached node"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.N0.b(androidx.compose.ui.platform.M0, yf.p, qf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(J0.m0 r3, androidx.compose.ui.platform.C1635h0 r4, yf.p r5, qf.C6658d r6) {
        /*
            boolean r4 = r6 instanceof androidx.compose.ui.platform.N0.c
            if (r4 == 0) goto L_0x0013
            r4 = r6
            androidx.compose.ui.platform.N0$c r4 = (androidx.compose.ui.platform.N0.c) r4
            int r0 = r4.f13619b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r4.f13619b = r0
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.platform.N0$c r4 = new androidx.compose.ui.platform.N0$c
            r4.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r4.f13618a
            java.lang.Object r0 = rf.C6680b.f()
            int r1 = r4.f13619b
            r2 = 1
            if (r1 == 0) goto L_0x003d
            if (r1 == r2) goto L_0x0039
            r3 = 2
            if (r1 == r3) goto L_0x0030
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L_0x0030:
            lf.w.b(r6)
            lf.k r3 = new lf.k
            r3.<init>()
            throw r3
        L_0x0039:
            lf.w.b(r6)
            goto L_0x0049
        L_0x003d:
            lf.w.b(r6)
            r4.f13619b = r2
            java.lang.Object r3 = r3.k(r5, r4)
            if (r3 != r0) goto L_0x0049
            return r0
        L_0x0049:
            lf.k r3 = new lf.k
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.N0.c(J0.m0, androidx.compose.ui.platform.h0, yf.p, qf.d):java.lang.Object");
    }
}
