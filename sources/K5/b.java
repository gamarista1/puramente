package k5;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final List f45132a = new ArrayList();

    public synchronized void a(ImageHeaderParser imageHeaderParser) {
        this.f45132a.add(imageHeaderParser);
    }

    public synchronized List b() {
        return this.f45132a;
    }
}
