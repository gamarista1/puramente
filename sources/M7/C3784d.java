package m7;

import U5.a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: m7.d  reason: case insensitive filesystem */
public final class C3784d {

    /* renamed from: a  reason: collision with root package name */
    public static final C3784d f46510a = new C3784d();

    private C3784d() {
    }

    public static final int a(InputStream inputStream) {
        if (inputStream == null) {
            a.b("HeifExifUtil", "Trying to read Heif Exif from null inputStream -> ignoring");
            return 0;
        }
        try {
            return new R1.a(inputStream).i("Orientation", 1);
        } catch (IOException e10) {
            a.g("HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", e10);
            return 0;
        }
    }
}
