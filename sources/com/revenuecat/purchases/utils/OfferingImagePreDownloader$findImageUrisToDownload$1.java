package com.revenuecat.purchases.utils;

import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import com.revenuecat.purchases.paywalls.components.IconComponent;
import com.revenuecat.purchases.paywalls.components.ImageComponent;
import com.revenuecat.purchases.paywalls.components.PaywallComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.TabsComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "invoke", "(Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class OfferingImagePreDownloader$findImageUrisToDownload$1 extends C6498u implements C6798l {
    public static final OfferingImagePreDownloader$findImageUrisToDownload$1 INSTANCE = new OfferingImagePreDownloader$findImageUrisToDownload$1();

    OfferingImagePreDownloader$findImageUrisToDownload$1() {
        super(1);
    }

    public final Boolean invoke(PaywallComponent paywallComponent) {
        C6496s.h(paywallComponent, "it");
        return Boolean.valueOf((paywallComponent instanceof StackComponent) || (paywallComponent instanceof IconComponent) || (paywallComponent instanceof CarouselComponent) || (paywallComponent instanceof TabsComponent) || (paywallComponent instanceof ImageComponent));
    }
}
