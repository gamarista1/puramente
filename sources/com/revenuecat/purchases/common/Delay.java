package com.revenuecat.purchases.common;

import Tg.c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001c\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/common/Delay;", "", "LTg/a;", "minDelay", "maxDelay", "<init>", "(Ljava/lang/String;IJJ)V", "J", "getMinDelay-UwyO8pc", "()J", "getMaxDelay-UwyO8pc", "NONE", "DEFAULT", "LONG", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum Delay {
    NONE(c.s(0, r8), c.s(0, r8)),
    DEFAULT(r13, r1.m47getJitterDelayUwyO8pc()),
    LONG(r1.m47getJitterDelayUwyO8pc(), r1.m48getJitterLongDelayUwyO8pc());
    
    private final long maxDelay;
    private final long minDelay;

    private Delay(long j10, long j11) {
        this.minDelay = j10;
        this.maxDelay = j11;
    }

    /* renamed from: getMaxDelay-UwyO8pc  reason: not valid java name */
    public final long m45getMaxDelayUwyO8pc() {
        return this.maxDelay;
    }

    /* renamed from: getMinDelay-UwyO8pc  reason: not valid java name */
    public final long m46getMinDelayUwyO8pc() {
        return this.minDelay;
    }
}
