package io.intercom.android.sdk.m5.conversation.usecase;

import Xg.x;
import io.intercom.android.sdk.models.Avatar;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.m5.conversation.usecase.ShowAdminIsTypingUseCase", f = "ShowAdminIsTypingUseCase.kt", l = {49}, m = "sendAdminIndicator")
final class ShowAdminIsTypingUseCase$sendAdminIndicator$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ShowAdminIsTypingUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ShowAdminIsTypingUseCase$sendAdminIndicator$1(ShowAdminIsTypingUseCase showAdminIsTypingUseCase, C6658d<? super ShowAdminIsTypingUseCase$sendAdminIndicator$1> dVar) {
        super(dVar);
        this.this$0 = showAdminIsTypingUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.sendAdminIndicator((x) null, (Avatar) null, false, false, this);
    }
}
