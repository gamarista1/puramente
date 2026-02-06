package m3;

import Ug.C5600w0;
import Ug.K;
import dh.C5817a;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import qf.C6658d;
import yf.C6798l;
import yf.p;

public final class V {

    /* renamed from: b  reason: collision with root package name */
    public static final b f23891b = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final c f23892a;

    private static final class a extends CancellationException {

        /* renamed from: a  reason: collision with root package name */
        private final V f23893a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(V v10) {
            super("Cancelled isolated runner");
            C6496s.h(v10, "runner");
            this.f23893a = v10;
        }

        public final V a() {
            return this.f23893a;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final V f23894a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f23895b;

        /* renamed from: c  reason: collision with root package name */
        private final C5817a f23896c = dh.c.b(false, 1, (Object) null);

        /* renamed from: d  reason: collision with root package name */
        private C5600w0 f23897d;

        /* renamed from: e  reason: collision with root package name */
        private int f23898e;

        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            Object f23899a;

            /* renamed from: b  reason: collision with root package name */
            Object f23900b;

            /* renamed from: c  reason: collision with root package name */
            Object f23901c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f23902d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ c f23903e;

            /* renamed from: f  reason: collision with root package name */
            int f23904f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar, C6658d dVar) {
                super(dVar);
                this.f23903e = cVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f23902d = obj;
                this.f23904f |= Integer.MIN_VALUE;
                return this.f23903e.a((C5600w0) null, this);
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            Object f23905a;

            /* renamed from: b  reason: collision with root package name */
            Object f23906b;

            /* renamed from: c  reason: collision with root package name */
            Object f23907c;

            /* renamed from: d  reason: collision with root package name */
            int f23908d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f23909e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ c f23910f;

            /* renamed from: g  reason: collision with root package name */
            int f23911g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(c cVar, C6658d dVar) {
                super(dVar);
                this.f23910f = cVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f23909e = obj;
                this.f23911g |= Integer.MIN_VALUE;
                return this.f23910f.b(0, (C5600w0) null, this);
            }
        }

        public c(V v10, boolean z10) {
            C6496s.h(v10, "singleRunner");
            this.f23894a = v10;
            this.f23895b = z10;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0059 A[Catch:{ all -> 0x005c }] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object a(Ug.C5600w0 r6, qf.C6658d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof m3.V.c.a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                m3.V$c$a r0 = (m3.V.c.a) r0
                int r1 = r0.f23904f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f23904f = r1
                goto L_0x0018
            L_0x0013:
                m3.V$c$a r0 = new m3.V$c$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f23902d
                java.lang.Object r1 = rf.C6680b.f()
                int r2 = r0.f23904f
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0040
                if (r2 != r3) goto L_0x0038
                java.lang.Object r6 = r0.f23901c
                dh.a r6 = (dh.C5817a) r6
                java.lang.Object r1 = r0.f23900b
                Ug.w0 r1 = (Ug.C5600w0) r1
                java.lang.Object r0 = r0.f23899a
                m3.V$c r0 = (m3.V.c) r0
                lf.w.b(r7)
                r7 = r6
                r6 = r1
                goto L_0x0055
            L_0x0038:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0040:
                lf.w.b(r7)
                dh.a r7 = r5.f23896c
                r0.f23899a = r5
                r0.f23900b = r6
                r0.f23901c = r7
                r0.f23904f = r3
                java.lang.Object r0 = r7.a(r4, r0)
                if (r0 != r1) goto L_0x0054
                return r1
            L_0x0054:
                r0 = r5
            L_0x0055:
                Ug.w0 r1 = r0.f23897d     // Catch:{ all -> 0x005c }
                if (r6 != r1) goto L_0x005e
                r0.f23897d = r4     // Catch:{ all -> 0x005c }
                goto L_0x005e
            L_0x005c:
                r6 = move-exception
                goto L_0x0066
            L_0x005e:
                lf.M r6 = lf.C6514M.f71813a     // Catch:{ all -> 0x005c }
                r7.e(r4)
                lf.M r6 = lf.C6514M.f71813a
                return r6
            L_0x0066:
                r7.e(r4)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: m3.V.c.a(Ug.w0, qf.d):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0086 A[Catch:{ all -> 0x003c }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0087 A[Catch:{ all -> 0x003c }] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object b(int r10, Ug.C5600w0 r11, qf.C6658d r12) {
            /*
                r9 = this;
                boolean r0 = r12 instanceof m3.V.c.b
                if (r0 == 0) goto L_0x0013
                r0 = r12
                m3.V$c$b r0 = (m3.V.c.b) r0
                int r1 = r0.f23911g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f23911g = r1
                goto L_0x0018
            L_0x0013:
                m3.V$c$b r0 = new m3.V$c$b
                r0.<init>(r9, r12)
            L_0x0018:
                java.lang.Object r12 = r0.f23909e
                java.lang.Object r1 = rf.C6680b.f()
                int r2 = r0.f23911g
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0059
                if (r2 == r4) goto L_0x0047
                if (r2 != r3) goto L_0x003f
                int r10 = r0.f23908d
                java.lang.Object r11 = r0.f23907c
                dh.a r11 = (dh.C5817a) r11
                java.lang.Object r1 = r0.f23906b
                Ug.w0 r1 = (Ug.C5600w0) r1
                java.lang.Object r0 = r0.f23905a
                m3.V$c r0 = (m3.V.c) r0
                lf.w.b(r12)     // Catch:{ all -> 0x003c }
                goto L_0x00aa
            L_0x003c:
                r10 = move-exception
                goto L_0x00b8
            L_0x003f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L_0x0047:
                int r10 = r0.f23908d
                java.lang.Object r11 = r0.f23907c
                dh.a r11 = (dh.C5817a) r11
                java.lang.Object r2 = r0.f23906b
                Ug.w0 r2 = (Ug.C5600w0) r2
                java.lang.Object r6 = r0.f23905a
                m3.V$c r6 = (m3.V.c) r6
                lf.w.b(r12)
                goto L_0x0072
            L_0x0059:
                lf.w.b(r12)
                dh.a r12 = r9.f23896c
                r0.f23905a = r9
                r0.f23906b = r11
                r0.f23907c = r12
                r0.f23908d = r10
                r0.f23911g = r4
                java.lang.Object r2 = r12.a(r5, r0)
                if (r2 != r1) goto L_0x006f
                return r1
            L_0x006f:
                r6 = r9
                r2 = r11
                r11 = r12
            L_0x0072:
                Ug.w0 r12 = r6.f23897d     // Catch:{ all -> 0x003c }
                if (r12 == 0) goto L_0x0089
                boolean r7 = r12.a()     // Catch:{ all -> 0x003c }
                if (r7 == 0) goto L_0x0089
                int r7 = r6.f23898e     // Catch:{ all -> 0x003c }
                if (r7 < r10) goto L_0x0089
                if (r7 != r10) goto L_0x0087
                boolean r7 = r6.f23895b     // Catch:{ all -> 0x003c }
                if (r7 == 0) goto L_0x0087
                goto L_0x0089
            L_0x0087:
                r4 = 0
                goto L_0x00b0
            L_0x0089:
                if (r12 == 0) goto L_0x0095
                m3.V$a r7 = new m3.V$a     // Catch:{ all -> 0x003c }
                m3.V r8 = r6.f23894a     // Catch:{ all -> 0x003c }
                r7.<init>(r8)     // Catch:{ all -> 0x003c }
                r12.n(r7)     // Catch:{ all -> 0x003c }
            L_0x0095:
                if (r12 == 0) goto L_0x00ac
                r0.f23905a = r6     // Catch:{ all -> 0x003c }
                r0.f23906b = r2     // Catch:{ all -> 0x003c }
                r0.f23907c = r11     // Catch:{ all -> 0x003c }
                r0.f23908d = r10     // Catch:{ all -> 0x003c }
                r0.f23911g = r3     // Catch:{ all -> 0x003c }
                java.lang.Object r12 = r12.B0(r0)     // Catch:{ all -> 0x003c }
                if (r12 != r1) goto L_0x00a8
                return r1
            L_0x00a8:
                r1 = r2
                r0 = r6
            L_0x00aa:
                r6 = r0
                r2 = r1
            L_0x00ac:
                r6.f23897d = r2     // Catch:{ all -> 0x003c }
                r6.f23898e = r10     // Catch:{ all -> 0x003c }
            L_0x00b0:
                java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.b.a(r4)     // Catch:{ all -> 0x003c }
                r11.e(r5)
                return r10
            L_0x00b8:
                r11.e(r5)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: m3.V.c.b(int, Ug.w0, qf.d):java.lang.Object");
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f23912a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f23913b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ V f23914c;

        /* renamed from: d  reason: collision with root package name */
        int f23915d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(V v10, C6658d dVar) {
            super(dVar);
            this.f23914c = v10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f23913b = obj;
            this.f23915d |= Integer.MIN_VALUE;
            return this.f23914c.b(0, (C6798l) null, this);
        }
    }

    static final class e extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f23916a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f23917b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ V f23918c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f23919d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6798l f23920e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(V v10, int i10, C6798l lVar, C6658d dVar) {
            super(2, dVar);
            this.f23918c = v10;
            this.f23919d = i10;
            this.f23920e = lVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            e eVar = new e(this.f23918c, this.f23919d, this.f23920e, dVar);
            eVar.f23917b = obj;
            return eVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((e) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x008d A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r8.f23916a
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L_0x003c
                if (r1 == r5) goto L_0x0034
                if (r1 == r4) goto L_0x002a
                if (r1 == r3) goto L_0x0025
                if (r1 == r2) goto L_0x001c
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x001c:
                java.lang.Object r0 = r8.f23917b
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                lf.w.b(r9)
                goto L_0x00a0
            L_0x0025:
                lf.w.b(r9)
                goto L_0x00a1
            L_0x002a:
                java.lang.Object r1 = r8.f23917b
                Ug.w0 r1 = (Ug.C5600w0) r1
                lf.w.b(r9)     // Catch:{ all -> 0x0032 }
                goto L_0x007c
            L_0x0032:
                r9 = move-exception
                goto L_0x008e
            L_0x0034:
                java.lang.Object r1 = r8.f23917b
                Ug.w0 r1 = (Ug.C5600w0) r1
                lf.w.b(r9)
                goto L_0x0067
            L_0x003c:
                lf.w.b(r9)
                java.lang.Object r9 = r8.f23917b
                Ug.K r9 = (Ug.K) r9
                qf.g r9 = r9.getCoroutineContext()
                Ug.w0$b r1 = Ug.C5600w0.f65416O
                qf.g$b r9 = r9.b(r1)
                if (r9 == 0) goto L_0x00a4
                Ug.w0 r9 = (Ug.C5600w0) r9
                m3.V r1 = r8.f23918c
                m3.V$c r1 = r1.f23892a
                int r6 = r8.f23919d
                r8.f23917b = r9
                r8.f23916a = r5
                java.lang.Object r1 = r1.b(r6, r9, r8)
                if (r1 != r0) goto L_0x0064
                return r0
            L_0x0064:
                r7 = r1
                r1 = r9
                r9 = r7
            L_0x0067:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L_0x00a1
                yf.l r9 = r8.f23920e     // Catch:{ all -> 0x0032 }
                r8.f23917b = r1     // Catch:{ all -> 0x0032 }
                r8.f23916a = r4     // Catch:{ all -> 0x0032 }
                java.lang.Object r9 = r9.invoke(r8)     // Catch:{ all -> 0x0032 }
                if (r9 != r0) goto L_0x007c
                return r0
            L_0x007c:
                m3.V r9 = r8.f23918c
                m3.V$c r9 = r9.f23892a
                r2 = 0
                r8.f23917b = r2
                r8.f23916a = r3
                java.lang.Object r9 = r9.a(r1, r8)
                if (r9 != r0) goto L_0x00a1
                return r0
            L_0x008e:
                m3.V r3 = r8.f23918c
                m3.V$c r3 = r3.f23892a
                r8.f23917b = r9
                r8.f23916a = r2
                java.lang.Object r1 = r3.a(r1, r8)
                if (r1 != r0) goto L_0x009f
                return r0
            L_0x009f:
                r0 = r9
            L_0x00a0:
                throw r0
            L_0x00a1:
                lf.M r9 = lf.C6514M.f71813a
                return r9
            L_0x00a4:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "Internal error. coroutineScope should've created a job."
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: m3.V.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public V(boolean z10) {
        this.f23892a = new c(this, z10);
    }

    public static /* synthetic */ Object c(V v10, int i10, C6798l lVar, C6658d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return v10.b(i10, lVar, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(int r5, yf.C6798l r6, qf.C6658d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof m3.V.d
            if (r0 == 0) goto L_0x0013
            r0 = r7
            m3.V$d r0 = (m3.V.d) r0
            int r1 = r0.f23915d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f23915d = r1
            goto L_0x0018
        L_0x0013:
            m3.V$d r0 = new m3.V$d
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f23913b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f23915d
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r5 = r0.f23912a
            m3.V r5 = (m3.V) r5
            lf.w.b(r7)     // Catch:{ a -> 0x002d }
            goto L_0x0053
        L_0x002d:
            r6 = move-exception
            goto L_0x004d
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            lf.w.b(r7)
            m3.V$e r7 = new m3.V$e     // Catch:{ a -> 0x004b }
            r2 = 0
            r7.<init>(r4, r5, r6, r2)     // Catch:{ a -> 0x004b }
            r0.f23912a = r4     // Catch:{ a -> 0x004b }
            r0.f23915d = r3     // Catch:{ a -> 0x004b }
            java.lang.Object r5 = Ug.L.e(r7, r0)     // Catch:{ a -> 0x004b }
            if (r5 != r1) goto L_0x0053
            return r1
        L_0x004b:
            r6 = move-exception
            r5 = r4
        L_0x004d:
            m3.V r7 = r6.a()
            if (r7 != r5) goto L_0x0056
        L_0x0053:
            lf.M r5 = lf.C6514M.f71813a
            return r5
        L_0x0056:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.V.b(int, yf.l, qf.d):java.lang.Object");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
