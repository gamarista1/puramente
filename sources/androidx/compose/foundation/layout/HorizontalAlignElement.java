package androidx.compose.foundation.layout;

import C.B;
import J0.V;
import k0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/HorizontalAlignElement;", "LJ0/V;", "LC/B;", "Lk0/c$b;", "horizontal", "<init>", "(Lk0/c$b;)V", "d", "()LC/B;", "node", "Llf/M;", "e", "(LC/B;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lk0/c$b;", "getHorizontal", "()Lk0/c$b;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HorizontalAlignElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final c.b f12771b;

    public HorizontalAlignElement(c.b bVar) {
        this.f12771b = bVar;
    }

    /* renamed from: d */
    public B a() {
        return new B(this.f12771b);
    }

    /* renamed from: e */
    public void b(B b10) {
        b10.m2(this.f12771b);
    }

    public boolean equals(Object obj) {
        HorizontalAlignElement horizontalAlignElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof HorizontalAlignElement) {
            horizontalAlignElement = (HorizontalAlignElement) obj;
        } else {
            horizontalAlignElement = null;
        }
        if (horizontalAlignElement == null) {
            return false;
        }
        return C6496s.c(this.f12771b, horizontalAlignElement.f12771b);
    }

    public int hashCode() {
        return this.f12771b.hashCode();
    }
}
