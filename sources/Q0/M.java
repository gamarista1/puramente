package Q0;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class M {

    /* renamed from: a  reason: collision with root package name */
    private final C f5279a;

    /* renamed from: b  reason: collision with root package name */
    private final C f5280b;

    /* renamed from: c  reason: collision with root package name */
    private final C f5281c;

    /* renamed from: d  reason: collision with root package name */
    private final C f5282d;

    public M(C c10, C c11, C c12, C c13) {
        this.f5279a = c10;
        this.f5280b = c11;
        this.f5281c = c12;
        this.f5282d = c13;
    }

    public final C a() {
        return this.f5280b;
    }

    public final C b() {
        return this.f5281c;
    }

    public final C c() {
        return this.f5282d;
    }

    public final C d() {
        return this.f5279a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        if (C6496s.c(this.f5279a, m10.f5279a) && C6496s.c(this.f5280b, m10.f5280b) && C6496s.c(this.f5281c, m10.f5281c) && C6496s.c(this.f5282d, m10.f5282d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        C c10 = this.f5279a;
        int i13 = 0;
        if (c10 != null) {
            i10 = c10.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = i10 * 31;
        C c11 = this.f5280b;
        if (c11 != null) {
            i11 = c11.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        C c12 = this.f5281c;
        if (c12 != null) {
            i12 = c12.hashCode();
        } else {
            i12 = 0;
        }
        int i16 = (i15 + i12) * 31;
        C c13 = this.f5282d;
        if (c13 != null) {
            i13 = c13.hashCode();
        }
        return i16 + i13;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(C c10, C c11, C c12, C c13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : c10, (i10 & 2) != 0 ? null : c11, (i10 & 4) != 0 ? null : c12, (i10 & 8) != 0 ? null : c13);
    }
}
