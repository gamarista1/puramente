package P8;

import Q8.b;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Xfermode;
import com.github.penfeizhou.animation.decode.a;
import java.io.IOException;

public class h extends a {
    public h(Q8.a aVar, int i10, int i11) {
        super(aVar);
        this.frameWidth = i10;
        this.frameHeight = i11;
    }

    /* renamed from: a */
    public Bitmap draw(Canvas canvas, Paint paint, int i10, Bitmap bitmap, b bVar) {
        Bitmap bitmap2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inSampleSize = i10;
        options.inMutable = true;
        options.inBitmap = bitmap;
        Bitmap bitmap3 = null;
        try {
            bitmap2 = BitmapFactory.decodeStream(((Q8.a) this.reader).toInputStream(), (Rect) null, options);
        } catch (IllegalArgumentException e10) {
            try {
                e10.printStackTrace();
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = false;
                options2.inSampleSize = i10;
                options2.inMutable = true;
                bitmap2 = BitmapFactory.decodeStream(((Q8.a) this.reader).toInputStream(), (Rect) null, options2);
            } catch (IOException e11) {
                e = e11;
                e.printStackTrace();
                return bitmap3;
            }
        }
        try {
            paint.setXfermode((Xfermode) null);
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
            return bitmap2;
        } catch (IOException e12) {
            e = e12;
            bitmap3 = bitmap2;
        }
    }
}
