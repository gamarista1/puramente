package J2;

import I2.c;
import f2.z;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import nb.C5110e;

public final class b extends c {
    private static z c(i2.z zVar) {
        zVar.r(12);
        int d10 = (zVar.d() + zVar.h(12)) - 4;
        zVar.r(44);
        zVar.s(zVar.h(12));
        zVar.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (zVar.d() >= d10) {
                break;
            }
            zVar.r(48);
            int h10 = zVar.h(8);
            zVar.r(4);
            int d11 = zVar.d() + zVar.h(12);
            String str2 = null;
            while (zVar.d() < d11) {
                int h11 = zVar.h(8);
                int h12 = zVar.h(8);
                int d12 = zVar.d() + h12;
                if (h11 == 2) {
                    int h13 = zVar.h(16);
                    zVar.r(8);
                    if (h13 != 3) {
                    }
                    while (zVar.d() < d12) {
                        str = zVar.l(zVar.h(8), C5110e.f61083a);
                        int h14 = zVar.h(8);
                        for (int i10 = 0; i10 < h14; i10++) {
                            zVar.s(zVar.h(8));
                        }
                    }
                } else if (h11 == 21) {
                    str2 = zVar.l(h12, C5110e.f61083a);
                }
                zVar.p(d12 * 8);
            }
            zVar.p(d11 * 8);
            if (!(str == null || str2 == null)) {
                arrayList.add(new a(h10, str + str2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new z((List) arrayList);
    }

    /* access modifiers changed from: protected */
    public z b(I2.b bVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new i2.z(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
