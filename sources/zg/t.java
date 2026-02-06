package Zg;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class t {

    /* renamed from: e  reason: collision with root package name */
    public static final a f66998e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66999f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f67000g;

    /* renamed from: h  reason: collision with root package name */
    public static final G f67001h = new G("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a  reason: collision with root package name */
    private final int f67002a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f67003b;

    /* renamed from: c  reason: collision with root package name */
    private final int f67004c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f67005d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(long j10) {
            if ((j10 & 2305843009213693952L) != 0) {
                return 2;
            }
            return 1;
        }

        public final long b(long j10, int i10) {
            return d(j10, 1073741823) | ((long) i10);
        }

        public final long c(long j10, int i10) {
            return d(j10, 1152921503533105152L) | (((long) i10) << 30);
        }

        public final long d(long j10, long j11) {
            return j10 & (~j11);
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f67006a;

        public b(int i10) {
            this.f67006a = i10;
        }
    }

    static {
        Class<t> cls = t.class;
        f66999f = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next$volatile");
        f67000g = AtomicLongFieldUpdater.newUpdater(cls, "_state$volatile");
    }

    public t(int i10, boolean z10) {
        this.f67002a = i10;
        this.f67003b = z10;
        int i11 = i10 - 1;
        this.f67004c = i11;
        this.f67005d = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        } else if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    private final t b(long j10) {
        t tVar = new t(this.f67002a * 2, this.f67003b);
        int i10 = (int) (1073741823 & j10);
        int i11 = (int) ((1152921503533105152L & j10) >> 30);
        while (true) {
            int i12 = this.f67004c;
            if ((i10 & i12) != (i12 & i11)) {
                Object obj = f().get(this.f67004c & i10);
                if (obj == null) {
                    obj = new b(i10);
                }
                tVar.f().set(tVar.f67004c & i10, obj);
                i10++;
            } else {
                f67000g.set(tVar, f66998e.d(j10, 1152921504606846976L));
                return tVar;
            }
        }
    }

    private final t c(long j10) {
        AtomicReferenceFieldUpdater h10 = f66999f;
        while (true) {
            t tVar = (t) h10.get(this);
            if (tVar != null) {
                return tVar;
            }
            androidx.concurrent.futures.b.a(f66999f, this, (Object) null, b(j10));
        }
    }

    private final t e(int i10, Object obj) {
        Object obj2 = f().get(this.f67004c & i10);
        if (!(obj2 instanceof b) || ((b) obj2).f67006a != i10) {
            return null;
        }
        f().set(i10 & this.f67004c, obj);
        return this;
    }

    private final /* synthetic */ AtomicReferenceArray f() {
        return this.f67005d;
    }

    private final long k() {
        long j10;
        long j11;
        AtomicLongFieldUpdater i10 = f67000g;
        do {
            j10 = i10.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                return j10;
            }
            j11 = j10 | 1152921504606846976L;
        } while (!i10.compareAndSet(this, j10, j11));
        return j11;
    }

    private final t n(int i10, int i11) {
        long j10;
        int i12;
        AtomicLongFieldUpdater i13 = f67000g;
        do {
            j10 = i13.get(this);
            i12 = (int) (1073741823 & j10);
            if ((1152921504606846976L & j10) != 0) {
                return l();
            }
        } while (!f67000g.compareAndSet(this, j10, f66998e.b(j10, i11)));
        f().set(this.f67004c & i12, (Object) null);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072 A[LOOP:1: B:20:0x0072->B:23:0x0089, LOOP_START, PHI: r0 
      PHI: (r0v3 Zg.t) = (r0v2 Zg.t), (r0v5 Zg.t) binds: [B:19:0x0068, B:23:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.lang.Object r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f67000g
        L_0x0004:
            long r3 = r0.get(r12)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0018
            Zg.t$a r13 = f66998e
            int r13 = r13.a(r3)
            return r13
        L_0x0018:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r9 = (int) r5
            int r10 = r12.f67004c
            int r2 = r9 + 2
            r2 = r2 & r10
            r5 = r1 & r10
            r6 = 1
            if (r2 != r5) goto L_0x0032
            return r6
        L_0x0032:
            boolean r2 = r12.f67003b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L_0x0053
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.f()
            r11 = r9 & r10
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L_0x0053
            int r2 = r12.f67002a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L_0x0052
            int r9 = r9 - r1
            r1 = r9 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L_0x0004
        L_0x0052:
            return r6
        L_0x0053:
            int r1 = r9 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f67000g
            Zg.t$a r5 = f66998e
            long r5 = r5.c(r3, r1)
            r1 = r2
            r2 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L_0x0004
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f()
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L_0x0072:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f67000g
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x008b
            Zg.t r0 = r0.l()
            Zg.t r0 = r0.e(r9, r13)
            if (r0 != 0) goto L_0x0072
        L_0x008b:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: Zg.t.a(java.lang.Object):int");
    }

    public final boolean d() {
        long j10;
        AtomicLongFieldUpdater i10 = f67000g;
        do {
            j10 = i10.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!i10.compareAndSet(this, j10, j10 | 2305843009213693952L));
        return true;
    }

    public final int g() {
        long j10 = f67000g.get(this);
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j10))) & 1073741823;
    }

    public final boolean j() {
        long j10 = f67000g.get(this);
        if (((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30))) {
            return true;
        }
        return false;
    }

    public final t l() {
        return c(k());
    }

    public final Object m() {
        AtomicLongFieldUpdater i10 = f67000g;
        while (true) {
            long j10 = i10.get(this);
            if ((1152921504606846976L & j10) != 0) {
                return f67001h;
            }
            int i11 = (int) (1073741823 & j10);
            int i12 = this.f67004c;
            if ((((int) ((1152921503533105152L & j10) >> 30)) & i12) == (i12 & i11)) {
                return null;
            }
            Object obj = f().get(this.f67004c & i11);
            if (obj == null) {
                if (this.f67003b) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                int i13 = (i11 + 1) & 1073741823;
                if (f67000g.compareAndSet(this, j10, f66998e.b(j10, i13))) {
                    f().set(this.f67004c & i11, (Object) null);
                    return obj;
                } else if (this.f67003b) {
                    t tVar = this;
                    do {
                        tVar = tVar.n(i11, i13);
                    } while (tVar != null);
                    return obj;
                }
            }
        }
    }
}
