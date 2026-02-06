package io.intercom.android.sdk.survey.block;

import O0.t;
import O0.v;
import Q0.C1321d;
import Q0.L;
import Y.C1500m;
import Y.C1510r0;
import io.intercom.android.sdk.blocks.lib.models.Block;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TextBlockKt$TextBlock$2 implements p {
    final /* synthetic */ Block $block;
    final /* synthetic */ BlockRenderData $blockRenderData;
    final /* synthetic */ BlockRenderTextStyle $blockRenderTextStyle;
    final /* synthetic */ C1321d $finalTextToRender;
    final /* synthetic */ C1510r0 $layoutResult;
    final /* synthetic */ i $modifier;
    final /* synthetic */ C6798l $onLayoutResult;
    final /* synthetic */ SuffixText $suffixText;
    final /* synthetic */ C1321d $textToRender;

    TextBlockKt$TextBlock$2(BlockRenderTextStyle blockRenderTextStyle, BlockRenderData blockRenderData, Block block, i iVar, C1321d dVar, SuffixText suffixText, C1321d dVar2, C6798l lVar, C1510r0 r0Var) {
        this.$blockRenderTextStyle = blockRenderTextStyle;
        this.$blockRenderData = blockRenderData;
        this.$block = block;
        this.$modifier = iVar;
        this.$textToRender = dVar;
        this.$suffixText = suffixText;
        this.$finalTextToRender = dVar2;
        this.$onLayoutResult = lVar;
        this.$layoutResult = r0Var;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1$lambda$0(C1321d dVar, SuffixText suffixText, v vVar) {
        C6496s.h(dVar, "$textToRender");
        C6496s.h(vVar, "$this$semantics");
        t.Y(vVar, dVar + suffixText.getTtsText());
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$3$lambda$2(C1510r0 r0Var, C6798l lVar, L l10) {
        C6496s.h(r0Var, "$layoutResult");
        C6496s.h(l10, "it");
        r0Var.setValue(l10);
        lVar.invoke(l10);
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: yf.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(Y.C1500m r30, int r31) {
        /*
            r29 = this;
            r0 = r29
            r14 = r30
            r1 = r31 & 11
            r2 = 2
            if (r1 != r2) goto L_0x0015
            boolean r1 = r30.i()
            if (r1 != 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            r30.I()
            goto L_0x00fe
        L_0x0015:
            io.intercom.android.sdk.survey.block.BlockRenderTextStyle r1 = r0.$blockRenderTextStyle
            long r5 = r1.m440getFontSizeXSAIIZE()
            io.intercom.android.sdk.survey.block.BlockRenderTextStyle r1 = r0.$blockRenderTextStyle
            r0.x0 r1 = r1.m444getTextColorQN2ZGVo()
            if (r1 != 0) goto L_0x0029
            io.intercom.android.sdk.survey.block.BlockRenderData r1 = r0.$blockRenderData
            r0.x0 r1 = r1.m432getTextColorQN2ZGVo()
        L_0x0029:
            r2 = 231537837(0xdccfcad, float:1.26333E-30)
            r14.T(r2)
            if (r1 != 0) goto L_0x003f
            io.intercom.android.sdk.ui.theme.IntercomTheme r1 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r2 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r1 = r1.getColors(r14, r2)
            long r1 = r1.m700getPrimaryText0d7_KjU()
        L_0x003d:
            r3 = r1
            goto L_0x0044
        L_0x003f:
            long r1 = r1.y()
            goto L_0x003d
        L_0x0044:
            r30.M()
            io.intercom.android.sdk.survey.block.BlockRenderTextStyle r1 = r0.$blockRenderTextStyle
            b1.j r1 = r1.m443getTextAlignbuA522U()
            if (r1 == 0) goto L_0x0054
            int r1 = r1.n()
            goto L_0x0063
        L_0x0054:
            io.intercom.android.sdk.blocks.lib.models.Block r1 = r0.$block
            io.intercom.android.sdk.blocks.lib.BlockAlignment r1 = r1.getAlign()
            java.lang.String r2 = "getAlign(...)"
            kotlin.jvm.internal.C6496s.g(r1, r2)
            int r1 = io.intercom.android.sdk.survey.block.BlockExtensionsKt.getTextAlign(r1)
        L_0x0063:
            io.intercom.android.sdk.survey.block.BlockRenderTextStyle r2 = r0.$blockRenderTextStyle
            long r27 = r2.m441getLineHeightXSAIIZE()
            io.intercom.android.sdk.survey.block.BlockRenderTextStyle r2 = r0.$blockRenderTextStyle
            V0.p r8 = r2.getFontWeight()
            k0.i r2 = r0.$modifier
            r7 = 231549763(0xdcd2b43, float:1.2644515E-30)
            r14.T(r7)
            Q0.d r7 = r0.$textToRender
            boolean r7 = r14.S(r7)
            io.intercom.android.sdk.survey.block.SuffixText r9 = r0.$suffixText
            boolean r9 = r14.S(r9)
            r7 = r7 | r9
            Q0.d r9 = r0.$textToRender
            io.intercom.android.sdk.survey.block.SuffixText r10 = r0.$suffixText
            java.lang.Object r11 = r30.A()
            if (r7 != 0) goto L_0x0096
            Y.m$a r7 = Y.C1500m.f10026a
            java.lang.Object r7 = r7.a()
            if (r11 != r7) goto L_0x009e
        L_0x0096:
            io.intercom.android.sdk.survey.block.J r11 = new io.intercom.android.sdk.survey.block.J
            r11.<init>(r9, r10)
            r14.r(r11)
        L_0x009e:
            yf.l r11 = (yf.C6798l) r11
            r30.M()
            r7 = 1
            r9 = 0
            r10 = 0
            k0.i r2 = O0.m.d(r2, r10, r11, r7, r9)
            Q0.d r13 = r0.$finalTextToRender
            b1.j r15 = b1.j.h(r1)
            r1 = 231552920(0xdcd3798, float:1.2647484E-30)
            r14.T(r1)
            yf.l r1 = r0.$onLayoutResult
            boolean r1 = r14.S(r1)
            Y.r0 r7 = r0.$layoutResult
            yf.l r9 = r0.$onLayoutResult
            java.lang.Object r10 = r30.A()
            if (r1 != 0) goto L_0x00ce
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r10 != r1) goto L_0x00d6
        L_0x00ce:
            io.intercom.android.sdk.survey.block.K r10 = new io.intercom.android.sdk.survey.block.K
            r10.<init>(r7, r9)
            r14.r(r10)
        L_0x00d6:
            r21 = r10
            yf.l r21 = (yf.C6798l) r21
            r30.M()
            r25 = 0
            r26 = 195024(0x2f9d0, float:2.73287E-40)
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r1 = r13
            r13 = r15
            r14 = r27
            r23 = r30
            V.T0.c(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.block.TextBlockKt$TextBlock$2.invoke(Y.m, int):void");
    }
}
