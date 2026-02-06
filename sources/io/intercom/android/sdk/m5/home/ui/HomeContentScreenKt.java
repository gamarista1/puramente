package io.intercom.android.sdk.m5.home.ui;

import Y.C1500m;
import Y.M0;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.home.data.SpaceItemType;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.models.Conversation;
import java.util.Iterator;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6535s;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a£\u0001\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\t2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\tH\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content;", "content", "Lkotlin/Function0;", "Llf/M;", "onMessagesClicked", "onHelpClicked", "onTicketsClicked", "Lkotlin/Function1;", "", "onTicketItemClicked", "onNewConversationClicked", "Lio/intercom/android/sdk/models/Conversation;", "onConversationClicked", "Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "onTicketLinkClicked", "HomeContentScreen", "(Lk0/i;Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content;Lyf/a;Lyf/a;Lyf/a;Lyf/l;Lyf/a;Lyf/l;Lyf/l;LY/m;II)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HomeContentScreenKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                io.intercom.android.sdk.m5.home.data.SpaceItemType[] r0 = io.intercom.android.sdk.m5.home.data.SpaceItemType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.m5.home.data.SpaceItemType r1 = io.intercom.android.sdk.m5.home.data.SpaceItemType.MESSAGES     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.m5.home.data.SpaceItemType r1 = io.intercom.android.sdk.m5.home.data.SpaceItemType.HELP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                io.intercom.android.sdk.m5.home.data.SpaceItemType r1 = io.intercom.android.sdk.m5.home.data.SpaceItemType.TICKETS     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.home.ui.HomeContentScreenKt.WhenMappings.<clinit>():void");
        }
    }

    public static final void HomeContentScreen(i iVar, HomeUiState.Content content, C6787a aVar, C6787a aVar2, C6787a aVar3, C6798l lVar, C6787a aVar4, C6798l lVar2, C6798l lVar3, C1500m mVar, int i10, int i11) {
        C6787a aVar5;
        C6787a aVar6;
        Iterator it;
        C6798l lVar4;
        C6787a aVar7;
        boolean z10;
        int i12;
        int i13 = i10;
        int i14 = i11;
        int i15 = 256;
        int i16 = 8;
        C6496s.h(content, "content");
        C1500m h10 = mVar.h(-1476773966);
        boolean z11 = true;
        i iVar2 = (i14 & 1) != 0 ? i.f23074a : iVar;
        if ((i14 & 4) != 0) {
            new b
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002b: CONSTRUCTOR  (r8v4 ? I:io.intercom.android.sdk.m5.home.ui.b) =  call: io.intercom.android.sdk.m5.home.ui.b.<init>():void type: CONSTRUCTOR in method: io.intercom.android.sdk.m5.home.ui.HomeContentScreenKt.HomeContentScreen(k0.i, io.intercom.android.sdk.m5.home.states.HomeUiState$Content, yf.a, yf.a, yf.a, yf.l, yf.a, yf.l, yf.l, Y.m, int, int):void, dex: classes4.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r8v4 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                r10 = r47
                r11 = r48
                r0 = 6
                r1 = 256(0x100, float:3.59E-43)
                r2 = 16
                r3 = 8
                java.lang.String r4 = "content"
                r5 = r38
                kotlin.jvm.internal.C6496s.h(r5, r4)
                r4 = -1476773966(0xffffffffa7fa37b2, float:-6.9449324E-15)
                r6 = r46
                Y.m r4 = r6.h(r4)
                r6 = 1
                r7 = r11 & 1
                if (r7 == 0) goto L_0x0023
                k0.i$a r7 = k0.i.f23074a
                goto L_0x0025
            L_0x0023:
                r7 = r37
            L_0x0025:
                r8 = r11 & 4
                if (r8 == 0) goto L_0x002f
                io.intercom.android.sdk.m5.home.ui.b r8 = new io.intercom.android.sdk.m5.home.ui.b
                r8.<init>()
                goto L_0x0031
            L_0x002f:
                r8 = r39
            L_0x0031:
                r9 = r11 & 8
                if (r9 == 0) goto L_0x003b
                io.intercom.android.sdk.m5.home.ui.c r9 = new io.intercom.android.sdk.m5.home.ui.c
                r9.<init>()
                goto L_0x003d
            L_0x003b:
                r9 = r40
            L_0x003d:
                r12 = r11 & 16
                if (r12 == 0) goto L_0x0048
                io.intercom.android.sdk.m5.home.ui.d r12 = new io.intercom.android.sdk.m5.home.ui.d
                r12.<init>()
                r14 = r12
                goto L_0x004a
            L_0x0048:
                r14 = r41
            L_0x004a:
                r12 = r11 & 32
                if (r12 == 0) goto L_0x0056
                io.intercom.android.sdk.m5.home.ui.e r12 = new io.intercom.android.sdk.m5.home.ui.e
                r12.<init>()
                r25 = r12
                goto L_0x0058
            L_0x0056:
                r25 = r42
            L_0x0058:
                r12 = r11 & 64
                if (r12 == 0) goto L_0x0064
                io.intercom.android.sdk.m5.home.ui.f r12 = new io.intercom.android.sdk.m5.home.ui.f
                r12.<init>()
                r26 = r12
                goto L_0x0066
            L_0x0064:
                r26 = r43
            L_0x0066:
                r12 = r11 & 128(0x80, float:1.794E-43)
                if (r12 == 0) goto L_0x0072
                io.intercom.android.sdk.m5.home.ui.g r12 = new io.intercom.android.sdk.m5.home.ui.g
                r12.<init>()
                r27 = r12
                goto L_0x0074
            L_0x0072:
                r27 = r44
            L_0x0074:
                r12 = r11 & 256(0x100, float:3.59E-43)
                if (r12 == 0) goto L_0x007f
                io.intercom.android.sdk.m5.home.ui.h r12 = new io.intercom.android.sdk.m5.home.ui.h
                r12.<init>()
                r15 = r12
                goto L_0x0081
            L_0x007f:
                r15 = r45
            L_0x0081:
                float r2 = (float) r2
                float r2 = c1.h.j(r2)
                r12 = 0
                r13 = 2
                r37 = r15
                r15 = 0
                k0.i r2 = androidx.compose.foundation.layout.n.k(r7, r2, r12, r13, r15)
                C.c r12 = C.C1085c.f882a
                r13 = 10
                float r15 = (float) r13
                float r15 = c1.h.j(r15)
                C.c$f r12 = r12.n(r15)
                k0.c$a r15 = k0.c.f23044a
                k0.c$b r15 = r15.k()
                H0.F r12 = C.C1090h.a(r12, r15, r4, r0)
                r15 = 0
                int r16 = Y.C1494j.a(r4, r15)
                Y.y r15 = r4.p()
                k0.i r2 = k0.h.e(r4, r2)
                J0.g$a r18 = J0.C1241g.f3853J
                yf.a r13 = r18.a()
                Y.f r20 = r4.j()
                if (r20 != 0) goto L_0x00c2
                Y.C1494j.c()
            L_0x00c2:
                r4.F()
                boolean r20 = r4.f()
                if (r20 == 0) goto L_0x00cf
                r4.U(r13)
                goto L_0x00d2
            L_0x00cf:
                r4.q()
            L_0x00d2:
                Y.m r13 = Y.F1.a(r4)
                yf.p r0 = r18.c()
                Y.F1.b(r13, r12, r0)
                yf.p r0 = r18.e()
                Y.F1.b(r13, r15, r0)
                yf.p r0 = r18.b()
                boolean r12 = r13.f()
                if (r12 != 0) goto L_0x00fc
                java.lang.Object r12 = r13.A()
                java.lang.Integer r15 = java.lang.Integer.valueOf(r16)
                boolean r12 = kotlin.jvm.internal.C6496s.c(r12, r15)
                if (r12 != 0) goto L_0x010a
            L_0x00fc:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r16)
                r13.r(r12)
                java.lang.Integer r12 = java.lang.Integer.valueOf(r16)
                r13.V(r12, r0)
            L_0x010a:
                yf.p r0 = r18.d()
                Y.F1.b(r13, r2, r0)
                C.k r0 = C.C1093k.f978a
                r0 = -1359903615(0xffffffffaef18481, float:-1.09829486E-10)
                r4.T(r0)
                java.util.List r0 = r38.getCards()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
                r2 = 0
            L_0x0124:
                boolean r12 = r0.hasNext()
                if (r12 == 0) goto L_0x040b
                java.lang.Object r12 = r0.next()
                int r29 = r2 + 1
                if (r2 >= 0) goto L_0x0135
                mf.C6565s.x()
            L_0x0135:
                io.intercom.android.sdk.m5.home.data.HomeCards r12 = (io.intercom.android.sdk.m5.home.data.HomeCards) r12
                boolean r13 = r12 instanceof io.intercom.android.sdk.m5.home.data.HomeCards.HomeSpacesData
                if (r13 == 0) goto L_0x01bc
                r2 = 1732177237(0x673eed55, float:9.016276E23)
                r4.T(r2)
                io.intercom.android.sdk.m5.home.data.HomeCards$HomeSpacesData r12 = (io.intercom.android.sdk.m5.home.data.HomeCards.HomeSpacesData) r12
                r2 = 55880488(0x354ab28, float:6.249768E-37)
                r4.T(r2)
                r2 = r10 & 896(0x380, float:1.256E-42)
                r2 = r2 ^ 384(0x180, float:5.38E-43)
                if (r2 <= r1) goto L_0x0155
                boolean r2 = r4.S(r8)
                if (r2 != 0) goto L_0x0159
            L_0x0155:
                r2 = r10 & 384(0x180, float:5.38E-43)
                if (r2 != r1) goto L_0x015b
            L_0x0159:
                r2 = r6
                goto L_0x015c
            L_0x015b:
                r2 = 0
            L_0x015c:
                r13 = r10 & 7168(0x1c00, float:1.0045E-41)
                r13 = r13 ^ 3072(0xc00, float:4.305E-42)
                r15 = 2048(0x800, float:2.87E-42)
                if (r13 <= r15) goto L_0x016a
                boolean r13 = r4.S(r9)
                if (r13 != 0) goto L_0x016e
            L_0x016a:
                r13 = r10 & 3072(0xc00, float:4.305E-42)
                if (r13 != r15) goto L_0x0170
            L_0x016e:
                r13 = r6
                goto L_0x0171
            L_0x0170:
                r13 = 0
            L_0x0171:
                r2 = r2 | r13
                r13 = 57344(0xe000, float:8.0356E-41)
                r13 = r13 & r10
                r13 = r13 ^ 24576(0x6000, float:3.4438E-41)
                r15 = 16384(0x4000, float:2.2959E-41)
                if (r13 <= r15) goto L_0x0182
                boolean r13 = r4.S(r14)
                if (r13 != 0) goto L_0x0186
            L_0x0182:
                r13 = r10 & 24576(0x6000, float:3.4438E-41)
                if (r13 != r15) goto L_0x0188
            L_0x0186:
                r13 = r6
                goto L_0x0189
            L_0x0188:
                r13 = 0
            L_0x0189:
                r2 = r2 | r13
                java.lang.Object r13 = r4.A()
                if (r2 != 0) goto L_0x0198
                Y.m$a r2 = Y.C1500m.f10026a
                java.lang.Object r2 = r2.a()
                if (r13 != r2) goto L_0x01a0
            L_0x0198:
                io.intercom.android.sdk.m5.home.ui.i r13 = new io.intercom.android.sdk.m5.home.ui.i
                r13.<init>(r8, r9, r14)
                r4.r(r13)
            L_0x01a0:
                yf.l r13 = (yf.C6798l) r13
                r4.M()
                io.intercom.android.sdk.m5.home.ui.components.SpacesCardKt.SpacesCard(r12, r13, r4, r3)
                r4.M()
                r13 = r37
                r30 = r0
                r1 = r3
                r3 = r6
                r6 = r14
                r28 = 6
            L_0x01b4:
                r33 = 10
                r35 = 0
                r36 = 0
                goto L_0x03fe
            L_0x01bc:
                boolean r13 = r12 instanceof io.intercom.android.sdk.m5.home.data.HomeCards.HomeRecentTicketsData
                if (r13 == 0) goto L_0x0207
                r2 = 1732700610(0x6746e9c2, float:9.393406E23)
                r4.T(r2)
                r2 = r12
                io.intercom.android.sdk.m5.home.data.HomeCards$HomeRecentTicketsData r2 = (io.intercom.android.sdk.m5.home.data.HomeCards.HomeRecentTicketsData) r2
                java.util.List r13 = r2.getTickets()
                java.util.Collection r13 = (java.util.Collection) r13
                boolean r13 = r13.isEmpty()
                if (r13 != 0) goto L_0x01fa
                java.lang.String r12 = r12.getCardTitle()
                java.util.List r2 = r2.getTickets()
                r28 = 6
                int r13 = r10 >> 6
                r13 = r13 & 7168(0x1c00, float:1.0045E-41)
                r13 = r13 | 512(0x200, float:7.175E-43)
                r15 = 1
                r16 = 0
                r39 = r16
                r40 = r12
                r41 = r2
                r42 = r25
                r43 = r4
                r44 = r13
                r45 = r15
                io.intercom.android.sdk.tickets.RecentTicketsCardKt.RecentTicketsCard(r39, r40, r41, r42, r43, r44, r45)
                goto L_0x01fc
            L_0x01fa:
                r28 = 6
            L_0x01fc:
                r4.M()
            L_0x01ff:
                r13 = r37
                r30 = r0
                r1 = r3
                r3 = r6
                r6 = r14
                goto L_0x01b4
            L_0x0207:
                r28 = 6
                boolean r13 = r12 instanceof io.intercom.android.sdk.m5.home.data.HomeCards.HomeRecentConversationData
                if (r13 == 0) goto L_0x0248
                r2 = 1733094620(0x674cecdc, float:9.6773205E23)
                r4.T(r2)
                r2 = r12
                io.intercom.android.sdk.m5.home.data.HomeCards$HomeRecentConversationData r2 = (io.intercom.android.sdk.m5.home.data.HomeCards.HomeRecentConversationData) r2
                java.util.List r13 = r2.getConversations()
                java.util.Collection r13 = (java.util.Collection) r13
                boolean r13 = r13.isEmpty()
                if (r13 != 0) goto L_0x0244
                java.util.List r2 = r2.getConversations()
                java.lang.String r12 = r12.getCardTitle()
                int r13 = r10 >> 12
                r13 = r13 & 7168(0x1c00, float:1.0045E-41)
                r13 = r13 | 512(0x200, float:7.175E-43)
                r15 = 1
                r16 = 0
                r39 = r16
                r40 = r12
                r41 = r2
                r42 = r27
                r43 = r4
                r44 = r13
                r45 = r15
                io.intercom.android.sdk.m5.components.ConversationHistoryCardKt.ConversationHistoryCard(r39, r40, r41, r42, r43, r44, r45)
            L_0x0244:
                r4.M()
                goto L_0x01ff
            L_0x0248:
                boolean r13 = r12 instanceof io.intercom.android.sdk.m5.home.data.HomeCards.HomeNewConversationData
                if (r13 == 0) goto L_0x027a
                r2 = 1733520498(0x67536c72, float:9.984198E23)
                r4.T(r2)
                r2 = r12
                io.intercom.android.sdk.m5.home.data.HomeCards$HomeNewConversationData r2 = (io.intercom.android.sdk.m5.home.data.HomeCards.HomeNewConversationData) r2
                java.util.List r12 = r38.getAdminsAvatars()
                io.intercom.android.sdk.m5.components.avatar.AvatarWrapper r13 = r38.getBotAvatar()
                int r15 = r10 >> 9
                r15 = r15 & 7168(0x1c00, float:1.0045E-41)
                r15 = r15 | 584(0x248, float:8.18E-43)
                r16 = 0
                r39 = r2
                r40 = r12
                r41 = r13
                r42 = r26
                r43 = r4
                r44 = r15
                r45 = r16
                io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt.NewConversationCard(r39, r40, r41, r42, r43, r44, r45)
                r4.M()
                goto L_0x01ff
            L_0x027a:
                boolean r13 = r12 instanceof io.intercom.android.sdk.m5.home.data.HomeCards.HomeHelpCenterData
                if (r13 == 0) goto L_0x0369
                r13 = 1733905797(0x67594d85, float:1.0261835E24)
                r4.T(r13)
                r13 = 55935065(0x3558059, float:6.274241E-37)
                r4.T(r13)
                boolean r13 = r4.d(r2)
                java.lang.Object r15 = r4.A()
                if (r13 != 0) goto L_0x029f
                Y.m$a r13 = Y.C1500m.f10026a
                java.lang.Object r13 = r13.a()
                if (r15 != r13) goto L_0x029d
                goto L_0x029f
            L_0x029d:
                r13 = 0
                goto L_0x02a8
            L_0x029f:
                io.intercom.android.sdk.m5.home.ui.HomeContentScreenKt$HomeContentScreen$8$1$2$1 r15 = new io.intercom.android.sdk.m5.home.ui.HomeContentScreenKt$HomeContentScreen$8$1$2$1
                r13 = 0
                r15.<init>(r2, r13)
                r4.r(r15)
            L_0x02a8:
                yf.p r15 = (yf.p) r15
                r4.M()
                r2 = 70
                java.lang.String r1 = ""
                Y.P.g(r1, r15, r4, r2)
                r1 = r12
                io.intercom.android.sdk.m5.home.data.HomeCards$HomeHelpCenterData r1 = (io.intercom.android.sdk.m5.home.data.HomeCards.HomeHelpCenterData) r1
                io.intercom.android.sdk.Injector r2 = io.intercom.android.sdk.Injector.get()
                io.intercom.android.sdk.Provider r2 = r2.getAppConfigProvider()
                java.lang.Object r2 = r2.get()
                io.intercom.android.sdk.identity.AppConfig r2 = (io.intercom.android.sdk.identity.AppConfig) r2
                boolean r2 = r2.isHelpCenterRequireSearchEnabled()
                io.intercom.android.sdk.Injector r12 = io.intercom.android.sdk.Injector.get()
                io.intercom.android.sdk.m5.data.IntercomDataLayer r12 = r12.getDataLayer()
                Xg.L r12 = r12.getTeamPresence()
                java.lang.Object r12 = r12.getValue()
                io.intercom.android.sdk.models.TeamPresence r12 = (io.intercom.android.sdk.models.TeamPresence) r12
                java.util.List r12 = r12.getBuiltActiveAdmins()
                java.lang.Iterable r12 = (java.lang.Iterable) r12
                java.util.ArrayList r15 = new java.util.ArrayList
                r13 = 10
                int r6 = mf.C6565s.y(r12, r13)
                r15.<init>(r6)
                java.util.Iterator r6 = r12.iterator()
            L_0x02f0:
                boolean r12 = r6.hasNext()
                if (r12 == 0) goto L_0x0323
                java.lang.Object r12 = r6.next()
                io.intercom.android.sdk.models.Participant r12 = (io.intercom.android.sdk.models.Participant) r12
                io.intercom.android.sdk.m5.components.avatar.AvatarWrapper r13 = new io.intercom.android.sdk.m5.components.avatar.AvatarWrapper
                io.intercom.android.sdk.models.Avatar r3 = r12.getAvatar()
                r30 = r0
                java.lang.String r0 = "getAvatar(...)"
                kotlin.jvm.internal.C6496s.g(r3, r0)
                java.lang.Boolean r0 = r12.isBot()
                java.lang.String r12 = "isBot(...)"
                kotlin.jvm.internal.C6496s.g(r0, r12)
                boolean r0 = r0.booleanValue()
                r13.<init>(r3, r0)
                r15.add(r13)
                r0 = r30
                r3 = 8
                r13 = 10
                goto L_0x02f0
            L_0x0323:
                r30 = r0
                io.intercom.android.sdk.Injector r0 = io.intercom.android.sdk.Injector.get()
                io.intercom.android.sdk.Provider r0 = r0.getAppConfigProvider()
                java.lang.Object r0 = r0.get()
                io.intercom.android.sdk.identity.AppConfig r0 = (io.intercom.android.sdk.identity.AppConfig) r0
                boolean r0 = r0.isAccessToTeammateEnabled()
                io.intercom.android.sdk.Injector r3 = io.intercom.android.sdk.Injector.get()
                io.intercom.android.sdk.metrics.MetricTracker r3 = r3.getMetricTracker()
                java.lang.String r6 = "getMetricTracker(...)"
                kotlin.jvm.internal.C6496s.g(r3, r6)
                r6 = 33288(0x8208, float:4.6646E-41)
                r39 = r1
                r40 = r2
                r41 = r15
                r42 = r0
                r43 = r3
                r44 = r4
                r45 = r6
                io.intercom.android.sdk.m5.components.SearchBrowseCardKt.SearchBrowseCard(r39, r40, r41, r42, r43, r44, r45)
                r4.M()
            L_0x035b:
                r1 = 8
                r3 = 1
                r33 = 10
                r35 = 0
                r36 = 0
                r13 = r37
                r6 = r14
                goto L_0x03fe
            L_0x0369:
                r30 = r0
                boolean r0 = r12 instanceof io.intercom.android.sdk.m5.home.data.HomeCards.HomeExternalLinkData
                if (r0 == 0) goto L_0x0380
                r0 = 1734773921(0x67668ca1, float:1.08873844E24)
                r4.T(r0)
                io.intercom.android.sdk.m5.home.data.HomeCards$HomeExternalLinkData r12 = (io.intercom.android.sdk.m5.home.data.HomeCards.HomeExternalLinkData) r12
                r0 = 8
                io.intercom.android.sdk.m5.home.ui.components.ExternalLinkCardKt.ExternalLinkCard(r12, r4, r0)
                r4.M()
                goto L_0x035b
            L_0x0380:
                boolean r0 = r12 instanceof io.intercom.android.sdk.m5.home.data.HomeCards.HomeMessengerAppData
                if (r0 == 0) goto L_0x03cb
                r0 = 1734912770(0x6768ab02, float:1.09874356E24)
                r4.T(r0)
                io.intercom.android.sdk.m5.home.data.HomeCards$HomeMessengerAppData r12 = (io.intercom.android.sdk.m5.home.data.HomeCards.HomeMessengerAppData) r12
                java.lang.String r0 = r12.getFallbackUrl()
                io.intercom.android.sdk.ui.component.IntercomCardStyle r12 = io.intercom.android.sdk.ui.component.IntercomCardStyle.INSTANCE
                int r1 = io.intercom.android.sdk.ui.component.IntercomCardStyle.$stable
                int r23 = r1 << 18
                r24 = 63
                r13 = 0
                r1 = 0
                r20 = 0
                r18 = 0
                r3 = 0
                r31 = 0
                r6 = 0
                r33 = 10
                r34 = r37
                r35 = r6
                r6 = r14
                r36 = 0
                r14 = r1
                r16 = r20
                r19 = r3
                r20 = r31
                r22 = r4
                io.intercom.android.sdk.ui.component.IntercomCardStyle$Style r1 = r12.m591defaultStyleqUnfpCA(r13, r14, r16, r18, r19, r20, r22, r23, r24)
                int r2 = io.intercom.android.sdk.ui.component.IntercomCardStyle.Style.$stable
                int r2 = r2 << 3
                r2 = r2 | 384(0x180, float:5.38E-43)
                r3 = 1
                io.intercom.android.sdk.m5.home.ui.components.LegacyMessengerAppCardKt.LegacyMessengerAppCard(r0, r1, r3, r4, r2)
                r4.M()
                r13 = r34
                r1 = 8
                goto L_0x03fe
            L_0x03cb:
                r3 = 1
                r33 = 10
                r35 = 0
                r36 = 0
                r34 = r37
                r6 = r14
                boolean r0 = r12 instanceof io.intercom.android.sdk.m5.home.data.HomeCards.HomeTicketLinksData
                if (r0 == 0) goto L_0x03f1
                r0 = 1735201845(0x676d1435, float:1.1195736E24)
                r4.T(r0)
                io.intercom.android.sdk.m5.home.data.HomeCards$HomeTicketLinksData r12 = (io.intercom.android.sdk.m5.home.data.HomeCards.HomeTicketLinksData) r12
                int r0 = r10 >> 21
                r0 = r0 & 112(0x70, float:1.57E-43)
                r1 = 8
                r0 = r0 | r1
                r13 = r34
                io.intercom.android.sdk.m5.home.ui.components.TicketLinksCardKt.TicketLinksCard(r12, r13, r4, r0)
                r4.M()
                goto L_0x03fe
            L_0x03f1:
                r13 = r34
                r1 = 8
                r0 = 1735406011(0x677031bb, float:1.1342853E24)
                r4.T(r0)
                r4.M()
            L_0x03fe:
                r14 = r6
                r37 = r13
                r2 = r29
                r0 = r30
                r6 = r3
                r3 = r1
                r1 = 256(0x100, float:3.59E-43)
                goto L_0x0124
            L_0x040b:
                r13 = r37
                r6 = r14
                r4.M()
                r4.u()
                Y.Y0 r12 = r4.k()
                if (r12 == 0) goto L_0x0434
                io.intercom.android.sdk.m5.home.ui.j r14 = new io.intercom.android.sdk.m5.home.ui.j
                r0 = r14
                r1 = r7
                r2 = r38
                r3 = r8
                r4 = r9
                r5 = r6
                r6 = r25
                r7 = r26
                r8 = r27
                r9 = r13
                r10 = r47
                r11 = r48
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r12.a(r14)
            L_0x0434:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.home.ui.HomeContentScreenKt.HomeContentScreen(k0.i, io.intercom.android.sdk.m5.home.states.HomeUiState$Content, yf.a, yf.a, yf.a, yf.l, yf.a, yf.l, yf.l, Y.m, int, int):void");
        }

        /* access modifiers changed from: private */
        public static final C6514M HomeContentScreen$lambda$0() {
            return C6514M.f71813a;
        }

        /* access modifiers changed from: private */
        public static final C6514M HomeContentScreen$lambda$1() {
            return C6514M.f71813a;
        }

        /* access modifiers changed from: private */
        public static final C6514M HomeContentScreen$lambda$12$lambda$11$lambda$8$lambda$7(C6787a aVar, C6787a aVar2, C6787a aVar3, SpaceItemType spaceItemType) {
            C6496s.h(spaceItemType, "it");
            int i10 = WhenMappings.$EnumSwitchMapping$0[spaceItemType.ordinal()];
            if (i10 == 1) {
                aVar.invoke();
            } else if (i10 == 2) {
                aVar2.invoke();
            } else if (i10 == 3) {
                aVar3.invoke();
            } else {
                throw new C6535s();
            }
            return C6514M.f71813a;
        }

        /* access modifiers changed from: private */
        public static final C6514M HomeContentScreen$lambda$13(i iVar, HomeUiState.Content content, C6787a aVar, C6787a aVar2, C6787a aVar3, C6798l lVar, C6787a aVar4, C6798l lVar2, C6798l lVar3, int i10, int i11, C1500m mVar, int i12) {
            C6496s.h(content, "$content");
            HomeContentScreen(iVar, content, aVar, aVar2, aVar3, lVar, aVar4, lVar2, lVar3, mVar, M0.a(i10 | 1), i11);
            return C6514M.f71813a;
        }

        /* access modifiers changed from: private */
        public static final C6514M HomeContentScreen$lambda$2() {
            return C6514M.f71813a;
        }

        /* access modifiers changed from: private */
        public static final C6514M HomeContentScreen$lambda$3(String str) {
            C6496s.h(str, "it");
            return C6514M.f71813a;
        }

        /* access modifiers changed from: private */
        public static final C6514M HomeContentScreen$lambda$4() {
            return C6514M.f71813a;
        }

        /* access modifiers changed from: private */
        public static final C6514M HomeContentScreen$lambda$5(Conversation conversation) {
            C6496s.h(conversation, "it");
            return C6514M.f71813a;
        }

        /* access modifiers changed from: private */
        public static final C6514M HomeContentScreen$lambda$6(TicketType ticketType) {
            C6496s.h(ticketType, "it");
            return C6514M.f71813a;
        }
    }
