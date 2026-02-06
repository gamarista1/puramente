package com.revenuecat.purchases.google;

import com.revenuecat.purchases.common.caching.DeviceCache;
import kotlin.Metadata;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class BillingWrapper$consumeAndSave$2 extends C6494p implements C6798l {
    BillingWrapper$consumeAndSave$2(Object obj) {
        super(1, obj, DeviceCache.class, "addSuccessfullyPostedToken", "addSuccessfullyPostedToken(Ljava/lang/String;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C6514M.f71813a;
    }

    public final void invoke(String str) {
        C6496s.h(str, "p0");
        ((DeviceCache) this.receiver).addSuccessfullyPostedToken(str);
    }
}
