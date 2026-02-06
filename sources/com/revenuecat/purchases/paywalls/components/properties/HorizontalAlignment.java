package com.revenuecat.purchases.paywalls.components.properties;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import gh.C5978b;
import gh.C5985i;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import lf.C6534r;

@C5985i
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;", "", "(Ljava/lang/String;I)V", "LEADING", "CENTER", "TRAILING", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public enum HorizontalAlignment {
    LEADING,
    CENTER,
    TRAILING;
    
    /* access modifiers changed from: private */
    public static final Lazy $cachedSerializer$delegate = null;
    public static final Companion Companion = null;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ C5978b get$cachedSerializer() {
            return (C5978b) HorizontalAlignment.$cachedSerializer$delegate.getValue();
        }

        public final C5978b serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
        $cachedSerializer$delegate = C6531o.a(C6534r.PUBLICATION, Companion.AnonymousClass1.INSTANCE);
    }
}
