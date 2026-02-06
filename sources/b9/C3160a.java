package b9;

import Y8.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: b9.a  reason: case insensitive filesystem */
public final class C3160a {

    /* renamed from: e  reason: collision with root package name */
    private static final C3160a f36297e = new C0595a().b();

    /* renamed from: a  reason: collision with root package name */
    private final f f36298a;

    /* renamed from: b  reason: collision with root package name */
    private final List f36299b;

    /* renamed from: c  reason: collision with root package name */
    private final C3161b f36300c;

    /* renamed from: d  reason: collision with root package name */
    private final String f36301d;

    /* renamed from: b9.a$a  reason: collision with other inner class name */
    public static final class C0595a {

        /* renamed from: a  reason: collision with root package name */
        private f f36302a = null;

        /* renamed from: b  reason: collision with root package name */
        private List f36303b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private C3161b f36304c = null;

        /* renamed from: d  reason: collision with root package name */
        private String f36305d = "";

        C0595a() {
        }

        public C0595a a(C3163d dVar) {
            this.f36303b.add(dVar);
            return this;
        }

        public C3160a b() {
            return new C3160a(this.f36302a, Collections.unmodifiableList(this.f36303b), this.f36304c, this.f36305d);
        }

        public C0595a c(String str) {
            this.f36305d = str;
            return this;
        }

        public C0595a d(C3161b bVar) {
            this.f36304c = bVar;
            return this;
        }

        public C0595a e(f fVar) {
            this.f36302a = fVar;
            return this;
        }
    }

    C3160a(f fVar, List list, C3161b bVar, String str) {
        this.f36298a = fVar;
        this.f36299b = list;
        this.f36300c = bVar;
        this.f36301d = str;
    }

    public static C0595a e() {
        return new C0595a();
    }

    public String a() {
        return this.f36301d;
    }

    public C3161b b() {
        return this.f36300c;
    }

    public List c() {
        return this.f36299b;
    }

    public f d() {
        return this.f36298a;
    }

    public byte[] f() {
        return l.a(this);
    }
}
