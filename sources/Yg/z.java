package Yg;

import Xg.C;
import Xg.L;
import com.google.android.gms.common.api.a;

final class z extends C implements L {
    public z(int i10) {
        super(1, a.e.API_PRIORITY_OTHER, Wg.a.DROP_OLDEST);
        b(Integer.valueOf(i10));
    }

    /* renamed from: Z */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(((Number) M()).intValue());
        }
        return valueOf;
    }

    public final boolean a0(int i10) {
        boolean b10;
        synchronized (this) {
            b10 = b(Integer.valueOf(((Number) M()).intValue() + i10));
        }
        return b10;
    }
}
