package y2;

import android.graphics.SurfaceTexture;

public final /* synthetic */ class h implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f28675a;

    public /* synthetic */ h(i iVar) {
        this.f28675a = iVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f28675a.g(surfaceTexture);
    }
}
