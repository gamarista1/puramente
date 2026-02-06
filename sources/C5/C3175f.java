package c5;

import T4.i;
import T4.k;
import V4.v;
import W4.d;
import W4.e;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import b5.C3153d;

/* renamed from: c5.f  reason: case insensitive filesystem */
public final class C3175f implements k {

    /* renamed from: a  reason: collision with root package name */
    private final d f36458a = new e();

    public /* bridge */ /* synthetic */ boolean a(Object obj, i iVar) {
        return d(C3173d.a(obj), iVar);
    }

    public /* bridge */ /* synthetic */ v b(Object obj, int i10, int i11, i iVar) {
        return c(C3173d.a(obj), i10, i11, iVar);
    }

    public v c(ImageDecoder.Source source, int i10, int i11, i iVar) {
        Bitmap a10 = ImageDecoder.decodeBitmap(source, new C3153d(i10, i11, iVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + a10.getWidth() + "x" + a10.getHeight() + "] for [" + i10 + "x" + i11 + "]");
        }
        return new C3176g(a10, this.f36458a);
    }

    public boolean d(ImageDecoder.Source source, i iVar) {
        return true;
    }
}
