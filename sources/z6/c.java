package z6;

import Ef.i;
import Ef.m;
import java.util.LinkedHashMap;
import java.util.Map;
import mf.C6565s;
import mf.O;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final int f50082a;

    public c(int i10) {
        this.f50082a = i10;
    }

    public final Map a(int i10, int i11, int i12) {
        float c10 = m.c(((float) m.h(m.d(i12, 1), this.f50082a)) * b(i10), 0.0f);
        float f10 = (float) i11;
        float g10 = f10 / m.g(c10, f10);
        int i13 = 0;
        i u10 = m.u(0, i11);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(O.e(C6565s.y(u10, 10)), 16));
        for (Object next : u10) {
            int intValue = ((Number) next).intValue();
            if (((int) (((float) intValue) % g10)) == 0) {
                i13 = intValue;
            }
            linkedHashMap.put(next, Integer.valueOf(i13));
        }
        return linkedHashMap;
    }

    public final float b(int i10) {
        return ((float) i10) / 1000.0f;
    }
}
