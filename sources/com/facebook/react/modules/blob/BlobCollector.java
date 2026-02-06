package com.facebook.react.modules.blob;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactContext;
import com.facebook.soloader.SoLoader;

abstract class BlobCollector {

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReactContext f40962a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BlobModule f40963b;

        a(ReactContext reactContext, BlobModule blobModule) {
            this.f40962a = reactContext;
            this.f40963b = blobModule;
        }

        public void run() {
            JavaScriptContextHolder javaScriptContextHolder = this.f40962a.getJavaScriptContextHolder();
            if (javaScriptContextHolder != null && javaScriptContextHolder.get() != 0) {
                BlobCollector.nativeInstall(this.f40963b, javaScriptContextHolder.get());
            }
        }
    }

    static {
        SoLoader.t("reactnativeblob");
    }

    static void b(ReactContext reactContext, BlobModule blobModule) {
        reactContext.runOnJSQueueThread(new a(reactContext, blobModule));
    }

    /* access modifiers changed from: private */
    public static native void nativeInstall(Object obj, long j10);
}
