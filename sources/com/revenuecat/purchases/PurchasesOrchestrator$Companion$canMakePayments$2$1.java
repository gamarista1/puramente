package com.revenuecat.purchases;

import J4.C3037c;
import android.os.Handler;
import com.android.billingclient.api.C3194a;
import com.android.billingclient.api.C3198e;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.google.BillingResultExtensionsKt;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.models.BillingFeature;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/revenuecat/purchases/PurchasesOrchestrator$Companion$canMakePayments$2$1", "LJ4/c;", "Lcom/android/billingclient/api/e;", "billingResult", "Llf/M;", "onBillingSetupFinished", "(Lcom/android/billingclient/api/e;)V", "onBillingServiceDisconnected", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PurchasesOrchestrator$Companion$canMakePayments$2$1 implements C3037c {
    final /* synthetic */ C3194a $billingClient;
    final /* synthetic */ Callback<Boolean> $callback;
    final /* synthetic */ List<BillingFeature> $features;
    final /* synthetic */ AtomicBoolean $hasResponded;
    final /* synthetic */ Handler $mainHandler;

    PurchasesOrchestrator$Companion$canMakePayments$2$1(Handler handler, AtomicBoolean atomicBoolean, Callback<Boolean> callback, C3194a aVar, List<? extends BillingFeature> list) {
        this.$mainHandler = handler;
        this.$hasResponded = atomicBoolean;
        this.$callback = callback;
        this.$billingClient = aVar;
        this.$features = list;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        if (r5.getAndSet(true) == false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        if (r5.getAndSet(true) != false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        com.revenuecat.purchases.common.LogWrapperKt.log(com.revenuecat.purchases.common.LogIntent.GOOGLE_ERROR, com.revenuecat.purchases.strings.PurchaseStrings.EXTRA_CALLBACK_CANMAKEPAYMENTS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r6.onReceived(java.lang.Boolean.FALSE);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void onBillingServiceDisconnected$lambda$2(com.android.billingclient.api.C3194a r4, java.util.concurrent.atomic.AtomicBoolean r5, com.revenuecat.purchases.interfaces.Callback r6) {
        /*
            java.lang.String r0 = "Callback has already been called when checking if device can make payments."
            java.lang.String r1 = "$billingClient"
            kotlin.jvm.internal.C6496s.h(r4, r1)
            java.lang.String r1 = "$hasResponded"
            kotlin.jvm.internal.C6496s.h(r5, r1)
            java.lang.String r1 = "$callback"
            kotlin.jvm.internal.C6496s.h(r6, r1)
            r1 = 1
            r4.c()     // Catch:{ IllegalArgumentException -> 0x0029 }
            boolean r4 = r5.getAndSet(r1)
            if (r4 == 0) goto L_0x0021
        L_0x001b:
            com.revenuecat.purchases.common.LogIntent r4 = com.revenuecat.purchases.common.LogIntent.GOOGLE_ERROR
            com.revenuecat.purchases.common.LogWrapperKt.log(r4, r0)
            goto L_0x004d
        L_0x0021:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r6.onReceived(r4)
            goto L_0x004d
        L_0x0027:
            r4 = move-exception
            goto L_0x004e
        L_0x0029:
            r4 = move-exception
            com.revenuecat.purchases.common.LogIntent r2 = com.revenuecat.purchases.common.LogIntent.GOOGLE_ERROR     // Catch:{ all -> 0x0027 }
            java.lang.String r3 = "Exception received when checking if device can make payments: \n%s."
            java.lang.String r4 = r4.getLocalizedMessage()     // Catch:{ all -> 0x0027 }
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch:{ all -> 0x0027 }
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x0027 }
            java.lang.String r3 = "format(this, *args)"
            kotlin.jvm.internal.C6496s.g(r4, r3)     // Catch:{ all -> 0x0027 }
            com.revenuecat.purchases.common.LogWrapperKt.log(r2, r4)     // Catch:{ all -> 0x0027 }
            boolean r4 = r5.getAndSet(r1)
            if (r4 == 0) goto L_0x0021
            goto L_0x001b
        L_0x004d:
            return
        L_0x004e:
            boolean r5 = r5.getAndSet(r1)
            if (r5 == 0) goto L_0x005a
            com.revenuecat.purchases.common.LogIntent r5 = com.revenuecat.purchases.common.LogIntent.GOOGLE_ERROR
            com.revenuecat.purchases.common.LogWrapperKt.log(r5, r0)
            goto L_0x005f
        L_0x005a:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r6.onReceived(r5)
        L_0x005f:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.PurchasesOrchestrator$Companion$canMakePayments$2$1.onBillingServiceDisconnected$lambda$2(com.android.billingclient.api.a, java.util.concurrent.atomic.AtomicBoolean, com.revenuecat.purchases.interfaces.Callback):void");
    }

    /* access modifiers changed from: private */
    public static final void onBillingSetupFinished$lambda$1(AtomicBoolean atomicBoolean, C3198e eVar, Callback callback, C3194a aVar, List list) {
        boolean z10;
        C6496s.h(atomicBoolean, "$hasResponded");
        C6496s.h(eVar, "$billingResult");
        C6496s.h(callback, "$callback");
        C6496s.h(aVar, "$billingClient");
        C6496s.h(list, "$features");
        if (atomicBoolean.getAndSet(true)) {
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            String format = String.format(PurchaseStrings.EXTRA_CONNECTION_CANMAKEPAYMENTS, Arrays.copyOf(new Object[]{Integer.valueOf(eVar.b())}, 1));
            C6496s.g(format, "format(this, *args)");
            LogWrapperKt.log(logIntent, format);
            return;
        }
        try {
            if (!BillingResultExtensionsKt.isSuccessful(eVar)) {
                callback.onReceived(Boolean.FALSE);
                aVar.c();
                return;
            }
            Iterable iterable = list;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C3198e e10 = aVar.e(((BillingFeature) it.next()).getPlayBillingClientName());
                    C6496s.g(e10, "billingClient.isFeatureS…it.playBillingClientName)");
                    if (!BillingResultExtensionsKt.isSuccessful(e10)) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            aVar.c();
            callback.onReceived(Boolean.valueOf(z10));
        } catch (IllegalArgumentException e11) {
            LogIntent logIntent2 = LogIntent.GOOGLE_ERROR;
            String format2 = String.format(PurchaseStrings.EXCEPTION_CANMAKEPAYMENTS, Arrays.copyOf(new Object[]{e11.getLocalizedMessage()}, 1));
            C6496s.g(format2, "format(this, *args)");
            LogWrapperKt.log(logIntent2, format2);
            callback.onReceived(Boolean.FALSE);
        }
    }

    public void onBillingServiceDisconnected() {
        this.$mainHandler.post(new h(this.$billingClient, this.$hasResponded, this.$callback));
    }

    public void onBillingSetupFinished(C3198e eVar) {
        C6496s.h(eVar, "billingResult");
        this.$mainHandler.post(new i(this.$hasResponded, eVar, this.$callback, this.$billingClient, this.$features));
    }
}
