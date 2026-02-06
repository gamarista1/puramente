package j8;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final int f44889a;

    /* renamed from: b  reason: collision with root package name */
    private final int f44890b;

    /* renamed from: c  reason: collision with root package name */
    private final int f44891c;

    /* renamed from: d  reason: collision with root package name */
    private final int f44892d;

    public h(int i10, int i11, int i12, int i13) {
        this.f44889a = i10;
        this.f44890b = i11;
        this.f44891c = i12;
        this.f44892d = i13;
    }

    public final int a() {
        return this.f44892d;
    }

    public final int b() {
        return this.f44889a;
    }

    public final int c() {
        return this.f44891c;
    }

    public final int d() {
        return this.f44890b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f44889a == hVar.f44889a && this.f44890b == hVar.f44890b && this.f44891c == hVar.f44891c && this.f44892d == hVar.f44892d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f44889a) * 31) + Integer.hashCode(this.f44890b)) * 31) + Integer.hashCode(this.f44891c)) * 31) + Integer.hashCode(this.f44892d);
    }

    public String toString() {
        int i10 = this.f44889a;
        int i11 = this.f44890b;
        int i12 = this.f44891c;
        int i13 = this.f44892d;
        return "ColorEdges(left=" + i10 + ", top=" + i11 + ", right=" + i12 + ", bottom=" + i13 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? -16777216 : i10, (i14 & 2) != 0 ? -16777216 : i11, (i14 & 4) != 0 ? -16777216 : i12, (i14 & 8) != 0 ? -16777216 : i13);
    }
}
