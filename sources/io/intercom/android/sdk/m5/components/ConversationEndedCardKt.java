package io.intercom.android.sdk.m5.components;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a3\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u000b\u0010\n\u001a\u000f\u0010\f\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\f\u0010\n\u001a\u000f\u0010\r\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lk0/i;", "modifier", "Lkotlin/Function0;", "Llf/M;", "onButtonClick", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState$ConversationEnded;", "conversationEndedUiState", "ConversationEndedCard", "(Lk0/i;Lyf/a;Lio/intercom/android/sdk/m5/conversation/states/ComposerState$ConversationEnded;LY/m;II)V", "ConversationEndedCardPreview", "(LY/m;I)V", "ConversationEndedCardWithButtonPreview", "ConversationEndedCardWithButtonBotPreview", "ConversationMergedCardPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConversationEndedCardKt {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void ConversationEndedCard(k0.i r20, yf.C6787a r21, io.intercom.android.sdk.m5.conversation.states.ComposerState.ConversationEnded r22, Y.C1500m r23, int r24, int r25) {
        /*
            r3 = r22
            r4 = r24
            java.lang.String r0 = "conversationEndedUiState"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            r0 = -517544614(0xffffffffe126e55a, float:-1.9241788E20)
            r1 = r23
            Y.m r0 = r1.h(r0)
            r1 = r25 & 1
            if (r1 == 0) goto L_0x001c
            r2 = r4 | 6
            r5 = r2
            r2 = r20
            goto L_0x0030
        L_0x001c:
            r2 = r4 & 14
            if (r2 != 0) goto L_0x002d
            r2 = r20
            boolean r5 = r0.S(r2)
            if (r5 == 0) goto L_0x002a
            r5 = 4
            goto L_0x002b
        L_0x002a:
            r5 = 2
        L_0x002b:
            r5 = r5 | r4
            goto L_0x0030
        L_0x002d:
            r2 = r20
            r5 = r4
        L_0x0030:
            r6 = r25 & 2
            if (r6 == 0) goto L_0x0039
            r5 = r5 | 48
        L_0x0036:
            r7 = r21
            goto L_0x004b
        L_0x0039:
            r7 = r4 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0036
            r7 = r21
            boolean r8 = r0.C(r7)
            if (r8 == 0) goto L_0x0048
            r8 = 32
            goto L_0x004a
        L_0x0048:
            r8 = 16
        L_0x004a:
            r5 = r5 | r8
        L_0x004b:
            r8 = r25 & 4
            if (r8 == 0) goto L_0x0052
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0062
        L_0x0052:
            r8 = r4 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0062
            boolean r8 = r0.S(r3)
            if (r8 == 0) goto L_0x005f
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r5 = r5 | r8
        L_0x0062:
            r5 = r5 & 731(0x2db, float:1.024E-42)
            r8 = 146(0x92, float:2.05E-43)
            if (r5 != r8) goto L_0x0075
            boolean r5 = r0.i()
            if (r5 != 0) goto L_0x006f
            goto L_0x0075
        L_0x006f:
            r0.I()
            r1 = r2
            r2 = r7
            goto L_0x00d0
        L_0x0075:
            if (r1 == 0) goto L_0x007a
            k0.i$a r1 = k0.i.f23074a
            goto L_0x007b
        L_0x007a:
            r1 = r2
        L_0x007b:
            r2 = 0
            if (r6 == 0) goto L_0x0080
            r15 = r2
            goto L_0x0081
        L_0x0080:
            r15 = r7
        L_0x0081:
            r5 = 0
            r14 = 1
            k0.i r2 = androidx.compose.foundation.layout.q.h(r1, r5, r14, r2)
            r0.g2 r17 = r0.a2.a()
            V.o r5 = V.C1397o.f7854a
            io.intercom.android.sdk.ui.theme.IntercomTheme r6 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r7 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r6 = r6.getColors(r0, r7)
            long r6 = r6.m678getBackground0d7_KjU()
            int r8 = V.C1397o.f7855b
            int r16 = r8 << 12
            r18 = 14
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = r0
            r19 = r15
            r15 = r16
            r16 = r18
            V.n r7 = r5.b(r6, r8, r10, r12, r14, r15, r16)
            io.intercom.android.sdk.m5.components.ConversationEndedCardKt$ConversationEndedCard$1 r5 = new io.intercom.android.sdk.m5.components.ConversationEndedCardKt$ConversationEndedCard$1
            r14 = r19
            r5.<init>(r3, r14)
            r6 = 54
            r8 = -676087732(0xffffffffd7b3b84c, float:-3.95208261E14)
            r9 = 1
            g0.a r10 = g0.c.e(r8, r9, r5, r0, r6)
            r12 = 196656(0x30030, float:2.75574E-40)
            r13 = 24
            r8 = 0
            r9 = 0
            r5 = r2
            r6 = r17
            r11 = r0
            V.C1401q.a(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2 = r14
        L_0x00d0:
            Y.Y0 r6 = r0.k()
            if (r6 == 0) goto L_0x00e5
            io.intercom.android.sdk.m5.components.N r7 = new io.intercom.android.sdk.m5.components.N
            r0 = r7
            r3 = r22
            r4 = r24
            r5 = r25
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.components.ConversationEndedCardKt.ConversationEndedCard(k0.i, yf.a, io.intercom.android.sdk.m5.conversation.states.ComposerState$ConversationEnded, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationEndedCard$lambda$0(i iVar, C6787a aVar, ComposerState.ConversationEnded conversationEnded, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(conversationEnded, "$conversationEndedUiState");
        ConversationEndedCard(iVar, aVar, conversationEnded, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void ConversationEndedCardPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-172245026);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ConversationEndedCardKt.INSTANCE.m146getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new M(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationEndedCardPreview$lambda$1(int i10, C1500m mVar, int i11) {
        ConversationEndedCardPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void ConversationEndedCardWithButtonBotPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-317527071);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ConversationEndedCardKt.INSTANCE.m148getLambda3$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new K(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationEndedCardWithButtonBotPreview$lambda$3(int i10, C1500m mVar, int i11) {
        ConversationEndedCardWithButtonBotPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void ConversationEndedCardWithButtonPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1576691098);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ConversationEndedCardKt.INSTANCE.m147getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new O(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationEndedCardWithButtonPreview$lambda$2(int i10, C1500m mVar, int i11) {
        ConversationEndedCardWithButtonPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void ConversationMergedCardPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-233275222);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ConversationEndedCardKt.INSTANCE.m149getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new L(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationMergedCardPreview$lambda$4(int i10, C1500m mVar, int i11) {
        ConversationMergedCardPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
