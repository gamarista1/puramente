package g9;

import Y8.i;
import Y8.o;

/* renamed from: g9.b  reason: case insensitive filesystem */
final class C3544b extends C3553k {

    /* renamed from: a  reason: collision with root package name */
    private final long f43727a;

    /* renamed from: b  reason: collision with root package name */
    private final o f43728b;

    /* renamed from: c  reason: collision with root package name */
    private final i f43729c;

    C3544b(long j10, o oVar, i iVar) {
        this.f43727a = j10;
        if (oVar != null) {
            this.f43728b = oVar;
            if (iVar != null) {
                this.f43729c = iVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    public i b() {
        return this.f43729c;
    }

    public long c() {
        return this.f43727a;
    }

    public o d() {
        return this.f43728b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3553k)) {
            return false;
        }
        C3553k kVar = (C3553k) obj;
        if (this.f43727a != kVar.c() || !this.f43728b.equals(kVar.d()) || !this.f43729c.equals(kVar.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j10 = this.f43727a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f43728b.hashCode()) * 1000003) ^ this.f43729c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f43727a + ", transportContext=" + this.f43728b + ", event=" + this.f43729c + "}";
    }
}
