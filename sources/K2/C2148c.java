package k2;

import R1.a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import f2.C1961B;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: k2.c  reason: case insensitive filesystem */
public abstract class C2148c {
    public static Bitmap a(byte[] bArr, int i10, BitmapFactory.Options options) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i10, options);
        if (decodeByteArray != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                a aVar = new a((InputStream) byteArrayInputStream);
                byteArrayInputStream.close();
                int r10 = aVar.r();
                if (r10 == 0) {
                    return decodeByteArray;
                }
                Matrix matrix = new Matrix();
                matrix.postRotate((float) r10);
                return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            throw C1961B.a("Could not decode image data", new IllegalStateException());
        }
        throw th;
    }
}
