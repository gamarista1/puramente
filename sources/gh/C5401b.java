package Gh;

import Gh.C5404e;
import Hh.b;
import Sg.p;
import kotlin.jvm.internal.C6496s;

/* renamed from: Gh.b  reason: case insensitive filesystem */
public abstract class C5401b {

    /* renamed from: a  reason: collision with root package name */
    private static final C5404e.a f63269a = new C5404e.a();

    /* renamed from: b  reason: collision with root package name */
    private static final int f63270b = -1234567890;

    public static final boolean a(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        C6496s.h(bArr, "a");
        C6496s.h(bArr2, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static final int c() {
        return f63270b;
    }

    public static final C5404e.a d() {
        return f63269a;
    }

    public static final int e(C5407h hVar, int i10) {
        C6496s.h(hVar, "<this>");
        if (i10 == f63270b) {
            return hVar.O();
        }
        return i10;
    }

    public static final int f(byte[] bArr, int i10) {
        C6496s.h(bArr, "<this>");
        if (i10 == f63270b) {
            return bArr.length;
        }
        return i10;
    }

    public static final C5404e.a g(C5404e.a aVar) {
        C6496s.h(aVar, "unsafeCursor");
        if (aVar == f63269a) {
            return new C5404e.a();
        }
        return aVar;
    }

    public static final int h(int i10) {
        return ((i10 & 255) << 24) | ((-16777216 & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static final long i(long j10) {
        return ((j10 & 255) << 56) | ((-72057594037927936L & j10) >>> 56) | ((71776119061217280L & j10) >>> 40) | ((280375465082880L & j10) >>> 24) | ((1095216660480L & j10) >>> 8) | ((4278190080L & j10) << 8) | ((16711680 & j10) << 24) | ((65280 & j10) << 40);
    }

    public static final short j(short s10) {
        return (short) (((s10 & 255) << 8) | ((65280 & s10) >>> 8));
    }

    public static final String k(byte b10) {
        return p.q(new char[]{b.f()[(b10 >> 4) & 15], b.f()[b10 & 15]});
    }

    public static final String l(int i10) {
        int i11 = 0;
        if (i10 == 0) {
            return "0";
        }
        char[] cArr = {b.f()[(i10 >> 28) & 15], b.f()[(i10 >> 24) & 15], b.f()[(i10 >> 20) & 15], b.f()[(i10 >> 16) & 15], b.f()[(i10 >> 12) & 15], b.f()[(i10 >> 8) & 15], b.f()[(i10 >> 4) & 15], b.f()[i10 & 15]};
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        return p.r(cArr, i11, 8);
    }
}
