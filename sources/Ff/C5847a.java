package ff;

import java.util.Date;
import java.util.List;
import java.util.Map;
import p003if.b;
import p003if.h;

/* renamed from: ff.a  reason: case insensitive filesystem */
public final class C5847a {

    /* renamed from: a  reason: collision with root package name */
    private String f67476a;

    /* renamed from: b  reason: collision with root package name */
    private Date f67477b;

    /* renamed from: c  reason: collision with root package name */
    private String f67478c;

    /* renamed from: d  reason: collision with root package name */
    private String f67479d;

    /* renamed from: e  reason: collision with root package name */
    private String f67480e;

    /* renamed from: f  reason: collision with root package name */
    private String f67481f;

    /* renamed from: g  reason: collision with root package name */
    private String f67482g;

    /* renamed from: h  reason: collision with root package name */
    private Map f67483h;

    /* renamed from: i  reason: collision with root package name */
    private List f67484i;

    /* renamed from: j  reason: collision with root package name */
    private String f67485j;

    /* renamed from: k  reason: collision with root package name */
    private Boolean f67486k;

    /* renamed from: l  reason: collision with root package name */
    private Boolean f67487l;

    /* renamed from: m  reason: collision with root package name */
    private List f67488m;

    /* renamed from: n  reason: collision with root package name */
    private Map f67489n;

    /* renamed from: ff.a$a  reason: collision with other inner class name */
    public static final class C0994a {
    }

    C5847a(C5847a aVar) {
        this.f67482g = aVar.f67482g;
        this.f67476a = aVar.f67476a;
        this.f67480e = aVar.f67480e;
        this.f67477b = aVar.f67477b;
        this.f67481f = aVar.f67481f;
        this.f67479d = aVar.f67479d;
        this.f67478c = aVar.f67478c;
        this.f67483h = b.b(aVar.f67483h);
        this.f67486k = aVar.f67486k;
        this.f67484i = b.a(aVar.f67484i);
        this.f67485j = aVar.f67485j;
        this.f67487l = aVar.f67487l;
        this.f67488m = aVar.f67488m;
        this.f67489n = b.b(aVar.f67489n);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5847a.class != obj.getClass()) {
            return false;
        }
        C5847a aVar = (C5847a) obj;
        if (!h.a(this.f67476a, aVar.f67476a) || !h.a(this.f67477b, aVar.f67477b) || !h.a(this.f67478c, aVar.f67478c) || !h.a(this.f67479d, aVar.f67479d) || !h.a(this.f67480e, aVar.f67480e) || !h.a(this.f67481f, aVar.f67481f) || !h.a(this.f67482g, aVar.f67482g) || !h.a(this.f67483h, aVar.f67483h) || !h.a(this.f67486k, aVar.f67486k) || !h.a(this.f67484i, aVar.f67484i) || !h.a(this.f67485j, aVar.f67485j) || !h.a(this.f67487l, aVar.f67487l) || !h.a(this.f67488m, aVar.f67488m)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return h.b(this.f67476a, this.f67477b, this.f67478c, this.f67479d, this.f67480e, this.f67481f, this.f67482g, this.f67483h, this.f67486k, this.f67484i, this.f67485j, this.f67487l, this.f67488m);
    }
}
