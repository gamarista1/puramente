package lh;

import ih.f;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.a0;

public final class p extends x {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f72002a;

    /* renamed from: b  reason: collision with root package name */
    private final f f72003b;

    /* renamed from: c  reason: collision with root package name */
    private final String f72004c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, boolean z10, f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z10, (i10 & 4) != 0 ? null : fVar);
    }

    public String a() {
        return this.f72004c;
    }

    public boolean b() {
        return this.f72002a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (b() == pVar.b() && C6496s.c(a(), pVar.a())) {
            return true;
        }
        return false;
    }

    public final f g() {
        return this.f72003b;
    }

    public int hashCode() {
        return (Boolean.hashCode(b()) * 31) + a().hashCode();
    }

    public String toString() {
        if (!b()) {
            return a();
        }
        StringBuilder sb2 = new StringBuilder();
        a0.c(sb2, a());
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(Object obj, boolean z10, f fVar) {
        super((DefaultConstructorMarker) null);
        C6496s.h(obj, "body");
        this.f72002a = z10;
        this.f72003b = fVar;
        this.f72004c = obj.toString();
        if (fVar != null && !fVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
