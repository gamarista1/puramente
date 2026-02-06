package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import I.f;
import W0.Q;
import Y.C1500m;
import Y.C1510r0;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.common.StringProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class MessageComposerKt$MessageComposer$11 implements q {
    final /* synthetic */ long $actionContrastWhiteColor;
    final /* synthetic */ C1510r0 $borderColor$delegate;
    final /* synthetic */ BottomBarUiState $bottomBarUiState;
    final /* synthetic */ long $defaultColor;
    final /* synthetic */ C1510r0 $disableColor$delegate;
    final /* synthetic */ StringProvider $hintText;
    final /* synthetic */ boolean $isDisabled;
    final /* synthetic */ C6787a $onGifInputSelected;
    final /* synthetic */ C6787a $onMediaInputSelected;
    final /* synthetic */ p $onSendMessage;
    final /* synthetic */ f $shape;
    final /* synthetic */ SpeechRecognizerState $speechRecognizerState;
    final /* synthetic */ C1510r0 $textFieldValue$delegate;
    final /* synthetic */ C1510r0 $textInputSource$delegate;
    final /* synthetic */ C6798l $trackMetric;

    MessageComposerKt$MessageComposer$11(f fVar, C1510r0 r0Var, BottomBarUiState bottomBarUiState, SpeechRecognizerState speechRecognizerState, boolean z10, long j10, p pVar, C1510r0 r0Var2, StringProvider stringProvider, long j11, C6798l lVar, C6787a aVar, C6787a aVar2, C1510r0 r0Var3, C1510r0 r0Var4) {
        this.$shape = fVar;
        this.$borderColor$delegate = r0Var;
        this.$bottomBarUiState = bottomBarUiState;
        this.$speechRecognizerState = speechRecognizerState;
        this.$isDisabled = z10;
        this.$actionContrastWhiteColor = j10;
        this.$onSendMessage = pVar;
        this.$textFieldValue$delegate = r0Var2;
        this.$hintText = stringProvider;
        this.$defaultColor = j11;
        this.$trackMetric = lVar;
        this.$onGifInputSelected = aVar;
        this.$onMediaInputSelected = aVar2;
        this.$disableColor$delegate = r0Var3;
        this.$textInputSource$delegate = r0Var4;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$5$lambda$1(SpeechRecognizerState speechRecognizerState, C6798l lVar, C6787a aVar) {
        C6496s.h(speechRecognizerState, "$speechRecognizerState");
        speechRecognizerState.stopListening();
        lVar.invoke(new MetricData.ComposerInputClicked(MetricTracker.Object.GIF_INPUT));
        aVar.invoke();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$5$lambda$2(SpeechRecognizerState speechRecognizerState, C6787a aVar) {
        C6496s.h(speechRecognizerState, "$speechRecognizerState");
        speechRecognizerState.stopListening();
        aVar.invoke();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$5$lambda$4$lambda$3(p pVar, C1510r0 r0Var, C1510r0 r0Var2) {
        C6496s.h(pVar, "$onSendMessage");
        C6496s.h(r0Var, "$textFieldValue$delegate");
        C6496s.h(r0Var2, "$textInputSource$delegate");
        pVar.invoke(MessageComposerKt.MessageComposer$lambda$7(r0Var).h(), MessageComposerKt.MessageComposer$lambda$10(r0Var2));
        MessageComposerKt.MessageComposer$lambda$8(r0Var, new Q("", 0, (Q0.Q) null, 6, (DefaultConstructorMarker) null));
        MessageComposerKt.MessageComposer$lambda$11(r0Var2, TextInputSource.KEYBOARD);
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((p) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: yf.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(yf.p r51, Y.C1500m r52, int r53) {
        /*
            r50 = this;
            r0 = r50
            r1 = r51
            r4 = r52
            r5 = 1
            java.lang.String r2 = "innerTextField"
            kotlin.jvm.internal.C6496s.h(r1, r2)
            r2 = r53 & 14
            if (r2 != 0) goto L_0x001e
            boolean r2 = r4.C(r1)
            if (r2 == 0) goto L_0x0018
            r2 = 4
            goto L_0x0019
        L_0x0018:
            r2 = 2
        L_0x0019:
            r2 = r53 | r2
            r27 = r2
            goto L_0x0020
        L_0x001e:
            r27 = r53
        L_0x0020:
            r2 = r27 & 91
            r3 = 18
            if (r2 != r3) goto L_0x0032
            boolean r2 = r52.i()
            if (r2 != 0) goto L_0x002d
            goto L_0x0032
        L_0x002d:
            r52.I()
            goto L_0x03af
        L_0x0032:
            k0.i$a r2 = k0.i.f23074a
            r3 = 0
            r12 = 0
            k0.i r6 = androidx.compose.foundation.layout.q.h(r2, r3, r5, r12)
            io.intercom.android.sdk.ui.theme.IntercomTheme r15 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r14 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r7 = r15.getColors(r4, r14)
            long r7 = r7.m678getBackground0d7_KjU()
            I.f r9 = r0.$shape
            k0.i r6 = androidx.compose.foundation.b.c(r6, r7, r9)
            r7 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            float r7 = (float) r7
            float r7 = c1.h.j(r7)
            Y.r0 r8 = r0.$borderColor$delegate
            long r8 = io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt.MessageComposer$lambda$18(r8)
            x.g r7 = x.C2869h.a(r7, r8)
            I.f r8 = r0.$shape
            k0.i r6 = x.C2866e.e(r6, r7, r8)
            k0.c$a r28 = k0.c.f23044a
            k0.c$c r7 = r28.i()
            io.intercom.android.sdk.m5.conversation.states.BottomBarUiState r13 = r0.$bottomBarUiState
            io.intercom.android.sdk.m5.conversation.ui.components.composer.SpeechRecognizerState r11 = r0.$speechRecognizerState
            boolean r10 = r0.$isDisabled
            long r8 = r0.$actionContrastWhiteColor
            yf.p r3 = r0.$onSendMessage
            r16 = r3
            Y.r0 r3 = r0.$textFieldValue$delegate
            io.intercom.android.sdk.ui.common.StringProvider r5 = r0.$hintText
            r18 = r13
            long r12 = r0.$defaultColor
            r19 = r12
            yf.l r13 = r0.$trackMetric
            yf.a r12 = r0.$onGifInputSelected
            r21 = r13
            yf.a r13 = r0.$onMediaInputSelected
            r24 = r13
            Y.r0 r13 = r0.$disableColor$delegate
            r29 = r13
            Y.r0 r13 = r0.$textInputSource$delegate
            C.c r22 = C.C1085c.f882a
            C.c$e r0 = r22.f()
            r25 = r8
            r8 = 48
            H0.F r0 = C.W.b(r0, r7, r4, r8)
            r9 = 0
            int r7 = Y.C1494j.a(r4, r9)
            Y.y r8 = r52.p()
            k0.i r6 = k0.h.e(r4, r6)
            J0.g$a r22 = J0.C1241g.f3853J
            yf.a r9 = r22.a()
            Y.f r31 = r52.j()
            if (r31 != 0) goto L_0x00b9
            Y.C1494j.c()
        L_0x00b9:
            r52.F()
            boolean r31 = r52.f()
            if (r31 == 0) goto L_0x00c6
            r4.U(r9)
            goto L_0x00c9
        L_0x00c6:
            r52.q()
        L_0x00c9:
            Y.m r9 = Y.F1.a(r52)
            r31 = r10
            yf.p r10 = r22.c()
            Y.F1.b(r9, r0, r10)
            yf.p r0 = r22.e()
            Y.F1.b(r9, r8, r0)
            yf.p r0 = r22.b()
            boolean r8 = r9.f()
            if (r8 != 0) goto L_0x00f5
            java.lang.Object r8 = r9.A()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C6496s.c(r8, r10)
            if (r8 != 0) goto L_0x0103
        L_0x00f5:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9.r(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9.V(r7, r0)
        L_0x0103:
            yf.p r0 = r22.d()
            Y.F1.b(r9, r6, r0)
            C.Z r0 = C.Z.f873a
            r6 = 16
            float r6 = (float) r6
            float r6 = c1.h.j(r6)
            k0.i r6 = androidx.compose.foundation.layout.q.r(r2, r6)
            r7 = 6
            C.a0.a(r6, r4, r7)
            r10 = 2
            r32 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r6 = r0
            r7 = r2
            r33 = r25
            r35 = r13
            r13 = 0
            r30 = r31
            r36 = r11
            r11 = r32
            k0.i r6 = C.Y.b(r6, r7, r8, r9, r10, r11)
            r7 = 8
            float r11 = (float) r7
            float r7 = c1.h.j(r11)
            r8 = 0
            r9 = 0
            r10 = 1
            k0.i r6 = androidx.compose.foundation.layout.n.k(r6, r8, r7, r10, r9)
            k0.c r7 = r28.o()
            H0.F r7 = androidx.compose.foundation.layout.d.h(r7, r13)
            int r8 = Y.C1494j.a(r4, r13)
            Y.y r9 = r52.p()
            k0.i r6 = k0.h.e(r4, r6)
            yf.a r10 = r22.a()
            Y.f r17 = r52.j()
            if (r17 != 0) goto L_0x0161
            Y.C1494j.c()
        L_0x0161:
            r52.F()
            boolean r17 = r52.f()
            if (r17 == 0) goto L_0x016e
            r4.U(r10)
            goto L_0x0171
        L_0x016e:
            r52.q()
        L_0x0171:
            Y.m r10 = Y.F1.a(r52)
            yf.p r13 = r22.c()
            Y.F1.b(r10, r7, r13)
            yf.p r7 = r22.e()
            Y.F1.b(r10, r9, r7)
            yf.p r7 = r22.b()
            boolean r9 = r10.f()
            if (r9 != 0) goto L_0x019b
            java.lang.Object r9 = r10.A()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C6496s.c(r9, r13)
            if (r9 != 0) goto L_0x01a9
        L_0x019b:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r10.r(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10.V(r8, r7)
        L_0x01a9:
            yf.p r7 = r22.d()
            Y.F1.b(r10, r6, r7)
            androidx.compose.foundation.layout.f r6 = androidx.compose.foundation.layout.f.f12848a
            r6 = -598934110(0xffffffffdc4cfda2, float:-2.3079907E17)
            r4.T(r6)
            W0.Q r6 = io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt.MessageComposer$lambda$7(r3)
            java.lang.String r6 = r6.h()
            int r6 = r6.length()
            if (r6 != 0) goto L_0x024b
            io.intercom.android.sdk.m5.conversation.states.ComposerState r6 = r18.getComposerState()
            boolean r6 = r6 instanceof io.intercom.android.sdk.m5.conversation.states.ComposerState.TextInput
            if (r6 == 0) goto L_0x01df
            r6 = -1386938525(0xffffffffad54ff63, float:-1.2107512E-11)
            r4.T(r6)
            int r6 = io.intercom.android.sdk.ui.common.StringProvider.$stable
            java.lang.String r5 = r5.getText(r4, r6)
            r52.M()
            r13 = 0
            goto L_0x01ef
        L_0x01df:
            r5 = -1386850299(0xffffffffad565805, float:-1.2184036E-11)
            r4.T(r5)
            int r5 = io.intercom.android.sdk.R.string.intercom_listening
            r13 = 0
            java.lang.String r5 = M0.i.a(r5, r4, r13)
            r52.M()
        L_0x01ef:
            io.intercom.android.sdk.ui.theme.IntercomTypography r6 = r15.getTypography(r4, r14)
            Q0.T r22 = r6.getType04()
            r25 = 0
            r26 = 65530(0xfffa, float:9.1827E-41)
            r6 = 0
            r9 = r3
            r10 = r16
            r3 = r6
            r6 = 0
            r8 = 0
            r16 = 0
            r53 = r9
            r9 = r16
            r37 = r10
            r23 = 1
            r10 = r16
            r16 = 0
            r39 = r11
            r38 = r12
            r31 = r19
            r11 = r16
            r16 = 0
            r40 = r18
            r41 = r21
            r42 = r24
            r43 = r35
            r35 = r13
            r13 = r16
            r44 = r14
            r14 = r16
            r16 = 0
            r45 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 0
            r46 = r2
            r2 = r5
            r47 = r23
            r4 = r31
            r23 = r52
            V.T0.b(r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x0265
        L_0x024b:
            r46 = r2
            r53 = r3
            r39 = r11
            r38 = r12
            r44 = r14
            r45 = r15
            r37 = r16
            r40 = r18
            r41 = r21
            r42 = r24
            r43 = r35
            r35 = 0
            r47 = 1
        L_0x0265:
            r52.M()
            r2 = r27 & 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r15 = r52
            r1.invoke(r15, r2)
            r52.u()
            W0.Q r1 = io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt.MessageComposer$lambda$7(r53)
            java.lang.String r1 = r1.h()
            r11 = r36
            r2 = r40
            boolean r16 = io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt.shouldShowButtons(r1, r2, r11)
            W0.Q r1 = io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt.MessageComposer$lambda$7(r53)
            java.lang.String r1 = r1.h()
            boolean r17 = io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt.shouldShowVoiceInput(r1, r2, r11)
            r1 = 1697402291(0x652c4db3, float:5.085502E22)
            r15.T(r1)
            if (r16 == 0) goto L_0x02b9
            java.util.List r2 = r2.getButtons()
            r3 = r30 ^ 1
            io.intercom.android.sdk.m5.conversation.ui.components.composer.r0 r4 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.r0
            r5 = r38
            r1 = r41
            r4.<init>(r11, r1, r5)
            io.intercom.android.sdk.m5.conversation.ui.components.composer.s0 r5 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.s0
            r1 = r42
            r5.<init>(r11, r1)
            r7 = 64
            r8 = 1
            r1 = 0
            r6 = r52
            io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt.BottomBarButtonComponent(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x02b9:
            r52.M()
            r1 = 1697425343(0x652ca7bf, float:5.095884E22)
            r15.T(r1)
            if (r17 == 0) goto L_0x02f6
            r2 = r30 ^ 1
            r13 = r44
            r14 = r45
            io.intercom.android.sdk.ui.theme.IntercomColors r1 = r14.getColors(r15, r13)
            long r5 = r1.m695getOnActionContrastWhite0d7_KjU()
            r0.x0$a r1 = r0.C2544x0.f25560b
            long r7 = r1.g()
            io.intercom.android.sdk.ui.theme.IntercomColors r1 = r14.getColors(r15, r13)
            long r3 = r1.m686getDescriptionText0d7_KjU()
            r18 = 2121728(0x206000, float:2.973174E-39)
            r19 = 1
            r1 = 0
            r9 = r33
            r12 = r52
            r48 = r13
            r13 = r18
            r49 = r14
            r14 = r19
            io.intercom.android.sdk.m5.conversation.ui.components.composer.VoiceInputLayoutKt.m275VoiceInputLayoutDenoh9s(r1, r2, r3, r5, r7, r9, r11, r12, r13, r14)
            goto L_0x02fa
        L_0x02f6:
            r48 = r44
            r49 = r45
        L_0x02fa:
            r52.M()
            r1 = 1697443809(0x652cefe1, float:5.1042E22)
            r15.T(r1)
            if (r16 != 0) goto L_0x03a9
            if (r17 != 0) goto L_0x03a9
            java.lang.String r1 = "send_button"
            r2 = r46
            k0.i r1 = androidx.compose.ui.platform.n1.a(r2, r1)
            float r2 = c1.h.j(r39)
            k0.i r1 = androidx.compose.foundation.layout.n.i(r1, r2)
            r2 = 32
            float r2 = (float) r2
            float r2 = c1.h.j(r2)
            k0.i r1 = androidx.compose.foundation.layout.q.n(r1, r2)
            k0.c$c r2 = r28.a()
            k0.i r0 = r0.c(r1, r2)
            W0.Q r1 = io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt.MessageComposer$lambda$7(r53)
            java.lang.String r1 = r1.h()
            boolean r1 = Sg.p.d0(r1)
            if (r1 != 0) goto L_0x033b
            if (r30 != 0) goto L_0x033b
            goto L_0x033d
        L_0x033b:
            r47 = r35
        L_0x033d:
            V.T r1 = V.T.f7048a
            r3 = r48
            r2 = r49
            io.intercom.android.sdk.ui.theme.IntercomColors r4 = r2.getColors(r15, r3)
            long r4 = r4.m695getOnActionContrastWhite0d7_KjU()
            long r6 = io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt.MessageComposer$lambda$21(r29)
            io.intercom.android.sdk.ui.theme.IntercomColors r2 = r2.getColors(r15, r3)
            long r8 = r2.m695getOnActionContrastWhite0d7_KjU()
            int r2 = V.T.f7049b
            int r11 = r2 << 12
            r12 = 0
            r2 = r33
            r10 = r52
            V.S r5 = r1.f(r2, r4, r6, r8, r10, r11, r12)
            r1 = 1697454272(0x652d18c0, float:5.1089122E22)
            r15.T(r1)
            r1 = r37
            boolean r2 = r15.S(r1)
            r3 = r53
            boolean r4 = r15.S(r3)
            r2 = r2 | r4
            java.lang.Object r4 = r52.A()
            if (r2 != 0) goto L_0x0385
            Y.m$a r2 = Y.C1500m.f10026a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x038f
        L_0x0385:
            io.intercom.android.sdk.m5.conversation.ui.components.composer.t0 r4 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.t0
            r2 = r43
            r4.<init>(r1, r3, r2)
            r15.r(r4)
        L_0x038f:
            r1 = r4
            yf.a r1 = (yf.C6787a) r1
            r52.M()
            io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$MessageComposerKt r2 = io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$MessageComposerKt.INSTANCE
            yf.p r7 = r2.m270getLambda1$intercom_sdk_base_release()
            r9 = 1572864(0x180000, float:2.204052E-39)
            r10 = 40
            r4 = 0
            r6 = 0
            r2 = r0
            r3 = r47
            r8 = r52
            V.U.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x03a9:
            r52.M()
            r52.u()
        L_0x03af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$11.invoke(yf.p, Y.m, int):void");
    }
}
