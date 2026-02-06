package com.facebook.hermes.reactexecutor;

import com.facebook.hermes.instrumentation.HermesSamplingProfiler;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;

public class a implements JavaScriptExecutorFactory {

    /* renamed from: a  reason: collision with root package name */
    private boolean f39726a;

    /* renamed from: b  reason: collision with root package name */
    private String f39727b;

    public a() {
        this((N6.a) null);
    }

    public JavaScriptExecutor create() {
        return new HermesExecutor((N6.a) null, this.f39726a, this.f39727b);
    }

    public void startSamplingProfiler() {
        HermesSamplingProfiler.enable();
    }

    public void stopSamplingProfiler(String str) {
        HermesSamplingProfiler.dumpSampledTraceToFile(str);
        HermesSamplingProfiler.disable();
    }

    public String toString() {
        return "JSIExecutor+HermesRuntime";
    }

    public a(N6.a aVar) {
        this.f39726a = true;
        this.f39727b = "";
    }
}
