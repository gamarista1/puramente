package F7;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.soloader.SoLoader;
import z8.C4236a;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f30798a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f30799b;

    private a() {
    }

    public static final void a() {
        if (!f30799b) {
            f30799b = true;
            C4236a.c(0, "ReadableMapBufferSoLoader.staticInit::load:mapbufferjni");
            ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_MAPBUFFER_SO_FILE_START);
            SoLoader.t("mapbufferjni");
            ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_MAPBUFFER_SO_FILE_END);
            C4236a.i(0);
        }
    }
}
