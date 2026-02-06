package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import Y.C1500m;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.C6787a;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$PrivacyPolicyKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$PrivacyPolicyKt$lambda1$1 implements p {
    public static final ComposableSingletons$PrivacyPolicyKt$lambda1$1 INSTANCE = new ComposableSingletons$PrivacyPolicyKt$lambda1$1();

    ComposableSingletons$PrivacyPolicyKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            PrivacyPolicyKt.PrivacyPolicy("By chatting with us, you agree to the monitoring and recording of this chat to improve its service as described in our <a href=\"https://google.com\" rel=\"nofollow noopener noreferrer\" target=\"_blank\">Privacy Policy</a>", (i) null, (C6787a) null, mVar, 6, 6);
        } else {
            mVar.I();
        }
    }
}
