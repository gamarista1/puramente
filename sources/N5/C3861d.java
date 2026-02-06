package n5;

import T4.f;
import java.security.MessageDigest;
import o5.k;

/* renamed from: n5.d  reason: case insensitive filesystem */
public final class C3861d implements f {

    /* renamed from: b  reason: collision with root package name */
    private final Object f46863b;

    public C3861d(Object obj) {
        this.f46863b = k.d(obj);
    }

    public void b(MessageDigest messageDigest) {
        messageDigest.update(this.f46863b.toString().getBytes(f.f34158a));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3861d) {
            return this.f46863b.equals(((C3861d) obj).f46863b);
        }
        return false;
    }

    public int hashCode() {
        return this.f46863b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f46863b + '}';
    }
}
