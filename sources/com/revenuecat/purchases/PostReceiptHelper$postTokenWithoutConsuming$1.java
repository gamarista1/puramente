package com.revenuecat.purchases;

import com.revenuecat.purchases.common.networking.PostReceiptResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "postReceiptResponse", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PostReceiptHelper$postTokenWithoutConsuming$1 extends C6498u implements C6798l {
    final /* synthetic */ C6798l $onSuccess;
    final /* synthetic */ String $purchaseToken;
    final /* synthetic */ PostReceiptHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PostReceiptHelper$postTokenWithoutConsuming$1(PostReceiptHelper postReceiptHelper, String str, C6798l lVar) {
        super(1);
        this.this$0 = postReceiptHelper;
        this.$purchaseToken = str;
        this.$onSuccess = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PostReceiptResponse) obj);
        return C6514M.f71813a;
    }

    public final void invoke(PostReceiptResponse postReceiptResponse) {
        C6496s.h(postReceiptResponse, "postReceiptResponse");
        this.this$0.deviceCache.addSuccessfullyPostedToken(this.$purchaseToken);
        this.$onSuccess.invoke(postReceiptResponse.getCustomerInfo());
    }
}
