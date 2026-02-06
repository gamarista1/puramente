package Xg;

import Ug.C5559b0;
import Ug.C5584o;
import Ug.C5588q;
import Yg.q;
import Zg.G;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.v;
import mf.C6565s;
import qf.C6658d;
import qf.g;
import rf.C6680b;

public class C extends Yg.b implements w, C5694f, q {

    /* renamed from: e  reason: collision with root package name */
    private final int f66411e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final int f66412f;

    /* renamed from: g  reason: collision with root package name */
    private final Wg.a f66413g;

    /* renamed from: h  reason: collision with root package name */
    private Object[] f66414h;

    /* renamed from: i  reason: collision with root package name */
    private long f66415i;

    /* renamed from: j  reason: collision with root package name */
    private long f66416j;

    /* renamed from: k  reason: collision with root package name */
    private int f66417k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public int f66418l;

    private static final class a implements C5559b0 {

        /* renamed from: a  reason: collision with root package name */
        public final C f66419a;

        /* renamed from: b  reason: collision with root package name */
        public long f66420b;

        /* renamed from: c  reason: collision with root package name */
        public final Object f66421c;

        /* renamed from: d  reason: collision with root package name */
        public final C6658d f66422d;

        public a(C c10, long j10, Object obj, C6658d dVar) {
            this.f66419a = c10;
            this.f66420b = j10;
            this.f66421c = obj;
            this.f66422d = dVar;
        }

        public void dispose() {
            this.f66419a.z(this);
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f66423a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Wg.a[] r0 = Wg.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Wg.a r1 = Wg.a.SUSPEND     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Wg.a r1 = Wg.a.DROP_LATEST     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Wg.a r1 = Wg.a.DROP_OLDEST     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f66423a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Xg.C.b.<clinit>():void");
        }
    }

    static final class c extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f66424a;

        /* renamed from: b  reason: collision with root package name */
        Object f66425b;

        /* renamed from: c  reason: collision with root package name */
        Object f66426c;

        /* renamed from: d  reason: collision with root package name */
        Object f66427d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f66428e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C f66429f;

        /* renamed from: g  reason: collision with root package name */
        int f66430g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C c10, C6658d dVar) {
            super(dVar);
            this.f66429f = c10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f66428e = obj;
            this.f66430g |= Integer.MIN_VALUE;
            return C.B(this.f66429f, (C5695g) null, this);
        }
    }

    public C(int i10, int i11, Wg.a aVar) {
        this.f66411e = i10;
        this.f66412f = i11;
        this.f66413g = aVar;
    }

    private final void A() {
        if (this.f66412f != 0 || this.f66418l > 1) {
            Object[] objArr = this.f66414h;
            C6496s.e(objArr);
            while (this.f66418l > 0 && D.f(objArr, (L() + ((long) Q())) - 1) == D.f66431a) {
                this.f66418l--;
                D.g(objArr, L() + ((long) Q()), (Object) null);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: Xg.E} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b1 A[Catch:{ all -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c6 A[Catch:{ all -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object B(Xg.C r8, Xg.C5695g r9, qf.C6658d r10) {
        /*
            boolean r0 = r10 instanceof Xg.C.c
            if (r0 == 0) goto L_0x0013
            r0 = r10
            Xg.C$c r0 = (Xg.C.c) r0
            int r1 = r0.f66430g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f66430g = r1
            goto L_0x0018
        L_0x0013:
            Xg.C$c r0 = new Xg.C$c
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f66428e
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f66430g
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0076
            if (r2 == r5) goto L_0x005f
            if (r2 == r4) goto L_0x004a
            if (r2 != r3) goto L_0x0042
            java.lang.Object r8 = r0.f66427d
            Ug.w0 r8 = (Ug.C5600w0) r8
            java.lang.Object r9 = r0.f66426c
            Xg.E r9 = (Xg.E) r9
            java.lang.Object r2 = r0.f66425b
            Xg.g r2 = (Xg.C5695g) r2
            java.lang.Object r5 = r0.f66424a
            Xg.C r5 = (Xg.C) r5
        L_0x003b:
            lf.w.b(r10)     // Catch:{ all -> 0x003f }
            goto L_0x005b
        L_0x003f:
            r8 = move-exception
            goto L_0x00dc
        L_0x0042:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x004a:
            java.lang.Object r8 = r0.f66427d
            Ug.w0 r8 = (Ug.C5600w0) r8
            java.lang.Object r9 = r0.f66426c
            Xg.E r9 = (Xg.E) r9
            java.lang.Object r2 = r0.f66425b
            Xg.g r2 = (Xg.C5695g) r2
            java.lang.Object r5 = r0.f66424a
            Xg.C r5 = (Xg.C) r5
            goto L_0x003b
        L_0x005b:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L_0x00a9
        L_0x005f:
            java.lang.Object r8 = r0.f66426c
            r9 = r8
            Xg.E r9 = (Xg.E) r9
            java.lang.Object r8 = r0.f66425b
            Xg.g r8 = (Xg.C5695g) r8
            java.lang.Object r2 = r0.f66424a
            Xg.C r2 = (Xg.C) r2
            lf.w.b(r10)     // Catch:{ all -> 0x0072 }
            r10 = r8
            r8 = r2
            goto L_0x009d
        L_0x0072:
            r8 = move-exception
            r5 = r2
            goto L_0x00dc
        L_0x0076:
            lf.w.b(r10)
            Yg.d r10 = r8.i()
            Xg.E r10 = (Xg.E) r10
            boolean r2 = r9 instanceof Xg.P     // Catch:{ all -> 0x0095 }
            if (r2 == 0) goto L_0x009a
            r2 = r9
            Xg.P r2 = (Xg.P) r2     // Catch:{ all -> 0x0095 }
            r0.f66424a = r8     // Catch:{ all -> 0x0095 }
            r0.f66425b = r9     // Catch:{ all -> 0x0095 }
            r0.f66426c = r10     // Catch:{ all -> 0x0095 }
            r0.f66430g = r5     // Catch:{ all -> 0x0095 }
            java.lang.Object r2 = r2.a(r0)     // Catch:{ all -> 0x0095 }
            if (r2 != r1) goto L_0x009a
            return r1
        L_0x0095:
            r9 = move-exception
            r5 = r8
            r8 = r9
            r9 = r10
            goto L_0x00dc
        L_0x009a:
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x009d:
            qf.g r2 = r0.getContext()     // Catch:{ all -> 0x00c2 }
            Ug.w0$b r5 = Ug.C5600w0.f65416O     // Catch:{ all -> 0x00c2 }
            qf.g$b r2 = r2.b(r5)     // Catch:{ all -> 0x00c2 }
            Ug.w0 r2 = (Ug.C5600w0) r2     // Catch:{ all -> 0x00c2 }
        L_0x00a9:
            java.lang.Object r5 = r8.V(r9)     // Catch:{ all -> 0x00c2 }
            Zg.G r6 = Xg.D.f66431a     // Catch:{ all -> 0x00c2 }
            if (r5 != r6) goto L_0x00c6
            r0.f66424a = r8     // Catch:{ all -> 0x00c2 }
            r0.f66425b = r10     // Catch:{ all -> 0x00c2 }
            r0.f66426c = r9     // Catch:{ all -> 0x00c2 }
            r0.f66427d = r2     // Catch:{ all -> 0x00c2 }
            r0.f66430g = r4     // Catch:{ all -> 0x00c2 }
            java.lang.Object r5 = r8.y(r9, r0)     // Catch:{ all -> 0x00c2 }
            if (r5 != r1) goto L_0x00a9
            return r1
        L_0x00c2:
            r10 = move-exception
            r5 = r8
            r8 = r10
            goto L_0x00dc
        L_0x00c6:
            if (r2 == 0) goto L_0x00cb
            Ug.A0.l(r2)     // Catch:{ all -> 0x00c2 }
        L_0x00cb:
            r0.f66424a = r8     // Catch:{ all -> 0x00c2 }
            r0.f66425b = r10     // Catch:{ all -> 0x00c2 }
            r0.f66426c = r9     // Catch:{ all -> 0x00c2 }
            r0.f66427d = r2     // Catch:{ all -> 0x00c2 }
            r0.f66430g = r3     // Catch:{ all -> 0x00c2 }
            java.lang.Object r5 = r10.emit(r5, r0)     // Catch:{ all -> 0x00c2 }
            if (r5 != r1) goto L_0x00a9
            return r1
        L_0x00dc:
            r5.l(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Xg.C.B(Xg.C, Xg.g, qf.d):java.lang.Object");
    }

    private final void C(long j10) {
        Yg.d[] g10;
        if (!(this.f66779b == 0 || (g10 = this.f66778a) == null)) {
            for (Yg.d dVar : g10) {
                if (dVar != null) {
                    E e10 = (E) dVar;
                    long j11 = e10.f66432a;
                    if (j11 >= 0 && j11 < j10) {
                        e10.f66432a = j10;
                    }
                }
            }
        }
        this.f66416j = j10;
    }

    private final void F() {
        Object[] objArr = this.f66414h;
        C6496s.e(objArr);
        D.g(objArr, L(), (Object) null);
        this.f66417k--;
        long L10 = L() + 1;
        if (this.f66415i < L10) {
            this.f66415i = L10;
        }
        if (this.f66416j < L10) {
            C(L10);
        }
    }

    static /* synthetic */ Object G(C c10, Object obj, C6658d dVar) {
        if (c10.b(obj)) {
            return C6514M.f71813a;
        }
        Object H10 = c10.H(obj, dVar);
        if (H10 == C6680b.f()) {
            return H10;
        }
        return C6514M.f71813a;
    }

    private final Object H(Object obj, C6658d dVar) {
        C6658d[] dVarArr;
        a aVar;
        C5584o oVar = new C5584o(C6680b.c(dVar), 1);
        oVar.E();
        C6658d[] dVarArr2 = Yg.c.f66782a;
        synchronized (this) {
            try {
                if (S(obj)) {
                    v.a aVar2 = v.f71841b;
                    oVar.resumeWith(v.b(C6514M.f71813a));
                    dVarArr = J(dVarArr2);
                    aVar = null;
                } else {
                    a aVar3 = new a(this, ((long) Q()) + L(), obj, oVar);
                    I(aVar3);
                    this.f66418l = this.f66418l + 1;
                    if (this.f66412f == 0) {
                        dVarArr2 = J(dVarArr2);
                    }
                    dVarArr = dVarArr2;
                    aVar = aVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            C5588q.a(oVar, aVar);
        }
        for (C6658d dVar2 : dVarArr) {
            if (dVar2 != null) {
                v.a aVar4 = v.f71841b;
                dVar2.resumeWith(v.b(C6514M.f71813a));
            }
        }
        Object v10 = oVar.v();
        if (v10 == C6680b.f()) {
            h.c(dVar);
        }
        if (v10 == C6680b.f()) {
            return v10;
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public final void I(Object obj) {
        int Q10 = Q();
        Object[] objArr = this.f66414h;
        if (objArr == null) {
            objArr = R((Object[]) null, 0, 2);
        } else if (Q10 >= objArr.length) {
            objArr = R(objArr, Q10, objArr.length * 2);
        }
        D.g(objArr, L() + ((long) Q10), obj);
    }

    /* JADX WARNING: type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r4 = (Xg.E) r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final qf.C6658d[] J(qf.C6658d[] r11) {
        /*
            r10 = this;
            int r0 = r11.length
            int r1 = r10.f66779b
            if (r1 == 0) goto L_0x0047
            Yg.d[] r1 = r10.f66778a
            if (r1 == 0) goto L_0x0047
            int r2 = r1.length
            r3 = 0
        L_0x000f:
            if (r3 >= r2) goto L_0x0047
            r4 = r1[r3]
            if (r4 == 0) goto L_0x0044
            Xg.E r4 = (Xg.E) r4
            qf.d r5 = r4.f66433b
            if (r5 != 0) goto L_0x001c
            goto L_0x0044
        L_0x001c:
            long r6 = r10.U(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0044
            int r6 = r11.length
            if (r0 < r6) goto L_0x0039
            int r6 = r11.length
            r7 = 2
            int r6 = r6 * r7
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r6)
            java.lang.String r6 = "copyOf(...)"
            kotlin.jvm.internal.C6496s.g(r11, r6)
        L_0x0039:
            r6 = r11
            qf.d[] r6 = (qf.C6658d[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.f66433b = r0
            r0 = r7
        L_0x0044:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0047:
            qf.d[] r11 = (qf.C6658d[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Xg.C.J(qf.d[]):qf.d[]");
    }

    private final long K() {
        return L() + ((long) this.f66417k);
    }

    /* access modifiers changed from: private */
    public final long L() {
        return Math.min(this.f66416j, this.f66415i);
    }

    private final Object N(long j10) {
        Object[] objArr = this.f66414h;
        C6496s.e(objArr);
        Object c10 = D.f(objArr, j10);
        if (c10 instanceof a) {
            return ((a) c10).f66421c;
        }
        return c10;
    }

    private final long O() {
        return L() + ((long) this.f66417k) + ((long) this.f66418l);
    }

    private final int P() {
        return (int) ((L() + ((long) this.f66417k)) - this.f66415i);
    }

    /* access modifiers changed from: private */
    public final int Q() {
        return this.f66417k + this.f66418l;
    }

    private final Object[] R(Object[] objArr, int i10, int i11) {
        if (i11 > 0) {
            Object[] objArr2 = new Object[i11];
            this.f66414h = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long L10 = L();
            for (int i12 = 0; i12 < i10; i12++) {
                long j10 = ((long) i12) + L10;
                D.g(objArr2, j10, D.f(objArr, j10));
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow");
    }

    /* access modifiers changed from: private */
    public final boolean S(Object obj) {
        if (m() == 0) {
            return T(obj);
        }
        if (this.f66417k >= this.f66412f && this.f66416j <= this.f66415i) {
            int i10 = b.f66423a[this.f66413g.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
        }
        I(obj);
        int i11 = this.f66417k + 1;
        this.f66417k = i11;
        if (i11 > this.f66412f) {
            F();
        }
        if (P() > this.f66411e) {
            W(this.f66415i + 1, this.f66416j, K(), O());
        }
        return true;
    }

    private final boolean T(Object obj) {
        if (this.f66411e == 0) {
            return true;
        }
        I(obj);
        int i10 = this.f66417k + 1;
        this.f66417k = i10;
        if (i10 > this.f66411e) {
            F();
        }
        this.f66416j = L() + ((long) this.f66417k);
        return true;
    }

    /* access modifiers changed from: private */
    public final long U(E e10) {
        long j10 = e10.f66432a;
        if (j10 < K()) {
            return j10;
        }
        if (this.f66412f <= 0 && j10 <= L() && this.f66418l != 0) {
            return j10;
        }
        return -1;
    }

    private final Object V(E e10) {
        Object obj;
        C6658d[] dVarArr = Yg.c.f66782a;
        synchronized (this) {
            try {
                long U10 = U(e10);
                if (U10 < 0) {
                    obj = D.f66431a;
                } else {
                    long j10 = e10.f66432a;
                    Object N10 = N(U10);
                    e10.f66432a = U10 + 1;
                    Object obj2 = N10;
                    dVarArr = X(j10);
                    obj = obj2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (C6658d dVar : dVarArr) {
            if (dVar != null) {
                v.a aVar = v.f71841b;
                dVar.resumeWith(v.b(C6514M.f71813a));
            }
        }
        return obj;
    }

    private final void W(long j10, long j11, long j12, long j13) {
        long min = Math.min(j11, j10);
        for (long L10 = L(); L10 < min; L10++) {
            Object[] objArr = this.f66414h;
            C6496s.e(objArr);
            D.g(objArr, L10, (Object) null);
        }
        this.f66415i = j10;
        this.f66416j = j11;
        this.f66417k = (int) (j12 - min);
        this.f66418l = (int) (j13 - j12);
    }

    private final Object y(E e10, C6658d dVar) {
        C5584o oVar = new C5584o(C6680b.c(dVar), 1);
        oVar.E();
        synchronized (this) {
            try {
                if (U(e10) < 0) {
                    e10.f66433b = oVar;
                } else {
                    v.a aVar = v.f71841b;
                    oVar.resumeWith(v.b(C6514M.f71813a));
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object v10 = oVar.v();
        if (v10 == C6680b.f()) {
            h.c(dVar);
        }
        if (v10 == C6680b.f()) {
            return v10;
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public final void z(a aVar) {
        synchronized (this) {
            if (aVar.f66420b >= L()) {
                Object[] objArr = this.f66414h;
                C6496s.e(objArr);
                if (D.f(objArr, aVar.f66420b) == aVar) {
                    D.g(objArr, aVar.f66420b, D.f66431a);
                    A();
                    C6514M m10 = C6514M.f71813a;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public E j() {
        return new E();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public E[] k(int i10) {
        return new E[i10];
    }

    /* access modifiers changed from: protected */
    public final Object M() {
        Object[] objArr = this.f66414h;
        C6496s.e(objArr);
        return D.f(objArr, (this.f66415i + ((long) P())) - 1);
    }

    public final C6658d[] X(long j10) {
        int i10;
        long j11;
        long j12;
        long j13;
        boolean z10;
        long j14;
        Yg.d[] g10;
        if (j10 > this.f66416j) {
            return Yg.c.f66782a;
        }
        long L10 = L();
        long j15 = ((long) this.f66417k) + L10;
        if (this.f66412f == 0 && this.f66418l > 0) {
            j15++;
        }
        if (!(this.f66779b == 0 || (g10 = this.f66778a) == null)) {
            for (Yg.d dVar : g10) {
                if (dVar != null) {
                    long j16 = ((E) dVar).f66432a;
                    if (j16 >= 0 && j16 < j15) {
                        j15 = j16;
                    }
                }
            }
        }
        if (j15 <= this.f66416j) {
            return Yg.c.f66782a;
        }
        long K10 = K();
        if (m() > 0) {
            i10 = Math.min(this.f66418l, this.f66412f - ((int) (K10 - j15)));
        } else {
            i10 = this.f66418l;
        }
        C6658d[] dVarArr = Yg.c.f66782a;
        long j17 = ((long) this.f66418l) + K10;
        if (i10 > 0) {
            dVarArr = new C6658d[i10];
            Object[] objArr = this.f66414h;
            C6496s.e(objArr);
            long j18 = K10;
            int i11 = 0;
            while (true) {
                if (K10 >= j17) {
                    j12 = j15;
                    j11 = j17;
                    break;
                }
                Object c10 = D.f(objArr, K10);
                j12 = j15;
                G g11 = D.f66431a;
                if (c10 != g11) {
                    C6496s.f(c10, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) c10;
                    int i12 = i11 + 1;
                    j11 = j17;
                    dVarArr[i11] = aVar.f66422d;
                    D.g(objArr, K10, g11);
                    D.g(objArr, j18, aVar.f66421c);
                    j14 = 1;
                    j18++;
                    if (i12 >= i10) {
                        break;
                    }
                    i11 = i12;
                } else {
                    j11 = j17;
                    j14 = 1;
                }
                K10 += j14;
                j15 = j12;
                j17 = j11;
            }
            K10 = j18;
        } else {
            j12 = j15;
            j11 = j17;
        }
        int i13 = (int) (K10 - L10);
        if (m() == 0) {
            j13 = K10;
        } else {
            j13 = j12;
        }
        long max = Math.max(this.f66415i, K10 - ((long) Math.min(this.f66411e, i13)));
        if (this.f66412f == 0 && max < j11) {
            Object[] objArr2 = this.f66414h;
            C6496s.e(objArr2);
            if (C6496s.c(D.f(objArr2, max), D.f66431a)) {
                K10++;
                max++;
            }
        }
        W(max, j13, K10, j11);
        A();
        if (dVarArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return J(dVarArr);
        }
        return dVarArr;
    }

    public final long Y() {
        long j10 = this.f66415i;
        if (j10 < this.f66416j) {
            this.f66416j = j10;
        }
        return j10;
    }

    public C5694f a(g gVar, int i10, Wg.a aVar) {
        return D.e(this, gVar, i10, aVar);
    }

    public boolean b(Object obj) {
        int i10;
        boolean z10;
        C6658d[] dVarArr = Yg.c.f66782a;
        synchronized (this) {
            if (S(obj)) {
                dVarArr = J(dVarArr);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (C6658d dVar : dVarArr) {
            if (dVar != null) {
                v.a aVar = v.f71841b;
                dVar.resumeWith(v.b(C6514M.f71813a));
            }
        }
        return z10;
    }

    public Object collect(C5695g gVar, C6658d dVar) {
        return B(this, gVar, dVar);
    }

    public List d() {
        synchronized (this) {
            int P10 = P();
            if (P10 == 0) {
                List n10 = C6565s.n();
                return n10;
            }
            ArrayList arrayList = new ArrayList(P10);
            Object[] objArr = this.f66414h;
            C6496s.e(objArr);
            for (int i10 = 0; i10 < P10; i10++) {
                arrayList.add(D.f(objArr, this.f66415i + ((long) i10)));
            }
            return arrayList;
        }
    }

    public Object emit(Object obj, C6658d dVar) {
        return G(this, obj, dVar);
    }

    public void h() {
        synchronized (this) {
            W(K(), this.f66416j, K(), O());
            C6514M m10 = C6514M.f71813a;
        }
    }
}
