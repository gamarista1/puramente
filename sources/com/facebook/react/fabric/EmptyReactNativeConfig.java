package com.facebook.react.fabric;

import com.facebook.jni.HybridData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0006\u001a\u00020\u0005H J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH J\u0011\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH J\u0011\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/fabric/EmptyReactNativeConfig;", "Lcom/facebook/react/fabric/ReactNativeConfig;", "<init>", "()V", "mHybridData", "Lcom/facebook/jni/HybridData;", "initHybrid", "getBool", "", "param", "", "getInt64", "", "getString", "getDouble", "", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EmptyReactNativeConfig implements ReactNativeConfig {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final HybridData mHybridData = initHybrid();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/fabric/EmptyReactNativeConfig$Companion;", "", "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        FabricSoLoader.staticInit();
    }

    private final native HybridData initHybrid();

    public native boolean getBool(String str);

    public native double getDouble(String str);

    public native long getInt64(String str);

    public native String getString(String str);
}
