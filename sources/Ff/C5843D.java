package ff;

import java.util.Arrays;
import java.util.Map;
import p003if.b;

/* renamed from: ff.D  reason: case insensitive filesystem */
public final class C5843D {

    /* renamed from: a  reason: collision with root package name */
    private String[] f67467a;

    /* renamed from: b  reason: collision with root package name */
    private Map f67468b;

    public C5843D(C5843D d10) {
        this.f67467a = d10.f67467a;
        this.f67468b = b.b(d10.f67468b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5843D.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f67467a, ((C5843D) obj).f67467a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f67467a);
    }
}
