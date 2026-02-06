package wd;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.G;
import kotlin.jvm.internal.C6496s;
import vd.o;

public final class d extends b {

    /* renamed from: e  reason: collision with root package name */
    private final float f62098e;

    /* renamed from: f  reason: collision with root package name */
    private final float f62099f;

    /* renamed from: g  reason: collision with root package name */
    private final float f62100g;

    /* renamed from: h  reason: collision with root package name */
    private final float f62101h;

    /* renamed from: i  reason: collision with root package name */
    private final int f62102i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(o oVar) {
        super(oVar);
        C6496s.h(oVar, "handler");
        this.f62098e = oVar.L();
        this.f62099f = oVar.M();
        this.f62100g = oVar.J();
        this.f62101h = oVar.K();
        this.f62102i = oVar.Y0();
    }

    public void a(WritableMap writableMap) {
        C6496s.h(writableMap, "eventData");
        super.a(writableMap);
        writableMap.putDouble("x", (double) G.f(this.f62098e));
        writableMap.putDouble("y", (double) G.f(this.f62099f));
        writableMap.putDouble("absoluteX", (double) G.f(this.f62100g));
        writableMap.putDouble("absoluteY", (double) G.f(this.f62101h));
        writableMap.putInt("duration", this.f62102i);
    }
}
