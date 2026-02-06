package o4;

import android.graphics.Canvas;
import android.graphics.PostProcessor;
import m4.C3772a;

public final /* synthetic */ class f implements PostProcessor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C3772a f46990a;

    public /* synthetic */ f(C3772a aVar) {
        this.f46990a = aVar;
    }

    public final int onPostProcess(Canvas canvas) {
        return g.e(this.f46990a, canvas);
    }
}
