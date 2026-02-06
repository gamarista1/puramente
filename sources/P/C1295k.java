package P;

import b1.i;
import kotlin.jvm.internal.C6496s;

/* renamed from: P.k  reason: case insensitive filesystem */
public final class C1295k {

    /* renamed from: a  reason: collision with root package name */
    private final a f4908a;

    /* renamed from: b  reason: collision with root package name */
    private final a f4909b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f4910c;

    /* renamed from: P.k$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final i f4911a;

        /* renamed from: b  reason: collision with root package name */
        private final int f4912b;

        /* renamed from: c  reason: collision with root package name */
        private final long f4913c;

        public a(i iVar, int i10, long j10) {
            this.f4911a = iVar;
            this.f4912b = i10;
            this.f4913c = j10;
        }

        public static /* synthetic */ a b(a aVar, i iVar, int i10, long j10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iVar = aVar.f4911a;
            }
            if ((i11 & 2) != 0) {
                i10 = aVar.f4912b;
            }
            if ((i11 & 4) != 0) {
                j10 = aVar.f4913c;
            }
            return aVar.a(iVar, i10, j10);
        }

        public final a a(i iVar, int i10, long j10) {
            return new a(iVar, i10, j10);
        }

        public final int c() {
            return this.f4912b;
        }

        public final long d() {
            return this.f4913c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f4911a == aVar.f4911a && this.f4912b == aVar.f4912b && this.f4913c == aVar.f4913c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f4911a.hashCode() * 31) + Integer.hashCode(this.f4912b)) * 31) + Long.hashCode(this.f4913c);
        }

        public String toString() {
            return "AnchorInfo(direction=" + this.f4911a + ", offset=" + this.f4912b + ", selectableId=" + this.f4913c + ')';
        }
    }

    public C1295k(a aVar, a aVar2, boolean z10) {
        this.f4908a = aVar;
        this.f4909b = aVar2;
        this.f4910c = z10;
    }

    public static /* synthetic */ C1295k b(C1295k kVar, a aVar, a aVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = kVar.f4908a;
        }
        if ((i10 & 2) != 0) {
            aVar2 = kVar.f4909b;
        }
        if ((i10 & 4) != 0) {
            z10 = kVar.f4910c;
        }
        return kVar.a(aVar, aVar2, z10);
    }

    public final C1295k a(a aVar, a aVar2, boolean z10) {
        return new C1295k(aVar, aVar2, z10);
    }

    public final a c() {
        return this.f4909b;
    }

    public final boolean d() {
        return this.f4910c;
    }

    public final a e() {
        return this.f4908a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1295k)) {
            return false;
        }
        C1295k kVar = (C1295k) obj;
        if (C6496s.c(this.f4908a, kVar.f4908a) && C6496s.c(this.f4909b, kVar.f4909b) && this.f4910c == kVar.f4910c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f4908a.hashCode() * 31) + this.f4909b.hashCode()) * 31) + Boolean.hashCode(this.f4910c);
    }

    public String toString() {
        return "Selection(start=" + this.f4908a + ", end=" + this.f4909b + ", handlesCrossed=" + this.f4910c + ')';
    }
}
