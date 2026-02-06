package P8;

import Q8.b;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.github.penfeizhou.animation.decode.a;
import java.io.IOException;

public class d extends a {

    /* renamed from: f  reason: collision with root package name */
    private static final PorterDuffXfermode f33546f = new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER);

    /* renamed from: g  reason: collision with root package name */
    private static final PorterDuffXfermode f33547g = new PorterDuffXfermode(PorterDuff.Mode.SRC);

    /* renamed from: a  reason: collision with root package name */
    final int f33548a;

    /* renamed from: b  reason: collision with root package name */
    final int f33549b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f33550c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f33551d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f33552e;

    public d(Q8.a aVar, c cVar) {
        super(aVar);
        this.frameWidth = cVar.f33539f;
        this.frameHeight = cVar.f33540g;
        this.frameX = cVar.f33537d;
        this.frameY = cVar.f33538e;
        int i10 = cVar.f33541h;
        this.frameDuration = i10;
        if (i10 == 0) {
            this.frameDuration = 100;
        }
        this.f33550c = cVar.d();
        this.f33551d = cVar.e();
        this.f33548a = cVar.f33555c + 24;
        int i11 = cVar.f33554b;
        boolean z10 = true;
        this.f33549b = (i11 - 16) + (i11 & 1);
        this.f33552e = cVar.f33543j == null ? false : z10;
    }

    private int b(b bVar) {
        int i10;
        int i11 = 30 + this.f33549b;
        bVar.d(i11);
        bVar.h("RIFF");
        bVar.j(i11);
        bVar.h("WEBP");
        bVar.j(k.f33560g);
        bVar.j(10);
        if (this.f33552e) {
            i10 = 16;
        } else {
            i10 = 0;
        }
        bVar.b((byte) i10);
        bVar.i(0);
        bVar.g(this.frameWidth);
        bVar.g(this.frameHeight);
        try {
            ((Q8.a) this.reader).reset();
            ((Q8.a) this.reader).skip((long) this.f33548a);
            ((Q8.a) this.reader).read(bVar.f(), bVar.a(), this.f33549b);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        return i11;
    }

    /* renamed from: a */
    public Bitmap draw(Canvas canvas, Paint paint, int i10, Bitmap bitmap, b bVar) {
        Bitmap bitmap2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inSampleSize = i10;
        options.inMutable = true;
        options.inBitmap = bitmap;
        int b10 = b(bVar);
        byte[] f10 = bVar.f();
        try {
            bitmap2 = BitmapFactory.decodeByteArray(f10, 0, b10, options);
        } catch (IllegalArgumentException unused) {
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = false;
            options2.inSampleSize = i10;
            options2.inMutable = true;
            bitmap2 = BitmapFactory.decodeByteArray(f10, 0, b10, options2);
        }
        if (bitmap2 == null) {
            return bitmap;
        }
        if (this.f33550c) {
            paint.setXfermode(f33547g);
        } else {
            paint.setXfermode(f33546f);
        }
        Rect rect = this.srcRect;
        rect.left = 0;
        rect.top = 0;
        rect.right = bitmap2.getWidth();
        this.srcRect.bottom = bitmap2.getHeight();
        Rect rect2 = this.dstRect;
        int i11 = this.frameX;
        float f11 = (float) i10;
        rect2.left = (int) ((((float) i11) * 2.0f) / f11);
        rect2.top = (int) ((((float) this.frameY) * 2.0f) / f11);
        rect2.right = (int) (((((float) i11) * 2.0f) / f11) + ((float) bitmap2.getWidth()));
        this.dstRect.bottom = (int) (((((float) this.frameY) * 2.0f) / f11) + ((float) bitmap2.getHeight()));
        canvas.drawBitmap(bitmap2, this.srcRect, this.dstRect, paint);
        return bitmap2;
    }
}
