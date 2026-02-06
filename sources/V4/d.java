package V4;

import T4.f;
import java.security.MessageDigest;

final class d implements f {

    /* renamed from: b  reason: collision with root package name */
    private final f f34456b;

    /* renamed from: c  reason: collision with root package name */
    private final f f34457c;

    d(f fVar, f fVar2) {
        this.f34456b = fVar;
        this.f34457c = fVar2;
    }

    public void b(MessageDigest messageDigest) {
        this.f34456b.b(messageDigest);
        this.f34457c.b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f34456b.equals(dVar.f34456b) || !this.f34457c.equals(dVar.f34457c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f34456b.hashCode() * 31) + this.f34457c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f34456b + ", signature=" + this.f34457c + '}';
    }
}
