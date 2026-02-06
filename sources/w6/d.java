package W6;

import T5.i;
import a7.c;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;

public class d {

    /* renamed from: m  reason: collision with root package name */
    private static final d f34871m = b().a();

    /* renamed from: a  reason: collision with root package name */
    public final int f34872a;

    /* renamed from: b  reason: collision with root package name */
    public final int f34873b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f34874c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f34875d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f34876e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f34877f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f34878g;

    /* renamed from: h  reason: collision with root package name */
    public final Bitmap.Config f34879h;

    /* renamed from: i  reason: collision with root package name */
    public final Bitmap.Config f34880i;

    /* renamed from: j  reason: collision with root package name */
    public final c f34881j;

    /* renamed from: k  reason: collision with root package name */
    public final ColorSpace f34882k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f34883l;

    public d(e eVar) {
        this.f34872a = eVar.l();
        this.f34873b = eVar.k();
        this.f34874c = eVar.h();
        this.f34875d = eVar.n();
        this.f34876e = eVar.m();
        this.f34877f = eVar.g();
        this.f34878g = eVar.j();
        this.f34879h = eVar.c();
        this.f34880i = eVar.b();
        this.f34881j = eVar.f();
        eVar.d();
        this.f34882k = eVar.e();
        this.f34883l = eVar.i();
    }

    public static d a() {
        return f34871m;
    }

    public static e b() {
        return new e();
    }

    /* access modifiers changed from: protected */
    public i.a c() {
        return i.b(this).a("minDecodeIntervalMs", this.f34872a).a("maxDimensionPx", this.f34873b).c("decodePreviewFrame", this.f34874c).c("useLastFrameForPreview", this.f34875d).c("useEncodedImageForPreview", this.f34876e).c("decodeAllFrames", this.f34877f).c("forceStaticImage", this.f34878g).b("bitmapConfigName", this.f34879h.name()).b("animatedBitmapConfigName", this.f34880i.name()).b("customImageDecoder", this.f34881j).b("bitmapTransformation", (Object) null).b("colorSpace", this.f34882k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f34872a != dVar.f34872a || this.f34873b != dVar.f34873b || this.f34874c != dVar.f34874c || this.f34875d != dVar.f34875d || this.f34876e != dVar.f34876e || this.f34877f != dVar.f34877f || this.f34878g != dVar.f34878g) {
            return false;
        }
        boolean z10 = this.f34883l;
        if (!z10 && this.f34879h != dVar.f34879h) {
            return false;
        }
        if ((z10 || this.f34880i == dVar.f34880i) && this.f34881j == dVar.f34881j && this.f34882k == dVar.f34882k) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12 = (((((((((((this.f34872a * 31) + this.f34873b) * 31) + (this.f34874c ? 1 : 0)) * 31) + (this.f34875d ? 1 : 0)) * 31) + (this.f34876e ? 1 : 0)) * 31) + (this.f34877f ? 1 : 0)) * 31) + (this.f34878g ? 1 : 0);
        if (!this.f34883l) {
            i12 = (i12 * 31) + this.f34879h.ordinal();
        }
        int i13 = 0;
        if (!this.f34883l) {
            int i14 = i12 * 31;
            Bitmap.Config config = this.f34880i;
            if (config != null) {
                i11 = config.ordinal();
            } else {
                i11 = 0;
            }
            i12 = i14 + i11;
        }
        int i15 = i12 * 31;
        c cVar = this.f34881j;
        if (cVar != null) {
            i10 = cVar.hashCode();
        } else {
            i10 = 0;
        }
        int i16 = (i15 + i10) * 961;
        ColorSpace colorSpace = this.f34882k;
        if (colorSpace != null) {
            i13 = colorSpace.hashCode();
        }
        return i16 + i13;
    }

    public String toString() {
        return "ImageDecodeOptions{" + c().toString() + "}";
    }
}
