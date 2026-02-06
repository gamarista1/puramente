package Lb;

import Tb.n;

public final class C {

    /* renamed from: a  reason: collision with root package name */
    private final long f51689a;

    /* renamed from: b  reason: collision with root package name */
    private final l f51690b;

    /* renamed from: c  reason: collision with root package name */
    private final n f51691c;

    /* renamed from: d  reason: collision with root package name */
    private final C4368b f51692d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f51693e;

    public C(long j10, l lVar, n nVar, boolean z10) {
        this.f51689a = j10;
        this.f51690b = lVar;
        this.f51691c = nVar;
        this.f51692d = null;
        this.f51693e = z10;
    }

    public C4368b a() {
        C4368b bVar = this.f51692d;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("Can't access merge when write is an overwrite!");
    }

    public n b() {
        n nVar = this.f51691c;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalArgumentException("Can't access overwrite when write is a merge!");
    }

    public l c() {
        return this.f51690b;
    }

    public long d() {
        return this.f51689a;
    }

    public boolean e() {
        if (this.f51691c != null) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C.class != obj.getClass()) {
            return false;
        }
        C c10 = (C) obj;
        if (this.f51689a != c10.f51689a || !this.f51690b.equals(c10.f51690b) || this.f51693e != c10.f51693e) {
            return false;
        }
        n nVar = this.f51691c;
        if (nVar == null ? c10.f51691c != null : !nVar.equals(c10.f51691c)) {
            return false;
        }
        C4368b bVar = this.f51692d;
        C4368b bVar2 = c10.f51692d;
        if (bVar == null ? bVar2 == null : bVar.equals(bVar2)) {
            return true;
        }
        return false;
    }

    public boolean f() {
        return this.f51693e;
    }

    public int hashCode() {
        int i10;
        int hashCode = ((((Long.valueOf(this.f51689a).hashCode() * 31) + Boolean.valueOf(this.f51693e).hashCode()) * 31) + this.f51690b.hashCode()) * 31;
        n nVar = this.f51691c;
        int i11 = 0;
        if (nVar != null) {
            i10 = nVar.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        C4368b bVar = this.f51692d;
        if (bVar != null) {
            i11 = bVar.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        return "UserWriteRecord{id=" + this.f51689a + " path=" + this.f51690b + " visible=" + this.f51693e + " overwrite=" + this.f51691c + " merge=" + this.f51692d + "}";
    }

    public C(long j10, l lVar, C4368b bVar) {
        this.f51689a = j10;
        this.f51690b = lVar;
        this.f51691c = null;
        this.f51692d = bVar;
        this.f51693e = true;
    }
}
