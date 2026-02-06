package io.intercom.android.sdk.m5.conversation.usecase;

import Xg.x;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import qf.C6658d;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tHB¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/LoadGifUseCase;", "", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "conversationRepository", "<init>", "(Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;)V", "LXg/x;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "clientStateFlow", "", "searchQuery", "Llf/M;", "invoke", "(LXg/x;Ljava/lang/String;Lqf/d;)Ljava/lang/Object;", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LoadGifUseCase {
    public static final int $stable = 8;
    private final ConversationRepository conversationRepository;

    public LoadGifUseCase(ConversationRepository conversationRepository2) {
        C6496s.h(conversationRepository2, "conversationRepository");
        this.conversationRepository = conversationRepository2;
    }

    public static /* synthetic */ Object invoke$default(LoadGifUseCase loadGifUseCase, x xVar, String str, C6658d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        return loadGifUseCase.invoke(xVar, str, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(Xg.x r28, java.lang.String r29, qf.C6658d<? super lf.C6514M> r30) {
        /*
            r27 = this;
            r0 = r27
            r1 = r30
            boolean r2 = r1 instanceof io.intercom.android.sdk.m5.conversation.usecase.LoadGifUseCase$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            io.intercom.android.sdk.m5.conversation.usecase.LoadGifUseCase$invoke$1 r2 = (io.intercom.android.sdk.m5.conversation.usecase.LoadGifUseCase$invoke$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            io.intercom.android.sdk.m5.conversation.usecase.LoadGifUseCase$invoke$1 r2 = new io.intercom.android.sdk.m5.conversation.usecase.LoadGifUseCase$invoke$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = rf.C6680b.f()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L_0x0039
            if (r4 != r5) goto L_0x0031
            java.lang.Object r2 = r2.L$0
            Xg.x r2 = (Xg.x) r2
            lf.w.b(r1)
            goto L_0x004e
        L_0x0031:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0039:
            lf.w.b(r1)
            io.intercom.android.sdk.m5.conversation.data.ConversationRepository r1 = r0.conversationRepository
            r4 = r28
            r2.L$0 = r4
            r2.label = r5
            r5 = r29
            java.lang.Object r1 = r1.loadGifs(r5, r2)
            if (r1 != r3) goto L_0x004d
            return r3
        L_0x004d:
            r2 = r4
        L_0x004e:
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r1 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r1
            boolean r3 = r1 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ClientError
            if (r3 != 0) goto L_0x007e
            boolean r3 = r1 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.NetworkError
            if (r3 != 0) goto L_0x007e
            boolean r3 = r1 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ServerError
            if (r3 == 0) goto L_0x005d
            goto L_0x007e
        L_0x005d:
            boolean r3 = r1 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success
            if (r3 == 0) goto L_0x0078
            io.intercom.android.sdk.m5.conversation.states.BottomSheetState$GifSearch r3 = new io.intercom.android.sdk.m5.conversation.states.BottomSheetState$GifSearch
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$Success r1 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success) r1
            java.lang.Object r1 = r1.getBody()
            io.intercom.android.sdk.models.GifResponse r1 = (io.intercom.android.sdk.models.GifResponse) r1
            java.util.List r1 = r1.results()
            java.lang.String r4 = "results(...)"
            kotlin.jvm.internal.C6496s.g(r1, r4)
            r3.<init>(r1)
            goto L_0x0087
        L_0x0078:
            lf.s r1 = new lf.s
            r1.<init>()
            throw r1
        L_0x007e:
            io.intercom.android.sdk.m5.conversation.states.BottomSheetState$GifSearch r3 = new io.intercom.android.sdk.m5.conversation.states.BottomSheetState$GifSearch
            java.util.List r1 = mf.C6565s.n()
            r3.<init>(r1)
        L_0x0087:
            java.lang.Object r1 = r2.getValue()
            r4 = r1
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r4 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r4
            r25 = 1048543(0xfffdf, float:1.469322E-39)
            r26 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r10 = r3
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r4 = io.intercom.android.sdk.m5.conversation.states.ConversationClientState.copy$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r1 = r2.e(r1, r4)
            if (r1 == 0) goto L_0x0087
            lf.M r1 = lf.C6514M.f71813a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.LoadGifUseCase.invoke(Xg.x, java.lang.String, qf.d):java.lang.Object");
    }
}
