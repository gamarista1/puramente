package com.facebook.react.runtime;

import com.facebook.jni.HybridData;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.jni.annotations.DoNotStripAny;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/runtime/JSCInstance;", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "<init>", "()V", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@DoNotStripAny
public final class JSCInstance extends JSRuntimeFactory {
    private static final a Companion = new a((DefaultConstructorMarker) null);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        @DoNotStrip
        public final HybridData initHybrid() {
            return JSCInstance.initHybrid();
        }

        private a() {
        }
    }

    static {
        SoLoader.t("jscinstance");
    }

    public JSCInstance() {
        super(Companion.initHybrid());
    }

    /* access modifiers changed from: private */
    @DoNotStrip
    public static final native HybridData initHybrid();
}
