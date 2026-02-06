package bi;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f67324a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(byte[] bArr) {
        return b(bArr, 0);
    }

    public static String b(byte[] bArr, int i10) {
        int i11;
        int length = bArr.length;
        int i12 = length << 1;
        if (i10 > 0) {
            i11 = length / i10;
        } else {
            i11 = 0;
        }
        char[] cArr = new char[(i12 + i11)];
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            if (i10 > 0 && i14 % i10 == 0 && i13 > 0) {
                cArr[i13] = '-';
                i13++;
            }
            int i15 = i13 + 1;
            char[] cArr2 = f67324a;
            byte b10 = bArr[i14];
            cArr[i13] = cArr2[(b10 & 240) >>> 4];
            i13 += 2;
            cArr[i15] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }
}
