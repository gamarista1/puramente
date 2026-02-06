package P;

import J.C1216l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2421g;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    private final C1216l f4967a;

    /* renamed from: b  reason: collision with root package name */
    private final long f4968b;

    /* renamed from: c  reason: collision with root package name */
    private final u f4969c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f4970d;

    public /* synthetic */ v(C1216l lVar, long j10, u uVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, j10, uVar, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f4967a == vVar.f4967a && C2421g.j(this.f4968b, vVar.f4968b) && this.f4969c == vVar.f4969c && this.f4970d == vVar.f4970d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f4967a.hashCode() * 31) + C2421g.o(this.f4968b)) * 31) + this.f4969c.hashCode()) * 31) + Boolean.hashCode(this.f4970d);
    }

    public String toString() {
        return "SelectionHandleInfo(handle=" + this.f4967a + ", position=" + C2421g.t(this.f4968b) + ", anchor=" + this.f4969c + ", visible=" + this.f4970d + ')';
    }

    private v(C1216l lVar, long j10, u uVar, boolean z10) {
        this.f4967a = lVar;
        this.f4968b = j10;
        this.f4969c = uVar;
        this.f4970d = z10;
    }
}
