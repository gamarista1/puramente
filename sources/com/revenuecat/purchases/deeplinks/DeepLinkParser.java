package com.revenuecat.purchases.deeplinks;

import Sg.p;
import android.net.Uri;
import com.revenuecat.purchases.WebPurchaseRedemption;
import com.revenuecat.purchases.common.LogUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/deeplinks/DeepLinkParser;", "", "()V", "REDEEM_WEB_PURCHASE_HOST", "", "parseWebPurchaseRedemption", "Lcom/revenuecat/purchases/WebPurchaseRedemption;", "data", "Landroid/net/Uri;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DeepLinkParser {
    public static final DeepLinkParser INSTANCE = new DeepLinkParser();
    private static final String REDEEM_WEB_PURCHASE_HOST = "redeem_web_purchase";

    private DeepLinkParser() {
    }

    public final WebPurchaseRedemption parseWebPurchaseRedemption(Uri uri) {
        C6496s.h(uri, "data");
        if (C6496s.c(uri.getHost(), REDEEM_WEB_PURCHASE_HOST)) {
            String queryParameter = uri.getQueryParameter("redemption_token");
            if (queryParameter != null && !p.d0(queryParameter)) {
                return new WebPurchaseRedemption(queryParameter);
            }
            LogUtilsKt.debugLog("Redemption token is missing web redemption deep link. Ignoring.");
            return null;
        }
        LogUtilsKt.debugLog("Unrecognized deep link host: " + uri.getHost() + ". Ignoring");
        return null;
    }
}
