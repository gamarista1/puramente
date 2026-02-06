package wd;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.G;
import kotlin.jvm.internal.C6496s;
import vd.C5256B;

public final class j extends b {

    /* renamed from: e  reason: collision with root package name */
    private final float f62121e;

    /* renamed from: f  reason: collision with root package name */
    private final float f62122f;

    /* renamed from: g  reason: collision with root package name */
    private final float f62123g;

    /* renamed from: h  reason: collision with root package name */
    private final float f62124h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(C5256B b10) {
        super(b10);
        C6496s.h(b10, "handler");
        this.f62121e = b10.L();
        this.f62122f = b10.M();
        this.f62123g = b10.J();
        this.f62124h = b10.K();
    }

    public void a(WritableMap writableMap) {
        C6496s.h(writableMap, "eventData");
        super.a(writableMap);
        writableMap.putDouble("x", (double) G.f(this.f62121e));
        writableMap.putDouble("y", (double) G.f(this.f62122f));
        writableMap.putDouble("absoluteX", (double) G.f(this.f62123g));
        writableMap.putDouble("absoluteY", (double) G.f(this.f62124h));
    }
}
