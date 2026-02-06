package P8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.github.penfeizhou.animation.decode.a;
import com.github.penfeizhou.animation.decode.b;
import com.github.penfeizhou.animation.io.Reader;

public class l extends b {

    /* renamed from: A  reason: collision with root package name */
    private int f33564A;

    /* renamed from: B  reason: collision with root package name */
    private boolean f33565B;

    /* renamed from: C  reason: collision with root package name */
    private int f33566C;

    /* renamed from: D  reason: collision with root package name */
    private Q8.b f33567D;

    /* renamed from: w  reason: collision with root package name */
    private final Paint f33568w;

    /* renamed from: x  reason: collision with root package name */
    private Paint f33569x;

    /* renamed from: y  reason: collision with root package name */
    private int f33570y;

    /* renamed from: z  reason: collision with root package name */
    private int f33571z;

    public l(N8.b bVar, b.j jVar) {
        super(bVar, jVar);
        Paint paint = new Paint();
        this.f33568w = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    /* access modifiers changed from: protected */
    public void M(a aVar) {
        Bitmap H10;
        Bitmap bitmap;
        int i10;
        if (aVar != null && this.f42729p != null && this.f42729p.width() > 0 && this.f42729p.height() > 0 && (H10 = H(this.f42729p.width() / this.f42724k, this.f42729p.height() / this.f42724k)) != null) {
            Canvas canvas = (Canvas) this.f42727n.get(H10);
            if (canvas == null) {
                canvas = new Canvas(H10);
                this.f42727n.put(H10, canvas);
            }
            this.f42728o.rewind();
            H10.copyPixelsFromBuffer(this.f42728o);
            int i11 = this.f42718e;
            if (i11 != 0) {
                a aVar2 = (a) this.f42717d.get(i11 - 1);
                if ((aVar2 instanceof d) && ((d) aVar2).f33551d) {
                    int i12 = aVar2.frameX;
                    int i13 = this.f42724k;
                    int i14 = aVar2.frameY;
                    canvas.drawRect((((float) i12) * 2.0f) / ((float) i13), (((float) i14) * 2.0f) / ((float) i13), ((float) ((i12 * 2) + aVar2.frameWidth)) / ((float) i13), ((float) ((i14 * 2) + aVar2.frameHeight)) / ((float) i13), this.f33568w);
                }
            } else if (this.f33565B) {
                canvas.drawColor(0, PorterDuff.Mode.SRC);
            } else {
                canvas.drawColor(this.f33566C, PorterDuff.Mode.SRC);
            }
            int i15 = aVar.frameWidth;
            if (i15 <= 0 || (i10 = aVar.frameHeight) <= 0) {
                bitmap = null;
            } else {
                int i16 = this.f42724k;
                bitmap = H(i15 / i16, i10 / i16);
            }
            J(aVar.draw(canvas, this.f33569x, this.f42724k, bitmap, C()));
            J(bitmap);
            this.f42728o.rewind();
            H10.copyPixelsToBuffer(this.f42728o);
            J(H10);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public Q8.a A(Reader reader) {
        return new Q8.a(reader);
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public Q8.b C() {
        if (this.f33567D == null) {
            this.f33567D = new Q8.b();
        }
        return this.f33567D;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public Rect I(Q8.a aVar) {
        boolean z10 = false;
        boolean z11 = false;
        for (e eVar : m.b(aVar)) {
            if (eVar instanceof k) {
                k kVar = (k) eVar;
                this.f33571z = kVar.f33562e;
                this.f33564A = kVar.f33563f;
                this.f33565B = kVar.d();
                z11 = true;
            } else if (eVar instanceof b) {
                b bVar = (b) eVar;
                this.f33566C = bVar.f33534d;
                this.f33570y = bVar.f33535e;
                z10 = true;
            } else if (eVar instanceof c) {
                this.f42717d.add(new d(aVar, (c) eVar));
            }
        }
        if (!z10) {
            if (!z11) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(aVar.toInputStream(), (Rect) null, options);
                this.f33571z = options.outWidth;
                this.f33564A = options.outHeight;
            }
            this.f42717d.add(new h(aVar, this.f33571z, this.f33564A));
            this.f33570y = 1;
        }
        Paint paint = new Paint();
        this.f33569x = paint;
        paint.setAntiAlias(true);
        if (!this.f33565B) {
            this.f33568w.setColor(this.f33566C);
        }
        return new Rect(0, 0, this.f33571z, this.f33564A);
    }

    /* access modifiers changed from: protected */
    public int x() {
        return this.f33570y;
    }

    /* access modifiers changed from: protected */
    public void K() {
    }
}
