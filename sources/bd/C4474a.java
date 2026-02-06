package bd;

import Tc.a;
import Tc.c;
import Tc.g;
import Wc.b;
import cd.d;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: bd.a  reason: case insensitive filesystem */
public final class C4474a implements g {
    private static b b(byte[][] bArr, int i10) {
        int i11 = i10 * 2;
        b bVar = new b(bArr[0].length + i11, bArr.length + i11);
        bVar.c();
        int g10 = (bVar.g() - i10) - 1;
        int i12 = 0;
        while (i12 < bArr.length) {
            byte[] bArr2 = bArr[i12];
            for (int i13 = 0; i13 < bArr[0].length; i13++) {
                if (bArr2[i13] == 1) {
                    bVar.i(i13 + i10, g10);
                }
            }
            i12++;
            g10--;
        }
        return bVar;
    }

    private static b c(d dVar, String str, int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        boolean z12;
        dVar.e(str, i10);
        byte[][] b10 = dVar.f().b(1, 4);
        if (i12 > i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (b10[0].length < b10.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            b10 = d(b10);
            z12 = true;
        } else {
            z12 = false;
        }
        int length = i11 / b10[0].length;
        int length2 = i12 / b10.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return b(b10, i13);
        }
        byte[][] b11 = dVar.f().b(length, length << 2);
        if (z12) {
            b11 = d(b11);
        }
        return b(b11, i13);
    }

    private static byte[][] d(byte[][] bArr) {
        int length = bArr[0].length;
        int[] iArr = new int[2];
        iArr[1] = bArr.length;
        iArr[0] = length;
        byte[][] bArr2 = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int length2 = (bArr.length - i10) - 1;
            for (int i11 = 0; i11 < bArr[0].length; i11++) {
                bArr2[i11][length2] = bArr[i10][i11];
            }
        }
        return bArr2;
    }

    public b a(String str, a aVar, int i10, int i11, Map map) {
        if (aVar == a.PDF_417) {
            d dVar = new d();
            int i12 = 30;
            int i13 = 2;
            if (map != null) {
                c cVar = c.PDF417_COMPACT;
                if (map.containsKey(cVar)) {
                    dVar.h(Boolean.valueOf(map.get(cVar).toString()).booleanValue());
                }
                c cVar2 = c.PDF417_COMPACTION;
                if (map.containsKey(cVar2)) {
                    dVar.i(cd.c.valueOf(map.get(cVar2).toString()));
                }
                c cVar3 = c.PDF417_DIMENSIONS;
                if (!map.containsKey(cVar3)) {
                    c cVar4 = c.MARGIN;
                    if (map.containsKey(cVar4)) {
                        i12 = Integer.parseInt(map.get(cVar4).toString());
                    }
                    c cVar5 = c.ERROR_CORRECTION;
                    if (map.containsKey(cVar5)) {
                        i13 = Integer.parseInt(map.get(cVar5).toString());
                    }
                    c cVar6 = c.CHARACTER_SET;
                    if (map.containsKey(cVar6)) {
                        dVar.j(Charset.forName(map.get(cVar6).toString()));
                    }
                } else {
                    android.support.v4.media.session.c.a(map.get(cVar3));
                    throw null;
                }
            }
            return c(dVar, str, i13, i10, i11, i12);
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(aVar)));
    }
}
