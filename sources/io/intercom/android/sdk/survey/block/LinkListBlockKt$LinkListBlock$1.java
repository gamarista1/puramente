package io.intercom.android.sdk.survey.block;

import C.C1092j;
import Y.C1500m;
import io.intercom.android.sdk.blocks.lib.models.Block;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class LinkListBlockKt$LinkListBlock$1 implements q {
    final /* synthetic */ Block $block;
    final /* synthetic */ String $conversationId;
    final /* synthetic */ long $textColor;

    LinkListBlockKt$LinkListBlock$1(Block block, long j10, String str) {
        this.$block = block;
        this.$textColor = j10;
        this.$conversationId = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1092j) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1092j jVar, C1500m mVar, int i10) {
        C6496s.h(jVar, "$this$IntercomCard");
        if ((i10 & 81) != 16 || !mVar.i()) {
            BlockViewKt.m445RenderLegacyBlockssW7UJKQ(this.$block, this.$textColor, (i) null, this.$conversationId, mVar, 8, 4);
        } else {
            mVar.I();
        }
    }
}
