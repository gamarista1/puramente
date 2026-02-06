package com.revenuecat.purchases.amazon;

import com.revenuecat.purchases.common.OfferingParser;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u00062\u0006\u0010\t\u001a\u00020\nH\u0014¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/amazon/AmazonOfferingParser;", "Lcom/revenuecat/purchases/common/OfferingParser;", "()V", "findMatchingProduct", "Lcom/revenuecat/purchases/models/StoreProduct;", "productsById", "", "", "", "packageJson", "Lorg/json/JSONObject;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AmazonOfferingParser extends OfferingParser {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f59461a = 0;

    /* access modifiers changed from: protected */
    public StoreProduct findMatchingProduct(Map<String, ? extends List<? extends StoreProduct>> map, JSONObject jSONObject) {
        C6496s.h(map, "productsById");
        C6496s.h(jSONObject, "packageJson");
        List list = (List) map.get(jSONObject.getString("platform_product_identifier"));
        if (list != null) {
            return (StoreProduct) C6565s.q0(list);
        }
        return null;
    }
}
