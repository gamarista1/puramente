package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import Q0.S;
import W0.Q;
import Y.A1;
import Y.C1500m;
import Y.C1510r0;
import Y.M0;
import Y.Y0;
import Y.o1;
import androidx.compose.ui.platform.C1651m1;
import c1.h;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.InputTypeState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.SpeechRecognizerState;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6535s;
import mf.C6565s;
import p0.l;
import r0.C2544x0;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0001\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u000f\u0010\u001b\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u000f\u0010\u001d\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u001d\u0010\u001c\u001a\u000f\u0010\u001e\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u001e\u0010\u001c\u001a\u000f\u0010\u001f\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u001f\u0010\u001c\"\u001a\u0010!\u001a\u00020 8\u0000X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u001a\u0010%\u001a\u00020 8\u0000X\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$¨\u00060²\u0006\u000e\u0010(\u001a\u00020'8\n@\nX\u0002²\u0006\u000e\u0010)\u001a\u00020\u00048\n@\nX\u0002²\u0006\u000e\u0010*\u001a\u00020\u00178\n@\nX\u0002²\u0006\u000e\u0010,\u001a\u00020+8\n@\nX\u0002²\u0006\u000e\u0010-\u001a\u00020+8\n@\nX\u0002²\u0006\f\u0010/\u001a\u00020.8\nX\u0002"}, d2 = {"Lk0/i;", "modifier", "Lkotlin/Function2;", "", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/TextInputSource;", "Llf/M;", "onSendMessage", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState;", "bottomBarUiState", "Lkotlin/Function0;", "onGifInputSelected", "onMediaInputSelected", "Lkotlin/Function1;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/ComposerInputType;", "onInputChange", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "trackMetric", "onTyping", "MessageComposer", "(Lk0/i;Lyf/p;Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState;Lyf/a;Lyf/a;Lyf/l;Lyf/l;Lyf/a;LY/m;II)V", "messageText", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/SpeechRecognizerState;", "speechRecognizerState", "", "shouldShowVoiceInput", "(Ljava/lang/String;Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState;Lio/intercom/android/sdk/m5/conversation/ui/components/composer/SpeechRecognizerState;)Z", "shouldShowButtons", "TextComposerPreview", "(LY/m;I)V", "TextComposerWithButtonsPreview", "TextComposerWithInitialTextPreview", "TextComposerWithFinDictationPreview", "Lc1/h;", "ComposerMinSize", "F", "getComposerMinSize", "()F", "ComposerHalfSize", "getComposerHalfSize", "LW0/Q;", "textFieldValue", "textInputSource", "shouldRequestFocus", "Lr0/x0;", "borderColor", "disableColor", "Lio/intercom/android/sdk/m5/conversation/utils/KeyboardState;", "keyboardAsState", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MessageComposerKt {
    private static final float ComposerHalfSize;
    private static final float ComposerMinSize;

    static {
        float j10 = h.j((float) 48);
        ComposerMinSize = j10;
        ComposerHalfSize = h.j(j10 / ((float) 2));
    }

    public static final void MessageComposer(i iVar, p pVar, BottomBarUiState bottomBarUiState, C6787a aVar, C6787a aVar2, C6798l lVar, C6798l lVar2, C6787a aVar3, C1500m mVar, int i10, int i11) {
        i iVar2;
        C6787a aVar4;
        C6787a aVar5;
        C6798l lVar3;
        C6798l lVar4;
        C6787a aVar6;
        Pair pair;
        boolean z10;
        int i12;
        boolean z11;
        boolean z12;
        C1510r0 r0Var;
        C1510r0 r0Var2;
        C1651m1 m1Var;
        p0 p0Var;
        long j10;
        C6798l lVar5;
        C6787a aVar7;
        C6787a aVar8;
        boolean z13;
        int i13;
        boolean z14;
        int i14 = i11;
        C6496s.h(pVar, "onSendMessage");
        C6496s.h(bottomBarUiState, "bottomBarUiState");
        C1500m h10 = mVar.h(1906237335);
        if ((i14 & 1) != 0) {
            iVar2 = i.f23074a;
        } else {
            iVar2 = iVar;
        }
        if ((i14 & 8) != 0) {
            new j0
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0028: CONSTRUCTOR  (r4v21 ? I:io.intercom.android.sdk.m5.conversation.ui.components.composer.j0) =  call: io.intercom.android.sdk.m5.conversation.ui.components.composer.j0.<init>():void type: CONSTRUCTOR in method: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt.MessageComposer(k0.i, yf.p, io.intercom.android.sdk.m5.conversation.states.BottomBarUiState, yf.a, yf.a, yf.l, yf.l, yf.a, Y.m, int, int):void, dex: classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v21 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                r10 = r96
                java.lang.String r0 = "onSendMessage"
                r2 = r87
                kotlin.jvm.internal.C6496s.h(r2, r0)
                java.lang.String r0 = "bottomBarUiState"
                r3 = r88
                kotlin.jvm.internal.C6496s.h(r3, r0)
                r0 = 1906237335(0x719edf97, float:1.5734059E30)
                r1 = r94
                Y.m r0 = r1.h(r0)
                r1 = r10 & 1
                if (r1 == 0) goto L_0x0020
                k0.i$a r1 = k0.i.f23074a
                goto L_0x0022
            L_0x0020:
                r1 = r86
            L_0x0022:
                r4 = r10 & 8
                if (r4 == 0) goto L_0x002c
                io.intercom.android.sdk.m5.conversation.ui.components.composer.j0 r4 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.j0
                r4.<init>()
                goto L_0x002e
            L_0x002c:
                r4 = r89
            L_0x002e:
                r5 = r10 & 16
                if (r5 == 0) goto L_0x0038
                io.intercom.android.sdk.m5.conversation.ui.components.composer.k0 r5 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.k0
                r5.<init>()
                goto L_0x003a
            L_0x0038:
                r5 = r90
            L_0x003a:
                r6 = r10 & 32
                if (r6 == 0) goto L_0x0044
                io.intercom.android.sdk.m5.conversation.ui.components.composer.l0 r6 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.l0
                r6.<init>()
                goto L_0x0046
            L_0x0044:
                r6 = r91
            L_0x0046:
                r7 = r10 & 64
                if (r7 == 0) goto L_0x0050
                io.intercom.android.sdk.m5.conversation.ui.components.composer.m0 r7 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.m0
                r7.<init>()
                goto L_0x0052
            L_0x0050:
                r7 = r92
            L_0x0052:
                r8 = r10 & 128(0x80, float:1.794E-43)
                if (r8 == 0) goto L_0x005c
                io.intercom.android.sdk.m5.conversation.ui.components.composer.n0 r8 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.n0
                r8.<init>()
                goto L_0x005e
            L_0x005c:
                r8 = r93
            L_0x005e:
                io.intercom.android.sdk.m5.conversation.states.ComposerState r9 = r88.getComposerState()
                boolean r9 = r9 instanceof io.intercom.android.sdk.m5.conversation.states.ComposerState.TextInput
                r15 = 2
                r14 = 0
                if (r9 == 0) goto L_0x0082
                kotlin.Pair r9 = new kotlin.Pair
                io.intercom.android.sdk.m5.conversation.states.ComposerState r11 = r88.getComposerState()
                io.intercom.android.sdk.m5.conversation.states.ComposerState$TextInput r11 = (io.intercom.android.sdk.m5.conversation.states.ComposerState.TextInput) r11
                java.lang.String r11 = r11.getInitialMessage()
                io.intercom.android.sdk.m5.conversation.states.ComposerState r12 = r88.getComposerState()
                io.intercom.android.sdk.m5.conversation.states.ComposerState$TextInput r12 = (io.intercom.android.sdk.m5.conversation.states.ComposerState.TextInput) r12
                io.intercom.android.sdk.ui.common.StringProvider r12 = r12.getHintText()
                r9.<init>(r11, r12)
                goto L_0x0090
            L_0x0082:
                kotlin.Pair r9 = new kotlin.Pair
                io.intercom.android.sdk.ui.common.StringProvider$StringRes r11 = new io.intercom.android.sdk.ui.common.StringProvider$StringRes
                int r12 = io.intercom.android.sdk.R.string.intercom_send_us_a_message
                r11.<init>(r12, r14, r15, r14)
                java.lang.String r12 = ""
                r9.<init>(r12, r11)
            L_0x0090:
                java.lang.Object r11 = r9.a()
                java.lang.String r11 = (java.lang.String) r11
                java.lang.Object r9 = r9.b()
                r21 = r9
                io.intercom.android.sdk.ui.common.StringProvider r21 = (io.intercom.android.sdk.ui.common.StringProvider) r21
                io.intercom.android.sdk.m5.conversation.states.ComposerState r9 = r88.getComposerState()
                boolean r9 = r9 instanceof io.intercom.android.sdk.m5.conversation.states.ComposerState.TextInput
                r13 = 0
                if (r9 == 0) goto L_0x00b2
                io.intercom.android.sdk.m5.conversation.states.ComposerState r9 = r88.getComposerState()
                io.intercom.android.sdk.m5.conversation.states.ComposerState$TextInput r9 = (io.intercom.android.sdk.m5.conversation.states.ComposerState.TextInput) r9
                boolean r9 = r9.isDisabled()
                goto L_0x00b3
            L_0x00b2:
                r9 = r13
            L_0x00b3:
                java.lang.Object[] r12 = new java.lang.Object[r13]
                io.intercom.android.sdk.m5.utils.TextFieldSaver r16 = io.intercom.android.sdk.m5.utils.TextFieldSaver.INSTANCE
                h0.j r16 = r16.getTextFieldValueSaver()
                r13 = 319543632(0x130bd950, float:1.765141E-27)
                r0.T(r13)
                boolean r13 = r0.S(r11)
                java.lang.Object r14 = r0.A()
                if (r13 != 0) goto L_0x00d3
                Y.m$a r13 = Y.C1500m.f10026a
                java.lang.Object r13 = r13.a()
                if (r14 != r13) goto L_0x00db
            L_0x00d3:
                io.intercom.android.sdk.m5.conversation.ui.components.composer.o0 r14 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.o0
                r14.<init>(r11)
                r0.r(r14)
            L_0x00db:
                yf.a r14 = (yf.C6787a) r14
                r0.M()
                r17 = 72
                r18 = 4
                r13 = 0
                r11 = r12
                r12 = r16
                r2 = 0
                r2 = 0
                r15 = r0
                r16 = r17
                r17 = r18
                Y.r0 r15 = h0.C2018b.d(r11, r12, r13, r14, r15, r16, r17)
                r11 = 319551525(0x130bf825, float:1.7666611E-27)
                r0.T(r11)
                java.lang.Object r11 = r0.A()
                Y.m$a r18 = Y.C1500m.f10026a
                java.lang.Object r12 = r18.a()
                if (r11 != r12) goto L_0x0110
                io.intercom.android.sdk.m5.conversation.ui.components.composer.TextInputSource r11 = io.intercom.android.sdk.m5.conversation.ui.components.composer.TextInputSource.KEYBOARD
                r14 = 2
                Y.r0 r11 = Y.u1.d(r11, r2, r14, r2)
                r0.r(r11)
                goto L_0x0111
            L_0x0110:
                r14 = 2
            L_0x0111:
                r28 = r11
                Y.r0 r28 = (Y.C1510r0) r28
                r0.M()
                r11 = 319554194(0x130c0292, float:1.7671752E-27)
                r0.T(r11)
                java.lang.Object r11 = r0.A()
                java.lang.Object r12 = r18.a()
                if (r11 != r12) goto L_0x0131
                java.lang.Boolean r11 = java.lang.Boolean.FALSE
                Y.r0 r11 = Y.u1.d(r11, r2, r14, r2)
                r0.r(r11)
            L_0x0131:
                r13 = r11
                Y.r0 r13 = (Y.C1510r0) r13
                r0.M()
                Y.I0 r11 = androidx.compose.ui.platform.C1644k0.o()
                java.lang.Object r11 = r0.m(r11)
                r12 = r11
                androidx.compose.ui.platform.m1 r12 = (androidx.compose.ui.platform.C1651m1) r12
                r11 = 319560658(0x130c1bd2, float:1.76842E-27)
                r0.T(r11)
                r11 = 458752(0x70000, float:6.42848E-40)
                r11 = r95 & r11
                r16 = 196608(0x30000, float:2.75506E-40)
                r11 = r11 ^ r16
                r14 = 131072(0x20000, float:1.83671E-40)
                if (r11 <= r14) goto L_0x015a
                boolean r11 = r0.S(r6)
                if (r11 != 0) goto L_0x015e
            L_0x015a:
                r11 = r95 & r16
                if (r11 != r14) goto L_0x0160
            L_0x015e:
                r11 = 1
                goto L_0x0161
            L_0x0160:
                r11 = 0
            L_0x0161:
                boolean r14 = r0.S(r12)
                r11 = r11 | r14
                r14 = 3670016(0x380000, float:5.142788E-39)
                r14 = r95 & r14
                r16 = 1572864(0x180000, float:2.204052E-39)
                r14 = r14 ^ r16
                r2 = 1048576(0x100000, float:1.469368E-39)
                if (r14 <= r2) goto L_0x0178
                boolean r14 = r0.S(r7)
                if (r14 != 0) goto L_0x017c
            L_0x0178:
                r14 = r95 & r16
                if (r14 != r2) goto L_0x017e
            L_0x017c:
                r2 = 1
                goto L_0x017f
            L_0x017e:
                r2 = 0
            L_0x017f:
                r2 = r2 | r11
                boolean r11 = r0.S(r15)
                r2 = r2 | r11
                java.lang.Object r11 = r0.A()
                if (r2 != 0) goto L_0x019a
                java.lang.Object r2 = r18.a()
                if (r11 != r2) goto L_0x0192
                goto L_0x019a
            L_0x0192:
                r19 = r12
                r90 = r13
                r20 = r15
                r3 = 2
                goto L_0x01b5
            L_0x019a:
                io.intercom.android.sdk.m5.conversation.ui.components.composer.p0 r2 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.p0
                r11 = r2
                r19 = r12
                r12 = r6
                r14 = r13
                r13 = r19
                r90 = r14
                r3 = 2
                r14 = r7
                r20 = r15
                r15 = r90
                r16 = r28
                r17 = r20
                r11.<init>(r12, r13, r14, r15, r16, r17)
                r0.r(r2)
            L_0x01b5:
                yf.l r11 = (yf.C6798l) r11
                r0.M()
                r2 = 0
                io.intercom.android.sdk.m5.conversation.ui.components.composer.SpeechRecognizerState r15 = io.intercom.android.sdk.m5.conversation.ui.components.composer.VoiceInputLayoutKt.rememberSpeechRecognizerState(r11, r0, r2, r2)
                float r2 = ComposerHalfSize
                I.f r12 = I.g.c(r2)
                io.intercom.android.sdk.ui.theme.IntercomTheme r2 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
                int r11 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
                io.intercom.android.sdk.ui.theme.IntercomColors r13 = r2.getColors(r0, r11)
                long r29 = r13.m700getPrimaryText0d7_KjU()
                r35 = 14
                r36 = 0
                r31 = 1056964608(0x3f000000, float:0.5)
                r32 = 0
                r33 = 0
                r34 = 0
                long r22 = r0.C2544x0.o(r29, r31, r32, r33, r34, r35, r36)
                io.intercom.android.sdk.ui.theme.IntercomColors r13 = r2.getColors(r0, r11)
                long r24 = r13.m673getActionContrastWhite0d7_KjU()
                io.intercom.android.sdk.ui.theme.IntercomColors r13 = r2.getColors(r0, r11)
                long r13 = r13.m683getCardBorder0d7_KjU()
                io.intercom.android.sdk.ui.theme.IntercomColors r16 = r2.getColors(r0, r11)
                long r16 = r16.m672getAction0d7_KjU()
                boolean r16 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m719isLightColor8_81llA(r16)
                if (r16 == 0) goto L_0x0215
                r3 = 1317928414(0x4e8dfdde, float:1.19111245E9)
                r0.T(r3)
                io.intercom.android.sdk.ui.theme.IntercomColors r3 = r2.getColors(r0, r11)
                long r16 = r3.m672getAction0d7_KjU()
                long r16 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m711darken8_81llA(r16)
                r0.M()
                goto L_0x0226
            L_0x0215:
                r3 = 1317985671(0x4e8edd87, float:1.19844134E9)
                r0.T(r3)
                io.intercom.android.sdk.ui.theme.IntercomColors r3 = r2.getColors(r0, r11)
                long r16 = r3.m672getAction0d7_KjU()
                r0.M()
            L_0x0226:
                r3 = 319612511(0x130ce65f, float:1.7784066E-27)
                r0.T(r3)
                java.lang.Object r3 = r0.A()
                java.lang.Object r10 = r18.a()
                if (r3 != r10) goto L_0x0246
                r0.x0 r3 = r0.C2544x0.k(r13)
                r49 = r6
                r6 = 0
                r10 = 2
                Y.r0 r3 = Y.u1.d(r3, r6, r10, r6)
                r0.r(r3)
                goto L_0x0248
            L_0x0246:
                r49 = r6
            L_0x0248:
                Y.r0 r3 = (Y.C1510r0) r3
                r0.M()
                io.intercom.android.sdk.ui.theme.IntercomColors r6 = r2.getColors(r0, r11)
                long r26 = r6.m687getDisabled0d7_KjU()
                r29 = 4289901234(0xffb2b2b2, double:2.119492824E-314)
                long r39 = r0.C2550z0.d(r29)
                r6 = 319618337(0x130cfd21, float:1.7795286E-27)
                r0.T(r6)
                java.lang.Object r6 = r0.A()
                java.lang.Object r10 = r18.a()
                if (r6 != r10) goto L_0x027e
                r0.x0 r6 = r0.C2544x0.k(r26)
                r50 = r5
                r5 = 0
                r10 = 2
                Y.r0 r6 = Y.u1.d(r6, r5, r10, r5)
                r0.r(r6)
                goto L_0x0280
            L_0x027e:
                r50 = r5
            L_0x0280:
                r5 = r6
                Y.r0 r5 = (Y.C1510r0) r5
                r0.M()
                r6 = 319620749(0x130d068d, float:1.7799932E-27)
                r0.T(r6)
                java.lang.Object r6 = r0.A()
                java.lang.Object r10 = r18.a()
                if (r6 != r10) goto L_0x029e
                androidx.compose.ui.focus.o r6 = new androidx.compose.ui.focus.o
                r6.<init>()
                r0.r(r6)
            L_0x029e:
                androidx.compose.ui.focus.o r6 = (androidx.compose.ui.focus.o) r6
                r0.M()
                boolean r10 = MessageComposer$lambda$13(r90)
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
                r51 = r4
                r4 = 319623060(0x130d0f94, float:1.7804383E-27)
                r0.T(r4)
                java.lang.Object r4 = r0.A()
                r52 = r7
                java.lang.Object r7 = r18.a()
                if (r4 != r7) goto L_0x02cd
                io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$6$1 r4 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$6$1
                r53 = r8
                r7 = 0
                r8 = r90
                r4.<init>(r6, r8, r7)
                r0.r(r4)
                goto L_0x02cf
            L_0x02cd:
                r53 = r8
            L_0x02cf:
                yf.p r4 = (yf.p) r4
                r0.M()
                r7 = 64
                Y.P.g(r10, r4, r0, r7)
                r4 = 0
                Y.A1 r8 = io.intercom.android.sdk.m5.conversation.utils.KeyboardStateKt.keyboardAsState(r0, r4)
                Y.I0 r10 = androidx.compose.ui.platform.C1644k0.f()
                java.lang.Object r10 = r0.m(r10)
                p0.e r10 = (p0.e) r10
                io.intercom.android.sdk.m5.conversation.utils.KeyboardState r18 = MessageComposer$lambda$25(r8)
                boolean r18 = r18.isDismissed()
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r18)
                r90 = r2
                io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$7 r2 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$7
                r91 = r11
                r11 = 0
                r2.<init>(r15, r10, r8, r11)
                Y.P.g(r4, r2, r0, r7)
                r2 = 319637147(0x130d469b, float:1.7831513E-27)
                r0.T(r2)
                r2 = 319637533(0x130d481d, float:1.7832257E-27)
                r0.T(r2)
                Y.I0 r2 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f()
                java.lang.Object r2 = r0.m(r2)
                android.content.res.Configuration r2 = (android.content.res.Configuration) r2
                int r2 = r2.orientation
                r4 = 2
                if (r2 != r4) goto L_0x031e
                r2 = 1
                goto L_0x031f
            L_0x031e:
                r2 = 0
            L_0x031f:
                r0.M()
                if (r2 == 0) goto L_0x0326
                r2 = r4
                goto L_0x034c
            L_0x0326:
                r2 = 319640404(0x130d5354, float:1.7837786E-27)
                r0.T(r2)
                Y.I0 r2 = androidx.compose.ui.platform.C1644k0.e()
                java.lang.Object r2 = r0.m(r2)
                c1.d r2 = (c1.d) r2
                float r2 = r2.r1()
                double r10 = (double) r2
                r29 = 4609434218613702656(0x3ff8000000000000, double:1.5)
                int r2 = (r10 > r29 ? 1 : (r10 == r29 ? 0 : -1))
                if (r2 <= 0) goto L_0x0343
                r2 = 1
                goto L_0x0344
            L_0x0343:
                r2 = 0
            L_0x0344:
                r0.M()
                if (r2 == 0) goto L_0x034b
                r2 = 4
                goto L_0x034c
            L_0x034b:
                r2 = 5
            L_0x034c:
                r0.M()
                r4 = 0
                r8 = 0
                r10 = 1
                k0.i r11 = androidx.compose.foundation.layout.q.h(r1, r4, r10, r8)
                float r7 = ComposerMinSize
                k0.i r4 = androidx.compose.foundation.layout.q.b(r11, r4, r7, r10, r8)
                k0.i r29 = androidx.compose.ui.focus.p.a(r4, r6)
                r4 = 4
                float r4 = (float) r4
                float r30 = c1.h.j(r4)
                long r33 = MessageComposer$lambda$18(r3)
                long r35 = MessageComposer$lambda$18(r3)
                r37 = 4
                r38 = 0
                r32 = 0
                r31 = r12
                k0.i r4 = o0.C2349l.b(r29, r30, r31, r32, r33, r35, r37, r38)
                io.intercom.android.sdk.m5.conversation.ui.components.composer.q0 r6 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.q0
                r29 = r6
                r30 = r16
                r32 = r13
                r34 = r39
                r36 = r26
                r38 = r15
                r39 = r19
                r40 = r3
                r41 = r5
                r29.<init>(r30, r32, r34, r36, r38, r39, r40, r41)
                k0.i r31 = androidx.compose.ui.focus.b.a(r4, r6)
                W0.Q r29 = MessageComposer$lambda$7(r20)
                r32 = r9 ^ 1
                r4 = r90
                r6 = r91
                io.intercom.android.sdk.ui.theme.IntercomColors r7 = r4.getColors(r0, r6)
                long r7 = r7.m700getPrimaryText0d7_KjU()
                r0.h2 r10 = new r0.h2
                r43 = r10
                r11 = 0
                r10.<init>(r7, r11)
                io.intercom.android.sdk.ui.theme.IntercomTypography r7 = r4.getTypography(r0, r6)
                Q0.T r54 = r7.getType04()
                io.intercom.android.sdk.ui.theme.IntercomColors r4 = r4.getColors(r0, r6)
                long r55 = r4.m700getPrimaryText0d7_KjU()
                r84 = 16777214(0xfffffe, float:2.3509884E-38)
                r85 = 0
                r57 = 0
                r59 = 0
                r60 = 0
                r61 = 0
                r62 = 0
                r63 = 0
                r64 = 0
                r66 = 0
                r67 = 0
                r68 = 0
                r69 = 0
                r71 = 0
                r72 = 0
                r73 = 0
                r74 = 0
                r75 = 0
                r76 = 0
                r78 = 0
                r79 = 0
                r80 = 0
                r81 = 0
                r82 = 0
                r83 = 0
                Q0.T r34 = Q0.T.c(r54, r55, r57, r59, r60, r61, r62, r63, r64, r66, r67, r68, r69, r71, r72, r73, r74, r75, r76, r78, r79, r80, r81, r82, r83, r84, r85)
                io.intercom.android.sdk.m5.conversation.ui.components.composer.a0 r4 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.a0
                r30 = r4
                r89 = r4
                r90 = r53
                r91 = r15
                r92 = r87
                r93 = r20
                r94 = r28
                r89.<init>(r90, r91, r92, r93, r94)
                io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$11 r4 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$11
                r11 = r4
                r13 = r3
                r14 = r88
                r16 = r9
                r17 = r24
                r19 = r87
                r24 = r52
                r25 = r51
                r26 = r50
                r27 = r5
                r11.<init>(r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r24, r25, r26, r27, r28)
                r3 = 54
                r5 = -1829627116(0xffffffff92f21b14, float:-1.5279022E-27)
                r6 = 1
                g0.a r44 = g0.c.e(r5, r6, r4, r0, r3)
                r47 = 196608(0x30000, float:2.75506E-40)
                r48 = 15824(0x3dd0, float:2.2174E-41)
                r33 = 0
                r35 = 0
                r36 = 0
                r37 = 0
                r39 = 0
                r40 = 0
                r41 = 0
                r42 = 0
                r46 = 0
                r38 = r2
                r45 = r0
                J.C1207c.a(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
                Y.Y0 r11 = r0.k()
                if (r11 == 0) goto L_0x0468
                io.intercom.android.sdk.m5.conversation.ui.components.composer.b0 r12 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.b0
                r0 = r12
                r2 = r87
                r3 = r88
                r4 = r51
                r5 = r50
                r6 = r49
                r7 = r52
                r8 = r53
                r9 = r95
                r10 = r96
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r11.a(r12)
            L_0x0468:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt.MessageComposer(k0.i, yf.p, io.intercom.android.sdk.m5.conversation.states.BottomBarUiState, yf.a, yf.a, yf.l, yf.l, yf.a, Y.m, int, int):void");
        }

        /* access modifiers changed from: private */
        public static final C6514M MessageComposer$lambda$0() {
            return C6514M.f71813a;
        }

        /* access modifiers changed from: private */
        public static final C6514M MessageComposer$lambda$1() {
            return C6514M.f71813a;
        }

        /* access modifiers changed from: private */
        public static final TextInputSource MessageComposer$lambda$10(C1510r0 r0Var) {
            return (TextInputSource) r0Var.getValue();
        }

        /* access modifiers changed from: private */
        public static final void MessageComposer$lambda$11(C1510r0 r0Var, TextInputSource textInputSource) {
            r0Var.setValue(textInputSource);
        }

        /* access modifiers changed from: private */
        public static final boolean MessageComposer$lambda$13(C1510r0 r0Var) {
            return ((Boolean) r0Var.getValue()).booleanValue();
        }

        /* access modifiers changed from: private */
        public static final void MessageComposer$lambda$14(C1510r0 r0Var, boolean z10) {
            r0Var.setValue(Boolean.valueOf(z10));
        }

        /* access modifiers changed from: private */
        public static final C6514M MessageComposer$lambda$16$lambda$15(C6798l lVar, C1651m1 m1Var, C6798l lVar2, C1510r0 r0Var, C1510r0 r0Var2, C1510r0 r0Var3, SpeechRecognizerState.SpeechState speechState) {
            C6496s.h(r0Var, "$shouldRequestFocus$delegate");
            C6496s.h(r0Var2, "$textInputSource$delegate");
            C6496s.h(r0Var3, "$textFieldValue$delegate");
            C6496s.h(speechState, "it");
            if (C6496s.c(speechState, SpeechRecognizerState.SpeechState.Listening.INSTANCE)) {
                lVar.invoke(ComposerInputType.VOICE);
                MessageComposer$lambda$14(r0Var, true);
                if (m1Var != null) {
                    m1Var.a();
                }
                lVar2.invoke(MetricData.SpeechRecognitionStarted.INSTANCE);
                MessageComposer$lambda$11(r0Var2, TextInputSource.VOICE_ONLY);
            } else if (speechState instanceof SpeechRecognizerState.SpeechState.SpeechEnded) {
                SpeechRecognizerState.SpeechState.SpeechEnded speechEnded = (SpeechRecognizerState.SpeechState.SpeechEnded) speechState;
                MessageComposer$lambda$8(r0Var3, Q.d(MessageComposer$lambda$7(r0Var3), speechEnded.getMessage(), S.a(speechEnded.getMessage().length()), (Q0.Q) null, 4, (Object) null));
                lVar.invoke(ComposerInputType.TEXT);
                if (m1Var != null) {
                    m1Var.b();
                }
                MessageComposer$lambda$14(r0Var, true);
                lVar2.invoke(new MetricData.SpeechRecognitionEnded(speechEnded.getDuration()));
            } else if (speechState instanceof SpeechRecognizerState.SpeechState.SpeechInProgress) {
                SpeechRecognizerState.SpeechState.SpeechInProgress speechInProgress = (SpeechRecognizerState.SpeechState.SpeechInProgress) speechState;
                MessageComposer$lambda$8(r0Var3, Q.d(MessageComposer$lambda$7(r0Var3), speechInProgress.getMessage(), S.a(speechInProgress.getMessage().length()), (Q0.Q) null, 4, (Object) null));
            } else if (!C6496s.c(speechState, SpeechRecognizerState.SpeechState.SpeechStarted.INSTANCE)) {
                throw new C6535s();
            }
            return C6514M.f71813a;
        }

        /* access modifiers changed from: private */
        public static final long MessageComposer$lambda$18(C1510r0 r0Var) {
            return ((C2544x0) r0Var.getValue()).y();
        }

        private static final void MessageComposer$lambda$19(C1510r0 r0Var, long j10) {
            r0Var.setValue(C2544x0.k(j10));
        }

        /* access modifiers changed from: private */
        public static final C6514M MessageComposer$lambda$2(ComposerInputType composerInputType) {
            C6496s.h(composerInputType, "it");
            return C6514M.f71813a;
        }

        /* access modifiers changed from: private */
        public static final long MessageComposer$lambda$21(C1510r0 r0Var) {
            return ((C2544x0) r0Var.getValue()).y();
        }

        private static final void MessageComposer$lambda$22(C1510r0 r0Var, long j10) {
            r0Var.setValue(C2544x0.k(j10));
        }

        /* access modifiers changed from: private */
        public static final KeyboardState MessageComposer$lambda$25(A1 a12) {
            return (KeyboardState) a12.getValue();
        }

        /* access modifiers changed from: private */
        public static final C6514M MessageComposer$lambda$26(long j10, long j11, long j12, long j13, SpeechRecognizerState speechRecognizerState, C1651m1 m1Var, C1510r0 r0Var, C1510r0 r0Var2, l lVar) {
            C6496s.h(speechRecognizerState, "$speechRecognizerState");
            C6496s.h(r0Var, "$borderColor$delegate");
            C6496s.h(r0Var2, "$disableColor$delegate");
            C6496s.h(lVar, "focused");
            if (!lVar.a()) {
                j10 = j11;
            }
            MessageComposer$lambda$19(r0Var, j10);
            if (!lVar.a()) {
                j12 = j13;
            }
            MessageComposer$lambda$22(r0Var2, j12);
            if (speechRecognizerState.isListening() && m1Var != null) {
                m1Var.a();
            }
            return C6514M.f71813a;
        }

        /* access modifiers changed from: private */
        public static final C6514M MessageComposer$lambda$28(C6787a aVar, SpeechRecognizerState speechRecognizerState, p pVar, C1510r0 r0Var, C1510r0 r0Var2, Q q10) {
            TextInputSource textInputSource;
            C6496s.h(speechRecognizerState, "$speechRecognizerState");
            C6496s.h(pVar, "$onSendMessage");
            C6496s.h(r0Var, "$textFieldValue$delegate");
            C6496s.h(r0Var2, "$textInputSource$delegate");
            C6496s.h(q10, "it");
            aVar.invoke();
            if (C6496s.c(q10.h(), MessageComposer$lambda$7(r0Var).h()) && !Q0.Q.g(q10.g(), MessageComposer$lambda$7(r0Var).g())) {
                speechRecognizerState.stopListening();
            }
            if (!C6496s.c(q10.h(), MessageComposer$lambda$7(r0Var).h()) && (MessageComposer$lambda$10(r0Var2) == TextInputSource.VOICE_ONLY || MessageComposer$lambda$10(r0Var2) == TextInputSource.EDITED_VOICE_INPUT)) {
                if (q10.h().length() == 0) {
                    String h10 = q10.h();
                    textInputSource = TextInputSource.CLEARED_VOICE_INPUT;
                    pVar.invoke(h10, textInputSource);
                } else {
                    textInputSource = TextInputSource.EDITED_VOICE_INPUT;
                }
                MessageComposer$lambda$11(r0Var2, textInputSource);
            }
            if (!C6496s.c(q10.h(), MessageComposer$lambda$7(r0Var).h()) && MessageComposer$lambda$10(r0Var2) == TextInputSource.CLEARED_VOICE_INPUT) {
                MessageComposer$lambda$11(r0Var2, TextInputSource.KEYBOARD);
            }
            MessageComposer$lambda$8(r0Var, q10);
            return C6514M.f71813a;
        }

        /* access modifiers changed from: private */
        public static final C6514M MessageComposer$lambda$29(i iVar, p pVar, BottomBarUiState bottomBarUiState, C6787a aVar, C6787a aVar2, C6798l lVar, C6798l lVar2, C6787a aVar3, int i10, int i11, C1500m mVar, int i12) {
            C6496s.h(pVar, "$onSendMessage");
            C6496s.h(bottomBarUiState, "$bottomBarUiState");
            MessageComposer(iVar, pVar, bottomBarUiState, aVar, aVar2, lVar, lVar2, aVar3, mVar, M0.a(i10 | 1), i11);
            return C6514M.f71813a;
        }

        /* access modifiers changed from: private */
        public static final C6514M MessageComposer$lambda$3(MetricData metricData) {
            C6496s.h(metricData, "it");
            return C6514M.f71813a;
        }

        /* access modifiers changed from: private */
        public static final C6514M MessageComposer$lambda$4() {
            return C6514M.f71813a;
        }

        /* access modifiers changed from: private */
        public static final C1510r0 MessageComposer$lambda$6$lambda$5(String str) {
            C6496s.h(str, "$initialMessage");
            return u1.d(new Q(str, S.a(str.length()), (Q0.Q) null, 4, (DefaultConstructorMarker) null), (o1) null, 2, (Object) null);
        }

        /* access modifiers changed from: private */
        public static final Q MessageComposer$lambda$7(C1510r0 r0Var) {
            return (Q) r0Var.getValue();
        }

        /* access modifiers changed from: private */
        public static final void MessageComposer$lambda$8(C1510r0 r0Var, Q q10) {
            r0Var.setValue(q10);
        }

        @IntercomPreviews
        public static final void TextComposerPreview(C1500m mVar, int i10) {
            int i11 = i10;
            C1500m h10 = mVar.h(-609144377);
            if (i11 != 0 || !h10.i()) {
                MessageComposer((i) null, new C6085e0(), new BottomBarUiState(new ComposerState.TextInput("", new StringProvider.StringRes(R.string.intercom_send_us_a_message, (List) null, 2, (DefaultConstructorMarker) null), false, 4, (DefaultConstructorMarker) null), new CurrentlyTypingState((AvatarWrapper) null, false, (StringProvider) null, TypingIndicatorType.NONE, 7, (DefaultConstructorMarker) null), InputTypeState.Companion.getDEFAULT(), (List) null, false, (BottomBarUiState.BottomBadgeState) null, 56, (DefaultConstructorMarker) null), (C6787a) null, (C6787a) null, (C6798l) null, (C6798l) null, (C6787a) null, h10, 560, 249);
            } else {
                h10.I();
            }
            Y0 k10 = h10.k();
            if (k10 != null) {
                k10.a(new C6087f0(i11));
            }
        }

        /* access modifiers changed from: private */
        public static final C6514M TextComposerPreview$lambda$30(String str, TextInputSource textInputSource) {
            C6496s.h(str, "<unused var>");
            C6496s.h(textInputSource, "<unused var>");
            return C6514M.f71813a;
        }

        /* access modifiers changed from: private */
        public static final C6514M TextComposerPreview$lambda$31(int i10, C1500m mVar, int i11) {
            TextComposerPreview(mVar, M0.a(i10 | 1));
            return C6514M.f71813a;
        }

        @IntercomPreviews
        public static final void TextComposerWithButtonsPreview(C1500m mVar, int i10) {
            int i11 = i10;
            C1500m h10 = mVar.h(1468421996);
            if (i11 != 0 || !h10.i()) {
                C6089g0 g0Var = new C6089g0();
                ComposerState.TextInput textInput = new ComposerState.TextInput("", new StringProvider.StringRes(R.string.intercom_send_us_a_message, (List) null, 2, (DefaultConstructorMarker) null), false, 4, (DefaultConstructorMarker) null);
                ComposerState.TextInput textInput2 = textInput;
                MessageComposer((i) null, g0Var, new BottomBarUiState(textInput2, new CurrentlyTypingState((AvatarWrapper) null, false, (StringProvider) null, TypingIndicatorType.NONE, 7, (DefaultConstructorMarker) null), InputTypeState.Companion.getDEFAULT(), C6565s.q(BottomBarUiState.BottomBarButton.GifInsert.INSTANCE, BottomBarUiState.BottomBarButton.MediaInsert.INSTANCE), false, (BottomBarUiState.BottomBadgeState) null, 48, (DefaultConstructorMarker) null), (C6787a) null, (C6787a) null, (C6798l) null, (C6798l) null, (C6787a) null, h10, 560, 249);
            } else {
                h10.I();
            }
            Y0 k10 = h10.k();
            if (k10 != null) {
                k10.a(new h0(i11));
            }
        }

        /* access modifiers changed from: private */
        public static final C6514M TextComposerWithButtonsPreview$lambda$32(String str, TextInputSource textInputSource) {
            C6496s.h(str, "<unused var>");
            C6496s.h(textInputSource, "<unused var>");
            return C6514M.f71813a;
        }

        /* access modifiers changed from: private */
        public static final C6514M TextComposerWithButtonsPreview$lambda$33(int i10, C1500m mVar, int i11) {
            TextComposerWithButtonsPreview(mVar, M0.a(i10 | 1));
            return C6514M.f71813a;
        }

        @IntercomPreviews
        public static final void TextComposerWithFinDictationPreview(C1500m mVar, int i10) {
            int i11 = i10;
            C1500m h10 = mVar.h(2094324481);
            if (i11 != 0 || !h10.i()) {
                MessageComposer((i) null, new Z(), new BottomBarUiState(new ComposerState.TextInput("", new StringProvider.StringRes(R.string.intercom_send_us_a_message, (List) null, 2, (DefaultConstructorMarker) null), false, 4, (DefaultConstructorMarker) null), new CurrentlyTypingState((AvatarWrapper) null, false, (StringProvider) null, TypingIndicatorType.NONE, 7, (DefaultConstructorMarker) null), InputTypeState.Companion.getDEFAULT(), (List) null, true, (BottomBarUiState.BottomBadgeState) null, 40, (DefaultConstructorMarker) null), (C6787a) null, (C6787a) null, (C6798l) null, (C6798l) null, (C6787a) null, h10, 560, 249);
            } else {
                h10.I();
            }
            Y0 k10 = h10.k();
            if (k10 != null) {
                k10.a(new i0(i11));
            }
        }

        /* access modifiers changed from: private */
        public static final C6514M TextComposerWithFinDictationPreview$lambda$36(String str, TextInputSource textInputSource) {
            C6496s.h(str, "<unused var>");
            C6496s.h(textInputSource, "<unused var>");
            return C6514M.f71813a;
        }

        /* access modifiers changed from: private */
        public static final C6514M TextComposerWithFinDictationPreview$lambda$37(int i10, C1500m mVar, int i11) {
            TextComposerWithFinDictationPreview(mVar, M0.a(i10 | 1));
            return C6514M.f71813a;
        }

        @IntercomPreviews
        public static final void TextComposerWithInitialTextPreview(C1500m mVar, int i10) {
            int i11 = i10;
            C1500m h10 = mVar.h(-986390788);
            if (i11 != 0 || !h10.i()) {
                MessageComposer((i) null, new C6081c0(), new BottomBarUiState(new ComposerState.TextInput("Initial message with\nNew line\nAnd another very long new line", new StringProvider.StringRes(R.string.intercom_send_us_a_message, (List) null, 2, (DefaultConstructorMarker) null), false, 4, (DefaultConstructorMarker) null), new CurrentlyTypingState((AvatarWrapper) null, false, (StringProvider) null, TypingIndicatorType.NONE, 7, (DefaultConstructorMarker) null), InputTypeState.Companion.getDEFAULT(), C6565s.e(BottomBarUiState.BottomBarButton.MediaInsert.INSTANCE), false, (BottomBarUiState.BottomBadgeState) null, 48, (DefaultConstructorMarker) null), (C6787a) null, (C6787a) null, (C6798l) null, (C6798l) null, (C6787a) null, h10, 560, 249);
            } else {
                h10.I();
            }
            Y0 k10 = h10.k();
            if (k10 != null) {
                k10.a(new C6083d0(i11));
            }
        }

        /* access modifiers changed from: private */
        public static final C6514M TextComposerWithInitialTextPreview$lambda$34(String str, TextInputSource textInputSource) {
            C6496s.h(str, "<unused var>");
            C6496s.h(textInputSource, "<unused var>");
            return C6514M.f71813a;
        }

        /* access modifiers changed from: private */
        public static final C6514M TextComposerWithInitialTextPreview$lambda$35(int i10, C1500m mVar, int i11) {
            TextComposerWithInitialTextPreview(mVar, M0.a(i10 | 1));
            return C6514M.f71813a;
        }

        public static final float getComposerHalfSize() {
            return ComposerHalfSize;
        }

        public static final float getComposerMinSize() {
            return ComposerMinSize;
        }

        /* access modifiers changed from: private */
        public static final boolean shouldShowButtons(String str, BottomBarUiState bottomBarUiState, SpeechRecognizerState speechRecognizerState) {
            if (str.length() != 0 || bottomBarUiState.getButtons().isEmpty() || speechRecognizerState.isListening()) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: private */
        public static final boolean shouldShowVoiceInput(String str, BottomBarUiState bottomBarUiState, SpeechRecognizerState speechRecognizerState) {
            if (!bottomBarUiState.getFinDictationEnabled() || (str.length() != 0 && !speechRecognizerState.isListening())) {
                return false;
            }
            return true;
        }
    }
