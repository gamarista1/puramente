package io.intercom.android.sdk.m5.conversation.ui.components;

import C.C1092j;
import Y.C1500m;
import Y.C1510r0;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ConversationKebabKt$ConversationKebab$3$3$3 implements q {
    final /* synthetic */ long $contentColor;
    final /* synthetic */ List<HeaderMenuItem> $headerMenuItems;
    final /* synthetic */ C1510r0 $isExpanded;
    final /* synthetic */ C6798l $onMenuClicked;
    final /* synthetic */ C6798l $trackMetric;

    ConversationKebabKt$ConversationKebab$3$3$3(List<? extends HeaderMenuItem> list, C6798l lVar, C6798l lVar2, long j10, C1510r0 r0Var) {
        this.$headerMenuItems = list;
        this.$onMenuClicked = lVar;
        this.$trackMetric = lVar2;
        this.$contentColor = j10;
        this.$isExpanded = r0Var;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$2$lambda$1$lambda$0(C1510r0 r0Var, C6798l lVar, HeaderMenuItem headerMenuItem, C6798l lVar2) {
        C6496s.h(r0Var, "$isExpanded");
        C6496s.h(headerMenuItem, "$it");
        r0Var.setValue(Boolean.FALSE);
        lVar.invoke(headerMenuItem);
        lVar2.invoke(ConversationKebabKt.metricData(headerMenuItem, true));
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1092j) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: yf.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(C.C1092j r24, Y.C1500m r25, int r26) {
        /*
            r23 = this;
            r0 = r23
            r15 = r25
            java.lang.String r1 = "$this$DropdownMenu"
            r2 = r24
            kotlin.jvm.internal.C6496s.h(r2, r1)
            r1 = r26 & 81
            r2 = 16
            if (r1 != r2) goto L_0x001d
            boolean r1 = r25.i()
            if (r1 != 0) goto L_0x0018
            goto L_0x001d
        L_0x0018:
            r25.I()
            goto L_0x00a3
        L_0x001d:
            java.util.List<io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem> r1 = r0.$headerMenuItems
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            yf.l r14 = r0.$onMenuClicked
            yf.l r13 = r0.$trackMetric
            long r10 = r0.$contentColor
            Y.r0 r12 = r0.$isExpanded
            java.util.Iterator r16 = r1.iterator()
        L_0x002d:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x00a3
            java.lang.Object r1 = r16.next()
            io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem r1 = (io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem) r1
            io.intercom.android.sdk.ui.common.StringProvider r2 = r1.getLabel()
            int r3 = io.intercom.android.sdk.ui.common.StringProvider.$stable
            java.lang.String r2 = r2.getText(r15, r3)
            int r3 = io.intercom.android.sdk.m5.conversation.ui.components.ConversationKebabKt.icon(r1)
            java.lang.String r4 = io.intercom.android.sdk.m5.conversation.ui.components.ConversationKebabKt.badgeText(r1)
            boolean r6 = io.intercom.android.sdk.m5.conversation.ui.components.ConversationKebabKt.shouldShowUnreadDot(r1)
            r5 = 1730714746(0x67289c7a, float:7.9624405E23)
            r15.T(r5)
            boolean r5 = r15.S(r14)
            boolean r7 = r15.S(r1)
            r5 = r5 | r7
            boolean r7 = r15.S(r13)
            r5 = r5 | r7
            java.lang.Object r7 = r25.A()
            if (r5 != 0) goto L_0x0071
            Y.m$a r5 = Y.C1500m.f10026a
            java.lang.Object r5 = r5.a()
            if (r7 != r5) goto L_0x0079
        L_0x0071:
            io.intercom.android.sdk.m5.conversation.ui.components.p r7 = new io.intercom.android.sdk.m5.conversation.ui.components.p
            r7.<init>(r12, r14, r1, r13)
            r15.r(r7)
        L_0x0079:
            r8 = r7
            yf.a r8 = (yf.C6787a) r8
            r25.M()
            boolean r9 = r1.getEnabled()
            r17 = 1597440(0x186000, float:2.23849E-39)
            r18 = 1
            r1 = 0
            r5 = 1
            r7 = 1
            r19 = r10
            r21 = r12
            r12 = r25
            r22 = r13
            r13 = r17
            r17 = r14
            r14 = r18
            io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt.m252HeaderMenuItemRow6RhP_wg(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14)
            r14 = r17
            r12 = r21
            r13 = r22
            goto L_0x002d
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.ConversationKebabKt$ConversationKebab$3$3$3.invoke(C.j, Y.m, int):void");
    }
}
