package io.intercom.android.sdk.utilities;

import R1.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a \u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0000\u001a \u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0001H\u0000¨\u0006\u0012"}, d2 = {"drawableToBitmap", "Landroid/graphics/Bitmap;", "drawable", "Landroid/graphics/drawable/Drawable;", "defaultWidth", "", "defaultHeight", "calculateInSampleSize", "options", "Landroid/graphics/BitmapFactory$Options;", "reqWidth", "reqHeight", "determineBitmapRotation", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "bitmap", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BitmapUtilsKt {
    public static final int calculateInSampleSize(BitmapFactory.Options options, int i10, int i11) {
        C6496s.h(options, "options");
        Pair a10 = C6502A.a(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int intValue = ((Number) a10.a()).intValue();
        int intValue2 = ((Number) a10.b()).intValue();
        int i12 = 1;
        if (intValue > i11 || intValue2 > i10) {
            int i13 = intValue / 2;
            int i14 = intValue2 / 2;
            while (i13 / i12 >= i11 && i14 / i12 >= i10) {
                i12 *= 2;
            }
        }
        return i12;
    }

    public static final Bitmap determineBitmapRotation(Context context, Uri uri, Bitmap bitmap) {
        C6496s.h(context, "context");
        C6496s.h(uri, "uri");
        C6496s.h(bitmap, "bitmap");
        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
        if (openInputStream != null) {
            int i10 = new a(openInputStream).i("Orientation", 0);
            Matrix matrix = new Matrix();
            if (i10 == 3) {
                matrix.postRotate(180.0f);
            } else if (i10 == 6) {
                matrix.postRotate(90.0f);
            } else if (i10 == 8) {
                matrix.postRotate(270.0f);
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            if (createBitmap != null) {
                bitmap = createBitmap;
            }
        }
        if (openInputStream != null) {
            openInputStream.close();
        }
        return bitmap;
    }

    public static final Bitmap drawableToBitmap(Drawable drawable, int i10, int i11) {
        Bitmap bitmap;
        C6496s.h(drawable, "drawable");
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                Bitmap bitmap2 = bitmapDrawable.getBitmap();
                C6496s.g(bitmap2, "getBitmap(...)");
                return bitmap2;
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            bitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            C6496s.e(bitmap);
        } else {
            bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            C6496s.e(bitmap);
        }
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmap;
    }
}
