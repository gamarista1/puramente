package ff;

import java.util.Map;
import p003if.b;
import p003if.h;

/* renamed from: ff.l  reason: case insensitive filesystem */
public final class C5858l {

    /* renamed from: a  reason: collision with root package name */
    private String f67545a;

    /* renamed from: b  reason: collision with root package name */
    private String f67546b;

    /* renamed from: c  reason: collision with root package name */
    private String f67547c;

    /* renamed from: d  reason: collision with root package name */
    private String f67548d;

    /* renamed from: e  reason: collision with root package name */
    private String f67549e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f67550f;

    /* renamed from: g  reason: collision with root package name */
    private Map f67551g;

    /* renamed from: ff.l$a */
    public static final class a {
    }

    C5858l(C5858l lVar) {
        this.f67545a = lVar.f67545a;
        this.f67546b = lVar.f67546b;
        this.f67547c = lVar.f67547c;
        this.f67548d = lVar.f67548d;
        this.f67549e = lVar.f67549e;
        this.f67550f = lVar.f67550f;
        this.f67551g = b.b(lVar.f67551g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5858l.class != obj.getClass()) {
            return false;
        }
        C5858l lVar = (C5858l) obj;
        if (!h.a(this.f67545a, lVar.f67545a) || !h.a(this.f67546b, lVar.f67546b) || !h.a(this.f67547c, lVar.f67547c) || !h.a(this.f67548d, lVar.f67548d) || !h.a(this.f67549e, lVar.f67549e) || !h.a(this.f67550f, lVar.f67550f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return h.b(this.f67545a, this.f67546b, this.f67547c, this.f67548d, this.f67549e, this.f67550f);
    }
}
