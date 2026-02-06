package M5;

import T5.k;
import android.net.Uri;
import java.util.List;

public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    final List f32600a;

    public f(List list) {
        this.f32600a = (List) k.g(list);
    }

    public String a() {
        return ((d) this.f32600a.get(0)).a();
    }

    public boolean b(Uri uri) {
        for (int i10 = 0; i10 < this.f32600a.size(); i10++) {
            if (((d) this.f32600a.get(i10)).b(uri)) {
                return true;
            }
        }
        return false;
    }

    public boolean c() {
        return false;
    }

    public List d() {
        return this.f32600a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return this.f32600a.equals(((f) obj).f32600a);
        }
        return false;
    }

    public int hashCode() {
        return this.f32600a.hashCode();
    }

    public String toString() {
        return "MultiCacheKey:" + this.f32600a.toString();
    }
}
