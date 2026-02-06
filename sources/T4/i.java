package T4;

import androidx.collection.C1587a;
import java.security.MessageDigest;
import o5.b;

public final class i implements f {

    /* renamed from: b  reason: collision with root package name */
    private final C1587a f34165b = new b();

    private static void g(h hVar, Object obj, MessageDigest messageDigest) {
        hVar.g(obj, messageDigest);
    }

    public void b(MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f34165b.size(); i10++) {
            g((h) this.f34165b.i(i10), this.f34165b.n(i10), messageDigest);
        }
    }

    public Object c(h hVar) {
        if (this.f34165b.containsKey(hVar)) {
            return this.f34165b.get(hVar);
        }
        return hVar.c();
    }

    public void d(i iVar) {
        this.f34165b.j(iVar.f34165b);
    }

    public i e(h hVar) {
        this.f34165b.remove(hVar);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f34165b.equals(((i) obj).f34165b);
        }
        return false;
    }

    public i f(h hVar, Object obj) {
        this.f34165b.put(hVar, obj);
        return this;
    }

    public int hashCode() {
        return this.f34165b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f34165b + '}';
    }
}
