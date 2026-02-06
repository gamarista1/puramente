package io.intercom.android.sdk.m5.conversation.ui;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState$Error;", "state", "Lkotlin/Function0;", "Llf/M;", "onRetryClick", "Lk0/i;", "modifier", "ConversationErrorScreen", "(Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState$Error;Lyf/a;Lk0/i;LY/m;II)V", "ConversationErrorScreenPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConversationErrorScreenKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: k0.i$a} */
    /* JADX WARNING: type inference failed for: r1v3, types: [io.intercom.android.sdk.m5.components.ErrorState] */
    /* JADX WARNING: type inference failed for: r13v1, types: [io.intercom.android.sdk.m5.components.ErrorState$WithoutCTA] */
    /* JADX WARNING: type inference failed for: r3v4, types: [io.intercom.android.sdk.m5.components.ErrorState$WithCTA] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void ConversationErrorScreen(io.intercom.android.sdk.m5.conversation.states.ConversationUiState.Error r19, yf.C6787a r20, k0.i r21, Y.C1500m r22, int r23, int r24) {
        /*
            java.lang.String r0 = "state"
            r2 = r19
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "onRetryClick"
            r11 = r20
            kotlin.jvm.internal.C6496s.h(r11, r0)
            r0 = -1804211412(0xffffffff9475eb2c, float:-1.24157185E-26)
            r1 = r22
            Y.m r0 = r1.h(r0)
            r1 = r24 & 4
            if (r1 == 0) goto L_0x001f
            k0.i$a r1 = k0.i.f23074a
            r12 = r1
            goto L_0x0021
        L_0x001f:
            r12 = r21
        L_0x0021:
            boolean r1 = r19.getShowCta()
            if (r1 == 0) goto L_0x0037
            io.intercom.android.sdk.m5.components.ErrorState$WithCTA r1 = new io.intercom.android.sdk.m5.components.ErrorState$WithCTA
            r9 = 15
            r10 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r1
            r8 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0045
        L_0x0037:
            io.intercom.android.sdk.m5.components.ErrorState$WithoutCTA r1 = new io.intercom.android.sdk.m5.components.ErrorState$WithoutCTA
            r17 = 7
            r18 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r13 = r1
            r13.<init>(r14, r15, r16, r17, r18)
        L_0x0045:
            int r3 = r23 >> 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r4 = 0
            io.intercom.android.sdk.m5.components.IntercomErrorScreenKt.IntercomErrorScreen(r1, r12, r0, r3, r4)
            Y.Y0 r0 = r0.k()
            if (r0 == 0) goto L_0x0065
            io.intercom.android.sdk.m5.conversation.ui.c r7 = new io.intercom.android.sdk.m5.conversation.ui.c
            r1 = r7
            r2 = r19
            r3 = r20
            r4 = r12
            r5 = r23
            r6 = r24
            r1.<init>(r2, r3, r4, r5, r6)
            r0.a(r7)
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.ConversationErrorScreenKt.ConversationErrorScreen(io.intercom.android.sdk.m5.conversation.states.ConversationUiState$Error, yf.a, k0.i, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationErrorScreen$lambda$0(ConversationUiState.Error error, C6787a aVar, i iVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(error, "$state");
        C6496s.h(aVar, "$onRetryClick");
        ConversationErrorScreen(error, aVar, iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void ConversationErrorScreenPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1551706949);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ConversationErrorScreenKt.INSTANCE.m224getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6066b(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationErrorScreenPreview$lambda$1(int i10, C1500m mVar, int i11) {
        ConversationErrorScreenPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
