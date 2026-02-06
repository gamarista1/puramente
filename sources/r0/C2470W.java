package r0;

import android.graphics.Path;
import android.graphics.PathMeasure;

/* renamed from: r0.W  reason: case insensitive filesystem */
public final class C2470W implements V1 {

    /* renamed from: a  reason: collision with root package name */
    private final PathMeasure f25473a;

    public C2470W(PathMeasure pathMeasure) {
        this.f25473a = pathMeasure;
    }

    public float a() {
        return this.f25473a.getLength();
    }

    public boolean b(float f10, float f11, S1 s12, boolean z10) {
        PathMeasure pathMeasure = this.f25473a;
        if (s12 instanceof C2469V) {
            return pathMeasure.getSegment(f10, f11, ((C2469V) s12).u(), z10);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public void c(S1 s12, boolean z10) {
        Path path;
        PathMeasure pathMeasure = this.f25473a;
        if (s12 == null) {
            path = null;
        } else if (s12 instanceof C2469V) {
            path = ((C2469V) s12).u();
        } else {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        pathMeasure.setPath(path, z10);
    }
}
