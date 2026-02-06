package M9;

import android.net.Uri;
import ia.D;
import java.io.InputStream;
import java.util.List;

public final class b implements D.a {

    /* renamed from: a  reason: collision with root package name */
    private final D.a f32701a;

    /* renamed from: b  reason: collision with root package name */
    private final List f32702b;

    public b(D.a aVar, List list) {
        this.f32701a = aVar;
        this.f32702b = list;
    }

    /* renamed from: b */
    public a a(Uri uri, InputStream inputStream) {
        a aVar = (a) this.f32701a.a(uri, inputStream);
        List list = this.f32702b;
        if (list == null || list.isEmpty()) {
            return aVar;
        }
        return (a) aVar.a(this.f32702b);
    }
}
