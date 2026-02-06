package com.revenuecat.purchases;

import Sg.p;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Process;
import android.preference.PreferenceManager;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.common.LocaleProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.OfferingParser;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.caching.InMemoryCachedObject;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsFileHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.events.EventsManager;
import com.revenuecat.purchases.common.networking.ETagManager;
import com.revenuecat.purchases.common.networking.MapConverter;
import com.revenuecat.purchases.common.offerings.OfferingsCache;
import com.revenuecat.purchases.common.offerings.OfferingsFactory;
import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.common.offlineentitlements.OfflineCustomerInfoCalculator;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.offlineentitlements.PurchasedProductsFetcher;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.common.verification.SignatureVerifier;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.deeplinks.WebPurchaseRedemptionHelper;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.paywalls.PaywallPresentedCache;
import com.revenuecat.purchases.strings.ConfigureStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import com.revenuecat.purchases.utils.AndroidVersionUtilsKt;
import com.revenuecat.purchases.utils.CoilImageDownloader;
import com.revenuecat.purchases.utils.IsDebugBuildProvider;
import com.revenuecat.purchases.utils.OfferingImagePreDownloader;
import java.net.URL;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u00012B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u0018*\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJQ\u0010+\u001a\u00020*2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010'\u001a\u00020\u00182\b\b\u0002\u0010(\u001a\u00020\u00182\b\b\u0002\u0010)\u001a\u00020\u0018¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020-2\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101¨\u00063"}, d2 = {"Lcom/revenuecat/purchases/PurchasesFactory;", "", "Lcom/revenuecat/purchases/utils/IsDebugBuildProvider;", "isDebugBuild", "Lcom/revenuecat/purchases/APIKeyValidator;", "apiKeyValidator", "<init>", "(Lcom/revenuecat/purchases/utils/IsDebugBuildProvider;Lcom/revenuecat/purchases/APIKeyValidator;)V", "Landroid/content/Context;", "context", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/common/Dispatcher;", "eventsDispatcher", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/events/EventsManager;", "createEventsManager", "(Landroid/content/Context;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/Backend;)Lcom/revenuecat/purchases/common/events/EventsManager;", "Landroid/app/Application;", "getApplication", "(Landroid/content/Context;)Landroid/app/Application;", "", "permission", "", "hasPermission", "(Landroid/content/Context;Ljava/lang/String;)Z", "Ljava/util/concurrent/ExecutorService;", "createDefaultExecutor", "()Ljava/util/concurrent/ExecutorService;", "createEventsExecutor", "Lcom/revenuecat/purchases/PurchasesConfiguration;", "configuration", "Lcom/revenuecat/purchases/common/PlatformInfo;", "platformInfo", "Ljava/net/URL;", "proxyURL", "Lcom/revenuecat/purchases/common/BillingAbstract;", "overrideBillingAbstract", "forceServerErrors", "forceSigningError", "runningIntegrationTests", "Lcom/revenuecat/purchases/Purchases;", "createPurchases", "(Lcom/revenuecat/purchases/PurchasesConfiguration;Lcom/revenuecat/purchases/common/PlatformInfo;Ljava/net/URL;Lcom/revenuecat/purchases/common/BillingAbstract;ZZZ)Lcom/revenuecat/purchases/Purchases;", "Llf/M;", "validateConfiguration", "(Lcom/revenuecat/purchases/PurchasesConfiguration;)V", "Lcom/revenuecat/purchases/utils/IsDebugBuildProvider;", "Lcom/revenuecat/purchases/APIKeyValidator;", "LowPriorityThreadFactory", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PurchasesFactory {
    private final APIKeyValidator apiKeyValidator;
    private final IsDebugBuildProvider isDebugBuild;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/PurchasesFactory$LowPriorityThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "threadName", "", "(Ljava/lang/String;)V", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class LowPriorityThreadFactory implements ThreadFactory {
        private final String threadName;

        public LowPriorityThreadFactory(String str) {
            C6496s.h(str, "threadName");
            this.threadName = str;
        }

        /* access modifiers changed from: private */
        public static final void newThread$lambda$1(Runnable runnable) {
            if (runnable != null) {
                Process.setThreadPriority(19);
                runnable.run();
            }
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(new d(runnable), this.threadName);
        }
    }

    public PurchasesFactory(IsDebugBuildProvider isDebugBuildProvider, APIKeyValidator aPIKeyValidator) {
        C6496s.h(isDebugBuildProvider, "isDebugBuild");
        C6496s.h(aPIKeyValidator, "apiKeyValidator");
        this.isDebugBuild = isDebugBuildProvider;
        this.apiKeyValidator = aPIKeyValidator;
    }

    private final ExecutorService createDefaultExecutor() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        C6496s.g(newSingleThreadScheduledExecutor, "newSingleThreadScheduledExecutor()");
        return newSingleThreadScheduledExecutor;
    }

    private final ExecutorService createEventsExecutor() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new LowPriorityThreadFactory("revenuecat-events-thread"));
        C6496s.g(newSingleThreadScheduledExecutor, "newSingleThreadScheduled…venuecat-events-thread\"))");
        return newSingleThreadScheduledExecutor;
    }

    private final EventsManager createEventsManager(Context context, IdentityManager identityManager, Dispatcher dispatcher, Backend backend) {
        if (AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            EventsManager.Companion companion = EventsManager.Companion;
            return new EventsManager((UUID) null, companion.paywalls(new FileHelper(context)), companion.backendEvents(new FileHelper(context)), identityManager, dispatcher, new PurchasesFactory$createEventsManager$1(backend), 1, (DefaultConstructorMarker) null);
        }
        LogUtilsKt.debugLog("Paywall events are only supported on Android N or newer.");
        return null;
    }

    public static /* synthetic */ Purchases createPurchases$default(PurchasesFactory purchasesFactory, PurchasesConfiguration purchasesConfiguration, PlatformInfo platformInfo, URL url, BillingAbstract billingAbstract, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        BillingAbstract billingAbstract2;
        boolean z13;
        boolean z14;
        boolean z15;
        if ((i10 & 8) != 0) {
            billingAbstract2 = null;
        } else {
            billingAbstract2 = billingAbstract;
        }
        if ((i10 & 16) != 0) {
            z13 = false;
        } else {
            z13 = z10;
        }
        if ((i10 & 32) != 0) {
            z14 = false;
        } else {
            z14 = z11;
        }
        if ((i10 & 64) != 0) {
            z15 = false;
        } else {
            z15 = z12;
        }
        return purchasesFactory.createPurchases(purchasesConfiguration, platformInfo, url, billingAbstract2, z13, z14, z15);
    }

    private final Application getApplication(Context context) {
        Context applicationContext = context.getApplicationContext();
        C6496s.f(applicationContext, "null cannot be cast to non-null type android.app.Application");
        return (Application) applicationContext;
    }

    private final boolean hasPermission(Context context, String str) {
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    public final Purchases createPurchases(PurchasesConfiguration purchasesConfiguration, PlatformInfo platformInfo, URL url, BillingAbstract billingAbstract, boolean z10, boolean z11, boolean z12) {
        DiagnosticsTracker diagnosticsTracker;
        DiagnosticsFileHelper diagnosticsFileHelper;
        DiagnosticsHelper diagnosticsHelper;
        SignatureVerificationMode signatureVerificationMode;
        PurchasesStateCache purchasesStateCache;
        BillingAbstract billingAbstract2;
        DiagnosticsSynchronizer diagnosticsSynchronizer;
        C6496s.h(purchasesConfiguration, "configuration");
        PlatformInfo platformInfo2 = platformInfo;
        C6496s.h(platformInfo2, "platformInfo");
        validateConfiguration(purchasesConfiguration);
        Application application = getApplication(purchasesConfiguration.getContext());
        AppConfig appConfig = r2;
        AppConfig appConfig2 = new AppConfig(purchasesConfiguration.getContext(), purchasesConfiguration.getPurchasesAreCompletedBy(), purchasesConfiguration.getShowInAppMessagesAutomatically(), platformInfo2, url, purchasesConfiguration.getStore(), this.isDebugBuild.invoke(), purchasesConfiguration.getDangerousSettings(), z12, z10, z11);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(application);
        ETagManager eTagManager = new ETagManager(purchasesConfiguration.getContext(), (Lazy) null, (DateProvider) null, 6, (DefaultConstructorMarker) null);
        Dispatcher dispatcher = new Dispatcher(createDefaultExecutor(), (Handler) null, z12, 2, (DefaultConstructorMarker) null);
        ExecutorService service = purchasesConfiguration.getService();
        if (service == null) {
            service = createDefaultExecutor();
        }
        Dispatcher dispatcher2 = new Dispatcher(service, (Handler) null, z12, 2, (DefaultConstructorMarker) null);
        Dispatcher dispatcher3 = new Dispatcher(createEventsExecutor(), (Handler) null, z12, 2, (DefaultConstructorMarker) null);
        if (!purchasesConfiguration.getDiagnosticsEnabled() || !AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            if (purchasesConfiguration.getDiagnosticsEnabled()) {
                LogUtilsKt.warnLog("Diagnostics are only supported on Android N or newer.");
            }
            diagnosticsHelper = null;
            diagnosticsFileHelper = null;
            diagnosticsTracker = null;
        } else {
            DiagnosticsFileHelper diagnosticsFileHelper2 = new DiagnosticsFileHelper(new FileHelper(purchasesConfiguration.getContext()));
            DiagnosticsHelper diagnosticsHelper2 = r3;
            DiagnosticsHelper diagnosticsHelper3 = new DiagnosticsHelper(purchasesConfiguration.getContext(), diagnosticsFileHelper2, (Lazy) null, 4, (DefaultConstructorMarker) null);
            diagnosticsFileHelper = diagnosticsFileHelper2;
            diagnosticsTracker = new DiagnosticsTracker(appConfig, diagnosticsFileHelper2, diagnosticsHelper2, dispatcher3);
            diagnosticsHelper = diagnosticsHelper2;
        }
        try {
            signatureVerificationMode = SignatureVerificationMode.Companion.fromEntitlementVerificationMode$default(SignatureVerificationMode.Companion, purchasesConfiguration.getVerificationMode(), (SignatureVerifier) null, 2, (Object) null);
        } catch (IllegalStateException e10) {
            LogUtilsKt.errorLog$default("Error creating signature verifier: " + e10.getMessage() + ". Disabling signature verification.", (Throwable) null, 2, (Object) null);
            signatureVerificationMode = SignatureVerificationMode.Disabled.INSTANCE;
        }
        SigningManager signingManager = new SigningManager(signatureVerificationMode, appConfig, purchasesConfiguration.getApiKey());
        C6496s.g(defaultSharedPreferences, "prefs");
        DeviceCache deviceCache = new DeviceCache(defaultSharedPreferences, purchasesConfiguration.getApiKey(), (DateProvider) null, 4, (DefaultConstructorMarker) null);
        AppConfig appConfig3 = appConfig;
        Dispatcher dispatcher4 = dispatcher3;
        Dispatcher dispatcher5 = dispatcher2;
        HTTPClient hTTPClient = new HTTPClient(appConfig3, eTagManager, diagnosticsTracker, signingManager, deviceCache, (DateProvider) null, (MapConverter) null, (LocaleProvider) null, 224, (DefaultConstructorMarker) null);
        BackendHelper backendHelper = new BackendHelper(purchasesConfiguration.getApiKey(), dispatcher5, appConfig, hTTPClient);
        Backend backend = new Backend(appConfig3, dispatcher5, dispatcher4, hTTPClient, backendHelper);
        Dispatcher dispatcher6 = dispatcher;
        PurchasesState purchasesState = r2;
        PurchasesState purchasesState2 = new PurchasesState((Boolean) null, (Map) null, (ProductChangeCallback) null, false, false, 31, (DefaultConstructorMarker) null);
        PurchasesStateCache purchasesStateCache2 = new PurchasesStateCache(purchasesState);
        if (billingAbstract == null) {
            purchasesStateCache = purchasesStateCache2;
            billingAbstract2 = BillingFactory.INSTANCE.createBilling(purchasesConfiguration.getStore(), application, backendHelper, deviceCache, PurchasesAreCompletedByKt.getFinishTransactions(purchasesConfiguration.getPurchasesAreCompletedBy()), diagnosticsTracker, purchasesStateCache2, purchasesConfiguration.getPendingTransactionsForPrepaidPlansEnabled());
        } else {
            purchasesStateCache = purchasesStateCache2;
            billingAbstract2 = billingAbstract;
        }
        SubscriberAttributesPoster subscriberAttributesPoster = new SubscriberAttributesPoster(backendHelper);
        DeviceIdentifiersFetcher createAttributionFetcher = AttributionFetcherFactory.INSTANCE.createAttributionFetcher(purchasesConfiguration.getStore(), dispatcher5);
        SubscriberAttributesCache subscriberAttributesCache = new SubscriberAttributesCache(deviceCache);
        SubscriberAttributesManager subscriberAttributesManager = new SubscriberAttributesManager(subscriberAttributesCache, subscriberAttributesPoster, createAttributionFetcher);
        OfflineEntitlementsManager offlineEntitlementsManager = new OfflineEntitlementsManager(backend, new OfflineCustomerInfoCalculator(new PurchasedProductsFetcher(deviceCache, billingAbstract2, (DateProvider) null, 4, (DefaultConstructorMarker) null), appConfig, diagnosticsTracker, (DateProvider) null, 8, (DefaultConstructorMarker) null), deviceCache, appConfig, diagnosticsTracker);
        OfferingsCache offeringsCache = new OfferingsCache(deviceCache, (DateProvider) null, (InMemoryCachedObject) null, 6, (DefaultConstructorMarker) null);
        IdentityManager identityManager = new IdentityManager(deviceCache, subscriberAttributesCache, subscriberAttributesManager, offeringsCache, backend, offlineEntitlementsManager, dispatcher6);
        IdentityManager identityManager2 = identityManager;
        CustomerInfoUpdateHandler customerInfoUpdateHandler = new CustomerInfoUpdateHandler(deviceCache, identityManager, offlineEntitlementsManager, appConfig, diagnosticsTracker, (Handler) null, 32, (DefaultConstructorMarker) null);
        PaywallPresentedCache paywallPresentedCache = new PaywallPresentedCache();
        AppConfig appConfig4 = appConfig;
        BillingAbstract billingAbstract3 = billingAbstract2;
        SubscriberAttributesManager subscriberAttributesManager2 = subscriberAttributesManager;
        PostReceiptHelper postReceiptHelper = r2;
        PostReceiptHelper postReceiptHelper2 = new PostReceiptHelper(appConfig4, backend, billingAbstract3, customerInfoUpdateHandler, deviceCache, subscriberAttributesManager, offlineEntitlementsManager, paywallPresentedCache);
        PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper = new PostTransactionWithProductDetailsHelper(billingAbstract2, postReceiptHelper);
        PostPendingTransactionsHelper postPendingTransactionsHelper = new PostPendingTransactionsHelper(appConfig4, deviceCache, billingAbstract3, dispatcher5, identityManager2, postTransactionWithProductDetailsHelper);
        CustomerInfoHelper customerInfoHelper = new CustomerInfoHelper(deviceCache, backend, offlineEntitlementsManager, customerInfoUpdateHandler, postPendingTransactionsHelper, (Handler) null, 32, (DefaultConstructorMarker) null);
        OfferingParser createOfferingParser = OfferingParserFactory.INSTANCE.createOfferingParser(purchasesConfiguration.getStore());
        if (diagnosticsFileHelper == null || diagnosticsHelper == null || diagnosticsTracker == null || !AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            diagnosticsSynchronizer = null;
        } else {
            diagnosticsSynchronizer = new DiagnosticsSynchronizer(diagnosticsHelper, diagnosticsFileHelper, diagnosticsTracker, backend, dispatcher4);
        }
        SyncPurchasesHelper syncPurchasesHelper = r3;
        IdentityManager identityManager3 = identityManager2;
        SyncPurchasesHelper syncPurchasesHelper2 = new SyncPurchasesHelper(billingAbstract2, identityManager3, customerInfoHelper, postReceiptHelper);
        OfferingsManager offeringsManager = r27;
        Dispatcher dispatcher7 = dispatcher6;
        OfferingsManager offeringsManager2 = new OfferingsManager(offeringsCache, backend, new OfferingsFactory(billingAbstract2, createOfferingParser, dispatcher7), new OfferingImagePreDownloader(false, new CoilImageDownloader(application), 1, (DefaultConstructorMarker) null), (Handler) null, 16, (DefaultConstructorMarker) null);
        LogIntent logIntent = LogIntent.DEBUG;
        LogWrapperKt.log(logIntent, ConfigureStrings.DEBUG_ENABLED);
        String format = String.format(ConfigureStrings.SDK_VERSION, Arrays.copyOf(new Object[]{Purchases.Companion.getFrameworkVersion()}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        String format2 = String.format(ConfigureStrings.PACKAGE_NAME, Arrays.copyOf(new Object[]{appConfig.getPackageName()}, 1));
        C6496s.g(format2, "format(this, *args)");
        LogWrapperKt.log(logIntent, format2);
        LogIntent logIntent2 = LogIntent.USER;
        String format3 = String.format(ConfigureStrings.INITIAL_APP_USER_ID, Arrays.copyOf(new Object[]{purchasesConfiguration.getAppUserID()}, 1));
        C6496s.g(format3, "format(this, *args)");
        LogWrapperKt.log(logIntent2, format3);
        String format4 = String.format(ConfigureStrings.VERIFICATION_MODE_SELECTED, Arrays.copyOf(new Object[]{purchasesConfiguration.getVerificationMode().name()}, 1));
        C6496s.g(format4, "format(this, *args)");
        LogWrapperKt.log(logIntent, format4);
        PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper2 = postTransactionWithProductDetailsHelper;
        AppConfig appConfig5 = appConfig;
        PostReceiptHelper postReceiptHelper3 = postReceiptHelper;
        PurchasesOrchestrator purchasesOrchestrator = r2;
        PurchasesOrchestrator purchasesOrchestrator2 = new PurchasesOrchestrator(application, purchasesConfiguration.getAppUserID(), backend, billingAbstract2, deviceCache, identityManager3, subscriberAttributesManager2, appConfig5, customerInfoHelper, customerInfoUpdateHandler, diagnosticsSynchronizer, offlineEntitlementsManager, postReceiptHelper3, postTransactionWithProductDetailsHelper2, postPendingTransactionsHelper, syncPurchasesHelper, offeringsManager, createEventsManager(application, identityManager3, dispatcher4, backend), paywallPresentedCache, purchasesStateCache, (Handler) null, dispatcher7, purchasesConfiguration, (WebPurchaseRedemptionHelper) null, 9437184, (DefaultConstructorMarker) null);
        return new Purchases(purchasesOrchestrator);
    }

    public final void validateConfiguration(PurchasesConfiguration purchasesConfiguration) {
        C6496s.h(purchasesConfiguration, "configuration");
        if (!hasPermission(purchasesConfiguration.getContext(), "android.permission.INTERNET")) {
            throw new IllegalArgumentException("Purchases requires INTERNET permission.");
        } else if (p.d0(purchasesConfiguration.getApiKey())) {
            throw new IllegalArgumentException("API key must be set. Get this from the RevenueCat web app");
        } else if (purchasesConfiguration.getContext().getApplicationContext() instanceof Application) {
            this.apiKeyValidator.validateAndLog(purchasesConfiguration.getApiKey(), purchasesConfiguration.getStore());
        } else {
            throw new IllegalArgumentException("Needs an application context.");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PurchasesFactory(IsDebugBuildProvider isDebugBuildProvider, APIKeyValidator aPIKeyValidator, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(isDebugBuildProvider, (i10 & 2) != 0 ? new APIKeyValidator() : aPIKeyValidator);
    }
}
