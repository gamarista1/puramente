package io.intercom.android.sdk.m5.conversation.ui.components;

import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.models.AiAnswerInfo;
import io.intercom.android.sdk.ui.IntercomPreviews;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/models/AiAnswerInfo;", "info", "Lkotlin/Function0;", "Llf/M;", "onDismiss", "AnswerInfoDialog", "(Lio/intercom/android/sdk/models/AiAnswerInfo;Lyf/a;LY/m;II)V", "AnswerInfoDialogPreview", "(LY/m;I)V", "AnswerInfoWithoutExternalLinkPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AnswerInfoDialogKt {
    public static final void AnswerInfoDialog(AiAnswerInfo aiAnswerInfo, C6787a aVar, C1500m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        C6496s.h(aiAnswerInfo, "info");
        C1500m h10 = mVar.h(-1053952237);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (h10.S(aiAnswerInfo)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (h10.C(aVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) != 18 || !h10.i()) {
            if (i15 != 0) {
                new C6072b
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004f: CONSTRUCTOR  (r8v3 ? I:io.intercom.android.sdk.m5.conversation.ui.components.b) =  call: io.intercom.android.sdk.m5.conversation.ui.components.b.<init>():void type: CONSTRUCTOR in method: io.intercom.android.sdk.m5.conversation.ui.components.AnswerInfoDialogKt.AnswerInfoDialog(io.intercom.android.sdk.models.AiAnswerInfo, yf.a, Y.m, int, int):void, dex: classes4.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r8v3 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 39 more
                    */
                /*
                    java.lang.String r0 = "info"
                    kotlin.jvm.internal.C6496s.h(r7, r0)
                    r0 = -1053952237(0xffffffffc12df713, float:-10.872821)
                    Y.m r9 = r9.h(r0)
                    r0 = r11 & 1
                    if (r0 == 0) goto L_0x0013
                    r0 = r10 | 6
                    goto L_0x0023
                L_0x0013:
                    r0 = r10 & 14
                    if (r0 != 0) goto L_0x0022
                    boolean r0 = r9.S(r7)
                    if (r0 == 0) goto L_0x001f
                    r0 = 4
                    goto L_0x0020
                L_0x001f:
                    r0 = 2
                L_0x0020:
                    r0 = r0 | r10
                    goto L_0x0023
                L_0x0022:
                    r0 = r10
                L_0x0023:
                    r1 = r11 & 2
                    if (r1 == 0) goto L_0x002a
                    r0 = r0 | 48
                    goto L_0x003a
                L_0x002a:
                    r2 = r10 & 112(0x70, float:1.57E-43)
                    if (r2 != 0) goto L_0x003a
                    boolean r2 = r9.C(r8)
                    if (r2 == 0) goto L_0x0037
                    r2 = 32
                    goto L_0x0039
                L_0x0037:
                    r2 = 16
                L_0x0039:
                    r0 = r0 | r2
                L_0x003a:
                    r2 = r0 & 91
                    r3 = 18
                    if (r2 != r3) goto L_0x004b
                    boolean r2 = r9.i()
                    if (r2 != 0) goto L_0x0047
                    goto L_0x004b
                L_0x0047:
                    r9.I()
                    goto L_0x0082
                L_0x004b:
                    if (r1 == 0) goto L_0x0052
                    io.intercom.android.sdk.m5.conversation.ui.components.b r8 = new io.intercom.android.sdk.m5.conversation.ui.components.b
                    r8.<init>()
                L_0x0052:
                    Y.I0 r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
                    java.lang.Object r1 = r9.m(r1)
                    android.content.Context r1 = (android.content.Context) r1
                    Y.I0 r2 = io.intercom.android.sdk.ui.theme.IntercomColorsKt.getLocalIntercomColors()
                    java.lang.Object r2 = r9.m(r2)
                    io.intercom.android.sdk.ui.theme.IntercomColors r2 = (io.intercom.android.sdk.ui.theme.IntercomColors) r2
                    io.intercom.android.sdk.m5.conversation.ui.components.AnswerInfoDialogKt$AnswerInfoDialog$2 r3 = new io.intercom.android.sdk.m5.conversation.ui.components.AnswerInfoDialogKt$AnswerInfoDialog$2
                    r3.<init>(r2, r7, r8, r1)
                    r1 = 54
                    r2 = -890896278(0xffffffffcae6006a, float:-7536693.0)
                    r4 = 1
                    g0.a r3 = g0.c.e(r2, r4, r3, r9, r1)
                    int r0 = r0 >> 3
                    r0 = r0 & 14
                    r5 = r0 | 384(0x180, float:5.38E-43)
                    r6 = 2
                    r2 = 0
                    r1 = r8
                    r4 = r9
                    androidx.compose.ui.window.a.a(r1, r2, r3, r4, r5, r6)
                L_0x0082:
                    Y.Y0 r9 = r9.k()
                    if (r9 == 0) goto L_0x0090
                    io.intercom.android.sdk.m5.conversation.ui.components.c r0 = new io.intercom.android.sdk.m5.conversation.ui.components.c
                    r0.<init>(r7, r8, r10, r11)
                    r9.a(r0)
                L_0x0090:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.AnswerInfoDialogKt.AnswerInfoDialog(io.intercom.android.sdk.models.AiAnswerInfo, yf.a, Y.m, int, int):void");
            }

            /* access modifiers changed from: private */
            public static final C6514M AnswerInfoDialog$lambda$0() {
                return C6514M.f71813a;
            }

            /* access modifiers changed from: private */
            public static final C6514M AnswerInfoDialog$lambda$1(AiAnswerInfo aiAnswerInfo, C6787a aVar, int i10, int i11, C1500m mVar, int i12) {
                C6496s.h(aiAnswerInfo, "$info");
                AnswerInfoDialog(aiAnswerInfo, aVar, mVar, M0.a(i10 | 1), i11);
                return C6514M.f71813a;
            }

            @IntercomPreviews
            public static final void AnswerInfoDialogPreview(C1500m mVar, int i10) {
                C1500m h10 = mVar.h(1630534767);
                if (i10 != 0 || !h10.i()) {
                    AnswerInfoDialog(new AiAnswerInfo("This answer was auto generated using AI. There’s a chance it may not be fully correct.", "https://www.intercom.com"), (C6787a) null, h10, 0, 2);
                } else {
                    h10.I();
                }
                Y0 k10 = h10.k();
                if (k10 != null) {
                    k10.a(new C6108d(i10));
                }
            }

            /* access modifiers changed from: private */
            public static final C6514M AnswerInfoDialogPreview$lambda$2(int i10, C1500m mVar, int i11) {
                AnswerInfoDialogPreview(mVar, M0.a(i10 | 1));
                return C6514M.f71813a;
            }

            @IntercomPreviews
            public static final void AnswerInfoWithoutExternalLinkPreview(C1500m mVar, int i10) {
                C1500m h10 = mVar.h(1688173056);
                if (i10 != 0 || !h10.i()) {
                    AnswerInfoDialog(new AiAnswerInfo("This answer was auto generated using AI. There’s a chance it may not be fully correct.", (String) null), (C6787a) null, h10, 0, 2);
                } else {
                    h10.I();
                }
                Y0 k10 = h10.k();
                if (k10 != null) {
                    k10.a(new C6070a(i10));
                }
            }

            /* access modifiers changed from: private */
            public static final C6514M AnswerInfoWithoutExternalLinkPreview$lambda$3(int i10, C1500m mVar, int i11) {
                AnswerInfoWithoutExternalLinkPreview(mVar, M0.a(i10 | 1));
                return C6514M.f71813a;
            }
        }
