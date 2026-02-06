package h5;

import T4.i;
import V4.v;
import android.graphics.Bitmap;
import d5.C3474b;
import java.io.ByteArrayOutputStream;

/* renamed from: h5.a  reason: case insensitive filesystem */
public class C3575a implements C3579e {

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap.CompressFormat f44002a;

    /* renamed from: b  reason: collision with root package name */
    private final int f44003b;

    public C3575a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public v a(v vVar, i iVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) vVar.get()).compress(this.f44002a, this.f44003b, byteArrayOutputStream);
        vVar.recycle();
        return new C3474b(byteArrayOutputStream.toByteArray());
    }

    public C3575a(Bitmap.CompressFormat compressFormat, int i10) {
        this.f44002a = compressFormat;
        this.f44003b = i10;
    }
}
