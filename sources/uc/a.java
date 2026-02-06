package Uc;

import Tc.g;
import Vc.c;
import Wc.b;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public final class a implements g {
    private static b b(String str, Tc.a aVar, int i10, int i11, Charset charset, int i12, int i13) {
        if (aVar == Tc.a.AZTEC) {
            return c(c.d(str.getBytes(charset), i12, i13), i10, i11);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(aVar)));
    }

    private static b c(Vc.a aVar, int i10, int i11) {
        b a10 = aVar.a();
        if (a10 != null) {
            int h10 = a10.h();
            int g10 = a10.g();
            int max = Math.max(i10, h10);
            int max2 = Math.max(i11, g10);
            int min = Math.min(max / h10, max2 / g10);
            int i12 = (max - (h10 * min)) / 2;
            int i13 = (max2 - (g10 * min)) / 2;
            b bVar = new b(max, max2);
            int i14 = 0;
            while (i14 < g10) {
                int i15 = 0;
                int i16 = i12;
                while (i15 < h10) {
                    if (a10.e(i15, i14)) {
                        bVar.j(i16, i13, min, min);
                    }
                    i15++;
                    i16 += min;
                }
                i14++;
                i13 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    public b a(String str, Tc.a aVar, int i10, int i11, Map map) {
        Charset charset = StandardCharsets.ISO_8859_1;
        int i12 = 33;
        int i13 = 0;
        if (map != null) {
            Tc.c cVar = Tc.c.CHARACTER_SET;
            if (map.containsKey(cVar)) {
                charset = Charset.forName(map.get(cVar).toString());
            }
            Tc.c cVar2 = Tc.c.ERROR_CORRECTION;
            if (map.containsKey(cVar2)) {
                i12 = Integer.parseInt(map.get(cVar2).toString());
            }
            Tc.c cVar3 = Tc.c.AZTEC_LAYERS;
            if (map.containsKey(cVar3)) {
                i13 = Integer.parseInt(map.get(cVar3).toString());
            }
        }
        return b(str, aVar, i10, i11, charset, i12, i13);
    }
}
