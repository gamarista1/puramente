package com.revenuecat.purchases.google.usecase;

import Tg.a;
import Tg.c;
import Tg.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002XT¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0017\u0010\u0004\u001a\u00020\u00038\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u001d\u0010\u0006\u001a\u00020\u00038\u0000X\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\u0007\u0010\b\"\u001d\u0010\t\u001a\u00020\u00038\u0000X\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\b*L\b\u0000\u0010\u0010\"\"\u0012\u0004\u0012\u00020\f\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0004\u0012\u00020\u000f0\u000b2\"\u0012\u0004\u0012\u00020\f\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0004\u0012\u00020\u000f0\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"", "MAX_RETRIES_DEFAULT", "I", "LTg/a;", "RETRY_TIMER_START", "J", "RETRY_TIMER_MAX_TIME", "getRETRY_TIMER_MAX_TIME", "()J", "RETRY_TIMER_SERVICE_UNAVAILABLE_MAX_TIME_FOREGROUND", "getRETRY_TIMER_SERVICE_UNAVAILABLE_MAX_TIME_FOREGROUND", "Lkotlin/Function2;", "", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Llf/M;", "ExecuteRequestOnUIThreadFunction", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BillingClientUseCaseKt {
    private static final int MAX_RETRIES_DEFAULT = 3;
    private static final long RETRY_TIMER_MAX_TIME = c.s(15, d.MINUTES);
    private static final long RETRY_TIMER_SERVICE_UNAVAILABLE_MAX_TIME_FOREGROUND = c.s(4, d.SECONDS);
    /* access modifiers changed from: private */
    public static final long RETRY_TIMER_START = c.s(878, d.MILLISECONDS);

    static {
        a.C0955a aVar = a.f65168b;
    }

    public static final long getRETRY_TIMER_MAX_TIME() {
        return RETRY_TIMER_MAX_TIME;
    }

    public static final long getRETRY_TIMER_SERVICE_UNAVAILABLE_MAX_TIME_FOREGROUND() {
        return RETRY_TIMER_SERVICE_UNAVAILABLE_MAX_TIME_FOREGROUND;
    }
}
