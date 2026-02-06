package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import gh.C5978b;
import gh.C5985i;
import kotlin.Metadata;

@C5985i(with = PaywallComponentSerializer.class)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0001\u000e\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "", "Companion", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent;", "Lcom/revenuecat/purchases/paywalls/components/IconComponent;", "Lcom/revenuecat/purchases/paywalls/components/ImageComponent;", "Lcom/revenuecat/purchases/paywalls/components/PackageComponent;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Lcom/revenuecat/purchases/paywalls/components/StickyFooterComponent;", "Lcom/revenuecat/purchases/paywalls/components/TabControlButtonComponent;", "Lcom/revenuecat/purchases/paywalls/components/TabControlComponent;", "Lcom/revenuecat/purchases/paywalls/components/TabControlToggleComponent;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent;", "Lcom/revenuecat/purchases/paywalls/components/TextComponent;", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public interface PaywallComponent {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PaywallComponent$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final C5978b serializer() {
            return new PaywallComponentSerializer();
        }
    }
}
