package wd;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.G;
import kotlin.jvm.internal.C6496s;
import vd.t;
import vd.z;

public final class g extends b {

    /* renamed from: e  reason: collision with root package name */
    private final float f62104e;

    /* renamed from: f  reason: collision with root package name */
    private final float f62105f;

    /* renamed from: g  reason: collision with root package name */
    private final float f62106g;

    /* renamed from: h  reason: collision with root package name */
    private final float f62107h;

    /* renamed from: i  reason: collision with root package name */
    private final float f62108i;

    /* renamed from: j  reason: collision with root package name */
    private final float f62109j;

    /* renamed from: k  reason: collision with root package name */
    private final float f62110k;

    /* renamed from: l  reason: collision with root package name */
    private final float f62111l;

    /* renamed from: m  reason: collision with root package name */
    private final z f62112m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(t tVar) {
        super(tVar);
        C6496s.h(tVar, "handler");
        this.f62104e = tVar.L();
        this.f62105f = tVar.M();
        this.f62106g = tVar.J();
        this.f62107h = tVar.K();
        this.f62108i = tVar.n1();
        this.f62109j = tVar.o1();
        this.f62110k = tVar.p1();
        this.f62111l = tVar.q1();
        this.f62112m = tVar.m1();
    }

    public void a(WritableMap writableMap) {
        C6496s.h(writableMap, "eventData");
        super.a(writableMap);
        writableMap.putDouble("x", (double) G.f(this.f62104e));
        writableMap.putDouble("y", (double) G.f(this.f62105f));
        writableMap.putDouble("absoluteX", (double) G.f(this.f62106g));
        writableMap.putDouble("absoluteY", (double) G.f(this.f62107h));
        writableMap.putDouble("translationX", (double) G.f(this.f62108i));
        writableMap.putDouble("translationY", (double) G.f(this.f62109j));
        writableMap.putDouble("velocityX", (double) G.f(this.f62110k));
        writableMap.putDouble("velocityY", (double) G.f(this.f62111l));
        if (this.f62112m.a() != -1.0d) {
            writableMap.putMap("stylusData", this.f62112m.b());
        }
    }
}
