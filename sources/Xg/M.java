package Xg;

import Yg.b;
import Yg.q;
import Yg.t;
import Zg.G;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.d;
import lf.C6514M;
import mf.C6565s;
import qf.C6658d;
import qf.g;

final class M extends b implements x, C5694f, q {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66463f = AtomicReferenceFieldUpdater.newUpdater(M.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: e  reason: collision with root package name */
    private int f66464e;

    static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f66465a;

        /* renamed from: b  reason: collision with root package name */
        Object f66466b;

        /* renamed from: c  reason: collision with root package name */
        Object f66467c;

        /* renamed from: d  reason: collision with root package name */
        Object f66468d;

        /* renamed from: e  reason: collision with root package name */
        Object f66469e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f66470f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ M f66471g;

        /* renamed from: h  reason: collision with root package name */
        int f66472h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(M m10, C6658d dVar) {
            super(dVar);
            this.f66471g = m10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f66470f = obj;
            this.f66472h |= Integer.MIN_VALUE;
            return this.f66471g.collect((C5695g) null, this);
        }
    }

    public M(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        r8 = (Xg.O[]) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        if (r8 == null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        r1 = r8.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        if (r3 >= r1) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        r4 = r8[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        if (r4 == null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        r4.g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0045, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0047, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r8 = r6.f66464e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004a, code lost:
        if (r8 != r7) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004c, code lost:
        r6.f66464e = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004f, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0050, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r7 = n();
        r1 = lf.C6514M.f71813a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0059, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005a, code lost:
        r5 = r8;
        r8 = r7;
        r7 = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean r(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = 1
            monitor-enter(r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f66463f     // Catch:{ all -> 0x0015 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0015 }
            r2 = 0
            if (r7 == 0) goto L_0x0017
            boolean r7 = kotlin.jvm.internal.C6496s.c(r1, r7)     // Catch:{ all -> 0x0015 }
            if (r7 != 0) goto L_0x0017
            monitor-exit(r6)
            return r2
        L_0x0015:
            r7 = move-exception
            goto L_0x0066
        L_0x0017:
            boolean r7 = kotlin.jvm.internal.C6496s.c(r1, r8)     // Catch:{ all -> 0x0015 }
            if (r7 == 0) goto L_0x001f
            monitor-exit(r6)
            return r0
        L_0x001f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f66463f     // Catch:{ all -> 0x0015 }
            r7.set(r6, r8)     // Catch:{ all -> 0x0015 }
            int r7 = r6.f66464e     // Catch:{ all -> 0x0015 }
            r8 = r7 & 1
            if (r8 != 0) goto L_0x0060
            int r7 = r7 + r0
            r6.f66464e = r7     // Catch:{ all -> 0x0015 }
            Yg.d[] r8 = r6.n()     // Catch:{ all -> 0x0015 }
            lf.M r1 = lf.C6514M.f71813a     // Catch:{ all -> 0x0015 }
            monitor-exit(r6)
        L_0x0036:
            Xg.O[] r8 = (Xg.O[]) r8
            if (r8 == 0) goto L_0x0047
            int r1 = r8.length
            r3 = r2
        L_0x003c:
            if (r3 >= r1) goto L_0x0047
            r4 = r8[r3]
            if (r4 == 0) goto L_0x0045
            r4.g()
        L_0x0045:
            int r3 = r3 + r0
            goto L_0x003c
        L_0x0047:
            monitor-enter(r6)
            int r8 = r6.f66464e     // Catch:{ all -> 0x0051 }
            if (r8 != r7) goto L_0x0053
            int r7 = r7 + r0
            r6.f66464e = r7     // Catch:{ all -> 0x0051 }
            monitor-exit(r6)
            return r0
        L_0x0051:
            r7 = move-exception
            goto L_0x005e
        L_0x0053:
            Yg.d[] r7 = r6.n()     // Catch:{ all -> 0x0051 }
            lf.M r1 = lf.C6514M.f71813a     // Catch:{ all -> 0x0051 }
            monitor-exit(r6)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x0036
        L_0x005e:
            monitor-exit(r6)
            throw r7
        L_0x0060:
            int r7 = r7 + 2
            r6.f66464e = r7     // Catch:{ all -> 0x0015 }
            monitor-exit(r6)
            return r0
        L_0x0066:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Xg.M.r(java.lang.Object, java.lang.Object):boolean");
    }

    public C5694f a(g gVar, int i10, Wg.a aVar) {
        return N.d(this, gVar, i10, aVar);
    }

    public boolean b(Object obj) {
        setValue(obj);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: Xg.O} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: Xg.M} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b5 A[Catch:{ all -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c4 A[Catch:{ all -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c6 A[Catch:{ all -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d9 A[Catch:{ all -> 0x0043 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00da A[Catch:{ all -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e1 A[Catch:{ all -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object collect(Xg.C5695g r11, qf.C6658d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof Xg.M.a
            if (r0 == 0) goto L_0x0013
            r0 = r12
            Xg.M$a r0 = (Xg.M.a) r0
            int r1 = r0.f66472h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f66472h = r1
            goto L_0x0018
        L_0x0013:
            Xg.M$a r0 = new Xg.M$a
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f66470f
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f66472h
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0077
            if (r2 == r6) goto L_0x0065
            if (r2 == r5) goto L_0x004e
            if (r2 != r4) goto L_0x0046
            java.lang.Object r11 = r0.f66469e
            java.lang.Object r2 = r0.f66468d
            Ug.w0 r2 = (Ug.C5600w0) r2
            java.lang.Object r6 = r0.f66467c
            Xg.O r6 = (Xg.O) r6
            java.lang.Object r7 = r0.f66466b
            Xg.g r7 = (Xg.C5695g) r7
            java.lang.Object r8 = r0.f66465a
            Xg.M r8 = (Xg.M) r8
            lf.w.b(r12)     // Catch:{ all -> 0x0043 }
            goto L_0x00ab
        L_0x0043:
            r11 = move-exception
            goto L_0x00f4
        L_0x0046:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x004e:
            java.lang.Object r11 = r0.f66469e
            java.lang.Object r2 = r0.f66468d
            Ug.w0 r2 = (Ug.C5600w0) r2
            java.lang.Object r6 = r0.f66467c
            Xg.O r6 = (Xg.O) r6
            java.lang.Object r7 = r0.f66466b
            Xg.g r7 = (Xg.C5695g) r7
            java.lang.Object r8 = r0.f66465a
            Xg.M r8 = (Xg.M) r8
            lf.w.b(r12)     // Catch:{ all -> 0x0043 }
            goto L_0x00db
        L_0x0065:
            java.lang.Object r11 = r0.f66467c
            r6 = r11
            Xg.O r6 = (Xg.O) r6
            java.lang.Object r11 = r0.f66466b
            Xg.g r11 = (Xg.C5695g) r11
            java.lang.Object r2 = r0.f66465a
            r8 = r2
            Xg.M r8 = (Xg.M) r8
            lf.w.b(r12)     // Catch:{ all -> 0x0043 }
            goto L_0x009c
        L_0x0077:
            lf.w.b(r12)
            Yg.d r12 = r10.i()
            Xg.O r12 = (Xg.O) r12
            boolean r2 = r11 instanceof Xg.P     // Catch:{ all -> 0x0096 }
            if (r2 == 0) goto L_0x009a
            r2 = r11
            Xg.P r2 = (Xg.P) r2     // Catch:{ all -> 0x0096 }
            r0.f66465a = r10     // Catch:{ all -> 0x0096 }
            r0.f66466b = r11     // Catch:{ all -> 0x0096 }
            r0.f66467c = r12     // Catch:{ all -> 0x0096 }
            r0.f66472h = r6     // Catch:{ all -> 0x0096 }
            java.lang.Object r2 = r2.a(r0)     // Catch:{ all -> 0x0096 }
            if (r2 != r1) goto L_0x009a
            return r1
        L_0x0096:
            r11 = move-exception
            r8 = r10
            r6 = r12
            goto L_0x00f4
        L_0x009a:
            r8 = r10
            r6 = r12
        L_0x009c:
            qf.g r12 = r0.getContext()     // Catch:{ all -> 0x0043 }
            Ug.w0$b r2 = Ug.C5600w0.f65416O     // Catch:{ all -> 0x0043 }
            qf.g$b r12 = r12.b(r2)     // Catch:{ all -> 0x0043 }
            Ug.w0 r12 = (Ug.C5600w0) r12     // Catch:{ all -> 0x0043 }
            r7 = r11
            r2 = r12
            r11 = r3
        L_0x00ab:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = f66463f     // Catch:{ all -> 0x0043 }
            java.lang.Object r12 = r12.get(r8)     // Catch:{ all -> 0x0043 }
            if (r2 == 0) goto L_0x00b8
            Ug.A0.l(r2)     // Catch:{ all -> 0x0043 }
        L_0x00b8:
            if (r11 == 0) goto L_0x00c0
            boolean r9 = kotlin.jvm.internal.C6496s.c(r11, r12)     // Catch:{ all -> 0x0043 }
            if (r9 != 0) goto L_0x00db
        L_0x00c0:
            Zg.G r11 = Yg.t.f66850a     // Catch:{ all -> 0x0043 }
            if (r12 != r11) goto L_0x00c6
            r11 = r3
            goto L_0x00c7
        L_0x00c6:
            r11 = r12
        L_0x00c7:
            r0.f66465a = r8     // Catch:{ all -> 0x0043 }
            r0.f66466b = r7     // Catch:{ all -> 0x0043 }
            r0.f66467c = r6     // Catch:{ all -> 0x0043 }
            r0.f66468d = r2     // Catch:{ all -> 0x0043 }
            r0.f66469e = r12     // Catch:{ all -> 0x0043 }
            r0.f66472h = r5     // Catch:{ all -> 0x0043 }
            java.lang.Object r11 = r7.emit(r11, r0)     // Catch:{ all -> 0x0043 }
            if (r11 != r1) goto L_0x00da
            return r1
        L_0x00da:
            r11 = r12
        L_0x00db:
            boolean r12 = r6.h()     // Catch:{ all -> 0x0043 }
            if (r12 != 0) goto L_0x00ab
            r0.f66465a = r8     // Catch:{ all -> 0x0043 }
            r0.f66466b = r7     // Catch:{ all -> 0x0043 }
            r0.f66467c = r6     // Catch:{ all -> 0x0043 }
            r0.f66468d = r2     // Catch:{ all -> 0x0043 }
            r0.f66469e = r11     // Catch:{ all -> 0x0043 }
            r0.f66472h = r4     // Catch:{ all -> 0x0043 }
            java.lang.Object r12 = r6.e(r0)     // Catch:{ all -> 0x0043 }
            if (r12 != r1) goto L_0x00ab
            return r1
        L_0x00f4:
            r8.l(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Xg.M.collect(Xg.g, qf.d):java.lang.Object");
    }

    public List d() {
        return C6565s.e(getValue());
    }

    public boolean e(Object obj, Object obj2) {
        if (obj == null) {
            obj = t.f66850a;
        }
        if (obj2 == null) {
            obj2 = t.f66850a;
        }
        return r(obj, obj2);
    }

    public Object emit(Object obj, C6658d dVar) {
        setValue(obj);
        return C6514M.f71813a;
    }

    public Object getValue() {
        G g10 = t.f66850a;
        Object obj = f66463f.get(this);
        if (obj == g10) {
            return null;
        }
        return obj;
    }

    public void h() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public O j() {
        return new O();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public O[] k(int i10) {
        return new O[i10];
    }

    public void setValue(Object obj) {
        if (obj == null) {
            obj = t.f66850a;
        }
        r((Object) null, obj);
    }
}
