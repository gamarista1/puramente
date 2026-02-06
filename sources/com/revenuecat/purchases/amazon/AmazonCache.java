package com.revenuecat.purchases.amazon;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.Arrays;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6531o;
import mf.O;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u001b\u0010\u0016\u001a\u00020\u00078@X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/revenuecat/purchases/amazon/AmazonCache;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;)V", "", "", "receiptsToSkus", "Llf/M;", "cacheSkusByToken", "(Ljava/util/Map;)V", "getReceiptSkus", "()Ljava/util/Map;", "token", "addSuccessfullyPostedToken", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "amazonPostedTokensKey$delegate", "Lkotlin/Lazy;", "getAmazonPostedTokensKey$purchases_defaultsRelease", "()Ljava/lang/String;", "amazonPostedTokensKey", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AmazonCache {
    private final Lazy amazonPostedTokensKey$delegate = C6531o.b(new AmazonCache$amazonPostedTokensKey$2(this));
    /* access modifiers changed from: private */
    public final DeviceCache deviceCache;

    public AmazonCache(DeviceCache deviceCache2) {
        C6496s.h(deviceCache2, "deviceCache");
        this.deviceCache = deviceCache2;
    }

    public final synchronized void addSuccessfullyPostedToken(String str) {
        C6496s.h(str, "token");
        this.deviceCache.addSuccessfullyPostedToken(str);
    }

    public final synchronized void cacheSkusByToken(Map<String, String> map) {
        C6496s.h(map, "receiptsToSkus");
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AmazonStrings.CACHING_RECEIPT_TERM_SKUS, Arrays.copyOf(new Object[]{map}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        JSONObject jSONObject = new JSONObject(O.p(getReceiptSkus(), map));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("receiptsToSkus", jSONObject);
        DeviceCache deviceCache2 = this.deviceCache;
        String amazonPostedTokensKey$purchases_defaultsRelease = getAmazonPostedTokensKey$purchases_defaultsRelease();
        String jSONObject3 = jSONObject2.toString();
        C6496s.g(jSONObject3, "jsonToCache.toString()");
        deviceCache2.putString(amazonPostedTokensKey$purchases_defaultsRelease, jSONObject3);
    }

    public final String getAmazonPostedTokensKey$purchases_defaultsRelease() {
        return (String) this.amazonPostedTokensKey$delegate.getValue();
    }

    public final synchronized Map<String, String> getReceiptSkus() {
        JSONObject jSONObject;
        Map<String, String> map;
        try {
            JSONObject jSONObjectOrNull = this.deviceCache.getJSONObjectOrNull(getAmazonPostedTokensKey$purchases_defaultsRelease());
            if (jSONObjectOrNull != null) {
                jSONObject = jSONObjectOrNull.getJSONObject("receiptsToSkus");
            } else {
                jSONObject = null;
            }
            if (jSONObject == null || (map = JSONObjectExtensionsKt.toMap$default(jSONObject, false, 1, (Object) null)) == null) {
                map = O.i();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return map;
    }
}
