package io.intercom.android.sdk.survey.block;

import Y.C1500m;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class BlockViewKt$BlockView$textBlock$1 implements p {
    final /* synthetic */ BlockRenderData $blockRenderData;
    final /* synthetic */ C6798l $onLayoutResult;
    final /* synthetic */ SuffixText $suffixText;

    BlockViewKt$BlockView$textBlock$1(BlockRenderData blockRenderData, SuffixText suffixText, C6798l lVar) {
        this.$blockRenderData = blockRenderData;
        this.$suffixText = suffixText;
        this.$onLayoutResult = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            TextBlockKt.TextBlock(i.f23074a, this.$blockRenderData, this.$suffixText, this.$onLayoutResult, mVar, 70, 0);
        } else {
            mVar.I();
        }
    }
}
