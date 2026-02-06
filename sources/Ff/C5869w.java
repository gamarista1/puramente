package ff;

import java.util.Objects;
import p003if.h;

/* renamed from: ff.w  reason: case insensitive filesystem */
public final class C5869w {

    /* renamed from: a  reason: collision with root package name */
    private String f67579a;

    /* renamed from: b  reason: collision with root package name */
    private String f67580b;

    /* renamed from: ff.w$a */
    public static final class a {
    }

    public C5869w(String str, String str2) {
        this.f67579a = (String) h.c(str, "name is required.");
        this.f67580b = (String) h.c(str2, "version is required.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5869w.class != obj.getClass()) {
            return false;
        }
        C5869w wVar = (C5869w) obj;
        if (!Objects.equals(this.f67579a, wVar.f67579a) || !Objects.equals(this.f67580b, wVar.f67580b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f67579a, this.f67580b});
    }
}
