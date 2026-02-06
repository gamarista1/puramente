package fg;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: fg.l  reason: case insensitive filesystem */
public final class C5918l {

    /* renamed from: a  reason: collision with root package name */
    private final C5916k f67679a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f67680b;

    public C5918l(C5916k kVar, boolean z10) {
        C6496s.h(kVar, "qualifier");
        this.f67679a = kVar;
        this.f67680b = z10;
    }

    public static /* synthetic */ C5918l b(C5918l lVar, C5916k kVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            kVar = lVar.f67679a;
        }
        if ((i10 & 2) != 0) {
            z10 = lVar.f67680b;
        }
        return lVar.a(kVar, z10);
    }

    public final C5918l a(C5916k kVar, boolean z10) {
        C6496s.h(kVar, "qualifier");
        return new C5918l(kVar, z10);
    }

    public final C5916k c() {
        return this.f67679a;
    }

    public final boolean d() {
        return this.f67680b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5918l)) {
            return false;
        }
        C5918l lVar = (C5918l) obj;
        if (this.f67679a == lVar.f67679a && this.f67680b == lVar.f67680b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f67679a.hashCode() * 31) + Boolean.hashCode(this.f67680b);
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f67679a + ", isForWarningOnly=" + this.f67680b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5918l(C5916k kVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, (i10 & 2) != 0 ? false : z10);
    }
}
