package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.utils.serializers.GoogleListSerializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import gh.C5978b;
import gh.C5985i;
import ih.f;
import java.net.URL;
import java.util.List;
import java.util.Map;
import jh.d;
import kh.C6456i0;
import kh.M;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;
import mf.C6565s;

@C5985i
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0007\u0018\u0000 :2\u00020\u0001:\u0002;:Bd\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b0\b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013B\u0001\b\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\"\b\u0001\u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b\u0018\u00010\b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0010\b\u0001\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0017J(\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bHÇ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b,\u0010$\u001a\u0004\b*\u0010+R;\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b0\b8\u0006X\u0004ø\u0001\u0000¢\u0006\u0012\n\u0004\b\f\u0010-\u0012\u0004\b0\u0010$\u001a\u0004\b.\u0010/R)\u0010\r\u001a\u00020\t8\u0006X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\r\u0010 \u0012\u0004\b2\u0010$\u001a\u0004\b1\u0010\"R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b4\u00105R&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u00106\u0012\u0004\b9\u0010$\u001a\u0004\b7\u00108\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "", "", "templateName", "Ljava/net/URL;", "assetBaseURL", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentsConfig;", "componentsConfig", "", "Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "componentsLocalizations", "defaultLocaleIdentifier", "", "revision", "", "zeroDecimalPlaceCountries", "<init>", "(Ljava/lang/String;Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/components/common/ComponentsConfig;Ljava/util/Map;Ljava/lang/String;ILjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/components/common/ComponentsConfig;Ljava/util/Map;Ljava/lang/String;ILjava/util/List;Lkh/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;Ljh/d;Lih/f;)V", "Ljava/lang/String;", "getTemplateName", "()Ljava/lang/String;", "getTemplateName$annotations", "()V", "Ljava/net/URL;", "getAssetBaseURL", "()Ljava/net/URL;", "getAssetBaseURL$annotations", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentsConfig;", "getComponentsConfig", "()Lcom/revenuecat/purchases/paywalls/components/common/ComponentsConfig;", "getComponentsConfig$annotations", "Ljava/util/Map;", "getComponentsLocalizations", "()Ljava/util/Map;", "getComponentsLocalizations$annotations", "getDefaultLocaleIdentifier-uqtKvyA", "getDefaultLocaleIdentifier-uqtKvyA$annotations", "I", "getRevision", "()I", "Ljava/util/List;", "getZeroDecimalPlaceCountries", "()Ljava/util/List;", "getZeroDecimalPlaceCountries$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class PaywallComponentsData {
    /* access modifiers changed from: private */
    public static final C5978b[] $childSerializers = {null, null, null, new M(LocaleId$$serializer.INSTANCE, new M(LocalizationKey$$serializer.INSTANCE, LocalizationDataSerializer.INSTANCE)), null, null, null};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final URL assetBaseURL;
    private final ComponentsConfig componentsConfig;
    private final Map<LocaleId, Map<LocalizationKey, LocalizationData>> componentsLocalizations;
    private final String defaultLocaleIdentifier;
    private final int revision;
    private final String templateName;
    private final List<String> zeroDecimalPlaceCountries;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return PaywallComponentsData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C6521e
    public /* synthetic */ PaywallComponentsData(int i10, String str, @C5985i(with = URLSerializer.class) URL url, ComponentsConfig componentsConfig2, Map map, String str2, int i11, @C5985i(with = GoogleListSerializer.class) List list, t0 t0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, url, componentsConfig2, (Map<LocaleId, ? extends Map<LocalizationKey, ? extends LocalizationData>>) map, str2, i11, (List<String>) list, t0Var);
    }

    @C5985i(with = URLSerializer.class)
    public static /* synthetic */ void getAssetBaseURL$annotations() {
    }

    public static /* synthetic */ void getComponentsConfig$annotations() {
    }

    public static /* synthetic */ void getComponentsLocalizations$annotations() {
    }

    /* renamed from: getDefaultLocaleIdentifier-uqtKvyA$annotations  reason: not valid java name */
    public static /* synthetic */ void m121getDefaultLocaleIdentifieruqtKvyA$annotations() {
    }

    public static /* synthetic */ void getTemplateName$annotations() {
    }

    @C5985i(with = GoogleListSerializer.class)
    public static /* synthetic */ void getZeroDecimalPlaceCountries$annotations() {
    }

    public static final /* synthetic */ void write$Self(PaywallComponentsData paywallComponentsData, d dVar, f fVar) {
        C5978b[] bVarArr = $childSerializers;
        dVar.t(fVar, 0, paywallComponentsData.templateName);
        dVar.B(fVar, 1, URLSerializer.INSTANCE, paywallComponentsData.assetBaseURL);
        dVar.B(fVar, 2, ComponentsConfig$$serializer.INSTANCE, paywallComponentsData.componentsConfig);
        dVar.B(fVar, 3, bVarArr[3], paywallComponentsData.componentsLocalizations);
        dVar.B(fVar, 4, LocaleId$$serializer.INSTANCE, LocaleId.m85boximpl(paywallComponentsData.defaultLocaleIdentifier));
        if (dVar.q(fVar, 5) || paywallComponentsData.revision != 0) {
            dVar.i(fVar, 5, paywallComponentsData.revision);
        }
        if (dVar.q(fVar, 6) || !C6496s.c(paywallComponentsData.zeroDecimalPlaceCountries, C6565s.n())) {
            dVar.B(fVar, 6, GoogleListSerializer.INSTANCE, paywallComponentsData.zeroDecimalPlaceCountries);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallComponentsData)) {
            return false;
        }
        PaywallComponentsData paywallComponentsData = (PaywallComponentsData) obj;
        return C6496s.c(this.templateName, paywallComponentsData.templateName) && C6496s.c(this.assetBaseURL, paywallComponentsData.assetBaseURL) && C6496s.c(this.componentsConfig, paywallComponentsData.componentsConfig) && C6496s.c(this.componentsLocalizations, paywallComponentsData.componentsLocalizations) && LocaleId.m88equalsimpl0(this.defaultLocaleIdentifier, paywallComponentsData.defaultLocaleIdentifier) && this.revision == paywallComponentsData.revision && C6496s.c(this.zeroDecimalPlaceCountries, paywallComponentsData.zeroDecimalPlaceCountries);
    }

    public final /* synthetic */ URL getAssetBaseURL() {
        return this.assetBaseURL;
    }

    public final /* synthetic */ ComponentsConfig getComponentsConfig() {
        return this.componentsConfig;
    }

    public final /* synthetic */ Map getComponentsLocalizations() {
        return this.componentsLocalizations;
    }

    /* renamed from: getDefaultLocaleIdentifier-uqtKvyA  reason: not valid java name */
    public final /* synthetic */ String m122getDefaultLocaleIdentifieruqtKvyA() {
        return this.defaultLocaleIdentifier;
    }

    public final /* synthetic */ int getRevision() {
        return this.revision;
    }

    public final /* synthetic */ String getTemplateName() {
        return this.templateName;
    }

    public final /* synthetic */ List getZeroDecimalPlaceCountries() {
        return this.zeroDecimalPlaceCountries;
    }

    public int hashCode() {
        return (((((((((((this.templateName.hashCode() * 31) + this.assetBaseURL.hashCode()) * 31) + this.componentsConfig.hashCode()) * 31) + this.componentsLocalizations.hashCode()) * 31) + LocaleId.m89hashCodeimpl(this.defaultLocaleIdentifier)) * 31) + Integer.hashCode(this.revision)) * 31) + this.zeroDecimalPlaceCountries.hashCode();
    }

    public String toString() {
        return "PaywallComponentsData(templateName=" + this.templateName + ", assetBaseURL=" + this.assetBaseURL + ", componentsConfig=" + this.componentsConfig + ", componentsLocalizations=" + this.componentsLocalizations + ", defaultLocaleIdentifier=" + LocaleId.m90toStringimpl(this.defaultLocaleIdentifier) + ", revision=" + this.revision + ", zeroDecimalPlaceCountries=" + this.zeroDecimalPlaceCountries + ')';
    }

    public /* synthetic */ PaywallComponentsData(String str, URL url, ComponentsConfig componentsConfig2, Map map, String str2, int i10, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, url, componentsConfig2, map, str2, i10, list);
    }

    private PaywallComponentsData(int i10, String str, URL url, ComponentsConfig componentsConfig2, Map<LocaleId, ? extends Map<LocalizationKey, ? extends LocalizationData>> map, String str2, int i11, List<String> list, t0 t0Var) {
        if (31 != (i10 & 31)) {
            C6456i0.a(i10, 31, PaywallComponentsData$$serializer.INSTANCE.getDescriptor());
        }
        this.templateName = str;
        this.assetBaseURL = url;
        this.componentsConfig = componentsConfig2;
        this.componentsLocalizations = map;
        this.defaultLocaleIdentifier = str2;
        if ((i10 & 32) == 0) {
            this.revision = 0;
        } else {
            this.revision = i11;
        }
        if ((i10 & 64) == 0) {
            this.zeroDecimalPlaceCountries = C6565s.n();
        } else {
            this.zeroDecimalPlaceCountries = list;
        }
    }

    private PaywallComponentsData(String str, URL url, ComponentsConfig componentsConfig2, Map<LocaleId, ? extends Map<LocalizationKey, ? extends LocalizationData>> map, String str2, int i10, List<String> list) {
        C6496s.h(str, "templateName");
        C6496s.h(url, "assetBaseURL");
        C6496s.h(componentsConfig2, "componentsConfig");
        C6496s.h(map, "componentsLocalizations");
        C6496s.h(str2, "defaultLocaleIdentifier");
        C6496s.h(list, "zeroDecimalPlaceCountries");
        this.templateName = str;
        this.assetBaseURL = url;
        this.componentsConfig = componentsConfig2;
        this.componentsLocalizations = map;
        this.defaultLocaleIdentifier = str2;
        this.revision = i10;
        this.zeroDecimalPlaceCountries = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaywallComponentsData(String str, URL url, ComponentsConfig componentsConfig2, Map map, String str2, int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, url, componentsConfig2, map, str2, (i11 & 32) != 0 ? 0 : i10, (i11 & 64) != 0 ? C6565s.n() : list, (DefaultConstructorMarker) null);
    }
}
