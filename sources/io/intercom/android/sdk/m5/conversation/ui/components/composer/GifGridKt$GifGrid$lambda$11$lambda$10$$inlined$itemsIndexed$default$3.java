package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import F.I;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "LF/I;", "invoke", "(I)LF/I;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
final class GifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$3 extends C6498u implements C6798l {
    final /* synthetic */ List $items;
    final /* synthetic */ p $span;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$3(p pVar, List list) {
        super(1);
        this.$span = pVar;
        this.$items = list;
    }

    public final I invoke(int i10) {
        return (I) this.$span.invoke(Integer.valueOf(i10), this.$items.get(i10));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
