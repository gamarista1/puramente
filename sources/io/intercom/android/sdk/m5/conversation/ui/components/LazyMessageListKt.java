package io.intercom.android.sdk.m5.conversation.ui.components;

import D.A;
import D.x;
import V.B0;
import Y.A1;
import Y.C1500m;
import Y.C1503n0;
import Y.C1505o0;
import Y.C1510r0;
import Y.M0;
import Y.Y0;
import android.content.Context;
import g0.c;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiStateKt;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001aï\u0001\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u00072\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u00072\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u00072\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u00072\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001e\u001a\u00020\u0017*\u00020\u0003H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010 \u001a\u00020\u0017*\u00020\u0003H\u0002¢\u0006\u0004\b \u0010\u001f\u001a\u000f\u0010!\u001a\u00020\tH\u0001¢\u0006\u0004\b!\u0010\"¨\u0006*²\u0006\f\u0010$\u001a\u00020#8\nX\u0002²\u0006\u000e\u0010&\u001a\u00020%8\n@\nX\u0002²\u0006\u000e\u0010(\u001a\u00020'8\n@\nX\u0002²\u0006\u000e\u0010)\u001a\u00020\u00178\n@\nX\u0002"}, d2 = {"Lk0/i;", "modifier", "", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "contentRows", "LD/A;", "lazyListState", "Lkotlin/Function1;", "Lio/intercom/android/sdk/m5/conversation/states/ReplySuggestion;", "Llf/M;", "onSuggestionClick", "Lio/intercom/android/sdk/models/ReplyOption;", "onReplyClicked", "Lio/intercom/android/sdk/models/Part;", "onRetryMessageClicked", "Lio/intercom/android/sdk/m5/conversation/states/PendingMessage$FailedImageUploadData;", "onRetryImageClicked", "Lio/intercom/android/sdk/m5/conversation/states/AttributeData;", "onSubmitAttribute", "Lkotlin/Function0;", "navigateToTicketDetail", "Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "onCreateTicket", "", "addComposerPadding", "", "navigateToAnotherConversation", "isIntercomBadgeVisible", "LazyMessageList", "(Lk0/i;Ljava/util/List;LD/A;Lyf/l;Lyf/l;Lyf/l;Lyf/l;Lyf/l;Lyf/a;Lyf/l;ZLyf/l;ZLY/m;III)V", "shouldFadeInItem", "(Lio/intercom/android/sdk/m5/conversation/states/ContentRow;)Z", "shouldFadeOutItem", "LazyMessageListPreview", "(LY/m;I)V", "Lio/intercom/android/sdk/m5/conversation/utils/KeyboardState;", "keyboardAsState", "", "keyboardScrollOffset", "", "firstVisibleItemIndex", "isListAtTheBottom", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LazyMessageListKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: io.intercom.android.sdk.m5.conversation.ui.components.O} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: io.intercom.android.sdk.m5.conversation.ui.components.N} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: io.intercom.android.sdk.m5.conversation.ui.components.M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: io.intercom.android.sdk.m5.conversation.ui.components.L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: io.intercom.android.sdk.m5.conversation.ui.components.K} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: io.intercom.android.sdk.m5.conversation.ui.components.J} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: io.intercom.android.sdk.m5.conversation.ui.components.I} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: io.intercom.android.sdk.m5.conversation.ui.components.H} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: k0.i$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$9$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$10$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v5, resolved type: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$10$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v6, resolved type: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$9$1} */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x018a, code lost:
        if (r11 == r3.a()) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01db, code lost:
        if (r5 == r3.a()) goto L_0x01dd;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void LazyMessageList(k0.i r39, java.util.List<? extends io.intercom.android.sdk.m5.conversation.states.ContentRow> r40, D.A r41, yf.C6798l r42, yf.C6798l r43, yf.C6798l r44, yf.C6798l r45, yf.C6798l r46, yf.C6787a r47, yf.C6798l r48, boolean r49, yf.C6798l r50, boolean r51, Y.C1500m r52, int r53, int r54, int r55) {
        /*
            r14 = r40
            r15 = r53
            r13 = r55
            java.lang.String r0 = "contentRows"
            kotlin.jvm.internal.C6496s.h(r14, r0)
            r0 = -1108006948(0xffffffffbdf527dc, float:-0.11970493)
            r1 = r52
            Y.m r12 = r1.h(r0)
            r0 = r13 & 1
            if (r0 == 0) goto L_0x001c
            k0.i$a r0 = k0.i.f23074a
            r11 = r0
            goto L_0x001e
        L_0x001c:
            r11 = r39
        L_0x001e:
            r0 = r13 & 4
            r10 = 3
            r1 = 0
            if (r0 == 0) goto L_0x002e
            D.A r0 = D.B.c(r1, r1, r12, r1, r10)
            r2 = r15 & -897(0xfffffffffffffc7f, float:NaN)
            r9 = r0
            r16 = r2
            goto L_0x0032
        L_0x002e:
            r9 = r41
            r16 = r15
        L_0x0032:
            r0 = r13 & 8
            if (r0 == 0) goto L_0x003e
            io.intercom.android.sdk.m5.conversation.ui.components.H r0 = new io.intercom.android.sdk.m5.conversation.ui.components.H
            r0.<init>()
            r17 = r0
            goto L_0x0040
        L_0x003e:
            r17 = r42
        L_0x0040:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x004c
            io.intercom.android.sdk.m5.conversation.ui.components.I r0 = new io.intercom.android.sdk.m5.conversation.ui.components.I
            r0.<init>()
            r18 = r0
            goto L_0x004e
        L_0x004c:
            r18 = r43
        L_0x004e:
            r0 = r13 & 32
            if (r0 == 0) goto L_0x005a
            io.intercom.android.sdk.m5.conversation.ui.components.J r0 = new io.intercom.android.sdk.m5.conversation.ui.components.J
            r0.<init>()
            r19 = r0
            goto L_0x005c
        L_0x005a:
            r19 = r44
        L_0x005c:
            r0 = r13 & 64
            if (r0 == 0) goto L_0x0068
            io.intercom.android.sdk.m5.conversation.ui.components.K r0 = new io.intercom.android.sdk.m5.conversation.ui.components.K
            r0.<init>()
            r20 = r0
            goto L_0x006a
        L_0x0068:
            r20 = r45
        L_0x006a:
            r0 = r13 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0076
            io.intercom.android.sdk.m5.conversation.ui.components.L r0 = new io.intercom.android.sdk.m5.conversation.ui.components.L
            r0.<init>()
            r21 = r0
            goto L_0x0078
        L_0x0076:
            r21 = r46
        L_0x0078:
            r0 = r13 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0084
            io.intercom.android.sdk.m5.conversation.ui.components.M r0 = new io.intercom.android.sdk.m5.conversation.ui.components.M
            r0.<init>()
            r22 = r0
            goto L_0x0086
        L_0x0084:
            r22 = r47
        L_0x0086:
            r0 = r13 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0092
            io.intercom.android.sdk.m5.conversation.ui.components.N r0 = new io.intercom.android.sdk.m5.conversation.ui.components.N
            r0.<init>()
            r23 = r0
            goto L_0x0094
        L_0x0092:
            r23 = r48
        L_0x0094:
            r0 = r13 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x009b
            r24 = r1
            goto L_0x009d
        L_0x009b:
            r24 = r49
        L_0x009d:
            r0 = r13 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x00a9
            io.intercom.android.sdk.m5.conversation.ui.components.O r0 = new io.intercom.android.sdk.m5.conversation.ui.components.O
            r0.<init>()
            r25 = r0
            goto L_0x00ab
        L_0x00a9:
            r25 = r50
        L_0x00ab:
            r0 = r13 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x00b2
            r26 = r1
            goto L_0x00b4
        L_0x00b2:
            r26 = r51
        L_0x00b4:
            Y.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r12.m(r0)
            r27 = r0
            android.content.Context r27 = (android.content.Context) r27
            Y.A1 r0 = io.intercom.android.sdk.m5.conversation.utils.KeyboardStateKt.keyboardAsState(r12, r1)
            r2 = -1167336098(0xffffffffba6bdd5e, float:-8.997525E-4)
            r12.T(r2)
            java.lang.Object r2 = r12.A()
            Y.m$a r3 = Y.C1500m.f10026a
            java.lang.Object r4 = r3.a()
            r5 = 0
            if (r2 != r4) goto L_0x00de
            Y.n0 r2 = Y.D0.a(r5)
            r12.r(r2)
        L_0x00de:
            Y.n0 r2 = (Y.C1503n0) r2
            r12.M()
            r4 = -1167333859(0xffffffffba6be61d, float:-8.998828E-4)
            r12.T(r4)
            if (r26 == 0) goto L_0x00fe
            Y.I0 r4 = androidx.compose.ui.platform.C1644k0.e()
            java.lang.Object r4 = r12.m(r4)
            c1.d r4 = (c1.d) r4
            float r6 = io.intercom.android.sdk.m5.components.PoweredByBadgeKt.getPoweredByBadgeHeight(r12, r1)
            float r4 = r4.t1(r6)
            goto L_0x00ff
        L_0x00fe:
            r4 = r5
        L_0x00ff:
            r12.M()
            r6 = -1167328645(0xffffffffba6bfa7b, float:-9.001863E-4)
            r12.T(r6)
            java.lang.Object r6 = r12.A()
            java.lang.Object r7 = r3.a()
            if (r6 != r7) goto L_0x0119
            Y.o0 r6 = Y.C1488g1.a(r1)
            r12.r(r6)
        L_0x0119:
            r8 = r6
            Y.o0 r8 = (Y.C1505o0) r8
            r12.M()
            r6 = -1167326628(0xffffffffba6c025c, float:-9.003037E-4)
            r12.T(r6)
            java.lang.Object r6 = r12.A()
            java.lang.Object r7 = r3.a()
            r10 = 0
            if (r6 != r7) goto L_0x013a
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r7 = 2
            Y.r0 r6 = Y.u1.d(r6, r10, r7, r10)
            r12.r(r6)
        L_0x013a:
            r7 = r6
            Y.r0 r7 = (Y.C1510r0) r7
            r12.M()
            io.intercom.android.sdk.m5.conversation.utils.KeyboardState r6 = LazyMessageList$lambda$8(r0)
            boolean r6 = r6.isVisible()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            io.intercom.android.sdk.m5.conversation.utils.KeyboardState r28 = LazyMessageList$lambda$8(r0)
            boolean r28 = r28.isAnimating()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r28)
            r5 = -1167322018(0xffffffffba6c145e, float:-9.0057205E-4)
            r12.T(r5)
            boolean r5 = r12.S(r0)
            boolean r28 = r12.c(r4)
            r5 = r5 | r28
            r10 = r15 & 896(0x380, float:1.256E-42)
            r10 = r10 ^ 384(0x180, float:5.38E-43)
            r13 = 256(0x100, float:3.59E-43)
            r28 = r11
            if (r10 <= r13) goto L_0x0178
            boolean r29 = r12.S(r9)
            if (r29 != 0) goto L_0x017c
        L_0x0178:
            r11 = r15 & 384(0x180, float:5.38E-43)
            if (r11 != r13) goto L_0x017e
        L_0x017c:
            r11 = 1
            goto L_0x017f
        L_0x017e:
            r11 = 0
        L_0x017f:
            r5 = r5 | r11
            java.lang.Object r11 = r12.A()
            if (r5 != 0) goto L_0x018c
            java.lang.Object r5 = r3.a()
            if (r11 != r5) goto L_0x01a1
        L_0x018c:
            io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$9$1 r11 = new io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$9$1
            r5 = 0
            r41 = r11
            r42 = r4
            r43 = r9
            r44 = r0
            r45 = r2
            r46 = r5
            r41.<init>(r42, r43, r44, r45, r46)
            r12.r(r11)
        L_0x01a1:
            yf.p r11 = (yf.p) r11
            r12.M()
            r4 = 512(0x200, float:7.175E-43)
            Y.P.f(r6, r1, r11, r12, r4)
            io.intercom.android.sdk.m5.conversation.utils.KeyboardState r1 = LazyMessageList$lambda$8(r0)
            boolean r1 = r1.isDismissed()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4 = -1167309169(0xffffffffba6c468f, float:-9.0131996E-4)
            r12.T(r4)
            boolean r4 = r12.S(r0)
            if (r10 <= r13) goto L_0x01c9
            boolean r5 = r12.S(r9)
            if (r5 != 0) goto L_0x01cd
        L_0x01c9:
            r5 = r15 & 384(0x180, float:5.38E-43)
            if (r5 != r13) goto L_0x01cf
        L_0x01cd:
            r5 = 1
            goto L_0x01d0
        L_0x01cf:
            r5 = 0
        L_0x01d0:
            r4 = r4 | r5
            java.lang.Object r5 = r12.A()
            if (r4 != 0) goto L_0x01dd
            java.lang.Object r4 = r3.a()
            if (r5 != r4) goto L_0x01f2
        L_0x01dd:
            io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$10$1 r5 = new io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$10$1
            r4 = 0
            r41 = r5
            r42 = r9
            r43 = r0
            r44 = r7
            r45 = r2
            r46 = r4
            r41.<init>(r42, r43, r44, r45, r46)
            r12.r(r5)
        L_0x01f2:
            yf.p r5 = (yf.p) r5
            r12.M()
            r0 = 64
            Y.P.g(r1, r5, r12, r0)
            r1 = -1167301254(0xffffffffba6c657a, float:-9.017807E-4)
            r12.T(r1)
            if (r10 <= r13) goto L_0x020a
            boolean r1 = r12.S(r9)
            if (r1 != 0) goto L_0x020e
        L_0x020a:
            r1 = r15 & 384(0x180, float:5.38E-43)
            if (r1 != r13) goto L_0x0210
        L_0x020e:
            r1 = 1
            goto L_0x0211
        L_0x0210:
            r1 = 0
        L_0x0211:
            java.lang.Object r2 = r12.A()
            if (r1 != 0) goto L_0x021d
            java.lang.Object r1 = r3.a()
            if (r2 != r1) goto L_0x0226
        L_0x021d:
            io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$11$1 r2 = new io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$11$1
            r1 = 0
            r2.<init>(r9, r8, r1)
            r12.r(r2)
        L_0x0226:
            yf.p r2 = (yf.p) r2
            r12.M()
            int r1 = r16 >> 6
            r1 = r1 & 14
            r0 = r0 | r1
            Y.P.g(r9, r2, r12, r0)
            r1 = -1167294956(0xffffffffba6c7e14, float:-9.0214727E-4)
            r12.T(r1)
            if (r10 <= r13) goto L_0x0241
            boolean r1 = r12.S(r9)
            if (r1 != 0) goto L_0x0245
        L_0x0241:
            r1 = r15 & 384(0x180, float:5.38E-43)
            if (r1 != r13) goto L_0x0247
        L_0x0245:
            r1 = 1
            goto L_0x0248
        L_0x0247:
            r1 = 0
        L_0x0248:
            java.lang.Object r2 = r12.A()
            if (r1 != 0) goto L_0x0257
            java.lang.Object r1 = r3.a()
            if (r2 != r1) goto L_0x0255
            goto L_0x0257
        L_0x0255:
            r1 = 0
            goto L_0x0260
        L_0x0257:
            io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$12$1 r2 = new io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$12$1
            r1 = 0
            r2.<init>(r9, r7, r1)
            r12.r(r2)
        L_0x0260:
            yf.p r2 = (yf.p) r2
            r12.M()
            Y.P.g(r9, r2, r12, r0)
            io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$13 r0 = new io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$13
            r0.<init>(r14, r9, r7, r1)
            r2 = 72
            Y.P.g(r14, r0, r12, r2)
            r11 = r28
            r0 = 0
            r2 = 1
            k0.i r28 = androidx.compose.foundation.layout.q.f(r11, r0, r2, r1)
            r0 = 16
            float r0 = (float) r0
            float r0 = c1.h.j(r0)
            if (r24 == 0) goto L_0x0288
            float r1 = io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt.getComposerHalfSize()
            goto L_0x028e
        L_0x0288:
            r1 = 0
            float r1 = (float) r1
            float r1 = c1.h.j(r1)
        L_0x028e:
            float r0 = r0 + r1
            float r0 = c1.h.j(r0)
            r1 = 7
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r41 = r3
            r42 = r4
            r43 = r5
            r44 = r0
            r45 = r1
            r46 = r2
            C.N r29 = androidx.compose.foundation.layout.n.e(r41, r42, r43, r44, r45, r46)
            java.lang.Object r0 = mf.C6565s.B0(r40)
            io.intercom.android.sdk.m5.conversation.states.ContentRow r0 = (io.intercom.android.sdk.m5.conversation.states.ContentRow) r0
            boolean r1 = r0 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.FooterNoticeRow
            if (r1 != 0) goto L_0x02c4
            boolean r1 = r0 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.ComposerSuggestionRow
            if (r1 != 0) goto L_0x02c4
            boolean r0 = r0 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.QuickRepliesRow
            if (r0 == 0) goto L_0x02bb
            goto L_0x02c4
        L_0x02bb:
            C.c r0 = C.C1085c.f882a
            C.c$m r0 = r0.g()
        L_0x02c1:
            r30 = r0
            goto L_0x02cf
        L_0x02c4:
            io.intercom.android.sdk.ui.common.IntercomArrangement r0 = io.intercom.android.sdk.ui.common.IntercomArrangement.INSTANCE
            int r1 = mf.C6565s.p(r40)
            C.c$m r0 = r0.itemAtBottom(r1)
            goto L_0x02c1
        L_0x02cf:
            k0.c$a r0 = k0.c.f23044a
            k0.c$b r31 = r0.g()
            io.intercom.android.sdk.m5.conversation.ui.components.P r32 = new io.intercom.android.sdk.m5.conversation.ui.components.P
            r0 = r32
            r1 = r40
            r2 = r22
            r3 = r17
            r4 = r18
            r5 = r9
            r6 = r25
            r13 = r7
            r7 = r21
            r33 = r8
            r8 = r20
            r34 = r9
            r9 = r23
            r35 = 3
            r10 = r27
            r27 = r11
            r11 = r13
            r36 = r12
            r12 = r33
            r13 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            int r0 = r16 >> 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r1 = 199680(0x30c00, float:2.79811E-40)
            r0 = r0 | r1
            r1 = 192(0xc0, float:2.69E-43)
            r2 = 0
            r3 = 0
            r4 = 0
            r41 = r28
            r42 = r34
            r43 = r29
            r44 = r2
            r45 = r30
            r46 = r31
            r47 = r3
            r48 = r4
            r49 = r32
            r50 = r36
            r51 = r0
            r52 = r1
            D.C1109b.a(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            Y.Y0 r13 = r36.k()
            if (r13 == 0) goto L_0x035f
            io.intercom.android.sdk.m5.conversation.ui.components.F r12 = new io.intercom.android.sdk.m5.conversation.ui.components.F
            r0 = r12
            r1 = r27
            r2 = r40
            r3 = r34
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r14 = r12
            r12 = r25
            r37 = r13
            r13 = r26
            r38 = r14
            r14 = r53
            r15 = r54
            r16 = r55
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = r37
            r1 = r38
            r0.a(r1)
        L_0x035f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt.LazyMessageList(k0.i, java.util.List, D.A, yf.l, yf.l, yf.l, yf.l, yf.l, yf.a, yf.l, boolean, yf.l, boolean, Y.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M LazyMessageList$lambda$0(ReplySuggestion replySuggestion) {
        C6496s.h(replySuggestion, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M LazyMessageList$lambda$1(ReplyOption replyOption) {
        C6496s.h(replyOption, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final float LazyMessageList$lambda$10(C1503n0 n0Var) {
        return n0Var.c();
    }

    /* access modifiers changed from: private */
    public static final void LazyMessageList$lambda$11(C1503n0 n0Var, float f10) {
        n0Var.l(f10);
    }

    /* access modifiers changed from: private */
    public static final int LazyMessageList$lambda$14(C1505o0 o0Var) {
        return o0Var.b();
    }

    /* access modifiers changed from: private */
    public static final void LazyMessageList$lambda$15(C1505o0 o0Var, int i10) {
        o0Var.f(i10);
    }

    /* access modifiers changed from: private */
    public static final boolean LazyMessageList$lambda$17(C1510r0 r0Var) {
        return ((Boolean) r0Var.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void LazyMessageList$lambda$18(C1510r0 r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C6514M LazyMessageList$lambda$2(Part part) {
        C6496s.h(part, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M LazyMessageList$lambda$26(List list, C6787a aVar, C6798l lVar, C6798l lVar2, A a10, C6798l lVar3, C6798l lVar4, C6798l lVar5, C6798l lVar6, Context context, C1510r0 r0Var, C1505o0 o0Var, C6798l lVar7, x xVar) {
        List list2 = list;
        C6496s.h(list2, "$contentRows");
        C6496s.h(context, "$context");
        C6496s.h(r0Var, "$isListAtTheBottom$delegate");
        C6496s.h(o0Var, "$firstVisibleItemIndex$delegate");
        C6496s.h(xVar, "$this$LazyColumn");
        E e10 = new E();
        int size = list.size();
        LazyMessageListKt$LazyMessageList$lambda$26$$inlined$itemsIndexed$default$1 lazyMessageListKt$LazyMessageList$lambda$26$$inlined$itemsIndexed$default$1 = new LazyMessageListKt$LazyMessageList$lambda$26$$inlined$itemsIndexed$default$1(e10, list2);
        LazyMessageListKt$LazyMessageList$lambda$26$$inlined$itemsIndexed$default$3 lazyMessageListKt$LazyMessageList$lambda$26$$inlined$itemsIndexed$default$3 = r0;
        LazyMessageListKt$LazyMessageList$lambda$26$$inlined$itemsIndexed$default$3 lazyMessageListKt$LazyMessageList$lambda$26$$inlined$itemsIndexed$default$32 = new LazyMessageListKt$LazyMessageList$lambda$26$$inlined$itemsIndexed$default$3(list, list, aVar, lVar, lVar2, a10, lVar3, lVar4, lVar5, lVar6, context, r0Var, o0Var, lVar7);
        LazyMessageListKt$LazyMessageList$lambda$26$$inlined$itemsIndexed$default$1 lazyMessageListKt$LazyMessageList$lambda$26$$inlined$itemsIndexed$default$12 = lazyMessageListKt$LazyMessageList$lambda$26$$inlined$itemsIndexed$default$1;
        int i10 = size;
        xVar.a(i10, lazyMessageListKt$LazyMessageList$lambda$26$$inlined$itemsIndexed$default$12, new LazyMessageListKt$LazyMessageList$lambda$26$$inlined$itemsIndexed$default$2(list2), c.c(-1091073711, true, lazyMessageListKt$LazyMessageList$lambda$26$$inlined$itemsIndexed$default$3));
        x.c(xVar, ConversationUiStateKt.LastAnchorRowKey, (Object) null, ComposableSingletons$LazyMessageListKt.INSTANCE.m231getLambda1$intercom_sdk_base_release(), 2, (Object) null);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final Object LazyMessageList$lambda$26$lambda$23(int i10, ContentRow contentRow) {
        C6496s.h(contentRow, "item");
        return contentRow.getKey();
    }

    /* access modifiers changed from: private */
    public static final C6514M LazyMessageList$lambda$27(i iVar, List list, A a10, C6798l lVar, C6798l lVar2, C6798l lVar3, C6798l lVar4, C6798l lVar5, C6787a aVar, C6798l lVar6, boolean z10, C6798l lVar7, boolean z11, int i10, int i11, int i12, C1500m mVar, int i13) {
        C6496s.h(list, "$contentRows");
        LazyMessageList(iVar, list, a10, lVar, lVar2, lVar3, lVar4, lVar5, aVar, lVar6, z10, lVar7, z11, mVar, M0.a(i10 | 1), M0.a(i11), i12);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M LazyMessageList$lambda$3(PendingMessage.FailedImageUploadData failedImageUploadData) {
        C6496s.h(failedImageUploadData, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M LazyMessageList$lambda$4(AttributeData attributeData) {
        C6496s.h(attributeData, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M LazyMessageList$lambda$5() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M LazyMessageList$lambda$6(TicketType ticketType) {
        C6496s.h(ticketType, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M LazyMessageList$lambda$7(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final KeyboardState LazyMessageList$lambda$8(A1 a12) {
        return (KeyboardState) a12.getValue();
    }

    @IntercomPreviews
    public static final void LazyMessageListPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(834972857);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$LazyMessageListKt.INSTANCE.m233getLambda3$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new G(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M LazyMessageListPreview$lambda$28(int i10, C1500m mVar, int i11) {
        LazyMessageListPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r0.getPartWrapper().getPart().getMessageState() == io.intercom.android.sdk.models.Part.MessageState.SENDING) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean shouldFadeInItem(io.intercom.android.sdk.m5.conversation.states.ContentRow r2) {
        /*
            boolean r0 = r2 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.TypingIndicatorRow
            if (r0 != 0) goto L_0x002c
            boolean r0 = r2 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.BubbleMessageRow
            if (r0 == 0) goto L_0x0025
            r0 = r2
            io.intercom.android.sdk.m5.conversation.states.ContentRow$BubbleMessageRow r0 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.BubbleMessageRow) r0
            io.intercom.android.sdk.m5.conversation.states.ContentRow$BubbleMessageRow$PartWrapper r1 = r0.getPartWrapper()
            boolean r1 = r1.isLastPart()
            if (r1 == 0) goto L_0x0025
            io.intercom.android.sdk.m5.conversation.states.ContentRow$BubbleMessageRow$PartWrapper r0 = r0.getPartWrapper()
            io.intercom.android.sdk.models.Part r0 = r0.getPart()
            io.intercom.android.sdk.models.Part$MessageState r0 = r0.getMessageState()
            io.intercom.android.sdk.models.Part$MessageState r1 = io.intercom.android.sdk.models.Part.MessageState.SENDING
            if (r0 == r1) goto L_0x002c
        L_0x0025:
            boolean r2 = r2 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.QuickRepliesRow
            if (r2 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r2 = 0
            goto L_0x002d
        L_0x002c:
            r2 = 1
        L_0x002d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt.shouldFadeInItem(io.intercom.android.sdk.m5.conversation.states.ContentRow):boolean");
    }

    /* access modifiers changed from: private */
    public static final boolean shouldFadeOutItem(ContentRow contentRow) {
        if ((contentRow instanceof ContentRow.TypingIndicatorRow) || (contentRow instanceof ContentRow.QuickRepliesRow)) {
            return true;
        }
        return false;
    }
}
