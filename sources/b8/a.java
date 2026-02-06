package B8;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.github.penfeizhou.animation.decode.b;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class a extends Drawable implements Animatable, b.j {

    /* renamed from: l  reason: collision with root package name */
    private static final String f29833l = "a";

    /* renamed from: a  reason: collision with root package name */
    private final Paint f29834a;

    /* renamed from: b  reason: collision with root package name */
    private final com.github.penfeizhou.animation.decode.b f29835b;

    /* renamed from: c  reason: collision with root package name */
    private final DrawFilter f29836c = new PaintFlagsDrawFilter(0, 3);

    /* renamed from: d  reason: collision with root package name */
    private final Matrix f29837d = new Matrix();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Set f29838e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private Bitmap f29839f;

    /* renamed from: g  reason: collision with root package name */
    private final Handler f29840g = new C0499a(Looper.getMainLooper());

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f29841h = new b();

    /* renamed from: i  reason: collision with root package name */
    private boolean f29842i = true;

    /* renamed from: j  reason: collision with root package name */
    private final Set f29843j = new HashSet();

    /* renamed from: k  reason: collision with root package name */
    private boolean f29844k = false;

    /* renamed from: B8.a$a  reason: collision with other inner class name */
    class C0499a extends Handler {
        C0499a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Iterator it = new ArrayList(a.this.f29838e).iterator();
                while (it.hasNext()) {
                    ((F3.a) it.next()).b(a.this);
                }
            } else if (i10 == 2) {
                Iterator it2 = new ArrayList(a.this.f29838e).iterator();
                while (it2.hasNext()) {
                    ((F3.a) it2.next()).a(a.this);
                }
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            a.this.invalidateSelf();
        }
    }

    public a(com.github.penfeizhou.animation.decode.b bVar) {
        Paint paint = new Paint();
        this.f29834a = paint;
        paint.setAntiAlias(true);
        this.f29835b = bVar;
    }

    private void e() {
        ArrayList<WeakReference> arrayList = new ArrayList<>();
        Drawable.Callback callback = getCallback();
        boolean z10 = false;
        for (WeakReference weakReference : new HashSet(this.f29843j)) {
            Drawable.Callback callback2 = (Drawable.Callback) weakReference.get();
            if (callback2 == null) {
                arrayList.add(weakReference);
            } else if (callback2 == callback) {
                z10 = true;
            } else {
                callback2.invalidateDrawable(this);
            }
        }
        for (WeakReference remove : arrayList) {
            this.f29843j.remove(remove);
        }
        if (!z10) {
            this.f29843j.add(new WeakReference(callback));
        }
    }

    private void f() {
        this.f29835b.p(this);
        if (this.f29842i) {
            this.f29835b.P();
        } else if (!this.f29835b.G()) {
            this.f29835b.P();
        }
    }

    private void g() {
        this.f29835b.L(this);
        if (this.f29842i) {
            this.f29835b.R();
        } else {
            this.f29835b.S();
        }
    }

    public void a(ByteBuffer byteBuffer) {
        if (isRunning()) {
            Bitmap bitmap = this.f29839f;
            if (bitmap == null || bitmap.isRecycled()) {
                this.f29839f = Bitmap.createBitmap(this.f29835b.s().width() / this.f29835b.B(), this.f29835b.s().height() / this.f29835b.B(), Bitmap.Config.ARGB_8888);
            }
            byteBuffer.rewind();
            if (byteBuffer.remaining() < this.f29839f.getByteCount()) {
                Log.e(f29833l, "onRender:Buffer not large enough for pixels");
                return;
            }
            this.f29839f.copyPixelsFromBuffer(byteBuffer);
            this.f29840g.post(this.f29841h);
        }
    }

    public void b() {
        Message.obtain(this.f29840g, 2).sendToTarget();
    }

    public int d() {
        int y10 = this.f29835b.y();
        Bitmap bitmap = this.f29839f;
        if (bitmap != null && !bitmap.isRecycled()) {
            y10 += this.f29839f.getAllocationByteCount();
        }
        return Math.max(1, y10);
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f29839f;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.setDrawFilter(this.f29836c);
            canvas.drawBitmap(this.f29839f, this.f29837d, this.f29834a);
        }
    }

    public Drawable.Callback getCallback() {
        return super.getCallback();
    }

    public int getIntrinsicHeight() {
        if (this.f29844k) {
            return -1;
        }
        try {
            return this.f29835b.s().height();
        } catch (Exception unused) {
            return 0;
        }
    }

    public int getIntrinsicWidth() {
        if (this.f29844k) {
            return -1;
        }
        try {
            return this.f29835b.s().width();
        } catch (Exception unused) {
            return 0;
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void h(boolean z10) {
        this.f29842i = z10;
    }

    public void i(boolean z10) {
        this.f29844k = z10;
    }

    public void invalidateSelf() {
        super.invalidateSelf();
        for (WeakReference weakReference : new HashSet(this.f29843j)) {
            Drawable.Callback callback = (Drawable.Callback) weakReference.get();
            if (!(callback == null || callback == getCallback())) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public boolean isRunning() {
        return this.f29835b.G();
    }

    public void onStart() {
        Message.obtain(this.f29840g, 1).sendToTarget();
    }

    public void setAlpha(int i10) {
        this.f29834a.setAlpha(i10);
    }

    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        int B10 = this.f29835b.B();
        int O10 = this.f29835b.O(getBounds().width(), getBounds().height());
        float f10 = (float) O10;
        this.f29837d.setScale(((((float) getBounds().width()) * 1.0f) * f10) / ((float) this.f29835b.s().width()), ((((float) getBounds().height()) * 1.0f) * f10) / ((float) this.f29835b.s().height()));
        if (O10 != B10) {
            this.f29839f = Bitmap.createBitmap(this.f29835b.s().width() / O10, this.f29835b.s().height() / O10, Bitmap.Config.ARGB_8888);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f29834a.setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z10, boolean z11) {
        e();
        if (this.f29842i) {
            if (z10) {
                if (!isRunning()) {
                    f();
                }
            } else if (isRunning()) {
                g();
            }
        }
        return super.setVisible(z10, z11);
    }

    public void start() {
        if (this.f29835b.G()) {
            this.f29835b.R();
        }
        this.f29835b.N();
        f();
    }

    public void stop() {
        g();
    }
}
