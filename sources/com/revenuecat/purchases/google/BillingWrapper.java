package com.revenuecat.purchases.google;

import J4.C3037c;
import J4.C3047m;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.android.billingclient.api.C3194a;
import com.android.billingclient.api.C3197d;
import com.android.billingclient.api.C3198e;
import com.android.billingclient.api.C3199f;
import com.android.billingclient.api.C3200g;
import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesStateProvider;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PurchaseExtensionsKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCase;
import com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCaseParams;
import com.revenuecat.purchases.google.usecase.BillingClientUseCase;
import com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCase;
import com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCaseParams;
import com.revenuecat.purchases.google.usecase.GetBillingConfigUseCase;
import com.revenuecat.purchases.google.usecase.GetBillingConfigUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase;
import com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCase;
import com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCase;
import com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryPurchasesUseCase;
import com.revenuecat.purchases.google.usecase.QueryPurchasesUseCaseParams;
import com.revenuecat.purchases.models.GooglePurchasingData;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import com.revenuecat.purchases.utils.Result;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6514M;
import lf.C6535s;
import mf.C6565s;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002¬\u0001B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u001a\u001a\u00020\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00120\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0003¢\u0006\u0004\b \u0010!JG\u0010)\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00120\u00172\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00120\u0017H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0012H\u0002¢\u0006\u0004\b+\u0010\u0014J#\u0010.\u001a\u00020\u00122\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00120\u0017H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\"H\u0002¢\u0006\u0004\b0\u00101J+\u00106\u001a\u00020\u00122\u0006\u00103\u001a\u0002022\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00120\u0017H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0012H\u0002¢\u0006\u0004\b8\u0010\u0014J?\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00180?2\u0006\u0010:\u001a\u0002092\b\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010=\u001a\u00020\"2\b\u0010>\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b@\u0010AJ5\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00180?2\u0006\u0010:\u001a\u00020B2\u0006\u0010=\u001a\u00020\"2\b\u0010>\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\bC\u0010DJ?\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00180?2\u0006\u0010:\u001a\u00020E2\b\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010=\u001a\u00020\"2\b\u0010>\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\u00122\u0006\u0010H\u001a\u00020\u0018H\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0012H\u0016¢\u0006\u0004\bM\u0010\u0014J\u000f\u0010N\u001a\u00020\u0012H\u0014¢\u0006\u0004\bN\u0010\u0014J[\u0010W\u001a\u00020\u00122\u0006\u0010#\u001a\u00020%2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\"0O2\u001c\u0010T\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0Q\u0012\u0004\u0012\u00020\u00120\u0017j\u0002`S2\u0016\u0010V\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00120\u0017j\u0002`UH\u0016¢\u0006\u0004\bW\u0010XJE\u0010]\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020\"2\u0006\u0010Z\u001a\u00020Y2\b\u0010<\u001a\u0004\u0018\u00010;2\b\u0010\\\u001a\u0004\u0018\u00010[2\b\u0010>\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b]\u0010^JC\u0010b\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"2\u0018\u0010`\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020_0Q\u0012\u0004\u0012\u00020\u00120\u00172\u0012\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00120\u0017¢\u0006\u0004\bb\u0010cJE\u0010d\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\"2\u0018\u0010`\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002040Q\u0012\u0004\u0012\u00020\u00120\u00172\u0012\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00120\u0017H\u0016¢\u0006\u0004\bd\u0010cJ/\u0010i\u001a\u00020\u00122\u0006\u0010e\u001a\u00020'2\u0006\u00103\u001a\u0002042\u0006\u0010f\u001a\u00020'2\u0006\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bi\u0010jJ3\u0010o\u001a\u00020\u00122\u0006\u0010k\u001a\u00020\"2\u0006\u0010h\u001a\u00020g2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00120\u0017H\u0000¢\u0006\u0004\bm\u0010nJ3\u0010r\u001a\u00020\u00122\u0006\u0010k\u001a\u00020\"2\u0006\u0010h\u001a\u00020g2\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00120\u0017H\u0000¢\u0006\u0004\bq\u0010nJK\u0010u\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\"2\u001e\u0010t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u0002040s\u0012\u0004\u0012\u00020\u00120\u00172\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00120\u0017H\u0016¢\u0006\u0004\bu\u0010cJO\u0010x\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\"2\u0006\u0010#\u001a\u00020%2\u0006\u0010v\u001a\u00020\"2\u0012\u0010w\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00120\u00172\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00120\u0017H\u0016¢\u0006\u0004\bx\u0010yJ+\u0010|\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\"2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00120\u0017H\u0001¢\u0006\u0004\bz\u0010{J*\u0010\u0001\u001a\u00020\u00122\u0006\u0010~\u001a\u00020}2\u000e\u0010\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010QH\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u00020\u00122\u0006\u0010~\u001a\u00020}H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0001\u0010\u0014J\u0012\u0010\u0001\u001a\u00020'H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J:\u0010\u0001\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\u000e\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010Q2\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\u00120\u0001H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J>\u0010\u0001\u001a\u00020\u00122\u0012\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00120\u00172\u0016\u0010V\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00120\u0017j\u0002`UH\u0016¢\u0006\u0006\b\u0001\u0010\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0001R\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u0001R6\u0010\u0001\u001a\u0004\u0018\u00010,2\t\u0010\u0001\u001a\u0004\u0018\u00010,8F@FX\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R4\u0010\u0001\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0005\u0012\u00030\u00010\u00018\u0000X\u0004¢\u0006\u0017\n\u0006\b\u0001\u0010\u0001\u0012\u0005\b¡\u0001\u0010\u0014\u001a\u0006\b\u0001\u0010 \u0001R;\u0010¤\u0001\u001a&\u0012!\u0012\u001f\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00120\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00150£\u00010¢\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0019\u0010¦\u0001\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\"\u0010¨\u0001\u001a\u00020'2\u0007\u0010\u0001\u001a\u00020'8B@BX\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0014\u0010«\u0001\u001a\u00020'8F¢\u0006\b\u001a\u0006\bª\u0001\u0010\u0001¨\u0006­\u0001"}, d2 = {"Lcom/revenuecat/purchases/google/BillingWrapper;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "LJ4/m;", "LJ4/c;", "Lcom/revenuecat/purchases/google/BillingWrapper$ClientFactory;", "clientFactory", "Landroid/os/Handler;", "mainHandler", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/PurchasesStateProvider;", "purchasesStateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Lcom/revenuecat/purchases/google/BillingWrapper$ClientFactory;Landroid/os/Handler;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/PurchasesStateProvider;Lcom/revenuecat/purchases/common/DateProvider;)V", "Llf/M;", "executePendingRequests", "()V", "", "delayMilliseconds", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "request", "executeRequestOnUIThread", "(Ljava/lang/Long;Lyf/l;)V", "Landroid/app/Activity;", "activity", "Lcom/android/billingclient/api/d;", "params", "launchBillingFlow", "(Landroid/app/Activity;Lcom/android/billingclient/api/d;)V", "", "productType", "purchaseToken", "Lcom/revenuecat/purchases/ProductType;", "listener", "", "resultHandler", "queryPurchaseType", "(Ljava/lang/String;Ljava/lang/String;Lyf/l;Lyf/l;)V", "retryBillingServiceConnectionWithExponentialBackoff", "Lcom/android/billingclient/api/a;", "receivingFunction", "withConnectedClient", "(Lyf/l;)V", "getStackTrace", "()Ljava/lang/String;", "Lcom/android/billingclient/api/Purchase;", "purchase", "Lcom/revenuecat/purchases/models/StoreTransaction;", "completion", "getStoreTransaction", "(Lcom/android/billingclient/api/Purchase;Lyf/l;)V", "trackProductDetailsNotSupportedIfNeeded", "Lcom/revenuecat/purchases/models/GooglePurchasingData;", "purchaseInfo", "Lcom/revenuecat/purchases/common/ReplaceProductInfo;", "replaceProductInfo", "appUserID", "isPersonalizedPrice", "Lcom/revenuecat/purchases/utils/Result;", "buildPurchaseParams", "(Lcom/revenuecat/purchases/models/GooglePurchasingData;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;", "buildOneTimePurchaseParams", "(Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;", "buildSubscriptionPurchaseParams", "(Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/revenuecat/purchases/utils/Result;", "error", "sendErrorsToAllPendingRequests", "(Lcom/revenuecat/purchases/PurchasesError;)V", "startConnectionOnMainThread", "(J)V", "startConnection", "endConnection", "", "productIds", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", "onReceive", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "queryProductDetailsAsync", "(Lcom/revenuecat/purchases/ProductType;Ljava/util/Set;Lyf/l;Lyf/l;)V", "Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "makePurchaseAsync", "(Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Boolean;)V", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "onReceivePurchaseHistory", "onReceivePurchaseHistoryError", "queryPurchaseHistoryAsync", "(Ljava/lang/String;Lyf/l;Lyf/l;)V", "queryAllPurchases", "finishTransactions", "shouldConsume", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "consumeAndSave", "(ZLcom/revenuecat/purchases/models/StoreTransaction;ZLcom/revenuecat/purchases/PostReceiptInitiationSource;)V", "token", "onConsumed", "consumePurchase$purchases_defaultsRelease", "(Ljava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lyf/l;)V", "consumePurchase", "onAcknowledged", "acknowledge$purchases_defaultsRelease", "acknowledge", "", "onSuccess", "queryPurchases", "productId", "onCompletion", "findPurchaseInPurchaseHistory", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Ljava/lang/String;Lyf/l;Lyf/l;)V", "getPurchaseType$purchases_defaultsRelease", "(Ljava/lang/String;Lyf/l;)V", "getPurchaseType", "Lcom/android/billingclient/api/e;", "billingResult", "purchases", "onPurchasesUpdated", "(Lcom/android/billingclient/api/e;Ljava/util/List;)V", "onBillingSetupFinished", "(Lcom/android/billingclient/api/e;)V", "onBillingServiceDisconnected", "isConnected", "()Z", "Lcom/revenuecat/purchases/models/InAppMessageType;", "inAppMessageTypes", "Lkotlin/Function0;", "subscriptionStatusChange", "showInAppMessagesIfNeeded", "(Landroid/app/Activity;Ljava/util/List;Lyf/a;)V", "getStorefront", "(Lyf/l;Lyf/l;)V", "Lcom/revenuecat/purchases/google/BillingWrapper$ClientFactory;", "Landroid/os/Handler;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/common/DateProvider;", "<set-?>", "billingClient", "Lcom/android/billingclient/api/a;", "getBillingClient", "()Lcom/android/billingclient/api/a;", "setBillingClient", "(Lcom/android/billingclient/api/a;)V", "", "Lcom/revenuecat/purchases/google/PurchaseContext;", "purchaseContext", "Ljava/util/Map;", "getPurchaseContext$purchases_defaultsRelease", "()Ljava/util/Map;", "getPurchaseContext$purchases_defaultsRelease$annotations", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lkotlin/Pair;", "serviceRequests", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "reconnectMilliseconds", "J", "reconnectionAlreadyScheduled", "Z", "getAppInBackground", "appInBackground", "ClientFactory", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BillingWrapper extends BillingAbstract implements C3047m, C3037c {
    private volatile C3194a billingClient;
    private final ClientFactory clientFactory;
    private final DateProvider dateProvider;
    private final DeviceCache deviceCache;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final Handler mainHandler;
    private final Map<String, PurchaseContext> purchaseContext;
    private long reconnectMilliseconds;
    private boolean reconnectionAlreadyScheduled;
    private final ConcurrentLinkedQueue<Pair<C6798l, Long>> serviceRequests;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/google/BillingWrapper$ClientFactory;", "", "Landroid/content/Context;", "context", "", "pendingTransactionsForPrepaidPlansEnabled", "<init>", "(Landroid/content/Context;Z)V", "LJ4/m;", "listener", "Lcom/android/billingclient/api/a;", "buildClient", "(LJ4/m;)Lcom/android/billingclient/api/a;", "Landroid/content/Context;", "Z", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ClientFactory {
        private final Context context;
        private final boolean pendingTransactionsForPrepaidPlansEnabled;

        public ClientFactory(Context context2, boolean z10) {
            C6496s.h(context2, "context");
            this.context = context2;
            this.pendingTransactionsForPrepaidPlansEnabled = z10;
        }

        public final C3194a buildClient(C3047m mVar) {
            C6496s.h(mVar, "listener");
            C3200g.a b10 = C3200g.c().b();
            if (this.pendingTransactionsForPrepaidPlansEnabled) {
                b10.c();
            }
            C3200g a10 = b10.a();
            C6496s.g(a10, "newBuilder()\n           …\n                .build()");
            C3194a a11 = C3194a.h(this.context).c(a10).d(mVar).a();
            C6496s.g(a11, "newBuilder(context).enab…\n                .build()");
            return a11;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BillingWrapper(ClientFactory clientFactory2, Handler handler, DeviceCache deviceCache2, DiagnosticsTracker diagnosticsTracker, PurchasesStateProvider purchasesStateProvider, DateProvider dateProvider2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(clientFactory2, handler, deviceCache2, diagnosticsTracker, purchasesStateProvider, (i10 & 32) != 0 ? new DefaultDateProvider() : dateProvider2);
    }

    private final Result<C3197d, PurchasesError> buildOneTimePurchaseParams(GooglePurchasingData.InAppProduct inAppProduct, String str, Boolean bool) {
        C3197d.b.a a10 = C3197d.b.a();
        a10.c(inAppProduct.getProductDetails());
        C3197d.b a11 = a10.a();
        C6496s.g(a11, "newBuilder().apply {\n   …etails)\n        }.build()");
        C3197d.a c10 = C3197d.a().d(C6565s.e(a11)).c(UtilsKt.sha256(str));
        if (bool != null) {
            c10.b(bool.booleanValue());
        }
        C3197d a12 = c10.a();
        C6496s.g(a12, "newBuilder()\n           …\n                .build()");
        return new Result.Success(a12);
    }

    /* access modifiers changed from: private */
    public final Result<C3197d, PurchasesError> buildPurchaseParams(GooglePurchasingData googlePurchasingData, ReplaceProductInfo replaceProductInfo, String str, Boolean bool) {
        if (googlePurchasingData instanceof GooglePurchasingData.InAppProduct) {
            return buildOneTimePurchaseParams((GooglePurchasingData.InAppProduct) googlePurchasingData, str, bool);
        }
        if (googlePurchasingData instanceof GooglePurchasingData.Subscription) {
            return buildSubscriptionPurchaseParams((GooglePurchasingData.Subscription) googlePurchasingData, replaceProductInfo, str, bool);
        }
        throw new C6535s();
    }

    private final Result<C3197d, PurchasesError> buildSubscriptionPurchaseParams(GooglePurchasingData.Subscription subscription, ReplaceProductInfo replaceProductInfo, String str, Boolean bool) {
        C3197d.b.a a10 = C3197d.b.a();
        a10.b(subscription.getToken());
        a10.c(subscription.getProductDetails());
        C3197d.b a11 = a10.a();
        C6496s.g(a11, "newBuilder().apply {\n   …etails)\n        }.build()");
        C3197d.a d10 = C3197d.a().d(C6565s.e(a11));
        if (replaceProductInfo != null) {
            C6496s.g(d10, "buildSubscriptionPurchas…arams$lambda$29$lambda$27");
            BillingFlowParamsExtensionsKt.setUpgradeInfo(d10, replaceProductInfo);
            C6514M m10 = C6514M.f71813a;
        } else {
            C6496s.g(d10.c(UtilsKt.sha256(str)), "setObfuscatedAccountId(appUserID.sha256())");
        }
        if (bool != null) {
            d10.b(bool.booleanValue());
        }
        C3197d a12 = d10.a();
        C6496s.g(a12, "newBuilder()\n           …\n                .build()");
        return new Result.Success(a12);
    }

    /* access modifiers changed from: private */
    public static final void endConnection$lambda$9(BillingWrapper billingWrapper) {
        C6496s.h(billingWrapper, "this$0");
        synchronized (billingWrapper) {
            try {
                C3194a aVar = billingWrapper.billingClient;
                if (aVar != null) {
                    LogIntent logIntent = LogIntent.DEBUG;
                    String format = String.format(BillingStrings.BILLING_CLIENT_ENDING, Arrays.copyOf(new Object[]{aVar}, 1));
                    C6496s.g(format, "format(this, *args)");
                    LogWrapperKt.log(logIntent, format);
                    aVar.c();
                }
                billingWrapper.billingClient = null;
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void executePendingRequests() {
        Pair poll;
        synchronized (this) {
            while (true) {
                try {
                    C3194a aVar = this.billingClient;
                    if (aVar == null || !aVar.f() || (poll = this.serviceRequests.poll()) == null) {
                        C6514M m10 = C6514M.f71813a;
                    } else {
                        C6496s.g(poll, "poll()");
                        C6798l lVar = (C6798l) poll.a();
                        Long l10 = (Long) poll.b();
                        if (l10 != null) {
                            this.mainHandler.postDelayed(new b(lVar), l10.longValue());
                        } else {
                            this.mainHandler.post(new c(lVar));
                        }
                    }
                } finally {
                }
            }
            C6514M m102 = C6514M.f71813a;
        }
    }

    /* access modifiers changed from: private */
    public static final void executePendingRequests$lambda$3$lambda$2$lambda$0(C6798l lVar) {
        C6496s.h(lVar, "$request");
        lVar.invoke((Object) null);
    }

    /* access modifiers changed from: private */
    public static final void executePendingRequests$lambda$3$lambda$2$lambda$1(C6798l lVar) {
        C6496s.h(lVar, "$request");
        lVar.invoke((Object) null);
    }

    /* access modifiers changed from: private */
    public final synchronized void executeRequestOnUIThread(Long l10, C6798l lVar) {
        try {
            if (getPurchasesUpdatedListener() != null) {
                this.serviceRequests.add(C6502A.a(lVar, l10));
                C3194a aVar = this.billingClient;
                if (aVar == null || aVar.f()) {
                    executePendingRequests();
                } else {
                    BillingAbstract.startConnectionOnMainThread$default(this, 0, 1, (Object) null);
                }
            } else {
                lVar.invoke(new PurchasesError(PurchasesErrorCode.UnknownError, "BillingWrapper is not attached to a listener"));
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    static /* synthetic */ void executeRequestOnUIThread$default(BillingWrapper billingWrapper, Long l10, C6798l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = null;
        }
        billingWrapper.executeRequestOnUIThread(l10, lVar);
    }

    public static /* synthetic */ void getPurchaseContext$purchases_defaultsRelease$annotations() {
    }

    private final String getStackTrace() {
        StringWriter stringWriter = new StringWriter();
        new Throwable().printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        C6496s.g(stringWriter2, "stringWriter.toString()");
        return stringWriter2;
    }

    private final void getStoreTransaction(Purchase purchase, C6798l lVar) {
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(BillingStrings.BILLING_WRAPPER_PURCHASES_UPDATED, Arrays.copyOf(new Object[]{PurchaseExtensionsKt.toHumanReadableDescription(purchase)}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        synchronized (this) {
            PurchaseContext purchaseContext2 = this.purchaseContext.get(PurchaseExtensionsKt.getFirstProductId(purchase));
            if (purchaseContext2 == null || purchaseContext2.getProductType() == null) {
                String f10 = purchase.f();
                C6496s.g(f10, "purchase.purchaseToken");
                getPurchaseType$purchases_defaultsRelease(f10, new BillingWrapper$getStoreTransaction$1$2(lVar, purchase));
                C6514M m10 = C6514M.f71813a;
                return;
            }
            lVar.invoke(StoreTransactionConversionsKt.toStoreTransaction(purchase, purchaseContext2));
        }
    }

    /* access modifiers changed from: private */
    public final void launchBillingFlow(Activity activity, C3197d dVar) {
        if (activity.getIntent() == null) {
            LogWrapperKt.log(LogIntent.WARNING, BillingStrings.NULL_ACTIVITY_INTENT);
        }
        withConnectedClient(new BillingWrapper$launchBillingFlow$1(activity, dVar));
    }

    /* access modifiers changed from: private */
    public static final void onBillingSetupFinished$lambda$18(C3198e eVar, BillingWrapper billingWrapper) {
        PurchasesError purchasesError;
        String str;
        C6496s.h(eVar, "$billingResult");
        C6496s.h(billingWrapper, "this$0");
        int b10 = eVar.b();
        if (b10 != 6) {
            if (!(b10 == 7 || b10 == 8)) {
                if (b10 != 12) {
                    switch (b10) {
                        case -2:
                        case 3:
                            String humanReadableDescription = BillingResultExtensionsKt.toHumanReadableDescription(eVar);
                            if (C6496s.c(eVar.a(), ErrorsKt.IN_APP_BILLING_LESS_THAN_3_ERROR_MESSAGE)) {
                                String format = String.format(BillingStrings.BILLING_UNAVAILABLE_LESS_THAN_3, Arrays.copyOf(new Object[]{humanReadableDescription}, 1));
                                C6496s.g(format, "format(this, *args)");
                                purchasesError = new PurchasesError(PurchasesErrorCode.StoreProblemError, format);
                                LogUtilsKt.errorLog(purchasesError);
                            } else {
                                String format2 = String.format(BillingStrings.BILLING_UNAVAILABLE, Arrays.copyOf(new Object[]{humanReadableDescription}, 1));
                                C6496s.g(format2, "format(this, *args)");
                                purchasesError = ErrorsKt.billingResponseToPurchasesError(eVar.b(), format2);
                                LogUtilsKt.errorLog(purchasesError);
                            }
                            billingWrapper.sendErrorsToAllPendingRequests(purchasesError);
                            return;
                        case -1:
                        case 1:
                        case 2:
                            break;
                        case 0:
                            LogIntent logIntent = LogIntent.DEBUG;
                            C3194a aVar = billingWrapper.billingClient;
                            if (aVar != null) {
                                str = aVar.toString();
                            } else {
                                str = null;
                            }
                            String format3 = String.format(BillingStrings.BILLING_SERVICE_SETUP_FINISHED, Arrays.copyOf(new Object[]{str}, 1));
                            C6496s.g(format3, "format(this, *args)");
                            LogWrapperKt.log(logIntent, format3);
                            BillingAbstract.StateListener stateListener = billingWrapper.getStateListener();
                            if (stateListener != null) {
                                stateListener.onConnected();
                            }
                            billingWrapper.executePendingRequests();
                            billingWrapper.reconnectMilliseconds = 1000;
                            billingWrapper.trackProductDetailsNotSupportedIfNeeded();
                            return;
                        case 4:
                            break;
                        default:
                            return;
                    }
                }
            }
            LogIntent logIntent2 = LogIntent.GOOGLE_WARNING;
            String format4 = String.format(BillingStrings.BILLING_CLIENT_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(eVar)}, 1));
            C6496s.g(format4, "format(this, *args)");
            LogWrapperKt.log(logIntent2, format4);
            return;
        }
        LogIntent logIntent3 = LogIntent.GOOGLE_WARNING;
        String format5 = String.format(BillingStrings.BILLING_CLIENT_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(eVar)}, 1));
        C6496s.g(format5, "format(this, *args)");
        LogWrapperKt.log(logIntent3, format5);
        billingWrapper.retryBillingServiceConnectionWithExponentialBackoff();
    }

    /* access modifiers changed from: private */
    public final void queryPurchaseType(String str, String str2, C6798l lVar, C6798l lVar2) {
        BillingClientUseCase.run$default(new QueryPurchasesByTypeUseCase(new QueryPurchasesByTypeUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, getAppInBackground(), str), new BillingWrapper$queryPurchaseType$1(lVar2, str2), new BillingWrapper$queryPurchaseType$2(lVar), new BillingWrapper$queryPurchaseType$3(this), new BillingWrapper$queryPurchaseType$4(this)), 0, 1, (Object) null);
    }

    private final void retryBillingServiceConnectionWithExponentialBackoff() {
        if (this.reconnectionAlreadyScheduled) {
            LogWrapperKt.log(LogIntent.WARNING, BillingStrings.BILLING_CLIENT_RETRY_ALREADY_SCHEDULED);
            return;
        }
        LogIntent logIntent = LogIntent.WARNING;
        String format = String.format(BillingStrings.BILLING_CLIENT_RETRY, Arrays.copyOf(new Object[]{Long.valueOf(this.reconnectMilliseconds)}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.reconnectionAlreadyScheduled = true;
        startConnectionOnMainThread(this.reconnectMilliseconds);
        this.reconnectMilliseconds = Math.min(this.reconnectMilliseconds * ((long) 2), 900000);
    }

    private final synchronized void sendErrorsToAllPendingRequests(PurchasesError purchasesError) {
        while (true) {
            Pair poll = this.serviceRequests.poll();
            if (poll != null) {
                this.mainHandler.post(new e((C6798l) poll.a(), purchasesError));
            }
        }
        while (true) {
        }
    }

    /* access modifiers changed from: private */
    public static final void sendErrorsToAllPendingRequests$lambda$31$lambda$30(C6798l lVar, PurchasesError purchasesError) {
        C6496s.h(lVar, "$serviceRequest");
        C6496s.h(purchasesError, "$error");
        lVar.invoke(purchasesError);
    }

    /* access modifiers changed from: private */
    public static final void startConnectionOnMainThread$lambda$4(BillingWrapper billingWrapper) {
        C6496s.h(billingWrapper, "this$0");
        billingWrapper.startConnection();
    }

    private final void trackProductDetailsNotSupportedIfNeeded() {
        C3198e eVar;
        if (this.diagnosticsTrackerIfEnabled != null) {
            C3194a aVar = this.billingClient;
            if (aVar != null) {
                eVar = aVar.e("fff");
            } else {
                eVar = null;
            }
            if (eVar != null && eVar.b() == -2) {
                DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
                int b10 = eVar.b();
                String a10 = eVar.a();
                C6496s.g(a10, "billingResult.debugMessage");
                diagnosticsTracker.trackProductDetailsNotSupported(b10, a10);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void withConnectedClient(C6798l lVar) {
        C3194a aVar = this.billingClient;
        C6514M m10 = null;
        if (aVar != null) {
            if (!aVar.f()) {
                aVar = null;
            }
            if (aVar != null) {
                lVar.invoke(aVar);
                m10 = C6514M.f71813a;
            }
        }
        if (m10 == null) {
            LogIntent logIntent = LogIntent.GOOGLE_WARNING;
            String format = String.format(BillingStrings.BILLING_CLIENT_DISCONNECTED, Arrays.copyOf(new Object[]{getStackTrace()}, 1));
            C6496s.g(format, "format(this, *args)");
            LogWrapperKt.log(logIntent, format);
        }
    }

    public final void acknowledge$purchases_defaultsRelease(String str, PostReceiptInitiationSource postReceiptInitiationSource, C6798l lVar) {
        C6496s.h(str, "token");
        C6496s.h(postReceiptInitiationSource, "initiationSource");
        C6496s.h(lVar, "onAcknowledged");
        LogIntent logIntent = LogIntent.PURCHASE;
        String format = String.format(PurchaseStrings.ACKNOWLEDGING_PURCHASE, Arrays.copyOf(new Object[]{str}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        BillingClientUseCase.run$default(new AcknowledgePurchaseUseCase(new AcknowledgePurchaseUseCaseParams(str, postReceiptInitiationSource, getAppInBackground()), lVar, BillingWrapper$acknowledge$1.INSTANCE, new BillingWrapper$acknowledge$2(this), new BillingWrapper$acknowledge$3(this)), 0, 1, (Object) null);
    }

    public void consumeAndSave(boolean z10, StoreTransaction storeTransaction, boolean z11, PostReceiptInitiationSource postReceiptInitiationSource) {
        boolean z12;
        C6496s.h(storeTransaction, "purchase");
        C6496s.h(postReceiptInitiationSource, "initiationSource");
        if (storeTransaction.getType() != ProductType.UNKNOWN && storeTransaction.getPurchaseState() != PurchaseState.PENDING) {
            Purchase originalGooglePurchase = StoreTransactionConversionsKt.getOriginalGooglePurchase(storeTransaction);
            if (originalGooglePurchase != null) {
                z12 = originalGooglePurchase.h();
            } else {
                z12 = false;
            }
            if (storeTransaction.getType() == ProductType.INAPP) {
                if (z10 && z11) {
                    consumePurchase$purchases_defaultsRelease(storeTransaction.getPurchaseToken(), postReceiptInitiationSource, new BillingWrapper$consumeAndSave$1(this.deviceCache));
                } else if (!z10 || z12) {
                    this.deviceCache.addSuccessfullyPostedToken(storeTransaction.getPurchaseToken());
                } else {
                    LogWrapperKt.log(LogIntent.PURCHASE, PurchaseStrings.NOT_CONSUMING_IN_APP_PURCHASE_ACCORDING_TO_BACKEND);
                    acknowledge$purchases_defaultsRelease(storeTransaction.getPurchaseToken(), postReceiptInitiationSource, new BillingWrapper$consumeAndSave$2(this.deviceCache));
                }
            } else if (!z10 || z12) {
                this.deviceCache.addSuccessfullyPostedToken(storeTransaction.getPurchaseToken());
            } else {
                acknowledge$purchases_defaultsRelease(storeTransaction.getPurchaseToken(), postReceiptInitiationSource, new BillingWrapper$consumeAndSave$3(this.deviceCache));
            }
        }
    }

    public final void consumePurchase$purchases_defaultsRelease(String str, PostReceiptInitiationSource postReceiptInitiationSource, C6798l lVar) {
        C6496s.h(str, "token");
        C6496s.h(postReceiptInitiationSource, "initiationSource");
        C6496s.h(lVar, "onConsumed");
        LogIntent logIntent = LogIntent.PURCHASE;
        String format = String.format(PurchaseStrings.CONSUMING_PURCHASE, Arrays.copyOf(new Object[]{str}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        BillingClientUseCase.run$default(new ConsumePurchaseUseCase(new ConsumePurchaseUseCaseParams(str, postReceiptInitiationSource, getAppInBackground()), lVar, BillingWrapper$consumePurchase$1.INSTANCE, new BillingWrapper$consumePurchase$2(this), new BillingWrapper$consumePurchase$3(this)), 0, 1, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void endConnection() {
        this.mainHandler.post(new d(this));
    }

    public void findPurchaseInPurchaseHistory(String str, ProductType productType, String str2, C6798l lVar, C6798l lVar2) {
        C6496s.h(str, "appUserID");
        C6496s.h(productType, "productType");
        C6496s.h(str2, "productId");
        C6496s.h(lVar, "onCompletion");
        C6496s.h(lVar2, "onError");
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(RestoreStrings.QUERYING_PURCHASE_WITH_TYPE, Arrays.copyOf(new Object[]{str2, productType.name()}, 2));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        String googleProductType = ProductTypeConversionsKt.toGoogleProductType(productType);
        C6514M m10 = null;
        if (googleProductType != null) {
            BillingClientUseCase.run$default(new QueryPurchaseHistoryUseCase(new QueryPurchaseHistoryUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, googleProductType, getAppInBackground()), new BillingWrapper$findPurchaseInPurchaseHistory$1$1(productType, lVar, str2, lVar2), lVar2, new BillingWrapper$findPurchaseInPurchaseHistory$1$2(this), new BillingWrapper$findPurchaseInPurchaseHistory$1$3(this)), 0, 1, (Object) null);
            m10 = C6514M.f71813a;
        }
        if (m10 == null) {
            lVar2.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, PurchaseStrings.NOT_RECOGNIZED_PRODUCT_TYPE));
        }
    }

    public final boolean getAppInBackground() {
        return getPurchasesStateProvider().getPurchasesState().getAppInBackground();
    }

    public final synchronized C3194a getBillingClient() {
        return this.billingClient;
    }

    public final Map<String, PurchaseContext> getPurchaseContext$purchases_defaultsRelease() {
        return this.purchaseContext;
    }

    public final void getPurchaseType$purchases_defaultsRelease(String str, C6798l lVar) {
        C6496s.h(str, "purchaseToken");
        C6496s.h(lVar, "listener");
        queryPurchaseType("subs", str, lVar, new BillingWrapper$getPurchaseType$1(lVar, this, str));
    }

    public void getStorefront(C6798l lVar, C6798l lVar2) {
        C6496s.h(lVar, "onSuccess");
        C6496s.h(lVar2, "onError");
        LogUtilsKt.verboseLog(BillingStrings.BILLING_INITIATE_GETTING_COUNTRY_CODE);
        BillingClientUseCase.run$default(new GetBillingConfigUseCase(new GetBillingConfigUseCaseParams(getAppInBackground()), this.deviceCache, new BillingWrapper$getStorefront$1(lVar), lVar2, new BillingWrapper$getStorefront$2(this), new BillingWrapper$getStorefront$3(this)), 0, 1, (Object) null);
    }

    public boolean isConnected() {
        C3194a aVar = this.billingClient;
        if (aVar != null) {
            return aVar.f();
        }
        return false;
    }

    public void makePurchaseAsync(Activity activity, String str, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, PresentedOfferingContext presentedOfferingContext, Boolean bool) {
        GooglePurchasingData googlePurchasingData;
        String str2;
        ReplacementMode replacementMode;
        String str3;
        ReplacementMode replacementMode2;
        PresentedOfferingContext presentedOfferingContext2;
        GoogleReplacementMode googleReplacementMode;
        PurchasingData purchasingData2 = purchasingData;
        Activity activity2 = activity;
        C6496s.h(activity, "activity");
        String str4 = str;
        C6496s.h(str, "appUserID");
        C6496s.h(purchasingData2, "purchasingData");
        if (purchasingData2 instanceof GooglePurchasingData) {
            googlePurchasingData = (GooglePurchasingData) purchasingData2;
        } else {
            googlePurchasingData = null;
        }
        if (googlePurchasingData == null) {
            PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.UnknownError;
            String format = String.format(PurchaseStrings.INVALID_PURCHASE_TYPE, Arrays.copyOf(new Object[]{"Play", "GooglePurchasingData"}, 2));
            C6496s.g(format, "format(this, *args)");
            PurchasesError purchasesError = new PurchasesError(purchasesErrorCode, format);
            LogUtilsKt.errorLog(purchasesError);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesError);
                return;
            }
            return;
        }
        if (googlePurchasingData instanceof GooglePurchasingData.InAppProduct) {
            str2 = null;
        } else if (googlePurchasingData instanceof GooglePurchasingData.Subscription) {
            str2 = ((GooglePurchasingData.Subscription) googlePurchasingData).getOptionId();
        } else {
            throw new C6535s();
        }
        if (replaceProductInfo != null) {
            LogIntent logIntent = LogIntent.PURCHASE;
            String format2 = String.format(PurchaseStrings.UPGRADING_SKU, Arrays.copyOf(new Object[]{replaceProductInfo.getOldPurchase().getProductIds().get(0), googlePurchasingData.getProductId()}, 2));
            C6496s.g(format2, "format(this, *args)");
            LogWrapperKt.log(logIntent, format2);
        } else {
            LogIntent logIntent2 = LogIntent.PURCHASE;
            String format3 = String.format(PurchaseStrings.PURCHASING_PRODUCT, Arrays.copyOf(new Object[]{googlePurchasingData.getProductId()}, 1));
            C6496s.g(format3, "format(this, *args)");
            LogWrapperKt.log(logIntent2, format3);
        }
        synchronized (this) {
            if (replaceProductInfo != null) {
                try {
                    replacementMode = replaceProductInfo.getReplacementMode();
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                replacementMode = null;
            }
            if (replacementMode == GoogleReplacementMode.DEFERRED) {
                str3 = (String) C6565s.o0(replaceProductInfo.getOldPurchase().getProductIds());
            } else {
                str3 = googlePurchasingData.getProductId();
            }
            Map<String, PurchaseContext> map = this.purchaseContext;
            ProductType productType = googlePurchasingData.getProductType();
            if (replaceProductInfo != null) {
                replacementMode2 = replaceProductInfo.getReplacementMode();
            } else {
                replacementMode2 = null;
            }
            if (replacementMode2 instanceof GoogleReplacementMode) {
                googleReplacementMode = (GoogleReplacementMode) replacementMode2;
                presentedOfferingContext2 = presentedOfferingContext;
            } else {
                presentedOfferingContext2 = presentedOfferingContext;
                googleReplacementMode = null;
            }
            map.put(str3, new PurchaseContext(productType, presentedOfferingContext2, str2, googleReplacementMode));
            C6514M m10 = C6514M.f71813a;
        }
        executeRequestOnUIThread$default(this, (Long) null, new BillingWrapper$makePurchaseAsync$2(this, purchasingData, replaceProductInfo, str, bool, activity), 1, (Object) null);
    }

    public void onBillingServiceDisconnected() {
        String str;
        LogIntent logIntent = LogIntent.WARNING;
        C3194a aVar = this.billingClient;
        if (aVar != null) {
            str = aVar.toString();
        } else {
            str = null;
        }
        String format = String.format(BillingStrings.BILLING_SERVICE_DISCONNECTED_INSTANCE, Arrays.copyOf(new Object[]{str}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
    }

    public void onBillingSetupFinished(C3198e eVar) {
        C6496s.h(eVar, "billingResult");
        this.mainHandler.post(new a(eVar, this));
    }

    public void onPurchasesUpdated(C3198e eVar, List<? extends Purchase> list) {
        List<? extends Purchase> list2;
        C6496s.h(eVar, "billingResult");
        if (list == null) {
            list2 = C6565s.n();
        } else {
            list2 = list;
        }
        if (eVar.b() != 0 || list2.isEmpty()) {
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            StringBuilder sb2 = new StringBuilder();
            String format = String.format(BillingStrings.BILLING_WRAPPER_PURCHASES_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(eVar)}, 1));
            C6496s.g(format, "format(this, *args)");
            sb2.append(format);
            String str = null;
            if (list2.isEmpty()) {
                list2 = null;
            }
            if (list2 != null) {
                str = "Purchases:" + C6565s.x0(list2, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, BillingWrapper$onPurchasesUpdated$3$1.INSTANCE, 30, (Object) null);
            }
            sb2.append(str);
            LogWrapperKt.log(logIntent, sb2.toString());
            String str2 = "Error updating purchases. " + BillingResultExtensionsKt.toHumanReadableDescription(eVar);
            int b10 = eVar.b();
            if (list == null && eVar.b() == 0) {
                str2 = "Error: onPurchasesUpdated received an OK BillingResult with a Null purchases list.";
                b10 = 6;
            }
            PurchasesError billingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(b10, str2);
            LogUtilsKt.errorLog(billingResponseToPurchasesError);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesFailedToUpdate(billingResponseToPurchasesError);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Purchase storeTransaction : list2) {
            getStoreTransaction(storeTransaction, new BillingWrapper$onPurchasesUpdated$1$1(arrayList, list2, this));
        }
    }

    public void queryAllPurchases(String str, C6798l lVar, C6798l lVar2) {
        C6496s.h(str, "appUserID");
        C6496s.h(lVar, "onReceivePurchaseHistory");
        C6496s.h(lVar2, "onReceivePurchaseHistoryError");
        queryPurchaseHistoryAsync("subs", new BillingWrapper$queryAllPurchases$1(this, lVar2, lVar), lVar2);
    }

    public void queryProductDetailsAsync(ProductType productType, Set<String> set, C6798l lVar, C6798l lVar2) {
        C6496s.h(productType, "productType");
        C6496s.h(set, "productIds");
        C6496s.h(lVar, "onReceive");
        C6496s.h(lVar2, "onError");
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(OfferingStrings.FETCHING_PRODUCTS, Arrays.copyOf(new Object[]{C6565s.x0(set, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 63, (Object) null)}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        BillingClientUseCase.run$default(new QueryProductDetailsUseCase(new QueryProductDetailsUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, set, productType, getAppInBackground()), lVar, lVar2, new BillingWrapper$queryProductDetailsAsync$useCase$1(this), new BillingWrapper$queryProductDetailsAsync$useCase$2(this)), 0, 1, (Object) null);
    }

    public final void queryPurchaseHistoryAsync(String str, C6798l lVar, C6798l lVar2) {
        C6496s.h(str, "productType");
        C6496s.h(lVar, "onReceivePurchaseHistory");
        C6496s.h(lVar2, "onReceivePurchaseHistoryError");
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(RestoreStrings.QUERYING_PURCHASE_HISTORY, Arrays.copyOf(new Object[]{str}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        BillingClientUseCase.run$default(new QueryPurchaseHistoryUseCase(new QueryPurchaseHistoryUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, str, getAppInBackground()), lVar, lVar2, new BillingWrapper$queryPurchaseHistoryAsync$1(this), new BillingWrapper$queryPurchaseHistoryAsync$2(this)), 0, 1, (Object) null);
    }

    public void queryPurchases(String str, C6798l lVar, C6798l lVar2) {
        C6496s.h(str, "appUserID");
        C6496s.h(lVar, "onSuccess");
        C6496s.h(lVar2, "onError");
        LogWrapperKt.log(LogIntent.DEBUG, RestoreStrings.QUERYING_PURCHASE);
        BillingClientUseCase.run$default(new QueryPurchasesUseCase(new QueryPurchasesUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, getAppInBackground()), lVar, lVar2, new BillingWrapper$queryPurchases$1(this), new BillingWrapper$queryPurchases$2(this)), 0, 1, (Object) null);
    }

    public final synchronized void setBillingClient(C3194a aVar) {
        this.billingClient = aVar;
    }

    public void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> list, C6787a aVar) {
        C6496s.h(activity, "activity");
        C6496s.h(list, "inAppMessageTypes");
        C6496s.h(aVar, "subscriptionStatusChange");
        if (list.isEmpty()) {
            LogUtilsKt.errorLog$default(BillingStrings.BILLING_UNSPECIFIED_INAPP_MESSAGE_TYPES, (Throwable) null, 2, (Object) null);
            return;
        }
        C3199f.a a10 = C3199f.a();
        C6496s.g(a10, "newBuilder()");
        for (InAppMessageType inAppMessageCategoryId$purchases_defaultsRelease : list) {
            a10.a(inAppMessageCategoryId$purchases_defaultsRelease.getInAppMessageCategoryId$purchases_defaultsRelease());
        }
        C3199f b10 = a10.b();
        C6496s.g(b10, "inAppMessageParamsBuilder.build()");
        executeRequestOnUIThread$default(this, (Long) null, new BillingWrapper$showInAppMessagesIfNeeded$1(this, new WeakReference(activity), b10, aVar), 1, (Object) null);
    }

    public void startConnection() {
        synchronized (this) {
            try {
                if (this.billingClient == null) {
                    this.billingClient = this.clientFactory.buildClient(this);
                }
                this.reconnectionAlreadyScheduled = false;
                C3194a aVar = this.billingClient;
                if (aVar != null) {
                    if (!aVar.f()) {
                        LogIntent logIntent = LogIntent.DEBUG;
                        String format = String.format(BillingStrings.BILLING_CLIENT_STARTING, Arrays.copyOf(new Object[]{aVar}, 1));
                        C6496s.g(format, "format(this, *args)");
                        LogWrapperKt.log(logIntent, format);
                        aVar.m(this);
                    }
                    C6514M m10 = C6514M.f71813a;
                }
            } catch (IllegalStateException e10) {
                LogIntent logIntent2 = LogIntent.GOOGLE_ERROR;
                String format2 = String.format(BillingStrings.ILLEGAL_STATE_EXCEPTION_WHEN_CONNECTING, Arrays.copyOf(new Object[]{e10}, 1));
                C6496s.g(format2, "format(this, *args)");
                LogWrapperKt.log(logIntent2, format2);
                sendErrorsToAllPendingRequests(new PurchasesError(PurchasesErrorCode.StoreProblemError, e10.getMessage()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void startConnectionOnMainThread(long j10) {
        this.mainHandler.postDelayed(new f(this), j10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BillingWrapper(ClientFactory clientFactory2, Handler handler, DeviceCache deviceCache2, DiagnosticsTracker diagnosticsTracker, PurchasesStateProvider purchasesStateProvider, DateProvider dateProvider2) {
        super(purchasesStateProvider);
        C6496s.h(clientFactory2, "clientFactory");
        C6496s.h(handler, "mainHandler");
        C6496s.h(deviceCache2, "deviceCache");
        C6496s.h(purchasesStateProvider, "purchasesStateProvider");
        C6496s.h(dateProvider2, "dateProvider");
        this.clientFactory = clientFactory2;
        this.mainHandler = handler;
        this.deviceCache = deviceCache2;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.dateProvider = dateProvider2;
        this.purchaseContext = new LinkedHashMap();
        this.serviceRequests = new ConcurrentLinkedQueue<>();
        this.reconnectMilliseconds = 1000;
    }
}
