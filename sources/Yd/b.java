package Yd;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f53529c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final d f53530a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f53531b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(d dVar, boolean z10) {
        C6496s.h(dVar, "status");
        this.f53530a = dVar;
        this.f53531b = z10;
    }

    public final boolean a() {
        return this.f53531b;
    }

    public final d b() {
        return this.f53530a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f53530a == bVar.f53530a && this.f53531b == bVar.f53531b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f53530a.hashCode() * 31) + Boolean.hashCode(this.f53531b);
    }

    public String toString() {
        d dVar = this.f53530a;
        boolean z10 = this.f53531b;
        return "PermissionsResponse(status=" + dVar + ", canAskAgain=" + z10 + ")";
    }
}
