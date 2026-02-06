package wd;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.G;
import kotlin.jvm.internal.C6496s;
import vd.C5258b;

/* renamed from: wd.a  reason: case insensitive filesystem */
public final class C5266a extends b {

    /* renamed from: e  reason: collision with root package name */
    private final float f62085e;

    /* renamed from: f  reason: collision with root package name */
    private final float f62086f;

    /* renamed from: g  reason: collision with root package name */
    private final float f62087g;

    /* renamed from: h  reason: collision with root package name */
    private final float f62088h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5266a(C5258b bVar) {
        super(bVar);
        C6496s.h(bVar, "handler");
        this.f62085e = bVar.L();
        this.f62086f = bVar.M();
        this.f62087g = bVar.J();
        this.f62088h = bVar.K();
    }

    public void a(WritableMap writableMap) {
        C6496s.h(writableMap, "eventData");
        super.a(writableMap);
        writableMap.putDouble("x", (double) G.f(this.f62085e));
        writableMap.putDouble("y", (double) G.f(this.f62086f));
        writableMap.putDouble("absoluteX", (double) G.f(this.f62087g));
        writableMap.putDouble("absoluteY", (double) G.f(this.f62088h));
    }
}
