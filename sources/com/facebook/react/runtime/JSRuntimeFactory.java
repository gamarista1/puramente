package com.facebook.react.runtime;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class JSRuntimeFactory {
    private static final a Companion = new a((DefaultConstructorMarker) null);
    private final HybridData mHybridData;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        SoLoader.t("rninstance");
    }

    public JSRuntimeFactory(HybridData hybridData) {
        C6496s.h(hybridData, "mHybridData");
        this.mHybridData = hybridData;
    }
}
