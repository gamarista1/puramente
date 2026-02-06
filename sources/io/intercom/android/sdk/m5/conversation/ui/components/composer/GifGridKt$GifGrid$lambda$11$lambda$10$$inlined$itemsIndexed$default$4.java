package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import F.m;
import Y.C1500m;
import Y.C1506p;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.block.ImageBlockKt;
import io.intercom.android.sdk.survey.block.ImageRenderType;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;
import yf.r;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "LF/m;", "", "index", "Llf/M;", "invoke", "(LF/m;ILY/m;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class GifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$4 extends C6498u implements r {
    final /* synthetic */ List $items;
    final /* synthetic */ C6798l $onGifClick$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$4(List list, C6798l lVar) {
        super(4);
        this.$items = list;
        this.$onGifClick$inlined = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((m) obj, ((Number) obj2).intValue(), (C1500m) obj3, ((Number) obj4).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(m mVar, int i10, C1500m mVar2, int i11) {
        int i12;
        if ((i11 & 6) == 0) {
            i12 = (mVar2.S(mVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= mVar2.d(i10) ? 32 : 16;
        }
        if ((i12 & 147) != 146 || !mVar2.i()) {
            if (C1506p.H()) {
                C1506p.Q(284833944, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:385)");
            }
            mVar2.T(-1572851321);
            ImageBlockKt.ImageBlock((Block) this.$items.get(i10), (i) null, this.$onGifClick$inlined, true, (ImageRenderType) null, mVar2, 3080, 18);
            mVar2.M();
            if (C1506p.H()) {
                C1506p.P();
                return;
            }
            return;
        }
        mVar2.I();
    }
}
