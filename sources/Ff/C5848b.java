package ff;

import java.util.Map;
import p003if.b;
import p003if.h;

/* renamed from: ff.b  reason: case insensitive filesystem */
public final class C5848b {

    /* renamed from: a  reason: collision with root package name */
    private String f67490a;

    /* renamed from: b  reason: collision with root package name */
    private String f67491b;

    /* renamed from: c  reason: collision with root package name */
    private Map f67492c;

    /* renamed from: ff.b$a */
    public static final class a {
    }

    C5848b(C5848b bVar) {
        this.f67490a = bVar.f67490a;
        this.f67491b = bVar.f67491b;
        this.f67492c = b.b(bVar.f67492c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5848b.class != obj.getClass()) {
            return false;
        }
        C5848b bVar = (C5848b) obj;
        if (!h.a(this.f67490a, bVar.f67490a) || !h.a(this.f67491b, bVar.f67491b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return h.b(this.f67490a, this.f67491b);
    }
}
