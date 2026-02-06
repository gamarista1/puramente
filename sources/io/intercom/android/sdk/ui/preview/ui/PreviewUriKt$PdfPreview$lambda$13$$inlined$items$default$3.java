package io.intercom.android.sdk.ui.preview.ui;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "invoke", "(I)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class PreviewUriKt$PdfPreview$lambda$13$$inlined$items$default$3 extends C6498u implements C6798l {
    final /* synthetic */ C6798l $contentType;
    final /* synthetic */ List $items;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewUriKt$PdfPreview$lambda$13$$inlined$items$default$3(C6798l lVar, List list) {
        super(1);
        this.$contentType = lVar;
        this.$items = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i10) {
        return this.$contentType.invoke(this.$items.get(i10));
    }
}
