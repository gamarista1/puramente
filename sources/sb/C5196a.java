package sb;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: sb.a  reason: case insensitive filesystem */
abstract class C5196a {

    /* renamed from: a  reason: collision with root package name */
    private static final C0908a f61587a = new C0908a(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* renamed from: b  reason: collision with root package name */
    private static final c f61588b = new c(new d(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* renamed from: c  reason: collision with root package name */
    static final byte[] f61589c = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    /* renamed from: sb.a$a  reason: collision with other inner class name */
    static class C0908a {

        /* renamed from: a  reason: collision with root package name */
        final long[] f61590a;

        /* renamed from: b  reason: collision with root package name */
        final long[] f61591b;

        /* renamed from: c  reason: collision with root package name */
        final long[] f61592c;

        C0908a(long[] jArr, long[] jArr2, long[] jArr3) {
            this.f61590a = jArr;
            this.f61591b = jArr2;
            this.f61592c = jArr3;
        }

        /* access modifiers changed from: package-private */
        public void a(long[] jArr, long[] jArr2) {
            System.arraycopy(jArr2, 0, jArr, 0, 10);
        }
    }

    /* renamed from: sb.a$b */
    private static class b extends C0908a {

        /* renamed from: d  reason: collision with root package name */
        private final long[] f61593d;

        b() {
            this(new long[10], new long[10], new long[10], new long[10]);
        }

        public void a(long[] jArr, long[] jArr2) {
            f.f(jArr, jArr2, this.f61593d);
        }

        b(e eVar) {
            this();
            long[] jArr = this.f61590a;
            d dVar = eVar.f61599a;
            f.n(jArr, dVar.f61597b, dVar.f61596a);
            long[] jArr2 = this.f61591b;
            d dVar2 = eVar.f61599a;
            f.m(jArr2, dVar2.f61597b, dVar2.f61596a);
            System.arraycopy(eVar.f61599a.f61598c, 0, this.f61593d, 0, 10);
            f.f(this.f61592c, eVar.f61600b, C5197b.f61602b);
        }

        b(long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4) {
            super(jArr, jArr2, jArr4);
            this.f61593d = jArr3;
        }
    }

    /* renamed from: sb.a$c */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final d f61594a;

        /* renamed from: b  reason: collision with root package name */
        final long[] f61595b;

        c() {
            this(new d(), new long[10]);
        }

        c(d dVar, long[] jArr) {
            this.f61594a = dVar;
            this.f61595b = jArr;
        }

        c(c cVar) {
            this.f61594a = new d(cVar.f61594a);
            this.f61595b = Arrays.copyOf(cVar.f61595b, 10);
        }
    }

    /* renamed from: sb.a$d */
    private static class d {

        /* renamed from: a  reason: collision with root package name */
        final long[] f61596a;

        /* renamed from: b  reason: collision with root package name */
        final long[] f61597b;

        /* renamed from: c  reason: collision with root package name */
        final long[] f61598c;

        d() {
            this(new long[10], new long[10], new long[10]);
        }

        static d a(d dVar, c cVar) {
            f.f(dVar.f61596a, cVar.f61594a.f61596a, cVar.f61595b);
            long[] jArr = dVar.f61597b;
            d dVar2 = cVar.f61594a;
            f.f(jArr, dVar2.f61597b, dVar2.f61598c);
            f.f(dVar.f61598c, cVar.f61594a.f61598c, cVar.f61595b);
            return dVar;
        }

        /* access modifiers changed from: package-private */
        public byte[] b() {
            long[] jArr = new long[10];
            long[] jArr2 = new long[10];
            long[] jArr3 = new long[10];
            f.e(jArr, this.f61598c);
            f.f(jArr2, this.f61596a, jArr);
            f.f(jArr3, this.f61597b, jArr);
            byte[] a10 = f.a(jArr3);
            a10[31] = (byte) ((C5196a.i(jArr2) << 7) ^ a10[31]);
            return a10;
        }

        d(long[] jArr, long[] jArr2, long[] jArr3) {
            this.f61596a = jArr;
            this.f61597b = jArr2;
            this.f61598c = jArr3;
        }

        d(d dVar) {
            this.f61596a = Arrays.copyOf(dVar.f61596a, 10);
            this.f61597b = Arrays.copyOf(dVar.f61597b, 10);
            this.f61598c = Arrays.copyOf(dVar.f61598c, 10);
        }

        d(c cVar) {
            this();
            a(this, cVar);
        }
    }

    /* renamed from: sb.a$e */
    private static class e {

        /* renamed from: a  reason: collision with root package name */
        final d f61599a;

        /* renamed from: b  reason: collision with root package name */
        final long[] f61600b;

        e() {
            this(new d(), new long[10]);
        }

        /* access modifiers changed from: private */
        public static e c(byte[] bArr) {
            long[] jArr = new long[10];
            long[] c10 = f.c(bArr);
            long[] jArr2 = new long[10];
            jArr2[0] = 1;
            long[] jArr3 = new long[10];
            long[] jArr4 = new long[10];
            long[] jArr5 = new long[10];
            long[] jArr6 = new long[10];
            long[] jArr7 = new long[10];
            f.k(jArr4, c10);
            f.f(jArr5, jArr4, C5197b.f61601a);
            f.m(jArr4, jArr4, jArr2);
            f.n(jArr5, jArr5, jArr2);
            long[] jArr8 = new long[10];
            f.k(jArr8, jArr5);
            f.f(jArr8, jArr8, jArr5);
            f.k(jArr, jArr8);
            f.f(jArr, jArr, jArr5);
            f.f(jArr, jArr, jArr4);
            C5196a.o(jArr, jArr);
            f.f(jArr, jArr, jArr8);
            f.f(jArr, jArr, jArr4);
            f.k(jArr6, jArr);
            f.f(jArr6, jArr6, jArr5);
            f.m(jArr7, jArr6, jArr4);
            if (C5196a.j(jArr7)) {
                f.n(jArr7, jArr6, jArr4);
                if (!C5196a.j(jArr7)) {
                    f.f(jArr, jArr, C5197b.f61603c);
                } else {
                    throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                }
            }
            if (C5196a.j(jArr) || ((bArr[31] & 255) >> 7) == 0) {
                if (C5196a.i(jArr) == ((bArr[31] & 255) >> 7)) {
                    C5196a.n(jArr, jArr);
                }
                f.f(jArr3, jArr, c10);
                return new e(new d(jArr, c10, jArr2), jArr3);
            }
            throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
        }

        /* access modifiers changed from: private */
        public static e d(e eVar, c cVar) {
            f.f(eVar.f61599a.f61596a, cVar.f61594a.f61596a, cVar.f61595b);
            long[] jArr = eVar.f61599a.f61597b;
            d dVar = cVar.f61594a;
            f.f(jArr, dVar.f61597b, dVar.f61598c);
            f.f(eVar.f61599a.f61598c, cVar.f61594a.f61598c, cVar.f61595b);
            long[] jArr2 = eVar.f61600b;
            d dVar2 = cVar.f61594a;
            f.f(jArr2, dVar2.f61596a, dVar2.f61597b);
            return eVar;
        }

        e(d dVar, long[] jArr) {
            this.f61599a = dVar;
            this.f61600b = jArr;
        }

        e(c cVar) {
            this();
            d(this, cVar);
        }
    }

    private static void e(c cVar, e eVar, C0908a aVar) {
        long[] jArr = new long[10];
        long[] jArr2 = cVar.f61594a.f61596a;
        d dVar = eVar.f61599a;
        f.n(jArr2, dVar.f61597b, dVar.f61596a);
        long[] jArr3 = cVar.f61594a.f61597b;
        d dVar2 = eVar.f61599a;
        f.m(jArr3, dVar2.f61597b, dVar2.f61596a);
        long[] jArr4 = cVar.f61594a.f61597b;
        f.f(jArr4, jArr4, aVar.f61591b);
        d dVar3 = cVar.f61594a;
        f.f(dVar3.f61598c, dVar3.f61596a, aVar.f61590a);
        f.f(cVar.f61595b, eVar.f61600b, aVar.f61592c);
        aVar.a(cVar.f61594a.f61596a, eVar.f61599a.f61598c);
        long[] jArr5 = cVar.f61594a.f61596a;
        f.n(jArr, jArr5, jArr5);
        d dVar4 = cVar.f61594a;
        f.m(dVar4.f61596a, dVar4.f61598c, dVar4.f61597b);
        d dVar5 = cVar.f61594a;
        long[] jArr6 = dVar5.f61597b;
        f.n(jArr6, dVar5.f61598c, jArr6);
        f.n(cVar.f61594a.f61598c, jArr, cVar.f61595b);
        long[] jArr7 = cVar.f61595b;
        f.m(jArr7, jArr, jArr7);
    }

    private static d f(byte[] bArr, e eVar, byte[] bArr2) {
        b[] bVarArr = new b[8];
        bVarArr[0] = new b(eVar);
        c cVar = new c();
        h(cVar, eVar);
        e eVar2 = new e(cVar);
        for (int i10 = 1; i10 < 8; i10++) {
            e(cVar, eVar2, bVarArr[i10 - 1]);
            bVarArr[i10] = new b(new e(cVar));
        }
        byte[] q10 = q(bArr);
        byte[] q11 = q(bArr2);
        c cVar2 = new c(f61588b);
        e eVar3 = new e();
        int i11 = 255;
        while (i11 >= 0 && q10[i11] == 0 && q11[i11] == 0) {
            i11--;
        }
        while (i11 >= 0) {
            g(cVar2, new d(cVar2));
            byte b10 = q10[i11];
            if (b10 > 0) {
                e(cVar2, e.d(eVar3, cVar2), bVarArr[q10[i11] / 2]);
            } else if (b10 < 0) {
                r(cVar2, e.d(eVar3, cVar2), bVarArr[(-q10[i11]) / 2]);
            }
            byte b11 = q11[i11];
            if (b11 > 0) {
                e(cVar2, e.d(eVar3, cVar2), C5197b.f61605e[q11[i11] / 2]);
            } else if (b11 < 0) {
                r(cVar2, e.d(eVar3, cVar2), C5197b.f61605e[(-q11[i11]) / 2]);
            }
            i11--;
        }
        return new d(cVar2);
    }

    private static void g(c cVar, d dVar) {
        long[] jArr = new long[10];
        f.k(cVar.f61594a.f61596a, dVar.f61596a);
        f.k(cVar.f61594a.f61598c, dVar.f61597b);
        f.k(cVar.f61595b, dVar.f61598c);
        long[] jArr2 = cVar.f61595b;
        f.n(jArr2, jArr2, jArr2);
        f.n(cVar.f61594a.f61597b, dVar.f61596a, dVar.f61597b);
        f.k(jArr, cVar.f61594a.f61597b);
        d dVar2 = cVar.f61594a;
        f.n(dVar2.f61597b, dVar2.f61598c, dVar2.f61596a);
        d dVar3 = cVar.f61594a;
        long[] jArr3 = dVar3.f61598c;
        f.m(jArr3, jArr3, dVar3.f61596a);
        d dVar4 = cVar.f61594a;
        f.m(dVar4.f61596a, jArr, dVar4.f61597b);
        long[] jArr4 = cVar.f61595b;
        f.m(jArr4, jArr4, cVar.f61594a.f61598c);
    }

    private static void h(c cVar, e eVar) {
        g(cVar, eVar.f61599a);
    }

    /* access modifiers changed from: private */
    public static int i(long[] jArr) {
        return f.a(jArr)[0] & 1;
    }

    /* access modifiers changed from: private */
    public static boolean j(long[] jArr) {
        long[] jArr2 = new long[(jArr.length + 1)];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        f.i(jArr2);
        for (byte b10 : f.a(jArr2)) {
            if (b10 != 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean k(byte[] bArr) {
        int i10 = 31;
        while (i10 >= 0) {
            byte b10 = bArr[i10] & 255;
            byte b11 = f61589c[i10] & 255;
            if (b10 == b11) {
                i10--;
            } else if (b10 < b11) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    private static long l(byte[] bArr, int i10) {
        return (((long) (bArr[i10 + 2] & 255)) << 16) | (((long) bArr[i10]) & 255) | (((long) (bArr[i10 + 1] & 255)) << 8);
    }

    private static long m(byte[] bArr, int i10) {
        return (((long) (bArr[i10 + 3] & 255)) << 24) | l(bArr, i10);
    }

    /* access modifiers changed from: private */
    public static void n(long[] jArr, long[] jArr2) {
        for (int i10 = 0; i10 < jArr2.length; i10++) {
            jArr[i10] = -jArr2[i10];
        }
    }

    /* access modifiers changed from: private */
    public static void o(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        f.k(jArr3, jArr2);
        f.k(jArr4, jArr3);
        f.k(jArr4, jArr4);
        f.f(jArr4, jArr2, jArr4);
        f.f(jArr3, jArr3, jArr4);
        f.k(jArr3, jArr3);
        f.f(jArr3, jArr4, jArr3);
        f.k(jArr4, jArr3);
        for (int i10 = 1; i10 < 5; i10++) {
            f.k(jArr4, jArr4);
        }
        f.f(jArr3, jArr4, jArr3);
        f.k(jArr4, jArr3);
        for (int i11 = 1; i11 < 10; i11++) {
            f.k(jArr4, jArr4);
        }
        f.f(jArr4, jArr4, jArr3);
        f.k(jArr5, jArr4);
        for (int i12 = 1; i12 < 20; i12++) {
            f.k(jArr5, jArr5);
        }
        f.f(jArr4, jArr5, jArr4);
        f.k(jArr4, jArr4);
        for (int i13 = 1; i13 < 10; i13++) {
            f.k(jArr4, jArr4);
        }
        f.f(jArr3, jArr4, jArr3);
        f.k(jArr4, jArr3);
        for (int i14 = 1; i14 < 50; i14++) {
            f.k(jArr4, jArr4);
        }
        f.f(jArr4, jArr4, jArr3);
        f.k(jArr5, jArr4);
        for (int i15 = 1; i15 < 100; i15++) {
            f.k(jArr5, jArr5);
        }
        f.f(jArr4, jArr5, jArr4);
        f.k(jArr4, jArr4);
        for (int i16 = 1; i16 < 50; i16++) {
            f.k(jArr4, jArr4);
        }
        f.f(jArr3, jArr4, jArr3);
        f.k(jArr3, jArr3);
        f.k(jArr3, jArr3);
        f.f(jArr, jArr3, jArr2);
    }

    private static void p(byte[] bArr) {
        byte[] bArr2 = bArr;
        long l10 = (l(bArr2, 47) >> 2) & 2097151;
        long m10 = (m(bArr2, 49) >> 7) & 2097151;
        long m11 = (m(bArr2, 52) >> 4) & 2097151;
        long l11 = (l(bArr2, 55) >> 1) & 2097151;
        long m12 = (m(bArr2, 57) >> 6) & 2097151;
        long m13 = m(bArr2, 60) >> 3;
        long l12 = (l(bArr2, 42) & 2097151) - (m13 * 683901);
        long l13 = ((l(bArr2, 26) >> 2) & 2097151) + (m12 * 666643);
        long m14 = ((m(bArr2, 28) >> 7) & 2097151) + (m13 * 666643) + (m12 * 470296);
        long m15 = ((m(bArr2, 31) >> 4) & 2097151) + (m13 * 470296) + (m12 * 654183);
        long l14 = (((l(bArr2, 34) >> 1) & 2097151) + (m13 * 654183)) - (m12 * 997805);
        long l15 = (((l(bArr2, 39) >> 3) & 2097151) + (m13 * 136657)) - (m12 * 683901);
        long m16 = ((m(bArr2, 23) >> 5) & 2097151) + (l11 * 666643);
        long m17 = ((((m(bArr2, 36) >> 6) & 2097151) - (m13 * 997805)) + (m12 * 136657)) - (l11 * 683901);
        long l16 = (l(bArr2, 21) & 2097151) + (m11 * 666643);
        long l17 = ((l(bArr2, 18) >> 3) & 2097151) + (m10 * 666643);
        long j10 = ((m15 - (l11 * 997805)) + (m11 * 136657)) - (m10 * 683901);
        long m18 = ((m(bArr2, 15) >> 6) & 2097151) + (l10 * 666643);
        long j11 = l17 + (l10 * 470296);
        long j12 = l16 + (m10 * 470296) + (l10 * 654183);
        long j13 = ((m16 + (m11 * 470296)) + (m10 * 654183)) - (l10 * 997805);
        long j14 = (((l13 + (l11 * 470296)) + (m11 * 654183)) - (m10 * 997805)) + (l10 * 136657);
        long j15 = (((m14 + (l11 * 654183)) - (m11 * 997805)) + (m10 * 136657)) - (l10 * 683901);
        long j16 = (m18 + 1048576) >> 21;
        long j17 = j11 + j16;
        long j18 = m18 - (j16 << 21);
        long j19 = (j12 + 1048576) >> 21;
        long j20 = j13 + j19;
        long j21 = j12 - (j19 << 21);
        long j22 = (j14 + 1048576) >> 21;
        long j23 = j15 + j22;
        long j24 = j14 - (j22 << 21);
        long j25 = (j10 + 1048576) >> 21;
        long j26 = ((l14 + (l11 * 136657)) - (m11 * 683901)) + j25;
        long j27 = j10 - (j25 << 21);
        long j28 = (m17 + 1048576) >> 21;
        long j29 = l15 + j28;
        long j30 = m17 - (j28 << 21);
        long j31 = (l12 + 1048576) >> 21;
        long m19 = ((m(bArr2, 44) >> 5) & 2097151) + j31;
        long j32 = l12 - (j31 << 21);
        long j33 = (j17 + 1048576) >> 21;
        long j34 = j21 + j33;
        long j35 = j17 - (j33 << 21);
        long j36 = (j20 + 1048576) >> 21;
        long j37 = j24 + j36;
        long j38 = j20 - (j36 << 21);
        long j39 = (j23 + 1048576) >> 21;
        long j40 = j27 + j39;
        long j41 = j23 - (j39 << 21);
        long j42 = (j26 + 1048576) >> 21;
        long j43 = j30 + j42;
        long j44 = j26 - (j42 << 21);
        long j45 = (j29 + 1048576) >> 21;
        long j46 = j32 + j45;
        long j47 = j29 - (j45 << 21);
        long l18 = ((l(bArr2, 13) >> 1) & 2097151) + (m19 * 666643);
        long j48 = j37 - (m19 * 683901);
        long m20 = ((m(bArr2, 10) >> 4) & 2097151) + (j46 * 666643);
        long m21 = ((m(bArr2, 7) >> 7) & 2097151) + (j47 * 666643);
        long j49 = ((j34 - (m19 * 997805)) + (j46 * 136657)) - (j47 * 683901);
        long l19 = ((l(bArr2, 5) >> 2) & 2097151) + (j43 * 666643);
        long m22 = ((m(bArr2, 2) >> 5) & 2097151) + (j44 * 666643);
        long j50 = ((((j18 + (m19 * 470296)) + (j46 * 654183)) - (j47 * 997805)) + (j43 * 136657)) - (j44 * 683901);
        long l20 = (l(bArr2, 0) & 2097151) + (j40 * 666643);
        long j51 = m22 + (j40 * 470296);
        long j52 = l19 + (j44 * 470296) + (j40 * 654183);
        long j53 = ((m21 + (j43 * 470296)) + (j44 * 654183)) - (j40 * 997805);
        long j54 = (((m20 + (j47 * 470296)) + (j43 * 654183)) - (j44 * 997805)) + (j40 * 136657);
        long j55 = ((((l18 + (j46 * 470296)) + (j47 * 654183)) - (j43 * 997805)) + (j44 * 136657)) - (j40 * 683901);
        long j56 = (l20 + 1048576) >> 21;
        long j57 = j51 + j56;
        long j58 = l20 - (j56 << 21);
        long j59 = (j52 + 1048576) >> 21;
        long j60 = j53 + j59;
        long j61 = j52 - (j59 << 21);
        long j62 = (j54 + 1048576) >> 21;
        long j63 = j55 + j62;
        long j64 = j54 - (j62 << 21);
        long j65 = (j50 + 1048576) >> 21;
        long j66 = ((((j35 + (m19 * 654183)) - (j46 * 997805)) + (j47 * 136657)) - (j43 * 683901)) + j65;
        long j67 = j50 - (j65 << 21);
        long j68 = (j49 + 1048576) >> 21;
        long j69 = ((j38 + (m19 * 136657)) - (j46 * 683901)) + j68;
        long j70 = j49 - (j68 << 21);
        long j71 = (j48 + 1048576) >> 21;
        long j72 = j41 + j71;
        long j73 = j48 - (j71 << 21);
        long j74 = (j57 + 1048576) >> 21;
        long j75 = j61 + j74;
        long j76 = j57 - (j74 << 21);
        long j77 = (j60 + 1048576) >> 21;
        long j78 = j64 + j77;
        long j79 = j60 - (j77 << 21);
        long j80 = (j63 + 1048576) >> 21;
        long j81 = j67 + j80;
        long j82 = j63 - (j80 << 21);
        long j83 = (j66 + 1048576) >> 21;
        long j84 = j70 + j83;
        long j85 = j66 - (j83 << 21);
        long j86 = (j69 + 1048576) >> 21;
        long j87 = j73 + j86;
        long j88 = j69 - (j86 << 21);
        long j89 = (j72 + 1048576) >> 21;
        long j90 = j58 + (j89 * 666643);
        long j91 = j90 >> 21;
        long j92 = j76 + (j89 * 470296) + j91;
        long j93 = j90 - (j91 << 21);
        long j94 = j92 >> 21;
        long j95 = j75 + (j89 * 654183) + j94;
        long j96 = j92 - (j94 << 21);
        long j97 = j95 >> 21;
        long j98 = (j79 - (j89 * 997805)) + j97;
        long j99 = j95 - (j97 << 21);
        long j100 = j98 >> 21;
        long j101 = j78 + (j89 * 136657) + j100;
        long j102 = j98 - (j100 << 21);
        long j103 = j101 >> 21;
        long j104 = (j82 - (j89 * 683901)) + j103;
        long j105 = j101 - (j103 << 21);
        long j106 = j104 >> 21;
        long j107 = j81 + j106;
        long j108 = j104 - (j106 << 21);
        long j109 = j107 >> 21;
        long j110 = j85 + j109;
        long j111 = j107 - (j109 << 21);
        long j112 = j110 >> 21;
        long j113 = j84 + j112;
        long j114 = j110 - (j112 << 21);
        long j115 = j113 >> 21;
        long j116 = j88 + j115;
        long j117 = j113 - (j115 << 21);
        long j118 = j116 >> 21;
        long j119 = j87 + j118;
        long j120 = j116 - (j118 << 21);
        long j121 = j119 >> 21;
        long j122 = (j72 - (j89 << 21)) + j121;
        long j123 = j119 - (j121 << 21);
        long j124 = j122 >> 21;
        long j125 = j122 - (j124 << 21);
        long j126 = j93 + (666643 * j124);
        long j127 = j108 - (j124 * 683901);
        long j128 = j126 >> 21;
        long j129 = j96 + (470296 * j124) + j128;
        long j130 = j126 - (j128 << 21);
        long j131 = j129 >> 21;
        long j132 = j99 + (654183 * j124) + j131;
        long j133 = j129 - (j131 << 21);
        long j134 = j132 >> 21;
        long j135 = (j102 - (997805 * j124)) + j134;
        long j136 = j132 - (j134 << 21);
        long j137 = j135 >> 21;
        long j138 = j105 + (136657 * j124) + j137;
        long j139 = j135 - (j137 << 21);
        long j140 = j138 >> 21;
        long j141 = j127 + j140;
        long j142 = j138 - (j140 << 21);
        long j143 = j141 >> 21;
        long j144 = j111 + j143;
        long j145 = j141 - (j143 << 21);
        long j146 = j144 >> 21;
        long j147 = j114 + j146;
        long j148 = j144 - (j146 << 21);
        long j149 = j147 >> 21;
        long j150 = j117 + j149;
        long j151 = j147 - (j149 << 21);
        long j152 = j150 >> 21;
        long j153 = j120 + j152;
        long j154 = j139;
        long j155 = j150 - (j152 << 21);
        long j156 = j153 >> 21;
        long j157 = j123 + j156;
        long j158 = j153 - (j156 << 21);
        long j159 = j157 >> 21;
        long j160 = j125 + j159;
        long j161 = j157 - (j159 << 21);
        bArr2[0] = (byte) ((int) j130);
        bArr2[1] = (byte) ((int) (j130 >> 8));
        bArr2[2] = (byte) ((int) ((j130 >> 16) | (j133 << 5)));
        bArr2[3] = (byte) ((int) (j133 >> 3));
        bArr2[4] = (byte) ((int) (j133 >> 11));
        bArr2[5] = (byte) ((int) ((j133 >> 19) | (j136 << 2)));
        bArr2[6] = (byte) ((int) (j136 >> 6));
        bArr2[7] = (byte) ((int) ((j136 >> 14) | (j154 << 7)));
        bArr2[8] = (byte) ((int) (j154 >> 1));
        bArr2[9] = (byte) ((int) (j154 >> 9));
        bArr2[10] = (byte) ((int) ((j154 >> 17) | (j142 << 4)));
        bArr2[11] = (byte) ((int) (j142 >> 4));
        bArr2[12] = (byte) ((int) (j142 >> 12));
        bArr2[13] = (byte) ((int) ((j142 >> 20) | (j145 << 1)));
        bArr2[14] = (byte) ((int) (j145 >> 7));
        bArr2[15] = (byte) ((int) ((j145 >> 15) | (j148 << 6)));
        bArr2[16] = (byte) ((int) (j148 >> 2));
        bArr2[17] = (byte) ((int) (j148 >> 10));
        bArr2[18] = (byte) ((int) ((j148 >> 18) | (j151 << 3)));
        bArr2[19] = (byte) ((int) (j151 >> 5));
        bArr2[20] = (byte) ((int) (j151 >> 13));
        bArr2[21] = (byte) ((int) j155);
        bArr2[22] = (byte) ((int) (j155 >> 8));
        bArr2[23] = (byte) ((int) ((j155 >> 16) | (j158 << 5)));
        bArr2[24] = (byte) ((int) (j158 >> 3));
        bArr2[25] = (byte) ((int) (j158 >> 11));
        bArr2[26] = (byte) ((int) ((j158 >> 19) | (j161 << 2)));
        bArr2[27] = (byte) ((int) (j161 >> 6));
        bArr2[28] = (byte) ((int) ((j161 >> 14) | (j160 << 7)));
        bArr2[29] = (byte) ((int) (j160 >> 1));
        bArr2[30] = (byte) ((int) (j160 >> 9));
        bArr2[31] = (byte) ((int) (j160 >> 17));
    }

    private static byte[] q(byte[] bArr) {
        int i10;
        byte[] bArr2 = new byte[256];
        for (int i11 = 0; i11 < 256; i11++) {
            bArr2[i11] = (byte) (1 & ((bArr[i11 >> 3] & 255) >> (i11 & 7)));
        }
        int i12 = 0;
        while (i12 < 256) {
            if (bArr2[i12] != 0) {
                int i13 = 1;
                while (i13 <= 6 && (i10 = i12 + i13) < 256) {
                    byte b10 = bArr2[i10];
                    if (b10 != 0) {
                        byte b11 = bArr2[i12];
                        if ((b10 << i13) + b11 > 15) {
                            if (b11 - (b10 << i13) < -15) {
                                break;
                            }
                            bArr2[i12] = (byte) (b11 - (b10 << i13));
                            while (true) {
                                if (i10 >= 256) {
                                    break;
                                } else if (bArr2[i10] == 0) {
                                    bArr2[i10] = 1;
                                    break;
                                } else {
                                    bArr2[i10] = 0;
                                    i10++;
                                }
                            }
                        } else {
                            bArr2[i12] = (byte) (b11 + (b10 << i13));
                            bArr2[i10] = 0;
                        }
                    }
                    i13++;
                }
            }
            i12++;
        }
        return bArr2;
    }

    private static void r(c cVar, e eVar, C0908a aVar) {
        long[] jArr = new long[10];
        long[] jArr2 = cVar.f61594a.f61596a;
        d dVar = eVar.f61599a;
        f.n(jArr2, dVar.f61597b, dVar.f61596a);
        long[] jArr3 = cVar.f61594a.f61597b;
        d dVar2 = eVar.f61599a;
        f.m(jArr3, dVar2.f61597b, dVar2.f61596a);
        long[] jArr4 = cVar.f61594a.f61597b;
        f.f(jArr4, jArr4, aVar.f61590a);
        d dVar3 = cVar.f61594a;
        f.f(dVar3.f61598c, dVar3.f61596a, aVar.f61591b);
        f.f(cVar.f61595b, eVar.f61600b, aVar.f61592c);
        aVar.a(cVar.f61594a.f61596a, eVar.f61599a.f61598c);
        long[] jArr5 = cVar.f61594a.f61596a;
        f.n(jArr, jArr5, jArr5);
        d dVar4 = cVar.f61594a;
        f.m(dVar4.f61596a, dVar4.f61598c, dVar4.f61597b);
        d dVar5 = cVar.f61594a;
        long[] jArr6 = dVar5.f61597b;
        f.n(jArr6, dVar5.f61598c, jArr6);
        f.m(cVar.f61594a.f61598c, jArr, cVar.f61595b);
        long[] jArr7 = cVar.f61595b;
        f.n(jArr7, jArr, jArr7);
    }

    static boolean s(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr2.length != 64) {
            return false;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr2, 32, 64);
        if (!k(copyOfRange)) {
            return false;
        }
        MessageDigest messageDigest = (MessageDigest) C5199d.f61617e.a("SHA-512");
        messageDigest.update(bArr2, 0, 32);
        messageDigest.update(bArr3);
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        p(digest);
        byte[] b10 = f(digest, e.c(bArr3), copyOfRange).b();
        for (int i10 = 0; i10 < 32; i10++) {
            if (b10[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }
}
