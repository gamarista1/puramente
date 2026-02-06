package Cf;

import Ef.i;
import Ef.l;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import kotlin.jvm.internal.C6496s;

public abstract class d {
    public static final String a(Object obj, Object obj2) {
        C6496s.h(obj, TicketDetailDestinationKt.LAUNCHED_FROM);
        C6496s.h(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    public static final void b(int i10, int i11) {
        if (i11 <= i10) {
            throw new IllegalArgumentException(a(Integer.valueOf(i10), Integer.valueOf(i11)).toString());
        }
    }

    public static final void c(long j10, long j11) {
        if (j11 <= j10) {
            throw new IllegalArgumentException(a(Long.valueOf(j10), Long.valueOf(j11)).toString());
        }
    }

    public static final int d(int i10) {
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    public static final int e(c cVar, i iVar) {
        C6496s.h(cVar, "<this>");
        C6496s.h(iVar, "range");
        if (iVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + iVar);
        } else if (iVar.n() < Integer.MAX_VALUE) {
            return cVar.f(iVar.k(), iVar.n() + 1);
        } else {
            if (iVar.k() > Integer.MIN_VALUE) {
                return cVar.f(iVar.k() - 1, iVar.n()) + 1;
            }
            return cVar.d();
        }
    }

    public static final long f(c cVar, l lVar) {
        C6496s.h(cVar, "<this>");
        C6496s.h(lVar, "range");
        if (lVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + lVar);
        } else if (lVar.n() < Long.MAX_VALUE) {
            return cVar.h(lVar.k(), lVar.n() + 1);
        } else {
            if (lVar.k() > Long.MIN_VALUE) {
                return cVar.h(lVar.k() - 1, lVar.n()) + 1;
            }
            return cVar.g();
        }
    }

    public static final int g(int i10, int i11) {
        return (i10 >>> (32 - i11)) & ((-i11) >> 31);
    }
}
