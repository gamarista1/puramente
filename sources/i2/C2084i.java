package i2;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* renamed from: i2.i  reason: case insensitive filesystem */
public final class C2084i implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f22102g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a  reason: collision with root package name */
    private final Handler f22103a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f22104b;

    /* renamed from: c  reason: collision with root package name */
    private EGLDisplay f22105c;

    /* renamed from: d  reason: collision with root package name */
    private EGLContext f22106d;

    /* renamed from: e  reason: collision with root package name */
    private EGLSurface f22107e;

    /* renamed from: f  reason: collision with root package name */
    private SurfaceTexture f22108f;

    /* renamed from: i2.i$a */
    public interface a {
    }

    public C2084i(Handler handler) {
        this(handler, (a) null);
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) {
        boolean z10 = true;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f22102g, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (!eglChooseConfig || iArr[0] <= 0 || eGLConfigArr[0] == null) {
            z10 = false;
        }
        C2086k.c(z10, L.F("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    private static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        boolean z10 = true;
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext == null) {
            z10 = false;
        }
        C2086k.c(z10, "eglCreateContext failed");
        return eglCreateContext;
    }

    private static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) {
        EGLSurface eGLSurface;
        boolean z10 = true;
        if (i10 == 1) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eGLSurface == null) {
                z10 = false;
            }
            C2086k.c(z10, "eglCreatePbufferSurface failed");
        }
        C2086k.c(EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext), "eglMakeCurrent failed");
        return eGLSurface;
    }

    private static void e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        C2086k.b();
    }

    private static EGLDisplay f() {
        boolean z10;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2086k.c(z10, "eglGetDisplay failed");
        int[] iArr = new int[2];
        C2086k.c(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eglGetDisplay;
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) C2076a.e(this.f22108f);
    }

    public void h(int i10) {
        EGLDisplay f10 = f();
        this.f22105c = f10;
        EGLConfig a10 = a(f10);
        EGLContext b10 = b(this.f22105c, a10, i10);
        this.f22106d = b10;
        this.f22107e = c(this.f22105c, a10, b10, i10);
        e(this.f22104b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f22104b[0]);
        this.f22108f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public void i() {
        this.f22103a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f22108f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f22104b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f22105c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f22105c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f22107e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f22105c, this.f22107e);
            }
            EGLContext eGLContext = this.f22106d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f22105c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f22105c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f22105c);
            }
            this.f22105c = null;
            this.f22106d = null;
            this.f22107e = null;
            this.f22108f = null;
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f22103a.post(this);
    }

    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.f22108f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public C2084i(Handler handler, a aVar) {
        this.f22103a = handler;
        this.f22104b = new int[1];
    }

    private void d() {
    }
}
