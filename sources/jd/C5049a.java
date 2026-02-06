package jd;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.oblador.performance.PerformanceModule;

/* renamed from: jd.a  reason: case insensitive filesystem */
public final /* synthetic */ class C5049a implements ReactMarker.MarkerListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PerformanceModule f60856a;

    public /* synthetic */ C5049a(PerformanceModule performanceModule) {
        this.f60856a = performanceModule;
    }

    public final void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i10) {
        this.f60856a.lambda$setupMarkerListener$1(reactMarkerConstants, str, i10);
    }
}
