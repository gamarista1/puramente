package ad;

import Tc.a;
import Tc.d;
import Wc.b;
import java.util.Map;

public final class k extends q {
    public b a(String str, a aVar, int i10, int i11, Map map) {
        if (aVar == a.EAN_8) {
            return super.a(str, aVar, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(aVar)));
    }

    public boolean[] c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + p.b(str);
            } catch (d e10) {
                throw new IllegalArgumentException(e10);
            }
        } else if (length == 8) {
            try {
                if (!p.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (d unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
        }
        boolean[] zArr = new boolean[67];
        int b10 = n.b(zArr, 0, p.f53596a, true);
        for (int i10 = 0; i10 <= 3; i10++) {
            b10 += n.b(zArr, b10, p.f53599d[Character.digit(str.charAt(i10), 10)], false);
        }
        int b11 = b10 + n.b(zArr, b10, p.f53597b, false);
        for (int i11 = 4; i11 <= 7; i11++) {
            b11 += n.b(zArr, b11, p.f53599d[Character.digit(str.charAt(i11), 10)], true);
        }
        n.b(zArr, b11, p.f53596a, true);
        return zArr;
    }
}
