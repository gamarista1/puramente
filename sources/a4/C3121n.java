package a4;

import Gh.C5406g;
import R1.a;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.io.InputStream;
import o4.C3878a;

/* renamed from: a4.n  reason: case insensitive filesystem */
public final class C3121n {

    /* renamed from: a  reason: collision with root package name */
    public static final C3121n f36068a = new C3121n();

    /* renamed from: b  reason: collision with root package name */
    private static final Paint f36069b = new Paint(3);

    private C3121n() {
    }

    public final C3118k a(String str, C5406g gVar, C3120m mVar) {
        if (!C3122o.c(mVar, str)) {
            return C3118k.f36058d;
        }
        a aVar = new a((InputStream) new C3119l(gVar.peek().x1()));
        return new C3118k(aVar.C(), aVar.r());
    }

    public final Bitmap b(Bitmap bitmap, C3118k kVar) {
        Bitmap bitmap2;
        if (!kVar.b() && !C3122o.a(kVar)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width = ((float) bitmap.getWidth()) / 2.0f;
        float height = ((float) bitmap.getHeight()) / 2.0f;
        if (kVar.b()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (C3122o.a(kVar)) {
            matrix.postRotate((float) kVar.a(), width, height);
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        float f10 = rectF.left;
        if (!(f10 == 0.0f && rectF.top == 0.0f)) {
            matrix.postTranslate(-f10, -rectF.top);
        }
        if (C3122o.b(kVar)) {
            bitmap2 = Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), C3878a.c(bitmap));
        } else {
            bitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), C3878a.c(bitmap));
        }
        new Canvas(bitmap2).drawBitmap(bitmap, matrix, f36069b);
        bitmap.recycle();
        return bitmap2;
    }
}
