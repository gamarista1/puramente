package ff;

import java.util.Map;
import p003if.b;
import p003if.h;

/* renamed from: ff.m  reason: case insensitive filesystem */
public final class C5859m {

    /* renamed from: a  reason: collision with root package name */
    private String f67552a;

    /* renamed from: b  reason: collision with root package name */
    private String f67553b;

    /* renamed from: c  reason: collision with root package name */
    private String f67554c;

    /* renamed from: d  reason: collision with root package name */
    private Object f67555d;

    /* renamed from: e  reason: collision with root package name */
    private String f67556e;

    /* renamed from: f  reason: collision with root package name */
    private Map f67557f;

    /* renamed from: g  reason: collision with root package name */
    private Map f67558g;

    /* renamed from: h  reason: collision with root package name */
    private Long f67559h;

    /* renamed from: i  reason: collision with root package name */
    private Map f67560i;

    /* renamed from: j  reason: collision with root package name */
    private String f67561j;

    /* renamed from: k  reason: collision with root package name */
    private String f67562k;

    /* renamed from: l  reason: collision with root package name */
    private Map f67563l;

    /* renamed from: ff.m$a */
    public static final class a {
    }

    public C5859m(C5859m mVar) {
        this.f67552a = mVar.f67552a;
        this.f67556e = mVar.f67556e;
        this.f67553b = mVar.f67553b;
        this.f67554c = mVar.f67554c;
        this.f67557f = b.b(mVar.f67557f);
        this.f67558g = b.b(mVar.f67558g);
        this.f67560i = b.b(mVar.f67560i);
        this.f67563l = b.b(mVar.f67563l);
        this.f67555d = mVar.f67555d;
        this.f67561j = mVar.f67561j;
        this.f67559h = mVar.f67559h;
        this.f67562k = mVar.f67562k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5859m.class != obj.getClass()) {
            return false;
        }
        C5859m mVar = (C5859m) obj;
        if (!h.a(this.f67552a, mVar.f67552a) || !h.a(this.f67553b, mVar.f67553b) || !h.a(this.f67554c, mVar.f67554c) || !h.a(this.f67556e, mVar.f67556e) || !h.a(this.f67557f, mVar.f67557f) || !h.a(this.f67558g, mVar.f67558g) || !h.a(this.f67559h, mVar.f67559h) || !h.a(this.f67561j, mVar.f67561j) || !h.a(this.f67562k, mVar.f67562k)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return h.b(this.f67552a, this.f67553b, this.f67554c, this.f67556e, this.f67557f, this.f67558g, this.f67559h, this.f67561j, this.f67562k);
    }
}
