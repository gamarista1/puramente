package io.intercom.android.sdk.ui.preview.ui;

import G.v;
import Y.C1500m;
import io.intercom.android.sdk.ui.preview.model.PreviewUiState;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.r;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class PreviewRootScreenKt$PreviewRootScreen$2$1$4 implements r {
    final /* synthetic */ PreviewUiState $state;

    PreviewRootScreenKt$PreviewRootScreen$2$1$4(PreviewUiState previewUiState) {
        this.$state = previewUiState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((v) obj, ((Number) obj2).intValue(), (C1500m) obj3, ((Number) obj4).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(v vVar, int i10, C1500m mVar, int i11) {
        C6496s.h(vVar, "$this$HorizontalPager");
        PreviewUriKt.PreviewUri(i.f23074a, this.$state.getFiles().get(i10), mVar, 70, 0);
    }
}
