package com.revenuecat.purchases.google;

import com.amazon.a.a.o.b;
import com.android.billingclient.api.C3201h;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.GoogleStoreProduct;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mf.O;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/android/billingclient/api/h;", "Lcom/revenuecat/purchases/models/StoreProduct;", "toInAppStoreProduct", "(Lcom/android/billingclient/api/h;)Lcom/revenuecat/purchases/models/StoreProduct;", "", "Lcom/android/billingclient/api/h$e;", "offerDetails", "Lcom/revenuecat/purchases/models/GoogleStoreProduct;", "toStoreProduct", "(Lcom/android/billingclient/api/h;Ljava/util/List;)Lcom/revenuecat/purchases/models/GoogleStoreProduct;", "Lcom/revenuecat/purchases/models/Price;", "createOneTimeProductPrice", "(Lcom/android/billingclient/api/h;)Lcom/revenuecat/purchases/models/Price;", "toStoreProducts", "(Ljava/util/List;)Ljava/util/List;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StoreProductConversionsKt {
    private static final Price createOneTimeProductPrice(C3201h hVar) {
        C3201h.b c10;
        if (ProductTypeConversionsKt.toRevenueCatProductType(hVar.e()) != ProductType.INAPP || (c10 = hVar.c()) == null) {
            return null;
        }
        String a10 = c10.a();
        C6496s.g(a10, "it.formattedPrice");
        long b10 = c10.b();
        String c11 = c10.c();
        C6496s.g(c11, "it.priceCurrencyCode");
        return new Price(a10, b10, c11);
    }

    public static final StoreProduct toInAppStoreProduct(C3201h hVar) {
        C6496s.h(hVar, "<this>");
        return toStoreProduct(hVar, C6565s.n());
    }

    public static final GoogleStoreProduct toStoreProduct(C3201h hVar, List<C3201h.e> list) {
        SubscriptionOptions subscriptionOptions;
        SubscriptionOption subscriptionOption;
        Price price;
        Price price2;
        String str;
        Period period;
        SubscriptionOption subscriptionOption2;
        PricingPhase fullPricePhase;
        C3201h hVar2 = hVar;
        List<C3201h.e> list2 = list;
        C6496s.h(hVar, "<this>");
        C6496s.h(list2, "offerDetails");
        if (ProductTypeConversionsKt.toRevenueCatProductType(hVar.e()) == ProductType.SUBS) {
            Iterable<C3201h.e> iterable = list2;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (C3201h.e subscriptionOption3 : iterable) {
                String d10 = hVar.d();
                C6496s.g(d10, "productId");
                arrayList.add(SubscriptionOptionConversionsKt.toSubscriptionOption(subscriptionOption3, d10, hVar));
            }
            subscriptionOptions = new SubscriptionOptions(arrayList);
        } else {
            subscriptionOptions = null;
        }
        if (subscriptionOptions != null) {
            subscriptionOption = subscriptionOptions.getBasePlan();
        } else {
            subscriptionOption = null;
        }
        if (subscriptionOption == null || (fullPricePhase = subscriptionOption.getFullPricePhase()) == null) {
            price = null;
        } else {
            price = fullPricePhase.getPrice();
        }
        Price createOneTimeProductPrice = createOneTimeProductPrice(hVar);
        if (createOneTimeProductPrice != null) {
            price2 = createOneTimeProductPrice;
        } else if (price == null) {
            return null;
        } else {
            price2 = price;
        }
        String d11 = hVar.d();
        C6496s.g(d11, "productId");
        if (subscriptionOption != null) {
            str = subscriptionOption.getId();
        } else {
            str = null;
        }
        ProductType revenueCatProductType = ProductTypeConversionsKt.toRevenueCatProductType(hVar.e());
        String b10 = hVar.b();
        C6496s.g(b10, "name");
        String g10 = hVar.g();
        C6496s.g(g10, b.f37461S);
        String a10 = hVar.a();
        C6496s.g(a10, b.f37480c);
        if (subscriptionOption != null) {
            period = subscriptionOption.getBillingPeriod();
        } else {
            period = null;
        }
        if (subscriptionOptions != null) {
            subscriptionOption2 = subscriptionOptions.getDefaultOffer();
        } else {
            subscriptionOption2 = null;
        }
        return new GoogleStoreProduct(d11, str, revenueCatProductType, price2, b10, g10, a10, period, subscriptionOptions, subscriptionOption2, hVar, (PresentedOfferingContext) null);
    }

    public static final List<StoreProduct> toStoreProducts(List<C3201h> list) {
        List<C3201h.e> list2;
        Map map;
        C6496s.h(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (C3201h hVar : list) {
            List f10 = hVar.f();
            if (f10 != null) {
                C6496s.g(f10, "subscriptionOfferDetails");
                list2 = new ArrayList<>();
                for (Object next : f10) {
                    C3201h.e eVar = (C3201h.e) next;
                    C6496s.g(eVar, "it");
                    if (SubscriptionOptionConversionsKt.isBasePlan(eVar)) {
                        list2.add(next);
                    }
                }
            } else {
                list2 = C6565s.n();
            }
            List f11 = hVar.f();
            if (f11 != null) {
                C6496s.g(f11, "subscriptionOfferDetails");
                map = new LinkedHashMap();
                for (Object next2 : f11) {
                    String a10 = ((C3201h.e) next2).a();
                    Object obj = map.get(a10);
                    if (obj == null) {
                        obj = new ArrayList();
                        map.put(a10, obj);
                    }
                    ((List) obj).add(next2);
                }
            } else {
                map = O.i();
            }
            if (list2.isEmpty()) {
                list2 = null;
            }
            if (list2 != null) {
                for (C3201h.e a11 : list2) {
                    List list3 = (List) map.get(a11.a());
                    if (list3 == null) {
                        list3 = C6565s.n();
                    }
                    GoogleStoreProduct storeProduct = toStoreProduct(hVar, list3);
                    if (storeProduct != null) {
                        arrayList.add(storeProduct);
                    } else {
                        LogIntent logIntent = LogIntent.RC_ERROR;
                        String format = String.format(PurchaseStrings.INVALID_PRODUCT_NO_PRICE, Arrays.copyOf(new Object[]{hVar.d()}, 1));
                        C6496s.g(format, "format(this, *args)");
                        LogWrapperKt.log(logIntent, format);
                    }
                }
            } else {
                StoreProduct inAppStoreProduct = toInAppStoreProduct(hVar);
                if (inAppStoreProduct != null) {
                    arrayList.add(inAppStoreProduct);
                } else {
                    LogIntent logIntent2 = LogIntent.RC_ERROR;
                    String format2 = String.format(PurchaseStrings.INVALID_PRODUCT_NO_PRICE, Arrays.copyOf(new Object[]{hVar.d()}, 1));
                    C6496s.g(format2, "format(this, *args)");
                    LogWrapperKt.log(logIntent2, format2);
                }
            }
        }
        return arrayList;
    }
}
