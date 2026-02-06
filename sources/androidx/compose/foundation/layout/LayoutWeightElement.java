package androidx.compose.foundation.layout;

import C.K;
import J0.V;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/layout/LayoutWeightElement;", "LJ0/V;", "LC/K;", "", "weight", "", "fill", "<init>", "(FZ)V", "d", "()LC/K;", "node", "Llf/M;", "e", "(LC/K;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "F", "getWeight", "()F", "c", "Z", "getFill", "()Z", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LayoutWeightElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final float f12778b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f12779c;

    public LayoutWeightElement(float f10, boolean z10) {
        this.f12778b = f10;
        this.f12779c = z10;
    }

    /* renamed from: d */
    public K a() {
        return new K(this.f12778b, this.f12779c);
    }

    /* renamed from: e */
    public void b(K k10) {
        k10.n2(this.f12778b);
        k10.m2(this.f12779c);
    }

    public boolean equals(Object obj) {
        LayoutWeightElement layoutWeightElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutWeightElement) {
            layoutWeightElement = (LayoutWeightElement) obj;
        } else {
            layoutWeightElement = null;
        }
        if (layoutWeightElement == null) {
            return false;
        }
        if (this.f12778b == layoutWeightElement.f12778b && this.f12779c == layoutWeightElement.f12779c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f12778b) * 31) + Boolean.hashCode(this.f12779c);
    }
}
