package y2;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import f2.s;
import i2.C2076a;
import i2.C2086k;
import i2.F;
import i2.p;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import x2.o;

final class i implements o, C2935a {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f28676a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f28677b = new AtomicBoolean(true);

    /* renamed from: c  reason: collision with root package name */
    private final g f28678c = new g();

    /* renamed from: d  reason: collision with root package name */
    private final c f28679d = new c();

    /* renamed from: e  reason: collision with root package name */
    private final F f28680e = new F();

    /* renamed from: f  reason: collision with root package name */
    private final F f28681f = new F();

    /* renamed from: g  reason: collision with root package name */
    private final float[] f28682g = new float[16];

    /* renamed from: h  reason: collision with root package name */
    private final float[] f28683h = new float[16];

    /* renamed from: i  reason: collision with root package name */
    private int f28684i;

    /* renamed from: j  reason: collision with root package name */
    private SurfaceTexture f28685j;

    /* renamed from: k  reason: collision with root package name */
    private volatile int f28686k = 0;

    /* renamed from: l  reason: collision with root package name */
    private int f28687l = -1;

    /* renamed from: m  reason: collision with root package name */
    private byte[] f28688m;

    /* access modifiers changed from: private */
    public /* synthetic */ void g(SurfaceTexture surfaceTexture) {
        this.f28676a.set(true);
    }

    private void i(byte[] bArr, int i10, long j10) {
        e eVar;
        byte[] bArr2 = this.f28688m;
        int i11 = this.f28687l;
        this.f28688m = bArr;
        if (i10 == -1) {
            i10 = this.f28686k;
        }
        this.f28687l = i10;
        if (i11 != i10 || !Arrays.equals(bArr2, this.f28688m)) {
            byte[] bArr3 = this.f28688m;
            if (bArr3 != null) {
                eVar = f.a(bArr3, this.f28687l);
            } else {
                eVar = null;
            }
            if (eVar == null || !g.c(eVar)) {
                eVar = e.b(this.f28687l);
            }
            this.f28681f.a(j10, eVar);
        }
    }

    public void a(long j10, float[] fArr) {
        this.f28679d.e(j10, fArr);
    }

    public void c() {
        this.f28680e.c();
        this.f28679d.d();
        this.f28677b.set(true);
    }

    public void d(float[] fArr, boolean z10) {
        GLES20.glClear(16384);
        try {
            C2086k.b();
        } catch (C2086k.a e10) {
            p.d("SceneRenderer", "Failed to draw a frame", e10);
        }
        if (this.f28676a.compareAndSet(true, false)) {
            ((SurfaceTexture) C2076a.e(this.f28685j)).updateTexImage();
            try {
                C2086k.b();
            } catch (C2086k.a e11) {
                p.d("SceneRenderer", "Failed to draw a frame", e11);
            }
            if (this.f28677b.compareAndSet(true, false)) {
                C2086k.k(this.f28682g);
            }
            long timestamp = this.f28685j.getTimestamp();
            Long l10 = (Long) this.f28680e.g(timestamp);
            if (l10 != null) {
                this.f28679d.c(this.f28682g, l10.longValue());
            }
            e eVar = (e) this.f28681f.j(timestamp);
            if (eVar != null) {
                this.f28678c.d(eVar);
            }
        }
        Matrix.multiplyMM(this.f28683h, 0, fArr, 0, this.f28682g, 0);
        this.f28678c.a(this.f28684i, this.f28683h, z10);
    }

    public SurfaceTexture e() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            C2086k.b();
            this.f28678c.b();
            C2086k.b();
            this.f28684i = C2086k.f();
        } catch (C2086k.a e10) {
            p.d("SceneRenderer", "Failed to initialize the renderer", e10);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f28684i);
        this.f28685j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new h(this));
        return this.f28685j;
    }

    public void f(long j10, long j11, s sVar, MediaFormat mediaFormat) {
        this.f28680e.a(j11, Long.valueOf(j10));
        i(sVar.f20094y, sVar.f20095z, j11);
    }

    public void h(int i10) {
        this.f28686k = i10;
    }
}
