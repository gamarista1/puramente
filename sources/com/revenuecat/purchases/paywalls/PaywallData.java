package com.revenuecat.purchases.paywalls;

import com.BV.LinearGradient.LinearGradientManager;
import com.amazon.a.a.o.b;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.paywalls.PaywallColor;
import com.revenuecat.purchases.utils.LocaleExtensionsKt;
import com.revenuecat.purchases.utils.serializers.GoogleListSerializer;
import com.revenuecat.purchases.utils.serializers.OptionalURLSerializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import gh.C5978b;
import gh.C5985i;
import ih.f;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jh.d;
import kh.C6449f;
import kh.C6456i0;
import kh.M;
import kh.t0;
import kh.x0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6521e;
import mf.C6565s;
import mf.O;

@C5985i
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b \b\b\u0018\u0000 [2\u00020\u0001:\u0004\\[]^B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n\u0012 \b\u0002\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\n\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012B\u0001\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0016\b\u0001\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\"\b\u0001\u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\n\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J5\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fHÇ\u0001¢\u0006\u0004\b\"\u0010#J)\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000eH\u0007¢\u0006\u0004\b$\u0010\u001bJ\u0017\u0010&\u001a\u0004\u0018\u00010\u000b2\u0006\u0010%\u001a\u00020\u0017¢\u0006\u0004\b&\u0010'J%\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010%\u001a\u00020\u0017H\u0007¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b0\u00101J\u001c\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nHÀ\u0003¢\u0006\u0004\b2\u00103J(\u00106\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\nHÀ\u0003¢\u0006\u0004\b5\u00103J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eHÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010+J\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n2 \b\u0002\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\n2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b<\u0010+J\u0010\u0010=\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b=\u00101J\u001a\u0010@\u001a\u00020?2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b@\u0010AR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010B\u0012\u0004\bD\u0010E\u001a\u0004\bC\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u0010-R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010H\u0012\u0004\bJ\u0010E\u001a\u0004\bI\u0010/R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010K\u001a\u0004\bL\u00101R,\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n8\u0000X\u0004¢\u0006\u0012\n\u0004\b\f\u0010M\u0012\u0004\bO\u0010E\u001a\u0004\bN\u00103R8\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\n8\u0000X\u0004¢\u0006\u0012\n\u0004\b\r\u0010M\u0012\u0004\bQ\u0010E\u001a\u0004\bP\u00103R&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010R\u0012\u0004\bT\u0010E\u001a\u0004\bS\u00108R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010B\u0012\u0004\bV\u0010E\u001a\u0004\bU\u0010+R\u001d\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\u00198F¢\u0006\u0006\u001a\u0004\bW\u0010XR)\u0010Z\u001a\u001a\u0012\u0004\u0012\u00020\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u00198F¢\u0006\u0006\u001a\u0004\bY\u0010X¨\u0006_"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData;", "", "", "templateName", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "config", "Ljava/net/URL;", "assetBaseURL", "", "revision", "", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "localization", "localizationByTier", "", "zeroDecimalPlaceCountries", "defaultLocale", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;Ljava/net/URL;ILjava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)V", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;Ljava/net/URL;ILjava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Lkh/t0;)V", "Ljava/util/Locale;", "locales", "Lkotlin/Pair;", "tieredConfigForLocales", "(Ljava/util/List;)Lkotlin/Pair;", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/PaywallData;Ljh/d;Lih/f;)V", "localizedConfiguration", "requiredLocale", "configForLocale", "(Ljava/util/Locale;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "tieredConfigForLocale", "(Ljava/util/Locale;)Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "component3", "()Ljava/net/URL;", "component4", "()I", "component5$purchases_defaultsRelease", "()Ljava/util/Map;", "component5", "component6$purchases_defaultsRelease", "component6", "component7", "()Ljava/util/List;", "component8", "copy", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;Ljava/net/URL;ILjava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/PaywallData;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTemplateName", "getTemplateName$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "getConfig", "Ljava/net/URL;", "getAssetBaseURL", "getAssetBaseURL$annotations", "I", "getRevision", "Ljava/util/Map;", "getLocalization$purchases_defaultsRelease", "getLocalization$purchases_defaultsRelease$annotations", "getLocalizationByTier$purchases_defaultsRelease", "getLocalizationByTier$purchases_defaultsRelease$annotations", "Ljava/util/List;", "getZeroDecimalPlaceCountries", "getZeroDecimalPlaceCountries$annotations", "getDefaultLocale", "getDefaultLocale$annotations", "getLocalizedConfiguration", "()Lkotlin/Pair;", "getTieredLocalizedConfiguration", "tieredLocalizedConfiguration", "Companion", "$serializer", "Configuration", "LocalizedConfiguration", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallData {
    /* access modifiers changed from: private */
    public static final C5978b[] $childSerializers;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final URL assetBaseURL;
    private final Configuration config;
    private final String defaultLocale;
    private final Map<String, LocalizedConfiguration> localization;
    private final Map<String, Map<String, LocalizedConfiguration>> localizationByTier;
    private final int revision;
    private final String templateName;
    private final List<String> zeroDecimalPlaceCountries;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/PaywallData;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return PaywallData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        x0 x0Var = x0.f71726a;
        PaywallData$LocalizedConfiguration$$serializer paywallData$LocalizedConfiguration$$serializer = PaywallData$LocalizedConfiguration$$serializer.INSTANCE;
        $childSerializers = new C5978b[]{null, null, null, null, new M(x0Var, paywallData$LocalizedConfiguration$$serializer), new M(x0Var, new M(x0Var, paywallData$LocalizedConfiguration$$serializer)), null, null};
    }

    @C6521e
    public /* synthetic */ PaywallData(int i10, String str, Configuration configuration, @C5985i(with = URLSerializer.class) URL url, int i11, Map map, Map map2, @C5985i(with = GoogleListSerializer.class) List list, String str2, t0 t0Var) {
        if (23 != (i10 & 23)) {
            C6456i0.a(i10, 23, PaywallData$$serializer.INSTANCE.getDescriptor());
        }
        this.templateName = str;
        this.config = configuration;
        this.assetBaseURL = url;
        if ((i10 & 8) == 0) {
            this.revision = 0;
        } else {
            this.revision = i11;
        }
        this.localization = map;
        if ((i10 & 32) == 0) {
            this.localizationByTier = O.i();
        } else {
            this.localizationByTier = map2;
        }
        if ((i10 & 64) == 0) {
            this.zeroDecimalPlaceCountries = C6565s.n();
        } else {
            this.zeroDecimalPlaceCountries = list;
        }
        if ((i10 & 128) == 0) {
            this.defaultLocale = null;
        } else {
            this.defaultLocale = str2;
        }
    }

    public static /* synthetic */ PaywallData copy$default(PaywallData paywallData, String str, Configuration configuration, URL url, int i10, Map map, Map map2, List list, String str2, int i11, Object obj) {
        PaywallData paywallData2 = paywallData;
        int i12 = i11;
        return paywallData.copy((i12 & 1) != 0 ? paywallData2.templateName : str, (i12 & 2) != 0 ? paywallData2.config : configuration, (i12 & 4) != 0 ? paywallData2.assetBaseURL : url, (i12 & 8) != 0 ? paywallData2.revision : i10, (i12 & 16) != 0 ? paywallData2.localization : map, (i12 & 32) != 0 ? paywallData2.localizationByTier : map2, (i12 & 64) != 0 ? paywallData2.zeroDecimalPlaceCountries : list, (i12 & 128) != 0 ? paywallData2.defaultLocale : str2);
    }

    @C5985i(with = URLSerializer.class)
    public static /* synthetic */ void getAssetBaseURL$annotations() {
    }

    public static /* synthetic */ void getDefaultLocale$annotations() {
    }

    public static /* synthetic */ void getLocalization$purchases_defaultsRelease$annotations() {
    }

    public static /* synthetic */ void getLocalizationByTier$purchases_defaultsRelease$annotations() {
    }

    public static /* synthetic */ void getTemplateName$annotations() {
    }

    @C5985i(with = GoogleListSerializer.class)
    public static /* synthetic */ void getZeroDecimalPlaceCountries$annotations() {
    }

    private final Pair<Locale, Map<String, LocalizedConfiguration>> tieredConfigForLocales(List<Locale> list) {
        Object obj;
        for (Locale convertToCorrectlyFormattedLocale : list) {
            Locale convertToCorrectlyFormattedLocale2 = LocaleExtensionsKt.convertToCorrectlyFormattedLocale(convertToCorrectlyFormattedLocale);
            Map<String, LocalizedConfiguration> tieredConfigForLocale = tieredConfigForLocale(convertToCorrectlyFormattedLocale2);
            if (tieredConfigForLocale != null) {
                return C6502A.a(convertToCorrectlyFormattedLocale2, tieredConfigForLocale);
            }
        }
        String str = this.defaultLocale;
        if (str != null) {
            Iterator it = this.localizationByTier.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C6496s.c(LocaleExtensionsKt.toLocale((String) ((Map.Entry) obj).getKey()), LocaleExtensionsKt.toLocale(str))) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry != null) {
                return C6502A.a(LocaleExtensionsKt.toLocale((String) entry.getKey()), entry.getValue());
            }
        }
        Map.Entry entry2 = (Map.Entry) C6565s.n0(this.localizationByTier.entrySet());
        return C6502A.a(LocaleExtensionsKt.toLocale((String) entry2.getKey()), entry2.getValue());
    }

    public static final /* synthetic */ void write$Self(PaywallData paywallData, d dVar, f fVar) {
        C5978b[] bVarArr = $childSerializers;
        dVar.t(fVar, 0, paywallData.templateName);
        dVar.B(fVar, 1, PaywallData$Configuration$$serializer.INSTANCE, paywallData.config);
        dVar.B(fVar, 2, URLSerializer.INSTANCE, paywallData.assetBaseURL);
        if (dVar.q(fVar, 3) || paywallData.revision != 0) {
            dVar.i(fVar, 3, paywallData.revision);
        }
        dVar.B(fVar, 4, bVarArr[4], paywallData.localization);
        if (dVar.q(fVar, 5) || !C6496s.c(paywallData.localizationByTier, O.i())) {
            dVar.B(fVar, 5, bVarArr[5], paywallData.localizationByTier);
        }
        if (dVar.q(fVar, 6) || !C6496s.c(paywallData.zeroDecimalPlaceCountries, C6565s.n())) {
            dVar.B(fVar, 6, GoogleListSerializer.INSTANCE, paywallData.zeroDecimalPlaceCountries);
        }
        if (dVar.q(fVar, 7) || paywallData.defaultLocale != null) {
            dVar.p(fVar, 7, x0.f71726a, paywallData.defaultLocale);
        }
    }

    public final String component1() {
        return this.templateName;
    }

    public final Configuration component2() {
        return this.config;
    }

    public final URL component3() {
        return this.assetBaseURL;
    }

    public final int component4() {
        return this.revision;
    }

    public final Map<String, LocalizedConfiguration> component5$purchases_defaultsRelease() {
        return this.localization;
    }

    public final Map<String, Map<String, LocalizedConfiguration>> component6$purchases_defaultsRelease() {
        return this.localizationByTier;
    }

    public final List<String> component7() {
        return this.zeroDecimalPlaceCountries;
    }

    public final String component8() {
        return this.defaultLocale;
    }

    public final LocalizedConfiguration configForLocale(Locale locale) {
        Object obj;
        C6496s.h(locale, "requiredLocale");
        LocalizedConfiguration localizedConfiguration = this.localization.get(locale.toString());
        if (localizedConfiguration != null) {
            return localizedConfiguration;
        }
        Iterator it = this.localization.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (LocaleExtensionsKt.sharedLanguageCodeWith(locale, LocaleExtensionsKt.toLocale((String) ((Map.Entry) obj).getKey()))) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (LocalizedConfiguration) entry.getValue();
        }
        return null;
    }

    public final PaywallData copy(String str, Configuration configuration, URL url, int i10, Map<String, LocalizedConfiguration> map, Map<String, ? extends Map<String, LocalizedConfiguration>> map2, List<String> list, String str2) {
        C6496s.h(str, "templateName");
        C6496s.h(configuration, "config");
        C6496s.h(url, "assetBaseURL");
        C6496s.h(map, "localization");
        Map<String, ? extends Map<String, LocalizedConfiguration>> map3 = map2;
        C6496s.h(map3, "localizationByTier");
        List<String> list2 = list;
        C6496s.h(list2, "zeroDecimalPlaceCountries");
        return new PaywallData(str, configuration, url, i10, map, map3, list2, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallData)) {
            return false;
        }
        PaywallData paywallData = (PaywallData) obj;
        return C6496s.c(this.templateName, paywallData.templateName) && C6496s.c(this.config, paywallData.config) && C6496s.c(this.assetBaseURL, paywallData.assetBaseURL) && this.revision == paywallData.revision && C6496s.c(this.localization, paywallData.localization) && C6496s.c(this.localizationByTier, paywallData.localizationByTier) && C6496s.c(this.zeroDecimalPlaceCountries, paywallData.zeroDecimalPlaceCountries) && C6496s.c(this.defaultLocale, paywallData.defaultLocale);
    }

    public final URL getAssetBaseURL() {
        return this.assetBaseURL;
    }

    public final Configuration getConfig() {
        return this.config;
    }

    public final String getDefaultLocale() {
        return this.defaultLocale;
    }

    public final Map<String, LocalizedConfiguration> getLocalization$purchases_defaultsRelease() {
        return this.localization;
    }

    public final Map<String, Map<String, LocalizedConfiguration>> getLocalizationByTier$purchases_defaultsRelease() {
        return this.localizationByTier;
    }

    public final Pair<Locale, LocalizedConfiguration> getLocalizedConfiguration() {
        return localizedConfiguration(LocaleExtensionsKt.getDefaultLocales());
    }

    public final int getRevision() {
        return this.revision;
    }

    public final String getTemplateName() {
        return this.templateName;
    }

    public final Pair<Locale, Map<String, LocalizedConfiguration>> getTieredLocalizedConfiguration() {
        return tieredConfigForLocales(LocaleExtensionsKt.getDefaultLocales());
    }

    public final List<String> getZeroDecimalPlaceCountries() {
        return this.zeroDecimalPlaceCountries;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.templateName.hashCode() * 31) + this.config.hashCode()) * 31) + this.assetBaseURL.hashCode()) * 31) + Integer.hashCode(this.revision)) * 31) + this.localization.hashCode()) * 31) + this.localizationByTier.hashCode()) * 31) + this.zeroDecimalPlaceCountries.hashCode()) * 31;
        String str = this.defaultLocale;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final Pair<Locale, LocalizedConfiguration> localizedConfiguration(List<Locale> list) {
        Object obj;
        C6496s.h(list, "locales");
        for (Locale convertToCorrectlyFormattedLocale : list) {
            Locale convertToCorrectlyFormattedLocale2 = LocaleExtensionsKt.convertToCorrectlyFormattedLocale(convertToCorrectlyFormattedLocale);
            LocalizedConfiguration configForLocale = configForLocale(convertToCorrectlyFormattedLocale2);
            if (configForLocale != null) {
                return C6502A.a(convertToCorrectlyFormattedLocale2, configForLocale);
            }
        }
        String str = this.defaultLocale;
        if (str != null) {
            Iterator it = this.localization.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C6496s.c(LocaleExtensionsKt.toLocale((String) ((Map.Entry) obj).getKey()), LocaleExtensionsKt.toLocale(str))) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry != null) {
                return C6502A.a(LocaleExtensionsKt.toLocale((String) entry.getKey()), entry.getValue());
            }
        }
        Map.Entry entry2 = (Map.Entry) C6565s.n0(this.localization.entrySet());
        return C6502A.a(LocaleExtensionsKt.toLocale((String) entry2.getKey()), entry2.getValue());
    }

    public final Map<String, LocalizedConfiguration> tieredConfigForLocale(Locale locale) {
        Object obj;
        C6496s.h(locale, "requiredLocale");
        Map<String, LocalizedConfiguration> map = this.localizationByTier.get(locale.toString());
        if (map != null) {
            return map;
        }
        Iterator it = this.localizationByTier.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (LocaleExtensionsKt.sharedLanguageCodeWith(locale, LocaleExtensionsKt.toLocale((String) ((Map.Entry) obj).getKey()))) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (Map) entry.getValue();
        }
        return null;
    }

    public String toString() {
        return "PaywallData(templateName=" + this.templateName + ", config=" + this.config + ", assetBaseURL=" + this.assetBaseURL + ", revision=" + this.revision + ", localization=" + this.localization + ", localizationByTier=" + this.localizationByTier + ", zeroDecimalPlaceCountries=" + this.zeroDecimalPlaceCountries + ", defaultLocale=" + this.defaultLocale + ')';
    }

    @C5985i
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bH\b\b\u0018\u0000 g2\u00020\u0001:\u0006hijgklB½\u0001\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\u0018B¡\u0001\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0017\u0010\u001aBÓ\u0001\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0001\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\r\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0016\b\u0001\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0017\u0010\u001fJ(\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#HÇ\u0001¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010.\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u00100\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0004\b/\u0010-J\u001e\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b5\u00104J\u0012\u00106\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b8\u00107J\u0010\u00109\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b9\u0010:J\u001e\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b;\u00102J\u0018\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010)J\u0012\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b=\u0010+JÈ\u0001\u0010>\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b@\u0010+J\u0010\u0010A\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\bA\u0010BJ\u001a\u0010D\u001a\u00020\u000b2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bD\u0010ER&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010F\u0012\u0004\bH\u0010I\u001a\u0004\bG\u0010)R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010J\u0012\u0004\bL\u0010I\u001a\u0004\bK\u0010+R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010M\u0012\u0004\bO\u0010I\u001a\u0004\bN\u0010-R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0000X\u0004¢\u0006\u0012\n\u0004\b\b\u0010M\u0012\u0004\bQ\u0010I\u001a\u0004\bP\u0010-R.\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010R\u0012\u0004\bT\u0010I\u001a\u0004\bS\u00102R \u0010\f\u001a\u00020\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\f\u0010U\u0012\u0004\bW\u0010I\u001a\u0004\bV\u00104R \u0010\r\u001a\u00020\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010U\u0012\u0004\bY\u0010I\u001a\u0004\bX\u00104R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010Z\u0012\u0004\b\\\u0010I\u001a\u0004\b[\u00107R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010Z\u0012\u0004\b^\u0010I\u001a\u0004\b]\u00107R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010_\u001a\u0004\b`\u0010:R.\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010R\u0012\u0004\bb\u0010I\u001a\u0004\ba\u00102R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010F\u001a\u0004\bc\u0010)R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010J\u0012\u0004\be\u0010I\u001a\u0004\bd\u0010+R\u0011\u0010\u0019\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bf\u0010-¨\u0006m"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "", "", "", "packageIds", "defaultPackage", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "imagesWebp", "legacyImages", "", "imagesByTier", "", "blurredBackgroundImage", "displayRestorePurchases", "Ljava/net/URL;", "termsOfServiceURL", "privacyURL", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "colors", "colorsByTier", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;", "tiers", "defaultTier", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Ljava/util/Map;ZZLjava/net/URL;Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)V", "images", "(Ljava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Ljava/util/Map;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Ljava/util/Map;Ljava/util/List;ZZLjava/net/URL;Ljava/net/URL;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Ljava/util/Map;ZZLjava/net/URL;Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;Ljh/d;Lih/f;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "component3", "component4$purchases_defaultsRelease", "component4", "component5", "()Ljava/util/Map;", "component6", "()Z", "component7", "component8", "()Ljava/net/URL;", "component9", "component10", "()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "component11", "component12", "component13", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Ljava/util/Map;ZZLjava/net/URL;Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPackageIds", "getPackageIds$annotations", "()V", "Ljava/lang/String;", "getDefaultPackage", "getDefaultPackage$annotations", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "getImagesWebp$purchases_defaultsRelease", "getImagesWebp$purchases_defaultsRelease$annotations", "getLegacyImages$purchases_defaultsRelease", "getLegacyImages$purchases_defaultsRelease$annotations", "Ljava/util/Map;", "getImagesByTier", "getImagesByTier$annotations", "Z", "getBlurredBackgroundImage", "getBlurredBackgroundImage$annotations", "getDisplayRestorePurchases", "getDisplayRestorePurchases$annotations", "Ljava/net/URL;", "getTermsOfServiceURL", "getTermsOfServiceURL$annotations", "getPrivacyURL", "getPrivacyURL$annotations", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "getColors", "getColorsByTier", "getColorsByTier$annotations", "getTiers", "getDefaultTier", "getDefaultTier$annotations", "getImages", "Companion", "$serializer", "ColorInformation", "Colors", "Images", "Tier", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Configuration {
        /* access modifiers changed from: private */
        public static final C5978b[] $childSerializers;
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final boolean blurredBackgroundImage;
        private final ColorInformation colors;
        private final Map<String, ColorInformation> colorsByTier;
        private final String defaultPackage;
        private final String defaultTier;
        private final boolean displayRestorePurchases;
        private final Map<String, Images> imagesByTier;
        private final Images imagesWebp;
        private final Images legacyImages;
        private final List<String> packageIds;
        private final URL privacyURL;
        private final URL termsOfServiceURL;
        private final List<Tier> tiers;

        @C5985i
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0015¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "light", "dark", "<init>", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Ljh/d;Lih/f;)V", "component1", "()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "component2", "copy", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "getLight", "getDark", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ColorInformation {
            public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
            private final Colors dark;
            private final Colors light;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final C5978b serializer() {
                    return PaywallData$Configuration$ColorInformation$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @C6521e
            public /* synthetic */ ColorInformation(int i10, Colors colors, Colors colors2, t0 t0Var) {
                if (1 != (i10 & 1)) {
                    C6456i0.a(i10, 1, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE.getDescriptor());
                }
                this.light = colors;
                if ((i10 & 2) == 0) {
                    this.dark = null;
                } else {
                    this.dark = colors2;
                }
            }

            public static /* synthetic */ ColorInformation copy$default(ColorInformation colorInformation, Colors colors, Colors colors2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    colors = colorInformation.light;
                }
                if ((i10 & 2) != 0) {
                    colors2 = colorInformation.dark;
                }
                return colorInformation.copy(colors, colors2);
            }

            public static final /* synthetic */ void write$Self(ColorInformation colorInformation, d dVar, f fVar) {
                PaywallData$Configuration$Colors$$serializer paywallData$Configuration$Colors$$serializer = PaywallData$Configuration$Colors$$serializer.INSTANCE;
                dVar.B(fVar, 0, paywallData$Configuration$Colors$$serializer, colorInformation.light);
                if (dVar.q(fVar, 1) || colorInformation.dark != null) {
                    dVar.p(fVar, 1, paywallData$Configuration$Colors$$serializer, colorInformation.dark);
                }
            }

            public final Colors component1() {
                return this.light;
            }

            public final Colors component2() {
                return this.dark;
            }

            public final ColorInformation copy(Colors colors, Colors colors2) {
                C6496s.h(colors, "light");
                return new ColorInformation(colors, colors2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ColorInformation)) {
                    return false;
                }
                ColorInformation colorInformation = (ColorInformation) obj;
                return C6496s.c(this.light, colorInformation.light) && C6496s.c(this.dark, colorInformation.dark);
            }

            public final Colors getDark() {
                return this.dark;
            }

            public final Colors getLight() {
                return this.light;
            }

            public int hashCode() {
                int hashCode = this.light.hashCode() * 31;
                Colors colors = this.dark;
                return hashCode + (colors == null ? 0 : colors.hashCode());
            }

            public String toString() {
                return "ColorInformation(light=" + this.light + ", dark=" + this.dark + ')';
            }

            public ColorInformation(Colors colors, Colors colors2) {
                C6496s.h(colors, "light");
                this.light = colors;
                this.dark = colors2;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ ColorInformation(Colors colors, Colors colors2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(colors, (i10 & 2) != 0 ? null : colors2);
            }
        }

        @C5985i
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b%\b\b\u0018\u0000 \\2\u00020\u0001:\u0002]\\B«\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013BÏ\u0001\b\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J(\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cHÇ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\"J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\"J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\"J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\"J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\"J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\"J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\"J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\"J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\"J¼\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b:\u0010;R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010<\u0012\u0004\b>\u0010?\u001a\u0004\b=\u0010\"R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010<\u0012\u0004\bA\u0010?\u001a\u0004\b@\u0010\"R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010<\u0012\u0004\bC\u0010?\u001a\u0004\bB\u0010\"R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010<\u0012\u0004\bE\u0010?\u001a\u0004\bD\u0010\"R \u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010<\u0012\u0004\bG\u0010?\u001a\u0004\bF\u0010\"R \u0010\b\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u0010<\u0012\u0004\bI\u0010?\u001a\u0004\bH\u0010\"R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u0010<\u0012\u0004\bK\u0010?\u001a\u0004\bJ\u0010\"R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010<\u0012\u0004\bM\u0010?\u001a\u0004\bL\u0010\"R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010<\u0012\u0004\bO\u0010?\u001a\u0004\bN\u0010\"R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\f\u0010<\u0012\u0004\bQ\u0010?\u001a\u0004\bP\u0010\"R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010<\u0012\u0004\bS\u0010?\u001a\u0004\bR\u0010\"R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010<\u0012\u0004\bU\u0010?\u001a\u0004\bT\u0010\"R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010<\u0012\u0004\bW\u0010?\u001a\u0004\bV\u0010\"R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010<\u0012\u0004\bY\u0010?\u001a\u0004\bX\u0010\"R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010<\u0012\u0004\b[\u0010?\u001a\u0004\bZ\u0010\"¨\u0006^"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "", "Lcom/revenuecat/purchases/paywalls/PaywallColor;", "background", "text1", "text2", "text3", "callToActionBackground", "callToActionForeground", "callToActionSecondaryBackground", "accent1", "accent2", "accent3", "closeButton", "tierControlBackground", "tierControlForeground", "tierControlSelectedBackground", "tierControlSelectedForeground", "<init>", "(Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Ljh/d;Lih/f;)V", "component1", "()Lcom/revenuecat/purchases/paywalls/PaywallColor;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/PaywallColor;", "getBackground", "getBackground$annotations", "()V", "getText1", "getText1$annotations", "getText2", "getText2$annotations", "getText3", "getText3$annotations", "getCallToActionBackground", "getCallToActionBackground$annotations", "getCallToActionForeground", "getCallToActionForeground$annotations", "getCallToActionSecondaryBackground", "getCallToActionSecondaryBackground$annotations", "getAccent1", "getAccent1$annotations", "getAccent2", "getAccent2$annotations", "getAccent3", "getAccent3$annotations", "getCloseButton", "getCloseButton$annotations", "getTierControlBackground", "getTierControlBackground$annotations", "getTierControlForeground", "getTierControlForeground$annotations", "getTierControlSelectedBackground", "getTierControlSelectedBackground$annotations", "getTierControlSelectedForeground", "getTierControlSelectedForeground$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Colors {
            public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
            private final PaywallColor accent1;
            private final PaywallColor accent2;
            private final PaywallColor accent3;
            private final PaywallColor background;
            private final PaywallColor callToActionBackground;
            private final PaywallColor callToActionForeground;
            private final PaywallColor callToActionSecondaryBackground;
            private final PaywallColor closeButton;
            private final PaywallColor text1;
            private final PaywallColor text2;
            private final PaywallColor text3;
            private final PaywallColor tierControlBackground;
            private final PaywallColor tierControlForeground;
            private final PaywallColor tierControlSelectedBackground;
            private final PaywallColor tierControlSelectedForeground;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final C5978b serializer() {
                    return PaywallData$Configuration$Colors$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @C6521e
            public /* synthetic */ Colors(int i10, @C5985i(with = PaywallColor.Serializer.class) PaywallColor paywallColor, @C5985i(with = PaywallColor.Serializer.class) PaywallColor paywallColor2, @C5985i(with = PaywallColor.Serializer.class) PaywallColor paywallColor3, @C5985i(with = PaywallColor.Serializer.class) PaywallColor paywallColor4, @C5985i(with = PaywallColor.Serializer.class) PaywallColor paywallColor5, @C5985i(with = PaywallColor.Serializer.class) PaywallColor paywallColor6, @C5985i(with = PaywallColor.Serializer.class) PaywallColor paywallColor7, @C5985i(with = PaywallColor.Serializer.class) PaywallColor paywallColor8, @C5985i(with = PaywallColor.Serializer.class) PaywallColor paywallColor9, @C5985i(with = PaywallColor.Serializer.class) PaywallColor paywallColor10, @C5985i(with = PaywallColor.Serializer.class) PaywallColor paywallColor11, @C5985i(with = PaywallColor.Serializer.class) PaywallColor paywallColor12, @C5985i(with = PaywallColor.Serializer.class) PaywallColor paywallColor13, @C5985i(with = PaywallColor.Serializer.class) PaywallColor paywallColor14, @C5985i(with = PaywallColor.Serializer.class) PaywallColor paywallColor15, t0 t0Var) {
                int i11 = i10;
                if (51 != (i11 & 51)) {
                    C6456i0.a(i10, 51, PaywallData$Configuration$Colors$$serializer.INSTANCE.getDescriptor());
                }
                this.background = paywallColor;
                this.text1 = paywallColor2;
                if ((i11 & 4) == 0) {
                    this.text2 = null;
                } else {
                    this.text2 = paywallColor3;
                }
                if ((i11 & 8) == 0) {
                    this.text3 = null;
                } else {
                    this.text3 = paywallColor4;
                }
                this.callToActionBackground = paywallColor5;
                this.callToActionForeground = paywallColor6;
                if ((i11 & 64) == 0) {
                    this.callToActionSecondaryBackground = null;
                } else {
                    this.callToActionSecondaryBackground = paywallColor7;
                }
                if ((i11 & 128) == 0) {
                    this.accent1 = null;
                } else {
                    this.accent1 = paywallColor8;
                }
                if ((i11 & 256) == 0) {
                    this.accent2 = null;
                } else {
                    this.accent2 = paywallColor9;
                }
                if ((i11 & 512) == 0) {
                    this.accent3 = null;
                } else {
                    this.accent3 = paywallColor10;
                }
                if ((i11 & 1024) == 0) {
                    this.closeButton = null;
                } else {
                    this.closeButton = paywallColor11;
                }
                if ((i11 & 2048) == 0) {
                    this.tierControlBackground = null;
                } else {
                    this.tierControlBackground = paywallColor12;
                }
                if ((i11 & 4096) == 0) {
                    this.tierControlForeground = null;
                } else {
                    this.tierControlForeground = paywallColor13;
                }
                if ((i11 & 8192) == 0) {
                    this.tierControlSelectedBackground = null;
                } else {
                    this.tierControlSelectedBackground = paywallColor14;
                }
                if ((i11 & 16384) == 0) {
                    this.tierControlSelectedForeground = null;
                } else {
                    this.tierControlSelectedForeground = paywallColor15;
                }
            }

            public static /* synthetic */ Colors copy$default(Colors colors, PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, PaywallColor paywallColor6, PaywallColor paywallColor7, PaywallColor paywallColor8, PaywallColor paywallColor9, PaywallColor paywallColor10, PaywallColor paywallColor11, PaywallColor paywallColor12, PaywallColor paywallColor13, PaywallColor paywallColor14, PaywallColor paywallColor15, int i10, Object obj) {
                Colors colors2 = colors;
                int i11 = i10;
                return colors.copy((i11 & 1) != 0 ? colors2.background : paywallColor, (i11 & 2) != 0 ? colors2.text1 : paywallColor2, (i11 & 4) != 0 ? colors2.text2 : paywallColor3, (i11 & 8) != 0 ? colors2.text3 : paywallColor4, (i11 & 16) != 0 ? colors2.callToActionBackground : paywallColor5, (i11 & 32) != 0 ? colors2.callToActionForeground : paywallColor6, (i11 & 64) != 0 ? colors2.callToActionSecondaryBackground : paywallColor7, (i11 & 128) != 0 ? colors2.accent1 : paywallColor8, (i11 & 256) != 0 ? colors2.accent2 : paywallColor9, (i11 & 512) != 0 ? colors2.accent3 : paywallColor10, (i11 & 1024) != 0 ? colors2.closeButton : paywallColor11, (i11 & 2048) != 0 ? colors2.tierControlBackground : paywallColor12, (i11 & 4096) != 0 ? colors2.tierControlForeground : paywallColor13, (i11 & 8192) != 0 ? colors2.tierControlSelectedBackground : paywallColor14, (i11 & 16384) != 0 ? colors2.tierControlSelectedForeground : paywallColor15);
            }

            @C5985i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getAccent1$annotations() {
            }

            @C5985i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getAccent2$annotations() {
            }

            @C5985i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getAccent3$annotations() {
            }

            @C5985i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getBackground$annotations() {
            }

            @C5985i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getCallToActionBackground$annotations() {
            }

            @C5985i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getCallToActionForeground$annotations() {
            }

            @C5985i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getCallToActionSecondaryBackground$annotations() {
            }

            @C5985i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getCloseButton$annotations() {
            }

            @C5985i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getText1$annotations() {
            }

            @C5985i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getText2$annotations() {
            }

            @C5985i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getText3$annotations() {
            }

            @C5985i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getTierControlBackground$annotations() {
            }

            @C5985i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getTierControlForeground$annotations() {
            }

            @C5985i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getTierControlSelectedBackground$annotations() {
            }

            @C5985i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getTierControlSelectedForeground$annotations() {
            }

            public static final /* synthetic */ void write$Self(Colors colors, d dVar, f fVar) {
                PaywallColor.Serializer serializer = PaywallColor.Serializer.INSTANCE;
                dVar.B(fVar, 0, serializer, colors.background);
                dVar.B(fVar, 1, serializer, colors.text1);
                if (dVar.q(fVar, 2) || colors.text2 != null) {
                    dVar.p(fVar, 2, serializer, colors.text2);
                }
                if (dVar.q(fVar, 3) || colors.text3 != null) {
                    dVar.p(fVar, 3, serializer, colors.text3);
                }
                dVar.B(fVar, 4, serializer, colors.callToActionBackground);
                dVar.B(fVar, 5, serializer, colors.callToActionForeground);
                if (dVar.q(fVar, 6) || colors.callToActionSecondaryBackground != null) {
                    dVar.p(fVar, 6, serializer, colors.callToActionSecondaryBackground);
                }
                if (dVar.q(fVar, 7) || colors.accent1 != null) {
                    dVar.p(fVar, 7, serializer, colors.accent1);
                }
                if (dVar.q(fVar, 8) || colors.accent2 != null) {
                    dVar.p(fVar, 8, serializer, colors.accent2);
                }
                if (dVar.q(fVar, 9) || colors.accent3 != null) {
                    dVar.p(fVar, 9, serializer, colors.accent3);
                }
                if (dVar.q(fVar, 10) || colors.closeButton != null) {
                    dVar.p(fVar, 10, serializer, colors.closeButton);
                }
                if (dVar.q(fVar, 11) || colors.tierControlBackground != null) {
                    dVar.p(fVar, 11, serializer, colors.tierControlBackground);
                }
                if (dVar.q(fVar, 12) || colors.tierControlForeground != null) {
                    dVar.p(fVar, 12, serializer, colors.tierControlForeground);
                }
                if (dVar.q(fVar, 13) || colors.tierControlSelectedBackground != null) {
                    dVar.p(fVar, 13, serializer, colors.tierControlSelectedBackground);
                }
                if (dVar.q(fVar, 14) || colors.tierControlSelectedForeground != null) {
                    dVar.p(fVar, 14, serializer, colors.tierControlSelectedForeground);
                }
            }

            public final PaywallColor component1() {
                return this.background;
            }

            public final PaywallColor component10() {
                return this.accent3;
            }

            public final PaywallColor component11() {
                return this.closeButton;
            }

            public final PaywallColor component12() {
                return this.tierControlBackground;
            }

            public final PaywallColor component13() {
                return this.tierControlForeground;
            }

            public final PaywallColor component14() {
                return this.tierControlSelectedBackground;
            }

            public final PaywallColor component15() {
                return this.tierControlSelectedForeground;
            }

            public final PaywallColor component2() {
                return this.text1;
            }

            public final PaywallColor component3() {
                return this.text2;
            }

            public final PaywallColor component4() {
                return this.text3;
            }

            public final PaywallColor component5() {
                return this.callToActionBackground;
            }

            public final PaywallColor component6() {
                return this.callToActionForeground;
            }

            public final PaywallColor component7() {
                return this.callToActionSecondaryBackground;
            }

            public final PaywallColor component8() {
                return this.accent1;
            }

            public final PaywallColor component9() {
                return this.accent2;
            }

            public final Colors copy(PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, PaywallColor paywallColor6, PaywallColor paywallColor7, PaywallColor paywallColor8, PaywallColor paywallColor9, PaywallColor paywallColor10, PaywallColor paywallColor11, PaywallColor paywallColor12, PaywallColor paywallColor13, PaywallColor paywallColor14, PaywallColor paywallColor15) {
                PaywallColor paywallColor16 = paywallColor;
                C6496s.h(paywallColor16, AppStateModule.APP_STATE_BACKGROUND);
                PaywallColor paywallColor17 = paywallColor2;
                C6496s.h(paywallColor17, "text1");
                PaywallColor paywallColor18 = paywallColor5;
                C6496s.h(paywallColor18, "callToActionBackground");
                PaywallColor paywallColor19 = paywallColor6;
                C6496s.h(paywallColor19, "callToActionForeground");
                return new Colors(paywallColor16, paywallColor17, paywallColor3, paywallColor4, paywallColor18, paywallColor19, paywallColor7, paywallColor8, paywallColor9, paywallColor10, paywallColor11, paywallColor12, paywallColor13, paywallColor14, paywallColor15);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Colors)) {
                    return false;
                }
                Colors colors = (Colors) obj;
                return C6496s.c(this.background, colors.background) && C6496s.c(this.text1, colors.text1) && C6496s.c(this.text2, colors.text2) && C6496s.c(this.text3, colors.text3) && C6496s.c(this.callToActionBackground, colors.callToActionBackground) && C6496s.c(this.callToActionForeground, colors.callToActionForeground) && C6496s.c(this.callToActionSecondaryBackground, colors.callToActionSecondaryBackground) && C6496s.c(this.accent1, colors.accent1) && C6496s.c(this.accent2, colors.accent2) && C6496s.c(this.accent3, colors.accent3) && C6496s.c(this.closeButton, colors.closeButton) && C6496s.c(this.tierControlBackground, colors.tierControlBackground) && C6496s.c(this.tierControlForeground, colors.tierControlForeground) && C6496s.c(this.tierControlSelectedBackground, colors.tierControlSelectedBackground) && C6496s.c(this.tierControlSelectedForeground, colors.tierControlSelectedForeground);
            }

            public final PaywallColor getAccent1() {
                return this.accent1;
            }

            public final PaywallColor getAccent2() {
                return this.accent2;
            }

            public final PaywallColor getAccent3() {
                return this.accent3;
            }

            public final PaywallColor getBackground() {
                return this.background;
            }

            public final PaywallColor getCallToActionBackground() {
                return this.callToActionBackground;
            }

            public final PaywallColor getCallToActionForeground() {
                return this.callToActionForeground;
            }

            public final PaywallColor getCallToActionSecondaryBackground() {
                return this.callToActionSecondaryBackground;
            }

            public final PaywallColor getCloseButton() {
                return this.closeButton;
            }

            public final PaywallColor getText1() {
                return this.text1;
            }

            public final PaywallColor getText2() {
                return this.text2;
            }

            public final PaywallColor getText3() {
                return this.text3;
            }

            public final PaywallColor getTierControlBackground() {
                return this.tierControlBackground;
            }

            public final PaywallColor getTierControlForeground() {
                return this.tierControlForeground;
            }

            public final PaywallColor getTierControlSelectedBackground() {
                return this.tierControlSelectedBackground;
            }

            public final PaywallColor getTierControlSelectedForeground() {
                return this.tierControlSelectedForeground;
            }

            public int hashCode() {
                int hashCode = ((this.background.hashCode() * 31) + this.text1.hashCode()) * 31;
                PaywallColor paywallColor = this.text2;
                int i10 = 0;
                int hashCode2 = (hashCode + (paywallColor == null ? 0 : paywallColor.hashCode())) * 31;
                PaywallColor paywallColor2 = this.text3;
                int hashCode3 = (((((hashCode2 + (paywallColor2 == null ? 0 : paywallColor2.hashCode())) * 31) + this.callToActionBackground.hashCode()) * 31) + this.callToActionForeground.hashCode()) * 31;
                PaywallColor paywallColor3 = this.callToActionSecondaryBackground;
                int hashCode4 = (hashCode3 + (paywallColor3 == null ? 0 : paywallColor3.hashCode())) * 31;
                PaywallColor paywallColor4 = this.accent1;
                int hashCode5 = (hashCode4 + (paywallColor4 == null ? 0 : paywallColor4.hashCode())) * 31;
                PaywallColor paywallColor5 = this.accent2;
                int hashCode6 = (hashCode5 + (paywallColor5 == null ? 0 : paywallColor5.hashCode())) * 31;
                PaywallColor paywallColor6 = this.accent3;
                int hashCode7 = (hashCode6 + (paywallColor6 == null ? 0 : paywallColor6.hashCode())) * 31;
                PaywallColor paywallColor7 = this.closeButton;
                int hashCode8 = (hashCode7 + (paywallColor7 == null ? 0 : paywallColor7.hashCode())) * 31;
                PaywallColor paywallColor8 = this.tierControlBackground;
                int hashCode9 = (hashCode8 + (paywallColor8 == null ? 0 : paywallColor8.hashCode())) * 31;
                PaywallColor paywallColor9 = this.tierControlForeground;
                int hashCode10 = (hashCode9 + (paywallColor9 == null ? 0 : paywallColor9.hashCode())) * 31;
                PaywallColor paywallColor10 = this.tierControlSelectedBackground;
                int hashCode11 = (hashCode10 + (paywallColor10 == null ? 0 : paywallColor10.hashCode())) * 31;
                PaywallColor paywallColor11 = this.tierControlSelectedForeground;
                if (paywallColor11 != null) {
                    i10 = paywallColor11.hashCode();
                }
                return hashCode11 + i10;
            }

            public String toString() {
                return "Colors(background=" + this.background + ", text1=" + this.text1 + ", text2=" + this.text2 + ", text3=" + this.text3 + ", callToActionBackground=" + this.callToActionBackground + ", callToActionForeground=" + this.callToActionForeground + ", callToActionSecondaryBackground=" + this.callToActionSecondaryBackground + ", accent1=" + this.accent1 + ", accent2=" + this.accent2 + ", accent3=" + this.accent3 + ", closeButton=" + this.closeButton + ", tierControlBackground=" + this.tierControlBackground + ", tierControlForeground=" + this.tierControlForeground + ", tierControlSelectedBackground=" + this.tierControlSelectedBackground + ", tierControlSelectedForeground=" + this.tierControlSelectedForeground + ')';
            }

            public Colors(PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, PaywallColor paywallColor6, PaywallColor paywallColor7, PaywallColor paywallColor8, PaywallColor paywallColor9, PaywallColor paywallColor10, PaywallColor paywallColor11, PaywallColor paywallColor12, PaywallColor paywallColor13, PaywallColor paywallColor14, PaywallColor paywallColor15) {
                C6496s.h(paywallColor, AppStateModule.APP_STATE_BACKGROUND);
                C6496s.h(paywallColor2, "text1");
                C6496s.h(paywallColor5, "callToActionBackground");
                C6496s.h(paywallColor6, "callToActionForeground");
                this.background = paywallColor;
                this.text1 = paywallColor2;
                this.text2 = paywallColor3;
                this.text3 = paywallColor4;
                this.callToActionBackground = paywallColor5;
                this.callToActionForeground = paywallColor6;
                this.callToActionSecondaryBackground = paywallColor7;
                this.accent1 = paywallColor8;
                this.accent2 = paywallColor9;
                this.accent3 = paywallColor10;
                this.closeButton = paywallColor11;
                this.tierControlBackground = paywallColor12;
                this.tierControlForeground = paywallColor13;
                this.tierControlSelectedBackground = paywallColor14;
                this.tierControlSelectedForeground = paywallColor15;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ Colors(com.revenuecat.purchases.paywalls.PaywallColor r20, com.revenuecat.purchases.paywalls.PaywallColor r21, com.revenuecat.purchases.paywalls.PaywallColor r22, com.revenuecat.purchases.paywalls.PaywallColor r23, com.revenuecat.purchases.paywalls.PaywallColor r24, com.revenuecat.purchases.paywalls.PaywallColor r25, com.revenuecat.purchases.paywalls.PaywallColor r26, com.revenuecat.purchases.paywalls.PaywallColor r27, com.revenuecat.purchases.paywalls.PaywallColor r28, com.revenuecat.purchases.paywalls.PaywallColor r29, com.revenuecat.purchases.paywalls.PaywallColor r30, com.revenuecat.purchases.paywalls.PaywallColor r31, com.revenuecat.purchases.paywalls.PaywallColor r32, com.revenuecat.purchases.paywalls.PaywallColor r33, com.revenuecat.purchases.paywalls.PaywallColor r34, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
                /*
                    r19 = this;
                    r0 = r35
                    r1 = r0 & 4
                    r2 = 0
                    if (r1 == 0) goto L_0x0009
                    r6 = r2
                    goto L_0x000b
                L_0x0009:
                    r6 = r22
                L_0x000b:
                    r1 = r0 & 8
                    if (r1 == 0) goto L_0x0011
                    r7 = r2
                    goto L_0x0013
                L_0x0011:
                    r7 = r23
                L_0x0013:
                    r1 = r0 & 64
                    if (r1 == 0) goto L_0x0019
                    r10 = r2
                    goto L_0x001b
                L_0x0019:
                    r10 = r26
                L_0x001b:
                    r1 = r0 & 128(0x80, float:1.794E-43)
                    if (r1 == 0) goto L_0x0021
                    r11 = r2
                    goto L_0x0023
                L_0x0021:
                    r11 = r27
                L_0x0023:
                    r1 = r0 & 256(0x100, float:3.59E-43)
                    if (r1 == 0) goto L_0x0029
                    r12 = r2
                    goto L_0x002b
                L_0x0029:
                    r12 = r28
                L_0x002b:
                    r1 = r0 & 512(0x200, float:7.175E-43)
                    if (r1 == 0) goto L_0x0031
                    r13 = r2
                    goto L_0x0033
                L_0x0031:
                    r13 = r29
                L_0x0033:
                    r1 = r0 & 1024(0x400, float:1.435E-42)
                    if (r1 == 0) goto L_0x0039
                    r14 = r2
                    goto L_0x003b
                L_0x0039:
                    r14 = r30
                L_0x003b:
                    r1 = r0 & 2048(0x800, float:2.87E-42)
                    if (r1 == 0) goto L_0x0041
                    r15 = r2
                    goto L_0x0043
                L_0x0041:
                    r15 = r31
                L_0x0043:
                    r1 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L_0x004a
                    r16 = r2
                    goto L_0x004c
                L_0x004a:
                    r16 = r32
                L_0x004c:
                    r1 = r0 & 8192(0x2000, float:1.14794E-41)
                    if (r1 == 0) goto L_0x0053
                    r17 = r2
                    goto L_0x0055
                L_0x0053:
                    r17 = r33
                L_0x0055:
                    r0 = r0 & 16384(0x4000, float:2.2959E-41)
                    if (r0 == 0) goto L_0x005c
                    r18 = r2
                    goto L_0x005e
                L_0x005c:
                    r18 = r34
                L_0x005e:
                    r3 = r19
                    r4 = r20
                    r5 = r21
                    r8 = r24
                    r9 = r25
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.PaywallData.Configuration.Colors.<init>(com.revenuecat.purchases.paywalls.PaywallColor, com.revenuecat.purchases.paywalls.PaywallColor, com.revenuecat.purchases.paywalls.PaywallColor, com.revenuecat.purchases.paywalls.PaywallColor, com.revenuecat.purchases.paywalls.PaywallColor, com.revenuecat.purchases.paywalls.PaywallColor, com.revenuecat.purchases.paywalls.PaywallColor, com.revenuecat.purchases.paywalls.PaywallColor, com.revenuecat.purchases.paywalls.PaywallColor, com.revenuecat.purchases.paywalls.PaywallColor, com.revenuecat.purchases.paywalls.PaywallColor, com.revenuecat.purchases.paywalls.PaywallColor, com.revenuecat.purchases.paywalls.PaywallColor, com.revenuecat.purchases.paywalls.PaywallColor, com.revenuecat.purchases.paywalls.PaywallColor, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return PaywallData$Configuration$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @C5985i
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0006\b\b\u0018\u0000 .2\u00020\u0001:\u0002/.B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J4\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b)\u0010%\u001a\u0004\b(\u0010\u0016R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020*8@X\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "", "", "header", "background", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Ljh/d;Lih/f;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeader", "getHeader$annotations", "()V", "getBackground", "getBackground$annotations", "getIcon", "getIcon$annotations", "", "getAll$purchases_defaultsRelease", "()Ljava/util/List;", "all", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Images {
            public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
            private final String background;
            private final String header;
            private final String icon;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final C5978b serializer() {
                    return PaywallData$Configuration$Images$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public Images() {
                this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Images copy$default(Images images, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = images.header;
                }
                if ((i10 & 2) != 0) {
                    str2 = images.background;
                }
                if ((i10 & 4) != 0) {
                    str3 = images.icon;
                }
                return images.copy(str, str2, str3);
            }

            @C5985i(with = EmptyStringToNullSerializer.class)
            public static /* synthetic */ void getBackground$annotations() {
            }

            @C5985i(with = EmptyStringToNullSerializer.class)
            public static /* synthetic */ void getHeader$annotations() {
            }

            @C5985i(with = EmptyStringToNullSerializer.class)
            public static /* synthetic */ void getIcon$annotations() {
            }

            public static final /* synthetic */ void write$Self(Images images, d dVar, f fVar) {
                if (dVar.q(fVar, 0) || images.header != null) {
                    dVar.p(fVar, 0, EmptyStringToNullSerializer.INSTANCE, images.header);
                }
                if (dVar.q(fVar, 1) || images.background != null) {
                    dVar.p(fVar, 1, EmptyStringToNullSerializer.INSTANCE, images.background);
                }
                if (dVar.q(fVar, 2) || images.icon != null) {
                    dVar.p(fVar, 2, EmptyStringToNullSerializer.INSTANCE, images.icon);
                }
            }

            public final String component1() {
                return this.header;
            }

            public final String component2() {
                return this.background;
            }

            public final String component3() {
                return this.icon;
            }

            public final Images copy(String str, String str2, String str3) {
                return new Images(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Images)) {
                    return false;
                }
                Images images = (Images) obj;
                return C6496s.c(this.header, images.header) && C6496s.c(this.background, images.background) && C6496s.c(this.icon, images.icon);
            }

            public final List<String> getAll$purchases_defaultsRelease() {
                return C6565s.s(this.header, this.background, this.icon);
            }

            public final String getBackground() {
                return this.background;
            }

            public final String getHeader() {
                return this.header;
            }

            public final String getIcon() {
                return this.icon;
            }

            public int hashCode() {
                String str = this.header;
                int i10 = 0;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.background;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.icon;
                if (str3 != null) {
                    i10 = str3.hashCode();
                }
                return hashCode2 + i10;
            }

            public String toString() {
                return "Images(header=" + this.header + ", background=" + this.background + ", icon=" + this.icon + ')';
            }

            @C6521e
            public /* synthetic */ Images(int i10, @C5985i(with = EmptyStringToNullSerializer.class) String str, @C5985i(with = EmptyStringToNullSerializer.class) String str2, @C5985i(with = EmptyStringToNullSerializer.class) String str3, t0 t0Var) {
                if ((i10 & 1) == 0) {
                    this.header = null;
                } else {
                    this.header = str;
                }
                if ((i10 & 2) == 0) {
                    this.background = null;
                } else {
                    this.background = str2;
                }
                if ((i10 & 4) == 0) {
                    this.icon = null;
                } else {
                    this.icon = str3;
                }
            }

            public Images(String str, String str2, String str3) {
                this.header = str;
                this.background = str2;
                this.icon = str3;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Images(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
            }
        }

        @C5985i
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J4\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0019R \u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010$\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u0017¨\u0006."}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;", "", "", "id", "", "packageIds", "defaultPackageId", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;Ljh/d;Lih/f;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getPackageIds", "getPackageIds$annotations", "()V", "getDefaultPackageId", "getDefaultPackageId$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Tier {
            /* access modifiers changed from: private */
            public static final C5978b[] $childSerializers = {null, new C6449f(x0.f71726a), null};
            public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
            private final String defaultPackageId;

            /* renamed from: id  reason: collision with root package name */
            private final String f59541id;
            private final List<String> packageIds;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final C5978b serializer() {
                    return PaywallData$Configuration$Tier$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @C6521e
            public /* synthetic */ Tier(int i10, String str, List list, String str2, t0 t0Var) {
                if (7 != (i10 & 7)) {
                    C6456i0.a(i10, 7, PaywallData$Configuration$Tier$$serializer.INSTANCE.getDescriptor());
                }
                this.f59541id = str;
                this.packageIds = list;
                this.defaultPackageId = str2;
            }

            public static /* synthetic */ Tier copy$default(Tier tier, String str, List<String> list, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = tier.f59541id;
                }
                if ((i10 & 2) != 0) {
                    list = tier.packageIds;
                }
                if ((i10 & 4) != 0) {
                    str2 = tier.defaultPackageId;
                }
                return tier.copy(str, list, str2);
            }

            public static /* synthetic */ void getDefaultPackageId$annotations() {
            }

            public static /* synthetic */ void getPackageIds$annotations() {
            }

            public static final /* synthetic */ void write$Self(Tier tier, d dVar, f fVar) {
                C5978b[] bVarArr = $childSerializers;
                dVar.t(fVar, 0, tier.f59541id);
                dVar.B(fVar, 1, bVarArr[1], tier.packageIds);
                dVar.t(fVar, 2, tier.defaultPackageId);
            }

            public final String component1() {
                return this.f59541id;
            }

            public final List<String> component2() {
                return this.packageIds;
            }

            public final String component3() {
                return this.defaultPackageId;
            }

            public final Tier copy(String str, List<String> list, String str2) {
                C6496s.h(str, "id");
                C6496s.h(list, "packageIds");
                C6496s.h(str2, "defaultPackageId");
                return new Tier(str, list, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Tier)) {
                    return false;
                }
                Tier tier = (Tier) obj;
                return C6496s.c(this.f59541id, tier.f59541id) && C6496s.c(this.packageIds, tier.packageIds) && C6496s.c(this.defaultPackageId, tier.defaultPackageId);
            }

            public final String getDefaultPackageId() {
                return this.defaultPackageId;
            }

            public final String getId() {
                return this.f59541id;
            }

            public final List<String> getPackageIds() {
                return this.packageIds;
            }

            public int hashCode() {
                return (((this.f59541id.hashCode() * 31) + this.packageIds.hashCode()) * 31) + this.defaultPackageId.hashCode();
            }

            public String toString() {
                return "Tier(id=" + this.f59541id + ", packageIds=" + this.packageIds + ", defaultPackageId=" + this.defaultPackageId + ')';
            }

            public Tier(String str, List<String> list, String str2) {
                C6496s.h(str, "id");
                C6496s.h(list, "packageIds");
                C6496s.h(str2, "defaultPackageId");
                this.f59541id = str;
                this.packageIds = list;
                this.defaultPackageId = str2;
            }
        }

        static {
            x0 x0Var = x0.f71726a;
            $childSerializers = new C5978b[]{new C6449f(x0Var), null, null, null, new M(x0Var, PaywallData$Configuration$Images$$serializer.INSTANCE), null, null, null, null, null, new M(x0Var, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE), new C6449f(PaywallData$Configuration$Tier$$serializer.INSTANCE), null};
        }

        @C6521e
        public /* synthetic */ Configuration(int i10, List list, String str, Images images, Images images2, Map map, boolean z10, boolean z11, @C5985i(with = OptionalURLSerializer.class) URL url, @C5985i(with = OptionalURLSerializer.class) URL url2, ColorInformation colorInformation, Map map2, List list2, String str2, t0 t0Var) {
            List list3;
            int i11 = i10;
            if (512 != (i11 & 512)) {
                C6456i0.a(i10, 512, PaywallData$Configuration$$serializer.INSTANCE.getDescriptor());
            }
            if ((i11 & 1) == 0) {
                list3 = C6565s.n();
            } else {
                list3 = list;
            }
            this.packageIds = list3;
            if ((i11 & 2) == 0) {
                this.defaultPackage = null;
            } else {
                this.defaultPackage = str;
            }
            if ((i11 & 4) == 0) {
                this.imagesWebp = null;
            } else {
                this.imagesWebp = images;
            }
            if ((i11 & 8) == 0) {
                this.legacyImages = null;
            } else {
                this.legacyImages = images2;
            }
            if ((i11 & 16) == 0) {
                this.imagesByTier = null;
            } else {
                this.imagesByTier = map;
            }
            this.blurredBackgroundImage = (i11 & 32) == 0 ? false : z10;
            this.displayRestorePurchases = (i11 & 64) == 0 ? true : z11;
            if ((i11 & 128) == 0) {
                this.termsOfServiceURL = null;
            } else {
                this.termsOfServiceURL = url;
            }
            if ((i11 & 256) == 0) {
                this.privacyURL = null;
            } else {
                this.privacyURL = url2;
            }
            this.colors = colorInformation;
            if ((i11 & 1024) == 0) {
                this.colorsByTier = null;
            } else {
                this.colorsByTier = map2;
            }
            if ((i11 & 2048) == 0) {
                this.tiers = null;
            } else {
                this.tiers = list2;
            }
            if ((i11 & 4096) == 0) {
                this.defaultTier = null;
            } else {
                this.defaultTier = str2;
            }
        }

        public static /* synthetic */ Configuration copy$default(Configuration configuration, List list, String str, Images images, Images images2, Map map, boolean z10, boolean z11, URL url, URL url2, ColorInformation colorInformation, Map map2, List list2, String str2, int i10, Object obj) {
            Configuration configuration2 = configuration;
            int i11 = i10;
            return configuration.copy((i11 & 1) != 0 ? configuration2.packageIds : list, (i11 & 2) != 0 ? configuration2.defaultPackage : str, (i11 & 4) != 0 ? configuration2.imagesWebp : images, (i11 & 8) != 0 ? configuration2.legacyImages : images2, (i11 & 16) != 0 ? configuration2.imagesByTier : map, (i11 & 32) != 0 ? configuration2.blurredBackgroundImage : z10, (i11 & 64) != 0 ? configuration2.displayRestorePurchases : z11, (i11 & 128) != 0 ? configuration2.termsOfServiceURL : url, (i11 & 256) != 0 ? configuration2.privacyURL : url2, (i11 & 512) != 0 ? configuration2.colors : colorInformation, (i11 & 1024) != 0 ? configuration2.colorsByTier : map2, (i11 & 2048) != 0 ? configuration2.tiers : list2, (i11 & 4096) != 0 ? configuration2.defaultTier : str2);
        }

        public static /* synthetic */ void getBlurredBackgroundImage$annotations() {
        }

        public static /* synthetic */ void getColorsByTier$annotations() {
        }

        public static /* synthetic */ void getDefaultPackage$annotations() {
        }

        public static /* synthetic */ void getDefaultTier$annotations() {
        }

        public static /* synthetic */ void getDisplayRestorePurchases$annotations() {
        }

        public static /* synthetic */ void getImagesByTier$annotations() {
        }

        public static /* synthetic */ void getImagesWebp$purchases_defaultsRelease$annotations() {
        }

        public static /* synthetic */ void getLegacyImages$purchases_defaultsRelease$annotations() {
        }

        public static /* synthetic */ void getPackageIds$annotations() {
        }

        @C5985i(with = OptionalURLSerializer.class)
        public static /* synthetic */ void getPrivacyURL$annotations() {
        }

        @C5985i(with = OptionalURLSerializer.class)
        public static /* synthetic */ void getTermsOfServiceURL$annotations() {
        }

        public static final /* synthetic */ void write$Self(Configuration configuration, d dVar, f fVar) {
            C5978b[] bVarArr = $childSerializers;
            if (dVar.q(fVar, 0) || !C6496s.c(configuration.packageIds, C6565s.n())) {
                dVar.B(fVar, 0, bVarArr[0], configuration.packageIds);
            }
            if (dVar.q(fVar, 1) || configuration.defaultPackage != null) {
                dVar.p(fVar, 1, x0.f71726a, configuration.defaultPackage);
            }
            if (dVar.q(fVar, 2) || configuration.imagesWebp != null) {
                dVar.p(fVar, 2, PaywallData$Configuration$Images$$serializer.INSTANCE, configuration.imagesWebp);
            }
            if (dVar.q(fVar, 3) || configuration.legacyImages != null) {
                dVar.p(fVar, 3, PaywallData$Configuration$Images$$serializer.INSTANCE, configuration.legacyImages);
            }
            if (dVar.q(fVar, 4) || configuration.imagesByTier != null) {
                dVar.p(fVar, 4, bVarArr[4], configuration.imagesByTier);
            }
            if (dVar.q(fVar, 5) || configuration.blurredBackgroundImage) {
                dVar.A(fVar, 5, configuration.blurredBackgroundImage);
            }
            if (dVar.q(fVar, 6) || !configuration.displayRestorePurchases) {
                dVar.A(fVar, 6, configuration.displayRestorePurchases);
            }
            if (dVar.q(fVar, 7) || configuration.termsOfServiceURL != null) {
                dVar.p(fVar, 7, OptionalURLSerializer.INSTANCE, configuration.termsOfServiceURL);
            }
            if (dVar.q(fVar, 8) || configuration.privacyURL != null) {
                dVar.p(fVar, 8, OptionalURLSerializer.INSTANCE, configuration.privacyURL);
            }
            dVar.B(fVar, 9, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, configuration.colors);
            if (dVar.q(fVar, 10) || configuration.colorsByTier != null) {
                dVar.p(fVar, 10, bVarArr[10], configuration.colorsByTier);
            }
            if (dVar.q(fVar, 11) || configuration.tiers != null) {
                dVar.p(fVar, 11, bVarArr[11], configuration.tiers);
            }
            if (dVar.q(fVar, 12) || configuration.defaultTier != null) {
                dVar.p(fVar, 12, x0.f71726a, configuration.defaultTier);
            }
        }

        public final List<String> component1() {
            return this.packageIds;
        }

        public final ColorInformation component10() {
            return this.colors;
        }

        public final Map<String, ColorInformation> component11() {
            return this.colorsByTier;
        }

        public final List<Tier> component12() {
            return this.tiers;
        }

        public final String component13() {
            return this.defaultTier;
        }

        public final String component2() {
            return this.defaultPackage;
        }

        public final Images component3$purchases_defaultsRelease() {
            return this.imagesWebp;
        }

        public final Images component4$purchases_defaultsRelease() {
            return this.legacyImages;
        }

        public final Map<String, Images> component5() {
            return this.imagesByTier;
        }

        public final boolean component6() {
            return this.blurredBackgroundImage;
        }

        public final boolean component7() {
            return this.displayRestorePurchases;
        }

        public final URL component8() {
            return this.termsOfServiceURL;
        }

        public final URL component9() {
            return this.privacyURL;
        }

        public final Configuration copy(List<String> list, String str, Images images, Images images2, Map<String, Images> map, boolean z10, boolean z11, URL url, URL url2, ColorInformation colorInformation, Map<String, ColorInformation> map2, List<Tier> list2, String str2) {
            List<String> list3 = list;
            C6496s.h(list3, "packageIds");
            ColorInformation colorInformation2 = colorInformation;
            C6496s.h(colorInformation2, LinearGradientManager.PROP_COLORS);
            return new Configuration(list3, str, images, images2, map, z10, z11, url, url2, colorInformation2, map2, list2, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) obj;
            return C6496s.c(this.packageIds, configuration.packageIds) && C6496s.c(this.defaultPackage, configuration.defaultPackage) && C6496s.c(this.imagesWebp, configuration.imagesWebp) && C6496s.c(this.legacyImages, configuration.legacyImages) && C6496s.c(this.imagesByTier, configuration.imagesByTier) && this.blurredBackgroundImage == configuration.blurredBackgroundImage && this.displayRestorePurchases == configuration.displayRestorePurchases && C6496s.c(this.termsOfServiceURL, configuration.termsOfServiceURL) && C6496s.c(this.privacyURL, configuration.privacyURL) && C6496s.c(this.colors, configuration.colors) && C6496s.c(this.colorsByTier, configuration.colorsByTier) && C6496s.c(this.tiers, configuration.tiers) && C6496s.c(this.defaultTier, configuration.defaultTier);
        }

        public final boolean getBlurredBackgroundImage() {
            return this.blurredBackgroundImage;
        }

        public final ColorInformation getColors() {
            return this.colors;
        }

        public final Map<String, ColorInformation> getColorsByTier() {
            return this.colorsByTier;
        }

        public final String getDefaultPackage() {
            return this.defaultPackage;
        }

        public final String getDefaultTier() {
            return this.defaultTier;
        }

        public final boolean getDisplayRestorePurchases() {
            return this.displayRestorePurchases;
        }

        public final Images getImages() {
            String str;
            String str2;
            String icon;
            Images images = this.imagesWebp;
            String str3 = null;
            if (images == null || (str = images.getHeader()) == null) {
                Images images2 = this.legacyImages;
                if (images2 != null) {
                    str = images2.getHeader();
                } else {
                    str = null;
                }
            }
            Images images3 = this.imagesWebp;
            if (images3 == null || (str2 = images3.getBackground()) == null) {
                Images images4 = this.legacyImages;
                if (images4 != null) {
                    str2 = images4.getBackground();
                } else {
                    str2 = null;
                }
            }
            Images images5 = this.imagesWebp;
            if (images5 == null || (icon = images5.getIcon()) == null) {
                Images images6 = this.legacyImages;
                if (images6 != null) {
                    str3 = images6.getIcon();
                }
            } else {
                str3 = icon;
            }
            return new Images(str, str2, str3);
        }

        public final Map<String, Images> getImagesByTier() {
            return this.imagesByTier;
        }

        public final Images getImagesWebp$purchases_defaultsRelease() {
            return this.imagesWebp;
        }

        public final Images getLegacyImages$purchases_defaultsRelease() {
            return this.legacyImages;
        }

        public final List<String> getPackageIds() {
            return this.packageIds;
        }

        public final URL getPrivacyURL() {
            return this.privacyURL;
        }

        public final URL getTermsOfServiceURL() {
            return this.termsOfServiceURL;
        }

        public final List<Tier> getTiers() {
            return this.tiers;
        }

        public int hashCode() {
            int hashCode = this.packageIds.hashCode() * 31;
            String str = this.defaultPackage;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Images images = this.imagesWebp;
            int hashCode3 = (hashCode2 + (images == null ? 0 : images.hashCode())) * 31;
            Images images2 = this.legacyImages;
            int hashCode4 = (hashCode3 + (images2 == null ? 0 : images2.hashCode())) * 31;
            Map<String, Images> map = this.imagesByTier;
            int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
            boolean z10 = this.blurredBackgroundImage;
            boolean z11 = true;
            if (z10) {
                z10 = true;
            }
            int i11 = (hashCode5 + (z10 ? 1 : 0)) * 31;
            boolean z12 = this.displayRestorePurchases;
            if (!z12) {
                z11 = z12;
            }
            int i12 = (i11 + (z11 ? 1 : 0)) * 31;
            URL url = this.termsOfServiceURL;
            int hashCode6 = (i12 + (url == null ? 0 : url.hashCode())) * 31;
            URL url2 = this.privacyURL;
            int hashCode7 = (((hashCode6 + (url2 == null ? 0 : url2.hashCode())) * 31) + this.colors.hashCode()) * 31;
            Map<String, ColorInformation> map2 = this.colorsByTier;
            int hashCode8 = (hashCode7 + (map2 == null ? 0 : map2.hashCode())) * 31;
            List<Tier> list = this.tiers;
            int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.defaultTier;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return hashCode9 + i10;
        }

        public String toString() {
            return "Configuration(packageIds=" + this.packageIds + ", defaultPackage=" + this.defaultPackage + ", imagesWebp=" + this.imagesWebp + ", legacyImages=" + this.legacyImages + ", imagesByTier=" + this.imagesByTier + ", blurredBackgroundImage=" + this.blurredBackgroundImage + ", displayRestorePurchases=" + this.displayRestorePurchases + ", termsOfServiceURL=" + this.termsOfServiceURL + ", privacyURL=" + this.privacyURL + ", colors=" + this.colors + ", colorsByTier=" + this.colorsByTier + ", tiers=" + this.tiers + ", defaultTier=" + this.defaultTier + ')';
        }

        public Configuration(List<String> list, String str, Images images, Images images2, Map<String, Images> map, boolean z10, boolean z11, URL url, URL url2, ColorInformation colorInformation, Map<String, ColorInformation> map2, List<Tier> list2, String str2) {
            C6496s.h(list, "packageIds");
            C6496s.h(colorInformation, LinearGradientManager.PROP_COLORS);
            this.packageIds = list;
            this.defaultPackage = str;
            this.imagesWebp = images;
            this.legacyImages = images2;
            this.imagesByTier = map;
            this.blurredBackgroundImage = z10;
            this.displayRestorePurchases = z11;
            this.termsOfServiceURL = url;
            this.privacyURL = url2;
            this.colors = colorInformation;
            this.colorsByTier = map2;
            this.tiers = list2;
            this.defaultTier = str2;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Configuration(java.util.List r17, java.lang.String r18, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images r19, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images r20, java.util.Map r21, boolean r22, boolean r23, java.net.URL r24, java.net.URL r25, com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation r26, java.util.Map r27, java.util.List r28, java.lang.String r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
            /*
                r16 = this;
                r0 = r30
                r1 = r0 & 1
                if (r1 == 0) goto L_0x000c
                java.util.List r1 = mf.C6565s.n()
                r3 = r1
                goto L_0x000e
            L_0x000c:
                r3 = r17
            L_0x000e:
                r1 = r0 & 2
                r2 = 0
                if (r1 == 0) goto L_0x0015
                r4 = r2
                goto L_0x0017
            L_0x0015:
                r4 = r18
            L_0x0017:
                r1 = r0 & 4
                if (r1 == 0) goto L_0x001d
                r5 = r2
                goto L_0x001f
            L_0x001d:
                r5 = r19
            L_0x001f:
                r1 = r0 & 8
                if (r1 == 0) goto L_0x0025
                r6 = r2
                goto L_0x0027
            L_0x0025:
                r6 = r20
            L_0x0027:
                r1 = r0 & 16
                if (r1 == 0) goto L_0x002d
                r7 = r2
                goto L_0x002f
            L_0x002d:
                r7 = r21
            L_0x002f:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0036
                r1 = 0
                r8 = r1
                goto L_0x0038
            L_0x0036:
                r8 = r22
            L_0x0038:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x003f
                r1 = 1
                r9 = r1
                goto L_0x0041
            L_0x003f:
                r9 = r23
            L_0x0041:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x0047
                r10 = r2
                goto L_0x0049
            L_0x0047:
                r10 = r24
            L_0x0049:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L_0x004f
                r11 = r2
                goto L_0x0051
            L_0x004f:
                r11 = r25
            L_0x0051:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L_0x0057
                r13 = r2
                goto L_0x0059
            L_0x0057:
                r13 = r27
            L_0x0059:
                r1 = r0 & 2048(0x800, float:2.87E-42)
                if (r1 == 0) goto L_0x005f
                r14 = r2
                goto L_0x0061
            L_0x005f:
                r14 = r28
            L_0x0061:
                r0 = r0 & 4096(0x1000, float:5.74E-42)
                if (r0 == 0) goto L_0x0067
                r15 = r2
                goto L_0x0069
            L_0x0067:
                r15 = r29
            L_0x0069:
                r2 = r16
                r12 = r26
                r2.<init>((java.util.List<java.lang.String>) r3, (java.lang.String) r4, (com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images) r5, (com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images) r6, (java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images>) r7, (boolean) r8, (boolean) r9, (java.net.URL) r10, (java.net.URL) r11, (com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation) r12, (java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation>) r13, (java.util.List<com.revenuecat.purchases.paywalls.PaywallData.Configuration.Tier>) r14, (java.lang.String) r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.PaywallData.Configuration.<init>(java.util.List, java.lang.String, com.revenuecat.purchases.paywalls.PaywallData$Configuration$Images, com.revenuecat.purchases.paywalls.PaywallData$Configuration$Images, java.util.Map, boolean, boolean, java.net.URL, java.net.URL, com.revenuecat.purchases.paywalls.PaywallData$Configuration$ColorInformation, java.util.Map, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Configuration(java.util.List r16, java.lang.String r17, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images r18, java.util.Map r19, com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation r20, java.util.Map r21, java.util.List r22, boolean r23, boolean r24, java.net.URL r25, java.net.URL r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
            /*
                r15 = this;
                r0 = r27
                r1 = r0 & 2
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r5 = r2
                goto L_0x000b
            L_0x0009:
                r5 = r17
            L_0x000b:
                r1 = r0 & 8
                if (r1 == 0) goto L_0x0011
                r7 = r2
                goto L_0x0013
            L_0x0011:
                r7 = r19
            L_0x0013:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0019
                r9 = r2
                goto L_0x001b
            L_0x0019:
                r9 = r21
            L_0x001b:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0021
                r10 = r2
                goto L_0x0023
            L_0x0021:
                r10 = r22
            L_0x0023:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x002a
                r1 = 0
                r11 = r1
                goto L_0x002c
            L_0x002a:
                r11 = r23
            L_0x002c:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L_0x0033
                r1 = 1
                r12 = r1
                goto L_0x0035
            L_0x0033:
                r12 = r24
            L_0x0035:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L_0x003b
                r13 = r2
                goto L_0x003d
            L_0x003b:
                r13 = r25
            L_0x003d:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L_0x0043
                r14 = r2
                goto L_0x0045
            L_0x0043:
                r14 = r26
            L_0x0045:
                r3 = r15
                r4 = r16
                r6 = r18
                r8 = r20
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.PaywallData.Configuration.<init>(java.util.List, java.lang.String, com.revenuecat.purchases.paywalls.PaywallData$Configuration$Images, java.util.Map, com.revenuecat.purchases.paywalls.PaywallData$Configuration$ColorInformation, java.util.Map, java.util.List, boolean, boolean, java.net.URL, java.net.URL, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Configuration(java.util.List<java.lang.String> r18, java.lang.String r19, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images r20, java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images> r21, com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation r22, java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation> r23, java.util.List<com.revenuecat.purchases.paywalls.PaywallData.Configuration.Tier> r24, boolean r25, boolean r26, java.net.URL r27, java.net.URL r28) {
            /*
                r17 = this;
                java.lang.String r0 = "packageIds"
                r2 = r18
                kotlin.jvm.internal.C6496s.h(r2, r0)
                java.lang.String r0 = "images"
                r4 = r20
                kotlin.jvm.internal.C6496s.h(r4, r0)
                java.lang.String r0 = "colors"
                r11 = r22
                kotlin.jvm.internal.C6496s.h(r11, r0)
                r15 = 4104(0x1008, float:5.751E-42)
                r16 = 0
                r5 = 0
                r14 = 0
                r1 = r17
                r3 = r19
                r6 = r21
                r7 = r25
                r8 = r26
                r9 = r27
                r10 = r28
                r12 = r23
                r13 = r24
                r1.<init>((java.util.List) r2, (java.lang.String) r3, (com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images) r4, (com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images) r5, (java.util.Map) r6, (boolean) r7, (boolean) r8, (java.net.URL) r9, (java.net.URL) r10, (com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation) r11, (java.util.Map) r12, (java.util.List) r13, (java.lang.String) r14, (int) r15, (kotlin.jvm.internal.DefaultConstructorMarker) r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.PaywallData.Configuration.<init>(java.util.List, java.lang.String, com.revenuecat.purchases.paywalls.PaywallData$Configuration$Images, java.util.Map, com.revenuecat.purchases.paywalls.PaywallData$Configuration$ColorInformation, java.util.Map, java.util.List, boolean, boolean, java.net.URL, java.net.URL):void");
        }
    }

    @C5985i
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b!\b\b\u0018\u0000 T2\u00020\u0001:\u0004UTVWB\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014B¹\u0001\b\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J(\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dHÇ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010#J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010#J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010#J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010#J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010#J\u001c\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003¢\u0006\u0004\b/\u00100Jª\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010#J\u0010\u00104\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010#R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010:\u0012\u0004\b=\u0010>\u001a\u0004\b<\u0010#R \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010:\u0012\u0004\b@\u0010>\u001a\u0004\b?\u0010#R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010:\u0012\u0004\bB\u0010>\u001a\u0004\bA\u0010#R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010:\u0012\u0004\bD\u0010>\u001a\u0004\bC\u0010#R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u0010:\u0012\u0004\bF\u0010>\u001a\u0004\bE\u0010#R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u0010:\u0012\u0004\bH\u0010>\u001a\u0004\bG\u0010#R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010:\u0012\u0004\bJ\u0010>\u001a\u0004\bI\u0010#R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010:\u0012\u0004\bL\u0010>\u001a\u0004\bK\u0010#R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010M\u001a\u0004\bN\u0010-R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010:\u0012\u0004\bP\u0010>\u001a\u0004\bO\u0010#R,\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010Q\u0012\u0004\bS\u0010>\u001a\u0004\bR\u00100¨\u0006X"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "", "", "title", "subtitle", "callToAction", "callToActionWithIntroOffer", "callToActionWithMultipleIntroOffers", "offerDetails", "offerDetailsWithIntroOffer", "offerDetailsWithMultipleIntroOffers", "offerName", "", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;", "features", "tierName", "", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;", "offerOverrides", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;Ljh/d;Lih/f;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Ljava/util/List;", "component11", "component12", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getSubtitle$annotations", "()V", "getCallToAction", "getCallToAction$annotations", "getCallToActionWithIntroOffer", "getCallToActionWithIntroOffer$annotations", "getCallToActionWithMultipleIntroOffers", "getCallToActionWithMultipleIntroOffers$annotations", "getOfferDetails", "getOfferDetails$annotations", "getOfferDetailsWithIntroOffer", "getOfferDetailsWithIntroOffer$annotations", "getOfferDetailsWithMultipleIntroOffers", "getOfferDetailsWithMultipleIntroOffers$annotations", "getOfferName", "getOfferName$annotations", "Ljava/util/List;", "getFeatures", "getTierName", "getTierName$annotations", "Ljava/util/Map;", "getOfferOverrides", "getOfferOverrides$annotations", "Companion", "$serializer", "Feature", "OfferOverride", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LocalizedConfiguration {
        /* access modifiers changed from: private */
        public static final C5978b[] $childSerializers = {null, null, null, null, null, null, null, null, null, new C6449f(PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE), null, new M(x0.f71726a, PaywallData$LocalizedConfiguration$OfferOverride$$serializer.INSTANCE)};
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final String callToAction;
        private final String callToActionWithIntroOffer;
        private final String callToActionWithMultipleIntroOffers;
        private final List<Feature> features;
        private final String offerDetails;
        private final String offerDetailsWithIntroOffer;
        private final String offerDetailsWithMultipleIntroOffers;
        private final String offerName;
        private final Map<String, OfferOverride> offerOverrides;
        private final String subtitle;
        private final String tierName;
        private final String title;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return PaywallData$LocalizedConfiguration$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @C5985i
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 (2\u00020\u0001:\u0002)(B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J2\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0016¨\u0006*"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;", "", "", "title", "content", "iconID", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;Ljh/d;Lih/f;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getContent", "getIconID", "getIconID$annotations", "()V", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Feature {
            public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
            private final String content;
            private final String iconID;
            private final String title;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final C5978b serializer() {
                    return PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @C6521e
            public /* synthetic */ Feature(int i10, String str, String str2, String str3, t0 t0Var) {
                if (1 != (i10 & 1)) {
                    C6456i0.a(i10, 1, PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE.getDescriptor());
                }
                this.title = str;
                if ((i10 & 2) == 0) {
                    this.content = null;
                } else {
                    this.content = str2;
                }
                if ((i10 & 4) == 0) {
                    this.iconID = null;
                } else {
                    this.iconID = str3;
                }
            }

            public static /* synthetic */ Feature copy$default(Feature feature, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = feature.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = feature.content;
                }
                if ((i10 & 4) != 0) {
                    str3 = feature.iconID;
                }
                return feature.copy(str, str2, str3);
            }

            public static /* synthetic */ void getIconID$annotations() {
            }

            public static final /* synthetic */ void write$Self(Feature feature, d dVar, f fVar) {
                dVar.t(fVar, 0, feature.title);
                if (dVar.q(fVar, 1) || feature.content != null) {
                    dVar.p(fVar, 1, x0.f71726a, feature.content);
                }
                if (dVar.q(fVar, 2) || feature.iconID != null) {
                    dVar.p(fVar, 2, x0.f71726a, feature.iconID);
                }
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.content;
            }

            public final String component3() {
                return this.iconID;
            }

            public final Feature copy(String str, String str2, String str3) {
                C6496s.h(str, b.f37461S);
                return new Feature(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Feature)) {
                    return false;
                }
                Feature feature = (Feature) obj;
                return C6496s.c(this.title, feature.title) && C6496s.c(this.content, feature.content) && C6496s.c(this.iconID, feature.iconID);
            }

            public final String getContent() {
                return this.content;
            }

            public final String getIconID() {
                return this.iconID;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.content;
                int i10 = 0;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.iconID;
                if (str2 != null) {
                    i10 = str2.hashCode();
                }
                return hashCode2 + i10;
            }

            public String toString() {
                return "Feature(title=" + this.title + ", content=" + this.content + ", iconID=" + this.iconID + ')';
            }

            public Feature(String str, String str2, String str3) {
                C6496s.h(str, b.f37461S);
                this.title = str;
                this.content = str2;
                this.iconID = str3;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Feature(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
            }
        }

        @C5985i
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000 22\u00020\u0001:\u000232B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBW\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018JH\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b-\u0010)\u001a\u0004\b,\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010\u0018R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b1\u0010)\u001a\u0004\b0\u0010\u0018¨\u00064"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;", "", "", "offerName", "offerDetails", "offerDetailsWithIntroOffer", "offerDetailsWithMultipleIntroOffers", "offerBadge", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;Ljh/d;Lih/f;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOfferName", "getOfferName$annotations", "()V", "getOfferDetails", "getOfferDetails$annotations", "getOfferDetailsWithIntroOffer", "getOfferDetailsWithIntroOffer$annotations", "getOfferDetailsWithMultipleIntroOffers", "getOfferDetailsWithMultipleIntroOffers$annotations", "getOfferBadge", "getOfferBadge$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class OfferOverride {
            public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
            private final String offerBadge;
            private final String offerDetails;
            private final String offerDetailsWithIntroOffer;
            private final String offerDetailsWithMultipleIntroOffers;
            private final String offerName;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final C5978b serializer() {
                    return PaywallData$LocalizedConfiguration$OfferOverride$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @C6521e
            public /* synthetic */ OfferOverride(int i10, String str, String str2, @C5985i(with = EmptyStringToNullSerializer.class) String str3, @C5985i(with = EmptyStringToNullSerializer.class) String str4, @C5985i(with = EmptyStringToNullSerializer.class) String str5, t0 t0Var) {
                if (3 != (i10 & 3)) {
                    C6456i0.a(i10, 3, PaywallData$LocalizedConfiguration$OfferOverride$$serializer.INSTANCE.getDescriptor());
                }
                this.offerName = str;
                this.offerDetails = str2;
                if ((i10 & 4) == 0) {
                    this.offerDetailsWithIntroOffer = null;
                } else {
                    this.offerDetailsWithIntroOffer = str3;
                }
                if ((i10 & 8) == 0) {
                    this.offerDetailsWithMultipleIntroOffers = null;
                } else {
                    this.offerDetailsWithMultipleIntroOffers = str4;
                }
                if ((i10 & 16) == 0) {
                    this.offerBadge = null;
                } else {
                    this.offerBadge = str5;
                }
            }

            public static /* synthetic */ OfferOverride copy$default(OfferOverride offerOverride, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = offerOverride.offerName;
                }
                if ((i10 & 2) != 0) {
                    str2 = offerOverride.offerDetails;
                }
                String str6 = str2;
                if ((i10 & 4) != 0) {
                    str3 = offerOverride.offerDetailsWithIntroOffer;
                }
                String str7 = str3;
                if ((i10 & 8) != 0) {
                    str4 = offerOverride.offerDetailsWithMultipleIntroOffers;
                }
                String str8 = str4;
                if ((i10 & 16) != 0) {
                    str5 = offerOverride.offerBadge;
                }
                return offerOverride.copy(str, str6, str7, str8, str5);
            }

            @C5985i(with = EmptyStringToNullSerializer.class)
            public static /* synthetic */ void getOfferBadge$annotations() {
            }

            public static /* synthetic */ void getOfferDetails$annotations() {
            }

            @C5985i(with = EmptyStringToNullSerializer.class)
            public static /* synthetic */ void getOfferDetailsWithIntroOffer$annotations() {
            }

            @C5985i(with = EmptyStringToNullSerializer.class)
            public static /* synthetic */ void getOfferDetailsWithMultipleIntroOffers$annotations() {
            }

            public static /* synthetic */ void getOfferName$annotations() {
            }

            public static final /* synthetic */ void write$Self(OfferOverride offerOverride, d dVar, f fVar) {
                dVar.t(fVar, 0, offerOverride.offerName);
                dVar.t(fVar, 1, offerOverride.offerDetails);
                if (dVar.q(fVar, 2) || offerOverride.offerDetailsWithIntroOffer != null) {
                    dVar.p(fVar, 2, EmptyStringToNullSerializer.INSTANCE, offerOverride.offerDetailsWithIntroOffer);
                }
                if (dVar.q(fVar, 3) || offerOverride.offerDetailsWithMultipleIntroOffers != null) {
                    dVar.p(fVar, 3, EmptyStringToNullSerializer.INSTANCE, offerOverride.offerDetailsWithMultipleIntroOffers);
                }
                if (dVar.q(fVar, 4) || offerOverride.offerBadge != null) {
                    dVar.p(fVar, 4, EmptyStringToNullSerializer.INSTANCE, offerOverride.offerBadge);
                }
            }

            public final String component1() {
                return this.offerName;
            }

            public final String component2() {
                return this.offerDetails;
            }

            public final String component3() {
                return this.offerDetailsWithIntroOffer;
            }

            public final String component4() {
                return this.offerDetailsWithMultipleIntroOffers;
            }

            public final String component5() {
                return this.offerBadge;
            }

            public final OfferOverride copy(String str, String str2, String str3, String str4, String str5) {
                C6496s.h(str, "offerName");
                C6496s.h(str2, "offerDetails");
                return new OfferOverride(str, str2, str3, str4, str5);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OfferOverride)) {
                    return false;
                }
                OfferOverride offerOverride = (OfferOverride) obj;
                return C6496s.c(this.offerName, offerOverride.offerName) && C6496s.c(this.offerDetails, offerOverride.offerDetails) && C6496s.c(this.offerDetailsWithIntroOffer, offerOverride.offerDetailsWithIntroOffer) && C6496s.c(this.offerDetailsWithMultipleIntroOffers, offerOverride.offerDetailsWithMultipleIntroOffers) && C6496s.c(this.offerBadge, offerOverride.offerBadge);
            }

            public final String getOfferBadge() {
                return this.offerBadge;
            }

            public final String getOfferDetails() {
                return this.offerDetails;
            }

            public final String getOfferDetailsWithIntroOffer() {
                return this.offerDetailsWithIntroOffer;
            }

            public final String getOfferDetailsWithMultipleIntroOffers() {
                return this.offerDetailsWithMultipleIntroOffers;
            }

            public final String getOfferName() {
                return this.offerName;
            }

            public int hashCode() {
                int hashCode = ((this.offerName.hashCode() * 31) + this.offerDetails.hashCode()) * 31;
                String str = this.offerDetailsWithIntroOffer;
                int i10 = 0;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.offerDetailsWithMultipleIntroOffers;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.offerBadge;
                if (str3 != null) {
                    i10 = str3.hashCode();
                }
                return hashCode3 + i10;
            }

            public String toString() {
                return "OfferOverride(offerName=" + this.offerName + ", offerDetails=" + this.offerDetails + ", offerDetailsWithIntroOffer=" + this.offerDetailsWithIntroOffer + ", offerDetailsWithMultipleIntroOffers=" + this.offerDetailsWithMultipleIntroOffers + ", offerBadge=" + this.offerBadge + ')';
            }

            public OfferOverride(String str, String str2, String str3, String str4, String str5) {
                C6496s.h(str, "offerName");
                C6496s.h(str2, "offerDetails");
                this.offerName = str;
                this.offerDetails = str2;
                this.offerDetailsWithIntroOffer = str3;
                this.offerDetailsWithMultipleIntroOffers = str4;
                this.offerBadge = str5;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ OfferOverride(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
            }
        }

        @C6521e
        public /* synthetic */ LocalizedConfiguration(int i10, String str, @C5985i(with = EmptyStringToNullSerializer.class) String str2, String str3, @C5985i(with = EmptyStringToNullSerializer.class) String str4, @C5985i(with = EmptyStringToNullSerializer.class) String str5, @C5985i(with = EmptyStringToNullSerializer.class) String str6, @C5985i(with = EmptyStringToNullSerializer.class) String str7, @C5985i(with = EmptyStringToNullSerializer.class) String str8, @C5985i(with = EmptyStringToNullSerializer.class) String str9, List list, @C5985i(with = EmptyStringToNullSerializer.class) String str10, Map map, t0 t0Var) {
            if (5 != (i10 & 5)) {
                C6456i0.a(i10, 5, PaywallData$LocalizedConfiguration$$serializer.INSTANCE.getDescriptor());
            }
            this.title = str;
            if ((i10 & 2) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str2;
            }
            this.callToAction = str3;
            if ((i10 & 8) == 0) {
                this.callToActionWithIntroOffer = null;
            } else {
                this.callToActionWithIntroOffer = str4;
            }
            if ((i10 & 16) == 0) {
                this.callToActionWithMultipleIntroOffers = null;
            } else {
                this.callToActionWithMultipleIntroOffers = str5;
            }
            if ((i10 & 32) == 0) {
                this.offerDetails = null;
            } else {
                this.offerDetails = str6;
            }
            if ((i10 & 64) == 0) {
                this.offerDetailsWithIntroOffer = null;
            } else {
                this.offerDetailsWithIntroOffer = str7;
            }
            if ((i10 & 128) == 0) {
                this.offerDetailsWithMultipleIntroOffers = null;
            } else {
                this.offerDetailsWithMultipleIntroOffers = str8;
            }
            if ((i10 & 256) == 0) {
                this.offerName = null;
            } else {
                this.offerName = str9;
            }
            if ((i10 & 512) == 0) {
                this.features = C6565s.n();
            } else {
                this.features = list;
            }
            if ((i10 & 1024) == 0) {
                this.tierName = null;
            } else {
                this.tierName = str10;
            }
            if ((i10 & 2048) == 0) {
                this.offerOverrides = O.i();
            } else {
                this.offerOverrides = map;
            }
        }

        public static /* synthetic */ LocalizedConfiguration copy$default(LocalizedConfiguration localizedConfiguration, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, Map map, int i10, Object obj) {
            LocalizedConfiguration localizedConfiguration2 = localizedConfiguration;
            int i11 = i10;
            return localizedConfiguration.copy((i11 & 1) != 0 ? localizedConfiguration2.title : str, (i11 & 2) != 0 ? localizedConfiguration2.subtitle : str2, (i11 & 4) != 0 ? localizedConfiguration2.callToAction : str3, (i11 & 8) != 0 ? localizedConfiguration2.callToActionWithIntroOffer : str4, (i11 & 16) != 0 ? localizedConfiguration2.callToActionWithMultipleIntroOffers : str5, (i11 & 32) != 0 ? localizedConfiguration2.offerDetails : str6, (i11 & 64) != 0 ? localizedConfiguration2.offerDetailsWithIntroOffer : str7, (i11 & 128) != 0 ? localizedConfiguration2.offerDetailsWithMultipleIntroOffers : str8, (i11 & 256) != 0 ? localizedConfiguration2.offerName : str9, (i11 & 512) != 0 ? localizedConfiguration2.features : list, (i11 & 1024) != 0 ? localizedConfiguration2.tierName : str10, (i11 & 2048) != 0 ? localizedConfiguration2.offerOverrides : map);
        }

        public static /* synthetic */ void getCallToAction$annotations() {
        }

        @C5985i(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getCallToActionWithIntroOffer$annotations() {
        }

        @C5985i(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getCallToActionWithMultipleIntroOffers$annotations() {
        }

        @C5985i(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getOfferDetails$annotations() {
        }

        @C5985i(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getOfferDetailsWithIntroOffer$annotations() {
        }

        @C5985i(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getOfferDetailsWithMultipleIntroOffers$annotations() {
        }

        @C5985i(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getOfferName$annotations() {
        }

        public static /* synthetic */ void getOfferOverrides$annotations() {
        }

        @C5985i(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getSubtitle$annotations() {
        }

        @C5985i(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getTierName$annotations() {
        }

        public static final /* synthetic */ void write$Self(LocalizedConfiguration localizedConfiguration, d dVar, f fVar) {
            C5978b[] bVarArr = $childSerializers;
            dVar.t(fVar, 0, localizedConfiguration.title);
            if (dVar.q(fVar, 1) || localizedConfiguration.subtitle != null) {
                dVar.p(fVar, 1, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.subtitle);
            }
            dVar.t(fVar, 2, localizedConfiguration.callToAction);
            if (dVar.q(fVar, 3) || localizedConfiguration.callToActionWithIntroOffer != null) {
                dVar.p(fVar, 3, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.callToActionWithIntroOffer);
            }
            if (dVar.q(fVar, 4) || localizedConfiguration.callToActionWithMultipleIntroOffers != null) {
                dVar.p(fVar, 4, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.callToActionWithMultipleIntroOffers);
            }
            if (dVar.q(fVar, 5) || localizedConfiguration.offerDetails != null) {
                dVar.p(fVar, 5, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.offerDetails);
            }
            if (dVar.q(fVar, 6) || localizedConfiguration.offerDetailsWithIntroOffer != null) {
                dVar.p(fVar, 6, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.offerDetailsWithIntroOffer);
            }
            if (dVar.q(fVar, 7) || localizedConfiguration.offerDetailsWithMultipleIntroOffers != null) {
                dVar.p(fVar, 7, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.offerDetailsWithMultipleIntroOffers);
            }
            if (dVar.q(fVar, 8) || localizedConfiguration.offerName != null) {
                dVar.p(fVar, 8, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.offerName);
            }
            if (dVar.q(fVar, 9) || !C6496s.c(localizedConfiguration.features, C6565s.n())) {
                dVar.B(fVar, 9, bVarArr[9], localizedConfiguration.features);
            }
            if (dVar.q(fVar, 10) || localizedConfiguration.tierName != null) {
                dVar.p(fVar, 10, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.tierName);
            }
            if (dVar.q(fVar, 11) || !C6496s.c(localizedConfiguration.offerOverrides, O.i())) {
                dVar.B(fVar, 11, bVarArr[11], localizedConfiguration.offerOverrides);
            }
        }

        public final String component1() {
            return this.title;
        }

        public final List<Feature> component10() {
            return this.features;
        }

        public final String component11() {
            return this.tierName;
        }

        public final Map<String, OfferOverride> component12() {
            return this.offerOverrides;
        }

        public final String component2() {
            return this.subtitle;
        }

        public final String component3() {
            return this.callToAction;
        }

        public final String component4() {
            return this.callToActionWithIntroOffer;
        }

        public final String component5() {
            return this.callToActionWithMultipleIntroOffers;
        }

        public final String component6() {
            return this.offerDetails;
        }

        public final String component7() {
            return this.offerDetailsWithIntroOffer;
        }

        public final String component8() {
            return this.offerDetailsWithMultipleIntroOffers;
        }

        public final String component9() {
            return this.offerName;
        }

        public final LocalizedConfiguration copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<Feature> list, String str10, Map<String, OfferOverride> map) {
            C6496s.h(str, b.f37461S);
            String str11 = str3;
            C6496s.h(str11, "callToAction");
            List<Feature> list2 = list;
            C6496s.h(list2, "features");
            Map<String, OfferOverride> map2 = map;
            C6496s.h(map2, "offerOverrides");
            return new LocalizedConfiguration(str, str2, str11, str4, str5, str6, str7, str8, str9, list2, str10, map2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocalizedConfiguration)) {
                return false;
            }
            LocalizedConfiguration localizedConfiguration = (LocalizedConfiguration) obj;
            return C6496s.c(this.title, localizedConfiguration.title) && C6496s.c(this.subtitle, localizedConfiguration.subtitle) && C6496s.c(this.callToAction, localizedConfiguration.callToAction) && C6496s.c(this.callToActionWithIntroOffer, localizedConfiguration.callToActionWithIntroOffer) && C6496s.c(this.callToActionWithMultipleIntroOffers, localizedConfiguration.callToActionWithMultipleIntroOffers) && C6496s.c(this.offerDetails, localizedConfiguration.offerDetails) && C6496s.c(this.offerDetailsWithIntroOffer, localizedConfiguration.offerDetailsWithIntroOffer) && C6496s.c(this.offerDetailsWithMultipleIntroOffers, localizedConfiguration.offerDetailsWithMultipleIntroOffers) && C6496s.c(this.offerName, localizedConfiguration.offerName) && C6496s.c(this.features, localizedConfiguration.features) && C6496s.c(this.tierName, localizedConfiguration.tierName) && C6496s.c(this.offerOverrides, localizedConfiguration.offerOverrides);
        }

        public final String getCallToAction() {
            return this.callToAction;
        }

        public final String getCallToActionWithIntroOffer() {
            return this.callToActionWithIntroOffer;
        }

        public final String getCallToActionWithMultipleIntroOffers() {
            return this.callToActionWithMultipleIntroOffers;
        }

        public final List<Feature> getFeatures() {
            return this.features;
        }

        public final String getOfferDetails() {
            return this.offerDetails;
        }

        public final String getOfferDetailsWithIntroOffer() {
            return this.offerDetailsWithIntroOffer;
        }

        public final String getOfferDetailsWithMultipleIntroOffers() {
            return this.offerDetailsWithMultipleIntroOffers;
        }

        public final String getOfferName() {
            return this.offerName;
        }

        public final Map<String, OfferOverride> getOfferOverrides() {
            return this.offerOverrides;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTierName() {
            return this.tierName;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int i10 = 0;
            int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.callToAction.hashCode()) * 31;
            String str2 = this.callToActionWithIntroOffer;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.callToActionWithMultipleIntroOffers;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.offerDetails;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.offerDetailsWithIntroOffer;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.offerDetailsWithMultipleIntroOffers;
            int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.offerName;
            int hashCode8 = (((hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.features.hashCode()) * 31;
            String str8 = this.tierName;
            if (str8 != null) {
                i10 = str8.hashCode();
            }
            return ((hashCode8 + i10) * 31) + this.offerOverrides.hashCode();
        }

        public String toString() {
            return "LocalizedConfiguration(title=" + this.title + ", subtitle=" + this.subtitle + ", callToAction=" + this.callToAction + ", callToActionWithIntroOffer=" + this.callToActionWithIntroOffer + ", callToActionWithMultipleIntroOffers=" + this.callToActionWithMultipleIntroOffers + ", offerDetails=" + this.offerDetails + ", offerDetailsWithIntroOffer=" + this.offerDetailsWithIntroOffer + ", offerDetailsWithMultipleIntroOffers=" + this.offerDetailsWithMultipleIntroOffers + ", offerName=" + this.offerName + ", features=" + this.features + ", tierName=" + this.tierName + ", offerOverrides=" + this.offerOverrides + ')';
        }

        public LocalizedConfiguration(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<Feature> list, String str10, Map<String, OfferOverride> map) {
            C6496s.h(str, b.f37461S);
            C6496s.h(str3, "callToAction");
            C6496s.h(list, "features");
            C6496s.h(map, "offerOverrides");
            this.title = str;
            this.subtitle = str2;
            this.callToAction = str3;
            this.callToActionWithIntroOffer = str4;
            this.callToActionWithMultipleIntroOffers = str5;
            this.offerDetails = str6;
            this.offerDetailsWithIntroOffer = str7;
            this.offerDetailsWithMultipleIntroOffers = str8;
            this.offerName = str9;
            this.features = list;
            this.tierName = str10;
            this.offerOverrides = map;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ LocalizedConfiguration(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.util.List r26, java.lang.String r27, java.util.Map r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
            /*
                r16 = this;
                r0 = r29
                r1 = r0 & 2
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r5 = r2
                goto L_0x000b
            L_0x0009:
                r5 = r18
            L_0x000b:
                r1 = r0 & 8
                if (r1 == 0) goto L_0x0011
                r7 = r2
                goto L_0x0013
            L_0x0011:
                r7 = r20
            L_0x0013:
                r1 = r0 & 16
                if (r1 == 0) goto L_0x0019
                r8 = r2
                goto L_0x001b
            L_0x0019:
                r8 = r21
            L_0x001b:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0021
                r9 = r2
                goto L_0x0023
            L_0x0021:
                r9 = r22
            L_0x0023:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0029
                r10 = r2
                goto L_0x002b
            L_0x0029:
                r10 = r23
            L_0x002b:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x0031
                r11 = r2
                goto L_0x0033
            L_0x0031:
                r11 = r24
            L_0x0033:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L_0x0039
                r12 = r2
                goto L_0x003b
            L_0x0039:
                r12 = r25
            L_0x003b:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L_0x0045
                java.util.List r1 = mf.C6565s.n()
                r13 = r1
                goto L_0x0047
            L_0x0045:
                r13 = r26
            L_0x0047:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L_0x004d
                r14 = r2
                goto L_0x004f
            L_0x004d:
                r14 = r27
            L_0x004f:
                r0 = r0 & 2048(0x800, float:2.87E-42)
                if (r0 == 0) goto L_0x0059
                java.util.Map r0 = mf.O.i()
                r15 = r0
                goto L_0x005b
            L_0x0059:
                r15 = r28
            L_0x005b:
                r3 = r16
                r4 = r17
                r6 = r19
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    public PaywallData(String str, Configuration configuration, URL url, int i10, Map<String, LocalizedConfiguration> map, Map<String, ? extends Map<String, LocalizedConfiguration>> map2, List<String> list, String str2) {
        C6496s.h(str, "templateName");
        C6496s.h(configuration, "config");
        C6496s.h(url, "assetBaseURL");
        C6496s.h(map, "localization");
        C6496s.h(map2, "localizationByTier");
        C6496s.h(list, "zeroDecimalPlaceCountries");
        this.templateName = str;
        this.config = configuration;
        this.assetBaseURL = url;
        this.revision = i10;
        this.localization = map;
        this.localizationByTier = map2;
        this.zeroDecimalPlaceCountries = list;
        this.defaultLocale = str2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PaywallData(java.lang.String r12, com.revenuecat.purchases.paywalls.PaywallData.Configuration r13, java.net.URL r14, int r15, java.util.Map r16, java.util.Map r17, java.util.List r18, java.lang.String r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r6 = r1
            goto L_0x000a
        L_0x0009:
            r6 = r15
        L_0x000a:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0014
            java.util.Map r1 = mf.O.i()
            r8 = r1
            goto L_0x0016
        L_0x0014:
            r8 = r17
        L_0x0016:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0020
            java.util.List r1 = mf.C6565s.n()
            r9 = r1
            goto L_0x0022
        L_0x0020:
            r9 = r18
        L_0x0022:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0029
            r0 = 0
            r10 = r0
            goto L_0x002b
        L_0x0029:
            r10 = r19
        L_0x002b:
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r7 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.PaywallData.<init>(java.lang.String, com.revenuecat.purchases.paywalls.PaywallData$Configuration, java.net.URL, int, java.util.Map, java.util.Map, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
