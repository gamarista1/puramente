package com.revenuecat.purchases.amazon;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6502A;
import lf.C6514M;
import mf.O;
import org.json.JSONObject;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "response", "Llf/M;", "invoke", "(Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class AmazonBilling$normalizePurchaseData$2 extends C6498u implements C6798l {
    final /* synthetic */ C6798l $onError;
    final /* synthetic */ C6798l $onSuccess;
    final /* synthetic */ String $purchaseToken;
    final /* synthetic */ AmazonBilling this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AmazonBilling$normalizePurchaseData$2(AmazonBilling amazonBilling, C6798l lVar, String str, C6798l lVar2) {
        super(1);
        this.this$0 = amazonBilling;
        this.$onError = lVar;
        this.$purchaseToken = str;
        this.$onSuccess = lVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((JSONObject) obj);
        return C6514M.f71813a;
    }

    public final void invoke(JSONObject jSONObject) {
        C6496s.h(jSONObject, "response");
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AmazonStrings.RECEIPT_DATA_RECEIVED, Arrays.copyOf(new Object[]{jSONObject.toString()}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        String access$getTermSkuFromJSON = this.this$0.getTermSkuFromJSON(jSONObject);
        if (access$getTermSkuFromJSON == null) {
            this.$onError.invoke(ErrorsKt.missingTermSkuError(jSONObject));
            return;
        }
        this.this$0.cache.cacheSkusByToken(O.f(C6502A.a(this.$purchaseToken, access$getTermSkuFromJSON)));
        this.$onSuccess.invoke(access$getTermSkuFromJSON);
    }
}
