package io.intercom.android.sdk.ui.preview.ui;

import kotlin.Metadata;
import yf.C6787a;
import yf.C6798l;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class PreviewBottomBarKt$ThumbnailList$2$1$1$1 implements C6787a {
    final /* synthetic */ int $index;
    final /* synthetic */ C6798l $onThumbnailClick;

    PreviewBottomBarKt$ThumbnailList$2$1$1$1(C6798l lVar, int i10) {
        this.$onThumbnailClick = lVar;
        this.$index = i10;
    }

    public final void invoke() {
        this.$onThumbnailClick.invoke(Integer.valueOf(this.$index));
    }
}
