package com.revenuecat.purchases.common.offerings;

import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.strings.OfferingStrings;
import gh.C5986j;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import org.json.JSONException;
import org.json.JSONObject;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "productsById", "Llf/M;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class OfferingsFactory$createOfferings$1 extends C6498u implements C6798l {
    final /* synthetic */ Set<String> $allRequestedProductIdentifiers;
    final /* synthetic */ JSONObject $offeringsJSON;
    final /* synthetic */ C6798l $onError;
    final /* synthetic */ C6798l $onSuccess;
    final /* synthetic */ OfferingsFactory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OfferingsFactory$createOfferings$1(OfferingsFactory offeringsFactory, Set<String> set, JSONObject jSONObject, C6798l lVar, C6798l lVar2) {
        super(1);
        this.this$0 = offeringsFactory;
        this.$allRequestedProductIdentifiers = set;
        this.$offeringsJSON = jSONObject;
        this.$onError = lVar;
        this.$onSuccess = lVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map<String, ? extends List<? extends StoreProduct>>) (Map) obj);
        return C6514M.f71813a;
    }

    public final void invoke(Map<String, ? extends List<? extends StoreProduct>> map) {
        C6496s.h(map, "productsById");
        try {
            C6514M unused = this.this$0.logMissingProducts(this.$allRequestedProductIdentifiers, map);
            Offerings createOfferings = this.this$0.offeringParser.createOfferings(this.$offeringsJSON, map);
            if (createOfferings.getAll().isEmpty()) {
                this.$onError.invoke(new PurchasesError(PurchasesErrorCode.ConfigurationError, OfferingStrings.CONFIGURATION_ERROR_PRODUCTS_NOT_FOUND));
                return;
            }
            String format = String.format(OfferingStrings.CREATED_OFFERINGS, Arrays.copyOf(new Object[]{createOfferings}, 1));
            C6496s.g(format, "format(this, *args)");
            LogUtilsKt.verboseLog(format);
            this.$onSuccess.invoke(createOfferings);
        } catch (Exception e10) {
            if (e10 instanceof JSONException ? true : e10 instanceof C5986j) {
                LogIntent logIntent = LogIntent.RC_ERROR;
                String format2 = String.format(OfferingStrings.JSON_EXCEPTION_ERROR, Arrays.copyOf(new Object[]{e10.getLocalizedMessage()}, 1));
                C6496s.g(format2, "format(this, *args)");
                LogWrapperKt.log(logIntent, format2);
                this.$onError.invoke(new PurchasesError(PurchasesErrorCode.UnexpectedBackendResponseError, e10.getLocalizedMessage()));
                return;
            }
            throw e10;
        }
    }
}
