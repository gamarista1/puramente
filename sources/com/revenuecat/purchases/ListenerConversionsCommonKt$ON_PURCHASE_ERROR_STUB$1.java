package com.revenuecat.purchases;

import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1 extends C6498u implements p {
    public static final ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1 INSTANCE = new ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1();

    ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1() {
        super(2);
    }

    public final void invoke(PurchasesError purchasesError, boolean z10) {
        C6496s.h(purchasesError, "<anonymous parameter 0>");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
        return C6514M.f71813a;
    }
}
