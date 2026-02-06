package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.G;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import kotlin.jvm.internal.C6496s;

public final class c extends d {

    /* renamed from: a  reason: collision with root package name */
    private final int f41575a;

    /* renamed from: b  reason: collision with root package name */
    private final int f41576b;

    public c(int i10, int i11, int i12, int i13) {
        super(i10, i11);
        this.f41575a = i12;
        this.f41576b = i13;
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(Snapshot.WIDTH, (double) G.f((float) this.f41575a));
        createMap.putDouble(Snapshot.HEIGHT, (double) G.f((float) this.f41576b));
        C6496s.e(createMap);
        return createMap;
    }

    public String getEventName() {
        return "topContentSizeChange";
    }

    public c(int i10, int i11, int i12) {
        this(-1, i10, i11, i12);
    }
}
