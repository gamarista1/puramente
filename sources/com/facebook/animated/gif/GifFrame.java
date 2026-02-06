package com.facebook.animated.gif;

import P6.d;
import android.graphics.Bitmap;

public class GifFrame implements d {
    @T5.d
    private long mNativeContext;

    @T5.d
    GifFrame(long j10) {
        this.mNativeContext = j10;
    }

    @T5.d
    private native void nativeDispose();

    @T5.d
    private native void nativeFinalize();

    @T5.d
    private native int nativeGetDisposalMode();

    @T5.d
    private native int nativeGetDurationMs();

    @T5.d
    private native int nativeGetHeight();

    @T5.d
    private native int nativeGetTransparentPixelColor();

    @T5.d
    private native int nativeGetWidth();

    @T5.d
    private native int nativeGetXOffset();

    @T5.d
    private native int nativeGetYOffset();

    @T5.d
    private native boolean nativeHasTransparency();

    @T5.d
    private native void nativeRenderFrame(int i10, int i11, Bitmap bitmap);

    public void a(int i10, int i11, Bitmap bitmap) {
        nativeRenderFrame(i10, i11, bitmap);
    }

    public int b() {
        return nativeGetXOffset();
    }

    public int c() {
        return nativeGetYOffset();
    }

    public int d() {
        return nativeGetHeight();
    }

    public void dispose() {
        nativeDispose();
    }

    public int e() {
        return nativeGetWidth();
    }

    public int f() {
        return nativeGetDisposalMode();
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        nativeFinalize();
    }
}
