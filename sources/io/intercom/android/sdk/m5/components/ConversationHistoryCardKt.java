package io.intercom.android.sdk.m5.components;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aE\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\bH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lk0/i;", "modifier", "", "cardTitle", "", "Lio/intercom/android/sdk/models/Conversation;", "conversations", "Lkotlin/Function1;", "Llf/M;", "onConversationClick", "ConversationHistoryCard", "(Lk0/i;Ljava/lang/String;Ljava/util/List;Lyf/l;LY/m;II)V", "RecentConversationsCardWithSimpleTicketHeaderPreview", "(LY/m;I)V", "RecentConversationsCardPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConversationHistoryCardKt {
    public static final void ConversationHistoryCard(i iVar, String str, List<Conversation> list, C6798l lVar, C1500m mVar, int i10, int i11) {
        C6496s.h(str, "cardTitle");
        C6496s.h(list, "conversations");
        C1500m h10 = mVar.h(-1629591433);
        if ((i11 & 1) != 0) {
            iVar = i.f23074a;
        }
        if ((i11 & 8) != 0) {
            new Q
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001d: CONSTRUCTOR  (r11v2 ? I:io.intercom.android.sdk.m5.components.Q) =  call: io.intercom.android.sdk.m5.components.Q.<init>():void type: CONSTRUCTOR in method: io.intercom.android.sdk.m5.components.ConversationHistoryCardKt.ConversationHistoryCard(k0.i, java.lang.String, java.util.List, yf.l, Y.m, int, int):void, dex: classes4.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v2 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                java.lang.String r0 = "cardTitle"
                kotlin.jvm.internal.C6496s.h(r9, r0)
                java.lang.String r0 = "conversations"
                kotlin.jvm.internal.C6496s.h(r10, r0)
                r0 = -1629591433(0xffffffff9ede6877, float:-2.354837E-20)
                Y.m r12 = r12.h(r0)
                r0 = r14 & 1
                if (r0 == 0) goto L_0x0017
                k0.i$a r8 = k0.i.f23074a
            L_0x0017:
                r0 = r14 & 8
                if (r0 == 0) goto L_0x0020
                io.intercom.android.sdk.m5.components.Q r11 = new io.intercom.android.sdk.m5.components.Q
                r11.<init>()
            L_0x0020:
                io.intercom.android.sdk.m5.components.ConversationHistoryCardKt$ConversationHistoryCard$2 r0 = new io.intercom.android.sdk.m5.components.ConversationHistoryCardKt$ConversationHistoryCard$2
                r0.<init>(r10, r11)
                r1 = 54
                r2 = 1614953259(0x60423b2b, float:5.598331E19)
                r3 = 1
                g0.a r3 = g0.c.e(r2, r3, r0, r12, r1)
                r0 = r13 & 14
                r0 = r0 | 384(0x180, float:5.38E-43)
                r1 = r13 & 112(0x70, float:1.57E-43)
                r5 = r0 | r1
                r6 = 0
                r1 = r8
                r2 = r9
                r4 = r12
                io.intercom.android.sdk.m5.components.HomeCardScaffoldKt.HomeCardScaffold(r1, r2, r3, r4, r5, r6)
                Y.Y0 r12 = r12.k()
                if (r12 == 0) goto L_0x0053
                io.intercom.android.sdk.m5.components.S r7 = new io.intercom.android.sdk.m5.components.S
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r13
                r6 = r14
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r12.a(r7)
            L_0x0053:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.components.ConversationHistoryCardKt.ConversationHistoryCard(k0.i, java.lang.String, java.util.List, yf.l, Y.m, int, int):void");
        }

        /* access modifiers changed from: private */
        public static final C6514M ConversationHistoryCard$lambda$0(Conversation conversation) {
            C6496s.h(conversation, "it");
            return C6514M.f71813a;
        }

        /* access modifiers changed from: private */
        public static final C6514M ConversationHistoryCard$lambda$1(i iVar, String str, List list, C6798l lVar, int i10, int i11, C1500m mVar, int i12) {
            C6496s.h(str, "$cardTitle");
            C6496s.h(list, "$conversations");
            ConversationHistoryCard(iVar, str, list, lVar, mVar, M0.a(i10 | 1), i11);
            return C6514M.f71813a;
        }

        @IntercomPreviews
        private static final void RecentConversationsCardPreview(C1500m mVar, int i10) {
            C1500m h10 = mVar.h(593700998);
            if (i10 != 0 || !h10.i()) {
                IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ConversationHistoryCardKt.INSTANCE.m151getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
            } else {
                h10.I();
            }
            Y0 k10 = h10.k();
            if (k10 != null) {
                k10.a(new T(i10));
            }
        }

        /* access modifiers changed from: private */
        public static final C6514M RecentConversationsCardPreview$lambda$3(int i10, C1500m mVar, int i11) {
            RecentConversationsCardPreview(mVar, M0.a(i10 | 1));
            return C6514M.f71813a;
        }

        @IntercomPreviews
        private static final void RecentConversationsCardWithSimpleTicketHeaderPreview(C1500m mVar, int i10) {
            C1500m h10 = mVar.h(1823267221);
            if (i10 != 0 || !h10.i()) {
                IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ConversationHistoryCardKt.INSTANCE.m150getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
            } else {
                h10.I();
            }
            Y0 k10 = h10.k();
            if (k10 != null) {
                k10.a(new U(i10));
            }
        }

        /* access modifiers changed from: private */
        public static final C6514M RecentConversationsCardWithSimpleTicketHeaderPreview$lambda$2(int i10, C1500m mVar, int i11) {
            RecentConversationsCardWithSimpleTicketHeaderPreview(mVar, M0.a(i10 | 1));
            return C6514M.f71813a;
        }
    }
