package com.revenuecat.purchases.google;

import com.android.billingclient.api.C3198e;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/android/billingclient/api/e;", "", "toHumanReadableDescription", "(Lcom/android/billingclient/api/e;)Ljava/lang/String;", "", "isSuccessful", "(Lcom/android/billingclient/api/e;)Z", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BillingResultExtensionsKt {
    public static final boolean isSuccessful(C3198e eVar) {
        C6496s.h(eVar, "<this>");
        if (eVar.b() == 0) {
            return true;
        }
        return false;
    }

    public static final String toHumanReadableDescription(C3198e eVar) {
        C6496s.h(eVar, "<this>");
        return "DebugMessage: " + eVar.a() + ". ErrorCode: " + ErrorsKt.getBillingResponseCodeName(eVar.b()) + '.';
    }
}
