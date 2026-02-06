package zh;

import Gh.C5407h;
import Sg.p;
import kotlin.jvm.internal.C6496s;
import sh.C6726e;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f74056a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static final C5407h f74057b = C5407h.f63295d.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f74058c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f74059d = new String[64];

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f74060e;

    static {
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            C6496s.g(binaryString, "toBinaryString(it)");
            strArr[i10] = p.C(C6726e.t("%8s", binaryString), ' ', '0', false, 4, (Object) null);
        }
        f74060e = strArr;
        String[] strArr2 = f74059d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = strArr2[i11] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = f74059d;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
            strArr3[i15 | 8] = strArr3[i14] + '|' + strArr3[i13] + "|PADDED";
        }
        int length = f74059d.length;
        for (int i16 = 0; i16 < length; i16++) {
            String[] strArr4 = f74059d;
            if (strArr4[i16] == null) {
                strArr4[i16] = f74060e[i16];
            }
        }
    }

    private e() {
    }

    public final String a(int i10, int i11) {
        String str;
        if (i11 == 0) {
            return "";
        }
        if (!(i10 == 2 || i10 == 3)) {
            if (i10 == 4 || i10 == 6) {
                if (i11 == 1) {
                    return "ACK";
                }
                return f74060e[i11];
            } else if (!(i10 == 7 || i10 == 8)) {
                String[] strArr = f74059d;
                if (i11 < strArr.length) {
                    str = strArr[i11];
                    C6496s.e(str);
                } else {
                    str = f74060e[i11];
                }
                String str2 = str;
                if (i10 == 5 && (i11 & 4) != 0) {
                    return p.D(str2, "HEADERS", "PUSH_PROMISE", false, 4, (Object) null);
                }
                if (i10 != 0 || (i11 & 32) == 0) {
                    return str2;
                }
                return p.D(str2, "PRIORITY", "COMPRESSED", false, 4, (Object) null);
            }
        }
        return f74060e[i11];
    }

    public final String b(int i10) {
        String[] strArr = f74058c;
        if (i10 < strArr.length) {
            return strArr[i10];
        }
        return C6726e.t("0x%02x", Integer.valueOf(i10));
    }

    public final String c(boolean z10, int i10, int i11, int i12, int i13) {
        String str;
        String b10 = b(i12);
        String a10 = a(i12, i13);
        if (z10) {
            str = "<<";
        } else {
            str = ">>";
        }
        return C6726e.t("%s 0x%08x %5d %-13s %s", str, Integer.valueOf(i10), Integer.valueOf(i11), b10, a10);
    }
}
