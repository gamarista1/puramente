package V;

import kotlin.jvm.internal.C6496s;
import yf.q;

final class L {

    /* renamed from: a  reason: collision with root package name */
    private final Object f6678a;

    /* renamed from: b  reason: collision with root package name */
    private final q f6679b;

    public L(Object obj, q qVar) {
        this.f6678a = obj;
        this.f6679b = qVar;
    }

    public final Object a() {
        return this.f6678a;
    }

    public final q b() {
        return this.f6679b;
    }

    public final Object c() {
        return this.f6678a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        if (C6496s.c(this.f6678a, l10.f6678a) && C6496s.c(this.f6679b, l10.f6679b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        Object obj = this.f6678a;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        return (i10 * 31) + this.f6679b.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f6678a + ", transition=" + this.f6679b + ')';
    }
}
