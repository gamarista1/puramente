package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.G;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.O;

public abstract class q {
    public static final Map a(a aVar) {
        C6496s.h(aVar, "insets");
        return O.l(C6502A.a(VerticalAlignment.TOP, Float.valueOf(G.f(aVar.d()))), C6502A.a(BlockAlignment.RIGHT, Float.valueOf(G.f(aVar.c()))), C6502A.a(VerticalAlignment.BOTTOM, Float.valueOf(G.f(aVar.a()))), C6502A.a(BlockAlignment.LEFT, Float.valueOf(G.f(aVar.b()))));
    }

    public static final WritableMap b(a aVar) {
        C6496s.h(aVar, "insets");
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(VerticalAlignment.TOP, (double) G.f(aVar.d()));
        createMap.putDouble(BlockAlignment.RIGHT, (double) G.f(aVar.c()));
        createMap.putDouble(VerticalAlignment.BOTTOM, (double) G.f(aVar.a()));
        createMap.putDouble(BlockAlignment.LEFT, (double) G.f(aVar.b()));
        C6496s.e(createMap);
        return createMap;
    }

    public static final Map c(c cVar) {
        C6496s.h(cVar, "rect");
        return O.l(C6502A.a("x", Float.valueOf(G.f(cVar.c()))), C6502A.a("y", Float.valueOf(G.f(cVar.d()))), C6502A.a(Snapshot.WIDTH, Float.valueOf(G.f(cVar.b()))), C6502A.a(Snapshot.HEIGHT, Float.valueOf(G.f(cVar.a()))));
    }

    public static final WritableMap d(c cVar) {
        C6496s.h(cVar, "rect");
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("x", (double) G.f(cVar.c()));
        createMap.putDouble("y", (double) G.f(cVar.d()));
        createMap.putDouble(Snapshot.WIDTH, (double) G.f(cVar.b()));
        createMap.putDouble(Snapshot.HEIGHT, (double) G.f(cVar.a()));
        C6496s.e(createMap);
        return createMap;
    }
}
