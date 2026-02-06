package androidx.compose.foundation;

import B.l;
import J0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import x.C2887z;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/FocusableElement;", "LJ0/V;", "Lx/z;", "LB/l;", "interactionSource", "<init>", "(LB/l;)V", "d", "()Lx/z;", "node", "Llf/M;", "e", "(Lx/z;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "LB/l;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class FocusableElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final l f12432b;

    public FocusableElement(l lVar) {
        this.f12432b = lVar;
    }

    /* renamed from: d */
    public C2887z a() {
        return new C2887z(this.f12432b);
    }

    /* renamed from: e */
    public void b(C2887z zVar) {
        zVar.r2(this.f12432b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FocusableElement) && C6496s.c(this.f12432b, ((FocusableElement) obj).f12432b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        l lVar = this.f12432b;
        if (lVar != null) {
            return lVar.hashCode();
        }
        return 0;
    }
}
