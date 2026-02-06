package io.intercom.android.sdk.ui.preview.ui;

import Y.L;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1795s;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"io/intercom/android/sdk/ui/preview/ui/PreviewUriKt$VideoPlayer$lambda$9$$inlined$onDispose$1", "LY/L;", "Llf/M;", "dispose", "()V", "runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PreviewUriKt$VideoPlayer$lambda$9$$inlined$onDispose$1 implements L {
    final /* synthetic */ ExoPlayer $exoPlayer$inlined;
    final /* synthetic */ C1790m $lifecycle$inlined;
    final /* synthetic */ C1795s $observer$inlined;

    public PreviewUriKt$VideoPlayer$lambda$9$$inlined$onDispose$1(C1790m mVar, C1795s sVar, ExoPlayer exoPlayer) {
        this.$lifecycle$inlined = mVar;
        this.$observer$inlined = sVar;
        this.$exoPlayer$inlined = exoPlayer;
    }

    public void dispose() {
        this.$lifecycle$inlined.d(this.$observer$inlined);
        this.$exoPlayer$inlined.release();
    }
}
