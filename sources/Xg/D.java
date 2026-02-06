package Xg;

import Wg.a;
import Yg.h;
import Zg.G;
import com.google.android.gms.common.api.a;
import qf.g;

public abstract class D {

    /* renamed from: a  reason: collision with root package name */
    public static final G f66431a = new G("NO_VALUE");

    public static final w a(int i10, int i11, a aVar) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i10).toString());
        } else if (i11 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i11).toString());
        } else if (i10 > 0 || i11 > 0 || aVar == a.SUSPEND) {
            int i12 = i11 + i10;
            if (i12 < 0) {
                i12 = a.e.API_PRIORITY_OTHER;
            }
            return new C(i10, i12, aVar);
        } else {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
        }
    }

    public static /* synthetic */ w b(int i10, int i11, Wg.a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            aVar = Wg.a.SUSPEND;
        }
        return a(i10, i11, aVar);
    }

    public static final C5694f e(B b10, g gVar, int i10, Wg.a aVar) {
        if ((i10 == 0 || i10 == -3) && aVar == Wg.a.SUSPEND) {
            return b10;
        }
        return new h(b10, gVar, i10, aVar);
    }

    /* access modifiers changed from: private */
    public static final Object f(Object[] objArr, long j10) {
        return objArr[((int) j10) & (objArr.length - 1)];
    }

    /* access modifiers changed from: private */
    public static final void g(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }
}
