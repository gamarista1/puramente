package c5;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o5.C3882a;

interface y {

    public static final class b implements y {

        /* renamed from: a  reason: collision with root package name */
        private final k f36512a;

        /* renamed from: b  reason: collision with root package name */
        private final W4.b f36513b;

        /* renamed from: c  reason: collision with root package name */
        private final List f36514c;

        b(InputStream inputStream, List list, W4.b bVar) {
            this.f36513b = (W4.b) o5.k.d(bVar);
            this.f36514c = (List) o5.k.d(list);
            this.f36512a = new k(inputStream, bVar);
        }

        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f36512a.a(), (Rect) null, options);
        }

        public void b() {
            this.f36512a.c();
        }

        public int c() {
            return com.bumptech.glide.load.a.b(this.f36514c, this.f36512a.a(), this.f36513b);
        }

        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.f(this.f36514c, this.f36512a.a(), this.f36513b);
        }
    }

    Bitmap a(BitmapFactory.Options options);

    void b();

    int c();

    ImageHeaderParser.ImageType d();

    public static final class a implements y {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f36509a;

        /* renamed from: b  reason: collision with root package name */
        private final List f36510b;

        /* renamed from: c  reason: collision with root package name */
        private final W4.b f36511c;

        a(ByteBuffer byteBuffer, List list, W4.b bVar) {
            this.f36509a = byteBuffer;
            this.f36510b = list;
            this.f36511c = bVar;
        }

        private InputStream e() {
            return C3882a.g(C3882a.d(this.f36509a));
        }

        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(e(), (Rect) null, options);
        }

        public int c() {
            return com.bumptech.glide.load.a.c(this.f36510b, C3882a.d(this.f36509a), this.f36511c);
        }

        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.g(this.f36510b, C3882a.d(this.f36509a));
        }

        public void b() {
        }
    }

    public static final class c implements y {

        /* renamed from: a  reason: collision with root package name */
        private final W4.b f36515a;

        /* renamed from: b  reason: collision with root package name */
        private final List f36516b;

        /* renamed from: c  reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f36517c;

        c(ParcelFileDescriptor parcelFileDescriptor, List list, W4.b bVar) {
            this.f36515a = (W4.b) o5.k.d(bVar);
            this.f36516b = (List) o5.k.d(list);
            this.f36517c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f36517c.a().getFileDescriptor(), (Rect) null, options);
        }

        public int c() {
            return com.bumptech.glide.load.a.a(this.f36516b, this.f36517c, this.f36515a);
        }

        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.e(this.f36516b, this.f36517c, this.f36515a);
        }

        public void b() {
        }
    }
}
