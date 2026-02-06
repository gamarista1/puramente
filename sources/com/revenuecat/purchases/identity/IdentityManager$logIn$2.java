package com.revenuecat.purchases.identity;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.strings.IdentityStrings;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Llf/M;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class IdentityManager$logIn$2 extends C6498u implements C6787a {
    final /* synthetic */ String $newAppUserID;
    final /* synthetic */ String $oldAppUserID;
    final /* synthetic */ C6798l $onError;
    final /* synthetic */ p $onSuccess;
    final /* synthetic */ IdentityManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    IdentityManager$logIn$2(IdentityManager identityManager, String str, String str2, C6798l lVar, p pVar) {
        super(0);
        this.this$0 = identityManager;
        this.$oldAppUserID = str;
        this.$newAppUserID = str2;
        this.$onError = lVar;
        this.$onSuccess = pVar;
    }

    public final void invoke() {
        Backend access$getBackend$p = this.this$0.backend;
        final String str = this.$oldAppUserID;
        final String str2 = this.$newAppUserID;
        final IdentityManager identityManager = this.this$0;
        final p pVar = this.$onSuccess;
        access$getBackend$p.logIn(str, str2, new p() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((CustomerInfo) obj, ((Boolean) obj2).booleanValue());
                return C6514M.f71813a;
            }

            public final void invoke(CustomerInfo customerInfo, boolean z10) {
                C6496s.h(customerInfo, "customerInfo");
                IdentityManager identityManager = identityManager;
                String str = str2;
                String str2 = str;
                synchronized (identityManager) {
                    LogIntent logIntent = LogIntent.USER;
                    String format = String.format(IdentityStrings.LOG_IN_SUCCESSFUL, Arrays.copyOf(new Object[]{str, Boolean.valueOf(z10)}, 2));
                    C6496s.g(format, "format(this, *args)");
                    LogWrapperKt.log(logIntent, format);
                    identityManager.deviceCache.clearCachesForAppUserID(str2);
                    identityManager.offeringsCache.clearCache();
                    identityManager.subscriberAttributesCache.clearSubscriberAttributesIfSyncedForSubscriber(str2);
                    identityManager.deviceCache.cacheAppUserID(str);
                    identityManager.deviceCache.cacheCustomerInfo(str, customerInfo);
                    identityManager.copySubscriberAttributesToNewUserIfOldIsAnonymous(str2, str);
                    identityManager.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
                    C6514M m10 = C6514M.f71813a;
                }
                pVar.invoke(customerInfo, Boolean.valueOf(z10));
            }
        }, this.$onError);
    }
}
