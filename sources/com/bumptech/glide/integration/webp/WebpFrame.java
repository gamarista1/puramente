package com.bumptech.glide.integration.webp;

import android.graphics.Bitmap;
import androidx.annotation.Keep;

@Keep
public class WebpFrame {
    static final int FRAME_DURATION_MS_FOR_MIN = 100;
    static final int MIN_FRAME_DURATION_MS = 11;
    boolean blendPreviousFrame;
    int delay;
    boolean disposeBackgroundColor;

    /* renamed from: ih  reason: collision with root package name */
    int f39066ih;
    int iw;
    int ix;
    int iy;
    @Keep
    private long mNativePtr;

    WebpFrame(long j10, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11) {
        this.mNativePtr = j10;
        this.ix = i10;
        this.iy = i11;
        this.iw = i12;
        this.f39066ih = i13;
        this.delay = i14;
        this.blendPreviousFrame = z10;
        this.disposeBackgroundColor = z11;
        fixFrameDuration();
    }

    private void fixFrameDuration() {
        if (this.delay < 11) {
            this.delay = 100;
        }
    }

    private native void nativeDispose();

    private native void nativeFinalize();

    private native void nativeRenderFrame(int i10, int i11, Bitmap bitmap);

    public void dispose() {
        nativeDispose();
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        nativeFinalize();
    }

    public int getDurationMs() {
        return this.delay;
    }

    public int getHeight() {
        return this.f39066ih;
    }

    public int getWidth() {
        return this.iw;
    }

    public int getXOffest() {
        return this.ix;
    }

    public int getYOffest() {
        return this.iy;
    }

    public boolean isBlendWithPreviousFrame() {
        return this.blendPreviousFrame;
    }

    public void renderFrame(int i10, int i11, Bitmap bitmap) {
        nativeRenderFrame(i10, i11, bitmap);
    }

    public boolean shouldDisposeToBackgroundColor() {
        return this.disposeBackgroundColor;
    }
}
