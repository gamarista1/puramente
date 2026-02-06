package com.revenuecat.purchases.common;

import com.revenuecat.purchases.LogHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class LogUtilsKt$debugLog$1 extends C6494p implements p {
    LogUtilsKt$debugLog$1(Object obj) {
        super(2, obj, LogHandler.class, "d", "d(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (String) obj2);
        return C6514M.f71813a;
    }

    public final void invoke(String str, String str2) {
        C6496s.h(str, "p0");
        C6496s.h(str2, "p1");
        ((LogHandler) this.receiver).d(str, str2);
    }
}
