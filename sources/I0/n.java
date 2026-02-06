package i0;

import Rg.j;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6559l;
import mf.C6565s;
import qf.C6658d;
import yf.C6798l;
import yf.p;
import zf.C6828a;

public final class n implements Iterable, C6828a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f21741e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final n f21742f = new n(0, 0, 0, (int[]) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final long f21743a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final long f21744b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final int f21745c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final int[] f21746d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n a() {
            return n.f21742f;
        }

        private a() {
        }
    }

    static final class b extends k implements p {

        /* renamed from: b  reason: collision with root package name */
        Object f21747b;

        /* renamed from: c  reason: collision with root package name */
        int f21748c;

        /* renamed from: d  reason: collision with root package name */
        int f21749d;

        /* renamed from: e  reason: collision with root package name */
        int f21750e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f21751f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ n f21752g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(n nVar, C6658d dVar) {
            super(2, dVar);
            this.f21752g = nVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            b bVar = new b(this.f21752g, dVar);
            bVar.f21751f = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(j jVar, C6658d dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00b0  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00bb  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                java.lang.Object r1 = rf.C6680b.f()
                int r2 = r0.f21750e
                r3 = 0
                r4 = 1
                r6 = 3
                r7 = 2
                r8 = 64
                r10 = 0
                r12 = 1
                if (r2 == 0) goto L_0x0048
                if (r2 == r12) goto L_0x0038
                if (r2 == r7) goto L_0x002d
                if (r2 != r6) goto L_0x0025
                int r2 = r0.f21748c
                java.lang.Object r7 = r0.f21751f
                Rg.j r7 = (Rg.j) r7
                lf.w.b(r20)
                goto L_0x00e9
            L_0x0025:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x002d:
                int r2 = r0.f21748c
                java.lang.Object r13 = r0.f21751f
                Rg.j r13 = (Rg.j) r13
                lf.w.b(r20)
                goto L_0x00ae
            L_0x0038:
                int r2 = r0.f21749d
                int r13 = r0.f21748c
                java.lang.Object r14 = r0.f21747b
                int[] r14 = (int[]) r14
                java.lang.Object r15 = r0.f21751f
                Rg.j r15 = (Rg.j) r15
                lf.w.b(r20)
                goto L_0x0075
            L_0x0048:
                lf.w.b(r20)
                java.lang.Object r2 = r0.f21751f
                Rg.j r2 = (Rg.j) r2
                i0.n r13 = r0.f21752g
                int[] r13 = r13.f21746d
                if (r13 == 0) goto L_0x0078
                int r14 = r13.length
                r15 = r2
                r2 = r14
                r14 = r13
                r13 = 0
            L_0x005c:
                if (r13 >= r2) goto L_0x0077
                r16 = r14[r13]
                java.lang.Integer r9 = kotlin.coroutines.jvm.internal.b.c(r16)
                r0.f21751f = r15
                r0.f21747b = r14
                r0.f21748c = r13
                r0.f21749d = r2
                r0.f21750e = r12
                java.lang.Object r9 = r15.b(r9, r0)
                if (r9 != r1) goto L_0x0075
                return r1
            L_0x0075:
                int r13 = r13 + r12
                goto L_0x005c
            L_0x0077:
                r2 = r15
            L_0x0078:
                i0.n r9 = r0.f21752g
                long r13 = r9.f21744b
                int r9 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
                if (r9 == 0) goto L_0x00b1
                r13 = r2
                r2 = 0
            L_0x0084:
                if (r2 >= r8) goto L_0x00b0
                i0.n r9 = r0.f21752g
                long r14 = r9.f21744b
                long r17 = r4 << r2
                long r14 = r14 & r17
                int r9 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
                if (r9 == 0) goto L_0x00ae
                i0.n r9 = r0.f21752g
                int r9 = r9.f21745c
                int r9 = r9 + r2
                java.lang.Integer r9 = kotlin.coroutines.jvm.internal.b.c(r9)
                r0.f21751f = r13
                r0.f21747b = r3
                r0.f21748c = r2
                r0.f21750e = r7
                java.lang.Object r9 = r13.b(r9, r0)
                if (r9 != r1) goto L_0x00ae
                return r1
            L_0x00ae:
                int r2 = r2 + r12
                goto L_0x0084
            L_0x00b0:
                r2 = r13
            L_0x00b1:
                i0.n r7 = r0.f21752g
                long r13 = r7.f21743a
                int r7 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
                if (r7 == 0) goto L_0x00ec
                r7 = r2
                r9 = 0
            L_0x00bd:
                if (r9 >= r8) goto L_0x00ec
                i0.n r2 = r0.f21752g
                long r13 = r2.f21743a
                long r15 = r4 << r9
                long r13 = r13 & r15
                int r2 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
                if (r2 == 0) goto L_0x00ea
                int r2 = r9 + 64
                i0.n r13 = r0.f21752g
                int r13 = r13.f21745c
                int r2 = r2 + r13
                java.lang.Integer r2 = kotlin.coroutines.jvm.internal.b.c(r2)
                r0.f21751f = r7
                r0.f21747b = r3
                r0.f21748c = r9
                r0.f21750e = r6
                java.lang.Object r2 = r7.b(r2, r0)
                if (r2 != r1) goto L_0x00e8
                return r1
            L_0x00e8:
                r2 = r9
            L_0x00e9:
                r9 = r2
            L_0x00ea:
                int r9 = r9 + r12
                goto L_0x00bd
            L_0x00ec:
                lf.M r1 = lf.C6514M.f71813a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.n.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private n(long j10, long j11, int i10, int[] iArr) {
        this.f21743a = j10;
        this.f21744b = j11;
        this.f21745c = i10;
        this.f21746d = iArr;
    }

    public final n A(int i10) {
        int i11;
        int[] iArr;
        int i12 = i10;
        int i13 = this.f21745c;
        int i14 = i12 - i13;
        long j10 = 0;
        if (i14 >= 0 && i14 < 64) {
            long j11 = 1 << i14;
            long j12 = this.f21744b;
            if ((j12 & j11) == 0) {
                return new n(this.f21743a, j12 | j11, i13, this.f21746d);
            }
        } else if (i14 >= 64 && i14 < 128) {
            long j13 = 1 << (i14 - 64);
            long j14 = this.f21743a;
            if ((j14 & j13) == 0) {
                return new n(j14 | j13, this.f21744b, i13, this.f21746d);
            }
        } else if (i14 < 128) {
            int[] iArr2 = this.f21746d;
            if (iArr2 == null) {
                return new n(this.f21743a, this.f21744b, i13, new int[]{i10});
            }
            int a10 = o.a(iArr2, i12);
            if (a10 < 0) {
                int i15 = -(a10 + 1);
                int length = iArr2.length;
                int[] iArr3 = new int[(length + 1)];
                C6559l.k(iArr2, iArr3, 0, 0, i15);
                C6559l.k(iArr2, iArr3, i15 + 1, i15, length);
                iArr3[i15] = i12;
                return new n(this.f21743a, this.f21744b, this.f21745c, iArr3);
            }
        } else if (!v(i10)) {
            long j15 = this.f21743a;
            long j16 = this.f21744b;
            int i16 = this.f21745c;
            int i17 = ((i12 + 1) / 64) * 64;
            ArrayList arrayList = null;
            long j17 = j16;
            long j18 = j15;
            while (true) {
                if (i16 >= i17) {
                    i11 = i16;
                    break;
                }
                if (j17 != j10) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        int[] iArr4 = this.f21746d;
                        if (iArr4 != null) {
                            for (int valueOf : iArr4) {
                                arrayList.add(Integer.valueOf(valueOf));
                            }
                        }
                    }
                    for (int i18 = 0; i18 < 64; i18++) {
                        if (((1 << i18) & j17) != 0) {
                            arrayList.add(Integer.valueOf(i18 + i16));
                        }
                    }
                    j10 = 0;
                }
                if (j18 == j10) {
                    i11 = i17;
                    j17 = j10;
                    break;
                }
                i16 += 64;
                j17 = j18;
                j18 = j10;
            }
            if (arrayList == null || (iArr = C6565s.d1(arrayList)) == null) {
                iArr = this.f21746d;
            }
            return new n(j18, j17, i11, iArr).A(i12);
        }
        return this;
    }

    public Iterator iterator() {
        return Rg.k.b(new b(this, (C6658d) null)).iterator();
    }

    public final n r(n nVar) {
        n nVar2;
        int[] iArr;
        n nVar3 = f21742f;
        if (nVar == nVar3) {
            return this;
        }
        if (this == nVar3) {
            return nVar3;
        }
        int i10 = nVar.f21745c;
        int i11 = this.f21745c;
        if (i10 == i11 && nVar.f21746d == (iArr = this.f21746d)) {
            return new n(this.f21743a & (~nVar.f21743a), this.f21744b & (~nVar.f21744b), i11, iArr);
        }
        int[] a10 = nVar.f21746d;
        if (a10 != null) {
            nVar2 = this;
            for (int t10 : a10) {
                nVar2 = nVar2.t(t10);
            }
        } else {
            nVar2 = this;
        }
        if (nVar.f21744b != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if ((nVar.f21744b & (1 << i12)) != 0) {
                    nVar2 = nVar2.t(nVar.f21745c + i12);
                }
            }
        }
        if (nVar.f21743a != 0) {
            for (int i13 = 0; i13 < 64; i13++) {
                if ((nVar.f21743a & (1 << i13)) != 0) {
                    nVar2 = nVar2.t(i13 + 64 + nVar.f21745c);
                }
            }
        }
        return nVar2;
    }

    public final n t(int i10) {
        int[] iArr;
        int a10;
        int i11 = i10;
        int i12 = this.f21745c;
        int i13 = i11 - i12;
        if (i13 >= 0 && i13 < 64) {
            long j10 = 1 << i13;
            long j11 = this.f21744b;
            if ((j11 & j10) != 0) {
                return new n(this.f21743a, j11 & (~j10), i12, this.f21746d);
            }
        } else if (i13 >= 64 && i13 < 128) {
            long j12 = 1 << (i13 - 64);
            long j13 = this.f21743a;
            if ((j13 & j12) != 0) {
                return new n(j13 & (~j12), this.f21744b, i12, this.f21746d);
            }
        } else if (i13 < 0 && (iArr = this.f21746d) != null && (a10 = o.a(iArr, i11)) >= 0) {
            int length = iArr.length;
            int i14 = length - 1;
            if (i14 == 0) {
                return new n(this.f21743a, this.f21744b, this.f21745c, (int[]) null);
            }
            int[] iArr2 = new int[i14];
            if (a10 > 0) {
                C6559l.k(iArr, iArr2, 0, 0, a10);
            }
            if (a10 < i14) {
                C6559l.k(iArr, iArr2, a10, a10 + 1, length);
            }
            return new n(this.f21743a, this.f21744b, this.f21745c, iArr2);
        }
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(C6565s.y(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        sb2.append(C2048b.d(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 63, (Object) null));
        sb2.append(']');
        return sb2.toString();
    }

    public final boolean v(int i10) {
        int[] iArr;
        int i11 = i10 - this.f21745c;
        boolean z10 = true;
        if (i11 < 0 || i11 >= 64) {
            if (i11 < 64 || i11 >= 128) {
                if (i11 > 0 || (iArr = this.f21746d) == null) {
                    return false;
                }
                if (o.a(iArr, i10) < 0) {
                    z10 = false;
                }
                return z10;
            } else if (((1 << (i11 - 64)) & this.f21743a) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (((1 << i11) & this.f21744b) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final int x(int i10) {
        int[] iArr = this.f21746d;
        if (iArr != null) {
            return iArr[0];
        }
        long j10 = this.f21744b;
        if (j10 != 0) {
            return this.f21745c + Long.numberOfTrailingZeros(j10);
        }
        long j11 = this.f21743a;
        if (j11 != 0) {
            return this.f21745c + 64 + Long.numberOfTrailingZeros(j11);
        }
        return i10;
    }

    public final n z(n nVar) {
        n nVar2;
        int[] iArr;
        n nVar3 = f21742f;
        if (nVar == nVar3) {
            return this;
        }
        if (this == nVar3) {
            return nVar;
        }
        int i10 = nVar.f21745c;
        int i11 = this.f21745c;
        if (i10 == i11 && nVar.f21746d == (iArr = this.f21746d)) {
            return new n(this.f21743a | nVar.f21743a, this.f21744b | nVar.f21744b, i11, iArr);
        }
        int i12 = 0;
        if (this.f21746d == null) {
            int[] a10 = this.f21746d;
            if (a10 != null) {
                for (int A10 : a10) {
                    nVar = nVar.A(A10);
                }
            }
            if (this.f21744b != 0) {
                for (int i13 = 0; i13 < 64; i13++) {
                    if ((this.f21744b & (1 << i13)) != 0) {
                        nVar = nVar.A(this.f21745c + i13);
                    }
                }
            }
            if (this.f21743a != 0) {
                while (i12 < 64) {
                    if ((this.f21743a & (1 << i12)) != 0) {
                        nVar = nVar.A(i12 + 64 + this.f21745c);
                    }
                    i12++;
                }
            }
            return nVar;
        }
        int[] a11 = nVar.f21746d;
        if (a11 != null) {
            nVar2 = this;
            for (int A11 : a11) {
                nVar2 = nVar2.A(A11);
            }
        } else {
            nVar2 = this;
        }
        if (nVar.f21744b != 0) {
            for (int i14 = 0; i14 < 64; i14++) {
                if ((nVar.f21744b & (1 << i14)) != 0) {
                    nVar2 = nVar2.A(nVar.f21745c + i14);
                }
            }
        }
        if (nVar.f21743a != 0) {
            while (i12 < 64) {
                if ((nVar.f21743a & (1 << i12)) != 0) {
                    nVar2 = nVar2.A(i12 + 64 + nVar.f21745c);
                }
                i12++;
            }
        }
        return nVar2;
    }
}
