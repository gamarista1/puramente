package com.revenuecat.purchases.common.diagnostics;

import Tg.a;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import com.revenuecat.purchases.utils.AndroidVersionUtilsKt;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import io.branch.rnbranch.RNBranchModule;
import java.io.IOException;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import mf.O;
import yf.C6787a;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 N2\u00020\u0001:\u0001NB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010JO\u0010\"\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J3\u0010)\u001a\u00020\r2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J3\u0010+\u001a\u00020\r2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010(J3\u0010-\u001a\u00020\r2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010(J#\u00100\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/J#\u00102\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u0010/J\u0017\u00104\u001a\u00020\r2\b\b\u0002\u00103\u001a\u00020\u0017¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\r¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\r¢\u0006\u0004\b8\u00107J\u001d\u00109\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020#¢\u0006\u0004\b9\u0010:J\u0015\u0010=\u001a\u00020\r2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\r¢\u0006\u0004\b?\u00107J\u0015\u0010B\u001a\u00020\r2\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ\u0015\u0010F\u001a\u00020\r2\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\r2\u0006\u0010E\u001a\u00020DH\u0000¢\u0006\u0004\bH\u0010GR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010JR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010KR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010LR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010M\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006O"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;", "diagnosticsFileHelper", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsHelper;", "diagnosticsHelper", "Lcom/revenuecat/purchases/common/Dispatcher;", "diagnosticsDispatcher", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsHelper;Lcom/revenuecat/purchases/common/Dispatcher;)V", "Lkotlin/Function0;", "Llf/M;", "completion", "checkAndClearDiagnosticsFileIfTooBig", "(Lyf/a;)V", "command", "enqueue", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "endpoint", "LTg/a;", "responseTime", "", "wasSuccessful", "", "responseCode", "backendErrorCode", "Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;", "resultOrigin", "Lcom/revenuecat/purchases/VerificationResult;", "verificationResult", "trackHttpRequestPerformed-nRVORKE", "(Lcom/revenuecat/purchases/common/networking/Endpoint;JZILjava/lang/Integer;Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;Lcom/revenuecat/purchases/VerificationResult;)V", "trackHttpRequestPerformed", "", "productType", "billingResponseCode", "billingDebugMessage", "trackGoogleQueryProductDetailsRequest-Wn2Vu4Y", "(Ljava/lang/String;ILjava/lang/String;J)V", "trackGoogleQueryProductDetailsRequest", "trackGoogleQueryPurchasesRequest-Wn2Vu4Y", "trackGoogleQueryPurchasesRequest", "trackGoogleQueryPurchaseHistoryRequest-Wn2Vu4Y", "trackGoogleQueryPurchaseHistoryRequest", "trackAmazonQueryProductDetailsRequest-VtjQ1oo", "(JZ)V", "trackAmazonQueryProductDetailsRequest", "trackAmazonQueryPurchasesRequest-VtjQ1oo", "trackAmazonQueryPurchasesRequest", "useCurrentThread", "trackMaxEventsStoredLimitReached", "(Z)V", "trackMaxDiagnosticsSyncRetriesReached", "()V", "trackClearingDiagnosticsAfterFailedSync", "trackProductDetailsNotSupported", "(ILjava/lang/String;)V", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "trackCustomerInfoVerificationResultIfNeeded", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "trackEnteredOfflineEntitlementsMode", "Lcom/revenuecat/purchases/PurchasesError;", "error", "trackErrorEnteringOfflineEntitlementsMode", "(Lcom/revenuecat/purchases/PurchasesError;)V", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry;", "diagnosticsEntry", "trackEvent", "(Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry;)V", "trackEventInCurrentThread$purchases_defaultsRelease", "trackEventInCurrentThread", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsHelper;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DiagnosticsTracker {
    @Deprecated
    public static final String BACKEND_ERROR_CODE_KEY = "backend_error_code";
    @Deprecated
    public static final String BILLING_DEBUG_MESSAGE = "billing_debug_message";
    @Deprecated
    public static final String BILLING_RESPONSE_CODE = "billing_response_code";
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Deprecated
    public static final String ENDPOINT_NAME_KEY = "endpoint_name";
    @Deprecated
    public static final String ETAG_HIT_KEY = "etag_hit";
    @Deprecated
    public static final String PRODUCT_TYPE_QUERIED_KEY = "product_type_queried";
    @Deprecated
    public static final String RESPONSE_CODE_KEY = "response_code";
    @Deprecated
    public static final String RESPONSE_TIME_MILLIS_KEY = "response_time_millis";
    @Deprecated
    public static final String SUCCESSFUL_KEY = "successful";
    @Deprecated
    public static final String VERIFICATION_RESULT_KEY = "verification_result";
    private final AppConfig appConfig;
    private final Dispatcher diagnosticsDispatcher;
    /* access modifiers changed from: private */
    public final DiagnosticsFileHelper diagnosticsFileHelper;
    /* access modifiers changed from: private */
    public final DiagnosticsHelper diagnosticsHelper;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$Companion;", "", "()V", "BACKEND_ERROR_CODE_KEY", "", "BILLING_DEBUG_MESSAGE", "BILLING_RESPONSE_CODE", "ENDPOINT_NAME_KEY", "ETAG_HIT_KEY", "PRODUCT_TYPE_QUERIED_KEY", "RESPONSE_CODE_KEY", "RESPONSE_TIME_MILLIS_KEY", "SUCCESSFUL_KEY", "VERIFICATION_RESULT_KEY", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DiagnosticsTracker(AppConfig appConfig2, DiagnosticsFileHelper diagnosticsFileHelper2, DiagnosticsHelper diagnosticsHelper2, Dispatcher dispatcher) {
        C6496s.h(appConfig2, "appConfig");
        C6496s.h(diagnosticsFileHelper2, "diagnosticsFileHelper");
        C6496s.h(diagnosticsHelper2, "diagnosticsHelper");
        C6496s.h(dispatcher, "diagnosticsDispatcher");
        this.appConfig = appConfig2;
        this.diagnosticsFileHelper = diagnosticsFileHelper2;
        this.diagnosticsHelper = diagnosticsHelper2;
        this.diagnosticsDispatcher = dispatcher;
    }

    private final void checkAndClearDiagnosticsFileIfTooBig(C6787a aVar) {
        enqueue(new DiagnosticsTracker$checkAndClearDiagnosticsFileIfTooBig$1(this, aVar));
    }

    private final void enqueue(C6787a aVar) {
        Dispatcher.enqueue$default(this.diagnosticsDispatcher, new b(aVar), (Delay) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void enqueue$lambda$0(C6787a aVar) {
        C6496s.h(aVar, "$tmp0");
        aVar.invoke();
    }

    public static /* synthetic */ void trackMaxEventsStoredLimitReached$default(DiagnosticsTracker diagnosticsTracker, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        diagnosticsTracker.trackMaxEventsStoredLimitReached(z10);
    }

    /* renamed from: trackAmazonQueryProductDetailsRequest-VtjQ1oo  reason: not valid java name */
    public final void m52trackAmazonQueryProductDetailsRequestVtjQ1oo(long j10, boolean z10) {
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.AMAZON_QUERY_PRODUCT_DETAILS_REQUEST, O.l(C6502A.a(SUCCESSFUL_KEY, Boolean.valueOf(z10)), C6502A.a(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(a.t(j10)))), (DateProvider) null, (Date) null, 12, (DefaultConstructorMarker) null));
    }

    /* renamed from: trackAmazonQueryPurchasesRequest-VtjQ1oo  reason: not valid java name */
    public final void m53trackAmazonQueryPurchasesRequestVtjQ1oo(long j10, boolean z10) {
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.AMAZON_QUERY_PURCHASES_REQUEST, O.l(C6502A.a(SUCCESSFUL_KEY, Boolean.valueOf(z10)), C6502A.a(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(a.t(j10)))), (DateProvider) null, (Date) null, 12, (DefaultConstructorMarker) null));
    }

    public final void trackClearingDiagnosticsAfterFailedSync() {
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.CLEARING_DIAGNOSTICS_AFTER_FAILED_SYNC, O.i(), (DateProvider) null, (Date) null, 12, (DefaultConstructorMarker) null));
    }

    public final void trackCustomerInfoVerificationResultIfNeeded(CustomerInfo customerInfo) {
        C6496s.h(customerInfo, "customerInfo");
        VerificationResult verification = customerInfo.getEntitlements().getVerification();
        if (verification != VerificationResult.NOT_REQUESTED) {
            trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.CUSTOMER_INFO_VERIFICATION_RESULT, O.f(C6502A.a(VERIFICATION_RESULT_KEY, verification.name())), (DateProvider) null, (Date) null, 12, (DefaultConstructorMarker) null));
        }
    }

    public final void trackEnteredOfflineEntitlementsMode() {
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.ENTERED_OFFLINE_ENTITLEMENTS_MODE, O.i(), (DateProvider) null, (Date) null, 12, (DefaultConstructorMarker) null));
    }

    public final void trackErrorEnteringOfflineEntitlementsMode(PurchasesError purchasesError) {
        String str;
        C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        if (purchasesError.getCode() != PurchasesErrorCode.UnsupportedError || !C6496s.c(purchasesError.getUnderlyingErrorMessage(), OfflineEntitlementsStrings.OFFLINE_ENTITLEMENTS_UNSUPPORTED_INAPP_PURCHASES)) {
            str = "unknown";
        } else {
            str = "one_time_purchase_found";
        }
        DiagnosticsEntryName diagnosticsEntryName = DiagnosticsEntryName.ERROR_ENTERING_OFFLINE_ENTITLEMENTS_MODE;
        Pair a10 = C6502A.a("offline_entitlement_error_reason", str);
        trackEvent(new DiagnosticsEntry(diagnosticsEntryName, O.l(a10, C6502A.a("error_message", purchasesError.getMessage() + " Underlying error: " + purchasesError.getUnderlyingErrorMessage())), (DateProvider) null, (Date) null, 12, (DefaultConstructorMarker) null));
    }

    public final void trackEvent(DiagnosticsEntry diagnosticsEntry) {
        C6496s.h(diagnosticsEntry, "diagnosticsEntry");
        checkAndClearDiagnosticsFileIfTooBig(new DiagnosticsTracker$trackEvent$1(this, diagnosticsEntry));
    }

    public final void trackEventInCurrentThread$purchases_defaultsRelease(DiagnosticsEntry diagnosticsEntry) {
        C6496s.h(diagnosticsEntry, "diagnosticsEntry");
        if (AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            LogUtilsKt.verboseLog("Tracking diagnostics entry: " + diagnosticsEntry);
            try {
                this.diagnosticsFileHelper.appendEvent(diagnosticsEntry);
            } catch (IOException e10) {
                LogUtilsKt.verboseLog("Error tracking diagnostics entry: " + e10);
            }
        }
    }

    /* renamed from: trackGoogleQueryProductDetailsRequest-Wn2Vu4Y  reason: not valid java name */
    public final void m54trackGoogleQueryProductDetailsRequestWn2Vu4Y(String str, int i10, String str2, long j10) {
        C6496s.h(str, "productType");
        C6496s.h(str2, "billingDebugMessage");
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.GOOGLE_QUERY_PRODUCT_DETAILS_REQUEST, O.l(C6502A.a(PRODUCT_TYPE_QUERIED_KEY, str), C6502A.a(BILLING_RESPONSE_CODE, Integer.valueOf(i10)), C6502A.a(BILLING_DEBUG_MESSAGE, str2), C6502A.a(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(a.t(j10)))), (DateProvider) null, (Date) null, 12, (DefaultConstructorMarker) null));
    }

    /* renamed from: trackGoogleQueryPurchaseHistoryRequest-Wn2Vu4Y  reason: not valid java name */
    public final void m55trackGoogleQueryPurchaseHistoryRequestWn2Vu4Y(String str, int i10, String str2, long j10) {
        C6496s.h(str, "productType");
        C6496s.h(str2, "billingDebugMessage");
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.GOOGLE_QUERY_PURCHASE_HISTORY_REQUEST, O.l(C6502A.a(PRODUCT_TYPE_QUERIED_KEY, str), C6502A.a(BILLING_RESPONSE_CODE, Integer.valueOf(i10)), C6502A.a(BILLING_DEBUG_MESSAGE, str2), C6502A.a(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(a.t(j10)))), (DateProvider) null, (Date) null, 12, (DefaultConstructorMarker) null));
    }

    /* renamed from: trackGoogleQueryPurchasesRequest-Wn2Vu4Y  reason: not valid java name */
    public final void m56trackGoogleQueryPurchasesRequestWn2Vu4Y(String str, int i10, String str2, long j10) {
        C6496s.h(str, "productType");
        C6496s.h(str2, "billingDebugMessage");
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.GOOGLE_QUERY_PURCHASES_REQUEST, O.l(C6502A.a(PRODUCT_TYPE_QUERIED_KEY, str), C6502A.a(BILLING_RESPONSE_CODE, Integer.valueOf(i10)), C6502A.a(BILLING_DEBUG_MESSAGE, str2), C6502A.a(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(a.t(j10)))), (DateProvider) null, (Date) null, 12, (DefaultConstructorMarker) null));
    }

    /* renamed from: trackHttpRequestPerformed-nRVORKE  reason: not valid java name */
    public final void m57trackHttpRequestPerformednRVORKE(Endpoint endpoint, long j10, boolean z10, int i10, Integer num, HTTPResult.Origin origin, VerificationResult verificationResult) {
        boolean z11;
        Endpoint endpoint2 = endpoint;
        C6496s.h(endpoint, "endpoint");
        C6496s.h(verificationResult, "verificationResult");
        if (origin == HTTPResult.Origin.CACHE) {
            z11 = true;
        } else {
            z11 = false;
        }
        DiagnosticsEntryName diagnosticsEntryName = DiagnosticsEntryName.HTTP_REQUEST_PERFORMED;
        Pair a10 = C6502A.a(ENDPOINT_NAME_KEY, endpoint.getName());
        Pair a11 = C6502A.a(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(a.t(j10)));
        Pair a12 = C6502A.a(SUCCESSFUL_KEY, Boolean.valueOf(z10));
        Pair a13 = C6502A.a(RESPONSE_CODE_KEY, Integer.valueOf(i10));
        Pair a14 = C6502A.a(BACKEND_ERROR_CODE_KEY, num);
        Pair a15 = C6502A.a(ETAG_HIT_KEY, Boolean.valueOf(z11));
        trackEvent(new DiagnosticsEntry(diagnosticsEntryName, MapExtensionsKt.filterNotNullValues(O.l(a10, a11, a12, a13, a14, a15, C6502A.a(VERIFICATION_RESULT_KEY, verificationResult.name()))), (DateProvider) null, (Date) null, 12, (DefaultConstructorMarker) null));
    }

    public final void trackMaxDiagnosticsSyncRetriesReached() {
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.MAX_DIAGNOSTICS_SYNC_RETRIES_REACHED, O.i(), (DateProvider) null, (Date) null, 12, (DefaultConstructorMarker) null));
    }

    public final void trackMaxEventsStoredLimitReached(boolean z10) {
        DiagnosticsEntry diagnosticsEntry = new DiagnosticsEntry(DiagnosticsEntryName.MAX_EVENTS_STORED_LIMIT_REACHED, O.i(), (DateProvider) null, (Date) null, 12, (DefaultConstructorMarker) null);
        if (z10) {
            trackEventInCurrentThread$purchases_defaultsRelease(diagnosticsEntry);
        } else {
            trackEvent(diagnosticsEntry);
        }
    }

    public final void trackProductDetailsNotSupported(int i10, String str) {
        C6496s.h(str, "billingDebugMessage");
        DiagnosticsEntryName diagnosticsEntryName = DiagnosticsEntryName.PRODUCT_DETAILS_NOT_SUPPORTED;
        String playStoreVersionName = this.appConfig.getPlayStoreVersionName();
        String str2 = "";
        if (playStoreVersionName == null) {
            playStoreVersionName = str2;
        }
        Pair a10 = C6502A.a("play_store_version", playStoreVersionName);
        String playServicesVersionName = this.appConfig.getPlayServicesVersionName();
        if (playServicesVersionName != null) {
            str2 = playServicesVersionName;
        }
        trackEvent(new DiagnosticsEntry(diagnosticsEntryName, O.l(a10, C6502A.a("play_services_version", str2), C6502A.a(BILLING_RESPONSE_CODE, Integer.valueOf(i10)), C6502A.a(BILLING_DEBUG_MESSAGE, str)), (DateProvider) null, (Date) null, 12, (DefaultConstructorMarker) null));
    }
}
