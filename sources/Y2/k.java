package y2;

import android.graphics.SurfaceTexture;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f28690a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SurfaceTexture f28691b;

    public /* synthetic */ k(l lVar, SurfaceTexture surfaceTexture) {
        this.f28690a = lVar;
        this.f28691b = surfaceTexture;
    }

    public final void run() {
        this.f28690a.f(this.f28691b);
    }
}
