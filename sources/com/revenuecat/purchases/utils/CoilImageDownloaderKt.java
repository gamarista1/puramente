package com.revenuecat.purchases.utils;

import X3.g;
import android.content.Context;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/content/Context;", "LX3/g;", "getRevenueCatUIImageLoader", "(Landroid/content/Context;)LX3/g;", "", "MAX_CACHE_SIZE_BYTES", "J", "", "PAYWALL_IMAGE_CACHE_FOLDER", "Ljava/lang/String;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CoilImageDownloaderKt {
    private static final long MAX_CACHE_SIZE_BYTES = 26214400;
    private static final String PAYWALL_IMAGE_CACHE_FOLDER = "revenuecatui_cache";

    /* access modifiers changed from: private */
    public static final g getRevenueCatUIImageLoader(Context context) {
        return new g.a(context).j(new CoilImageDownloaderKt$getRevenueCatUIImageLoader$1(context)).e();
    }
}
