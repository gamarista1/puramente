package wd;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.G;
import kotlin.jvm.internal.C6496s;
import vd.u;

public final class h extends b {

    /* renamed from: e  reason: collision with root package name */
    private final double f62113e;

    /* renamed from: f  reason: collision with root package name */
    private final float f62114f;

    /* renamed from: g  reason: collision with root package name */
    private final float f62115g;

    /* renamed from: h  reason: collision with root package name */
    private final double f62116h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(u uVar) {
        super(uVar);
        C6496s.h(uVar, "handler");
        this.f62113e = uVar.b1();
        this.f62114f = uVar.Z0();
        this.f62115g = uVar.a1();
        this.f62116h = uVar.c1();
    }

    public void a(WritableMap writableMap) {
        C6496s.h(writableMap, "eventData");
        super.a(writableMap);
        writableMap.putDouble("scale", this.f62113e);
        writableMap.putDouble("focalX", (double) G.f(this.f62114f));
        writableMap.putDouble("focalY", (double) G.f(this.f62115g));
        writableMap.putDouble("velocity", this.f62116h);
    }
}
