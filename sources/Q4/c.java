package Q4;

import T4.i;
import T4.k;
import V4.v;
import W4.b;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.a;
import java.io.InputStream;
import java.util.List;
import o5.C3882a;

public final class c implements k {

    /* renamed from: a  reason: collision with root package name */
    private final List f33658a;

    /* renamed from: b  reason: collision with root package name */
    private final a f33659b;

    /* renamed from: c  reason: collision with root package name */
    private final b f33660c;

    public c(List list, a aVar, b bVar) {
        this.f33658a = list;
        this.f33659b = (a) o5.k.d(aVar);
        this.f33660c = (b) o5.k.d(bVar);
    }

    /* renamed from: c */
    public v b(InputStream inputStream, int i10, int i11, i iVar) {
        return this.f33659b.b(C3882a.b(inputStream), i10, i11, iVar);
    }

    /* renamed from: d */
    public boolean a(InputStream inputStream, i iVar) {
        ImageHeaderParser.ImageType f10 = a.f(this.f33658a, inputStream, this.f33660c);
        if (f10.equals(ImageHeaderParser.ImageType.AVIF) || f10.equals(ImageHeaderParser.ImageType.ANIMATED_AVIF)) {
            return true;
        }
        return false;
    }
}
