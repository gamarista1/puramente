package ff;

import java.util.Map;
import p003if.b;
import p003if.h;

/* renamed from: ff.h  reason: case insensitive filesystem */
public final class C5854h {

    /* renamed from: a  reason: collision with root package name */
    private String f67532a;

    /* renamed from: b  reason: collision with root package name */
    private Integer f67533b;

    /* renamed from: c  reason: collision with root package name */
    private String f67534c;

    /* renamed from: d  reason: collision with root package name */
    private String f67535d;

    /* renamed from: e  reason: collision with root package name */
    private Integer f67536e;

    /* renamed from: f  reason: collision with root package name */
    private String f67537f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f67538g;

    /* renamed from: h  reason: collision with root package name */
    private String f67539h;

    /* renamed from: i  reason: collision with root package name */
    private String f67540i;

    /* renamed from: j  reason: collision with root package name */
    private Map f67541j;

    /* renamed from: ff.h$a */
    public static final class a {
    }

    C5854h(C5854h hVar) {
        this.f67532a = hVar.f67532a;
        this.f67533b = hVar.f67533b;
        this.f67534c = hVar.f67534c;
        this.f67535d = hVar.f67535d;
        this.f67536e = hVar.f67536e;
        this.f67537f = hVar.f67537f;
        this.f67538g = hVar.f67538g;
        this.f67539h = hVar.f67539h;
        this.f67540i = hVar.f67540i;
        this.f67541j = b.b(hVar.f67541j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5854h.class != obj.getClass()) {
            return false;
        }
        C5854h hVar = (C5854h) obj;
        if (!h.a(this.f67532a, hVar.f67532a) || !h.a(this.f67533b, hVar.f67533b) || !h.a(this.f67534c, hVar.f67534c) || !h.a(this.f67535d, hVar.f67535d) || !h.a(this.f67536e, hVar.f67536e) || !h.a(this.f67537f, hVar.f67537f) || !h.a(this.f67538g, hVar.f67538g) || !h.a(this.f67539h, hVar.f67539h) || !h.a(this.f67540i, hVar.f67540i)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return h.b(this.f67532a, this.f67533b, this.f67534c, this.f67535d, this.f67536e, this.f67537f, this.f67538g, this.f67539h, this.f67540i);
    }
}
