package i3;

import android.view.SurfaceView;
import i3.F;

public final /* synthetic */ class N implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ F.e f22249a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SurfaceView f22250b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Runnable f22251c;

    public /* synthetic */ N(F.e eVar, SurfaceView surfaceView, Runnable runnable) {
        this.f22249a = eVar;
        this.f22250b = surfaceView;
        this.f22251c = runnable;
    }

    public final void run() {
        this.f22249a.d(this.f22250b, this.f22251c);
    }
}
