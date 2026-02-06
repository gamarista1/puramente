package h7;

import M5.d;
import M5.i;
import T5.k;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import i7.C3592a;
import java.util.Locale;

/* renamed from: h7.a  reason: case insensitive filesystem */
public class C3581a extends C3592a {

    /* renamed from: c  reason: collision with root package name */
    private final int f44018c;

    /* renamed from: d  reason: collision with root package name */
    private final int f44019d;

    /* renamed from: e  reason: collision with root package name */
    private d f44020e;

    public C3581a(int i10, int i11) {
        boolean z10;
        boolean z11 = false;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        k.b(Boolean.valueOf(z10));
        k.b(Boolean.valueOf(i11 > 0 ? true : z11));
        this.f44018c = i10;
        this.f44019d = i11;
    }

    public d a() {
        if (this.f44020e == null) {
            this.f44020e = new i(String.format((Locale) null, "i%dr%d", new Object[]{Integer.valueOf(this.f44018c), Integer.valueOf(this.f44019d)}));
        }
        return this.f44020e;
    }

    public void d(Bitmap bitmap) {
        NativeBlurFilter.a(bitmap, this.f44018c, this.f44019d);
    }
}
