package com.revenuecat.purchases.identity;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.strings.IdentityStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Llf/M;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class IdentityManager$logOut$1 extends C6498u implements C6787a {
    final /* synthetic */ C6798l $completion;
    final /* synthetic */ IdentityManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    IdentityManager$logOut$1(IdentityManager identityManager, C6798l lVar) {
        super(0);
        this.this$0 = identityManager;
        this.$completion = lVar;
    }

    public final void invoke() {
        IdentityManager identityManager = this.this$0;
        identityManager.resetAndSaveUserID(identityManager.generateRandomID());
        LogWrapperKt.log(LogIntent.USER, IdentityStrings.LOG_OUT_SUCCESSFUL);
        this.$completion.invoke((Object) null);
    }
}
