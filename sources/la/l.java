package la;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import ja.C3645a;
import ja.M;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import ka.j;
import la.d;
import la.m;

public final class l extends GLSurfaceView {

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArrayList f46425a;

    /* renamed from: b  reason: collision with root package name */
    private final SensorManager f46426b;

    /* renamed from: c  reason: collision with root package name */
    private final Sensor f46427c;

    /* renamed from: d  reason: collision with root package name */
    private final d f46428d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f46429e;

    /* renamed from: f  reason: collision with root package name */
    private final m f46430f;

    /* renamed from: g  reason: collision with root package name */
    private final i f46431g;

    /* renamed from: h  reason: collision with root package name */
    private SurfaceTexture f46432h;

    /* renamed from: i  reason: collision with root package name */
    private Surface f46433i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f46434j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f46435k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f46436l;

    final class a implements GLSurfaceView.Renderer, m.a, d.a {

        /* renamed from: a  reason: collision with root package name */
        private final i f46437a;

        /* renamed from: b  reason: collision with root package name */
        private final float[] f46438b = new float[16];

        /* renamed from: c  reason: collision with root package name */
        private final float[] f46439c = new float[16];

        /* renamed from: d  reason: collision with root package name */
        private final float[] f46440d;

        /* renamed from: e  reason: collision with root package name */
        private final float[] f46441e;

        /* renamed from: f  reason: collision with root package name */
        private final float[] f46442f;

        /* renamed from: g  reason: collision with root package name */
        private float f46443g;

        /* renamed from: h  reason: collision with root package name */
        private float f46444h;

        /* renamed from: i  reason: collision with root package name */
        private final float[] f46445i;

        /* renamed from: j  reason: collision with root package name */
        private final float[] f46446j;

        public a(i iVar) {
            float[] fArr = new float[16];
            this.f46440d = fArr;
            float[] fArr2 = new float[16];
            this.f46441e = fArr2;
            float[] fArr3 = new float[16];
            this.f46442f = fArr3;
            this.f46445i = new float[16];
            this.f46446j = new float[16];
            this.f46437a = iVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f46444h = 3.1415927f;
        }

        private float c(float f10) {
            if (f10 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f10))) * 2.0d);
            }
            return 90.0f;
        }

        private void d() {
            Matrix.setRotateM(this.f46441e, 0, -this.f46443g, (float) Math.cos((double) this.f46444h), (float) Math.sin((double) this.f46444h), 0.0f);
        }

        public synchronized void a(float[] fArr, float f10) {
            float[] fArr2 = this.f46440d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f46444h = -f10;
            d();
        }

        public synchronized void b(PointF pointF) {
            this.f46443g = pointF.y;
            d();
            Matrix.setRotateM(this.f46442f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f46446j, 0, this.f46440d, 0, this.f46442f, 0);
                Matrix.multiplyMM(this.f46445i, 0, this.f46441e, 0, this.f46446j, 0);
            }
            Matrix.multiplyMM(this.f46439c, 0, this.f46438b, 0, this.f46445i, 0);
            this.f46437a.d(this.f46439c, false);
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return l.this.performClick();
        }

        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = ((float) i10) / ((float) i11);
            Matrix.perspectiveM(this.f46438b, 0, c(f10), f10, 0.1f, 100.0f);
        }

        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            l.this.f(this.f46437a.e());
        }
    }

    public interface b {
        void t(Surface surface);

        void v(Surface surface);
    }

    public l(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        Surface surface = this.f46433i;
        if (surface != null) {
            Iterator it = this.f46425a.iterator();
            while (it.hasNext()) {
                ((b) it.next()).t(surface);
            }
        }
        g(this.f46432h, surface);
        this.f46432h = null;
        this.f46433i = null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f46432h;
        Surface surface = this.f46433i;
        Surface surface2 = new Surface(surfaceTexture);
        this.f46432h = surfaceTexture;
        this.f46433i = surface2;
        Iterator it = this.f46425a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).v(surface2);
        }
        g(surfaceTexture2, surface);
    }

    /* access modifiers changed from: private */
    public void f(SurfaceTexture surfaceTexture) {
        this.f46429e.post(new j(this, surfaceTexture));
    }

    private static void g(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private void i() {
        boolean z10;
        if (!this.f46434j || !this.f46435k) {
            z10 = false;
        } else {
            z10 = true;
        }
        Sensor sensor = this.f46427c;
        if (sensor != null && z10 != this.f46436l) {
            if (z10) {
                this.f46426b.registerListener(this.f46428d, sensor, 0);
            } else {
                this.f46426b.unregisterListener(this.f46428d);
            }
            this.f46436l = z10;
        }
    }

    public a getCameraMotionListener() {
        return this.f46431g;
    }

    public j getVideoFrameMetadataListener() {
        return this.f46431g;
    }

    public Surface getVideoSurface() {
        return this.f46433i;
    }

    public void h(b bVar) {
        this.f46425a.remove(bVar);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46429e.post(new k(this));
    }

    public void onPause() {
        this.f46435k = false;
        i();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f46435k = true;
        i();
    }

    public void setDefaultStereoMode(int i10) {
        this.f46431g.h(i10);
    }

    public void setUseSensorRotation(boolean z10) {
        this.f46434j = z10;
        i();
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46425a = new CopyOnWriteArrayList();
        this.f46429e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) C3645a.e(context.getSystemService("sensor"));
        this.f46426b = sensorManager;
        Sensor defaultSensor = M.f44981a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f46427c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f46431g = iVar;
        a aVar = new a(iVar);
        m mVar = new m(context, aVar, 25.0f);
        this.f46430f = mVar;
        this.f46428d = new d(((WindowManager) C3645a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), mVar, aVar);
        this.f46434j = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(mVar);
    }
}
