package Hc;

import Jc.f;
import Ug.C5600w0;
import Ug.K;
import Ug.L;
import Ug.M;
import android.util.Log;
import jc.C5046e;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import qf.C6658d;
import qf.g;
import ub.C5230g;
import yf.p;

public final class C implements com.google.firebase.sessions.b {

    /* renamed from: g  reason: collision with root package name */
    public static final a f50910g = new a((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    private static final double f50911h = Math.random();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C5230g f50912b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C5046e f50913c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final f f50914d;

    /* renamed from: e  reason: collision with root package name */
    private final C4305h f50915e;

    /* renamed from: f  reason: collision with root package name */
    private final g f50916f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f50917a;

        /* renamed from: b  reason: collision with root package name */
        Object f50918b;

        /* renamed from: c  reason: collision with root package name */
        Object f50919c;

        /* renamed from: d  reason: collision with root package name */
        Object f50920d;

        /* renamed from: e  reason: collision with root package name */
        Object f50921e;

        /* renamed from: f  reason: collision with root package name */
        Object f50922f;

        /* renamed from: g  reason: collision with root package name */
        int f50923g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C f50924h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ z f50925i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C c10, z zVar, C6658d dVar) {
            super(2, dVar);
            this.f50924h = c10;
            this.f50925i = zVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new b(this.f50924h, this.f50925i, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0095 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0096  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r10.f50923g
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0045
                if (r1 == r4) goto L_0x0041
                if (r1 == r3) goto L_0x003d
                if (r1 != r2) goto L_0x0035
                java.lang.Object r0 = r10.f50922f
                Jc.f r0 = (Jc.f) r0
                java.lang.Object r1 = r10.f50921e
                Hc.z r1 = (Hc.z) r1
                java.lang.Object r2 = r10.f50920d
                ub.g r2 = (ub.C5230g) r2
                java.lang.Object r3 = r10.f50919c
                Hc.B r3 = (Hc.B) r3
                java.lang.Object r4 = r10.f50918b
                Hc.C r4 = (Hc.C) r4
                java.lang.Object r5 = r10.f50917a
                Hc.s r5 = (Hc.s) r5
                lf.w.b(r11)
                r7 = r4
                r8 = r3
                r3 = r0
                r0 = r8
                r9 = r2
                r2 = r1
                r1 = r9
                goto L_0x009d
            L_0x0035:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x003d:
                lf.w.b(r11)
                goto L_0x006c
            L_0x0041:
                lf.w.b(r11)
                goto L_0x0053
            L_0x0045:
                lf.w.b(r11)
                Hc.C r11 = r10.f50924h
                r10.f50923g = r4
                java.lang.Object r11 = r11.i(r10)
                if (r11 != r0) goto L_0x0053
                return r0
            L_0x0053:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto L_0x00b0
                Hc.s$a r11 = Hc.s.f51030c
                Hc.C r1 = r10.f50924h
                jc.e r1 = r1.f50913c
                r10.f50923g = r3
                java.lang.Object r11 = r11.a(r1, r10)
                if (r11 != r0) goto L_0x006c
                return r0
            L_0x006c:
                r5 = r11
                Hc.s r5 = (Hc.s) r5
                Hc.C r4 = r10.f50924h
                Hc.B r3 = Hc.B.f50908a
                ub.g r11 = r4.f50912b
                Hc.z r1 = r10.f50925i
                Hc.C r6 = r10.f50924h
                Jc.f r6 = r6.f50914d
                Ic.a r7 = Ic.a.f51165a
                r10.f50917a = r5
                r10.f50918b = r4
                r10.f50919c = r3
                r10.f50920d = r11
                r10.f50921e = r1
                r10.f50922f = r6
                r10.f50923g = r2
                java.lang.Object r2 = r7.b(r10)
                if (r2 != r0) goto L_0x0096
                return r0
            L_0x0096:
                r0 = r3
                r7 = r4
                r3 = r6
                r8 = r1
                r1 = r11
                r11 = r2
                r2 = r8
            L_0x009d:
                r4 = r11
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r11 = r5.b()
                java.lang.String r6 = r5.a()
                r5 = r11
                Hc.A r11 = r0.a(r1, r2, r3, r4, r5, r6)
                r7.g(r11)
            L_0x00b0:
                lf.M r11 = lf.C6514M.f71813a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: Hc.C.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class c extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f50926a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f50927b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C f50928c;

        /* renamed from: d  reason: collision with root package name */
        int f50929d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C c10, C6658d dVar) {
            super(dVar);
            this.f50928c = c10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f50927b = obj;
            this.f50929d |= Integer.MIN_VALUE;
            return this.f50928c.i(this);
        }
    }

    public C(C5230g gVar, C5046e eVar, f fVar, C4305h hVar, g gVar2) {
        C6496s.h(gVar, "firebaseApp");
        C6496s.h(eVar, "firebaseInstallations");
        C6496s.h(fVar, "sessionSettings");
        C6496s.h(hVar, "eventGDTLogger");
        C6496s.h(gVar2, "backgroundDispatcher");
        this.f50912b = gVar;
        this.f50913c = eVar;
        this.f50914d = fVar;
        this.f50915e = hVar;
        this.f50916f = gVar2;
    }

    /* access modifiers changed from: private */
    public final void g(A a10) {
        try {
            this.f50915e.a(a10);
            Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: " + a10.c().f());
        } catch (RuntimeException e10) {
            Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e10);
        }
    }

    private final boolean h() {
        if (f50911h <= this.f50914d.b()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(qf.C6658d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Hc.C.c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            Hc.C$c r0 = (Hc.C.c) r0
            int r1 = r0.f50929d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f50929d = r1
            goto L_0x0018
        L_0x0013:
            Hc.C$c r0 = new Hc.C$c
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f50927b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f50929d
            java.lang.String r3 = "SessionFirelogPublisher"
            r4 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            java.lang.Object r0 = r0.f50926a
            Hc.C r0 = (Hc.C) r0
            lf.w.b(r6)
            goto L_0x004d
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0037:
            lf.w.b(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r3, r6)
            Jc.f r6 = r5.f50914d
            r0.f50926a = r5
            r0.f50929d = r4
            java.lang.Object r6 = r6.g(r0)
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r5
        L_0x004d:
            Jc.f r6 = r0.f50914d
            boolean r6 = r6.d()
            r1 = 0
            if (r6 != 0) goto L_0x0060
            java.lang.String r6 = "Sessions SDK disabled. Events will not be sent."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r1)
            return r6
        L_0x0060:
            boolean r6 = r0.h()
            if (r6 != 0) goto L_0x0070
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r1)
            return r6
        L_0x0070:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Hc.C.i(qf.d):java.lang.Object");
    }

    public void a(z zVar) {
        C6496s.h(zVar, "sessionDetails");
        C5600w0 unused = C5576k.d(L.a(this.f50916f), (g) null, (M) null, new b(this, zVar, (C6658d) null), 3, (Object) null);
    }
}
