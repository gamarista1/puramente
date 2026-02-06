package com.revenuecat.purchases.amazon;

import Tg.a;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.amazon.a.a.o.b;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesStateProvider;
import com.revenuecat.purchases.amazon.AmazonPurchasingData;
import com.revenuecat.purchases.amazon.listener.ProductDataResponseListener;
import com.revenuecat.purchases.amazon.listener.PurchaseResponseListener;
import com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener;
import com.revenuecat.purchases.amazon.listener.UserDataResponseListener;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.L;
import lf.C6502A;
import lf.C6514M;
import mf.C6565s;
import mf.O;
import org.json.JSONException;
import org.json.JSONObject;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000Ä\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B}\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dBC\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u001e\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001c\u0010\"JA\u0010+\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020*0%*\b\u0012\u0004\u0012\u00020$0#2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&0%2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u0004\u0018\u00010&2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J#\u00104\u001a\u0002032\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u0002010%H\u0002¢\u0006\u0004\b4\u00105JK\u0010:\u001a\u0002032\u0006\u00106\u001a\u00020\f2\u001e\u00108\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020*0%\u0012\u0004\u0012\u000203072\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020307H\u0002¢\u0006\u0004\b:\u0010;JW\u0010@\u001a\u0002032\u0006\u0010<\u001a\u00020&2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020$0#20\u0010?\u001a,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&0%\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u0002010%\u0012\u0004\u0012\u0002030>H\u0002¢\u0006\u0004\b@\u0010AJ1\u0010G\u001a\u0002032\u0006\u0010B\u001a\u00020$2\u0006\u0010)\u001a\u00020(2\u0006\u0010D\u001a\u00020C2\b\u0010F\u001a\u0004\u0018\u00010EH\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u0002032\u0006\u0010I\u001a\u000201H\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\fH\u0002¢\u0006\u0004\bL\u0010MJ%\u0010O\u001a\u0002032\u0014\u0010N\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000101\u0012\u0004\u0012\u00020307H\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u000203H\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u0002032\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bU\u0010VJ\u001f\u0010Z\u001a\u0002032\u0006\u0010W\u001a\u00020\f2\u0006\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\bZ\u0010[J\u001f\u0010\\\u001a\u0002032\u0006\u0010W\u001a\u00020\f2\u0006\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\b\\\u0010[JT\u0010a\u001a\u0002032\f\u0010^\u001a\b\u0012\u0004\u0012\u00020&0]2\u0006\u0010_\u001a\u00020&2\u0018\u0010`\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0#\u0012\u0004\u0012\u000203072\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020307H\u0001¢\u0006\u0004\ba\u0010bJ^\u0010f\u001a\u0002032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010d\u001a\u00020c2\u0006\u0010e\u001a\u00020&2\u0006\u0010D\u001a\u00020C2\u0018\u00108\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u0002030>2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020307H\u0001¢\u0006\u0004\bf\u0010gJD\u0010:\u001a\u0002032\u001e\u00108\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u0002030>2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020307H\u0001¢\u0006\u0004\b:\u0010hJ8\u0010i\u001a\u0002032\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u000203072\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020307H\u0001¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u000203H\u0016¢\u0006\u0004\bk\u0010RJ\u0017\u0010n\u001a\u0002032\u0006\u0010m\u001a\u00020lH\u0016¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u000203H\u0014¢\u0006\u0004\bp\u0010RJI\u0010t\u001a\u0002032\u0006\u0010e\u001a\u00020&2\u0018\u0010q\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0#\u0012\u0004\u0012\u000203072\u0016\u0010s\u001a\u0012\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020307j\u0002`rH\u0016¢\u0006\u0004\bt\u0010uJO\u0010y\u001a\u0002032\u0006\u0010v\u001a\u00020&2\u0006\u0010w\u001a\u00020&2\u0006\u0010x\u001a\u00020&2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u000203072\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020307H\u0016¢\u0006\u0004\by\u0010zJ\\\u0010\u001a\u0002032\u0006\u0010|\u001a\u00020{2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020&0]2\u001c\u0010`\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0#\u0012\u0004\u0012\u00020307j\u0002`~2\u0016\u00109\u001a\u0012\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020307j\u0002`rH\u0016¢\u0006\u0005\b\u0010\u0001J5\u0010\u0001\u001a\u0002032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010f\u001a\u00020*2\u0007\u0010\u0001\u001a\u00020\f2\b\u0010\u0001\u001a\u00030\u0001H\u0016¢\u0006\u0006\b\u0001\u0010\u0001JS\u0010\u0001\u001a\u0002032\u0006\u0010e\u001a\u00020&2\u0006\u0010|\u001a\u00020{2\u0007\u0010\u0001\u001a\u00020&2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u000203072\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020307H\u0016¢\u0006\u0006\b\u0001\u0010\u0001JM\u0010\u0001\u001a\u0002032\u0006\u0010d\u001a\u00020c2\u0006\u0010e\u001a\u00020&2\b\u0010\u0001\u001a\u00030\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\b\u0010F\u001a\u0004\u0018\u00010E2\t\u0010\u0001\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020\fH\u0016¢\u0006\u0005\b\u0001\u0010MJK\u0010:\u001a\u0002032\u0006\u0010e\u001a\u00020&2\u001e\u00108\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020*0%\u0012\u0004\u0012\u000203072\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020307H\u0016¢\u0006\u0004\b:\u0010uJ:\u0010\u0001\u001a\u0002032\u0006\u0010d\u001a\u00020c2\u000e\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010#2\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u0002030\u0001H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J=\u0010\u0001\u001a\u0002032\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u000203072\u0016\u00109\u001a\u0012\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020307j\u0002`rH\u0016¢\u0006\u0005\b\u0001\u0010jJ>\u0010\u0001\u001a\u0002032\u0013\u00108\u001a\u000f\u0012\u0005\u0012\u00030\u0001\u0012\u0004\u0012\u000203072\u0016\u00109\u001a\u0012\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020307j\u0002`rH\u0016¢\u0006\u0005\b\u0001\u0010jJ\u001b\u0010\u0001\u001a\u0002032\u0007\u0010.\u001a\u00030\u0001H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u0002032\u0007\u0010.\u001a\u00030\u0001H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010¡\u0001\u001a\u0002032\u0007\u0010.\u001a\u00030 \u0001H\u0016¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u001b\u0010¤\u0001\u001a\u0002032\u0007\u0010.\u001a\u00030£\u0001H\u0016¢\u0006\u0006\b¤\u0001\u0010¥\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010¦\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0007\n\u0005\b\t\u0010§\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010¨\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0007\n\u0005\b\r\u0010©\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010ª\u0001R\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010«\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010¬\u0001R\u0015\u0010\u0016\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010­\u0001R\u0015\u0010\u0017\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010®\u0001R\u0015\u0010\u0018\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010¯\u0001R\u0015\u0010\u0019\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010°\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010±\u0001R\u0019\u0010²\u0001\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b²\u0001\u0010©\u0001R,\u0010´\u0001\u001a\u0017\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u000101\u0012\u0004\u0012\u000203070³\u00018\u0002X\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001¨\u0006¶\u0001"}, d2 = {"Lcom/revenuecat/purchases/amazon/AmazonBilling;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/amazon/listener/ProductDataResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseUpdatesResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/UserDataResponseListener;", "Landroid/content/Context;", "applicationContext", "Lcom/revenuecat/purchases/amazon/AmazonBackend;", "amazonBackend", "Lcom/revenuecat/purchases/amazon/AmazonCache;", "cache", "", "finishTransactions", "Landroid/os/Handler;", "mainHandler", "Lcom/revenuecat/purchases/PurchasesStateProvider;", "stateProvider", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "purchasingServiceProvider", "productDataHandler", "purchaseHandler", "purchaseUpdatesHandler", "userDataHandler", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Landroid/content/Context;Lcom/revenuecat/purchases/amazon/AmazonBackend;Lcom/revenuecat/purchases/amazon/AmazonCache;ZLandroid/os/Handler;Lcom/revenuecat/purchases/PurchasesStateProvider;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;Lcom/revenuecat/purchases/amazon/listener/ProductDataResponseListener;Lcom/revenuecat/purchases/amazon/listener/PurchaseResponseListener;Lcom/revenuecat/purchases/amazon/listener/PurchaseUpdatesResponseListener;Lcom/revenuecat/purchases/amazon/listener/UserDataResponseListener;Lcom/revenuecat/purchases/common/DateProvider;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/BackendHelper;", "backendHelper", "diagnosticsTracker", "(Landroid/content/Context;Lcom/revenuecat/purchases/common/caching/DeviceCache;ZLandroid/os/Handler;Lcom/revenuecat/purchases/common/BackendHelper;Lcom/revenuecat/purchases/PurchasesStateProvider;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;)V", "", "Lcom/amazon/device/iap/model/Receipt;", "", "", "tokensToSkusMap", "Lcom/amazon/device/iap/model/UserData;", "userData", "Lcom/revenuecat/purchases/models/StoreTransaction;", "toMapOfReceiptHashesToRestoredPurchases", "(Ljava/util/List;Ljava/util/Map;Lcom/amazon/device/iap/model/UserData;)Ljava/util/Map;", "Lorg/json/JSONObject;", "response", "getTermSkuFromJSON", "(Lorg/json/JSONObject;)Ljava/lang/String;", "Lcom/revenuecat/purchases/PurchasesError;", "errors", "Llf/M;", "logErrorsIfAny", "(Ljava/util/Map;)V", "filterOnlyActivePurchases", "Lkotlin/Function1;", "onSuccess", "onError", "queryPurchases", "(ZLyf/l;Lyf/l;)V", "amazonUserID", "receipts", "Lkotlin/Function2;", "onCompletion", "getMissingSkusForReceipts", "(Ljava/lang/String;Ljava/util/List;Lyf/p;)V", "receipt", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProduct", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "handleReceipt", "(Lcom/amazon/device/iap/model/Receipt;Lcom/amazon/device/iap/model/UserData;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "error", "onPurchaseError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "shouldFinishTransactions", "()Z", "request", "executeRequestOnUIThread", "(Lyf/l;)V", "executePendingRequests", "()V", "Ljava/lang/Runnable;", "runnable", "runOnUIThread", "(Ljava/lang/Runnable;)V", "wasSuccessful", "Ljava/util/Date;", "requestStartTime", "trackAmazonQueryProductDetailsRequestIfNeeded", "(ZLjava/util/Date;)V", "trackAmazonQueryPurchasesRequestIfNeeded", "", "skus", "marketplace", "onReceive", "getProductData", "(Ljava/util/Set;Ljava/lang/String;Lyf/l;Lyf/l;)V", "Landroid/app/Activity;", "activity", "appUserID", "purchase", "(Landroid/os/Handler;Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/StoreProduct;Lyf/p;Lyf/l;)V", "(Lyf/p;Lyf/l;)V", "getUserData", "(Lyf/l;Lyf/l;)V", "startConnection", "", "delayMilliseconds", "startConnectionOnMainThread", "(J)V", "endConnection", "onReceivePurchaseHistory", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onReceivePurchaseHistoryError", "queryAllPurchases", "(Ljava/lang/String;Lyf/l;Lyf/l;)V", "productID", "purchaseToken", "storeUserID", "normalizePurchaseData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyf/l;Lyf/l;)V", "Lcom/revenuecat/purchases/ProductType;", "productType", "productIds", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", "queryProductDetailsAsync", "(Lcom/revenuecat/purchases/ProductType;Ljava/util/Set;Lyf/l;Lyf/l;)V", "shouldConsume", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "consumeAndSave", "(ZLcom/revenuecat/purchases/models/StoreTransaction;ZLcom/revenuecat/purchases/PostReceiptInitiationSource;)V", "productId", "findPurchaseInPurchaseHistory", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Ljava/lang/String;Lyf/l;Lyf/l;)V", "Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "Lcom/revenuecat/purchases/common/ReplaceProductInfo;", "replaceProductInfo", "isPersonalizedPrice", "makePurchaseAsync", "(Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Boolean;)V", "isConnected", "Lcom/revenuecat/purchases/models/InAppMessageType;", "inAppMessageTypes", "Lkotlin/Function0;", "subscriptionStatusChange", "showInAppMessagesIfNeeded", "(Landroid/app/Activity;Ljava/util/List;Lyf/a;)V", "getStorefront", "Lcom/revenuecat/purchases/AmazonLWAConsentStatus;", "getAmazonLWAConsentStatus", "Lcom/amazon/device/iap/model/UserDataResponse;", "onUserDataResponse", "(Lcom/amazon/device/iap/model/UserDataResponse;)V", "Lcom/amazon/device/iap/model/ProductDataResponse;", "onProductDataResponse", "(Lcom/amazon/device/iap/model/ProductDataResponse;)V", "Lcom/amazon/device/iap/model/PurchaseResponse;", "onPurchaseResponse", "(Lcom/amazon/device/iap/model/PurchaseResponse;)V", "Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;", "onPurchaseUpdatesResponse", "(Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;)V", "Landroid/content/Context;", "Lcom/revenuecat/purchases/amazon/AmazonBackend;", "Lcom/revenuecat/purchases/amazon/AmazonCache;", "Z", "Landroid/os/Handler;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "Lcom/revenuecat/purchases/amazon/listener/ProductDataResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseUpdatesResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/UserDataResponseListener;", "Lcom/revenuecat/purchases/common/DateProvider;", "connected", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "serviceRequests", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AmazonBilling extends BillingAbstract implements ProductDataResponseListener, PurchaseResponseListener, PurchaseUpdatesResponseListener, UserDataResponseListener {
    private final AmazonBackend amazonBackend;
    private final Context applicationContext;
    /* access modifiers changed from: private */
    public final AmazonCache cache;
    private boolean connected;
    /* access modifiers changed from: private */
    public final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final boolean finishTransactions;
    /* access modifiers changed from: private */
    public final Handler mainHandler;
    /* access modifiers changed from: private */
    public final ProductDataResponseListener productDataHandler;
    /* access modifiers changed from: private */
    public final PurchaseResponseListener purchaseHandler;
    /* access modifiers changed from: private */
    public final PurchaseUpdatesResponseListener purchaseUpdatesHandler;
    /* access modifiers changed from: private */
    public final PurchasingServiceProvider purchasingServiceProvider;
    private final ConcurrentLinkedQueue<C6798l> serviceRequests;
    /* access modifiers changed from: private */
    public final UserDataResponseListener userDataHandler;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AmazonBilling(android.content.Context r17, com.revenuecat.purchases.amazon.AmazonBackend r18, com.revenuecat.purchases.amazon.AmazonCache r19, boolean r20, android.os.Handler r21, com.revenuecat.purchases.PurchasesStateProvider r22, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker r23, com.revenuecat.purchases.amazon.PurchasingServiceProvider r24, com.revenuecat.purchases.amazon.listener.ProductDataResponseListener r25, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener r26, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener r27, com.revenuecat.purchases.amazon.listener.UserDataResponseListener r28, com.revenuecat.purchases.common.DateProvider r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r16 = this;
            r0 = r30
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x000d
            com.revenuecat.purchases.amazon.DefaultPurchasingServiceProvider r1 = new com.revenuecat.purchases.amazon.DefaultPurchasingServiceProvider
            r1.<init>()
            r10 = r1
            goto L_0x000f
        L_0x000d:
            r10 = r24
        L_0x000f:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x001c
            com.revenuecat.purchases.amazon.handler.ProductDataHandler r1 = new com.revenuecat.purchases.amazon.handler.ProductDataHandler
            r8 = r21
            r1.<init>(r10, r8)
            r11 = r1
            goto L_0x0020
        L_0x001c:
            r8 = r21
            r11 = r25
        L_0x0020:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x002d
            com.revenuecat.purchases.amazon.handler.PurchaseHandler r1 = new com.revenuecat.purchases.amazon.handler.PurchaseHandler
            r9 = r17
            r1.<init>(r10, r9)
            r12 = r1
            goto L_0x0031
        L_0x002d:
            r9 = r17
            r12 = r26
        L_0x0031:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x003c
            com.revenuecat.purchases.amazon.handler.PurchaseUpdatesHandler r1 = new com.revenuecat.purchases.amazon.handler.PurchaseUpdatesHandler
            r1.<init>(r10)
            r13 = r1
            goto L_0x003e
        L_0x003c:
            r13 = r27
        L_0x003e:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0050
            com.revenuecat.purchases.amazon.handler.UserDataHandler r1 = new com.revenuecat.purchases.amazon.handler.UserDataHandler
            r6 = 4
            r7 = 0
            r5 = 0
            r2 = r1
            r3 = r10
            r4 = r21
            r2.<init>(r3, r4, r5, r6, r7)
            r14 = r1
            goto L_0x0052
        L_0x0050:
            r14 = r28
        L_0x0052:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x005d
            com.revenuecat.purchases.common.DefaultDateProvider r0 = new com.revenuecat.purchases.common.DefaultDateProvider
            r0.<init>()
            r15 = r0
            goto L_0x005f
        L_0x005d:
            r15 = r29
        L_0x005f:
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.amazon.AmazonBilling.<init>(android.content.Context, com.revenuecat.purchases.amazon.AmazonBackend, com.revenuecat.purchases.amazon.AmazonCache, boolean, android.os.Handler, com.revenuecat.purchases.PurchasesStateProvider, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker, com.revenuecat.purchases.amazon.PurchasingServiceProvider, com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener, com.revenuecat.purchases.common.DateProvider, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final void executePendingRequests() {
        synchronized (this) {
            while (isConnected() && !this.serviceRequests.isEmpty()) {
                try {
                    runOnUIThread(new a(this.serviceRequests.remove()));
                } finally {
                }
            }
            C6514M m10 = C6514M.f71813a;
        }
    }

    /* access modifiers changed from: private */
    public static final void executePendingRequests$lambda$9$lambda$8(C6798l lVar) {
        lVar.invoke((Object) null);
    }

    private final synchronized void executeRequestOnUIThread(C6798l lVar) {
        try {
            if (getPurchasesUpdatedListener() != null) {
                this.serviceRequests.add(lVar);
                if (!isConnected()) {
                    BillingAbstract.startConnectionOnMainThread$default(this, 0, 1, (Object) null);
                } else {
                    executePendingRequests();
                }
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void getMissingSkusForReceipts(String str, List<Receipt> list, p pVar) {
        AmazonBilling amazonBilling = this;
        Map<String, String> receiptSkus = amazonBilling.cache.getReceiptSkus();
        Map B10 = O.B(receiptSkus);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterable iterable = list;
        ArrayList<Receipt> arrayList = new ArrayList<>();
        for (Object next : iterable) {
            if (((Receipt) next).getProductType() != ProductType.SUBSCRIPTION) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C6565s.y(arrayList, 10));
        for (Receipt receipt : arrayList) {
            arrayList2.add(C6502A.a(receipt.getReceiptId(), receipt.getSku()));
        }
        O.s(B10, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object next2 : iterable) {
            if (((Receipt) next2).getProductType() == ProductType.SUBSCRIPTION) {
                arrayList3.add(next2);
            }
        }
        ArrayList<Receipt> arrayList4 = new ArrayList<>();
        for (Object next3 : arrayList3) {
            if (!receiptSkus.containsKey(((Receipt) next3).getReceiptId())) {
                arrayList4.add(next3);
            }
        }
        if (arrayList4.isEmpty()) {
            pVar.invoke(B10, linkedHashMap);
            return;
        }
        p pVar2 = pVar;
        L l10 = new L();
        l10.f71757a = arrayList4.size();
        for (Receipt receipt2 : arrayList4) {
            AmazonBackend amazonBackend2 = amazonBilling.amazonBackend;
            String receiptId = receipt2.getReceiptId();
            C6496s.g(receiptId, "receipt.receiptId");
            p pVar3 = pVar;
            AmazonBilling$getMissingSkusForReceipts$1$1 amazonBilling$getMissingSkusForReceipts$1$1 = r0;
            AmazonBilling$getMissingSkusForReceipts$1$1 amazonBilling$getMissingSkusForReceipts$1$12 = new AmazonBilling$getMissingSkusForReceipts$1$1(B10, receipt2, l10, this, pVar3, linkedHashMap);
            amazonBackend2.getAmazonReceiptData(receiptId, str, amazonBilling$getMissingSkusForReceipts$1$1, new AmazonBilling$getMissingSkusForReceipts$1$2(linkedHashMap, receipt2, l10, pVar3, B10));
            amazonBilling = this;
        }
    }

    /* access modifiers changed from: private */
    public final String getTermSkuFromJSON(JSONObject jSONObject) {
        try {
            return jSONObject.getString(b.f37454L);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public final void handleReceipt(Receipt receipt, UserData userData, StoreProduct storeProduct, PresentedOfferingContext presentedOfferingContext) {
        if (receipt.getProductType() != ProductType.SUBSCRIPTION) {
            StoreTransaction storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(receipt, storeProduct.getId(), presentedOfferingContext, PurchaseState.PURCHASED, userData);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesUpdated(C6565s.e(storeTransaction));
                return;
            }
            return;
        }
        AmazonBackend amazonBackend2 = this.amazonBackend;
        String receiptId = receipt.getReceiptId();
        C6496s.g(receiptId, "receipt.receiptId");
        String userId = userData.getUserId();
        C6496s.g(userId, "userData.userId");
        amazonBackend2.getAmazonReceiptData(receiptId, userId, new AmazonBilling$handleReceipt$1(receipt, presentedOfferingContext, userData, this), new AmazonBilling$handleReceipt$2(this));
    }

    /* access modifiers changed from: private */
    public final void logErrorsIfAny(Map<String, PurchasesError> map) {
        if (!map.isEmpty()) {
            String x02 = C6565s.x0(map.keySet(), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null);
            LogIntent logIntent = LogIntent.AMAZON_ERROR;
            String format = String.format(AmazonStrings.ERROR_FETCHING_RECEIPTS, Arrays.copyOf(new Object[]{x02}, 1));
            C6496s.g(format, "format(this, *args)");
            LogWrapperKt.log(logIntent, format);
        }
    }

    /* access modifiers changed from: private */
    public final void onPurchaseError(PurchasesError purchasesError) {
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
        if (purchasesUpdatedListener != null) {
            purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesError);
        }
    }

    private final void runOnUIThread(Runnable runnable) {
        if (C6496s.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            runnable.run();
        } else {
            this.mainHandler.post(runnable);
        }
    }

    private final boolean shouldFinishTransactions() {
        if (this.finishTransactions) {
            return true;
        }
        LogWrapperKt.log(LogIntent.AMAZON_WARNING, AmazonStrings.WARNING_AMAZON_NOT_FINISHING_TRANSACTIONS);
        return false;
    }

    /* access modifiers changed from: private */
    public static final void startConnectionOnMainThread$lambda$0(AmazonBilling amazonBilling) {
        C6496s.h(amazonBilling, "this$0");
        amazonBilling.startConnection();
    }

    /* access modifiers changed from: private */
    public final Map<String, StoreTransaction> toMapOfReceiptHashesToRestoredPurchases(List<Receipt> list, Map<String, String> map, UserData userData) {
        ArrayList arrayList = new ArrayList();
        for (Receipt receipt : list) {
            String str = map.get(receipt.getReceiptId());
            Pair pair = null;
            if (str == null) {
                LogWrapperKt.log(LogIntent.AMAZON_ERROR, AmazonStrings.ERROR_FINDING_RECEIPT_SKU);
            } else {
                StoreTransaction storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(receipt, str, (PresentedOfferingContext) null, PurchaseState.UNSPECIFIED_STATE, userData);
                String receiptId = receipt.getReceiptId();
                C6496s.g(receiptId, "receipt.receiptId");
                pair = C6502A.a(UtilsKt.sha1(receiptId), storeTransaction);
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return O.w(arrayList);
    }

    /* access modifiers changed from: private */
    public final void trackAmazonQueryProductDetailsRequestIfNeeded(boolean z10, Date date) {
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.m52trackAmazonQueryProductDetailsRequestVtjQ1oo(DurationExtensionsKt.between(a.f65168b, date, this.dateProvider.getNow()), z10);
        }
    }

    /* access modifiers changed from: private */
    public final void trackAmazonQueryPurchasesRequestIfNeeded(boolean z10, Date date) {
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.m53trackAmazonQueryPurchasesRequestVtjQ1oo(DurationExtensionsKt.between(a.f65168b, date, this.dateProvider.getNow()), z10);
        }
    }

    public void consumeAndSave(boolean z10, StoreTransaction storeTransaction, boolean z11, PostReceiptInitiationSource postReceiptInitiationSource) {
        C6496s.h(storeTransaction, "purchase");
        C6496s.h(postReceiptInitiationSource, "initiationSource");
        if (shouldFinishTransactions() && storeTransaction.getType() != com.revenuecat.purchases.ProductType.UNKNOWN && storeTransaction.getPurchaseState() != PurchaseState.PENDING) {
            if (z10) {
                executeRequestOnUIThread(new AmazonBilling$consumeAndSave$1(this, storeTransaction));
            }
            this.cache.addSuccessfullyPostedToken(storeTransaction.getPurchaseToken());
        }
    }

    /* access modifiers changed from: protected */
    public void endConnection() {
    }

    public void findPurchaseInPurchaseHistory(String str, com.revenuecat.purchases.ProductType productType, String str2, C6798l lVar, C6798l lVar2) {
        C6496s.h(str, "appUserID");
        C6496s.h(productType, "productType");
        C6496s.h(str2, "productId");
        C6496s.h(lVar, "onCompletion");
        C6496s.h(lVar2, "onError");
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(RestoreStrings.QUERYING_PURCHASE_WITH_TYPE, Arrays.copyOf(new Object[]{str2, productType.name()}, 2));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        queryAllPurchases(str, new AmazonBilling$findPurchaseInPurchaseHistory$1(lVar, str2, lVar2), lVar2);
    }

    public void getAmazonLWAConsentStatus(C6798l lVar, C6798l lVar2) {
        C6496s.h(lVar, "onSuccess");
        C6496s.h(lVar2, "onError");
        executeRequestOnUIThread(new AmazonBilling$getAmazonLWAConsentStatus$1(this, lVar2, lVar));
    }

    public void getProductData(Set<String> set, String str, C6798l lVar, C6798l lVar2) {
        C6496s.h(set, b.f37457O);
        C6496s.h(str, b.f37490m);
        C6496s.h(lVar, "onReceive");
        C6496s.h(lVar2, "onError");
        this.productDataHandler.getProductData(set, str, lVar, lVar2);
    }

    public void getStorefront(C6798l lVar, C6798l lVar2) {
        C6496s.h(lVar, "onSuccess");
        C6496s.h(lVar2, "onError");
        executeRequestOnUIThread(new AmazonBilling$getStorefront$1(this, lVar2, lVar));
    }

    public void getUserData(C6798l lVar, C6798l lVar2) {
        C6496s.h(lVar, "onSuccess");
        C6496s.h(lVar2, "onError");
        this.userDataHandler.getUserData(lVar, lVar2);
    }

    public boolean isConnected() {
        return this.connected;
    }

    public void makePurchaseAsync(Activity activity, String str, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, PresentedOfferingContext presentedOfferingContext, Boolean bool) {
        AmazonPurchasingData.Product product;
        C6496s.h(activity, "activity");
        C6496s.h(str, "appUserID");
        C6496s.h(purchasingData, "purchasingData");
        if (purchasingData instanceof AmazonPurchasingData.Product) {
            product = (AmazonPurchasingData.Product) purchasingData;
        } else {
            product = null;
        }
        if (product == null) {
            PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.UnknownError;
            String format = String.format(PurchaseStrings.INVALID_PURCHASE_TYPE, Arrays.copyOf(new Object[]{"Amazon", "AmazonPurchaseInfo"}, 2));
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
        AmazonStoreProduct storeProduct = product.getStoreProduct();
        if (shouldFinishTransactions()) {
            if (replaceProductInfo != null) {
                LogWrapperKt.log(LogIntent.AMAZON_WARNING, AmazonStrings.PRODUCT_CHANGES_NOT_SUPPORTED);
            } else {
                executeRequestOnUIThread(new AmazonBilling$makePurchaseAsync$1(this, activity, str, storeProduct, presentedOfferingContext));
            }
        }
    }

    public void normalizePurchaseData(String str, String str2, String str3, C6798l lVar, C6798l lVar2) {
        C6496s.h(str, "productID");
        C6496s.h(str2, "purchaseToken");
        C6496s.h(str3, "storeUserID");
        C6496s.h(lVar, "onSuccess");
        C6496s.h(lVar2, "onError");
        String str4 = this.cache.getReceiptSkus().get(str2);
        if (str4 != null) {
            lVar.invoke(str4);
        } else {
            this.amazonBackend.getAmazonReceiptData(str2, str3, new AmazonBilling$normalizePurchaseData$2(this, lVar2, str2, lVar), new AmazonBilling$normalizePurchaseData$3(lVar2));
        }
    }

    public void onProductDataResponse(ProductDataResponse productDataResponse) {
        C6496s.h(productDataResponse, "response");
        if (shouldFinishTransactions()) {
            this.productDataHandler.onProductDataResponse(productDataResponse);
        }
    }

    public void onPurchaseResponse(PurchaseResponse purchaseResponse) {
        C6496s.h(purchaseResponse, "response");
        if (shouldFinishTransactions()) {
            this.purchaseHandler.onPurchaseResponse(purchaseResponse);
        }
    }

    public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
        C6496s.h(purchaseUpdatesResponse, "response");
        if (shouldFinishTransactions()) {
            this.purchaseUpdatesHandler.onPurchaseUpdatesResponse(purchaseUpdatesResponse);
        }
    }

    public void onUserDataResponse(UserDataResponse userDataResponse) {
        C6496s.h(userDataResponse, "response");
        if (shouldFinishTransactions()) {
            this.userDataHandler.onUserDataResponse(userDataResponse);
        }
    }

    public void purchase(Handler handler, Activity activity, String str, StoreProduct storeProduct, p pVar, C6798l lVar) {
        C6496s.h(handler, "mainHandler");
        C6496s.h(activity, "activity");
        C6496s.h(str, "appUserID");
        C6496s.h(storeProduct, "storeProduct");
        C6496s.h(pVar, "onSuccess");
        C6496s.h(lVar, "onError");
        this.purchaseHandler.purchase(handler, activity, str, storeProduct, pVar, lVar);
    }

    public void queryAllPurchases(String str, C6798l lVar, C6798l lVar2) {
        C6496s.h(str, "appUserID");
        C6496s.h(lVar, "onReceivePurchaseHistory");
        C6496s.h(lVar2, "onReceivePurchaseHistoryError");
        queryPurchases(false, (C6798l) new AmazonBilling$queryAllPurchases$1(lVar), lVar2);
    }

    public void queryProductDetailsAsync(com.revenuecat.purchases.ProductType productType, Set<String> set, C6798l lVar, C6798l lVar2) {
        C6496s.h(productType, "productType");
        C6496s.h(set, "productIds");
        C6496s.h(lVar, "onReceive");
        C6496s.h(lVar2, "onError");
        if (shouldFinishTransactions()) {
            executeRequestOnUIThread(new AmazonBilling$queryProductDetailsAsync$1(this, lVar2, set, lVar));
        }
    }

    public void queryPurchases(p pVar, C6798l lVar) {
        C6496s.h(pVar, "onSuccess");
        C6496s.h(lVar, "onError");
        this.purchaseUpdatesHandler.queryPurchases(pVar, lVar);
    }

    public void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> list, C6787a aVar) {
        C6496s.h(activity, "activity");
        C6496s.h(list, "inAppMessageTypes");
        C6496s.h(aVar, "subscriptionStatusChange");
    }

    public void startConnection() {
        if (shouldFinishTransactions()) {
            this.purchasingServiceProvider.registerListener(this.applicationContext, this);
            this.connected = true;
            BillingAbstract.StateListener stateListener = getStateListener();
            if (stateListener != null) {
                stateListener.onConnected();
            }
            executePendingRequests();
        }
    }

    public void startConnectionOnMainThread(long j10) {
        runOnUIThread(new b(this));
    }

    public void queryPurchases(String str, C6798l lVar, C6798l lVar2) {
        C6496s.h(str, "appUserID");
        C6496s.h(lVar, "onSuccess");
        C6496s.h(lVar2, "onError");
        if (shouldFinishTransactions()) {
            queryPurchases(true, lVar, lVar2);
        }
    }

    private final void queryPurchases(boolean z10, C6798l lVar, C6798l lVar2) {
        executeRequestOnUIThread(new AmazonBilling$queryPurchases$1(this, lVar2, z10, lVar));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AmazonBilling(Context context, AmazonBackend amazonBackend2, AmazonCache amazonCache, boolean z10, Handler handler, PurchasesStateProvider purchasesStateProvider, DiagnosticsTracker diagnosticsTracker, PurchasingServiceProvider purchasingServiceProvider2, ProductDataResponseListener productDataResponseListener, PurchaseResponseListener purchaseResponseListener, PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, UserDataResponseListener userDataResponseListener, DateProvider dateProvider2) {
        super(purchasesStateProvider);
        C6496s.h(context, "applicationContext");
        C6496s.h(amazonBackend2, "amazonBackend");
        C6496s.h(amazonCache, "cache");
        C6496s.h(handler, "mainHandler");
        C6496s.h(purchasesStateProvider, "stateProvider");
        C6496s.h(purchasingServiceProvider2, "purchasingServiceProvider");
        C6496s.h(productDataResponseListener, "productDataHandler");
        C6496s.h(purchaseResponseListener, "purchaseHandler");
        C6496s.h(purchaseUpdatesResponseListener, "purchaseUpdatesHandler");
        C6496s.h(userDataResponseListener, "userDataHandler");
        C6496s.h(dateProvider2, "dateProvider");
        this.applicationContext = context;
        this.amazonBackend = amazonBackend2;
        this.cache = amazonCache;
        this.finishTransactions = z10;
        this.mainHandler = handler;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.purchasingServiceProvider = purchasingServiceProvider2;
        this.productDataHandler = productDataResponseListener;
        this.purchaseHandler = purchaseResponseListener;
        this.purchaseUpdatesHandler = purchaseUpdatesResponseListener;
        this.userDataHandler = userDataResponseListener;
        this.dateProvider = dateProvider2;
        this.serviceRequests = new ConcurrentLinkedQueue<>();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AmazonBilling(android.content.Context r20, com.revenuecat.purchases.common.caching.DeviceCache r21, boolean r22, android.os.Handler r23, com.revenuecat.purchases.common.BackendHelper r24, com.revenuecat.purchases.PurchasesStateProvider r25, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker r26) {
        /*
            r19 = this;
            r0 = r21
            r1 = r24
            java.lang.String r2 = "applicationContext"
            r4 = r20
            kotlin.jvm.internal.C6496s.h(r4, r2)
            java.lang.String r2 = "cache"
            kotlin.jvm.internal.C6496s.h(r0, r2)
            java.lang.String r2 = "mainHandler"
            r8 = r23
            kotlin.jvm.internal.C6496s.h(r8, r2)
            java.lang.String r2 = "backendHelper"
            kotlin.jvm.internal.C6496s.h(r1, r2)
            java.lang.String r2 = "stateProvider"
            r9 = r25
            kotlin.jvm.internal.C6496s.h(r9, r2)
            com.revenuecat.purchases.amazon.AmazonBackend r5 = new com.revenuecat.purchases.amazon.AmazonBackend
            r5.<init>(r1)
            com.revenuecat.purchases.amazon.AmazonCache r6 = new com.revenuecat.purchases.amazon.AmazonCache
            r6.<init>(r0)
            r17 = 8064(0x1f80, float:1.13E-41)
            r18 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r3 = r19
            r7 = r22
            r10 = r26
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.amazon.AmazonBilling.<init>(android.content.Context, com.revenuecat.purchases.common.caching.DeviceCache, boolean, android.os.Handler, com.revenuecat.purchases.common.BackendHelper, com.revenuecat.purchases.PurchasesStateProvider, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker):void");
    }
}
