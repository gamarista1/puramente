package androidx.compose.foundation;

import J0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import z.n;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b\t\u0010$R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b\n\u0010$¨\u0006)"}, d2 = {"Landroidx/compose/foundation/ScrollSemanticsElement;", "LJ0/V;", "Landroidx/compose/foundation/n;", "Landroidx/compose/foundation/o;", "state", "", "reverseScrolling", "Lz/n;", "flingBehavior", "isScrollable", "isVertical", "<init>", "(Landroidx/compose/foundation/o;ZLz/n;ZZ)V", "d", "()Landroidx/compose/foundation/n;", "node", "Llf/M;", "e", "(Landroidx/compose/foundation/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/foundation/o;", "getState", "()Landroidx/compose/foundation/o;", "c", "Z", "getReverseScrolling", "()Z", "Lz/n;", "getFlingBehavior", "()Lz/n;", "f", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ScrollSemanticsElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final o f12448b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f12449c;

    /* renamed from: d  reason: collision with root package name */
    private final n f12450d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f12451e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f12452f;

    public ScrollSemanticsElement(o oVar, boolean z10, n nVar, boolean z11, boolean z12) {
        this.f12448b = oVar;
        this.f12449c = z10;
        this.f12450d = nVar;
        this.f12451e = z11;
        this.f12452f = z12;
    }

    /* renamed from: d */
    public n a() {
        return new n(this.f12448b, this.f12449c, this.f12450d, this.f12451e, this.f12452f);
    }

    /* renamed from: e */
    public void b(n nVar) {
        nVar.p2(this.f12448b);
        nVar.n2(this.f12449c);
        nVar.m2(this.f12450d);
        nVar.o2(this.f12451e);
        nVar.q2(this.f12452f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollSemanticsElement)) {
            return false;
        }
        ScrollSemanticsElement scrollSemanticsElement = (ScrollSemanticsElement) obj;
        return C6496s.c(this.f12448b, scrollSemanticsElement.f12448b) && this.f12449c == scrollSemanticsElement.f12449c && C6496s.c(this.f12450d, scrollSemanticsElement.f12450d) && this.f12451e == scrollSemanticsElement.f12451e && this.f12452f == scrollSemanticsElement.f12452f;
    }

    public int hashCode() {
        int hashCode = ((this.f12448b.hashCode() * 31) + Boolean.hashCode(this.f12449c)) * 31;
        n nVar = this.f12450d;
        return ((((hashCode + (nVar == null ? 0 : nVar.hashCode())) * 31) + Boolean.hashCode(this.f12451e)) * 31) + Boolean.hashCode(this.f12452f);
    }

    public String toString() {
        return "ScrollSemanticsElement(state=" + this.f12448b + ", reverseScrolling=" + this.f12449c + ", flingBehavior=" + this.f12450d + ", isScrollable=" + this.f12451e + ", isVertical=" + this.f12452f + ')';
    }
}
