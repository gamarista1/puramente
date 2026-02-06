package sb;

import java.lang.reflect.Array;
import java.math.BigInteger;
import sb.C5196a;

/* renamed from: sb.b  reason: case insensitive filesystem */
abstract class C5197b {

    /* renamed from: a  reason: collision with root package name */
    static final long[] f61601a;

    /* renamed from: b  reason: collision with root package name */
    static final long[] f61602b;

    /* renamed from: c  reason: collision with root package name */
    static final long[] f61603c;

    /* renamed from: d  reason: collision with root package name */
    static final C5196a.C0908a[][] f61604d;

    /* renamed from: e  reason: collision with root package name */
    static final C5196a.C0908a[] f61605e = new C5196a.C0908a[8];

    /* renamed from: f  reason: collision with root package name */
    private static final BigInteger f61606f;

    /* renamed from: g  reason: collision with root package name */
    private static final BigInteger f61607g;

    /* renamed from: h  reason: collision with root package name */
    private static final BigInteger f61608h;

    /* renamed from: i  reason: collision with root package name */
    private static final BigInteger f61609i;

    /* renamed from: sb.b$b  reason: collision with other inner class name */
    private static class C0909b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public BigInteger f61610a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public BigInteger f61611b;

        private C0909b() {
        }
    }

    static {
        BigInteger subtract = BigInteger.valueOf(2).pow(255).subtract(BigInteger.valueOf(19));
        f61606f = subtract;
        BigInteger mod = BigInteger.valueOf(-121665).multiply(BigInteger.valueOf(121666).modInverse(subtract)).mod(subtract);
        f61607g = mod;
        BigInteger mod2 = BigInteger.valueOf(2).multiply(mod).mod(subtract);
        f61608h = mod2;
        BigInteger modPow = BigInteger.valueOf(2).modPow(subtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4)), subtract);
        f61609i = modPow;
        C0909b bVar = new C0909b();
        BigInteger unused = bVar.f61611b = BigInteger.valueOf(4).multiply(BigInteger.valueOf(5).modInverse(subtract)).mod(subtract);
        BigInteger unused2 = bVar.f61610a = c(bVar.f61611b);
        f61601a = f.c(d(mod));
        f61602b = f.c(d(mod2));
        f61603c = f.c(d(modPow));
        int[] iArr = new int[2];
        iArr[1] = 8;
        iArr[0] = 32;
        f61604d = (C5196a.C0908a[][]) Array.newInstance(C5196a.C0908a.class, iArr);
        C0909b bVar2 = bVar;
        for (int i10 = 0; i10 < 32; i10++) {
            C0909b bVar3 = bVar2;
            for (int i11 = 0; i11 < 8; i11++) {
                f61604d[i10][i11] = b(bVar3);
                bVar3 = a(bVar3, bVar2);
            }
            for (int i12 = 0; i12 < 8; i12++) {
                bVar2 = a(bVar2, bVar2);
            }
        }
        C0909b a10 = a(bVar, bVar);
        for (int i13 = 0; i13 < 8; i13++) {
            f61605e[i13] = b(bVar);
            bVar = a(bVar, a10);
        }
    }

    private static C0909b a(C0909b bVar, C0909b bVar2) {
        C0909b bVar3 = new C0909b();
        BigInteger multiply = f61607g.multiply(bVar.f61610a.multiply(bVar2.f61610a).multiply(bVar.f61611b).multiply(bVar2.f61611b));
        BigInteger bigInteger = f61606f;
        BigInteger mod = multiply.mod(bigInteger);
        BigInteger add = bVar.f61610a.multiply(bVar2.f61611b).add(bVar2.f61610a.multiply(bVar.f61611b));
        BigInteger bigInteger2 = BigInteger.ONE;
        BigInteger unused = bVar3.f61610a = add.multiply(bigInteger2.add(mod).modInverse(bigInteger)).mod(bigInteger);
        BigInteger unused2 = bVar3.f61611b = bVar.f61611b.multiply(bVar2.f61611b).add(bVar.f61610a.multiply(bVar2.f61610a)).multiply(bigInteger2.subtract(mod).modInverse(bigInteger)).mod(bigInteger);
        return bVar3;
    }

    private static C5196a.C0908a b(C0909b bVar) {
        BigInteger add = bVar.f61611b.add(bVar.f61610a);
        BigInteger bigInteger = f61606f;
        return new C5196a.C0908a(f.c(d(add.mod(bigInteger))), f.c(d(bVar.f61611b.subtract(bVar.f61610a).mod(bigInteger))), f.c(d(f61608h.multiply(bVar.f61610a).multiply(bVar.f61611b).mod(bigInteger))));
    }

    private static BigInteger c(BigInteger bigInteger) {
        BigInteger pow = bigInteger.pow(2);
        BigInteger bigInteger2 = BigInteger.ONE;
        BigInteger subtract = pow.subtract(bigInteger2);
        BigInteger add = f61607g.multiply(bigInteger.pow(2)).add(bigInteger2);
        BigInteger bigInteger3 = f61606f;
        BigInteger multiply = subtract.multiply(add.modInverse(bigInteger3));
        BigInteger modPow = multiply.modPow(bigInteger3.add(BigInteger.valueOf(3)).divide(BigInteger.valueOf(8)), bigInteger3);
        if (!modPow.pow(2).subtract(multiply).mod(bigInteger3).equals(BigInteger.ZERO)) {
            modPow = modPow.multiply(f61609i).mod(bigInteger3);
        }
        if (modPow.testBit(0)) {
            return bigInteger3.subtract(modPow);
        }
        return modPow;
    }

    private static byte[] d(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i10 = 0; i10 < 16; i10++) {
            byte b10 = bArr[i10];
            int i11 = 31 - i10;
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }
        return bArr;
    }
}
