package Nb;

import Qb.i;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final long f52080a;

    /* renamed from: b  reason: collision with root package name */
    public final i f52081b;

    /* renamed from: c  reason: collision with root package name */
    public final long f52082c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f52083d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f52084e;

    public h(long j10, i iVar, long j11, boolean z10, boolean z11) {
        this.f52080a = j10;
        if (!iVar.g() || iVar.f()) {
            this.f52081b = iVar;
            this.f52082c = j11;
            this.f52083d = z10;
            this.f52084e = z11;
            return;
        }
        throw new IllegalArgumentException("Can't create TrackedQuery for a non-default query that loads all data");
    }

    public h a(boolean z10) {
        return new h(this.f52080a, this.f52081b, this.f52082c, this.f52083d, z10);
    }

    public h b() {
        return new h(this.f52080a, this.f52081b, this.f52082c, true, this.f52084e);
    }

    public h c(long j10) {
        return new h(this.f52080a, this.f52081b, j10, this.f52083d, this.f52084e);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != h.class) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f52080a == hVar.f52080a && this.f52081b.equals(hVar.f52081b) && this.f52082c == hVar.f52082c && this.f52083d == hVar.f52083d && this.f52084e == hVar.f52084e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Long.valueOf(this.f52080a).hashCode() * 31) + this.f52081b.hashCode()) * 31) + Long.valueOf(this.f52082c).hashCode()) * 31) + Boolean.valueOf(this.f52083d).hashCode()) * 31) + Boolean.valueOf(this.f52084e).hashCode();
    }

    public String toString() {
        return "TrackedQuery{id=" + this.f52080a + ", querySpec=" + this.f52081b + ", lastUse=" + this.f52082c + ", complete=" + this.f52083d + ", active=" + this.f52084e + "}";
    }
}
