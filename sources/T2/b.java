package T2;

import T2.a;
import android.util.Pair;
import com.google.common.collect.C4770v;
import f2.C1960A;
import f2.C1961B;
import f2.C1974i;
import f2.C1979n;
import f2.s;
import f2.z;
import i2.C2073A;
import i2.C2076a;
import i2.L;
import i2.p;
import j2.C2122a;
import j2.C2123b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import nb.C5112g;
import z2.B;
import z2.C2974s;

abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f5980a = L.q0("OpusHead");

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f5981a;

        /* renamed from: b  reason: collision with root package name */
        public int f5982b;

        /* renamed from: c  reason: collision with root package name */
        public int f5983c;

        /* renamed from: d  reason: collision with root package name */
        public long f5984d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f5985e;

        /* renamed from: f  reason: collision with root package name */
        private final C2073A f5986f;

        /* renamed from: g  reason: collision with root package name */
        private final C2073A f5987g;

        /* renamed from: h  reason: collision with root package name */
        private int f5988h;

        /* renamed from: i  reason: collision with root package name */
        private int f5989i;

        public a(C2073A a10, C2073A a11, boolean z10) {
            this.f5987g = a10;
            this.f5986f = a11;
            this.f5985e = z10;
            a11.U(12);
            this.f5981a = a11.L();
            a10.U(12);
            this.f5989i = a10.L();
            C2974s.a(a10.q() != 1 ? false : true, "first_chunk must be 1");
            this.f5982b = -1;
        }

        public boolean a() {
            long j10;
            int i10;
            int i11 = this.f5982b + 1;
            this.f5982b = i11;
            if (i11 == this.f5981a) {
                return false;
            }
            if (this.f5985e) {
                j10 = this.f5986f.M();
            } else {
                j10 = this.f5986f.J();
            }
            this.f5984d = j10;
            if (this.f5982b == this.f5988h) {
                this.f5983c = this.f5987g.L();
                this.f5987g.V(4);
                int i12 = this.f5989i - 1;
                this.f5989i = i12;
                if (i12 > 0) {
                    i10 = this.f5987g.L() - 1;
                } else {
                    i10 = -1;
                }
                this.f5988h = i10;
            }
            return true;
        }
    }

    /* renamed from: T2.b$b  reason: collision with other inner class name */
    private static final class C0143b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f5990a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f5991b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final long f5992c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final long f5993d;

        public C0143b(String str, byte[] bArr, long j10, long j11) {
            this.f5990a = str;
            this.f5991b = bArr;
            this.f5992c = j10;
            this.f5993d = j11;
        }
    }

    private interface c {
        int a();

        int b();

        int c();
    }

    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final t[] f5994a;

        /* renamed from: b  reason: collision with root package name */
        public s f5995b;

        /* renamed from: c  reason: collision with root package name */
        public int f5996c;

        /* renamed from: d  reason: collision with root package name */
        public int f5997d = 0;

        public d(int i10) {
            this.f5994a = new t[i10];
        }
    }

    static final class e implements c {

        /* renamed from: a  reason: collision with root package name */
        private final int f5998a;

        /* renamed from: b  reason: collision with root package name */
        private final int f5999b;

        /* renamed from: c  reason: collision with root package name */
        private final C2073A f6000c;

        public e(a.b bVar, s sVar) {
            C2073A a10 = bVar.f5979b;
            this.f6000c = a10;
            a10.U(12);
            int L10 = a10.L();
            if ("audio/raw".equals(sVar.f20083n)) {
                int f02 = L.f0(sVar.f20061D, sVar.f20059B);
                if (L10 == 0 || L10 % f02 != 0) {
                    p.h("AtomParsers", "Audio sample size mismatch. stsd sample size: " + f02 + ", stsz sample size: " + L10);
                    L10 = f02;
                }
            }
            this.f5998a = L10 == 0 ? -1 : L10;
            this.f5999b = a10.L();
        }

        public int a() {
            int i10 = this.f5998a;
            if (i10 == -1) {
                return this.f6000c.L();
            }
            return i10;
        }

        public int b() {
            return this.f5998a;
        }

        public int c() {
            return this.f5999b;
        }
    }

    static final class f implements c {

        /* renamed from: a  reason: collision with root package name */
        private final C2073A f6001a;

        /* renamed from: b  reason: collision with root package name */
        private final int f6002b;

        /* renamed from: c  reason: collision with root package name */
        private final int f6003c;

        /* renamed from: d  reason: collision with root package name */
        private int f6004d;

        /* renamed from: e  reason: collision with root package name */
        private int f6005e;

        public f(a.b bVar) {
            C2073A a10 = bVar.f5979b;
            this.f6001a = a10;
            a10.U(12);
            this.f6003c = a10.L() & 255;
            this.f6002b = a10.L();
        }

        public int a() {
            int i10 = this.f6003c;
            if (i10 == 8) {
                return this.f6001a.H();
            }
            if (i10 == 16) {
                return this.f6001a.N();
            }
            int i11 = this.f6004d;
            this.f6004d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f6005e & 15;
            }
            int H10 = this.f6001a.H();
            this.f6005e = H10;
            return (H10 & 240) >> 4;
        }

        public int b() {
            return -1;
        }

        public int c() {
            return this.f6002b;
        }
    }

    private static final class g {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f6006a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f6007b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final int f6008c;

        public g(int i10, long j10, int i11) {
            this.f6006a = i10;
            this.f6007b = j10;
            this.f6008c = i11;
        }
    }

    private static s A(a.C0142a aVar, a.b bVar, long j10, C1979n nVar, boolean z10, boolean z11) {
        long j11;
        a.b bVar2;
        long[] jArr;
        long[] jArr2;
        a.C0142a f10;
        Pair j12;
        a.C0142a aVar2 = aVar;
        a.C0142a aVar3 = (a.C0142a) C2076a.e(aVar2.f(1835297121));
        int e10 = e(m(((a.b) C2076a.e(aVar3.g(1751411826))).f5979b));
        if (e10 == -1) {
            return null;
        }
        g z12 = z(((a.b) C2076a.e(aVar2.g(1953196132))).f5979b);
        long j13 = -9223372036854775807L;
        if (j10 == -9223372036854775807L) {
            bVar2 = bVar;
            j11 = z12.f6007b;
        } else {
            bVar2 = bVar;
            j11 = j10;
        }
        long j14 = r(bVar2.f5979b).f22704c;
        if (j11 != -9223372036854775807L) {
            j13 = L.U0(j11, 1000000, j14);
        }
        long j15 = j13;
        Pair o10 = o(((a.b) C2076a.e(aVar3.g(1835296868))).f5979b);
        a.b g10 = ((a.C0142a) C2076a.e(((a.C0142a) C2076a.e(aVar3.f(1835626086))).f(1937007212))).g(1937011556);
        if (g10 != null) {
            d x10 = x(g10.f5979b, z12.f6006a, z12.f6008c, (String) o10.second, nVar, z11);
            if (z10 || (f10 = aVar2.f(1701082227)) == null || (j12 = j(f10)) == null) {
                jArr2 = null;
                jArr = null;
            } else {
                jArr = (long[]) j12.second;
                jArr2 = (long[]) j12.first;
            }
            if (x10.f5995b == null) {
                return null;
            }
            return new s(z12.f6006a, e10, ((Long) o10.first).longValue(), j14, j15, x10.f5995b, x10.f5997d, x10.f5994a, x10.f5996c, jArr2, jArr);
        }
        throw C1961B.a("Malformed sample table (stbl) missing sample description (stsd)", (Throwable) null);
    }

    public static List B(a.C0142a aVar, B b10, long j10, C1979n nVar, boolean z10, boolean z11, C5112g gVar) {
        a.C0142a aVar2 = aVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < aVar2.f5978d.size(); i10++) {
            a.C0142a aVar3 = (a.C0142a) aVar2.f5978d.get(i10);
            if (aVar3.f5975a != 1953653099) {
                B b11 = b10;
                C5112g gVar2 = gVar;
            } else {
                s sVar = (s) gVar.apply(A(aVar3, (a.b) C2076a.e(aVar.g(1836476516)), j10, nVar, z10, z11));
                if (sVar == null) {
                    B b12 = b10;
                } else {
                    B b13 = b10;
                    arrayList.add(w(sVar, (a.C0142a) C2076a.e(((a.C0142a) C2076a.e(((a.C0142a) C2076a.e(aVar3.f(1835297121))).f(1835626086))).f(1937007212)), b10));
                }
            }
        }
        return arrayList;
    }

    public static z C(a.b bVar) {
        C2073A a10 = bVar.f5979b;
        a10.U(8);
        z zVar = new z(new z.b[0]);
        while (a10.a() >= 8) {
            int f10 = a10.f();
            int q10 = a10.q();
            int q11 = a10.q();
            if (q11 == 1835365473) {
                a10.U(f10);
                zVar = zVar.b(D(a10, f10 + q10));
            } else if (q11 == 1936553057) {
                a10.U(f10);
                zVar = zVar.b(q.b(a10, f10 + q10));
            } else if (q11 == -1451722374) {
                zVar = zVar.b(F(a10));
            }
            a10.U(f10 + q10);
        }
        return zVar;
    }

    private static z D(C2073A a10, int i10) {
        a10.V(8);
        f(a10);
        while (a10.f() < i10) {
            int f10 = a10.f();
            int q10 = a10.q();
            if (a10.q() == 1768715124) {
                a10.U(f10);
                return n(a10, f10 + q10);
            }
            a10.U(f10 + q10);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r2v36, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r8v20, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void E(i2.C2073A r37, int r38, int r39, int r40, int r41, int r42, f2.C1979n r43, T2.b.d r44, int r45) {
        /*
            r0 = r37
            r1 = r39
            r2 = r40
            r3 = r43
            r4 = r44
            int r5 = r1 + 16
            r0.U(r5)
            r5 = 16
            r0.V(r5)
            int r5 = r37.N()
            int r6 = r37.N()
            r7 = 50
            r0.V(r7)
            int r7 = r37.f()
            r8 = 1701733238(0x656e6376, float:7.035987E22)
            r10 = r38
            if (r10 != r8) goto L_0x0053
            android.util.Pair r8 = u(r0, r1, r2)
            if (r8 == 0) goto L_0x0050
            java.lang.Object r10 = r8.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r3 != 0) goto L_0x003e
            r3 = 0
            goto L_0x0048
        L_0x003e:
            java.lang.Object r11 = r8.second
            T2.t r11 = (T2.t) r11
            java.lang.String r11 = r11.f6139b
            f2.n r3 = r3.b(r11)
        L_0x0048:
            T2.t[] r11 = r4.f5994a
            java.lang.Object r8 = r8.second
            T2.t r8 = (T2.t) r8
            r11[r45] = r8
        L_0x0050:
            r0.U(r7)
        L_0x0053:
            r8 = 1831958048(0x6d317620, float:3.4326032E27)
            java.lang.String r11 = "video/3gpp"
            if (r10 != r8) goto L_0x005d
            java.lang.String r8 = "video/mpeg"
            goto L_0x0065
        L_0x005d:
            r8 = 1211250227(0x48323633, float:182488.8)
            if (r10 != r8) goto L_0x0064
            r8 = r11
            goto L_0x0065
        L_0x0064:
            r8 = 0
        L_0x0065:
            r14 = 1065353216(0x3f800000, float:1.0)
            r15 = 8
            r16 = r15
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = -1
            r21 = -1
            r22 = -1
            r23 = -1
            r24 = -1
            r25 = 0
            r26 = 0
            r27 = 0
        L_0x0081:
            int r12 = r7 - r1
            if (r12 >= r2) goto L_0x009a
            r0.U(r7)
            int r12 = r37.f()
            int r13 = r37.q()
            if (r13 != 0) goto L_0x00a7
            int r28 = r37.f()
            int r9 = r28 - r1
            if (r9 != r2) goto L_0x00a7
        L_0x009a:
            r31 = r3
            r36 = r14
            r30 = r15
            r1 = r22
            r4 = r24
            r2 = 0
            goto L_0x03b2
        L_0x00a7:
            if (r13 <= 0) goto L_0x00ab
            r9 = 1
            goto L_0x00ac
        L_0x00ab:
            r9 = 0
        L_0x00ac:
            java.lang.String r1 = "childAtomSize must be positive"
            z2.C2974s.a(r9, r1)
            int r1 = r37.q()
            r9 = 1635148611(0x61766343, float:2.8406573E20)
            if (r1 != r9) goto L_0x0105
            r1 = 0
            if (r8 != 0) goto L_0x00bf
            r9 = 1
            goto L_0x00c0
        L_0x00bf:
            r9 = 0
        L_0x00c0:
            z2.C2974s.a(r9, r1)
            int r12 = r12 + 8
            r0.U(r12)
            z2.d r1 = z2.C2960d.b(r37)
            java.util.List r8 = r1.f29179a
            int r9 = r1.f29180b
            r4.f5996c = r9
            if (r27 != 0) goto L_0x00d6
            float r14 = r1.f29189k
        L_0x00d6:
            java.lang.String r9 = r1.f29190l
            int r12 = r1.f29188j
            int r15 = r1.f29185g
            int r2 = r1.f29186h
            r16 = r2
            int r2 = r1.f29187i
            r17 = r2
            int r2 = r1.f29183e
            int r1 = r1.f29184f
            java.lang.String r18 = "video/avc"
            r31 = r3
            r28 = r10
            r29 = r11
            r21 = r12
            r22 = r15
            r23 = r16
            r24 = r17
            r3 = -1
            r16 = r1
            r15 = r2
            r17 = r8
            r8 = r18
            r2 = 0
            r18 = r9
            goto L_0x03a3
        L_0x0105:
            r2 = 1752589123(0x68766343, float:4.6541328E24)
            if (r1 != r2) goto L_0x0155
            r1 = 0
            if (r8 != 0) goto L_0x010f
            r9 = 1
            goto L_0x0110
        L_0x010f:
            r9 = 0
        L_0x0110:
            z2.C2974s.a(r9, r1)
            int r12 = r12 + 8
            r0.U(r12)
            z2.C r1 = z2.C.a(r37)
            java.util.List r2 = r1.f29075a
            int r8 = r1.f29076b
            r4.f5996c = r8
            if (r27 != 0) goto L_0x0126
            float r14 = r1.f29084j
        L_0x0126:
            int r8 = r1.f29085k
            java.lang.String r9 = r1.f29086l
            int r12 = r1.f29081g
            int r15 = r1.f29082h
            r16 = r2
            int r2 = r1.f29083i
            r17 = r2
            int r2 = r1.f29079e
            int r1 = r1.f29080f
            java.lang.String r18 = "video/hevc"
            r31 = r3
            r21 = r8
            r28 = r10
            r29 = r11
            r22 = r12
            r23 = r15
            r24 = r17
            r8 = r18
            r3 = -1
            r15 = r2
            r18 = r9
            r17 = r16
            r2 = 0
            r16 = r1
            goto L_0x03a3
        L_0x0155:
            r2 = 1685480259(0x64766343, float:1.8180206E22)
            if (r1 == r2) goto L_0x015f
            r2 = 1685485123(0x64767643, float:1.8185683E22)
            if (r1 != r2) goto L_0x0171
        L_0x015f:
            r31 = r3
            r28 = r10
            r29 = r11
            r36 = r14
            r30 = r15
            r1 = r22
            r4 = r24
            r2 = 0
            r3 = -1
            goto L_0x0395
        L_0x0171:
            r2 = 1987076931(0x76706343, float:1.21891066E33)
            r9 = 2
            if (r1 != r2) goto L_0x01c5
            if (r8 != 0) goto L_0x017c
            r1 = 1
        L_0x017a:
            r2 = 0
            goto L_0x017e
        L_0x017c:
            r1 = 0
            goto L_0x017a
        L_0x017e:
            z2.C2974s.a(r1, r2)
            r1 = 1987063864(0x76703038, float:1.21789965E33)
            if (r10 != r1) goto L_0x0189
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            goto L_0x018b
        L_0x0189:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
        L_0x018b:
            int r12 = r12 + 12
            r0.U(r12)
            r0.V(r9)
            int r2 = r37.H()
            int r8 = r2 >> 4
            r12 = 1
            r2 = r2 & r12
            if (r2 == 0) goto L_0x019f
            r2 = 1
            goto L_0x01a0
        L_0x019f:
            r2 = 0
        L_0x01a0:
            int r12 = r37.H()
            int r15 = r37.H()
            int r22 = f2.C1974i.j(r12)
            if (r2 == 0) goto L_0x01b1
            r23 = 1
            goto L_0x01b3
        L_0x01b1:
            r23 = r9
        L_0x01b3:
            int r24 = f2.C1974i.k(r15)
            r31 = r3
            r15 = r8
            r16 = r15
            r28 = r10
            r29 = r11
            r2 = 0
            r3 = -1
            r8 = r1
            goto L_0x03a3
        L_0x01c5:
            r2 = 1635135811(0x61763143, float:2.8384055E20)
            if (r1 != r2) goto L_0x0200
            int r1 = r13 + -8
            byte[] r2 = new byte[r1]
            r8 = 0
            r0.l(r2, r8, r1)
            com.google.common.collect.v r17 = com.google.common.collect.C4770v.H(r2)
            int r12 = r12 + 8
            r0.U(r12)
            f2.i r1 = h(r37)
            int r2 = r1.f19989e
            int r9 = r1.f19990f
            int r12 = r1.f19985a
            int r15 = r1.f19986b
            int r1 = r1.f19987c
            java.lang.String r16 = "video/av01"
            r24 = r1
            r31 = r3
            r28 = r10
            r29 = r11
            r22 = r12
            r23 = r15
            r8 = r16
            r3 = -1
            r15 = r2
            r16 = r9
            r2 = 0
            goto L_0x03a3
        L_0x0200:
            r2 = 1668050025(0x636c6c69, float:4.3612434E21)
            if (r1 != r2) goto L_0x022c
            if (r25 != 0) goto L_0x020b
            java.nio.ByteBuffer r25 = a()
        L_0x020b:
            r1 = r25
            r2 = 21
            r1.position(r2)
            short r2 = r37.D()
            r1.putShort(r2)
            short r2 = r37.D()
            r1.putShort(r2)
            r25 = r1
            r31 = r3
            r28 = r10
            r29 = r11
        L_0x0228:
            r2 = 0
        L_0x0229:
            r3 = -1
            goto L_0x03a3
        L_0x022c:
            r2 = 1835295606(0x6d646376, float:4.4176764E27)
            if (r1 != r2) goto L_0x029e
            if (r25 != 0) goto L_0x0237
            java.nio.ByteBuffer r25 = a()
        L_0x0237:
            r1 = r25
            short r2 = r37.D()
            short r9 = r37.D()
            short r12 = r37.D()
            r28 = r10
            short r10 = r37.D()
            r29 = r11
            short r11 = r37.D()
            short r4 = r37.D()
            r30 = r15
            short r15 = r37.D()
            r31 = r3
            short r3 = r37.D()
            long r32 = r37.J()
            long r34 = r37.J()
            r36 = r14
            r14 = 1
            r1.position(r14)
            r1.putShort(r11)
            r1.putShort(r4)
            r1.putShort(r2)
            r1.putShort(r9)
            r1.putShort(r12)
            r1.putShort(r10)
            r1.putShort(r15)
            r1.putShort(r3)
            r2 = 10000(0x2710, double:4.9407E-320)
            long r9 = r32 / r2
            int r4 = (int) r9
            short r4 = (short) r4
            r1.putShort(r4)
            long r2 = r34 / r2
            int r2 = (int) r2
            short r2 = (short) r2
            r1.putShort(r2)
            r25 = r1
            r15 = r30
            r14 = r36
            goto L_0x0228
        L_0x029e:
            r31 = r3
            r28 = r10
            r29 = r11
            r36 = r14
            r30 = r15
            r2 = 1681012275(0x64323633, float:1.3149704E22)
            if (r1 != r2) goto L_0x02be
            r2 = 0
            if (r8 != 0) goto L_0x02b2
            r9 = 1
            goto L_0x02b3
        L_0x02b2:
            r9 = 0
        L_0x02b3:
            z2.C2974s.a(r9, r2)
            r8 = r29
        L_0x02b8:
            r15 = r30
            r14 = r36
            goto L_0x0229
        L_0x02be:
            r2 = 0
            r3 = 1702061171(0x65736473, float:7.183675E22)
            if (r1 != r3) goto L_0x02e0
            if (r8 != 0) goto L_0x02c8
            r9 = 1
            goto L_0x02c9
        L_0x02c8:
            r9 = 0
        L_0x02c9:
            z2.C2974s.a(r9, r2)
            T2.b$b r26 = k(r0, r12)
            java.lang.String r1 = r26.f5990a
            byte[] r3 = r26.f5991b
            if (r3 == 0) goto L_0x02de
            com.google.common.collect.v r17 = com.google.common.collect.C4770v.H(r3)
        L_0x02de:
            r8 = r1
            goto L_0x02b8
        L_0x02e0:
            r3 = 1885434736(0x70617370, float:2.7909473E29)
            if (r1 != r3) goto L_0x02f1
            float r1 = s(r0, r12)
            r14 = r1
            r15 = r30
            r3 = -1
            r27 = 1
            goto L_0x03a3
        L_0x02f1:
            r3 = 1937126244(0x73763364, float:1.9506033E31)
            if (r1 != r3) goto L_0x02fb
            byte[] r19 = t(r0, r12, r13)
            goto L_0x02b8
        L_0x02fb:
            r3 = 1936995172(0x73743364, float:1.9347576E31)
            if (r1 != r3) goto L_0x0324
            int r1 = r37.H()
            r3 = 3
            r0.V(r3)
            if (r1 != 0) goto L_0x02b8
            int r1 = r37.H()
            if (r1 == 0) goto L_0x0321
            r12 = 1
            if (r1 == r12) goto L_0x031e
            if (r1 == r9) goto L_0x031b
            if (r1 == r3) goto L_0x0318
            goto L_0x02b8
        L_0x0318:
            r20 = r3
            goto L_0x02b8
        L_0x031b:
            r20 = r9
            goto L_0x02b8
        L_0x031e:
            r20 = r12
            goto L_0x02b8
        L_0x0321:
            r20 = 0
            goto L_0x02b8
        L_0x0324:
            r12 = 1
            r3 = 1668246642(0x636f6c72, float:4.4165861E21)
            if (r1 != r3) goto L_0x038b
            r1 = r22
            r3 = -1
            r4 = r24
            if (r1 != r3) goto L_0x0390
            if (r4 != r3) goto L_0x0390
            int r10 = r37.q()
            r11 = 1852009592(0x6e636c78, float:1.7596057E28)
            if (r10 == r11) goto L_0x035d
            r11 = 1852009571(0x6e636c63, float:1.7596032E28)
            if (r10 != r11) goto L_0x0342
            goto L_0x035d
        L_0x0342:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "Unsupported color type: "
            r9.append(r11)
            java.lang.String r10 = T2.a.a(r10)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "AtomParsers"
            i2.p.h(r10, r9)
            goto L_0x0390
        L_0x035d:
            int r1 = r37.N()
            int r4 = r37.N()
            r0.V(r9)
            r10 = 19
            if (r13 != r10) goto L_0x0376
            int r10 = r37.H()
            r10 = r10 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0376
            r10 = r12
            goto L_0x0377
        L_0x0376:
            r10 = 0
        L_0x0377:
            int r22 = f2.C1974i.j(r1)
            if (r10 == 0) goto L_0x0380
            r23 = r12
            goto L_0x0382
        L_0x0380:
            r23 = r9
        L_0x0382:
            int r24 = f2.C1974i.k(r4)
        L_0x0386:
            r15 = r30
            r14 = r36
            goto L_0x03a3
        L_0x038b:
            r1 = r22
            r4 = r24
            r3 = -1
        L_0x0390:
            r22 = r1
            r24 = r4
            goto L_0x0386
        L_0x0395:
            z2.n r9 = z2.C2970n.a(r37)
            if (r9 == 0) goto L_0x0390
            java.lang.String r8 = r9.f29259c
            java.lang.String r9 = "video/dolby-vision"
            r18 = r8
            r8 = r9
            goto L_0x0390
        L_0x03a3:
            int r7 = r7 + r13
            r1 = r39
            r2 = r40
            r4 = r44
            r10 = r28
            r11 = r29
            r3 = r31
            goto L_0x0081
        L_0x03b2:
            if (r8 != 0) goto L_0x03b5
            return
        L_0x03b5:
            f2.s$b r0 = new f2.s$b
            r0.<init>()
            r3 = r41
            f2.s$b r0 = r0.Z(r3)
            f2.s$b r0 = r0.o0(r8)
            r9 = r18
            f2.s$b r0 = r0.O(r9)
            f2.s$b r0 = r0.t0(r5)
            f2.s$b r0 = r0.Y(r6)
            r14 = r36
            f2.s$b r0 = r0.k0(r14)
            r3 = r42
            f2.s$b r0 = r0.n0(r3)
            r9 = r19
            f2.s$b r0 = r0.l0(r9)
            r12 = r20
            f2.s$b r0 = r0.r0(r12)
            r9 = r17
            f2.s$b r0 = r0.b0(r9)
            r12 = r21
            f2.s$b r0 = r0.g0(r12)
            r3 = r31
            f2.s$b r0 = r0.U(r3)
            f2.i$b r3 = new f2.i$b
            r3.<init>()
            f2.i$b r1 = r3.d(r1)
            r12 = r23
            f2.i$b r1 = r1.c(r12)
            f2.i$b r1 = r1.e(r4)
            if (r25 == 0) goto L_0x0416
            byte[] r9 = r25.array()
            goto L_0x0417
        L_0x0416:
            r9 = r2
        L_0x0417:
            f2.i$b r1 = r1.f(r9)
            r15 = r30
            f2.i$b r1 = r1.g(r15)
            r15 = r16
            f2.i$b r1 = r1.b(r15)
            f2.i r1 = r1.a()
            f2.s$b r0 = r0.P(r1)
            if (r26 == 0) goto L_0x0448
            long r1 = r26.f5992c
            int r1 = com.google.common.primitives.f.m(r1)
            f2.s$b r1 = r0.M(r1)
            long r2 = r26.f5993d
            int r2 = com.google.common.primitives.f.m(r2)
            r1.j0(r2)
        L_0x0448:
            f2.s r0 = r0.K()
            r1 = r44
            r1.f5995b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.b.E(i2.A, int, int, int, int, int, f2.n, T2.b$d, int):void");
    }

    private static z F(C2073A a10) {
        short D10 = a10.D();
        a10.V(2);
        String E10 = a10.E(D10);
        int max = Math.max(E10.lastIndexOf(43), E10.lastIndexOf(45));
        try {
            return new z(new C2123b(Float.parseFloat(E10.substring(0, max)), Float.parseFloat(E10.substring(max, E10.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean b(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        int o10 = L.o(4, 0, length);
        int o11 = L.o(jArr.length - 4, 0, length);
        if (jArr[0] > j11 || j11 >= jArr[o10] || jArr[o11] >= j12 || j12 > j10) {
            return false;
        }
        return true;
    }

    private static boolean c(int i10) {
        if (i10 != 1) {
            return true;
        }
        return false;
    }

    private static int d(C2073A a10, int i10, int i11, int i12) {
        boolean z10;
        boolean z11;
        int f10 = a10.f();
        if (f10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2974s.a(z10, (String) null);
        while (f10 - i11 < i12) {
            a10.U(f10);
            int q10 = a10.q();
            if (q10 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            C2974s.a(z11, "childAtomSize must be positive");
            if (a10.q() == i10) {
                return f10;
            }
            f10 += q10;
        }
        return -1;
    }

    private static int e(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        if (i10 == 1835365473) {
            return 5;
        }
        return -1;
    }

    public static void f(C2073A a10) {
        int f10 = a10.f();
        a10.V(4);
        if (a10.q() != 1751411826) {
            f10 += 4;
        }
        a10.U(f10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x014a, code lost:
        if (r10 == -1) goto L_0x0139;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0411 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:225:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void g(i2.C2073A r24, int r25, int r26, int r27, int r28, java.lang.String r29, boolean r30, f2.C1979n r31, T2.b.d r32, int r33) {
        /*
            r0 = r24
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r31
            r6 = r32
            int r7 = r1 + 16
            r0.U(r7)
            r7 = 6
            r8 = 8
            if (r30 == 0) goto L_0x0020
            int r10 = r24.N()
            r0.V(r7)
            goto L_0x0024
        L_0x0020:
            r0.V(r8)
            r10 = 0
        L_0x0024:
            r13 = -1
            r14 = 4
            r15 = 2
            r11 = 1
            r12 = 16
            if (r10 == 0) goto L_0x0091
            if (r10 != r11) goto L_0x0030
            goto L_0x0091
        L_0x0030:
            if (r10 != r15) goto L_0x0090
            r0.V(r12)
            double r17 = r24.o()
            long r9 = java.lang.Math.round(r17)
            int r7 = (int) r9
            int r9 = r24.L()
            r0.V(r14)
            int r10 = r24.L()
            int r17 = r24.L()
            r18 = r17 & 1
            if (r18 == 0) goto L_0x0054
            r18 = r11
            goto L_0x0056
        L_0x0054:
            r18 = 0
        L_0x0056:
            r17 = r17 & 2
            if (r17 == 0) goto L_0x005d
            r17 = r11
            goto L_0x005f
        L_0x005d:
            r17 = 0
        L_0x005f:
            r15 = 32
            if (r18 != 0) goto L_0x0086
            if (r10 != r8) goto L_0x0067
            r10 = 3
            goto L_0x008b
        L_0x0067:
            if (r10 != r12) goto L_0x0070
            if (r17 == 0) goto L_0x006e
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x008b
        L_0x006e:
            r10 = 2
            goto L_0x008b
        L_0x0070:
            r12 = 24
            if (r10 != r12) goto L_0x007c
            if (r17 == 0) goto L_0x0079
            r10 = 1342177280(0x50000000, float:8.5899346E9)
            goto L_0x008b
        L_0x0079:
            r10 = 21
            goto L_0x008b
        L_0x007c:
            if (r10 != r15) goto L_0x008a
            if (r17 == 0) goto L_0x0083
            r10 = 1610612736(0x60000000, float:3.6893488E19)
            goto L_0x008b
        L_0x0083:
            r10 = 22
            goto L_0x008b
        L_0x0086:
            if (r10 != r15) goto L_0x008a
            r10 = r14
            goto L_0x008b
        L_0x008a:
            r10 = r13
        L_0x008b:
            r0.V(r8)
            r8 = 0
            goto L_0x00ae
        L_0x0090:
            return
        L_0x0091:
            int r9 = r24.N()
            r0.V(r7)
            int r7 = r24.I()
            int r8 = r24.f()
            int r8 = r8 - r14
            r0.U(r8)
            int r8 = r24.q()
            if (r10 != r11) goto L_0x00ad
            r0.V(r12)
        L_0x00ad:
            r10 = r13
        L_0x00ae:
            int r12 = r24.f()
            r15 = 1701733217(0x656e6361, float:7.0359778E22)
            r14 = r25
            if (r14 != r15) goto L_0x00e0
            android.util.Pair r15 = u(r0, r1, r2)
            if (r15 == 0) goto L_0x00dd
            java.lang.Object r14 = r15.first
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            if (r5 != 0) goto L_0x00cb
            r5 = 0
            goto L_0x00d5
        L_0x00cb:
            java.lang.Object r11 = r15.second
            T2.t r11 = (T2.t) r11
            java.lang.String r11 = r11.f6139b
            f2.n r5 = r5.b(r11)
        L_0x00d5:
            T2.t[] r11 = r6.f5994a
            java.lang.Object r15 = r15.second
            T2.t r15 = (T2.t) r15
            r11[r33] = r15
        L_0x00dd:
            r0.U(r12)
        L_0x00e0:
            r11 = 1633889587(0x61632d33, float:2.6191674E20)
            java.lang.String r15 = "audio/mhm1"
            if (r14 != r11) goto L_0x00ee
            java.lang.String r11 = "audio/ac3"
        L_0x00e9:
            r22 = r11
        L_0x00eb:
            r11 = r10
            goto L_0x01ab
        L_0x00ee:
            r11 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r14 != r11) goto L_0x00f6
            java.lang.String r11 = "audio/eac3"
            goto L_0x00e9
        L_0x00f6:
            r11 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r14 != r11) goto L_0x00fe
            java.lang.String r11 = "audio/ac4"
            goto L_0x00e9
        L_0x00fe:
            r11 = 1685353315(0x64747363, float:1.803728E22)
            if (r14 != r11) goto L_0x0106
            java.lang.String r11 = "audio/vnd.dts"
            goto L_0x00e9
        L_0x0106:
            r11 = 1685353320(0x64747368, float:1.8037286E22)
            if (r14 == r11) goto L_0x01a7
            r11 = 1685353324(0x6474736c, float:1.803729E22)
            if (r14 != r11) goto L_0x0112
            goto L_0x01a7
        L_0x0112:
            r11 = 1685353317(0x64747365, float:1.8037282E22)
            if (r14 != r11) goto L_0x011a
            java.lang.String r11 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x00e9
        L_0x011a:
            r11 = 1685353336(0x64747378, float:1.8037304E22)
            if (r14 != r11) goto L_0x0122
            java.lang.String r11 = "audio/vnd.dts.uhd;profile=p2"
            goto L_0x00e9
        L_0x0122:
            r11 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r14 != r11) goto L_0x012a
            java.lang.String r11 = "audio/3gpp"
            goto L_0x00e9
        L_0x012a:
            r11 = 1935767394(0x73617762, float:1.7863284E31)
            if (r14 != r11) goto L_0x0132
            java.lang.String r11 = "audio/amr-wb"
            goto L_0x00e9
        L_0x0132:
            r11 = 1936684916(0x736f7774, float:1.89725E31)
            java.lang.String r22 = "audio/raw"
            if (r14 != r11) goto L_0x013c
        L_0x0139:
            r11 = 2
            goto L_0x01ab
        L_0x013c:
            r11 = 1953984371(0x74776f73, float:7.841539E31)
            if (r14 != r11) goto L_0x0145
            r11 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x01ab
        L_0x0145:
            r11 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r14 != r11) goto L_0x014d
            if (r10 != r13) goto L_0x00eb
            goto L_0x0139
        L_0x014d:
            r11 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r14 == r11) goto L_0x01a3
            r11 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r14 != r11) goto L_0x0158
            goto L_0x01a3
        L_0x0158:
            r11 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r14 != r11) goto L_0x0160
            java.lang.String r11 = "audio/mha1"
            goto L_0x00e9
        L_0x0160:
            r11 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r14 != r11) goto L_0x0169
            r11 = r10
            r22 = r15
            goto L_0x01ab
        L_0x0169:
            r11 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r14 != r11) goto L_0x0172
            java.lang.String r11 = "audio/alac"
            goto L_0x00e9
        L_0x0172:
            r11 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r14 != r11) goto L_0x017b
            java.lang.String r11 = "audio/g711-alaw"
            goto L_0x00e9
        L_0x017b:
            r11 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r14 != r11) goto L_0x0184
            java.lang.String r11 = "audio/g711-mlaw"
            goto L_0x00e9
        L_0x0184:
            r11 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r14 != r11) goto L_0x018d
            java.lang.String r11 = "audio/opus"
            goto L_0x00e9
        L_0x018d:
            r11 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r14 != r11) goto L_0x0196
            java.lang.String r11 = "audio/flac"
            goto L_0x00e9
        L_0x0196:
            r11 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r14 != r11) goto L_0x019f
            java.lang.String r11 = "audio/true-hd"
            goto L_0x00e9
        L_0x019f:
            r11 = r10
            r22 = 0
            goto L_0x01ab
        L_0x01a3:
            java.lang.String r11 = "audio/mpeg"
            goto L_0x00e9
        L_0x01a7:
            java.lang.String r11 = "audio/vnd.dts.hd"
            goto L_0x00e9
        L_0x01ab:
            r31 = r11
            r10 = r22
            r13 = 0
            r14 = 0
            r22 = 0
        L_0x01b3:
            int r11 = r12 - r1
            if (r11 >= r2) goto L_0x040d
            r0.U(r12)
            int r11 = r24.q()
            if (r11 <= 0) goto L_0x01c2
            r1 = 1
            goto L_0x01c3
        L_0x01c2:
            r1 = 0
        L_0x01c3:
            java.lang.String r2 = "childAtomSize must be positive"
            z2.C2974s.a(r1, r2)
            int r1 = r24.q()
            r2 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r1 != r2) goto L_0x0238
            int r1 = r12 + 8
            r0.U(r1)
            r1 = 1
            r0.V(r1)
            int r2 = r24.H()
            r0.V(r1)
            boolean r1 = java.util.Objects.equals(r10, r15)
            if (r1 == 0) goto L_0x01f7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "mhm1.%02X"
            java.lang.String r1 = java.lang.String.format(r2, r1)
        L_0x01f5:
            r14 = r1
            goto L_0x0206
        L_0x01f7:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "mha1.%02X"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            goto L_0x01f5
        L_0x0206:
            int r1 = r24.N()
            byte[] r2 = new byte[r1]
            r33 = r14
            r14 = 0
            r0.l(r2, r14, r1)
            if (r13 != 0) goto L_0x021a
            com.google.common.collect.v r1 = com.google.common.collect.C4770v.H(r2)
        L_0x0218:
            r13 = r1
            goto L_0x0225
        L_0x021a:
            java.lang.Object r1 = r13.get(r14)
            byte[] r1 = (byte[]) r1
            com.google.common.collect.v r1 = com.google.common.collect.C4770v.I(r2, r1)
            goto L_0x0218
        L_0x0225:
            r14 = r33
        L_0x0227:
            r33 = r15
        L_0x0229:
            r2 = -1
        L_0x022a:
            r15 = 1
            r16 = 3
            r17 = 4
            r19 = 0
            r20 = 2
            r21 = 1634492771(0x616c6163, float:2.7252807E20)
            goto L_0x0404
        L_0x0238:
            r2 = 1835557200(0x6d686150, float:4.4948854E27)
            if (r1 != r2) goto L_0x0262
            int r1 = r12 + 8
            r0.U(r1)
            int r1 = r24.H()
            if (r1 <= 0) goto L_0x0227
            byte[] r2 = new byte[r1]
            r33 = r15
            r15 = 0
            r0.l(r2, r15, r1)
            if (r13 != 0) goto L_0x0257
            com.google.common.collect.v r13 = com.google.common.collect.C4770v.H(r2)
            goto L_0x0229
        L_0x0257:
            java.lang.Object r1 = r13.get(r15)
            byte[] r1 = (byte[]) r1
            com.google.common.collect.v r13 = com.google.common.collect.C4770v.I(r1, r2)
            goto L_0x0229
        L_0x0262:
            r33 = r15
            r2 = 1702061171(0x65736473, float:7.183675E22)
            if (r1 == r2) goto L_0x0270
            if (r30 == 0) goto L_0x027e
            r15 = 2002876005(0x77617665, float:4.5729223E33)
            if (r1 != r15) goto L_0x027e
        L_0x0270:
            r15 = 1
            r16 = 3
            r17 = 4
            r19 = 0
            r20 = 2
            r21 = 1634492771(0x616c6163, float:2.7252807E20)
            goto L_0x03c5
        L_0x027e:
            r2 = 1684103987(0x64616333, float:1.6630662E22)
            if (r1 != r2) goto L_0x02a0
            int r1 = r12 + 8
            r0.U(r1)
            java.lang.String r1 = java.lang.Integer.toString(r28)
            f2.s r1 = z2.C2958b.d(r0, r1, r4, r5)
            r6.f5995b = r1
        L_0x0292:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r15 = 1
            r16 = 3
            r17 = 4
            r19 = 0
            r20 = 2
            goto L_0x03c1
        L_0x02a0:
            r2 = 1684366131(0x64656333, float:1.692581E22)
            if (r1 != r2) goto L_0x02b5
            int r1 = r12 + 8
            r0.U(r1)
            java.lang.String r1 = java.lang.Integer.toString(r28)
            f2.s r1 = z2.C2958b.h(r0, r1, r4, r5)
            r6.f5995b = r1
            goto L_0x0292
        L_0x02b5:
            r2 = 1684103988(0x64616334, float:1.6630663E22)
            if (r1 != r2) goto L_0x02ca
            int r1 = r12 + 8
            r0.U(r1)
            java.lang.String r1 = java.lang.Integer.toString(r28)
            f2.s r1 = z2.C2959c.b(r0, r1, r4, r5)
            r6.f5995b = r1
            goto L_0x0292
        L_0x02ca:
            r2 = 1684892784(0x646d6c70, float:1.7518768E22)
            if (r1 != r2) goto L_0x02ed
            if (r8 <= 0) goto L_0x02d6
            r7 = r8
            r2 = -1
            r9 = 2
            goto L_0x022a
        L_0x02d6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid sample rate for Dolby TrueHD MLP stream: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r15 = 0
            f2.B r0 = f2.C1961B.a(r0, r15)
            throw r0
        L_0x02ed:
            r15 = 0
            r2 = 1684305011(0x64647473, float:1.6856995E22)
            if (r1 == r2) goto L_0x02f8
            r2 = 1969517683(0x75647473, float:2.8960097E32)
            if (r1 != r2) goto L_0x0306
        L_0x02f8:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r15 = 1
            r16 = 3
            r17 = 4
            r19 = 0
            r20 = 2
            goto L_0x039e
        L_0x0306:
            r2 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r1 != r2) goto L_0x0324
            int r1 = r11 + -8
            byte[] r2 = f5980a
            int r13 = r2.length
            int r13 = r13 + r1
            byte[] r13 = java.util.Arrays.copyOf(r2, r13)
            int r15 = r12 + 8
            r0.U(r15)
            int r2 = r2.length
            r0.l(r13, r2, r1)
            java.util.List r13 = z2.H.a(r13)
            goto L_0x0229
        L_0x0324:
            r2 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r1 != r2) goto L_0x035d
            int r1 = r11 + -12
            int r2 = r11 + -8
            byte[] r2 = new byte[r2]
            r13 = 102(0x66, float:1.43E-43)
            r15 = 0
            r2[r15] = r13
            r13 = 76
            r15 = 1
            r2[r15] = r13
            r13 = 97
            r20 = 2
            r2[r20] = r13
            r13 = 67
            r16 = 3
            r2[r16] = r13
            int r13 = r12 + 12
            r0.U(r13)
            r13 = 4
            r0.l(r2, r13, r1)
            com.google.common.collect.v r1 = com.google.common.collect.C4770v.H(r2)
            r17 = r13
            r2 = -1
            r19 = 0
            r21 = 1634492771(0x616c6163, float:2.7252807E20)
            r13 = r1
            goto L_0x0404
        L_0x035d:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r15 = 1
            r16 = 3
            r17 = 4
            r20 = 2
            if (r1 != r2) goto L_0x039b
            int r1 = r11 + -12
            byte[] r7 = new byte[r1]
            int r9 = r12 + 12
            r0.U(r9)
            r9 = 0
            r0.l(r7, r9, r1)
            android.util.Pair r1 = i2.C2079d.e(r7)
            java.lang.Object r13 = r1.first
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.google.common.collect.v r7 = com.google.common.collect.C4770v.H(r7)
            r21 = r2
            r19 = r9
            r2 = -1
            r9 = r1
            r23 = r13
            r13 = r7
            r7 = r23
            goto L_0x0404
        L_0x039b:
            r19 = 0
            goto L_0x03c1
        L_0x039e:
            f2.s$b r1 = new f2.s$b
            r1.<init>()
            f2.s$b r1 = r1.Z(r3)
            f2.s$b r1 = r1.o0(r10)
            f2.s$b r1 = r1.N(r9)
            f2.s$b r1 = r1.p0(r7)
            f2.s$b r1 = r1.U(r5)
            f2.s$b r1 = r1.e0(r4)
            f2.s r1 = r1.K()
            r6.f5995b = r1
        L_0x03c1:
            r21 = r2
            r2 = -1
            goto L_0x0404
        L_0x03c5:
            if (r1 != r2) goto L_0x03ca
            r1 = r12
        L_0x03c8:
            r2 = -1
            goto L_0x03cf
        L_0x03ca:
            int r1 = d(r0, r2, r12, r11)
            goto L_0x03c8
        L_0x03cf:
            if (r1 == r2) goto L_0x0404
            T2.b$b r22 = k(r0, r1)
            java.lang.String r10 = r22.f5990a
            byte[] r1 = r22.f5991b
            if (r1 == 0) goto L_0x0404
            java.lang.String r13 = "audio/vorbis"
            boolean r13 = r13.equals(r10)
            if (r13 == 0) goto L_0x03ec
            com.google.common.collect.v r13 = z2.S.e(r1)
            goto L_0x0404
        L_0x03ec:
            java.lang.String r13 = "audio/mp4a-latm"
            boolean r13 = r13.equals(r10)
            if (r13 == 0) goto L_0x0400
            z2.a$b r7 = z2.C2957a.e(r1)
            int r9 = r7.f29157a
            int r13 = r7.f29158b
            java.lang.String r14 = r7.f29159c
            r7 = r9
            r9 = r13
        L_0x0400:
            com.google.common.collect.v r13 = com.google.common.collect.C4770v.H(r1)
        L_0x0404:
            int r12 = r12 + r11
            r1 = r26
            r2 = r27
            r15 = r33
            goto L_0x01b3
        L_0x040d:
            f2.s r0 = r6.f5995b
            if (r0 != 0) goto L_0x045d
            if (r10 == 0) goto L_0x045d
            f2.s$b r0 = new f2.s$b
            r0.<init>()
            f2.s$b r0 = r0.Z(r3)
            f2.s$b r0 = r0.o0(r10)
            f2.s$b r0 = r0.O(r14)
            f2.s$b r0 = r0.N(r9)
            f2.s$b r0 = r0.p0(r7)
            r10 = r31
            f2.s$b r0 = r0.i0(r10)
            f2.s$b r0 = r0.b0(r13)
            f2.s$b r0 = r0.U(r5)
            f2.s$b r0 = r0.e0(r4)
            if (r22 == 0) goto L_0x0457
            long r1 = r22.f5992c
            int r1 = com.google.common.primitives.f.m(r1)
            f2.s$b r1 = r0.M(r1)
            long r2 = r22.f5993d
            int r2 = com.google.common.primitives.f.m(r2)
            r1.j0(r2)
        L_0x0457:
            f2.s r0 = r0.K()
            r6.f5995b = r0
        L_0x045d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.b.g(i2.A, int, int, int, int, java.lang.String, boolean, f2.n, T2.b$d, int):void");
    }

    private static C1974i h(C2073A a10) {
        int i10;
        int i11;
        int i12;
        int i13;
        C1974i.b bVar = new C1974i.b();
        i2.z zVar = new i2.z(a10.e());
        zVar.p(a10.f() * 8);
        int i14 = 1;
        zVar.s(1);
        int h10 = zVar.h(3);
        zVar.r(6);
        boolean g10 = zVar.g();
        boolean g11 = zVar.g();
        int i15 = 10;
        if (h10 == 2 && g10) {
            if (g11) {
                i13 = 12;
            } else {
                i13 = 10;
            }
            bVar.g(i13);
            if (g11) {
                i15 = 12;
            }
            bVar.b(i15);
        } else if (h10 <= 2) {
            if (g10) {
                i12 = 10;
            } else {
                i12 = 8;
            }
            bVar.g(i12);
            if (!g10) {
                i15 = 8;
            }
            bVar.b(i15);
        }
        zVar.r(13);
        zVar.q();
        int h11 = zVar.h(4);
        if (h11 != 1) {
            p.f("AtomParsers", "Unsupported obu_type: " + h11);
            return bVar.a();
        } else if (zVar.g()) {
            p.f("AtomParsers", "Unsupported obu_extension_flag");
            return bVar.a();
        } else {
            boolean g12 = zVar.g();
            zVar.q();
            if (!g12 || zVar.h(8) <= 127) {
                int h12 = zVar.h(3);
                zVar.q();
                if (zVar.g()) {
                    p.f("AtomParsers", "Unsupported reduced_still_picture_header");
                    return bVar.a();
                } else if (zVar.g()) {
                    p.f("AtomParsers", "Unsupported timing_info_present_flag");
                    return bVar.a();
                } else if (zVar.g()) {
                    p.f("AtomParsers", "Unsupported initial_display_delay_present_flag");
                    return bVar.a();
                } else {
                    int h13 = zVar.h(5);
                    boolean z10 = false;
                    for (int i16 = 0; i16 <= h13; i16++) {
                        zVar.r(12);
                        if (zVar.h(5) > 7) {
                            zVar.q();
                        }
                    }
                    int h14 = zVar.h(4);
                    int h15 = zVar.h(4);
                    zVar.r(h14 + 1);
                    zVar.r(h15 + 1);
                    if (zVar.g()) {
                        zVar.r(7);
                    }
                    zVar.r(7);
                    boolean g13 = zVar.g();
                    if (g13) {
                        zVar.r(2);
                    }
                    if (zVar.g()) {
                        i10 = 2;
                    } else {
                        i10 = zVar.h(1);
                    }
                    if (i10 > 0 && !zVar.g()) {
                        zVar.r(1);
                    }
                    if (g13) {
                        zVar.r(3);
                    }
                    zVar.r(3);
                    boolean g14 = zVar.g();
                    if (h12 == 2 && g14) {
                        zVar.q();
                    }
                    if (h12 != 1 && zVar.g()) {
                        z10 = true;
                    }
                    if (zVar.g()) {
                        int h16 = zVar.h(8);
                        int h17 = zVar.h(8);
                        int h18 = zVar.h(8);
                        if (!z10 && h16 == 1 && h17 == 13 && h18 == 0) {
                            i11 = 1;
                        } else {
                            i11 = zVar.h(1);
                        }
                        C1974i.b d10 = bVar.d(C1974i.j(h16));
                        if (i11 != 1) {
                            i14 = 2;
                        }
                        d10.c(i14).e(C1974i.k(h17));
                    }
                    return bVar.a();
                }
            } else {
                p.f("AtomParsers", "Excessive obu_size");
                return bVar.a();
            }
        }
    }

    static Pair i(C2073A a10, int i10, int i11) {
        boolean z10;
        boolean z11;
        int i12 = i10 + 8;
        boolean z12 = false;
        int i13 = -1;
        int i14 = 0;
        String str = null;
        Integer num = null;
        while (i12 - i10 < i11) {
            a10.U(i12);
            int q10 = a10.q();
            int q11 = a10.q();
            if (q11 == 1718775137) {
                num = Integer.valueOf(a10.q());
            } else if (q11 == 1935894637) {
                a10.V(4);
                str = a10.E(4);
            } else if (q11 == 1935894633) {
                i13 = i12;
                i14 = q10;
            }
            i12 += q10;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        if (num != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2974s.a(z10, "frma atom is mandatory");
        if (i13 != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        C2974s.a(z11, "schi atom is mandatory");
        t v10 = v(a10, i13, i14, str);
        if (v10 != null) {
            z12 = true;
        }
        C2974s.a(z12, "tenc atom is mandatory");
        return Pair.create(num, (t) L.h(v10));
    }

    private static Pair j(a.C0142a aVar) {
        long j10;
        long j11;
        a.b g10 = aVar.g(1701606260);
        if (g10 == null) {
            return null;
        }
        C2073A a10 = g10.f5979b;
        a10.U(8);
        int c10 = a.c(a10.q());
        int L10 = a10.L();
        long[] jArr = new long[L10];
        long[] jArr2 = new long[L10];
        int i10 = 0;
        while (i10 < L10) {
            if (c10 == 1) {
                j10 = a10.M();
            } else {
                j10 = a10.J();
            }
            jArr[i10] = j10;
            if (c10 == 1) {
                j11 = a10.A();
            } else {
                j11 = (long) a10.q();
            }
            jArr2[i10] = j11;
            if (a10.D() == 1) {
                a10.V(2);
                i10++;
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static C0143b k(C2073A a10, int i10) {
        long j10;
        long j11;
        a10.U(i10 + 12);
        a10.V(1);
        l(a10);
        a10.V(2);
        int H10 = a10.H();
        if ((H10 & 128) != 0) {
            a10.V(2);
        }
        if ((H10 & 64) != 0) {
            a10.V(a10.H());
        }
        if ((H10 & 32) != 0) {
            a10.V(2);
        }
        a10.V(1);
        l(a10);
        String f10 = C1960A.f(a10.H());
        if ("audio/mpeg".equals(f10) || "audio/vnd.dts".equals(f10) || "audio/vnd.dts.hd".equals(f10)) {
            return new C0143b(f10, (byte[]) null, -1, -1);
        }
        a10.V(4);
        long J10 = a10.J();
        long J11 = a10.J();
        a10.V(1);
        int l10 = l(a10);
        byte[] bArr = new byte[l10];
        a10.l(bArr, 0, l10);
        if (J11 > 0) {
            j10 = J11;
        } else {
            j10 = -1;
        }
        if (J10 > 0) {
            j11 = J10;
        } else {
            j11 = -1;
        }
        return new C0143b(f10, bArr, j10, j11);
    }

    private static int l(C2073A a10) {
        int H10 = a10.H();
        int i10 = H10 & 127;
        while ((H10 & 128) == 128) {
            H10 = a10.H();
            i10 = (i10 << 7) | (H10 & 127);
        }
        return i10;
    }

    private static int m(C2073A a10) {
        a10.U(16);
        return a10.q();
    }

    private static z n(C2073A a10, int i10) {
        a10.V(8);
        ArrayList arrayList = new ArrayList();
        while (a10.f() < i10) {
            z.b c10 = j.c(a10);
            if (c10 != null) {
                arrayList.add(c10);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new z((List) arrayList);
    }

    private static Pair o(C2073A a10) {
        int i10;
        int i11 = 8;
        a10.U(8);
        int c10 = a.c(a10.q());
        if (c10 == 0) {
            i10 = 8;
        } else {
            i10 = 16;
        }
        a10.V(i10);
        long J10 = a10.J();
        if (c10 == 0) {
            i11 = 4;
        }
        a10.V(i11);
        int N10 = a10.N();
        return Pair.create(Long.valueOf(J10), "" + ((char) (((N10 >> 10) & 31) + 96)) + ((char) (((N10 >> 5) & 31) + 96)) + ((char) ((N10 & 31) + 96)));
    }

    public static z p(a.C0142a aVar) {
        a.b g10 = aVar.g(1751411826);
        a.b g11 = aVar.g(1801812339);
        a.b g12 = aVar.g(1768715124);
        if (g10 == null || g11 == null || g12 == null || m(g10.f5979b) != 1835299937) {
            return null;
        }
        C2073A a10 = g11.f5979b;
        a10.U(12);
        int q10 = a10.q();
        String[] strArr = new String[q10];
        for (int i10 = 0; i10 < q10; i10++) {
            int q11 = a10.q();
            a10.V(4);
            strArr[i10] = a10.E(q11 - 8);
        }
        C2073A a11 = g12.f5979b;
        a11.U(8);
        ArrayList arrayList = new ArrayList();
        while (a11.a() > 8) {
            int f10 = a11.f();
            int q12 = a11.q();
            int q13 = a11.q() - 1;
            if (q13 < 0 || q13 >= q10) {
                p.h("AtomParsers", "Skipped metadata with unknown key index: " + q13);
            } else {
                C2122a h10 = j.h(a11, f10 + q12, strArr[q13]);
                if (h10 != null) {
                    arrayList.add(h10);
                }
            }
            a11.U(f10 + q12);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new z((List) arrayList);
    }

    private static void q(C2073A a10, int i10, int i11, int i12, d dVar) {
        a10.U(i11 + 16);
        if (i10 == 1835365492) {
            a10.B();
            String B10 = a10.B();
            if (B10 != null) {
                dVar.f5995b = new s.b().Z(i12).o0(B10).K();
            }
        }
    }

    public static j2.c r(C2073A a10) {
        long A10;
        long A11;
        a10.U(8);
        if (a.c(a10.q()) == 0) {
            A10 = a10.J();
            A11 = a10.J();
        } else {
            A10 = a10.A();
            A11 = a10.A();
        }
        return new j2.c(A10, A11, a10.J());
    }

    private static float s(C2073A a10, int i10) {
        a10.U(i10 + 8);
        return ((float) a10.L()) / ((float) a10.L());
    }

    private static byte[] t(C2073A a10, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            a10.U(i12);
            int q10 = a10.q();
            if (a10.q() == 1886547818) {
                return Arrays.copyOfRange(a10.e(), i12, q10 + i12);
            }
            i12 += q10;
        }
        return null;
    }

    private static Pair u(C2073A a10, int i10, int i11) {
        boolean z10;
        Pair i12;
        int f10 = a10.f();
        while (f10 - i10 < i11) {
            a10.U(f10);
            int q10 = a10.q();
            if (q10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            C2974s.a(z10, "childAtomSize must be positive");
            if (a10.q() == 1936289382 && (i12 = i(a10, f10, q10)) != null) {
                return i12;
            }
            f10 += q10;
        }
        return null;
    }

    private static t v(C2073A a10, int i10, int i11, String str) {
        int i12;
        int i13;
        boolean z10;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            a10.U(i14);
            int q10 = a10.q();
            if (a10.q() == 1952804451) {
                int c10 = a.c(a10.q());
                a10.V(1);
                if (c10 == 0) {
                    a10.V(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int H10 = a10.H();
                    i12 = H10 & 15;
                    i13 = (H10 & 240) >> 4;
                }
                if (a10.H() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int H11 = a10.H();
                byte[] bArr2 = new byte[16];
                a10.l(bArr2, 0, 16);
                if (z10 && H11 == 0) {
                    int H12 = a10.H();
                    bArr = new byte[H12];
                    a10.l(bArr, 0, H12);
                }
                return new t(z10, str, H11, bArr2, i13, i12, bArr);
            }
            i14 += q10;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static T2.v w(T2.s r37, T2.a.C0142a r38, z2.B r39) {
        /*
            r1 = r37
            r0 = r38
            r2 = r39
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            T2.a$b r3 = r0.g(r3)
            if (r3 == 0) goto L_0x0017
            T2.b$e r5 = new T2.b$e
            f2.s r6 = r1.f6132f
            r5.<init>(r3, r6)
            goto L_0x0025
        L_0x0017:
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            T2.a$b r3 = r0.g(r3)
            if (r3 == 0) goto L_0x0528
            T2.b$f r5 = new T2.b$f
            r5.<init>(r3)
        L_0x0025:
            int r3 = r5.c()
            r6 = 0
            if (r3 != 0) goto L_0x0040
            T2.v r9 = new T2.v
            long[] r2 = new long[r6]
            int[] r3 = new int[r6]
            long[] r5 = new long[r6]
            int[] r6 = new int[r6]
            r7 = 0
            r4 = 0
            r0 = r9
            r1 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0040:
            r7 = 1937007471(0x7374636f, float:1.9362445E31)
            T2.a$b r7 = r0.g(r7)
            r8 = 1
            if (r7 != 0) goto L_0x0059
            r7 = 1668232756(0x636f3634, float:4.4126776E21)
            T2.a$b r7 = r0.g(r7)
            java.lang.Object r7 = i2.C2076a.e(r7)
            T2.a$b r7 = (T2.a.b) r7
            r9 = r8
            goto L_0x005a
        L_0x0059:
            r9 = r6
        L_0x005a:
            i2.A r7 = r7.f5979b
            r10 = 1937011555(0x73747363, float:1.9367382E31)
            T2.a$b r10 = r0.g(r10)
            java.lang.Object r10 = i2.C2076a.e(r10)
            T2.a$b r10 = (T2.a.b) r10
            i2.A r10 = r10.f5979b
            r11 = 1937011827(0x73747473, float:1.9367711E31)
            T2.a$b r11 = r0.g(r11)
            java.lang.Object r11 = i2.C2076a.e(r11)
            T2.a$b r11 = (T2.a.b) r11
            i2.A r11 = r11.f5979b
            r12 = 1937011571(0x73747373, float:1.9367401E31)
            T2.a$b r12 = r0.g(r12)
            if (r12 == 0) goto L_0x0086
            i2.A r12 = r12.f5979b
            goto L_0x0087
        L_0x0086:
            r12 = 0
        L_0x0087:
            r13 = 1668576371(0x63747473, float:4.5093966E21)
            T2.a$b r0 = r0.g(r13)
            if (r0 == 0) goto L_0x0093
            i2.A r0 = r0.f5979b
            goto L_0x0094
        L_0x0093:
            r0 = 0
        L_0x0094:
            T2.b$a r13 = new T2.b$a
            r13.<init>(r10, r7, r9)
            r7 = 12
            r11.U(r7)
            int r9 = r11.L()
            int r9 = r9 - r8
            int r10 = r11.L()
            int r14 = r11.L()
            if (r0 == 0) goto L_0x00b5
            r0.U(r7)
            int r15 = r0.L()
            goto L_0x00b6
        L_0x00b5:
            r15 = r6
        L_0x00b6:
            r4 = -1
            if (r12 == 0) goto L_0x00cd
            r12.U(r7)
            int r7 = r12.L()
            if (r7 <= 0) goto L_0x00c9
            int r16 = r12.L()
            int r16 = r16 + -1
            goto L_0x00d0
        L_0x00c9:
            r16 = r4
            r12 = 0
            goto L_0x00d0
        L_0x00cd:
            r16 = r4
            r7 = r6
        L_0x00d0:
            int r6 = r5.b()
            f2.s r8 = r1.f6132f
            java.lang.String r8 = r8.f20083n
            if (r6 == r4) goto L_0x00fc
            java.lang.String r4 = "audio/raw"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x00f2
            java.lang.String r4 = "audio/g711-mlaw"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x00f2
            java.lang.String r4 = "audio/g711-alaw"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x00fc
        L_0x00f2:
            if (r9 != 0) goto L_0x00fc
            if (r15 != 0) goto L_0x00fc
            if (r7 != 0) goto L_0x00fc
            r38 = r7
            r4 = 1
            goto L_0x00ff
        L_0x00fc:
            r38 = r7
            r4 = 0
        L_0x00ff:
            if (r4 == 0) goto L_0x0133
            int r0 = r13.f5981a
            long[] r4 = new long[r0]
            int[] r0 = new int[r0]
        L_0x0107:
            boolean r5 = r13.a()
            if (r5 == 0) goto L_0x0118
            int r5 = r13.f5982b
            long r9 = r13.f5984d
            r4[r5] = r9
            int r9 = r13.f5983c
            r0[r5] = r9
            goto L_0x0107
        L_0x0118:
            long r9 = (long) r14
            T2.e$b r0 = T2.e.a(r6, r4, r0, r9)
            long[] r4 = r0.f6016a
            int[] r5 = r0.f6017b
            int r6 = r0.f6018c
            long[] r9 = r0.f6019d
            int[] r10 = r0.f6020e
            long r11 = r0.f6021f
            r14 = r1
            r0 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r13 = r10
            r15 = r11
            r12 = r9
            goto L_0x02a1
        L_0x0133:
            long[] r4 = new long[r3]
            int[] r6 = new int[r3]
            long[] r7 = new long[r3]
            int[] r8 = new int[r3]
            r24 = r11
            r2 = r16
            r1 = 0
            r11 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r16 = r15
            r15 = r14
            r14 = r10
            r36 = r9
            r9 = r38
        L_0x0153:
            r38 = r36
            java.lang.String r10 = "AtomParsers"
            if (r1 >= r3) goto L_0x021a
            r28 = r27
            r27 = r21
            r21 = 1
        L_0x015f:
            if (r27 != 0) goto L_0x017c
            boolean r21 = r13.a()
            if (r21 == 0) goto L_0x017c
            r30 = r14
            r31 = r15
            long r14 = r13.f5984d
            r32 = r3
            int r3 = r13.f5983c
            r27 = r3
            r28 = r14
            r14 = r30
            r15 = r31
            r3 = r32
            goto L_0x015f
        L_0x017c:
            r32 = r3
            r30 = r14
            r31 = r15
            if (r21 != 0) goto L_0x01a0
            java.lang.String r2 = "Unexpected end of chunk data"
            i2.p.h(r10, r2)
            long[] r4 = java.util.Arrays.copyOf(r4, r1)
            int[] r6 = java.util.Arrays.copyOf(r6, r1)
            long[] r7 = java.util.Arrays.copyOf(r7, r1)
            int[] r8 = java.util.Arrays.copyOf(r8, r1)
            r3 = r1
            r2 = r22
            r1 = r27
            goto L_0x0222
        L_0x01a0:
            if (r0 == 0) goto L_0x01b3
        L_0x01a2:
            if (r23 != 0) goto L_0x01b1
            if (r16 <= 0) goto L_0x01b1
            int r23 = r0.L()
            int r22 = r0.q()
            int r16 = r16 + -1
            goto L_0x01a2
        L_0x01b1:
            int r23 = r23 + -1
        L_0x01b3:
            r3 = r22
            r4[r1] = r28
            int r10 = r5.a()
            r6[r1] = r10
            if (r10 <= r11) goto L_0x01c0
            r11 = r10
        L_0x01c0:
            long r14 = (long) r3
            long r14 = r25 + r14
            r7[r1] = r14
            if (r12 != 0) goto L_0x01c9
            r10 = 1
            goto L_0x01ca
        L_0x01c9:
            r10 = 0
        L_0x01ca:
            r8[r1] = r10
            if (r1 != r2) goto L_0x01e0
            r10 = 1
            r8[r1] = r10
            int r9 = r9 + -1
            if (r9 <= 0) goto L_0x01e0
            java.lang.Object r2 = i2.C2076a.e(r12)
            i2.A r2 = (i2.C2073A) r2
            int r2 = r2.L()
            int r2 = r2 - r10
        L_0x01e0:
            r15 = r2
            r10 = r3
            r14 = r31
            long r2 = (long) r14
            long r25 = r25 + r2
            int r2 = r30 + -1
            if (r2 != 0) goto L_0x01fa
            if (r38 <= 0) goto L_0x01fa
            int r2 = r24.L()
            int r3 = r24.q()
            int r14 = r38 + -1
        L_0x01f7:
            r38 = r2
            goto L_0x01fe
        L_0x01fa:
            r3 = r14
            r14 = r38
            goto L_0x01f7
        L_0x01fe:
            r2 = r6[r1]
            r21 = r3
            long r2 = (long) r2
            long r2 = r28 + r2
            int r22 = r27 + -1
            int r1 = r1 + 1
            r27 = r2
            r2 = r15
            r15 = r21
            r21 = r22
            r3 = r32
            r22 = r10
            r36 = r14
            r14 = r38
            goto L_0x0153
        L_0x021a:
            r32 = r3
            r30 = r14
            r1 = r21
            r2 = r22
        L_0x0222:
            long r12 = (long) r2
            long r12 = r25 + r12
            if (r0 == 0) goto L_0x0237
        L_0x0227:
            if (r16 <= 0) goto L_0x0237
            int r2 = r0.L()
            if (r2 == 0) goto L_0x0231
            r0 = 0
            goto L_0x0238
        L_0x0231:
            r0.q()
            int r16 = r16 + -1
            goto L_0x0227
        L_0x0237:
            r0 = 1
        L_0x0238:
            if (r9 != 0) goto L_0x024a
            if (r30 != 0) goto L_0x024a
            if (r1 != 0) goto L_0x024a
            if (r38 != 0) goto L_0x024a
            r2 = r23
            if (r2 != 0) goto L_0x024c
            if (r0 != 0) goto L_0x0247
            goto L_0x024c
        L_0x0247:
            r14 = r37
            goto L_0x029a
        L_0x024a:
            r2 = r23
        L_0x024c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r14 = "Inconsistent stbl box for track "
            r5.append(r14)
            r14 = r37
            int r15 = r14.f6127a
            r5.append(r15)
            java.lang.String r15 = ": remainingSynchronizationSamples "
            r5.append(r15)
            r5.append(r9)
            java.lang.String r9 = ", remainingSamplesAtTimestampDelta "
            r5.append(r9)
            r9 = r30
            r5.append(r9)
            java.lang.String r9 = ", remainingSamplesInChunk "
            r5.append(r9)
            r5.append(r1)
            java.lang.String r1 = ", remainingTimestampDeltaChanges "
            r5.append(r1)
            r9 = r38
            r5.append(r9)
            java.lang.String r1 = ", remainingSamplesAtTimestampOffset "
            r5.append(r1)
            r5.append(r2)
            if (r0 != 0) goto L_0x028e
            java.lang.String r0 = ", ctts invalid"
            goto L_0x0290
        L_0x028e:
            java.lang.String r0 = ""
        L_0x0290:
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            i2.p.h(r10, r0)
        L_0x029a:
            r0 = r3
            r2 = r4
            r3 = r6
            r4 = r11
            r15 = r12
            r12 = r7
            r13 = r8
        L_0x02a1:
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r14.f6129c
            r5 = r15
            long r7 = i2.L.U0(r5, r7, r9)
            long[] r1 = r14.f6134h
            r10 = 1000000(0xf4240, double:4.940656E-318)
            if (r1 != 0) goto L_0x02c2
            long r0 = r14.f6129c
            i2.L.V0(r12, r10, r0)
            T2.v r9 = new T2.v
            r0 = r9
            r1 = r37
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x02c2:
            int r1 = r1.length
            r5 = 1
            if (r1 != r5) goto L_0x0362
            int r1 = r14.f6128b
            if (r1 != r5) goto L_0x0362
            int r1 = r12.length
            r5 = 2
            if (r1 < r5) goto L_0x0362
            long[] r1 = r14.f6135i
            java.lang.Object r1 = i2.C2076a.e(r1)
            long[] r1 = (long[]) r1
            r5 = 0
            r21 = r1[r5]
            long[] r1 = r14.f6134h
            r23 = r1[r5]
            long r5 = r14.f6129c
            long r7 = r14.f6130d
            r25 = r5
            r27 = r7
            long r5 = i2.L.U0(r23, r25, r27)
            long r23 = r21 + r5
            r5 = r12
            r6 = r15
            r8 = r21
            r25 = r0
            r0 = r10
            r10 = r23
            boolean r5 = b(r5, r6, r8, r10)
            if (r5 == 0) goto L_0x035f
            long r6 = r15 - r23
            r5 = 0
            r8 = r12[r5]
            long r26 = r21 - r8
            f2.s r5 = r14.f6132f
            int r5 = r5.f20060C
            long r8 = (long) r5
            long r10 = r14.f6129c
            r28 = r8
            r30 = r10
            long r10 = i2.L.U0(r26, r28, r30)
            f2.s r5 = r14.f6132f
            int r5 = r5.f20060C
            long r8 = (long) r5
            long r0 = r14.f6129c
            r38 = r4
            r4 = r10
            r10 = r0
            long r0 = i2.L.U0(r6, r8, r10)
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0329
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0365
        L_0x0329:
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0365
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x0365
            int r4 = (int) r4
            r5 = r39
            r5.f29073a = r4
            int r0 = (int) r0
            r5.f29074b = r0
            long r0 = r14.f6129c
            r4 = 1000000(0xf4240, double:4.940656E-318)
            i2.L.V0(r12, r4, r0)
            long[] r0 = r14.f6134h
            r1 = 0
            r4 = r0[r1]
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r14.f6130d
            long r7 = i2.L.U0(r4, r6, r8)
            T2.v r9 = new T2.v
            r0 = r9
            r1 = r37
            r4 = r38
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x035f:
            r38 = r4
            goto L_0x0365
        L_0x0362:
            r25 = r0
            goto L_0x035f
        L_0x0365:
            long[] r0 = r14.f6134h
            int r1 = r0.length
            r4 = 1
            if (r1 != r4) goto L_0x03b0
            r1 = 0
            r4 = r0[r1]
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x03b0
            long[] r0 = r14.f6135i
            java.lang.Object r0 = i2.C2076a.e(r0)
            long[] r0 = (long[]) r0
            r4 = r0[r1]
            r6 = 0
        L_0x037f:
            int r0 = r12.length
            if (r6 >= r0) goto L_0x0396
            r0 = r12[r6]
            long r17 = r0 - r4
            r19 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r14.f6129c
            r21 = r0
            long r0 = i2.L.U0(r17, r19, r21)
            r12[r6] = r0
            int r6 = r6 + 1
            goto L_0x037f
        L_0x0396:
            long r17 = r15 - r4
            r19 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r14.f6129c
            r21 = r0
            long r7 = i2.L.U0(r17, r19, r21)
            T2.v r9 = new T2.v
            r0 = r9
            r1 = r37
            r4 = r38
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x03b0:
            int r1 = r14.f6128b
            r4 = 1
            if (r1 != r4) goto L_0x03b7
            r10 = 1
            goto L_0x03b8
        L_0x03b7:
            r10 = 0
        L_0x03b8:
            int r1 = r0.length
            int[] r1 = new int[r1]
            int r0 = r0.length
            int[] r0 = new int[r0]
            long[] r4 = r14.f6135i
            java.lang.Object r4 = i2.C2076a.e(r4)
            long[] r4 = (long[]) r4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x03ca:
            long[] r9 = r14.f6134h
            int r11 = r9.length
            if (r5 >= r11) goto L_0x042b
            r11 = r2
            r15 = r3
            r2 = r4[r5]
            r21 = -1
            int r16 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r16 == 0) goto L_0x041a
            r26 = r9[r5]
            r16 = r8
            long r8 = r14.f6129c
            r39 = r6
            r21 = r7
            long r6 = r14.f6130d
            r28 = r8
            r30 = r6
            long r6 = i2.L.U0(r26, r28, r30)
            r8 = 1
            int r9 = i2.L.g(r12, r2, r8, r8)
            r1[r5] = r9
            long r2 = r2 + r6
            r6 = 0
            int r2 = i2.L.d(r12, r2, r10, r6)
            r0[r5] = r2
        L_0x03fc:
            r2 = r1[r5]
            r3 = r0[r5]
            if (r2 >= r3) goto L_0x040c
            r7 = r13[r2]
            r7 = r7 & r8
            if (r7 != 0) goto L_0x040c
            int r2 = r2 + 1
            r1[r5] = r2
            goto L_0x03fc
        L_0x040c:
            int r7 = r3 - r2
            int r7 = r21 + r7
            r9 = r16
            if (r9 == r2) goto L_0x0416
            r2 = r8
            goto L_0x0417
        L_0x0416:
            r2 = r6
        L_0x0417:
            r2 = r39 | r2
            goto L_0x0424
        L_0x041a:
            r39 = r6
            r21 = r7
            r9 = r8
            r6 = 0
            r8 = 1
            r2 = r39
            r3 = r9
        L_0x0424:
            int r5 = r5 + 1
            r6 = r2
            r8 = r3
            r2 = r11
            r3 = r15
            goto L_0x03ca
        L_0x042b:
            r11 = r2
            r15 = r3
            r39 = r6
            r3 = r25
            r6 = 0
            r8 = 1
            if (r7 == r3) goto L_0x0436
            goto L_0x0437
        L_0x0436:
            r8 = r6
        L_0x0437:
            r2 = r39 | r8
            if (r2 == 0) goto L_0x043e
            long[] r3 = new long[r7]
            goto L_0x043f
        L_0x043e:
            r3 = r11
        L_0x043f:
            if (r2 == 0) goto L_0x0444
            int[] r4 = new int[r7]
            goto L_0x0445
        L_0x0444:
            r4 = r15
        L_0x0445:
            if (r2 == 0) goto L_0x0449
            r5 = r6
            goto L_0x044b
        L_0x0449:
            r5 = r38
        L_0x044b:
            if (r2 == 0) goto L_0x0450
            int[] r8 = new int[r7]
            goto L_0x0451
        L_0x0450:
            r8 = r13
        L_0x0451:
            long[] r7 = new long[r7]
            r39 = r5
            r38 = r15
            r9 = 0
            r15 = r6
        L_0x045a:
            long[] r5 = r14.f6134h
            int r5 = r5.length
            if (r6 >= r5) goto L_0x0504
            long[] r5 = r14.f6135i
            r16 = r5[r6]
            r5 = r1[r6]
            r18 = r1
            r1 = r0[r6]
            r27 = r0
            if (r2 == 0) goto L_0x047d
            int r0 = r1 - r5
            java.lang.System.arraycopy(r11, r5, r3, r15, r0)
            r28 = r11
            r11 = r38
            java.lang.System.arraycopy(r11, r5, r4, r15, r0)
            java.lang.System.arraycopy(r13, r5, r8, r15, r0)
            goto L_0x0481
        L_0x047d:
            r28 = r11
            r11 = r38
        L_0x0481:
            r0 = r39
        L_0x0483:
            if (r5 >= r1) goto L_0x04de
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r29 = r0
            r38 = r1
            long r0 = r14.f6130d
            r21 = r9
            r25 = r0
            long r0 = i2.L.U0(r21, r23, r25)
            r21 = r12[r5]
            long r30 = r21 - r16
            r32 = 1000000(0xf4240, double:4.940656E-318)
            r21 = r12
            r22 = r13
            long r12 = r14.f6129c
            r34 = r12
            long r12 = i2.L.U0(r30, r32, r34)
            r30 = r8
            int r8 = r14.f6128b
            boolean r8 = c(r8)
            r23 = r9
            if (r8 == 0) goto L_0x04bc
            r8 = 0
            long r12 = java.lang.Math.max(r8, r12)
            goto L_0x04be
        L_0x04bc:
            r8 = 0
        L_0x04be:
            long r0 = r0 + r12
            r7[r15] = r0
            if (r2 == 0) goto L_0x04cc
            r0 = r4[r15]
            r1 = r29
            if (r0 <= r1) goto L_0x04ce
            r0 = r11[r5]
            goto L_0x04cf
        L_0x04cc:
            r1 = r29
        L_0x04ce:
            r0 = r1
        L_0x04cf:
            int r15 = r15 + 1
            int r5 = r5 + 1
            r1 = r38
            r12 = r21
            r13 = r22
            r9 = r23
            r8 = r30
            goto L_0x0483
        L_0x04de:
            r1 = r0
            r30 = r8
            r23 = r9
            r21 = r12
            r22 = r13
            r8 = 0
            long[] r0 = r14.f6134h
            r12 = r0[r6]
            long r12 = r23 + r12
            int r6 = r6 + 1
            r39 = r1
            r38 = r11
            r9 = r12
            r1 = r18
            r12 = r21
            r13 = r22
            r0 = r27
            r11 = r28
            r8 = r30
            goto L_0x045a
        L_0x0504:
            r30 = r8
            r23 = r9
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r14.f6130d
            r21 = r23
            r23 = r0
            r25 = r5
            long r8 = i2.L.U0(r21, r23, r25)
            T2.v r10 = new T2.v
            r0 = r10
            r1 = r37
            r2 = r3
            r3 = r4
            r4 = r39
            r5 = r7
            r6 = r30
            r7 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r10
        L_0x0528:
            java.lang.String r0 = "Track has no sample table size information"
            r1 = 0
            f2.B r0 = f2.C1961B.a(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.b.w(T2.s, T2.a$a, z2.B):T2.v");
    }

    private static d x(C2073A a10, int i10, int i11, String str, C1979n nVar, boolean z10) {
        boolean z11;
        int i12;
        C2073A a11 = a10;
        int i13 = i10;
        a11.U(12);
        int q10 = a10.q();
        d dVar = new d(q10);
        for (int i14 = 0; i14 < q10; i14++) {
            int f10 = a10.f();
            int q11 = a10.q();
            if (q11 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            C2974s.a(z11, "childAtomSize must be positive");
            int q12 = a10.q();
            if (q12 == 1635148593 || q12 == 1635148595 || q12 == 1701733238 || q12 == 1831958048 || q12 == 1836070006 || q12 == 1752589105 || q12 == 1751479857 || q12 == 1932670515 || q12 == 1211250227 || q12 == 1987063864 || q12 == 1987063865 || q12 == 1635135537 || q12 == 1685479798 || q12 == 1685479729 || q12 == 1685481573 || q12 == 1685481521) {
                i12 = f10;
                E(a10, q12, i12, q11, i10, i11, nVar, dVar, i14);
            } else if (q12 == 1836069985 || q12 == 1701733217 || q12 == 1633889587 || q12 == 1700998451 || q12 == 1633889588 || q12 == 1835823201 || q12 == 1685353315 || q12 == 1685353317 || q12 == 1685353320 || q12 == 1685353324 || q12 == 1685353336 || q12 == 1935764850 || q12 == 1935767394 || q12 == 1819304813 || q12 == 1936684916 || q12 == 1953984371 || q12 == 778924082 || q12 == 778924083 || q12 == 1835557169 || q12 == 1835560241 || q12 == 1634492771 || q12 == 1634492791 || q12 == 1970037111 || q12 == 1332770163 || q12 == 1716281667) {
                i12 = f10;
                g(a10, q12, f10, q11, i10, str, z10, nVar, dVar, i14);
            } else {
                if (q12 == 1414810956 || q12 == 1954034535 || q12 == 2004251764 || q12 == 1937010800 || q12 == 1664495672) {
                    y(a10, q12, f10, q11, i10, str, dVar);
                } else if (q12 == 1835365492) {
                    q(a11, q12, f10, i13, dVar);
                } else if (q12 == 1667329389) {
                    dVar.f5995b = new s.b().Z(i13).o0("application/x-camera-motion").K();
                }
                i12 = f10;
            }
            a11.U(i12 + q11);
        }
        return dVar;
    }

    private static void y(C2073A a10, int i10, int i11, int i12, int i13, String str, d dVar) {
        a10.U(i11 + 16);
        String str2 = "application/ttml+xml";
        C4770v vVar = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = i12 - 16;
                byte[] bArr = new byte[i14];
                a10.l(bArr, 0, i14);
                vVar = C4770v.H(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else if (i10 == 1664495672) {
                dVar.f5997d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        dVar.f5995b = new s.b().Z(i13).o0(str2).e0(str).s0(j10).b0(vVar).K();
    }

    private static g z(C2073A a10) {
        int i10;
        long j10;
        long j11;
        int i11 = 8;
        a10.U(8);
        int c10 = a.c(a10.q());
        if (c10 == 0) {
            i10 = 8;
        } else {
            i10 = 16;
        }
        a10.V(i10);
        int q10 = a10.q();
        a10.V(4);
        int f10 = a10.f();
        if (c10 == 0) {
            i11 = 4;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i13 >= i11) {
                a10.V(i11);
                break;
            } else if (a10.e()[f10 + i13] != -1) {
                if (c10 == 0) {
                    j11 = a10.J();
                } else {
                    j11 = a10.M();
                }
                if (j11 != 0) {
                    j10 = j11;
                }
            } else {
                i13++;
            }
        }
        a10.V(16);
        int q11 = a10.q();
        int q12 = a10.q();
        a10.V(4);
        int q13 = a10.q();
        int q14 = a10.q();
        if (q11 == 0 && q12 == 65536 && q13 == -65536 && q14 == 0) {
            i12 = 90;
        } else if (q11 == 0 && q12 == -65536 && q13 == 65536 && q14 == 0) {
            i12 = 270;
        } else if (q11 == -65536 && q12 == 0 && q13 == 0 && q14 == -65536) {
            i12 = 180;
        }
        return new g(q10, j10, i12);
    }
}
