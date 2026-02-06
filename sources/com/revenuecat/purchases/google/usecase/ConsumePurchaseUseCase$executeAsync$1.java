package com.revenuecat.purchases.google.usecase;

import J4.C3039e;
import com.android.billingclient.api.C3194a;
import com.android.billingclient.api.C3198e;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/a;", "Llf/M;", "invoke", "(Lcom/android/billingclient/api/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class ConsumePurchaseUseCase$executeAsync$1 extends C6498u implements C6798l {
    final /* synthetic */ ConsumePurchaseUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConsumePurchaseUseCase$executeAsync$1(ConsumePurchaseUseCase consumePurchaseUseCase) {
        super(1);
        this.this$0 = consumePurchaseUseCase;
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$0(ConsumePurchaseUseCase consumePurchaseUseCase, C3198e eVar, String str) {
        C6496s.h(consumePurchaseUseCase, "this$0");
        C6496s.h(eVar, "billingResult");
        C6496s.h(str, "purchaseToken");
        BillingClientUseCase.processResult$default(consumePurchaseUseCase, eVar, str, (C6798l) null, new ConsumePurchaseUseCase$executeAsync$1$1$1(consumePurchaseUseCase), 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C3194a) obj);
        return C6514M.f71813a;
    }

    public final void invoke(C3194a aVar) {
        C6496s.h(aVar, "$this$invoke");
        C3039e a10 = C3039e.b().b(this.this$0.useCaseParams.getPurchaseToken()).a();
        C6496s.g(a10, "newBuilder()\n           …\n                .build()");
        aVar.b(a10, new b(this.this$0));
    }
}
