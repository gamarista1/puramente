package Xg;

import Wg.a;
import Yg.t;
import Zg.G;
import qf.g;

public abstract class N {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final G f66473a = new G("NONE");
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final G f66474b = new G("PENDING");

    public static final x a(Object obj) {
        if (obj == null) {
            obj = t.f66850a;
        }
        return new M(obj);
    }

    public static final C5694f d(L l10, g gVar, int i10, a aVar) {
        if (((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != a.DROP_OLDEST) {
            return D.e(l10, gVar, i10, aVar);
        }
        return l10;
    }
}
