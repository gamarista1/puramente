package D0;

import H0.C1197s;
import androidx.collection.E;
import androidx.collection.I;

/* renamed from: D0.f  reason: case insensitive filesystem */
public final class C1115f {

    /* renamed from: a  reason: collision with root package name */
    private final C1197s f1459a;

    /* renamed from: b  reason: collision with root package name */
    private final C1122m f1460b = new C1122m();

    /* renamed from: c  reason: collision with root package name */
    private final E f1461c = new E(10);

    public C1115f(C1197s sVar) {
        this.f1459a = sVar;
    }

    private final void f(long j10, I i10) {
        this.f1460b.i(j10, i10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r15v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r18, java.util.List r20, boolean r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            D0.m r3 = r0.f1460b
            androidx.collection.E r4 = r0.f1461c
            r4.g()
            int r4 = r20.size()
            r6 = 0
            r7 = r6
            r8 = 1
        L_0x0012:
            if (r7 >= r4) goto L_0x009c
            r9 = r20
            java.lang.Object r10 = r9.get(r7)
            k0.i$c r10 = (k0.i.c) r10
            r11 = 0
            if (r8 == 0) goto L_0x006c
            a0.b r12 = r3.g()
            int r13 = r12.q()
            if (r13 <= 0) goto L_0x0043
            java.lang.Object[] r12 = r12.p()
            r14 = r6
        L_0x002e:
            r15 = r12[r14]
            r16 = r15
            D0.l r16 = (D0.C1121l) r16
            k0.i$c r5 = r16.k()
            boolean r5 = kotlin.jvm.internal.C6496s.c(r5, r10)
            if (r5 == 0) goto L_0x003f
            goto L_0x0044
        L_0x003f:
            int r14 = r14 + 1
            if (r14 < r13) goto L_0x002e
        L_0x0043:
            r15 = r11
        L_0x0044:
            D0.l r15 = (D0.C1121l) r15
            if (r15 == 0) goto L_0x006b
            r15.n()
            E0.b r3 = r15.l()
            r3.b(r1)
            androidx.collection.E r3 = r0.f1461c
            java.lang.Object r5 = r3.b(r1)
            if (r5 != 0) goto L_0x0063
            androidx.collection.I r5 = new androidx.collection.I
            r10 = 1
            r5.<init>(r6, r10, r11)
            r3.o(r1, r5)
        L_0x0063:
            androidx.collection.I r5 = (androidx.collection.I) r5
            r5.g(r15)
            r3 = r15
            r13 = 1
            goto L_0x0098
        L_0x006b:
            r8 = r6
        L_0x006c:
            D0.l r5 = new D0.l
            r5.<init>(r10)
            E0.b r10 = r5.l()
            r10.b(r1)
            androidx.collection.E r10 = r0.f1461c
            java.lang.Object r12 = r10.b(r1)
            if (r12 != 0) goto L_0x008a
            androidx.collection.I r12 = new androidx.collection.I
            r13 = 1
            r12.<init>(r6, r13, r11)
            r10.o(r1, r12)
            goto L_0x008b
        L_0x008a:
            r13 = 1
        L_0x008b:
            androidx.collection.I r12 = (androidx.collection.I) r12
            r12.g(r5)
            a0.b r3 = r3.g()
            r3.b(r5)
            r3 = r5
        L_0x0098:
            int r7 = r7 + 1
            goto L_0x0012
        L_0x009c:
            if (r21 == 0) goto L_0x00e8
            androidx.collection.E r1 = r0.f1461c
            long[] r2 = r1.f12201b
            java.lang.Object[] r3 = r1.f12202c
            long[] r1 = r1.f12200a
            int r4 = r1.length
            int r4 = r4 + -2
            if (r4 < 0) goto L_0x00e8
            r5 = r6
        L_0x00ac:
            r7 = r1[r5]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x00e3
            int r9 = r5 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r6
        L_0x00c6:
            if (r11 >= r9) goto L_0x00e1
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.32E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L_0x00dd
            int r12 = r5 << 3
            int r12 = r12 + r11
            r13 = r2[r12]
            r12 = r3[r12]
            androidx.collection.I r12 = (androidx.collection.I) r12
            r0.f(r13, r12)
        L_0x00dd:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L_0x00c6
        L_0x00e1:
            if (r9 != r10) goto L_0x00e8
        L_0x00e3:
            if (r5 == r4) goto L_0x00e8
            int r5 = r5 + 1
            goto L_0x00ac
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.C1115f.a(long, java.util.List, boolean):void");
    }

    public final void b() {
        this.f1460b.c();
    }

    public final boolean c(C1116g gVar, boolean z10) {
        if (!this.f1460b.a(gVar.b(), this.f1459a, gVar, z10)) {
            return false;
        }
        boolean f10 = this.f1460b.f(gVar.b(), this.f1459a, gVar, z10);
        if (this.f1460b.e(gVar) || f10) {
            return true;
        }
        return false;
    }

    public final void d() {
        this.f1460b.d();
        b();
    }

    public final void e() {
        this.f1460b.h();
    }
}
