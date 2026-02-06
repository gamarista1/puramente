package com.facebook.react.uimanager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import x1.f;

public class F extends d {

    /* renamed from: e  reason: collision with root package name */
    private static final f f41405e = new f(20);

    /* renamed from: a  reason: collision with root package name */
    private int f41406a;

    /* renamed from: b  reason: collision with root package name */
    private int f41407b;

    /* renamed from: c  reason: collision with root package name */
    private int f41408c;

    /* renamed from: d  reason: collision with root package name */
    private int f41409d;

    private F() {
    }

    public static F b(int i10, int i11, int i12, int i13, int i14) {
        return c(-1, i10, i11, i12, i13, i14);
    }

    public static F c(int i10, int i11, int i12, int i13, int i14, int i15) {
        F f10 = (F) f41405e.b();
        if (f10 == null) {
            f10 = new F();
        }
        f10.a(i10, i11, i12, i13, i14, i15);
        return f10;
    }

    /* access modifiers changed from: protected */
    public void a(int i10, int i11, int i12, int i13, int i14, int i15) {
        super.init(i10, i11);
        this.f41406a = i12;
        this.f41407b = i13;
        this.f41408c = i14;
        this.f41409d = i15;
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("x", (double) G.f((float) this.f41406a));
        createMap.putDouble("y", (double) G.f((float) this.f41407b));
        createMap.putDouble(Snapshot.WIDTH, (double) G.f((float) this.f41408c));
        createMap.putDouble(Snapshot.HEIGHT, (double) G.f((float) this.f41409d));
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("layout", createMap);
        createMap2.putInt("target", getViewTag());
        return createMap2;
    }

    public String getEventName() {
        return "topLayout";
    }

    public void onDispose() {
        f41405e.a(this);
    }
}
