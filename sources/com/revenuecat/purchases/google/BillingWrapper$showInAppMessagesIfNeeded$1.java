package com.revenuecat.purchases.google;

import J4.C3043i;
import android.app.Activity;
import com.android.billingclient.api.C3194a;
import com.android.billingclient.api.C3199f;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.strings.BillingStrings;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class BillingWrapper$showInAppMessagesIfNeeded$1 extends C6498u implements C6798l {
    final /* synthetic */ C3199f $inAppMessageParams;
    final /* synthetic */ C6787a $subscriptionStatusChange;
    final /* synthetic */ WeakReference<Activity> $weakActivity;
    final /* synthetic */ BillingWrapper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BillingWrapper$showInAppMessagesIfNeeded$1(BillingWrapper billingWrapper, WeakReference<Activity> weakReference, C3199f fVar, C6787a aVar) {
        super(1);
        this.this$0 = billingWrapper;
        this.$weakActivity = weakReference;
        this.$inAppMessageParams = fVar;
        this.$subscriptionStatusChange = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return C6514M.f71813a;
    }

    public final void invoke(PurchasesError purchasesError) {
        if (purchasesError != null) {
            String format = String.format(BillingStrings.BILLING_CONNECTION_ERROR_INAPP_MESSAGES, Arrays.copyOf(new Object[]{purchasesError}, 1));
            C6496s.g(format, "format(this, *args)");
            LogUtilsKt.errorLog$default(format, (Throwable) null, 2, (Object) null);
            return;
        }
        BillingWrapper billingWrapper = this.this$0;
        final WeakReference<Activity> weakReference = this.$weakActivity;
        final C3199f fVar = this.$inAppMessageParams;
        final C6787a aVar = this.$subscriptionStatusChange;
        billingWrapper.withConnectedClient(new C6798l() {
            /* access modifiers changed from: private */
            public static final void invoke$lambda$1(C6787a aVar, C3043i iVar) {
                C6496s.h(aVar, "$subscriptionStatusChange");
                C6496s.h(iVar, "inAppMessageResult");
                int a10 = iVar.a();
                if (a10 == 0) {
                    LogUtilsKt.verboseLog(BillingStrings.BILLING_INAPP_MESSAGE_NONE);
                } else if (a10 != 1) {
                    String format = String.format(BillingStrings.BILLING_INAPP_MESSAGE_UNEXPECTED_CODE, Arrays.copyOf(new Object[]{Integer.valueOf(a10)}, 1));
                    C6496s.g(format, "format(this, *args)");
                    LogUtilsKt.errorLog$default(format, (Throwable) null, 2, (Object) null);
                } else {
                    LogUtilsKt.debugLog(BillingStrings.BILLING_INAPP_MESSAGE_UPDATE);
                    aVar.invoke();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C3194a) obj);
                return C6514M.f71813a;
            }

            public final void invoke(C3194a aVar) {
                C6496s.h(aVar, "$this$withConnectedClient");
                Activity activity = weakReference.get();
                if (activity == null) {
                    LogUtilsKt.debugLog("Activity is null, not showing Google Play in-app message.");
                } else {
                    aVar.l(activity, fVar, new g(aVar));
                }
            }
        });
    }
}
