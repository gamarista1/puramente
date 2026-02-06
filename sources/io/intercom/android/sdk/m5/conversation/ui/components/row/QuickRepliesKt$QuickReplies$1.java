package io.intercom.android.sdk.m5.conversation.ui.components.row;

import C.C1107z;
import Y.C1500m;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class QuickRepliesKt$QuickReplies$1 implements q {
    final /* synthetic */ C6798l $onQuickReplyClick;
    final /* synthetic */ List<QuickReply> $quickReplies;

    QuickRepliesKt$QuickReplies$1(List<QuickReply> list, C6798l lVar) {
        this.$quickReplies = list;
        this.$onQuickReplyClick = lVar;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$2$lambda$1$lambda$0(C6798l lVar, QuickReply quickReply) {
        C6496s.h(lVar, "$onQuickReplyClick");
        C6496s.h(quickReply, "$it");
        lVar.invoke(quickReply);
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1107z) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: yf.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(C.C1107z r22, Y.C1500m r23, int r24) {
        /*
            r21 = this;
            r0 = r21
            r14 = r23
            java.lang.String r1 = "$this$FlowRow"
            r2 = r22
            kotlin.jvm.internal.C6496s.h(r2, r1)
            r1 = r24 & 81
            r2 = 16
            if (r1 != r2) goto L_0x001d
            boolean r1 = r23.i()
            if (r1 != 0) goto L_0x0018
            goto L_0x001d
        L_0x0018:
            r23.I()
            goto L_0x00cc
        L_0x001d:
            java.util.List<io.intercom.android.sdk.m5.conversation.ui.components.row.QuickReply> r1 = r0.$quickReplies
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            yf.l r15 = r0.$onQuickReplyClick
            java.util.Iterator r16 = r1.iterator()
        L_0x0027:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x00cc
            java.lang.Object r1 = r16.next()
            r13 = r1
            io.intercom.android.sdk.m5.conversation.ui.components.row.QuickReply r13 = (io.intercom.android.sdk.m5.conversation.ui.components.row.QuickReply) r13
            r1 = 373518401(0x16437041, float:1.5787396E-25)
            r14.T(r1)
            boolean r1 = r14.S(r15)
            boolean r2 = r14.S(r13)
            r1 = r1 | r2
            java.lang.Object r2 = r23.A()
            if (r1 != 0) goto L_0x0051
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x0059
        L_0x0051:
            io.intercom.android.sdk.m5.conversation.ui.components.row.s0 r2 = new io.intercom.android.sdk.m5.conversation.ui.components.row.s0
            r2.<init>(r15, r13)
            r14.r(r2)
        L_0x0059:
            r17 = r2
            yf.a r17 = (yf.C6787a) r17
            r23.M()
            io.intercom.android.sdk.ui.component.IntercomCardStyle r1 = io.intercom.android.sdk.ui.component.IntercomCardStyle.INSTANCE
            I.f r2 = I.g.e()
            io.intercom.android.sdk.ui.theme.IntercomTheme r3 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r4 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r5 = r3.getColors(r14, r4)
            long r5 = r5.m673getActionContrastWhite0d7_KjU()
            r12 = 1
            float r7 = (float) r12
            float r8 = c1.h.j(r7)
            float r7 = c1.h.j(r7)
            io.intercom.android.sdk.ui.theme.IntercomColors r3 = r3.getColors(r14, r4)
            long r3 = r3.m683getCardBorder0d7_KjU()
            x.g r9 = x.C2869h.a(r7, r3)
            int r3 = io.intercom.android.sdk.ui.component.IntercomCardStyle.$stable
            int r3 = r3 << 18
            r11 = r3 | 3072(0xc00, float:4.305E-42)
            r18 = 34
            r3 = 0
            r19 = 0
            r7 = r8
            r8 = r9
            r9 = r19
            r19 = r11
            r11 = r23
            r12 = r19
            r0 = r13
            r13 = r18
            io.intercom.android.sdk.ui.component.IntercomCardStyle$Style r4 = r1.m591defaultStyleqUnfpCA(r2, r3, r5, r7, r8, r9, r11, r12, r13)
            io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt$QuickReplies$1$1$2 r1 = new io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt$QuickReplies$1$1$2
            r1.<init>(r0)
            r0 = 54
            r2 = -1399332631(0xffffffffac97e0e9, float:-4.316648E-12)
            r3 = 1
            g0.a r6 = g0.c.e(r2, r3, r1, r14, r0)
            int r0 = io.intercom.android.sdk.ui.component.IntercomCardStyle.Style.$stable
            int r0 = r0 << 9
            r1 = 196608(0x30000, float:2.75506E-40)
            r8 = r0 | r1
            r9 = 22
            r2 = 0
            r3 = 0
            r5 = 0
            r1 = r17
            r7 = r23
            io.intercom.android.sdk.ui.component.IntercomCardKt.IntercomCard(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = r21
            goto L_0x0027
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt$QuickReplies$1.invoke(C.z, Y.m, int):void");
    }
}
