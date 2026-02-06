package io.intercom.android.sdk.m5.inbox;

import io.intercom.android.sdk.models.EmptyState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import qf.C6658d;
import yf.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/intercom/android/sdk/models/EmptyState;", "it", "Llf/M;", "<anonymous>", "(Lio/intercom/android/sdk/models/EmptyState;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.inbox.InboxViewModel$inboxPagingData$1$1", f = "InboxViewModel.kt", l = {55}, m = "invokeSuspend")
final class InboxViewModel$inboxPagingData$1$1 extends l implements p {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InboxViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InboxViewModel$inboxPagingData$1$1(InboxViewModel inboxViewModel, C6658d<? super InboxViewModel$inboxPagingData$1$1> dVar) {
        super(2, dVar);
        this.this$0 = inboxViewModel;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        InboxViewModel$inboxPagingData$1$1 inboxViewModel$inboxPagingData$1$1 = new InboxViewModel$inboxPagingData$1$1(this.this$0, dVar);
        inboxViewModel$inboxPagingData$1$1.L$0 = obj;
        return inboxViewModel$inboxPagingData$1$1;
    }

    public final Object invoke(EmptyState emptyState, C6658d<? super C6514M> dVar) {
        return ((InboxViewModel$inboxPagingData$1$1) create(emptyState, dVar)).invokeSuspend(C6514M.f71813a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: io.intercom.android.sdk.models.EmptyState} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = rf.C6680b.f()
            int r1 = r8.label
            r2 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 != r2) goto L_0x0018
            java.lang.Object r0 = r8.L$1
            io.intercom.android.sdk.m5.inbox.InboxViewModel r0 = (io.intercom.android.sdk.m5.inbox.InboxViewModel) r0
            java.lang.Object r1 = r8.L$0
            io.intercom.android.sdk.models.EmptyState r1 = (io.intercom.android.sdk.models.EmptyState) r1
            lf.w.b(r9)
            r7 = r1
            goto L_0x004c
        L_0x0018:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0020:
            lf.w.b(r9)
            java.lang.Object r9 = r8.L$0
            r1 = r9
            io.intercom.android.sdk.models.EmptyState r1 = (io.intercom.android.sdk.models.EmptyState) r1
            io.intercom.android.sdk.m5.inbox.InboxViewModel r9 = r8.this$0
            io.intercom.android.sdk.models.EmptyState$Companion r3 = io.intercom.android.sdk.models.EmptyState.Companion
            io.intercom.android.sdk.models.EmptyState r3 = r3.getNULL()
            boolean r3 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r3 != 0) goto L_0x0080
            io.intercom.android.sdk.m5.inbox.InboxViewModel r3 = r8.this$0
            io.intercom.android.sdk.m5.data.CommonRepository r3 = r3.commonRepository
            r8.L$0 = r1
            r8.L$1 = r9
            r8.label = r2
            java.lang.Object r2 = r3.openMessenger(r8)
            if (r2 != r0) goto L_0x0049
            return r0
        L_0x0049:
            r0 = r9
            r7 = r1
            r9 = r2
        L_0x004c:
            io.intercom.android.sdk.models.OpenMessengerResponse r9 = (io.intercom.android.sdk.models.OpenMessengerResponse) r9
            if (r9 == 0) goto L_0x0062
            io.intercom.android.sdk.models.OpenMessengerResponse$NewConversationData r9 = r9.getNewConversationData()
            if (r9 == 0) goto L_0x0062
            io.intercom.android.sdk.models.OpenMessengerResponse$NewConversationData$Cta r9 = r9.getCta()
            if (r9 == 0) goto L_0x0062
            java.lang.String r9 = r9.getText()
        L_0x0060:
            r3 = r9
            goto L_0x0064
        L_0x0062:
            r9 = 0
            goto L_0x0060
        L_0x0064:
            if (r3 == 0) goto L_0x007e
            io.intercom.android.sdk.models.EmptyState$Action r1 = r7.getAction()
            r5 = 5
            r6 = 0
            r2 = 0
            r4 = 0
            io.intercom.android.sdk.models.EmptyState$Action r4 = io.intercom.android.sdk.models.EmptyState.Action.copy$default(r1, r2, r3, r4, r5, r6)
            r5 = 3
            r3 = 0
            r1 = r7
            io.intercom.android.sdk.models.EmptyState r1 = io.intercom.android.sdk.models.EmptyState.copy$default(r1, r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x007c
            goto L_0x007e
        L_0x007c:
            r9 = r0
            goto L_0x0080
        L_0x007e:
            r9 = r0
            r1 = r7
        L_0x0080:
            r9.emptyState = r1
            lf.M r9 = lf.C6514M.f71813a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.inbox.InboxViewModel$inboxPagingData$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
