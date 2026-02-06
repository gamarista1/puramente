package androidx.compose.animation;

import H0.C1193n;
import H0.C1194o;
import H0.F;
import H0.U;
import c1.n;
import c1.s;
import c1.t;
import java.util.List;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.C6565s;
import yf.C6798l;

final class b implements F {

    /* renamed from: a  reason: collision with root package name */
    private final e f12260a;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U[] f12261a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f12262b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f12263c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f12264d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(U[] uArr, b bVar, int i10, int i11) {
            super(1);
            this.f12261a = uArr;
            this.f12262b = bVar;
            this.f12263c = i10;
            this.f12264d = i11;
        }

        public final void a(U.a aVar) {
            U[] uArr = this.f12261a;
            b bVar = this.f12262b;
            int i10 = this.f12263c;
            int i11 = this.f12264d;
            for (U u10 : uArr) {
                if (u10 != null) {
                    long a10 = bVar.c().n().a(s.a(u10.X0(), u10.R0()), s.a(i10, i11), t.Ltr);
                    U.a.h(aVar, u10, n.j(a10), n.k(a10), 0.0f, 4, (Object) null);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public b(e eVar) {
        this.f12260a = eVar;
    }

    public int a(C1194o oVar, List list, int i10) {
        Integer num;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((C1193n) list.get(0)).e0(i10));
            int p10 = C6565s.p(list);
            int i11 = 1;
            if (1 <= p10) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((C1193n) list.get(i11)).e0(i10));
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i11 == p10) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int b(C1194o oVar, List list, int i10) {
        Integer num;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((C1193n) list.get(0)).t0(i10));
            int p10 = C6565s.p(list);
            int i11 = 1;
            if (1 <= p10) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((C1193n) list.get(i11)).t0(i10));
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i11 == p10) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final e c() {
        return this.f12260a;
    }

    public int g(C1194o oVar, List list, int i10) {
        Integer num;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((C1193n) list.get(0)).s(i10));
            int p10 = C6565s.p(list);
            int i11 = 1;
            if (1 <= p10) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((C1193n) list.get(i11)).s(i10));
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i11 == p10) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int h(C1194o oVar, List list, int i10) {
        Integer num;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((C1193n) list.get(0)).s0(i10));
            int p10 = C6565s.p(list);
            int i11 = 1;
            if (1 <= p10) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((C1193n) list.get(i11)).s0(i10));
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i11 == p10) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: androidx.compose.animation.e$a} */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v1, types: [H0.U] */
    /* JADX WARNING: type inference failed for: r12v12 */
    /* JADX WARNING: type inference failed for: r12v14 */
    /* JADX WARNING: type inference failed for: r12v17 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public H0.G j(H0.H r21, java.util.List r22, long r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            r2 = r23
            r4 = 1
            int r5 = r22.size()
            H0.U[] r6 = new H0.U[r5]
            c1.r$a r7 = c1.r.f19235b
            long r7 = r7.a()
            int r9 = r22.size()
            r10 = 0
            r11 = r10
        L_0x0019:
            r12 = 0
            if (r11 >= r9) goto L_0x004c
            java.lang.Object r13 = r1.get(r11)
            H0.E r13 = (H0.E) r13
            java.lang.Object r14 = r13.a()
            boolean r15 = r14 instanceof androidx.compose.animation.e.a
            if (r15 == 0) goto L_0x002d
            r12 = r14
            androidx.compose.animation.e$a r12 = (androidx.compose.animation.e.a) r12
        L_0x002d:
            if (r12 == 0) goto L_0x004a
            boolean r12 = r12.a()
            if (r12 != r4) goto L_0x004a
            H0.U r7 = r13.v0(r2)
            int r8 = r7.X0()
            int r12 = r7.R0()
            long r12 = c1.s.a(r8, r12)
            lf.M r8 = lf.C6514M.f71813a
            r6[r11] = r7
            r7 = r12
        L_0x004a:
            int r11 = r11 + r4
            goto L_0x0019
        L_0x004c:
            int r9 = r22.size()
            r11 = r10
        L_0x0051:
            if (r11 >= r9) goto L_0x0065
            java.lang.Object r13 = r1.get(r11)
            H0.E r13 = (H0.E) r13
            r14 = r6[r11]
            if (r14 != 0) goto L_0x0063
            H0.U r13 = r13.v0(r2)
            r6[r11] = r13
        L_0x0063:
            int r11 = r11 + r4
            goto L_0x0051
        L_0x0065:
            boolean r1 = r21.r0()
            if (r1 == 0) goto L_0x0071
            int r1 = c1.r.g(r7)
        L_0x006f:
            r14 = r1
            goto L_0x00b0
        L_0x0071:
            if (r5 != 0) goto L_0x0075
            r1 = r12
            goto L_0x00a8
        L_0x0075:
            r1 = r6[r10]
            int r2 = mf.C6559l.j0(r6)
            if (r2 != 0) goto L_0x007e
            goto L_0x00a8
        L_0x007e:
            if (r1 == 0) goto L_0x0085
            int r3 = r1.X0()
            goto L_0x0086
        L_0x0085:
            r3 = r10
        L_0x0086:
            Ef.i r9 = new Ef.i
            r9.<init>(r4, r2)
            mf.L r2 = r9.iterator()
        L_0x008f:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x00a8
            int r9 = r2.a()
            r9 = r6[r9]
            if (r9 == 0) goto L_0x00a2
            int r11 = r9.X0()
            goto L_0x00a3
        L_0x00a2:
            r11 = r10
        L_0x00a3:
            if (r3 >= r11) goto L_0x008f
            r1 = r9
            r3 = r11
            goto L_0x008f
        L_0x00a8:
            if (r1 == 0) goto L_0x00af
            int r1 = r1.X0()
            goto L_0x006f
        L_0x00af:
            r14 = r10
        L_0x00b0:
            boolean r1 = r21.r0()
            if (r1 == 0) goto L_0x00bc
            int r10 = c1.r.f(r7)
        L_0x00ba:
            r15 = r10
            goto L_0x00f9
        L_0x00bc:
            if (r5 != 0) goto L_0x00bf
            goto L_0x00f2
        L_0x00bf:
            r12 = r6[r10]
            int r1 = mf.C6559l.j0(r6)
            if (r1 != 0) goto L_0x00c8
            goto L_0x00f2
        L_0x00c8:
            if (r12 == 0) goto L_0x00cf
            int r2 = r12.R0()
            goto L_0x00d0
        L_0x00cf:
            r2 = r10
        L_0x00d0:
            Ef.i r3 = new Ef.i
            r3.<init>(r4, r1)
            mf.L r1 = r3.iterator()
        L_0x00d9:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00f2
            int r3 = r1.a()
            r3 = r6[r3]
            if (r3 == 0) goto L_0x00ec
            int r4 = r3.R0()
            goto L_0x00ed
        L_0x00ec:
            r4 = r10
        L_0x00ed:
            if (r2 >= r4) goto L_0x00d9
            r12 = r3
            r2 = r4
            goto L_0x00d9
        L_0x00f2:
            if (r12 == 0) goto L_0x00ba
            int r10 = r12.R0()
            goto L_0x00ba
        L_0x00f9:
            boolean r1 = r21.r0()
            if (r1 != 0) goto L_0x0108
            androidx.compose.animation.e r1 = r0.f12260a
            long r2 = c1.s.a(r14, r15)
            r1.x(r2)
        L_0x0108:
            androidx.compose.animation.b$a r1 = new androidx.compose.animation.b$a
            r1.<init>(r6, r0, r14, r15)
            r18 = 4
            r19 = 0
            r16 = 0
            r13 = r21
            r17 = r1
            H0.G r1 = H0.H.N(r13, r14, r15, r16, r17, r18, r19)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.b.j(H0.H, java.util.List, long):H0.G");
    }
}
