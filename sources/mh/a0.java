package mh;

import Sg.p;
import com.amazon.a.a.o.b;
import kotlin.jvm.internal.C6496s;

public abstract class a0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f72186a;

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f72187b;

    static {
        String[] strArr = new String[93];
        for (int i10 = 0; i10 < 32; i10++) {
            strArr[i10] = "\\u" + e(i10 >> 12) + e(i10 >> 8) + e(i10 >> 4) + e(i10);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f72186a = strArr;
        byte[] bArr = new byte[93];
        for (int i11 = 0; i11 < 32; i11++) {
            bArr[i11] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f72187b = bArr;
    }

    public static final byte[] a() {
        return f72187b;
    }

    public static final String[] b() {
        return f72186a;
    }

    public static final void c(StringBuilder sb2, String str) {
        C6496s.h(sb2, "<this>");
        C6496s.h(str, "value");
        sb2.append('\"');
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            String[] strArr = f72186a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb2.append(str, i10, i11);
                sb2.append(strArr[charAt]);
                i10 = i11 + 1;
            }
        }
        if (i10 != 0) {
            sb2.append(str, i10, str.length());
        } else {
            sb2.append(str);
        }
        sb2.append('\"');
    }

    public static final Boolean d(String str) {
        C6496s.h(str, "<this>");
        if (p.v(str, b.f37475af, true)) {
            return Boolean.TRUE;
        }
        if (p.v(str, b.f37476ag, true)) {
            return Boolean.FALSE;
        }
        return null;
    }

    private static final char e(int i10) {
        int i11;
        int i12 = i10 & 15;
        if (i12 < 10) {
            i11 = i12 + 48;
        } else {
            i11 = i12 + 87;
        }
        return (char) i11;
    }
}
