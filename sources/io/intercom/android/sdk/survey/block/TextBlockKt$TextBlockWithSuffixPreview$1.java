package io.intercom.android.sdk.survey.block;

import V.O0;
import Y.C1500m;
import g0.c;
import io.intercom.android.sdk.blocks.lib.models.Block;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import r0.C2544x0;
import r0.g2;
import x.C2868g;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TextBlockKt$TextBlockWithSuffixPreview$1 implements p {
    final /* synthetic */ Block $block;

    TextBlockKt$TextBlockWithSuffixPreview$1(Block block) {
        this.$block = block;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            final Block block = this.$block;
            C1500m mVar2 = mVar;
            O0.a((i) null, (g2) null, 0, 0, 0.0f, 0.0f, (C2868g) null, c.e(367008621, true, new p() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1500m) obj, ((Number) obj2).intValue());
                    return C6514M.f71813a;
                }

                public final void invoke(C1500m mVar, int i10) {
                    if ((i10 & 11) != 2 || !mVar.i()) {
                        Block block = block;
                        C6496s.e(block);
                        TextBlockKt.TextBlock((i) null, new BlockRenderData(block, (C2544x0) null, (BlockRenderTextStyle) null, (BlockRenderTextStyle) null, (BlockRenderTextStyle) null, 30, (DefaultConstructorMarker) null), new SuffixText("*", "", C2544x0.f25560b.f(), (DefaultConstructorMarker) null), (C6798l) null, mVar, 64, 9);
                        return;
                    }
                    mVar.I();
                }
            }, mVar2, 54), mVar2, 12582912, 127);
            return;
        }
        mVar.I();
    }
}
