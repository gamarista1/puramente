package ja;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* renamed from: ja.j  reason: case insensitive filesystem */
public final class C3654j implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f45010g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a  reason: collision with root package name */
    private final Handler f45011a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f45012b;

    /* renamed from: c  reason: collision with root package name */
    private EGLDisplay f45013c;

    /* renamed from: d  reason: collision with root package name */
    private EGLContext f45014d;

    /* renamed from: e  reason: collision with root package name */
    private EGLSurface f45015e;

    /* renamed from: f  reason: collision with root package name */
    private SurfaceTexture f45016f;

    /* renamed from: ja.j$b */
    public static final class b extends RuntimeException {
        private b(String str) {
            super(str);
        }
    }

    /* renamed from: ja.j$c */
    public interface c {
    }

    public C3654j(Handler handler) {
        this(handler, (c) null);
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f45010g, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (eglChooseConfig && iArr[0] > 0 && (eGLConfig = eGLConfigArr[0]) != null) {
            return eGLConfig;
        }
        throw new b(M.C("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
    }

    private static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new b("eglCreateContext failed");
    }

    private static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) {
        EGLSurface eGLSurface;
        if (i10 == 1) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eGLSurface == null) {
                throw new b("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            return eGLSurface;
        }
        throw new b("eglMakeCurrent failed");
    }

    private static void e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        C3658n.c();
    }

    private static EGLDisplay f() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new b("eglInitialize failed");
        }
        throw new b("eglGetDisplay failed");
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) C3645a.e(this.f45016f);
    }

    public void h(int i10) {
        EGLDisplay f10 = f();
        this.f45013c = f10;
        EGLConfig a10 = a(f10);
        EGLContext b10 = b(this.f45013c, a10, i10);
        this.f45014d = b10;
        this.f45015e = c(this.f45013c, a10, b10, i10);
        e(this.f45012b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f45012b[0]);
        this.f45016f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public void i() {
        this.f45011a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f45016f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f45012b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f45013c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f45013c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f45015e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f45013c, this.f45015e);
            }
            EGLContext eGLContext = this.f45014d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f45013c, eGLContext);
            }
            if (M.f44981a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f45013c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f45013c);
            }
            this.f45013c = null;
            this.f45014d = null;
            this.f45015e = null;
            this.f45016f = null;
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f45011a.post(this);
    }

    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.f45016f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public C3654j(Handler handler, c cVar) {
        this.f45011a = handler;
        this.f45012b = new int[1];
    }

    private void d() {
    }
}
