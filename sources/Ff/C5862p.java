package ff;

import p003if.h;

/* renamed from: ff.p  reason: case insensitive filesystem */
public final class C5862p {

    /* renamed from: a  reason: collision with root package name */
    private String f67570a;

    /* renamed from: b  reason: collision with root package name */
    private String f67571b;

    /* renamed from: ff.p$a */
    public static final class a {
    }

    public C5862p(String str, String str2) {
        this.f67570a = (String) h.c(str, "name is required.");
        this.f67571b = (String) h.c(str2, "version is required.");
    }

    public void a(String str) {
        this.f67571b = (String) h.c(str, "version is required.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5862p.class != obj.getClass()) {
            return false;
        }
        C5862p pVar = (C5862p) obj;
        if (!this.f67570a.equals(pVar.f67570a) || !this.f67571b.equals(pVar.f67571b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return h.b(this.f67570a, this.f67571b);
    }
}
