package androidx.compose.foundation.layout;

import C.e0;
import J0.V;
import k0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/VerticalAlignElement;", "LJ0/V;", "LC/e0;", "Lk0/c$c;", "alignment", "<init>", "(Lk0/c$c;)V", "d", "()LC/e0;", "node", "Llf/M;", "e", "(LC/e0;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lk0/c$c;", "getAlignment", "()Lk0/c$c;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VerticalAlignElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final c.C0368c f12800b;

    public VerticalAlignElement(c.C0368c cVar) {
        this.f12800b = cVar;
    }

    /* renamed from: d */
    public e0 a() {
        return new e0(this.f12800b);
    }

    /* renamed from: e */
    public void b(e0 e0Var) {
        e0Var.m2(this.f12800b);
    }

    public boolean equals(Object obj) {
        VerticalAlignElement verticalAlignElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerticalAlignElement) {
            verticalAlignElement = (VerticalAlignElement) obj;
        } else {
            verticalAlignElement = null;
        }
        if (verticalAlignElement == null) {
            return false;
        }
        return C6496s.c(this.f12800b, verticalAlignElement.f12800b);
    }

    public int hashCode() {
        return this.f12800b.hashCode();
    }
}
