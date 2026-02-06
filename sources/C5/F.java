package c5;

import W4.d;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public abstract class F {

    /* renamed from: a  reason: collision with root package name */
    private static final Paint f36434a = new Paint(6);

    /* renamed from: b  reason: collision with root package name */
    private static final Paint f36435b = new Paint(7);

    /* renamed from: c  reason: collision with root package name */
    private static final Paint f36436c;

    /* renamed from: d  reason: collision with root package name */
    private static final Set f36437d;

    /* renamed from: e  reason: collision with root package name */
    private static final Lock f36438e;

    private static final class a implements Lock {
        a() {
        }

        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        public boolean tryLock() {
            return true;
        }

        public boolean tryLock(long j10, TimeUnit timeUnit) {
            return true;
        }

        public void lock() {
        }

        public void lockInterruptibly() {
        }

        public void unlock() {
        }
    }

    static {
        Lock lock;
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"}));
        f36437d = hashSet;
        if (hashSet.contains(Build.MODEL)) {
            lock = new ReentrantLock();
        } else {
            lock = new a();
        }
        f36438e = lock;
        Paint paint = new Paint(7);
        f36436c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f36438e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f36434a);
            e(canvas);
            lock.unlock();
        } catch (Throwable th2) {
            f36438e.unlock();
            throw th2;
        }
    }

    public static Bitmap b(d dVar, Bitmap bitmap, int i10, int i11) {
        float f10;
        float f11;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f12 = 0.0f;
        if (bitmap.getWidth() * i11 > bitmap.getHeight() * i10) {
            f11 = ((float) i11) / ((float) bitmap.getHeight());
            f12 = (((float) i10) - (((float) bitmap.getWidth()) * f11)) * 0.5f;
            f10 = 0.0f;
        } else {
            f11 = ((float) i10) / ((float) bitmap.getWidth());
            f10 = (((float) i11) - (((float) bitmap.getHeight()) * f11)) * 0.5f;
        }
        matrix.setScale(f11, f11);
        matrix.postTranslate((float) ((int) (f12 + 0.5f)), (float) ((int) (f10 + 0.5f)));
        Bitmap d10 = dVar.d(i10, i11, k(bitmap));
        o(bitmap, d10);
        a(bitmap, d10, matrix);
        return d10;
    }

    public static Bitmap c(d dVar, Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() > i10 || bitmap.getHeight() > i11) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return f(dVar, bitmap, i10, i11);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    public static Bitmap d(d dVar, Bitmap bitmap, int i10, int i11) {
        int min = Math.min(i10, i11);
        float f10 = (float) min;
        float f11 = f10 / 2.0f;
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        float max = Math.max(f10 / width, f10 / height);
        float f12 = width * max;
        float f13 = max * height;
        float f14 = (f10 - f12) / 2.0f;
        float f15 = (f10 - f13) / 2.0f;
        RectF rectF = new RectF(f14, f15, f12 + f14, f13 + f15);
        Bitmap g10 = g(dVar, bitmap);
        Bitmap d10 = dVar.d(min, min, h(bitmap));
        d10.setHasAlpha(true);
        Lock lock = f36438e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(d10);
            canvas.drawCircle(f11, f11, f11, f36435b);
            canvas.drawBitmap(g10, (Rect) null, rectF, f36436c);
            e(canvas);
            lock.unlock();
            if (!g10.equals(bitmap)) {
                dVar.c(g10);
            }
            return d10;
        } catch (Throwable th2) {
            f36438e.unlock();
            throw th2;
        }
    }

    private static void e(Canvas canvas) {
        canvas.setBitmap((Bitmap) null);
    }

    public static Bitmap f(d dVar, Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(((float) i10) / ((float) bitmap.getWidth()), ((float) i11) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap d10 = dVar.d((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), k(bitmap));
        o(bitmap, d10);
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i10 + "x" + i11);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + d10.getWidth() + "x" + d10.getHeight());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("minPct:   ");
            sb2.append(min);
            Log.v("TransformationUtils", sb2.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        a(bitmap, d10, matrix);
        return d10;
    }

    private static Bitmap g(d dVar, Bitmap bitmap) {
        Bitmap.Config h10 = h(bitmap);
        if (h10.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap d10 = dVar.d(bitmap.getWidth(), bitmap.getHeight(), h10);
        new Canvas(d10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return d10;
    }

    private static Bitmap.Config h(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) {
            return Bitmap.Config.ARGB_8888;
        }
        return Bitmap.Config.RGBA_F16;
    }

    public static Lock i() {
        return f36438e;
    }

    public static int j(int i10) {
        switch (i10) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    private static Bitmap.Config k(Bitmap bitmap) {
        if (bitmap.getConfig() != null) {
            return bitmap.getConfig();
        }
        return Bitmap.Config.ARGB_8888;
    }

    static void l(int i10, Matrix matrix) {
        switch (i10) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }

    public static boolean m(int i10) {
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap n(d dVar, Bitmap bitmap, int i10) {
        if (!m(i10)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        l(i10, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap d10 = dVar.d(Math.round(rectF.width()), Math.round(rectF.height()), k(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        d10.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, d10, matrix);
        return d10;
    }

    public static void o(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
