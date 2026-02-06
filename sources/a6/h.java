package A6;

import Ef.i;
import Ef.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mf.C6565s;
import mf.L;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final int f29414a;

    public h(int i10) {
        this.f29414a = i10;
    }

    public final int a(int i10) {
        int i11 = i10 % this.f29414a;
        Integer valueOf = Integer.valueOf(i11);
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return i11 + this.f29414a;
    }

    public final int b() {
        return this.f29414a;
    }

    public final boolean c(int i10, int i11, int i12) {
        int a10 = a(i12 + i10);
        if (i10 < a10) {
            if (i10 <= i11 && i11 <= a10) {
                return true;
            }
        } else if (i10 <= i11 && i11 <= this.f29414a) {
            return true;
        } else {
            if (i11 >= 0 && i11 <= a10) {
                return true;
            }
        }
        return false;
    }

    public final List d(int i10, int i11) {
        i u10 = m.u(0, i11);
        ArrayList arrayList = new ArrayList(C6565s.y(u10, 10));
        Iterator it = u10.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(a(((L) it).a() + i10)));
        }
        return arrayList;
    }
}
