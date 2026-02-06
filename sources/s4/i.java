package S4;

import P4.a;
import P4.c;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.LruCache;
import com.bumptech.glide.integration.webp.WebpFrame;
import com.bumptech.glide.integration.webp.WebpImage;
import java.nio.ByteBuffer;

public class i implements P4.a {

    /* renamed from: a  reason: collision with root package name */
    private ByteBuffer f33861a;

    /* renamed from: b  reason: collision with root package name */
    private WebpImage f33862b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final a.C0546a f33863c;

    /* renamed from: d  reason: collision with root package name */
    private int f33864d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f33865e;

    /* renamed from: f  reason: collision with root package name */
    private final com.bumptech.glide.integration.webp.a[] f33866f;

    /* renamed from: g  reason: collision with root package name */
    private int f33867g;

    /* renamed from: h  reason: collision with root package name */
    private int f33868h;

    /* renamed from: i  reason: collision with root package name */
    private int f33869i;

    /* renamed from: j  reason: collision with root package name */
    private final Paint f33870j;

    /* renamed from: k  reason: collision with root package name */
    private n f33871k;

    /* renamed from: l  reason: collision with root package name */
    private Bitmap.Config f33872l;

    /* renamed from: m  reason: collision with root package name */
    private final LruCache f33873m;

    class a extends LruCache {
        a(int i10) {
            super(i10);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void entryRemoved(boolean z10, Integer num, Bitmap bitmap, Bitmap bitmap2) {
            if (bitmap != null) {
                i.this.f33863c.a(bitmap);
            }
        }
    }

    public i(a.C0546a aVar, WebpImage webpImage, ByteBuffer byteBuffer, int i10) {
        this(aVar, webpImage, byteBuffer, i10, n.f33896c);
    }

    private void j(int i10, Bitmap bitmap) {
        this.f33873m.remove(Integer.valueOf(i10));
        Bitmap c10 = this.f33863c.c(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        c10.eraseColor(0);
        c10.setDensity(bitmap.getDensity());
        Canvas canvas = new Canvas(c10);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        this.f33873m.put(Integer.valueOf(i10), c10);
    }

    private void k(Canvas canvas, com.bumptech.glide.integration.webp.a aVar) {
        int i10 = aVar.f39068b;
        int i11 = this.f33867g;
        int i12 = aVar.f39069c;
        Canvas canvas2 = canvas;
        canvas2.drawRect((float) (i10 / i11), (float) (i12 / i11), (float) ((i10 + aVar.f39070d) / i11), (float) ((i12 + aVar.f39071e) / i11), this.f33870j);
    }

    private boolean o(com.bumptech.glide.integration.webp.a aVar) {
        if (aVar.f39068b == 0 && aVar.f39069c == 0 && aVar.f39070d == this.f33862b.getWidth() && aVar.f39071e == this.f33862b.getHeight()) {
            return true;
        }
        return false;
    }

    private boolean p(int i10) {
        if (i10 == 0) {
            return true;
        }
        com.bumptech.glide.integration.webp.a[] aVarArr = this.f33866f;
        com.bumptech.glide.integration.webp.a aVar = aVarArr[i10];
        com.bumptech.glide.integration.webp.a aVar2 = aVarArr[i10 - 1];
        if (!aVar.f39073g && o(aVar)) {
            return true;
        }
        if (!aVar2.f39074h || !o(aVar2)) {
            return false;
        }
        return true;
    }

    private int q(int i10, Canvas canvas) {
        while (i10 >= 0) {
            com.bumptech.glide.integration.webp.a aVar = this.f33866f[i10];
            if (aVar.f39074h && o(aVar)) {
                return i10 + 1;
            }
            Bitmap bitmap = (Bitmap) this.f33873m.get(Integer.valueOf(i10));
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.setDensity(canvas.getDensity());
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                if (aVar.f39074h) {
                    k(canvas, aVar);
                }
                return i10 + 1;
            } else if (p(i10)) {
                return i10;
            } else {
                i10--;
            }
        }
        return 0;
    }

    private void r(int i10, Canvas canvas) {
        com.bumptech.glide.integration.webp.a aVar = this.f33866f[i10];
        int i11 = aVar.f39070d;
        int i12 = this.f33867g;
        int i13 = i11 / i12;
        int i14 = aVar.f39071e / i12;
        int i15 = aVar.f39068b / i12;
        int i16 = aVar.f39069c / i12;
        if (i13 != 0 && i14 != 0) {
            WebpFrame frame = this.f33862b.getFrame(i10);
            try {
                Bitmap c10 = this.f33863c.c(i13, i14, this.f33872l);
                c10.eraseColor(0);
                c10.setDensity(canvas.getDensity());
                frame.renderFrame(i13, i14, c10);
                canvas.drawBitmap(c10, (float) i15, (float) i16, (Paint) null);
                this.f33863c.a(c10);
            } catch (IllegalArgumentException | IllegalStateException unused) {
                Log.e("WebpDecoder", "Rendering of frame failed. Frame number: " + i10);
            } catch (Throwable th2) {
                frame.dispose();
                throw th2;
            }
            frame.dispose();
        }
    }

    public int a() {
        return this.f33862b.getFrameCount();
    }

    public Bitmap b() {
        int i10;
        Bitmap bitmap;
        int g10 = g();
        Bitmap c10 = this.f33863c.c(this.f33869i, this.f33868h, Bitmap.Config.ARGB_8888);
        c10.eraseColor(0);
        c10.setDensity(DisplayMetrics.DENSITY_DEVICE_STABLE);
        Canvas canvas = new Canvas(c10);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        if (this.f33871k.c() || (bitmap = (Bitmap) this.f33873m.get(Integer.valueOf(g10))) == null) {
            if (!p(g10)) {
                i10 = q(g10 - 1, canvas);
            } else {
                i10 = g10;
            }
            if (Log.isLoggable("WebpDecoder", 3)) {
                Log.d("WebpDecoder", "frameNumber=" + g10 + ", nextIndex=" + i10);
            }
            while (i10 < g10) {
                com.bumptech.glide.integration.webp.a aVar = this.f33866f[i10];
                if (!aVar.f39073g) {
                    k(canvas, aVar);
                }
                r(i10, canvas);
                if (Log.isLoggable("WebpDecoder", 3)) {
                    Log.d("WebpDecoder", "renderFrame, index=" + i10 + ", blend=" + aVar.f39073g + ", dispose=" + aVar.f39074h);
                }
                if (aVar.f39074h) {
                    k(canvas, aVar);
                }
                i10++;
            }
            com.bumptech.glide.integration.webp.a aVar2 = this.f33866f[g10];
            if (!aVar2.f39073g) {
                k(canvas, aVar2);
            }
            r(g10, canvas);
            if (Log.isLoggable("WebpDecoder", 3)) {
                Log.d("WebpDecoder", "renderFrame, index=" + g10 + ", blend=" + aVar2.f39073g + ", dispose=" + aVar2.f39074h);
            }
            j(g10, c10);
            return c10;
        }
        if (Log.isLoggable("WebpDecoder", 3)) {
            Log.d("WebpDecoder", "hit frame bitmap from memory cache, frameNumber=" + g10);
        }
        bitmap.setDensity(canvas.getDensity());
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return c10;
    }

    public void c() {
        this.f33864d = (this.f33864d + 1) % this.f33862b.getFrameCount();
    }

    public void clear() {
        this.f33862b.dispose();
        this.f33862b = null;
        this.f33873m.evictAll();
        this.f33861a = null;
    }

    public void d(Bitmap.Config config) {
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config == config2) {
            this.f33872l = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config2);
    }

    public int e() {
        int i10;
        if (this.f33865e.length == 0 || (i10 = this.f33864d) < 0) {
            return 0;
        }
        return m(i10);
    }

    public void f() {
        this.f33864d = -1;
    }

    public int g() {
        return this.f33864d;
    }

    public ByteBuffer getData() {
        return this.f33861a;
    }

    public int h() {
        return this.f33862b.getSizeInBytes();
    }

    public n l() {
        return this.f33871k;
    }

    public int m(int i10) {
        if (i10 >= 0) {
            int[] iArr = this.f33865e;
            if (i10 < iArr.length) {
                return iArr[i10];
            }
        }
        return -1;
    }

    public int n() {
        if (this.f33862b.getLoopCount() == 0) {
            return 0;
        }
        return this.f33862b.getLoopCount();
    }

    public void s(c cVar, ByteBuffer byteBuffer, int i10) {
        if (i10 > 0) {
            int highestOneBit = Integer.highestOneBit(i10);
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f33861a = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f33867g = highestOneBit;
            this.f33869i = this.f33862b.getWidth() / highestOneBit;
            this.f33868h = this.f33862b.getHeight() / highestOneBit;
            return;
        }
        throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
    }

    public i(a.C0546a aVar, WebpImage webpImage, ByteBuffer byteBuffer, int i10, n nVar) {
        int i11;
        this.f33864d = -1;
        this.f33872l = Bitmap.Config.ARGB_8888;
        this.f33863c = aVar;
        this.f33862b = webpImage;
        this.f33865e = webpImage.getFrameDurations();
        this.f33866f = new com.bumptech.glide.integration.webp.a[webpImage.getFrameCount()];
        for (int i12 = 0; i12 < this.f33862b.getFrameCount(); i12++) {
            this.f33866f[i12] = this.f33862b.getFrameInfo(i12);
            if (Log.isLoggable("WebpDecoder", 3)) {
                Log.d("WebpDecoder", "mFrameInfos: " + this.f33866f[i12].toString());
            }
        }
        this.f33871k = nVar;
        Paint paint = new Paint();
        this.f33870j = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        if (this.f33871k.a()) {
            i11 = webpImage.getFrameCount();
        } else {
            i11 = Math.max(5, this.f33871k.b());
        }
        this.f33873m = new a(i11);
        s(new c(), byteBuffer, i10);
    }
}
