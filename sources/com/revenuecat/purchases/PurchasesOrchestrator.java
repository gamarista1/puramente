package com.revenuecat.purchases;

import Tg.a;
import Tg.c;
import Tg.d;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.lifecycle.J;
import com.android.billingclient.api.C3194a;
import com.android.billingclient.api.C3198e;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer;
import com.revenuecat.purchases.common.events.EventsManager;
import com.revenuecat.purchases.common.events.FeatureEvent;
import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.deeplinks.WebPurchaseRedemptionHelper;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.interfaces.GetAmazonLWAConsentStatusCallback;
import com.revenuecat.purchases.interfaces.GetCustomerCenterConfigCallback;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.interfaces.LogInCallback;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.interfaces.PurchaseErrorCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener;
import com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback;
import com.revenuecat.purchases.interfaces.SyncPurchasesCallback;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.models.BillingFeature;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.paywalls.PaywallPresentedCache;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.strings.ConfigureStrings;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import com.revenuecat.purchases.strings.IdentityStrings;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import com.revenuecat.purchases.strings.SyncAttributesAndOfferingsStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.utils.AndroidVersionUtilsKt;
import com.revenuecat.purchases.utils.CustomActivityLifecycleHandler;
import com.revenuecat.purchases.utils.RateLimiter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import lf.C6502A;
import lf.C6514M;
import lf.C6531o;
import mf.C6559l;
import mf.C6565s;
import mf.O;
import mf.Y;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000Ê\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\bV\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 ½\u00022\u00020\u00012\u00020\u0002:\u0002½\u0002BÓ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\b\b\u0002\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u001d\u00108\u001a\u0002062\f\u00107\u001a\b\u0012\u0004\u0012\u00020605H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020:2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=JA\u0010G\u001a\u0002062\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00050>2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0>2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020C0B2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bG\u0010HJ#\u0010L\u001a\u0002062\u0006\u0010I\u001a\u00020\u00052\n\b\u0002\u0010K\u001a\u0004\u0018\u00010JH\u0002¢\u0006\u0004\bL\u0010MJ\u001d\u0010O\u001a\u0002062\f\u0010N\u001a\b\u0012\u0004\u0012\u00020605H\u0002¢\u0006\u0004\bO\u00109J\u0019\u0010R\u001a\u0004\u0018\u00010Q2\u0006\u0010P\u001a\u00020\u0005H\u0002¢\u0006\u0004\bR\u0010SJ\u0011\u0010U\u001a\u0004\u0018\u00010TH\u0002¢\u0006\u0004\bU\u0010VJ\u000f\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\bX\u0010YJ\u0015\u0010Z\u001a\b\u0012\u0004\u0012\u00020Q0BH\u0002¢\u0006\u0004\bZ\u0010[JG\u0010c\u001a:\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u0002060]j\u0002``\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u0002060]j\u0002`b0\\H\u0002¢\u0006\u0004\bc\u0010dJQ\u0010f\u001a:\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u0002060]j\u0002``\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u0002060]j\u0002`b0\\2\b\u0010e\u001a\u0004\u0018\u00010TH\u0002¢\u0006\u0004\bf\u0010gJ\u001b\u0010O\u001a\u000206*\u00020h2\u0006\u0010i\u001a\u00020aH\u0002¢\u0006\u0004\bO\u0010jJU\u0010v\u001a\u0002062\u0006\u0010l\u001a\u00020k2\u0006\u0010m\u001a\u00020\u00052\b\u0010o\u001a\u0004\u0018\u00010n2\u0006\u0010q\u001a\u00020p2\u0006\u0010I\u001a\u00020\u00052\b\u0010s\u001a\u0004\u0018\u00010r2\b\u0010t\u001a\u0004\u0018\u00010:2\u0006\u0010u\u001a\u00020hH\u0002¢\u0006\u0004\bv\u0010wJ\u000f\u0010x\u001a\u000206H\u0002¢\u0006\u0004\bx\u0010yJ\u000f\u0010z\u001a\u000206H\u0002¢\u0006\u0004\bz\u0010yJ\u000f\u0010{\u001a\u000206H\u0016¢\u0006\u0004\b{\u0010yJ\u000f\u0010|\u001a\u000206H\u0016¢\u0006\u0004\b|\u0010yJ\u0017\u0010}\u001a\u0002062\u0006\u0010q\u001a\u00020pH\u0016¢\u0006\u0004\b}\u0010~J\"\u0010\u0001\u001a\u0002062\u0007\u0010\u0001\u001a\u000202\u0007\u0010u\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\u0019\u0010\u0001\u001a\u0002062\u0007\u0010F\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\u001d\u0010\u0001\u001a\u0002062\u000b\b\u0002\u0010u\u001a\u0005\u0018\u00010\u0001¢\u0006\u0006\b\u0001\u0010\u0001JB\u0010\u0001\u001a\u0002062\u0007\u0010\u0001\u001a\u00020\u00052\u0007\u0010\u0001\u001a\u00020\u00052\u0007\u0010\u0001\u001a\u00020\u00052\t\u0010\u0001\u001a\u0004\u0018\u00010\u00052\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\u0019\u0010\u0001\u001a\u0002062\u0007\u0010F\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001J$\u0010\u0001\u001a\u0002062\u0007\u0010u\u001a\u00030\u00012\t\b\u0002\u0010\u0001\u001a\u00020:¢\u0006\u0006\b\u0001\u0010\u0001J3\u0010\u0001\u001a\u0002062\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00050B2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010@2\u0006\u0010F\u001a\u00020E¢\u0006\u0006\b\u0001\u0010\u0001J\"\u0010\u0001\u001a\u0002062\b\u0010\u0001\u001a\u00030\u00012\u0006\u0010F\u001a\u00020Q¢\u0006\u0006\b\u0001\u0010\u0001J\u0018\u0010 \u0001\u001a\u0002062\u0006\u0010F\u001a\u00020J¢\u0006\u0006\b \u0001\u0010¡\u0001J&\u0010¤\u0001\u001a\u0002062\u0007\u0010¢\u0001\u001a\u00020\u00052\u000b\b\u0002\u0010F\u001a\u0005\u0018\u00010£\u0001¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u001c\u0010¦\u0001\u001a\u0002062\n\b\u0002\u0010F\u001a\u0004\u0018\u00010J¢\u0006\u0006\b¦\u0001\u0010¡\u0001J\u000f\u0010§\u0001\u001a\u000206¢\u0006\u0005\b§\u0001\u0010yJ\u0018\u0010¨\u0001\u001a\u0002062\u0006\u0010F\u001a\u00020J¢\u0006\u0006\b¨\u0001\u0010¡\u0001J\"\u0010¨\u0001\u001a\u0002062\b\u0010ª\u0001\u001a\u00030©\u00012\u0006\u0010F\u001a\u00020J¢\u0006\u0006\b¨\u0001\u0010«\u0001J\u000f\u0010¬\u0001\u001a\u000206¢\u0006\u0005\b¬\u0001\u0010yJ(\u0010¯\u0001\u001a\u0002062\u0006\u0010q\u001a\u00020p2\u000e\u0010®\u0001\u001a\t\u0012\u0005\u0012\u00030­\u00010B¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u000f\u0010±\u0001\u001a\u000206¢\u0006\u0005\b±\u0001\u0010yJ2\u0010G\u001a\u0002062\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00050>2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0>2\u0006\u0010F\u001a\u00020E¢\u0006\u0005\bG\u0010²\u0001J\u001c\u0010µ\u0001\u001a\u0002062\b\u0010´\u0001\u001a\u00030³\u0001H\u0007¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\u0019\u0010¸\u0001\u001a\u0002062\u0007\u0010F\u001a\u00030·\u0001¢\u0006\u0006\b¸\u0001\u0010¹\u0001J(\u0010¼\u0001\u001a\u0002062\u0016\u0010»\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050º\u0001¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u001b\u0010¿\u0001\u001a\u0002062\t\u0010¾\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b¿\u0001\u0010À\u0001J\u001b\u0010Â\u0001\u001a\u0002062\t\u0010Á\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bÂ\u0001\u0010À\u0001J\u001b\u0010Ä\u0001\u001a\u0002062\t\u0010Ã\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bÄ\u0001\u0010À\u0001J\u001b\u0010Æ\u0001\u001a\u0002062\t\u0010Å\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bÆ\u0001\u0010À\u0001J\u001b\u0010È\u0001\u001a\u0002062\t\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bÈ\u0001\u0010À\u0001J\u001b\u0010Ê\u0001\u001a\u0002062\t\u0010É\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bÊ\u0001\u0010À\u0001J\u001b\u0010Ì\u0001\u001a\u0002062\t\u0010Ë\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bÌ\u0001\u0010À\u0001J\u001b\u0010Î\u0001\u001a\u0002062\t\u0010Í\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bÎ\u0001\u0010À\u0001J\u001b\u0010Ð\u0001\u001a\u0002062\t\u0010Ï\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bÐ\u0001\u0010À\u0001J\u001b\u0010Ò\u0001\u001a\u0002062\t\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bÒ\u0001\u0010À\u0001J\u000f\u0010Ó\u0001\u001a\u000206¢\u0006\u0005\bÓ\u0001\u0010yJ\u001b\u0010Õ\u0001\u001a\u0002062\t\u0010Ô\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bÕ\u0001\u0010À\u0001J\u001b\u0010×\u0001\u001a\u0002062\t\u0010Ö\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b×\u0001\u0010À\u0001J\u001b\u0010Ù\u0001\u001a\u0002062\t\u0010Ø\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bÙ\u0001\u0010À\u0001J\u001b\u0010Û\u0001\u001a\u0002062\t\u0010Ú\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bÛ\u0001\u0010À\u0001J\u001b\u0010Ý\u0001\u001a\u0002062\t\u0010Ü\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bÝ\u0001\u0010À\u0001J\u001b\u0010ß\u0001\u001a\u0002062\t\u0010Þ\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bß\u0001\u0010À\u0001J\u001b\u0010á\u0001\u001a\u0002062\t\u0010à\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bá\u0001\u0010À\u0001J\u001b\u0010ã\u0001\u001a\u0002062\t\u0010â\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bã\u0001\u0010À\u0001J\u001b\u0010å\u0001\u001a\u0002062\t\u0010ä\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bå\u0001\u0010À\u0001J\u001b\u0010ç\u0001\u001a\u0002062\t\u0010æ\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bç\u0001\u0010À\u0001J\u001b\u0010é\u0001\u001a\u0002062\t\u0010è\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bé\u0001\u0010À\u0001J\u001b\u0010ë\u0001\u001a\u0002062\t\u0010ê\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bë\u0001\u0010À\u0001J\u0019\u0010ì\u0001\u001a\u0002062\u0007\u0010¢\u0001\u001a\u00020\u0005¢\u0006\u0006\bì\u0001\u0010À\u0001J<\u0010í\u0001\u001a\u0002062\u0006\u0010q\u001a\u00020p2\u0006\u0010l\u001a\u00020k2\b\u0010s\u001a\u0004\u0018\u00010r2\b\u0010t\u001a\u0004\u0018\u00010:2\u0006\u0010u\u001a\u00020Q¢\u0006\u0006\bí\u0001\u0010î\u0001JM\u0010ð\u0001\u001a\u0002062\u0006\u0010q\u001a\u00020p2\u0006\u0010l\u001a\u00020k2\b\u0010s\u001a\u0004\u0018\u00010r2\u0006\u0010m\u001a\u00020\u00052\u0006\u0010o\u001a\u00020n2\b\u0010t\u001a\u0004\u0018\u00010:2\u0007\u0010ï\u0001\u001a\u00020Q¢\u0006\u0006\bð\u0001\u0010ñ\u0001JD\u0010ò\u0001\u001a\u0002062\u0006\u0010q\u001a\u00020p2\u0006\u0010l\u001a\u00020k2\b\u0010s\u001a\u0004\u0018\u00010r2\u0006\u0010m\u001a\u00020\u00052\b\u0010o\u001a\u0004\u0018\u00010n2\u0006\u0010u\u001a\u00020T¢\u0006\u0006\bò\u0001\u0010ó\u0001R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010ô\u0001R\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0007\n\u0005\b\b\u0010õ\u0001R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0007\n\u0005\b\n\u0010ö\u0001R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0007\n\u0005\b\f\u0010÷\u0001R\u0015\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010ø\u0001R\u0015\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010ù\u0001R'\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0017\n\u0005\b\u0012\u0010ú\u0001\u001a\u0006\bû\u0001\u0010ü\u0001\"\u0006\bý\u0001\u0010þ\u0001R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010ÿ\u0001R\u0015\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010\u0002R\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010\u0002R\u001a\u0010\u001a\u001a\u00020\u00198\u0007¢\u0006\u000f\n\u0005\b\u001a\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002R\u0015\u0010\u001c\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u001c\u0010\u0002R\u0015\u0010\u001e\u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u001e\u0010\u0002R\u0015\u0010 \u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0007\n\u0005\b \u0010\u0002R\u0015\u0010\"\u001a\u00020!8\u0002X\u0004¢\u0006\u0007\n\u0005\b\"\u0010\u0002R\u0015\u0010$\u001a\u00020#8\u0002X\u0004¢\u0006\u0007\n\u0005\b$\u0010\u0002R\u0017\u0010&\u001a\u0004\u0018\u00010%8\u0002X\u0004¢\u0006\u0007\n\u0005\b&\u0010\u0002R\u0015\u0010(\u001a\u00020'8\u0002X\u0004¢\u0006\u0007\n\u0005\b(\u0010\u0002R\u0015\u0010*\u001a\u00020)8\u0002X\u0004¢\u0006\u0007\n\u0005\b*\u0010\u0002R\u0017\u0010,\u001a\u0004\u0018\u00010+8\u0002X\u0004¢\u0006\u0007\n\u0005\b,\u0010\u0002R\u0015\u0010.\u001a\u00020-8\u0002X\u0004¢\u0006\u0007\n\u0005\b.\u0010\u0002R\u0015\u00100\u001a\u00020/8\u0002X\u0004¢\u0006\u0007\n\u0005\b0\u0010\u0002R\u0015\u00102\u001a\u0002018\u0002X\u0004¢\u0006\u0007\n\u0005\b2\u0010\u0002R!\u0010\u0002\u001a\u00030\u00028BX\u0002¢\u0006\u0010\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002R\u0018\u0010\u0002\u001a\u00030\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R.\u0010\u0002\u001a\u0004\u0018\u00010\u00052\t\u0010\u0002\u001a\u0004\u0018\u00010\u00058\u0006@BX\u000e¢\u0006\u0010\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002R,\u0010¥\u0002\u001a\u00030\u00022\b\u0010 \u0002\u001a\u00030\u00028@@@X\u000e¢\u0006\u0010\u001a\u0006\b¡\u0002\u0010¢\u0002\"\u0006\b£\u0002\u0010¤\u0002R\u0014\u0010¨\u0002\u001a\u00020/8F¢\u0006\b\u001a\u0006\b¦\u0002\u0010§\u0002R*\u0010­\u0002\u001a\u00020:2\u0007\u0010 \u0002\u001a\u00020:8F@FX\u000e¢\u0006\u0010\u001a\u0006\b©\u0002\u0010ª\u0002\"\u0006\b«\u0002\u0010¬\u0002R\u0013\u0010I\u001a\u00020\u00058F¢\u0006\b\u001a\u0006\b®\u0002\u0010\u0002R0\u0010´\u0002\u001a\u0005\u0018\u00010¯\u00022\n\u0010 \u0002\u001a\u0005\u0018\u00010¯\u00028F@FX\u000e¢\u0006\u0010\u001a\u0006\b°\u0002\u0010±\u0002\"\u0006\b²\u0002\u0010³\u0002R\u0014\u0010µ\u0002\u001a\u00020:8F¢\u0006\b\u001a\u0006\bµ\u0002\u0010ª\u0002R\u0015\u0010¹\u0002\u001a\u00030¶\u00028F¢\u0006\b\u001a\u0006\b·\u0002\u0010¸\u0002R*\u0010¼\u0002\u001a\u00020:2\u0007\u0010 \u0002\u001a\u00020:8F@FX\u000e¢\u0006\u0010\u001a\u0006\bº\u0002\u0010ª\u0002\"\u0006\b»\u0002\u0010¬\u0002¨\u0006¾\u0002"}, d2 = {"Lcom/revenuecat/purchases/PurchasesOrchestrator;", "Lcom/revenuecat/purchases/LifecycleDelegate;", "Lcom/revenuecat/purchases/utils/CustomActivityLifecycleHandler;", "Landroid/app/Application;", "application", "", "backingFieldAppUserID", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "subscriberAttributesManager", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/CustomerInfoHelper;", "customerInfoHelper", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "customerInfoUpdateHandler", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsSynchronizer;", "diagnosticsSynchronizer", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/PostReceiptHelper;", "postReceiptHelper", "Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;", "postTransactionWithProductDetailsHelper", "Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "postPendingTransactionsHelper", "Lcom/revenuecat/purchases/SyncPurchasesHelper;", "syncPurchasesHelper", "Lcom/revenuecat/purchases/common/offerings/OfferingsManager;", "offeringsManager", "Lcom/revenuecat/purchases/common/events/EventsManager;", "eventsManager", "Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;", "paywallPresentedCache", "Lcom/revenuecat/purchases/PurchasesStateCache;", "purchasesStateCache", "Landroid/os/Handler;", "mainHandler", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "Lcom/revenuecat/purchases/PurchasesConfiguration;", "initialConfiguration", "Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper;", "webPurchaseRedemptionHelper", "<init>", "(Landroid/app/Application;Ljava/lang/String;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/CustomerInfoHelper;Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsSynchronizer;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/PostReceiptHelper;Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;Lcom/revenuecat/purchases/PostPendingTransactionsHelper;Lcom/revenuecat/purchases/SyncPurchasesHelper;Lcom/revenuecat/purchases/common/offerings/OfferingsManager;Lcom/revenuecat/purchases/common/events/EventsManager;Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;Lcom/revenuecat/purchases/PurchasesStateCache;Landroid/os/Handler;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/PurchasesConfiguration;Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper;)V", "Lkotlin/Function0;", "Llf/M;", "command", "enqueue", "(Lyf/a;)V", "", "firstTimeInForeground", "shouldRefreshCustomerInfo", "(Z)Z", "", "productIds", "Lcom/revenuecat/purchases/ProductType;", "types", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "collectedStoreProducts", "Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;", "callback", "getProductsOfTypes", "(Ljava/util/Set;Ljava/util/Set;Ljava/util/List;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V", "appUserID", "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "completion", "updateAllCaches", "(Ljava/lang/String;Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "action", "dispatch", "productId", "Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "getPurchaseCallback", "(Ljava/lang/String;)Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "getAndClearProductChangeCallback", "()Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;", "getPurchasesUpdatedListener", "()Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;", "getAndClearAllPurchaseCallbacks", "()Ljava/util/List;", "Landroid/util/Pair;", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/models/StoreTransaction;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lcom/revenuecat/purchases/SuccessfulPurchaseCallback;", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/ErrorPurchaseCallback;", "getPurchaseCompletedCallbacks", "()Landroid/util/Pair;", "productChangeListener", "getProductChangeCompletedCallbacks", "(Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;)Landroid/util/Pair;", "Lcom/revenuecat/purchases/interfaces/PurchaseErrorCallback;", "error", "(Lcom/revenuecat/purchases/interfaces/PurchaseErrorCallback;Lcom/revenuecat/purchases/PurchasesError;)V", "Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "oldProductId", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "googleReplacementMode", "Landroid/app/Activity;", "activity", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "isPersonalizedPrice", "listener", "replaceOldPurchaseWithNewProduct", "(Lcom/revenuecat/purchases/models/PurchasingData;Ljava/lang/String;Lcom/revenuecat/purchases/models/GoogleReplacementMode;Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Boolean;Lcom/revenuecat/purchases/interfaces/PurchaseErrorCallback;)V", "synchronizeSubscriberAttributesIfNeeded", "()V", "flushPaywallEvents", "onAppBackgrounded", "onAppForegrounded", "onActivityStarted", "(Landroid/app/Activity;)V", "Lcom/revenuecat/purchases/WebPurchaseRedemption;", "webPurchaseRedemption", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;", "redeemWebPurchase", "(Lcom/revenuecat/purchases/WebPurchaseRedemption;Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;)V", "Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;", "syncAttributesAndOfferingsIfNeeded", "(Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;)V", "Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;", "syncPurchases", "(Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;)V", "productID", "receiptID", "amazonUserID", "isoCurrencyCode", "", "price", "syncAmazonPurchase", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "Lcom/revenuecat/purchases/interfaces/GetAmazonLWAConsentStatusCallback;", "getAmazonLWAConsentStatus", "(Lcom/revenuecat/purchases/interfaces/GetAmazonLWAConsentStatusCallback;)V", "Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;", "fetchCurrent", "getOfferings", "(Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;Z)V", "type", "getProducts", "(Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V", "Lcom/revenuecat/purchases/PurchaseParams;", "purchaseParams", "purchase", "(Lcom/revenuecat/purchases/PurchaseParams;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V", "restorePurchases", "(Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "newAppUserID", "Lcom/revenuecat/purchases/interfaces/LogInCallback;", "logIn", "(Ljava/lang/String;Lcom/revenuecat/purchases/interfaces/LogInCallback;)V", "logOut", "close", "getCustomerInfo", "Lcom/revenuecat/purchases/CacheFetchPolicy;", "fetchPolicy", "(Lcom/revenuecat/purchases/CacheFetchPolicy;Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "removeUpdatedCustomerInfoListener", "Lcom/revenuecat/purchases/models/InAppMessageType;", "inAppMessageTypes", "showInAppMessagesIfNeeded", "(Landroid/app/Activity;Ljava/util/List;)V", "invalidateCustomerInfoCache", "(Ljava/util/Set;Ljava/util/Set;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V", "Lcom/revenuecat/purchases/common/events/FeatureEvent;", "event", "track", "(Lcom/revenuecat/purchases/common/events/FeatureEvent;)V", "Lcom/revenuecat/purchases/interfaces/GetCustomerCenterConfigCallback;", "getCustomerCenterConfig", "(Lcom/revenuecat/purchases/interfaces/GetCustomerCenterConfigCallback;)V", "", "attributes", "setAttributes", "(Ljava/util/Map;)V", "email", "setEmail", "(Ljava/lang/String;)V", "phoneNumber", "setPhoneNumber", "displayName", "setDisplayName", "fcmToken", "setPushToken", "mixpanelDistinctID", "setMixpanelDistinctID", "onesignalID", "setOnesignalID", "onesignalUserID", "setOnesignalUserID", "airshipChannelID", "setAirshipChannelID", "firebaseAppInstanceID", "setFirebaseAppInstanceID", "tenjinAnalyticsInstallationID", "setTenjinAnalyticsInstallationID", "collectDeviceIdentifiers", "adjustID", "setAdjustID", "appsflyerID", "setAppsflyerID", "fbAnonymousID", "setFBAnonymousID", "mparticleID", "setMparticleID", "cleverTapID", "setCleverTapID", "kochavaDeviceID", "setKochavaDeviceID", "mediaSource", "setMediaSource", "campaign", "setCampaign", "adGroup", "setAdGroup", "ad", "setAd", "keyword", "setKeyword", "creative", "setCreative", "switchUser", "startPurchase", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Boolean;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V", "purchaseCallback", "startProductChange", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/String;Lcom/revenuecat/purchases/models/GoogleReplacementMode;Ljava/lang/Boolean;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V", "startDeprecatedProductChange", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/String;Lcom/revenuecat/purchases/models/GoogleReplacementMode;Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;)V", "Landroid/app/Application;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "Lcom/revenuecat/purchases/common/AppConfig;", "getAppConfig", "()Lcom/revenuecat/purchases/common/AppConfig;", "setAppConfig", "(Lcom/revenuecat/purchases/common/AppConfig;)V", "Lcom/revenuecat/purchases/CustomerInfoHelper;", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsSynchronizer;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "getOfflineEntitlementsManager", "()Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/PostReceiptHelper;", "Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;", "Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "Lcom/revenuecat/purchases/SyncPurchasesHelper;", "Lcom/revenuecat/purchases/common/offerings/OfferingsManager;", "Lcom/revenuecat/purchases/common/events/EventsManager;", "Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;", "Lcom/revenuecat/purchases/PurchasesStateCache;", "Landroid/os/Handler;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Lcom/revenuecat/purchases/PurchasesConfiguration;", "Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper;", "Lcom/revenuecat/purchases/AppLifecycleHandler;", "lifecycleHandler$delegate", "Lkotlin/Lazy;", "getLifecycleHandler", "()Lcom/revenuecat/purchases/AppLifecycleHandler;", "lifecycleHandler", "Lcom/revenuecat/purchases/utils/RateLimiter;", "lastSyncAttributesAndOfferingsRateLimiter", "Lcom/revenuecat/purchases/utils/RateLimiter;", "<set-?>", "storefrontCountryCode", "Ljava/lang/String;", "getStorefrontCountryCode", "()Ljava/lang/String;", "Lcom/revenuecat/purchases/PurchasesState;", "value", "getState$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/PurchasesState;", "setState$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/PurchasesState;)V", "state", "getCurrentConfiguration", "()Lcom/revenuecat/purchases/PurchasesConfiguration;", "currentConfiguration", "getFinishTransactions", "()Z", "setFinishTransactions", "(Z)V", "finishTransactions", "getAppUserID", "Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "getUpdatedCustomerInfoListener", "()Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "setUpdatedCustomerInfoListener", "(Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;)V", "updatedCustomerInfoListener", "isAnonymous", "Lcom/revenuecat/purchases/Store;", "getStore", "()Lcom/revenuecat/purchases/Store;", "store", "getAllowSharingPlayStoreAccount", "setAllowSharingPlayStoreAccount", "allowSharingPlayStoreAccount", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PurchasesOrchestrator implements LifecycleDelegate, CustomActivityLifecycleHandler {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String frameworkVersion = "8.12.2";
    /* access modifiers changed from: private */
    public static PlatformInfo platformInfo = new PlatformInfo("native", (String) null);
    /* access modifiers changed from: private */
    public static URL proxyURL;
    private AppConfig appConfig;
    /* access modifiers changed from: private */
    public final Application application;
    private final Backend backend;
    /* access modifiers changed from: private */
    public final BillingAbstract billing;
    /* access modifiers changed from: private */
    public final CustomerInfoHelper customerInfoHelper;
    /* access modifiers changed from: private */
    public final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final DeviceCache deviceCache;
    /* access modifiers changed from: private */
    public final DiagnosticsSynchronizer diagnosticsSynchronizer;
    private final Dispatcher dispatcher;
    private final EventsManager eventsManager;
    /* access modifiers changed from: private */
    public final IdentityManager identityManager;
    private final PurchasesConfiguration initialConfiguration;
    private final RateLimiter lastSyncAttributesAndOfferingsRateLimiter;
    private final Lazy lifecycleHandler$delegate;
    private final Handler mainHandler;
    /* access modifiers changed from: private */
    public final OfferingsManager offeringsManager;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final PaywallPresentedCache paywallPresentedCache;
    /* access modifiers changed from: private */
    public final PostPendingTransactionsHelper postPendingTransactionsHelper;
    /* access modifiers changed from: private */
    public final PostReceiptHelper postReceiptHelper;
    /* access modifiers changed from: private */
    public final PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper;
    private final PurchasesStateCache purchasesStateCache;
    /* access modifiers changed from: private */
    public String storefrontCountryCode;
    private final SubscriberAttributesManager subscriberAttributesManager;
    private final SyncPurchasesHelper syncPurchasesHelper;
    private final WebPurchaseRedemptionHelper webPurchaseRedemptionHelper;

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n8F@FX\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010!\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u001c8F@FX\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010'\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\"8F@FX\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0006XT¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/revenuecat/purchases/PurchasesOrchestrator$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "Lcom/revenuecat/purchases/models/BillingFeature;", "features", "Lcom/revenuecat/purchases/interfaces/Callback;", "", "callback", "Llf/M;", "canMakePayments", "(Landroid/content/Context;Ljava/util/List;Lcom/revenuecat/purchases/interfaces/Callback;)V", "Lcom/revenuecat/purchases/common/PlatformInfo;", "platformInfo", "Lcom/revenuecat/purchases/common/PlatformInfo;", "getPlatformInfo", "()Lcom/revenuecat/purchases/common/PlatformInfo;", "setPlatformInfo", "(Lcom/revenuecat/purchases/common/PlatformInfo;)V", "value", "getDebugLogsEnabled", "()Z", "setDebugLogsEnabled", "(Z)V", "debugLogsEnabled", "Lcom/revenuecat/purchases/LogLevel;", "getLogLevel", "()Lcom/revenuecat/purchases/LogLevel;", "setLogLevel", "(Lcom/revenuecat/purchases/LogLevel;)V", "logLevel", "Lcom/revenuecat/purchases/LogHandler;", "getLogHandler", "()Lcom/revenuecat/purchases/LogHandler;", "setLogHandler", "(Lcom/revenuecat/purchases/LogHandler;)V", "logHandler", "Ljava/net/URL;", "proxyURL", "Ljava/net/URL;", "getProxyURL", "()Ljava/net/URL;", "setProxyURL", "(Ljava/net/URL;)V", "", "frameworkVersion", "Ljava/lang/String;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void canMakePayments$default(Companion companion, Context context, List list, Callback callback, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                list = C6565s.n();
            }
            companion.canMakePayments(context, list, callback);
        }

        /* access modifiers changed from: private */
        public static final void canMakePayments$lambda$0(C3198e eVar, List list) {
            C6496s.h(eVar, "<anonymous parameter 0>");
        }

        public final void canMakePayments(Context context, List<? extends BillingFeature> list, Callback<Boolean> callback) {
            C6496s.h(context, "context");
            C6496s.h(list, "features");
            C6496s.h(callback, "callback");
            C3194a a10 = C3194a.h(context).b().d(new g()).a();
            a10.m(new PurchasesOrchestrator$Companion$canMakePayments$2$1(new Handler(context.getMainLooper()), new AtomicBoolean(false), callback, a10, list));
        }

        public final boolean getDebugLogsEnabled() {
            return LogUtilsKt.getDebugLogsEnabled(getLogLevel());
        }

        public final synchronized LogHandler getLogHandler() {
            return LogWrapperKt.getCurrentLogHandler();
        }

        public final LogLevel getLogLevel() {
            return Config.INSTANCE.getLogLevel();
        }

        public final PlatformInfo getPlatformInfo() {
            return PurchasesOrchestrator.platformInfo;
        }

        public final URL getProxyURL() {
            return PurchasesOrchestrator.proxyURL;
        }

        public final void setDebugLogsEnabled(boolean z10) {
            setLogLevel(LogUtilsKt.debugLogsEnabled(LogLevel.Companion, z10));
        }

        public final synchronized void setLogHandler(LogHandler logHandler) {
            C6496s.h(logHandler, "value");
            LogWrapperKt.setCurrentLogHandler(logHandler);
        }

        public final void setLogLevel(LogLevel logLevel) {
            C6496s.h(logLevel, "value");
            Config.INSTANCE.setLogLevel(logLevel);
        }

        public final void setPlatformInfo(PlatformInfo platformInfo) {
            C6496s.h(platformInfo, "<set-?>");
            PurchasesOrchestrator.platformInfo = platformInfo;
        }

        public final void setProxyURL(URL url) {
            PurchasesOrchestrator.proxyURL = url;
        }

        private Companion() {
        }
    }

    public PurchasesOrchestrator(Application application2, String str, Backend backend2, BillingAbstract billingAbstract, DeviceCache deviceCache2, IdentityManager identityManager2, SubscriberAttributesManager subscriberAttributesManager2, AppConfig appConfig2, CustomerInfoHelper customerInfoHelper2, CustomerInfoUpdateHandler customerInfoUpdateHandler2, DiagnosticsSynchronizer diagnosticsSynchronizer2, OfflineEntitlementsManager offlineEntitlementsManager2, PostReceiptHelper postReceiptHelper2, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper2, PostPendingTransactionsHelper postPendingTransactionsHelper2, SyncPurchasesHelper syncPurchasesHelper2, OfferingsManager offeringsManager2, EventsManager eventsManager2, PaywallPresentedCache paywallPresentedCache2, PurchasesStateCache purchasesStateCache2, Handler handler, Dispatcher dispatcher2, PurchasesConfiguration purchasesConfiguration, WebPurchaseRedemptionHelper webPurchaseRedemptionHelper2) {
        Application application3 = application2;
        Backend backend3 = backend2;
        BillingAbstract billingAbstract2 = billingAbstract;
        DeviceCache deviceCache3 = deviceCache2;
        IdentityManager identityManager3 = identityManager2;
        SubscriberAttributesManager subscriberAttributesManager3 = subscriberAttributesManager2;
        AppConfig appConfig3 = appConfig2;
        CustomerInfoHelper customerInfoHelper3 = customerInfoHelper2;
        CustomerInfoUpdateHandler customerInfoUpdateHandler3 = customerInfoUpdateHandler2;
        OfflineEntitlementsManager offlineEntitlementsManager3 = offlineEntitlementsManager2;
        PostReceiptHelper postReceiptHelper3 = postReceiptHelper2;
        PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper3 = postTransactionWithProductDetailsHelper2;
        PostPendingTransactionsHelper postPendingTransactionsHelper3 = postPendingTransactionsHelper2;
        SyncPurchasesHelper syncPurchasesHelper3 = syncPurchasesHelper2;
        PaywallPresentedCache paywallPresentedCache3 = paywallPresentedCache2;
        C6496s.h(application3, "application");
        C6496s.h(backend3, "backend");
        C6496s.h(billingAbstract2, "billing");
        C6496s.h(deviceCache3, "deviceCache");
        C6496s.h(identityManager3, "identityManager");
        C6496s.h(subscriberAttributesManager3, "subscriberAttributesManager");
        C6496s.h(appConfig3, "appConfig");
        C6496s.h(customerInfoHelper3, "customerInfoHelper");
        C6496s.h(customerInfoUpdateHandler3, "customerInfoUpdateHandler");
        C6496s.h(offlineEntitlementsManager3, "offlineEntitlementsManager");
        C6496s.h(postReceiptHelper3, "postReceiptHelper");
        C6496s.h(postTransactionWithProductDetailsHelper3, "postTransactionWithProductDetailsHelper");
        C6496s.h(postPendingTransactionsHelper3, "postPendingTransactionsHelper");
        C6496s.h(syncPurchasesHelper3, "syncPurchasesHelper");
        C6496s.h(offeringsManager2, "offeringsManager");
        C6496s.h(paywallPresentedCache2, "paywallPresentedCache");
        C6496s.h(purchasesStateCache2, "purchasesStateCache");
        C6496s.h(dispatcher2, "dispatcher");
        C6496s.h(purchasesConfiguration, "initialConfiguration");
        C6496s.h(webPurchaseRedemptionHelper2, "webPurchaseRedemptionHelper");
        this.application = application3;
        this.backend = backend3;
        this.billing = billingAbstract2;
        this.deviceCache = deviceCache3;
        this.identityManager = identityManager3;
        this.subscriberAttributesManager = subscriberAttributesManager3;
        this.appConfig = appConfig3;
        this.customerInfoHelper = customerInfoHelper3;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler3;
        this.diagnosticsSynchronizer = diagnosticsSynchronizer2;
        this.offlineEntitlementsManager = offlineEntitlementsManager3;
        this.postReceiptHelper = postReceiptHelper3;
        this.postTransactionWithProductDetailsHelper = postTransactionWithProductDetailsHelper3;
        this.postPendingTransactionsHelper = postPendingTransactionsHelper3;
        this.syncPurchasesHelper = syncPurchasesHelper3;
        this.offeringsManager = offeringsManager2;
        this.eventsManager = eventsManager2;
        this.paywallPresentedCache = paywallPresentedCache2;
        this.purchasesStateCache = purchasesStateCache2;
        this.mainHandler = handler;
        this.dispatcher = dispatcher2;
        this.initialConfiguration = purchasesConfiguration;
        this.webPurchaseRedemptionHelper = webPurchaseRedemptionHelper2;
        this.lifecycleHandler$delegate = C6531o.b(new PurchasesOrchestrator$lifecycleHandler$2(this));
        a.C0955a aVar = a.f65168b;
        this.lastSyncAttributesAndOfferingsRateLimiter = new RateLimiter(5, c.s(60, d.SECONDS), (DefaultConstructorMarker) null);
        identityManager3.configure(str);
        billingAbstract2.setStateListener(new BillingAbstract.StateListener(this) {
            final /* synthetic */ PurchasesOrchestrator this$0;

            {
                this.this$0 = r1;
            }

            public void onConnected() {
                PostPendingTransactionsHelper.syncPendingPurchaseQueue$default(this.this$0.postPendingTransactionsHelper, this.this$0.getAllowSharingPlayStoreAccount(), (C6798l) null, (C6798l) null, 6, (Object) null);
                this.this$0.billing.getStorefront(new PurchasesOrchestrator$1$onConnected$1(this.this$0), PurchasesOrchestrator$1$onConnected$2.INSTANCE);
            }
        });
        billingAbstract2.setPurchasesUpdatedListener(getPurchasesUpdatedListener());
        BillingAbstract.startConnectionOnMainThread$default(billingAbstract2, 0, 1, (Object) null);
        dispatch(new C6787a(this) {
            final /* synthetic */ PurchasesOrchestrator this$0;

            {
                this.this$0 = r1;
            }

            public final void invoke() {
                J.l().getLifecycle().a(this.this$0.getLifecycleHandler());
                this.this$0.application.registerActivityLifecycleCallbacks(this.this$0);
            }
        });
        if (!this.appConfig.getDangerousSettings().getAutoSyncPurchases()) {
            LogWrapperKt.log(LogIntent.WARNING, ConfigureStrings.AUTO_SYNC_PURCHASES_DISABLED);
        }
    }

    /* access modifiers changed from: private */
    public final void dispatch(C6787a aVar) {
        if (!C6496s.c(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            Handler handler = this.mainHandler;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new e(aVar));
            return;
        }
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public static final void dispatch$lambda$17(C6787a aVar) {
        C6496s.h(aVar, "$tmp0");
        aVar.invoke();
    }

    private final void enqueue(C6787a aVar) {
        this.dispatcher.enqueue(new f(aVar), Delay.NONE);
    }

    /* access modifiers changed from: private */
    public static final void enqueue$lambda$12(C6787a aVar) {
        C6496s.h(aVar, "$command");
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public final void flushPaywallEvents() {
        EventsManager eventsManager2;
        if (AndroidVersionUtilsKt.isAndroidNOrNewer() && (eventsManager2 = this.eventsManager) != null) {
            eventsManager2.flushEvents();
        }
    }

    /* access modifiers changed from: private */
    public final List<PurchaseCallback> getAndClearAllPurchaseCallbacks() {
        List<PurchaseCallback> e12;
        synchronized (this) {
            Map<String, PurchaseCallback> purchaseCallbacksByProductId = getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId();
            PurchasesState state$purchases_defaultsRelease = getState$purchases_defaultsRelease();
            Map emptyMap = Collections.emptyMap();
            C6496s.g(emptyMap, "emptyMap()");
            setState$purchases_defaultsRelease(PurchasesState.copy$default(state$purchases_defaultsRelease, (Boolean) null, emptyMap, (ProductChangeCallback) null, false, false, 29, (Object) null));
            e12 = C6565s.e1(purchaseCallbacksByProductId.values());
        }
        return e12;
    }

    /* access modifiers changed from: private */
    public final ProductChangeCallback getAndClearProductChangeCallback() {
        ProductChangeCallback deprecatedProductChangeCallback = getState$purchases_defaultsRelease().getDeprecatedProductChangeCallback();
        setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), (Boolean) null, (Map) null, (ProductChangeCallback) null, false, false, 27, (Object) null));
        return deprecatedProductChangeCallback;
    }

    /* access modifiers changed from: private */
    public final AppLifecycleHandler getLifecycleHandler() {
        return (AppLifecycleHandler) this.lifecycleHandler$delegate.getValue();
    }

    public static /* synthetic */ void getOfferings$default(PurchasesOrchestrator purchasesOrchestrator, ReceiveOfferingsCallback receiveOfferingsCallback, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        purchasesOrchestrator.getOfferings(receiveOfferingsCallback, z10);
    }

    /* access modifiers changed from: private */
    public final Pair<p, p> getProductChangeCompletedCallbacks(ProductChangeCallback productChangeCallback) {
        return new Pair<>(new PurchasesOrchestrator$getProductChangeCompletedCallbacks$onSuccess$1(productChangeCallback, this), new PurchasesOrchestrator$getProductChangeCompletedCallbacks$onError$1(productChangeCallback, this));
    }

    public static /* synthetic */ void getProducts$default(PurchasesOrchestrator purchasesOrchestrator, List list, ProductType productType, GetStoreProductsCallback getStoreProductsCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            productType = null;
        }
        purchasesOrchestrator.getProducts(list, productType, getStoreProductsCallback);
    }

    /* access modifiers changed from: private */
    public final PurchaseCallback getPurchaseCallback(String str) {
        PurchaseCallback purchaseCallback = getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId().get(str);
        PurchasesState state$purchases_defaultsRelease = getState$purchases_defaultsRelease();
        Map<String, PurchaseCallback> purchaseCallbacksByProductId = getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : purchaseCallbacksByProductId.entrySet()) {
            if (!C6496s.c(next.getKey(), str)) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        setState$purchases_defaultsRelease(PurchasesState.copy$default(state$purchases_defaultsRelease, (Boolean) null, linkedHashMap, (ProductChangeCallback) null, false, false, 29, (Object) null));
        return purchaseCallback;
    }

    /* access modifiers changed from: private */
    public final Pair<p, p> getPurchaseCompletedCallbacks() {
        return new Pair<>(new PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1(this), new PurchasesOrchestrator$getPurchaseCompletedCallbacks$onError$1(this));
    }

    private final BillingAbstract.PurchasesUpdatedListener getPurchasesUpdatedListener() {
        return new PurchasesOrchestrator$getPurchasesUpdatedListener$1(this);
    }

    public static /* synthetic */ void logIn$default(PurchasesOrchestrator purchasesOrchestrator, String str, LogInCallback logInCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            logInCallback = null;
        }
        purchasesOrchestrator.logIn(str, logInCallback);
    }

    public static /* synthetic */ void logOut$default(PurchasesOrchestrator purchasesOrchestrator, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            receiveCustomerInfoCallback = null;
        }
        purchasesOrchestrator.logOut(receiveCustomerInfoCallback);
    }

    private final void replaceOldPurchaseWithNewProduct(PurchasingData purchasingData, String str, GoogleReplacementMode googleReplacementMode, Activity activity, String str2, PresentedOfferingContext presentedOfferingContext, Boolean bool, PurchaseErrorCallback purchaseErrorCallback) {
        String str3 = str;
        ProductType productType = purchasingData.getProductType();
        ProductType productType2 = ProductType.SUBS;
        if (productType != productType2) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PurchaseNotAllowedError, PurchaseStrings.UPGRADING_INVALID_TYPE);
            LogUtilsKt.errorLog(purchasesError);
            ProductChangeCallback andClearProductChangeCallback = getAndClearProductChangeCallback();
            if (andClearProductChangeCallback != null) {
                dispatch(andClearProductChangeCallback, purchasesError);
            }
            for (PurchaseCallback dispatch : getAndClearAllPurchaseCallbacks()) {
                dispatch(dispatch, purchasesError);
            }
            return;
        }
        N n10 = new N();
        n10.f71759a = str3;
        if (Sg.p.O(str3, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, false, 2, (Object) null)) {
            n10.f71759a = Sg.p.a1(str3, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, (String) null, 2, (Object) null);
            LogUtilsKt.warnLog("Using incorrect oldProductId: " + str3 + ". The productId should not contain the basePlanId. Using productId: " + ((String) n10.f71759a) + '.');
        }
        BillingAbstract billingAbstract = this.billing;
        PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$2 purchasesOrchestrator$replaceOldPurchaseWithNewProduct$2 = new PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$2(n10, this, activity, str2, purchasingData, googleReplacementMode, presentedOfferingContext, bool);
        billingAbstract.findPurchaseInPurchaseHistory(str2, productType2, (String) n10.f71759a, purchasesOrchestrator$replaceOldPurchaseWithNewProduct$2, new PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$3(this, purchaseErrorCallback));
    }

    /* access modifiers changed from: private */
    public final boolean shouldRefreshCustomerInfo(boolean z10) {
        if (this.appConfig.getCustomEntitlementComputation()) {
            return false;
        }
        if (z10 || this.deviceCache.isCustomerInfoCacheStale(getAppUserID(), false)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void syncPurchases$default(PurchasesOrchestrator purchasesOrchestrator, SyncPurchasesCallback syncPurchasesCallback, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            syncPurchasesCallback = null;
        }
        purchasesOrchestrator.syncPurchases(syncPurchasesCallback);
    }

    /* access modifiers changed from: private */
    public final void synchronizeSubscriberAttributesIfNeeded() {
        SubscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers$default(this.subscriberAttributesManager, getAppUserID(), (C6787a) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void updateAllCaches(String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        boolean appInBackground = getState$purchases_defaultsRelease().getAppInBackground();
        String str2 = str;
        this.customerInfoHelper.retrieveCustomerInfo(str2, CacheFetchPolicy.FETCH_CURRENT, appInBackground, getAllowSharingPlayStoreAccount(), receiveCustomerInfoCallback);
        OfferingsManager.fetchAndCacheOfferings$default(this.offeringsManager, str2, appInBackground, (C6798l) null, (C6798l) null, 12, (Object) null);
    }

    static /* synthetic */ void updateAllCaches$default(PurchasesOrchestrator purchasesOrchestrator, String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            receiveCustomerInfoCallback = null;
        }
        purchasesOrchestrator.updateAllCaches(str, receiveCustomerInfoCallback);
    }

    public final void close() {
        synchronized (this) {
            PurchasesState state$purchases_defaultsRelease = getState$purchases_defaultsRelease();
            Map emptyMap = Collections.emptyMap();
            C6496s.g(emptyMap, "emptyMap()");
            setState$purchases_defaultsRelease(PurchasesState.copy$default(state$purchases_defaultsRelease, (Boolean) null, emptyMap, (ProductChangeCallback) null, false, false, 29, (Object) null));
            C6514M m10 = C6514M.f71813a;
        }
        this.backend.close();
        this.billing.close();
        setUpdatedCustomerInfoListener((UpdatedCustomerInfoListener) null);
        dispatch(new PurchasesOrchestrator$close$2(this));
    }

    public final void collectDeviceIdentifiers() {
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"collectDeviceIdentifiers"}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.subscriberAttributesManager.collectDeviceIdentifiers(getAppUserID(), this.application);
    }

    public final synchronized boolean getAllowSharingPlayStoreAccount() {
        boolean z10;
        try {
            Boolean allowSharingPlayStoreAccount = getState$purchases_defaultsRelease().getAllowSharingPlayStoreAccount();
            if (allowSharingPlayStoreAccount != null) {
                z10 = allowSharingPlayStoreAccount.booleanValue();
            } else {
                z10 = this.identityManager.currentUserIsAnonymous();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return z10;
    }

    public final void getAmazonLWAConsentStatus(GetAmazonLWAConsentStatusCallback getAmazonLWAConsentStatusCallback) {
        C6496s.h(getAmazonLWAConsentStatusCallback, "callback");
        this.billing.getAmazonLWAConsentStatus(new PurchasesOrchestrator$getAmazonLWAConsentStatus$1(getAmazonLWAConsentStatusCallback), new PurchasesOrchestrator$getAmazonLWAConsentStatus$2(getAmazonLWAConsentStatusCallback));
    }

    public final AppConfig getAppConfig() {
        return this.appConfig;
    }

    public final synchronized String getAppUserID() {
        return this.identityManager.getCurrentAppUserID();
    }

    public final PurchasesConfiguration getCurrentConfiguration() {
        if (this.initialConfiguration.getAppUserID() == null) {
            return this.initialConfiguration;
        }
        return PurchasesConfiguration.copy$purchases_defaultsRelease$default(this.initialConfiguration, getAppUserID(), (ExecutorService) null, 2, (Object) null);
    }

    public final void getCustomerCenterConfig(GetCustomerCenterConfigCallback getCustomerCenterConfigCallback) {
        C6496s.h(getCustomerCenterConfigCallback, "callback");
        this.backend.getCustomerCenterConfig(this.identityManager.getCurrentAppUserID(), new PurchasesOrchestrator$getCustomerCenterConfig$1(getCustomerCenterConfigCallback), new PurchasesOrchestrator$getCustomerCenterConfig$2(getCustomerCenterConfigCallback));
    }

    public final void getCustomerInfo(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        C6496s.h(receiveCustomerInfoCallback, "callback");
        getCustomerInfo(CacheFetchPolicy.Companion.m26default(), receiveCustomerInfoCallback);
    }

    public final synchronized boolean getFinishTransactions() {
        return this.appConfig.getFinishTransactions();
    }

    public final void getOfferings(ReceiveOfferingsCallback receiveOfferingsCallback, boolean z10) {
        C6496s.h(receiveOfferingsCallback, "listener");
        this.offeringsManager.getOfferings(this.identityManager.getCurrentAppUserID(), getState$purchases_defaultsRelease().getAppInBackground(), new PurchasesOrchestrator$getOfferings$1(receiveOfferingsCallback), new PurchasesOrchestrator$getOfferings$2(receiveOfferingsCallback), z10);
    }

    public final OfflineEntitlementsManager getOfflineEntitlementsManager() {
        return this.offlineEntitlementsManager;
    }

    public final void getProducts(List<String> list, ProductType productType, GetStoreProductsCallback getStoreProductsCallback) {
        Set set;
        C6496s.h(list, "productIds");
        C6496s.h(getStoreProductsCallback, "callback");
        if (productType == null || (set = Y.d(productType)) == null) {
            set = Y.j(ProductType.SUBS, ProductType.INAPP);
        }
        getProductsOfTypes(C6565s.j1(list), set, new PurchasesOrchestrator$getProducts$1(getStoreProductsCallback));
    }

    public final void getProductsOfTypes(Set<String> set, Set<? extends ProductType> set2, GetStoreProductsCallback getStoreProductsCallback) {
        C6496s.h(set, "productIds");
        C6496s.h(set2, "types");
        C6496s.h(getStoreProductsCallback, "callback");
        ArrayList arrayList = new ArrayList();
        for (Object next : set2) {
            if (((ProductType) next) != ProductType.UNKNOWN) {
                arrayList.add(next);
            }
        }
        getProductsOfTypes(set, C6565s.j1(arrayList), C6565s.n(), getStoreProductsCallback);
    }

    public final PurchasesState getState$purchases_defaultsRelease() {
        return this.purchasesStateCache.getPurchasesState();
    }

    public final Store getStore() {
        return this.appConfig.getStore();
    }

    public final String getStorefrontCountryCode() {
        return this.storefrontCountryCode;
    }

    public final synchronized UpdatedCustomerInfoListener getUpdatedCustomerInfoListener() {
        return this.customerInfoUpdateHandler.getUpdatedCustomerInfoListener();
    }

    public final void invalidateCustomerInfoCache() {
        LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.INVALIDATING_CUSTOMERINFO_CACHE);
        this.deviceCache.clearCustomerInfoCache(getAppUserID());
    }

    public final boolean isAnonymous() {
        return this.identityManager.currentUserIsAnonymous();
    }

    public final void logIn(String str, LogInCallback logInCallback) {
        C6496s.h(str, "newAppUserID");
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        C6514M m10 = null;
        if (C6496s.c(currentAppUserID, str)) {
            currentAppUserID = null;
        }
        if (currentAppUserID != null) {
            this.identityManager.logIn(str, new PurchasesOrchestrator$logIn$2$1(this, str, logInCallback), new PurchasesOrchestrator$logIn$2$2(this, logInCallback));
            m10 = C6514M.f71813a;
        }
        if (m10 == null) {
            this.customerInfoHelper.retrieveCustomerInfo(this.identityManager.getCurrentAppUserID(), CacheFetchPolicy.Companion.m26default(), getState$purchases_defaultsRelease().getAppInBackground(), getAllowSharingPlayStoreAccount(), ListenerConversionsCommonKt.receiveCustomerInfoCallback(new PurchasesOrchestrator$logIn$3(this, logInCallback), new PurchasesOrchestrator$logIn$4(this, logInCallback)));
        }
    }

    public final void logOut(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        this.identityManager.logOut(new PurchasesOrchestrator$logOut$1(receiveCustomerInfoCallback, this));
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityCreated(this, activity, bundle);
    }

    public void onActivityDestroyed(Activity activity) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityDestroyed(this, activity);
    }

    public void onActivityPaused(Activity activity) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityPaused(this, activity);
    }

    public void onActivityResumed(Activity activity) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityResumed(this, activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivitySaveInstanceState(this, activity, bundle);
    }

    public void onActivityStarted(Activity activity) {
        C6496s.h(activity, "activity");
        if (this.appConfig.getShowInAppMessagesAutomatically()) {
            showInAppMessagesIfNeeded(activity, C6559l.n1(InAppMessageType.values()));
        }
    }

    public void onActivityStopped(Activity activity) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityStopped(this, activity);
    }

    public void onAppBackgrounded() {
        synchronized (this) {
            setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), (Boolean) null, (Map) null, (ProductChangeCallback) null, true, false, 23, (Object) null));
            C6514M m10 = C6514M.f71813a;
        }
        LogWrapperKt.log(LogIntent.DEBUG, ConfigureStrings.APP_BACKGROUNDED);
        synchronizeSubscriberAttributesIfNeeded();
        flushPaywallEvents();
    }

    public void onAppForegrounded() {
        kotlin.jvm.internal.J j10 = new kotlin.jvm.internal.J();
        synchronized (this) {
            j10.f71755a = getState$purchases_defaultsRelease().getFirstTimeInForeground();
            setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), (Boolean) null, (Map) null, (ProductChangeCallback) null, false, false, 7, (Object) null));
            C6514M m10 = C6514M.f71813a;
        }
        LogWrapperKt.log(LogIntent.DEBUG, ConfigureStrings.APP_FOREGROUNDED);
        enqueue(new PurchasesOrchestrator$onAppForegrounded$2(this, j10));
    }

    public final void purchase(PurchaseParams purchaseParams, PurchaseCallback purchaseCallback) {
        C6514M m10;
        C6496s.h(purchaseParams, "purchaseParams");
        C6496s.h(purchaseCallback, "callback");
        String oldProductId = purchaseParams.getOldProductId();
        if (oldProductId != null) {
            startProductChange(purchaseParams.getActivity$purchases_defaultsRelease(), purchaseParams.getPurchasingData$purchases_defaultsRelease(), purchaseParams.getPresentedOfferingContext$purchases_defaultsRelease(), oldProductId, purchaseParams.getGoogleReplacementMode(), purchaseParams.isPersonalizedPrice(), purchaseCallback);
            m10 = C6514M.f71813a;
        } else {
            m10 = null;
        }
        if (m10 == null) {
            startPurchase(purchaseParams.getActivity$purchases_defaultsRelease(), purchaseParams.getPurchasingData$purchases_defaultsRelease(), purchaseParams.getPresentedOfferingContext$purchases_defaultsRelease(), purchaseParams.isPersonalizedPrice(), purchaseCallback);
        }
    }

    public final void redeemWebPurchase(WebPurchaseRedemption webPurchaseRedemption, RedeemWebPurchaseListener redeemWebPurchaseListener) {
        C6496s.h(webPurchaseRedemption, "webPurchaseRedemption");
        C6496s.h(redeemWebPurchaseListener, "listener");
        this.webPurchaseRedemptionHelper.handleRedeemWebPurchase(webPurchaseRedemption, redeemWebPurchaseListener);
    }

    public final void removeUpdatedCustomerInfoListener() {
        setUpdatedCustomerInfoListener((UpdatedCustomerInfoListener) null);
    }

    public final void restorePurchases(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        C6496s.h(receiveCustomerInfoCallback, "callback");
        LogWrapperKt.log(LogIntent.DEBUG, RestoreStrings.RESTORING_PURCHASE);
        if (!getAllowSharingPlayStoreAccount()) {
            LogWrapperKt.log(LogIntent.WARNING, RestoreStrings.SHARING_ACC_RESTORE_FALSE);
        }
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        this.billing.queryAllPurchases(currentAppUserID, new PurchasesOrchestrator$restorePurchases$1(this, receiveCustomerInfoCallback, currentAppUserID), new PurchasesOrchestrator$restorePurchases$2(this, receiveCustomerInfoCallback));
    }

    public final void setAd(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setAd"}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Ad.INSTANCE, str, getAppUserID());
    }

    public final void setAdGroup(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setAdGroup"}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.AdGroup.INSTANCE, str, getAppUserID());
    }

    public final void setAdjustID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setAdjustID"}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Adjust.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setAirshipChannelID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setAirshipChannelID"}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.Airship.INSTANCE, str, getAppUserID());
    }

    public final synchronized void setAllowSharingPlayStoreAccount(boolean z10) {
        setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), Boolean.valueOf(z10), (Map) null, (ProductChangeCallback) null, false, false, 30, (Object) null));
    }

    public final void setAppConfig(AppConfig appConfig2) {
        C6496s.h(appConfig2, "<set-?>");
        this.appConfig = appConfig2;
    }

    public final void setAppsflyerID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setAppsflyerID"}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.AppsFlyer.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setAttributes(Map<String, String> map) {
        C6496s.h(map, "attributes");
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setAttributes"}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.subscriberAttributesManager.setAttributes(map, getAppUserID());
    }

    public final void setCampaign(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setCampaign"}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Campaign.INSTANCE, str, getAppUserID());
    }

    public final void setCleverTapID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setCleverTapID"}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.CleverTap.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setCreative(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setCreative"}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Creative.INSTANCE, str, getAppUserID());
    }

    public final void setDisplayName(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setDisplayName"}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.DisplayName.INSTANCE, str, getAppUserID());
    }

    public final void setEmail(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setEmail"}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.Email.INSTANCE, str, getAppUserID());
    }

    public final void setFBAnonymousID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setFBAnonymousID"}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Facebook.INSTANCE, str, getAppUserID(), this.application);
    }

    public final synchronized void setFinishTransactions(boolean z10) {
        this.appConfig.setFinishTransactions(z10);
    }

    public final void setFirebaseAppInstanceID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setFirebaseAppInstanceID"}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.FirebaseAppInstanceId.INSTANCE, str, getAppUserID());
    }

    public final void setKeyword(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"seKeyword"}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Keyword.INSTANCE, str, getAppUserID());
    }

    public final void setKochavaDeviceID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setKochavaDeviceID"}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Kochava.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setMediaSource(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setMediaSource"}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.MediaSource.INSTANCE, str, getAppUserID());
    }

    public final void setMixpanelDistinctID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setMixpanelDistinctID"}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.MixpanelDistinctId.INSTANCE, str, getAppUserID());
    }

    public final void setMparticleID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setMparticleID"}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Mparticle.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setOnesignalID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setOnesignalID"}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.OneSignal.INSTANCE, str, getAppUserID());
    }

    public final void setOnesignalUserID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setOnesignalUserID"}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.OneSignalUserId.INSTANCE, str, getAppUserID());
    }

    public final void setPhoneNumber(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setPhoneNumber"}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.PhoneNumber.INSTANCE, str, getAppUserID());
    }

    public final void setPushToken(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setPushToken"}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.FCMTokens.INSTANCE, str, getAppUserID());
    }

    public final void setState$purchases_defaultsRelease(PurchasesState purchasesState) {
        C6496s.h(purchasesState, "value");
        this.purchasesStateCache.setPurchasesState(purchasesState);
    }

    public final void setTenjinAnalyticsInstallationID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setTenjinAnalyticsInstallationID"}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.TenjinAnalyticsInstallationId.INSTANCE, str, getAppUserID());
    }

    public final synchronized void setUpdatedCustomerInfoListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        this.customerInfoUpdateHandler.setUpdatedCustomerInfoListener(updatedCustomerInfoListener);
    }

    public final void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> list) {
        C6496s.h(activity, "activity");
        C6496s.h(list, "inAppMessageTypes");
        this.billing.showInAppMessagesIfNeeded(activity, list, new PurchasesOrchestrator$showInAppMessagesIfNeeded$1(this));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [kotlin.jvm.internal.DefaultConstructorMarker, java.lang.String] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4 */
    public final void startDeprecatedProductChange(Activity activity, PurchasingData purchasingData, PresentedOfferingContext presentedOfferingContext, String str, GoogleReplacementMode googleReplacementMode, ProductChangeCallback productChangeCallback) {
        String str2;
        String str3;
        ProductChangeCallback productChangeCallback2;
        ? r02;
        String offeringIdentifier;
        PurchasingData purchasingData2 = purchasingData;
        String str4 = str;
        ProductChangeCallback productChangeCallback3 = productChangeCallback;
        C6496s.h(activity, "activity");
        C6496s.h(purchasingData2, "purchasingData");
        C6496s.h(str4, "oldProductId");
        C6496s.h(productChangeCallback3, "listener");
        if (purchasingData.getProductType() != ProductType.SUBS) {
            getAndClearProductChangeCallback();
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PurchaseNotAllowedError, PurchaseStrings.UPGRADING_INVALID_TYPE);
            LogUtilsKt.errorLog(purchasesError);
            C6514M m10 = C6514M.f71813a;
            dispatch(productChangeCallback3, purchasesError);
            return;
        }
        LogIntent logIntent = LogIntent.PURCHASE;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(' ');
        sb2.append(purchasingData2);
        sb2.append(' ');
        C6514M m11 = null;
        if (presentedOfferingContext == null || (offeringIdentifier = presentedOfferingContext.getOfferingIdentifier()) == null) {
            str2 = null;
        } else {
            str2 = PurchaseStrings.OFFERING + offeringIdentifier;
        }
        sb2.append(str2);
        sb2.append(" oldProductId: ");
        sb2.append(str4);
        sb2.append(" googleReplacementMode ");
        sb2.append(googleReplacementMode);
        String format = String.format(PurchaseStrings.PRODUCT_CHANGE_STARTED, Arrays.copyOf(new Object[]{sb2.toString()}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        synchronized (this) {
            try {
                if (!this.appConfig.getFinishTransactions()) {
                    LogWrapperKt.log(LogIntent.WARNING, PurchaseStrings.PURCHASE_FINISH_TRANSACTION_FALSE);
                }
                if (getState$purchases_defaultsRelease().getDeprecatedProductChangeCallback() == null) {
                    setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), (Boolean) null, (Map) null, productChangeCallback, false, false, 27, (Object) null));
                    str3 = this.identityManager.getCurrentAppUserID();
                } else {
                    str3 = null;
                }
                C6514M m12 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (str3 != null) {
            r02 = 0;
            productChangeCallback2 = productChangeCallback3;
            replaceOldPurchaseWithNewProduct(purchasingData, str, googleReplacementMode, activity, str3, presentedOfferingContext, (Boolean) null, productChangeCallback);
            m11 = C6514M.f71813a;
        } else {
            r02 = 0;
            productChangeCallback2 = productChangeCallback3;
        }
        if (m11 == null) {
            getAndClearProductChangeCallback();
            PurchasesError purchasesError2 = new PurchasesError(PurchasesErrorCode.OperationAlreadyInProgressError, r02, 2, r02);
            LogUtilsKt.errorLog(purchasesError2);
            dispatch(productChangeCallback2, purchasesError2);
        }
    }

    public final void startProductChange(Activity activity, PurchasingData purchasingData, PresentedOfferingContext presentedOfferingContext, String str, GoogleReplacementMode googleReplacementMode, Boolean bool, PurchaseCallback purchaseCallback) {
        String str2;
        String str3;
        C6514M m10;
        String str4;
        String offeringIdentifier;
        PurchasingData purchasingData2 = purchasingData;
        String str5 = str;
        GoogleReplacementMode googleReplacementMode2 = googleReplacementMode;
        PurchaseCallback purchaseCallback2 = purchaseCallback;
        C6496s.h(activity, "activity");
        C6496s.h(purchasingData2, "purchasingData");
        C6496s.h(str5, "oldProductId");
        C6496s.h(googleReplacementMode2, "googleReplacementMode");
        C6496s.h(purchaseCallback2, "purchaseCallback");
        if (purchasingData.getProductType() != ProductType.SUBS) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PurchaseNotAllowedError, PurchaseStrings.UPGRADING_INVALID_TYPE);
            LogUtilsKt.errorLog(purchasesError);
            C6514M m11 = C6514M.f71813a;
            dispatch(purchaseCallback2, purchasesError);
            return;
        }
        LogIntent logIntent = LogIntent.PURCHASE;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(' ');
        sb2.append(purchasingData2);
        sb2.append(' ');
        if (presentedOfferingContext == null || (offeringIdentifier = presentedOfferingContext.getOfferingIdentifier()) == null) {
            str2 = null;
        } else {
            str2 = PurchaseStrings.OFFERING + offeringIdentifier;
        }
        sb2.append(str2);
        sb2.append(" oldProductId: ");
        sb2.append(str5);
        sb2.append(" googleReplacementMode ");
        sb2.append(googleReplacementMode2);
        String format = String.format(PurchaseStrings.PRODUCT_CHANGE_STARTED, Arrays.copyOf(new Object[]{sb2.toString()}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        synchronized (this) {
            try {
                if (!this.appConfig.getFinishTransactions()) {
                    LogWrapperKt.log(LogIntent.WARNING, PurchaseStrings.PURCHASE_FINISH_TRANSACTION_FALSE);
                }
                if (!getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId().containsKey(purchasingData.getProductId())) {
                    if (googleReplacementMode2 == GoogleReplacementMode.DEFERRED) {
                        str4 = str5;
                    } else {
                        str4 = purchasingData.getProductId();
                    }
                    setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), (Boolean) null, O.p(getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId(), O.f(C6502A.a(str4, purchaseCallback2))), (ProductChangeCallback) null, false, false, 29, (Object) null));
                    str3 = this.identityManager.getCurrentAppUserID();
                } else {
                    str3 = null;
                }
                C6514M m12 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (str3 != null) {
            replaceOldPurchaseWithNewProduct(purchasingData, str, googleReplacementMode, activity, str3, presentedOfferingContext, bool, purchaseCallback);
            m10 = C6514M.f71813a;
        } else {
            m10 = null;
        }
        if (m10 == null) {
            PurchasesError purchasesError2 = new PurchasesError(PurchasesErrorCode.OperationAlreadyInProgressError, (String) null, 2, (DefaultConstructorMarker) null);
            LogUtilsKt.errorLog(purchasesError2);
            for (PurchaseCallback dispatch : getAndClearAllPurchaseCallbacks()) {
                dispatch(dispatch, purchasesError2);
            }
        }
    }

    public final void startPurchase(Activity activity, PurchasingData purchasingData, PresentedOfferingContext presentedOfferingContext, Boolean bool, PurchaseCallback purchaseCallback) {
        String str;
        String str2;
        C6514M m10;
        String offeringIdentifier;
        PurchasingData purchasingData2 = purchasingData;
        PurchaseCallback purchaseCallback2 = purchaseCallback;
        C6496s.h(activity, "activity");
        C6496s.h(purchasingData2, "purchasingData");
        C6496s.h(purchaseCallback2, "listener");
        LogIntent logIntent = LogIntent.PURCHASE;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(' ');
        sb2.append(purchasingData2);
        sb2.append(' ');
        if (presentedOfferingContext == null || (offeringIdentifier = presentedOfferingContext.getOfferingIdentifier()) == null) {
            str = null;
        } else {
            str = PurchaseStrings.OFFERING + offeringIdentifier;
        }
        sb2.append(str);
        String format = String.format(PurchaseStrings.PURCHASE_STARTED, Arrays.copyOf(new Object[]{sb2.toString()}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        synchronized (this) {
            try {
                if (!this.appConfig.getFinishTransactions()) {
                    LogWrapperKt.log(LogIntent.WARNING, PurchaseStrings.PURCHASE_FINISH_TRANSACTION_FALSE);
                }
                if (!getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId().containsKey(purchasingData.getProductId())) {
                    setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), (Boolean) null, O.p(getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId(), O.f(C6502A.a(purchasingData.getProductId(), purchaseCallback2))), (ProductChangeCallback) null, false, false, 29, (Object) null));
                    str2 = this.identityManager.getCurrentAppUserID();
                } else {
                    str2 = null;
                }
                C6514M m11 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (str2 != null) {
            this.billing.makePurchaseAsync(activity, str2, purchasingData, (ReplaceProductInfo) null, presentedOfferingContext, bool);
            m10 = C6514M.f71813a;
        } else {
            m10 = null;
        }
        if (m10 == null) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.OperationAlreadyInProgressError, (String) null, 2, (DefaultConstructorMarker) null);
            LogUtilsKt.errorLog(purchasesError);
            dispatch(purchaseCallback2, purchasesError);
        }
    }

    public final void switchUser(String str) {
        C6496s.h(str, "newAppUserID");
        if (C6496s.c(this.identityManager.getCurrentAppUserID(), str)) {
            String format = String.format(IdentityStrings.SWITCHING_USER_SAME_APP_USER_ID, Arrays.copyOf(new Object[]{str}, 1));
            C6496s.g(format, "format(this, *args)");
            LogUtilsKt.warnLog(format);
            return;
        }
        this.identityManager.switchUser(str);
        OfferingsManager.fetchAndCacheOfferings$default(this.offeringsManager, str, getState$purchases_defaultsRelease().getAppInBackground(), (C6798l) null, (C6798l) null, 12, (Object) null);
    }

    public final void syncAmazonPurchase(String str, String str2, String str3, String str4, Double d10) {
        C6496s.h(str, "productID");
        C6496s.h(str2, "receiptID");
        C6496s.h(str3, "amazonUserID");
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(PurchaseStrings.SYNCING_PURCHASE_STORE_USER_ID, Arrays.copyOf(new Object[]{str2, str3}, 2));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        Set<String> previouslySentHashedTokens = this.deviceCache.getPreviouslySentHashedTokens();
        if (!previouslySentHashedTokens.contains(UtilsKt.sha1(str2))) {
            previouslySentHashedTokens = null;
        }
        if (previouslySentHashedTokens != null) {
            String format2 = String.format(PurchaseStrings.SYNCING_PURCHASE_SKIPPING, Arrays.copyOf(new Object[]{str2, str3}, 2));
            C6496s.g(format2, "format(this, *args)");
            LogWrapperKt.log(logIntent, format2);
            return;
        }
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        this.billing.normalizePurchaseData(str, str2, str3, new PurchasesOrchestrator$syncAmazonPurchase$3(d10, str4, this, str2, str3, currentAppUserID), new PurchasesOrchestrator$syncAmazonPurchase$4(str2, str3));
    }

    public final void syncAttributesAndOfferingsIfNeeded(SyncAttributesAndOfferingsCallback syncAttributesAndOfferingsCallback) {
        C6496s.h(syncAttributesAndOfferingsCallback, "callback");
        PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1 purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1 = new PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1(syncAttributesAndOfferingsCallback);
        if (!this.lastSyncAttributesAndOfferingsRateLimiter.shouldProceed()) {
            LogIntent logIntent = LogIntent.WARNING;
            String format = String.format(SyncAttributesAndOfferingsStrings.RATE_LIMIT_REACHED, Arrays.copyOf(new Object[]{Integer.valueOf(this.lastSyncAttributesAndOfferingsRateLimiter.getMaxCallsInPeriod()), Long.valueOf(a.x(this.lastSyncAttributesAndOfferingsRateLimiter.m129getPeriodSecondsUwyO8pc()))}, 2));
            C6496s.g(format, "format(this, *args)");
            LogWrapperKt.log(logIntent, format);
            getOfferings$default(this, purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1, false, 2, (Object) null);
            return;
        }
        this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(getAppUserID(), new PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$1(this, purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1));
    }

    public final void syncPurchases(SyncPurchasesCallback syncPurchasesCallback) {
        this.syncPurchasesHelper.syncPurchases(getAllowSharingPlayStoreAccount(), getState$purchases_defaultsRelease().getAppInBackground(), new PurchasesOrchestrator$syncPurchases$1(syncPurchasesCallback), new PurchasesOrchestrator$syncPurchases$2(syncPurchasesCallback));
    }

    @ExperimentalPreviewRevenueCatPurchasesAPI
    public final void track(FeatureEvent featureEvent) {
        EventsManager eventsManager2;
        C6496s.h(featureEvent, "event");
        if (featureEvent instanceof PaywallEvent) {
            this.paywallPresentedCache.receiveEvent((PaywallEvent) featureEvent);
        }
        if (AndroidVersionUtilsKt.isAndroidNOrNewer() && (eventsManager2 = this.eventsManager) != null) {
            eventsManager2.track(featureEvent);
        }
    }

    public final void getCustomerInfo(CacheFetchPolicy cacheFetchPolicy, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        C6496s.h(cacheFetchPolicy, "fetchPolicy");
        C6496s.h(receiveCustomerInfoCallback, "callback");
        this.customerInfoHelper.retrieveCustomerInfo(this.identityManager.getCurrentAppUserID(), cacheFetchPolicy, getState$purchases_defaultsRelease().getAppInBackground(), getAllowSharingPlayStoreAccount(), receiveCustomerInfoCallback);
    }

    /* access modifiers changed from: private */
    public final void dispatch(PurchaseErrorCallback purchaseErrorCallback, PurchasesError purchasesError) {
        dispatch(new PurchasesOrchestrator$dispatch$1(purchaseErrorCallback, purchasesError));
    }

    /* access modifiers changed from: private */
    public final void getProductsOfTypes(Set<String> set, Set<? extends ProductType> set2, List<? extends StoreProduct> list, GetStoreProductsCallback getStoreProductsCallback) {
        Set i12 = C6565s.i1(set2);
        ProductType productType = (ProductType) C6565s.p0(i12);
        C6514M m10 = null;
        if (productType != null) {
            i12.remove(productType);
        } else {
            productType = null;
        }
        if (productType != null) {
            this.billing.queryProductDetailsAsync(productType, set, new PurchasesOrchestrator$getProductsOfTypes$1$1(this, set, i12, list, getStoreProductsCallback), new PurchasesOrchestrator$getProductsOfTypes$1$2(this, getStoreProductsCallback));
            m10 = C6514M.f71813a;
        }
        if (m10 == null) {
            getStoreProductsCallback.onReceived(list);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PurchasesOrchestrator(Application application2, String str, Backend backend2, BillingAbstract billingAbstract, DeviceCache deviceCache2, IdentityManager identityManager2, SubscriberAttributesManager subscriberAttributesManager2, AppConfig appConfig2, CustomerInfoHelper customerInfoHelper2, CustomerInfoUpdateHandler customerInfoUpdateHandler2, DiagnosticsSynchronizer diagnosticsSynchronizer2, OfflineEntitlementsManager offlineEntitlementsManager2, PostReceiptHelper postReceiptHelper2, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper2, PostPendingTransactionsHelper postPendingTransactionsHelper2, SyncPurchasesHelper syncPurchasesHelper2, OfferingsManager offeringsManager2, EventsManager eventsManager2, PaywallPresentedCache paywallPresentedCache2, PurchasesStateCache purchasesStateCache2, Handler handler, Dispatcher dispatcher2, PurchasesConfiguration purchasesConfiguration, WebPurchaseRedemptionHelper webPurchaseRedemptionHelper2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(application2, str, backend2, billingAbstract, deviceCache2, identityManager2, subscriberAttributesManager2, appConfig2, customerInfoHelper2, customerInfoUpdateHandler2, diagnosticsSynchronizer2, offlineEntitlementsManager2, postReceiptHelper2, postTransactionWithProductDetailsHelper2, postPendingTransactionsHelper2, syncPurchasesHelper2, offeringsManager2, eventsManager2, paywallPresentedCache2, purchasesStateCache2, (i10 & 1048576) != 0 ? new Handler(Looper.getMainLooper()) : handler, dispatcher2, purchasesConfiguration, (i10 & 8388608) != 0 ? new WebPurchaseRedemptionHelper(backend2, identityManager2, offlineEntitlementsManager2, customerInfoUpdateHandler2, (Handler) null, 16, (DefaultConstructorMarker) null) : webPurchaseRedemptionHelper2);
    }
}
