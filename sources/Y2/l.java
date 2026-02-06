package y2;

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
import i2.C2076a;
import i2.C2086k;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import x2.o;
import y2.d;
import y2.m;

public final class l extends GLSurfaceView {

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArrayList f28692a;

    /* renamed from: b  reason: collision with root package name */
    private final SensorManager f28693b;

    /* renamed from: c  reason: collision with root package name */
    private final Sensor f28694c;

    /* renamed from: d  reason: collision with root package name */
    private final d f28695d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f28696e;

    /* renamed from: f  reason: collision with root package name */
    private final m f28697f;

    /* renamed from: g  reason: collision with root package name */
    private final i f28698g;

    /* renamed from: h  reason: collision with root package name */
    private SurfaceTexture f28699h;

    /* renamed from: i  reason: collision with root package name */
    private Surface f28700i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f28701j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f28702k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f28703l;

    final class a implements GLSurfaceView.Renderer, m.a, d.a {

        /* renamed from: a  reason: collision with root package name */
        private final i f28704a;

        /* renamed from: b  reason: collision with root package name */
        private final float[] f28705b = new float[16];

        /* renamed from: c  reason: collision with root package name */
        private final float[] f28706c = new float[16];

        /* renamed from: d  reason: collision with root package name */
        private final float[] f28707d;

        /* renamed from: e  reason: collision with root package name */
        private final float[] f28708e;

        /* renamed from: f  reason: collision with root package name */
        private final float[] f28709f;

        /* renamed from: g  reason: collision with root package name */
        private float f28710g;

        /* renamed from: h  reason: collision with root package name */
        private float f28711h;

        /* renamed from: i  reason: collision with root package name */
        private final float[] f28712i;

        /* renamed from: j  reason: collision with root package name */
        private final float[] f28713j;

        public a(i iVar) {
            float[] fArr = new float[16];
            this.f28707d = fArr;
            float[] fArr2 = new float[16];
            this.f28708e = fArr2;
            float[] fArr3 = new float[16];
            this.f28709f = fArr3;
            this.f28712i = new float[16];
            this.f28713j = new float[16];
            this.f28704a = iVar;
            C2086k.k(fArr);
            C2086k.k(fArr2);
            C2086k.k(fArr3);
            this.f28711h = 3.1415927f;
        }

        private float c(float f10) {
            if (f10 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f10))) * 2.0d);
            }
            return 90.0f;
        }

        private void d() {
            Matrix.setRotateM(this.f28708e, 0, -this.f28710g, (float) Math.cos((double) this.f28711h), (float) Math.sin((double) this.f28711h), 0.0f);
        }

        public synchronized void a(float[] fArr, float f10) {
            float[] fArr2 = this.f28707d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f28711h = -f10;
            d();
        }

        public synchronized void b(PointF pointF) {
            this.f28710g = pointF.y;
            d();
            Matrix.setRotateM(this.f28709f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f28713j, 0, this.f28707d, 0, this.f28709f, 0);
                Matrix.multiplyMM(this.f28712i, 0, this.f28708e, 0, this.f28713j, 0);
            }
            Matrix.multiplyMM(this.f28706c, 0, this.f28705b, 0, this.f28712i, 0);
            this.f28704a.d(this.f28706c, false);
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return l.this.performClick();
        }

        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = ((float) i10) / ((float) i11);
            Matrix.perspectiveM(this.f28705b, 0, c(f10), f10, 0.1f, 100.0f);
        }

        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            l.this.g(this.f28704a.e());
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
    public /* synthetic */ void e() {
        Surface surface = this.f28700i;
        if (surface != null) {
            Iterator it = this.f28692a.iterator();
            while (it.hasNext()) {
                ((b) it.next()).t(surface);
            }
        }
        h(this.f28699h, surface);
        this.f28699h = null;
        this.f28700i = null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f28699h;
        Surface surface = this.f28700i;
        Surface surface2 = new Surface(surfaceTexture);
        this.f28699h = surfaceTexture;
        this.f28700i = surface2;
        Iterator it = this.f28692a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).v(surface2);
        }
        h(surfaceTexture2, surface);
    }

    /* access modifiers changed from: private */
    public void g(SurfaceTexture surfaceTexture) {
        this.f28696e.post(new k(this, surfaceTexture));
    }

    private static void h(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private void j() {
        boolean z10;
        if (!this.f28701j || !this.f28702k) {
            z10 = false;
        } else {
            z10 = true;
        }
        Sensor sensor = this.f28694c;
        if (sensor != null && z10 != this.f28703l) {
            if (z10) {
                this.f28693b.registerListener(this.f28695d, sensor, 0);
            } else {
                this.f28693b.unregisterListener(this.f28695d);
            }
            this.f28703l = z10;
        }
    }

    public void d(b bVar) {
        this.f28692a.add(bVar);
    }

    public C2935a getCameraMotionListener() {
        return this.f28698g;
    }

    public o getVideoFrameMetadataListener() {
        return this.f28698g;
    }

    public Surface getVideoSurface() {
        return this.f28700i;
    }

    public void i(b bVar) {
        this.f28692a.remove(bVar);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28696e.post(new j(this));
    }

    public void onPause() {
        this.f28702k = false;
        j();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f28702k = true;
        j();
    }

    public void setDefaultStereoMode(int i10) {
        this.f28698g.h(i10);
    }

    public void setUseSensorRotation(boolean z10) {
        this.f28701j = z10;
        j();
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28692a = new CopyOnWriteArrayList();
        this.f28696e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) C2076a.e(context.getSystemService("sensor"));
        this.f28693b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f28694c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f28698g = iVar;
        a aVar = new a(iVar);
        m mVar = new m(context, aVar, 25.0f);
        this.f28697f = mVar;
        this.f28695d = new d(((WindowManager) C2076a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), mVar, aVar);
        this.f28701j = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(mVar);
    }
}
