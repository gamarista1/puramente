package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import gh.C5978b;
import gh.C5985i;
import kotlin.Lazy;
import kotlin.Metadata;
import lf.C6531o;
import lf.C6534r;

@C5985i
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabControlComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "<init>", "()V", "Lgh/b;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class TabControlComponent implements PaywallComponent {
    private static final /* synthetic */ Lazy $cachedSerializer$delegate = C6531o.a(C6534r.PUBLICATION, AnonymousClass1.INSTANCE);
    public static final TabControlComponent INSTANCE = new TabControlComponent();

    private TabControlComponent() {
    }

    private final /* synthetic */ C5978b get$cachedSerializer() {
        return (C5978b) $cachedSerializer$delegate.getValue();
    }

    public final C5978b serializer() {
        return get$cachedSerializer();
    }
}
