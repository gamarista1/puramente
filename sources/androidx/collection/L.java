package androidx.collection;

import Rg.j;
import androidx.collection.W;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6508G;
import lf.C6514M;
import mf.C6559l;
import qf.C6658d;
import u.C2667d;
import yf.p;
import zf.C6828a;
import zf.C6833f;

public final class L extends W {

    /* renamed from: e  reason: collision with root package name */
    private int f12084e;

    private final class a extends W.a implements Set, C6833f {

        /* renamed from: androidx.collection.L$a$a  reason: collision with other inner class name */
        public static final class C0215a implements Iterator, C6828a {

            /* renamed from: a  reason: collision with root package name */
            private int f12086a = -1;

            /* renamed from: b  reason: collision with root package name */
            private final Iterator f12087b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ L f12088c;

            /* renamed from: androidx.collection.L$a$a$a  reason: collision with other inner class name */
            static final class C0216a extends k implements p {

                /* renamed from: b  reason: collision with root package name */
                Object f12089b;

                /* renamed from: c  reason: collision with root package name */
                Object f12090c;

                /* renamed from: d  reason: collision with root package name */
                Object f12091d;

                /* renamed from: e  reason: collision with root package name */
                int f12092e;

                /* renamed from: f  reason: collision with root package name */
                int f12093f;

                /* renamed from: g  reason: collision with root package name */
                int f12094g;

                /* renamed from: h  reason: collision with root package name */
                int f12095h;

                /* renamed from: i  reason: collision with root package name */
                long f12096i;

                /* renamed from: j  reason: collision with root package name */
                int f12097j;

                /* renamed from: k  reason: collision with root package name */
                private /* synthetic */ Object f12098k;

                /* renamed from: l  reason: collision with root package name */
                final /* synthetic */ L f12099l;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ C0215a f12100m;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0216a(L l10, C0215a aVar, C6658d dVar) {
                    super(2, dVar);
                    this.f12099l = l10;
                    this.f12100m = aVar;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    C0216a aVar = new C0216a(this.f12099l, this.f12100m, dVar);
                    aVar.f12098k = obj;
                    return aVar;
                }

                /* renamed from: i */
                public final Object invoke(j jVar, C6658d dVar) {
                    return ((C0216a) create(jVar, dVar)).invokeSuspend(C6514M.f71813a);
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
                    	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
                    */
                /* JADX WARNING: Removed duplicated region for block: B:15:0x007a  */
                /* JADX WARNING: Removed duplicated region for block: B:19:0x00a2  */
                public final java.lang.Object invokeSuspend(java.lang.Object r23) {
                    /*
                        r22 = this;
                        r0 = r22
                        java.lang.Object r1 = rf.C6680b.f()
                        int r2 = r0.f12097j
                        r4 = 8
                        r5 = 1
                        if (r2 == 0) goto L_0x0036
                        if (r2 != r5) goto L_0x002e
                        int r2 = r0.f12095h
                        int r6 = r0.f12094g
                        long r7 = r0.f12096i
                        int r9 = r0.f12093f
                        int r10 = r0.f12092e
                        java.lang.Object r11 = r0.f12091d
                        long[] r11 = (long[]) r11
                        java.lang.Object r12 = r0.f12090c
                        androidx.collection.L r12 = (androidx.collection.L) r12
                        java.lang.Object r13 = r0.f12089b
                        androidx.collection.L$a$a r13 = (androidx.collection.L.a.C0215a) r13
                        java.lang.Object r14 = r0.f12098k
                        Rg.j r14 = (Rg.j) r14
                        lf.w.b(r23)
                        goto L_0x009f
                    L_0x002e:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r1
                    L_0x0036:
                        lf.w.b(r23)
                        java.lang.Object r2 = r0.f12098k
                        Rg.j r2 = (Rg.j) r2
                        androidx.collection.L r6 = r0.f12099l
                        androidx.collection.L$a$a r7 = r0.f12100m
                        long[] r8 = r6.f12130a
                        int r9 = r8.length
                        int r9 = r9 + -2
                        if (r9 < 0) goto L_0x00b2
                        r10 = 0
                    L_0x0049:
                        r11 = r8[r10]
                        long r13 = ~r11
                        r15 = 7
                        long r13 = r13 << r15
                        long r13 = r13 & r11
                        r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                        long r13 = r13 & r15
                        int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                        if (r13 == 0) goto L_0x00ad
                        int r13 = r10 - r9
                        int r13 = ~r13
                        int r13 = r13 >>> 31
                        int r13 = 8 - r13
                        r14 = r2
                        r2 = 0
                        r19 = r11
                        r12 = r6
                        r11 = r8
                        r6 = r13
                        r13 = r7
                        r7 = r19
                        r21 = r10
                        r10 = r9
                        r9 = r21
                    L_0x006f:
                        if (r2 >= r6) goto L_0x00a2
                        r15 = 255(0xff, double:1.26E-321)
                        long r15 = r15 & r7
                        r17 = 128(0x80, double:6.32E-322)
                        int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                        if (r15 >= 0) goto L_0x009f
                        int r15 = r9 << 3
                        int r15 = r15 + r2
                        r13.a(r15)
                        java.lang.Object[] r3 = r12.f12131b
                        r3 = r3[r15]
                        r0.f12098k = r14
                        r0.f12089b = r13
                        r0.f12090c = r12
                        r0.f12091d = r11
                        r0.f12092e = r10
                        r0.f12093f = r9
                        r0.f12096i = r7
                        r0.f12094g = r6
                        r0.f12095h = r2
                        r0.f12097j = r5
                        java.lang.Object r3 = r14.b(r3, r0)
                        if (r3 != r1) goto L_0x009f
                        return r1
                    L_0x009f:
                        long r7 = r7 >> r4
                        int r2 = r2 + r5
                        goto L_0x006f
                    L_0x00a2:
                        if (r6 != r4) goto L_0x00b2
                        r8 = r11
                        r6 = r12
                        r7 = r13
                        r2 = r14
                        r19 = r10
                        r10 = r9
                        r9 = r19
                    L_0x00ad:
                        if (r10 == r9) goto L_0x00b2
                        int r10 = r10 + 1
                        goto L_0x0049
                    L_0x00b2:
                        lf.M r1 = lf.C6514M.f71813a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.collection.L.a.C0215a.C0216a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            C0215a(L l10) {
                this.f12088c = l10;
                this.f12087b = Rg.k.a(new C0216a(l10, this, (C6658d) null));
            }

            public final void a(int i10) {
                this.f12086a = i10;
            }

            public boolean hasNext() {
                return this.f12087b.hasNext();
            }

            public Object next() {
                return this.f12087b.next();
            }

            public void remove() {
                int i10 = this.f12086a;
                if (i10 != -1) {
                    this.f12088c.y(i10);
                    this.f12086a = -1;
                }
            }
        }

        public a() {
            super();
        }

        public boolean add(Object obj) {
            return L.this.h(obj);
        }

        public boolean addAll(Collection collection) {
            C6496s.h(collection, "elements");
            return L.this.j(collection);
        }

        public void clear() {
            L.this.m();
        }

        public Iterator iterator() {
            return new C0215a(L.this);
        }

        public boolean remove(Object obj) {
            return L.this.x(obj);
        }

        public boolean removeAll(Collection collection) {
            C6496s.h(collection, "elements");
            int c10 = L.this.c();
            for (Object t10 : collection) {
                L.this.t(t10);
            }
            if (c10 != L.this.c()) {
                return true;
            }
            return false;
        }

        public boolean retainAll(Collection collection) {
            Collection collection2 = collection;
            C6496s.h(collection2, "elements");
            L l10 = L.this;
            long[] jArr = l10.f12130a;
            int length = jArr.length - 2;
            boolean z10 = false;
            if (length >= 0) {
                int i10 = 0;
                boolean z11 = false;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                int i13 = (i10 << 3) + i12;
                                if (!collection2.contains(l10.f12131b[i13])) {
                                    l10.y(i13);
                                    z11 = true;
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            return z11;
                        }
                    }
                    if (i10 == length) {
                        z10 = z11;
                        break;
                    }
                    i10++;
                }
            }
            return z10;
        }
    }

    public L(int i10) {
        super((DefaultConstructorMarker) null);
        if (!(i10 >= 0)) {
            C2667d.a("Capacity must be a positive value.");
        }
        s(V.g(i10));
    }

    private final int o(Object obj) {
        int i10;
        int i11;
        Object obj2 = obj;
        if (obj2 != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * -862048943;
        int i13 = i12 ^ (i12 << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f12132c;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr = this.f12130a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            long j10 = ((jArr[i19 + 1] << (64 - i20)) & ((-((long) i20)) >> 63)) | (jArr[i19] >>> i20);
            long j11 = (long) i15;
            int i21 = i15;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & -9187201950435737472L; j13 != 0; j13 &= j13 - 1) {
                int numberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j13) >> 3)) & i16;
                if (C6496s.c(this.f12131b[numberOfTrailingZeros], obj2)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & -9187201950435737472L) != 0) {
                int p10 = p(i14);
                if (this.f12084e == 0 && ((this.f12130a[p10 >> 3] >> ((p10 & 7) << 3)) & 255) != 254) {
                    k();
                    p10 = p(i14);
                }
                this.f12133d++;
                int i22 = this.f12084e;
                long[] jArr2 = this.f12130a;
                int i23 = p10 >> 3;
                long j14 = jArr2[i23];
                int i24 = (p10 & 7) << 3;
                if (((j14 >> i24) & 255) == 128) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                this.f12084e = i22 - i11;
                int i25 = this.f12132c;
                long j15 = ((~(255 << i24)) & j14) | (j11 << i24);
                jArr2[i23] = j15;
                jArr2[(((p10 - 7) & i25) + (i25 & 7)) >> 3] = j15;
                return p10;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            i15 = i21;
        }
    }

    private final int p(int i10) {
        int i11 = this.f12132c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f12130a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-((long) i15)) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & -9187201950435737472L;
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    private final void q() {
        this.f12084e = V.c(b()) - this.f12133d;
    }

    private final void r(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = V.f12128a;
        } else {
            jArr = new long[(((i10 + 15) & -8) >> 3)];
            C6559l.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f12130a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        q();
    }

    private final void s(int i10) {
        int i11;
        if (i10 > 0) {
            i11 = Math.max(7, V.f(i10));
        } else {
            i11 = 0;
        }
        this.f12132c = i11;
        r(i11);
        this.f12131b = new Object[i11];
    }

    public final boolean h(Object obj) {
        int c10 = c();
        this.f12131b[o(obj)] = obj;
        if (c() != c10) {
            return true;
        }
        return false;
    }

    public final boolean i(W w10) {
        C6496s.h(w10, "elements");
        int c10 = c();
        u(w10);
        if (c10 != c()) {
            return true;
        }
        return false;
    }

    public final boolean j(Iterable iterable) {
        C6496s.h(iterable, "elements");
        int c10 = c();
        v(iterable);
        if (c10 != c()) {
            return true;
        }
        return false;
    }

    public final void k() {
        if (this.f12132c <= 8 || Long.compare(C6508G.b(C6508G.b((long) this.f12133d) * 32) ^ Long.MIN_VALUE, C6508G.b(C6508G.b((long) this.f12132c) * 25) ^ Long.MIN_VALUE) > 0) {
            z(V.e(this.f12132c));
        } else {
            n();
        }
    }

    public final Set l() {
        return new a();
    }

    public final void m() {
        this.f12133d = 0;
        long[] jArr = this.f12130a;
        if (jArr != V.f12128a) {
            C6559l.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f12130a;
            int i10 = this.f12132c;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        C6559l.w(this.f12131b, (Object) null, 0, this.f12132c);
        q();
    }

    public final void n() {
        int i10;
        int i11;
        long[] jArr = this.f12130a;
        int i12 = this.f12132c;
        Object[] objArr = this.f12131b;
        V.a(jArr, i12);
        int i13 = 0;
        int i14 = 0;
        int i15 = -1;
        while (i14 != i12) {
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = (jArr[i16] >> i17) & 255;
            if (j10 == 128) {
                i15 = i14;
                i14++;
            } else {
                if (j10 == 254) {
                    Object obj = objArr[i14];
                    if (obj != null) {
                        i10 = obj.hashCode();
                    } else {
                        i10 = i13;
                    }
                    int i18 = i10 * -862048943;
                    int i19 = i18 ^ (i18 << 16);
                    int i20 = i19 >>> 7;
                    int p10 = p(i20);
                    int i21 = i20 & i12;
                    if (((p10 - i21) & i12) / 8 == ((i14 - i21) & i12) / 8) {
                        jArr[i16] = (((long) (i19 & 127)) << i17) | ((~(255 << i17)) & jArr[i16]);
                        jArr[C6559l.i0(jArr)] = (jArr[i13] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i22 = p10 >> 3;
                        long j11 = jArr[i22];
                        int i23 = (p10 & 7) << 3;
                        if (((j11 >> i23) & 255) == 128) {
                            int i24 = i14;
                            jArr[i22] = (((long) (i19 & 127)) << i23) | (j11 & (~(255 << i23)));
                            jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                            objArr[p10] = objArr[i24];
                            objArr[i24] = null;
                            i11 = i24;
                            i15 = i11;
                        } else {
                            int i25 = i14;
                            jArr[i22] = (((long) (i19 & 127)) << i23) | (j11 & (~(255 << i23)));
                            if (i15 == -1) {
                                i15 = V.b(jArr, i25 + 1, i12);
                            }
                            objArr[i15] = objArr[p10];
                            objArr[p10] = objArr[i25];
                            objArr[i25] = objArr[i15];
                            i11 = i25 - 1;
                        }
                        jArr[C6559l.i0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i14 = i11 + 1;
                        i13 = 0;
                    }
                }
                i14++;
            }
        }
        q();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0069, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006b, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L_0x0008
            int r1 = r14.hashCode()
            goto L_0x0009
        L_0x0008:
            r1 = r0
        L_0x0009:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f12132c
            int r1 = r1 >>> 7
        L_0x0016:
            r1 = r1 & r3
            long[] r4 = r13.f12130a
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L_0x0043:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0062
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f12131b
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.C6496s.c(r11, r14)
            if (r11 == 0) goto L_0x005c
            goto L_0x006c
        L_0x005c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L_0x0043
        L_0x0062:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x0072
            r10 = -1
        L_0x006c:
            if (r10 < 0) goto L_0x0071
            r13.y(r10)
        L_0x0071:
            return
        L_0x0072:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.L.t(java.lang.Object):void");
    }

    public final void u(W w10) {
        C6496s.h(w10, "elements");
        Object[] objArr = w10.f12131b;
        long[] jArr = w10.f12130a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            w(objArr[(i10 << 3) + i12]);
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void v(Iterable iterable) {
        C6496s.h(iterable, "elements");
        for (Object w10 : iterable) {
            w(w10);
        }
    }

    public final void w(Object obj) {
        this.f12131b[o(obj)] = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006e, code lost:
        if (((r7 & ((~r7) << 6)) & -9187201950435737472L) == 0) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0070, code lost:
        r11 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean x(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto L_0x000c
            int r3 = r18.hashCode()
            goto L_0x000d
        L_0x000c:
            r3 = r2
        L_0x000d:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f12132c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L_0x001c:
            long[] r7 = r0.f12130a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L_0x0048:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L_0x0067
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f12131b
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.C6496s.c(r15, r1)
            if (r15 == 0) goto L_0x0061
            goto L_0x0071
        L_0x0061:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L_0x0048
        L_0x0067:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L_0x007a
            r11 = -1
        L_0x0071:
            if (r11 < 0) goto L_0x0074
            r2 = r12
        L_0x0074:
            if (r2 == 0) goto L_0x0079
            r0.y(r11)
        L_0x0079:
            return r2
        L_0x007a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.L.x(java.lang.Object):boolean");
    }

    public final void y(int i10) {
        this.f12133d--;
        long[] jArr = this.f12130a;
        int i11 = this.f12132c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f12131b[i10] = null;
    }

    public final void z(int i10) {
        int i11;
        long[] jArr = this.f12130a;
        Object[] objArr = this.f12131b;
        int i12 = this.f12132c;
        s(i10);
        long[] jArr2 = this.f12130a;
        Object[] objArr2 = this.f12131b;
        int i13 = this.f12132c;
        for (int i14 = 0; i14 < i12; i14++) {
            if (((jArr[i14 >> 3] >> ((i14 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i14];
                if (obj != null) {
                    i11 = obj.hashCode();
                } else {
                    i11 = 0;
                }
                int i15 = i11 * -862048943;
                int i16 = i15 ^ (i15 << 16);
                int p10 = p(i16 >>> 7);
                long j10 = (long) (i16 & 127);
                int i17 = p10 >> 3;
                int i18 = (p10 & 7) << 3;
                long j11 = (jArr2[i17] & (~(255 << i18))) | (j10 << i18);
                jArr2[i17] = j11;
                jArr2[(((p10 - 7) & i13) + (i13 & 7)) >> 3] = j11;
                objArr2[p10] = obj;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
