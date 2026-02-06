package ye;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import expo.modules.splashscreen.SplashScreenOptions;
import kotlin.jvm.internal.C6496s;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f62348a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f62349b = true;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f62350c;

    /* renamed from: d  reason: collision with root package name */
    private static final ReactMarker.MarkerListener f62351d = new a();

    private b() {
    }

    /* access modifiers changed from: private */
    public static final void c(ReactMarkerConstants reactMarkerConstants, String str, int i10) {
        if (reactMarkerConstants == ReactMarkerConstants.CONTENT_APPEARED && !f62350c) {
            f62348a.d();
        }
    }

    public final void d() {
        f62349b = false;
    }

    public final void e(boolean z10) {
        f62350c = z10;
    }

    public final void f(SplashScreenOptions splashScreenOptions) {
        C6496s.h(splashScreenOptions, "options");
        b(splashScreenOptions);
    }

    public final void g() {
        ReactMarker.removeListener(f62351d);
    }

    private final void b(SplashScreenOptions splashScreenOptions) {
    }
}
