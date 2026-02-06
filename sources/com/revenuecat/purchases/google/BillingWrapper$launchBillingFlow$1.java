package com.revenuecat.purchases.google;

import android.app.Activity;
import com.android.billingclient.api.C3194a;
import com.android.billingclient.api.C3197d;
import com.android.billingclient.api.C3198e;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.strings.BillingStrings;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/a;", "Llf/M;", "invoke", "(Lcom/android/billingclient/api/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class BillingWrapper$launchBillingFlow$1 extends C6498u implements C6798l {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ C3197d $params;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BillingWrapper$launchBillingFlow$1(Activity activity, C3197d dVar) {
        super(1);
        this.$activity = activity;
        this.$params = dVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C3194a) obj);
        return C6514M.f71813a;
    }

    public final void invoke(C3194a aVar) {
        C6496s.h(aVar, "$this$withConnectedClient");
        C3198e g10 = aVar.g(this.$activity, this.$params);
        if (g10.b() == 0) {
            g10 = null;
        }
        if (g10 != null) {
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            String format = String.format(BillingStrings.BILLING_INTENT_FAILED, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(g10)}, 1));
            C6496s.g(format, "format(this, *args)");
            LogWrapperKt.log(logIntent, format);
        }
    }
}
