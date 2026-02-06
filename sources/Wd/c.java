package wd;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.G;
import kotlin.jvm.internal.C6496s;
import vd.m;
import vd.z;

public final class c extends b {

    /* renamed from: e  reason: collision with root package name */
    private final float f62093e;

    /* renamed from: f  reason: collision with root package name */
    private final float f62094f;

    /* renamed from: g  reason: collision with root package name */
    private final float f62095g;

    /* renamed from: h  reason: collision with root package name */
    private final float f62096h;

    /* renamed from: i  reason: collision with root package name */
    private final z f62097i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(m mVar) {
        super(mVar);
        C6496s.h(mVar, "handler");
        this.f62093e = mVar.L();
        this.f62094f = mVar.M();
        this.f62095g = mVar.J();
        this.f62096h = mVar.K();
        this.f62097i = mVar.X0();
    }

    public void a(WritableMap writableMap) {
        C6496s.h(writableMap, "eventData");
        super.a(writableMap);
        writableMap.putDouble("x", (double) G.f(this.f62093e));
        writableMap.putDouble("y", (double) G.f(this.f62094f));
        writableMap.putDouble("absoluteX", (double) G.f(this.f62095g));
        writableMap.putDouble("absoluteY", (double) G.f(this.f62096h));
        if (this.f62097i.a() != -1.0d) {
            writableMap.putMap("stylusData", this.f62097i.b());
        }
    }
}
