package com.revenuecat.purchases.common;

import Tg.a;
import Tg.c;
import Tg.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/common/DispatcherConstants;", "", "<init>", "()V", "LTg/a;", "jitterDelay", "J", "getJitterDelay-UwyO8pc", "()J", "jitterLongDelay", "getJitterLongDelay-UwyO8pc", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DispatcherConstants {
    public static final DispatcherConstants INSTANCE = new DispatcherConstants();
    private static final long jitterDelay;
    private static final long jitterLongDelay;

    static {
        a.C0955a aVar = a.f65168b;
        d dVar = d.MILLISECONDS;
        jitterDelay = c.t(5000, dVar);
        jitterLongDelay = c.t(10000, dVar);
    }

    private DispatcherConstants() {
    }

    /* renamed from: getJitterDelay-UwyO8pc  reason: not valid java name */
    public final long m47getJitterDelayUwyO8pc() {
        return jitterDelay;
    }

    /* renamed from: getJitterLongDelay-UwyO8pc  reason: not valid java name */
    public final long m48getJitterLongDelayUwyO8pc() {
        return jitterLongDelay;
    }
}
