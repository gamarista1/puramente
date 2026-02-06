package io.intercom.android.sdk.lightcompressor.video;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0003J\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/lightcompressor/video/OutputSurface;", "Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;", "<init>", "()V", "Llf/M;", "setup", "release", "Landroid/view/Surface;", "getSurface", "()Landroid/view/Surface;", "awaitNewImage", "drawImage", "Landroid/graphics/SurfaceTexture;", "p0", "onFrameAvailable", "(Landroid/graphics/SurfaceTexture;)V", "mSurfaceTexture", "Landroid/graphics/SurfaceTexture;", "mSurface", "Landroid/view/Surface;", "Ljava/lang/Object;", "mFrameSyncObject", "Ljava/lang/Object;", "", "mFrameAvailable", "Z", "Lio/intercom/android/sdk/lightcompressor/video/TextureRenderer;", "mTextureRender", "Lio/intercom/android/sdk/lightcompressor/video/TextureRenderer;", "intercom-sdk-lightcompressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OutputSurface implements SurfaceTexture.OnFrameAvailableListener {
    private boolean mFrameAvailable;
    private final Object mFrameSyncObject = new Object();
    private Surface mSurface;
    private SurfaceTexture mSurfaceTexture;
    private TextureRenderer mTextureRender;

    public OutputSurface() {
        setup();
    }

    private final void setup() {
        TextureRenderer textureRenderer = new TextureRenderer();
        this.mTextureRender = textureRenderer;
        textureRenderer.surfaceCreated();
        SurfaceTexture surfaceTexture = new SurfaceTexture(textureRenderer.getTextureId());
        this.mSurfaceTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.mSurface = new Surface(this.mSurfaceTexture);
    }

    public final void awaitNewImage() {
        synchronized (this.mFrameSyncObject) {
            while (!this.mFrameAvailable) {
                try {
                    this.mFrameSyncObject.wait((long) 100);
                    if (!this.mFrameAvailable) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e10) {
                    throw new RuntimeException(e10);
                }
            }
            this.mFrameAvailable = false;
            C6514M m10 = C6514M.f71813a;
        }
        TextureRenderer textureRenderer = this.mTextureRender;
        if (textureRenderer != null) {
            textureRenderer.checkGlError("before updateTexImage");
        }
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }

    public final void drawImage() {
        TextureRenderer textureRenderer = this.mTextureRender;
        if (textureRenderer != null) {
            SurfaceTexture surfaceTexture = this.mSurfaceTexture;
            C6496s.e(surfaceTexture);
            textureRenderer.drawFrame(surfaceTexture);
        }
    }

    public final Surface getSurface() {
        return this.mSurface;
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.mFrameSyncObject) {
            if (!this.mFrameAvailable) {
                this.mFrameAvailable = true;
                this.mFrameSyncObject.notifyAll();
                C6514M m10 = C6514M.f71813a;
            } else {
                throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
            }
        }
    }

    public final void release() {
        Surface surface = this.mSurface;
        if (surface != null) {
            surface.release();
        }
        this.mTextureRender = null;
        this.mSurface = null;
        this.mSurfaceTexture = null;
    }
}
