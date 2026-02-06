package la;

import android.graphics.SurfaceTexture;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f46422a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SurfaceTexture f46423b;

    public /* synthetic */ j(l lVar, SurfaceTexture surfaceTexture) {
        this.f46422a = lVar;
        this.f46423b = surfaceTexture;
    }

    public final void run() {
        this.f46422a.e(this.f46423b);
    }
}
