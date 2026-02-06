package com.revenuecat.purchases;

import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001IBQ\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u0015\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\rHÆ\u0003J[\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0012\u0010=\u001a\u0004\u0018\u00010\t2\u0006\u0010>\u001a\u00020?H\u0002J\u0011\u0010@\u001a\u00020\t2\u0006\u0010A\u001a\u00020\u0003H\u0002J\u0016\u0010B\u001a\u00020\u00032\u0006\u0010C\u001a\u00020\u00032\u0006\u0010D\u001a\u00020\u0003J\u000e\u0010E\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003J\t\u0010F\u001a\u00020GHÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\u000f\u001a\u0004\u0018\u00010\t8FX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\t8FX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0019\u0010\u0011R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001d\u001a\u0004\u0018\u00010\t8FX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b\u001e\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u001d\u0010'\u001a\u0004\u0018\u00010\t8FX\u0002¢\u0006\f\n\u0004\b)\u0010\u0013\u001a\u0004\b(\u0010\u0011R\u001d\u0010*\u001a\u0004\u0018\u00010\t8FX\u0002¢\u0006\f\n\u0004\b,\u0010\u0013\u001a\u0004\b+\u0010\u0011R\u001d\u0010-\u001a\u0004\u0018\u00010\t8FX\u0002¢\u0006\f\n\u0004\b/\u0010\u0013\u001a\u0004\b.\u0010\u0011R\u001d\u00100\u001a\u0004\u0018\u00010\t8FX\u0002¢\u0006\f\n\u0004\b2\u0010\u0013\u001a\u0004\b1\u0010\u0011¨\u0006J"}, d2 = {"Lcom/revenuecat/purchases/Offering;", "", "identifier", "", "serverDescription", "metadata", "", "availablePackages", "", "Lcom/revenuecat/purchases/Package;", "paywall", "Lcom/revenuecat/purchases/paywalls/PaywallData;", "paywallComponents", "Lcom/revenuecat/purchases/Offering$PaywallComponents;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lcom/revenuecat/purchases/paywalls/PaywallData;Lcom/revenuecat/purchases/Offering$PaywallComponents;)V", "annual", "getAnnual", "()Lcom/revenuecat/purchases/Package;", "annual$delegate", "Lkotlin/Lazy;", "getAvailablePackages", "()Ljava/util/List;", "getIdentifier", "()Ljava/lang/String;", "lifetime", "getLifetime", "lifetime$delegate", "getMetadata", "()Ljava/util/Map;", "monthly", "getMonthly", "monthly$delegate", "getPaywall", "()Lcom/revenuecat/purchases/paywalls/PaywallData;", "getPaywallComponents$annotations", "()V", "getPaywallComponents", "()Lcom/revenuecat/purchases/Offering$PaywallComponents;", "getServerDescription", "sixMonth", "getSixMonth", "sixMonth$delegate", "threeMonth", "getThreeMonth", "threeMonth$delegate", "twoMonth", "getTwoMonth", "twoMonth$delegate", "weekly", "getWeekly", "weekly$delegate", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "findPackage", "packageType", "Lcom/revenuecat/purchases/PackageType;", "get", "s", "getMetadataString", "key", "default", "getPackage", "hashCode", "", "toString", "PaywallComponents", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Offering {
    private final Lazy annual$delegate;
    private final List<Package> availablePackages;
    private final String identifier;
    private final Lazy lifetime$delegate;
    private final Map<String, Object> metadata;
    private final Lazy monthly$delegate;
    private final PaywallData paywall;
    private final PaywallComponents paywallComponents;
    private final String serverDescription;
    private final Lazy sixMonth$delegate;
    private final Lazy threeMonth$delegate;
    private final Lazy twoMonth$delegate;
    private final Lazy weekly$delegate;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/Offering$PaywallComponents;", "", "uiConfig", "Lcom/revenuecat/purchases/UiConfig;", "data", "Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "(Lcom/revenuecat/purchases/UiConfig;Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;)V", "getData", "()Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "getUiConfig", "()Lcom/revenuecat/purchases/UiConfig;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @InternalRevenueCatAPI
    public static final class PaywallComponents {
        private final PaywallComponentsData data;
        private final UiConfig uiConfig;

        public PaywallComponents(UiConfig uiConfig2, PaywallComponentsData paywallComponentsData) {
            C6496s.h(uiConfig2, "uiConfig");
            C6496s.h(paywallComponentsData, "data");
            this.uiConfig = uiConfig2;
            this.data = paywallComponentsData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaywallComponents)) {
                return false;
            }
            PaywallComponents paywallComponents = (PaywallComponents) obj;
            return C6496s.c(this.uiConfig, paywallComponents.uiConfig) && C6496s.c(this.data, paywallComponents.data);
        }

        public final PaywallComponentsData getData() {
            return this.data;
        }

        public final UiConfig getUiConfig() {
            return this.uiConfig;
        }

        public int hashCode() {
            return (this.uiConfig.hashCode() * 31) + this.data.hashCode();
        }

        public String toString() {
            return "PaywallComponents(uiConfig=" + this.uiConfig + ", data=" + this.data + ')';
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Offering(String str, String str2, Map<String, ? extends Object> map, List<Package> list) {
        this(str, str2, map, list, (PaywallData) null, (PaywallComponents) null, 48, (DefaultConstructorMarker) null);
        C6496s.h(str, "identifier");
        C6496s.h(str2, "serverDescription");
        C6496s.h(map, "metadata");
        C6496s.h(list, "availablePackages");
    }

    public static /* synthetic */ Offering copy$default(Offering offering, String str, String str2, Map<String, Object> map, List<Package> list, PaywallData paywallData, PaywallComponents paywallComponents2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = offering.identifier;
        }
        if ((i10 & 2) != 0) {
            str2 = offering.serverDescription;
        }
        String str3 = str2;
        if ((i10 & 4) != 0) {
            map = offering.metadata;
        }
        Map<String, Object> map2 = map;
        if ((i10 & 8) != 0) {
            list = offering.availablePackages;
        }
        List<Package> list2 = list;
        if ((i10 & 16) != 0) {
            paywallData = offering.paywall;
        }
        PaywallData paywallData2 = paywallData;
        if ((i10 & 32) != 0) {
            paywallComponents2 = offering.paywallComponents;
        }
        return offering.copy(str, str3, map2, list2, paywallData2, paywallComponents2);
    }

    /* access modifiers changed from: private */
    public final Package findPackage(PackageType packageType) {
        Object obj;
        Iterator it = this.availablePackages.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C6496s.c(((Package) obj).getIdentifier(), packageType.getIdentifier())) {
                break;
            }
        }
        return (Package) obj;
    }

    @InternalRevenueCatAPI
    public static /* synthetic */ void getPaywallComponents$annotations() {
    }

    public final String component1() {
        return this.identifier;
    }

    public final String component2() {
        return this.serverDescription;
    }

    public final Map<String, Object> component3() {
        return this.metadata;
    }

    public final List<Package> component4() {
        return this.availablePackages;
    }

    public final PaywallData component5() {
        return this.paywall;
    }

    public final PaywallComponents component6() {
        return this.paywallComponents;
    }

    public final Offering copy(String str, String str2, Map<String, ? extends Object> map, List<Package> list, PaywallData paywallData, PaywallComponents paywallComponents2) {
        C6496s.h(str, "identifier");
        C6496s.h(str2, "serverDescription");
        C6496s.h(map, "metadata");
        C6496s.h(list, "availablePackages");
        return new Offering(str, str2, map, list, paywallData, paywallComponents2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Offering)) {
            return false;
        }
        Offering offering = (Offering) obj;
        return C6496s.c(this.identifier, offering.identifier) && C6496s.c(this.serverDescription, offering.serverDescription) && C6496s.c(this.metadata, offering.metadata) && C6496s.c(this.availablePackages, offering.availablePackages) && C6496s.c(this.paywall, offering.paywall) && C6496s.c(this.paywallComponents, offering.paywallComponents);
    }

    public final Package get(String str) {
        C6496s.h(str, "s");
        return getPackage(str);
    }

    public final Package getAnnual() {
        return (Package) this.annual$delegate.getValue();
    }

    public final List<Package> getAvailablePackages() {
        return this.availablePackages;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Package getLifetime() {
        return (Package) this.lifetime$delegate.getValue();
    }

    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public final String getMetadataString(String str, String str2) {
        String str3;
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(str2, "default");
        Object obj = this.metadata.get(str);
        if (obj instanceof String) {
            str3 = (String) obj;
        } else {
            str3 = null;
        }
        if (str3 == null) {
            return str2;
        }
        return str3;
    }

    public final Package getMonthly() {
        return (Package) this.monthly$delegate.getValue();
    }

    public final Package getPackage(String str) {
        C6496s.h(str, "identifier");
        for (Package packageR : this.availablePackages) {
            if (C6496s.c(packageR.getIdentifier(), str)) {
                return packageR;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final PaywallData getPaywall() {
        return this.paywall;
    }

    public final PaywallComponents getPaywallComponents() {
        return this.paywallComponents;
    }

    public final String getServerDescription() {
        return this.serverDescription;
    }

    public final Package getSixMonth() {
        return (Package) this.sixMonth$delegate.getValue();
    }

    public final Package getThreeMonth() {
        return (Package) this.threeMonth$delegate.getValue();
    }

    public final Package getTwoMonth() {
        return (Package) this.twoMonth$delegate.getValue();
    }

    public final Package getWeekly() {
        return (Package) this.weekly$delegate.getValue();
    }

    public int hashCode() {
        int hashCode = ((((((this.identifier.hashCode() * 31) + this.serverDescription.hashCode()) * 31) + this.metadata.hashCode()) * 31) + this.availablePackages.hashCode()) * 31;
        PaywallData paywallData = this.paywall;
        int i10 = 0;
        int hashCode2 = (hashCode + (paywallData == null ? 0 : paywallData.hashCode())) * 31;
        PaywallComponents paywallComponents2 = this.paywallComponents;
        if (paywallComponents2 != null) {
            i10 = paywallComponents2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "Offering(identifier=" + this.identifier + ", serverDescription=" + this.serverDescription + ", metadata=" + this.metadata + ", availablePackages=" + this.availablePackages + ", paywall=" + this.paywall + ", paywallComponents=" + this.paywallComponents + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Offering(String str, String str2, Map<String, ? extends Object> map, List<Package> list, PaywallData paywallData) {
        this(str, str2, map, list, paywallData, (PaywallComponents) null, 32, (DefaultConstructorMarker) null);
        C6496s.h(str, "identifier");
        C6496s.h(str2, "serverDescription");
        C6496s.h(map, "metadata");
        C6496s.h(list, "availablePackages");
    }

    public Offering(String str, String str2, Map<String, ? extends Object> map, List<Package> list, PaywallData paywallData, PaywallComponents paywallComponents2) {
        C6496s.h(str, "identifier");
        C6496s.h(str2, "serverDescription");
        C6496s.h(map, "metadata");
        C6496s.h(list, "availablePackages");
        this.identifier = str;
        this.serverDescription = str2;
        this.metadata = map;
        this.availablePackages = list;
        this.paywall = paywallData;
        this.paywallComponents = paywallComponents2;
        this.lifetime$delegate = C6531o.b(new Offering$lifetime$2(this));
        this.annual$delegate = C6531o.b(new Offering$annual$2(this));
        this.sixMonth$delegate = C6531o.b(new Offering$sixMonth$2(this));
        this.threeMonth$delegate = C6531o.b(new Offering$threeMonth$2(this));
        this.twoMonth$delegate = C6531o.b(new Offering$twoMonth$2(this));
        this.monthly$delegate = C6531o.b(new Offering$monthly$2(this));
        this.weekly$delegate = C6531o.b(new Offering$weekly$2(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Offering(String str, String str2, Map map, List list, PaywallData paywallData, PaywallComponents paywallComponents2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, map, list, (i10 & 16) != 0 ? null : paywallData, (i10 & 32) != 0 ? null : paywallComponents2);
    }
}
