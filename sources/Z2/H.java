package z2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public abstract class H {
    public static List a(byte[] bArr) {
        long k10 = k((long) f(bArr));
        long k11 = k(3840);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(b(k10));
        arrayList.add(b(k11));
        return arrayList;
    }

    private static byte[] b(long j10) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array();
    }

    public static int c(byte[] bArr) {
        return bArr[9] & 255;
    }

    private static long d(byte b10, byte b11) {
        byte b12;
        int i10;
        byte b13 = b10 & 255;
        byte b14 = b10 & 3;
        if (b14 != 0) {
            b12 = 2;
            if (!(b14 == 1 || b14 == 2)) {
                b12 = b11 & 63;
            }
        } else {
            b12 = 1;
        }
        int i11 = b13 >> 3;
        int i12 = i11 & 3;
        if (i11 >= 16) {
            i10 = 2500 << i12;
        } else if (i11 >= 12) {
            i10 = 10000 << (i11 & 1);
        } else if (i12 == 3) {
            i10 = 60000;
        } else {
            i10 = 10000 << i12;
        }
        return ((long) b12) * ((long) i10);
    }

    public static long e(byte[] bArr) {
        byte b10 = 0;
        byte b11 = bArr[0];
        if (bArr.length > 1) {
            b10 = bArr[1];
        }
        return d(b11, b10);
    }

    public static int f(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static boolean g(long j10, long j11) {
        if (j10 - j11 <= k(3840) / 1000) {
            return true;
        }
        return false;
    }

    public static int h(ByteBuffer byteBuffer) {
        byte b10;
        int i10 = i(byteBuffer);
        int i11 = byteBuffer.get(i10 + 26) + 27 + i10;
        byte b11 = byteBuffer.get(i11);
        if (byteBuffer.limit() - i11 > 1) {
            b10 = byteBuffer.get(i11 + 1);
        } else {
            b10 = 0;
        }
        return (int) ((d(b11, b10) * 48000) / 1000000);
    }

    public static int i(ByteBuffer byteBuffer) {
        if ((byteBuffer.get(5) & 2) == 0) {
            return 0;
        }
        byte b10 = byteBuffer.get(26);
        int i10 = 28;
        int i11 = 28;
        for (int i12 = 0; i12 < b10; i12++) {
            i11 += byteBuffer.get(i12 + 27);
        }
        byte b11 = byteBuffer.get(i11 + 26);
        for (int i13 = 0; i13 < b11; i13++) {
            i10 += byteBuffer.get(i11 + 27 + i13);
        }
        return i11 + i10;
    }

    public static int j(ByteBuffer byteBuffer) {
        byte b10 = 0;
        byte b11 = byteBuffer.get(0);
        if (byteBuffer.limit() > 1) {
            b10 = byteBuffer.get(1);
        }
        return (int) ((d(b11, b10) * 48000) / 1000000);
    }

    private static long k(long j10) {
        return (j10 * 1000000000) / 48000;
    }
}
