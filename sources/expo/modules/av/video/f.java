package expo.modules.av.video;

import Kd.b;
import Kd.c;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;

public class f extends TextureView implements TextureView.SurfaceTextureListener {

    /* renamed from: a  reason: collision with root package name */
    private g f60348a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f60349b = false;

    /* renamed from: c  reason: collision with root package name */
    private Surface f60350c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f60351d = true;

    public f(Context context, g gVar) {
        super(context, (AttributeSet) null, 0);
        this.f60348a = gVar;
        setSurfaceTextureListener(this);
    }

    public void a() {
        if (this.f60351d) {
            onVisibilityChanged(this, 4);
            onVisibilityChanged(this, 0);
        }
    }

    public void b(Pair pair, b bVar) {
        Matrix m10;
        int intValue = ((Integer) pair.first).intValue();
        int intValue2 = ((Integer) pair.second).intValue();
        if (intValue != 0 && intValue2 != 0 && (m10 = new c(new Size(getWidth(), getHeight()), new Size(intValue, intValue2)).m(bVar)) != null) {
            Matrix matrix = new Matrix();
            getTransform(matrix);
            if (!m10.equals(matrix)) {
                setTransform(m10);
                invalidate();
            }
        }
    }

    public Surface getSurface() {
        return this.f60350c;
    }

    public boolean isAttachedToWindow() {
        return this.f60349b;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f60349b = true;
        this.f60348a.N(this.f60350c);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f60349b = false;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        Surface surface = new Surface(surfaceTexture);
        this.f60350c = surface;
        this.f60348a.N(surface);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f60350c = null;
        this.f60348a.N((Surface) null);
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i10) {
        boolean z10;
        super.onVisibilityChanged(view, i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f60351d = z10;
    }
}
