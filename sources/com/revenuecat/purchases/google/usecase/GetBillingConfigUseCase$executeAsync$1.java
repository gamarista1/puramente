package com.revenuecat.purchases.google.usecase;

import J4.C3041g;
import com.android.billingclient.api.C3194a;
import com.android.billingclient.api.C3196c;
import com.android.billingclient.api.C3198e;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.strings.OfferingStrings;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/a;", "Llf/M;", "invoke", "(Lcom/android/billingclient/api/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class GetBillingConfigUseCase$executeAsync$1 extends C6498u implements C6798l {
    final /* synthetic */ GetBillingConfigUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GetBillingConfigUseCase$executeAsync$1(GetBillingConfigUseCase getBillingConfigUseCase) {
        super(1);
        this.this$0 = getBillingConfigUseCase;
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$0(AtomicBoolean atomicBoolean, GetBillingConfigUseCase getBillingConfigUseCase, C3198e eVar, C3196c cVar) {
        C6496s.h(atomicBoolean, "$hasResponded");
        C6496s.h(getBillingConfigUseCase, "this$0");
        C6496s.h(eVar, "result");
        if (atomicBoolean.getAndSet(true)) {
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            String format = String.format(OfferingStrings.EXTRA_GET_BILLING_CONFIG_RESPONSE, Arrays.copyOf(new Object[]{Integer.valueOf(eVar.b())}, 1));
            C6496s.g(format, "format(this, *args)");
            LogWrapperKt.log(logIntent, format);
            return;
        }
        BillingClientUseCase.processResult$default(getBillingConfigUseCase, eVar, cVar, (C6798l) null, (C6798l) null, 12, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C3194a) obj);
        return C6514M.f71813a;
    }

    public final void invoke(C3194a aVar) {
        C6496s.h(aVar, "$this$invoke");
        aVar.d(C3041g.a().a(), new c(new AtomicBoolean(false), this.this$0));
    }
}
