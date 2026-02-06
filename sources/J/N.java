package J;

import Q0.C1333p;
import Q0.C1337u;
import Q0.T;
import Sg.p;
import V0.h;
import c1.c;
import c1.d;
import c1.s;
import java.util.List;
import mf.C6565s;

public abstract class N {

    /* renamed from: a  reason: collision with root package name */
    private static final String f2900a = p.z("H", 10);

    public static final long a(T t10, d dVar, h.b bVar, String str, int i10) {
        String str2 = str;
        T t11 = t10;
        C1333p b10 = C1337u.b(str2, t11, c.b(0, 0, 0, 0, 15, (Object) null), dVar, bVar, C6565s.n(), (List) null, i10, false, 64, (Object) null);
        return s.a(J.a(b10.b()), J.a(b10.d()));
    }

    public static /* synthetic */ long b(T t10, d dVar, h.b bVar, String str, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str = f2900a;
        }
        if ((i11 & 16) != 0) {
            i10 = 1;
        }
        return a(t10, dVar, bVar, str, i10);
    }

    public static final String c() {
        return f2900a;
    }
}
