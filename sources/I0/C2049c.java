package i0;

import Y.C0;
import androidx.collection.L;
import androidx.collection.X;
import i0.C2058l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6514M;
import lf.C6527k;
import mf.C6559l;
import mf.C6565s;
import yf.C6798l;

/* renamed from: i0.c  reason: case insensitive filesystem */
public class C2049c extends C2057k {

    /* renamed from: p  reason: collision with root package name */
    private static final a f21707p = new a((DefaultConstructorMarker) null);

    /* renamed from: q  reason: collision with root package name */
    public static final int f21708q = 8;

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f21709r = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private final C6798l f21710g;

    /* renamed from: h  reason: collision with root package name */
    private final C6798l f21711h;

    /* renamed from: i  reason: collision with root package name */
    private int f21712i;

    /* renamed from: j  reason: collision with root package name */
    private L f21713j;

    /* renamed from: k  reason: collision with root package name */
    private List f21714k;

    /* renamed from: l  reason: collision with root package name */
    private n f21715l = n.f21741e.a();

    /* renamed from: m  reason: collision with root package name */
    private int[] f21716m = f21709r;

    /* renamed from: n  reason: collision with root package name */
    private int f21717n = 1;

    /* renamed from: o  reason: collision with root package name */
    private boolean f21718o;

    /* renamed from: i0.c$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C2049c(int i10, n nVar, C6798l lVar, C6798l lVar2) {
        super(i10, nVar, (DefaultConstructorMarker) null);
        this.f21710g = lVar;
        this.f21711h = lVar2;
    }

    private final void A() {
        L E10 = E();
        if (E10 != null) {
            R();
            P((L) null);
            int f10 = f();
            Object[] objArr = E10.f12131b;
            long[] jArr = E10.f12130a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                for (z k10 = ((x) objArr[(i10 << 3) + i12]).k(); k10 != null; k10 = k10.e()) {
                                    if (k10.f() == f10 || C6565s.e0(this.f21715l, Integer.valueOf(k10.f()))) {
                                        k10.h(0);
                                    }
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        b();
    }

    private final void N() {
        for (int Y10 : this.f21716m) {
            p.Y(Y10);
        }
    }

    private final void R() {
        if (this.f21718o) {
            C0.b("Unsupported operation on a snapshot that has been applied");
        }
    }

    private final void S() {
        boolean z10;
        if (!this.f21718o || this.f21733d >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C0.b("Unsupported operation on a disposed or applied snapshot");
        }
    }

    public final void B() {
        J(f());
        C6514M m10 = C6514M.f71813a;
        if (!D() && !e()) {
            int f10 = f();
            synchronized (p.I()) {
                int i10 = p.f21757e;
                p.f21757e = i10 + 1;
                u(i10);
                p.f21756d = p.f21756d.A(f());
            }
            v(p.z(g(), f10 + 1, f()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b2, code lost:
        r1.f21718o = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b4, code lost:
        if (r4 == null) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        r7 = a0.e.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c1, code lost:
        if (r7.isEmpty() != false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c3, code lost:
        r8 = r5.size();
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c8, code lost:
        if (r9 >= r8) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ca, code lost:
        ((yf.p) r5.get(r9)).invoke(r7, r1);
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d5, code lost:
        if (r2 == null) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00db, code lost:
        if (r2.e() == false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00dd, code lost:
        r7 = a0.e.a(r2);
        r8 = r5.size();
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e6, code lost:
        if (r9 >= r8) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e8, code lost:
        ((yf.p) r5.get(r9)).invoke(r7, r1);
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f3, code lost:
        r5 = i0.p.I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f7, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r();
        i0.p.C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0108, code lost:
        if (r4 == null) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r15 = r4.f12131b;
        r4 = r4.f12130a;
        r6 = r4.length - 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0111, code lost:
        if (r6 < 0) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0113, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0114, code lost:
        r0 = r4[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011c, code lost:
        if (((((~r0) << 7) & r0) & -9187201950435737472L) == -9187201950435737472L) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011e, code lost:
        r7 = 8 - ((~(r3 - r6)) >>> 31);
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0126, code lost:
        if (r8 >= r7) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012e, code lost:
        if ((r0 & 255) >= 128) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0130, code lost:
        i0.p.U((i0.x) r15[(r3 << 3) + r8]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013d, code lost:
        r1 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0141, code lost:
        r0 = r0 >> 8;
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0149, code lost:
        if (r7 != 8) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014e, code lost:
        if (r3 == r6) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0150, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0153, code lost:
        if (r2 == null) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0155, code lost:
        r0 = r2.f12131b;
        r1 = r2.f12130a;
        r2 = r1.length - 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x015c, code lost:
        if (r2 < 0) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015e, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015f, code lost:
        r6 = r1[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0168, code lost:
        if (((((~r6) << 7) & r6) & -9187201950435737472L) == -9187201950435737472L) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016a, code lost:
        r4 = 8 - ((~(r3 - r2)) >>> 31);
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0172, code lost:
        if (r8 >= r4) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x017c, code lost:
        if ((r6 & 255) >= 128) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x017e, code lost:
        i0.p.U((i0.x) r0[(r3 << 3) + r8]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0188, code lost:
        r6 = r6 >> 8;
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x018c, code lost:
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0191, code lost:
        if (r4 != 8) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0194, code lost:
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0199, code lost:
        if (r3 == r2) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x019b, code lost:
        r3 = r3 + r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x019d, code lost:
        r1 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        r0 = r1.f21714k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a1, code lost:
        if (r0 == null) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01a3, code lost:
        r2 = r0.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a8, code lost:
        if (r6 >= r2) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01aa, code lost:
        i0.p.U((i0.x) r0.get(r6));
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01b6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01b8, code lost:
        r1.f21714k = null;
        r0 = lf.C6514M.f71813a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01bd, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01c0, code lost:
        return i0.C2058l.b.f21735a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01c1, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c2, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.C2058l C() {
        /*
            r21 = this;
            r1 = r21
            r0 = 1
            androidx.collection.L r2 = r21.E()
            r3 = 0
            if (r2 == 0) goto L_0x002f
            java.util.concurrent.atomic.AtomicReference r4 = i0.p.f21762j
            java.lang.Object r4 = r4.get()
            i0.c r4 = (i0.C2049c) r4
            i0.n r5 = i0.p.f21756d
            java.util.concurrent.atomic.AtomicReference r6 = i0.p.f21762j
            java.lang.Object r6 = r6.get()
            i0.a r6 = (i0.C2047a) r6
            int r6 = r6.f()
            i0.n r5 = r5.t(r6)
            java.util.Map r4 = i0.p.R(r4, r1, r5)
            goto L_0x0030
        L_0x002f:
            r4 = r3
        L_0x0030:
            java.util.List r5 = mf.C6565s.n()
            java.lang.Object r6 = i0.p.I()
            monitor-enter(r6)
            i0.p.g0(r21)     // Catch:{ all -> 0x0086 }
            if (r2 == 0) goto L_0x0089
            int r7 = r2.c()     // Catch:{ all -> 0x0086 }
            if (r7 != 0) goto L_0x0045
            goto L_0x0089
        L_0x0045:
            java.util.concurrent.atomic.AtomicReference r5 = i0.p.f21762j     // Catch:{ all -> 0x0086 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0086 }
            i0.a r5 = (i0.C2047a) r5     // Catch:{ all -> 0x0086 }
            int r7 = i0.p.f21757e     // Catch:{ all -> 0x0086 }
            i0.n r8 = i0.p.f21756d     // Catch:{ all -> 0x0086 }
            int r9 = r5.f()     // Catch:{ all -> 0x0086 }
            i0.n r8 = r8.t(r9)     // Catch:{ all -> 0x0086 }
            i0.l r4 = r1.I(r7, r4, r8)     // Catch:{ all -> 0x0086 }
            i0.l$b r7 = i0.C2058l.b.f21735a     // Catch:{ all -> 0x0086 }
            boolean r7 = kotlin.jvm.internal.C6496s.c(r4, r7)     // Catch:{ all -> 0x0086 }
            if (r7 != 0) goto L_0x006d
            monitor-exit(r6)
            return r4
        L_0x006d:
            r21.c()     // Catch:{ all -> 0x0086 }
            yf.l r4 = i0.p.f21753a     // Catch:{ all -> 0x0086 }
            java.lang.Object unused = i0.p.a0(r5, r4)     // Catch:{ all -> 0x0086 }
            androidx.collection.L r4 = r5.E()     // Catch:{ all -> 0x0086 }
            r1.P(r3)     // Catch:{ all -> 0x0086 }
            r5.P(r3)     // Catch:{ all -> 0x0086 }
            java.util.List r5 = i0.p.f21760h     // Catch:{ all -> 0x0086 }
            goto L_0x00af
        L_0x0086:
            r0 = move-exception
            goto L_0x01c3
        L_0x0089:
            r21.c()     // Catch:{ all -> 0x0086 }
            java.util.concurrent.atomic.AtomicReference r4 = i0.p.f21762j     // Catch:{ all -> 0x0086 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x0086 }
            i0.a r4 = (i0.C2047a) r4     // Catch:{ all -> 0x0086 }
            yf.l r7 = i0.p.f21753a     // Catch:{ all -> 0x0086 }
            java.lang.Object unused = i0.p.a0(r4, r7)     // Catch:{ all -> 0x0086 }
            androidx.collection.L r4 = r4.E()     // Catch:{ all -> 0x0086 }
            if (r4 == 0) goto L_0x00ae
            boolean r7 = r4.e()     // Catch:{ all -> 0x0086 }
            if (r7 == 0) goto L_0x00ae
            java.util.List r5 = i0.p.f21760h     // Catch:{ all -> 0x0086 }
            goto L_0x00af
        L_0x00ae:
            r4 = r3
        L_0x00af:
            lf.M r7 = lf.C6514M.f71813a     // Catch:{ all -> 0x0086 }
            monitor-exit(r6)
            r1.f21718o = r0
            if (r4 == 0) goto L_0x00d5
            java.util.Set r7 = a0.e.a(r4)
            r8 = r7
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x00d5
            int r8 = r5.size()
            r9 = 0
        L_0x00c8:
            if (r9 >= r8) goto L_0x00d5
            java.lang.Object r10 = r5.get(r9)
            yf.p r10 = (yf.p) r10
            r10.invoke(r7, r1)
            int r9 = r9 + r0
            goto L_0x00c8
        L_0x00d5:
            if (r2 == 0) goto L_0x00f3
            boolean r7 = r2.e()
            if (r7 == 0) goto L_0x00f3
            java.util.Set r7 = a0.e.a(r2)
            int r8 = r5.size()
            r9 = 0
        L_0x00e6:
            if (r9 >= r8) goto L_0x00f3
            java.lang.Object r10 = r5.get(r9)
            yf.p r10 = (yf.p) r10
            r10.invoke(r7, r1)
            int r9 = r9 + r0
            goto L_0x00e6
        L_0x00f3:
            java.lang.Object r5 = i0.p.I()
            monitor-enter(r5)
            r21.r()     // Catch:{ all -> 0x01b6 }
            i0.p.C()     // Catch:{ all -> 0x01b6 }
            r9 = 255(0xff, double:1.26E-321)
            r11 = 7
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r14 = 8
            if (r4 == 0) goto L_0x0153
            java.lang.Object[] r15 = r4.f12131b     // Catch:{ all -> 0x013c }
            long[] r4 = r4.f12130a     // Catch:{ all -> 0x013c }
            int r6 = r4.length     // Catch:{ all -> 0x013c }
            int r6 = r6 + -2
            if (r6 < 0) goto L_0x0153
            r3 = 0
        L_0x0114:
            r0 = r4[r3]     // Catch:{ all -> 0x013c }
            long r7 = ~r0     // Catch:{ all -> 0x013c }
            long r7 = r7 << r11
            long r7 = r7 & r0
            long r7 = r7 & r12
            int r7 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r7 == 0) goto L_0x014c
            int r7 = r3 - r6
            int r7 = ~r7     // Catch:{ all -> 0x013c }
            int r7 = r7 >>> 31
            int r7 = 8 - r7
            r8 = 0
        L_0x0126:
            if (r8 >= r7) goto L_0x0147
            long r19 = r0 & r9
            r17 = 128(0x80, double:6.32E-322)
            int r19 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r19 >= 0) goto L_0x0141
            int r19 = r3 << 3
            int r19 = r19 + r8
            r19 = r15[r19]     // Catch:{ all -> 0x013c }
            i0.x r19 = (i0.x) r19     // Catch:{ all -> 0x013c }
            i0.p.U(r19)     // Catch:{ all -> 0x013c }
            goto L_0x0141
        L_0x013c:
            r0 = move-exception
            r1 = r21
            goto L_0x01c1
        L_0x0141:
            long r0 = r0 >> r14
            r16 = 1
            int r8 = r8 + 1
            goto L_0x0126
        L_0x0147:
            r16 = 1
            if (r7 != r14) goto L_0x0153
            goto L_0x014e
        L_0x014c:
            r16 = 1
        L_0x014e:
            if (r3 == r6) goto L_0x0153
            int r3 = r3 + 1
            goto L_0x0114
        L_0x0153:
            if (r2 == 0) goto L_0x019d
            java.lang.Object[] r0 = r2.f12131b     // Catch:{ all -> 0x013c }
            long[] r1 = r2.f12130a     // Catch:{ all -> 0x013c }
            int r2 = r1.length     // Catch:{ all -> 0x013c }
            int r2 = r2 + -2
            if (r2 < 0) goto L_0x019d
            r3 = 0
        L_0x015f:
            r6 = r1[r3]     // Catch:{ all -> 0x013c }
            long r9 = ~r6     // Catch:{ all -> 0x013c }
            long r8 = r9 << r11
            long r8 = r8 & r6
            long r8 = r8 & r12
            int r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x0194
            int r4 = r3 - r2
            int r4 = ~r4     // Catch:{ all -> 0x013c }
            int r4 = r4 >>> 31
            int r4 = 8 - r4
            r8 = 0
        L_0x0172:
            if (r8 >= r4) goto L_0x018c
            r9 = 255(0xff, double:1.26E-321)
            long r19 = r6 & r9
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r15 >= 0) goto L_0x0188
            int r15 = r3 << 3
            int r15 = r15 + r8
            r15 = r0[r15]     // Catch:{ all -> 0x013c }
            i0.x r15 = (i0.x) r15     // Catch:{ all -> 0x013c }
            i0.p.U(r15)     // Catch:{ all -> 0x013c }
        L_0x0188:
            long r6 = r6 >> r14
            r15 = 1
            int r8 = r8 + r15
            goto L_0x0172
        L_0x018c:
            r9 = 255(0xff, double:1.26E-321)
            r15 = 1
            r17 = 128(0x80, double:6.32E-322)
            if (r4 != r14) goto L_0x019d
            goto L_0x0199
        L_0x0194:
            r9 = 255(0xff, double:1.26E-321)
            r15 = 1
            r17 = 128(0x80, double:6.32E-322)
        L_0x0199:
            if (r3 == r2) goto L_0x019d
            int r3 = r3 + r15
            goto L_0x015f
        L_0x019d:
            r1 = r21
            java.util.List r0 = r1.f21714k     // Catch:{ all -> 0x01b6 }
            if (r0 == 0) goto L_0x01b8
            int r2 = r0.size()     // Catch:{ all -> 0x01b6 }
            r6 = 0
        L_0x01a8:
            if (r6 >= r2) goto L_0x01b8
            java.lang.Object r3 = r0.get(r6)     // Catch:{ all -> 0x01b6 }
            i0.x r3 = (i0.x) r3     // Catch:{ all -> 0x01b6 }
            i0.p.U(r3)     // Catch:{ all -> 0x01b6 }
            r3 = 1
            int r6 = r6 + r3
            goto L_0x01a8
        L_0x01b6:
            r0 = move-exception
            goto L_0x01c1
        L_0x01b8:
            r0 = 0
            r1.f21714k = r0     // Catch:{ all -> 0x01b6 }
            lf.M r0 = lf.C6514M.f71813a     // Catch:{ all -> 0x01b6 }
            monitor-exit(r5)
            i0.l$b r0 = i0.C2058l.b.f21735a
            return r0
        L_0x01c1:
            monitor-exit(r5)
            throw r0
        L_0x01c3:
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.C2049c.C():i0.l");
    }

    public final boolean D() {
        return this.f21718o;
    }

    public L E() {
        return this.f21713j;
    }

    public final n F() {
        return this.f21715l;
    }

    public final int[] G() {
        return this.f21716m;
    }

    /* renamed from: H */
    public C6798l h() {
        return this.f21710g;
    }

    public final C2058l I(int i10, Map map, n nVar) {
        L l10;
        List list;
        n nVar2;
        long[] jArr;
        Object[] objArr;
        int i11;
        n nVar3;
        L l11;
        long[] jArr2;
        Object[] objArr2;
        int i12;
        z q10;
        z zVar;
        Pair pair;
        Map map2 = map;
        n z10 = g().A(f()).z(this.f21715l);
        L E10 = E();
        C6496s.e(E10);
        Object[] objArr3 = E10.f12131b;
        long[] jArr3 = E10.f12130a;
        int length = jArr3.length - 2;
        ArrayList arrayList = null;
        if (length >= 0) {
            list = null;
            int i13 = 0;
            while (true) {
                long j10 = jArr3[i13];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j10 & 255) < 128) {
                            x xVar = (x) objArr3[(i13 << 3) + i16];
                            z k10 = xVar.k();
                            l11 = E10;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            z q11 = p.W(k10, i10, nVar);
                            if (q11 == null || (q10 = p.W(k10, f(), z10)) == null) {
                                nVar3 = z10;
                            } else {
                                nVar3 = z10;
                                if (q10.f() != 1 && !C6496s.c(q11, q10)) {
                                    z q12 = p.W(k10, f(), g());
                                    if (q12 != null) {
                                        if (map2 == null || (zVar = (z) map2.get(q11)) == null) {
                                            zVar = xVar.g(q10, q11, q12);
                                        }
                                        if (zVar == null) {
                                            return new C2058l.a(this);
                                        }
                                        if (!C6496s.c(zVar, q12)) {
                                            if (C6496s.c(zVar, q11)) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(C6502A.a(xVar, q11.d()));
                                                if (list == null) {
                                                    list = new ArrayList();
                                                }
                                                list.add(xVar);
                                            } else {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                if (!C6496s.c(zVar, q10)) {
                                                    pair = C6502A.a(xVar, zVar);
                                                } else {
                                                    pair = C6502A.a(xVar, q10.d());
                                                }
                                                arrayList.add(pair);
                                            }
                                        }
                                    } else {
                                        Void unused = p.V();
                                        throw new C6527k();
                                    }
                                }
                            }
                            i12 = 8;
                        } else {
                            nVar3 = z10;
                            l11 = E10;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i12 = i14;
                        }
                        j10 >>= i12;
                        i16++;
                        i14 = i12;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        E10 = l11;
                        z10 = nVar3;
                    }
                    nVar2 = z10;
                    l10 = E10;
                    objArr = objArr3;
                    jArr = jArr3;
                    i11 = 1;
                    if (i15 != i14) {
                        break;
                    }
                } else {
                    nVar2 = z10;
                    l10 = E10;
                    objArr = objArr3;
                    jArr = jArr3;
                    i11 = 1;
                }
                if (i13 == length) {
                    break;
                }
                i13 += i11;
                objArr3 = objArr;
                jArr3 = jArr;
                E10 = l10;
                z10 = nVar2;
            }
        } else {
            l10 = E10;
            list = null;
        }
        if (arrayList != null) {
            B();
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                Pair pair2 = (Pair) arrayList.get(i17);
                x xVar2 = (x) pair2.a();
                z zVar2 = (z) pair2.b();
                zVar2.h(f());
                synchronized (p.I()) {
                    zVar2.g(xVar2.k());
                    xVar2.n(zVar2);
                    C6514M m10 = C6514M.f71813a;
                }
            }
        }
        if (list != null) {
            int size2 = list.size();
            for (int i18 = 0; i18 < size2; i18++) {
                l10.x((x) list.get(i18));
            }
            List list2 = this.f21714k;
            if (list2 != null) {
                list = C6565s.K0(list2, list);
            }
            this.f21714k = list;
        }
        return C2058l.b.f21735a;
    }

    public final void J(int i10) {
        synchronized (p.I()) {
            this.f21715l = this.f21715l.A(i10);
            C6514M m10 = C6514M.f71813a;
        }
    }

    public final void K(n nVar) {
        synchronized (p.I()) {
            this.f21715l = this.f21715l.z(nVar);
            C6514M m10 = C6514M.f71813a;
        }
    }

    public final void L(int i10) {
        if (i10 >= 0) {
            this.f21716m = C6559l.D(this.f21716m, i10);
        }
    }

    public final void M(int[] iArr) {
        if (iArr.length != 0) {
            int[] iArr2 = this.f21716m;
            if (iArr2.length != 0) {
                iArr = C6559l.E(iArr2, iArr);
            }
            this.f21716m = iArr;
        }
    }

    public final void O(boolean z10) {
        this.f21718o = z10;
    }

    public void P(L l10) {
        this.f21713j = l10;
    }

    public C2049c Q(C6798l lVar, C6798l lVar2) {
        C2050d dVar;
        z();
        S();
        J(f());
        synchronized (p.I()) {
            int i10 = p.f21757e;
            p.f21757e = i10 + 1;
            p.f21756d = p.f21756d.A(i10);
            n g10 = g();
            v(g10.A(i10));
            dVar = new C2050d(i10, p.z(g10, f() + 1, i10), p.L(lVar, h(), false, 4, (Object) null), p.M(lVar2, k()), this);
        }
        if (!D() && !e()) {
            int f10 = f();
            synchronized (p.I()) {
                int i11 = p.f21757e;
                p.f21757e = i11 + 1;
                u(i11);
                p.f21756d = p.f21756d.A(f());
                C6514M m10 = C6514M.f71813a;
            }
            v(p.z(g(), f10 + 1, f()));
        }
        return dVar;
    }

    public void c() {
        p.f21756d = p.f21756d.t(f()).r(this.f21715l);
    }

    public void d() {
        if (!e()) {
            super.d();
            n(this);
        }
    }

    public boolean i() {
        return false;
    }

    public int j() {
        return this.f21712i;
    }

    public C6798l k() {
        return this.f21711h;
    }

    public void m(C2057k kVar) {
        this.f21717n++;
    }

    public void n(C2057k kVar) {
        boolean z10;
        if (this.f21717n > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C0.a("no pending nested snapshots");
        }
        int i10 = this.f21717n - 1;
        this.f21717n = i10;
        if (i10 == 0 && !this.f21718o) {
            A();
        }
    }

    public void o() {
        if (!this.f21718o && !e()) {
            B();
        }
    }

    public void p(x xVar) {
        L E10 = E();
        if (E10 == null) {
            E10 = X.a();
            P(E10);
        }
        E10.h(xVar);
    }

    public void r() {
        N();
        super.r();
    }

    public void w(int i10) {
        this.f21712i = i10;
    }

    public C2057k x(C6798l lVar) {
        C2051e eVar;
        z();
        S();
        int f10 = f();
        J(f());
        synchronized (p.I()) {
            int i10 = p.f21757e;
            p.f21757e = i10 + 1;
            p.f21756d = p.f21756d.A(i10);
            eVar = new C2051e(i10, p.z(g(), f10 + 1, i10), p.L(lVar, h(), false, 4, (Object) null), this);
        }
        if (!D() && !e()) {
            int f11 = f();
            synchronized (p.I()) {
                int i11 = p.f21757e;
                p.f21757e = i11 + 1;
                u(i11);
                p.f21756d = p.f21756d.A(f());
                C6514M m10 = C6514M.f71813a;
            }
            v(p.z(g(), f11 + 1, f()));
        }
        return eVar;
    }
}
