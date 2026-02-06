package com.facebook.hermes.reactexecutor;

import N6.a;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.soloader.SoLoader;

public class HermesExecutor extends JavaScriptExecutor {

    /* renamed from: a  reason: collision with root package name */
    private static String f39725a;

    static {
        a();
    }

    HermesExecutor(a aVar, boolean z10, String str) {
        super(initHybridDefaultConfig(z10, str));
    }

    public static void a() {
        String str;
        if (f39725a == null) {
            SoLoader.t("hermes");
            SoLoader.t("hermes_executor");
            if (E7.a.f30669b) {
                str = "Debug";
            } else {
                str = "Release";
            }
            f39725a = str;
        }
    }

    private static native HybridData initHybrid(boolean z10, String str, long j10);

    private static native HybridData initHybridDefaultConfig(boolean z10, String str);

    public String getName() {
        return "HermesExecutor" + f39725a;
    }
}
