package mg;

import kotlin.jvm.internal.C6496s;

/* renamed from: mg.j  reason: case insensitive filesystem */
public abstract class C6582j {
    public static final byte[] a(String[] strArr) {
        C6496s.h(strArr, "strings");
        int i10 = 0;
        for (String length : strArr) {
            i10 += length.length();
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (String str : strArr) {
            int length2 = str.length();
            int i12 = 0;
            while (i12 < length2) {
                bArr[i11] = (byte) str.charAt(i12);
                i12++;
                i11++;
            }
        }
        return bArr;
    }
}
