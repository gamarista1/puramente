package Jh;

import java.nio.charset.Charset;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f63848a = Ih.a.f63777f;

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f63849b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c  reason: collision with root package name */
    private static final char[] f63850c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static char[] a(byte[] bArr) {
        return b(bArr, true);
    }

    public static char[] b(byte[] bArr, boolean z10) {
        char[] cArr;
        if (z10) {
            cArr = f63849b;
        } else {
            cArr = f63850c;
        }
        return c(bArr, cArr);
    }

    protected static char[] c(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[(r0 << 1)];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            cArr2[i10] = cArr[(b10 & 240) >>> 4];
            i10 += 2;
            cArr2[i11] = cArr[b10 & 15];
        }
        return cArr2;
    }
}
