package io.intercom.android.sdk.m5.home;

import Ug.K;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import qf.C6658d;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.home.HomeViewModel$fetchHomeData$1", f = "HomeViewModel.kt", l = {115, 116}, m = "invokeSuspend")
final class HomeViewModel$fetchHomeData$1 extends l implements p {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HomeViewModel$fetchHomeData$1(HomeViewModel homeViewModel, C6658d<? super HomeViewModel$fetchHomeData$1> dVar) {
        super(2, dVar);
        this.this$0 = homeViewModel;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        HomeViewModel$fetchHomeData$1 homeViewModel$fetchHomeData$1 = new HomeViewModel$fetchHomeData$1(this.this$0, dVar);
        homeViewModel$fetchHomeData$1.L$0 = obj;
        return homeViewModel$fetchHomeData$1;
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((HomeViewModel$fetchHomeData$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = rf.C6680b.f()
            int r1 = r11.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0029
            if (r1 == r4) goto L_0x0020
            if (r1 != r3) goto L_0x0018
            java.lang.Object r0 = r11.L$0
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r0 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r0
            lf.w.b(r12)
            r6 = r0
            goto L_0x006a
        L_0x0018:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0020:
            java.lang.Object r1 = r11.L$0
            Ug.K r1 = (Ug.K) r1
            lf.w.b(r12)
        L_0x0027:
            r4 = r1
            goto L_0x004c
        L_0x0029:
            lf.w.b(r12)
            java.lang.Object r12 = r11.L$0
            r1 = r12
            Ug.K r1 = (Ug.K) r1
            io.intercom.android.sdk.m5.home.HomeViewModel$fetchHomeData$1$homeResponse$1 r8 = new io.intercom.android.sdk.m5.home.HomeViewModel$fetchHomeData$1$homeResponse$1
            io.intercom.android.sdk.m5.home.HomeViewModel r12 = r11.this$0
            r8.<init>(r12, r2)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            r5 = r1
            Ug.S r12 = Ug.C5576k.b(r5, r6, r7, r8, r9, r10)
            r11.L$0 = r1
            r11.label = r4
            java.lang.Object r12 = r12.y(r11)
            if (r12 != r0) goto L_0x0027
            return r0
        L_0x004c:
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r12 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r12
            io.intercom.android.sdk.m5.home.HomeViewModel$fetchHomeData$1$openMessengerResponseData$1 r7 = new io.intercom.android.sdk.m5.home.HomeViewModel$fetchHomeData$1$openMessengerResponseData$1
            io.intercom.android.sdk.m5.home.HomeViewModel r1 = r11.this$0
            r7.<init>(r1, r2)
            r8 = 3
            r9 = 0
            r5 = 0
            r6 = 0
            Ug.S r1 = Ug.C5576k.b(r4, r5, r6, r7, r8, r9)
            r11.L$0 = r12
            r11.label = r3
            java.lang.Object r1 = r1.y(r11)
            if (r1 != r0) goto L_0x0068
            return r0
        L_0x0068:
            r6 = r12
            r12 = r1
        L_0x006a:
            io.intercom.android.sdk.models.OpenMessengerResponse r12 = (io.intercom.android.sdk.models.OpenMessengerResponse) r12
            io.intercom.android.sdk.m5.home.HomeViewModel r0 = r11.this$0
            Xg.x r7 = r0.clientState
        L_0x0072:
            java.lang.Object r8 = r7.getValue()
            r0 = r8
            io.intercom.android.sdk.m5.home.states.HomeClientState r0 = (io.intercom.android.sdk.m5.home.states.HomeClientState) r0
            r4 = 4
            r5 = 0
            r3 = 0
            r1 = r6
            r2 = r12
            io.intercom.android.sdk.m5.home.states.HomeClientState r0 = io.intercom.android.sdk.m5.home.states.HomeClientState.copy$default(r0, r1, r2, r3, r4, r5)
            boolean r0 = r7.e(r8, r0)
            if (r0 == 0) goto L_0x0072
            boolean r12 = r6 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success
            if (r12 == 0) goto L_0x00d3
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$Success r6 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success) r6
            java.lang.Object r12 = r6.getBody()
            io.intercom.android.sdk.m5.home.data.HomeV2Response r12 = (io.intercom.android.sdk.m5.home.data.HomeV2Response) r12
            java.util.List r12 = r12.getCards()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x00a3:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x00b5
            java.lang.Object r1 = r12.next()
            boolean r2 = r1 instanceof io.intercom.android.sdk.m5.home.data.HomeCards.HomeRecentConversationData
            if (r2 == 0) goto L_0x00a3
            r0.add(r1)
            goto L_0x00a3
        L_0x00b5:
            io.intercom.android.sdk.m5.home.HomeViewModel r12 = r11.this$0
            java.util.Iterator r0 = r0.iterator()
        L_0x00bb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00d3
            java.lang.Object r1 = r0.next()
            io.intercom.android.sdk.m5.home.data.HomeCards$HomeRecentConversationData r1 = (io.intercom.android.sdk.m5.home.data.HomeCards.HomeRecentConversationData) r1
            java.util.List r1 = r1.getConversations()
            io.intercom.android.sdk.m5.data.IntercomDataLayer r2 = r12.intercomDataLayer
            r2.addConversations(r1)
            goto L_0x00bb
        L_0x00d3:
            lf.M r12 = lf.C6514M.f71813a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.home.HomeViewModel$fetchHomeData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
