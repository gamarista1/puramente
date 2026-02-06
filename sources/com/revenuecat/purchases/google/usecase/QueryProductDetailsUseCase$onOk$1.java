package com.revenuecat.purchases.google.usecase;

import com.android.billingclient.api.C3201h;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/android/billingclient/api/h;", "it", "", "invoke", "(Lcom/android/billingclient/api/h;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class QueryProductDetailsUseCase$onOk$1 extends C6498u implements C6798l {
    public static final QueryProductDetailsUseCase$onOk$1 INSTANCE = new QueryProductDetailsUseCase$onOk$1();

    QueryProductDetailsUseCase$onOk$1() {
        super(1);
    }

    public final CharSequence invoke(C3201h hVar) {
        C6496s.h(hVar, "it");
        String hVar2 = hVar.toString();
        C6496s.g(hVar2, "it.toString()");
        return hVar2;
    }
}
