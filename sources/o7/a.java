package O7;

import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.jscexecutor.JSCExecutor;
import kotlin.jvm.internal.C6496s;

public final class a implements JavaScriptExecutorFactory {

    /* renamed from: a  reason: collision with root package name */
    private final String f33396a;

    /* renamed from: b  reason: collision with root package name */
    private final String f33397b;

    public a(String str, String str2) {
        C6496s.h(str, "appName");
        C6496s.h(str2, "deviceName");
        this.f33396a = str;
        this.f33397b = str2;
    }

    public JavaScriptExecutor create() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("OwnerIdentity", "ReactNative");
        writableNativeMap.putString("AppIdentity", this.f33396a);
        writableNativeMap.putString("DeviceIdentity", this.f33397b);
        return new JSCExecutor(writableNativeMap);
    }

    public void startSamplingProfiler() {
        throw new UnsupportedOperationException("Starting sampling profiler not supported on " + this);
    }

    public void stopSamplingProfiler(String str) {
        C6496s.h(str, "filename");
        throw new UnsupportedOperationException("Stopping sampling profiler not supported on " + this);
    }

    public String toString() {
        return "JSIExecutor+JSCRuntime";
    }
}
