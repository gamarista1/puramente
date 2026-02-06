package e5;

import T4.i;
import T4.k;
import V4.v;
import a4.C3105G;
import a4.C3106H;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import b5.C3153d;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o5.C3882a;
import o5.l;

/* renamed from: e5.e  reason: case insensitive filesystem */
public final class C3494e {

    /* renamed from: a  reason: collision with root package name */
    private final List f43337a;

    /* renamed from: b  reason: collision with root package name */
    private final W4.b f43338b;

    /* renamed from: e5.e$a */
    private static final class a implements v {

        /* renamed from: a  reason: collision with root package name */
        private final AnimatedImageDrawable f43339a;

        a(AnimatedImageDrawable animatedImageDrawable) {
            this.f43339a = animatedImageDrawable;
        }

        public Class a() {
            return Drawable.class;
        }

        /* renamed from: b */
        public AnimatedImageDrawable get() {
            return this.f43339a;
        }

        public int getSize() {
            return this.f43339a.getIntrinsicWidth() * this.f43339a.getIntrinsicHeight() * l.j(Bitmap.Config.ARGB_8888) * 2;
        }

        public void recycle() {
            this.f43339a.stop();
            this.f43339a.clearAnimationCallbacks();
        }
    }

    /* renamed from: e5.e$b */
    private static final class b implements k {

        /* renamed from: a  reason: collision with root package name */
        private final C3494e f43340a;

        b(C3494e eVar) {
            this.f43340a = eVar;
        }

        /* renamed from: c */
        public v b(ByteBuffer byteBuffer, int i10, int i11, i iVar) {
            return this.f43340a.b(ImageDecoder.createSource(byteBuffer), i10, i11, iVar);
        }

        /* renamed from: d */
        public boolean a(ByteBuffer byteBuffer, i iVar) {
            return this.f43340a.d(byteBuffer);
        }
    }

    /* renamed from: e5.e$c */
    private static final class c implements k {

        /* renamed from: a  reason: collision with root package name */
        private final C3494e f43341a;

        c(C3494e eVar) {
            this.f43341a = eVar;
        }

        /* renamed from: c */
        public v b(InputStream inputStream, int i10, int i11, i iVar) {
            return this.f43341a.b(ImageDecoder.createSource(C3882a.b(inputStream)), i10, i11, iVar);
        }

        /* renamed from: d */
        public boolean a(InputStream inputStream, i iVar) {
            return this.f43341a.c(inputStream);
        }
    }

    private C3494e(List list, W4.b bVar) {
        this.f43337a = list;
        this.f43338b = bVar;
    }

    public static k a(List list, W4.b bVar) {
        return new b(new C3494e(list, bVar));
    }

    private boolean e(ImageHeaderParser.ImageType imageType) {
        if (imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF)) {
            return true;
        }
        return false;
    }

    public static k f(List list, W4.b bVar) {
        return new c(new C3494e(list, bVar));
    }

    /* access modifiers changed from: package-private */
    public v b(ImageDecoder.Source source, int i10, int i11, i iVar) {
        Drawable a10 = ImageDecoder.decodeDrawable(source, new C3153d(i10, i11, iVar));
        if (C3105G.a(a10)) {
            return new a(C3106H.a(a10));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + a10);
    }

    /* access modifiers changed from: package-private */
    public boolean c(InputStream inputStream) {
        return e(com.bumptech.glide.load.a.f(this.f43337a, inputStream, this.f43338b));
    }

    /* access modifiers changed from: package-private */
    public boolean d(ByteBuffer byteBuffer) {
        return e(com.bumptech.glide.load.a.g(this.f43337a, byteBuffer));
    }
}
