package We;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p003if.b;
import p003if.h;

/* renamed from: We.b  reason: case insensitive filesystem */
public final class C5617b implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    private final Long f65792a;

    /* renamed from: b  reason: collision with root package name */
    private Date f65793b;

    /* renamed from: c  reason: collision with root package name */
    private final Long f65794c = Long.valueOf(System.nanoTime());

    /* renamed from: d  reason: collision with root package name */
    private String f65795d;

    /* renamed from: e  reason: collision with root package name */
    private String f65796e;

    /* renamed from: f  reason: collision with root package name */
    private Map f65797f = new ConcurrentHashMap();

    /* renamed from: g  reason: collision with root package name */
    private String f65798g;

    /* renamed from: h  reason: collision with root package name */
    private String f65799h;

    /* renamed from: i  reason: collision with root package name */
    private E0 f65800i;

    /* renamed from: j  reason: collision with root package name */
    private Map f65801j;

    /* renamed from: We.b$a */
    public static final class a {
    }

    C5617b(C5617b bVar) {
        this.f65793b = bVar.f65793b;
        this.f65792a = bVar.f65792a;
        this.f65795d = bVar.f65795d;
        this.f65796e = bVar.f65796e;
        this.f65798g = bVar.f65798g;
        this.f65799h = bVar.f65799h;
        Map b10 = b.b(bVar.f65797f);
        if (b10 != null) {
            this.f65797f = b10;
        }
        this.f65801j = b.b(bVar.f65801j);
        this.f65800i = bVar.f65800i;
    }

    /* renamed from: a */
    public int compareTo(C5617b bVar) {
        return this.f65794c.compareTo(bVar.f65794c);
    }

    public Date b() {
        Date date = this.f65793b;
        if (date != null) {
            return (Date) date.clone();
        }
        Long l10 = this.f65792a;
        if (l10 != null) {
            Date b10 = C5627g.b(l10.longValue());
            this.f65793b = b10;
            return b10;
        }
        throw new IllegalStateException("No timestamp set for breadcrumb");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5617b.class != obj.getClass()) {
            return false;
        }
        C5617b bVar = (C5617b) obj;
        if (b().getTime() != bVar.b().getTime() || !h.a(this.f65795d, bVar.f65795d) || !h.a(this.f65796e, bVar.f65796e) || !h.a(this.f65798g, bVar.f65798g) || !h.a(this.f65799h, bVar.f65799h) || this.f65800i != bVar.f65800i) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return h.b(this.f65793b, this.f65795d, this.f65796e, this.f65798g, this.f65799h, this.f65800i);
    }
}
