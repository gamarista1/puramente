package io.intercom.android.sdk.tickets.create.ui;

import C.C1092j;
import Y.C1500m;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import kotlin.Metadata;
import lf.C6514M;
import yf.C6787a;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class CreateTicketCardKt$CreateTicketCard$1 implements q {
    final /* synthetic */ BlockRenderData $blockRenderData;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C6787a $onClick;

    CreateTicketCardKt$CreateTicketCard$1(boolean z10, C6787a aVar, BlockRenderData blockRenderData) {
        this.$enabled = z10;
        this.$onClick = aVar;
        this.$blockRenderData = blockRenderData;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1$lambda$0(C6787a aVar) {
        if (aVar != null) {
            aVar.invoke();
        }
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1092j) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: yf.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(C.C1092j r37, Y.C1500m r38, int r39) {
        /*
            r36 = this;
            r0 = r36
            r14 = r38
            java.lang.String r1 = "$this$IntercomCard"
            r2 = r37
            kotlin.jvm.internal.C6496s.h(r2, r1)
            r1 = r39 & 81
            r2 = 16
            if (r1 != r2) goto L_0x001d
            boolean r1 = r38.i()
            if (r1 != 0) goto L_0x0018
            goto L_0x001d
        L_0x0018:
            r38.I()
            goto L_0x02e4
        L_0x001d:
            k0.i$a r15 = k0.i.f23074a
            boolean r4 = r0.$enabled
            r1 = 2105918451(0x7d85c3f3, float:2.2225594E37)
            r14.T(r1)
            yf.a r1 = r0.$onClick
            boolean r1 = r14.S(r1)
            yf.a r3 = r0.$onClick
            java.lang.Object r5 = r38.A()
            if (r1 != 0) goto L_0x003d
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r5 != r1) goto L_0x0045
        L_0x003d:
            io.intercom.android.sdk.tickets.create.ui.w r5 = new io.intercom.android.sdk.tickets.create.ui.w
            r5.<init>(r3)
            r14.r(r5)
        L_0x0045:
            r7 = r5
            yf.a r7 = (yf.C6787a) r7
            r38.M()
            r8 = 6
            r9 = 0
            r5 = 0
            r6 = 0
            r3 = r15
            k0.i r1 = androidx.compose.foundation.d.d(r3, r4, r5, r6, r7, r8, r9)
            boolean r13 = r0.$enabled
            io.intercom.android.sdk.survey.block.BlockRenderData r12 = r0.$blockRenderData
            k0.c$a r9 = k0.c.f23044a
            k0.c r3 = r9.o()
            r10 = 0
            H0.F r3 = androidx.compose.foundation.layout.d.h(r3, r10)
            int r4 = Y.C1494j.a(r14, r10)
            Y.y r5 = r38.p()
            k0.i r1 = k0.h.e(r14, r1)
            J0.g$a r11 = J0.C1241g.f3853J
            yf.a r6 = r11.a()
            Y.f r7 = r38.j()
            if (r7 != 0) goto L_0x007e
            Y.C1494j.c()
        L_0x007e:
            r38.F()
            boolean r7 = r38.f()
            if (r7 == 0) goto L_0x008b
            r14.U(r6)
            goto L_0x008e
        L_0x008b:
            r38.q()
        L_0x008e:
            Y.m r6 = Y.F1.a(r38)
            yf.p r7 = r11.c()
            Y.F1.b(r6, r3, r7)
            yf.p r3 = r11.e()
            Y.F1.b(r6, r5, r3)
            yf.p r3 = r11.b()
            boolean r5 = r6.f()
            if (r5 != 0) goto L_0x00b8
            java.lang.Object r5 = r6.A()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C6496s.c(r5, r7)
            if (r5 != 0) goto L_0x00c6
        L_0x00b8:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6.r(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.V(r4, r3)
        L_0x00c6:
            yf.p r3 = r11.d()
            Y.F1.b(r6, r1, r3)
            androidx.compose.foundation.layout.f r1 = androidx.compose.foundation.layout.f.f12848a
            r1 = 1
            r3 = 0
            r4 = 0
            k0.i r1 = androidx.compose.foundation.layout.q.h(r15, r4, r1, r3)
            float r2 = (float) r2
            float r3 = c1.h.j(r2)
            k0.i r1 = androidx.compose.foundation.layout.n.i(r1, r3)
            k0.c$c r3 = r9.i()
            C.c r16 = C.C1085c.f882a
            C.c$f r4 = r16.d()
            r5 = 54
            H0.F r3 = C.W.b(r4, r3, r14, r5)
            int r4 = Y.C1494j.a(r14, r10)
            Y.y r5 = r38.p()
            k0.i r1 = k0.h.e(r14, r1)
            yf.a r6 = r11.a()
            Y.f r7 = r38.j()
            if (r7 != 0) goto L_0x0108
            Y.C1494j.c()
        L_0x0108:
            r38.F()
            boolean r7 = r38.f()
            if (r7 == 0) goto L_0x0115
            r14.U(r6)
            goto L_0x0118
        L_0x0115:
            r38.q()
        L_0x0118:
            Y.m r6 = Y.F1.a(r38)
            yf.p r7 = r11.c()
            Y.F1.b(r6, r3, r7)
            yf.p r3 = r11.e()
            Y.F1.b(r6, r5, r3)
            yf.p r3 = r11.b()
            boolean r5 = r6.f()
            if (r5 != 0) goto L_0x0142
            java.lang.Object r5 = r6.A()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C6496s.c(r5, r7)
            if (r5 != 0) goto L_0x0150
        L_0x0142:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6.r(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.V(r4, r3)
        L_0x0150:
            yf.p r3 = r11.d()
            Y.F1.b(r6, r1, r3)
            C.Z r3 = C.Z.f873a
            r7 = 2
            r8 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r4 = r15
            k0.i r1 = C.Y.b(r3, r4, r5, r6, r7, r8)
            C.c$m r3 = r16.g()
            k0.c$b r4 = r9.k()
            H0.F r3 = C.C1090h.a(r3, r4, r14, r10)
            int r4 = Y.C1494j.a(r14, r10)
            Y.y r5 = r38.p()
            k0.i r1 = k0.h.e(r14, r1)
            yf.a r6 = r11.a()
            Y.f r7 = r38.j()
            if (r7 != 0) goto L_0x0188
            Y.C1494j.c()
        L_0x0188:
            r38.F()
            boolean r7 = r38.f()
            if (r7 == 0) goto L_0x0195
            r14.U(r6)
            goto L_0x0198
        L_0x0195:
            r38.q()
        L_0x0198:
            Y.m r6 = Y.F1.a(r38)
            yf.p r7 = r11.c()
            Y.F1.b(r6, r3, r7)
            yf.p r3 = r11.e()
            Y.F1.b(r6, r5, r3)
            yf.p r3 = r11.b()
            boolean r5 = r6.f()
            if (r5 != 0) goto L_0x01c2
            java.lang.Object r5 = r6.A()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C6496s.c(r5, r7)
            if (r5 != 0) goto L_0x01d0
        L_0x01c2:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6.r(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.V(r4, r3)
        L_0x01d0:
            yf.p r3 = r11.d()
            Y.F1.b(r6, r1, r3)
            C.k r1 = C.C1093k.f978a
            io.intercom.android.sdk.blocks.lib.models.Block r1 = r12.getBlock()
            java.lang.String r3 = r1.getTitle()
            r1 = r3
            java.lang.String r4 = "getTitle(...)"
            kotlin.jvm.internal.C6496s.g(r3, r4)
            io.intercom.android.sdk.ui.theme.IntercomTheme r11 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r9 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r3 = r11.getColors(r14, r9)
            long r3 = r3.m700getPrimaryText0d7_KjU()
            io.intercom.android.sdk.ui.theme.IntercomTypography r5 = r11.getTypography(r14, r9)
            Q0.T r21 = r5.getType04SemiBold()
            float r5 = io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt.contentAlpha(r13, r14, r10)
            k0.i r5 = o0.C2338a.a(r15, r5)
            r26 = r2
            r2 = r5
            r24 = 0
            r25 = 65528(0xfff8, float:9.1824E-41)
            r5 = 0
            r7 = 0
            r8 = 0
            r16 = 0
            r27 = r9
            r9 = r16
            r16 = 0
            r28 = r11
            r10 = r16
            r16 = 0
            r29 = r12
            r12 = r16
            r30 = r13
            r13 = r16
            r16 = 0
            r31 = r15
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r23 = 0
            r22 = r38
            V.T0.b(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = 2
            float r1 = (float) r1
            float r1 = c1.h.j(r1)
            r14 = r31
            k0.i r1 = androidx.compose.foundation.layout.q.i(r14, r1)
            r15 = 6
            r13 = r38
            C.a0.a(r1, r13, r15)
            io.intercom.android.sdk.blocks.lib.models.Block r1 = r29.getBlock()
            io.intercom.android.sdk.blocks.lib.models.TicketType r1 = r1.getTicketType()
            java.lang.String r1 = r1.getName()
            r10 = r27
            r12 = r28
            io.intercom.android.sdk.ui.theme.IntercomTypography r2 = r12.getTypography(r13, r10)
            Q0.T r21 = r2.getType04()
            r2 = 4285887861(0xff757575, double:2.117509954E-314)
            long r3 = r0.C2550z0.d(r2)
            r11 = r30
            r9 = 0
            float r2 = io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt.contentAlpha(r11, r13, r9)
            k0.i r2 = o0.C2338a.a(r14, r2)
            r16 = 0
            r9 = r16
            r16 = 0
            r33 = r10
            r32 = r11
            r10 = r16
            r16 = 0
            r34 = r12
            r12 = r16
            r13 = r16
            r16 = 0
            r35 = r14
            r14 = r16
            r16 = 0
            r17 = 0
            r23 = 384(0x180, float:5.38E-43)
            V.T0.b(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r38.u()
            float r1 = c1.h.j(r26)
            r2 = r35
            k0.i r1 = androidx.compose.foundation.layout.q.r(r2, r1)
            r9 = r38
            r3 = 6
            C.a0.a(r1, r9, r3)
            int r1 = io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon
            r3 = 0
            w0.c r1 = M0.e.c(r1, r9, r3)
            float r4 = c1.h.j(r26)
            k0.i r2 = androidx.compose.foundation.layout.q.n(r2, r4)
            r4 = r32
            float r3 = io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt.contentAlpha(r4, r9, r3)
            k0.i r3 = o0.C2338a.a(r2, r3)
            r4 = r33
            r2 = r34
            io.intercom.android.sdk.ui.theme.IntercomColors r2 = r2.getColors(r9, r4)
            long r4 = r2.m673getActionContrastWhite0d7_KjU()
            r7 = 56
            r8 = 0
            r2 = 0
            r6 = r38
            V.V.a(r1, r2, r3, r4, r6, r7, r8)
            r38.u()
            r38.u()
        L_0x02e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.create.ui.CreateTicketCardKt$CreateTicketCard$1.invoke(C.j, Y.m, int):void");
    }
}
