package com.revenuecat.purchases.common.offerings;

import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.utils.OfferingImagePreDownloader;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.Y;
import org.json.JSONObject;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJG\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00112\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJW\u0010$\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\b\b\u0002\u0010#\u001a\u00020!¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b&\u0010'JM\u0010(\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010.¨\u0006/"}, d2 = {"Lcom/revenuecat/purchases/common/offerings/OfferingsManager;", "", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "offeringsCache", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;", "offeringsFactory", "Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;", "offeringImagePreDownloader", "Landroid/os/Handler;", "mainHandler", "<init>", "(Lcom/revenuecat/purchases/common/offerings/OfferingsCache;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;Landroid/os/Handler;)V", "Lorg/json/JSONObject;", "offeringsJSON", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Llf/M;", "onError", "Lcom/revenuecat/purchases/Offerings;", "onSuccess", "createAndCacheOfferings", "(Lorg/json/JSONObject;Lyf/l;Lyf/l;)V", "error", "handleErrorFetchingOfferings", "(Lcom/revenuecat/purchases/PurchasesError;Lyf/l;)V", "Lkotlin/Function0;", "action", "dispatch", "(Lyf/a;)V", "", "appUserID", "", "appInBackground", "fetchCurrent", "getOfferings", "(Ljava/lang/String;ZLyf/l;Lyf/l;Z)V", "onAppForeground", "(Ljava/lang/String;)V", "fetchAndCacheOfferings", "(Ljava/lang/String;ZLyf/l;Lyf/l;)V", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;", "Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;", "Landroid/os/Handler;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OfferingsManager {
    private final Backend backend;
    private final Handler mainHandler;
    /* access modifiers changed from: private */
    public final OfferingImagePreDownloader offeringImagePreDownloader;
    /* access modifiers changed from: private */
    public final OfferingsCache offeringsCache;
    private final OfferingsFactory offeringsFactory;

    public OfferingsManager(OfferingsCache offeringsCache2, Backend backend2, OfferingsFactory offeringsFactory2, OfferingImagePreDownloader offeringImagePreDownloader2, Handler handler) {
        C6496s.h(offeringsCache2, "offeringsCache");
        C6496s.h(backend2, "backend");
        C6496s.h(offeringsFactory2, "offeringsFactory");
        C6496s.h(offeringImagePreDownloader2, "offeringImagePreDownloader");
        this.offeringsCache = offeringsCache2;
        this.backend = backend2;
        this.offeringsFactory = offeringsFactory2;
        this.offeringImagePreDownloader = offeringImagePreDownloader2;
        this.mainHandler = handler;
    }

    /* access modifiers changed from: private */
    public final void createAndCacheOfferings(JSONObject jSONObject, C6798l lVar, C6798l lVar2) {
        this.offeringsFactory.createOfferings(jSONObject, new OfferingsManager$createAndCacheOfferings$1(this, lVar), new OfferingsManager$createAndCacheOfferings$2(this, jSONObject, lVar2));
    }

    static /* synthetic */ void createAndCacheOfferings$default(OfferingsManager offeringsManager, JSONObject jSONObject, C6798l lVar, C6798l lVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        if ((i10 & 4) != 0) {
            lVar2 = null;
        }
        offeringsManager.createAndCacheOfferings(jSONObject, lVar, lVar2);
    }

    /* access modifiers changed from: private */
    public final void dispatch(C6787a aVar) {
        if (!C6496s.c(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            Handler handler = this.mainHandler;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new c(aVar));
            return;
        }
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public static final void dispatch$lambda$0(C6787a aVar) {
        C6496s.h(aVar, "$tmp0");
        aVar.invoke();
    }

    public static /* synthetic */ void fetchAndCacheOfferings$default(OfferingsManager offeringsManager, String str, boolean z10, C6798l lVar, C6798l lVar2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        if ((i10 & 8) != 0) {
            lVar2 = null;
        }
        offeringsManager.fetchAndCacheOfferings(str, z10, lVar, lVar2);
    }

    public static /* synthetic */ void getOfferings$default(OfferingsManager offeringsManager, String str, boolean z10, C6798l lVar, C6798l lVar2, boolean z11, int i10, Object obj) {
        C6798l lVar3;
        C6798l lVar4;
        if ((i10 & 4) != 0) {
            lVar3 = null;
        } else {
            lVar3 = lVar;
        }
        if ((i10 & 8) != 0) {
            lVar4 = null;
        } else {
            lVar4 = lVar2;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        offeringsManager.getOfferings(str, z10, lVar3, lVar4, z11);
    }

    /* access modifiers changed from: private */
    public final void handleErrorFetchingOfferings(PurchasesError purchasesError, C6798l lVar) {
        LogIntent logIntent;
        if (Y.j(PurchasesErrorCode.ConfigurationError, PurchasesErrorCode.UnexpectedBackendResponseError).contains(purchasesError.getCode())) {
            logIntent = LogIntent.RC_ERROR;
        } else {
            logIntent = LogIntent.GOOGLE_ERROR;
        }
        String format = String.format(OfferingStrings.FETCHING_OFFERINGS_ERROR, Arrays.copyOf(new Object[]{purchasesError}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.offeringsCache.clearOfferingsCacheTimestamp();
        dispatch(new OfferingsManager$handleErrorFetchingOfferings$1(lVar, purchasesError));
    }

    public final void fetchAndCacheOfferings(String str, boolean z10, C6798l lVar, C6798l lVar2) {
        C6496s.h(str, "appUserID");
        LogWrapperKt.log(LogIntent.RC_SUCCESS, OfferingStrings.OFFERINGS_START_UPDATE_FROM_NETWORK);
        this.backend.getOfferings(str, z10, new OfferingsManager$fetchAndCacheOfferings$1(this, lVar, lVar2), new OfferingsManager$fetchAndCacheOfferings$2(this, lVar, lVar2));
    }

    public final void getOfferings(String str, boolean z10, C6798l lVar, C6798l lVar2, boolean z11) {
        String str2;
        C6496s.h(str, "appUserID");
        Offerings cachedOfferings = this.offeringsCache.getCachedOfferings();
        if (cachedOfferings == null) {
            LogWrapperKt.log(LogIntent.DEBUG, OfferingStrings.NO_CACHED_OFFERINGS_FETCHING_NETWORK);
            fetchAndCacheOfferings(str, z10, lVar, lVar2);
        } else if (z11) {
            LogWrapperKt.log(LogIntent.DEBUG, OfferingStrings.FORCE_OFFERINGS_FETCHING_NETWORK);
            fetchAndCacheOfferings(str, z10, lVar, lVar2);
        } else {
            LogIntent logIntent = LogIntent.DEBUG;
            LogWrapperKt.log(logIntent, OfferingStrings.VENDING_OFFERINGS_CACHE);
            dispatch(new OfferingsManager$getOfferings$1(lVar2, cachedOfferings));
            if (this.offeringsCache.isOfferingsCacheStale(z10)) {
                if (z10) {
                    str2 = OfferingStrings.OFFERINGS_STALE_UPDATING_IN_BACKGROUND;
                } else {
                    str2 = OfferingStrings.OFFERINGS_STALE_UPDATING_IN_FOREGROUND;
                }
                LogWrapperKt.log(logIntent, str2);
                fetchAndCacheOfferings$default(this, str, z10, (C6798l) null, (C6798l) null, 12, (Object) null);
            }
        }
    }

    public final void onAppForeground(String str) {
        C6496s.h(str, "appUserID");
        if (this.offeringsCache.isOfferingsCacheStale(false)) {
            LogWrapperKt.log(LogIntent.DEBUG, OfferingStrings.OFFERINGS_STALE_UPDATING_IN_FOREGROUND);
            fetchAndCacheOfferings$default(this, str, false, (C6798l) null, (C6798l) null, 12, (Object) null);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OfferingsManager(OfferingsCache offeringsCache2, Backend backend2, OfferingsFactory offeringsFactory2, OfferingImagePreDownloader offeringImagePreDownloader2, Handler handler, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(offeringsCache2, backend2, offeringsFactory2, offeringImagePreDownloader2, (i10 & 16) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }
}
