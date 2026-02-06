package com.revenuecat.purchases.common;

import Tg.a;
import Tg.c;
import Tg.d;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a&\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"LTg/a$a;", "Ljava/util/Date;", "startTime", "endTime", "LTg/a;", "between", "(LTg/a$a;Ljava/util/Date;Ljava/util/Date;)J", "duration1", "duration2", "min-QTBD994", "(JJ)J", "min", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DurationExtensionsKt {
    public static final long between(a.C0955a aVar, Date date, Date date2) {
        C6496s.h(aVar, "<this>");
        C6496s.h(date, "startTime");
        C6496s.h(date2, "endTime");
        return c.t(date2.getTime() - date.getTime(), d.MILLISECONDS);
    }

    /* renamed from: min-QTBD994  reason: not valid java name */
    public static final long m49minQTBD994(long j10, long j11) {
        if (a.j(j10, j11) < 0) {
            return j10;
        }
        return j11;
    }
}
