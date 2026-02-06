package la;

import android.graphics.SurfaceTexture;

public final /* synthetic */ class h implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f46408a;

    public /* synthetic */ h(i iVar) {
        this.f46408a = iVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f46408a.g(surfaceTexture);
    }
}
