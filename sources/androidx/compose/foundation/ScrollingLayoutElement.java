package androidx.compose.foundation;

import J0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import x.b0;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0006\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u0007\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "LJ0/V;", "Lx/b0;", "Landroidx/compose/foundation/o;", "scrollState", "", "isReversed", "isVertical", "<init>", "(Landroidx/compose/foundation/o;ZZ)V", "d", "()Lx/b0;", "node", "Llf/M;", "e", "(Lx/b0;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/foundation/o;", "getScrollState", "()Landroidx/compose/foundation/o;", "c", "Z", "()Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ScrollingLayoutElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final o f12453b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f12454c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f12455d;

    public ScrollingLayoutElement(o oVar, boolean z10, boolean z11) {
        this.f12453b = oVar;
        this.f12454c = z10;
        this.f12455d = z11;
    }

    /* renamed from: d */
    public b0 a() {
        return new b0(this.f12453b, this.f12454c, this.f12455d);
    }

    /* renamed from: e */
    public void b(b0 b0Var) {
        b0Var.p2(this.f12453b);
        b0Var.o2(this.f12454c);
        b0Var.q2(this.f12455d);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        if (C6496s.c(this.f12453b, scrollingLayoutElement.f12453b) && this.f12454c == scrollingLayoutElement.f12454c && this.f12455d == scrollingLayoutElement.f12455d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f12453b.hashCode() * 31) + Boolean.hashCode(this.f12454c)) * 31) + Boolean.hashCode(this.f12455d);
    }
}
