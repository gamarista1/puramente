package la;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import ja.C3645a;
import ja.C3658n;
import ja.H;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import k9.C3717q0;
import ka.j;

final class i implements j, a {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f46409a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f46410b = new AtomicBoolean(true);

    /* renamed from: c  reason: collision with root package name */
    private final g f46411c = new g();

    /* renamed from: d  reason: collision with root package name */
    private final c f46412d = new c();

    /* renamed from: e  reason: collision with root package name */
    private final H f46413e = new H();

    /* renamed from: f  reason: collision with root package name */
    private final H f46414f = new H();

    /* renamed from: g  reason: collision with root package name */
    private final float[] f46415g = new float[16];

    /* renamed from: h  reason: collision with root package name */
    private final float[] f46416h = new float[16];

    /* renamed from: i  reason: collision with root package name */
    private int f46417i;

    /* renamed from: j  reason: collision with root package name */
    private SurfaceTexture f46418j;

    /* renamed from: k  reason: collision with root package name */
    private volatile int f46419k = 0;

    /* renamed from: l  reason: collision with root package name */
    private int f46420l = -1;

    /* renamed from: m  reason: collision with root package name */
    private byte[] f46421m;

    /* access modifiers changed from: private */
    public /* synthetic */ void g(SurfaceTexture surfaceTexture) {
        this.f46409a.set(true);
    }

    private void i(byte[] bArr, int i10, long j10) {
        e eVar;
        byte[] bArr2 = this.f46421m;
        int i11 = this.f46420l;
        this.f46421m = bArr;
        if (i10 == -1) {
            i10 = this.f46419k;
        }
        this.f46420l = i10;
        if (i11 != i10 || !Arrays.equals(bArr2, this.f46421m)) {
            byte[] bArr3 = this.f46421m;
            if (bArr3 != null) {
                eVar = f.a(bArr3, this.f46420l);
            } else {
                eVar = null;
            }
            if (eVar == null || !g.c(eVar)) {
                eVar = e.b(this.f46420l);
            }
            this.f46414f.a(j10, eVar);
        }
    }

    public void a(long j10, float[] fArr) {
        this.f46412d.e(j10, fArr);
    }

    public void c() {
        this.f46413e.c();
        this.f46412d.d();
        this.f46410b.set(true);
    }

    public void d(float[] fArr, boolean z10) {
        GLES20.glClear(16384);
        C3658n.c();
        if (this.f46409a.compareAndSet(true, false)) {
            ((SurfaceTexture) C3645a.e(this.f46418j)).updateTexImage();
            C3658n.c();
            if (this.f46410b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f46415g, 0);
            }
            long timestamp = this.f46418j.getTimestamp();
            Long l10 = (Long) this.f46413e.g(timestamp);
            if (l10 != null) {
                this.f46412d.c(this.f46415g, l10.longValue());
            }
            e eVar = (e) this.f46414f.j(timestamp);
            if (eVar != null) {
                this.f46411c.d(eVar);
            }
        }
        Matrix.multiplyMM(this.f46416h, 0, fArr, 0, this.f46415g, 0);
        this.f46411c.a(this.f46417i, this.f46416h, z10);
    }

    public SurfaceTexture e() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        C3658n.c();
        this.f46411c.b();
        C3658n.c();
        this.f46417i = C3658n.f();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f46417i);
        this.f46418j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new h(this));
        return this.f46418j;
    }

    public void f(long j10, long j11, C3717q0 q0Var, MediaFormat mediaFormat) {
        this.f46413e.a(j11, Long.valueOf(j10));
        i(q0Var.f45780v, q0Var.f45781w, j11);
    }

    public void h(int i10) {
        this.f46419k = i10;
    }
}
