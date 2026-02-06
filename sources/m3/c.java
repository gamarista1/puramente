package M3;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f4315a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f4316b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f4317c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f4318d;

    public c(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f4315a = z10;
        this.f4316b = z11;
        this.f4317c = z12;
        this.f4318d = z13;
    }

    public final boolean a() {
        return this.f4315a;
    }

    public final boolean b() {
        return this.f4317c;
    }

    public final boolean c() {
        return this.f4318d;
    }

    public final boolean d() {
        return this.f4316b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4315a == cVar.f4315a && this.f4316b == cVar.f4316b && this.f4317c == cVar.f4317c && this.f4318d == cVar.f4318d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        boolean z10 = this.f4315a;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i10 = (z10 ? 1 : 0) * true;
        boolean z12 = this.f4316b;
        if (z12) {
            z12 = true;
        }
        int i11 = (i10 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.f4317c;
        if (z13) {
            z13 = true;
        }
        int i12 = (i11 + (z13 ? 1 : 0)) * 31;
        boolean z14 = this.f4318d;
        if (!z14) {
            z11 = z14;
        }
        return i12 + (z11 ? 1 : 0);
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.f4315a + ", isValidated=" + this.f4316b + ", isMetered=" + this.f4317c + ", isNotRoaming=" + this.f4318d + ')';
    }
}
