package Xg;

import Wg.a;
import Yg.h;
import Yg.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.g;

/* renamed from: Xg.l  reason: case insensitive filesystem */
abstract /* synthetic */ class C5700l {
    public static final C5694f a(C5694f fVar, int i10, a aVar) {
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        } else if (i10 != -1 || aVar == a.SUSPEND) {
            if (i10 == -1) {
                aVar = a.DROP_OLDEST;
                i10 = 0;
            }
            int i11 = i10;
            a aVar2 = aVar;
            if (fVar instanceof q) {
                return q.a.a((q) fVar, (g) null, i11, aVar2, 1, (Object) null);
            }
            return new h(fVar, (g) null, i11, aVar2, 2, (DefaultConstructorMarker) null);
        } else {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
    }

    public static /* synthetic */ C5694f b(C5694f fVar, int i10, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        return C5696h.c(fVar, i10, aVar);
    }

    public static final C5694f c(C5694f fVar) {
        return b(fVar, -1, (a) null, 2, (Object) null);
    }
}
