package androidx.compose.foundation.lazy.layout;

import J0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;", "LJ0/V;", "Landroidx/compose/foundation/lazy/layout/i;", "Landroidx/compose/foundation/lazy/layout/d;", "prefetchState", "<init>", "(Landroidx/compose/foundation/lazy/layout/d;)V", "d", "()Landroidx/compose/foundation/lazy/layout/i;", "node", "Llf/M;", "e", "(Landroidx/compose/foundation/lazy/layout/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/foundation/lazy/layout/d;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class TraversablePrefetchStateModifierElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final d f12975b;

    public TraversablePrefetchStateModifierElement(d dVar) {
        this.f12975b = dVar;
    }

    /* renamed from: d */
    public i a() {
        return new i(this.f12975b);
    }

    /* renamed from: e */
    public void b(i iVar) {
        iVar.n2(this.f12975b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && C6496s.c(this.f12975b, ((TraversablePrefetchStateModifierElement) obj).f12975b);
    }

    public int hashCode() {
        return this.f12975b.hashCode();
    }

    public String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f12975b + ')';
    }
}
