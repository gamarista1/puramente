package wd;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.G;
import kotlin.jvm.internal.C6496s;
import vd.x;

public final class i extends b {

    /* renamed from: e  reason: collision with root package name */
    private final double f62117e;

    /* renamed from: f  reason: collision with root package name */
    private final float f62118f;

    /* renamed from: g  reason: collision with root package name */
    private final float f62119g;

    /* renamed from: h  reason: collision with root package name */
    private final double f62120h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(x xVar) {
        super(xVar);
        C6496s.h(xVar, "handler");
        this.f62117e = xVar.Y0();
        this.f62118f = xVar.W0();
        this.f62119g = xVar.X0();
        this.f62120h = xVar.Z0();
    }

    public void a(WritableMap writableMap) {
        C6496s.h(writableMap, "eventData");
        super.a(writableMap);
        writableMap.putDouble("rotation", this.f62117e);
        writableMap.putDouble("anchorX", (double) G.f(this.f62118f));
        writableMap.putDouble("anchorY", (double) G.f(this.f62119g));
        writableMap.putDouble("velocity", this.f62120h);
    }
}
