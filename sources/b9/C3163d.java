package b9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: b9.d  reason: case insensitive filesystem */
public final class C3163d {

    /* renamed from: c  reason: collision with root package name */
    private static final C3163d f36323c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final String f36324a;

    /* renamed from: b  reason: collision with root package name */
    private final List f36325b;

    /* renamed from: b9.d$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f36326a = "";

        /* renamed from: b  reason: collision with root package name */
        private List f36327b = new ArrayList();

        a() {
        }

        public C3163d a() {
            return new C3163d(this.f36326a, Collections.unmodifiableList(this.f36327b));
        }

        public a b(List list) {
            this.f36327b = list;
            return this;
        }

        public a c(String str) {
            this.f36326a = str;
            return this;
        }
    }

    C3163d(String str, List list) {
        this.f36324a = str;
        this.f36325b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.f36325b;
    }

    public String b() {
        return this.f36324a;
    }
}
