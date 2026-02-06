package E9;

import D9.a;
import D9.d;
import D9.g;
import ja.A;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import nb.C5110e;

public final class b extends g {
    private static a c(A a10) {
        a10.r(12);
        int d10 = (a10.d() + a10.h(12)) - 4;
        a10.r(44);
        a10.s(a10.h(12));
        a10.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (a10.d() >= d10) {
                break;
            }
            a10.r(48);
            int h10 = a10.h(8);
            a10.r(4);
            int d11 = a10.d() + a10.h(12);
            String str2 = null;
            while (a10.d() < d11) {
                int h11 = a10.h(8);
                int h12 = a10.h(8);
                int d12 = a10.d() + h12;
                if (h11 == 2) {
                    int h13 = a10.h(16);
                    a10.r(8);
                    if (h13 != 3) {
                    }
                    while (a10.d() < d12) {
                        str = a10.l(a10.h(8), C5110e.f61083a);
                        int h14 = a10.h(8);
                        for (int i10 = 0; i10 < h14; i10++) {
                            a10.s(a10.h(8));
                        }
                    }
                } else if (h11 == 21) {
                    str2 = a10.l(h12, C5110e.f61083a);
                }
                a10.p(d12 * 8);
            }
            a10.p(d11 * 8);
            if (!(str == null || str2 == null)) {
                arrayList.add(new a(h10, str + str2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new a((List) arrayList);
    }

    /* access modifiers changed from: protected */
    public a b(d dVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new A(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
