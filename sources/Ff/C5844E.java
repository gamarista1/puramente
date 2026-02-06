package ff;

import java.util.Map;
import p003if.b;
import p003if.h;

/* renamed from: ff.E  reason: case insensitive filesystem */
public final class C5844E {

    /* renamed from: a  reason: collision with root package name */
    private String f67469a;

    /* renamed from: b  reason: collision with root package name */
    private String f67470b;

    /* renamed from: c  reason: collision with root package name */
    private String f67471c;

    /* renamed from: d  reason: collision with root package name */
    private String f67472d;

    /* renamed from: e  reason: collision with root package name */
    private String f67473e;

    /* renamed from: f  reason: collision with root package name */
    private Map f67474f;

    /* renamed from: g  reason: collision with root package name */
    private Map f67475g;

    /* renamed from: ff.E$a */
    public static final class a {
    }

    public C5844E(C5844E e10) {
        this.f67469a = e10.f67469a;
        this.f67471c = e10.f67471c;
        this.f67470b = e10.f67470b;
        this.f67472d = e10.f67472d;
        this.f67473e = e10.f67473e;
        this.f67474f = b.b(e10.f67474f);
        this.f67475g = b.b(e10.f67475g);
    }

    public String a() {
        return this.f67472d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5844E.class != obj.getClass()) {
            return false;
        }
        C5844E e10 = (C5844E) obj;
        if (!h.a(this.f67469a, e10.f67469a) || !h.a(this.f67470b, e10.f67470b) || !h.a(this.f67471c, e10.f67471c) || !h.a(this.f67472d, e10.f67472d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return h.b(this.f67469a, this.f67470b, this.f67471c, this.f67472d);
    }
}
