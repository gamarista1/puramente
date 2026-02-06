package com.revenuecat.purchases.common;

import android.content.Context;
import com.revenuecat.purchases.DangerousSettings;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.PurchasesAreCompletedByKt;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.strings.ConfigureStrings;
import java.net.URL;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 =2\u00020\u0001:\u0001=Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007¢\u0006\u0002\u0010\u0014J\u0013\u00108\u001a\u00020\u00072\b\u00109\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010:\u001a\u00020;H\u0016J\b\u0010<\u001a\u00020(H\u0016R\u0011\u0010\u0015\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u0007XD¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\"R\u001c\u0010\u0012\u001a\u00020\u00078FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\"R\u001c\u0010\u0013\u001a\u00020\u00078FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\"R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001aR\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010/\u001a\u0004\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\b0\u0010*R\u0013\u00101\u001a\u0004\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\b2\u0010*R\u000e\u0010\u0011\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u00106\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\b7\u0010*¨\u0006>"}, d2 = {"Lcom/revenuecat/purchases/common/AppConfig;", "", "context", "Landroid/content/Context;", "purchasesAreCompletedBy", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "showInAppMessagesAutomatically", "", "platformInfo", "Lcom/revenuecat/purchases/common/PlatformInfo;", "proxyURL", "Ljava/net/URL;", "store", "Lcom/revenuecat/purchases/Store;", "isDebugBuild", "dangerousSettings", "Lcom/revenuecat/purchases/DangerousSettings;", "runningTests", "forceServerErrors", "forceSigningErrors", "(Landroid/content/Context;Lcom/revenuecat/purchases/PurchasesAreCompletedBy;ZLcom/revenuecat/purchases/common/PlatformInfo;Ljava/net/URL;Lcom/revenuecat/purchases/Store;ZLcom/revenuecat/purchases/DangerousSettings;ZZZ)V", "baseURL", "getBaseURL", "()Ljava/net/URL;", "customEntitlementComputation", "getCustomEntitlementComputation", "()Z", "getDangerousSettings", "()Lcom/revenuecat/purchases/DangerousSettings;", "enableOfflineEntitlements", "getEnableOfflineEntitlements", "finishTransactions", "getFinishTransactions", "setFinishTransactions", "(Z)V", "getForceServerErrors", "setForceServerErrors", "getForceSigningErrors", "setForceSigningErrors", "languageTag", "", "getLanguageTag", "()Ljava/lang/String;", "packageName", "getPackageName", "getPlatformInfo", "()Lcom/revenuecat/purchases/common/PlatformInfo;", "playServicesVersionName", "getPlayServicesVersionName", "playStoreVersionName", "getPlayStoreVersionName", "getShowInAppMessagesAutomatically", "getStore", "()Lcom/revenuecat/purchases/Store;", "versionName", "getVersionName", "equals", "other", "hashCode", "", "toString", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AppConfig {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final URL diagnosticsURL = new URL("https://api-diagnostics.revenuecat.com/");
    /* access modifiers changed from: private */
    public static final URL paywallEventsURL = new URL("https://api-paywalls.revenuecat.com/");
    private final URL baseURL;
    private final DangerousSettings dangerousSettings;
    private final boolean enableOfflineEntitlements;
    private boolean finishTransactions;
    private boolean forceServerErrors;
    private boolean forceSigningErrors;
    private final boolean isDebugBuild;
    private final String languageTag;
    private final String packageName;
    private final PlatformInfo platformInfo;
    private final String playServicesVersionName;
    private final String playStoreVersionName;
    private final boolean runningTests;
    private final boolean showInAppMessagesAutomatically;
    private final Store store;
    private final String versionName;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/common/AppConfig$Companion;", "", "()V", "diagnosticsURL", "Ljava/net/URL;", "getDiagnosticsURL", "()Ljava/net/URL;", "paywallEventsURL", "getPaywallEventsURL", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final URL getDiagnosticsURL() {
            return AppConfig.diagnosticsURL;
        }

        public final URL getPaywallEventsURL() {
            return AppConfig.paywallEventsURL;
        }

        private Companion() {
        }
    }

    public AppConfig(Context context, PurchasesAreCompletedBy purchasesAreCompletedBy, boolean z10, PlatformInfo platformInfo2, URL url, Store store2, boolean z11, DangerousSettings dangerousSettings2, boolean z12, boolean z13, boolean z14) {
        C6496s.h(context, "context");
        C6496s.h(purchasesAreCompletedBy, "purchasesAreCompletedBy");
        C6496s.h(platformInfo2, "platformInfo");
        C6496s.h(store2, ProductResponseJsonKeys.STORE);
        C6496s.h(dangerousSettings2, "dangerousSettings");
        this.showInAppMessagesAutomatically = z10;
        this.platformInfo = platformInfo2;
        this.store = store2;
        this.isDebugBuild = z11;
        this.dangerousSettings = dangerousSettings2;
        this.runningTests = z12;
        this.forceServerErrors = z13;
        this.forceSigningErrors = z14;
        this.enableOfflineEntitlements = true;
        Locale locale = UtilsKt.getLocale(context);
        String languageTag2 = locale != null ? locale.toLanguageTag() : null;
        String str = "";
        this.languageTag = languageTag2 == null ? str : languageTag2;
        String versionName2 = UtilsKt.getVersionName(context);
        this.versionName = versionName2 != null ? versionName2 : str;
        String packageName2 = context.getPackageName();
        C6496s.g(packageName2, "context.packageName");
        this.packageName = packageName2;
        this.finishTransactions = PurchasesAreCompletedByKt.getFinishTransactions(purchasesAreCompletedBy);
        if (url != null) {
            LogWrapperKt.log(LogIntent.INFO, ConfigureStrings.CONFIGURING_PURCHASES_PROXY_URL_SET);
        } else {
            url = new URL("https://api.revenuecat.com/");
        }
        this.baseURL = url;
        this.playStoreVersionName = UtilsKt.getPlayStoreVersionName(context);
        this.playServicesVersionName = UtilsKt.getPlayServicesVersionName(context);
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C6496s.c(AppConfig.class, cls)) {
            return false;
        }
        C6496s.f(obj, "null cannot be cast to non-null type com.revenuecat.purchases.common.AppConfig");
        AppConfig appConfig = (AppConfig) obj;
        if (C6496s.c(this.platformInfo, appConfig.platformInfo) && this.store == appConfig.store && this.isDebugBuild == appConfig.isDebugBuild && C6496s.c(this.dangerousSettings, appConfig.dangerousSettings) && C6496s.c(this.languageTag, appConfig.languageTag) && C6496s.c(this.versionName, appConfig.versionName) && C6496s.c(this.packageName, appConfig.packageName) && this.finishTransactions == appConfig.finishTransactions && getForceServerErrors() == appConfig.getForceServerErrors() && getForceSigningErrors() == appConfig.getForceSigningErrors() && C6496s.c(this.baseURL, appConfig.baseURL) && this.showInAppMessagesAutomatically == appConfig.showInAppMessagesAutomatically) {
            return true;
        }
        return false;
    }

    public final URL getBaseURL() {
        return this.baseURL;
    }

    public final boolean getCustomEntitlementComputation() {
        return this.dangerousSettings.getCustomEntitlementComputation$purchases_defaultsRelease();
    }

    public final DangerousSettings getDangerousSettings() {
        return this.dangerousSettings;
    }

    public final boolean getEnableOfflineEntitlements() {
        return this.enableOfflineEntitlements;
    }

    public final boolean getFinishTransactions() {
        return this.finishTransactions;
    }

    public final boolean getForceServerErrors() {
        if (!this.runningTests || !this.forceServerErrors) {
            return false;
        }
        return true;
    }

    public final boolean getForceSigningErrors() {
        if (!this.runningTests || !this.forceSigningErrors) {
            return false;
        }
        return true;
    }

    public final String getLanguageTag() {
        return this.languageTag;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final PlatformInfo getPlatformInfo() {
        return this.platformInfo;
    }

    public final String getPlayServicesVersionName() {
        return this.playServicesVersionName;
    }

    public final String getPlayStoreVersionName() {
        return this.playStoreVersionName;
    }

    public final boolean getShowInAppMessagesAutomatically() {
        return this.showInAppMessagesAutomatically;
    }

    public final Store getStore() {
        return this.store;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.platformInfo.hashCode() * 31) + this.store.hashCode()) * 31) + Boolean.hashCode(this.isDebugBuild)) * 31) + this.dangerousSettings.hashCode()) * 31) + this.languageTag.hashCode()) * 31) + this.versionName.hashCode()) * 31) + this.packageName.hashCode()) * 31) + Boolean.hashCode(this.finishTransactions)) * 31) + Boolean.hashCode(getForceServerErrors())) * 31) + Boolean.hashCode(getForceSigningErrors())) * 31) + this.baseURL.hashCode()) * 31) + Boolean.hashCode(this.showInAppMessagesAutomatically);
    }

    public final boolean isDebugBuild() {
        return this.isDebugBuild;
    }

    public final void setFinishTransactions(boolean z10) {
        this.finishTransactions = z10;
    }

    public final void setForceServerErrors(boolean z10) {
        this.forceServerErrors = z10;
    }

    public final void setForceSigningErrors(boolean z10) {
        this.forceSigningErrors = z10;
    }

    public String toString() {
        return "AppConfig(platformInfo=" + this.platformInfo + ", store=" + this.store + ", isDebugBuild=" + this.isDebugBuild + ", dangerousSettings=" + this.dangerousSettings + ", languageTag='" + this.languageTag + "', versionName='" + this.versionName + "', packageName='" + this.packageName + "', finishTransactions=" + this.finishTransactions + ", showInAppMessagesAutomatically=" + this.showInAppMessagesAutomatically + ", baseURL=" + this.baseURL + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AppConfig(android.content.Context r16, com.revenuecat.purchases.PurchasesAreCompletedBy r17, boolean r18, com.revenuecat.purchases.common.PlatformInfo r19, java.net.URL r20, com.revenuecat.purchases.Store r21, boolean r22, com.revenuecat.purchases.DangerousSettings r23, boolean r24, boolean r25, boolean r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r15 = this;
            r0 = r27
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x000e
            com.revenuecat.purchases.DangerousSettings r1 = new com.revenuecat.purchases.DangerousSettings
            r2 = 1
            r1.<init>(r2)
            r11 = r1
            goto L_0x0010
        L_0x000e:
            r11 = r23
        L_0x0010:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0017
            r12 = r2
            goto L_0x0019
        L_0x0017:
            r12 = r24
        L_0x0019:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x001f
            r13 = r2
            goto L_0x0021
        L_0x001f:
            r13 = r25
        L_0x0021:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0027
            r14 = r2
            goto L_0x0029
        L_0x0027:
            r14 = r26
        L_0x0029:
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.AppConfig.<init>(android.content.Context, com.revenuecat.purchases.PurchasesAreCompletedBy, boolean, com.revenuecat.purchases.common.PlatformInfo, java.net.URL, com.revenuecat.purchases.Store, boolean, com.revenuecat.purchases.DangerousSettings, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
