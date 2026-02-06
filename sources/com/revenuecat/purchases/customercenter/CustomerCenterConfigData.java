package com.revenuecat.purchases.customercenter;

import com.amazon.a.a.o.b;
import com.amazon.c.a.a.c;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.revenuecat.purchases.ExperimentalPreviewRevenueCatPurchasesAPI;
import com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer;
import com.revenuecat.purchases.paywalls.PaywallColor;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import gh.C5978b;
import gh.C5985i;
import ih.f;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.carousel.Carousel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import jh.d;
import kh.C6449f;
import kh.C6455i;
import kh.C6456i0;
import kh.M;
import kh.t0;
import kh.x0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;
import lf.C6531o;
import lf.C6534r;
import lf.C6535s;
import mf.Y;
import yf.C6787a;

@C5985i
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0017\b\b\u0018\u0000 @2\u00020\u0001:\u0007AB@CDEFB?\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB]\b\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0016\b\u0001\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J(\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÇ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001f\u0010\u001eJ\u001c\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)JP\u0010*\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b,\u0010)J\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R,\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010'R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010=\u0012\u0004\b?\u00106\u001a\u0004\b>\u0010)¨\u0006G"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen$ScreenType;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;", "screens", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;", "appearance", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;", "localization", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;", "support", "", "lastPublishedAppVersion", "<init>", "(Ljava/util/Map;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;Ljava/lang/String;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/util/Map;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;Ljava/lang/String;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;Ljh/d;Lih/f;)V", "getManagementScreen", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;", "getNoActiveScreen", "component1", "()Ljava/util/Map;", "component2", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;", "component3", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;", "component4", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;", "component5", "()Ljava/lang/String;", "copy", "(Ljava/util/Map;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;Ljava/lang/String;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getScreens", "getScreens$annotations", "()V", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;", "getAppearance", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;", "getLocalization", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;", "getSupport", "Ljava/lang/String;", "getLastPublishedAppVersion", "getLastPublishedAppVersion$annotations", "Companion", "$serializer", "Appearance", "HelpPath", "Localization", "Screen", "Support", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalPreviewRevenueCatPurchasesAPI
public final class CustomerCenterConfigData {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Appearance appearance;
    private final String lastPublishedAppVersion;
    private final Localization localization;
    private final Map<Screen.ScreenType, Screen> screens;
    private final Support support;

    @C5985i
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 %2\u00020\u0001:\u0003&'%B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J(\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0015¨\u0006("}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;", "light", "dark", "<init>", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Ljh/d;Lih/f;)V", "component1", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;", "component2", "copy", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;", "getLight", "getDark", "Companion", "$serializer", "ColorInformation", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Appearance {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final ColorInformation dark;
        private final ColorInformation light;

        @C5985i
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000 52\u00020\u0001:\u000265Ba\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\t\u0010\nBu\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0010\b\u0001\u0010\b\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0018\u0010\u001b\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0018\u0010\u001c\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0018\u0010\u001d\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019Jj\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R(\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0019R(\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010\u0019R(\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b0\u0010,\u001a\u0004\b/\u0010\u0019R(\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b2\u0010,\u001a\u0004\b1\u0010\u0019R(\u0010\b\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u0010)\u0012\u0004\b4\u0010,\u001a\u0004\b3\u0010\u0019¨\u00067"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;", "", "Lcom/revenuecat/purchases/paywalls/PaywallColor;", "Lcom/revenuecat/purchases/customercenter/RCColor;", "accentColor", "textColor", "backgroundColor", "buttonTextColor", "buttonBackgroundColor", "<init>", "(Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;Ljh/d;Lih/f;)V", "component1", "()Lcom/revenuecat/purchases/paywalls/PaywallColor;", "component2", "component3", "component4", "component5", "copy", "(Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/PaywallColor;", "getAccentColor", "getAccentColor$annotations", "()V", "getTextColor", "getTextColor$annotations", "getBackgroundColor", "getBackgroundColor$annotations", "getButtonTextColor", "getButtonTextColor$annotations", "getButtonBackgroundColor", "getButtonBackgroundColor$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ColorInformation {
            public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
            private final PaywallColor accentColor;
            private final PaywallColor backgroundColor;
            private final PaywallColor buttonBackgroundColor;
            private final PaywallColor buttonTextColor;
            private final PaywallColor textColor;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final C5978b serializer() {
                    return CustomerCenterConfigData$Appearance$ColorInformation$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public ColorInformation() {
                this((PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, 31, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ ColorInformation copy$default(ColorInformation colorInformation, PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    paywallColor = colorInformation.accentColor;
                }
                if ((i10 & 2) != 0) {
                    paywallColor2 = colorInformation.textColor;
                }
                PaywallColor paywallColor6 = paywallColor2;
                if ((i10 & 4) != 0) {
                    paywallColor3 = colorInformation.backgroundColor;
                }
                PaywallColor paywallColor7 = paywallColor3;
                if ((i10 & 8) != 0) {
                    paywallColor4 = colorInformation.buttonTextColor;
                }
                PaywallColor paywallColor8 = paywallColor4;
                if ((i10 & 16) != 0) {
                    paywallColor5 = colorInformation.buttonBackgroundColor;
                }
                return colorInformation.copy(paywallColor, paywallColor6, paywallColor7, paywallColor8, paywallColor5);
            }

            @C5985i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getAccentColor$annotations() {
            }

            @C5985i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getBackgroundColor$annotations() {
            }

            @C5985i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getButtonBackgroundColor$annotations() {
            }

            @C5985i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getButtonTextColor$annotations() {
            }

            @C5985i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getTextColor$annotations() {
            }

            public static final /* synthetic */ void write$Self(ColorInformation colorInformation, d dVar, f fVar) {
                if (dVar.q(fVar, 0) || colorInformation.accentColor != null) {
                    dVar.p(fVar, 0, PaywallColor.Serializer.INSTANCE, colorInformation.accentColor);
                }
                if (dVar.q(fVar, 1) || colorInformation.textColor != null) {
                    dVar.p(fVar, 1, PaywallColor.Serializer.INSTANCE, colorInformation.textColor);
                }
                if (dVar.q(fVar, 2) || colorInformation.backgroundColor != null) {
                    dVar.p(fVar, 2, PaywallColor.Serializer.INSTANCE, colorInformation.backgroundColor);
                }
                if (dVar.q(fVar, 3) || colorInformation.buttonTextColor != null) {
                    dVar.p(fVar, 3, PaywallColor.Serializer.INSTANCE, colorInformation.buttonTextColor);
                }
                if (dVar.q(fVar, 4) || colorInformation.buttonBackgroundColor != null) {
                    dVar.p(fVar, 4, PaywallColor.Serializer.INSTANCE, colorInformation.buttonBackgroundColor);
                }
            }

            public final PaywallColor component1() {
                return this.accentColor;
            }

            public final PaywallColor component2() {
                return this.textColor;
            }

            public final PaywallColor component3() {
                return this.backgroundColor;
            }

            public final PaywallColor component4() {
                return this.buttonTextColor;
            }

            public final PaywallColor component5() {
                return this.buttonBackgroundColor;
            }

            public final ColorInformation copy(PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5) {
                return new ColorInformation(paywallColor, paywallColor2, paywallColor3, paywallColor4, paywallColor5);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ColorInformation)) {
                    return false;
                }
                ColorInformation colorInformation = (ColorInformation) obj;
                return C6496s.c(this.accentColor, colorInformation.accentColor) && C6496s.c(this.textColor, colorInformation.textColor) && C6496s.c(this.backgroundColor, colorInformation.backgroundColor) && C6496s.c(this.buttonTextColor, colorInformation.buttonTextColor) && C6496s.c(this.buttonBackgroundColor, colorInformation.buttonBackgroundColor);
            }

            public final PaywallColor getAccentColor() {
                return this.accentColor;
            }

            public final PaywallColor getBackgroundColor() {
                return this.backgroundColor;
            }

            public final PaywallColor getButtonBackgroundColor() {
                return this.buttonBackgroundColor;
            }

            public final PaywallColor getButtonTextColor() {
                return this.buttonTextColor;
            }

            public final PaywallColor getTextColor() {
                return this.textColor;
            }

            public int hashCode() {
                PaywallColor paywallColor = this.accentColor;
                int i10 = 0;
                int hashCode = (paywallColor == null ? 0 : paywallColor.hashCode()) * 31;
                PaywallColor paywallColor2 = this.textColor;
                int hashCode2 = (hashCode + (paywallColor2 == null ? 0 : paywallColor2.hashCode())) * 31;
                PaywallColor paywallColor3 = this.backgroundColor;
                int hashCode3 = (hashCode2 + (paywallColor3 == null ? 0 : paywallColor3.hashCode())) * 31;
                PaywallColor paywallColor4 = this.buttonTextColor;
                int hashCode4 = (hashCode3 + (paywallColor4 == null ? 0 : paywallColor4.hashCode())) * 31;
                PaywallColor paywallColor5 = this.buttonBackgroundColor;
                if (paywallColor5 != null) {
                    i10 = paywallColor5.hashCode();
                }
                return hashCode4 + i10;
            }

            public String toString() {
                return "ColorInformation(accentColor=" + this.accentColor + ", textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ", buttonTextColor=" + this.buttonTextColor + ", buttonBackgroundColor=" + this.buttonBackgroundColor + ')';
            }

            @C6521e
            public /* synthetic */ ColorInformation(int i10, @C5985i(with = PaywallColor.Serializer.class) PaywallColor paywallColor, @C5985i(with = PaywallColor.Serializer.class) PaywallColor paywallColor2, @C5985i(with = PaywallColor.Serializer.class) PaywallColor paywallColor3, @C5985i(with = PaywallColor.Serializer.class) PaywallColor paywallColor4, @C5985i(with = PaywallColor.Serializer.class) PaywallColor paywallColor5, t0 t0Var) {
                if ((i10 & 1) == 0) {
                    this.accentColor = null;
                } else {
                    this.accentColor = paywallColor;
                }
                if ((i10 & 2) == 0) {
                    this.textColor = null;
                } else {
                    this.textColor = paywallColor2;
                }
                if ((i10 & 4) == 0) {
                    this.backgroundColor = null;
                } else {
                    this.backgroundColor = paywallColor3;
                }
                if ((i10 & 8) == 0) {
                    this.buttonTextColor = null;
                } else {
                    this.buttonTextColor = paywallColor4;
                }
                if ((i10 & 16) == 0) {
                    this.buttonBackgroundColor = null;
                } else {
                    this.buttonBackgroundColor = paywallColor5;
                }
            }

            public ColorInformation(PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5) {
                this.accentColor = paywallColor;
                this.textColor = paywallColor2;
                this.backgroundColor = paywallColor3;
                this.buttonTextColor = paywallColor4;
                this.buttonBackgroundColor = paywallColor5;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ ColorInformation(com.revenuecat.purchases.paywalls.PaywallColor r5, com.revenuecat.purchases.paywalls.PaywallColor r6, com.revenuecat.purchases.paywalls.PaywallColor r7, com.revenuecat.purchases.paywalls.PaywallColor r8, com.revenuecat.purchases.paywalls.PaywallColor r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
                /*
                    r4 = this;
                    r11 = r10 & 1
                    r0 = 0
                    if (r11 == 0) goto L_0x0007
                    r11 = r0
                    goto L_0x0008
                L_0x0007:
                    r11 = r5
                L_0x0008:
                    r5 = r10 & 2
                    if (r5 == 0) goto L_0x000e
                    r1 = r0
                    goto L_0x000f
                L_0x000e:
                    r1 = r6
                L_0x000f:
                    r5 = r10 & 4
                    if (r5 == 0) goto L_0x0015
                    r2 = r0
                    goto L_0x0016
                L_0x0015:
                    r2 = r7
                L_0x0016:
                    r5 = r10 & 8
                    if (r5 == 0) goto L_0x001c
                    r3 = r0
                    goto L_0x001d
                L_0x001c:
                    r3 = r8
                L_0x001d:
                    r5 = r10 & 16
                    if (r5 == 0) goto L_0x0023
                    r10 = r0
                    goto L_0x0024
                L_0x0023:
                    r10 = r9
                L_0x0024:
                    r5 = r4
                    r6 = r11
                    r7 = r1
                    r8 = r2
                    r9 = r3
                    r5.<init>(r6, r7, r8, r9, r10)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Appearance.ColorInformation.<init>(com.revenuecat.purchases.paywalls.PaywallColor, com.revenuecat.purchases.paywalls.PaywallColor, com.revenuecat.purchases.paywalls.PaywallColor, com.revenuecat.purchases.paywalls.PaywallColor, com.revenuecat.purchases.paywalls.PaywallColor, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return CustomerCenterConfigData$Appearance$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Appearance() {
            this((ColorInformation) null, (ColorInformation) null, 3, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Appearance copy$default(Appearance appearance, ColorInformation colorInformation, ColorInformation colorInformation2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                colorInformation = appearance.light;
            }
            if ((i10 & 2) != 0) {
                colorInformation2 = appearance.dark;
            }
            return appearance.copy(colorInformation, colorInformation2);
        }

        public static final /* synthetic */ void write$Self(Appearance appearance, d dVar, f fVar) {
            if (dVar.q(fVar, 0) || appearance.light != null) {
                dVar.p(fVar, 0, CustomerCenterConfigData$Appearance$ColorInformation$$serializer.INSTANCE, appearance.light);
            }
            if (dVar.q(fVar, 1) || appearance.dark != null) {
                dVar.p(fVar, 1, CustomerCenterConfigData$Appearance$ColorInformation$$serializer.INSTANCE, appearance.dark);
            }
        }

        public final ColorInformation component1() {
            return this.light;
        }

        public final ColorInformation component2() {
            return this.dark;
        }

        public final Appearance copy(ColorInformation colorInformation, ColorInformation colorInformation2) {
            return new Appearance(colorInformation, colorInformation2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Appearance)) {
                return false;
            }
            Appearance appearance = (Appearance) obj;
            return C6496s.c(this.light, appearance.light) && C6496s.c(this.dark, appearance.dark);
        }

        public final ColorInformation getDark() {
            return this.dark;
        }

        public final ColorInformation getLight() {
            return this.light;
        }

        public int hashCode() {
            ColorInformation colorInformation = this.light;
            int i10 = 0;
            int hashCode = (colorInformation == null ? 0 : colorInformation.hashCode()) * 31;
            ColorInformation colorInformation2 = this.dark;
            if (colorInformation2 != null) {
                i10 = colorInformation2.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            return "Appearance(light=" + this.light + ", dark=" + this.dark + ')';
        }

        @C6521e
        public /* synthetic */ Appearance(int i10, ColorInformation colorInformation, ColorInformation colorInformation2, t0 t0Var) {
            if ((i10 & 1) == 0) {
                this.light = null;
            } else {
                this.light = colorInformation;
            }
            if ((i10 & 2) == 0) {
                this.dark = null;
            } else {
                this.dark = colorInformation2;
            }
        }

        public Appearance(ColorInformation colorInformation, ColorInformation colorInformation2) {
            this.light = colorInformation;
            this.dark = colorInformation2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Appearance(ColorInformation colorInformation, ColorInformation colorInformation2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : colorInformation, (i10 & 2) != 0 ? null : colorInformation2);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return CustomerCenterConfigData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C5985i
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0018\b\b\u0018\u0000 B2\u00020\u0001:\u0005CBDEFBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBg\b\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J(\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÇ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(J^\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001eJ\u0010\u0010,\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010!R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u00107\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010#R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010;\u0012\u0004\b=\u0010:\u001a\u0004\b<\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b>\u0010\u001eR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010?\u0012\u0004\bA\u0010:\u001a\u0004\b@\u0010(¨\u0006G"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "", "", "id", "title", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;", "type", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;", "promotionalOffer", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;", "feedbackSurvey", "url", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;", "openMethod", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Ljh/d;Lih/f;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;", "component4", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;", "component5", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;", "component6", "component7", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitle", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;", "getType", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;", "getPromotionalOffer", "getPromotionalOffer$annotations", "()V", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;", "getFeedbackSurvey", "getFeedbackSurvey$annotations", "getUrl", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;", "getOpenMethod", "getOpenMethod$annotations", "Companion", "$serializer", "OpenMethod", "PathDetail", "PathType", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class HelpPath {
        /* access modifiers changed from: private */
        public static final C5978b[] $childSerializers = {null, null, PathType.Companion.serializer(), null, null, null, OpenMethod.Companion.serializer()};
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final PathDetail.FeedbackSurvey feedbackSurvey;

        /* renamed from: id  reason: collision with root package name */
        private final String f59493id;
        private final OpenMethod openMethod;
        private final PathDetail.PromotionalOffer promotionalOffer;
        private final String title;
        private final PathType type;
        private final String url;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return CustomerCenterConfigData$HelpPath$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @C5985i
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;", "", "(Ljava/lang/String;I)V", "IN_APP", "EXTERNAL", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum OpenMethod {
            IN_APP,
            EXTERNAL;
            
            /* access modifiers changed from: private */
            public static final Lazy $cachedSerializer$delegate = null;
            public static final Companion Companion = null;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private final /* synthetic */ C5978b get$cachedSerializer() {
                    return (C5978b) OpenMethod.$cachedSerializer$delegate.getValue();
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

        @C5985i
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0003\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fHÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0001\u0002\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail;", "", "<init>", "()V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail;Ljh/d;Lih/f;)V", "Companion", "FeedbackSurvey", "PromotionalOffer", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static abstract class PathDetail {
            /* access modifiers changed from: private */
            public static final Lazy $cachedSerializer$delegate = C6531o.a(C6534r.PUBLICATION, Companion.AnonymousClass1.INSTANCE);
            public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private final /* synthetic */ C5978b get$cachedSerializer() {
                    return (C5978b) PathDetail.$cachedSerializer$delegate.getValue();
                }

                public final C5978b serializer() {
                    return get$cachedSerializer();
                }

                private Companion() {
                }
            }

            @C5985i
            @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 (2\u00020\u0001:\u0003)(*B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006+"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail;", "", "title", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;", "options", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;Ljh/d;Lih/f;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getOptions", "Companion", "$serializer", "Option", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class FeedbackSurvey extends PathDetail {
                /* access modifiers changed from: private */
                public static final C5978b[] $childSerializers = {null, new C6449f(CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer.INSTANCE)};
                public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
                private final List<Option> options;
                private final String title;

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final C5978b serializer() {
                        return CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                @C5985i
                @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 +2\u00020\u0001:\u0002,+B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB;\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ0\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u001a¨\u0006-"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;", "", "", "id", "title", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;", "promotionalOffer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;Ljh/d;Lih/f;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitle", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;", "getPromotionalOffer", "getPromotionalOffer$annotations", "()V", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Option {
                    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

                    /* renamed from: id  reason: collision with root package name */
                    private final String f59494id;
                    private final PromotionalOffer promotionalOffer;
                    private final String title;

                    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
                    public static final class Companion {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final C5978b serializer() {
                            return CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer.INSTANCE;
                        }

                        private Companion() {
                        }
                    }

                    @C6521e
                    public /* synthetic */ Option(int i10, String str, String str2, PromotionalOffer promotionalOffer2, t0 t0Var) {
                        if (3 != (i10 & 3)) {
                            C6456i0.a(i10, 3, CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer.INSTANCE.getDescriptor());
                        }
                        this.f59494id = str;
                        this.title = str2;
                        if ((i10 & 4) == 0) {
                            this.promotionalOffer = null;
                        } else {
                            this.promotionalOffer = promotionalOffer2;
                        }
                    }

                    public static /* synthetic */ Option copy$default(Option option, String str, String str2, PromotionalOffer promotionalOffer2, int i10, Object obj) {
                        if ((i10 & 1) != 0) {
                            str = option.f59494id;
                        }
                        if ((i10 & 2) != 0) {
                            str2 = option.title;
                        }
                        if ((i10 & 4) != 0) {
                            promotionalOffer2 = option.promotionalOffer;
                        }
                        return option.copy(str, str2, promotionalOffer2);
                    }

                    public static /* synthetic */ void getPromotionalOffer$annotations() {
                    }

                    public static final /* synthetic */ void write$Self(Option option, d dVar, f fVar) {
                        dVar.t(fVar, 0, option.f59494id);
                        dVar.t(fVar, 1, option.title);
                        if (dVar.q(fVar, 2) || option.promotionalOffer != null) {
                            dVar.p(fVar, 2, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE, option.promotionalOffer);
                        }
                    }

                    public final String component1() {
                        return this.f59494id;
                    }

                    public final String component2() {
                        return this.title;
                    }

                    public final PromotionalOffer component3() {
                        return this.promotionalOffer;
                    }

                    public final Option copy(String str, String str2, PromotionalOffer promotionalOffer2) {
                        C6496s.h(str, "id");
                        C6496s.h(str2, b.f37461S);
                        return new Option(str, str2, promotionalOffer2);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Option)) {
                            return false;
                        }
                        Option option = (Option) obj;
                        return C6496s.c(this.f59494id, option.f59494id) && C6496s.c(this.title, option.title) && C6496s.c(this.promotionalOffer, option.promotionalOffer);
                    }

                    public final String getId() {
                        return this.f59494id;
                    }

                    public final PromotionalOffer getPromotionalOffer() {
                        return this.promotionalOffer;
                    }

                    public final String getTitle() {
                        return this.title;
                    }

                    public int hashCode() {
                        int hashCode = ((this.f59494id.hashCode() * 31) + this.title.hashCode()) * 31;
                        PromotionalOffer promotionalOffer2 = this.promotionalOffer;
                        return hashCode + (promotionalOffer2 == null ? 0 : promotionalOffer2.hashCode());
                    }

                    public String toString() {
                        return "Option(id=" + this.f59494id + ", title=" + this.title + ", promotionalOffer=" + this.promotionalOffer + ')';
                    }

                    public Option(String str, String str2, PromotionalOffer promotionalOffer2) {
                        C6496s.h(str, "id");
                        C6496s.h(str2, b.f37461S);
                        this.f59494id = str;
                        this.title = str2;
                        this.promotionalOffer = promotionalOffer2;
                    }

                    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                    public /* synthetic */ Option(String str, String str2, PromotionalOffer promotionalOffer2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                        this(str, str2, (i10 & 4) != 0 ? null : promotionalOffer2);
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                @C6521e
                public /* synthetic */ FeedbackSurvey(int i10, String str, List list, t0 t0Var) {
                    super(i10, t0Var);
                    if (3 != (i10 & 3)) {
                        C6456i0.a(i10, 3, CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE.getDescriptor());
                    }
                    this.title = str;
                    this.options = list;
                }

                public static /* synthetic */ FeedbackSurvey copy$default(FeedbackSurvey feedbackSurvey, String str, List<Option> list, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = feedbackSurvey.title;
                    }
                    if ((i10 & 2) != 0) {
                        list = feedbackSurvey.options;
                    }
                    return feedbackSurvey.copy(str, list);
                }

                public static final /* synthetic */ void write$Self(FeedbackSurvey feedbackSurvey, d dVar, f fVar) {
                    PathDetail.write$Self(feedbackSurvey, dVar, fVar);
                    C5978b[] bVarArr = $childSerializers;
                    dVar.t(fVar, 0, feedbackSurvey.title);
                    dVar.B(fVar, 1, bVarArr[1], feedbackSurvey.options);
                }

                public final String component1() {
                    return this.title;
                }

                public final List<Option> component2() {
                    return this.options;
                }

                public final FeedbackSurvey copy(String str, List<Option> list) {
                    C6496s.h(str, b.f37461S);
                    C6496s.h(list, "options");
                    return new FeedbackSurvey(str, list);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof FeedbackSurvey)) {
                        return false;
                    }
                    FeedbackSurvey feedbackSurvey = (FeedbackSurvey) obj;
                    return C6496s.c(this.title, feedbackSurvey.title) && C6496s.c(this.options, feedbackSurvey.options);
                }

                public final List<Option> getOptions() {
                    return this.options;
                }

                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    return (this.title.hashCode() * 31) + this.options.hashCode();
                }

                public String toString() {
                    return "FeedbackSurvey(title=" + this.title + ", options=" + this.options + ')';
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public FeedbackSurvey(String str, List<Option> list) {
                    super((DefaultConstructorMarker) null);
                    C6496s.h(str, b.f37461S);
                    C6496s.h(list, "options");
                    this.title = str;
                    this.options = list;
                }
            }

            @C5985i
            @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0011\b\b\u0018\u0000 52\u00020\u0001:\u000265B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\n\u0010\u000bB[\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 JN\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b0\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b1\u0010\u001aR,\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u00102\u0012\u0004\b4\u0010-\u001a\u0004\b3\u0010 ¨\u00067"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail;", "", "androidOfferId", "", "eligible", "title", "subtitle", "", "productMapping", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Ljh/d;Lih/f;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAndroidOfferId", "getAndroidOfferId$annotations", "()V", "Z", "getEligible", "getTitle", "getSubtitle", "Ljava/util/Map;", "getProductMapping", "getProductMapping$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class PromotionalOffer extends PathDetail {
                /* access modifiers changed from: private */
                public static final C5978b[] $childSerializers;
                public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
                private final String androidOfferId;
                private final boolean eligible;
                private final Map<String, String> productMapping;
                private final String subtitle;
                private final String title;

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final C5978b serializer() {
                        return CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                static {
                    x0 x0Var = x0.f71726a;
                    $childSerializers = new C5978b[]{null, null, null, null, new M(x0Var, x0Var)};
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                @C6521e
                public /* synthetic */ PromotionalOffer(int i10, String str, boolean z10, String str2, String str3, Map map, t0 t0Var) {
                    super(i10, t0Var);
                    if (31 != (i10 & 31)) {
                        C6456i0.a(i10, 31, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE.getDescriptor());
                    }
                    this.androidOfferId = str;
                    this.eligible = z10;
                    this.title = str2;
                    this.subtitle = str3;
                    this.productMapping = map;
                }

                public static /* synthetic */ PromotionalOffer copy$default(PromotionalOffer promotionalOffer, String str, boolean z10, String str2, String str3, Map<String, String> map, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = promotionalOffer.androidOfferId;
                    }
                    if ((i10 & 2) != 0) {
                        z10 = promotionalOffer.eligible;
                    }
                    boolean z11 = z10;
                    if ((i10 & 4) != 0) {
                        str2 = promotionalOffer.title;
                    }
                    String str4 = str2;
                    if ((i10 & 8) != 0) {
                        str3 = promotionalOffer.subtitle;
                    }
                    String str5 = str3;
                    if ((i10 & 16) != 0) {
                        map = promotionalOffer.productMapping;
                    }
                    return promotionalOffer.copy(str, z11, str4, str5, map);
                }

                public static /* synthetic */ void getAndroidOfferId$annotations() {
                }

                public static /* synthetic */ void getProductMapping$annotations() {
                }

                public static final /* synthetic */ void write$Self(PromotionalOffer promotionalOffer, d dVar, f fVar) {
                    PathDetail.write$Self(promotionalOffer, dVar, fVar);
                    C5978b[] bVarArr = $childSerializers;
                    dVar.t(fVar, 0, promotionalOffer.androidOfferId);
                    dVar.A(fVar, 1, promotionalOffer.eligible);
                    dVar.t(fVar, 2, promotionalOffer.title);
                    dVar.t(fVar, 3, promotionalOffer.subtitle);
                    dVar.B(fVar, 4, bVarArr[4], promotionalOffer.productMapping);
                }

                public final String component1() {
                    return this.androidOfferId;
                }

                public final boolean component2() {
                    return this.eligible;
                }

                public final String component3() {
                    return this.title;
                }

                public final String component4() {
                    return this.subtitle;
                }

                public final Map<String, String> component5() {
                    return this.productMapping;
                }

                public final PromotionalOffer copy(String str, boolean z10, String str2, String str3, Map<String, String> map) {
                    C6496s.h(str, "androidOfferId");
                    C6496s.h(str2, b.f37461S);
                    C6496s.h(str3, "subtitle");
                    C6496s.h(map, "productMapping");
                    return new PromotionalOffer(str, z10, str2, str3, map);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof PromotionalOffer)) {
                        return false;
                    }
                    PromotionalOffer promotionalOffer = (PromotionalOffer) obj;
                    return C6496s.c(this.androidOfferId, promotionalOffer.androidOfferId) && this.eligible == promotionalOffer.eligible && C6496s.c(this.title, promotionalOffer.title) && C6496s.c(this.subtitle, promotionalOffer.subtitle) && C6496s.c(this.productMapping, promotionalOffer.productMapping);
                }

                public final String getAndroidOfferId() {
                    return this.androidOfferId;
                }

                public final boolean getEligible() {
                    return this.eligible;
                }

                public final Map<String, String> getProductMapping() {
                    return this.productMapping;
                }

                public final String getSubtitle() {
                    return this.subtitle;
                }

                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    int hashCode = this.androidOfferId.hashCode() * 31;
                    boolean z10 = this.eligible;
                    if (z10) {
                        z10 = true;
                    }
                    return ((((((hashCode + (z10 ? 1 : 0)) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.productMapping.hashCode();
                }

                public String toString() {
                    return "PromotionalOffer(androidOfferId=" + this.androidOfferId + ", eligible=" + this.eligible + ", title=" + this.title + ", subtitle=" + this.subtitle + ", productMapping=" + this.productMapping + ')';
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public PromotionalOffer(String str, boolean z10, String str2, String str3, Map<String, String> map) {
                    super((DefaultConstructorMarker) null);
                    C6496s.h(str, "androidOfferId");
                    C6496s.h(str2, b.f37461S);
                    C6496s.h(str3, "subtitle");
                    C6496s.h(map, "productMapping");
                    this.androidOfferId = str;
                    this.eligible = z10;
                    this.title = str2;
                    this.subtitle = str3;
                    this.productMapping = map;
                }
            }

            public /* synthetic */ PathDetail(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private PathDetail() {
            }

            @C6521e
            public /* synthetic */ PathDetail(int i10, t0 t0Var) {
            }

            public static final /* synthetic */ void write$Self(PathDetail pathDetail, d dVar, f fVar) {
            }
        }

        @C5985i
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;", "", "(Ljava/lang/String;I)V", "MISSING_PURCHASE", "REFUND_REQUEST", "CHANGE_PLANS", "CANCEL", "CUSTOM_URL", "UNKNOWN", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum PathType {
            MISSING_PURCHASE,
            REFUND_REQUEST,
            CHANGE_PLANS,
            CANCEL,
            CUSTOM_URL,
            UNKNOWN;
            
            /* access modifiers changed from: private */
            public static final Lazy $cachedSerializer$delegate = null;
            public static final Companion Companion = null;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private final /* synthetic */ C5978b get$cachedSerializer() {
                    return (C5978b) PathType.$cachedSerializer$delegate.getValue();
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

        @C6521e
        public /* synthetic */ HelpPath(int i10, String str, String str2, PathType pathType, PathDetail.PromotionalOffer promotionalOffer2, PathDetail.FeedbackSurvey feedbackSurvey2, String str3, OpenMethod openMethod2, t0 t0Var) {
            if (7 != (i10 & 7)) {
                C6456i0.a(i10, 7, CustomerCenterConfigData$HelpPath$$serializer.INSTANCE.getDescriptor());
            }
            this.f59493id = str;
            this.title = str2;
            this.type = pathType;
            if ((i10 & 8) == 0) {
                this.promotionalOffer = null;
            } else {
                this.promotionalOffer = promotionalOffer2;
            }
            if ((i10 & 16) == 0) {
                this.feedbackSurvey = null;
            } else {
                this.feedbackSurvey = feedbackSurvey2;
            }
            if ((i10 & 32) == 0) {
                this.url = null;
            } else {
                this.url = str3;
            }
            if ((i10 & 64) == 0) {
                this.openMethod = null;
            } else {
                this.openMethod = openMethod2;
            }
        }

        public static /* synthetic */ HelpPath copy$default(HelpPath helpPath, String str, String str2, PathType pathType, PathDetail.PromotionalOffer promotionalOffer2, PathDetail.FeedbackSurvey feedbackSurvey2, String str3, OpenMethod openMethod2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = helpPath.f59493id;
            }
            if ((i10 & 2) != 0) {
                str2 = helpPath.title;
            }
            String str4 = str2;
            if ((i10 & 4) != 0) {
                pathType = helpPath.type;
            }
            PathType pathType2 = pathType;
            if ((i10 & 8) != 0) {
                promotionalOffer2 = helpPath.promotionalOffer;
            }
            PathDetail.PromotionalOffer promotionalOffer3 = promotionalOffer2;
            if ((i10 & 16) != 0) {
                feedbackSurvey2 = helpPath.feedbackSurvey;
            }
            PathDetail.FeedbackSurvey feedbackSurvey3 = feedbackSurvey2;
            if ((i10 & 32) != 0) {
                str3 = helpPath.url;
            }
            String str5 = str3;
            if ((i10 & 64) != 0) {
                openMethod2 = helpPath.openMethod;
            }
            return helpPath.copy(str, str4, pathType2, promotionalOffer3, feedbackSurvey3, str5, openMethod2);
        }

        public static /* synthetic */ void getFeedbackSurvey$annotations() {
        }

        public static /* synthetic */ void getOpenMethod$annotations() {
        }

        public static /* synthetic */ void getPromotionalOffer$annotations() {
        }

        public static final /* synthetic */ void write$Self(HelpPath helpPath, d dVar, f fVar) {
            C5978b[] bVarArr = $childSerializers;
            dVar.t(fVar, 0, helpPath.f59493id);
            dVar.t(fVar, 1, helpPath.title);
            dVar.B(fVar, 2, bVarArr[2], helpPath.type);
            if (dVar.q(fVar, 3) || helpPath.promotionalOffer != null) {
                dVar.p(fVar, 3, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE, helpPath.promotionalOffer);
            }
            if (dVar.q(fVar, 4) || helpPath.feedbackSurvey != null) {
                dVar.p(fVar, 4, CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE, helpPath.feedbackSurvey);
            }
            if (dVar.q(fVar, 5) || helpPath.url != null) {
                dVar.p(fVar, 5, x0.f71726a, helpPath.url);
            }
            if (dVar.q(fVar, 6) || helpPath.openMethod != null) {
                dVar.p(fVar, 6, bVarArr[6], helpPath.openMethod);
            }
        }

        public final String component1() {
            return this.f59493id;
        }

        public final String component2() {
            return this.title;
        }

        public final PathType component3() {
            return this.type;
        }

        public final PathDetail.PromotionalOffer component4() {
            return this.promotionalOffer;
        }

        public final PathDetail.FeedbackSurvey component5() {
            return this.feedbackSurvey;
        }

        public final String component6() {
            return this.url;
        }

        public final OpenMethod component7() {
            return this.openMethod;
        }

        public final HelpPath copy(String str, String str2, PathType pathType, PathDetail.PromotionalOffer promotionalOffer2, PathDetail.FeedbackSurvey feedbackSurvey2, String str3, OpenMethod openMethod2) {
            C6496s.h(str, "id");
            C6496s.h(str2, b.f37461S);
            C6496s.h(pathType, "type");
            return new HelpPath(str, str2, pathType, promotionalOffer2, feedbackSurvey2, str3, openMethod2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HelpPath)) {
                return false;
            }
            HelpPath helpPath = (HelpPath) obj;
            return C6496s.c(this.f59493id, helpPath.f59493id) && C6496s.c(this.title, helpPath.title) && this.type == helpPath.type && C6496s.c(this.promotionalOffer, helpPath.promotionalOffer) && C6496s.c(this.feedbackSurvey, helpPath.feedbackSurvey) && C6496s.c(this.url, helpPath.url) && this.openMethod == helpPath.openMethod;
        }

        public final PathDetail.FeedbackSurvey getFeedbackSurvey() {
            return this.feedbackSurvey;
        }

        public final String getId() {
            return this.f59493id;
        }

        public final OpenMethod getOpenMethod() {
            return this.openMethod;
        }

        public final PathDetail.PromotionalOffer getPromotionalOffer() {
            return this.promotionalOffer;
        }

        public final String getTitle() {
            return this.title;
        }

        public final PathType getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int hashCode = ((((this.f59493id.hashCode() * 31) + this.title.hashCode()) * 31) + this.type.hashCode()) * 31;
            PathDetail.PromotionalOffer promotionalOffer2 = this.promotionalOffer;
            int i10 = 0;
            int hashCode2 = (hashCode + (promotionalOffer2 == null ? 0 : promotionalOffer2.hashCode())) * 31;
            PathDetail.FeedbackSurvey feedbackSurvey2 = this.feedbackSurvey;
            int hashCode3 = (hashCode2 + (feedbackSurvey2 == null ? 0 : feedbackSurvey2.hashCode())) * 31;
            String str = this.url;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            OpenMethod openMethod2 = this.openMethod;
            if (openMethod2 != null) {
                i10 = openMethod2.hashCode();
            }
            return hashCode4 + i10;
        }

        public String toString() {
            return "HelpPath(id=" + this.f59493id + ", title=" + this.title + ", type=" + this.type + ", promotionalOffer=" + this.promotionalOffer + ", feedbackSurvey=" + this.feedbackSurvey + ", url=" + this.url + ", openMethod=" + this.openMethod + ')';
        }

        public HelpPath(String str, String str2, PathType pathType, PathDetail.PromotionalOffer promotionalOffer2, PathDetail.FeedbackSurvey feedbackSurvey2, String str3, OpenMethod openMethod2) {
            C6496s.h(str, "id");
            C6496s.h(str2, b.f37461S);
            C6496s.h(pathType, "type");
            this.f59493id = str;
            this.title = str2;
            this.type = pathType;
            this.promotionalOffer = promotionalOffer2;
            this.feedbackSurvey = feedbackSurvey2;
            this.url = str3;
            this.openMethod = openMethod2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ HelpPath(String str, String str2, PathType pathType, PathDetail.PromotionalOffer promotionalOffer2, PathDetail.FeedbackSurvey feedbackSurvey2, String str3, OpenMethod openMethod2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, pathType, (i10 & 8) != 0 ? null : promotionalOffer2, (i10 & 16) != 0 ? null : feedbackSurvey2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : openMethod2);
        }
    }

    @C5985i
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 ,2\u00020\u0001:\u0004-.,/B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ0\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u001aR,\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001c¨\u00060"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;", "", "", "locale", "", "localizedStrings", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Ljh/d;Lih/f;)V", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;", "key", "commonLocalizedString", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;)Ljava/lang/String;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLocale", "Ljava/util/Map;", "getLocalizedStrings", "getLocalizedStrings$annotations", "()V", "Companion", "$serializer", "CommonLocalizedString", "VariableName", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Localization {
        /* access modifiers changed from: private */
        public static final C5978b[] $childSerializers;
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final String locale;
        private final Map<String, String> localizedStrings;

        @C5985i
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b4\b\u0001\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6¨\u00068"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;", "", "(Ljava/lang/String;I)V", "defaultValue", "", "getDefaultValue", "()Ljava/lang/String;", "NO_THANKS", "NO_SUBSCRIPTIONS_FOUND", "TRY_CHECK_RESTORE", "RESTORE_PURCHASES", "CANCEL", "BILLING_CYCLE", "CURRENT_PRICE", "EXPIRED", "EXPIRES", "NEXT_BILLING_DATE", "REFUND_CANCELED", "REFUND_ERROR_GENERIC", "REFUND_GRANTED", "REFUND_STATUS", "SUB_EARLIEST_EXPIRATION", "SUB_EARLIEST_RENEWAL", "SUB_EXPIRED", "CONTACT_SUPPORT", "DEFAULT_BODY", "DEFAULT_SUBJECT", "DISMISS", "UPDATE_WARNING_TITLE", "UPDATE_WARNING_DESCRIPTION", "UPDATE_WARNING_UPDATE", "UPDATE_WARNING_IGNORE", "PLEASE_CONTACT_SUPPORT", "APPLE_SUBSCRIPTION_MANAGE", "GOOGLE_SUBSCRIPTION_MANAGE", "AMAZON_SUBSCRIPTION_MANAGE", "PLATFORM_MISMATCH", "GOING_TO_CHECK_PURCHASES", "CHECK_PAST_PURCHASES", "PURCHASES_RECOVERED", "PURCHASES_RECOVERED_EXPLANATION", "PURCHASES_NOT_RECOVERED", "PURCHASES_NOT_FOUND", "PURCHASES_RESTORING", "MANAGE_SUBSCRIPTION", "YOU_HAVE_PROMO", "YOU_HAVE_LIFETIME", "WEB_SUBSCRIPTION_MANAGE", "FREE", "NEVER", "FREE_TRIAL_THEN_PRICE", "SINGLE_PAYMENT_THEN_PRICE", "DISCOUNTED_RECURRING_THEN_PRICE", "FREE_TRIAL_SINGLE_PAYMENT_THEN_PRICE", "FREE_TRIAL_DISCOUNTED_THEN_PRICE", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum CommonLocalizedString {
            NO_THANKS,
            NO_SUBSCRIPTIONS_FOUND,
            TRY_CHECK_RESTORE,
            RESTORE_PURCHASES,
            CANCEL,
            BILLING_CYCLE,
            CURRENT_PRICE,
            EXPIRED,
            EXPIRES,
            NEXT_BILLING_DATE,
            REFUND_CANCELED,
            REFUND_ERROR_GENERIC,
            REFUND_GRANTED,
            REFUND_STATUS,
            SUB_EARLIEST_EXPIRATION,
            SUB_EARLIEST_RENEWAL,
            SUB_EXPIRED,
            CONTACT_SUPPORT,
            DEFAULT_BODY,
            DEFAULT_SUBJECT,
            DISMISS,
            UPDATE_WARNING_TITLE,
            UPDATE_WARNING_DESCRIPTION,
            UPDATE_WARNING_UPDATE,
            UPDATE_WARNING_IGNORE,
            PLEASE_CONTACT_SUPPORT,
            APPLE_SUBSCRIPTION_MANAGE,
            GOOGLE_SUBSCRIPTION_MANAGE,
            AMAZON_SUBSCRIPTION_MANAGE,
            PLATFORM_MISMATCH,
            GOING_TO_CHECK_PURCHASES,
            CHECK_PAST_PURCHASES,
            PURCHASES_RECOVERED,
            PURCHASES_RECOVERED_EXPLANATION,
            PURCHASES_NOT_RECOVERED,
            PURCHASES_NOT_FOUND,
            PURCHASES_RESTORING,
            MANAGE_SUBSCRIPTION,
            YOU_HAVE_PROMO,
            YOU_HAVE_LIFETIME,
            WEB_SUBSCRIPTION_MANAGE,
            FREE,
            NEVER,
            FREE_TRIAL_THEN_PRICE,
            SINGLE_PAYMENT_THEN_PRICE,
            DISCOUNTED_RECURRING_THEN_PRICE,
            FREE_TRIAL_SINGLE_PAYMENT_THEN_PRICE,
            FREE_TRIAL_DISCOUNTED_THEN_PRICE;
            
            /* access modifiers changed from: private */
            public static final Lazy $cachedSerializer$delegate = null;
            public static final Companion Companion = null;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private final /* synthetic */ C5978b get$cachedSerializer() {
                    return (C5978b) CommonLocalizedString.$cachedSerializer$delegate.getValue();
                }

                public final C5978b serializer() {
                    return get$cachedSerializer();
                }

                private Companion() {
                }
            }

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

                /* JADX WARNING: Can't wrap try/catch for region: R(98:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|(2:95|96)|97|99) */
                /* JADX WARNING: Can't wrap try/catch for region: R(99:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|99) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
                /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
                /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
                /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x008c */
                /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0096 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a0 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00aa */
                /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00b4 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00be */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00c8 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00d2 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00dc */
                /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00e6 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00f0 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00fa */
                /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0104 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x010e */
                /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0118 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0122 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x012c */
                /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0136 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0140 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x014a */
                /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0154 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x015e */
                /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0168 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0172 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x017c */
                /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0186 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0190 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x019a */
                /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x01a4 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x01ae */
                /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x01b8 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x01c2 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x01cc */
                /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x01d6 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
                static {
                    /*
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString[] r0 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.NO_THANKS     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.NO_SUBSCRIPTIONS_FOUND     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.TRY_CHECK_RESTORE     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.RESTORE_PURCHASES     // Catch:{ NoSuchFieldError -> 0x002b }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                        r2 = 4
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                    L_0x002b:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.CANCEL     // Catch:{ NoSuchFieldError -> 0x0034 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                        r2 = 5
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                    L_0x0034:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.BILLING_CYCLE     // Catch:{ NoSuchFieldError -> 0x003d }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                        r2 = 6
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                    L_0x003d:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.CURRENT_PRICE     // Catch:{ NoSuchFieldError -> 0x0046 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                        r2 = 7
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                    L_0x0046:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.EXPIRED     // Catch:{ NoSuchFieldError -> 0x0050 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                        r2 = 8
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
                    L_0x0050:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.EXPIRES     // Catch:{ NoSuchFieldError -> 0x005a }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                        r2 = 9
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
                    L_0x005a:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.NEXT_BILLING_DATE     // Catch:{ NoSuchFieldError -> 0x0064 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                        r2 = 10
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
                    L_0x0064:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.REFUND_CANCELED     // Catch:{ NoSuchFieldError -> 0x006e }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                        r2 = 11
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
                    L_0x006e:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.REFUND_ERROR_GENERIC     // Catch:{ NoSuchFieldError -> 0x0078 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                        r2 = 12
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
                    L_0x0078:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.REFUND_GRANTED     // Catch:{ NoSuchFieldError -> 0x0082 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                        r2 = 13
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
                    L_0x0082:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.REFUND_STATUS     // Catch:{ NoSuchFieldError -> 0x008c }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                        r2 = 14
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
                    L_0x008c:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.SUB_EARLIEST_EXPIRATION     // Catch:{ NoSuchFieldError -> 0x0096 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                        r2 = 15
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
                    L_0x0096:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.SUB_EARLIEST_RENEWAL     // Catch:{ NoSuchFieldError -> 0x00a0 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                        r2 = 16
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
                    L_0x00a0:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.SUB_EXPIRED     // Catch:{ NoSuchFieldError -> 0x00aa }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                        r2 = 17
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
                    L_0x00aa:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.CONTACT_SUPPORT     // Catch:{ NoSuchFieldError -> 0x00b4 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                        r2 = 18
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
                    L_0x00b4:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.DEFAULT_BODY     // Catch:{ NoSuchFieldError -> 0x00be }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00be }
                        r2 = 19
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00be }
                    L_0x00be:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.DEFAULT_SUBJECT     // Catch:{ NoSuchFieldError -> 0x00c8 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c8 }
                        r2 = 20
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c8 }
                    L_0x00c8:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.DISMISS     // Catch:{ NoSuchFieldError -> 0x00d2 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d2 }
                        r2 = 21
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d2 }
                    L_0x00d2:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.UPDATE_WARNING_TITLE     // Catch:{ NoSuchFieldError -> 0x00dc }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dc }
                        r2 = 22
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00dc }
                    L_0x00dc:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.UPDATE_WARNING_DESCRIPTION     // Catch:{ NoSuchFieldError -> 0x00e6 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e6 }
                        r2 = 23
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e6 }
                    L_0x00e6:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.UPDATE_WARNING_UPDATE     // Catch:{ NoSuchFieldError -> 0x00f0 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                        r2 = 24
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
                    L_0x00f0:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.UPDATE_WARNING_IGNORE     // Catch:{ NoSuchFieldError -> 0x00fa }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fa }
                        r2 = 25
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fa }
                    L_0x00fa:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.PLATFORM_MISMATCH     // Catch:{ NoSuchFieldError -> 0x0104 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0104 }
                        r2 = 26
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0104 }
                    L_0x0104:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.PLEASE_CONTACT_SUPPORT     // Catch:{ NoSuchFieldError -> 0x010e }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x010e }
                        r2 = 27
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x010e }
                    L_0x010e:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.APPLE_SUBSCRIPTION_MANAGE     // Catch:{ NoSuchFieldError -> 0x0118 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0118 }
                        r2 = 28
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0118 }
                    L_0x0118:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.GOOGLE_SUBSCRIPTION_MANAGE     // Catch:{ NoSuchFieldError -> 0x0122 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0122 }
                        r2 = 29
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0122 }
                    L_0x0122:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.AMAZON_SUBSCRIPTION_MANAGE     // Catch:{ NoSuchFieldError -> 0x012c }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                        r2 = 30
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
                    L_0x012c:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.GOING_TO_CHECK_PURCHASES     // Catch:{ NoSuchFieldError -> 0x0136 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0136 }
                        r2 = 31
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0136 }
                    L_0x0136:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.CHECK_PAST_PURCHASES     // Catch:{ NoSuchFieldError -> 0x0140 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0140 }
                        r2 = 32
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0140 }
                    L_0x0140:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.PURCHASES_RECOVERED     // Catch:{ NoSuchFieldError -> 0x014a }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x014a }
                        r2 = 33
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x014a }
                    L_0x014a:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.PURCHASES_RECOVERED_EXPLANATION     // Catch:{ NoSuchFieldError -> 0x0154 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0154 }
                        r2 = 34
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0154 }
                    L_0x0154:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.PURCHASES_NOT_RECOVERED     // Catch:{ NoSuchFieldError -> 0x015e }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015e }
                        r2 = 35
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015e }
                    L_0x015e:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.PURCHASES_NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0168 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0168 }
                        r2 = 36
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0168 }
                    L_0x0168:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.PURCHASES_RESTORING     // Catch:{ NoSuchFieldError -> 0x0172 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0172 }
                        r2 = 37
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0172 }
                    L_0x0172:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.MANAGE_SUBSCRIPTION     // Catch:{ NoSuchFieldError -> 0x017c }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x017c }
                        r2 = 38
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x017c }
                    L_0x017c:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.YOU_HAVE_PROMO     // Catch:{ NoSuchFieldError -> 0x0186 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0186 }
                        r2 = 39
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0186 }
                    L_0x0186:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.YOU_HAVE_LIFETIME     // Catch:{ NoSuchFieldError -> 0x0190 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0190 }
                        r2 = 40
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0190 }
                    L_0x0190:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.WEB_SUBSCRIPTION_MANAGE     // Catch:{ NoSuchFieldError -> 0x019a }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x019a }
                        r2 = 41
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x019a }
                    L_0x019a:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.FREE     // Catch:{ NoSuchFieldError -> 0x01a4 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a4 }
                        r2 = 42
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01a4 }
                    L_0x01a4:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.NEVER     // Catch:{ NoSuchFieldError -> 0x01ae }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ae }
                        r2 = 43
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01ae }
                    L_0x01ae:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.FREE_TRIAL_THEN_PRICE     // Catch:{ NoSuchFieldError -> 0x01b8 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b8 }
                        r2 = 44
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01b8 }
                    L_0x01b8:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.SINGLE_PAYMENT_THEN_PRICE     // Catch:{ NoSuchFieldError -> 0x01c2 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c2 }
                        r2 = 45
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01c2 }
                    L_0x01c2:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.DISCOUNTED_RECURRING_THEN_PRICE     // Catch:{ NoSuchFieldError -> 0x01cc }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01cc }
                        r2 = 46
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01cc }
                    L_0x01cc:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.FREE_TRIAL_SINGLE_PAYMENT_THEN_PRICE     // Catch:{ NoSuchFieldError -> 0x01d6 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d6 }
                        r2 = 47
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01d6 }
                    L_0x01d6:
                        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.FREE_TRIAL_DISCOUNTED_THEN_PRICE     // Catch:{ NoSuchFieldError -> 0x01e0 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01e0 }
                        r2 = 48
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01e0 }
                    L_0x01e0:
                        $EnumSwitchMapping$0 = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString.WhenMappings.<clinit>():void");
                }
            }

            static {
                Companion = new Companion((DefaultConstructorMarker) null);
                $cachedSerializer$delegate = C6531o.a(C6534r.PUBLICATION, Companion.AnonymousClass1.INSTANCE);
            }

            public final String getDefaultValue() {
                switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                    case 1:
                        return "No, thanks";
                    case 2:
                        return "No Subscriptions found";
                    case 3:
                        return "We can try checking your Apple account for any previous purchases";
                    case 4:
                        return "Restore purchases";
                    case 5:
                        return "Cancel";
                    case 6:
                        return "Billing cycle";
                    case 7:
                        return "Current price";
                    case 8:
                        return "Expired";
                    case 9:
                        return "Expires";
                    case 10:
                        return "Next billing date";
                    case 11:
                        return "Refund canceled";
                    case 12:
                        return "An error occurred while processing the refund request. Please try again.";
                    case 13:
                        return "Refund granted successfully!";
                    case StdKeyDeserializer.TYPE_URL:
                        return "Refund status";
                    case StdKeyDeserializer.TYPE_CLASS:
                        return "This is your subscription with the earliest expiration date.";
                    case 16:
                        return "This is your subscription with the earliest billing date.";
                    case 17:
                        return "This subscription has expired.";
                    case 18:
                        return "Contact support";
                    case 19:
                        return "Please describe your issue or question.";
                    case InboxPagingSource.PAGE_SIZE /*20*/:
                        return "Support Request";
                    case 21:
                        return "Dismiss";
                    case 22:
                        return "Update available";
                    case 23:
                        return "Downloading the latest version of the app may help solve the problem.";
                    case 24:
                        return "Update";
                    case 25:
                        return "Continue";
                    case 26:
                        return "Platform mismatch";
                    case 27:
                        return "Please contact support to manage your subscription.";
                    case 28:
                        return "You can manage your subscription by using the App Store app on an Apple device.";
                    case 29:
                        return "You have an active subscription from the Google Play Store";
                    case 30:
                        return "You have an active subscription from the Amazon Appstore. You can manage your subscription in the Amazon Appstore app.";
                    case 31:
                        return "Let’s take a look! We’re going to check your account for missing purchases.";
                    case c.f37660h:
                        return "Check past purchases";
                    case CharsToNameCanonicalizer.HASH_MULT:
                        return "Purchases recovered!";
                    case 34:
                        return "We applied the previously purchased items to your account. Sorry for the inconvenience.";
                    case 35:
                        return "We couldn't find any additional purchases under this account. Contact support for assistance if you think this is an error.";
                    case 36:
                        return "Purchases not found";
                    case 37:
                        return "Restoring purchases...";
                    case 38:
                        return "Manage your subscription";
                    case 39:
                        return "You've been granted a subscription that doesn’t renew";
                    case 40:
                        return "Your active lifetime subscription";
                    case 41:
                        return "You have an active subscription that was created on the web. You can manage your subscription by visiting your account.";
                    case 42:
                        return "Free";
                    case 43:
                        return "Never";
                    case Carousel.ENTITY_TYPE /*44*/:
                        return "First {{ sub_offer_duration }} free, then {{ price }}";
                    case 45:
                        return "{{ sub_offer_duration }} for {{ sub_offer_price }}, then {{ price }}";
                    case 46:
                        return "{{ sub_offer_price }} during {{ sub_offer_duration }}, then {{ price }}";
                    case 47:
                        return "Try {{ sub_offer_duration }} for free, then {{ sub_offer_duration_2 }} for {{ sub_offer_price_2 }}, and {{ price }} thereafter";
                    case 48:
                        return "Try {{ sub_offer_duration }} for free, then {{ sub_offer_price_2 }} during {{ sub_offer_duration_2 }}, and {{ price }} thereafter";
                    default:
                        throw new C6535s();
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return CustomerCenterConfigData$Localization$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;", "", "identifier", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "PRICE", "SUB_OFFER_DURATION", "SUB_OFFER_DURATION_2", "SUB_OFFER_PRICE", "SUB_OFFER_PRICE_2", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum VariableName {
            PRICE(b.f37501x),
            SUB_OFFER_DURATION("sub_offer_duration"),
            SUB_OFFER_DURATION_2("sub_offer_duration_2"),
            SUB_OFFER_PRICE("sub_offer_price"),
            SUB_OFFER_PRICE_2("sub_offer_price_2");
            
            public static final Companion Companion = null;
            /* access modifiers changed from: private */
            public static final Lazy valueMap$delegate = null;
            private final String identifier;

            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName$Companion;", "", "()V", "valueMap", "", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;", "getValueMap", "()Ljava/util/Map;", "valueMap$delegate", "Lkotlin/Lazy;", "valueOfIdentifier", "identifier", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private final Map<String, VariableName> getValueMap() {
                    return (Map) VariableName.valueMap$delegate.getValue();
                }

                public final VariableName valueOfIdentifier(String str) {
                    C6496s.h(str, "identifier");
                    return getValueMap().get(str);
                }

                private Companion() {
                }
            }

            static {
                Companion = new Companion((DefaultConstructorMarker) null);
                valueMap$delegate = C6531o.b(CustomerCenterConfigData$Localization$VariableName$Companion$valueMap$2.INSTANCE);
            }

            private VariableName(String str) {
                this.identifier = str;
            }

            public final String getIdentifier() {
                return this.identifier;
            }
        }

        static {
            x0 x0Var = x0.f71726a;
            $childSerializers = new C5978b[]{null, new M(x0Var, x0Var)};
        }

        @C6521e
        public /* synthetic */ Localization(int i10, String str, Map map, t0 t0Var) {
            if (3 != (i10 & 3)) {
                C6456i0.a(i10, 3, CustomerCenterConfigData$Localization$$serializer.INSTANCE.getDescriptor());
            }
            this.locale = str;
            this.localizedStrings = map;
        }

        public static /* synthetic */ Localization copy$default(Localization localization, String str, Map<String, String> map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = localization.locale;
            }
            if ((i10 & 2) != 0) {
                map = localization.localizedStrings;
            }
            return localization.copy(str, map);
        }

        public static /* synthetic */ void getLocalizedStrings$annotations() {
        }

        public static final /* synthetic */ void write$Self(Localization localization, d dVar, f fVar) {
            C5978b[] bVarArr = $childSerializers;
            dVar.t(fVar, 0, localization.locale);
            dVar.B(fVar, 1, bVarArr[1], localization.localizedStrings);
        }

        public final String commonLocalizedString(CommonLocalizedString commonLocalizedString) {
            C6496s.h(commonLocalizedString, SubscriberAttributeKt.JSON_NAME_KEY);
            Map<String, String> map = this.localizedStrings;
            String lowerCase = commonLocalizedString.name().toLowerCase(Locale.ROOT);
            C6496s.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            String str = map.get(lowerCase);
            if (str == null) {
                return commonLocalizedString.getDefaultValue();
            }
            return str;
        }

        public final String component1() {
            return this.locale;
        }

        public final Map<String, String> component2() {
            return this.localizedStrings;
        }

        public final Localization copy(String str, Map<String, String> map) {
            C6496s.h(str, "locale");
            C6496s.h(map, "localizedStrings");
            return new Localization(str, map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Localization)) {
                return false;
            }
            Localization localization = (Localization) obj;
            return C6496s.c(this.locale, localization.locale) && C6496s.c(this.localizedStrings, localization.localizedStrings);
        }

        public final String getLocale() {
            return this.locale;
        }

        public final Map<String, String> getLocalizedStrings() {
            return this.localizedStrings;
        }

        public int hashCode() {
            return (this.locale.hashCode() * 31) + this.localizedStrings.hashCode();
        }

        public String toString() {
            return "Localization(locale=" + this.locale + ", localizedStrings=" + this.localizedStrings + ')';
        }

        public Localization(String str, Map<String, String> map) {
            C6496s.h(str, "locale");
            C6496s.h(map, "localizedStrings");
            this.locale = str;
            this.localizedStrings = map;
        }
    }

    @C5985i
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b'\u0010$\u001a\u0004\b&\u0010\u0018¨\u0006*"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;", "", "", "email", "", "shouldWarnCustomerToUpdate", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;Ljh/d;Lih/f;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEmail", "getEmail$annotations", "()V", "Ljava/lang/Boolean;", "getShouldWarnCustomerToUpdate", "getShouldWarnCustomerToUpdate$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Support {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final String email;
        private final Boolean shouldWarnCustomerToUpdate;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return CustomerCenterConfigData$Support$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Support() {
            this((String) null, (Boolean) null, 3, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Support copy$default(Support support, String str, Boolean bool, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = support.email;
            }
            if ((i10 & 2) != 0) {
                bool = support.shouldWarnCustomerToUpdate;
            }
            return support.copy(str, bool);
        }

        @C5985i(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getEmail$annotations() {
        }

        public static /* synthetic */ void getShouldWarnCustomerToUpdate$annotations() {
        }

        public static final /* synthetic */ void write$Self(Support support, d dVar, f fVar) {
            if (dVar.q(fVar, 0) || support.email != null) {
                dVar.p(fVar, 0, EmptyStringToNullSerializer.INSTANCE, support.email);
            }
            if (dVar.q(fVar, 1) || support.shouldWarnCustomerToUpdate != null) {
                dVar.p(fVar, 1, C6455i.f71663a, support.shouldWarnCustomerToUpdate);
            }
        }

        public final String component1() {
            return this.email;
        }

        public final Boolean component2() {
            return this.shouldWarnCustomerToUpdate;
        }

        public final Support copy(String str, Boolean bool) {
            return new Support(str, bool);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Support)) {
                return false;
            }
            Support support = (Support) obj;
            return C6496s.c(this.email, support.email) && C6496s.c(this.shouldWarnCustomerToUpdate, support.shouldWarnCustomerToUpdate);
        }

        public final String getEmail() {
            return this.email;
        }

        public final Boolean getShouldWarnCustomerToUpdate() {
            return this.shouldWarnCustomerToUpdate;
        }

        public int hashCode() {
            String str = this.email;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.shouldWarnCustomerToUpdate;
            if (bool != null) {
                i10 = bool.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            return "Support(email=" + this.email + ", shouldWarnCustomerToUpdate=" + this.shouldWarnCustomerToUpdate + ')';
        }

        @C6521e
        public /* synthetic */ Support(int i10, @C5985i(with = EmptyStringToNullSerializer.class) String str, Boolean bool, t0 t0Var) {
            if ((i10 & 1) == 0) {
                this.email = null;
            } else {
                this.email = str;
            }
            if ((i10 & 2) == 0) {
                this.shouldWarnCustomerToUpdate = null;
            } else {
                this.shouldWarnCustomerToUpdate = bool;
            }
        }

        public Support(String str, Boolean bool) {
            this.email = str;
            this.shouldWarnCustomerToUpdate = bool;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Support(String str, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : bool);
        }
    }

    @C6521e
    public /* synthetic */ CustomerCenterConfigData(int i10, @C5985i(with = ScreenMapSerializer.class) Map map, Appearance appearance2, Localization localization2, Support support2, @C5985i(with = EmptyStringToNullSerializer.class) String str, t0 t0Var) {
        if (15 != (i10 & 15)) {
            C6456i0.a(i10, 15, CustomerCenterConfigData$$serializer.INSTANCE.getDescriptor());
        }
        this.screens = map;
        this.appearance = appearance2;
        this.localization = localization2;
        this.support = support2;
        if ((i10 & 16) == 0) {
            this.lastPublishedAppVersion = null;
        } else {
            this.lastPublishedAppVersion = str;
        }
    }

    public static /* synthetic */ CustomerCenterConfigData copy$default(CustomerCenterConfigData customerCenterConfigData, Map<Screen.ScreenType, Screen> map, Appearance appearance2, Localization localization2, Support support2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = customerCenterConfigData.screens;
        }
        if ((i10 & 2) != 0) {
            appearance2 = customerCenterConfigData.appearance;
        }
        Appearance appearance3 = appearance2;
        if ((i10 & 4) != 0) {
            localization2 = customerCenterConfigData.localization;
        }
        Localization localization3 = localization2;
        if ((i10 & 8) != 0) {
            support2 = customerCenterConfigData.support;
        }
        Support support3 = support2;
        if ((i10 & 16) != 0) {
            str = customerCenterConfigData.lastPublishedAppVersion;
        }
        return customerCenterConfigData.copy(map, appearance3, localization3, support3, str);
    }

    @C5985i(with = EmptyStringToNullSerializer.class)
    public static /* synthetic */ void getLastPublishedAppVersion$annotations() {
    }

    @C5985i(with = ScreenMapSerializer.class)
    public static /* synthetic */ void getScreens$annotations() {
    }

    public static final /* synthetic */ void write$Self(CustomerCenterConfigData customerCenterConfigData, d dVar, f fVar) {
        dVar.B(fVar, 0, ScreenMapSerializer.INSTANCE, customerCenterConfigData.screens);
        dVar.B(fVar, 1, CustomerCenterConfigData$Appearance$$serializer.INSTANCE, customerCenterConfigData.appearance);
        dVar.B(fVar, 2, CustomerCenterConfigData$Localization$$serializer.INSTANCE, customerCenterConfigData.localization);
        dVar.B(fVar, 3, CustomerCenterConfigData$Support$$serializer.INSTANCE, customerCenterConfigData.support);
        if (dVar.q(fVar, 4) || customerCenterConfigData.lastPublishedAppVersion != null) {
            dVar.p(fVar, 4, EmptyStringToNullSerializer.INSTANCE, customerCenterConfigData.lastPublishedAppVersion);
        }
    }

    public final Map<Screen.ScreenType, Screen> component1() {
        return this.screens;
    }

    public final Appearance component2() {
        return this.appearance;
    }

    public final Localization component3() {
        return this.localization;
    }

    public final Support component4() {
        return this.support;
    }

    public final String component5() {
        return this.lastPublishedAppVersion;
    }

    public final CustomerCenterConfigData copy(Map<Screen.ScreenType, Screen> map, Appearance appearance2, Localization localization2, Support support2, String str) {
        C6496s.h(map, "screens");
        C6496s.h(appearance2, "appearance");
        C6496s.h(localization2, "localization");
        C6496s.h(support2, "support");
        return new CustomerCenterConfigData(map, appearance2, localization2, support2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerCenterConfigData)) {
            return false;
        }
        CustomerCenterConfigData customerCenterConfigData = (CustomerCenterConfigData) obj;
        return C6496s.c(this.screens, customerCenterConfigData.screens) && C6496s.c(this.appearance, customerCenterConfigData.appearance) && C6496s.c(this.localization, customerCenterConfigData.localization) && C6496s.c(this.support, customerCenterConfigData.support) && C6496s.c(this.lastPublishedAppVersion, customerCenterConfigData.lastPublishedAppVersion);
    }

    public final Appearance getAppearance() {
        return this.appearance;
    }

    public final String getLastPublishedAppVersion() {
        return this.lastPublishedAppVersion;
    }

    public final Localization getLocalization() {
        return this.localization;
    }

    public final Screen getManagementScreen() {
        return this.screens.get(Screen.ScreenType.MANAGEMENT);
    }

    public final Screen getNoActiveScreen() {
        return this.screens.get(Screen.ScreenType.NO_ACTIVE);
    }

    public final Map<Screen.ScreenType, Screen> getScreens() {
        return this.screens;
    }

    public final Support getSupport() {
        return this.support;
    }

    public int hashCode() {
        int hashCode = ((((((this.screens.hashCode() * 31) + this.appearance.hashCode()) * 31) + this.localization.hashCode()) * 31) + this.support.hashCode()) * 31;
        String str = this.lastPublishedAppVersion;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CustomerCenterConfigData(screens=" + this.screens + ", appearance=" + this.appearance + ", localization=" + this.localization + ", support=" + this.support + ", lastPublishedAppVersion=" + this.lastPublishedAppVersion + ')';
    }

    public CustomerCenterConfigData(Map<Screen.ScreenType, Screen> map, Appearance appearance2, Localization localization2, Support support2, String str) {
        C6496s.h(map, "screens");
        C6496s.h(appearance2, "appearance");
        C6496s.h(localization2, "localization");
        C6496s.h(support2, "support");
        this.screens = map;
        this.appearance = appearance2;
        this.localization = localization2;
        this.support = support2;
        this.lastPublishedAppVersion = str;
    }

    @C5985i
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u0000 72\u00020\u0001:\u0003879B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBM\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ@\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001cR&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010\u001fR!\u00106\u001a\b\u0012\u0004\u0012\u00020\b0\u00078FX\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u001f¨\u0006:"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen$ScreenType;", "type", "", "title", "subtitle", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "paths", "<init>", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen$ScreenType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen$ScreenType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;Ljh/d;Lih/f;)V", "component1", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen$ScreenType;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/List;", "copy", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen$ScreenType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen$ScreenType;", "getType", "Ljava/lang/String;", "getTitle", "getSubtitle", "getSubtitle$annotations", "()V", "Ljava/util/List;", "getPaths", "getPaths$annotations", "supportedPaths$delegate", "Lkotlin/Lazy;", "getSupportedPaths", "supportedPaths", "Companion", "$serializer", "ScreenType", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Screen {
        /* access modifiers changed from: private */
        public static final C5978b[] $childSerializers = {ScreenType.Companion.serializer(), null, null, null};
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final List<HelpPath> paths;
        private final String subtitle;
        private final Lazy supportedPaths$delegate;
        private final String title;
        private final ScreenType type;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return CustomerCenterConfigData$Screen$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @C5985i
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen$ScreenType;", "", "(Ljava/lang/String;I)V", "MANAGEMENT", "NO_ACTIVE", "UNKNOWN", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum ScreenType {
            MANAGEMENT,
            NO_ACTIVE,
            UNKNOWN;
            
            /* access modifiers changed from: private */
            public static final Lazy $cachedSerializer$delegate = null;
            public static final Companion Companion = null;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen$ScreenType$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen$ScreenType;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private final /* synthetic */ C5978b get$cachedSerializer() {
                    return (C5978b) ScreenType.$cachedSerializer$delegate.getValue();
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

        @C6521e
        public /* synthetic */ Screen(int i10, ScreenType screenType, String str, @C5985i(with = EmptyStringToNullSerializer.class) String str2, @C5985i(with = HelpPathsSerializer.class) List list, t0 t0Var) {
            if (11 != (i10 & 11)) {
                C6456i0.a(i10, 11, CustomerCenterConfigData$Screen$$serializer.INSTANCE.getDescriptor());
            }
            this.type = screenType;
            this.title = str;
            if ((i10 & 4) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str2;
            }
            this.paths = list;
            this.supportedPaths$delegate = C6531o.b(new C6787a(this) {
                final /* synthetic */ Screen this$0;

                {
                    this.this$0 = r1;
                }

                public final List<HelpPath> invoke() {
                    Set j10 = Y.j(HelpPath.PathType.MISSING_PURCHASE, HelpPath.PathType.CANCEL, HelpPath.PathType.CUSTOM_URL);
                    ArrayList arrayList = new ArrayList();
                    for (Object next : this.this$0.getPaths()) {
                        if (j10.contains(((HelpPath) next).getType())) {
                            arrayList.add(next);
                        }
                    }
                    return arrayList;
                }
            });
        }

        public static /* synthetic */ Screen copy$default(Screen screen, ScreenType screenType, String str, String str2, List<HelpPath> list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                screenType = screen.type;
            }
            if ((i10 & 2) != 0) {
                str = screen.title;
            }
            if ((i10 & 4) != 0) {
                str2 = screen.subtitle;
            }
            if ((i10 & 8) != 0) {
                list = screen.paths;
            }
            return screen.copy(screenType, str, str2, list);
        }

        @C5985i(with = HelpPathsSerializer.class)
        public static /* synthetic */ void getPaths$annotations() {
        }

        @C5985i(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getSubtitle$annotations() {
        }

        public static final /* synthetic */ void write$Self(Screen screen, d dVar, f fVar) {
            dVar.B(fVar, 0, $childSerializers[0], screen.type);
            dVar.t(fVar, 1, screen.title);
            if (dVar.q(fVar, 2) || screen.subtitle != null) {
                dVar.p(fVar, 2, EmptyStringToNullSerializer.INSTANCE, screen.subtitle);
            }
            dVar.B(fVar, 3, HelpPathsSerializer.INSTANCE, screen.paths);
        }

        public final ScreenType component1() {
            return this.type;
        }

        public final String component2() {
            return this.title;
        }

        public final String component3() {
            return this.subtitle;
        }

        public final List<HelpPath> component4() {
            return this.paths;
        }

        public final Screen copy(ScreenType screenType, String str, String str2, List<HelpPath> list) {
            C6496s.h(screenType, "type");
            C6496s.h(str, b.f37461S);
            C6496s.h(list, "paths");
            return new Screen(screenType, str, str2, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return this.type == screen.type && C6496s.c(this.title, screen.title) && C6496s.c(this.subtitle, screen.subtitle) && C6496s.c(this.paths, screen.paths);
        }

        public final List<HelpPath> getPaths() {
            return this.paths;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final List<HelpPath> getSupportedPaths() {
            return (List) this.supportedPaths$delegate.getValue();
        }

        public final String getTitle() {
            return this.title;
        }

        public final ScreenType getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = ((this.type.hashCode() * 31) + this.title.hashCode()) * 31;
            String str = this.subtitle;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.paths.hashCode();
        }

        public String toString() {
            return "Screen(type=" + this.type + ", title=" + this.title + ", subtitle=" + this.subtitle + ", paths=" + this.paths + ')';
        }

        public Screen(ScreenType screenType, String str, String str2, List<HelpPath> list) {
            C6496s.h(screenType, "type");
            C6496s.h(str, b.f37461S);
            C6496s.h(list, "paths");
            this.type = screenType;
            this.title = str;
            this.subtitle = str2;
            this.paths = list;
            this.supportedPaths$delegate = C6531o.b(new CustomerCenterConfigData$Screen$supportedPaths$2(this));
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Screen(ScreenType screenType, String str, String str2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(screenType, str, (i10 & 4) != 0 ? null : str2, list);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomerCenterConfigData(Map map, Appearance appearance2, Localization localization2, Support support2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, appearance2, localization2, support2, (i10 & 16) != 0 ? null : str);
    }
}
