package K4;

import Sg.C5538a;
import kotlin.jvm.internal.C6496s;

public abstract class f {
    public static final String a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        int length = bArr.length;
        int i10 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            i10++;
            byte b11 = b10 & 255;
            if (b11 < 16) {
                sb2.append('0');
            }
            String num = Integer.toString(b11, C5538a.a(16));
            C6496s.g(num, "toString(this, checkRadix(radix))");
            sb2.append(num);
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
