package y9;

import D9.a;
import android.util.Pair;
import com.google.common.collect.C4770v;
import ja.B;
import ja.C3645a;
import ja.M;
import ja.s;
import ja.w;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k9.C3717q0;
import nb.C5112g;
import o9.m;
import q9.n;
import q9.v;
import y9.C4227a;

/* renamed from: y9.b  reason: case insensitive filesystem */
abstract class C4228b {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f49889a = M.n0("OpusHead");

    /* renamed from: y9.b$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f49890a;

        /* renamed from: b  reason: collision with root package name */
        public int f49891b;

        /* renamed from: c  reason: collision with root package name */
        public int f49892c;

        /* renamed from: d  reason: collision with root package name */
        public long f49893d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f49894e;

        /* renamed from: f  reason: collision with root package name */
        private final B f49895f;

        /* renamed from: g  reason: collision with root package name */
        private final B f49896g;

        /* renamed from: h  reason: collision with root package name */
        private int f49897h;

        /* renamed from: i  reason: collision with root package name */
        private int f49898i;

        public a(B b10, B b11, boolean z10) {
            this.f49896g = b10;
            this.f49895f = b11;
            this.f49894e = z10;
            b11.P(12);
            this.f49890a = b11.H();
            b10.P(12);
            this.f49898i = b10.H();
            n.a(b10.n() != 1 ? false : true, "first_chunk must be 1");
            this.f49891b = -1;
        }

        public boolean a() {
            long j10;
            int i10;
            int i11 = this.f49891b + 1;
            this.f49891b = i11;
            if (i11 == this.f49890a) {
                return false;
            }
            if (this.f49894e) {
                j10 = this.f49895f.I();
            } else {
                j10 = this.f49895f.F();
            }
            this.f49893d = j10;
            if (this.f49891b == this.f49897h) {
                this.f49892c = this.f49896g.H();
                this.f49896g.Q(4);
                int i12 = this.f49898i - 1;
                this.f49898i = i12;
                if (i12 > 0) {
                    i10 = this.f49896g.H() - 1;
                } else {
                    i10 = -1;
                }
                this.f49897h = i10;
            }
            return true;
        }
    }

    /* renamed from: y9.b$b  reason: collision with other inner class name */
    private static final class C0756b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f49899a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f49900b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final long f49901c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final long f49902d;

        public C0756b(String str, byte[] bArr, long j10, long j11) {
            this.f49899a = str;
            this.f49900b = bArr;
            this.f49901c = j10;
            this.f49902d = j11;
        }
    }

    /* renamed from: y9.b$c */
    private interface c {
        int a();

        int b();

        int c();
    }

    /* renamed from: y9.b$d */
    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final p[] f49903a;

        /* renamed from: b  reason: collision with root package name */
        public C3717q0 f49904b;

        /* renamed from: c  reason: collision with root package name */
        public int f49905c;

        /* renamed from: d  reason: collision with root package name */
        public int f49906d = 0;

        public d(int i10) {
            this.f49903a = new p[i10];
        }
    }

    /* renamed from: y9.b$e */
    static final class e implements c {

        /* renamed from: a  reason: collision with root package name */
        private final int f49907a;

        /* renamed from: b  reason: collision with root package name */
        private final int f49908b;

        /* renamed from: c  reason: collision with root package name */
        private final B f49909c;

        public e(C4227a.b bVar, C3717q0 q0Var) {
            B b10 = bVar.f49888b;
            this.f49909c = b10;
            b10.P(12);
            int H10 = b10.H();
            if ("audio/raw".equals(q0Var.f45770l)) {
                int e02 = M.e0(q0Var.f45753A, q0Var.f45783y);
                if (H10 == 0 || H10 % e02 != 0) {
                    s.i("AtomParsers", "Audio sample size mismatch. stsd sample size: " + e02 + ", stsz sample size: " + H10);
                    H10 = e02;
                }
            }
            this.f49907a = H10 == 0 ? -1 : H10;
            this.f49908b = b10.H();
        }

        public int a() {
            int i10 = this.f49907a;
            if (i10 == -1) {
                return this.f49909c.H();
            }
            return i10;
        }

        public int b() {
            return this.f49907a;
        }

        public int c() {
            return this.f49908b;
        }
    }

    /* renamed from: y9.b$f */
    static final class f implements c {

        /* renamed from: a  reason: collision with root package name */
        private final B f49910a;

        /* renamed from: b  reason: collision with root package name */
        private final int f49911b;

        /* renamed from: c  reason: collision with root package name */
        private final int f49912c;

        /* renamed from: d  reason: collision with root package name */
        private int f49913d;

        /* renamed from: e  reason: collision with root package name */
        private int f49914e;

        public f(C4227a.b bVar) {
            B b10 = bVar.f49888b;
            this.f49910a = b10;
            b10.P(12);
            this.f49912c = b10.H() & 255;
            this.f49911b = b10.H();
        }

        public int a() {
            int i10 = this.f49912c;
            if (i10 == 8) {
                return this.f49910a.D();
            }
            if (i10 == 16) {
                return this.f49910a.J();
            }
            int i11 = this.f49913d;
            this.f49913d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f49914e & 15;
            }
            int D10 = this.f49910a.D();
            this.f49914e = D10;
            return (D10 & 240) >> 4;
        }

        public int b() {
            return -1;
        }

        public int c() {
            return this.f49911b;
        }
    }

    /* renamed from: y9.b$g */
    private static final class g {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f49915a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f49916b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final int f49917c;

        public g(int i10, long j10, int i11) {
            this.f49915a = i10;
            this.f49916b = j10;
            this.f49917c = i11;
        }
    }

    public static List A(C4227a.C0755a aVar, v vVar, long j10, m mVar, boolean z10, boolean z11, C5112g gVar) {
        C4227a.C0755a aVar2 = aVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < aVar2.f49887d.size(); i10++) {
            C4227a.C0755a aVar3 = (C4227a.C0755a) aVar2.f49887d.get(i10);
            if (aVar3.f49884a != 1953653099) {
                v vVar2 = vVar;
                C5112g gVar2 = gVar;
            } else {
                o oVar = (o) gVar.apply(z(aVar3, (C4227a.b) C3645a.e(aVar.g(1836476516)), j10, mVar, z10, z11));
                if (oVar == null) {
                    v vVar3 = vVar;
                } else {
                    v vVar4 = vVar;
                    arrayList.add(v(oVar, (C4227a.C0755a) C3645a.e(((C4227a.C0755a) C3645a.e(((C4227a.C0755a) C3645a.e(aVar3.f(1835297121))).f(1835626086))).f(1937007212)), vVar));
                }
            }
        }
        return arrayList;
    }

    public static Pair B(C4227a.b bVar) {
        B b10 = bVar.f49888b;
        b10.P(8);
        D9.a aVar = null;
        D9.a aVar2 = null;
        while (b10.a() >= 8) {
            int e10 = b10.e();
            int n10 = b10.n();
            int n11 = b10.n();
            if (n11 == 1835365473) {
                b10.P(e10);
                aVar = C(b10, e10 + n10);
            } else if (n11 == 1936553057) {
                b10.P(e10);
                aVar2 = u(b10, e10 + n10);
            }
            b10.P(e10 + n10);
        }
        return Pair.create(aVar, aVar2);
    }

    private static D9.a C(B b10, int i10) {
        b10.Q(8);
        e(b10);
        while (b10.e() < i10) {
            int e10 = b10.e();
            int n10 = b10.n();
            if (b10.n() == 1768715124) {
                b10.P(e10);
                return l(b10, e10 + n10);
            }
            b10.P(e10 + n10);
        }
        return null;
    }

    private static void D(B b10, int i10, int i11, int i12, int i13, int i14, m mVar, d dVar, int i15) {
        String str;
        m mVar2;
        byte[] bArr;
        boolean z10;
        int i16;
        int i17;
        float f10;
        byte[] bArr2;
        List list;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        String str2;
        boolean z15;
        boolean z16;
        boolean z17;
        B b11 = b10;
        int i18 = i11;
        int i19 = i12;
        m mVar3 = mVar;
        d dVar2 = dVar;
        b11.P(i18 + 16);
        b11.Q(16);
        int J10 = b10.J();
        int J11 = b10.J();
        b11.Q(50);
        int e10 = b10.e();
        int i20 = i10;
        if (i20 == 1701733238) {
            Pair s10 = s(b11, i18, i19);
            if (s10 != null) {
                i20 = ((Integer) s10.first).intValue();
                if (mVar3 == null) {
                    mVar3 = null;
                } else {
                    mVar3 = mVar3.c(((p) s10.second).f50036b);
                }
                dVar2.f49903a[i15] = (p) s10.second;
            }
            b11.P(e10);
        }
        String str3 = "video/3gpp";
        if (i20 == 1831958048) {
            str = "video/mpeg";
        } else if (i20 == 1211250227) {
            str = str3;
        } else {
            str = null;
        }
        float f11 = 1.0f;
        byte[] bArr3 = null;
        String str4 = null;
        List list2 = null;
        int i21 = -1;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        ByteBuffer byteBuffer = null;
        C0756b bVar = null;
        boolean z18 = false;
        while (true) {
            if (e10 - i18 >= i19) {
                mVar2 = mVar3;
                break;
            }
            b11.P(e10);
            int e11 = b10.e();
            String str5 = str3;
            int n10 = b10.n();
            if (n10 == 0) {
                mVar2 = mVar3;
                if (b10.e() - i18 == i19) {
                    break;
                }
            } else {
                mVar2 = mVar3;
            }
            if (n10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            n.a(z10, "childAtomSize must be positive");
            int n11 = b10.n();
            if (n11 == 1635148611) {
                if (str == null) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                n.a(z17, (String) null);
                b11.P(e11 + 8);
                ka.a b12 = ka.a.b(b10);
                list2 = b12.f45950a;
                dVar2.f49905c = b12.f45951b;
                if (!z18) {
                    f11 = b12.f45954e;
                }
                str4 = b12.f45955f;
                str2 = "video/avc";
            } else if (n11 == 1752589123) {
                if (str == null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                n.a(z16, (String) null);
                b11.P(e11 + 8);
                ka.f a10 = ka.f.a(b10);
                list2 = a10.f45979a;
                dVar2.f49905c = a10.f45980b;
                if (!z18) {
                    f11 = a10.f45983e;
                }
                str4 = a10.f45984f;
                str2 = "video/hevc";
            } else {
                if (n11 == 1685480259 || n11 == 1685485123) {
                    i16 = J11;
                    i17 = i20;
                    bArr2 = bArr3;
                    f10 = f11;
                    list = list2;
                    ka.d a11 = ka.d.a(b10);
                    if (a11 != null) {
                        str4 = a11.f45964c;
                        str = "video/dolby-vision";
                    }
                } else if (n11 == 1987076931) {
                    if (str == null) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    n.a(z15, (String) null);
                    if (i20 == 1987063864) {
                        str2 = "video/x-vnd.on2.vp8";
                    } else {
                        str2 = "video/x-vnd.on2.vp9";
                    }
                } else if (n11 == 1635135811) {
                    if (str == null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    n.a(z14, (String) null);
                    str2 = "video/av01";
                } else if (n11 == 1668050025) {
                    if (byteBuffer == null) {
                        byteBuffer = a();
                    }
                    ByteBuffer byteBuffer2 = byteBuffer;
                    byteBuffer2.position(21);
                    byteBuffer2.putShort(b10.z());
                    byteBuffer2.putShort(b10.z());
                    byteBuffer = byteBuffer2;
                    i16 = J11;
                    i17 = i20;
                    e10 += n10;
                    i18 = i11;
                    i19 = i12;
                    dVar2 = dVar;
                    str3 = str5;
                    mVar3 = mVar2;
                    i20 = i17;
                    J11 = i16;
                } else if (n11 == 1835295606) {
                    if (byteBuffer == null) {
                        byteBuffer = a();
                    }
                    ByteBuffer byteBuffer3 = byteBuffer;
                    short z19 = b10.z();
                    short z20 = b10.z();
                    short z21 = b10.z();
                    i17 = i20;
                    short z22 = b10.z();
                    short z23 = b10.z();
                    List list3 = list2;
                    short z24 = b10.z();
                    byte[] bArr4 = bArr3;
                    short z25 = b10.z();
                    float f12 = f11;
                    short z26 = b10.z();
                    long F10 = b10.F();
                    long F11 = b10.F();
                    i16 = J11;
                    byteBuffer3.position(1);
                    byteBuffer3.putShort(z23);
                    byteBuffer3.putShort(z24);
                    byteBuffer3.putShort(z19);
                    byteBuffer3.putShort(z20);
                    byteBuffer3.putShort(z21);
                    byteBuffer3.putShort(z22);
                    byteBuffer3.putShort(z25);
                    byteBuffer3.putShort(z26);
                    byteBuffer3.putShort((short) ((int) (F10 / 10000)));
                    byteBuffer3.putShort((short) ((int) (F11 / 10000)));
                    byteBuffer = byteBuffer3;
                    list2 = list3;
                    bArr3 = bArr4;
                    f11 = f12;
                    e10 += n10;
                    i18 = i11;
                    i19 = i12;
                    dVar2 = dVar;
                    str3 = str5;
                    mVar3 = mVar2;
                    i20 = i17;
                    J11 = i16;
                } else {
                    i16 = J11;
                    i17 = i20;
                    bArr2 = bArr3;
                    f10 = f11;
                    list = list2;
                    if (n11 == 1681012275) {
                        if (str == null) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        n.a(z13, (String) null);
                        str = str5;
                    } else if (n11 == 1702061171) {
                        if (str == null) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        n.a(z12, (String) null);
                        bVar = i(b11, e11);
                        String a12 = bVar.f49899a;
                        byte[] b13 = bVar.f49900b;
                        if (b13 != null) {
                            list2 = C4770v.H(b13);
                        } else {
                            list2 = list;
                        }
                        str = a12;
                        bArr3 = bArr2;
                        f11 = f10;
                        e10 += n10;
                        i18 = i11;
                        i19 = i12;
                        dVar2 = dVar;
                        str3 = str5;
                        mVar3 = mVar2;
                        i20 = i17;
                        J11 = i16;
                    } else if (n11 == 1885434736) {
                        f11 = q(b11, e11);
                        list2 = list;
                        bArr3 = bArr2;
                        z18 = true;
                        e10 += n10;
                        i18 = i11;
                        i19 = i12;
                        dVar2 = dVar;
                        str3 = str5;
                        mVar3 = mVar2;
                        i20 = i17;
                        J11 = i16;
                    } else if (n11 == 1937126244) {
                        bArr3 = r(b11, e11, n10);
                        list2 = list;
                        f11 = f10;
                        e10 += n10;
                        i18 = i11;
                        i19 = i12;
                        dVar2 = dVar;
                        str3 = str5;
                        mVar3 = mVar2;
                        i20 = i17;
                        J11 = i16;
                    } else if (n11 == 1936995172) {
                        int D10 = b10.D();
                        b11.Q(3);
                        if (D10 == 0) {
                            int D11 = b10.D();
                            if (D11 == 0) {
                                i21 = 0;
                            } else if (D11 == 1) {
                                i21 = 1;
                            } else if (D11 == 2) {
                                i21 = 2;
                            } else if (D11 == 3) {
                                i21 = 3;
                            }
                        }
                    } else if (n11 == 1668246642) {
                        int n12 = b10.n();
                        if (n12 == 1852009592 || n12 == 1852009571) {
                            int J12 = b10.J();
                            int J13 = b10.J();
                            b11.Q(2);
                            if (n10 != 19 || (b10.D() & 128) == 0) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            i22 = ka.c.b(J12);
                            if (z11) {
                                i23 = 1;
                            } else {
                                i23 = 2;
                            }
                            i24 = ka.c.c(J13);
                        } else {
                            s.i("AtomParsers", "Unsupported color type: " + C4227a.a(n12));
                        }
                    }
                }
                list2 = list;
                bArr3 = bArr2;
                f11 = f10;
                e10 += n10;
                i18 = i11;
                i19 = i12;
                dVar2 = dVar;
                str3 = str5;
                mVar3 = mVar2;
                i20 = i17;
                J11 = i16;
            }
            str = str2;
            i16 = J11;
            i17 = i20;
            e10 += n10;
            i18 = i11;
            i19 = i12;
            dVar2 = dVar;
            str3 = str5;
            mVar3 = mVar2;
            i20 = i17;
            J11 = i16;
        }
        int i25 = J11;
        byte[] bArr5 = bArr3;
        float f13 = f11;
        List list4 = list2;
        if (str != null) {
            C3717q0.b M10 = new C3717q0.b().R(i13).e0(str).I(str4).j0(J10).Q(i25).a0(f13).d0(i14).b0(bArr5).h0(i21).T(list4).M(mVar2);
            int i26 = i22;
            int i27 = i23;
            int i28 = i24;
            if (!(i26 == -1 && i27 == -1 && i28 == -1 && byteBuffer == null)) {
                if (byteBuffer != null) {
                    bArr = byteBuffer.array();
                } else {
                    bArr = null;
                }
                M10.J(new ka.c(i26, i27, i28, bArr));
            }
            if (bVar != null) {
                M10.G(com.google.common.primitives.f.m(bVar.f49901c)).Z(com.google.common.primitives.f.m(bVar.f49902d));
            }
            dVar.f49904b = M10.E();
        }
    }

    private static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean b(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        int q10 = M.q(4, 0, length);
        int q11 = M.q(jArr.length - 4, 0, length);
        if (jArr[0] > j11 || j11 >= jArr[q10] || jArr[q11] >= j12 || j12 > j10) {
            return false;
        }
        return true;
    }

    private static int c(B b10, int i10, int i11, int i12) {
        boolean z10;
        boolean z11;
        int e10 = b10.e();
        if (e10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        n.a(z10, (String) null);
        while (e10 - i11 < i12) {
            b10.P(e10);
            int n10 = b10.n();
            if (n10 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            n.a(z11, "childAtomSize must be positive");
            if (b10.n() == i10) {
                return e10;
            }
            e10 += n10;
        }
        return -1;
    }

    private static int d(int i10) {
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

    public static void e(B b10) {
        int e10 = b10.e();
        b10.Q(4);
        if (b10.n() != 1751411826) {
            e10 += 4;
        }
        b10.P(e10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:154:0x0310 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:167:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0166  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void f(ja.B r22, int r23, int r24, int r25, int r26, java.lang.String r27, boolean r28, o9.m r29, y9.C4228b.d r30, int r31) {
        /*
            r0 = r22
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r29
            r6 = r30
            int r7 = r1 + 16
            r0.P(r7)
            r7 = 6
            if (r28 == 0) goto L_0x001e
            int r9 = r22.J()
            r0.Q(r7)
            goto L_0x0024
        L_0x001e:
            r9 = 8
            r0.Q(r9)
            r9 = 0
        L_0x0024:
            r10 = 4
            r11 = 2
            r12 = 1
            r13 = 16
            if (r9 == 0) goto L_0x0048
            if (r9 != r12) goto L_0x002e
            goto L_0x0048
        L_0x002e:
            if (r9 != r11) goto L_0x0047
            r0.Q(r13)
            double r13 = r22.l()
            long r13 = java.lang.Math.round(r13)
            int r7 = (int) r13
            int r9 = r22.H()
            r13 = 20
            r0.Q(r13)
            r15 = 0
            goto L_0x0065
        L_0x0047:
            return
        L_0x0048:
            int r14 = r22.J()
            r0.Q(r7)
            int r7 = r22.E()
            int r15 = r22.e()
            int r15 = r15 - r10
            r0.P(r15)
            int r15 = r22.n()
            if (r9 != r12) goto L_0x0064
            r0.Q(r13)
        L_0x0064:
            r9 = r14
        L_0x0065:
            int r13 = r22.e()
            r14 = 1701733217(0x656e6361, float:7.0359778E22)
            r11 = r23
            if (r11 != r14) goto L_0x0097
            android.util.Pair r14 = s(r0, r1, r2)
            if (r14 == 0) goto L_0x0094
            java.lang.Object r11 = r14.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r5 != 0) goto L_0x0082
            r5 = 0
            goto L_0x008c
        L_0x0082:
            java.lang.Object r12 = r14.second
            y9.p r12 = (y9.p) r12
            java.lang.String r12 = r12.f50036b
            o9.m r5 = r5.c(r12)
        L_0x008c:
            y9.p[] r12 = r6.f49903a
            java.lang.Object r14 = r14.second
            y9.p r14 = (y9.p) r14
            r12[r31] = r14
        L_0x0094:
            r0.P(r13)
        L_0x0097:
            r12 = 1633889587(0x61632d33, float:2.6191674E20)
            r14 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r11 != r12) goto L_0x00a6
            java.lang.String r11 = "audio/ac3"
        L_0x00a1:
            r19 = r11
            r11 = -1
            goto L_0x015a
        L_0x00a6:
            r12 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r11 != r12) goto L_0x00ae
            java.lang.String r11 = "audio/eac3"
            goto L_0x00a1
        L_0x00ae:
            r12 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r11 != r12) goto L_0x00b6
            java.lang.String r11 = "audio/ac4"
            goto L_0x00a1
        L_0x00b6:
            r12 = 1685353315(0x64747363, float:1.803728E22)
            if (r11 != r12) goto L_0x00be
            java.lang.String r11 = "audio/vnd.dts"
            goto L_0x00a1
        L_0x00be:
            r12 = 1685353320(0x64747368, float:1.8037286E22)
            if (r11 == r12) goto L_0x0156
            r12 = 1685353324(0x6474736c, float:1.803729E22)
            if (r11 != r12) goto L_0x00ca
            goto L_0x0156
        L_0x00ca:
            r12 = 1685353317(0x64747365, float:1.8037282E22)
            if (r11 != r12) goto L_0x00d2
            java.lang.String r11 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x00a1
        L_0x00d2:
            r12 = 1685353336(0x64747378, float:1.8037304E22)
            if (r11 != r12) goto L_0x00da
            java.lang.String r11 = "audio/vnd.dts.uhd;profile=p2"
            goto L_0x00a1
        L_0x00da:
            r12 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r11 != r12) goto L_0x00e2
            java.lang.String r11 = "audio/3gpp"
            goto L_0x00a1
        L_0x00e2:
            r12 = 1935767394(0x73617762, float:1.7863284E31)
            if (r11 != r12) goto L_0x00ea
            java.lang.String r11 = "audio/amr-wb"
            goto L_0x00a1
        L_0x00ea:
            r12 = 1819304813(0x6c70636d, float:1.1624469E27)
            java.lang.String r19 = "audio/raw"
            if (r11 == r12) goto L_0x0154
            r12 = 1936684916(0x736f7774, float:1.89725E31)
            if (r11 != r12) goto L_0x00f7
            goto L_0x0154
        L_0x00f7:
            r12 = 1953984371(0x74776f73, float:7.841539E31)
            if (r11 != r12) goto L_0x00ff
            r11 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x015a
        L_0x00ff:
            r12 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r11 == r12) goto L_0x0150
            r12 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r11 != r12) goto L_0x010a
            goto L_0x0150
        L_0x010a:
            r12 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r11 != r12) goto L_0x0112
            java.lang.String r11 = "audio/mha1"
            goto L_0x00a1
        L_0x0112:
            r12 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r11 != r12) goto L_0x011a
            java.lang.String r11 = "audio/mhm1"
            goto L_0x00a1
        L_0x011a:
            if (r11 != r14) goto L_0x011f
            java.lang.String r11 = "audio/alac"
            goto L_0x00a1
        L_0x011f:
            r12 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r11 != r12) goto L_0x0128
            java.lang.String r11 = "audio/g711-alaw"
            goto L_0x00a1
        L_0x0128:
            r12 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r11 != r12) goto L_0x0131
            java.lang.String r11 = "audio/g711-mlaw"
            goto L_0x00a1
        L_0x0131:
            r12 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r11 != r12) goto L_0x013a
            java.lang.String r11 = "audio/opus"
            goto L_0x00a1
        L_0x013a:
            r12 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r11 != r12) goto L_0x0143
            java.lang.String r11 = "audio/flac"
            goto L_0x00a1
        L_0x0143:
            r12 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r11 != r12) goto L_0x014c
            java.lang.String r11 = "audio/true-hd"
            goto L_0x00a1
        L_0x014c:
            r11 = -1
            r19 = 0
            goto L_0x015a
        L_0x0150:
            java.lang.String r11 = "audio/mpeg"
            goto L_0x00a1
        L_0x0154:
            r11 = 2
            goto L_0x015a
        L_0x0156:
            java.lang.String r11 = "audio/vnd.dts.hd"
            goto L_0x00a1
        L_0x015a:
            r12 = r19
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x0162:
            int r10 = r13 - r1
            if (r10 >= r2) goto L_0x030c
            r0.P(r13)
            int r10 = r22.n()
            if (r10 <= 0) goto L_0x0171
            r14 = 1
            goto L_0x0172
        L_0x0171:
            r14 = 0
        L_0x0172:
            java.lang.String r8 = "childAtomSize must be positive"
            q9.n.a(r14, r8)
            int r8 = r22.n()
            r14 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r8 != r14) goto L_0x019c
            int r8 = r10 + -13
            byte[] r14 = new byte[r8]
            int r1 = r13 + 13
            r0.P(r1)
            r1 = 0
            r0.j(r14, r1, r8)
            com.google.common.collect.v r21 = com.google.common.collect.C4770v.H(r14)
        L_0x0191:
            r8 = -1
        L_0x0192:
            r14 = 1
            r16 = 0
            r17 = 2
        L_0x0197:
            r18 = 1634492771(0x616c6163, float:2.7252807E20)
            goto L_0x0303
        L_0x019c:
            r1 = 1702061171(0x65736473, float:7.183675E22)
            if (r8 == r1) goto L_0x01a8
            if (r28 == 0) goto L_0x01b3
            r14 = 2002876005(0x77617665, float:4.5729223E33)
            if (r8 != r14) goto L_0x01b3
        L_0x01a8:
            r2 = 4
            r14 = 1
            r16 = 0
            r17 = 2
            r18 = 1634492771(0x616c6163, float:2.7252807E20)
            goto L_0x02d1
        L_0x01b3:
            r1 = 1684103987(0x64616333, float:1.6630662E22)
            if (r8 != r1) goto L_0x01cf
            int r1 = r13 + 8
            r0.P(r1)
            java.lang.String r1 = java.lang.Integer.toString(r26)
            k9.q0 r1 = m9.C3844b.c(r0, r1, r4, r5)
            r6.f49904b = r1
        L_0x01c7:
            r2 = 4
            r14 = 1
            r16 = 0
            r17 = 2
            goto L_0x02ce
        L_0x01cf:
            r1 = 1684366131(0x64656333, float:1.692581E22)
            if (r8 != r1) goto L_0x01e4
            int r1 = r13 + 8
            r0.P(r1)
            java.lang.String r1 = java.lang.Integer.toString(r26)
            k9.q0 r1 = m9.C3844b.g(r0, r1, r4, r5)
            r6.f49904b = r1
            goto L_0x01c7
        L_0x01e4:
            r1 = 1684103988(0x64616334, float:1.6630663E22)
            if (r8 != r1) goto L_0x01f9
            int r1 = r13 + 8
            r0.P(r1)
            java.lang.String r1 = java.lang.Integer.toString(r26)
            k9.q0 r1 = m9.C3845c.b(r0, r1, r4, r5)
            r6.f49904b = r1
            goto L_0x01c7
        L_0x01f9:
            r1 = 1684892784(0x646d6c70, float:1.7518768E22)
            if (r8 != r1) goto L_0x021b
            if (r15 <= 0) goto L_0x0204
            r7 = r15
            r8 = -1
            r9 = 2
            goto L_0x0192
        L_0x0204:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid sample rate for Dolby TrueHD MLP stream: "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r14 = 0
            k9.L0 r0 = k9.L0.a(r0, r14)
            throw r0
        L_0x021b:
            r14 = 0
            r1 = 1684305011(0x64647473, float:1.6856995E22)
            if (r8 != r1) goto L_0x0245
            k9.q0$b r1 = new k9.q0$b
            r1.<init>()
            k9.q0$b r1 = r1.R(r3)
            k9.q0$b r1 = r1.e0(r12)
            k9.q0$b r1 = r1.H(r9)
            k9.q0$b r1 = r1.f0(r7)
            k9.q0$b r1 = r1.M(r5)
            k9.q0$b r1 = r1.V(r4)
            k9.q0 r1 = r1.E()
            r6.f49904b = r1
            goto L_0x01c7
        L_0x0245:
            r1 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r8 != r1) goto L_0x0263
            int r1 = r10 + -8
            byte[] r8 = f49889a
            int r14 = r8.length
            int r14 = r14 + r1
            byte[] r14 = java.util.Arrays.copyOf(r8, r14)
            int r2 = r13 + 8
            r0.P(r2)
            int r2 = r8.length
            r0.j(r14, r2, r1)
            java.util.List r21 = m9.E.a(r14)
            goto L_0x0191
        L_0x0263:
            r1 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r8 != r1) goto L_0x0295
            int r1 = r10 + -12
            int r2 = r10 + -8
            byte[] r2 = new byte[r2]
            r8 = 102(0x66, float:1.43E-43)
            r14 = 0
            r2[r14] = r8
            r8 = 76
            r14 = 1
            r2[r14] = r8
            r8 = 97
            r17 = 2
            r2[r17] = r8
            r8 = 3
            r18 = 67
            r2[r8] = r18
            int r8 = r13 + 12
            r0.P(r8)
            r8 = 4
            r0.j(r2, r8, r1)
            com.google.common.collect.v r21 = com.google.common.collect.C4770v.H(r2)
            r8 = -1
            r16 = 0
            goto L_0x0197
        L_0x0295:
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            r2 = 4
            r14 = 1
            r17 = 2
            if (r8 != r1) goto L_0x02cc
            int r7 = r10 + -12
            byte[] r8 = new byte[r7]
            int r9 = r13 + 12
            r0.P(r9)
            r9 = 0
            r0.j(r8, r9, r7)
            android.util.Pair r7 = ja.C3649e.g(r8)
            java.lang.Object r1 = r7.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Object r7 = r7.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            com.google.common.collect.v r21 = com.google.common.collect.C4770v.H(r8)
            r16 = r9
            r8 = -1
            r18 = 1634492771(0x616c6163, float:2.7252807E20)
            r9 = r7
            r7 = r1
            goto L_0x0303
        L_0x02cc:
            r16 = 0
        L_0x02ce:
            r8 = -1
            goto L_0x0197
        L_0x02d1:
            if (r8 != r1) goto L_0x02d6
            r1 = r13
        L_0x02d4:
            r8 = -1
            goto L_0x02db
        L_0x02d6:
            int r1 = c(r0, r1, r13, r10)
            goto L_0x02d4
        L_0x02db:
            if (r1 == r8) goto L_0x0303
            y9.b$b r19 = i(r0, r1)
            java.lang.String r12 = r19.f49899a
            byte[] r1 = r19.f49900b
            if (r1 == 0) goto L_0x0303
            java.lang.String r2 = "audio/mp4a-latm"
            boolean r2 = r2.equals(r12)
            if (r2 == 0) goto L_0x02ff
            m9.a$b r2 = m9.C3843a.f(r1)
            int r7 = r2.f46610a
            int r9 = r2.f46611b
            java.lang.String r2 = r2.f46612c
            r20 = r2
        L_0x02ff:
            com.google.common.collect.v r21 = com.google.common.collect.C4770v.H(r1)
        L_0x0303:
            int r13 = r13 + r10
            r1 = r24
            r2 = r25
            r14 = r18
            goto L_0x0162
        L_0x030c:
            k9.q0 r0 = r6.f49904b
            if (r0 != 0) goto L_0x035e
            if (r12 == 0) goto L_0x035e
            k9.q0$b r0 = new k9.q0$b
            r0.<init>()
            k9.q0$b r0 = r0.R(r3)
            k9.q0$b r0 = r0.e0(r12)
            r1 = r20
            k9.q0$b r0 = r0.I(r1)
            k9.q0$b r0 = r0.H(r9)
            k9.q0$b r0 = r0.f0(r7)
            k9.q0$b r0 = r0.Y(r11)
            r1 = r21
            k9.q0$b r0 = r0.T(r1)
            k9.q0$b r0 = r0.M(r5)
            k9.q0$b r0 = r0.V(r4)
            if (r19 == 0) goto L_0x0358
            long r1 = r19.f49901c
            int r1 = com.google.common.primitives.f.m(r1)
            k9.q0$b r1 = r0.G(r1)
            long r2 = r19.f49902d
            int r2 = com.google.common.primitives.f.m(r2)
            r1.Z(r2)
        L_0x0358:
            k9.q0 r0 = r0.E()
            r6.f49904b = r0
        L_0x035e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.C4228b.f(ja.B, int, int, int, int, java.lang.String, boolean, o9.m, y9.b$d, int):void");
    }

    static Pair g(B b10, int i10, int i11) {
        boolean z10;
        boolean z11;
        int i12 = i10 + 8;
        boolean z12 = false;
        int i13 = -1;
        int i14 = 0;
        String str = null;
        Integer num = null;
        while (i12 - i10 < i11) {
            b10.P(i12);
            int n10 = b10.n();
            int n11 = b10.n();
            if (n11 == 1718775137) {
                num = Integer.valueOf(b10.n());
            } else if (n11 == 1935894637) {
                b10.Q(4);
                str = b10.A(4);
            } else if (n11 == 1935894633) {
                i13 = i12;
                i14 = n10;
            }
            i12 += n10;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        if (num != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        n.a(z10, "frma atom is mandatory");
        if (i13 != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        n.a(z11, "schi atom is mandatory");
        p t10 = t(b10, i13, i14, str);
        if (t10 != null) {
            z12 = true;
        }
        n.a(z12, "tenc atom is mandatory");
        return Pair.create(num, (p) M.j(t10));
    }

    private static Pair h(C4227a.C0755a aVar) {
        long j10;
        long j11;
        C4227a.b g10 = aVar.g(1701606260);
        if (g10 == null) {
            return null;
        }
        B b10 = g10.f49888b;
        b10.P(8);
        int c10 = C4227a.c(b10.n());
        int H10 = b10.H();
        long[] jArr = new long[H10];
        long[] jArr2 = new long[H10];
        int i10 = 0;
        while (i10 < H10) {
            if (c10 == 1) {
                j10 = b10.I();
            } else {
                j10 = b10.F();
            }
            jArr[i10] = j10;
            if (c10 == 1) {
                j11 = b10.w();
            } else {
                j11 = (long) b10.n();
            }
            jArr2[i10] = j11;
            if (b10.z() == 1) {
                b10.Q(2);
                i10++;
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static C0756b i(B b10, int i10) {
        long j10;
        long j11;
        b10.P(i10 + 12);
        b10.Q(1);
        j(b10);
        b10.Q(2);
        int D10 = b10.D();
        if ((D10 & 128) != 0) {
            b10.Q(2);
        }
        if ((D10 & 64) != 0) {
            b10.Q(b10.D());
        }
        if ((D10 & 32) != 0) {
            b10.Q(2);
        }
        b10.Q(1);
        j(b10);
        String h10 = w.h(b10.D());
        if ("audio/mpeg".equals(h10) || "audio/vnd.dts".equals(h10) || "audio/vnd.dts.hd".equals(h10)) {
            return new C0756b(h10, (byte[]) null, -1, -1);
        }
        b10.Q(4);
        long F10 = b10.F();
        long F11 = b10.F();
        b10.Q(1);
        int j12 = j(b10);
        byte[] bArr = new byte[j12];
        b10.j(bArr, 0, j12);
        if (F11 > 0) {
            j10 = F11;
        } else {
            j10 = -1;
        }
        if (F10 > 0) {
            j11 = F10;
        } else {
            j11 = -1;
        }
        return new C0756b(h10, bArr, j10, j11);
    }

    private static int j(B b10) {
        int D10 = b10.D();
        int i10 = D10 & 127;
        while ((D10 & 128) == 128) {
            D10 = b10.D();
            i10 = (i10 << 7) | (D10 & 127);
        }
        return i10;
    }

    private static int k(B b10) {
        b10.P(16);
        return b10.n();
    }

    private static D9.a l(B b10, int i10) {
        b10.Q(8);
        ArrayList arrayList = new ArrayList();
        while (b10.e() < i10) {
            a.b c10 = h.c(b10);
            if (c10 != null) {
                arrayList.add(c10);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new D9.a((List) arrayList);
    }

    private static Pair m(B b10) {
        int i10;
        int i11 = 8;
        b10.P(8);
        int c10 = C4227a.c(b10.n());
        if (c10 == 0) {
            i10 = 8;
        } else {
            i10 = 16;
        }
        b10.Q(i10);
        long F10 = b10.F();
        if (c10 == 0) {
            i11 = 4;
        }
        b10.Q(i11);
        int J10 = b10.J();
        return Pair.create(Long.valueOf(F10), "" + ((char) (((J10 >> 10) & 31) + 96)) + ((char) (((J10 >> 5) & 31) + 96)) + ((char) ((J10 & 31) + 96)));
    }

    public static D9.a n(C4227a.C0755a aVar) {
        C4227a.b g10 = aVar.g(1751411826);
        C4227a.b g11 = aVar.g(1801812339);
        C4227a.b g12 = aVar.g(1768715124);
        if (g10 == null || g11 == null || g12 == null || k(g10.f49888b) != 1835299937) {
            return null;
        }
        B b10 = g11.f49888b;
        b10.P(12);
        int n10 = b10.n();
        String[] strArr = new String[n10];
        for (int i10 = 0; i10 < n10; i10++) {
            int n11 = b10.n();
            b10.Q(4);
            strArr[i10] = b10.A(n11 - 8);
        }
        B b11 = g12.f49888b;
        b11.P(8);
        ArrayList arrayList = new ArrayList();
        while (b11.a() > 8) {
            int e10 = b11.e();
            int n12 = b11.n();
            int n13 = b11.n() - 1;
            if (n13 < 0 || n13 >= n10) {
                s.i("AtomParsers", "Skipped metadata with unknown key index: " + n13);
            } else {
                J9.a f10 = h.f(b11, e10 + n12, strArr[n13]);
                if (f10 != null) {
                    arrayList.add(f10);
                }
            }
            b11.P(e10 + n12);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new D9.a((List) arrayList);
    }

    private static void o(B b10, int i10, int i11, int i12, d dVar) {
        b10.P(i11 + 16);
        if (i10 == 1835365492) {
            b10.x();
            String x10 = b10.x();
            if (x10 != null) {
                dVar.f49904b = new C3717q0.b().R(i12).e0(x10).E();
            }
        }
    }

    private static long p(B b10) {
        int i10 = 8;
        b10.P(8);
        if (C4227a.c(b10.n()) != 0) {
            i10 = 16;
        }
        b10.Q(i10);
        return b10.F();
    }

    private static float q(B b10, int i10) {
        b10.P(i10 + 8);
        return ((float) b10.H()) / ((float) b10.H());
    }

    private static byte[] r(B b10, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            b10.P(i12);
            int n10 = b10.n();
            if (b10.n() == 1886547818) {
                return Arrays.copyOfRange(b10.d(), i12, n10 + i12);
            }
            i12 += n10;
        }
        return null;
    }

    private static Pair s(B b10, int i10, int i11) {
        boolean z10;
        Pair g10;
        int e10 = b10.e();
        while (e10 - i10 < i11) {
            b10.P(e10);
            int n10 = b10.n();
            if (n10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            n.a(z10, "childAtomSize must be positive");
            if (b10.n() == 1936289382 && (g10 = g(b10, e10, n10)) != null) {
                return g10;
            }
            e10 += n10;
        }
        return null;
    }

    private static p t(B b10, int i10, int i11, String str) {
        int i12;
        int i13;
        boolean z10;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            b10.P(i14);
            int n10 = b10.n();
            if (b10.n() == 1952804451) {
                int c10 = C4227a.c(b10.n());
                b10.Q(1);
                if (c10 == 0) {
                    b10.Q(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int D10 = b10.D();
                    i12 = D10 & 15;
                    i13 = (D10 & 240) >> 4;
                }
                if (b10.D() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int D11 = b10.D();
                byte[] bArr2 = new byte[16];
                b10.j(bArr2, 0, 16);
                if (z10 && D11 == 0) {
                    int D12 = b10.D();
                    bArr = new byte[D12];
                    b10.j(bArr, 0, D12);
                }
                return new p(z10, str, D11, bArr2, i13, i12, bArr);
            }
            i14 += n10;
        }
    }

    private static D9.a u(B b10, int i10) {
        float f10;
        b10.Q(12);
        while (b10.e() < i10) {
            int e10 = b10.e();
            int n10 = b10.n();
            if (b10.n() != 1935766900) {
                b10.P(e10 + n10);
            } else if (n10 < 14) {
                return null;
            } else {
                b10.Q(5);
                int D10 = b10.D();
                if (D10 != 12 && D10 != 13) {
                    return null;
                }
                if (D10 == 12) {
                    f10 = 240.0f;
                } else {
                    f10 = 120.0f;
                }
                b10.Q(1);
                return new D9.a(new J9.e(f10, b10.D()));
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static y9.r v(y9.o r38, y9.C4227a.C0755a r39, q9.v r40) {
        /*
            r1 = r38
            r0 = r39
            r2 = r40
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            y9.a$b r3 = r0.g(r3)
            if (r3 == 0) goto L_0x0017
            y9.b$e r5 = new y9.b$e
            k9.q0 r6 = r1.f50029f
            r5.<init>(r3, r6)
            goto L_0x0025
        L_0x0017:
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            y9.a$b r3 = r0.g(r3)
            if (r3 == 0) goto L_0x0519
            y9.b$f r5 = new y9.b$f
            r5.<init>(r3)
        L_0x0025:
            int r3 = r5.c()
            r6 = 0
            if (r3 != 0) goto L_0x0040
            y9.r r9 = new y9.r
            long[] r2 = new long[r6]
            int[] r3 = new int[r6]
            long[] r5 = new long[r6]
            int[] r6 = new int[r6]
            r7 = 0
            r4 = 0
            r0 = r9
            r1 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0040:
            r7 = 1937007471(0x7374636f, float:1.9362445E31)
            y9.a$b r7 = r0.g(r7)
            r8 = 1
            if (r7 != 0) goto L_0x0059
            r7 = 1668232756(0x636f3634, float:4.4126776E21)
            y9.a$b r7 = r0.g(r7)
            java.lang.Object r7 = ja.C3645a.e(r7)
            y9.a$b r7 = (y9.C4227a.b) r7
            r9 = r8
            goto L_0x005a
        L_0x0059:
            r9 = r6
        L_0x005a:
            ja.B r7 = r7.f49888b
            r10 = 1937011555(0x73747363, float:1.9367382E31)
            y9.a$b r10 = r0.g(r10)
            java.lang.Object r10 = ja.C3645a.e(r10)
            y9.a$b r10 = (y9.C4227a.b) r10
            ja.B r10 = r10.f49888b
            r11 = 1937011827(0x73747473, float:1.9367711E31)
            y9.a$b r11 = r0.g(r11)
            java.lang.Object r11 = ja.C3645a.e(r11)
            y9.a$b r11 = (y9.C4227a.b) r11
            ja.B r11 = r11.f49888b
            r12 = 1937011571(0x73747373, float:1.9367401E31)
            y9.a$b r12 = r0.g(r12)
            if (r12 == 0) goto L_0x0086
            ja.B r12 = r12.f49888b
            goto L_0x0087
        L_0x0086:
            r12 = 0
        L_0x0087:
            r13 = 1668576371(0x63747473, float:4.5093966E21)
            y9.a$b r0 = r0.g(r13)
            if (r0 == 0) goto L_0x0093
            ja.B r0 = r0.f49888b
            goto L_0x0094
        L_0x0093:
            r0 = 0
        L_0x0094:
            y9.b$a r13 = new y9.b$a
            r13.<init>(r10, r7, r9)
            r7 = 12
            r11.P(r7)
            int r9 = r11.H()
            int r9 = r9 - r8
            int r10 = r11.H()
            int r14 = r11.H()
            if (r0 == 0) goto L_0x00b5
            r0.P(r7)
            int r15 = r0.H()
            goto L_0x00b6
        L_0x00b5:
            r15 = r6
        L_0x00b6:
            r4 = -1
            if (r12 == 0) goto L_0x00cd
            r12.P(r7)
            int r7 = r12.H()
            if (r7 <= 0) goto L_0x00c9
            int r16 = r12.H()
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
            k9.q0 r8 = r1.f50029f
            java.lang.String r8 = r8.f45770l
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
            r39 = r7
            r4 = 1
            goto L_0x00ff
        L_0x00fc:
            r39 = r7
            r4 = 0
        L_0x00ff:
            if (r4 == 0) goto L_0x0133
            int r0 = r13.f49890a
            long[] r4 = new long[r0]
            int[] r0 = new int[r0]
        L_0x0107:
            boolean r5 = r13.a()
            if (r5 == 0) goto L_0x0118
            int r5 = r13.f49891b
            long r9 = r13.f49893d
            r4[r5] = r9
            int r9 = r13.f49892c
            r0[r5] = r9
            goto L_0x0107
        L_0x0118:
            long r9 = (long) r14
            y9.d$b r0 = y9.d.a(r6, r4, r0, r9)
            long[] r4 = r0.f49922a
            int[] r5 = r0.f49923b
            int r6 = r0.f49924c
            long[] r9 = r0.f49925d
            int[] r10 = r0.f49926e
            long r11 = r0.f49927f
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
            r37 = r9
            r9 = r39
        L_0x0153:
            r39 = r37
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
            long r14 = r13.f49893d
            r32 = r3
            int r3 = r13.f49892c
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
            ja.s.i(r10, r2)
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
            int r23 = r0.H()
            int r22 = r0.n()
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
            java.lang.Object r2 = ja.C3645a.e(r12)
            ja.B r2 = (ja.B) r2
            int r2 = r2.H()
            int r2 = r2 - r10
        L_0x01e0:
            r15 = r2
            r10 = r3
            r14 = r31
            long r2 = (long) r14
            long r25 = r25 + r2
            int r2 = r30 + -1
            if (r2 != 0) goto L_0x01fa
            if (r39 <= 0) goto L_0x01fa
            int r2 = r24.H()
            int r3 = r24.n()
            int r14 = r39 + -1
        L_0x01f7:
            r39 = r2
            goto L_0x01fe
        L_0x01fa:
            r3 = r14
            r14 = r39
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
            r37 = r14
            r14 = r39
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
            int r2 = r0.H()
            if (r2 == 0) goto L_0x0231
            r0 = 0
            goto L_0x0238
        L_0x0231:
            r0.n()
            int r16 = r16 + -1
            goto L_0x0227
        L_0x0237:
            r0 = 1
        L_0x0238:
            if (r9 != 0) goto L_0x024a
            if (r30 != 0) goto L_0x024a
            if (r1 != 0) goto L_0x024a
            if (r39 != 0) goto L_0x024a
            r2 = r23
            if (r2 != 0) goto L_0x024c
            if (r0 != 0) goto L_0x0247
            goto L_0x024c
        L_0x0247:
            r14 = r38
            goto L_0x029a
        L_0x024a:
            r2 = r23
        L_0x024c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r14 = "Inconsistent stbl box for track "
            r5.append(r14)
            r14 = r38
            int r15 = r14.f50024a
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
            r9 = r39
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
            ja.s.i(r10, r0)
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
            long r9 = r14.f50026c
            r5 = r15
            long r7 = ja.M.O0(r5, r7, r9)
            long[] r1 = r14.f50031h
            r10 = 1000000(0xf4240, double:4.940656E-318)
            if (r1 != 0) goto L_0x02c2
            long r0 = r14.f50026c
            ja.M.Q0(r12, r10, r0)
            y9.r r9 = new y9.r
            r0 = r9
            r1 = r38
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x02c2:
            int r1 = r1.length
            r5 = 1
            if (r1 != r5) goto L_0x0362
            int r1 = r14.f50025b
            if (r1 != r5) goto L_0x0362
            int r1 = r12.length
            r5 = 2
            if (r1 < r5) goto L_0x0362
            long[] r1 = r14.f50032i
            java.lang.Object r1 = ja.C3645a.e(r1)
            long[] r1 = (long[]) r1
            r5 = 0
            r21 = r1[r5]
            long[] r1 = r14.f50031h
            r23 = r1[r5]
            long r5 = r14.f50026c
            long r7 = r14.f50027d
            r25 = r5
            r27 = r7
            long r5 = ja.M.O0(r23, r25, r27)
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
            k9.q0 r5 = r14.f50029f
            int r5 = r5.f45784z
            long r8 = (long) r5
            long r10 = r14.f50026c
            r28 = r8
            r30 = r10
            long r10 = ja.M.O0(r26, r28, r30)
            k9.q0 r5 = r14.f50029f
            int r5 = r5.f45784z
            long r8 = (long) r5
            long r0 = r14.f50026c
            r39 = r4
            r4 = r10
            r10 = r0
            long r0 = ja.M.O0(r6, r8, r10)
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
            r5 = r40
            r5.f47912a = r4
            int r0 = (int) r0
            r5.f47913b = r0
            long r0 = r14.f50026c
            r4 = 1000000(0xf4240, double:4.940656E-318)
            ja.M.Q0(r12, r4, r0)
            long[] r0 = r14.f50031h
            r1 = 0
            r4 = r0[r1]
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r14.f50027d
            long r7 = ja.M.O0(r4, r6, r8)
            y9.r r9 = new y9.r
            r0 = r9
            r1 = r38
            r4 = r39
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x035f:
            r39 = r4
            goto L_0x0365
        L_0x0362:
            r25 = r0
            goto L_0x035f
        L_0x0365:
            long[] r0 = r14.f50031h
            int r1 = r0.length
            r4 = 1
            if (r1 != r4) goto L_0x03b0
            r1 = 0
            r4 = r0[r1]
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x03b0
            long[] r0 = r14.f50032i
            java.lang.Object r0 = ja.C3645a.e(r0)
            long[] r0 = (long[]) r0
            r4 = r0[r1]
            r6 = 0
        L_0x037f:
            int r0 = r12.length
            if (r6 >= r0) goto L_0x0396
            r0 = r12[r6]
            long r17 = r0 - r4
            r19 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r14.f50026c
            r21 = r0
            long r0 = ja.M.O0(r17, r19, r21)
            r12[r6] = r0
            int r6 = r6 + 1
            goto L_0x037f
        L_0x0396:
            long r17 = r15 - r4
            r19 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r14.f50026c
            r21 = r0
            long r7 = ja.M.O0(r17, r19, r21)
            y9.r r9 = new y9.r
            r0 = r9
            r1 = r38
            r4 = r39
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x03b0:
            int r1 = r14.f50025b
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
            long[] r4 = r14.f50032i
            java.lang.Object r4 = ja.C3645a.e(r4)
            long[] r4 = (long[]) r4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x03ca:
            long[] r9 = r14.f50031h
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
            long r8 = r14.f50026c
            r40 = r6
            r21 = r7
            long r6 = r14.f50027d
            r28 = r8
            r30 = r6
            long r6 = ja.M.O0(r26, r28, r30)
            r8 = 1
            int r9 = ja.M.i(r12, r2, r8, r8)
            r1[r5] = r9
            long r2 = r2 + r6
            r6 = 0
            int r2 = ja.M.e(r12, r2, r10, r6)
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
            r2 = r40 | r2
            goto L_0x0424
        L_0x041a:
            r40 = r6
            r21 = r7
            r9 = r8
            r6 = 0
            r8 = 1
            r2 = r40
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
            r40 = r6
            r3 = r25
            r6 = 0
            r8 = 1
            if (r7 == r3) goto L_0x0436
            goto L_0x0437
        L_0x0436:
            r8 = r6
        L_0x0437:
            r2 = r40 | r8
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
            r5 = r39
        L_0x044b:
            if (r2 == 0) goto L_0x0450
            int[] r8 = new int[r7]
            goto L_0x0451
        L_0x0450:
            r8 = r13
        L_0x0451:
            long[] r7 = new long[r7]
            r40 = r5
            r39 = r15
            r9 = 0
            r15 = r6
        L_0x045a:
            long[] r5 = r14.f50031h
            int r5 = r5.length
            if (r6 >= r5) goto L_0x04f9
            long[] r5 = r14.f50032i
            r16 = r5[r6]
            r5 = r1[r6]
            r18 = r1
            r1 = r0[r6]
            r27 = r0
            if (r2 == 0) goto L_0x047d
            int r0 = r1 - r5
            java.lang.System.arraycopy(r11, r5, r3, r15, r0)
            r28 = r11
            r11 = r39
            java.lang.System.arraycopy(r11, r5, r4, r15, r0)
            java.lang.System.arraycopy(r13, r5, r8, r15, r0)
            goto L_0x0481
        L_0x047d:
            r28 = r11
            r11 = r39
        L_0x0481:
            r0 = r40
        L_0x0483:
            if (r5 >= r1) goto L_0x04d3
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r29 = r0
            r39 = r1
            long r0 = r14.f50027d
            r21 = r9
            r25 = r0
            long r0 = ja.M.O0(r21, r23, r25)
            r21 = r12[r5]
            r23 = r12
            r24 = r13
            long r12 = r21 - r16
            r30 = r8
            r21 = r9
            r8 = 0
            long r31 = java.lang.Math.max(r8, r12)
            r33 = 1000000(0xf4240, double:4.940656E-318)
            long r12 = r14.f50026c
            r35 = r12
            long r12 = ja.M.O0(r31, r33, r35)
            long r0 = r0 + r12
            r7[r15] = r0
            if (r2 == 0) goto L_0x04c1
            r0 = r4[r15]
            r1 = r29
            if (r0 <= r1) goto L_0x04c3
            r0 = r11[r5]
            goto L_0x04c4
        L_0x04c1:
            r1 = r29
        L_0x04c3:
            r0 = r1
        L_0x04c4:
            int r15 = r15 + 1
            int r5 = r5 + 1
            r1 = r39
            r9 = r21
            r12 = r23
            r13 = r24
            r8 = r30
            goto L_0x0483
        L_0x04d3:
            r1 = r0
            r30 = r8
            r21 = r9
            r23 = r12
            r24 = r13
            r8 = 0
            long[] r0 = r14.f50031h
            r12 = r0[r6]
            long r12 = r21 + r12
            int r6 = r6 + 1
            r40 = r1
            r39 = r11
            r9 = r12
            r1 = r18
            r12 = r23
            r13 = r24
            r0 = r27
            r11 = r28
            r8 = r30
            goto L_0x045a
        L_0x04f9:
            r30 = r8
            r21 = r9
            r23 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r14.f50027d
            r25 = r0
            long r8 = ja.M.O0(r21, r23, r25)
            y9.r r10 = new y9.r
            r0 = r10
            r1 = r38
            r2 = r3
            r3 = r4
            r4 = r40
            r5 = r7
            r6 = r30
            r7 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r10
        L_0x0519:
            java.lang.String r0 = "Track has no sample table size information"
            r1 = 0
            k9.L0 r0 = k9.L0.a(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.C4228b.v(y9.o, y9.a$a, q9.v):y9.r");
    }

    private static d w(B b10, int i10, int i11, String str, m mVar, boolean z10) {
        boolean z11;
        int i12;
        B b11 = b10;
        int i13 = i10;
        b11.P(12);
        int n10 = b10.n();
        d dVar = new d(n10);
        for (int i14 = 0; i14 < n10; i14++) {
            int e10 = b10.e();
            int n11 = b10.n();
            if (n11 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            n.a(z11, "childAtomSize must be positive");
            int n12 = b10.n();
            if (n12 == 1635148593 || n12 == 1635148595 || n12 == 1701733238 || n12 == 1831958048 || n12 == 1836070006 || n12 == 1752589105 || n12 == 1751479857 || n12 == 1932670515 || n12 == 1211250227 || n12 == 1987063864 || n12 == 1987063865 || n12 == 1635135537 || n12 == 1685479798 || n12 == 1685479729 || n12 == 1685481573 || n12 == 1685481521) {
                i12 = e10;
                D(b10, n12, i12, n11, i10, i11, mVar, dVar, i14);
            } else if (n12 == 1836069985 || n12 == 1701733217 || n12 == 1633889587 || n12 == 1700998451 || n12 == 1633889588 || n12 == 1835823201 || n12 == 1685353315 || n12 == 1685353317 || n12 == 1685353320 || n12 == 1685353324 || n12 == 1685353336 || n12 == 1935764850 || n12 == 1935767394 || n12 == 1819304813 || n12 == 1936684916 || n12 == 1953984371 || n12 == 778924082 || n12 == 778924083 || n12 == 1835557169 || n12 == 1835560241 || n12 == 1634492771 || n12 == 1634492791 || n12 == 1970037111 || n12 == 1332770163 || n12 == 1716281667) {
                i12 = e10;
                f(b10, n12, e10, n11, i10, str, z10, mVar, dVar, i14);
            } else {
                if (n12 == 1414810956 || n12 == 1954034535 || n12 == 2004251764 || n12 == 1937010800 || n12 == 1664495672) {
                    x(b10, n12, e10, n11, i10, str, dVar);
                } else if (n12 == 1835365492) {
                    o(b11, n12, e10, i13, dVar);
                } else if (n12 == 1667329389) {
                    dVar.f49904b = new C3717q0.b().R(i13).e0("application/x-camera-motion").E();
                }
                i12 = e10;
            }
            b11.P(i12 + n11);
        }
        return dVar;
    }

    private static void x(B b10, int i10, int i11, int i12, int i13, String str, d dVar) {
        b10.P(i11 + 16);
        String str2 = "application/ttml+xml";
        C4770v vVar = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = i12 - 16;
                byte[] bArr = new byte[i14];
                b10.j(bArr, 0, i14);
                vVar = C4770v.H(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else if (i10 == 1664495672) {
                dVar.f49906d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        dVar.f49904b = new C3717q0.b().R(i13).e0(str2).V(str).i0(j10).T(vVar).E();
    }

    private static g y(B b10) {
        int i10;
        long j10;
        long j11;
        int i11 = 8;
        b10.P(8);
        int c10 = C4227a.c(b10.n());
        if (c10 == 0) {
            i10 = 8;
        } else {
            i10 = 16;
        }
        b10.Q(i10);
        int n10 = b10.n();
        b10.Q(4);
        int e10 = b10.e();
        if (c10 == 0) {
            i11 = 4;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i13 >= i11) {
                b10.Q(i11);
                break;
            } else if (b10.d()[e10 + i13] != -1) {
                if (c10 == 0) {
                    j11 = b10.F();
                } else {
                    j11 = b10.I();
                }
                if (j11 != 0) {
                    j10 = j11;
                }
            } else {
                i13++;
            }
        }
        b10.Q(16);
        int n11 = b10.n();
        int n12 = b10.n();
        b10.Q(4);
        int n13 = b10.n();
        int n14 = b10.n();
        if (n11 == 0 && n12 == 65536 && n13 == -65536 && n14 == 0) {
            i12 = 90;
        } else if (n11 == 0 && n12 == -65536 && n13 == 65536 && n14 == 0) {
            i12 = 270;
        } else if (n11 == -65536 && n12 == 0 && n13 == 0 && n14 == -65536) {
            i12 = 180;
        }
        return new g(n10, j10, i12);
    }

    private static o z(C4227a.C0755a aVar, C4227a.b bVar, long j10, m mVar, boolean z10, boolean z11) {
        long j11;
        C4227a.b bVar2;
        long[] jArr;
        long[] jArr2;
        C4227a.C0755a f10;
        Pair h10;
        C4227a.C0755a aVar2 = aVar;
        C4227a.C0755a aVar3 = (C4227a.C0755a) C3645a.e(aVar2.f(1835297121));
        int d10 = d(k(((C4227a.b) C3645a.e(aVar3.g(1751411826))).f49888b));
        if (d10 == -1) {
            return null;
        }
        g y10 = y(((C4227a.b) C3645a.e(aVar2.g(1953196132))).f49888b);
        long j12 = -9223372036854775807L;
        if (j10 == -9223372036854775807L) {
            bVar2 = bVar;
            j11 = y10.f49916b;
        } else {
            bVar2 = bVar;
            j11 = j10;
        }
        long p10 = p(bVar2.f49888b);
        if (j11 != -9223372036854775807L) {
            j12 = M.O0(j11, 1000000, p10);
        }
        long j13 = j12;
        Pair m10 = m(((C4227a.b) C3645a.e(aVar3.g(1835296868))).f49888b);
        d w10 = w(((C4227a.b) C3645a.e(((C4227a.C0755a) C3645a.e(((C4227a.C0755a) C3645a.e(aVar3.f(1835626086))).f(1937007212))).g(1937011556))).f49888b, y10.f49915a, y10.f49917c, (String) m10.second, mVar, z11);
        if (z10 || (f10 = aVar2.f(1701082227)) == null || (h10 = h(f10)) == null) {
            jArr2 = null;
            jArr = null;
        } else {
            jArr = (long[]) h10.second;
            jArr2 = (long[]) h10.first;
        }
        if (w10.f49904b == null) {
            return null;
        }
        return new o(y10.f49915a, d10, ((Long) m10.first).longValue(), p10, j13, w10.f49904b, w10.f49906d, w10.f49903a, w10.f49905c, jArr2, jArr);
    }
}
