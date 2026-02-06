package com.revenuecat.purchases.subscriberattributes;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.C6565s;
import org.json.JSONObject;
import yf.C6787a;
import yf.q;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "", "responseCode", "Lorg/json/JSONObject;", "body", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;ILorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class SubscriberAttributesPoster$postSubscriberAttributes$2 extends C6498u implements q {
    final /* synthetic */ q $onErrorHandler;
    final /* synthetic */ C6787a $onSuccessHandler;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SubscriberAttributesPoster$postSubscriberAttributes$2(C6787a aVar, q qVar) {
        super(3);
        this.$onSuccessHandler = aVar;
        this.$onErrorHandler = qVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((PurchasesError) obj, ((Number) obj2).intValue(), (JSONObject) obj3);
        return C6514M.f71813a;
    }

    public final void invoke(PurchasesError purchasesError, int i10, JSONObject jSONObject) {
        C6514M m10;
        C6496s.h(jSONObject, "body");
        if (purchasesError != null) {
            q qVar = this.$onErrorHandler;
            boolean isServerError = RCHTTPStatusCodes.INSTANCE.isServerError(i10);
            boolean z10 = false;
            boolean z11 = i10 == 404;
            if (!isServerError && !z11) {
                z10 = true;
            }
            List<SubscriberAttributeError> n10 = C6565s.n();
            if (purchasesError.getCode() == PurchasesErrorCode.InvalidSubscriberAttributesError) {
                n10 = BackendHelpersKt.getAttributeErrors(jSONObject);
            }
            qVar.invoke(purchasesError, Boolean.valueOf(z10), n10);
            m10 = C6514M.f71813a;
        } else {
            m10 = null;
        }
        if (m10 == null) {
            this.$onSuccessHandler.invoke();
        }
    }
}
