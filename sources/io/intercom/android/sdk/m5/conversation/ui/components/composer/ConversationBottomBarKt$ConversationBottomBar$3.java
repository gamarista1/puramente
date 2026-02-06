package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import C.C1088f;
import Y.A1;
import Y.C1500m;
import android.content.Context;
import c1.d;
import c1.h;
import io.intercom.android.sdk.conversation.ReactionInputView;
import io.intercom.android.sdk.conversation.ReactionListener;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ConversationBottomBarKt$ConversationBottomBar$3 implements q {
    final /* synthetic */ BottomBarUiState $bottomBarUiState;
    final /* synthetic */ C6798l $navigateToAnotherConversation;
    final /* synthetic */ C6787a $onGifInputSelected;
    final /* synthetic */ C6798l $onInputChange;
    final /* synthetic */ C6787a $onMediaInputSelected;
    final /* synthetic */ C6787a $onNewConversationClicked;
    final /* synthetic */ C6787a $onPrivacyNoticeDismissed;
    final /* synthetic */ p $onSendMessage;
    final /* synthetic */ C6787a $onTyping;
    final /* synthetic */ float $topSpacing;
    final /* synthetic */ C6798l $trackMetric;

    ConversationBottomBarKt$ConversationBottomBar$3(float f10, BottomBarUiState bottomBarUiState, p pVar, C6787a aVar, C6787a aVar2, C6798l lVar, C6798l lVar2, C6787a aVar3, C6787a aVar4, C6798l lVar3, C6787a aVar5) {
        this.$topSpacing = f10;
        this.$bottomBarUiState = bottomBarUiState;
        this.$onSendMessage = pVar;
        this.$onGifInputSelected = aVar;
        this.$onMediaInputSelected = aVar2;
        this.$onInputChange = lVar;
        this.$trackMetric = lVar2;
        this.$onTyping = aVar3;
        this.$onNewConversationClicked = aVar4;
        this.$navigateToAnotherConversation = lVar3;
        this.$onPrivacyNoticeDismissed = aVar5;
    }

    private static final KeyboardState invoke$lambda$0(A1 a12) {
        return (KeyboardState) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final int invoke$lambda$13$lambda$12$lambda$11(d dVar, int i10) {
        C6496s.h(dVar, "$density");
        return -dVar.E0(h.j((float) 40));
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$13$lambda$4$lambda$3$lambda$2$lambda$1(C6798l lVar, ComposerState.ConversationEnded.ConversationEndedCta conversationEndedCta) {
        C6496s.h(lVar, "$navigateToAnotherConversation");
        C6496s.h(conversationEndedCta, "$it");
        lVar.invoke(conversationEndedCta.getLinkedConversationId());
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final ReactionInputView invoke$lambda$13$lambda$6(BottomBarUiState bottomBarUiState, ReactionListener reactionListener, Context context) {
        C6496s.h(bottomBarUiState, "$bottomBarUiState");
        C6496s.h(reactionListener, "$reactionListener");
        C6496s.h(context, "it");
        ReactionInputView reactionInputView = new ReactionInputView(context);
        reactionInputView.setUpReactions(((ComposerState.Reactions) bottomBarUiState.getComposerState()).getReactionReply(), true, reactionListener);
        return reactionInputView;
    }

    /* access modifiers changed from: private */
    public static final boolean invoke$lambda$13$lambda$8$lambda$7(A1 a12) {
        C6496s.h(a12, "$keyboardAsState$delegate");
        return invoke$lambda$0(a12).isDismissed();
    }

    private static final boolean invoke$lambda$13$lambda$9(A1 a12) {
        return ((Boolean) a12.getValue()).booleanValue();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1088f) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x0372  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(C.C1088f r36, Y.C1500m r37, int r38) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            r12 = r37
            java.lang.String r2 = "$this$BoxWithConstraints"
            kotlin.jvm.internal.C6496s.h(r1, r2)
            r2 = r38 & 14
            if (r2 != 0) goto L_0x001b
            boolean r2 = r12.S(r1)
            if (r2 == 0) goto L_0x0017
            r2 = 4
            goto L_0x0018
        L_0x0017:
            r2 = 2
        L_0x0018:
            r2 = r38 | r2
            goto L_0x001d
        L_0x001b:
            r2 = r38
        L_0x001d:
            r2 = r2 & 91
            r3 = 18
            if (r2 != r3) goto L_0x002f
            boolean r2 = r37.i()
            if (r2 != 0) goto L_0x002a
            goto L_0x002f
        L_0x002a:
            r37.I()
            goto L_0x0440
        L_0x002f:
            C.f0$a r2 = C.f0.f925a
            r3 = 8
            C.f0 r2 = C.l0.i(r2, r12, r3)
            r4 = 0
            C.N r2 = C.h0.d(r2, r12, r4)
            float r2 = r2.d()
            float r1 = r36.g()
            float r5 = r0.$topSpacing
            float r1 = r1 - r5
            float r1 = c1.h.j(r1)
            float r1 = r1 - r2
            float r1 = c1.h.j(r1)
            float r2 = (float) r4
            float r2 = c1.h.j(r2)
            float r1 = Ef.m.c(r1, r2)
            float r1 = c1.h.j(r1)
            Y.I0 r2 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r2 = r12.m(r2)
            r13 = r2
            android.content.Context r13 = (android.content.Context) r13
            Y.A1 r14 = io.intercom.android.sdk.m5.conversation.utils.KeyboardStateKt.keyboardAsState(r12, r4)
            k0.i$a r15 = k0.i.f23074a
            r11 = 0
            r10 = 1
            r9 = 0
            k0.i r2 = androidx.compose.foundation.layout.q.h(r15, r11, r10, r9)
            k0.i r1 = androidx.compose.foundation.layout.q.k(r2, r11, r1, r10, r9)
            k0.i r1 = C.j0.c(r1)
            io.intercom.android.sdk.m5.conversation.states.BottomBarUiState r8 = r0.$bottomBarUiState
            yf.p r2 = r0.$onSendMessage
            yf.a r7 = r0.$onGifInputSelected
            yf.a r6 = r0.$onMediaInputSelected
            yf.l r5 = r0.$onInputChange
            r36 = r7
            yf.l r7 = r0.$trackMetric
            r38 = r7
            yf.a r7 = r0.$onTyping
            yf.a r3 = r0.$onNewConversationClicked
            yf.l r11 = r0.$navigateToAnotherConversation
            r18 = r7
            yf.a r7 = r0.$onPrivacyNoticeDismissed
            C.c r19 = C.C1085c.f882a
            C.c$m r9 = r19.g()
            k0.c$a r21 = k0.c.f23044a
            k0.c$b r10 = r21.k()
            H0.F r9 = C.C1090h.a(r9, r10, r12, r4)
            int r10 = Y.C1494j.a(r12, r4)
            Y.y r4 = r37.p()
            k0.i r1 = k0.h.e(r12, r1)
            J0.g$a r24 = J0.C1241g.f3853J
            yf.a r0 = r24.a()
            Y.f r25 = r37.j()
            if (r25 != 0) goto L_0x00c2
            Y.C1494j.c()
        L_0x00c2:
            r37.F()
            boolean r25 = r37.f()
            if (r25 == 0) goto L_0x00cf
            r12.U(r0)
            goto L_0x00d2
        L_0x00cf:
            r37.q()
        L_0x00d2:
            Y.m r0 = Y.F1.a(r37)
            r25 = r3
            yf.p r3 = r24.c()
            Y.F1.b(r0, r9, r3)
            yf.p r3 = r24.e()
            Y.F1.b(r0, r4, r3)
            yf.p r3 = r24.b()
            boolean r4 = r0.f()
            if (r4 != 0) goto L_0x00fe
            java.lang.Object r4 = r0.A()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            boolean r4 = kotlin.jvm.internal.C6496s.c(r4, r9)
            if (r4 != 0) goto L_0x010c
        L_0x00fe:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r0.r(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r0.V(r4, r3)
        L_0x010c:
            yf.p r3 = r24.d()
            Y.F1.b(r0, r1, r3)
            C.k r0 = C.C1093k.f978a
            io.intercom.android.sdk.m5.conversation.states.ComposerState r1 = r8.getComposerState()
            boolean r3 = r1 instanceof io.intercom.android.sdk.m5.conversation.states.ComposerState.ConversationEnded
            if (r3 == 0) goto L_0x0260
            r1 = 517533693(0x1ed8effd, float:2.2969146E-20)
            r12.T(r1)
            k0.c r1 = r21.o()
            r2 = 0
            H0.F r1 = androidx.compose.foundation.layout.d.h(r1, r2)
            int r3 = Y.C1494j.a(r12, r2)
            Y.y r2 = r37.p()
            k0.i r4 = k0.h.e(r12, r15)
            yf.a r5 = r24.a()
            Y.f r6 = r37.j()
            if (r6 != 0) goto L_0x0145
            Y.C1494j.c()
        L_0x0145:
            r37.F()
            boolean r6 = r37.f()
            if (r6 == 0) goto L_0x0152
            r12.U(r5)
            goto L_0x0155
        L_0x0152:
            r37.q()
        L_0x0155:
            Y.m r5 = Y.F1.a(r37)
            yf.p r6 = r24.c()
            Y.F1.b(r5, r1, r6)
            yf.p r1 = r24.e()
            Y.F1.b(r5, r2, r1)
            yf.p r1 = r24.b()
            boolean r2 = r5.f()
            if (r2 != 0) goto L_0x017f
            java.lang.Object r2 = r5.A()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            boolean r2 = kotlin.jvm.internal.C6496s.c(r2, r6)
            if (r2 != 0) goto L_0x018d
        L_0x017f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r5.r(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r5.V(r2, r1)
        L_0x018d:
            yf.p r1 = r24.d()
            Y.F1.b(r5, r4, r1)
            androidx.compose.foundation.layout.f r1 = androidx.compose.foundation.layout.f.f12848a
            k0.c r2 = r21.e()
            k0.i r1 = r1.e(r15, r2)
            C.c$m r2 = r19.g()
            k0.c$b r3 = r21.k()
            r4 = 0
            H0.F r2 = C.C1090h.a(r2, r3, r12, r4)
            int r3 = Y.C1494j.a(r12, r4)
            Y.y r4 = r37.p()
            k0.i r1 = k0.h.e(r12, r1)
            yf.a r5 = r24.a()
            Y.f r6 = r37.j()
            if (r6 != 0) goto L_0x01c4
            Y.C1494j.c()
        L_0x01c4:
            r37.F()
            boolean r6 = r37.f()
            if (r6 == 0) goto L_0x01d1
            r12.U(r5)
            goto L_0x01d4
        L_0x01d1:
            r37.q()
        L_0x01d4:
            Y.m r5 = Y.F1.a(r37)
            yf.p r6 = r24.c()
            Y.F1.b(r5, r2, r6)
            yf.p r2 = r24.e()
            Y.F1.b(r5, r4, r2)
            yf.p r2 = r24.b()
            boolean r4 = r5.f()
            if (r4 != 0) goto L_0x01fe
            java.lang.Object r4 = r5.A()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.C6496s.c(r4, r6)
            if (r4 != 0) goto L_0x020c
        L_0x01fe:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5.r(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.V(r3, r2)
        L_0x020c:
            yf.p r2 = r24.d()
            Y.F1.b(r5, r1, r2)
            r1 = 0
            r2 = 1
            r3 = 0
            io.intercom.android.sdk.ui.component.IntercomDividerKt.IntercomDivider(r3, r12, r1, r2)
            io.intercom.android.sdk.m5.conversation.states.ComposerState r1 = r8.getComposerState()
            io.intercom.android.sdk.m5.conversation.states.ComposerState$ConversationEnded r1 = (io.intercom.android.sdk.m5.conversation.states.ComposerState.ConversationEnded) r1
            io.intercom.android.sdk.m5.conversation.states.ComposerState$ConversationEnded$ConversationEndedCta r1 = r1.getCta()
            if (r1 == 0) goto L_0x023c
            java.lang.String r2 = r1.getLinkedConversationId()
            if (r2 == 0) goto L_0x0238
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0232
            goto L_0x0238
        L_0x0232:
            io.intercom.android.sdk.m5.conversation.ui.components.composer.L r3 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.L
            r3.<init>(r11, r1)
            goto L_0x023a
        L_0x0238:
            r3 = r25
        L_0x023a:
            r2 = r3
            goto L_0x023d
        L_0x023c:
            r2 = 0
        L_0x023d:
            io.intercom.android.sdk.m5.conversation.states.ComposerState r1 = r8.getComposerState()
            r3 = r1
            io.intercom.android.sdk.m5.conversation.states.ComposerState$ConversationEnded r3 = (io.intercom.android.sdk.m5.conversation.states.ComposerState.ConversationEnded) r3
            int r1 = io.intercom.android.sdk.ui.common.StringProvider.$stable
            int r5 = r1 << 6
            r6 = 1
            r1 = 0
            r4 = r37
            io.intercom.android.sdk.m5.components.ConversationEndedCardKt.ConversationEndedCard(r1, r2, r3, r4, r5, r6)
            r37.u()
            r37.u()
            r37.M()
        L_0x0258:
            r23 = r38
            r25 = r7
            r19 = r8
            goto L_0x0360
        L_0x0260:
            boolean r3 = r1 instanceof io.intercom.android.sdk.m5.conversation.states.ComposerState.Hidden
            if (r3 == 0) goto L_0x028b
            r1 = 518499870(0x1ee7ae1e, float:2.453009E-20)
            r12.T(r1)
            io.intercom.android.sdk.m5.conversation.states.ComposerState r1 = r8.getComposerState()
            io.intercom.android.sdk.m5.conversation.states.ComposerState$Hidden r1 = (io.intercom.android.sdk.m5.conversation.states.ComposerState.Hidden) r1
            boolean r1 = r1.getHideKeyboard()
            if (r1 == 0) goto L_0x0287
            Y.I0 r1 = androidx.compose.ui.platform.C1644k0.o()
            java.lang.Object r1 = r12.m(r1)
            androidx.compose.ui.platform.m1 r1 = (androidx.compose.ui.platform.C1651m1) r1
            if (r1 == 0) goto L_0x0287
            r1.a()
            lf.M r1 = lf.C6514M.f71813a
        L_0x0287:
            r37.M()
            goto L_0x0258
        L_0x028b:
            boolean r3 = r1 instanceof io.intercom.android.sdk.m5.conversation.states.ComposerState.TextInput
            if (r3 != 0) goto L_0x0297
            io.intercom.android.sdk.m5.conversation.states.ComposerState$VoiceInput r3 = io.intercom.android.sdk.m5.conversation.states.ComposerState.VoiceInput.INSTANCE
            boolean r3 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r3 == 0) goto L_0x029b
        L_0x0297:
            r9 = 0
            r10 = 1
            r11 = 0
            goto L_0x0308
        L_0x029b:
            boolean r1 = r1 instanceof io.intercom.android.sdk.m5.conversation.states.ComposerState.Reactions
            if (r1 == 0) goto L_0x02f9
            r1 = 519434923(0x1ef5f2ab, float:2.6040749E-20)
            r12.T(r1)
            io.intercom.android.sdk.activities.ConversationReactionListener r1 = new io.intercom.android.sdk.activities.ConversationReactionListener
            io.intercom.android.sdk.metrics.MetricTracker$ReactionLocation r24 = io.intercom.android.sdk.metrics.MetricTracker.ReactionLocation.CONVERSATION
            io.intercom.android.sdk.m5.conversation.states.ComposerState r2 = r8.getComposerState()
            io.intercom.android.sdk.m5.conversation.states.ComposerState$Reactions r2 = (io.intercom.android.sdk.m5.conversation.states.ComposerState.Reactions) r2
            java.lang.String r25 = r2.getLastPartId()
            io.intercom.android.sdk.m5.conversation.states.ComposerState r2 = r8.getComposerState()
            io.intercom.android.sdk.m5.conversation.states.ComposerState$Reactions r2 = (io.intercom.android.sdk.m5.conversation.states.ComposerState.Reactions) r2
            java.lang.String r26 = r2.getConversationId()
            io.intercom.android.sdk.Injector r2 = io.intercom.android.sdk.Injector.get()
            io.intercom.android.sdk.api.Api r27 = r2.getApi()
            io.intercom.android.sdk.Injector r2 = io.intercom.android.sdk.Injector.get()
            io.intercom.android.sdk.metrics.MetricTracker r28 = r2.getMetricTracker()
            r23 = r1
            r23.<init>(r24, r25, r26, r27, r28)
            r9 = 0
            r10 = 1
            r11 = 0
            k0.i r2 = androidx.compose.foundation.layout.q.h(r15, r11, r10, r9)
            r3 = 24
            float r3 = (float) r3
            float r3 = c1.h.j(r3)
            k0.i r2 = androidx.compose.foundation.layout.n.i(r2, r3)
            io.intercom.android.sdk.m5.conversation.ui.components.composer.M r3 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.M
            r3.<init>(r8, r1)
            r5 = 48
            r6 = 4
            r4 = 0
            r1 = r3
            r3 = r4
            r4 = r37
            androidx.compose.ui.viewinterop.e.a(r1, r2, r3, r4, r5, r6)
            r37.M()
            goto L_0x0258
        L_0x02f9:
            r0 = 1956356443(0x749ba15b, float:9.864242E31)
            r12.T(r0)
            r37.M()
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        L_0x0308:
            r1 = 518800663(0x1eec4517, float:2.5016047E-20)
            r12.T(r1)
            r1 = 16
            float r1 = (float) r1
            float r3 = c1.h.j(r1)
            float r1 = c1.h.j(r1)
            r4 = 8
            float r4 = (float) r4
            float r4 = c1.h.j(r4)
            r16 = 2
            r17 = 0
            r19 = 0
            r20 = r5
            r5 = r15
            r22 = r6
            r6 = r3
            r23 = r38
            r25 = r7
            r24 = r18
            r18 = r36
            r7 = r19
            r19 = r8
            r8 = r1
            r3 = r9
            r9 = r4
            r4 = r10
            r10 = r16
            r1 = r11
            r11 = r17
            k0.i r5 = androidx.compose.foundation.layout.n.m(r5, r6, r7, r8, r9, r10, r11)
            r10 = 518(0x206, float:7.26E-43)
            r11 = 0
            r9 = r1
            r1 = r5
            r8 = r3
            r3 = r19
            r7 = r4
            r4 = r18
            r5 = r22
            r6 = r20
            r7 = r23
            r8 = r24
            r9 = r37
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt.MessageComposer(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r37.M()
        L_0x0360:
            r1 = 1956456104(0x749d26a8, float:9.960628E31)
            r12.T(r1)
            io.intercom.android.sdk.m5.conversation.states.BottomBarUiState$BottomBadgeState r1 = r19.getBottomBadge()
            io.intercom.android.sdk.m5.conversation.states.BottomBarUiState$BottomBadgeState$None r2 = io.intercom.android.sdk.m5.conversation.states.BottomBarUiState.BottomBadgeState.None.INSTANCE
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r2)
            if (r1 != 0) goto L_0x043a
            r1 = 1956457655(0x749d2cb7, float:9.962128E31)
            r12.T(r1)
            java.lang.Object r1 = r37.A()
            Y.m$a r2 = Y.C1500m.f10026a
            java.lang.Object r3 = r2.a()
            if (r1 != r3) goto L_0x0390
            io.intercom.android.sdk.m5.conversation.ui.components.composer.N r1 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.N
            r1.<init>(r14)
            Y.A1 r1 = Y.p1.e(r1)
            r12.r(r1)
        L_0x0390:
            Y.A1 r1 = (Y.A1) r1
            r37.M()
            Y.I0 r3 = androidx.compose.ui.platform.C1644k0.e()
            java.lang.Object r3 = r12.m(r3)
            c1.d r3 = (c1.d) r3
            k0.c$b r4 = r21.g()
            k0.i r4 = r0.b(r15, r4)
            boolean r11 = invoke$lambda$13$lambda$9(r1)
            r1 = 1956471136(0x749d6160, float:9.975166E31)
            r12.T(r1)
            boolean r1 = r12.S(r3)
            java.lang.Object r5 = r37.A()
            if (r1 != 0) goto L_0x03c1
            java.lang.Object r1 = r2.a()
            if (r5 != r1) goto L_0x03c9
        L_0x03c1:
            io.intercom.android.sdk.m5.conversation.ui.components.composer.O r5 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.O
            r5.<init>(r3)
            r12.r(r5)
        L_0x03c9:
            yf.l r5 = (yf.C6798l) r5
            r37.M()
            r1 = 1
            r2 = 0
            androidx.compose.animation.i r3 = androidx.compose.animation.g.C(r2, r5, r1, r2)
            k0.c$c r6 = r21.l()
            r9 = 13
            r10 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            androidx.compose.animation.i r5 = androidx.compose.animation.g.m(r5, r6, r7, r8, r9, r10)
            androidx.compose.animation.i r3 = r3.c(r5)
            r5 = 1050253722(0x3e99999a, float:0.3)
            androidx.compose.animation.i r5 = androidx.compose.animation.g.o(r2, r5, r1, r2)
            androidx.compose.animation.i r14 = r3.c(r5)
            r3 = 3
            androidx.compose.animation.k r5 = androidx.compose.animation.g.G(r2, r2, r3, r2)
            r33 = 15
            r34 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            androidx.compose.animation.k r6 = androidx.compose.animation.g.y(r29, r30, r31, r32, r33, r34)
            androidx.compose.animation.k r5 = r5.c(r6)
            r6 = 0
            androidx.compose.animation.k r2 = androidx.compose.animation.g.q(r2, r6, r3, r2)
            androidx.compose.animation.k r15 = r5.c(r2)
            io.intercom.android.sdk.m5.conversation.ui.components.composer.ConversationBottomBarKt$ConversationBottomBar$3$1$4 r2 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.ConversationBottomBarKt$ConversationBottomBar$3$1$4
            r5 = r2
            r6 = r19
            r7 = r25
            r8 = r0
            r9 = r23
            r10 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r3 = 54
            r5 = -184436761(0xfffffffff501b7e7, float:-1.6443757E32)
            g0.a r7 = g0.c.e(r5, r1, r2, r12, r3)
            r9 = 1597446(0x186006, float:2.238499E-39)
            r10 = 16
            r6 = 0
            r1 = r0
            r2 = r11
            r3 = r4
            r4 = r14
            r5 = r15
            r8 = r37
            v.C2721d.e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x043a:
            r37.M()
            r37.u()
        L_0x0440:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.composer.ConversationBottomBarKt$ConversationBottomBar$3.invoke(C.f, Y.m, int):void");
    }
}
