package com.facebook.react.runtime.hermes;

import com.facebook.jni.HybridData;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.fabric.ReactNativeConfig;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lcom/facebook/react/runtime/hermes/HermesInstance;", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "Lcom/facebook/react/fabric/ReactNativeConfig;", "reactNativeConfig", "", "allocInOldGenBeforeTTI", "<init>", "(Lcom/facebook/react/fabric/ReactNativeConfig;Z)V", "()V", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HermesInstance extends JSRuntimeFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final a f41314a = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: protected */
        @DoNotStrip
        public final HybridData initHybrid(Object obj, boolean z10) {
            return HermesInstance.initHybrid(obj, z10);
        }

        private a() {
        }
    }

    static {
        SoLoader.t("hermesinstancejni");
    }

    public HermesInstance(ReactNativeConfig reactNativeConfig, boolean z10) {
        super(initHybrid(reactNativeConfig, z10));
    }

    @DoNotStrip
    protected static final native HybridData initHybrid(Object obj, boolean z10);

    public HermesInstance() {
        this((ReactNativeConfig) null, false);
    }
}
