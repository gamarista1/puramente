package com.revenuecat.purchases.models;

import Sg.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<no name provided>", "", "part", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class PeriodKt$toPeriod$1$toInt$1 extends C6498u implements C6798l {
    public static final PeriodKt$toPeriod$1$toInt$1 INSTANCE = new PeriodKt$toPeriod$1$toInt$1();

    PeriodKt$toPeriod$1$toInt$1() {
        super(1);
    }

    public final Integer invoke(String str) {
        C6496s.h(str, "part");
        Integer m10 = p.m(p.i1(str, 1));
        return Integer.valueOf(m10 != null ? m10.intValue() : 0);
    }
}
