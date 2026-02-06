package com.revenuecat.purchases.amazon;

import com.amazon.a.a.o.b;
import com.amazon.device.iap.model.Receipt;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.L;
import lf.C6514M;
import org.json.JSONObject;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "response", "Llf/M;", "invoke", "(Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class AmazonBilling$getMissingSkusForReceipts$1$1 extends C6498u implements C6798l {
    final /* synthetic */ Map<String, PurchasesError> $errorMap;
    final /* synthetic */ p $onCompletion;
    final /* synthetic */ Receipt $receipt;
    final /* synthetic */ L $receiptsLeft;
    final /* synthetic */ Map<String, String> $successMap;
    final /* synthetic */ AmazonBilling this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AmazonBilling$getMissingSkusForReceipts$1$1(Map<String, String> map, Receipt receipt, L l10, AmazonBilling amazonBilling, p pVar, Map<String, PurchasesError> map2) {
        super(1);
        this.$successMap = map;
        this.$receipt = receipt;
        this.$receiptsLeft = l10;
        this.this$0 = amazonBilling;
        this.$onCompletion = pVar;
        this.$errorMap = map2;
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
        Map<String, String> map = this.$successMap;
        String receiptId = this.$receipt.getReceiptId();
        C6496s.g(receiptId, "receipt.receiptId");
        Object obj = jSONObject.get(b.f37454L);
        C6496s.f(obj, "null cannot be cast to non-null type kotlin.String");
        map.put(receiptId, (String) obj);
        L l10 = this.$receiptsLeft;
        int i10 = l10.f71757a - 1;
        l10.f71757a = i10;
        if (i10 == 0) {
            this.this$0.cache.cacheSkusByToken(this.$successMap);
            this.$onCompletion.invoke(this.$successMap, this.$errorMap);
        }
    }
}
