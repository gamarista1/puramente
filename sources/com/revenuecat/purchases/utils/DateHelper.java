package com.revenuecat.purchases.utils;

import Tg.a;
import Tg.c;
import Tg.d;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/utils/DateHelper;", "", "()V", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DateHelper {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final long ENTITLEMENT_GRACE_PERIOD = c.s(3, d.DAYS);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\u00020\u00078\u0002X\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/utils/DateHelper$Companion;", "", "<init>", "()V", "Ljava/util/Date;", "expirationDate", "requestDate", "LTg/a;", "gracePeriod", "Lcom/revenuecat/purchases/utils/DateActive;", "isDateActive-SxA4cEA", "(Ljava/util/Date;Ljava/util/Date;J)Lcom/revenuecat/purchases/utils/DateActive;", "isDateActive", "ENTITLEMENT_GRACE_PERIOD", "J", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: isDateActive-SxA4cEA$default  reason: not valid java name */
        public static /* synthetic */ DateActive m127isDateActiveSxA4cEA$default(Companion companion, Date date, Date date2, long j10, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                j10 = DateHelper.ENTITLEMENT_GRACE_PERIOD;
            }
            return companion.m128isDateActiveSxA4cEA(date, date2, j10);
        }

        /* renamed from: isDateActive-SxA4cEA  reason: not valid java name */
        public final DateActive m128isDateActiveSxA4cEA(Date date, Date date2, long j10) {
            C6496s.h(date2, "requestDate");
            boolean z10 = true;
            if (date == null) {
                return new DateActive(true, true);
            }
            if (new Date().getTime() - date2.getTime() > a.t(j10)) {
                z10 = false;
            }
            if (!z10) {
                date2 = new Date();
            }
            return new DateActive(date.after(date2), z10);
        }

        private Companion() {
        }
    }

    static {
        a.C0955a aVar = a.f65168b;
    }

    private DateHelper() {
    }
}
