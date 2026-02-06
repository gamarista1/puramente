package com.revenuecat.purchases.common;

import com.revenuecat.purchases.common.networking.HTTPResult;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"isSuccessful", "", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BackendHelperKt {
    public static final boolean isSuccessful(HTTPResult hTTPResult) {
        C6496s.h(hTTPResult, "<this>");
        if (hTTPResult.getResponseCode() < 300) {
            return true;
        }
        return false;
    }
}
