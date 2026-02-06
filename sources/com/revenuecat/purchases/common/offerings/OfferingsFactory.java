package com.revenuecat.purchases.common.offerings;

import Sg.p;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.OfferingParser;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.strings.OfferingStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yf.C6798l;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJW\u0010\u0019\u001a\u00020\u00152\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2$\u0010\u0016\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012\u0012\u0004\u0012\u00020\u00150\u00112\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00150\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u001d\u001a\u0004\u0018\u00010\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010!\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00150\u00112\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00150\u0011¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;", "", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/common/OfferingParser;", "offeringParser", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "<init>", "(Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/common/OfferingParser;Lcom/revenuecat/purchases/common/Dispatcher;)V", "Lorg/json/JSONObject;", "offeringsJSON", "", "", "extractProductIdentifiers", "(Lorg/json/JSONObject;)Ljava/util/Set;", "productIds", "Lkotlin/Function1;", "", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "Llf/M;", "onCompleted", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "getStoreProductsById", "(Ljava/util/Set;Lyf/l;Lyf/l;)V", "allProductIdsInOfferings", "storeProductByID", "logMissingProducts", "(Ljava/util/Set;Ljava/util/Map;)Llf/M;", "Lcom/revenuecat/purchases/Offerings;", "onSuccess", "createOfferings", "(Lorg/json/JSONObject;Lyf/l;Lyf/l;)V", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/common/OfferingParser;", "Lcom/revenuecat/purchases/common/Dispatcher;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OfferingsFactory {
    /* access modifiers changed from: private */
    public final BillingAbstract billing;
    /* access modifiers changed from: private */
    public final Dispatcher dispatcher;
    /* access modifiers changed from: private */
    public final OfferingParser offeringParser;

    public OfferingsFactory(BillingAbstract billingAbstract, OfferingParser offeringParser2, Dispatcher dispatcher2) {
        C6496s.h(billingAbstract, "billing");
        C6496s.h(offeringParser2, "offeringParser");
        C6496s.h(dispatcher2, "dispatcher");
        this.billing = billingAbstract;
        this.offeringParser = offeringParser2;
        this.dispatcher = dispatcher2;
    }

    private final Set<String> extractProductIdentifiers(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("offerings");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONArray jSONArray2 = jSONArray.getJSONObject(i10).getJSONArray("packages");
            int length2 = jSONArray2.length();
            for (int i11 = 0; i11 < length2; i11++) {
                String optString = jSONArray2.getJSONObject(i11).optString("platform_product_identifier");
                C6496s.g(optString, "it");
                if (p.d0(optString)) {
                    optString = null;
                }
                if (optString != null) {
                    linkedHashSet.add(optString);
                }
            }
        }
        return linkedHashSet;
    }

    private final void getStoreProductsById(Set<String> set, C6798l lVar, C6798l lVar2) {
        this.billing.queryProductDetailsAsync(ProductType.SUBS, set, new OfferingsFactory$getStoreProductsById$1(this, set, lVar, lVar2), new OfferingsFactory$getStoreProductsById$2(lVar2));
    }

    /* access modifiers changed from: private */
    public final C6514M logMissingProducts(Set<String> set, Map<String, ? extends List<? extends StoreProduct>> map) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (Object next : set) {
            if (!map.containsKey((String) next)) {
                arrayList2.add(next);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        LogIntent logIntent = LogIntent.GOOGLE_WARNING;
        String format = String.format(OfferingStrings.CANNOT_FIND_PRODUCT_CONFIGURATION_ERROR, Arrays.copyOf(new Object[]{C6565s.x0(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null)}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        return C6514M.f71813a;
    }

    public final void createOfferings(JSONObject jSONObject, C6798l lVar, C6798l lVar2) {
        C6496s.h(jSONObject, "offeringsJSON");
        C6496s.h(lVar, "onError");
        C6496s.h(lVar2, "onSuccess");
        try {
            Set<String> extractProductIdentifiers = extractProductIdentifiers(jSONObject);
            if (extractProductIdentifiers.isEmpty()) {
                lVar.invoke(new PurchasesError(PurchasesErrorCode.ConfigurationError, OfferingStrings.CONFIGURATION_ERROR_NO_PRODUCTS_FOR_OFFERINGS));
            } else {
                getStoreProductsById(extractProductIdentifiers, new OfferingsFactory$createOfferings$1(this, extractProductIdentifiers, jSONObject, lVar, lVar2), new OfferingsFactory$createOfferings$2(lVar));
            }
        } catch (JSONException e10) {
            LogIntent logIntent = LogIntent.RC_ERROR;
            String format = String.format(OfferingStrings.JSON_EXCEPTION_ERROR, Arrays.copyOf(new Object[]{e10.getLocalizedMessage()}, 1));
            C6496s.g(format, "format(this, *args)");
            LogWrapperKt.log(logIntent, format);
            lVar.invoke(new PurchasesError(PurchasesErrorCode.UnexpectedBackendResponseError, e10.getLocalizedMessage()));
        }
    }
}
