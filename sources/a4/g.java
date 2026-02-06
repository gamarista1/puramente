package A4;

import androidx.collection.C1609x;
import u4.C4071k;

public class g {

    /* renamed from: b  reason: collision with root package name */
    private static final g f29369b = new g();

    /* renamed from: a  reason: collision with root package name */
    private final C1609x f29370a = new C1609x(20);

    g() {
    }

    public static g b() {
        return f29369b;
    }

    public C4071k a(String str) {
        if (str == null) {
            return null;
        }
        return (C4071k) this.f29370a.get(str);
    }

    public void c(String str, C4071k kVar) {
        if (str != null) {
            this.f29370a.put(str, kVar);
        }
    }
}
