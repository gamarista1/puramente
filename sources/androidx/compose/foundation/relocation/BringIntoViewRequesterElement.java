package androidx.compose.foundation.relocation;

import H.b;
import J0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;", "LJ0/V;", "Landroidx/compose/foundation/relocation/e;", "LH/b;", "requester", "<init>", "(LH/b;)V", "d", "()Landroidx/compose/foundation/relocation/e;", "node", "Llf/M;", "e", "(Landroidx/compose/foundation/relocation/e;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "LH/b;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class BringIntoViewRequesterElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final b f13107b;

    public BringIntoViewRequesterElement(b bVar) {
        this.f13107b = bVar;
    }

    /* renamed from: d */
    public e a() {
        return new e(this.f13107b);
    }

    /* renamed from: e */
    public void b(e eVar) {
        eVar.m2(this.f13107b);
    }

    public boolean equals(Object obj) {
        if (this == obj || ((obj instanceof BringIntoViewRequesterElement) && C6496s.c(this.f13107b, ((BringIntoViewRequesterElement) obj).f13107b))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f13107b.hashCode();
    }
}
